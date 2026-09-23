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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yp extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ zp d;

    public yp(zp zpVar, Context context) {
        this.d = zpVar;
        this.c = context;
    }

    @Override // s4.h0
    public final int h() {
        zp zpVar = this.d;
        ArrayList arrayList = zpVar.r;
        if (zpVar.G) {
            return (zpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (zpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        int j3 = j(i10);
        zp zpVar = this.d;
        if (j3 != 0) {
            if (j3 == 1) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                return;
            } else {
                if (j3 != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) zpVar.r.get(i10 - (zpVar.G ? 2 : 3));
                boolean contains = zpVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.n2) zpVar).currentAccount;
                yVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        f9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false));
        if (zpVar.G) {
            f9Var.setText(ChatObject.isChannelAndNotMegaGroup(zpVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = zpVar.v;
        if (i12 == 1) {
            f9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            f9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            f9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wk0(new org.telegram.ui.Cells.f9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.wk0(new org.telegram.ui.Cells.m4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.wk0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        zp zpVar = this.d;
        if (zpVar.s.getParent() != null) {
            ((ViewGroup) zpVar.s.getParent()).removeView(zpVar.s);
        }
        frameLayout.addView(zpVar.s);
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.wk0(frameLayout);
    }
}
