package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wo extends u4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ xo d;

    public wo(xo xoVar, Context context) {
        this.d = xoVar;
        this.c = context;
    }

    @Override // u4.h0
    public final int b() {
        xo xoVar = this.d;
        return (!xoVar.d.isEmpty() ? xoVar.n.size() + 1 : 0) + 2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 3;
        }
        if (i3 == 1) {
            return 0;
        }
        return i3 == 2 ? 1 : 2;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        View view = d1Var.a;
        int d = d(i3);
        xo xoVar = this.d;
        if (d != 0) {
            if (d == 1) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131747830, null));
                return;
            } else {
                if (d != 2) {
                    return;
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) xoVar.n.get(i3 - 3);
                boolean contains = xoVar.d.contains(tL_availableReaction.reaction);
                i10 = ((org.telegram.ui.ActionBar.d2) xoVar).currentAccount;
                ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                return;
            }
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
        int i11 = xoVar.s;
        if (i11 == 1) {
            y8Var.setText(org.telegram.messenger.bd.M0(2131751148, null));
        } else if (i11 == 0) {
            y8Var.setText(org.telegram.messenger.bd.M0(2131751160, null));
        } else if (i11 == 2) {
            y8Var.setText(org.telegram.messenger.bd.M0(2131751430, null));
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.c;
        if (i3 == 0) {
            return new org.telegram.ui.Components.bj0(new org.telegram.ui.Cells.y8(context));
        }
        if (i3 == 1) {
            return new org.telegram.ui.Components.bj0(new org.telegram.ui.Cells.n4(context, 23));
        }
        if (i3 != 3) {
            return new org.telegram.ui.Components.bj0(new org.telegram.ui.Cells.x(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        xo xoVar = this.d;
        org.telegram.messenger.g0.E2(xoVar.r);
        frameLayout.addView(xoVar.r);
        frameLayout.setLayoutParams(new u4.p0(-1, -2));
        return new org.telegram.ui.Components.bj0(frameLayout);
    }
}
