package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vb1 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public org.telegram.ui.ActionBar.i6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public vb1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 == h() - 1 ? 1 : 0;
    }

    @Override // f2.o0
    public final void l() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0();
        this.e = new ArrayList(this.d.Y);
        super.l();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.a;
        int j10 = j(i10);
        if (j10 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.e.get(i10);
            innerAccentView.d = i6Var;
            innerAccentView.e = h6Var;
            innerAccentView.a(false);
            return;
        }
        if (j10 != 1) {
            return;
        }
        lb1 lb1Var = (lb1) view;
        org.telegram.ui.ActionBar.i6 i6Var2 = this.d;
        int i11 = lb1.c;
        lb1Var.getClass();
        if (i6Var2.T >= 8) {
            lb1Var.b = new int[]{i6Var2.l(6), i6Var2.l(4), i6Var2.l(7), i6Var2.l(2), i6Var2.l(0), i6Var2.l(5), i6Var2.l(3)};
        } else {
            lb1Var.b = new int[7];
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.dl0(new lb1(context)) : new org.telegram.ui.Components.dl0(new ThemeActivity.InnerAccentView(context));
    }
}
