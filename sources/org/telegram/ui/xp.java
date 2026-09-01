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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xp extends f2.p0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ yp d;

    public xp(yp ypVar, Context context) {
        this.d = ypVar;
        this.c = context;
    }

    @Override // f2.p0
    public final int h() {
        yp ypVar = this.d;
        ArrayList arrayList = ypVar.r;
        if (ypVar.D) {
            return (ypVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (ypVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        View view = m1Var.a;
        int j10 = j(i10);
        yp ypVar = this.d;
        if (j10 != 0) {
            if (j10 == 1) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ypVar.r.get(i10 - (ypVar.D ? 2 : 3));
                boolean contains = ypVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.p2) ypVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        a9Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
        if (ypVar.D) {
            a9Var.setText(ChatObject.isChannelAndNotMegaGroup(ypVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = ypVar.v;
        if (i12 == 1) {
            a9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            a9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            a9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.a9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.m4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        yp ypVar = this.d;
        if (ypVar.s.getParent() != null) {
            ((ViewGroup) ypVar.s.getParent()).removeView(ypVar.s);
        }
        frameLayout.addView(ypVar.s);
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.fl0(frameLayout);
    }
}
