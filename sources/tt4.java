// default package

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tt4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vt4 b;

    public /* synthetic */ tt4(vt4 vt4Var, byte b) {
        this.a = b;
        this.b = vt4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                vt4Var.c(null);
                break;
            default:
                LinearLayout linearLayout = vt4Var.e;
                if (linearLayout != null && !vt4Var.O) {
                    vt4Var.e = null;
                    vt4Var.h(linearLayout, false);
                    break;
                }
                break;
        }
    }
}
