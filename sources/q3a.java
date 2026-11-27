// default package

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class q3a extends g9 {
    public final /* synthetic */ r3a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3a(r3a r3aVar, Context context, x53 x53Var) {
        super(context, x53Var, false);
        this.c = r3aVar;
    }

    @Override // g9
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final byte b = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(vm2.f(0.18f, -16777216, -1));
        r3a r3aVar = this.c;
        z3a z3aVar = r3aVar.y;
        y3a y3aVar = z3aVar.F;
        final byte b2 = 0;
        boolean z = y3aVar != null && y3aVar.f;
        b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z ? R.drawable.menu_views_reposts : z3aVar.P.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, ob6.M0(z ? 2131745017 : 2131745018, null), false, z3aVar.s);
        if (!z3aVar.P.a) {
            c.setAlpha(0.5f);
        }
        c.setOnClickListener(new View.OnClickListener(this) { // from class: p3a
            public final /* synthetic */ q3a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                q3a q3aVar = this.b;
                switch (b3) {
                    case 0:
                        z3a z3aVar2 = q3aVar.c.y;
                        n3a n3aVar = z3aVar2.P;
                        if (!n3aVar.a) {
                            n3a n3aVar2 = z3aVar2.N;
                            if (n3aVar2 != null) {
                                n3aVar.a = true;
                                n3aVar2.a = true;
                            } else {
                                n3aVar.a = true;
                            }
                            z3aVar2.g(true);
                            z3aVar2.e();
                            z3aVar2.O.a(z3aVar2);
                        }
                        q3a q3aVar2 = z3aVar2.f;
                        if (q3aVar2 != null) {
                            q3aVar2.a();
                            break;
                        }
                        break;
                    default:
                        z3a z3aVar3 = q3aVar.c.y;
                        n3a n3aVar3 = z3aVar3.P;
                        if (n3aVar3.a) {
                            n3a n3aVar4 = z3aVar3.N;
                            if (n3aVar4 != null) {
                                n3aVar3.a = false;
                                n3aVar4.a = false;
                            } else {
                                n3aVar3.a = false;
                            }
                            z3aVar3.g(true);
                            z3aVar3.e();
                            z3aVar3.O.a(z3aVar3);
                        }
                        q3a q3aVar3 = z3aVar3.f;
                        if (q3aVar3 != null) {
                            q3aVar3.a();
                            break;
                        }
                        break;
                }
            }
        });
        b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z3aVar.P.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, ob6.M0(2131745016, null), false, z3aVar.s);
        if (z3aVar.P.a) {
            c2.setAlpha(0.5f);
        }
        c2.setOnClickListener(new View.OnClickListener(this) { // from class: p3a
            public final /* synthetic */ q3a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                q3a q3aVar = this.b;
                switch (b3) {
                    case 0:
                        z3a z3aVar2 = q3aVar.c.y;
                        n3a n3aVar = z3aVar2.P;
                        if (!n3aVar.a) {
                            n3a n3aVar2 = z3aVar2.N;
                            if (n3aVar2 != null) {
                                n3aVar.a = true;
                                n3aVar2.a = true;
                            } else {
                                n3aVar.a = true;
                            }
                            z3aVar2.g(true);
                            z3aVar2.e();
                            z3aVar2.O.a(z3aVar2);
                        }
                        q3a q3aVar2 = z3aVar2.f;
                        if (q3aVar2 != null) {
                            q3aVar2.a();
                            break;
                        }
                        break;
                    default:
                        z3a z3aVar3 = q3aVar.c.y;
                        n3a n3aVar3 = z3aVar3.P;
                        if (n3aVar3.a) {
                            n3a n3aVar4 = z3aVar3.N;
                            if (n3aVar4 != null) {
                                n3aVar3.a = false;
                                n3aVar4.a = false;
                            } else {
                                n3aVar3.a = false;
                            }
                            z3aVar3.g(true);
                            z3aVar3.e();
                            z3aVar3.O.a(z3aVar3);
                        }
                        q3a q3aVar3 = z3aVar3.f;
                        if (q3aVar3 != null) {
                            q3aVar3.a();
                            break;
                        }
                        break;
                }
            }
        });
        View k8Var = new k8(aob.H8, z3aVar.s, r3aVar.getContext());
        k8Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k8Var, tre.o(-1, 8));
        String M0 = ob6.M0(z ? 2131744156 : 2131744099, null);
        x53 x53Var = z3aVar.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        yob.X(textView, aob.j5, x53Var);
        textView.setPadding(hl.L(13.0f), hl.L(8.0f), hl.L(13.0f), hl.L(8.0f));
        textView.setText(M0);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(hl.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, tre.o(-1, -2));
    }
}
