package vh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q2(d1 d1Var, int i10, int i11) {
        this.a = i11;
        this.b = d1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                d1Var.r();
                d1Var.setSelection(Math.max(0, Math.min(this.c, d1Var.length())));
                break;
            case 1:
                d1 d1Var2 = this.b;
                d1Var2.r();
                d1Var2.setSelection(Math.max(0, Math.min(this.c, d1Var2.length())));
                break;
            case 2:
                d1 d1Var3 = this.b;
                d1Var3.r();
                d1Var3.setSelection(Math.max(0, Math.min(this.c, d1Var3.length())));
                break;
            case 3:
                d1 d1Var4 = this.b;
                d1Var4.r();
                d1Var4.setSelection(Math.min(this.c, d1Var4.length()));
                break;
            default:
                d1 d1Var5 = this.b;
                d1Var5.r();
                d1Var5.setSelection(Math.max(0, Math.min(this.c, d1Var5.length())));
                break;
        }
    }
}
