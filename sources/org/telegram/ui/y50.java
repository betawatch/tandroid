package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y50 extends org.telegram.ui.Components.pj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ b60 n;

    public y50(b60 b60Var, Context context) {
        this.n = b60Var;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f != 2;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new jg.q1(3, this, str), 200L, 300L);
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (this.h) {
            return 0;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7 == 1 ? 2 : 0;
    }

    @Override // v4.g0
    public final void f() {
        super.f();
        b60 b60Var = this.n;
        y50 y50Var = b60Var.s;
        if (y50Var == null || b60Var.y) {
            return;
        }
        b60Var.r.setVisibility(y50Var.b() == 2 ? 0 : 4);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.messenger.d5 d5Var;
        CharSequence charSequence;
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) d1Var.a;
            boolean z9 = this.h;
            b60 b60Var = this.n;
            if (z9) {
                d5Var = (org.telegram.messenger.d5) this.d.get(i7);
                charSequence = (CharSequence) this.e.get(i7);
            } else {
                d5Var = (org.telegram.messenger.d5) b60Var.w.get(i7 - 2);
                charSequence = null;
            }
            q4Var.a(d5Var, charSequence);
            boolean containsKey = b60Var.D.containsKey(d5Var.b);
            org.telegram.ui.Components.wo woVar = q4Var.e;
            if (woVar != null) {
                woVar.a(containsKey, false);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            int i10 = org.telegram.ui.ActionBar.l6.G6;
            m8Var.g(i10, i10);
            m8Var.u(org.telegram.messenger.id.M0(2131745427, null), "", false, R.drawable.msg_shareout, false);
            view = m8Var;
        } else {
            view = i7 == 2 ? new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.q4(context, true);
        }
        return new org.telegram.ui.Components.yi0(view);
    }
}
