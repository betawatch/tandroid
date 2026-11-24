// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
