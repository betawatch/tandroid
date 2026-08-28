package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements org.telegram.ui.Components.dj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ rf(qn qnVar, boolean z10, MessageObject messageObject, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.dj0
    public final void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final qn qnVar = this.b;
                    if (j10 != qnVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = qnVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(qnVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i9 = 1;
                        qnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.zg
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i9) {
                                    case 0:
                                        qn qnVar2 = qnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            qnVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            qnVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            qnVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.wr(qnVar2, qnVar2.e, arrayList, arrayList2, channelParticipantArr2, qnVar2.H6, (int) qnVar2.b(), qnVar2.N3, true, new bg.d2(22)).show();
                                        break;
                                    default:
                                        qn qnVar3 = qnVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            qnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            qnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            qnVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.wr(qnVar3, qnVar3.e, arrayList, arrayList2, channelParticipantArr3, qnVar3.H6, (int) qnVar3.b(), qnVar3.N3, true, new bg.d2(22)).show();
                                        break;
                                }
                            }
                        });
                        qnVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final qn qnVar2 = this.b;
                qnVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != qnVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = qnVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(qnVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i10 = 0;
                    qnVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.zg
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i10) {
                                case 0:
                                    qn qnVar22 = qnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        qnVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        qnVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        qnVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.wr(qnVar22, qnVar22.e, arrayList3, arrayList4, channelParticipantArr22, qnVar22.H6, (int) qnVar22.b(), qnVar22.N3, true, new bg.d2(22)).show();
                                    break;
                                default:
                                    qn qnVar3 = qnVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        qnVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        qnVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        qnVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.wr(qnVar3, qnVar3.e, arrayList3, arrayList4, channelParticipantArr3, qnVar3.H6, (int) qnVar3.b(), qnVar3.N3, true, new bg.d2(22)).show();
                                    break;
                            }
                        }
                    });
                    qnVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
