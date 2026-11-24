// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y25 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j35 b;

    public /* synthetic */ y25(j35 j35Var, byte b) {
        this.a = b;
        this.b = j35Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        j35 j35Var = this.b;
        switch (b) {
            case 0:
                if (!j35Var.a() && !j35Var.d) {
                    j35Var.d = false;
                    if (!j35Var.f) {
                        j35Var.f = true;
                        j35Var.b.c();
                    }
                    if (!j35Var.e) {
                        j35Var.a.dismiss();
                        break;
                    }
                }
                break;
            default:
                if (!j35Var.a() && !j35Var.d) {
                    j35Var.d = false;
                    if (!j35Var.f) {
                        j35Var.f = true;
                        j35Var.b.c();
                    }
                    if (!j35Var.e) {
                        j35Var.a.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
