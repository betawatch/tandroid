package org.telegram.ui.web;

import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.bb1;
import org.telegram.ui.zn;
import yh.p7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.c;
                e0Var.getClass();
                e0Var.presentFragment(zn.W9(this.b));
                break;
            case 1:
                tg.z0 z0Var = (tg.z0) this.c;
                HashSet hashSet = z0Var.e0;
                hashSet.remove(Long.valueOf(this.b));
                z0Var.Y.b(true, hashSet, new tg.t0(z0Var, 5), null);
                z0Var.c0(true, false);
                break;
            case 2:
                ad.a0((p7) this.c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) this.b), R.raw.stars_topup).k(true);
                break;
            default:
                ad.a0((bb1) this.c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) this.b), R.raw.stars_topup).k(true);
                break;
        }
    }
}
