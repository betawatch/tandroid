package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x51 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public x51(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 == b() - 1 ? 1 : 0;
    }

    @Override // u4.h0
    public final void f() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0();
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.a;
        int d = d(i3);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e.get(i3);
            innerAccentView.d = j6Var;
            innerAccentView.e = g6Var;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        o51 o51Var = (o51) view;
        org.telegram.ui.ActionBar.j6 j6Var2 = this.d;
        int i10 = o51.c;
        o51Var.getClass();
        if (j6Var2.X >= 8) {
            o51Var.b = new int[]{j6Var2.l(6), j6Var2.l(4), j6Var2.l(7), j6Var2.l(2), j6Var2.l(0), j6Var2.l(5), j6Var2.l(3)};
        } else {
            o51Var.b = new int[7];
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.c;
        return i3 != 0 ? new org.telegram.ui.Components.bj0(new o51(context)) : new org.telegram.ui.Components.bj0(new ThemeActivity.InnerAccentView(context));
    }
}
