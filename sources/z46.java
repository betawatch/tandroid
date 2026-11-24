// default package

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z46 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f56 b;

    public /* synthetic */ z46(f56 f56Var, byte b) {
        this.a = b;
        this.b = f56Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        f56 f56Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                f56Var.r.i();
                break;
            case 1:
                m8 m8Var = f56Var.s;
                if (m8Var != null) {
                    m8Var.d(true);
                }
                f56Var.r.a();
                break;
            case 2:
                f56 f56Var2 = this.b;
                String str = f56Var2.b;
                boolean z = str != null && str.endsWith("?direct");
                Context context = f56Var2.getContext();
                String M0 = jb6.M0(2131748927, null);
                String str2 = f56Var2.b;
                String str3 = f56Var2.K;
                if (str3 == null) {
                    str3 = jb6.M0(f56Var2.I ? z ? 2131746240 : 2131746241 : 2131746238, null);
                }
                c56 c56Var = new c56(f56Var2, context, M0, str2, str3);
                f56Var2.F = c56Var;
                c56Var.D0();
                f56Var2.F.show();
                m8 m8Var2 = f56Var2.s;
                if (m8Var2 != null) {
                    m8Var2.d(true);
                    break;
                }
                break;
            default:
                m8 m8Var3 = f56Var.s;
                if (m8Var3 != null) {
                    m8Var3.d(true);
                }
                d dVar = f56Var.c;
                if (dVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
                    String M02 = jb6.M0(2131745756, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M02;
                    heVar.U = jb6.M0(2131745759, null);
                    alertDialog$Builder.j(jb6.M0(2131745757, null), new y46(f56Var, b2));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    TextView textView = (TextView) heVar.c(-1);
                    if (textView != null) {
                        anb.X(textView, cmb.p7, null);
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
