// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt9 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ du9 b;

    public /* synthetic */ zt9(du9 du9Var, byte b) {
        this.a = b;
        this.b = du9Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        du9 du9Var = this.b;
        switch (b) {
            case 0:
                cu9 cu9Var = (cu9) obj;
                du9Var.I = null;
                du9Var.F = cu9Var;
                du9Var.E = cu9Var != null;
                du9Var.a();
                du9Var.invalidate();
                bab babVar = du9Var.b;
                if (babVar != null) {
                    babVar.run();
                    break;
                }
                break;
            default:
                e eVar = (e) obj;
                cu9 cu9Var2 = du9Var.F;
                if (cu9Var2 != null || eVar == null) {
                    cu9Var2.c(eVar);
                    break;
                }
        }
    }
}
