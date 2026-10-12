package zh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class j5 {
    public final org.telegram.ui.ActionBar.m2 a;
    public final long b;
    public final sc c;
    public final mc d;
    public final qc e;
    public final lc f;
    public int g;
    public long h;
    public bi.y2 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final i5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, zh.i5] */
    public j5(org.telegram.ui.ActionBar.m2 m2Var, long j10) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: zh.i5
            public final /* synthetic */ j5 b;

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
                        j5 j5Var = this.b;
                        if (!j5Var.n && !j5Var.o && j5Var.m) {
                            j5Var.n = true;
                            bi.y2 y2Var = j5Var.i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.k);
                            }
                            if (j5Var.e != null) {
                                j5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = m2Var;
        this.b = j10;
        Context t10 = n5.t(m2Var);
        mc mcVar = new mc(t10, m2Var.getResourceProvider());
        this.d = mcVar;
        mcVar.c(R.raw.stars_topup, new String[0]);
        lc lcVar = new lc(t10, m2Var.getResourceProvider());
        this.f = lcVar;
        lcVar.b = 3000L;
        lcVar.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, m2Var.getResourceProvider()));
        qc qcVar = new qc(t10, m2Var.getResourceProvider(), true, false);
        this.e = qcVar;
        qcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        qcVar.a = new Runnable(this) { // from class: zh.i5
            public final /* synthetic */ j5 b;

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
                        j5 j5Var = this.b;
                        if (!j5Var.n && !j5Var.o && j5Var.m) {
                            j5Var.n = true;
                            bi.y2 y2Var = j5Var.i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.k);
                            }
                            if (j5Var.e != null) {
                                j5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        qcVar.addView(lcVar, w7.a6.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
        qcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        mcVar.setButton(qcVar);
        sc b10 = zc.a0(m2Var).b(mcVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: zh.i5
            public final /* synthetic */ j5 b;

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
                        j5 j5Var = this.b;
                        if (!j5Var.n && !j5Var.o && j5Var.m) {
                            j5Var.n = true;
                            bi.y2 y2Var = j5Var.i;
                            if (y2Var != null) {
                                y2Var.run(j5Var.k);
                            }
                            if (j5Var.e != null) {
                                j5Var.c.b();
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
