package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ly;
import org.telegram.ui.qs0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g2 extends p {
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.voip.g f;
    public final org.telegram.ui.Components.t5 h;
    public final org.telegram.ui.Components.t5 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ x2 w;
    public final /* synthetic */ o7 x;
    public final /* synthetic */ z2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(z2 z2Var, Context context, x2 x2Var, o7 o7Var) {
        super(context);
        this.y = z2Var;
        this.w = x2Var;
        this.x = o7Var;
        gr grVar = gr.f;
        this.d = new org.telegram.ui.Components.t5(this, 150L, grVar);
        this.e = new org.telegram.ui.Components.t5(this, 150L, grVar);
        this.f = new org.telegram.ui.Components.voip.g(32, zs.n1, zs.P3);
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(this);
        this.h = t5Var;
        org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5(this);
        this.n = t5Var2;
        t5Var.g = 500L;
        t5Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0157, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        x4 x4Var;
        TL_stories.StoryItem storyItem2;
        int i10;
        TLRPC.UserFull a2;
        float hideInterfaceAlpha;
        float f7;
        float i11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        float f15;
        p6 p6Var;
        float f16;
        int i12;
        int i13;
        float f17;
        float f18;
        Paint paint;
        int i14;
        n7 n7Var;
        n7 n7Var2;
        z2 z2Var = this.y;
        float f19 = z2Var.r1;
        e2 e2Var = z2Var.S0;
        k2.t0 t0Var = z2Var.v2;
        y2 y2Var = z2Var.x1;
        ag.c2 c2Var = z2Var.N0;
        if (c2Var.L() || ((y2Var.e && t0Var.b) || (y2Var.f && t0Var.b))) {
            z2 z2Var2 = y2Var.k;
            TL_stories.PeerStories peerStories = z2Var2.d1;
            o7 o7Var = z2Var2.s0;
            if (peerStories == null && (peerStories = z2Var2.B1.y(z2Var2.k1)) == null && (a2 = vp.r1(z2Var2.l2).a2(z2Var2.k1)) != null) {
                peerStories = a2.stories;
            }
            if (z2Var2.t1 && (storyItem2 = y2Var.a) != null && peerStories != null && ((!w5.v(storyItem2) && ((i10 = y2Var.a.id) > peerStories.max_read_id || i10 > z2Var2.B1.f.get(z2Var2.k1, 0))) || z2Var2.l1)) {
                TL_stories.PeerStories peerStories2 = o7Var.Q0;
                if (peerStories2 == null) {
                    e5 e5Var = z2Var2.B1;
                    long j10 = z2Var2.k1;
                    TL_stories.StoryItem storyItem3 = y2Var.a;
                    TL_stories.PeerStories y3 = e5Var.y(j10);
                    if (y3 == null) {
                        y3 = e5Var.z(j10);
                    }
                    if (e5Var.Y(y3, storyItem3, false)) {
                        o7Var.c1 = true;
                    }
                } else if (z2Var2.B1.Y(peerStories2, y2Var.a, true)) {
                    o7Var.c1 = true;
                }
            } else if (z2Var2.t1 && (storyItem = y2Var.a) != null && (x4Var = o7Var.O0) != null && x4Var.r(storyItem.id)) {
                o7Var.c1 = true;
            }
        }
        hideInterfaceAlpha = z2Var.getHideInterfaceAlpha();
        if (y2Var.e) {
            n7 n7Var3 = (n7) t0Var.c;
            if (n7Var3 != null) {
                i11 = Utilities.i(n7Var3.getPlaybackProgress(z2Var.A2), 1.0f, 0.0f);
                if (t0Var.b && e2Var != null) {
                    e2Var.e();
                }
            } else {
                i11 = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (z2Var.A1 || !z2Var.t1 || z2Var.C1 || z2Var.D1 || z2Var.E1 || !c2Var.L()) {
            f7 = hideInterfaceAlpha;
            i11 = Utilities.i(z2Var.F0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = z2Var.G0;
            if (j11 == 0 || z2Var.S2) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (z2Var.F0 <= 0 && currentTimeMillis - j11 > 0 && e2Var != null) {
                    e2Var.e();
                }
                z2Var.F0 += currentTimeMillis - z2Var.G0;
            }
            z2Var.G0 = currentTimeMillis;
            i11 = Utilities.i(z2Var.F0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (t0Var != null && (n7Var2 = (n7) t0Var.c) != null) {
            f10 = n7Var2.currentSeek;
        }
        f10 = i11;
        if (!z2Var.H0 && i11 == 1.0f && ((!y2Var.e || !z2Var.S2) && !z2Var.u2)) {
            z2Var.H0 = true;
            post(new sg.v(this, 7));
        }
        o7 o7Var2 = this.x;
        x4 x4Var2 = o7Var2.O0;
        if (x4Var2 == null || x4Var2.e == 3) {
            f11 = 1.0f;
            f12 = 4.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (z2Var.Z0 == null) {
                z2Var.Z0 = new j6.m(8);
            }
            j6.m mVar = z2Var.Z0;
            f12 = 4.0f;
            float f20 = (1.0f - z2Var.N3) * f7 * f19;
            int i15 = z2Var.u1;
            f11 = 1.0f;
            int g10 = o7Var2.O0.g();
            f13 = 2.0f;
            w2 w2Var = z2Var.X0;
            f14 = 8.0f;
            org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) mVar.d;
            int i16 = (g10 << 12) + i15;
            if (mVar.a != i16) {
                mVar.a = i16;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i15 + 1)).append((CharSequence) mVar.b).append((CharSequence) "/").append((CharSequence) mVar.c).append((CharSequence) String.valueOf(g10));
                e6Var.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = w2Var.getY();
            og.c cVar = w2Var.b;
            float top = ((e6Var.e / 2.0f) + (y10 + cVar.getTop())) - 1.0f;
            cVar.setRightPadding((int) e6Var.c());
            canvas.translate((cVar.getRightDrawableWidth() + (cVar.getTextWidth() + (cVar.getLeft() + (w2Var.getLeft() + org.telegram.messenger.i0.L(4.0f))))) - Utilities.j(((cVar.getRightDrawableWidth() + cVar.getTextWidth()) + r0) - cVar.getWidth(), r0, 0), top);
            float L = org.telegram.messenger.i0.L(8.0f);
            float L2 = org.telegram.messenger.i0.L(2.0f);
            org.telegram.messenger.i0.P.set(-L, -L2, e6Var.c() + L, e6Var.e + L2);
            e6Var.B = (int) (f20 * 160.0f);
            e6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.i0.L(f14) - (org.telegram.messenger.i0.L(f14) * z2Var.N3));
        boolean z11 = y2Var.e && (n7Var = (n7) t0Var.c) != null && n7Var.isBuffering();
        boolean z12 = z2Var.u2;
        boolean z13 = z12 && y2Var != null && y2Var.e && o7Var2.k0;
        float d = z2Var.y2.d(!z12 || z13);
        p6 p6Var2 = z2Var.Y0;
        int measuredWidth = getMeasuredWidth();
        int i17 = z2Var.v1;
        int i18 = z2Var.w1;
        float f21 = (f11 - z2Var.N3) * f19;
        TextPaint textPaint = p6Var2.c;
        if (i18 > 0) {
            boolean z14 = z11 && !z13;
            if (p6Var2.i != i17) {
                p6Var2.g = 0.0f;
                p6Var2.h = true;
            }
            p6Var2.i = i17;
            x2 x2Var = p6Var2.a;
            Paint paint2 = x2Var.a;
            Paint paint3 = x2Var.b;
            int L3 = i18 > 100 ? 1 : i18 >= 50 ? org.telegram.messenger.i0.L(f11) : org.telegram.messenger.i0.L(f13);
            float L4 = ((measuredWidth - org.telegram.messenger.i0.L(10.0f)) - ((i18 - 1) * L3)) / i18;
            org.telegram.messenger.i0.L(5.0f);
            float min = Math.min(L4 / f13, org.telegram.messenger.i0.L(f11));
            float d10 = p6Var2.b.d(z13);
            if (d10 > 0.0f) {
                float T1 = org.telegram.messenger.i0.T1(i11, f10, d10);
                canvas.save();
                textPaint.setAlpha((int) (d10 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(org.telegram.messenger.i0.L(3.0f), 0.0f, org.telegram.messenger.i0.L(f11), org.telegram.ui.ActionBar.t6.r1(d10, 805306368));
                canvas.translate(((measuredWidth - p6Var2.f) / f13) - p6Var2.e, org.telegram.messenger.i0.W1(d10, org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(16.0f)));
                p6Var2.d.draw(canvas);
                canvas.restore();
                i11 = T1;
            } else {
                z10 = z14;
            }
            int i19 = 0;
            while (i19 < i18) {
                float L5 = (i19 * L4) + org.telegram.messenger.i0.L(5.0f) + (-0.0f) + (L3 * i19);
                if (L5 <= measuredWidth) {
                    float f22 = L5 + L4;
                    if (f22 < 0.0f) {
                        f15 = min;
                        p6Var = p6Var2;
                        f16 = i11;
                        i12 = measuredWidth;
                        i13 = i18;
                        i19++;
                        min = f15;
                        i18 = i13;
                        i11 = f16;
                        measuredWidth = i12;
                        p6Var2 = p6Var;
                    } else if (f21 > 0.0f) {
                        float T12 = org.telegram.messenger.i0.T1(min, org.telegram.messenger.i0.N(f13), d10);
                        if (i19 > i17 || i19 != i17) {
                            f15 = min;
                            p6Var = p6Var2;
                            f16 = i11;
                            i12 = measuredWidth;
                            f17 = T12;
                            f18 = f11;
                        } else {
                            f15 = min;
                            RectF rectF = org.telegram.messenger.i0.P;
                            f16 = i11;
                            i12 = measuredWidth;
                            rectF.set(L5, 0.0f, f22, org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(f13), org.telegram.messenger.i0.N(5.0f), (i17 == i19 ? 1 : 0) * d10));
                            if (z10) {
                                if (p6Var2.h) {
                                    float f23 = p6Var2.g + 0.026666667f;
                                    p6Var2.g = f23;
                                    if (f23 > 0.5f) {
                                        p6Var2.h = false;
                                    }
                                } else {
                                    float f24 = p6Var2.g - 0.026666667f;
                                    p6Var2.g = f24;
                                    if (f24 < -0.5f) {
                                        p6Var2.h = true;
                                    }
                                }
                                f17 = T12;
                                i14 = (int) (p6Var2.g * 51.0f * f21 * d);
                            } else {
                                f17 = T12;
                                i14 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * d)) + i14);
                            if (d10 > 0.0f) {
                                int i20 = i19 - i17;
                                p6Var = p6Var2;
                                rectF.left = Utilities.i(org.telegram.messenger.i0.T1(rectF.left, org.telegram.messenger.i0.L(5.0f) + (i20 * i12), d10), i12 - org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
                                rectF.right = Utilities.i(org.telegram.messenger.i0.T1(rectF.right, ((i20 + 1) * i12) - org.telegram.messenger.i0.L(5.0f), d10), i12 - org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
                            } else {
                                p6Var = p6Var2;
                            }
                            canvas.drawRoundRect(rectF, f17, f17, paint2);
                            f18 = f16;
                        }
                        RectF rectF2 = org.telegram.messenger.i0.P;
                        i13 = i18;
                        rectF2.set(L5, 0.0f, f22, org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(f13), org.telegram.messenger.i0.N(5.0f), (i17 == i19 ? 1 : 0) * d10));
                        if (d10 > 0.0f) {
                            int i21 = i19 - i17;
                            rectF2.left = Utilities.i(org.telegram.messenger.i0.T1(rectF2.left, org.telegram.messenger.i0.L(5.0f) + (i21 * i12), d10), i12 - org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
                            rectF2.right = Utilities.i(org.telegram.messenger.i0.T1(rectF2.right, ((i21 + 1) * i12) - org.telegram.messenger.i0.L(5.0f), d10), i12 - org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
                        }
                        rectF2.right = org.telegram.messenger.i0.T1(rectF2.left, rectF2.right, f18);
                        if (i19 <= i17) {
                            paint3.setAlpha((int) (f21 * 255.0f * d));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f21 * d));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, f17, f17, paint);
                        i19++;
                        min = f15;
                        i18 = i13;
                        i11 = f16;
                        measuredWidth = i12;
                        p6Var2 = p6Var;
                    }
                }
                f15 = min;
                p6Var = p6Var2;
                f16 = i11;
                i12 = measuredWidth;
                i13 = i18;
                i19++;
                min = f15;
                i18 = i13;
                i11 = f16;
                measuredWidth = i12;
                p6Var2 = p6Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x01d5, code lost:
    
        if (((th.n7) r2.c).paused != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a5, code lost:
    
        if (r4.n() != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0201  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        char c10;
        x2 x2Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10;
        ly lyVar;
        e3 e3Var;
        boolean z11;
        float f13;
        boolean z12;
        org.telegram.ui.Components.t5 t5Var;
        boolean L;
        hi.f fVar;
        n7 n7Var;
        q6 q6Var;
        Canvas canvas2 = canvas;
        z2 z2Var = this.y;
        g2 g2Var = z2Var.L0;
        e2 e2Var = z2Var.S0;
        y2 y2Var = z2Var.x1;
        ag.c2 c2Var = z2Var.N0;
        k2.t0 t0Var = z2Var.v2;
        k2 k2Var = z2Var.t0;
        if (!z2Var.t1) {
            z2Var.X0.a.getImageReceiver().O0(true, true);
        }
        boolean z13 = z2Var.L2;
        x2 x2Var2 = this.w;
        if (z13) {
            c10 = 0;
            canvas2.drawColor(i0.b.f(0.2f, -16777216, -1));
        } else {
            if (((org.telegram.ui.k4) t0Var.e) != null || (e2Var != null && (((q6Var = e2Var.b) != null && (q6Var.x || q6Var.s)) || e2Var.D.i))) {
                invalidate();
            }
            canvas2.save();
            qs0 qs0Var = z2Var.G2;
            if (qs0Var.n) {
                canvas2.save();
                float f14 = qs0Var.O;
                float f15 = qs0Var.A;
                float f16 = ((f14 * f15) + 1.0f) - f15;
                canvas2.scale(f16, f16, qs0Var.o + qs0Var.s, qs0Var.p + qs0Var.t);
                float f17 = qs0Var.o;
                float f18 = qs0Var.J;
                float f19 = qs0Var.A;
                canvas2.translate((f18 * f19) + f17, (qs0Var.K * f19) + qs0Var.p);
            }
            org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) t0Var.e;
            if (k4Var == null || (!t0Var.b && ((s0) t0Var.a) == null)) {
                if (k4Var != null) {
                    invalidate();
                }
                if (y2Var.d) {
                    canvas2.drawColor(i0.b.f(0.2f, -16777216, -1));
                } else {
                    if (!c2Var.I()) {
                        x2Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        x2Var2.f.draw(canvas2);
                    }
                    f13 = 0.0f;
                    c2Var.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    c2Var.h(canvas2, null);
                    canvas2.restore();
                    z12 = z2Var.H2;
                    org.telegram.ui.Components.t5 t5Var2 = this.h;
                    t5Var = this.n;
                    if (z12) {
                        t5Var2.e(true, f13);
                        t5Var.e(true, f13);
                    }
                    if (!y2Var.f) {
                        s0 s0Var = (s0) t0Var.a;
                        if (s0Var != null) {
                            if (!t0Var.b) {
                            }
                            L = true;
                        }
                        L = false;
                    } else if (y2Var.e) {
                        if (((org.telegram.ui.k4) t0Var.e) != null) {
                            n7 n7Var2 = (n7) t0Var.c;
                            if (n7Var2 != null) {
                                if (t0Var.b) {
                                    if (n7Var2.progress == 0.0f) {
                                        if (n7Var2 != null) {
                                            if (n7Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    L = true;
                                }
                            }
                        }
                        L = false;
                    } else {
                        L = c2Var.L();
                    }
                    t5Var2.e(false, (z2Var.t1 || L || y2Var.b != null) ? 0.0f : 1.0f);
                    t5Var.e(false, t5Var2.c != 1.0f ? 1.0f : 0.0f);
                    if (t5Var.c > 0.0f) {
                        RectF rectF = org.telegram.messenger.i0.P;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (t5Var.c * 255.0f);
                        org.telegram.ui.Components.voip.g gVar = this.f;
                        gVar.a.setAlpha(i10);
                        gVar.c.setAlpha(i10);
                        gVar.f = getMeasuredWidth() * 2;
                        gVar.n = 1.3f;
                        gVar.a(org.telegram.messenger.i0.L(10.0f), canvas2, rectF, this);
                    }
                    z2Var.H2 = false;
                    c10 = 0;
                }
            } else {
                if (!c2Var.I()) {
                    x2Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    x2Var2.f.draw(canvas2);
                }
                c2Var.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                c2Var.h(canvas2, null);
                if (z2Var.t1) {
                    o7 o7Var = this.x;
                    boolean z14 = o7Var.a;
                    if (z14 && (n7Var = (n7) t0Var.c) != null && n7Var.paused && n7Var.playerStubBitmap != null && n7Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((n7) t0Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((n7) t0Var.c).playerStubBitmap.getHeight());
                        n7 n7Var3 = (n7) t0Var.c;
                        canvas2.drawBitmap(n7Var3.playerStubBitmap, 0.0f, 0.0f, n7Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z15 = Build.VERSION.SDK_INT >= 29 && (fVar = z2Var.q3) != null && canvas2 == fVar.s;
                        if (!z14 || (z2Var.K0 && !o7Var.H0 && !z15)) {
                            ((org.telegram.ui.k4) t0Var.e).draw(canvas2);
                        }
                    }
                }
            }
            f13 = 0.0f;
            canvas2.restore();
            z12 = z2Var.H2;
            org.telegram.ui.Components.t5 t5Var22 = this.h;
            t5Var = this.n;
            if (z12) {
            }
            if (!y2Var.f) {
            }
            t5Var22.e(false, (z2Var.t1 || L || y2Var.b != null) ? 0.0f : 1.0f);
            t5Var.e(false, t5Var22.c != 1.0f ? 1.0f : 0.0f);
            if (t5Var.c > 0.0f) {
            }
            z2Var.H2 = false;
            c10 = 0;
        }
        if (k2Var.getAlpha() > 0.0f) {
            if (k2Var.getAlpha() == 1.0f) {
                canvas2.save();
                x2Var = x2Var2;
                z11 = false;
            } else {
                z11 = false;
                x2Var = x2Var2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight(), (int) (k2Var.getAlpha() * 255.0f), 31);
            }
            e2Var.draw(canvas2);
            canvas2.restore();
            r15 = z11;
        } else {
            x2Var = x2Var2;
            r15 = 0;
        }
        if (!z2Var.I0 && c2Var.L()) {
            z2Var.I0 = true;
            z2Var.invalidate();
        }
        hideInterfaceAlpha = z2Var.getHideInterfaceAlpha();
        Drawable drawable = x2Var.d;
        Paint paint = x2Var.c;
        Drawable drawable2 = x2Var.e;
        drawable.setAlpha(zs.e4);
        x2Var.d.draw(canvas2);
        if (z2Var.l1 || !z2Var.g2 || k2Var.getVisibility() == 0) {
            if (k2Var.getVisibility() == 0) {
                int L2 = org.telegram.messenger.i0.L(72.0f);
                int top = k2Var.getTop() + ((int) (k2Var.getTextTop() - org.telegram.messenger.i0.L(24.0f)));
                int i11 = L2 + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / org.telegram.messenger.i0.L(60.0f) > 0.0f && k2Var.w0 && k2Var.r0.getBottom() - k2Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (k2Var.getTop() + ((int) (k2Var.getMaxTop() - org.telegram.messenger.i0.L(24.0f))))) / org.telegram.messenger.i0.L(60.0f) > 0.0f) {
                        z2Var.P2 = true;
                    }
                    f7 = 0.0f;
                } else if (z2Var.Q2) {
                    z2Var.Q2 = r15;
                    f7 = 0.0f;
                    if ((measuredHeight - (k2Var.getTop() + ((int) (k2Var.getMaxTop() - org.telegram.messenger.i0.L(24.0f))))) / org.telegram.messenger.i0.L(60.0f) > 0.0f) {
                        z2Var.P2 = true;
                    }
                } else {
                    f7 = 0.0f;
                    if (k2Var.getProgressToBlackout() == 0.0f) {
                        z2Var.P2 = r15;
                    }
                }
                float e = this.e.e(r15, z2Var.P2 ? 1.0f : f7);
                if (e > f7) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.b.o(-16777216, (int) (153.0f * e * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (e < 1.0f && !y2Var.f) {
                    canvas2.save();
                    float f20 = 1.0f - e;
                    paint.setColor(i0.b.o(-16777216, (int) (129.03f * f20 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f20 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (e <= f7 || k2Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (k2Var.t0) {
                        k2Var.t0 = r15;
                        k2Var.invalidate();
                    }
                    if (k2Var.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (k2Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(k2Var.getX(), k2Var.getY() - k2Var.getScrollY());
                    k2Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z16 = e > f7 ? true : r15;
                if (k2Var.t0 != z16) {
                    k2Var.t0 = z16;
                    k2Var.invalidate();
                }
                if (e > f7) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f10 = e;
                f11 = z2Var.V0;
                if (f11 != 0.0f || (e3Var = z2Var.U0) == null) {
                    f12 = 1.0f;
                    z10 = true;
                } else {
                    float f21 = z2Var.j3;
                    int measuredWidth = getMeasuredWidth();
                    z10 = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    f3 f3Var = e3Var.f;
                    ImageReceiver imageReceiver = e3Var.a;
                    float f22 = (float) r15;
                    imageReceiver.y0(f22, f22, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f11);
                    imageReceiver.h(canvas2, null);
                    f12 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (e3Var.c != null) {
                        int i12 = (int) (f11 * 255.0f);
                        e3Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = f3Var.H;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.K0, (int) (imageReceiver.A() - (org.telegram.messenger.i0.L(24.0f) * f21)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f21, f21, imageReceiver.r(), imageReceiver.A() - (org.telegram.messenger.i0.L(8.0f) * f21));
                        canvas2.translate(imageReceiver.r() - (f3Var.J / 2.0f), (imageReceiver.A() - (org.telegram.messenger.i0.L(8.0f) * f21)) - e3Var.c.getHeight());
                        e3Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                this.d.e(r15, !z2Var.p2 ? f12 : 0.0f);
                if (z2Var.t1) {
                    boolean z17 = (k2Var.getVisibility() == 0 && (z2Var.P2 || k2Var.w0)) ? z10 : r15;
                    z2Var.S2 = (k2Var.getVisibility() != 0 || k2Var.getProgressToBlackout() <= 0.0f) ? r15 : z10;
                    o7 o7Var2 = ((f7) z2Var.z1).d;
                    o7Var2.L0 = z17;
                    o7Var2.d0();
                    ((f7) z2Var.z1).d.m1 = z2Var.S2;
                }
                if (f10 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                lyVar = z2Var.T0;
                if (lyVar == null) {
                    lyVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!y2Var.f) {
                int L3 = org.telegram.messenger.i0.L(z2Var.g2 ? 56.0f : 110.0f);
                if ((z2Var.l1 || !z2Var.g2) && k2Var.getVisibility() == 0) {
                    L3 = (int) (L3 * 2.5f);
                }
                drawable2.setBounds(r15, g2Var.getMeasuredHeight() - L3, getMeasuredWidth(), g2Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f10 = 0.0f;
        f11 = z2Var.V0;
        if (f11 != 0.0f) {
        }
        f12 = 1.0f;
        z10 = true;
        this.d.e(r15, !z2Var.p2 ? f12 : 0.0f);
        if (z2Var.t1) {
        }
        if (f10 <= 0.0f) {
        }
        lyVar = z2Var.T0;
        if (lyVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s0 s0Var;
        z2 z2Var = this.y;
        k2.t0 t0Var = z2Var.v2;
        if (!z2Var.t1 || z2Var.L2 || ((org.telegram.ui.k4) t0Var.e) == null || (s0Var = (s0) t0Var.a) == null || !s0Var.n() || !((org.telegram.ui.k4) t0Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.y.S0) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j10);
        }
        wb wbVar = wb.w;
        if (wbVar == null || view != wbVar.e) {
            return super.drawChild(canvas, view, j10);
        }
        if (this.s) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.T0.i();
        setTag(R.id.bulletin_delegate_tag, new org.telegram.ui.Components.k7(this, 8));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.y;
        z2Var.T0.j();
        setTag(R.id.bulletin_delegate_tag, null);
        v2 v2Var = z2Var.z1;
        if (v2Var != null) {
            o7 o7Var = ((f7) v2Var).d;
            o7Var.Y0 = false;
            o7Var.d0();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.h0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.i0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.i0.L(15.0f);
        super.onMeasure(i10, i11);
    }
}
