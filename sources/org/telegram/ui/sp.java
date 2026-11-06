package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sp(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        TLRPC.UserStatus userStatus4;
        switch (this.a) {
            case 0:
                oq oqVar = (oq) this.c;
                oqVar.getClass();
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ((TLObject) obj);
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) ((TLObject) obj2);
                long C1 = org.telegram.messenger.ij.C1(channelParticipant.peer);
                long C12 = org.telegram.messenger.ij.C1(channelParticipant2.peer);
                int i10 = this.b;
                int i11 = -100;
                if (C1 > 0) {
                    TLRPC.User a22 = oqVar.getMessagesController().a2(Long.valueOf(org.telegram.messenger.ij.C1(channelParticipant.peer)));
                    i7 = (a22 == null || (userStatus2 = a22.status) == null) ? 0 : a22.self ? i10 + 50000 : userStatus2.expires;
                } else {
                    i7 = -100;
                }
                if (C12 > 0) {
                    TLRPC.User a23 = oqVar.getMessagesController().a2(Long.valueOf(org.telegram.messenger.ij.C1(channelParticipant2.peer)));
                    i11 = (a23 == null || (userStatus = a23.status) == null) ? 0 : a23.self ? i10 + 50000 : userStatus.expires;
                }
                if (i7 <= 0 || i11 <= 0) {
                    if (i7 >= 0 || i11 >= 0) {
                        if ((i7 >= 0 || i11 <= 0) && (i7 != 0 || i11 == 0)) {
                            if ((i11 >= 0 || i7 <= 0) && (i11 != 0 || i7 == 0)) {
                            }
                        }
                    } else if (i7 <= i11) {
                        if (i7 < i11) {
                        }
                    }
                } else if (i7 <= i11) {
                    if (i7 < i11) {
                    }
                }
                break;
            default:
                org.telegram.ui.Components.h20 h20Var = (org.telegram.ui.Components.h20) this.c;
                h20Var.getClass();
                TLRPC.User a24 = org.telegram.messenger.qp.s1(h20Var.a).a2(Long.valueOf(org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) ((TLObject) obj)).peer)));
                TLRPC.User a25 = org.telegram.messenger.qp.s1(h20Var.a).a2(Long.valueOf(org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) ((TLObject) obj2)).peer)));
                int i12 = this.b;
                int i13 = (a24 == null || (userStatus4 = a24.status) == null) ? 0 : a24.self ? i12 + 50000 : userStatus4.expires;
                int i14 = (a25 == null || (userStatus3 = a25.status) == null) ? 0 : a25.self ? i12 + 50000 : userStatus3.expires;
                if (i13 <= 0 || i14 <= 0) {
                    if (i13 >= 0 || i14 >= 0) {
                        if ((i13 >= 0 || i14 <= 0) && (i13 != 0 || i14 == 0)) {
                            if ((i14 >= 0 || i13 <= 0) && (i14 != 0 || i13 == 0)) {
                            }
                        }
                    } else if (i13 <= i14) {
                        if (i13 < i14) {
                        }
                    }
                } else if (i13 <= i14) {
                    if (i13 < i14) {
                    }
                }
                break;
        }
        return 0;
    }
}
