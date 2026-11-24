// default package

import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                ti3Var.b.getMessagesController().N4(t97Var, !z);
                break;
        }
    }

    public /* synthetic */ ri3(ti3 ti3Var, boolean z, t97 t97Var) {
        this.b = ti3Var;
        this.d = z;
        this.c = t97Var;
    }
}
