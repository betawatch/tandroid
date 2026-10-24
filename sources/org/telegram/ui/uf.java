package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ uf(sn snVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final sn snVar = this.b;
                    if (j10 != snVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = snVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(snVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        snVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.xg
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        sn snVar2 = snVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            snVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            snVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            snVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.ps(snVar2, snVar2.e, arrayList, arrayList2, channelParticipantArr2, snVar2.X6, (int) snVar2.d(), snVar2.d4, true, new ah.j(22)).show();
                                        break;
                                    default:
                                        sn snVar3 = snVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            snVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            snVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            snVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.ps(snVar3, snVar3.e, arrayList, arrayList2, channelParticipantArr3, snVar3.X6, (int) snVar3.d(), snVar3.d4, true, new ah.j(22)).show();
                                        break;
                                }
                            }
                        });
                        snVar.D7(true);
                        break;
                    }
                }
                break;
            default:
                final sn snVar2 = this.b;
                snVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != snVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = snVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(snVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    snVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.xg
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    sn snVar22 = snVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        snVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        snVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        snVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.ps(snVar22, snVar22.e, arrayList3, arrayList4, channelParticipantArr22, snVar22.X6, (int) snVar22.d(), snVar22.d4, true, new ah.j(22)).show();
                                    break;
                                default:
                                    sn snVar3 = snVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        snVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        snVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        snVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.ps(snVar3, snVar3.e, arrayList3, arrayList4, channelParticipantArr3, snVar3.X6, (int) snVar3.d(), snVar3.d4, true, new ah.j(22)).show();
                                    break;
                            }
                        }
                    });
                    snVar2.D7(true);
                    break;
                }
                break;
        }
    }
}
