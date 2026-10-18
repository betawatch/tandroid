package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class qp extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ rp d;

    public qp(rp rpVar, Context context) {
        this.d = rpVar;
        this.c = context;
    }

    @Override // s4.g0
    public final int h() {
        rp rpVar = this.d;
        ArrayList arrayList = rpVar.r;
        if (rpVar.G) {
            return (rpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (rpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (this.d.G) {
            if (i10 == 0) {
                return 0;
            }
            return i10 == 1 ? 1 : 2;
        }
        if (i10 == 0) {
            return 3;
        }
        if (i10 == 1) {
            return 0;
        }
        return i10 == 2 ? 1 : 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        View view = b1Var.a;
        int j10 = j(i10);
        rp rpVar = this.d;
        if (j10 != 0) {
            if (j10 == 1) {
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) rpVar.r.get(i10 - (rpVar.G ? 2 : 3));
                boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.n2) rpVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        d9Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
        if (rpVar.G) {
            d9Var.setText(ChatObject.isChannelAndNotMegaGroup(rpVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = rpVar.v;
        if (i12 == 1) {
            d9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            d9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            d9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.d9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.l4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        rp rpVar = this.d;
        if (rpVar.s.getParent() != null) {
            ((ViewGroup) rpVar.s.getParent()).removeView(rpVar.s);
        }
        frameLayout.addView(rpVar.s);
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.sl0(frameLayout);
    }
}
