// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w82 extends c6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ f92 b;

    public w82(f92 f92Var, Context context) {
        this.b = f92Var;
        this.a = context;
    }

    @Override // c6
    public final void b(int i) {
        f92 f92Var = this.b;
        if (i == -1) {
            f92Var.finishFragment();
            return;
        }
        if (i == 1) {
            sha shaVar = f92Var.r;
            if (shaVar == null || !shaVar.y.f) {
                String K = hc2.K(f92Var.Y, false);
                if (!f92Var.W || TextUtils.isEmpty(K)) {
                    f92Var.d0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f92Var.getResourceProvider(), this.a);
                String M0 = k96.M0(f92Var.b0 ? 2131748510 : 2131748508, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = gl.S2(k96.a0(null, null, f92Var.b0 ? 2131748511 : 2131748509, ls6.o(f92Var.getMessagesController().N2, "/", K, new StringBuilder())));
                alertDialog$Builder.j(k96.M0(2131751759, null), new rh1(this, (byte) 20));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                f92Var.showDialog(hdVar);
            }
        }
    }
}
