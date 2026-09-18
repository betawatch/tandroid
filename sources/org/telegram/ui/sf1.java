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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class sf1 extends og.b {
    public final /* synthetic */ dg1 d;

    public sf1(dg1 dg1Var) {
        this.d = dg1Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        dg1 dg1Var = this.d;
        dg1Var.getClass();
        return dg1Var.b;
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
        return ((uf1) this.d.b.get(i10)).a;
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
        ag1 ag1Var;
        int i11;
        boolean z10;
        int i12;
        dg1 dg1Var = this.d;
        ArrayList arrayList = dg1Var.b;
        long j3 = dg1Var.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 != 0) {
            boolean z11 = true;
            if (i13 == 3) {
                ag1 ag1Var2 = (ag1) view;
                ag1Var2.setCurrentDialogId(-j3);
                if (i10 == arrayList.size() - 1 && !dg1Var.N.T0()) {
                    z11 = false;
                }
                ag1Var2.W4 = z11;
                ag1Var2.X4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((uf1) F().get(i10)).c;
        int i14 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i14 < F().size() ? ((uf1) F().get(i14)).c : null;
        ag1 ag1Var3 = (ag1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = ag1Var3.N;
        int i15 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
        int i16 = tL_forumTopic.id;
        boolean z12 = i15 == i16 && ag1Var3.X4 == i10 && dg1Var.G;
        if (message != null) {
            i12 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            MessageObject messageObject = new MessageObject(i12, message, false, false);
            if (!dg1Var.getMessagesController().isMonoForum(-j3)) {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                ag1Var = ag1Var3;
                i11 = i16;
                boolean z13 = z12;
                ag1Var.Y(tL_forumTopic, -j3, messageObject, dg1Var.isInPreviewMode(), z13);
                z10 = z13;
                ag1Var.W4 = i10 != arrayList.size() - 1 || dg1Var.N.T0();
                boolean z14 = tL_forumTopic.pinned;
                ag1Var.t2 = z14 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                ag1Var.setPinForced(z14 && !tL_forumTopic.hidden);
                ag1Var.X4 = i10;
                if (!dg1Var.getMessagesController().isMonoForum(-j3)) {
                    ag1Var.setTopicIcon(tL_forumTopic);
                }
                ag1Var.V(dg1Var.a0.contains(Integer.valueOf(i11)), z10);
                ag1Var.setDialogSelected(dg1Var.Q0 != ((long) i11));
                ag1Var.T(dg1Var.b0, true);
            }
            ag1Var3.q0 = true;
            ag1Var3.x = true;
            ag1Var3.N = tL_forumTopic;
            ag1Var3.I = 72;
            ag1Var3.U = 42.0f;
            ag1Var3.J = 72;
            ag1Var3.K = 78;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            int i17 = message.date;
            i11 = i16;
            ag1Var3.W(peerDialogId, messageObject, i17, false, false);
            ag1Var3.s0 = true;
            ag1Var3.s2 = i14 < h();
            ag1Var = ag1Var3;
        } else {
            ag1Var = ag1Var3;
            i11 = i16;
        }
        z10 = z12;
        if (!dg1Var.getMessagesController().isMonoForum(-j3)) {
        }
        ag1Var.V(dg1Var.a0.contains(Integer.valueOf(i11)), z10);
        ag1Var.setDialogSelected(dg1Var.Q0 != ((long) i11));
        ag1Var.T(dg1Var.b0, true);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        dg1 dg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                rf1 rf1Var = new rf1(this, dg1Var.getParentActivity());
                dg1Var.E0 = rf1Var;
                return new org.telegram.ui.Components.gl0(rf1Var);
            }
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
            t00Var.setViewType(24);
            t00Var.setIsSingleCell(true);
            t00Var.w = true;
            return new org.telegram.ui.Components.gl0(t00Var);
        }
        ag1 ag1Var = new ag1(dg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -dg1Var.a);
            ag1Var.setForumIcon(ng.d.d(ng.a.k[0], ""));
            ag1Var.setTitleOverride(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
            ag1Var.setCustomMessage(LocaleController.getString(!isBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) dg1Var).inPreviewMode;
        ag1Var.k0 = z10;
        ag1Var.setArchivedPullAnimation(dg1Var.w);
        return new org.telegram.ui.Components.gl0(ag1Var);
    }
}
