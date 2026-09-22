package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ sq(ur urVar, int i10) {
        this.a = i10;
        this.b = urVar;
    }

    @Override // org.telegram.ui.Components.al0
    public void c(float f7, float f10, int i10, View view) {
        ur.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        ur urVar = this.b;
        if (urVar.getParentActivity() != null) {
            s4.h0 adapter = urVar.c.getAdapter();
            qr qrVar = urVar.a;
            if (adapter == qrVar) {
                return urVar.h0(qrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        ur.U(this.b, j3);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
