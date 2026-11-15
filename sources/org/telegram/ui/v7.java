package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v7(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((i8) this.b, tL_error, tLObject, (Calendar) this.c, 3));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new o1((oc) this.b, tLObject, (org.telegram.ui.ActionBar.i6) this.c, 10));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new o1((xd) this.b, tLObject, (Context) this.c, 13));
                break;
            case 3:
                an anVar = (an) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    org.telegram.messenger.g0.h3(new oe(anVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 6));
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.h3(new o1((an) this.b, tLObject, (TLRPC.User) this.c, 21));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((an) this.b, tLObject, tL_error, (org.telegram.messenger.vr) this.c, 9));
                break;
            case 6:
                an anVar2 = (an) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        org.telegram.messenger.g0.h3(new u5(29, anVar2, tL_error));
                        break;
                    }
                } else {
                    anVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new u5(28, anVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 7:
                org.telegram.messenger.g0.h3(new o1((dl) this.b, tLObject, (org.telegram.messenger.gj) this.c, 23));
                break;
            case 8:
                qn qnVar = (qn) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = qnVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    qnVar.getMessagesStorage().j2(qnVar.E0, false);
                }
                org.telegram.messenger.g0.h3(new ln(qnVar, 2));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new zg(11, (to) this.b, (org.telegram.ui.ActionBar.t1[]) this.c));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((mp) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 12));
                break;
            case 11:
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) this.b;
                org.telegram.messenger.ns.f(c5Var.e).d(new org.telegram.ui.Components.b5(c5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new ki.n((org.telegram.ui.Components.y7) this.b, (org.telegram.ui.ActionBar.t1) this.c, tLObject, 27));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.od(9, (org.telegram.ui.Components.ki) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.od(8, (org.telegram.ui.Components.ki) this.b, (org.telegram.ui.Components.di) this.c));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.yf((org.telegram.ui.Components.cp) this.b, tLObject, (org.telegram.ui.ActionBar.i6) this.c, 4));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(12, (org.telegram.ui.Components.zz) this.b, (Pair) this.c));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((org.telegram.ui.Components.zz) this.b, tL_error, tLObject, (org.telegram.messenger.z10) this.c, 24));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((org.telegram.ui.Components.k20) this.b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.c, 26));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((org.telegram.ui.Components.t70) this.b, (TLRPC.TL_chatInviteExported) this.c, tL_error, tLObject, 28));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.yf((org.telegram.ui.Components.te0) this.b, (org.telegram.ui.Components.se0) this.c, tLObject, 18));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.hh0((org.telegram.ui.Components.po0) this.b, tLObject, (Context) this.c, 6));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(this.b, tL_error, (Object) tLObject, this.c, 4));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(this.b, tL_error, (Object) tLObject, this.c, 5));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(this.b, this.c, (Object) tLObject, tL_error, 6));
                break;
            case 25:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(this.b, tL_error, (Object) tLObject, this.c, 8));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new tp((jx) this.b, tLObject, (org.telegram.messenger.gj) this.c, 4));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(16, (fy) this.b, (org.telegram.ui.ActionBar.t1) this.c));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(20, (hz) this.b, (org.telegram.ui.ActionBar.t1) this.c));
                break;
            default:
                org.telegram.messenger.g0.h3(new tp((bz) this.b, tL_error, (az) this.c, 8));
                break;
        }
    }
}
