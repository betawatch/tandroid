package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp implements org.telegram.messenger.pr, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq b;

    public /* synthetic */ qp(rq rqVar, int i7) {
        this.a = i7;
        this.b = rqVar;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        rq rqVar = this.b;
        if (rqVar.getParentActivity() != null) {
            v4.i0 adapter = rqVar.c.getAdapter();
            nq nqVar = rqVar.a;
            if (adapter == nqVar) {
                return rqVar.m0(nqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        rq.a0(this.b, view, i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.z0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.pr
    public void run(long j3) {
        rq.Z(this.b, j3);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
