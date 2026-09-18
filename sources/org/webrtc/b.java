package org.webrtc;

import org.webrtc.Camera1Session;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
