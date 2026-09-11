package zh;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e1(w3 w3Var, int i10, int i11) {
        this.a = i11;
        this.b = w3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                int i10 = this.c;
                w3Var.R0 = i10;
                g2 g2Var = w3Var.Z;
                g2Var.D(g2Var.getCurrentPosition() + (i10 > w3Var.G1() ? 1 : -1));
                break;
            case 1:
                w3 w3Var2 = this.b;
                int i11 = this.c;
                w3Var2.R0 = i11;
                g2 g2Var2 = w3Var2.Z;
                g2Var2.D(g2Var2.getCurrentPosition() + (i11 > w3Var2.G1() ? 1 : -1));
                break;
            case 2:
                w3 w3Var3 = this.b;
                int i12 = this.c;
                w3Var3.R0 = i12;
                g2 g2Var3 = w3Var3.Z;
                g2Var3.D(g2Var3.getCurrentPosition() + (i12 > w3Var3.G1() ? 1 : -1));
                break;
            default:
                w3 w3Var4 = this.b;
                int i13 = this.c;
                w3Var4.R0 = i13;
                g2 g2Var4 = w3Var4.Z;
                g2Var4.D(g2Var4.getCurrentPosition() + (i13 > w3Var4.G1() ? 1 : -1));
                break;
        }
    }
}
