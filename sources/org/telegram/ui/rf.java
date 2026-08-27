package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ rf(rn rnVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final rn rnVar = this.b;
                    if (j10 != rnVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = rnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(rnVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        rnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.bh
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        rn rnVar2 = rnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            rnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            rnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            rnVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.ur(rnVar2, rnVar2.e, arrayList, arrayList2, channelParticipantArr2, rnVar2.H6, (int) rnVar2.b(), rnVar2.N3, true, new ag.l3(21)).show();
                                        break;
                                    default:
                                        rn rnVar3 = rnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            rnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            rnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            rnVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.ur(rnVar3, rnVar3.e, arrayList, arrayList2, channelParticipantArr3, rnVar3.H6, (int) rnVar3.b(), rnVar3.N3, true, new ag.l3(21)).show();
                                        break;
                                }
                            }
                        });
                        rnVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final rn rnVar2 = this.b;
                rnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != rnVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = rnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(rnVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    rnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.bh
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    rn rnVar22 = rnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        rnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        rnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        rnVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.ur(rnVar22, rnVar22.e, arrayList3, arrayList4, channelParticipantArr22, rnVar22.H6, (int) rnVar22.b(), rnVar22.N3, true, new ag.l3(21)).show();
                                    break;
                                default:
                                    rn rnVar3 = rnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        rnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        rnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        rnVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.ur(rnVar3, rnVar3.e, arrayList3, arrayList4, channelParticipantArr3, rnVar3.H6, (int) rnVar3.b(), rnVar3.N3, true, new ag.l3(21)).show();
                                    break;
                            }
                        }
                    });
                    rnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
