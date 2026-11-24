// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rt4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ rt4(vt4 vt4Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = vt4Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                vt4Var.c(runnable);
                break;
            default:
                vt4Var.c(runnable);
                break;
        }
    }
}
