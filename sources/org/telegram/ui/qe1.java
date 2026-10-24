package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qe1 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ te1 c;

    public qe1(te1 te1Var) {
        this.c = te1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        te1 te1Var = this.c;
        if (te1Var.l0) {
            return 0;
        }
        return te1Var.k0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        te1 te1Var = this.c;
        if (i10 == te1Var.h0 || i10 == te1Var.e0) {
            return 1;
        }
        if (i10 < te1Var.f0 || i10 >= te1Var.g0) {
            return (i10 < te1Var.i0 || i10 >= te1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        View view = b1Var.a;
        te1 te1Var = this.c;
        ye1 ye1Var = te1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == te1Var.e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == te1Var.h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) te1Var.c0.get(i10 - te1Var.f0));
            qaVar.d = i10 != te1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) te1Var.d0.get(i10 - te1Var.i0);
            ue1 ue1Var = (ue1) view;
            ue1Var.a5 = i10 != te1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = ye1Var.s.findTopic(ye1Var.a, topicId);
            if (findTopic != null) {
                ue1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
                ue1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.q2, org.telegram.ui.ue1] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        ye1 ye1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.qa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? ue1Var = new ue1(ye1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.o2) ye1Var).inPreviewMode;
            ue1Var.k0 = z10;
            frameLayout = ue1Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
