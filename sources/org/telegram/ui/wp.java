package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wp extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ xp d;

    public wp(xp xpVar, Context context) {
        this.d = xpVar;
        this.c = context;
    }

    @Override // s4.g0
    public final int b() {
        xp xpVar = this.d;
        return (!xpVar.d.isEmpty() ? xpVar.n.size() + 1 : 0) + 2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 3;
        }
        if (i10 == 1) {
            return 0;
        }
        return i10 == 2 ? 1 : 2;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        int d = d(i10);
        xp xpVar = this.d;
        if (d != 0) {
            if (d == 1) {
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(2131747838, null));
                return;
            } else {
                if (d != 2) {
                    return;
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) xpVar.n.get(i10 - 3);
                boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.k2) xpVar).currentAccount;
                ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.B6, null);
        int i12 = xpVar.s;
        if (i12 == 1) {
            b9Var.setText(org.telegram.messenger.cd.L0(2131751148, null));
        } else if (i12 == 0) {
            b9Var.setText(org.telegram.messenger.cd.L0(2131751160, null));
        } else if (i12 == 2) {
            b9Var.setText(org.telegram.messenger.cd.L0(2131751430, null));
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.ck0(new org.telegram.ui.Cells.b9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.ck0(new org.telegram.ui.Cells.p4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.ck0(new org.telegram.ui.Cells.x(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        xp xpVar = this.d;
        org.telegram.messenger.i0.E2(xpVar.r);
        frameLayout.addView(xpVar.r);
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.ck0(frameLayout);
    }
}
