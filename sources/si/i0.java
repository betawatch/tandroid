package si;

import ai.n3;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import w7.p7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i0(xc xcVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.c = xcVar;
        this.b = z10;
        this.d = chat;
        this.e = d6Var;
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
                t0 t0Var = (t0) this.c;
                x xVar = (x) this.d;
                p0 p0Var = (p0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    File file2 = xVar.a;
                    long e = p7.e(file2) / 1000;
                    t0Var.m.b("active output finalized: size=" + file2.length() + ", durationMs=" + e + ", elapsedMs=" + t0.f(nanoTime));
                    t0Var.g();
                    long j11 = t0Var.o;
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
                            t0Var.k.execute(new g0(t0Var, p0Var, xVar.a, e, true));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            t0Var = t0Var;
                            t0Var.i.post(new e0(t0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = xVar.a;
                    try {
                        long min = Math.min(j12, e);
                        int i11 = z10 ? i10 : 2;
                        file = file3;
                        try {
                            t0Var.s(file, 0L, min, z11, i11);
                            p7.c(file);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            p7.c(file);
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
                d6 d6Var = (d6) this.e;
                int i12 = R.raw.star_premium_2;
                boolean z12 = this.b;
                String string2 = z12 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z12) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                qc M = xcVar.M(string2, AndroidUtilities.replaceSingleTag(string, h6.Gi, 0, new n3(chat), d6Var), i12);
                M.j = 5000;
                M.j();
                return;
        }
    }

    public /* synthetic */ i0(t0 t0Var, x xVar, boolean z10, p0 p0Var) {
        this.c = t0Var;
        this.d = xVar;
        this.b = z10;
        this.e = p0Var;
    }
}
