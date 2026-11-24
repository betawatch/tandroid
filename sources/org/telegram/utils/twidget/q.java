package org.telegram.utils.twidget;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements yxc, mxc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ q(Object obj, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
    }

    @Override // mxc
    public final void a(byte[] bArr) {
        ((WidgetEngineBackend) this.b).lambda$signal$3(this.c, bArr);
    }

    @Override // yxc
    public final Object run() {
        byte b = this.a;
        int i = this.c;
        w wVar = (w) this.b;
        switch (b) {
            case 0:
                wVar.b.deleteFont(i);
                break;
            default:
                wVar.b.canvasRelease(i);
                break;
        }
        return null;
    }
}
