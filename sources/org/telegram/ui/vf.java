package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements org.telegram.ui.Components.zj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ vf(xn xnVar, boolean z4, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = z4;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.zj0
    public final void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final xn xnVar = this.b;
                    if (j10 != xnVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = xnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(xnVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        xnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.dh
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        xn xnVar2 = xnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            xnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            xnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            xnVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.gs(xnVar2, xnVar2.e, arrayList, arrayList2, channelParticipantArr2, xnVar2.I6, (int) xnVar2.b(), xnVar2.O3, true, new ag.f(22)).show();
                                        break;
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            xnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            xnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            xnVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.gs(xnVar3, xnVar3.e, arrayList, arrayList2, channelParticipantArr3, xnVar3.I6, (int) xnVar3.b(), xnVar3.O3, true, new ag.f(22)).show();
                                        break;
                                }
                            }
                        });
                        xnVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final xn xnVar2 = this.b;
                xnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != xnVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = xnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(xnVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    xnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.dh
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    xn xnVar22 = xnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        xnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        xnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        xnVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.gs(xnVar22, xnVar22.e, arrayList3, arrayList4, channelParticipantArr22, xnVar22.I6, (int) xnVar22.b(), xnVar22.O3, true, new ag.f(22)).show();
                                    break;
                                default:
                                    xn xnVar3 = xnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        xnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        xnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        xnVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.gs(xnVar3, xnVar3.e, arrayList3, arrayList4, channelParticipantArr3, xnVar3.I6, (int) xnVar3.b(), xnVar3.O3, true, new ag.f(22)).show();
                                    break;
                            }
                        }
                    });
                    xnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
