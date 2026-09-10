package xh;

import android.content.Context;
import bi.ve;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class r5 {
    public final org.telegram.ui.ActionBar.p2 a;
    public final long b;
    public final pc c;
    public final jc d;
    public final nc e;
    public final ic f;
    public int g;
    public long h;
    public ve i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final q5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, xh.q5] */
    public r5(org.telegram.ui.ActionBar.p2 p2Var, long j3) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: xh.q5
            public final /* synthetic */ r5 b;

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
                        r5 r5Var = this.b;
                        if (!r5Var.n && !r5Var.o && r5Var.m) {
                            r5Var.n = true;
                            ve veVar = r5Var.i;
                            if (veVar != null) {
                                veVar.run(r5Var.k);
                            }
                            if (r5Var.e != null) {
                                r5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = p2Var;
        this.b = j3;
        Context t10 = v5.t(p2Var);
        jc jcVar = new jc(t10, p2Var.getResourceProvider());
        this.d = jcVar;
        jcVar.c(R.raw.stars_topup, new String[0]);
        ic icVar = new ic(t10, p2Var.getResourceProvider());
        this.f = icVar;
        icVar.b = 3000L;
        icVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, p2Var.getResourceProvider()));
        nc ncVar = new nc(t10, p2Var.getResourceProvider(), true, false);
        this.e = ncVar;
        ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        ncVar.a = new Runnable(this) { // from class: xh.q5
            public final /* synthetic */ r5 b;

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
                        r5 r5Var = this.b;
                        if (!r5Var.n && !r5Var.o && r5Var.m) {
                            r5Var.n = true;
                            ve veVar = r5Var.i;
                            if (veVar != null) {
                                veVar.run(r5Var.k);
                            }
                            if (r5Var.e != null) {
                                r5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ncVar.addView(icVar, w7.a6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ncVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        jcVar.setButton(ncVar);
        pc b10 = wc.a0(p2Var).b(jcVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: xh.q5
            public final /* synthetic */ r5 b;

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
                        r5 r5Var = this.b;
                        if (!r5Var.n && !r5Var.o && r5Var.m) {
                            r5Var.n = true;
                            ve veVar = r5Var.i;
                            if (veVar != null) {
                                veVar.run(r5Var.k);
                            }
                            if (r5Var.e != null) {
                                r5Var.c.b();
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
