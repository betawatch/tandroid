package rh;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ i1(e4 e4Var, int i10, int i11) {
        this.a = i11;
        this.b = e4Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e4 e4Var = this.b;
                int i10 = this.c;
                e4Var.M2 = i10;
                l2 l2Var = e4Var.R1;
                l2Var.E(l2Var.getCurrentPosition() + (i10 > e4Var.D1() ? 1 : -1));
                break;
            case 1:
                e4 e4Var2 = this.b;
                int i11 = this.c;
                e4Var2.M2 = i11;
                l2 l2Var2 = e4Var2.R1;
                l2Var2.E(l2Var2.getCurrentPosition() + (i11 > e4Var2.D1() ? 1 : -1));
                break;
            case 2:
                e4 e4Var3 = this.b;
                int i12 = this.c;
                e4Var3.M2 = i12;
                l2 l2Var3 = e4Var3.R1;
                l2Var3.E(l2Var3.getCurrentPosition() + (i12 > e4Var3.D1() ? 1 : -1));
                break;
            default:
                e4 e4Var4 = this.b;
                int i13 = this.c;
                e4Var4.M2 = i13;
                l2 l2Var4 = e4Var4.R1;
                l2Var4.E(l2Var4.getCurrentPosition() + (i13 > e4Var4.D1() ? 1 : -1));
                break;
        }
    }
}
