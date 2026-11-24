// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ q(cs5 cs5Var, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.b = cs5Var;
        this.c = z;
        this.d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.d;
        boolean z = this.c;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                cs5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                cs5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
