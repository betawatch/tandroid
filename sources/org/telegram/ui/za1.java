package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class za1 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public org.telegram.ui.ActionBar.e6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public za1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 == h() - 1 ? 1 : 0;
    }

    @Override // f2.r0
    public final void l() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.f6.J : org.telegram.ui.ActionBar.f6.A0();
        this.e = new ArrayList(this.d.X);
        super.l();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.a;
        int j10 = j(i9);
        if (j10 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e.get(i9);
            innerAccentView.d = e6Var;
            innerAccentView.e = d6Var;
            innerAccentView.a(false);
            return;
        }
        if (j10 != 1) {
            return;
        }
        pa1 pa1Var = (pa1) view;
        org.telegram.ui.ActionBar.e6 e6Var2 = this.d;
        int i10 = pa1.c;
        pa1Var.getClass();
        if (e6Var2.S >= 8) {
            pa1Var.b = new int[]{e6Var2.l(6), e6Var2.l(4), e6Var2.l(7), e6Var2.l(2), e6Var2.l(0), e6Var2.l(5), e6Var2.l(3)};
        } else {
            pa1Var.b = new int[7];
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        return i9 != 0 ? new org.telegram.ui.Components.ik0(new pa1(context)) : new org.telegram.ui.Components.ik0(new ThemeActivity.InnerAccentView(context));
    }
}
