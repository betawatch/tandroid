// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vi1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vi1(Object obj, Object obj2, boolean z, byte b) {
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
                hl.c3(new va7(obj2, (Object) tL_error, (Object) tLObject, obj, this.b, (byte) 6));
                break;
            case 1:
                hl.c3(new lg(obj2, this.b, (Object) tLObject, obj, (byte) 12));
                break;
            case 2:
                hl.c3(new va7(obj2, (Object) tL_error, (Object) tLObject, obj, this.b, (byte) 8));
                break;
            case 3:
                hl.c3(new lg(obj2, (Object) tLObject, obj, this.b, (byte) 16));
                break;
            case 4:
                hl.c3(new lg(obj2, (Object) tLObject, obj, this.b, (byte) 20));
                break;
            case 5:
                ck6 ck6Var = (ck6) obj2;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        while (i < tL_messages_exportedChatInvites.invites.size()) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i);
                                hl.c3(new rj6(ck6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                hl.c3(new rj6(ck6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
            case 6:
                hl.c3(new lg((ls6) obj2, tL_error, tLObject, (String) obj, this.b));
                break;
            case 7:
                hl.c3(new lg(obj2, (Object) tLObject, obj, this.b, (byte) 27));
                break;
            case 8:
                uc7 uc7Var = (uc7) obj2;
                uc7Var.getClass();
                hl.c3(new lg((Object) uc7Var, (Object) tLObject, this.b, obj, (byte) 29));
                break;
            case 9:
                hl.c3(new lb7(obj2, obj, (Object) tLObject, this.b, (byte) 1));
                break;
            case 10:
                hl.c3(new va7(obj2, (Object) tL_error, this.b, (Object) tLObject, obj, (byte) 16));
                break;
            case 11:
                sv9 sv9Var = (sv9) obj2;
                String str = (String) obj;
                zh6 zh6Var = sv9Var.h;
                ArrayList arrayList = sv9Var.g;
                int i2 = sv9Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    sv9Var.n = str.toLowerCase();
                    uc7.s1(i2).j4(tL_channels_channelParticipants.users, false);
                    uc7.s1(i2).c4(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    zh6Var.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = yac.h(i2).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    while (i < size) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        long B1 = r47.B1(channelParticipant.peer);
                        if (this.b || B1 != e) {
                            zh6Var.k(B1, channelParticipant);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 12:
                hl.c3(new lb7(obj2, obj, (Object) tLObject, this.b, (byte) 14));
                break;
            default:
                hl.c3(new lb7(obj2, (Object) tLObject, this.b, obj, (byte) 15));
                break;
        }
    }

    public /* synthetic */ vi1(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
