// default package

import android.util.Pair;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zua implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ zua(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x014e, code lost:
    
        if (r5 > r3) goto L72;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
            case 1:
                return (int) (((zxa) obj2).d - ((zxa) obj).d);
            case 2:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 3:
                bmb bmbVar = (bmb) obj;
                bmb bmbVar2 = (bmb) obj2;
                if (bmbVar.b == null && bmbVar.d == null) {
                    return -1;
                }
                if (bmbVar2.b == null && bmbVar2.d == null) {
                    return 1;
                }
                return bmbVar.a.compareTo(bmbVar2.a);
            case 4:
                amb ambVar = (amb) obj;
                amb ambVar2 = (amb) obj2;
                if (!cmb.j1(ambVar)) {
                    if (!cmb.j1(ambVar2)) {
                        ?? r5 = ambVar.z;
                        ?? r3 = ambVar2.z;
                        if (r5 == r3) {
                            int i = ambVar.a;
                            int i2 = ambVar2.a;
                            if (r5 != 0) {
                                if (i <= i2) {
                                    if (i >= i2) {
                                        return 0;
                                    }
                                }
                            } else if (i <= i2) {
                                if (i >= i2) {
                                    return 0;
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            case 5:
                return Integer.compare(((bmb) obj).W, ((bmb) obj2).W);
            case 6:
                return String.valueOf(nxe.c(((Integer) obj).intValue())).compareTo(String.valueOf(nxe.c(((Integer) obj2).intValue())));
            case 7:
                return (int) (((gqb) obj2).e - ((gqb) obj).e);
            case 8:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 9:
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj2;
                boolean z = tL_forumTopic.hidden;
                if (z == tL_forumTopic2.hidden) {
                    boolean z2 = tL_forumTopic.pinned;
                    boolean z3 = tL_forumTopic2.pinned;
                    if (z2 == z3) {
                        if (z2 && z3) {
                            return tL_forumTopic.pinnedOrder - tL_forumTopic2.pinnedOrder;
                        }
                        TLRPC.Message message = tL_forumTopic2.topMessage;
                        int i3 = message != null ? message.date : 0;
                        TLRPC.Message message2 = tL_forumTopic.topMessage;
                        return i3 - (message2 != null ? message2.date : 0);
                    }
                    if (z2) {
                        return -1;
                    }
                } else if (z) {
                    return -1;
                }
                return 1;
            case 10:
                long j = z8c.h(((Integer) obj).intValue()).Z;
                long j2 = z8c.h(((Integer) obj2).intValue()).Z;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 11:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 12:
                long j3 = z8c.h(((Integer) obj).intValue()).Z;
                long j4 = z8c.h(((Integer) obj2).intValue()).Z;
                if (j3 > j4) {
                    return 1;
                }
                return j3 < j4 ? -1 : 0;
            case 13:
                return Integer.compare(((ywc) obj).a.b, ((ywc) obj2).a.b);
            case 14:
                return Long.compare(((xwc) obj).b, ((xwc) obj2).b);
            default:
                return Long.compare(((txc) obj2).A, ((txc) obj).A);
        }
    }
}
