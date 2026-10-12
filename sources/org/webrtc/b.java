package org.webrtc;

import org.webrtc.Camera1Session;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera1Session.2 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ b(Camera1Session.2 r12, byte[] bArr, int i10) {
        this.a = i10;
        this.b = r12;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onPreviewFrame$1(this.c);
                break;
            default:
                this.b.lambda$onPreviewFrame$0(this.c);
                break;
        }
    }
}
