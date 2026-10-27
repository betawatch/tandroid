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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class re1 extends qg.b {
    public final /* synthetic */ cf1 d;

    public re1(cf1 cf1Var) {
        this.d = cf1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        cf1 cf1Var = this.d;
        cf1Var.getClass();
        return cf1Var.b;
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
        return ((te1) this.d.b.get(i10)).a;
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
    public final void v(s4.e1 e1Var, int i10) {
        ze1 ze1Var;
        int i11;
        boolean z10;
        int i12;
        cf1 cf1Var = this.d;
        ArrayList arrayList = cf1Var.b;
        long j10 = cf1Var.a;
        int i13 = e1Var.f;
        View view = e1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                ze1 ze1Var2 = (ze1) view;
                ze1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !cf1Var.N.S0()) {
                    z11 = false;
                }
                ze1Var2.a5 = z11;
                ze1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((te1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((te1) F().get(i14)).c : null;
        ze1 ze1Var3 = (ze1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = ze1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && ze1Var3.b5 == i10 && cf1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!cf1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                ze1Var = ze1Var3;
                i11 = i16;
                boolean z13 = z12;
                ze1Var.X(tL_forumTopic, -j10, messageObject, cf1Var.isInPreviewMode(), z13);
                z10 = z13;
                ze1Var.a5 = i10 != arrayList.size() - 1 || cf1Var.N.S0();
                boolean z14 = tL_forumTopic.pinned;
                ze1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                ze1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                ze1Var.b5 = i10;
                if (!cf1Var.getMessagesController().isMonoForum(-j10)) {
                    ze1Var.setTopicIcon(tL_forumTopic);
                }
                ze1Var.U(cf1Var.a0.contains(Integer.valueOf(i11)), z10);
                ze1Var.setDialogSelected(cf1Var.Q0 != ((long) i11));
                ze1Var.S(cf1Var.b0, true);
            }
            ze1Var3.q0 = true;
            ze1Var3.x = true;
            ze1Var3.N = tL_forumTopic;
            ze1Var3.I = 72;
            ze1Var3.U = 42.0f;
            ze1Var3.J = 72;
            ze1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            ze1Var3.V(peerDialogId, messageObject, i17, false, false);
            ze1Var3.s0 = true;
            ze1Var3.s2 = i14 < h();
            ze1Var = ze1Var3;
        } else {
            ze1Var = ze1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!cf1Var.getMessagesController().isMonoForum(-j10)) {
        }
        ze1Var.U(cf1Var.a0.contains(Integer.valueOf(i11)), z10);
        ze1Var.setDialogSelected(cf1Var.Q0 != ((long) i11));
        ze1Var.S(cf1Var.b0, true);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        cf1 cf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                qe1 qe1Var = new qe1(this, cf1Var.getParentActivity());
                cf1Var.E0 = qe1Var;
                return new org.telegram.ui.Components.wl0(qe1Var);
            }
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(viewGroup.getContext(), null);
            c10Var.setViewType(24);
            c10Var.setIsSingleCell(true);
            c10Var.w = true;
            return new org.telegram.ui.Components.wl0(c10Var);
        }
        ze1 ze1Var = new ze1(cf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -cf1Var.a);
            ze1Var.setForumIcon(pg.d.d(pg.a.k[0], ""));
            ze1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            ze1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.r2) cf1Var).inPreviewMode;
        ze1Var.k0 = z10;
        ze1Var.setArchivedPullAnimation(cf1Var.w);
        return new org.telegram.ui.Components.wl0(ze1Var);
    }
}
