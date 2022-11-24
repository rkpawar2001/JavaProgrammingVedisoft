class BigException extends Exception {
    protected String msg;

    public BigException() {
    }

    public BigException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}