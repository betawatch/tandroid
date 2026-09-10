package zh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p3 extends ds {
    public final /* synthetic */ q3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(q3 q3Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = q3Var;
    }

    @Override // org.telegram.ui.Components.ds
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        q3 q3Var = this.c;
        z3 z3Var = q3Var.x;
        y3 y3Var = z3Var.E;
        boolean z10 = y3Var != null && y3Var.f;
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : z3Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, z3Var.s);
        if (!z3Var.O.a) {
            c10.setAlpha(0.5f);
        }
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: zh.o3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        z3 z3Var2 = this.b.c.x;
                        m3 m3Var = z3Var2.O;
                        if (!m3Var.a) {
                            m3 m3Var2 = z3Var2.M;
                            if (m3Var2 != null) {
                                m3Var.a = true;
                                m3Var2.a = true;
                            } else {
                                m3Var.a = true;
                            }
                            z3Var2.h(true);
                            z3.b(z3Var2);
                            z3Var2.N.accept(z3Var2);
                        }
                        p3 p3Var = z3Var2.f;
                        if (p3Var != null) {
                            p3Var.a();
                            break;
                        }
                        break;
                    default:
                        z3 z3Var3 = this.b.c.x;
                        m3 m3Var3 = z3Var3.O;
                        if (m3Var3.a) {
                            m3 m3Var4 = z3Var3.M;
                            if (m3Var4 != null) {
                                m3Var3.a = false;
                                m3Var4.a = false;
                            } else {
                                m3Var3.a = false;
                            }
                            z3Var3.h(true);
                            z3.b(z3Var3);
                            z3Var3.N.accept(z3Var3);
                        }
                        p3 p3Var2 = z3Var3.f;
                        if (p3Var2 != null) {
                            p3Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z3Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, z3Var.s);
        if (z3Var.O.a) {
            c11.setAlpha(0.5f);
        }
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: zh.o3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        z3 z3Var2 = this.b.c.x;
                        m3 m3Var = z3Var2.O;
                        if (!m3Var.a) {
                            m3 m3Var2 = z3Var2.M;
                            if (m3Var2 != null) {
                                m3Var.a = true;
                                m3Var2.a = true;
                            } else {
                                m3Var.a = true;
                            }
                            z3Var2.h(true);
                            z3.b(z3Var2);
                            z3Var2.N.accept(z3Var2);
                        }
                        p3 p3Var = z3Var2.f;
                        if (p3Var != null) {
                            p3Var.a();
                            break;
                        }
                        break;
                    default:
                        z3 z3Var3 = this.b.c.x;
                        m3 m3Var3 = z3Var3.O;
                        if (m3Var3.a) {
                            m3 m3Var4 = z3Var3.M;
                            if (m3Var4 != null) {
                                m3Var3.a = false;
                                m3Var4.a = false;
                            } else {
                                m3Var3.a = false;
                            }
                            z3Var3.h(true);
                            z3.b(z3Var3);
                            z3Var3.N.accept(z3Var3);
                        }
                        p3 p3Var2 = z3Var3.f;
                        if (p3Var2 != null) {
                            p3Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View m1Var = new org.telegram.ui.ActionBar.m1(q3Var.getContext(), org.telegram.ui.ActionBar.j6.H8, z3Var.s);
        m1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, w7.a6.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = z3Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.a6.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.ds
    public final void c() {
    }
}
