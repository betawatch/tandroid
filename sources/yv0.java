// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class yv0 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ow0 b;

    public /* synthetic */ yv0(ow0 ow0Var, byte b) {
        this.a = b;
        this.b = ow0Var;
    }

    @Override // c6
    public final void b(int i) {
        byte b = this.a;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                if (i != -1) {
                    if (i == R.id.menu_collapse_bot) {
                        ow0Var.z0 = true;
                        ow0Var.m(true);
                        break;
                    }
                } else if (!ow0Var.E.A()) {
                    ow0Var.v();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    ow0Var.v();
                    break;
                }
                break;
        }
    }
}
