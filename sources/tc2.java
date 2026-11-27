// default package

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class tc2 implements Runnable {
    public final /* synthetic */ vc2 a;

    public tc2(vc2 vc2Var) {
        this.a = vc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        vc2 vc2Var = this.a;
        zh6 zh6Var = vc2Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = 0;
        boolean z = false;
        while (i2 < zh6Var.m()) {
            long j = zh6Var.j(i2);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) zh6Var.f(j)).lastSpeakTime >= 500) {
                zh6Var.l(j);
                k5 k5Var = vc2Var.C;
                if (j > 0) {
                    TLRPC.User X1 = uc7.s1(k5Var.a).X1(Long.valueOf(j));
                    bs2.x(ik8.o(j, "remove from speaking ", " "), X1 != null ? X1.first_name : null, "GroupCall");
                    i = i2;
                } else {
                    uc7 s1 = uc7.s1(k5Var.a);
                    i = i2;
                    TLRPC.Chat M0 = s1.M0(Long.valueOf(-j));
                    bs2.x(ik8.o(j, "remove from speaking ", " "), M0 != null ? M0.title : null, "GroupCall");
                }
                i2 = i - 1;
                z = true;
            }
            i2++;
        }
        if (zh6Var.m() > 0) {
            hl.d3(vc2Var.Q, 550L);
        }
        if (z) {
            jn7.f(vc2Var.C.a).k(jn7.y2, Long.valueOf(vc2Var.c), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
        }
    }
}
