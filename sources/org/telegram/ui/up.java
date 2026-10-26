package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class up extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ vp d;

    public up(vp vpVar, Context context) {
        this.d = vpVar;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        vp vpVar = this.d;
        return (!vpVar.d.isEmpty() ? vpVar.n.size() + 1 : 0) + 2;
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        View view = e1Var.a;
        int j10 = j(i10);
        vp vpVar = this.d;
        if (j10 != 0) {
            if (j10 == 1) {
                ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) vpVar.n.get(i10 - 3);
                boolean contains = vpVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.r2) vpVar).currentAccount;
                ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.B6, null);
        int i12 = vpVar.s;
        if (i12 == 1) {
            i9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            i9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            i9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.vl0(new org.telegram.ui.Cells.i9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.vl0(new org.telegram.ui.Cells.q4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.vl0(new org.telegram.ui.Cells.x(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        vp vpVar = this.d;
        AndroidUtilities.removeFromParent(vpVar.r);
        frameLayout.addView(vpVar.r);
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.vl0(frameLayout);
    }
}
