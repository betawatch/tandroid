// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn1 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ rn1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        r47 r47Var;
        r47 r47Var2;
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                return zu1Var.N9();
            case 1:
                zu1 zu1Var2 = this.b;
                byte b2 = zu1Var2.dc;
                if (b2 == 1 && (r47Var2 = zu1Var2.H5) != null) {
                    zu1Var2.J(r47Var2.e1(), 0, 0, 0, true, true);
                    return true;
                }
                if (zu1Var2.x5 == null || b2 != 2 || (r47Var = zu1Var2.F5) == null) {
                    return false;
                }
                zu1Var2.J(r47Var.e1(), 0, 0, 0, true, true);
                return true;
            default:
                r47 r47Var3 = zu1Var.v5;
                if (r47Var3 == null) {
                    return false;
                }
                if (!hl.g(r47Var3.T0)) {
                    return true;
                }
                new d31(o11.a(zu1Var.getParentActivity()), zu1Var.Ba).k(false).j();
                return true;
        }
    }
}
