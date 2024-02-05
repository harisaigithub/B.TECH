function loadContent(page) {
    // Make an XMLHttpRequest to fetch the content of the selected page
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            // Display the fetched content in a container
            document.getElementById('content-container').innerHTML = xhr.responseText;
        }
    };
    xhr.open('GET', page + '.html', true);
    xhr.send();
}