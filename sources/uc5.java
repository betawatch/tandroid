// default package

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uc5 implements n8c, o8c {
    public final /* synthetic */ vc5 a;

    public /* synthetic */ uc5(vc5 vc5Var) {
        this.a = vc5Var;
    }

    @Override // o8c
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        int i = c4cVar.d;
        boolean z = false;
        if (i != 0) {
            vc5 vc5Var = this.a;
            String str = (String) vc5Var.c.get(i - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vc5Var.b, vc5Var.getContext());
            String M0 = k96.M0(2131752042, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.a0(null, null, 2131752040, str);
            alertDialog$Builder.j(k96.M0(2131752043, null), new h45(vc5Var, str, (byte) 3));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            hdVar.show();
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i = ((c4c) obj).d;
        vc5 vc5Var = this.a;
        if (i == 0) {
            cd5 a = cd5.a(vc5Var.a);
            a.f.clear();
            a.d();
            vc5Var.f.O(true);
            return;
        }
        p8c p8cVar = vc5Var.h;
        if (p8cVar != null) {
            p8cVar.a((String) vc5Var.c.get(i - 1));
        }
    }
}
