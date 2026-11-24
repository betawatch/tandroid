// default package

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qe2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qe2(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r6 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010d, code lost:
    
        if (r9 <= 0) goto L75;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        TLRPC.UserStatus userStatus4;
        byte b = this.a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                kf2 kf2Var = (kf2) obj3;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ((TLObject) obj);
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) ((TLObject) obj2);
                long B1 = k27.B1(channelParticipant.peer);
                long B12 = k27.B1(channelParticipant2.peer);
                int i3 = -100;
                if (B1 > 0) {
                    TLRPC.User V1 = kf2Var.getMessagesController().V1(Long.valueOf(k27.B1(channelParticipant.peer)));
                    i = (V1 == null || (userStatus2 = V1.status) == null) ? 0 : V1.self ? i2 + 50000 : userStatus2.expires;
                } else {
                    i = -100;
                }
                if (B12 > 0) {
                    TLRPC.User V12 = kf2Var.getMessagesController().V1(Long.valueOf(k27.B1(channelParticipant2.peer)));
                    i3 = (V12 == null || (userStatus = V12.status) == null) ? 0 : V12.self ? i2 + 50000 : userStatus.expires;
                }
                if (i <= 0 || i3 <= 0) {
                    if (i < 0) {
                        if (i3 < 0) {
                            if (i <= i3) {
                                if (i >= i3) {
                                }
                            }
                            break;
                        }
                        break;
                    }
                    if (i != 0 || i3 == 0) {
                        if ((i3 >= 0 || i <= 0) && (i3 != 0 || i == 0)) {
                        }
                    }
                } else if (i <= i3) {
                    if (i >= i3) {
                    }
                }
                break;
            default:
                rb5 rb5Var = (rb5) obj3;
                TLRPC.User V13 = na7.q1(rb5Var.a).V1(Long.valueOf(k27.B1(((TLRPC.ChannelParticipant) ((TLObject) obj)).peer)));
                TLRPC.User V14 = na7.q1(rb5Var.a).V1(Long.valueOf(k27.B1(((TLRPC.ChannelParticipant) ((TLObject) obj2)).peer)));
                int i4 = (V13 == null || (userStatus4 = V13.status) == null) ? 0 : V13.self ? i2 + 50000 : userStatus4.expires;
                int i5 = (V14 == null || (userStatus3 = V14.status) == null) ? 0 : V14.self ? i2 + 50000 : userStatus3.expires;
                if (i4 <= 0 || i5 <= 0) {
                    if (i4 < 0) {
                        if (i5 < 0) {
                            if (i4 <= i5) {
                                if (i4 >= i5) {
                                }
                            }
                            break;
                        }
                        break;
                    }
                    if (i4 != 0 || i5 == 0) {
                        if ((i5 >= 0 || i4 <= 0) && (i5 != 0 || i4 == 0)) {
                        }
                    }
                } else if (i4 <= i5) {
                    if (i4 >= i5) {
                    }
                }
                break;
        }
        return 1;
    }
}
