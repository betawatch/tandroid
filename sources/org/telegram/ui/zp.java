package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zp extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ aq d;

    public zp(aq aqVar, Context context) {
        this.d = aqVar;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        aq aqVar = this.d;
        return (!aqVar.d.isEmpty() ? aqVar.n.size() + 1 : 0) + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 3;
        }
        if (i10 == 1) {
            return 0;
        }
        return i10 == 2 ? 1 : 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        int j3 = j(i10);
        aq aqVar = this.d;
        if (j3 != 0) {
            if (j3 == 1) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                return;
            } else {
                if (j3 != 2) {
                    return;
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) aqVar.n.get(i10 - 3);
                boolean contains = aqVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.n2) aqVar).currentAccount;
                ((org.telegram.ui.Cells.y) view).a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B6, false));
        int i12 = aqVar.s;
        if (i12 == 1) {
            e9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            e9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            e9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.il0(new org.telegram.ui.Cells.e9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.il0(new org.telegram.ui.Cells.m4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.il0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        aq aqVar = this.d;
        AndroidUtilities.removeFromParent(aqVar.r);
        frameLayout.addView(aqVar.r);
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.il0(frameLayout);
    }
}
