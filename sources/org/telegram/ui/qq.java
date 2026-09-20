package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr b;

    public /* synthetic */ qq(sr srVar, int i10) {
        this.a = i10;
        this.b = srVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        sr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        sr srVar = this.b;
        if (srVar.getParentActivity() != null) {
            s4.h0 adapter = srVar.c.getAdapter();
            or orVar = srVar.a;
            if (adapter == orVar) {
                return srVar.h0(orVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        sr.U(this.b, j3);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
