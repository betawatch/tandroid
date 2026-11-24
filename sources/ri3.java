// default package

import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ri3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ti3 b;
    public final /* synthetic */ t97 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ri3(ti3 ti3Var, t97 t97Var, boolean z) {
        this.b = ti3Var;
        this.c = t97Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        t97 t97Var = this.c;
        ti3 ti3Var = this.b;
        switch (b) {
            case 0:
                ti3Var.b.presentFragment(z ? new FiltersSetupActivity() : new pd4(t97Var, null));
                break;
            default:
                ti3Var.b.getMessagesController().O4(t97Var, !z);
                break;
        }
    }

    public /* synthetic */ ri3(ti3 ti3Var, boolean z, t97 t97Var) {
        this.b = ti3Var;
        this.d = z;
        this.c = t97Var;
    }
}
