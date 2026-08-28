package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rc(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((vc) this.b, tLObject, (org.telegram.ui.ActionBar.e6) this.c, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((fe) this.b, tLObject, (Context) this.c, 12));
                break;
            case 2:
                qn qnVar = (qn) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new ve(qnVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new t1((qn) this.b, tLObject, (TLRPC.User) this.c, 20));
                break;
            case 4:
                qn qnVar2 = (qn) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new rd(11, qnVar2, tL_error));
                        break;
                    }
                } else {
                    qnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rd(10, qnVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new k6((qn) this.b, tLObject, tL_error, (MessagesStorage) this.c, 8));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new t1((sl) this.b, tLObject, (MessageObject) this.c, 23));
                break;
            case 7:
                ho hoVar = (ho) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = hoVar.A0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    hoVar.getMessagesStorage().updateUserInfo(hoVar.A0, false);
                }
                AndroidUtilities.runOnUIThread(new bo(hoVar, 2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new rd(23, (hp) this.b, (org.telegram.ui.ActionBar.c2[]) this.c));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new k6((bq) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 11));
                break;
            case 10:
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) this.b;
                NotificationCenter.getInstance(g5Var.e).doOnIdle(new org.telegram.ui.Components.f5(g5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((org.telegram.ui.Components.c8) this.b, (org.telegram.ui.ActionBar.c2) this.c, tLObject, 12));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new wq(14, (org.telegram.ui.Components.ki) this.b, (org.telegram.ui.Components.di) this.c));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new wq(15, (org.telegram.ui.Components.ki) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((org.telegram.ui.Components.ap) this.b, tLObject, (org.telegram.ui.ActionBar.e6) this.c, 18));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zq(16, (org.telegram.ui.Components.n00) this.b, (Pair) this.c));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new k6((org.telegram.ui.Components.n00) this.b, tL_error, tLObject, (Utilities.Callback) this.c, 21));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new k6((org.telegram.ui.Components.b30) this.b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 23));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new k6((org.telegram.ui.Components.e80) this.b, (TLRPC.TL_chatInviteExported) this.c, tL_error, tLObject, 25));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue0((org.telegram.ui.Components.ag0) this.b, (org.telegram.ui.Components.zf0) this.c, tLObject, 1));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jg0((org.telegram.ui.Components.rp0) this.b, tLObject, (Context) this.c, 11));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((org.telegram.ui.Components.cx0) this.b, tL_error, tLObject, (MediaDataController) this.c, 1));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((or0) this.b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.c, 2));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((org.telegram.ui.Components.mz0) this.b, (org.telegram.ui.ActionBar.c2) this.c, tLObject, tL_error, 3));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((org.telegram.ui.Components.z21) this.b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.c, 5));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new jq((py) this.b, tLObject, (MessageObject) this.c, 4));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(19, (jz) this.b, (org.telegram.ui.ActionBar.c2) this.c));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(23, (n00) this.b, (org.telegram.ui.ActionBar.c2) this.c));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new jq((g00) this.b, tL_error, (f00) this.c, 8));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(25, (FiltersSetupActivity) this.b, (TLRPC.TL_messages_toggleDialogFilterTags) this.c));
                break;
        }
    }
}
