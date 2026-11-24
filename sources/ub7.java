// default package

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ub7 {
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

    public ub7() {
        int i = q;
        q = i + 1;
        this.o = i;
    }

    public final boolean a(j5 j5Var, long j) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(j5Var.a).R.f(j);
        if (dialog == null) {
            return false;
        }
        return b(j5Var, j, dialog, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if ((r13 instanceof org.telegram.tgnet.TLRPC.TL_dialogCommunity ? r3.U0(r13) == 0 && !r13.unread_mark && r13.unread_mentions_count == 0 : !r3.q2(r13)) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(j5 j5Var, long j, TLRPC.Dialog dialog, boolean z) {
        TLRPC.Chat L0;
        int i = j5Var.a;
        if (!oc7.r1(i).A2(j) && !this.i.contains(Long.valueOf(j))) {
            if (!this.h.contains(Long.valueOf(j))) {
                if (dialog.folder_id == 0 || (this.g & 128) == 0) {
                    oc7 r1 = oc7.r1(i);
                    bw2 r = bw2.r(i);
                    if ((this.g & 32) == 0 || !r1.o2(dialog.id, 0L, null) || dialog.unread_mentions_count != 0) {
                        if (!z && (this.g & 64) != 0) {
                        }
                        if (j > 0) {
                            TLRPC.User W1 = r1.W1(Long.valueOf(j));
                            if (W1 != null) {
                                if (!W1.bot) {
                                }
                            }
                        } else if (j < 0 && (L0 = r1.L0(Long.valueOf(-j))) != null) {
                            if (sd2.Y(L0)) {
                                int i2 = this.g;
                                int i3 = oc7.t5;
                                if ((i2 & i3) == i3) {
                                }
                            } else if (sd2.X(i, L0) || (!sd2.T(L0) || L0.megagroup ? (this.g & 4) == 0 : (this.g & 8) == 0)) {
                            }
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
        int i2 = oc7.s5;
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
        int i2 = oc7.s5;
        return (i & 1024) > 0;
    }
}
