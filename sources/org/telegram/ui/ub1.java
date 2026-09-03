package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ub1 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public ub1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == h() - 1 ? 1 : 0;
    }

    @Override // f2.p0
    public final void l() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.A0();
        this.e = new ArrayList(this.d.Y);
        super.l();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.a;
        int j10 = j(i10);
        if (j10 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e.get(i10);
            innerAccentView.d = j6Var;
            innerAccentView.e = i6Var;
            innerAccentView.a(false);
            return;
        }
        if (j10 != 1) {
            return;
        }
        kb1 kb1Var = (kb1) view;
        org.telegram.ui.ActionBar.j6 j6Var2 = this.d;
        int i11 = kb1.c;
        kb1Var.getClass();
        if (j6Var2.T >= 8) {
            kb1Var.b = new int[]{j6Var2.l(6), j6Var2.l(4), j6Var2.l(7), j6Var2.l(2), j6Var2.l(0), j6Var2.l(5), j6Var2.l(3)};
        } else {
            kb1Var.b = new int[7];
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.el0(new kb1(context)) : new org.telegram.ui.Components.el0(new ThemeActivity.InnerAccentView(context));
    }
}
