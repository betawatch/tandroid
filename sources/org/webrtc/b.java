package org.webrtc;

import org.webrtc.Camera1Session;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Camera1Session.2 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ b(Camera1Session.2 r1, byte[] bArr, byte b) {
        this.a = b;
        this.b = r1;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.c;
        Camera1Session.2 r2 = this.b;
        switch (b) {
            case 0:
                r2.lambda$onPreviewFrame$1(bArr);
                break;
            default:
                r2.lambda$onPreviewFrame$0(bArr);
                break;
        }
    }
}
