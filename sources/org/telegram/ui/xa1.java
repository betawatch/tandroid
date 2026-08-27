package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xa1 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public org.telegram.ui.ActionBar.f6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public xa1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10 == h() - 1 ? 1 : 0;
    }

    @Override // f2.q0
    public final void l() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0();
        this.e = new ArrayList(this.d.X);
        super.l();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.a;
        int j10 = j(i10);
        if (j10 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e.get(i10);
            innerAccentView.d = f6Var;
            innerAccentView.e = e6Var;
            innerAccentView.a(false);
            return;
        }
        if (j10 != 1) {
            return;
        }
        na1 na1Var = (na1) view;
        org.telegram.ui.ActionBar.f6 f6Var2 = this.d;
        int i11 = na1.c;
        na1Var.getClass();
        if (f6Var2.S >= 8) {
            na1Var.b = new int[]{f6Var2.l(6), f6Var2.l(4), f6Var2.l(7), f6Var2.l(2), f6Var2.l(0), f6Var2.l(5), f6Var2.l(3)};
        } else {
            na1Var.b = new int[7];
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.lk0(new na1(context)) : new org.telegram.ui.Components.lk0(new ThemeActivity.InnerAccentView(context));
    }
}
