<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="importhead.jsp"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>查看成绩详情</title>
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="css/lgd.css" />
</head>
<body class="viewScore-body">
    <div class="container viewscore-divbox">
        <div class="panel panel-heading text-center viewScore_panelhead">
            <h2>查看成绩详情</h2>
        </div>
        <div class="panel panel-body text-center viewScore_panelbody">
            <div>
                <table class="table table-studentInfo">
                    <tr>
                        <td class="viewScoreStudentinfo text-right">姓名:</td>
                        <td class="viewScoreStudentinfo text-left">xingming</td>
                    </tr>
                    <tr>
                        <td class="viewScoreStudentinfo text-right">学号:</td>
                        <td class="viewScoreStudentinfo text-left">123123123</td>

                    </tr>
                    <tr>
                        <td class="viewScoreStudentinfo text-right">专业:</td>
                        <td class="viewScoreStudentinfo text-left">计算机科学与技术</td>
                    </tr>
                </table>
            </div>
            <div class="table-score">
                <table class="table table-bordered table-scoreTable">
                    <thead>
                        <tr>
                            <td class="viewScoreStudentinfo">项目名称</td>
                            <td class="viewScoreStudentinfo">得分</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>项目1</td>
                            <td>23</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="panel panel-footer viewScore_panelfooter text-right">
            <button type="button" class="btn btn-success">返回</button>
        </div>
    </div>
</body>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>