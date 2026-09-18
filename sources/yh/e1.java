package yh;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e1(a4 a4Var, int i10, int i11) {
        this.a = i11;
        this.b = a4Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a4 a4Var = this.b;
                int i10 = this.c;
                a4Var.R0 = i10;
                j2 j2Var = a4Var.Z;
                j2Var.E(j2Var.getCurrentPosition() + (i10 > a4Var.G1() ? 1 : -1));
                break;
            case 1:
                a4 a4Var2 = this.b;
                int i11 = this.c;
                a4Var2.R0 = i11;
                j2 j2Var2 = a4Var2.Z;
                j2Var2.E(j2Var2.getCurrentPosition() + (i11 > a4Var2.G1() ? 1 : -1));
                break;
            case 2:
                a4 a4Var3 = this.b;
                int i12 = this.c;
                a4Var3.R0 = i12;
                j2 j2Var3 = a4Var3.Z;
                j2Var3.E(j2Var3.getCurrentPosition() + (i12 > a4Var3.G1() ? 1 : -1));
                break;
            default:
                a4 a4Var4 = this.b;
                int i13 = this.c;
                a4Var4.R0 = i13;
                j2 j2Var4 = a4Var4.Z;
                j2Var4.E(j2Var4.getCurrentPosition() + (i13 > a4Var4.G1() ? 1 : -1));
                break;
        }
    }
}
