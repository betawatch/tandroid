package org.telegram.utils.twidget;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements xvc, lvc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ q(Object obj, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
    }

    @Override // lvc
    public final void a(byte[] bArr) {
        ((WidgetEngineBackend) this.b).lambda$signal$3(this.c, bArr);
    }

    @Override // xvc
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
