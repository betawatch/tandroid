package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x50 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ a60 n;

    public x50(a60 a60Var, Context context) {
        this.n = a60Var;
        this.c = context;
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.r4) {
            ((org.telegram.ui.Cells.r4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f != 2;
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

    @Override // v4.i0
    public final int b() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (this.h) {
            return 0;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7 == 1 ? 2 : 0;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        a60 a60Var = this.n;
        x50 x50Var = a60Var.s;
        if (x50Var == null || a60Var.y) {
            return;
        }
        a60Var.r.setVisibility(x50Var.b() == 2 ? 0 : 4);
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.messenger.f5 f5Var;
        CharSequence charSequence;
        if (f1Var.f == 0) {
            org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) f1Var.a;
            boolean z10 = this.h;
            a60 a60Var = this.n;
            if (z10) {
                f5Var = (org.telegram.messenger.f5) this.d.get(i7);
                charSequence = (CharSequence) this.e.get(i7);
            } else {
                f5Var = (org.telegram.messenger.f5) a60Var.w.get(i7 - 2);
                charSequence = null;
            }
            r4Var.a(f5Var, charSequence);
            boolean containsKey = a60Var.E.containsKey(f5Var.b);
            org.telegram.ui.Components.op opVar = r4Var.e;
            if (opVar != null) {
                opVar.a(containsKey, false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            n8Var.g(i10, i10);
            n8Var.u(org.telegram.messenger.hd.N0(2131745231, null), "", false, R.drawable.msg_shareout, false);
            view = n8Var;
        } else {
            view = i7 == 2 ? new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null) : new org.telegram.ui.Cells.r4(context, true);
        }
        return new org.telegram.ui.Components.mj0(view);
    }
}
