// default package

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class v2d implements s2d, r2d, i1d {
    public j1d E;
    public View F;
    public int G;
    public int H;
    public final t84 a;
    public final adc b = new adc(0.0f);
    public final bdc c = new bdc();
    public final bdc d = new bdc();
    public final pn e = new pn(null);
    public final qj4 f;
    public final Runnable h;
    public boolean n;
    public l2d r;
    public byte s;
    public int w;
    public int x;
    public final u2d y;

    public v2d(Runnable runnable) {
        byte b = 0;
        t2d t2dVar = new t2d(this, (byte) 0);
        qj4 qj4Var = new qj4();
        qj4Var.c = sx5.a;
        qj4Var.d = new ea5(qj4Var, (byte) 20);
        qj4Var.b = t2dVar;
        Typeface typeface = hl.a;
        float f = 1.0f;
        try {
            f = Settings.Global.getFloat(a.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        qj4Var.a = (long) (f * 250.0f * 1.1f);
        this.f = qj4Var;
        this.s = (byte) 1;
        this.y = new u2d(this, b);
        this.h = runnable;
        this.a = new t84(0, new zhc(this, runnable, (byte) 3), hb.w, 250L);
    }

    @Override // i1d
    public final void P() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new u2d(this, (byte) 1));
        }
    }

    @Override // i1d
    public final View R() {
        return this.F;
    }

    public final void a() {
        boolean z = this.a.h;
        boolean z2 = this.n;
        pn pnVar = this.e;
        if (!z2 && z) {
            this.n = true;
            pnVar.d();
        }
        if (!this.n || z) {
            return;
        }
        this.n = false;
        pnVar.e();
    }

    public final float c() {
        j1d j1dVar = this.E;
        bdc bdcVar = this.d;
        return (j1dVar == null || this.H <= 0) ? bdcVar.d.a : Math.max(this.G, bdcVar.d.a);
    }

    public final float d() {
        j1d j1dVar = this.E;
        bdc bdcVar = this.c;
        return (j1dVar == null || this.H <= 0) ? bdcVar.d.a : Math.max(this.G, bdcVar.d.a);
    }

    public final int e() {
        return (this.E == null || this.H <= 0) ? Math.max(f(527).d, this.w) : Math.max(this.G, Math.max(f(527).d, this.w));
    }

    public final mq5 f(int i) {
        l2d l2dVar = this.r;
        return l2dVar != null ? l2dVar.a.f(i) : mq5.e;
    }

    public final void g(int i) {
        if (this.w == i && this.s == 0) {
            return;
        }
        hl.r(this.y);
        this.x = Math.max(this.w, i);
        this.w = i;
        this.s = (byte) 0;
        j(this.r);
    }

    public final void h(int i) {
        if (i > 0) {
            g(i + hl.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z) {
        if (this.w != 0) {
            u2d u2dVar = this.y;
            hl.r(u2dVar);
            this.s = z ? (byte) 3 : (byte) 2;
            j(this.r);
            if (z) {
                hl.d3(u2dVar, 1000L);
            }
        }
    }

    public final void j(l2d l2dVar) {
        k(l2dVar, this.r != null);
    }

    public final void k(l2d l2dVar, boolean z) {
        mq5 mq5Var;
        mq5 mq5Var2;
        int i;
        t84 t84Var;
        l2d b = b(l2dVar);
        this.r = b;
        if (b != null) {
            i2d i2dVar = b.a;
            mq5Var = mq5.a(i2dVar.f(647), i2dVar.g(647));
            mq5Var2 = i2dVar.f(8);
        } else {
            mq5Var = mq5.e;
            mq5Var2 = mq5Var;
        }
        qj4 qj4Var = this.f;
        sx5 sx5Var = (sx5) qj4Var.c;
        boolean z2 = mq5Var2.d > 0;
        sx5 sx5Var2 = !z ? z2 ? sx5.d : sx5.a : z2 ? sx5.c : sx5.b;
        if (sx5Var != sx5Var2) {
            qj4Var.a(sx5Var2, false);
        }
        byte b2 = this.s;
        if (b2 == 2) {
            this.w = 0;
        }
        if (b2 == 3 && mq5Var2.d > 0) {
            this.w = 0;
        }
        mq5 a = mq5.a(mq5Var2, mq5.b(0, 0, 0, this.w));
        int i2 = a.c;
        int i3 = a.b;
        int i4 = a.a;
        int i5 = a.d;
        mq5 a2 = mq5.a(mq5Var, a);
        int i6 = a2.d;
        int i7 = a2.c;
        int i8 = a2.b;
        int i9 = a2.a;
        Runnable runnable = this.h;
        t84 t84Var2 = this.a;
        bdc bdcVar = this.d;
        bdc bdcVar2 = this.c;
        adc adcVar = this.b;
        if (z) {
            if (adcVar.b(i5 > 0 ? 1.0f : 0.0f)) {
                i = i7;
                t84Var = t84Var2;
            } else {
                t84Var = t84Var2;
                i = i7;
                if (!bdcVar2.b(i9, i8, i7, i6) && !bdcVar.b(i4, i3, i2, i5)) {
                    if (sx5Var != sx5Var2) {
                        runnable.run();
                    }
                }
            }
            t84Var.b();
            adcVar.c(false);
            bdcVar2.c(false);
            bdcVar.c(false);
            adcVar.c = i5 > 0 ? 1.0f : 0.0f;
            bdcVar2.e(i9, i8, i, i6);
            bdcVar.e(i4, i3, i2, i5);
            t84 t84Var3 = t84Var;
            t84Var3.c(0.0f);
            t84Var3.a(1.0f);
        } else {
            t84Var2.b();
            adcVar.d(i5 > 0 ? 1.0f : 0.0f);
            bdcVar2.d(i9, i8, i7, i6);
            bdcVar.d(i4, i3, i2, i5);
            runnable.run();
        }
        a();
    }

    @Override // i1d
    public final void o(l2d l2dVar) {
        l2d b = b(l2dVar);
        this.G = b != null ? b.a.f(8).d : 0;
        this.h.run();
    }

    @Override // i1d
    public final void w() {
        this.H++;
    }

    public l2d b(l2d l2dVar) {
        return l2dVar;
    }
}
