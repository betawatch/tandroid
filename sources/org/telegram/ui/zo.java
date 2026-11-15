package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zo extends v4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ap d;

    public zo(ap apVar, Context context) {
        this.d = apVar;
        this.c = context;
    }

    @Override // v4.h0
    public final int b() {
        ap apVar = this.d;
        return (!apVar.d.isEmpty() ? apVar.n.size() + 1 : 0) + 2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 3;
        }
        if (i7 == 1) {
            return 0;
        }
        return i7 == 2 ? 1 : 2;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        View view = e1Var.a;
        int d = d(i7);
        ap apVar = this.d;
        if (d != 0) {
            if (d == 1) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131747822, null));
                return;
            } else {
                if (d != 2) {
                    return;
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) apVar.n.get(i7 - 3);
                boolean contains = apVar.d.contains(tL_availableReaction.reaction);
                i10 = ((org.telegram.ui.ActionBar.e2) apVar).currentAccount;
                ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                return;
            }
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        org.telegram.ui.ActionBar.q6.U(y8Var.getTextView(), org.telegram.ui.ActionBar.j6.B6, null);
        int i11 = apVar.s;
        if (i11 == 1) {
            y8Var.setText(org.telegram.messenger.hd.M0(2131751147, null));
        } else if (i11 == 0) {
            y8Var.setText(org.telegram.messenger.hd.M0(2131751159, null));
        } else if (i11 == 2) {
            y8Var.setText(org.telegram.messenger.hd.M0(2131751429, null));
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        if (i7 == 0) {
            return new org.telegram.ui.Components.cj0(new org.telegram.ui.Cells.y8(context));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.cj0(new org.telegram.ui.Cells.n4(context, 23));
        }
        if (i7 != 3) {
            return new org.telegram.ui.Components.cj0(new org.telegram.ui.Cells.x(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ap apVar = this.d;
        org.telegram.messenger.g0.E2(apVar.r);
        frameLayout.addView(apVar.r);
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new org.telegram.ui.Components.cj0(frameLayout);
    }
}
