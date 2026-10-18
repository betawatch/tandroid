package org.webrtc;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScreenCapturerAndroid b;

    public /* synthetic */ p(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
        this.a = i10;
        this.b = screenCapturerAndroid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$changeCaptureFormat$1();
                break;
            default:
                this.b.lambda$stopCapture$0();
                break;
        }
    }
}
