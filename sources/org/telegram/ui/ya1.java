package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ya1 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public org.telegram.ui.ActionBar.g6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public ya1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 == h() - 1 ? 1 : 0;
    }

    @Override // s4.g0
    public final void l() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.h6.J : org.telegram.ui.ActionBar.h6.B0();
        this.e = new ArrayList(this.d.b0);
        super.l();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        int j10 = j(i10);
        if (j10 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e.get(i10);
            innerAccentView.d = g6Var;
            innerAccentView.e = f6Var;
            innerAccentView.a(false);
            return;
        }
        if (j10 != 1) {
            return;
        }
        oa1 oa1Var = (oa1) view;
        org.telegram.ui.ActionBar.g6 g6Var2 = this.d;
        int i11 = oa1.c;
        oa1Var.getClass();
        if (g6Var2.W >= 8) {
            oa1Var.b = new int[]{g6Var2.l(6), g6Var2.l(4), g6Var2.l(7), g6Var2.l(2), g6Var2.l(0), g6Var2.l(5), g6Var2.l(3)};
        } else {
            oa1Var.b = new int[7];
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.sl0(new oa1(context)) : new org.telegram.ui.Components.sl0(new ThemeActivity.InnerAccentView(context));
    }
}
