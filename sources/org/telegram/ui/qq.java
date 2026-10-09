package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.fm0, org.telegram.ui.Components.gm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;

    public /* synthetic */ qq(tr trVar, int i10) {
        this.a = i10;
        this.b = trVar;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        tr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        tr trVar = this.b;
        if (trVar.getParentActivity() != null) {
            s4.i0 adapter = trVar.c.getAdapter();
            pr prVar = trVar.a;
            if (adapter == prVar) {
                return trVar.h0(prVar.E(i10), false, view);
            }
        }
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
        tr.U(this.b, j3);
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }
}
