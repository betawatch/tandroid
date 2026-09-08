package zh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class n5 {
    public final org.telegram.ui.ActionBar.n2 a;
    public final long b;
    public final qc c;
    public final kc d;
    public final oc e;
    public final jc f;
    public int g;
    public long h;
    public bi.v2 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final m5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, zh.m5] */
    public n5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: zh.m5
            public final /* synthetic */ n5 b;

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
                        n5 n5Var = this.b;
                        if (!n5Var.n && !n5Var.o && n5Var.m) {
                            n5Var.n = true;
                            bi.v2 v2Var = n5Var.i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.k);
                            }
                            if (n5Var.e != null) {
                                n5Var.c.b();
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
        Context t10 = s5.t(n2Var);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, n2Var.getResourceProvider());
        this.f = jcVar;
        jcVar.b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, n2Var.getResourceProvider()));
        oc ocVar = new oc(t10, n2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        ocVar.a = new Runnable(this) { // from class: zh.m5
            public final /* synthetic */ n5 b;

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
                        n5 n5Var = this.b;
                        if (!n5Var.n && !n5Var.o && n5Var.m) {
                            n5Var.n = true;
                            bi.v2 v2Var = n5Var.i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.k);
                            }
                            if (n5Var.e != null) {
                                n5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ocVar.addView(jcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = yc.a0(n2Var).b(kcVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: zh.m5
            public final /* synthetic */ n5 b;

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
                        n5 n5Var = this.b;
                        if (!n5Var.n && !n5Var.o && n5Var.m) {
                            n5Var.n = true;
                            bi.v2 v2Var = n5Var.i;
                            if (v2Var != null) {
                                v2Var.run(n5Var.k);
                            }
                            if (n5Var.e != null) {
                                n5Var.c.b();
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
