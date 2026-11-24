// default package

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uea implements bb2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wjb b;
    public final /* synthetic */ wea c;

    public uea(wea weaVar, int i, wjb wjbVar) {
        this.c = weaVar;
        this.a = i;
        this.b = wjbVar;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = message.id;
        tL_message.from_id = message.from_id;
        tL_message.from_boosts_applied = message.from_boosts_applied;
        tL_message.peer_id = message.peer_id;
        tL_message.saved_peer_id = message.saved_peer_id;
        tL_message.date = message.date;
        tL_message.expire_date = message.expire_date;
        tL_message.action = message.action;
        tL_message.message = message.message;
        tL_message.flags = message.flags;
        tL_message.flags2 = message.flags2;
        tL_message.mentioned = message.mentioned;
        tL_message.media_unread = message.media_unread;
        tL_message.out = message.out;
        tL_message.unread = message.unread;
        tL_message.entities = message.entities;
        tL_message.via_bot_name = message.via_bot_name;
        tL_message.reply_markup = message.reply_markup;
        tL_message.views = message.views;
        tL_message.forwards = message.forwards;
        tL_message.replies = message.replies;
        tL_message.edit_date = message.edit_date;
        tL_message.silent = message.silent;
        tL_message.post = message.post;
        tL_message.from_scheduled = message.from_scheduled;
        tL_message.legacy = message.legacy;
        tL_message.edit_hide = message.edit_hide;
        tL_message.pinned = message.pinned;
        tL_message.fwd_from = message.fwd_from;
        tL_message.via_bot_id = message.via_bot_id;
        tL_message.via_business_bot_id = message.via_business_bot_id;
        tL_message.reply_to = message.reply_to;
        tL_message.post_author = message.post_author;
        tL_message.grouped_id = message.grouped_id;
        tL_message.reactions = message.reactions;
        tL_message.restriction_reason = message.restriction_reason;
        tL_message.ttl_period = message.ttl_period;
        tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
        tL_message.effect = message.effect;
        tL_message.noforwards = message.noforwards;
        tL_message.invert_media = message.invert_media;
        tL_message.offline = message.offline;
        tL_message.factcheck = message.factcheck;
        tL_message.send_state = message.send_state;
        tL_message.fwd_msg_id = message.fwd_msg_id;
        tL_message.params = message.params;
        tL_message.random_id = message.random_id;
        tL_message.local_id = message.local_id;
        tL_message.dialog_id = message.dialog_id;
        tL_message.ttl = message.ttl;
        tL_message.destroyTime = message.destroyTime;
        tL_message.destroyTimeMillis = message.destroyTimeMillis;
        tL_message.layer = message.layer;
        tL_message.seq_in = message.seq_in;
        tL_message.seq_out = message.seq_out;
        tL_message.with_my_score = message.with_my_score;
        tL_message.replyMessage = message.replyMessage;
        tL_message.reqId = message.reqId;
        tL_message.realId = message.realId;
        tL_message.stickerVerified = message.stickerVerified;
        tL_message.isThreadMessage = message.isThreadMessage;
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_message.originalLanguage = message.originalLanguage;
        tL_message.translatedToLanguage = message.translatedToLanguage;
        tL_message.translatedText = message.translatedText;
        tL_message.replyStory = message.replyStory;
        tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
        return tL_message;
    }

    @Override // bb2
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override // bb2
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override // bb2
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // bb2
    public final gib E2() {
        return null;
    }

    @Override // bb2
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override // bb2
    public final void F1(gb2 gb2Var, int i) {
        if (i == 80) {
            d dVar = this.c.s.y1;
            k27 messageObject = gb2Var.getMessageObject();
            pm pmVar = gf8.L1;
            if (dVar == null || dVar.getParentActivity() == null) {
                return;
            }
            dVar.showDialog(new gf8(dVar.getContext(), dVar.getCurrentAccount(), messageObject, dVar.getResourceProvider()));
        }
    }

    @Override // bb2
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // bb2
    public final boolean J0(long j) {
        return false;
    }

    @Override // bb2
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override // bb2
    public final boolean N1() {
        return false;
    }

    @Override // bb2
    public final boolean O() {
        return false;
    }

    @Override // bb2
    public final boolean Q() {
        return false;
    }

    @Override // bb2
    public final int R() {
        return 0;
    }

    @Override // bb2
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // bb2
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override // bb2
    public final int V(gb2 gb2Var) {
        return 0;
    }

    @Override // bb2
    public final vu1 X() {
        return null;
    }

    @Override // bb2
    public final ma8 Z1() {
        return null;
    }

    @Override // bb2
    public final boolean b() {
        return true;
    }

    @Override // bb2
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override // bb2
    public final boolean c2(long j) {
        return false;
    }

    @Override // bb2
    public final boolean e0() {
        return false;
    }

    @Override // bb2
    public final CharacterStyle f0(gb2 gb2Var) {
        return null;
    }

    @Override // bb2
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override // bb2
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // bb2
    public final boolean i0() {
        return true;
    }

    @Override // bb2
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override // bb2
    public final boolean l() {
        return true;
    }

    @Override // bb2
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override // bb2
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
        z3a.B(this.a).v0(gb2Var.getMessageObject(), arrayList, null);
    }

    @Override // bb2
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        int i2;
        TLRPC.Message message;
        int i3;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        nfa nfaVar = this.c.s;
        k27 messageObject = gb2Var.getMessageObject();
        TLRPC.MessageMedia m1 = k27.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m1 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        wjb wjbVar = this.b;
        int i4 = this.a;
        if (geoPoint != null) {
            if (gl.H1(nfaVar.y1)) {
                oea oeaVar = new oea(3);
                oeaVar.setResourceProvider(wjbVar);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = na7.q1(i4).w1(nfaVar.m1);
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                oeaVar.V0 = false;
                oeaVar.F0(new k27(y6c.t0, tL_message, false, false));
                nfaVar.y1.presentFragment(oeaVar);
                return;
            }
            return;
        }
        if (k27.N2(messageMedia.document)) {
            xv2.e().l(nfaVar.y1.getParentActivity());
            xv2.e().k(new pea(this, tL_messageMediaPoll, pollAnswer, gb2Var));
            xv2 e = xv2.e();
            TLRPC.Document document4 = messageMedia.document;
            e.i(document4, null, "", null, null, k27.H2(document4) ? 2 : 0, false, gb2Var.getMessageObject(), this.b, kk7.d3);
            return;
        }
        TLRPC.Message message2 = messageObject.k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || k27.J4(document3))) {
            i2 = messageMedia3 == messageMedia ? arrayList2.size() : -1;
            TLRPC.TL_message a = a(message2);
            a.media = messageMedia3;
            arrayList2.add(new qea(i4, a, false, true));
            arrayList.add(-2);
        } else {
            i2 = -1;
        }
        if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || k27.J4(document2))) {
            if (messageMedia2 == messageMedia) {
                i2 = arrayList2.size();
            }
            TLRPC.TL_message a2 = a(message2);
            a2.media = messageMedia2;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            a2.message = pollResults2.solution;
            a2.entities = pollResults2.solution_entities;
            arrayList2.add(new rea(i4, a2, false, true));
            arrayList.add(-3);
        }
        int i5 = i4;
        apb.b(tL_messageMediaPoll.poll, y6c.h(i4).e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
        if (arrayList3 == null) {
            arrayList3 = poll.answers;
        }
        int i6 = 0;
        while (i6 < arrayList3.size()) {
            TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i6);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || k27.J4(document))) {
                if (pollAnswer2.unshuffled_index == i) {
                    i2 = arrayList2.size();
                }
                TLRPC.TL_message a3 = a(message2);
                a3.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                a3.message = tL_textWithEntities2.text;
                a3.entities = tL_textWithEntities2.entities;
                i3 = i5;
                message = message2;
                arrayList2.add(new sea(i3, a3, false, true));
                arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            } else {
                int i7 = i5;
                message = message2;
                i3 = i7;
            }
            i6++;
            message2 = message;
            i5 = i3;
        }
        if (i2 <= -1 || arrayList2.isEmpty()) {
            return;
        }
        messageObject.s0 = arrayList;
        PhotoViewer.r0().T1(null, nfaVar.y1, wjbVar);
        PhotoViewer.r0().j1(arrayList2, i2, nfaVar.m1, 0L, 0L, new tea(this));
    }

    @Override // bb2
    public final boolean s0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override // bb2
    public final String x(long j) {
        return null;
    }

    @Override // bb2
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // bb2
    public final boolean y1() {
        return false;
    }

    @Override // bb2
    public final boolean y2(int i) {
        return false;
    }

    @Override // bb2
    public final /* synthetic */ boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override // bb2
    public final void B0() {
    }

    @Override // bb2
    public final void C2() {
    }

    @Override // bb2
    public final void R1() {
    }

    @Override // bb2
    public final void c() {
    }

    @Override // bb2
    public final void i1() {
    }

    @Override // bb2
    public final void p() {
    }

    @Override // bb2
    public final void t() {
    }

    @Override // bb2
    public final void u2() {
    }

    @Override // bb2
    public final void D1(h27 h27Var) {
    }

    @Override // bb2
    public final void F(gb2 gb2Var) {
    }

    @Override // bb2
    public final void H2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void J(gb2 gb2Var) {
    }

    @Override // bb2
    public final void M1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void N0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void T(gb2 gb2Var) {
    }

    @Override // bb2
    public final void W(gb2 gb2Var) {
    }

    @Override // bb2
    public final void X0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void X1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void Y(k27 k27Var) {
    }

    @Override // bb2
    public final void Y1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void c1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void d0(int i) {
    }

    @Override // bb2
    public final void e2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void j0(k27 k27Var) {
    }

    @Override // bb2
    public final void l0(String str) {
    }

    @Override // bb2
    public final void l1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void n1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void q(gb2 gb2Var) {
    }

    @Override // bb2
    public final void q1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void r0(gb2 gb2Var) {
    }

    @Override // bb2
    public final void v2(gb2 gb2Var) {
    }

    @Override // bb2
    public final void x1(gb2 gb2Var) {
    }

    @Override // bb2
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override // bb2
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override // bb2
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override // bb2
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override // bb2
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // bb2
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // bb2
    public final void b2(String str, String str2) {
    }

    @Override // bb2
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override // bb2
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // bb2
    public final void m0(gb2 gb2Var, int i) {
    }

    @Override // bb2
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // bb2
    public final void A(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override // bb2
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // bb2
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // bb2
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override // bb2
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void s2(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override // bb2
    public final void w0(gb2 gb2Var, int i, int i2) {
    }

    @Override // bb2
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override // bb2
    public final void A0(gb2 gb2Var, float f, float f2, boolean z) {
    }

    @Override // bb2
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // bb2
    public final void c0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // bb2
    public final void N(gb2 gb2Var, int i, float f, float f2, boolean z) {
    }

    @Override // bb2
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // bb2
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override // bb2
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
