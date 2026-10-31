package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements org.telegram.ui.Components.ui0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.messenger.jj d;

    public /* synthetic */ xf(un unVar, boolean z10, org.telegram.messenger.jj jjVar, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = z10;
        this.d = jjVar;
    }

    @Override // org.telegram.ui.Components.ui0
    public final void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    final un unVar = this.b;
                    if (j10 != unVar.getUserConfig().e() && this.c) {
                        final ArrayList arrayList = new ArrayList(1);
                        arrayList.add(this.d);
                        TLObject d22 = unVar.getMessagesController().d2(j10);
                        final ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(d22);
                        final TLRPC.ChannelParticipant[] channelParticipantArr = new TLRPC.ChannelParticipant[1];
                        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                        tL_channels_getParticipant.channel = org.telegram.messenger.vp.h1(unVar.e);
                        tL_channels_getParticipant.participant = org.telegram.messenger.vp.j1(d22);
                        final int i10 = 1;
                        unVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new a3.b(1), new org.telegram.messenger.j20() { // from class: org.telegram.ui.yg
                            @Override // org.telegram.messenger.j20
                            public final void a(Object obj, Object obj2) {
                                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                                switch (i10) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr2 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            unVar2.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                                            unVar2.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr2[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            unVar2.getClass();
                                        }
                                        new org.telegram.ui.Components.vr(unVar2, unVar2.e, arrayList, arrayList2, channelParticipantArr2, unVar2.b7, (int) unVar2.b(), unVar2.f4, true, new org.telegram.messenger.rz(3)).show();
                                        break;
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr;
                                        if (tL_channels_channelParticipant != null) {
                                            unVar3.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                                            unVar3.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                                            channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                        } else {
                                            unVar3.getClass();
                                        }
                                        new org.telegram.ui.Components.vr(unVar3, unVar3.e, arrayList, arrayList2, channelParticipantArr3, unVar3.b7, (int) unVar3.b(), unVar3.f4, true, new org.telegram.messenger.rz(3)).show();
                                        break;
                                }
                            }
                        });
                        unVar.I7(true);
                        break;
                    }
                }
                break;
            default:
                final un unVar2 = this.b;
                unVar2.getClass();
                if (messagePeerReaction != null && messagePeerReaction.reaction != null && j10 != unVar2.getUserConfig().e() && this.c) {
                    final ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(this.d);
                    TLObject d23 = unVar2.getMessagesController().d2(j10);
                    final ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(d23);
                    final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[1];
                    TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                    tL_channels_getParticipant2.channel = org.telegram.messenger.vp.h1(unVar2.e);
                    tL_channels_getParticipant2.participant = org.telegram.messenger.vp.j1(d23);
                    final int i11 = 0;
                    unVar2.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant2, new a3.b(1), new org.telegram.messenger.j20() { // from class: org.telegram.ui.yg
                        @Override // org.telegram.messenger.j20
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                            switch (i11) {
                                case 0:
                                    un unVar22 = unVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr22 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        unVar22.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                                        unVar22.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr22[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        unVar22.getClass();
                                    }
                                    new org.telegram.ui.Components.vr(unVar22, unVar22.e, arrayList3, arrayList4, channelParticipantArr22, unVar22.b7, (int) unVar22.b(), unVar22.f4, true, new org.telegram.messenger.rz(3)).show();
                                    break;
                                default:
                                    un unVar3 = unVar2;
                                    TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    if (tL_channels_channelParticipant != null) {
                                        unVar3.getMessagesController().V3(tL_channels_channelParticipant.users, false);
                                        unVar3.getMessagesController().P3(tL_channels_channelParticipant.chats, false);
                                        channelParticipantArr3[0] = tL_channels_channelParticipant.participant;
                                    } else {
                                        unVar3.getClass();
                                    }
                                    new org.telegram.ui.Components.vr(unVar3, unVar3.e, arrayList3, arrayList4, channelParticipantArr3, unVar3.b7, (int) unVar3.b(), unVar3.f4, true, new org.telegram.messenger.rz(3)).show();
                                    break;
                            }
                        }
                    });
                    unVar2.I7(true);
                    break;
                }
                break;
        }
    }
}
