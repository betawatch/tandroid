package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class p5 {
    public final org.telegram.ui.ActionBar.n2 a;
    public final long b;
    public final pc c;
    public final jc d;
    public final nc e;
    public final ic f;
    public int g;
    public long h;
    public ai.i3 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final o5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, yh.o5] */
    public p5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: yh.o5
            public final /* synthetic */ p5 b;

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
                        p5 p5Var = this.b;
                        if (!p5Var.n && !p5Var.o && p5Var.m) {
                            p5Var.n = true;
                            ai.i3 i3Var = p5Var.i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.k);
                            }
                            if (p5Var.e != null) {
                                p5Var.c.b();
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
        Context t10 = u5.t(n2Var);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.d = jcVar;
        jcVar.c(R.raw.stars_topup, new String[0]);
        ic icVar = new ic(t10, n2Var.getResourceProvider());
        this.f = icVar;
        icVar.b = 3000L;
        icVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, n2Var.getResourceProvider()));
        nc ncVar = new nc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ncVar;
        ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        ncVar.a = new Runnable(this) { // from class: yh.o5
            public final /* synthetic */ p5 b;

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
                        p5 p5Var = this.b;
                        if (!p5Var.n && !p5Var.o && p5Var.m) {
                            p5Var.n = true;
                            ai.i3 i3Var = p5Var.i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.k);
                            }
                            if (p5Var.e != null) {
                                p5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ncVar.addView(icVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ncVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        jcVar.setButton(ncVar);
        pc b10 = xc.a0(n2Var).b(jcVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: yh.o5
            public final /* synthetic */ p5 b;

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
                        p5 p5Var = this.b;
                        if (!p5Var.n && !p5Var.o && p5Var.m) {
                            p5Var.n = true;
                            ai.i3 i3Var = p5Var.i;
                            if (i3Var != null) {
                                i3Var.run(p5Var.k);
                            }
                            if (p5Var.e != null) {
                                p5Var.c.b();
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
