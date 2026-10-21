package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class wa1 extends org.telegram.ui.Components.im0 {
    public final Context c;
    public org.telegram.ui.ActionBar.g6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public wa1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.im0
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
        ma1 ma1Var = (ma1) view;
        org.telegram.ui.ActionBar.g6 g6Var2 = this.d;
        int i11 = ma1.c;
        ma1Var.getClass();
        if (g6Var2.W >= 8) {
            ma1Var.b = new int[]{g6Var2.l(6), g6Var2.l(4), g6Var2.l(7), g6Var2.l(2), g6Var2.l(0), g6Var2.l(5), g6Var2.l(3)};
        } else {
            ma1Var.b = new int[7];
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.tl0(new ma1(context)) : new org.telegram.ui.Components.tl0(new ThemeActivity.InnerAccentView(context));
    }
}
