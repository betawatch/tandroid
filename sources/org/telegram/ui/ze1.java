package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ze1 extends bg.c {
    public final /* synthetic */ kf1 d;

    public ze1(kf1 kf1Var) {
        this.d = kf1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        kf1 kf1Var = this.d;
        kf1Var.getClass();
        return kf1Var.b;
    }

    @Override // f2.o0
    public final int h() {
        return F().size() + 1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((bf1) this.d.b.get(i10)).a;
    }

    @Override // f2.o0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        hf1 hf1Var;
        int i11;
        boolean z4;
        int i12;
        kf1 kf1Var = this.d;
        ArrayList arrayList = kf1Var.b;
        long j10 = kf1Var.a;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 != 0) {
            boolean z10 = true;
            if (i13 == 3) {
                hf1 hf1Var2 = (hf1) view;
                hf1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !kf1Var.K.S0()) {
                    z10 = false;
                }
                hf1Var2.T4 = z10;
                hf1Var2.U4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((bf1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((bf1) F().get(i14)).c : null;
        hf1 hf1Var3 = (hf1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = hf1Var3.K;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z11 = i15 == i16 && hf1Var3.U4 == i10 && kf1Var.D;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!kf1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                hf1Var = hf1Var3;
                i11 = i16;
                boolean z12 = z11;
                hf1Var.Y(tL_forumTopic, -j10, messageObject, kf1Var.isInPreviewMode(), z12);
                z4 = z12;
                hf1Var.T4 = i10 != arrayList.size() - 1 || kf1Var.K.S0();
                boolean z13 = tL_forumTopic.pinned;
                hf1Var.q2 = z13 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                hf1Var.setPinForced(z13 && !tL_forumTopic.hidden);
                hf1Var.U4 = i10;
                if (!kf1Var.getMessagesController().isMonoForum(-j10)) {
                    hf1Var.setTopicIcon(tL_forumTopic);
                }
                hf1Var.V(kf1Var.X.contains(Integer.valueOf(i11)), z4);
                hf1Var.setDialogSelected(kf1Var.N0 != ((long) i11));
                hf1Var.T(kf1Var.Y, true);
            }
            hf1Var3.n0 = true;
            hf1Var3.x = true;
            hf1Var3.K = tL_forumTopic;
            hf1Var3.F = 72;
            hf1Var3.R = 42.0f;
            hf1Var3.G = 72;
            hf1Var3.H = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            hf1Var3.W(peerDialogId, messageObject, i17, false, false);
            hf1Var3.p0 = true;
            hf1Var3.p2 = i14 < h();
            hf1Var = hf1Var3;
        } else {
            hf1Var = hf1Var3;
            i11 = i16;
        }
        z4 = z11;
        if (!kf1Var.getMessagesController().isMonoForum(-j10)) {
        }
        hf1Var.V(kf1Var.X.contains(Integer.valueOf(i11)), z4);
        hf1Var.setDialogSelected(kf1Var.N0 != ((long) i11));
        hf1Var.T(kf1Var.Y, true);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        kf1 kf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                ye1 ye1Var = new ye1(this, kf1Var.getParentActivity());
                kf1Var.B0 = ye1Var;
                return new org.telegram.ui.Components.el0(ye1Var);
            }
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
            t00Var.setViewType(24);
            t00Var.setIsSingleCell(true);
            t00Var.w = true;
            return new org.telegram.ui.Components.el0(t00Var);
        }
        hf1 hf1Var = new hf1(kf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -kf1Var.a);
            hf1Var.setForumIcon(ag.f.d(ag.b.k[0], ""));
            hf1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            hf1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z4 = ((org.telegram.ui.ActionBar.p2) kf1Var).inPreviewMode;
        hf1Var.h0 = z4;
        hf1Var.setArchivedPullAnimation(kf1Var.w);
        return new org.telegram.ui.Components.el0(hf1Var);
    }
}
