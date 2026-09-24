package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf implements org.telegram.ui.Components.zj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ zf(wn wnVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.zj0
    public final void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final wn wnVar = this.b;
                    if (j3 != wnVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = wnVar.getMessagesController().getUserOrChat(j3);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(wnVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        wnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.hh
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        wn wnVar2 = wnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            wnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            wnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            wnVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.gs(wnVar2, wnVar2.e, arrayList, arrayList2, channelParticipantArr2, wnVar2.L6, (int) wnVar2.d(), wnVar2.R3, true, new ai.f(17)).show();
                                        break;
                                    default:
                                        wn wnVar3 = wnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            wnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            wnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            wnVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.gs(wnVar3, wnVar3.e, arrayList, arrayList2, channelParticipantArr3, wnVar3.L6, (int) wnVar3.d(), wnVar3.R3, true, new ai.f(17)).show();
                                        break;
                                }
                            }
                        });
                        wnVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final wn wnVar2 = this.b;
                wnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j3 != wnVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = wnVar2.getMessagesController().getUserOrChat(j3);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(wnVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    wnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.hh
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    wn wnVar22 = wnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        wnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        wnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        wnVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.gs(wnVar22, wnVar22.e, arrayList3, arrayList4, channelParticipantArr22, wnVar22.L6, (int) wnVar22.d(), wnVar22.R3, true, new ai.f(17)).show();
                                    break;
                                default:
                                    wn wnVar3 = wnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        wnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        wnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        wnVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.gs(wnVar3, wnVar3.e, arrayList3, arrayList4, channelParticipantArr3, wnVar3.L6, (int) wnVar3.d(), wnVar3.R3, true, new ai.f(17)).show();
                                    break;
                            }
                        }
                    });
                    wnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
