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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wp extends f2.o0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ xp d;

    public wp(xp xpVar, Context context) {
        this.d = xpVar;
        this.c = context;
    }

    @Override // f2.o0
    public final int h() {
        xp xpVar = this.d;
        ArrayList arrayList = xpVar.r;
        if (xpVar.D) {
            return (xpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (xpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
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
        xp xpVar = this.d;
        if (j10 != 0) {
            if (j10 == 1) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) xpVar.r.get(i10 - (xpVar.D ? 2 : 3));
                boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.p2) xpVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        a9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        if (xpVar.D) {
            a9Var.setText(ChatObject.isChannelAndNotMegaGroup(xpVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = xpVar.v;
        if (i12 == 1) {
            a9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            a9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            a9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.a9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.m4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        xp xpVar = this.d;
        if (xpVar.s.getParent() != null) {
            ((ViewGroup) xpVar.s.getParent()).removeView(xpVar.s);
        }
        frameLayout.addView(xpVar.s);
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
