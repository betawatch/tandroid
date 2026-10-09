package org.webrtc;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
