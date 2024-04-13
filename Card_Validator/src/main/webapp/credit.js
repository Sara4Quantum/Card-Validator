document.getElementById('digit').addEventListener('input', function(e) {
    var target = e.target,
        position = target.selectionEnd,
        length = target.value.length;
    target.value = target.value.replace(/[^\dA-Z]/g, '').replace(/(.{4})/g, '$1 ').trim();
    target.selectionEnd = position += ((target.value.charAt(position - 1) === ' ' && target.value.charAt(length - 1) === ' ') ? 1 : 0);
});

document.getElementById('digit').addEventListener('input', function() {
    var cardNumberInput = document.getElementById('digit');
    var digitsOnly = cardNumberInput.value.replace(/\s/g, '');
    if (digitsOnly.length === 16) {
        document.getElementById('cardNumberErrorMessage').textContent = '';
        cardNumberInput.classList.remove('is-invalid');
    }
});

document.getElementById('creditCardForm').addEventListener('submit', function(e) {
    var cardNumberInput = document.getElementById('digit');
    var digitsOnly = cardNumberInput.value.replace(/\s/g, '');
    if (digitsOnly.length !== 16) {
        cardNumberInput.setCustomValidity('Please Enter exactly 16 digits Credit / Debit card number');
        document.getElementById('cardNumberErrorMessage').textContent = 'Please Enter exactly 16 digits Credit / Debit card number';
        cardNumberInput.classList.add('is-invalid');
        e.preventDefault();
    } else {
        cardNumberInput.setCustomValidity('');
        document.getElementById('cardNumberErrorMessage').textContent = '';
        cardNumberInput.classList.remove('is-invalid');
    }
});
