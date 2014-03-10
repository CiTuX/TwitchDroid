package ch.citux.td.data.worker;

public interface TDCallback<Result> {

    public void startLoading();

    public void stopLoading();

    public void onResponse(Result response);

    public void onError(String title, String message);

    public boolean isAdded();

}
