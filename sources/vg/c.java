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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        File file;
        int i10;
        switch (this.a) {
            case 0:
                wc wcVar = (wc) this.c;
                boolean z10 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                u6 u6Var = (u6) this.e;
                int i11 = R.raw.star_premium_2;
                String string2 = z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z10) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                qc M = wcVar.M(string2, AndroidUtilities.replaceSingleTag(string, y6.Gi, 0, new k3(chat), u6Var), i11);
                M.j = 5000;
                M.j();
                return;
            default:
                vi.u0 u0Var = (vi.u0) this.c;
                vi.w wVar = (vi.w) this.d;
                boolean z11 = this.b;
                vi.q0 q0Var = (vi.q0) this.e;
                long j10 = u0Var.q;
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    long h = wVar.h();
                    u0Var.m.b("active output finalized: size=" + wVar.a.length() + ", durationMs=" + h + ", elapsedMs=" + vi.u0.f(nanoTime));
                    u0Var.g();
                    boolean z12 = h > j10;
                    if (z11 && !z12) {
                        try {
                            u0Var.k.execute(new vi.g0(u0Var, q0Var, wVar.a, h, true));
                            return;
                        } catch (Exception e) {
                            e = e;
                            u0Var = u0Var;
                            u0Var.i.post(new vi.e0(u0Var, e, 2));
                            return;
                        }
                    }
                    File file2 = wVar.a;
                    try {
                        synchronized (wVar) {
                            file = file2;
                            try {
                                i10 = wVar.s;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file = file2;
                    }
                    try {
                        u0Var.t(file, i10, 0L, Math.min(j10, h), z11, z12 ? 1 : 2);
                        w7.x.c(file);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        file = file;
                        w7.x.c(file);
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
        }
    }

    public /* synthetic */ c(vi.u0 u0Var, vi.w wVar, boolean z10, vi.q0 q0Var) {
        this.c = u0Var;
        this.d = wVar;
        this.b = z10;
        this.e = q0Var;
    }
}
