package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements org.telegram.ui.Components.xj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ xf(zn znVar, boolean z4, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = z4;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.Components.xj0
    public final void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final zn znVar = this.b;
                    if (j10 != znVar.getUserConfig().getClientUserId() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject userOrChat = znVar.getMessagesController().getUserOrChat(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(userOrChat);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = MessagesController.getInputChannel(znVar.e);
                        tL_channels_getParticipant.participant = MessagesController.getInputPeer(userOrChat);
                        final int i10 = 1;
                        znVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.fh
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        zn znVar2 = znVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            znVar2.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            znVar2.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            znVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.ds(znVar2, znVar2.e, arrayList, arrayList2, channelParticipantArr2, znVar2.I6, (int) znVar2.d(), znVar2.O3, true, new cg.n0(20)).show();
                                        break;
                                    default:
                                        zn znVar3 = znVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            znVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                            znVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            znVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.ds(znVar3, znVar3.e, arrayList, arrayList2, channelParticipantArr3, znVar3.I6, (int) znVar3.d(), znVar3.O3, true, new cg.n0(20)).show();
                                        break;
                                }
                            }
                        });
                        znVar.A7(true);
                        break;
                    }
                }
                break;
            default:
                final zn znVar2 = this.b;
                znVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != znVar2.getUserConfig().getClientUserId() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject userOrChat2 = znVar2.getMessagesController().getUserOrChat(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(userOrChat2);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = MessagesController.getInputChannel(znVar2.e);
                    tL_channels_getParticipant2.participant = MessagesController.getInputPeer(userOrChat2);
                    final int i11 = 0;
                    znVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.fh
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    zn znVar22 = znVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        znVar22.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        znVar22.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        znVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.ds(znVar22, znVar22.e, arrayList3, arrayList4, channelParticipantArr22, znVar22.I6, (int) znVar22.d(), znVar22.O3, true, new cg.n0(20)).show();
                                    break;
                                default:
                                    zn znVar3 = znVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        znVar3.getMessagesController().putUsers(tL_channels_channelParticipant.users, false);
                                        znVar3.getMessagesController().putChats(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        znVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.ds(znVar3, znVar3.e, arrayList3, arrayList4, channelParticipantArr3, znVar3.I6, (int) znVar3.d(), znVar3.O3, true, new cg.n0(20)).show();
                                    break;
                            }
                        }
                    });
                    znVar2.A7(true);
                    break;
                }
                break;
        }
    }
}
