package org.webrtc;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
