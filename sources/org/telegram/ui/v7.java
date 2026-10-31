package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v7 implements th.k7, org.telegram.messenger.zr {
    public final /* synthetic */ h8 a;

    public /* synthetic */ v7(h8 h8Var) {
        this.a = h8Var;
    }

    @Override // th.k7
    public void d(long j10, int i10, th.i2 i2Var) {
        h8 h8Var = this.a;
        if (h8Var.b == null) {
            i2Var.run();
        }
        h8Var.b.post(i2Var);
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        org.telegram.ui.ActionBar.z4 z4Var4;
        h8 h8Var = this.a;
        h8Var.finishFragment();
        z4Var = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
            if (z4Var2.getFragmentStack().size() >= 2) {
                z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
                List fragmentStack = z4Var3.getFragmentStack();
                z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var4.getFragmentStack().size() - 2);
                if (k2Var instanceof un) {
                    ((un) k2Var).a8(h8Var.P, h8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        un unVar = h8Var.N;
        if (unVar != null) {
            unVar.a8(h8Var.P, h8Var.Q + 86400, z10);
        }
    }

    @Override // th.k7
    public boolean v(long j10, int i10, int i11, int i12, th.l7 l7Var) {
        h8 h8Var = this.a;
        if (h8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= h8Var.b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.b.getChildAt(i13);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < e8Var.n.size(); i14++) {
                            ArrayList arrayList = ((f8) e8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = e8Var.n.keyAt(i14);
                                h8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    l7Var.c = imageReceiver;
                                    if (h8Var.i0 == null) {
                                        h8Var.i0 = new y0(this, 11);
                                    }
                                    l7Var.e = h8Var.i0;
                                    l7Var.a = e8Var;
                                    l7Var.g = h8Var.fragmentView;
                                    l7Var.h = org.telegram.messenger.i0.L(36.0f);
                                    l7Var.i = h8Var.fragmentView.getBottom();
                                    l7Var.b = null;
                                    return true;
                                }
                            }
                        }
                    }
                }
                i13++;
            }
        }
        return false;
    }

    @Override // th.k7
    public /* synthetic */ void c(boolean z10) {
    }
}
