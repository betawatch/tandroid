package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
