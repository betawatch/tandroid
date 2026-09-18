package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yf1 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ bg1 c;

    public yf1(bg1 bg1Var) {
        this.c = bg1Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        bg1 bg1Var = this.c;
        if (bg1Var.m0) {
            return 0;
        }
        return bg1Var.l0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        bg1 bg1Var = this.c;
        if (i10 == bg1Var.i0 || i10 == bg1Var.f0) {
            return 1;
        }
        if (i10 < bg1Var.g0 || i10 >= bg1Var.h0) {
            return (i10 < bg1Var.j0 || i10 >= bg1Var.k0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        bg1 bg1Var = this.c;
        fg1 fg1Var = bg1Var.u0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == bg1Var.f0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == bg1Var.i0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
            taVar.setTopic((TLRPC.TL_forumTopic) bg1Var.d0.get(i10 - bg1Var.g0));
            taVar.d = i10 != bg1Var.h0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) bg1Var.e0.get(i10 - bg1Var.j0);
            cg1 cg1Var = (cg1) view;
            cg1Var.W4 = i10 != bg1Var.k0 - 1;
            i11 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = fg1Var.s.findTopic(fg1Var.a, topicId);
            if (findTopic != null) {
                cg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                cg1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.r2, org.telegram.ui.cg1] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        fg1 fg1Var = this.c.u0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.ta(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? cg1Var = new cg1(fg1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.o2) fg1Var).inPreviewMode;
            cg1Var.k0 = z10;
            frameLayout = cg1Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.wk0(frameLayout);
    }
}
