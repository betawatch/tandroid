package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u60 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ x60 n;

    public u60(x60 x60Var, Context context) {
        this.n = x60Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.s4) {
            ((org.telegram.ui.Cells.s4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 2;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new org.telegram.messenger.we(2, this, str), 200L, 300L);
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (this.h) {
            return 0;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 == 1 ? 2 : 0;
    }

    @Override // s4.g0
    public final void f() {
        super.f();
        x60 x60Var = this.n;
        u60 u60Var = x60Var.s;
        if (u60Var == null || x60Var.y) {
            return;
        }
        x60Var.r.setVisibility(u60Var.b() == 2 ? 0 : 4);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.messenger.f5 f5Var;
        CharSequence charSequence;
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.s4 s4Var = (org.telegram.ui.Cells.s4) c1Var.a;
            boolean z10 = this.h;
            x60 x60Var = this.n;
            if (z10) {
                f5Var = (org.telegram.messenger.f5) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                f5Var = (org.telegram.messenger.f5) x60Var.w.get(i10 - 2);
                charSequence = null;
            }
            s4Var.a(f5Var, charSequence);
            boolean containsKey = x60Var.D.containsKey(f5Var.b);
            org.telegram.ui.Components.ep epVar = s4Var.e;
            if (epVar != null) {
                epVar.a(containsKey, false);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            p8Var.g(i11, i11);
            p8Var.u(org.telegram.messenger.dd.L0(2131745445, null), "", false, R.drawable.msg_shareout, false);
            view = p8Var;
        } else {
            view = i10 == 2 ? new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.s4(context, true);
        }
        return new org.telegram.ui.Components.dk0(view);
    }
}
