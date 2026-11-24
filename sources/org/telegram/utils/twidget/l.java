package org.telegram.utils.twidget;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements kvc, xvc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(Object obj, byte[] bArr, byte b) {
        this.a = b;
        this.c = obj;
        this.b = bArr;
    }

    @Override // kvc
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((lvc) obj).a(bArr);
                break;
            default:
                ((WidgetEngineBackend) obj).lambda$send$11(bArr);
                break;
        }
    }

    @Override // xvc
    public final Object run() {
        w wVar = (w) this.c;
        wVar.b.selectableText(wVar.b(this.b));
        return null;
    }
}
