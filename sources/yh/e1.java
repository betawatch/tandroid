package yh;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e1(z3 z3Var, int i10, int i11) {
        this.a = i11;
        this.b = z3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                int i10 = this.c;
                z3Var.R0 = i10;
                i2 i2Var = z3Var.Z;
                i2Var.D(i2Var.getCurrentPosition() + (i10 > z3Var.G1() ? 1 : -1));
                break;
            case 1:
                z3 z3Var2 = this.b;
                int i11 = this.c;
                z3Var2.R0 = i11;
                i2 i2Var2 = z3Var2.Z;
                i2Var2.D(i2Var2.getCurrentPosition() + (i11 > z3Var2.G1() ? 1 : -1));
                break;
            case 2:
                z3 z3Var3 = this.b;
                int i12 = this.c;
                z3Var3.R0 = i12;
                i2 i2Var3 = z3Var3.Z;
                i2Var3.D(i2Var3.getCurrentPosition() + (i12 > z3Var3.G1() ? 1 : -1));
                break;
            default:
                z3 z3Var4 = this.b;
                int i13 = this.c;
                z3Var4.R0 = i13;
                i2 i2Var4 = z3Var4.Z;
                i2Var4.D(i2Var4.getCurrentPosition() + (i13 > z3Var4.G1() ? 1 : -1));
                break;
        }
    }
}
