package org.telegram.utils.twidget;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements zzc, m0d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i(Object obj, int i, int i2, int i3, Object obj2, byte b) {
        this.a = b;
        this.e = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = obj2;
    }

    @Override // m0d
    public final Object run() {
        byte b = this.a;
        Object obj = this.f;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        w wVar = (w) this.e;
        switch (b) {
            case 1:
                wVar.b.defineImage(i3, i2, i, wVar.b((byte[]) obj));
                break;
            default:
                int[] iArr = (int[]) obj;
                WidgetSandboxBackend widgetSandboxBackend = wVar.b;
                if (iArr == null) {
                    iArr = new int[0];
                }
                widgetSandboxBackend.canvasRun(i3, i2, i, iArr);
                break;
        }
        return null;
    }

    @Override // zzc
    public final void run() {
        ((WidgetEngineBackend) this.e).lambda$canvasRun$8(this.b, this.c, this.d, (int[]) this.f);
    }
}
