package org.webrtc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
