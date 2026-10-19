package ri;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public interface g {
    void onCompleted(m mVar);

    void onError(Exception exc);

    void onMaximumDurationReached();

    void onPreviewPlaybackChanged(boolean z10);

    void onPreviewProgress(long j10, long j11);

    void onPreviewReady(long j10, long j11, long j12, byte[] bArr);

    void onRecordingProgress(long j10, double d);

    void onRecordingTooShort(long j10);

    void onStateChanged(o oVar);
}
