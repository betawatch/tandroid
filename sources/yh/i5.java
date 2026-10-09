package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i5 {
    public final org.telegram.ui.ActionBar.n2 a;
    public final long b;
    public final tc c;
    public final nc d;
    public final rc e;
    public final mc f;
    public int g;
    public long h;
    public ai.j3 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final h5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, yh.h5] */
    public i5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: yh.h5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        i5 i5Var = this.b;
                        if (!i5Var.n && !i5Var.o && i5Var.m) {
                            i5Var.n = true;
                            ai.j3 j3Var = i5Var.i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.k);
                            }
                            if (i5Var.e != null) {
                                i5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = n2Var;
        this.b = j3;
        Context t10 = m5.t(n2Var);
        nc ncVar = new nc(t10, n2Var.getResourceProvider());
        this.d = ncVar;
        ncVar.c(R.raw.stars_topup, new String[0]);
        mc mcVar = new mc(t10, n2Var.getResourceProvider());
        this.f = mcVar;
        mcVar.b = 3000L;
        mcVar.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        rc rcVar = new rc(t10, n2Var.getResourceProvider(), true, false);
        this.e = rcVar;
        rcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        rcVar.a = new Runnable(this) { // from class: yh.h5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        i5 i5Var = this.b;
                        if (!i5Var.n && !i5Var.o && i5Var.m) {
                            i5Var.n = true;
                            ai.j3 j3Var = i5Var.i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.k);
                            }
                            if (i5Var.e != null) {
                                i5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        rcVar.addView(mcVar, w7.x5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        rcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ncVar.setButton(rcVar);
        tc b10 = ad.a0(n2Var).b(ncVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: yh.h5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.a();
                        break;
                    default:
                        i5 i5Var = this.b;
                        if (!i5Var.n && !i5Var.o && i5Var.m) {
                            i5Var.n = true;
                            ai.j3 j3Var = i5Var.i;
                            if (j3Var != null) {
                                j3Var.run(i5Var.k);
                            }
                            if (i5Var.e != null) {
                                i5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        AndroidUtilities.cancelRunOnUIThread(r22);
        AndroidUtilities.runOnUIThread(r22, 3000L);
    }

    public final void a() {
        if (this.n || this.o) {
            return;
        }
        this.o = true;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        if (this.e != null) {
            this.c.b();
        }
    }
}
