package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v7 implements di.l9, org.telegram.messenger.qr {
    public final /* synthetic */ h8 a;

    public /* synthetic */ v7(h8 h8Var) {
        this.a = h8Var;
    }

    @Override // di.l9
    public void e(long j3, int i7, di.l3 l3Var) {
        h8 h8Var = this.a;
        if (h8Var.b == null) {
            l3Var.run();
        }
        h8Var.b.post(l3Var);
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        h8 h8Var = this.a;
        h8Var.finishFragment();
        q4Var = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
            if (q4Var2.getFragmentStack().size() >= 2) {
                q4Var3 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
                List fragmentStack = q4Var3.getFragmentStack();
                q4Var4 = ((org.telegram.ui.ActionBar.f2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var4.getFragmentStack().size() - 2);
                if (f2Var instanceof an) {
                    ((an) f2Var).h8(h8Var.P, h8Var.Q + 86400, z9);
                    return;
                }
                return;
            }
        }
        an anVar = h8Var.N;
        if (anVar != null) {
            anVar.h8(h8Var.P, h8Var.Q + 86400, z9);
        }
    }

    @Override // di.l9
    public boolean o(long j3, int i7, int i10, int i11, di.m9 m9Var) {
        h8 h8Var = this.a;
        if (h8Var.b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= h8Var.b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.b.getChildAt(i12);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < e8Var.n.size(); i13++) {
                            ArrayList arrayList = ((f8) e8Var.n.valueAt(i13)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = e8Var.n.keyAt(i13);
                                h8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    m9Var.c = imageReceiver;
                                    if (h8Var.i0 == null) {
                                        h8Var.i0 = new w0(this, 11);
                                    }
                                    m9Var.e = h8Var.i0;
                                    m9Var.a = e8Var;
                                    m9Var.g = h8Var.fragmentView;
                                    m9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    m9Var.i = h8Var.fragmentView.getBottom();
                                    m9Var.b = null;
                                    return true;
                                }
                            }
                        }
                    }
                }
                i12++;
            }
        }
        return false;
    }

    @Override // di.l9
    public /* synthetic */ void b(boolean z9) {
    }
}
