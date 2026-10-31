package rh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.nc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z5 {
    public final org.telegram.ui.ActionBar.k2 a;
    public final long b;
    public final wb c;
    public final qb d;
    public final ub e;
    public final d6 f;
    public int g;
    public long h;
    public nc i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final y5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, rh.y5] */
    public z5(org.telegram.ui.ActionBar.k2 k2Var, long j10) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: rh.y5
            public final /* synthetic */ z5 b;

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
                        z5 z5Var = this.b;
                        if (!z5Var.n && !z5Var.o && z5Var.m) {
                            z5Var.n = true;
                            nc ncVar = z5Var.i;
                            if (ncVar != null) {
                                ncVar.a(z5Var.k);
                            }
                            if (z5Var.e != null) {
                                z5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = k2Var;
        this.b = j10;
        Context t10 = e6.t(k2Var);
        qb qbVar = new qb(t10, k2Var.getResourceProvider());
        this.d = qbVar;
        qbVar.c(R.raw.stars_topup, new String[0]);
        d6 d6Var = new d6(t10, k2Var.getResourceProvider());
        this.f = d6Var;
        d6Var.b = 3000L;
        int i11 = org.telegram.ui.ActionBar.t6.uj;
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        org.telegram.utils.twidget.t tVar = new org.telegram.utils.twidget.t(28);
        org.telegram.utils.twidget.t tVar2 = new org.telegram.utils.twidget.t(29);
        int Q = org.telegram.ui.ActionBar.a7.Q(i11, -1, 0, 0.0f, resourceProvider);
        tVar2.d(Q, d6Var);
        org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(101, d6Var);
        x10.c(i11, -1, 0, 0.0f, resourceProvider);
        x10.n = tVar;
        x10.o = tVar2;
        x10.m = false;
        x10.g = Q;
        final int i12 = 1;
        ub ubVar = new ub(t10, k2Var.getResourceProvider(), true, false);
        this.e = ubVar;
        ubVar.e(cd.L0(2131745041, null));
        ubVar.b = new Runnable(this) { // from class: rh.y5
            public final /* synthetic */ z5 b;

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
                        z5 z5Var = this.b;
                        if (!z5Var.n && !z5Var.o && z5Var.m) {
                            z5Var.n = true;
                            nc ncVar = z5Var.i;
                            if (ncVar != null) {
                                ncVar.a(z5Var.k);
                            }
                            if (z5Var.e != null) {
                                z5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ubVar.addView(d6Var, w7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ubVar.e.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(8.0f));
        qbVar.setButton(ubVar);
        wb b10 = cc.a0(k2Var).b(qbVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        b10.v = new Runnable(this) { // from class: rh.y5
            public final /* synthetic */ z5 b;

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
                        z5 z5Var = this.b;
                        if (!z5Var.n && !z5Var.o && z5Var.m) {
                            z5Var.n = true;
                            nc ncVar = z5Var.i;
                            if (ncVar != null) {
                                ncVar.a(z5Var.k);
                            }
                            if (z5Var.e != null) {
                                z5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        org.telegram.messenger.i0.r(r22);
        org.telegram.messenger.i0.h3(r22, 3000L);
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
