package org.webrtc;

import org.webrtc.Camera1Session;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera1Session.2 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ b(Camera1Session.2 r12, byte[] bArr, int i7) {
        this.a = i7;
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
