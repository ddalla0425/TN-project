const $homeBtn = document.getElementById("homeBtn");
const $memberInfoBtn = document.getElementById("memberInfoBtn");
const $paymentBtn = document.getElementById("paymentBtn");
const $blockListBtn = document.getElementById("blockListBtn");
const $adminListBtn = document.getElementById("adminListBtn");
const $reportListBtn = document.getElementById("reportListBtn");
const $memberListBtn = document.getElementById('memberListBtn');
const $logoutBtn = document.getElementById("logoutBtn");
const $testHubBtn = document.getElementById("testHubBtn");

if ($homeBtn) {
    $homeBtn.onclick = function () {
        alert(`홈으로이동합니다`)
        location.href = "/timeline/list";
    };
}
if ($memberInfoBtn) {
    $memberInfoBtn.onclick = function () {
        location.href = "/member/update";
    };
}
if ($paymentBtn) {
    $paymentBtn.onclick = function () {
        location.href = "/payment/management";
    };
}
if ($blockListBtn) {
    $blockListBtn.onclick = function () {
        location.href = "/member/blockList";
    };
}
if ($adminListBtn) {
    $adminListBtn.onclick = function () {
        location.href = "/manager/admin/list";
    };
}
if ($reportListBtn) {
    $reportListBtn.onclick = function () {
        location.href = "/manager/report/list";
    };
}
if ($memberListBtn) {
    $memberListBtn.onclick = function () {
        location.href = "/manager/member/list";
    };
}
if ($logoutBtn) {
    $logoutBtn.onclick = function () {
        location.href = "/member/logout";
    };
}
if ($testHubBtn) {
    $testHubBtn.onclick = function () {
        location.href = "/common/testhub";
    };
}