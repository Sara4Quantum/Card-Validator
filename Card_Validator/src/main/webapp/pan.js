document.getElementById('panCardForm').addEventListener('submit', function(e) {
    var panNameInput = document.getElementById('UserPanName');
    var panNumberInput = document.getElementById('PanNo');

    // Validate Pan Number
    if (!panNumberInput.checkValidity()) {
        // Show error message
        document.getElementById('panNumberErrorMessage').textContent = 'Please enter 10-character PAN card number';
        // Apply red border to the input field
        panNumberInput.classList.add('is-invalid');
        // Prevent form submission
        e.preventDefault();
    } else {
        // Clear error message
        document.getElementById('panNumberErrorMessage').textContent = '';
        // Remove red border from the input field
        panNumberInput.classList.remove('is-invalid');
    }

    // Validate Pan Holder Name
    if (!panNameInput.checkValidity()) {
        // Show error message
        document.getElementById('panHolderNameErrorMessage').textContent = 'Please enter Pan Holder Name';
        // Apply red border to the input field
        panNameInput.classList.add('is-invalid');
        // Prevent form submission
        e.preventDefault();
    } else {
        // Clear error message
        document.getElementById('panHolderNameErrorMessage').textContent = '';
        // Remove red border from the input field
        panNameInput.classList.remove('is-invalid');
    }
});

document.getElementById('PanNo').addEventListener('input', function() {
    var panNumberInput = document.getElementById('PanNo');
    if (panNumberInput.value.length === 10) {
        // Clear error message
        document.getElementById('panNumberErrorMessage').textContent = '';
        // Remove red border from the input field
        panNumberInput.classList.remove('is-invalid');
    }
});

document.getElementById('UserPanName').addEventListener('input', function() {
    var panNameInput = document.getElementById('UserPanName');
    // Remove any non-alphabetic characters
    panNameInput.value = panNameInput.value.replace(/[^A-Za-z ]/g, '');
});
