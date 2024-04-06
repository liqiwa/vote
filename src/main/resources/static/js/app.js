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
// app.js 应该在 resources/static/js/ 下
// 使用 AJAX 从后端获取数据，并动态生成表单和结果

$(document).ready(function() {
    // ... 省略其他代码
});

// 定义更多的函数来处理投票和展示结果
