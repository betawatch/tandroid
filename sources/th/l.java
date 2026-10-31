package th;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u10;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends FrameLayout {
    public org.telegram.ui.ActionBar.u5 D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final t5 O;
    public float P;
    public float Q;
    public fi0 R;
    public e S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a;
    public final org.telegram.ui.Components.t5 a0;
    public int b;
    public final /* synthetic */ uw b0;
    public boolean c;
    public boolean d;
    public org.telegram.ui.web.x0 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final r8 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final r8 w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(uw uwVar, Context context) {
        super(context);
        this.b0 = uwVar;
        this.n = new r8((org.telegram.ui.ActionBar.p6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new r8((org.telegram.ui.ActionBar.p6) null);
        this.x = true;
        t5 t5Var = new t5(null, true);
        this.O = t5Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.a0 = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        t5Var.o = uwVar.b == 1;
        t5Var.D = true;
        imageReceiver.J0 = true;
        imageReceiver.z1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.b6.c(-2.0f, -1));
        imageReceiver.J0(org.telegram.messenger.i0.L(48.0f) / 2);
        imageReceiver2.J0(org.telegram.messenger.i0.L(48.0f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
    }

    public final void b() {
        int textColor;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        this.D = u5Var;
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        this.D.setGravity(17);
        this.D.setTextSize(11);
        org.telegram.ui.ActionBar.u5 u5Var2 = this.D;
        textColor = this.b0.getTextColor();
        u5Var2.setTextColor(textColor);
        zs.i(this.D);
        this.D.setMaxLines(1);
        this.y.addView(this.D, w7.b6.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.J0(org.telegram.messenger.i0.L(48.0f) / 2);
        this.s.J0(org.telegram.messenger.i0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        uw uwVar = this.b0;
        int i10 = uwVar.b;
        Paint paint = uwVar.G;
        e5 e5Var = uwVar.s;
        Paint paint2 = uwVar.H;
        Drawable drawable = uwVar.c;
        if (this.F && !e5Var.K(this.E) && Utilities.x(e5Var.F(this.E))) {
            float L = f7 + org.telegram.messenger.i0.L(16.0f);
            float L2 = f10 + org.telegram.messenger.i0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(f11, uwVar.f(org.telegram.ui.ActionBar.t6.Vl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(f11, uwVar.f(org.telegram.ui.ActionBar.t6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(f11, uwVar.f(org.telegram.ui.ActionBar.t6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.i0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.i0.L(9.0f), paint);
            int f12 = uwVar.f(i10 == 0 ? org.telegram.ui.ActionBar.t6.s8 : org.telegram.ui.ActionBar.t6.M8);
            if (f12 != uwVar.e) {
                uwVar.e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float f12 = this.J;
        uw uwVar = this.b0;
        if (f12 != f7 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            uwVar.h.invalidate();
        }
        float i10 = this.N ? 0.0f : 1.0f - Utilities.i(uwVar.N / uwVar.B0, 1.0f, 0.0f);
        this.Q = i10;
        float f13 = i10 * this.P;
        FrameLayout frameLayout = this.y;
        frameLayout.setAlpha(f13);
        frameLayout.setVisibility(f13 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ImageReceiver imageReceiver;
        float f10;
        Canvas canvas2;
        t5 t5Var;
        float f11;
        boolean z10;
        float f12;
        float size;
        boolean z11;
        float f13;
        uw uwVar;
        int textColor;
        uw uwVar2;
        float f14;
        boolean z12;
        float f15;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        fi0 fi0Var;
        float L = org.telegram.messenger.i0.L(48.0f);
        float L2 = org.telegram.messenger.i0.L(26.33f);
        float L3 = org.telegram.messenger.i0.L(8.0f);
        uw uwVar3 = this.b0;
        int i10 = uwVar3.b;
        e5 e5Var = uwVar3.s;
        Paint paint = uwVar3.H;
        float i11 = Utilities.i(uwVar3.n0 / 0.5f, 1.0f, 0.0f) * L3;
        if (this.V) {
            i11 += Utilities.i((uwVar3.n0 - 0.5f) / 0.5f, 1.0f, 0.0f) * org.telegram.messenger.i0.L(16.0f);
        }
        float T1 = org.telegram.messenger.i0.T1(L + i11, L2, this.J);
        float f16 = T1 / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f16;
        float T12 = org.telegram.messenger.i0.T1(measuredWidth, 0.0f, this.J);
        float T13 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(5.0f), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L2) / 2.0f, this.J);
        float i12 = Utilities.i(this.J / 0.5f, 1.0f, 0.0f);
        t5 t5Var2 = this.O;
        t5Var2.a = true;
        RectF rectF = t5Var2.F;
        if (!t5Var2.p) {
            t5Var2.e = 1.0f - uwVar3.d0;
        }
        float f17 = T13 + T1;
        rectF.set(T12, T13, T12 + T1, f17);
        t5Var2.G = org.telegram.messenger.i0.N(1.33f) * this.J;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.J0((int) f16);
        float f18 = T12 + f16;
        this.L = f18;
        float f19 = T13 + f16;
        this.M = f19;
        if (i10 == 0) {
            f7 = f16;
            paint.setColor(uwVar3.f(org.telegram.ui.ActionBar.t6.s8));
        } else {
            f7 = f16;
            paint.setColor(uwVar3.f(org.telegram.ui.ActionBar.t6.M8));
        }
        if (this.J != 0.0f) {
            imageReceiver = imageReceiver3;
            f10 = T12;
            canvas.drawCircle(this.L, this.M, org.telegram.messenger.i0.N(1.5f) + f7, paint);
        } else {
            imageReceiver = imageReceiver3;
            f10 = T12;
        }
        canvas.save();
        float f20 = this.L;
        float f21 = this.M;
        float f22 = this.T;
        canvas.scale(f22, f22, f20, f21);
        if (this.R == null) {
            this.R = uwVar3.n;
        }
        ArrayList arrayList = (ArrayList) e5Var.c.f(this.E);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.W && (fi0Var = this.R) != null && fi0Var.f < 0.98f)) {
            canvas2 = canvas;
            t5Var = t5Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f11 = f10;
            z10 = false;
            f12 = f17;
            if (z13) {
                float f23 = 0.0f;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    f23 += ((d5) arrayList.get(i13)).h;
                }
                size = (e5Var.d + f23) / (arrayList.size() + r4);
                z11 = ((d5) i0.a.g(1, arrayList)).G;
                uwVar3.m0 = z11;
            } else {
                z11 = uwVar3.m0;
                size = 1.0f;
            }
            invalidate();
            if (this.R == null) {
                fi0 fi0Var2 = uwVar3.n;
                if (fi0Var2 != null) {
                    this.R = fi0Var2;
                } else {
                    fi0 fi0Var3 = new fi0(this);
                    this.R = fi0Var3;
                    uwVar3.n = fi0Var3;
                    fi0Var3.d(null, true, false);
                }
            }
            if (this.x) {
                canvas2.save();
                canvas2.scale(t5Var.b(), t5Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.A0(rectF);
                imageReceiver4.h(canvas2, null);
                canvas2.restore();
            }
            this.R.q = 0;
            Paint o10 = z11 ? w5.o(imageReceiver4) : w5.t(imageReceiver4, true);
            o10.setAlpha(zs.e4);
            fi0 fi0Var4 = this.R;
            fi0Var4.t = o10;
            fi0Var4.f((int) (imageReceiver4.K0 - org.telegram.messenger.i0.L(3.0f)), (int) (imageReceiver4.L0 - org.telegram.messenger.i0.L(3.0f)), (int) (imageReceiver4.y() + org.telegram.messenger.i0.L(3.0f)), (int) (imageReceiver4.A() + org.telegram.messenger.i0.L(3.0f)));
            this.R.e(this.W, Utilities.i(size, 1.0f, 0.0f));
            if (imageReceiver4.Q0) {
                this.R.a(canvas2);
            }
            this.W = true;
            invalidate();
        } else {
            float d = this.a0.d(this.G);
            if (this.x) {
                if (this.W) {
                    t5Var2.p = true;
                    t5Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new qh.e0(this, 10));
                    ofFloat.addListener(new sg.r(this, 3));
                    uwVar2 = uwVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    uwVar2 = uwVar3;
                }
                float f24 = d * t5Var2.e;
                t5Var2.b = !this.W;
                uwVar = uwVar2;
                if (!this.c && uwVar.n0 <= 0.0f) {
                    if (org.telegram.messenger.i0.W1(gr.g.getInterpolation(this.J), getMeasuredWidth(), org.telegram.messenger.i0.L(16.0f)) < (org.telegram.messenger.i0.N(3.5f) + f7) * 2.0f) {
                        f14 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        t5Var2.f = f14;
                        t5Var2.l = this.c;
                        t5Var2.m = this.d;
                        t5Var2.u = 1.0f - f24;
                        z12 = this.F;
                        if (z12 && this.H) {
                            t5Var2.s = this.I;
                        } else {
                            t5Var2.s = 0L;
                        }
                        if (z12) {
                            t5Var = t5Var2;
                            f15 = f24;
                            imageReceiver2 = imageReceiver;
                            f11 = f10;
                            z10 = false;
                            f12 = f17;
                            zArr = null;
                            long j10 = this.E;
                            canvas2 = canvas;
                            w5.i(j10, canvas2, imageReceiver2, e5Var.K(j10), t5Var);
                        } else {
                            t5Var = t5Var2;
                            f15 = f24;
                            imageReceiver2 = imageReceiver;
                            f11 = f10;
                            z10 = false;
                            f12 = f17;
                            zArr = null;
                            canvas2 = canvas;
                            w5.i(this.E, canvas2, imageReceiver2, e5Var.J(), t5Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f15 > 0.0f) {
                            if (w5.d == null) {
                                u10 u10Var = new u10();
                                w5.d = u10Var;
                                u10Var.a = true;
                                u10Var.b = true;
                                u10Var.c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
                                w5.d.c.setStyle(Paint.Style.STROKE);
                                w5.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            int x02 = org.telegram.ui.ActionBar.t6.x0(zArr, org.telegram.ui.ActionBar.t6.lk, z10);
                            int x03 = org.telegram.ui.ActionBar.t6.x0(zArr, org.telegram.ui.ActionBar.t6.q7, z10);
                            w5.d.d(i0.b.f(0.25f, x02, x03), x03, z10 ? 1 : 0, z10 ? 1 : 0);
                            w5.d.b(imageReceiver5.K0, imageReceiver5.L0, imageReceiver5.y(), imageReceiver5.A());
                            Paint paint2 = w5.d.c;
                            paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                            paint2.setAlpha((int) (255.0f * f15));
                            canvas2.drawCircle(f18, f19, t5Var.b() * (f7 + org.telegram.messenger.i0.L(4.0f)), paint2);
                        }
                        d = f15;
                    }
                }
                f14 = 0.0f;
                t5Var2.f = f14;
                t5Var2.l = this.c;
                t5Var2.m = this.d;
                t5Var2.u = 1.0f - f24;
                z12 = this.F;
                if (z12) {
                }
                t5Var2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f15 > 0.0f) {
                }
                d = f15;
            } else {
                canvas2 = canvas;
                t5Var = t5Var2;
                uwVar = uwVar3;
                f12 = f17;
                f11 = f10;
                z10 = false;
            }
            this.W = z10;
            if (this.x) {
                canvas2.save();
                float f25 = 1.0f - i12;
                canvas2.scale(f25, f25, this.L + org.telegram.messenger.i0.L(16.0f), this.M + org.telegram.messenger.i0.L(16.0f));
                c(canvas2, this.L, this.M, 1.0f);
                float f26 = this.L;
                float f27 = this.M;
                if (d > 0.0f) {
                    float L4 = f26 + org.telegram.messenger.i0.L(17.0f);
                    float L5 = f27 + org.telegram.messenger.i0.L(17.0f);
                    Paint paint3 = uwVar.G;
                    paint3.setColor(org.telegram.ui.ActionBar.t6.r1(d, uwVar.f(org.telegram.ui.ActionBar.t6.q7)));
                    if (i10 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.t6.r1(d, uwVar.f(org.telegram.ui.ActionBar.t6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.t6.r1(d, uwVar.f(org.telegram.ui.ActionBar.t6.M8)));
                    }
                    float interpolation = gr.k.getInterpolation(d) * org.telegram.messenger.i0.L(9.0f);
                    canvas2.drawCircle(L4, L5, org.telegram.messenger.i0.L(2.0f) + interpolation, paint);
                    canvas2.drawCircle(L4, L5, interpolation, paint3);
                    textColor = uwVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.t6.r1(d, textColor));
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(L4 - org.telegram.messenger.i0.L(1.0f), L5 - org.telegram.messenger.i0.N(4.6f), org.telegram.messenger.i0.L(1.0f) + L4, org.telegram.messenger.i0.N(1.6f) + L5);
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint3);
                    rectF2.set(L4 - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.N(2.6f) + L5, L4 + org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.N(4.6f) + L5);
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint3);
                }
                canvas2.restore();
            }
        }
        canvas2.restore();
        if (!this.H || this.K <= 0.0f) {
            f13 = f11;
        } else {
            ImageReceiver imageReceiver6 = this.s;
            f13 = f11;
            imageReceiver6.y0(f13, T13, T1, T1);
            imageReceiver6.setAlpha(this.K);
            imageReceiver6.h(canvas2, null);
        }
        float L6 = ((1.0f - this.J) * org.telegram.messenger.i0.L(7.0f)) + f12;
        FrameLayout frameLayout = this.y;
        frameLayout.setTranslationY(L6);
        frameLayout.setTranslationX(f13 - measuredWidth);
        if (!this.N) {
            if (this.F) {
                this.P = 1.0f;
            } else {
                this.P = t5Var.n == 2 ? 0.7f : 1.0f;
            }
            float f28 = this.Q * this.P;
            frameLayout.setAlpha(f28);
            frameLayout.setVisibility(f28 > 0.0f ? z10 : 4);
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float L = org.telegram.messenger.i0.L(48.0f);
        float L2 = org.telegram.messenger.i0.L(26.33f);
        return org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(5.0f), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L2) / 2.0f, this.b0.c0) + (org.telegram.messenger.i0.T1(L, L2, this.J) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            uw uwVar = this.b0;
            g gVar = uwVar.r;
            if (parent == gVar) {
                gVar.invalidate();
            } else {
                uwVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.P();
        this.s.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.R();
        this.s.R();
        this.O.g();
        org.telegram.ui.web.x0 x0Var = this.e;
        if (x0Var != null) {
            x0Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.N ? org.telegram.messenger.i0.L(70.0f) : this.b0.M, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j10) {
        TLRPC.Chat chat;
        int i10 = this.b0.f;
        if (this.I != j10) {
            this.I = j10;
            boolean z10 = j10 != -1;
            this.H = z10;
            ImageReceiver imageReceiver = this.s;
            if (!z10) {
                imageReceiver.f();
                return;
            }
            if (j10 > 0) {
                TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
                this.f = Z1;
                this.h = null;
                chat = Z1;
            } else {
                TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
                this.h = L0;
                this.f = null;
                chat = L0;
            }
            if (chat != null) {
                r8 r8Var = this.w;
                r8Var.p(chat);
                imageReceiver.i0(chat, r8Var, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDialogId(long j10) {
        TLRPC.Chat chat;
        d5 d5Var;
        uw uwVar = this.b0;
        int i10 = uwVar.f;
        e5 e5Var = uwVar.s;
        long j11 = this.E;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = j11 == j10;
        if (!z10 && this.e != null) {
            e5Var.h0(j11, false);
            this.e.a();
            this.e = null;
        }
        this.E = j10;
        this.F = j10 == d20.i(i10).e();
        this.G = e5Var.Q(j10);
        if (j10 > 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            this.f = Z1;
            this.h = null;
            chat = Z1;
        } else {
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            this.h = L0;
            this.f = null;
            chat = L0;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.D.l("", false);
            imageReceiver.f();
            return;
        }
        r8 r8Var = this.n;
        r8Var.p(chat);
        imageReceiver.i0(chat, r8Var, null);
        if (this.N) {
            return;
        }
        this.D.i(null);
        if (e5Var.Q(j10)) {
            this.D.setTextSize(10);
            this.D.l(cd.L0(2131750846, null), false);
            this.U = false;
            return;
        }
        if (!Utilities.x(e5Var.F(j10))) {
            this.D.setTextSize(10);
            w5.a(this.D);
            this.U = true;
            return;
        }
        HashMap hashMap = (HashMap) e5Var.e.f(j10);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                d5Var = (d5) values.iterator().next();
                if (d5Var == null) {
                    this.D.setTextSize(10);
                    w5.a(this.D);
                    this.U = true;
                    return;
                }
                if (this.F) {
                    if (z10 && this.U && !this.N) {
                        org.telegram.ui.ActionBar.u5 u5Var = this.D;
                        b();
                        ValueAnimator valueAnimator = uwVar.j0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            uwVar.j0 = null;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        uwVar.j0 = ofFloat;
                        ofFloat.addUpdateListener(new a3(i11, this, u5Var));
                        uwVar.j0.addListener(new iw0(17, (Object) this, (Object) u5Var));
                        uwVar.j0.setDuration(150L);
                        this.D.setAlpha(0.0f);
                        this.D.setTranslationY(org.telegram.messenger.i0.L(5.0f));
                        uwVar.k0 = new k(this, i12);
                    }
                    org.telegram.messenger.i0.h3(uwVar.k0, 500L);
                    this.U = false;
                    this.D.setTextSize(10);
                    this.D.l(cd.L0(2131748316, null), false);
                    return;
                }
                if (this.f == null) {
                    this.D.setTextSize(11);
                    this.D.l(org.telegram.messenger.k6.m(this.h.title, this.D.getPaint().getFontMetricsInt(), false, null, 0), false);
                    this.D.i(null);
                    return;
                }
                this.D.setTextSize(11);
                String str = this.f.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                String str2 = trim;
                if (!this.f.verified) {
                    this.D.l(org.telegram.messenger.k6.m(str2, this.D.getPaint().getFontMetricsInt(), false, null, 0), false);
                    this.D.i(null);
                    return;
                }
                if (this.S == null) {
                    Drawable mutate = uwVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = uwVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    e eVar = new e(uwVar, mutate, mutate2, mutate, mutate2);
                    eVar.x = true;
                    this.S = eVar;
                }
                this.D.l(org.telegram.messenger.k6.m(str2, this.D.getPaint().getFontMetricsInt(), false, null, 0), false);
                this.D.i(this.S);
                return;
            }
        }
        d5Var = null;
        if (d5Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        t5 t5Var = this.O;
        if (z10 && t5Var.H == null) {
            t5Var.H = new dc(this, 1.5f, 5.0f);
        }
        dc dcVar = t5Var.H;
        if (dcVar != null) {
            dcVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            uw uwVar = this.b0;
            g gVar = uwVar.r;
            if (parent == gVar) {
                gVar.invalidate();
            }
            uwVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
