package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xg0 extends s4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ xg0(KeyEvent.Callback callback, Context context, Object obj, int i10) {
        this.c = i10;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override // s4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((kh0) this.f).M.size();
            default:
                return vh.r.a().size();
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        switch (this.c) {
            case 0:
                kh0 kh0Var = (kh0) this.f;
                ArrayList arrayList = kh0Var.M;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get((b() - 1) - i10);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) c1Var.a;
                org.telegram.messenger.ej k10 = kh0Var.k(jjVar);
                int i11 = 0;
                q1Var.setInvalidatesParent(k10 != null);
                q1Var.s3(jjVar, k10, false, false, false, false);
                if (!kh0Var.O.i() && arrayList.size() >= 10) {
                    i11 = arrayList.size() % 10;
                }
                if (i10 == i11 && !jjVar.n5()) {
                    kh0Var.P = q1Var;
                    Point point = org.telegram.messenger.i0.q;
                    q1Var.u3(point.x, point.y);
                    kh0Var.Q = jjVar.f1();
                    break;
                }
                break;
            default:
                vh.s sVar = (vh.s) c1Var.a;
                vh.r rVar = (vh.r) vh.r.a().get(i10);
                boolean z10 = i10 == sVar.s;
                sVar.setDrawable(new org.telegram.ui.Components.ob0(rVar, false));
                sVar.b(rVar.equals(((vh.t) this.f).b), z10);
                sVar.s = i10;
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                kh0 kh0Var = (kh0) this.f;
                jh0 jh0Var = new jh0(kh0Var, this.d, kh0Var.c, (org.telegram.ui.ActionBar.p6) this.e);
                jh0Var.setDelegate(new jb.b(15));
                return new org.telegram.ui.Components.ck0(jh0Var);
            default:
                vh.s sVar = new vh.s(this.d);
                sVar.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(46.0f), org.telegram.messenger.i0.L(56.0f)));
                sVar.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
                return new org.telegram.ui.Components.ck0(sVar);
        }
    }

    @Override // s4.g0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 1:
                vh.s sVar = (vh.s) c1Var.a;
                ((vh.z1) this.e).a(sVar);
                int i10 = sVar.s;
                if (i10 >= 0 && i10 < vh.r.a().size()) {
                    vh.r rVar = (vh.r) vh.r.a().get(sVar.s);
                    sVar.setDrawable(new org.telegram.ui.Components.ob0(rVar, false));
                    sVar.b(rVar.equals(((vh.t) this.f).b), false);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public void z(s4.c1 c1Var) {
        switch (this.c) {
            case 1:
                vh.z1 z1Var = (vh.z1) this.e;
                z1Var.d.remove((vh.s) c1Var.a);
                break;
        }
    }
}
