package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w7 implements ei.n9, org.telegram.messenger.ir {
    public final /* synthetic */ i8 a;

    public /* synthetic */ w7(i8 i8Var) {
        this.a = i8Var;
    }

    @Override // ei.n9
    public boolean j(long j10, int i3, int i10, int i11, ei.o9 o9Var) {
        i8 i8Var = this.a;
        if (i8Var.b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= i8Var.b.getChildCount()) {
                    break;
                }
                View childAt = i8Var.b.getChildAt(i12);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    if (f8Var.n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < f8Var.n.size(); i13++) {
                            ArrayList arrayList = ((g8) f8Var.n.valueAt(i13)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = f8Var.n.keyAt(i13);
                                i8Var.i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) f8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    o9Var.c = imageReceiver;
                                    if (i8Var.j0 == null) {
                                        i8Var.j0 = new x0(this, 11);
                                    }
                                    o9Var.e = i8Var.j0;
                                    o9Var.a = f8Var;
                                    o9Var.g = i8Var.fragmentView;
                                    o9Var.h = org.telegram.messenger.g0.L(36.0f);
                                    o9Var.i = i8Var.fragmentView.getBottom();
                                    o9Var.b = null;
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

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        i8 i8Var = this.a;
        i8Var.finishFragment();
        q4Var = ((org.telegram.ui.ActionBar.d2) i8Var).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) i8Var).parentLayout;
            if (q4Var2.getFragmentStack().size() >= 2) {
                q4Var3 = ((org.telegram.ui.ActionBar.d2) i8Var).parentLayout;
                List fragmentStack = q4Var3.getFragmentStack();
                q4Var4 = ((org.telegram.ui.ActionBar.d2) i8Var).parentLayout;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(q4Var4.getFragmentStack().size() - 2);
                if (d2Var instanceof wm) {
                    ((wm) d2Var).h8(i8Var.Q, i8Var.R + 86400, z10);
                    return;
                }
                return;
            }
        }
        wm wmVar = i8Var.O;
        if (wmVar != null) {
            wmVar.h8(i8Var.Q, i8Var.R + 86400, z10);
        }
    }

    @Override // ei.n9
    public void r(long j10, int i3, ei.o3 o3Var) {
        i8 i8Var = this.a;
        if (i8Var.b == null) {
            o3Var.run();
        }
        i8Var.b.post(o3Var);
    }

    @Override // ei.n9
    public /* synthetic */ void c(boolean z10) {
    }
}
