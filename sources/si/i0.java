package si;

import ai.o3;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import w7.m7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i0(xc xcVar, boolean z10, TLRPC.Chat chat, g6 g6Var) {
        this.c = xcVar;
        this.b = z10;
        this.d = chat;
        this.e = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        long j10;
        int i10;
        File file;
        String string;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.c;
                w wVar = (w) this.d;
                q0 q0Var = (q0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    File file2 = wVar.a;
                    long e = m7.e(file2) / 1000;
                    u0Var.m.b("active output finalized: size=" + file2.length() + ", durationMs=" + e + ", elapsedMs=" + u0.f(nanoTime));
                    u0Var.g();
                    long j11 = u0Var.o;
                    if (e > j11) {
                        z10 = true;
                        j10 = j11;
                        i10 = 1;
                    } else {
                        z10 = false;
                        j10 = j11;
                        i10 = 1;
                    }
                    long j12 = j10;
                    boolean z11 = this.b;
                    if (z11 && !z10) {
                        try {
                            u0Var.k.execute(new g0(u0Var, q0Var, wVar.a, e, true));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            u0Var = u0Var;
                            u0Var.i.post(new e0(u0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = wVar.a;
                    try {
                        long min = Math.min(j12, e);
                        int i11 = z10 ? i10 : 2;
                        file = file3;
                        try {
                            u0Var.s(file, 0L, min, z11, i11);
                            m7.c(file);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            m7.c(file);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file = file3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            default:
                xc xcVar = (xc) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                g6 g6Var = (g6) this.e;
                int i12 = R.raw.star_premium_2;
                boolean z12 = this.b;
                String string2 = z12 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z12) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                qc M = xcVar.M(string2, AndroidUtilities.replaceSingleTag(string, k6.Gi, 0, new o3(chat), g6Var), i12);
                M.j = 5000;
                M.j();
                return;
        }
    }

    public /* synthetic */ i0(u0 u0Var, w wVar, boolean z10, q0 q0Var) {
        this.c = u0Var;
        this.d = wVar;
        this.b = z10;
        this.e = q0Var;
    }
}
