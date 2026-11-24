// default package

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t97 {
    public static int q = 10;
    public int a;
    public String b;
    public int d;
    public volatile int e;
    public int f;
    public int g;
    public int m;
    public boolean n;
    public final int o;
    public boolean p;
    public ArrayList c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public final LongSparseIntArray j = new LongSparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public t97() {
        int i = q;
        q = i + 1;
        this.o = i;
    }

    public final boolean a(j5 j5Var, long j) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(j5Var.a).R.f(j);
        if (dialog == null) {
            return false;
        }
        return b(j5Var, j, dialog, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if ((r13 instanceof org.telegram.tgnet.TLRPC.TL_dialogCommunity ? r3.T0(r13) == 0 && !r13.unread_mark && r13.unread_mentions_count == 0 : !r3.p2(r13)) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r0 & 128) == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(j5 j5Var, long j, TLRPC.Dialog dialog, boolean z) {
        TLRPC.Chat K0;
        if (!this.i.contains(Long.valueOf(j))) {
            if (!this.h.contains(Long.valueOf(j))) {
                if (dialog.folder_id != 0) {
                    int i = this.g;
                    int i2 = na7.q5;
                }
                int i3 = j5Var.a;
                na7 q1 = na7.q1(i3);
                qu2 r = qu2.r(i3);
                if ((this.g & 32) == 0 || !q1.n2(dialog.id, 0L, null) || dialog.unread_mentions_count != 0) {
                    if (!z && (this.g & 64) != 0) {
                    }
                    if (j > 0) {
                        TLRPC.User V1 = q1.V1(Long.valueOf(j));
                        if (V1 != null) {
                            if (!V1.bot) {
                            }
                        }
                    } else if (j < 0 && (K0 = q1.K0(Long.valueOf(-j))) != null) {
                        if (hc2.Y(K0)) {
                            int i4 = this.g;
                            int i5 = na7.r5;
                            if ((i4 & i5) == i5) {
                            }
                        } else if (hc2.X(i3, K0) || (!hc2.T(K0) || K0.megagroup ? (this.g & 4) == 0 : (this.g & 8) == 0)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i = this.g;
        int i2 = na7.q5;
        return (i & 512) > 0;
    }

    public final boolean d() {
        return this.a == 0;
    }

    public final boolean e() {
        if (!c()) {
            return false;
        }
        int i = this.g;
        int i2 = na7.q5;
        return (i & 1024) > 0;
    }
}
