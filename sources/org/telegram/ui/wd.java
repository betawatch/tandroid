package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wd(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new ag.n0((le) this.c, tL_error, tLObject, (TwoStepVerificationActivity) this.d, this.b, 5));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new kp((org.telegram.ui.Components.rw0) this.c, tLObject, this.b, (org.telegram.ui.ActionBar.x1) this.d, 4));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new ag.n0((ox) this.c, tL_error, tLObject, (String) this.d, this.b, 11));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new kp((b50) this.c, tLObject, (TLRPC.ChatFull) this.d, this.b, 6));
                break;
            case 4:
                kg0 kg0Var = (kg0) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i10);
                                TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                org.telegram.messenger.i0.g3(new xf0(kg0Var, tL_chatInviteExported3, tL_error, tLObject, this.b, 0));
                                break;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                TLRPC.TL_chatInviteExported tL_chatInviteExported32 = tL_chatInviteExported;
                org.telegram.messenger.i0.g3(new xf0(kg0Var, tL_chatInviteExported32, tL_error, tLObject, this.b, 0));
            case 5:
                org.telegram.messenger.i0.g3(new ag.n0((sm0) this.c, tL_error, this.b, tLObject, (String) this.d, 13));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new kp((rh.v5) this.c, (int[]) this.d, tLObject, this.b, 13));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new kp((vh.e1) this.c, tLObject, (String) this.d, this.b, 15));
                break;
            default:
                zf.m1 m1Var = (zf.m1) this.c;
                String str = (String) this.d;
                a0.h hVar = m1Var.h;
                ArrayList arrayList = m1Var.g;
                int i11 = m1Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    m1Var.n = str.toLowerCase();
                    org.telegram.messenger.vp.r1(i11).V3(tL_channels_channelParticipants.users, false);
                    org.telegram.messenger.vp.r1(i11).P3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    hVar.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = org.telegram.messenger.d20.i(i11).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                        long C1 = org.telegram.messenger.jj.C1(channelParticipant.peer);
                        if (this.b || C1 != e) {
                            hVar.k(channelParticipant, C1);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wd(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
