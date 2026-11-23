package org.telegram.utils.twidget;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements p0, y {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ q0(Object obj, int i7, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i7;
    }

    @Override // org.telegram.utils.twidget.y
    public void a(byte[] bArr) {
        ((WidgetEngineBackend) this.b).lambda$signal$3(this.c, bArr);
    }

    @Override // org.telegram.utils.twidget.p0
    public Object run() {
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.b;
                x0Var.b.deleteFont(this.c);
                break;
            default:
                x0 x0Var2 = (x0) this.b;
                x0Var2.b.canvasRelease(this.c);
                break;
        }
        return null;
    }
}
