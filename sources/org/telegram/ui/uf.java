package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements org.telegram.ui.Components.ok0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ uf(un unVar, boolean z10, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = z10;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final un unVar = this.b;
                    if (j10 != unVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = unVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(unVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        unVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.xg
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            unVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            unVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            unVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.rs(unVar2, unVar2.e, arrayList, arrayList2, channelParticipantArr2, unVar2.X6, (int) unVar2.b(), unVar2.d4, true, new ag.c(24)).show();
                                        break;
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            unVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            unVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            unVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.rs(unVar3, unVar3.e, arrayList, arrayList2, channelParticipantArr3, unVar3.X6, (int) unVar3.b(), unVar3.d4, true, new ag.c(24)).show();
                                        break;
                                }
                            }
                        });
                        unVar.H7(true);
                        break;
                    }
                }
                break;
            default:
                final un unVar2 = this.b;
                unVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != unVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = unVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(unVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    unVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.xg
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    un unVar22 = unVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        unVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        unVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        unVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.rs(unVar22, unVar22.e, arrayList3, arrayList4, channelParticipantArr22, unVar22.X6, (int) unVar22.b(), unVar22.d4, true, new ag.c(24)).show();
                                    break;
                                default:
                                    un unVar3 = unVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        unVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        unVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        unVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.rs(unVar3, unVar3.e, arrayList3, arrayList4, channelParticipantArr3, unVar3.X6, (int) unVar3.b(), unVar3.d4, true, new ag.c(24)).show();
                                    break;
                            }
                        }
                    });
                    unVar2.H7(true);
                    break;
                }
                break;
        }
    }
}
