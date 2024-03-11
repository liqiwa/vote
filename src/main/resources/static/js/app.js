// 文件路径 src/main/resources/static/js/app.js

function sendVote(hobbyId) {
    fetch('/vote/' + hobbyId, {
        method: 'POST',
        // 如果你有设置 CSRF 保护，请确保添加对应的 token
    }).then(response => {
        if (response.ok) {
            console.log("Vote successfully sent for hobby id " + hobbyId);
        }
    }).catch(error => {
        console.error('Error during voting:', error);
    });
}

// 可以用类似的方法来获取投票结果
function getResults() {
    fetch('/results').then(response => {
        if (response.ok) {
            return response.json();
        }
        throw new Error('Request failed.');
    }).then(data => {
        console.log(data); // 处理并显示结果
    }).catch(error => {
        console.error('Error while fetching results:', error);
    });
}
