package zh;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d1(r3 r3Var, int i10, int i11) {
        this.a = i11;
        this.b = r3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r3 r3Var = this.b;
                int i10 = this.c;
                r3Var.S0 = i10;
                c2 c2Var = r3Var.Z;
                c2Var.D(c2Var.getCurrentPosition() + (i10 > r3Var.H1() ? 1 : -1));
                break;
            case 1:
                r3 r3Var2 = this.b;
                int i11 = this.c;
                r3Var2.S0 = i11;
                c2 c2Var2 = r3Var2.Z;
                c2Var2.D(c2Var2.getCurrentPosition() + (i11 > r3Var2.H1() ? 1 : -1));
                break;
            case 2:
                r3 r3Var3 = this.b;
                int i12 = this.c;
                r3Var3.S0 = i12;
                c2 c2Var3 = r3Var3.Z;
                c2Var3.D(c2Var3.getCurrentPosition() + (i12 > r3Var3.H1() ? 1 : -1));
                break;
            default:
                r3 r3Var4 = this.b;
                int i13 = this.c;
                r3Var4.S0 = i13;
                c2 c2Var4 = r3Var4.Z;
                c2Var4.D(c2Var4.getCurrentPosition() + (i13 > r3Var4.H1() ? 1 : -1));
                break;
        }
    }
}
