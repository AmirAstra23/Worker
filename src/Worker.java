public class Worker implements OnTaskDoneListener, OnTaskErrorListener {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener error) {
        this.callback = callback;
        this.errorCallback = error;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Warning!!! Task " + i + " not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }

    @Override
    public void onDone(String result) {

    }

    @Override
    public void onError(String e) {

    }
}
