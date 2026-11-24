// default package

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class wz9 extends f9 {
    public final /* synthetic */ xz9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz9(xz9 xz9Var, Context context, f53 f53Var) {
        super(context, f53Var, false);
        this.c = xz9Var;
    }

    @Override // f9
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final byte b = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(bm2.f(0.18f, -16777216, -1));
        xz9 xz9Var = this.c;
        g0a g0aVar = xz9Var.y;
        f0a f0aVar = g0aVar.F;
        final byte b2 = 0;
        boolean z = f0aVar != null && f0aVar.f;
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z ? R.drawable.menu_views_reposts : g0aVar.P.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, k96.M0(z ? 2131745097 : 2131745098, null), false, g0aVar.s);
        if (!g0aVar.P.a) {
            c.setAlpha(0.5f);
        }
        c.setOnClickListener(new View.OnClickListener(this) { // from class: vz9
            public final /* synthetic */ wz9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                wz9 wz9Var = this.b;
                switch (b3) {
                    case 0:
                        g0a g0aVar2 = wz9Var.c.y;
                        tz9 tz9Var = g0aVar2.P;
                        if (!tz9Var.a) {
                            tz9 tz9Var2 = g0aVar2.N;
                            if (tz9Var2 != null) {
                                tz9Var.a = true;
                                tz9Var2.a = true;
                            } else {
                                tz9Var.a = true;
                            }
                            g0aVar2.g(true);
                            g0aVar2.e();
                            g0aVar2.O.a(g0aVar2);
                        }
                        wz9 wz9Var2 = g0aVar2.f;
                        if (wz9Var2 != null) {
                            wz9Var2.a();
                            break;
                        }
                        break;
                    default:
                        g0a g0aVar3 = wz9Var.c.y;
                        tz9 tz9Var3 = g0aVar3.P;
                        if (tz9Var3.a) {
                            tz9 tz9Var4 = g0aVar3.N;
                            if (tz9Var4 != null) {
                                tz9Var3.a = false;
                                tz9Var4.a = false;
                            } else {
                                tz9Var3.a = false;
                            }
                            g0aVar3.g(true);
                            g0aVar3.e();
                            g0aVar3.O.a(g0aVar3);
                        }
                        wz9 wz9Var3 = g0aVar3.f;
                        if (wz9Var3 != null) {
                            wz9Var3.a();
                            break;
                        }
                        break;
                }
            }
        });
        a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !g0aVar.P.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, k96.M0(2131745096, null), false, g0aVar.s);
        if (g0aVar.P.a) {
            c2.setAlpha(0.5f);
        }
        c2.setOnClickListener(new View.OnClickListener(this) { // from class: vz9
            public final /* synthetic */ wz9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                wz9 wz9Var = this.b;
                switch (b3) {
                    case 0:
                        g0a g0aVar2 = wz9Var.c.y;
                        tz9 tz9Var = g0aVar2.P;
                        if (!tz9Var.a) {
                            tz9 tz9Var2 = g0aVar2.N;
                            if (tz9Var2 != null) {
                                tz9Var.a = true;
                                tz9Var2.a = true;
                            } else {
                                tz9Var.a = true;
                            }
                            g0aVar2.g(true);
                            g0aVar2.e();
                            g0aVar2.O.a(g0aVar2);
                        }
                        wz9 wz9Var2 = g0aVar2.f;
                        if (wz9Var2 != null) {
                            wz9Var2.a();
                            break;
                        }
                        break;
                    default:
                        g0a g0aVar3 = wz9Var.c.y;
                        tz9 tz9Var3 = g0aVar3.P;
                        if (tz9Var3.a) {
                            tz9 tz9Var4 = g0aVar3.N;
                            if (tz9Var4 != null) {
                                tz9Var3.a = false;
                                tz9Var4.a = false;
                            } else {
                                tz9Var3.a = false;
                            }
                            g0aVar3.g(true);
                            g0aVar3.e();
                            g0aVar3.O.a(g0aVar3);
                        }
                        wz9 wz9Var3 = g0aVar3.f;
                        if (wz9Var3 != null) {
                            wz9Var3.a();
                            break;
                        }
                        break;
                }
            }
        });
        View j8Var = new j8(bkb.G8, g0aVar.s, xz9Var.getContext());
        j8Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var, nme.o(-1, 8));
        String M0 = k96.M0(z ? 2131744262 : 2131744205, null);
        f53 f53Var = g0aVar.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        zkb.X(textView, bkb.i5, f53Var);
        textView.setPadding(gl.L(13.0f), gl.L(8.0f), gl.L(13.0f), gl.L(8.0f));
        textView.setText(M0);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(gl.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, nme.o(-1, -2));
    }
}
