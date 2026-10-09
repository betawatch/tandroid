package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yf1 extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ bg1 c;

    public yf1(bg1 bg1Var) {
        this.c = bg1Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.i0
    public final int h() {
        bg1 bg1Var = this.c;
        if (bg1Var.l0) {
            return 0;
        }
        return bg1Var.k0;
    }

    @Override // s4.i0
    public final int j(int i10) {
        bg1 bg1Var = this.c;
        if (i10 == bg1Var.h0 || i10 == bg1Var.e0) {
            return 1;
        }
        if (i10 < bg1Var.f0 || i10 >= bg1Var.g0) {
            return (i10 < bg1Var.i0 || i10 >= bg1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        View view = d1Var.a;
        bg1 bg1Var = this.c;
        fg1 fg1Var = bg1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == bg1Var.e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == bg1Var.h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) bg1Var.c0.get(i10 - bg1Var.f0));
            qaVar.d = i10 != bg1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) bg1Var.d0.get(i10 - bg1Var.i0);
            cg1 cg1Var = (cg1) view;
            cg1Var.a5 = i10 != bg1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
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
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.s2, org.telegram.ui.cg1] */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        fg1 fg1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.qa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? cg1Var = new cg1(fg1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.n2) fg1Var).inPreviewMode;
            cg1Var.k0 = z10;
            frameLayout = cg1Var;
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.am0(frameLayout);
    }
}
