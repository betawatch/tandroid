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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class r5 {
    public final org.telegram.ui.ActionBar.o2 a;
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
    public final q5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, yh.q5] */
    public r5(org.telegram.ui.ActionBar.o2 o2Var, long j3) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: yh.q5
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
                            ai.i3 i3Var = r5Var.i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.k);
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
        this.a = o2Var;
        this.b = j3;
        Context t10 = v5.t(o2Var);
        ic icVar = new ic(t10, o2Var.getResourceProvider());
        this.d = icVar;
        icVar.c(R.raw.stars_topup, new String[0]);
        hc hcVar = new hc(t10, o2Var.getResourceProvider());
        this.f = hcVar;
        hcVar.b = 3000L;
        hcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, o2Var.getResourceProvider()));
        mc mcVar = new mc(t10, o2Var.getResourceProvider(), true, false);
        this.e = mcVar;
        mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        mcVar.a = new Runnable(this) { // from class: yh.q5
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
                            ai.i3 i3Var = r5Var.i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.k);
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
        mcVar.addView(hcVar, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        mcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        icVar.setButton(mcVar);
        oc b10 = vc.a0(o2Var).b(icVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: yh.q5
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
                            ai.i3 i3Var = r5Var.i;
                            if (i3Var != null) {
                                i3Var.run(r5Var.k);
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
