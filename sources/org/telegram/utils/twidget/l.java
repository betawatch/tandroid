package org.telegram.utils.twidget;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements lxc, yxc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(Object obj, byte[] bArr, byte b) {
        this.a = b;
        this.c = obj;
        this.b = bArr;
    }

    @Override // lxc
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((mxc) obj).a(bArr);
                break;
            default:
                ((WidgetEngineBackend) obj).lambda$send$11(bArr);
                break;
        }
    }

    @Override // yxc
    public final Object run() {
        w wVar = (w) this.c;
        wVar.b.selectableText(wVar.b(this.b));
        return null;
    }
}
