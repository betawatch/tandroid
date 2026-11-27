// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class t58 extends si5 {
    public final mm d;
    public final mm e;
    public final fe1 f;
    public final mm h;
    public final mm n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ m68 w;
    public final /* synthetic */ lcb x;
    public final /* synthetic */ o68 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t58(o68 o68Var, Context context, m68 m68Var, lcb lcbVar) {
        super(context);
        this.y = o68Var;
        this.w = m68Var;
        this.x = lcbVar;
        k43 k43Var = k43.f;
        this.d = new mm(150L, this, k43Var);
        this.e = new mm(150L, this, k43Var);
        this.f = new fe1(32, jn7.m1, jn7.O3);
        mm mmVar = new mm(this);
        this.h = mmVar;
        mm mmVar2 = new mm(this);
        this.n = mmVar2;
        mmVar.g = 500L;
        mmVar2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0155, code lost:
    
        if (r4 < 0.0f) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        u5b u5bVar;
        TL_stories.StoryItem storyItem2;
        int i;
        TLRPC.UserFull Y1;
        float hideInterfaceAlpha;
        float f;
        float i2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        float f8;
        float f9;
        int i4;
        int i5;
        float f10;
        float f11;
        Paint paint;
        int i6;
        float f12;
        kcb kcbVar;
        kcb kcbVar2;
        o68 o68Var = this.y;
        float f13 = o68Var.s1;
        r58 r58Var = o68Var.T0;
        d30 d30Var = o68Var.w2;
        n68 n68Var = o68Var.y1;
        nl nlVar = o68Var.O0;
        if (nlVar.E() || ((n68Var.e && d30Var.a) || (n68Var.f && d30Var.a))) {
            o68 o68Var2 = n68Var.k;
            TL_stories.PeerStories peerStories = o68Var2.e1;
            lcb lcbVar = o68Var2.t0;
            if (peerStories == null && (peerStories = o68Var2.C1.x(o68Var2.l1)) == null && (Y1 = uc7.s1(o68Var2.m2).Y1(o68Var2.l1)) != null) {
                peerStories = Y1.stories;
            }
            if (o68Var2.u1 && (storyItem2 = n68Var.a) != null && peerStories != null && ((!t6b.v(storyItem2) && ((i = n68Var.a.id) > peerStories.max_read_id || i > o68Var2.C1.f.get(o68Var2.l1, 0))) || o68Var2.m1)) {
                TL_stories.PeerStories peerStories2 = lcbVar.Q0;
                c6b c6bVar = o68Var2.C1;
                if (peerStories2 == null) {
                    long j = o68Var2.l1;
                    TL_stories.StoryItem storyItem3 = n68Var.a;
                    TL_stories.PeerStories x = c6bVar.x(j);
                    if (x == null) {
                        x = c6bVar.y(j);
                    }
                    if (c6bVar.X(x, storyItem3, false)) {
                        lcbVar.c1 = true;
                    }
                } else if (c6bVar.X(peerStories2, n68Var.a, true)) {
                    lcbVar.c1 = true;
                }
            } else if (o68Var2.u1 && (storyItem = n68Var.a) != null && (u5bVar = lcbVar.O0) != null && u5bVar.r(storyItem.id)) {
                lcbVar.c1 = true;
            }
        }
        hideInterfaceAlpha = o68Var.getHideInterfaceAlpha();
        if (n68Var.e) {
            kcb kcbVar3 = (kcb) d30Var.c;
            if (kcbVar3 != null) {
                i2 = Utilities.i(kcbVar3.getPlaybackProgress(o68Var.B2), 1.0f, 0.0f);
                if (d30Var.a && r58Var != null) {
                    r58Var.e();
                }
            } else {
                i2 = 0.0f;
            }
            invalidate();
            f = hideInterfaceAlpha;
        } else if (o68Var.B1 || !o68Var.u1 || o68Var.D1 || o68Var.E1 || o68Var.F1 || !nlVar.E()) {
            f = hideInterfaceAlpha;
            i2 = Utilities.i(o68Var.G0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = o68Var.H0;
            if (j2 == 0 || o68Var.T2) {
                f = hideInterfaceAlpha;
            } else {
                f = hideInterfaceAlpha;
                if (o68Var.G0 <= 0 && currentTimeMillis - j2 > 0 && r58Var != null) {
                    r58Var.e();
                }
                o68Var.G0 = (currentTimeMillis - o68Var.H0) + o68Var.G0;
            }
            o68Var.H0 = currentTimeMillis;
            i2 = Utilities.i(o68Var.G0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (d30Var != null && (kcbVar2 = (kcb) d30Var.c) != null) {
            f2 = kcbVar2.currentSeek;
        }
        f2 = i2;
        if (!o68Var.I0 && i2 == 1.0f && ((!n68Var.e || !o68Var.T2) && !o68Var.v2)) {
            o68Var.I0 = true;
            post(new x38(this, (byte) 2));
        }
        lcb lcbVar2 = this.x;
        u5b u5bVar2 = lcbVar2.O0;
        if (u5bVar2 == null || u5bVar2.e == 3) {
            f3 = 1.0f;
            f4 = 4.0f;
            f5 = 2.0f;
            f6 = 8.0f;
        } else {
            ykf ykfVar = o68Var.a1;
            if (ykfVar == null) {
                ykfVar = new ykf((byte) 3);
                o68Var.a1 = ykfVar;
            }
            f4 = 4.0f;
            float f14 = (1.0f - o68Var.N3) * f * f13;
            int i7 = o68Var.v1;
            f3 = 1.0f;
            int g = lcbVar2.O0.g();
            f5 = 2.0f;
            l68 l68Var = o68Var.Y0;
            f6 = 8.0f;
            hn hnVar = (hn) ykfVar.d;
            int i8 = (g << 12) + i7;
            if (ykfVar.a != i8) {
                ykfVar.a = i8;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i7 + 1)).append((CharSequence) ykfVar.b).append((CharSequence) "/").append((CharSequence) ykfVar.c).append((CharSequence) String.valueOf(g));
                hnVar.t(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y = l68Var.getY();
            ff0 ff0Var = l68Var.b;
            float top = ((hnVar.e / 2.0f) + (y + ff0Var.getTop())) - 1.0f;
            ff0Var.setRightPadding((int) hnVar.c());
            canvas.translate((ff0Var.getRightDrawableWidth() + (ff0Var.getTextWidth() + (ff0Var.getLeft() + (l68Var.getLeft() + hl.L(4.0f))))) - Utilities.j(((ff0Var.getRightDrawableWidth() + ff0Var.getTextWidth()) + r0) - ff0Var.getWidth(), r0, 0), top);
            float L = hl.L(8.0f);
            float L2 = hl.L(2.0f);
            hl.P.set(-L, -L2, hnVar.c() + L, hnVar.e + L2);
            hnVar.C = (int) (f14 * 160.0f);
            hnVar.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, hl.L(f6) - (hl.L(f6) * o68Var.N3));
        boolean z = n68Var.e && (kcbVar = (kcb) d30Var.c) != null && kcbVar.isBuffering();
        boolean z2 = o68Var.v2;
        boolean z3 = z2 && n68Var != null && n68Var.e && lcbVar2.l0;
        float d = o68Var.z2.d(!z2 || z3);
        e8b e8bVar = o68Var.Z0;
        int measuredWidth = getMeasuredWidth();
        int i9 = o68Var.w1;
        int i10 = o68Var.x1;
        float f15 = (f3 - o68Var.N3) * f13;
        TextPaint textPaint = e8bVar.c;
        if (i10 > 0) {
            boolean z4 = z && !z3;
            if (e8bVar.i != i9) {
                e8bVar.g = 0.0f;
                e8bVar.h = true;
            }
            e8bVar.i = i9;
            m68 m68Var = e8bVar.a;
            Paint paint2 = m68Var.a;
            Paint paint3 = m68Var.b;
            int L3 = i10 > 100 ? 1 : i10 >= 50 ? hl.L(f3) : hl.L(f5);
            boolean z5 = z4;
            float L4 = ((measuredWidth - hl.L(10.0f)) - ((i10 - 1) * L3)) / i10;
            float min = Math.min(L4 / f5, hl.L(f3));
            float d2 = e8bVar.b.d(z3);
            if (d2 > 0.0f) {
                float R1 = hl.R1(i2, f2, d2);
                canvas.save();
                textPaint.setAlpha((int) (d2 * 255.0f));
                i3 = L3;
                textPaint.setShadowLayer(hl.L(3.0f), 0.0f, hl.L(f3), aob.p1(d2, 805306368));
                canvas.translate(((measuredWidth - e8bVar.f) / f5) - e8bVar.e, hl.U1(d2, hl.L(f4), hl.L(16.0f)));
                e8bVar.d.draw(canvas);
                canvas.restore();
                i2 = R1;
            } else {
                i3 = L3;
            }
            int i11 = 0;
            while (i11 < i10) {
                float L5 = (i11 * L4) + hl.L(5.0f) + (-0.0f) + (i3 * i11);
                if (L5 <= measuredWidth) {
                    float f16 = L5 + L4;
                    if (f16 >= 0.0f && f15 > 0.0f) {
                        float R12 = hl.R1(min, hl.N(f5), d2);
                        if (i11 > i9 || i11 != i9) {
                            f7 = d;
                            f8 = min;
                            f9 = i2;
                            i4 = measuredWidth;
                            i5 = i10;
                            f10 = f16;
                            f11 = f3;
                        } else {
                            f8 = min;
                            RectF rectF = hl.P;
                            f9 = i2;
                            i4 = measuredWidth;
                            i5 = i10;
                            rectF.set(L5, 0.0f, f16, hl.R1(hl.N(f5), hl.N(5.0f), (i9 == i11 ? 1 : 0) * d2));
                            if (z5) {
                                boolean z6 = e8bVar.h;
                                float f17 = e8bVar.g;
                                if (z6) {
                                    f12 = f17 + 0.026666667f;
                                    e8bVar.g = f12;
                                    if (f12 > 0.5f) {
                                        e8bVar.h = false;
                                    }
                                } else {
                                    f12 = f17 - 0.026666667f;
                                    e8bVar.g = f12;
                                    if (f12 < -0.5f) {
                                        e8bVar.h = true;
                                    }
                                }
                                f10 = f16;
                                i6 = (int) xnb.C(f15, 51.0f, d, f12);
                            } else {
                                f10 = f16;
                                i6 = 0;
                            }
                            paint2.setAlpha(((int) (f15 * 85.0f * d)) + i6);
                            if (d2 > 0.0f) {
                                int i12 = i11 - i9;
                                f7 = d;
                                rectF.left = Utilities.i(hl.R1(rectF.left, hl.L(5.0f) + (i12 * i4), d2), i4 - hl.L(5.0f), hl.L(5.0f));
                                rectF.right = Utilities.i(hl.R1(rectF.right, ((i12 + 1) * i4) - hl.L(5.0f), d2), i4 - hl.L(5.0f), hl.L(5.0f));
                            } else {
                                f7 = d;
                            }
                            canvas.drawRoundRect(rectF, R12, R12, paint2);
                            f11 = f9;
                        }
                        RectF rectF2 = hl.P;
                        rectF2.set(L5, 0.0f, f10, hl.R1(hl.N(f5), hl.N(5.0f), (i9 == i11 ? 1 : 0) * d2));
                        if (d2 > 0.0f) {
                            int i13 = i11 - i9;
                            rectF2.left = Utilities.i(hl.R1(rectF2.left, hl.L(5.0f) + (i13 * i4), d2), i4 - hl.L(5.0f), hl.L(5.0f));
                            rectF2.right = Utilities.i(hl.R1(rectF2.right, ((i13 + 1) * i4) - hl.L(5.0f), d2), i4 - hl.L(5.0f), hl.L(5.0f));
                        }
                        rectF2.right = hl.R1(rectF2.left, rectF2.right, f11);
                        if (i11 <= i9) {
                            paint3.setAlpha((int) (f15 * 255.0f * f7));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85.0f * f15 * f7));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, R12, R12, paint);
                        i11++;
                        min = f8;
                        i2 = f9;
                        measuredWidth = i4;
                        i10 = i5;
                        d = f7;
                    }
                }
                f7 = d;
                f8 = min;
                f9 = i2;
                i4 = measuredWidth;
                i5 = i10;
                i11++;
                min = f8;
                i2 = f9;
                measuredWidth = i4;
                i10 = i5;
                d = f7;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x01d0, code lost:
    
        if (((kcb) r2.c).paused != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
    
        if (r4.p() != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        m68 m68Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        tv3 tv3Var;
        g3a g3aVar;
        boolean z2;
        float f5;
        boolean z3;
        mm mmVar;
        boolean E;
        rz4 rz4Var;
        kcb kcbVar;
        t8b t8bVar;
        Canvas canvas2 = canvas;
        o68 o68Var = this.y;
        t58 t58Var = o68Var.M0;
        r58 r58Var = o68Var.T0;
        n68 n68Var = o68Var.y1;
        nl nlVar = o68Var.O0;
        d30 d30Var = o68Var.w2;
        y58 y58Var = o68Var.u0;
        if (!o68Var.u1) {
            o68Var.Y0.a.getImageReceiver().v0(true, true);
        }
        boolean z4 = o68Var.M2;
        m68 m68Var2 = this.w;
        if (z4) {
            canvas2.drawColor(vm2.f(0.2f, -16777216, -1));
        } else {
            if (((jx) d30Var.e) != null || (r58Var != null && (((t8bVar = r58Var.b) != null && (t8bVar.x || t8bVar.s)) || r58Var.E.i))) {
                invalidate();
            }
            canvas2.save();
            de8 de8Var = o68Var.H2;
            if (de8Var.n) {
                canvas2.save();
                float f6 = de8Var.O;
                float f7 = de8Var.A;
                float f8 = ((f6 * f7) + 1.0f) - f7;
                canvas2.scale(f8, f8, de8Var.o + de8Var.s, de8Var.p + de8Var.t);
                float f9 = de8Var.o;
                float f10 = de8Var.J;
                float f11 = de8Var.A;
                canvas2.translate((f10 * f11) + f9, (de8Var.K * f11) + de8Var.p);
            }
            if (((jx) d30Var.e) != null) {
                if (d30Var.a || ((w96) d30Var.b) != null) {
                    if (!nlVar.B()) {
                        m68Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        m68Var2.f.draw(canvas2);
                    }
                    nlVar.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    nlVar.h(canvas2, null);
                    if (o68Var.u1) {
                        lcb lcbVar = this.x;
                        boolean z5 = lcbVar.a;
                        if (z5 && (kcbVar = (kcb) d30Var.c) != null && kcbVar.paused && kcbVar.playerStubBitmap != null && kcbVar.stubAvailable) {
                            canvas2.save();
                            canvas2.scale(getMeasuredWidth() / ((kcb) d30Var.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((kcb) d30Var.c).playerStubBitmap.getHeight());
                            kcb kcbVar2 = (kcb) d30Var.c;
                            canvas2.drawBitmap(kcbVar2.playerStubBitmap, 0.0f, 0.0f, kcbVar2.playerStubPaint);
                            canvas2.restore();
                        } else {
                            boolean z6 = Build.VERSION.SDK_INT >= 29 && (rz4Var = o68Var.q3) != null && canvas2 == rz4Var.s;
                            if (!z5 || (o68Var.L0 && !lcbVar.H0 && !z6)) {
                                ((jx) d30Var.e).draw(canvas2);
                            }
                        }
                    }
                    f5 = 0.0f;
                    canvas2.restore();
                    z3 = o68Var.I2;
                    mm mmVar2 = this.h;
                    mmVar = this.n;
                    if (z3) {
                        mmVar2.e(true, f5);
                        mmVar.e(true, f5);
                    }
                    if (n68Var.f) {
                        w96 w96Var = (w96) d30Var.b;
                        if (w96Var != null) {
                            if (!d30Var.a) {
                            }
                            E = true;
                        }
                        E = false;
                    } else if (n68Var.e) {
                        if (((jx) d30Var.e) != null) {
                            kcb kcbVar3 = (kcb) d30Var.c;
                            if (kcbVar3 != null) {
                                if (d30Var.a) {
                                    if (kcbVar3.progress == 0.0f) {
                                        if (kcbVar3 != null) {
                                            if (kcbVar3.isBuffering()) {
                                            }
                                        }
                                    }
                                    E = true;
                                }
                            }
                        }
                        E = false;
                    } else {
                        E = nlVar.E();
                    }
                    mmVar2.e(false, (o68Var.u1 || E || n68Var.b != null) ? 0.0f : 1.0f);
                    mmVar.e(false, mmVar2.c == 1.0f ? 1.0f : 0.0f);
                    if (mmVar.c > 0.0f) {
                        RectF rectF = hl.P;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i = (int) (mmVar.c * 255.0f);
                        fe1 fe1Var = this.f;
                        fe1Var.a.setAlpha(i);
                        fe1Var.c.setAlpha(i);
                        fe1Var.f = getMeasuredWidth() << 1;
                        fe1Var.n = 1.3f;
                        fe1Var.a(hl.L(10.0f), canvas2, rectF, this);
                    }
                    o68Var.I2 = false;
                } else {
                    invalidate();
                }
            }
            if (n68Var.d) {
                canvas2.drawColor(vm2.f(0.2f, -16777216, -1));
                f5 = 0.0f;
                canvas2.restore();
                z3 = o68Var.I2;
                mm mmVar22 = this.h;
                mmVar = this.n;
                if (z3) {
                }
                if (n68Var.f) {
                }
                mmVar22.e(false, (o68Var.u1 || E || n68Var.b != null) ? 0.0f : 1.0f);
                mmVar.e(false, mmVar22.c == 1.0f ? 1.0f : 0.0f);
                if (mmVar.c > 0.0f) {
                }
                o68Var.I2 = false;
            } else {
                if (!nlVar.B()) {
                    m68Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    m68Var2.f.draw(canvas2);
                }
                f5 = 0.0f;
                nlVar.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                nlVar.h(canvas2, null);
                canvas2.restore();
                z3 = o68Var.I2;
                mm mmVar222 = this.h;
                mmVar = this.n;
                if (z3) {
                }
                if (n68Var.f) {
                }
                mmVar222.e(false, (o68Var.u1 || E || n68Var.b != null) ? 0.0f : 1.0f);
                mmVar.e(false, mmVar222.c == 1.0f ? 1.0f : 0.0f);
                if (mmVar.c > 0.0f) {
                }
                o68Var.I2 = false;
            }
        }
        if (y58Var.getAlpha() > 0.0f) {
            if (y58Var.getAlpha() == 1.0f) {
                canvas2.save();
                m68Var = m68Var2;
                z2 = false;
            } else {
                z2 = false;
                m68Var = m68Var2;
                canvas2.saveLayerAlpha(0.0f, 0.0f, y58Var.getMeasuredWidth(), y58Var.getMeasuredHeight(), (int) (y58Var.getAlpha() * 255.0f), 31);
            }
            r58Var.draw(canvas2);
            canvas2.restore();
            r15 = z2;
        } else {
            m68Var = m68Var2;
            r15 = 0;
        }
        if (!o68Var.J0 && nlVar.E()) {
            o68Var.J0 = true;
            o68Var.invalidate();
        }
        hideInterfaceAlpha = o68Var.getHideInterfaceAlpha();
        Drawable drawable = m68Var.d;
        Paint paint = m68Var.c;
        Drawable drawable2 = m68Var.e;
        drawable.setAlpha(jn7.d4);
        m68Var.d.draw(canvas2);
        if (o68Var.m1 || !o68Var.h2 || y58Var.getVisibility() == 0) {
            if (y58Var.getVisibility() == 0) {
                int L = hl.L(72.0f);
                int top = y58Var.getTop() + ((int) (y58Var.getTextTop() - hl.L(24.0f)));
                int i2 = L + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / hl.L(60.0f) > 0.0f && y58Var.w0 && y58Var.r0.getBottom() - y58Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (y58Var.getTop() + ((int) (y58Var.getMaxTop() - hl.L(24.0f))))) / hl.L(60.0f) > 0.0f) {
                        o68Var.Q2 = true;
                    }
                    f = 0.0f;
                } else if (o68Var.R2) {
                    o68Var.R2 = r15;
                    f = 0.0f;
                    if ((measuredHeight - (y58Var.getTop() + ((int) (y58Var.getMaxTop() - hl.L(24.0f))))) / hl.L(60.0f) > 0.0f) {
                        o68Var.Q2 = true;
                    }
                } else {
                    f = 0.0f;
                    if (y58Var.getProgressToBlackout() == 0.0f) {
                        o68Var.Q2 = r15;
                    }
                }
                float e = this.e.e(r15, o68Var.Q2 ? 1.0f : f);
                if (e > f) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(vm2.o(-16777216, (int) (153.0f * e * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (e < 1.0f && !n68Var.f) {
                    canvas2.save();
                    float f12 = 1.0f - e;
                    paint.setColor(vm2.o(-16777216, (int) (129.03f * f12 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f12 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i2);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i2, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (e <= f || y58Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (y58Var.t0) {
                        y58Var.t0 = r15;
                        y58Var.invalidate();
                    }
                    if (y58Var.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (y58Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(y58Var.getX(), y58Var.getY() - y58Var.getScrollY());
                    y58Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z7 = e > f ? true : r15;
                if (y58Var.t0 != z7) {
                    y58Var.t0 = z7;
                    y58Var.invalidate();
                }
                if (e > f) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f2 = e;
                f3 = o68Var.W0;
                if (f3 != 0.0f || (g3aVar = o68Var.V0) == null) {
                    f4 = 1.0f;
                    z = true;
                } else {
                    float f13 = o68Var.k3;
                    int measuredWidth = getMeasuredWidth();
                    z = true;
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    h3a h3aVar = g3aVar.f;
                    ImageReceiver imageReceiver = g3aVar.a;
                    imageReceiver.i0(0.0f, 0.0f, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f3);
                    imageReceiver.h(canvas2, null);
                    f4 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (g3aVar.c != null) {
                        int i3 = (int) (f3 * 255.0f);
                        g3aVar.d.setAlpha(i3);
                        GradientDrawable gradientDrawable = h3aVar.I;
                        gradientDrawable.setAlpha(i3);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.x() - (hl.L(24.0f) * f13)), (int) imageReceiver.w(), ((int) imageReceiver.x()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f13, f13, imageReceiver.r(), imageReceiver.x() - (hl.L(8.0f) * f13));
                        canvas2.translate(imageReceiver.r() - (h3aVar.K / 2.0f), (imageReceiver.x() - (hl.L(8.0f) * f13)) - g3aVar.c.getHeight());
                        g3aVar.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                this.d.e(r15, !o68Var.q2 ? f4 : 0.0f);
                if (o68Var.u1) {
                    boolean z8 = (y58Var.getVisibility() == 0 && (o68Var.Q2 || y58Var.w0)) ? z : r15;
                    o68Var.T2 = (y58Var.getVisibility() != 0 || y58Var.getProgressToBlackout() <= 0.0f) ? r15 : z;
                    lcb lcbVar2 = ((ccb) o68Var.A1).d;
                    lcbVar2.L0 = z8;
                    lcbVar2.U();
                    ((ccb) o68Var.A1).d.m1 = o68Var.T2;
                }
                if (f2 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                tv3Var = o68Var.U0;
                if (tv3Var == null) {
                    tv3Var.e(canvas2);
                    return;
                }
                return;
            }
            if (!n68Var.f) {
                int L2 = hl.L(o68Var.h2 ? 56.0f : 110.0f);
                if ((o68Var.m1 || !o68Var.h2) && y58Var.getVisibility() == 0) {
                    L2 = (int) (L2 * 2.5f);
                }
                drawable2.setBounds(r15, t58Var.getMeasuredHeight() - L2, getMeasuredWidth(), t58Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f2 = 0.0f;
        f3 = o68Var.W0;
        if (f3 != 0.0f) {
        }
        f4 = 1.0f;
        z = true;
        this.d.e(r15, !o68Var.q2 ? f4 : 0.0f);
        if (o68Var.u1) {
        }
        if (f2 <= 0.0f) {
        }
        tv3Var = o68Var.U0;
        if (tv3Var == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        w96 w96Var;
        o68 o68Var = this.y;
        d30 d30Var = o68Var.w2;
        if (!o68Var.u1 || o68Var.M2 || ((jx) d30Var.e) == null || (w96Var = (w96) d30Var.b) == null || !w96Var.p() || !((jx) d30Var.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.y.T0) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j);
        }
        v21 v21Var = v21.x;
        if (v21Var == null || view != v21Var.e) {
            return super.drawChild(canvas, view, j);
        }
        if (this.s) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.U0.i();
        setTag(R.id.bulletin_delegate_tag, new t10(this, (byte) 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o68 o68Var = this.y;
        o68Var.U0.j();
        setTag(R.id.bulletin_delegate_tag, null);
        k68 k68Var = o68Var.A1;
        if (k68Var != null) {
            lcb lcbVar = ((ccb) k68Var).d;
            lcbVar.Y0 = false;
            lcbVar.U();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.i0.getLayoutParams();
        layoutParams.rightMargin = hl.L(42.0f);
        layoutParams.topMargin = hl.L(15.0f);
        super.onMeasure(i, i2);
    }
}
