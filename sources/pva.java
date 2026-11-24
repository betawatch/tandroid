// default package

import android.util.Pair;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pva implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ pva(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x014e, code lost:
    
        if (r5 > r3) goto L72;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return (int) (((wva) obj2).d - ((wva) obj).d);
            case 1:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 2:
                akb akbVar = (akb) obj;
                akb akbVar2 = (akb) obj2;
                if (akbVar.b == null && akbVar.d == null) {
                    return -1;
                }
                if (akbVar2.b == null && akbVar2.d == null) {
                    return 1;
                }
                return akbVar.a.compareTo(akbVar2.a);
            case 3:
                zjb zjbVar = (zjb) obj;
                zjb zjbVar2 = (zjb) obj2;
                if (!bkb.j1(zjbVar)) {
                    if (!bkb.j1(zjbVar2)) {
                        ?? r5 = zjbVar.z;
                        ?? r3 = zjbVar2.z;
                        if (r5 == r3) {
                            int i = zjbVar.a;
                            int i2 = zjbVar2.a;
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
            case 4:
                return Integer.compare(((akb) obj).W, ((akb) obj2).W);
            case 5:
                return String.valueOf(lve.c(((Integer) obj).intValue())).compareTo(String.valueOf(lve.c(((Integer) obj2).intValue())));
            case 6:
                return (int) (((fob) obj2).e - ((fob) obj).e);
            case 7:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 8:
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
            case 9:
                long j = y6c.h(((Integer) obj).intValue()).Z;
                long j2 = y6c.h(((Integer) obj2).intValue()).Z;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 10:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 11:
                long j3 = y6c.h(((Integer) obj).intValue()).Z;
                long j4 = y6c.h(((Integer) obj2).intValue()).Z;
                if (j3 > j4) {
                    return 1;
                }
                return j3 < j4 ? -1 : 0;
            case 12:
                return Integer.compare(((xuc) obj).a.b, ((xuc) obj2).a.b);
            case 13:
                return Long.compare(((wuc) obj).b, ((wuc) obj2).b);
            default:
                return Long.compare(((svc) obj2).y, ((svc) obj).y);
        }
    }
}
