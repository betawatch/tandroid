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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class tf1 extends pg.b {
    public final /* synthetic */ eg1 d;

    public tf1(eg1 eg1Var) {
        this.d = eg1Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        eg1 eg1Var = this.d;
        eg1Var.getClass();
        return eg1Var.b;
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
        return ((vf1) this.d.b.get(i10)).a;
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
        bg1 bg1Var;
        int i11;
        boolean z10;
        int i12;
        eg1 eg1Var = this.d;
        ArrayList arrayList = eg1Var.b;
        long j3 = eg1Var.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                bg1 bg1Var2 = (bg1) view;
                bg1Var2.setCurrentDialogId(-j3);
                if (i10 == arrayList.size() - 1 && !eg1Var.N.R0()) {
                    z11 = false;
                }
                bg1Var2.W4 = z11;
                bg1Var2.X4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((vf1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((vf1) F().get(i14)).c : null;
        bg1 bg1Var3 = (bg1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = bg1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && bg1Var3.X4 == i10 && eg1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!eg1Var.getMessagesController().isMonoForum(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                bg1Var = bg1Var3;
                i11 = i16;
                boolean z13 = z12;
                bg1Var.Y(tL_forumTopic, -j3, messageObject, eg1Var.isInPreviewMode(), z13);
                z10 = z13;
                bg1Var.W4 = i10 != arrayList.size() - 1 || eg1Var.N.R0();
                boolean z14 = tL_forumTopic.pinned;
                bg1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                bg1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                bg1Var.X4 = i10;
                if (!eg1Var.getMessagesController().isMonoForum(-j3)) {
                    bg1Var.setTopicIcon(tL_forumTopic);
                }
                bg1Var.V(eg1Var.a0.contains(Integer.valueOf(i11)), z10);
                bg1Var.setDialogSelected(eg1Var.Q0 != ((long) i11));
                bg1Var.T(eg1Var.b0, true);
            }
            bg1Var3.q0 = true;
            bg1Var3.x = true;
            bg1Var3.N = tL_forumTopic;
            bg1Var3.I = 72;
            bg1Var3.U = 42.0f;
            bg1Var3.J = 72;
            bg1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            bg1Var3.W(peerDialogId, messageObject, i17, false, false);
            bg1Var3.s0 = true;
            bg1Var3.s2 = i14 < h();
            bg1Var = bg1Var3;
        } else {
            bg1Var = bg1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!eg1Var.getMessagesController().isMonoForum(-j3)) {
        }
        bg1Var.V(eg1Var.a0.contains(Integer.valueOf(i11)), z10);
        bg1Var.setDialogSelected(eg1Var.Q0 != ((long) i11));
        bg1Var.T(eg1Var.b0, true);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        eg1 eg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                sf1 sf1Var = new sf1(this, eg1Var.getParentActivity());
                eg1Var.E0 = sf1Var;
                return new org.telegram.ui.Components.vk0(sf1Var);
            }
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
            t00Var.setViewType(24);
            t00Var.setIsSingleCell(true);
            t00Var.w = true;
            return new org.telegram.ui.Components.vk0(t00Var);
        }
        bg1 bg1Var = new bg1(eg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -eg1Var.a);
            bg1Var.setForumIcon(og.d.d(og.a.k[0], ""));
            bg1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            bg1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) eg1Var).inPreviewMode;
        bg1Var.k0 = z10;
        bg1Var.setArchivedPullAnimation(eg1Var.w);
        return new org.telegram.ui.Components.vk0(bg1Var);
    }
}
