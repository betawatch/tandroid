package org.webrtc;

import org.webrtc.Camera1Session;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
