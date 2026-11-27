// default package

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class s92 implements r69 {
    public final /* synthetic */ u92 a;

    public s92(u92 u92Var) {
        this.a = u92Var;
    }

    @Override // r69
    public final void e(int i, View view) {
        TLRPC.TL_username tL_username;
        u92 u92Var = this.a;
        v92 v92Var = u92Var.i3;
        if (!(view instanceof re1) || (tL_username = ((re1) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (v92Var.fragmentView instanceof ScrollView) {
                v92Var.a.smoothScrollTo(0, v92Var.E.getTop() - hl.L(128.0f));
            }
            v92Var.b.requestFocus();
            hl.E3(v92Var.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v92Var.getResourceProvider(), u92Var.getContext());
        String M0 = ob6.M0(tL_username.active ? 2131743319 : 2131743326, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(tL_username.active ? 2131743318 : 2131743325, null);
        alertDialog$Builder.j(ob6.M0(tL_username.active ? 2131749079 : 2131745081, null), new ie((Object) this, (Object) tL_username, (Object) view, (byte) 27));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new c22((byte) 7));
        alertDialog$Builder.o();
    }
}
