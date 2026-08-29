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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qp extends f2.p0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ rp d;

    public qp(rp rpVar, Context context) {
        this.d = rpVar;
        this.c = context;
    }

    @Override // f2.p0
    public final int h() {
        rp rpVar = this.d;
        ArrayList arrayList = rpVar.r;
        if (rpVar.C) {
            return (rpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (rpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (this.d.C) {
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

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        View view = n1Var.a;
        int j10 = j(i10);
        rp rpVar = this.d;
        if (j10 != 0) {
            if (j10 == 1) {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                k4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) rpVar.r.get(i10 - (rpVar.C ? 2 : 3));
                boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.o2) rpVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        if (rpVar.C) {
            y8Var.setText(ChatObject.isChannelAndNotMegaGroup(rpVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = rpVar.v;
        if (i12 == 1) {
            y8Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            y8Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            y8Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.y8(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.k4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        rp rpVar = this.d;
        if (rpVar.s.getParent() != null) {
            ((ViewGroup) rpVar.s.getParent()).removeView(rpVar.s);
        }
        frameLayout.addView(rpVar.s);
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
