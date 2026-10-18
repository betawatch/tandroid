package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xc(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((bd) this.b, tLObject, (org.telegram.ui.ActionBar.g6) this.c, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((ke) this.b, tLObject, (Context) this.c, 12));
                break;
            case 2:
                sn snVar = (sn) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new df(snVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new t1((sn) this.b, tLObject, (TLRPC.User) this.c, 21));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((sn) this.b, tLObject, tL_error, (MessagesStorage) this.c, 13));
                break;
            case 5:
                sn snVar2 = (sn) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new gh(2, snVar2, tL_error));
                        break;
                    }
                } else {
                    snVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new gh(1, snVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new t1((vl) this.b, tLObject, (MessageObject) this.c, 23));
                break;
            case 7:
                ko koVar = (ko) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = koVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    koVar.getMessagesStorage().updateUserInfo(koVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new eo(koVar, 2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new gh(14, (kp) this.b, (org.telegram.ui.ActionBar.b2[]) this.c));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((dq) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 16));
                break;
            case 10:
                org.telegram.ui.Components.n5 n5Var = (org.telegram.ui.Components.n5) this.b;
                NotificationCenter.getInstance(n5Var.e).doOnIdle(new org.telegram.ui.Components.m5(n5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ig.e2((org.telegram.ui.Components.k8) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(6, (org.telegram.ui.Components.ti) this.b, (org.telegram.ui.Components.mi) this.c));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(7, (org.telegram.ui.Components.ti) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.up) this.b, tLObject, (org.telegram.ui.ActionBar.g6) this.c, 3));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yt(11, (org.telegram.ui.Components.k10) this.b, (Pair) this.c));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.k10) this.b, tL_error, tLObject, (Utilities.Callback) this.c, 26));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.Components.a40) this.b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 28));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((org.telegram.ui.Components.q90) this.b, (TLRPC.TL_chatInviteExported) this.c, tL_error, tLObject, 0));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg((org.telegram.ui.Components.kh0) this.b, (org.telegram.ui.Components.jh0) this.c, tLObject, 17));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.go0((org.telegram.ui.Components.dr0) this.b, tLObject, (Context) this.c, 5));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(this.b, tL_error, tLObject, this.c, 6));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(this.b, tL_error, tLObject, this.c, 7));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((KeyEvent.Callback) this.b, this.c, tLObject, tL_error, 8));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(this.b, tL_error, tLObject, this.c, 10));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new lq((qy) this.b, tLObject, (MessageObject) this.c, 4));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new nt(12, (lz) this.b, (org.telegram.ui.ActionBar.b2) this.c));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new nt(16, (p00) this.b, (org.telegram.ui.ActionBar.b2) this.c));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new lq((i00) this.b, tL_error, (h00) this.c, 8));
                break;
            default:
                AndroidUtilities.runOnUIThread(new nt(18, (FiltersSetupActivity) this.b, (TLRPC.TL_messages_toggleDialogFilterTags) this.c));
                break;
        }
    }
}
