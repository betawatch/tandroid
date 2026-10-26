package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z7(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4.v0((n8) this.b, tL_error, tLObject, (Calendar) this.c, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new q1((zc) this.b, tLObject, (org.telegram.ui.ActionBar.x6) this.c, 10));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new q1((ke) this.b, tLObject, (Context) this.c, 13));
                break;
            case 3:
                un unVar = (un) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new ze(unVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new q1((un) this.b, tLObject, (TLRPC.User) this.c, 20));
                break;
            case 5:
                un unVar2 = (un) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new ed(13, unVar2, tL_error));
                        break;
                    }
                } else {
                    unVar2.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ed(12, unVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new m4.v0((un) this.b, tLObject, tL_error, (MessagesStorage) this.c, 16));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new q1((vl) this.b, tLObject, (MessageObject) this.c, 23));
                break;
            case 8:
                mo moVar = (mo) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = moVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    moVar.getMessagesStorage().updateUserInfo(moVar.D0, false);
                }
                AndroidUtilities.runOnUIThread(new go(moVar, 2));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ed(25, (np) this.b, (org.telegram.ui.ActionBar.e2[]) this.c));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new m4.v0((gq) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 19));
                break;
            case 11:
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) this.b;
                NotificationCenter.getInstance(p5Var.e).doOnIdle(new org.telegram.ui.Components.o5(p5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new jg.f1((org.telegram.ui.Components.m8) this.b, (org.telegram.ui.ActionBar.e2) this.c, tLObject, 28));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ip(17, (org.telegram.ui.Components.ti) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ip(18, (org.telegram.ui.Components.ti) this.b, (org.telegram.ui.Components.mi) this.c));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kg((org.telegram.ui.Components.wp) this.b, tLObject, (org.telegram.ui.ActionBar.x6) this.c, 4));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.so(21, (org.telegram.ui.Components.n10) this.b, (Pair) this.c));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new m4.v0((org.telegram.ui.Components.n10) this.b, tL_error, tLObject, (Utilities.Callback) this.c, 29));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.c40) this.b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 1));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.r90) this.b, (TLRPC.TL_chatInviteExported) this.c, tL_error, tLObject, 3));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kg((org.telegram.ui.Components.nh0) this.b, (org.telegram.ui.Components.mh0) this.c, tLObject, 18));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.t90((org.telegram.ui.Components.mr0) this.b, tLObject, (Context) this.c, 15));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.cz0) this.b, tL_error, tLObject, (MediaDataController) this.c, 9));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((es0) this.b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.c, 10));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.p11) this.b, (org.telegram.ui.ActionBar.e2) this.c, tLObject, tL_error, 11));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.Components.f51) this.b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.c, 13));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new nq((oy) this.b, tLObject, (MessageObject) this.c, 4));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c71(29, (jz) this.b, (org.telegram.ui.ActionBar.e2) this.c));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new sz(3, (o00) this.b, (org.telegram.ui.ActionBar.e2) this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new nq((h00) this.b, tL_error, (g00) this.c, 8));
                break;
        }
    }
}
