package ug;

import ai.m3;
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
import w7.n7;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(xc xcVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.c = xcVar;
        this.b = z10;
        this.d = chat;
        this.e = d6Var;
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
                xc xcVar = (xc) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                d6 d6Var = (d6) this.e;
                int i11 = R.raw.star_premium_2;
                boolean z11 = this.b;
                String string2 = z11 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z11) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                qc M = xcVar.M(string2, AndroidUtilities.replaceSingleTag(string, h6.Gi, 0, new m3(chat), d6Var), i11);
                M.j = 5000;
                M.j();
                return;
            default:
                si.s0 s0Var = (si.s0) this.c;
                si.w wVar = (si.w) this.d;
                si.o0 o0Var = (si.o0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    File file2 = wVar.a;
                    long e = n7.e(file2) / 1000;
                    s0Var.m.b("active output finalized: size=" + file2.length() + ", durationMs=" + e + ", elapsedMs=" + si.s0.f(nanoTime));
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
                            s0Var.k.execute(new si.g0(s0Var, o0Var, wVar.a, e, true));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            s0Var = s0Var;
                            s0Var.i.post(new si.e0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = wVar.a;
                    try {
                        long min = Math.min(j12, e);
                        int i12 = z10 ? i10 : 2;
                        file = file3;
                        try {
                            s0Var.s(file, 0L, min, z12, i12);
                            n7.c(file);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            n7.c(file);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file = file3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
        }
    }

    public /* synthetic */ c(si.s0 s0Var, si.w wVar, boolean z10, si.o0 o0Var) {
        this.c = s0Var;
        this.d = wVar;
        this.b = z10;
        this.e = o0Var;
    }
}
