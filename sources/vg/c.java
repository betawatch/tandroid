package vg;

import bi.k3;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(wc wcVar, boolean z10, TLRPC.Chat chat, u6 u6Var) {
        this.c = wcVar;
        this.b = z10;
        this.d = chat;
        this.e = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        boolean z10;
        long j10;
        int i10;
        File file;
        switch (this.a) {
            case 0:
                wc wcVar = (wc) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                u6 u6Var = (u6) this.e;
                int i11 = R.raw.star_premium_2;
                boolean z11 = this.b;
                String string2 = z11 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z11) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                qc M = wcVar.M(string2, AndroidUtilities.replaceSingleTag(string, y6.Gi, 0, new k3(chat), u6Var), i11);
                M.j = 5000;
                M.j();
                return;
            default:
                vi.s0 s0Var = (vi.s0) this.c;
                vi.v vVar = (vi.v) this.d;
                vi.o0 o0Var = (vi.o0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    vVar.g();
                    File file2 = vVar.a;
                    long e = w7.x.e(file2) / 1000;
                    s0Var.m.b("active output finalized: size=" + file2.length() + ", durationMs=" + e + ", elapsedMs=" + vi.s0.f(nanoTime));
                    s0Var.g();
                    long j11 = s0Var.o;
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
                    boolean z12 = this.b;
                    if (z12 && !z10) {
                        try {
                            s0Var.k.execute(new vi.f0(s0Var, o0Var, vVar.a, e, true));
                            return;
                        } catch (Exception e10) {
                            e = e10;
                            s0Var = s0Var;
                            s0Var.i.post(new vi.d0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = vVar.a;
                    try {
                        long min = Math.min(j12, e);
                        int i12 = z10 ? i10 : 2;
                        file = file3;
                        try {
                            s0Var.s(file, 0L, min, z12, i12);
                            w7.x.c(file);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            w7.x.c(file);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file = file3;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
        }
    }

    public /* synthetic */ c(vi.s0 s0Var, vi.v vVar, boolean z10, vi.o0 o0Var) {
        this.c = s0Var;
        this.d = vVar;
        this.b = z10;
        this.e = o0Var;
    }
}
