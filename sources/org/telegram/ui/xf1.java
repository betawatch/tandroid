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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xf1 extends ng.b {
    public final /* synthetic */ ig1 d;

    public xf1(ig1 ig1Var) {
        this.d = ig1Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        ig1 ig1Var = this.d;
        ig1Var.getClass();
        return ig1Var.b;
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
        return ((zf1) this.d.b.get(i10)).a;
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
        fg1 fg1Var;
        int i11;
        boolean z10;
        int i12;
        ig1 ig1Var = this.d;
        ArrayList arrayList = ig1Var.b;
        long j3 = ig1Var.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                fg1 fg1Var2 = (fg1) view;
                fg1Var2.setCurrentDialogId(-j3);
                if (i10 == arrayList.size() - 1 && !ig1Var.N.R0()) {
                    z11 = false;
                }
                fg1Var2.W4 = z11;
                fg1Var2.X4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((zf1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((zf1) F().get(i14)).c : null;
        fg1 fg1Var3 = (fg1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = fg1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && fg1Var3.X4 == i10 && ig1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!ig1Var.getMessagesController().isMonoForum(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                fg1Var = fg1Var3;
                i11 = i16;
                boolean z13 = z12;
                fg1Var.Y(tL_forumTopic, -j3, messageObject, ig1Var.isInPreviewMode(), z13);
                z10 = z13;
                fg1Var.W4 = i10 != arrayList.size() - 1 || ig1Var.N.R0();
                boolean z14 = tL_forumTopic.pinned;
                fg1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                fg1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                fg1Var.X4 = i10;
                if (!ig1Var.getMessagesController().isMonoForum(-j3)) {
                    fg1Var.setTopicIcon(tL_forumTopic);
                }
                fg1Var.V(ig1Var.a0.contains(Integer.valueOf(i11)), z10);
                fg1Var.setDialogSelected(ig1Var.Q0 != ((long) i11));
                fg1Var.T(ig1Var.b0, true);
            }
            fg1Var3.q0 = true;
            fg1Var3.x = true;
            fg1Var3.N = tL_forumTopic;
            fg1Var3.I = 72;
            fg1Var3.U = 42.0f;
            fg1Var3.J = 72;
            fg1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            fg1Var3.W(peerDialogId, messageObject, i17, false, false);
            fg1Var3.s0 = true;
            fg1Var3.s2 = i14 < h();
            fg1Var = fg1Var3;
        } else {
            fg1Var = fg1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!ig1Var.getMessagesController().isMonoForum(-j3)) {
        }
        fg1Var.V(ig1Var.a0.contains(Integer.valueOf(i11)), z10);
        fg1Var.setDialogSelected(ig1Var.Q0 != ((long) i11));
        fg1Var.T(ig1Var.b0, true);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        ig1 ig1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                wf1 wf1Var = new wf1(this, ig1Var.getParentActivity());
                ig1Var.E0 = wf1Var;
                return new org.telegram.ui.Components.fl0(wf1Var);
            }
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(viewGroup.getContext(), null);
            a10Var.setViewType(24);
            a10Var.setIsSingleCell(true);
            a10Var.w = true;
            return new org.telegram.ui.Components.fl0(a10Var);
        }
        fg1 fg1Var = new fg1(ig1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -ig1Var.a);
            fg1Var.setForumIcon(mg.d.d(mg.a.k[0], ""));
            fg1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            fg1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.p2) ig1Var).inPreviewMode;
        fg1Var.k0 = z10;
        fg1Var.setArchivedPullAnimation(ig1Var.w);
        return new org.telegram.ui.Components.fl0(fg1Var);
    }
}
