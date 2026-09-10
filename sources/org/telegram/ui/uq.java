package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr b;

    public /* synthetic */ uq(wr wrVar, int i10) {
        this.a = i10;
        this.b = wrVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        wr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        wr wrVar = this.b;
        if (wrVar.getParentActivity() != null) {
            s4.h0 adapter = wrVar.c.getAdapter();
            sr srVar = wrVar.a;
            if (adapter == srVar) {
                return wrVar.h0(srVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
        wr.U(this.b, j3);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
