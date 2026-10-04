package yh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class o5 {
    public final org.telegram.ui.ActionBar.n2 a;
    public final long b;
    public final rc c;
    public final lc d;
    public final pc e;
    public final kc f;
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
    public o5(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
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
        this.a = n2Var;
        this.b = j3;
        Context t10 = t5.t(n2Var);
        lc lcVar = new lc(t10, n2Var.getResourceProvider());
        this.d = lcVar;
        lcVar.c(R.raw.stars_topup, new String[0]);
        kc kcVar = new kc(t10, n2Var.getResourceProvider());
        this.f = kcVar;
        kcVar.b = 3000L;
        kcVar.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, n2Var.getResourceProvider()));
        pc pcVar = new pc(t10, n2Var.getResourceProvider(), true, false);
        this.e = pcVar;
        pcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        final int i11 = 1;
        pcVar.a = new Runnable(this) { // from class: yh.n5
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
        pcVar.addView(kcVar, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        pcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        lcVar.setButton(pcVar);
        rc b10 = yc.a0(n2Var).b(lcVar, -1);
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
