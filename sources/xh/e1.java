package xh;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e1(x3 x3Var, int i10, int i11) {
        this.a = i11;
        this.b = x3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                int i10 = this.c;
                x3Var.R0 = i10;
                h2 h2Var = x3Var.Z;
                h2Var.D(h2Var.getCurrentPosition() + (i10 > x3Var.G1() ? 1 : -1));
                break;
            case 1:
                x3 x3Var2 = this.b;
                int i11 = this.c;
                x3Var2.R0 = i11;
                h2 h2Var2 = x3Var2.Z;
                h2Var2.D(h2Var2.getCurrentPosition() + (i11 > x3Var2.G1() ? 1 : -1));
                break;
            case 2:
                x3 x3Var3 = this.b;
                int i12 = this.c;
                x3Var3.R0 = i12;
                h2 h2Var3 = x3Var3.Z;
                h2Var3.D(h2Var3.getCurrentPosition() + (i12 > x3Var3.G1() ? 1 : -1));
                break;
            default:
                x3 x3Var4 = this.b;
                int i13 = this.c;
                x3Var4.R0 = i13;
                h2 h2Var4 = x3Var4.Z;
                h2Var4.D(h2Var4.getCurrentPosition() + (i13 > x3Var4.G1() ? 1 : -1));
                break;
        }
    }
}
