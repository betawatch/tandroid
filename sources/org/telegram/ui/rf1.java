package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class rf1 extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ uf1 c;

    public rf1(uf1 uf1Var) {
        this.c = uf1Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        uf1 uf1Var = this.c;
        if (uf1Var.m0) {
            return 0;
        }
        return uf1Var.l0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        uf1 uf1Var = this.c;
        if (i10 == uf1Var.i0 || i10 == uf1Var.f0) {
            return 1;
        }
        if (i10 < uf1Var.g0 || i10 >= uf1Var.h0) {
            return (i10 < uf1Var.j0 || i10 >= uf1Var.k0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        uf1 uf1Var = this.c;
        yf1 yf1Var = uf1Var.u0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == uf1Var.f0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == uf1Var.i0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.setTopic((TLRPC.TL_forumTopic) uf1Var.d0.get(i10 - uf1Var.g0));
            saVar.d = i10 != uf1Var.h0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) uf1Var.e0.get(i10 - uf1Var.j0);
            vf1 vf1Var = (vf1) view;
            vf1Var.W4 = i10 != uf1Var.k0 - 1;
            i11 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = yf1Var.s.findTopic(yf1Var.a, topicId);
            if (findTopic != null) {
                vf1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
                vf1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.s2, org.telegram.ui.vf1] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        yf1 yf1Var = this.c.u0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.sa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? vf1Var = new vf1(yf1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.n2) yf1Var).inPreviewMode;
            vf1Var.k0 = z10;
            frameLayout = vf1Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.il0(frameLayout);
    }
}
