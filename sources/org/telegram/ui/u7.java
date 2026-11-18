package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u7(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((i8) this.b, tL_error, tLObject, (Calendar) this.c, 7));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new o1((oc) this.b, tLObject, (org.telegram.ui.ActionBar.m6) this.c, 10));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new o1((xd) this.b, tLObject, (Context) this.c, 13));
                break;
            case 3:
                bn bnVar = (bn) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    org.telegram.messenger.g0.g3(new re(bnVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 6));
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.g3(new o1((bn) this.b, tLObject, (TLRPC.User) this.c, 21));
                break;
            case 5:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((bn) this.b, tLObject, tL_error, (org.telegram.messenger.tr) this.c, 13));
                break;
            case 6:
                bn bnVar2 = (bn) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        org.telegram.messenger.g0.g3(new k9(25, bnVar2, tL_error));
                        break;
                    }
                } else {
                    bnVar2.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new k9(24, bnVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 7:
                org.telegram.messenger.g0.g3(new o1((el) this.b, tLObject, (org.telegram.messenger.fj) this.c, 23));
                break;
            case 8:
                rn rnVar = (rn) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = rnVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    rnVar.getMessagesStorage().j2(rnVar.E0, false);
                }
                org.telegram.messenger.g0.g3(new mn(rnVar, 2));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new ci(7, (vo) this.b, (org.telegram.ui.ActionBar.u1[]) this.c));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((np) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 16));
                break;
            case 11:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) this.b;
                org.telegram.messenger.ks.f(k5Var.e).d(new org.telegram.ui.Components.j5(k5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.k7((org.telegram.ui.Components.g8) this.b, (org.telegram.ui.ActionBar.u1) this.c, tLObject, 0));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.mg(5, (org.telegram.ui.Components.si) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.mg(4, (org.telegram.ui.Components.si) this.b, (org.telegram.ui.Components.li) this.c));
                break;
            case 15:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.k7(this.b, tLObject, this.c, 7));
                break;
            case 16:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.dw(8, (org.telegram.ui.Components.g00) this.b, (Pair) this.c));
                break;
            case 17:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((org.telegram.ui.Components.g00) this.b, tL_error, tLObject, (org.telegram.messenger.x10) this.c, 28));
                break;
            case 18:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((org.telegram.ui.Components.s20) this.b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 0));
                break;
            case 19:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((org.telegram.ui.Components.e80) this.b, (TLRPC.TL_chatInviteExported) this.c, tL_error, tLObject));
                break;
            case 20:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.k7((org.telegram.ui.Components.df0) this.b, (org.telegram.ui.Components.cf0) this.c, tLObject, 21));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.hn0((org.telegram.ui.Components.yo0) this.b, tLObject, (Context) this.c, 2));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((org.telegram.ui.Components.iw0) this.b, tL_error, tLObject, (org.telegram.messenger.ri) this.c, 8));
                break;
            case 23:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((qo0) this.b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.c, 9));
                break;
            case 24:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((KeyEvent.Callback) this.b, this.c, tLObject, tL_error, 10));
                break;
            case 25:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((org.telegram.ui.Components.y21) this.b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.c, 12));
                break;
            case 26:
                org.telegram.messenger.g0.g3(new up((nx) this.b, tLObject, (org.telegram.messenger.fj) this.c, 4));
                break;
            case 27:
                org.telegram.messenger.g0.g3(new vs(11, (iy) this.b, (org.telegram.ui.ActionBar.u1) this.c));
                break;
            case 28:
                org.telegram.messenger.g0.g3(new vs(15, (kz) this.b, (org.telegram.ui.ActionBar.u1) this.c));
                break;
            default:
                org.telegram.messenger.g0.g3(new up((ez) this.b, tL_error, (dz) this.c, 8));
                break;
        }
    }
}
