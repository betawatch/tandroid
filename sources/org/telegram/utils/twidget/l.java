package org.telegram.utils.twidget;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements zzc, m0d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(Object obj, byte[] bArr, byte b) {
        this.a = b;
        this.c = obj;
        this.b = bArr;
    }

    @Override // zzc
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((a0d) obj).a(bArr);
                break;
            default:
                ((WidgetEngineBackend) obj).lambda$send$11(bArr);
                break;
        }
    }

    @Override // m0d
    public final Object run() {
        w wVar = (w) this.c;
        wVar.b.selectableText(wVar.b(this.b));
        return null;
    }
}
