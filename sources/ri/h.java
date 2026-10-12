package ri;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public interface h {
    void onCompleted(n nVar);

    void onError(Exception exc);

    void onMaximumDurationReached();

    void onPreviewPlaybackChanged(boolean z10);

    void onPreviewProgress(long j10, long j11);

    void onPreviewReady(long j10, long j11, long j12, byte[] bArr);

    void onRecordingProgress(long j10, double d);

    void onRecordingTooShort(long j10);

    void onStateChanged(p pVar);
}
