// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class y08 extends FrameLayout implements tjb {
    public da7 E;
    public byte F;
    public final RectF G;
    public final wjb a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final pb0 e;
    public final zr1 f;
    public final jia h;
    public boolean n;
    public final tl r;
    public final tl s;
    public final tl w;
    public final v2b x;
    public final lm y;

    public y08(int i, long j, wjb wjbVar, Context context) {
        super(context);
        CharSequence r;
        long c;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        pb0 pb0Var = new pb0((wjb) null);
        this.e = pb0Var;
        this.w = new tl(gl.L(20.0f), 13, this, false);
        this.x = new v2b(this);
        this.y = new lm(320L, this, s33.h);
        this.G = new RectF();
        this.b = i;
        this.a = wjbVar;
        long j2 = 0;
        boolean z = j < 0;
        this.c = z;
        zr1 zr1Var = new zr1((byte) 2, context, this);
        this.f = zr1Var;
        this.r = new tl(gl.L(17.0f), zr1Var);
        this.s = new tl(gl.L(24.0f), zr1Var);
        zr1Var.setLeftDrawableOutside(true);
        zr1Var.setRightDrawableOutside(true);
        zr1Var.setTextColor(-1);
        zr1Var.setTextSize(20);
        zr1Var.setTypeface(gl.o());
        zr1Var.setWidthWrapContent(true);
        addView(zr1Var, nme.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        jia jiaVar = new jia(context);
        this.h = jiaVar;
        jiaVar.setTextSize(14);
        jiaVar.setTextColor(-2130706433);
        jiaVar.setGravity(1);
        addView(jiaVar, nme.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.q0(gl.L(96.0f));
        if (z) {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            r = K0 == null ? "" : K0.title;
            pb0Var.p(K0);
            imageReceiver.U(K0, pb0Var, null);
            c = cf3.c(K0);
            if (K0 != null) {
                j2 = cf3.f(K0.emoji_status);
            }
        } else {
            TLRPC.User f = y6c.h(i).f();
            r = l7c.r(f);
            pb0Var.q(f);
            imageReceiver.U(f, pb0Var, null);
            c = cf3.c(f);
            if (f != null) {
                j2 = cf3.f(f.emoji_status);
            }
        }
        try {
            r = vu3.m(r, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f.l(r, false);
        this.r.j(c, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j2, false);
        this.f.i(this.s);
        if (this.c) {
            long j3 = -j;
            TLRPC.Chat K02 = na7.q1(i).K0(Long.valueOf(j3));
            TLRPC.ChatFull L0 = na7.q1(i).L0(j3);
            if (L0 != null && L0.participants_count > 0) {
                boolean V = hc2.V(K02);
                jia jiaVar2 = this.h;
                int i2 = L0.participants_count;
                if (V) {
                    jiaVar2.l(k96.H(',', "Subscribers", i2), false);
                } else {
                    jiaVar2.l(k96.H(',', "Members", i2), false);
                }
            } else if (K02 == null || K02.participants_count <= 0) {
                boolean t0 = hc2.t0(K02);
                boolean V2 = hc2.V(K02);
                jia jiaVar3 = this.h;
                if (V2) {
                    jiaVar3.l(k96.M0(t0 ? 2131752306 : 2131752317, null).toLowerCase(), false);
                } else {
                    jiaVar3.l(k96.M0(t0 ? 2131748446 : 2131748449, null).toLowerCase(), false);
                }
            } else {
                boolean V3 = hc2.V(K02);
                jia jiaVar4 = this.h;
                int i3 = K02.participants_count;
                if (V3) {
                    jiaVar4.l(k96.H(',', "Subscribers", i3), false);
                } else {
                    jiaVar4.l(k96.H(',', "Members", i3), false);
                }
            }
        } else {
            this.h.l(k96.M0(2131747633, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i) {
        int v0;
        int v02;
        wjb wjbVar = this.a;
        if (i >= 14) {
            ea7 ea7Var = na7.q1(y6c.t0).E3;
            da7 d = ea7Var != null ? ea7Var.d(i) : null;
            if (d != null) {
                int f = d.f();
                v0 = bkb.v0(bkb.o8[pb0.e(f)], wjbVar);
                v02 = bkb.v0(bkb.p8[pb0.e(f)], wjbVar);
            } else {
                long j = i;
                v0 = bkb.v0(bkb.o8[pb0.d(j)], wjbVar);
                v02 = bkb.v0(bkb.p8[pb0.d(j)], wjbVar);
            }
        } else {
            long j2 = i;
            v0 = bkb.v0(bkb.o8[pb0.d(j2)], wjbVar);
            v02 = bkb.v0(bkb.p8[pb0.d(j2)], wjbVar);
        }
        this.e.h(v0, v02);
        invalidate();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.A8));
        hashSet.add(Integer.valueOf(bkb.m6));
        hashSet.add(Integer.valueOf(bkb.pi));
        hashSet.add(Integer.valueOf(bkb.g8));
    }

    public void b(int i, boolean z) {
        ea7 ea7Var = na7.q1(this.b).F3;
        c(ea7Var == null ? null : ea7Var.d(i), z);
    }

    public final void c(da7 da7Var, boolean z) {
        this.E = da7Var;
        wjb wjbVar = this.a;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        zr1 zr1Var = this.f;
        jia jiaVar = this.h;
        tl tlVar = this.r;
        tl tlVar2 = this.s;
        tl tlVar3 = this.w;
        if (da7Var != null) {
            int i = da7Var.a;
            if (i != 0) {
                tlVar3.k(Integer.valueOf(i));
            } else {
                tlVar3.k(Integer.valueOf(a18.y0(da7Var.c(a))));
            }
            tlVar2.k(Integer.valueOf(bm2.f(0.25f, da7Var.m(bkb.I.o()), -1)));
            tlVar.k(Integer.valueOf(bm2.f(0.25f, da7Var.m(bkb.I.o()), -1)));
            int f = bm2.f(0.5f, da7Var.m(a), da7Var.n(a));
            int i2 = bkb.r8;
            if (bkb.c1(bkb.v0(i2, wjbVar))) {
                jiaVar.setTextColor(bkb.C(a, bkb.v0(i2, wjbVar), f, bkb.v0(bkb.g8, wjbVar), f));
            } else {
                jiaVar.setTextColor(f);
            }
            zr1Var.setTextColor(-1);
        } else {
            int i3 = bkb.r8;
            if (gl.B(bkb.v0(i3, wjbVar)) > 0.8f) {
                tlVar3.k(Integer.valueOf(bkb.v0(bkb.m6, wjbVar)));
            } else if (gl.B(bkb.v0(i3, wjbVar)) < 0.2f) {
                tlVar3.k(Integer.valueOf(bkb.p1(0.5f, bkb.v0(bkb.z8, wjbVar))));
            } else {
                tlVar3.k(Integer.valueOf(a18.y0(bkb.v0(i3, wjbVar))));
            }
            int i4 = bkb.pi;
            tlVar2.k(Integer.valueOf(bkb.v0(i4, wjbVar)));
            tlVar.k(Integer.valueOf(bkb.v0(i4, wjbVar)));
            jiaVar.setTextColor(bkb.v0(bkb.A8, wjbVar));
            zr1Var.setTextColor(bkb.v0(bkb.z8, wjbVar));
        }
        this.F = (byte) 0;
        this.x.c(da7Var, z);
        invalidate();
    }

    public final void d(long j, boolean z, boolean z2) {
        tl tlVar = this.w;
        if (j == 0) {
            tlVar.g(null, z2);
        } else {
            tlVar.j(j, z2);
        }
        wjb wjbVar = this.a;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        da7 da7Var = this.E;
        if (da7Var != null) {
            int i = da7Var.a;
            if (i != 0) {
                tlVar.k(Integer.valueOf(i));
            } else {
                tlVar.k(Integer.valueOf(a18.y0(da7Var.c(a))));
            }
        } else {
            int i2 = bkb.r8;
            if (gl.B(bkb.v0(i2, wjbVar)) > 0.8f) {
                tlVar.k(Integer.valueOf(bkb.v0(bkb.m6, wjbVar)));
            } else if (gl.B(bkb.v0(i2, wjbVar)) < 0.2f) {
                tlVar.k(Integer.valueOf(bkb.p1(0.5f, bkb.w0(null, bkb.z8, false))));
            } else {
                tlVar.k(Integer.valueOf(a18.y0(bkb.w0(null, i2, false))));
            }
        }
        da7 da7Var2 = this.E;
        tl tlVar2 = this.s;
        if (da7Var2 != null) {
            tlVar2.k(Integer.valueOf(bm2.f(0.5f, da7Var2.e(1, wjbVar), this.E.e(this.E.o(a) ? 4 : 2, wjbVar))));
        } else {
            tlVar2.k(Integer.valueOf(bkb.v0(bkb.pi, wjbVar)));
        }
        this.F = (byte) 1;
        if (!z2) {
            this.y.a(z);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float height = getHeight() - gl.L(82.0f);
        RectF rectF = this.G;
        rectF.set((getWidth() - gl.L(86.0f)) / 2.0f, getHeight() - gl.L(168.0f), (gl.L(86.0f) + getWidth()) / 2.0f, height);
        ana.c(canvas, this.w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        int L = gl.L(this.n ? 18.0f : 54.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.q0(L);
        imageReceiver.k0(rectF);
        imageReceiver.h(canvas, null);
        float width = (rectF.width() / 2.0f) + gl.L(4.0f);
        float L2 = gl.L(this.n ? 22.0f : 58.0f);
        canvas.drawRoundRect(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width, L2, L2, this.x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j, boolean z, boolean z2) {
        int j2;
        tl tlVar = this.s;
        tlVar.j(j, z2);
        tlVar.m(z, z2);
        wjb wjbVar = this.a;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        da7 da7Var = this.E;
        if (da7Var != null) {
            int h = da7Var.h(a);
            boolean o = this.E.o(a);
            da7 da7Var2 = this.E;
            if (o) {
                j2 = (a ? da7Var2.h : da7Var2.g)[4];
            } else {
                j2 = da7Var2.j(a);
            }
            tlVar.k(Integer.valueOf(bm2.f(0.5f, h, j2)));
        } else {
            tlVar.k(Integer.valueOf(bkb.v0(bkb.pi, wjbVar)));
        }
        this.F = (byte) 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a();
        this.d.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.b();
        this.d.K();
    }

    public void setForum(boolean z) {
        if (this.n != z) {
            invalidate();
        }
        this.n = z;
    }

    @Override // tjb
    public final void updateColors() {
        tl tlVar;
        tl tlVar2;
        zr1 zr1Var;
        jia jiaVar;
        int j;
        tl tlVar3 = this.w;
        if (tlVar3 == null || (tlVar = this.s) == null || (tlVar2 = this.r) == null || (zr1Var = this.f) == null || (jiaVar = this.h) == null) {
            return;
        }
        wjb wjbVar = this.a;
        try {
            boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
            da7 da7Var = this.E;
            if (da7Var != null) {
                int i = da7Var.a;
                if (i != 0) {
                    tlVar3.k(Integer.valueOf(i));
                } else {
                    tlVar3.k(Integer.valueOf(a18.y0(da7Var.c(a))));
                }
                tlVar2.k(Integer.valueOf(bm2.f(0.25f, this.E.m(bkb.I.o()), -1)));
                byte b = this.F;
                if (b == 1) {
                    int e = this.E.e(1, wjbVar);
                    boolean o = this.E.o(a);
                    da7 da7Var2 = this.E;
                    tlVar.k(Integer.valueOf(bm2.f(0.5f, e, o ? da7Var2.e(4, wjbVar) : da7Var2.e(2, wjbVar))));
                } else {
                    da7 da7Var3 = this.E;
                    if (b == 2) {
                        int h = da7Var3.h(a);
                        boolean o2 = this.E.o(a);
                        da7 da7Var4 = this.E;
                        if (o2) {
                            j = (a ? da7Var4.h : da7Var4.g)[4];
                        } else {
                            j = da7Var4.j(a);
                        }
                        tlVar.k(Integer.valueOf(bm2.f(0.5f, h, j)));
                    } else {
                        tlVar.k(Integer.valueOf(bm2.f(0.25f, da7Var3.m(bkb.I.o()), -1)));
                    }
                }
                int f = bm2.f(0.5f, this.E.m(a), this.E.n(a));
                int i2 = bkb.r8;
                if (bkb.c1(bkb.v0(i2, wjbVar))) {
                    jiaVar.setTextColor(bkb.C(a, bkb.v0(i2, wjbVar), f, bkb.v0(bkb.g8, wjbVar), f));
                } else {
                    jiaVar.setTextColor(f);
                }
                zr1Var.setTextColor(-1);
            } else {
                int i3 = bkb.r8;
                if (gl.B(bkb.v0(i3, wjbVar)) > 0.8f) {
                    tlVar3.k(Integer.valueOf(bkb.v0(bkb.m6, wjbVar)));
                } else if (gl.B(bkb.v0(i3, wjbVar)) < 0.2f) {
                    tlVar3.k(Integer.valueOf(bkb.p1(0.5f, bkb.v0(bkb.z8, wjbVar))));
                } else {
                    tlVar3.k(Integer.valueOf(a18.y0(bkb.v0(i3, wjbVar))));
                }
                int i4 = bkb.pi;
                tlVar.k(Integer.valueOf(bkb.v0(i4, wjbVar)));
                tlVar2.k(Integer.valueOf(bkb.v0(i4, wjbVar)));
                jiaVar.setTextColor(bkb.v0(bkb.A8, wjbVar));
                zr1Var.setTextColor(bkb.v0(bkb.z8, wjbVar));
            }
            invalidate();
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }
}
