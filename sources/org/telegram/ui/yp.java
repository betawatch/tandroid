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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yp extends f2.o0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ zp d;

    public yp(zp zpVar, Context context) {
        this.d = zpVar;
        this.c = context;
    }

    @Override // f2.o0
    public final int h() {
        zp zpVar = this.d;
        ArrayList arrayList = zpVar.r;
        if (zpVar.D) {
            return (zpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (zpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (this.d.D) {
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

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        View view = l1Var.a;
        int j10 = j(i10);
        zp zpVar = this.d;
        if (j10 != 0) {
            if (j10 == 1) {
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) zpVar.r.get(i10 - (zpVar.D ? 2 : 3));
                boolean contains = zpVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.p2) zpVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        if (zpVar.D) {
            z8Var.setText(ChatObject.isChannelAndNotMegaGroup(zpVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = zpVar.v;
        if (i12 == 1) {
            z8Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            z8Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            z8Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.dl0(new org.telegram.ui.Cells.z8(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.dl0(new org.telegram.ui.Cells.l4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.dl0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        zp zpVar = this.d;
        if (zpVar.s.getParent() != null) {
            ((ViewGroup) zpVar.s.getParent()).removeView(zpVar.s);
        }
        frameLayout.addView(zpVar.s);
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.dl0(frameLayout);
    }
}
