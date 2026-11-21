package org.telegram.utils.twidget;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements x, p0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s(Object obj, int i7, int i10, int i11, Object obj2, int i12) {
        this.a = i12;
        this.e = obj;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.f = obj2;
    }

    @Override // org.telegram.utils.twidget.x
    public void run() {
        ((WidgetEngineBackend) this.e).lambda$canvasRun$8(this.b, this.c, this.d, (int[]) this.f);
    }

    @Override // org.telegram.utils.twidget.p0
    public Object run() {
        switch (this.a) {
            case 1:
                x0 x0Var = (x0) this.e;
                byte[] bArr = (byte[]) this.f;
                x0Var.b.defineImage(this.b, this.c, this.d, x0Var.i1(bArr));
                break;
            default:
                x0 x0Var2 = (x0) this.e;
                int[] iArr = (int[]) this.f;
                WidgetSandboxBackend widgetSandboxBackend = x0Var2.b;
                if (iArr == null) {
                    iArr = new int[0];
                }
                widgetSandboxBackend.canvasRun(this.b, this.c, this.d, iArr);
                break;
        }
        return null;
    }
}
