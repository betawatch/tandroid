package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class t5 {
    public final o5 a;
    public final MessageObject b;
    public final bo c;
    public final oc d;
    public final ic e;
    public final hc f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public d4 o;
    public final r5 p;
    public final /* synthetic */ u5 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public t5(u5 u5Var, o5 o5Var, MessageObject messageObject, bo boVar, boolean z10) {
        this.q = u5Var;
        r5 r5Var = new r5(this, 0);
        this.p = r5Var;
        this.a = o5Var;
        this.b = messageObject;
        this.c = boVar;
        Context t10 = u5.t(boVar);
        ic icVar = new ic(t10, boVar.ea);
        this.e = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        icVar.b.setText(d());
        mc mcVar = new mc(t10, boVar.ea, true, false);
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        mcVar.a = new r5(this, 1);
        hc hcVar = new hc(t10, boVar.ea);
        this.f = hcVar;
        hcVar.b = 5000L;
        hcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, boVar.ea));
        mcVar.addView(hcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        oc b10 = vc.a0(boVar).b(icVar, -1);
        this.d = b10;
        b10.r = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.v = r5Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        u5 u5Var = this.q;
        int i10 = u5Var.a;
        AndroidUtilities.cancelRunOnUIThread(this.p);
        this.j = true;
        this.d.b();
        d4 d4Var = this.o;
        if (d4Var != null) {
            d4Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.g;
        long c10 = c();
        MessageObject messageObject = this.b;
        messageObject.addPaidReactions(i11, z10, c10);
        u5Var.g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (u5Var.B == this) {
            u5Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.p);
        int i10 = 0;
        if (!this.l) {
            this.j = true;
            this.b.addPaidReactions((int) (-this.h), this.g, c());
            u5 u5Var = this.q;
            u5Var.g -= this.h;
            NotificationCenter.getInstance(u5Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (!this.i && !this.j) {
            u5 y3 = u5.y(this.q.a, false);
            MessagesController messagesController = MessagesController.getInstance(this.q.a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
            long j3 = this.h;
            if (!y3.e || y3.q(false, false, null).amount >= j3) {
                this.i = true;
                TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.a.a);
                tL_messages_sendPaidReaction.msg_id = this.a.b;
                tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
                tL_messages_sendPaidReaction.count = (int) this.h;
                tL_messages_sendPaidReaction.flags |= 1;
                long c10 = c();
                if (c10 == 0 || c10 == UserConfig.getInstance(this.q.a).getClientUserId()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c10 == UserObject.ANONYMOUS) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = messagesController.getInputPeer(c10);
                }
                this.q.P();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new ai.u1(this, messagesController, j3, 6));
            } else {
                this.j = true;
                this.b.addPaidReactions((int) (-this.h), this.g, c());
                u5 u5Var2 = this.q;
                u5Var2.g = 0L;
                NotificationCenter.getInstance(u5Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                NotificationCenter.getInstance(this.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.b.getDialogId()), Integer.valueOf(this.b.getId()), this.b.messageOwner.reactions);
                if (this.a.a >= 0) {
                    str = UserObject.getForcedFirstName(this.c.getMessagesController().getUser(Long.valueOf(this.a.a)));
                } else {
                    TLRPC.Chat chat = this.c.getMessagesController().getChat(Long.valueOf(-this.a.a));
                    str = chat == null ? "" : chat.title;
                }
                String str2 = str;
                Context parentActivity = this.c.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                new m7(parentActivity, this.c.getResourceProvider(), j3, 5, str2, new s5(this, j3, i10), 0L).show();
            }
        }
        this.d.b();
        d4 d4Var = this.o;
        if (d4Var != null && (messageObject = this.b) != null && messageObject.getId() == d4Var.c) {
            this.o.c();
        }
        u5 u5Var3 = this.q;
        if (u5Var3.B == this) {
            u5Var3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.n;
        return l4 != null ? l4.longValue() : this.q.A(this.b);
    }

    public final String d() {
        return c() == UserObject.ANONYMOUS ? LocaleController.getString(R.string.StarsSentAnonymouslyTitle) : (c() == 0 || c() == UserConfig.getInstance(this.q.a).getClientUserId()) ? LocaleController.getString(R.string.StarsSentTitle) : LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
    }
}
