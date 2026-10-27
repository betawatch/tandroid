package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ve1 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ ye1 c;

    public ve1(ye1 ye1Var) {
        this.c = ye1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        ye1 ye1Var = this.c;
        if (ye1Var.n0) {
            return 0;
        }
        return ye1Var.m0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ye1 ye1Var = this.c;
        if (i10 == ye1Var.j0 || i10 == ye1Var.g0) {
            return 1;
        }
        if (i10 < ye1Var.h0 || i10 >= ye1Var.i0) {
            return (i10 < ye1Var.k0 || i10 >= ye1Var.l0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        View view = e1Var.a;
        ye1 ye1Var = this.c;
        cf1 cf1Var = ye1Var.v0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == ye1Var.g0) {
                z3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == ye1Var.j0) {
                z3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            uaVar.setTopic((TLRPC.TL_forumTopic) ye1Var.e0.get(i10 - ye1Var.h0));
            uaVar.d = i10 != ye1Var.i0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) ye1Var.f0.get(i10 - ye1Var.k0);
            ze1 ze1Var = (ze1) view;
            ze1Var.a5 = i10 != ye1Var.l0 - 1;
            i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = cf1Var.s.findTopic(cf1Var.a, topicId);
            if (findTopic != null) {
                ze1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
                ze1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.p2, org.telegram.ui.ze1] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        cf1 cf1Var = this.c.v0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.ua(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? ze1Var = new ze1(cf1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.r2) cf1Var).inPreviewMode;
            ze1Var.k0 = z10;
            frameLayout = ze1Var;
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
