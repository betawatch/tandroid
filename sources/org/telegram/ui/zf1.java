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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class zf1 extends pg.b {
    public final /* synthetic */ kg1 d;

    public zf1(kg1 kg1Var) {
        this.d = kg1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        kg1 kg1Var = this.d;
        kg1Var.getClass();
        return kg1Var.b;
    }

    @Override // s4.g0
    public final int h() {
        return F().size() + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((bg1) this.d.b.get(i10)).a;
    }

    @Override // s4.g0
    public final void l() {
        this.d.c = h();
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        hg1 hg1Var;
        int i11;
        boolean z10;
        int i12;
        kg1 kg1Var = this.d;
        ArrayList arrayList = kg1Var.b;
        long j10 = kg1Var.a;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                hg1 hg1Var2 = (hg1) view;
                hg1Var2.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !kg1Var.N.S0()) {
                    z11 = false;
                }
                hg1Var2.a5 = z11;
                hg1Var2.b5 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((bg1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((bg1) F().get(i14)).c : null;
        hg1 hg1Var3 = (hg1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = hg1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && hg1Var3.b5 == i10 && kg1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!kg1Var.getMessagesController().isMonoForum(-j10)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                hg1Var = hg1Var3;
                i11 = i16;
                boolean z13 = z12;
                hg1Var.Y(tL_forumTopic, -j10, messageObject, kg1Var.isInPreviewMode(), z13);
                z10 = z13;
                hg1Var.a5 = i10 != arrayList.size() - 1 || kg1Var.N.S0();
                boolean z14 = tL_forumTopic.pinned;
                hg1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                hg1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                hg1Var.b5 = i10;
                if (!kg1Var.getMessagesController().isMonoForum(-j10)) {
                    hg1Var.setTopicIcon(tL_forumTopic);
                }
                hg1Var.V(kg1Var.a0.contains(Integer.valueOf(i11)), z10);
                hg1Var.setDialogSelected(kg1Var.Q0 != ((long) i11));
                hg1Var.T(kg1Var.b0, true);
            }
            hg1Var3.q0 = true;
            hg1Var3.x = true;
            hg1Var3.N = tL_forumTopic;
            hg1Var3.I = 72;
            hg1Var3.U = 42.0f;
            hg1Var3.J = 72;
            hg1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            hg1Var3.W(peerDialogId, messageObject, i17, false, false);
            hg1Var3.s0 = true;
            hg1Var3.s2 = i14 < h();
            hg1Var = hg1Var3;
        } else {
            hg1Var = hg1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!kg1Var.getMessagesController().isMonoForum(-j10)) {
        }
        hg1Var.V(kg1Var.a0.contains(Integer.valueOf(i11)), z10);
        hg1Var.setDialogSelected(kg1Var.Q0 != ((long) i11));
        hg1Var.T(kg1Var.b0, true);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        kg1 kg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                yf1 yf1Var = new yf1(this, kg1Var.getParentActivity());
                kg1Var.E0 = yf1Var;
                return new org.telegram.ui.Components.wl0(yf1Var);
            }
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(viewGroup.getContext(), null);
            f10Var.setViewType(24);
            f10Var.setIsSingleCell(true);
            f10Var.w = true;
            return new org.telegram.ui.Components.wl0(f10Var);
        }
        hg1 hg1Var = new hg1(kg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -kg1Var.a);
            hg1Var.setForumIcon(og.d.d(og.a.k[0], ""));
            hg1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            hg1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.m2) kg1Var).inPreviewMode;
        hg1Var.k0 = z10;
        hg1Var.setArchivedPullAnimation(kg1Var.w);
        return new org.telegram.ui.Components.wl0(hg1Var);
    }
}
