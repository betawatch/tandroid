package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class se1 extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ ve1 c;

    public se1(ve1 ve1Var) {
        this.c = ve1Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // f2.p0
    public final int h() {
        ve1 ve1Var = this.c;
        if (ve1Var.h0) {
            return 0;
        }
        return ve1Var.g0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ve1 ve1Var = this.c;
        if (i10 == ve1Var.d0 || i10 == ve1Var.a0) {
            return 1;
        }
        if (i10 < ve1Var.b0 || i10 >= ve1Var.c0) {
            return (i10 < ve1Var.e0 || i10 >= ve1Var.f0) ? 0 : 3;
        }
        return 2;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        View view = n1Var.a;
        ve1 ve1Var = this.c;
        ze1 ze1Var = ve1Var.p0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == ve1Var.a0) {
                s3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == ve1Var.d0) {
                s3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) view;
            maVar.setTopic((TLRPC.TL_forumTopic) ve1Var.V.get(i10 - ve1Var.b0));
            maVar.d = i10 != ve1Var.c0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) ve1Var.W.get(i10 - ve1Var.e0);
            we1 we1Var = (we1) view;
            we1Var.S4 = i10 != ve1Var.f0 - 1;
            i11 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = ze1Var.s.findTopic(ze1Var.a, topicId);
            if (findTopic != null) {
                we1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                we1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.p2, org.telegram.ui.we1] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        ze1 ze1Var = this.c.p0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.ma(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? we1Var = new we1(ze1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.o2) ze1Var).inPreviewMode;
            we1Var.g0 = z10;
            frameLayout = we1Var;
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
