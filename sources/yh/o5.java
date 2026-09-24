package yh;

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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class o5 {
    public final org.telegram.ui.ActionBar.m2 a;
    public final long b;
    public final qc c;
    public final kc d;
    public final oc e;
    public final jc f;
    public int g;
    public long h;
    public ai.i3 i;
    public final ArrayList j = new ArrayList();
    public final HashSet k = new HashSet();
    public final long l = System.currentTimeMillis();
    public boolean m = true;
    public boolean n;
    public boolean o;
    public final n5 p;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Runnable, yh.n5] */
    public o5(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        final int i10 = 0;
        ?? r22 = new Runnable(this) { // from class: yh.n5
            public final /* synthetic */ o5 b;

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
                        o5 o5Var = this.b;
                        if (!o5Var.n && !o5Var.o && o5Var.m) {
                            o5Var.n = true;
                            ai.i3 i3Var = o5Var.i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.k);
                            }
                            if (o5Var.e != null) {
                                o5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = r22;
        this.a = m2Var;
        this.b = j3;
        Context t10 = t5.t(m2Var);
        kc kcVar = new kc(t10, m2Var.getResourceProvider());
        this.d = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        jc jcVar = new jc(t10, m2Var.getResourceProvider());
        this.f = jcVar;
        jcVar.b = 3000L;
        jcVar.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, m2Var.getResourceProvider()));
        oc ocVar = new oc(t10, m2Var.getResourceProvider(), true, false);
        this.e = ocVar;
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        ocVar.a = new Runnable(this) { // from class: yh.n5
            public final /* synthetic */ o5 b;

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
                        o5 o5Var = this.b;
                        if (!o5Var.n && !o5Var.o && o5Var.m) {
                            o5Var.n = true;
                            ai.i3 i3Var = o5Var.i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.k);
                            }
                            if (o5Var.e != null) {
                                o5Var.c.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ocVar.addView(jcVar, w7.y5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        qc b10 = yc.a0(m2Var).b(kcVar, -1);
        this.c = b10;
        b10.r = false;
        b10.k(true);
        final int i12 = 0;
        b10.v = new Runnable(this) { // from class: yh.n5
            public final /* synthetic */ o5 b;

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
                        o5 o5Var = this.b;
                        if (!o5Var.n && !o5Var.o && o5Var.m) {
                            o5Var.n = true;
                            ai.i3 i3Var = o5Var.i;
                            if (i3Var != null) {
                                i3Var.run(o5Var.k);
                            }
                            if (o5Var.e != null) {
                                o5Var.c.b();
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
