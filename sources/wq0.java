// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wq0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gr0 b;

    public /* synthetic */ wq0(gr0 gr0Var, byte b) {
        this.a = b;
        this.b = gr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        gr0 gr0Var = this.b;
        switch (b) {
            case 0:
                kca kcaVar = gr0Var.a0;
                s1b s1bVar = gr0Var.a;
                kcaVar.a(s1bVar == null ? "" : s1bVar.E);
                break;
            default:
                gr0Var.a0.b(gr0Var.a.E);
                break;
        }
    }
}
