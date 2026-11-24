// default package

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class z26 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f36 b;

    public /* synthetic */ z26(f36 f36Var, byte b) {
        this.a = b;
        this.b = f36Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        f36 f36Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                f36Var.r.i();
                break;
            case 1:
                m8 m8Var = f36Var.s;
                if (m8Var != null) {
                    m8Var.d(true);
                }
                f36Var.r.a();
                break;
            case 2:
                f36 f36Var2 = this.b;
                String str = f36Var2.b;
                boolean z = str != null && str.endsWith("?direct");
                Context context = f36Var2.getContext();
                String M0 = k96.M0(2131748978, null);
                String str2 = f36Var2.b;
                String str3 = f36Var2.K;
                if (str3 == null) {
                    str3 = k96.M0(f36Var2.I ? z ? 2131746314 : 2131746315 : 2131746312, null);
                }
                c36 c36Var = new c36(f36Var2, context, M0, str2, str3);
                f36Var2.F = c36Var;
                c36Var.D0();
                f36Var2.F.show();
                m8 m8Var2 = f36Var2.s;
                if (m8Var2 != null) {
                    m8Var2.d(true);
                    break;
                }
                break;
            default:
                m8 m8Var3 = f36Var.s;
                if (m8Var3 != null) {
                    m8Var3.d(true);
                }
                d dVar = f36Var.c;
                if (dVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                    String M02 = k96.M0(2131745830, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M02;
                    hdVar.U = k96.M0(2131745833, null);
                    alertDialog$Builder.j(k96.M0(2131745831, null), new y26(f36Var, b2));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
