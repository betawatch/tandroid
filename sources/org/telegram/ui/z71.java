package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z71 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public org.telegram.ui.ActionBar.s6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public z71(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 == b() - 1 ? 1 : 0;
    }

    @Override // s4.g0
    public final void f() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.t6.J : org.telegram.ui.ActionBar.t6.D0();
        this.e = new ArrayList(this.d.b0);
        super.f();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        int d = d(i10);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.s6 s6Var = this.d;
            org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) this.e.get(i10);
            innerAccentView.d = s6Var;
            innerAccentView.e = r6Var;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        q71 q71Var = (q71) view;
        org.telegram.ui.ActionBar.s6 s6Var2 = this.d;
        int i11 = q71.c;
        q71Var.getClass();
        if (s6Var2.W >= 8) {
            q71Var.b = new int[]{s6Var2.l(6), s6Var2.l(4), s6Var2.l(7), s6Var2.l(2), s6Var2.l(0), s6Var2.l(5), s6Var2.l(3)};
        } else {
            q71Var.b = new int[7];
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.ck0(new q71(context)) : new org.telegram.ui.Components.ck0(new ThemeActivity.InnerAccentView(context));
    }
}
