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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, null);
                return;
            } else {
                if (j10 != 2) {
                    return;
                }
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) rpVar.r.get(i10 - (rpVar.G ? 2 : 3));
                boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                i11 = ((org.telegram.ui.ActionBar.o2) rpVar).currentAccount;
                xVar.a(tL_availableReaction, contains, i11);
                return;
            }
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        org.telegram.ui.ActionBar.r6.W(e9Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
        if (rpVar.G) {
            e9Var.setText(ChatObject.isChannelAndNotMegaGroup(rpVar.a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i12 = rpVar.v;
        if (i12 == 1) {
            e9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            e9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            e9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.e9(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.l4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.x(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        rp rpVar = this.d;
        if (rpVar.s.getParent() != null) {
            ((ViewGroup) rpVar.s.getParent()).removeView(rpVar.s);
        }
        frameLayout.addView(rpVar.s);
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
