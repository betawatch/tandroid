package ri;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
