package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;

    public /* synthetic */ wq(yr yrVar, int i10) {
        this.a = i10;
        this.b = yrVar;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        yr yrVar = this.b;
        if (yrVar.getParentActivity() != null) {
            s4.g0 adapter = yrVar.c.getAdapter();
            ur urVar = yrVar.a;
            if (adapter == urVar) {
                return yrVar.h0(urVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        yr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
    public void run(long j10) {
        yr.U(this.b, j10);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
