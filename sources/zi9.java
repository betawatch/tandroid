// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zi9 extends mg9 implements fwc {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public bwc Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public gwc e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final sr8 i0;
    public int j0;
    public int k0;
    public String l0;
    public rwc m0;
    public pib[] n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public float s0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zi9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockEmbed pageblockembed, boolean z) {
        super(rh9Var, rect, i);
        boolean z2;
        Paint paint;
        int ceil;
        TLRPC.Message message;
        this.b0 = new Path();
        this.c0 = new float[8];
        this.d0 = t0.incrementAndGet();
        this.i0 = new sr8(this, (byte) 28);
        this.X = pageblockembed;
        this.Z = z;
        this.Y = vvc.h(pageblockembed.url);
        this.j0 = k0();
        String j = vvc.j(pageblockembed.url, this.Y, u0());
        this.l0 = j;
        if (j.equals("placeholder") || this.l0.startsWith("cache of width")) {
            gl.d3(new ok5(pageblockembed.url, u0(), rh9Var.D()));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = vvc.a;
        svc svcVar = (svc) concurrentHashMap.get(str);
        zi9 zi9Var = svcVar == null ? null : svcVar.u;
        if (zi9Var != null && zi9Var != this && zi9Var.j0 != this.j0) {
            o0(zi9Var.j0, "new layout, width " + Math.round(zi9Var.u0() / gl.p) + " -> " + Math.round(u0() / gl.p), zi9Var.l0, false);
        }
        svc svcVar2 = (svc) concurrentHashMap.get(pageblockembed.url);
        if (svcVar2 != null) {
            svcVar2.u = this;
        }
        k27 k27Var = this.a.b;
        if (this.Y == null || k27Var == null || k27Var.k == null) {
            return;
        }
        if ((k27Var.P2() && !k27Var.O3()) || (!TextUtils.isEmpty(k27Var.k.message) && !k27Var.k.invert_media)) {
            this.Y.i(0.0f, 0.0f, false);
            return;
        }
        if (!k27Var.r1) {
            TLRPC.Message message2 = k27Var.k;
            if (!message2.edit_hide && ((message2.flags & 32768) != 0 || k27Var.Y2())) {
                z2 = true;
                String N3 = gb2.N3(k27Var, k27Var, z2, k27Var.k.edit_date);
                paint = bkb.S2;
                if (paint == null) {
                    paint = new Paint(1);
                    paint.setTextSize(gl.L(12.0f));
                }
                ceil = (int) Math.ceil(paint.measureText(N3));
                message = k27Var.k;
                if ((message.flags & 1024) != 0 && bkb.L3 != null) {
                    String S = k96.S(null, Math.max(1, message.views));
                    Drawable drawable = bkb.L3;
                    ceil = (int) ((((paint.getTextSize() - gl.L(2.0f)) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S))) + gl.L(10.0f) + ceil);
                }
                this.Y.i(l0(gl.L(23.0f)), l0(t0(ceil, k27Var.O3())), false);
            }
        }
        z2 = false;
        String N32 = gb2.N3(k27Var, k27Var, z2, k27Var.k.edit_date);
        paint = bkb.S2;
        if (paint == null) {
        }
        ceil = (int) Math.ceil(paint.measureText(N32));
        message = k27Var.k;
        if ((message.flags & 1024) != 0) {
            String S2 = k96.S(null, Math.max(1, message.views));
            Drawable drawable2 = bkb.L3;
            ceil = (int) ((((paint.getTextSize() - gl.L(2.0f)) * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S2))) + gl.L(10.0f) + ceil);
        }
        this.Y.i(l0(gl.L(23.0f)), l0(t0(ceil, k27Var.O3())), false);
    }

    public static int j0() {
        int i = gba.V0;
        return (gl.L(9.0f) + (i >= 15 ? gl.L(2.0f) : i >= 11 ? gl.L(1.0f) : 0)) - gl.L(2.0f);
    }

    public static float l0(int i) {
        return (float) Math.ceil((i / gl.p) - 0.01f);
    }

    public static int t0(int i, boolean z) {
        return gl.L(4.0f) + gl.L(6.0f) + i + (gl.L(gba.V0 < 10 ? 4.0f : 6.0f) << 1) + (z ? gl.L(20.0f) : 0);
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override // mg9
    public final pib[] L() {
        return this.n0;
    }

    @Override // mg9
    public final boolean Q() {
        gwc gwcVar = this.e0;
        if (gwcVar == null || !this.f0 || !gwcVar.w || (gwcVar.L & 3) == 2) {
            return false;
        }
        return gwcVar.z || gwcVar.o();
    }

    @Override // mg9
    public final void T() {
        bwc bwcVar = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (bwcVar == null) {
            bwcVar = vvc.h(pageblockembed.url);
            this.Y = bwcVar;
        }
        if (bwcVar == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new gwc(this, gl.p);
        }
        svc svcVar = (svc) vvc.a.get(pageblockembed.url);
        if (svcVar != null) {
            ArrayList arrayList = svcVar.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (vvc.p(arrayList) != this) {
                gwc gwcVar = this.e0;
                bwc bwcVar2 = this.Y;
                gwcVar.r();
                gwcVar.p = bwcVar2;
                gwcVar.r = bwcVar2 != null;
                return;
            }
            zi9 zi9Var = svcVar.w;
            svcVar.w = this;
            if (zi9Var != null && zi9Var != this && zi9Var.f0 && zi9Var.e0 != null) {
                zi9Var.s0();
                gwc gwcVar2 = zi9Var.e0;
                bwc bwcVar3 = zi9Var.Y;
                gwcVar2.r();
                gwcVar2.p = bwcVar3;
                gwcVar2.r = bwcVar3 != null;
                View view = zi9Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override // mg9
    public final void V() {
        gwc gwcVar;
        if (this.e0 != null) {
            s0();
            this.e0.r();
            svc svcVar = (svc) vvc.a.get(this.X.url);
            if (svcVar != null) {
                ArrayList arrayList = svcVar.v;
                arrayList.remove(this);
                if (svcVar.w == this) {
                    zi9 p = vvc.p(arrayList);
                    svcVar.w = p;
                    if (p == null || p.f0 || p.W == null || (gwcVar = p.e0) == null || p.Y == null) {
                        return;
                    }
                    gwcVar.r();
                    p.r0();
                    p.W.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    @Override // mg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(Canvas canvas) {
        float f;
        float f2;
        int i;
        View view;
        gb2 gb2Var;
        if (this.e0 == null) {
            return;
        }
        int i2 = this.a0;
        rh9 rh9Var = this.a;
        gb2 gb2Var2 = rh9Var.E;
        nb2 nb2Var = null;
        if (i2 != mwc.e(gb2Var2 != null ? gb2Var2.getResourcesProvider() : null, rh9Var.D())) {
            gb2 gb2Var3 = rh9Var.E;
            wjb resourcesProvider = gb2Var3 != null ? gb2Var3.getResourcesProvider() : null;
            this.a0 = mwc.e(resourcesProvider, rh9Var.D());
            this.Y.j(mwc.a(resourcesProvider, rh9Var.D()));
        }
        this.k0 = R() ? 0 : Math.max(0, Math.min(j0(), rh9Var.S - gl.L(2.0f)));
        int u0 = u0();
        float f3 = this.j0;
        if (this.p0 != 0 && (gb2Var = rh9Var.E) != null) {
            nb2Var = gb2Var.getTransitionParams();
        }
        if (nb2Var != null) {
            if (nb2Var.x0) {
                this.q0 = true;
                f2 = nb2Var.k0 + 0.0f;
                f3 += nb2Var.j0;
                f = i0() ? nb2Var.j0 : nb2Var.k0;
                if (i0()) {
                    f += this.j0 - k0();
                }
                this.s0 = f3;
                canvas.save();
                canvas.translate(-this.k0, 0.0f);
                Path path = this.b0;
                path.rewind();
                i = gba.V0;
                if (i > 2) {
                    i -= 2;
                }
                int L = gl.L(i);
                int min = Math.min(gl.L(3.0f), L);
                boolean z = this.Z;
                float f4 = (z || rh9Var.A() || (!rh9Var.D() && rh9Var.F())) ? min : L;
                float f5 = (z || (rh9Var.D() && rh9Var.F())) ? min : L;
                float[] fArr = this.c0;
                fArr[1] = f4;
                fArr[0] = f4;
                fArr[3] = f5;
                fArr[2] = f5;
                float f6 = (this.r0 || !rh9Var.D()) ? min : L;
                float f7 = (this.r0 || rh9Var.D()) ? min : L;
                fArr[5] = f7;
                fArr[4] = f7;
                fArr[7] = f6;
                fArr[6] = f6;
                RectF rectF = gl.P;
                rectF.set(0.0f, f2, u0, f3);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, f);
                if (this.e0.c(canvas, u0) && (view = this.W) != null) {
                    view.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.q0 || SystemClock.uptimeMillis() - this.p0 > 250) {
                this.p0 = 0L;
                this.q0 = false;
            }
        }
        f = 0.0f;
        f2 = 0.0f;
        if (i0()) {
        }
        this.s0 = f3;
        canvas.save();
        canvas.translate(-this.k0, 0.0f);
        Path path2 = this.b0;
        path2.rewind();
        i = gba.V0;
        if (i > 2) {
        }
        int L2 = gl.L(i);
        int min2 = Math.min(gl.L(3.0f), L2);
        boolean z2 = this.Z;
        if (z2) {
        }
        if (z2) {
        }
        float[] fArr2 = this.c0;
        fArr2[1] = f4;
        fArr2[0] = f4;
        fArr2[3] = f5;
        fArr2[2] = f5;
        if (this.r0) {
        }
        if (this.r0) {
        }
        fArr2[5] = f7;
        fArr2[4] = f7;
        fArr2[7] = f6;
        fArr2[6] = f6;
        RectF rectF2 = gl.P;
        rectF2.set(0.0f, f2, u0, f3);
        path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.translate(0.0f, f);
        if (this.e0.c(canvas, u0)) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override // mg9
    public final boolean Y(MotionEvent motionEvent) {
        if (this.e0 == null || !this.f0) {
            return false;
        }
        String str = this.X.url;
        svc svcVar = vvc.m(str) ? (svc) vvc.a.get(str) : null;
        if (svcVar != null && svcVar.k) {
            return false;
        }
        motionEvent.offsetLocation(this.k0, 0.0f);
        try {
            return this.e0.n(motionEvent);
        } finally {
            motionEvent.offsetLocation(-this.k0, 0.0f);
        }
    }

    @Override // fwc
    public final void d() {
        gb2 gb2Var = this.a.E;
        if (gb2Var == null || gb2Var.eb == null) {
            return;
        }
        try {
            gb2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        gb2Var.eb.z(gb2Var, gb2Var.h1, gb2Var.i1);
    }

    @Override // fwc
    public final void f(String str) {
        View view = this.W;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        kh0.k(view, str);
    }

    @Override // fwc
    public final void g() {
        bwc bwcVar = this.Y;
        kwc d = bwcVar == null ? null : bwcVar.d();
        rwc rwcVar = d == null ? null : d.g;
        if (rwcVar != this.m0) {
            this.m0 = rwcVar;
            if (rwcVar != null) {
                ArrayList arrayList = rwcVar.a;
                this.n0 = new pib[arrayList.size()];
                int i = 0;
                while (true) {
                    pib[] pibVarArr = this.n0;
                    if (i >= pibVarArr.length) {
                        break;
                    }
                    pibVarArr[i] = new kb9(this, (pwc) arrayList.get(i));
                    i++;
                }
            } else {
                this.n0 = null;
            }
            this.a.P();
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean i0() {
        boolean z;
        String str = this.X.url;
        bwc bwcVar = this.Y;
        ConcurrentHashMap concurrentHashMap = vvc.a;
        if (bwcVar != null && bwcVar.h > 0) {
            return bwcVar.k;
        }
        svc svcVar = vvc.m(str) ? (svc) vvc.a.get(str) : null;
        tvc tvcVar = svcVar != null ? (tvc) vvc.b.get(svcVar.a()) : null;
        if (tvcVar != null) {
            synchronized (tvcVar) {
                if (!tvcVar.a.isEmpty() && ((int[]) tvcVar.a.get(0)).length > 2) {
                    if (((int[]) tvcVar.a.get(0))[2] != 0) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // fwc
    public final void j() {
        kwc kwcVar;
        sr8 sr8Var = this.i0;
        gl.r(sr8Var);
        if (this.h0) {
            if (SystemClock.uptimeMillis() - this.g0 < 1500) {
                gl.e3(sr8Var, 200L);
                return;
            } else {
                if (k0() != this.j0) {
                    q0("on screen", true);
                    return;
                }
                return;
            }
        }
        z zVar = this.Y.e;
        if (zVar == null || (kwcVar = zVar.N) == null || !(kwcVar.h || zVar.F)) {
            gl.e3(sr8Var, 1500L);
            return;
        }
        this.h0 = true;
        this.g0 = SystemClock.uptimeMillis();
        if (k0() != this.j0) {
            q0("on screen, loaded", true);
        }
    }

    public final int k0() {
        return vvc.c(this.X.url, this.Y, u0());
    }

    public final float m0() {
        return this.b.top + this.s0;
    }

    public final float n0() {
        return u0() + (this.b.left - this.k0);
    }

    public final void o0(int i, String str, String str2, boolean z) {
        String str3;
        if (w01.a) {
            long j = -1;
            long uptimeMillis = this.f0 ? SystemClock.uptimeMillis() - this.g0 : -1L;
            gwc gwcVar = this.e0;
            if (gwcVar != null && gwcVar.s != 0) {
                j = SystemClock.uptimeMillis() - gwcVar.s;
            }
            StringBuilder sb = new StringBuilder("widget height ");
            sb.append(this.X.url.substring(10));
            sb.append(": ");
            sb.append(str);
            sb.append(", ");
            sb.append(Math.round(i / gl.p));
            sb.append(" (");
            sb.append(str2);
            sb.append(") -> ");
            sb.append(Math.round(this.j0 / gl.p));
            sb.append(" (");
            sb.append(this.l0);
            sb.append("), width ");
            sb.append(Math.round(u0() / gl.p));
            String str4 = "";
            sb.append(z ? ", animated" : "");
            sb.append(this.W != null ? ", on screen" : ", off screen");
            sb.append(uptimeMillis >= 0 ? ug8.n(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.Y != null) {
                StringBuilder sb2 = new StringBuilder(", session ");
                sb2.append(this.Y.p);
                sb2.append(this.Y.f != null ? " (snapshot)" : "");
                z zVar = this.Y.e;
                sb2.append((zVar == null || !zVar.I) ? ", scripts held" : "");
                str3 = sb2.toString();
            } else {
                str3 = ", no widget yet";
            }
            sb.append(str3);
            if (j >= 0 && j < 5000) {
                str4 = ug8.n(j, ", touched ", " ms ago");
            }
            de9.s(str4, sb);
        }
    }

    public final void p0(String str) {
        if (this.W != null) {
            bwc bwcVar = this.Y;
            if ((bwcVar == null || bwcVar.h <= 0) && k0() != this.j0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k0 = k0();
        int i = this.j0;
        if (k0 == i) {
            return;
        }
        String str2 = this.l0;
        this.j0 = k0;
        this.l0 = vvc.j(this.X.url, this.Y, u0());
        o0(i, "away: ".concat(str), str2, false);
        rh9 rh9Var = this.a;
        rh9Var.P();
        k27 k27Var = rh9Var.b;
        if (k27Var != null) {
            k27Var.M1 = true;
        }
        this.o0 = true;
    }

    public final void q0(String str, boolean z) {
        int k0 = k0();
        int i = this.j0;
        boolean z2 = false;
        boolean z3 = k0 != i;
        String str2 = this.l0;
        this.j0 = k0;
        this.l0 = vvc.j(this.X.url, this.Y, u0());
        rh9 rh9Var = this.a;
        if (z3) {
            o0(i, str, str2, z);
            rh9Var.P();
            if (z) {
                this.p0 = SystemClock.uptimeMillis();
                this.q0 = false;
            }
        }
        k27 k27Var = rh9Var.b;
        if (k27Var != null) {
            k27Var.M1 = true;
        }
        gb2 gb2Var = rh9Var.E;
        bb2 bb2Var = rh9Var.F;
        View view = this.W;
        if (view == null || gb2Var == null || bb2Var == null) {
            if (view != null) {
                view.requestLayout();
                return;
            }
            return;
        }
        if (z3 && !i0() && (gb2Var.getParent() instanceof RecyclerView)) {
            View view2 = (View) gb2Var.getParent();
            if (gb2Var.getBottom() > view2.getPaddingTop() && gb2Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                z2 = true;
            }
        }
        if (z) {
            bb2Var.G1(gb2Var, z2, z2);
        } else {
            bb2Var.x2(gb2Var, z2, z2);
        }
    }

    public final void r0() {
        k27 k27Var;
        kwc kwcVar;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        z zVar = this.Y.e;
        this.h0 = (zVar == null || (kwcVar = zVar.N) == null || (!kwcVar.h && !zVar.F)) ? false : true;
        this.Y.l(u0());
        rh9 rh9Var = this.a;
        gb2 gb2Var = rh9Var.E;
        wjb resourcesProvider = gb2Var != null ? gb2Var.getResourcesProvider() : null;
        this.a0 = mwc.e(resourcesProvider, rh9Var.D());
        this.Y.j(mwc.a(resourcesProvider, rh9Var.D()));
        this.e0.b(this.Y);
        this.e0.q(true);
        svc svcVar = (svc) vvc.a.get(this.X.url);
        if (svcVar != null) {
            svcVar.u = this;
        }
        vvc.t(this.Y);
        boolean z = this.o0 && (k27Var = this.a.b) != null && k27Var.M1;
        this.o0 = false;
        if (z || k0() != this.j0) {
            gl.d3(new k08((byte) 6, (Object) this, z));
        }
    }

    public final void s0() {
        if (this.f0) {
            this.f0 = false;
            gl.r(this.i0);
            this.e0.q(false);
            this.e0.r();
            bwc bwcVar = this.Y;
            if (bwcVar != null) {
                vvc.r(bwcVar);
            }
        }
    }

    public final int u0() {
        return this.c + (j0() << 1);
    }
}
