package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rq(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        TLRPC.UserStatus userStatus4;
        switch (this.a) {
            case 0:
                pr prVar = (pr) this.c;
                prVar.getClass();
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ((TLObject) obj);
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) ((TLObject) obj2);
                long C1 = org.telegram.messenger.jj.C1(channelParticipant.peer);
                long C12 = org.telegram.messenger.jj.C1(channelParticipant2.peer);
                int i11 = this.b;
                int i12 = -100;
                if (C1 > 0) {
                    TLRPC.User Z1 = prVar.getMessagesController().Z1(Long.valueOf(org.telegram.messenger.jj.C1(channelParticipant.peer)));
                    i10 = (Z1 == null || (userStatus2 = Z1.status) == null) ? 0 : Z1.self ? i11 + 50000 : userStatus2.expires;
                } else {
                    i10 = -100;
                }
                if (C12 > 0) {
                    TLRPC.User Z12 = prVar.getMessagesController().Z1(Long.valueOf(org.telegram.messenger.jj.C1(channelParticipant2.peer)));
                    i12 = (Z12 == null || (userStatus = Z12.status) == null) ? 0 : Z12.self ? i11 + 50000 : userStatus.expires;
                }
                if (i10 <= 0 || i12 <= 0) {
                    if (i10 >= 0 || i12 >= 0) {
                        if ((i10 >= 0 || i12 <= 0) && (i10 != 0 || i12 == 0)) {
                            if ((i12 >= 0 || i10 <= 0) && (i12 != 0 || i10 == 0)) {
                            }
                        }
                    } else if (i10 <= i12) {
                        if (i10 < i12) {
                        }
                    }
                } else if (i10 <= i12) {
                    if (i10 < i12) {
                    }
                }
                break;
            default:
                org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.c;
                z20Var.getClass();
                TLRPC.User Z13 = org.telegram.messenger.vp.r1(z20Var.a).Z1(Long.valueOf(org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) ((TLObject) obj)).peer)));
                TLRPC.User Z14 = org.telegram.messenger.vp.r1(z20Var.a).Z1(Long.valueOf(org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) ((TLObject) obj2)).peer)));
                int i13 = this.b;
                int i14 = (Z13 == null || (userStatus4 = Z13.status) == null) ? 0 : Z13.self ? i13 + 50000 : userStatus4.expires;
                int i15 = (Z14 == null || (userStatus3 = Z14.status) == null) ? 0 : Z14.self ? i13 + 50000 : userStatus3.expires;
                if (i14 <= 0 || i15 <= 0) {
                    if (i14 >= 0 || i15 >= 0) {
                        if ((i14 >= 0 || i15 <= 0) && (i14 != 0 || i15 == 0)) {
                            if ((i15 >= 0 || i14 <= 0) && (i15 != 0 || i14 == 0)) {
                            }
                        }
                    } else if (i14 <= i15) {
                        if (i14 < i15) {
                        }
                    }
                } else if (i14 <= i15) {
                    if (i14 < i15) {
                    }
                }
                break;
        }
        return 0;
    }
}
