package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w50 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ z50 n;

    public w50(z50 z50Var, Context context) {
        this.n = z50Var;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.oj0
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
        z50 z50Var = this.n;
        w50 w50Var = z50Var.s;
        if (w50Var == null || z50Var.y) {
            return;
        }
        z50Var.r.setVisibility(w50Var.b() == 2 ? 0 : 4);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.messenger.d5 d5Var;
        CharSequence charSequence;
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) d1Var.a;
            boolean z9 = this.h;
            z50 z50Var = this.n;
            if (z9) {
                d5Var = (org.telegram.messenger.d5) this.d.get(i7);
                charSequence = (CharSequence) this.e.get(i7);
            } else {
                d5Var = (org.telegram.messenger.d5) z50Var.w.get(i7 - 2);
                charSequence = null;
            }
            q4Var.a(d5Var, charSequence);
            boolean containsKey = z50Var.D.containsKey(d5Var.b);
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
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            m8Var.g(i10, i10);
            m8Var.u(org.telegram.messenger.id.M0(2131745430, null), "", false, R.drawable.msg_shareout, false);
            view = m8Var;
        } else {
            view = i7 == 2 ? new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.q4(context, true);
        }
        return new org.telegram.ui.Components.xi0(view);
    }
}
