package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xf1 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ ag1 c;

    public xf1(ag1 ag1Var) {
        this.c = ag1Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        ag1 ag1Var = this.c;
        if (ag1Var.l0) {
            return 0;
        }
        return ag1Var.k0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ag1 ag1Var = this.c;
        if (i10 == ag1Var.h0 || i10 == ag1Var.e0) {
            return 1;
        }
        if (i10 < ag1Var.f0 || i10 >= ag1Var.g0) {
            return (i10 < ag1Var.i0 || i10 >= ag1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        ag1 ag1Var = this.c;
        eg1 eg1Var = ag1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == ag1Var.e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == ag1Var.h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.setTopic((TLRPC.TL_forumTopic) ag1Var.c0.get(i10 - ag1Var.f0));
            saVar.d = i10 != ag1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) ag1Var.d0.get(i10 - ag1Var.i0);
            bg1 bg1Var = (bg1) view;
            bg1Var.W4 = i10 != ag1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = eg1Var.s.findTopic(eg1Var.a, topicId);
            if (findTopic != null) {
                bg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                bg1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.r2, org.telegram.ui.bg1] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        eg1 eg1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.sa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? bg1Var = new bg1(eg1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.n2) eg1Var).inPreviewMode;
            bg1Var.k0 = z10;
            frameLayout = bg1Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
