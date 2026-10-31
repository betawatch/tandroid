package th;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o3 extends k.a {
    public final /* synthetic */ p3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(p3 p3Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = p3Var;
    }

    @Override // k.a
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final int i10 = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.b.f(0.18f, -16777216, -1));
        p3 p3Var = this.c;
        y3 y3Var = p3Var.y;
        x3 x3Var = y3Var.E;
        final int i11 = 0;
        boolean z10 = x3Var != null && x3Var.f;
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : y3Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, cd.L0(z10 ? 2131745307 : 2131745308, null), false, y3Var.s);
        if (!y3Var.O.a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: th.n3
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        y3 y3Var2 = this.b.c.y;
                        l3 l3Var = y3Var2.O;
                        if (!l3Var.a) {
                            l3 l3Var2 = y3Var2.M;
                            if (l3Var2 != null) {
                                l3Var.a = true;
                                l3Var2.a = true;
                            } else {
                                l3Var.a = true;
                            }
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            y3Var2.N.a(y3Var2);
                        }
                        o3 o3Var = y3Var2.f;
                        if (o3Var != null) {
                            o3Var.a();
                            break;
                        }
                        break;
                    default:
                        y3 y3Var3 = this.b.c.y;
                        l3 l3Var3 = y3Var3.O;
                        if (l3Var3.a) {
                            l3 l3Var4 = y3Var3.M;
                            if (l3Var4 != null) {
                                l3Var3.a = false;
                                l3Var4.a = false;
                            } else {
                                l3Var3.a = false;
                            }
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            y3Var3.N.a(y3Var3);
                        }
                        o3 o3Var2 = y3Var3.f;
                        if (o3Var2 != null) {
                            o3Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !y3Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, cd.L0(2131745306, null), false, y3Var.s);
        if (y3Var.O.a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: th.n3
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        y3 y3Var2 = this.b.c.y;
                        l3 l3Var = y3Var2.O;
                        if (!l3Var.a) {
                            l3 l3Var2 = y3Var2.M;
                            if (l3Var2 != null) {
                                l3Var.a = true;
                                l3Var2.a = true;
                            } else {
                                l3Var.a = true;
                            }
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            y3Var2.N.a(y3Var2);
                        }
                        o3 o3Var = y3Var2.f;
                        if (o3Var != null) {
                            o3Var.a();
                            break;
                        }
                        break;
                    default:
                        y3 y3Var3 = this.b.c.y;
                        l3 l3Var3 = y3Var3.O;
                        if (l3Var3.a) {
                            l3 l3Var4 = y3Var3.M;
                            if (l3Var4 != null) {
                                l3Var3.a = false;
                                l3Var4.a = false;
                            } else {
                                l3Var3.a = false;
                            }
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            y3Var3.N.a(y3Var3);
                        }
                        o3 o3Var2 = y3Var3.f;
                        if (o3Var2 != null) {
                            o3Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View h1Var = new org.telegram.ui.ActionBar.h1(org.telegram.ui.ActionBar.t6.H8, p3Var.getContext(), y3Var.s);
        h1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(h1Var, w7.b6.o(-1, 8));
        String L0 = cd.L0(z10 ? 2131744528 : 2131744471, null);
        b bVar = y3Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, bVar);
        textView.setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        textView.setText(L0);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(org.telegram.messenger.i0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.b6.o(-1, -2));
    }

    @Override // k.a
    public final void k() {
    }
}
