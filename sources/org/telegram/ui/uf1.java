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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class uf1 extends og.b {
    public final /* synthetic */ fg1 d;

    public uf1(fg1 fg1Var) {
        this.d = fg1Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        fg1 fg1Var = this.d;
        fg1Var.getClass();
        return fg1Var.b;
    }

    @Override // s4.h0
    public final int h() {
        return F().size() + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((wf1) this.d.b.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        cg1 cg1Var;
        int i11;
        boolean z10;
        int i12;
        fg1 fg1Var = this.d;
        ArrayList arrayList = fg1Var.b;
        long j3 = fg1Var.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                cg1 cg1Var2 = (cg1) view;
                cg1Var2.setCurrentDialogId(-j3);
                if (i10 == arrayList.size() - 1 && !fg1Var.N.T0()) {
                    z11 = false;
                }
                cg1Var2.W4 = z11;
                cg1Var2.X4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((wf1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((wf1) F().get(i14)).c : null;
        cg1 cg1Var3 = (cg1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = cg1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && cg1Var3.X4 == i10 && fg1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!fg1Var.getMessagesController().isMonoForum(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                cg1Var = cg1Var3;
                i11 = i16;
                boolean z13 = z12;
                cg1Var.Y(tL_forumTopic, -j3, messageObject, fg1Var.isInPreviewMode(), z13);
                z10 = z13;
                cg1Var.W4 = i10 != arrayList.size() - 1 || fg1Var.N.T0();
                boolean z14 = tL_forumTopic.pinned;
                cg1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                cg1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                cg1Var.X4 = i10;
                if (!fg1Var.getMessagesController().isMonoForum(-j3)) {
                    cg1Var.setTopicIcon(tL_forumTopic);
                }
                cg1Var.V(fg1Var.a0.contains(Integer.valueOf(i11)), z10);
                cg1Var.setDialogSelected(fg1Var.Q0 != ((long) i11));
                cg1Var.T(fg1Var.b0, true);
            }
            cg1Var3.q0 = true;
            cg1Var3.x = true;
            cg1Var3.N = tL_forumTopic;
            cg1Var3.I = 72;
            cg1Var3.U = 42.0f;
            cg1Var3.J = 72;
            cg1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            cg1Var3.W(peerDialogId, messageObject, i17, false, false);
            cg1Var3.s0 = true;
            cg1Var3.s2 = i14 < h();
            cg1Var = cg1Var3;
        } else {
            cg1Var = cg1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!fg1Var.getMessagesController().isMonoForum(-j3)) {
        }
        cg1Var.V(fg1Var.a0.contains(Integer.valueOf(i11)), z10);
        cg1Var.setDialogSelected(fg1Var.Q0 != ((long) i11));
        cg1Var.T(fg1Var.b0, true);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        fg1 fg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                tf1 tf1Var = new tf1(this, fg1Var.getParentActivity());
                fg1Var.E0 = tf1Var;
                return new org.telegram.ui.Components.fl0(tf1Var);
            }
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
            t00Var.setViewType(24);
            t00Var.setIsSingleCell(true);
            t00Var.w = true;
            return new org.telegram.ui.Components.fl0(t00Var);
        }
        cg1 cg1Var = new cg1(fg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -fg1Var.a);
            cg1Var.setForumIcon(ng.d.d(ng.a.k[0], ""));
            cg1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            cg1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) fg1Var).inPreviewMode;
        cg1Var.k0 = z10;
        cg1Var.setArchivedPullAnimation(fg1Var.w);
        return new org.telegram.ui.Components.fl0(cg1Var);
    }
}
