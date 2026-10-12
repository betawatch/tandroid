package org.webrtc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScreenCapturerAndroid b;

    public /* synthetic */ q(ScreenCapturerAndroid screenCapturerAndroid, int i10) {
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
