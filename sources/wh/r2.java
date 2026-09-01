package wh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ r2(e1 e1Var, int i10, int i11) {
        this.a = i11;
        this.b = e1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                e1Var.r();
                e1Var.setSelection(Math.max(0, Math.min(this.c, e1Var.length())));
                break;
            case 1:
                e1 e1Var2 = this.b;
                e1Var2.r();
                e1Var2.setSelection(Math.max(0, Math.min(this.c, e1Var2.length())));
                break;
            case 2:
                e1 e1Var3 = this.b;
                e1Var3.r();
                e1Var3.setSelection(Math.max(0, Math.min(this.c, e1Var3.length())));
                break;
            case 3:
                e1 e1Var4 = this.b;
                e1Var4.r();
                e1Var4.setSelection(Math.min(this.c, e1Var4.length()));
                break;
            default:
                e1 e1Var5 = this.b;
                e1Var5.r();
                e1Var5.setSelection(Math.max(0, Math.min(this.c, e1Var5.length())));
                break;
        }
    }
}
