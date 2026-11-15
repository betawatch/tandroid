package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v50 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ y50 n;

    public v50(y50 y50Var, Context context) {
        this.n = y50Var;
        this.c = context;
    }

    @Override // v4.h0
    public final void A(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f != 2;
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

    @Override // v4.h0
    public final int b() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (this.h) {
            return 0;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7 == 1 ? 2 : 0;
    }

    @Override // v4.h0
    public final void f() {
        super.f();
        y50 y50Var = this.n;
        v50 v50Var = y50Var.s;
        if (v50Var == null || y50Var.y) {
            return;
        }
        y50Var.r.setVisibility(v50Var.b() == 2 ? 0 : 4);
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.messenger.d5 d5Var;
        CharSequence charSequence;
        if (e1Var.f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) e1Var.a;
            boolean z10 = this.h;
            y50 y50Var = this.n;
            if (z10) {
                d5Var = (org.telegram.messenger.d5) this.d.get(i7);
                charSequence = (CharSequence) this.e.get(i7);
            } else {
                d5Var = (org.telegram.messenger.d5) y50Var.w.get(i7 - 2);
                charSequence = null;
            }
            q4Var.a(d5Var, charSequence);
            boolean containsKey = y50Var.E.containsKey(d5Var.b);
            org.telegram.ui.Components.fp fpVar = q4Var.e;
            if (fpVar != null) {
                fpVar.a(containsKey, false);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            l8Var.g(i10, i10);
            l8Var.u(org.telegram.messenger.hd.M0(2131745427, null), "", false, R.drawable.msg_shareout, false);
            view = l8Var;
        } else {
            view = i7 == 2 ? new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null) : new org.telegram.ui.Cells.q4(context, true);
        }
        return new org.telegram.ui.Components.cj0(view);
    }
}
