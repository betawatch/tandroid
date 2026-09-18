package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class wf1 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ zf1 c;

    public wf1(zf1 zf1Var) {
        this.c = zf1Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        zf1 zf1Var = this.c;
        if (zf1Var.m0) {
            return 0;
        }
        return zf1Var.l0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        zf1 zf1Var = this.c;
        if (i10 == zf1Var.i0 || i10 == zf1Var.f0) {
            return 1;
        }
        if (i10 < zf1Var.g0 || i10 >= zf1Var.h0) {
            return (i10 < zf1Var.j0 || i10 >= zf1Var.k0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        zf1 zf1Var = this.c;
        dg1 dg1Var = zf1Var.u0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == zf1Var.f0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == zf1Var.i0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.setTopic((TLRPC.TL_forumTopic) zf1Var.d0.get(i10 - zf1Var.g0));
            saVar.d = i10 != zf1Var.h0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) zf1Var.e0.get(i10 - zf1Var.j0);
            ag1 ag1Var = (ag1) view;
            ag1Var.W4 = i10 != zf1Var.k0 - 1;
            i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = dg1Var.s.findTopic(dg1Var.a, topicId);
            if (findTopic != null) {
                ag1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                ag1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.s2, org.telegram.ui.ag1] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        dg1 dg1Var = this.c.u0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.sa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? ag1Var = new ag1(dg1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.n2) dg1Var).inPreviewMode;
            ag1Var.k0 = z10;
            frameLayout = ag1Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.gl0(frameLayout);
    }
}
