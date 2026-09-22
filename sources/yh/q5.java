package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class q5 {
    public final org.telegram.ui.ActionBar.n2 a;
    public final long b;
    public final oc c;
    public final ic d;
    public final mc e;
    public final hc f;
    public int g;
    public long h;
    public ai.i3 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final p5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, yh.p5] */
    public q5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: yh.p5
            public final /* synthetic */ q5 b;

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
                        q5 q5Var = this.b;
                        if (!q5Var.n && !q5Var.o && q5Var.m) {
                            q5Var.n = true;
                            ai.i3 i3Var = q5Var.i;
                            if (i3Var != null) {
                                i3Var.run(q5Var.k);
                            }
                            if (q5Var.e != null) {
                                q5Var.c.b();
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
        ic icVar = new ic(t10, n2Var.getResourceProvider());
        this.d = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        hc hcVar = new hc(t10, n2Var.getResourceProvider());
        this.f = hcVar;
        hcVar.b = 3000L;
        hcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        mc mcVar = new mc(t10, n2Var.getResourceProvider(), true, false);
        this.e = mcVar;
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        mcVar.a = new Runnable(this) { // from class: yh.p5
            public final /* synthetic */ q5 b;

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
                        q5 q5Var = this.b;
                        if (!q5Var.n && !q5Var.o && q5Var.m) {
                            q5Var.n = true;
                            ai.i3 i3Var = q5Var.i;
                            if (i3Var != null) {
                                i3Var.run(q5Var.k);
                            }
                            if (q5Var.e != null) {
                                q5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        mcVar.addView(hcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        oc b10 = vc.a0(n2Var).b(icVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: yh.p5
            public final /* synthetic */ q5 b;

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
                        q5 q5Var = this.b;
                        if (!q5Var.n && !q5Var.o && q5Var.m) {
                            q5Var.n = true;
                            ai.i3 i3Var = q5Var.i;
                            if (i3Var != null) {
                                i3Var.run(q5Var.k);
                            }
                            if (q5Var.e != null) {
                                q5Var.c.b();
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
