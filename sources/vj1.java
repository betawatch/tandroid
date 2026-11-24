// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vj1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vj1(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        byte b = this.a;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                gm.c3(new aa7(obj2, (Object) tL_error, (Object) tLObject, obj, this.b, (byte) 6));
                break;
            case 1:
                gm.c3(new rh(obj2, this.b, (Object) tLObject, obj, (byte) 12));
                break;
            case 2:
                gm.c3(new aa7(obj2, (Object) tL_error, (Object) tLObject, obj, this.b, (byte) 8));
                break;
            case 3:
                gm.c3(new rh(obj2, (Object) tLObject, obj, this.b, (byte) 16));
                break;
            case 4:
                gm.c3(new rh(obj2, (Object) tLObject, obj, this.b, (byte) 20));
                break;
            case 5:
                ak6 ak6Var = (ak6) obj2;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        while (i < tL_messages_exportedChatInvites.invites.size()) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i);
                                gm.c3(new oj6(ak6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                gm.c3(new oj6(ak6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
            case 6:
                gm.c3(new rh((hs6) obj2, tL_error, tLObject, (String) obj, this.b));
                break;
            case 7:
                gm.c3(new rh(obj2, (Object) tLObject, obj, this.b, (byte) 27));
                break;
            case 8:
                oc7 oc7Var = (oc7) obj2;
                oc7Var.getClass();
                gm.c3(new rh((Object) oc7Var, (Object) tLObject, this.b, obj, (byte) 29));
                break;
            case 9:
                gm.c3(new eb7(obj2, obj, (Object) tLObject, this.b, (byte) 1));
                break;
            case 10:
                gm.c3(new aa7(obj2, (Object) tL_error, this.b, (Object) tLObject, obj, (byte) 16));
                break;
            case 11:
                bu9 bu9Var = (bu9) obj2;
                String str = (String) obj;
                vh6 vh6Var = bu9Var.h;
                ArrayList arrayList = bu9Var.g;
                int i2 = bu9Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    bu9Var.n = str.toLowerCase();
                    oc7.r1(i2).d4(tL_channels_channelParticipants.users, false);
                    oc7.r1(i2).X3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    vh6Var.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = z8c.h(i2).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    while (i < size) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        long B1 = k47.B1(channelParticipant.peer);
                        if (this.b || B1 != e) {
                            vh6Var.k(channelParticipant, B1);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 12:
                gm.c3(new eb7(obj2, obj, (Object) tLObject, this.b, (byte) 14));
                break;
            default:
                gm.c3(new eb7(obj2, (Object) tLObject, this.b, obj, (byte) 15));
                break;
        }
    }

    public /* synthetic */ vj1(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
