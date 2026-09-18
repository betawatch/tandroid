package yh;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e1(y3 y3Var, int i10, int i11) {
        this.a = i11;
        this.b = y3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y3 y3Var = this.b;
                int i10 = this.c;
                y3Var.R0 = i10;
                h2 h2Var = y3Var.Z;
                h2Var.E(h2Var.getCurrentPosition() + (i10 > y3Var.G1() ? 1 : -1));
                break;
            case 1:
                y3 y3Var2 = this.b;
                int i11 = this.c;
                y3Var2.R0 = i11;
                h2 h2Var2 = y3Var2.Z;
                h2Var2.E(h2Var2.getCurrentPosition() + (i11 > y3Var2.G1() ? 1 : -1));
                break;
            case 2:
                y3 y3Var3 = this.b;
                int i12 = this.c;
                y3Var3.R0 = i12;
                h2 h2Var3 = y3Var3.Z;
                h2Var3.E(h2Var3.getCurrentPosition() + (i12 > y3Var3.G1() ? 1 : -1));
                break;
            default:
                y3 y3Var4 = this.b;
                int i13 = this.c;
                y3Var4.R0 = i13;
                h2 h2Var4 = y3Var4.Z;
                h2Var4.E(h2Var4.getCurrentPosition() + (i13 > y3Var4.G1() ? 1 : -1));
                break;
        }
    }
}
