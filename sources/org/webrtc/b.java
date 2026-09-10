package org.webrtc;

import org.webrtc.Camera1Session;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
