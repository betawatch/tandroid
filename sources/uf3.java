// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class uf3 extends FrameLayout {
    public jia E;
    public long F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public final u2b P;
    public float Q;
    public float R;
    public ty8 S;
    public nf3 T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final lm b0;
    public boolean c;
    public final /* synthetic */ oh3 c0;
    public boolean d;
    public ev0 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final pb0 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final pb0 w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf3(oh3 oh3Var, Context context) {
        super(context);
        this.c0 = oh3Var;
        this.n = new pb0((wjb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new pb0((wjb) null);
        this.x = true;
        u2b u2bVar = new u2b(null, true);
        this.P = u2bVar;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new lm(this, 0L, 350L, s33.h);
        u2bVar.o = oh3Var.b == 1;
        u2bVar.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, nme.c(-2.0f, -1));
        imageReceiver.q0(gl.L(48.0f) / 2);
        imageReceiver2.q0(gl.L(48.0f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipInParent(boolean z) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z);
    }

    public final void b() {
        jia jiaVar = new jia(getContext());
        this.E = jiaVar;
        jiaVar.setTypeface(gl.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        this.E.setTextColor(this.c0.getTextColor());
        kk7.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, nme.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.q0(gl.L(48.0f) / 2);
        this.s.q0(gl.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f, float f2, float f3) {
        oh3 oh3Var = this.c0;
        Paint paint = oh3Var.I;
        int i = oh3Var.b;
        Paint paint2 = oh3Var.H;
        g2b g2bVar = oh3Var.s;
        Drawable drawable = oh3Var.c;
        if (this.G && !g2bVar.J(this.F) && Utilities.x(g2bVar.E(this.F))) {
            float L = f + gl.L(16.0f);
            float L2 = f2 + gl.L(16.0f);
            paint2.setColor(bkb.p1(f3, oh3Var.f(bkb.Xl)));
            if (i == 0) {
                paint.setColor(bkb.p1(f3, oh3Var.f(bkb.r8)));
            } else {
                paint.setColor(bkb.p1(f3, oh3Var.f(bkb.L8)));
            }
            canvas.drawCircle(L, L2, gl.L(11.0f), paint);
            canvas.drawCircle(L, L2, gl.L(9.0f), paint2);
            int f4 = oh3Var.f(i == 0 ? bkb.r8 : bkb.L8);
            if (f4 != oh3Var.e) {
                oh3Var.e = f4;
                drawable.setColorFilter(new PorterDuffColorFilter(f4, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f3 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f, float f2, float f3, boolean z) {
        float f4 = this.K;
        oh3 oh3Var = this.c0;
        if (f4 != f || this.L != f2 || 0.0f != f3 || this.W != z) {
            this.W = z;
            this.K = f;
            this.L = f2;
            invalidate();
            oh3Var.h.invalidate();
        }
        float i = this.O ? 0.0f : 1.0f - Utilities.i(oh3Var.O / oh3Var.C0, 1.0f, 0.0f);
        this.R = i;
        float f5 = i * this.Q;
        FrameLayout frameLayout = this.y;
        frameLayout.setAlpha(f5);
        frameLayout.setVisibility(f5 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0221  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        float f;
        Canvas canvas2;
        u2b u2bVar;
        float f2;
        ImageReceiver imageReceiver2;
        float f3;
        ?? r11;
        float size;
        boolean z;
        int i;
        float f4;
        float f5;
        boolean z2;
        float f6;
        boolean z3;
        boolean[] zArr;
        ImageReceiver imageReceiver3;
        boolean z4;
        ty8 ty8Var;
        float L = gl.L(48.0f);
        float L2 = gl.L(26.33f);
        float L3 = gl.L(8.0f);
        oh3 oh3Var = this.c0;
        int i2 = oh3Var.b;
        g2b g2bVar = oh3Var.s;
        Paint paint = oh3Var.I;
        float i3 = Utilities.i(oh3Var.o0 / 0.5f, 1.0f, 0.0f) * L3;
        if (this.W) {
            i3 += Utilities.i((oh3Var.o0 - 0.5f) / 0.5f, 1.0f, 0.0f) * gl.L(16.0f);
        }
        float R1 = gl.R1(L + i3, L2, this.K);
        float f7 = R1 / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f7;
        float R12 = gl.R1(measuredWidth, 0.0f, this.K);
        float R13 = gl.R1(gl.L(5.0f), (a.getCurrentActionBarHeight() - L2) / 2.0f, this.K);
        float i4 = Utilities.i(this.K / 0.5f, 1.0f, 0.0f);
        u2b u2bVar2 = this.P;
        u2bVar2.a = true;
        RectF rectF = u2bVar2.F;
        if (!u2bVar2.p) {
            u2bVar2.e = 1.0f - oh3Var.e0;
        }
        float f8 = R13 + R1;
        rectF.set(R12, R13, R12 + R1, f8);
        u2bVar2.G = gl.N(1.33f) * this.K;
        ImageReceiver imageReceiver4 = this.r;
        imageReceiver4.setAlpha(1.0f);
        imageReceiver4.q0((int) f7);
        float f9 = R12 + f7;
        this.M = f9;
        float f10 = R13 + f7;
        this.N = f10;
        if (i2 == 0) {
            paint.setColor(oh3Var.f(bkb.r8));
        } else {
            paint.setColor(oh3Var.f(bkb.L8));
        }
        if (this.K != 0.0f) {
            imageReceiver = imageReceiver4;
            f = R12;
            canvas.drawCircle(this.M, this.N, gl.N(1.5f) + f7, paint);
        } else {
            imageReceiver = imageReceiver4;
            f = R12;
        }
        canvas.save();
        float f11 = this.M;
        float f12 = this.N;
        float f13 = this.U;
        canvas.scale(f13, f13, f11, f12);
        if (this.S == null) {
            this.S = oh3Var.n;
        }
        ArrayList arrayList = (ArrayList) g2bVar.c.f(this.F);
        if ((arrayList == null || arrayList.isEmpty()) ? false : true) {
            canvas2 = canvas;
            u2bVar = u2bVar2;
            f2 = f8;
            imageReceiver2 = imageReceiver;
            f3 = f;
            r11 = 0;
            float f14 = 0.0f;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                f14 += ((f2b) arrayList.get(i5)).h;
            }
            size = (g2bVar.d + f14) / (arrayList.size() + r2);
            z = ((f2b) b00.f(1, arrayList)).H;
            oh3Var.n0 = z;
        } else {
            if (!this.a0 || (ty8Var = this.S) == null || ty8Var.f >= 0.98f) {
                float d = this.b0.d(this.H);
                if (this.x) {
                    if (this.a0) {
                        u2bVar2.p = true;
                        u2bVar2.e = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new uz1(this, (byte) 15));
                        ofFloat.addListener(new im2(this, (byte) 6));
                        ofFloat.setDuration(100L);
                        ofFloat.start();
                    }
                    float f15 = d * u2bVar2.e;
                    u2bVar2.b = !this.a0;
                    if (!this.c && oh3Var.o0 <= 0.0f) {
                        if (gl.U1(s33.g.getInterpolation(this.K), getMeasuredWidth(), gl.L(16.0f)) < (gl.N(3.5f) + f7) * 2.0f) {
                            f6 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r3))) * 2.0f;
                            u2bVar2.f = f6;
                            u2bVar2.l = this.c;
                            u2bVar2.m = this.d;
                            u2bVar2.u = 1.0f - f15;
                            z3 = this.G;
                            if (z3 && this.I) {
                                u2bVar2.s = this.J;
                            } else {
                                u2bVar2.s = 0L;
                            }
                            u2bVar = u2bVar2;
                            long j = this.F;
                            if (z3) {
                                zArr = null;
                                imageReceiver3 = imageReceiver;
                                f5 = i4;
                                f2 = f8;
                                f3 = f;
                                z4 = false;
                                canvas2 = canvas;
                                x2b.i(j, canvas2, imageReceiver3, g2bVar.J(j), u2bVar);
                            } else {
                                zArr = null;
                                imageReceiver3 = imageReceiver;
                                f5 = i4;
                                canvas2 = canvas;
                                f2 = f8;
                                f3 = f;
                                z4 = false;
                                x2b.i(j, canvas2, imageReceiver3, g2bVar.I(), u2bVar);
                            }
                            if (f15 > 0.0f) {
                                if (x2b.d == null) {
                                    kz4 kz4Var = new kz4();
                                    x2b.d = kz4Var;
                                    kz4Var.a = true;
                                    kz4Var.b = true;
                                    kz4Var.c.setStrokeWidth(gl.N(2.0f));
                                    x2b.d.c.setStyle(Paint.Style.STROKE);
                                    x2b.d.c.setStrokeCap(Paint.Cap.ROUND);
                                }
                                int w0 = bkb.w0(zArr, bkb.nk, z4);
                                int w02 = bkb.w0(zArr, bkb.p7, z4);
                                x2b.d.d(bm2.f(0.25f, w0, w02), w02, z4 ? 1 : 0, z4 ? 1 : 0);
                                x2b.d.b(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.w(), imageReceiver3.x());
                                Paint paint2 = x2b.d.c;
                                paint2.setStrokeWidth(gl.L(2.0f));
                                paint2.setAlpha((int) (255.0f * f15));
                                canvas2.drawCircle(f9, f10, u2bVar.b() * (f7 + gl.L(4.0f)), paint2);
                            }
                            d = f15;
                            z2 = z4;
                        }
                    }
                    f6 = 0.0f;
                    u2bVar2.f = f6;
                    u2bVar2.l = this.c;
                    u2bVar2.m = this.d;
                    u2bVar2.u = 1.0f - f15;
                    z3 = this.G;
                    if (z3) {
                    }
                    u2bVar2.s = 0L;
                    u2bVar = u2bVar2;
                    long j2 = this.F;
                    if (z3) {
                    }
                    if (f15 > 0.0f) {
                    }
                    d = f15;
                    z2 = z4;
                } else {
                    canvas2 = canvas;
                    u2bVar = u2bVar2;
                    f2 = f8;
                    f5 = i4;
                    f3 = f;
                    z2 = 0;
                }
                this.a0 = z2;
                i = z2;
                if (this.x) {
                    canvas2.save();
                    float f16 = 1.0f - f5;
                    canvas2.scale(f16, f16, this.M + gl.L(16.0f), this.N + gl.L(16.0f));
                    c(canvas2, this.M, this.N, 1.0f);
                    float f17 = this.M;
                    float f18 = this.N;
                    if (d > 0.0f) {
                        float L4 = f17 + gl.L(17.0f);
                        float L5 = f18 + gl.L(17.0f);
                        Paint paint3 = oh3Var.H;
                        paint3.setColor(bkb.p1(d, oh3Var.f(bkb.p7)));
                        if (i2 == 0) {
                            paint.setColor(bkb.p1(d, oh3Var.f(bkb.r8)));
                        } else {
                            paint.setColor(bkb.p1(d, oh3Var.f(bkb.L8)));
                        }
                        float interpolation = s33.k.getInterpolation(d) * gl.L(9.0f);
                        canvas2.drawCircle(L4, L5, gl.L(2.0f) + interpolation, paint);
                        canvas2.drawCircle(L4, L5, interpolation, paint3);
                        paint3.setColor(bkb.p1(d, oh3Var.getTextColor()));
                        RectF rectF2 = gl.P;
                        rectF2.set(L4 - gl.L(1.0f), L5 - gl.N(4.6f), gl.L(1.0f) + L4, gl.N(1.6f) + L5);
                        canvas2.drawRoundRect(rectF2, gl.L(3.0f), gl.L(3.0f), paint3);
                        rectF2.set(L4 - gl.L(1.0f), gl.N(2.6f) + L5, L4 + gl.L(1.0f), gl.N(4.6f) + L5);
                        canvas2.drawRoundRect(rectF2, gl.L(3.0f), gl.L(3.0f), paint3);
                    }
                    canvas2.restore();
                    i = z2;
                }
                canvas2.restore();
                if (this.I || this.L <= 0.0f) {
                    f4 = f3;
                } else {
                    ImageReceiver imageReceiver5 = this.s;
                    f4 = f3;
                    imageReceiver5.i0(f4, R13, R1, R1);
                    imageReceiver5.setAlpha(this.L);
                    imageReceiver5.h(canvas2, null);
                }
                float L6 = ((1.0f - this.K) * gl.L(7.0f)) + f2;
                FrameLayout frameLayout = this.y;
                frameLayout.setTranslationY(L6);
                frameLayout.setTranslationX(f4 - measuredWidth);
                if (!this.O) {
                    if (this.G) {
                        this.Q = 1.0f;
                    } else {
                        r15 = u2bVar.n == 2 ? 0.7f : 1.0f;
                        this.Q = r15;
                    }
                    float f19 = this.R * r15;
                    frameLayout.setAlpha(f19);
                    frameLayout.setVisibility(f19 > 0.0f ? i : 4);
                }
                super.dispatchDraw(canvas);
            }
            z = oh3Var.n0;
            canvas2 = canvas;
            u2bVar = u2bVar2;
            f2 = f8;
            imageReceiver2 = imageReceiver;
            f3 = f;
            size = 1.0f;
            r11 = 0;
        }
        invalidate();
        if (this.S == null) {
            ty8 ty8Var2 = oh3Var.n;
            if (ty8Var2 != null) {
                this.S = ty8Var2;
            } else {
                ty8 ty8Var3 = new ty8(this);
                this.S = ty8Var3;
                oh3Var.n = ty8Var3;
                ty8Var3.d(null, true, r11);
            }
        }
        if (this.x) {
            canvas2.save();
            canvas2.scale(u2bVar.b(), u2bVar.b(), rectF.centerX(), rectF.centerY());
            imageReceiver2.k0(rectF);
            imageReceiver2.h(canvas2, null);
            canvas2.restore();
        }
        this.S.q = r11;
        Paint o = z ? x2b.o(imageReceiver2) : x2b.t(imageReceiver2, true);
        o.setAlpha(kk7.d4);
        ty8 ty8Var4 = this.S;
        ty8Var4.r = o;
        ty8Var4.f((int) (imageReceiver2.L0 - gl.L(3.0f)), (int) (imageReceiver2.M0 - gl.L(3.0f)), (int) (imageReceiver2.w() + gl.L(3.0f)), (int) (imageReceiver2.x() + gl.L(3.0f)));
        this.S.e(this.a0, Utilities.i(size, 1.0f, 0.0f));
        if (imageReceiver2.R0) {
            this.S.a(canvas2);
        }
        this.a0 = true;
        invalidate();
        i = r11;
        canvas2.restore();
        if (this.I) {
        }
        f4 = f3;
        float L62 = ((1.0f - this.K) * gl.L(7.0f)) + f2;
        FrameLayout frameLayout2 = this.y;
        frameLayout2.setTranslationY(L62);
        frameLayout2.setTranslationX(f4 - measuredWidth);
        if (!this.O) {
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float L = gl.L(48.0f);
        float L2 = gl.L(26.33f);
        return gl.R1(gl.L(5.0f), (a.getCurrentActionBarHeight() - L2) / 2.0f, this.c0.d0) + (gl.R1(L, L2, this.K) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            oh3 oh3Var = this.c0;
            pf3 pf3Var = oh3Var.r;
            if (parent == pf3Var) {
                pf3Var.invalidate();
            } else {
                oh3Var.invalidate();
            }
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.I();
        this.s.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        this.s.K();
        this.P.g();
        ev0 ev0Var = this.e;
        if (ev0Var != null) {
            ev0Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.O ? gl.L(70.0f) : this.c0.N, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j) {
        TLRPC.Chat chat;
        if (this.J != j) {
            this.J = j;
            boolean z = j != -1;
            this.I = z;
            ImageReceiver imageReceiver = this.s;
            if (!z) {
                imageReceiver.f();
                return;
            }
            int i = this.c0.f;
            if (j > 0) {
                TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
                this.f = V1;
                this.h = null;
                chat = V1;
            } else {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                this.h = K0;
                this.f = null;
                chat = K0;
            }
            if (chat != null) {
                pb0 pb0Var = this.w;
                pb0Var.o(chat);
                imageReceiver.U(chat, pb0Var, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDialogId(long j) {
        TLRPC.Chat chat;
        f2b f2bVar;
        oh3 oh3Var = this.c0;
        int i = oh3Var.f;
        g2b g2bVar = oh3Var.s;
        long j2 = this.F;
        byte b = 0;
        boolean z = j2 == j;
        if (!z && this.e != null) {
            g2bVar.g0(j2, false);
            this.e.a();
            this.e = null;
        }
        this.F = j;
        this.G = j == y6c.h(i).e();
        this.H = g2bVar.P(j);
        if (j > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            this.f = V1;
            this.h = null;
            chat = V1;
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            this.h = K0;
            this.f = null;
            chat = K0;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.E.l("", false);
            imageReceiver.f();
            return;
        }
        pb0 pb0Var = this.n;
        pb0Var.o(chat);
        imageReceiver.U(chat, pb0Var, null);
        if (this.O) {
            return;
        }
        this.E.i(null);
        if (g2bVar.P(j)) {
            this.E.setTextSize(10);
            this.E.l(k96.M0(2131750833, null), false);
            this.V = false;
            return;
        }
        if (!Utilities.x(g2bVar.E(j))) {
            this.E.setTextSize(10);
            x2b.a(this.E);
            this.V = true;
            return;
        }
        HashMap hashMap = (HashMap) g2bVar.e.f(j);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                f2bVar = (f2b) values.iterator().next();
                if (f2bVar == null) {
                    this.E.setTextSize(10);
                    x2b.a(this.E);
                    this.V = true;
                    return;
                }
                if (this.G) {
                    if (z && this.V && !this.O) {
                        jia jiaVar = this.E;
                        b();
                        ValueAnimator valueAnimator = oh3Var.k0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            oh3Var.k0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        oh3Var.k0 = ofFloat;
                        ofFloat.addUpdateListener(new pk(this, jiaVar, (byte) 12));
                        oh3Var.k0.addListener(new u5(this, jiaVar, (byte) 17));
                        oh3Var.k0.setDuration(150L);
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(gl.L(5.0f));
                        oh3Var.l0 = new tf3(this, b);
                    }
                    gl.d3(oh3Var.l0, 500L);
                    this.V = false;
                    this.E.setTextSize(10);
                    this.E.l(k96.M0(2131748109, null), false);
                    return;
                }
                TLRPC.User user = this.f;
                jia jiaVar2 = this.E;
                if (user == null) {
                    jiaVar2.setTextSize(11);
                    this.E.l(b00.e(this.E, this.h.title, false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                jiaVar2.setTextSize(11);
                String str = this.f.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                String str2 = trim;
                if (!this.f.verified) {
                    this.E.l(b00.e(this.E, str2, false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                if (this.T == null) {
                    Drawable mutate = oh3Var.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = oh3Var.getContext().getDrawable(R.drawable.verified_check).mutate();
                    nf3 nf3Var = new nf3(oh3Var, mutate, mutate2, mutate, mutate2);
                    nf3Var.x = true;
                    this.T = nf3Var;
                }
                this.E.l(b00.e(this.E, str2, false, null, 0), false);
                this.E.i(this.T);
                return;
            }
        }
        f2bVar = null;
        if (f2bVar == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        u2b u2bVar = this.P;
        if (z && u2bVar.H == null) {
            u2bVar.H = new n41(this, 1.5f, 5.0f);
        }
        n41 n41Var = u2bVar.H;
        if (n41Var != null) {
            n41Var.c(z);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            oh3 oh3Var = this.c0;
            pf3 pf3Var = oh3Var.r;
            if (parent == pf3Var) {
                pf3Var.invalidate();
            }
            oh3Var.invalidate();
        }
        super.invalidate(i, i2, i3, i4);
    }
}
