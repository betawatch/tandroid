package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;

    public /* synthetic */ tq(vr vrVar, int i10) {
        this.a = i10;
        this.b = vrVar;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        vr vrVar = this.b;
        if (vrVar.getParentActivity() != null) {
            s4.h0 adapter = vrVar.c.getAdapter();
            rr rrVar = vrVar.a;
            if (adapter == rrVar) {
                return vrVar.h0(rrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        vr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.u0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        vr.U(this.b, j3);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
