package zh;

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
import bi.rd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.iz;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h2 extends p {
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.voip.h f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 n;
    public boolean r;
    public boolean s;
    public final /* synthetic */ y2 v;
    public final /* synthetic */ u7 w;
    public final /* synthetic */ a3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(a3 a3Var, Context context, y2 y2Var, u7 u7Var) {
        super(context);
        this.x = a3Var;
        this.v = y2Var;
        this.w = u7Var;
        wr wrVar = wr.f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, wrVar);
        this.e = new org.telegram.ui.Components.d6(this, 150L, wrVar);
        this.f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.n = d6Var2;
        d6Var.g = 500L;
        d6Var2.g = 100L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0158, code lost:
    
        if (r4 >= 0.0f) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        TL_stories.StoryItem storyItem;
        a5 a5Var;
        TL_stories.StoryItem storyItem2;
        int i10;
        TLRPC.UserFull userFull;
        float hideInterfaceAlpha;
        float f7;
        float clamp;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        float f15;
        v6 v6Var;
        float f16;
        int i11;
        int i12;
        float f17;
        float f18;
        Paint paint;
        int i13;
        t7 t7Var;
        t7 t7Var2;
        a3 a3Var = this.x;
        float f19 = a3Var.I1;
        f2 f2Var = a3Var.j1;
        k2.v vVar = a3Var.M2;
        z2 z2Var = a3Var.O1;
        gg.h1 h1Var = a3Var.e1;
        if (h1Var.hasNotThumb() || ((z2Var.e && vVar.a) || (z2Var.f && vVar.a))) {
            a3 a3Var2 = z2Var.k;
            TL_stories.PeerStories peerStories = a3Var2.u1;
            u7 u7Var = a3Var2.J0;
            if (peerStories == null && (peerStories = a3Var2.S1.y(a3Var2.B1)) == null && (userFull = MessagesController.getInstance(a3Var2.C2).getUserFull(a3Var2.B1)) != null) {
                peerStories = userFull.stories;
            }
            if (a3Var2.K1 && (storyItem2 = z2Var.a) != null && peerStories != null && ((!a6.v(storyItem2) && ((i10 = z2Var.a.id) > peerStories.max_read_id || i10 > a3Var2.S1.f.get(a3Var2.B1, 0))) || a3Var2.C1)) {
                TL_stories.PeerStories peerStories2 = u7Var.Q0;
                if (peerStories2 == null) {
                    i5 i5Var = a3Var2.S1;
                    long j3 = a3Var2.B1;
                    TL_stories.StoryItem storyItem3 = z2Var.a;
                    TL_stories.PeerStories y3 = i5Var.y(j3);
                    if (y3 == null) {
                        y3 = i5Var.z(j3);
                    }
                    if (i5Var.V(y3, storyItem3, false)) {
                        u7Var.c1 = true;
                    }
                } else if (a3Var2.S1.V(peerStories2, z2Var.a, true)) {
                    u7Var.c1 = true;
                }
            } else if (a3Var2.K1 && (storyItem = z2Var.a) != null && (a5Var = u7Var.O0) != null && a5Var.r(storyItem.id)) {
                u7Var.c1 = true;
            }
        }
        hideInterfaceAlpha = a3Var.getHideInterfaceAlpha();
        if (z2Var.e) {
            t7 t7Var3 = (t7) vVar.c;
            if (t7Var3 != null) {
                clamp = Utilities.clamp(t7Var3.getPlaybackProgress(a3Var.R2), 1.0f, 0.0f);
                if (vVar.a && f2Var != null) {
                    f2Var.e();
                }
            } else {
                clamp = 0.0f;
            }
            invalidate();
            f7 = hideInterfaceAlpha;
        } else if (a3Var.R1 || !a3Var.K1 || a3Var.T1 || a3Var.U1 || a3Var.V1 || !h1Var.hasNotThumb()) {
            f7 = hideInterfaceAlpha;
            clamp = Utilities.clamp(a3Var.W0 / 10000.0f, 1.0f, 0.0f);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = a3Var.X0;
            if (j10 == 0 || a3Var.j3) {
                f7 = hideInterfaceAlpha;
            } else {
                f7 = hideInterfaceAlpha;
                if (a3Var.W0 <= 0 && currentTimeMillis - j10 > 0 && f2Var != null) {
                    f2Var.e();
                }
                a3Var.W0 += currentTimeMillis - a3Var.X0;
            }
            a3Var.X0 = currentTimeMillis;
            clamp = Utilities.clamp(a3Var.W0 / 10000.0f, 1.0f, 0.0f);
            invalidate();
        }
        if (vVar != null && (t7Var2 = (t7) vVar.c) != null) {
            f10 = t7Var2.currentSeek;
        }
        f10 = clamp;
        if (!a3Var.Y0 && clamp == 1.0f && ((!z2Var.e || !a3Var.j3) && !a3Var.L2)) {
            a3Var.Y0 = true;
            post(new xh.x(this, 23));
        }
        u7 u7Var2 = this.w;
        a5 a5Var2 = u7Var2.O0;
        if (a5Var2 == null || a5Var2.e == 3) {
            f11 = 4.0f;
            f12 = 1.0f;
            f13 = 2.0f;
            f14 = 8.0f;
        } else {
            if (a3Var.q1 == null) {
                a3Var.q1 = new j6.l(11);
            }
            j6.l lVar = a3Var.q1;
            f11 = 4.0f;
            float f20 = (1.0f - a3Var.d4) * f7 * f19;
            int i14 = a3Var.L1;
            f12 = 1.0f;
            int g10 = u7Var2.O0.g();
            f13 = 2.0f;
            x2 x2Var = a3Var.o1;
            f14 = 8.0f;
            org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) lVar.d;
            int i15 = (g10 << 12) + i14;
            if (lVar.a != i15) {
                lVar.a = i15;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) String.valueOf(i14 + 1)).append((CharSequence) lVar.b).append((CharSequence) "/").append((CharSequence) lVar.c).append((CharSequence) String.valueOf(g10));
                n6Var.q(spannableStringBuilder, false, true);
            }
            canvas.save();
            float y10 = x2Var.getY();
            org.telegram.ui.Cells.f4 f4Var = x2Var.b;
            float top = ((n6Var.e / 2.0f) + (y10 + f4Var.getTop())) - 1.0f;
            f4Var.setRightPadding((int) n6Var.d());
            canvas.translate((f4Var.getRightDrawableWidth() + (f4Var.getTextWidth() + (f4Var.getLeft() + (x2Var.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((f4Var.getRightDrawableWidth() + f4Var.getTextWidth()) + r0) - f4Var.getWidth(), r0, 0), top);
            float dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(2.0f);
            AndroidUtilities.rectTmp.set(-dp, -dp2, n6Var.d() + dp, n6Var.e + dp2);
            n6Var.w = (int) (f20 * 160.0f);
            n6Var.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(f14) - (AndroidUtilities.dp(f14) * a3Var.d4));
        boolean z11 = z2Var.e && (t7Var = (t7) vVar.c) != null && t7Var.isBuffering();
        boolean z12 = a3Var.L2;
        boolean z13 = z12 && z2Var != null && z2Var.e && u7Var2.k0;
        float e = a3Var.P2.e(!z12 || z13);
        v6 v6Var2 = a3Var.p1;
        int measuredWidth = getMeasuredWidth();
        int i16 = a3Var.M1;
        int i17 = a3Var.N1;
        float f21 = (f12 - a3Var.d4) * f19;
        TextPaint textPaint = v6Var2.c;
        if (i17 > 0) {
            boolean z14 = z11 && !z13;
            if (v6Var2.i != i16) {
                v6Var2.g = 0.0f;
                v6Var2.h = true;
            }
            v6Var2.i = i16;
            y2 y2Var = v6Var2.a;
            Paint paint2 = y2Var.a;
            Paint paint3 = y2Var.b;
            int dp3 = i17 > 100 ? 1 : i17 >= 50 ? AndroidUtilities.dp(f12) : AndroidUtilities.dp(f13);
            float dp4 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i17 - 1) * dp3)) / i17;
            AndroidUtilities.dp(5.0f);
            float min = Math.min(dp4 / f13, AndroidUtilities.dp(f12));
            float e7 = v6Var2.b.e(z13);
            if (e7 > 0.0f) {
                float lerp = AndroidUtilities.lerp(clamp, f10, e7);
                canvas.save();
                textPaint.setAlpha((int) (e7 * 255.0f));
                z10 = z14;
                textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f12), org.telegram.ui.ActionBar.j6.l1(e7, 805306368));
                canvas.translate(((measuredWidth - v6Var2.f) / f13) - v6Var2.e, AndroidUtilities.lerp(AndroidUtilities.dp(f11), AndroidUtilities.dp(16.0f), e7));
                v6Var2.d.draw(canvas);
                canvas.restore();
                clamp = lerp;
            } else {
                z10 = z14;
            }
            int i18 = 0;
            while (i18 < i17) {
                float dp5 = (i18 * dp4) + AndroidUtilities.dp(5.0f) + (-0.0f) + (dp3 * i18);
                if (dp5 <= measuredWidth) {
                    float f22 = dp5 + dp4;
                    if (f22 >= 0.0f && f21 > 0.0f) {
                        float lerp2 = AndroidUtilities.lerp(min, AndroidUtilities.dpf2(f13), e7);
                        if (i18 > i16 || i18 != i16) {
                            f15 = min;
                            v6Var = v6Var2;
                            f16 = clamp;
                            i11 = measuredWidth;
                            f17 = lerp2;
                            f18 = 1.0f;
                        } else {
                            f15 = min;
                            RectF rectF = AndroidUtilities.rectTmp;
                            f16 = clamp;
                            i11 = measuredWidth;
                            rectF.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e7));
                            if (z10) {
                                if (v6Var2.h) {
                                    float f23 = v6Var2.g + 0.026666667f;
                                    v6Var2.g = f23;
                                    if (f23 > 0.5f) {
                                        v6Var2.h = false;
                                    }
                                } else {
                                    float f24 = v6Var2.g - 0.026666667f;
                                    v6Var2.g = f24;
                                    if (f24 < -0.5f) {
                                        v6Var2.h = true;
                                    }
                                }
                                f17 = lerp2;
                                i13 = (int) (v6Var2.g * 51.0f * f21 * e);
                            } else {
                                f17 = lerp2;
                                i13 = 0;
                            }
                            paint2.setAlpha(((int) (85.0f * f21 * e)) + i13);
                            if (e7 > 0.0f) {
                                int i19 = i18 - i16;
                                v6Var = v6Var2;
                                rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i19 * i11), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i19 + 1) * i11) - AndroidUtilities.dp(5.0f), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            } else {
                                v6Var = v6Var2;
                            }
                            canvas.drawRoundRect(rectF, f17, f17, paint2);
                            f18 = f16;
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        i12 = i17;
                        rectF2.set(dp5, 0.0f, f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(f13), AndroidUtilities.dpf2(5.0f), (i16 == i18 ? 1 : 0) * e7));
                        if (e7 > 0.0f) {
                            int i20 = i18 - i16;
                            rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i20 * i11), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i20 + 1) * i11) - AndroidUtilities.dp(5.0f), e7), i11 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                        }
                        rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f18);
                        if (i18 <= i16) {
                            paint3.setAlpha((int) (f21 * 255.0f * e));
                            paint = paint3;
                        } else {
                            paint2.setAlpha((int) (85 * f21 * e));
                            paint = paint2;
                        }
                        canvas.drawRoundRect(rectF2, f17, f17, paint);
                        i18++;
                        min = f15;
                        i17 = i12;
                        clamp = f16;
                        measuredWidth = i11;
                        v6Var2 = v6Var;
                    }
                }
                f15 = min;
                v6Var = v6Var2;
                f16 = clamp;
                i11 = measuredWidth;
                i12 = i17;
                i18++;
                min = f15;
                i17 = i12;
                clamp = f16;
                measuredWidth = i11;
                v6Var2 = v6Var;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x01d3, code lost:
    
        if (((zh.t7) r2.c).paused != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
    
        if (r4.n() != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ff  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        y2 y2Var;
        ?? r15;
        float hideInterfaceAlpha;
        float f10;
        float f11;
        float f12;
        float f13;
        iz izVar;
        f3 f3Var;
        boolean z10;
        float f14;
        boolean z11;
        org.telegram.ui.Components.d6 d6Var;
        boolean hasNotThumb;
        eh.d dVar;
        t7 t7Var;
        w6 w6Var;
        Canvas canvas2 = canvas;
        a3 a3Var = this.x;
        h2 h2Var = a3Var.c1;
        f2 f2Var = a3Var.j1;
        z2 z2Var = a3Var.O1;
        gg.h1 h1Var = a3Var.e1;
        k2.v vVar = a3Var.M2;
        l2 l2Var = a3Var.K0;
        if (!a3Var.K1) {
            a3Var.o1.a.getImageReceiver().setVisible(true, true);
        }
        boolean z12 = a3Var.c3;
        y2 y2Var2 = this.v;
        if (z12) {
            f7 = 1.0f;
            canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
        } else {
            f7 = 1.0f;
            if (((org.telegram.ui.m4) vVar.e) != null || (f2Var != null && (((w6Var = f2Var.b) != null && (w6Var.w || w6Var.s)) || f2Var.y.i))) {
                invalidate();
            }
            canvas2.save();
            rv0 rv0Var = a3Var.X2;
            if (rv0Var.n) {
                canvas2.save();
                float f15 = rv0Var.O;
                float f16 = rv0Var.A;
                float f17 = ((f15 * f16) + 1.0f) - f16;
                canvas2.scale(f17, f17, rv0Var.o + rv0Var.s, rv0Var.p + rv0Var.t);
                float f18 = rv0Var.o;
                float f19 = rv0Var.J;
                float f20 = rv0Var.A;
                canvas2.translate((f19 * f20) + f18, (rv0Var.K * f20) + rv0Var.p);
            }
            org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) vVar.e;
            if (m4Var == null || (!vVar.a && ((t0) vVar.b) == null)) {
                if (m4Var != null) {
                    invalidate();
                }
                if (z2Var.d) {
                    canvas2.drawColor(i0.a.d(0.2f, -16777216, -1));
                } else {
                    if (!h1Var.hasBitmapImage()) {
                        y2Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                        y2Var2.f.draw(canvas2);
                    }
                    f14 = 0.0f;
                    h1Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                    h1Var.draw(canvas2);
                    canvas2.restore();
                    z11 = a3Var.Y2;
                    org.telegram.ui.Components.d6 d6Var2 = this.h;
                    d6Var = this.n;
                    if (z11) {
                        d6Var2.d(f14, true);
                        d6Var.d(f14, true);
                    }
                    if (!z2Var.f) {
                        t0 t0Var = (t0) vVar.b;
                        if (t0Var != null) {
                            if (!vVar.a) {
                            }
                            hasNotThumb = true;
                        }
                        hasNotThumb = false;
                    } else if (z2Var.e) {
                        if (((org.telegram.ui.m4) vVar.e) != null) {
                            t7 t7Var2 = (t7) vVar.c;
                            if (t7Var2 != null) {
                                if (vVar.a) {
                                    if (t7Var2.progress == 0.0f) {
                                        if (t7Var2 != null) {
                                            if (t7Var2.isBuffering()) {
                                            }
                                        }
                                    }
                                    hasNotThumb = true;
                                }
                            }
                        }
                        hasNotThumb = false;
                    } else {
                        hasNotThumb = h1Var.hasNotThumb();
                    }
                    d6Var2.d((a3Var.K1 || hasNotThumb || z2Var.b != null) ? 0.0f : 1.0f, false);
                    d6Var.d(d6Var2.c != 1.0f ? 1.0f : 0.0f, false);
                    if (d6Var.c > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i10 = (int) (d6Var.c * 255.0f);
                        org.telegram.ui.Components.voip.h hVar = this.f;
                        hVar.a.setAlpha(i10);
                        hVar.c.setAlpha(i10);
                        hVar.f = getMeasuredWidth() * 2;
                        hVar.n = 1.3f;
                        hVar.a(AndroidUtilities.dp(10.0f), canvas2, rectF, this);
                    }
                    a3Var.Y2 = false;
                }
            } else {
                if (!h1Var.hasBitmapImage()) {
                    y2Var2.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                    y2Var2.f.draw(canvas2);
                }
                h1Var.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                h1Var.draw(canvas2);
                if (a3Var.K1) {
                    u7 u7Var = this.w;
                    boolean z13 = u7Var.a;
                    if (z13 && (t7Var = (t7) vVar.c) != null && t7Var.paused && t7Var.playerStubBitmap != null && t7Var.stubAvailable) {
                        canvas2.save();
                        canvas2.scale(getMeasuredWidth() / ((t7) vVar.c).playerStubBitmap.getWidth(), getMeasuredHeight() / ((t7) vVar.c).playerStubBitmap.getHeight());
                        t7 t7Var3 = (t7) vVar.c;
                        canvas2.drawBitmap(t7Var3.playerStubBitmap, 0.0f, 0.0f, t7Var3.playerStubPaint);
                        canvas2.restore();
                    } else {
                        boolean z14 = Build.VERSION.SDK_INT >= 29 && (dVar = a3Var.H3) != null && canvas2 == dVar.r;
                        if (!z13 || (a3Var.b1 && !u7Var.H0 && !z14)) {
                            ((org.telegram.ui.m4) vVar.e).draw(canvas2);
                        }
                    }
                }
            }
            f14 = 0.0f;
            canvas2.restore();
            z11 = a3Var.Y2;
            org.telegram.ui.Components.d6 d6Var22 = this.h;
            d6Var = this.n;
            if (z11) {
            }
            if (!z2Var.f) {
            }
            d6Var22.d((a3Var.K1 || hasNotThumb || z2Var.b != null) ? 0.0f : 1.0f, false);
            d6Var.d(d6Var22.c != 1.0f ? 1.0f : 0.0f, false);
            if (d6Var.c > 0.0f) {
            }
            a3Var.Y2 = false;
        }
        if (l2Var.getAlpha() > 0.0f) {
            if (l2Var.getAlpha() == f7) {
                canvas2.save();
                y2Var = y2Var2;
                z10 = false;
            } else {
                y2Var = y2Var2;
                z10 = false;
                canvas2.saveLayerAlpha(0.0f, 0.0f, l2Var.getMeasuredWidth(), l2Var.getMeasuredHeight(), (int) (l2Var.getAlpha() * 255.0f), 31);
            }
            f2Var.draw(canvas2);
            canvas2.restore();
            r15 = z10;
        } else {
            y2Var = y2Var2;
            r15 = 0;
        }
        if (!a3Var.Z0 && h1Var.hasNotThumb()) {
            a3Var.Z0 = true;
            a3Var.invalidate();
        }
        hideInterfaceAlpha = a3Var.getHideInterfaceAlpha();
        Drawable drawable = y2Var.d;
        Paint paint = y2Var.c;
        Drawable drawable2 = y2Var.e;
        drawable.setAlpha(255);
        y2Var.d.draw(canvas2);
        if (a3Var.C1 || !a3Var.x2 || l2Var.getVisibility() == 0) {
            if (l2Var.getVisibility() == 0) {
                int dp = AndroidUtilities.dp(72.0f);
                int top = l2Var.getTop() + ((int) (l2Var.getTextTop() - AndroidUtilities.dp(24.0f)));
                int i11 = dp + top;
                float measuredHeight = getMeasuredHeight() * 0.65f;
                if ((measuredHeight - top) / AndroidUtilities.dp(60.0f) > 0.0f && l2Var.w0 && l2Var.r0.getBottom() - l2Var.getMeasuredHeight() > 0) {
                    if ((measuredHeight - (l2Var.getTop() + ((int) (l2Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        a3Var.g3 = true;
                    }
                    f10 = 0.0f;
                } else if (a3Var.h3) {
                    a3Var.h3 = r15;
                    f10 = 0.0f;
                    if ((measuredHeight - (l2Var.getTop() + ((int) (l2Var.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > 0.0f) {
                        a3Var.g3 = true;
                    }
                } else {
                    f10 = 0.0f;
                    if (l2Var.getProgressToBlackout() == 0.0f) {
                        a3Var.g3 = r15;
                    }
                }
                float d = this.e.d(a3Var.g3 ? 1.0f : 0.0f, r15);
                if (d > f10) {
                    this.r = true;
                    this.s = r15;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                    b(canvas);
                    paint.setColor(i0.a.k(-16777216, (int) (153.0f * d * hideInterfaceAlpha)));
                    canvas2.drawPaint(paint);
                }
                if (d < f7 && !z2Var.f) {
                    canvas2.save();
                    float f21 = f7 - d;
                    paint.setColor(i0.a.k(-16777216, (int) (129.03f * f21 * hideInterfaceAlpha)));
                    drawable2.setAlpha((int) (f21 * 255.0f * hideInterfaceAlpha));
                    drawable2.setBounds(r15, top, getMeasuredWidth(), i11);
                    drawable2.draw(canvas2);
                    canvas2.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint);
                    canvas.restore();
                }
                if (d <= f10 || l2Var.getAlpha() <= 0.0f) {
                    canvas2 = canvas;
                } else {
                    if (l2Var.t0) {
                        l2Var.t0 = r15;
                        l2Var.invalidate();
                    }
                    if (l2Var.getAlpha() != f7) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (l2Var.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    canvas2.translate(l2Var.getX(), l2Var.getY() - l2Var.getScrollY());
                    l2Var.draw(canvas2);
                    canvas2.restore();
                }
                boolean z15 = d > f10;
                if (l2Var.t0 != z15) {
                    l2Var.t0 = z15;
                    l2Var.invalidate();
                }
                if (d > f10) {
                    this.r = true;
                    this.s = true;
                    super.dispatchDraw(canvas);
                    this.r = r15;
                }
                f11 = d;
                f12 = a3Var.m1;
                if (f12 != 0.0f || (f3Var = a3Var.l1) == null) {
                    f13 = 1.0f;
                } else {
                    float f22 = a3Var.A3;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() + 1;
                    g3 g3Var = f3Var.f;
                    ImageReceiver imageReceiver = f3Var.a;
                    float f23 = (float) r15;
                    imageReceiver.setImageCoords(f23, f23, measuredWidth, measuredHeight2);
                    imageReceiver.setAlpha(f12);
                    imageReceiver.draw(canvas2);
                    f13 = 1.0f;
                    imageReceiver.setAlpha(1.0f);
                    if (f3Var.c != null) {
                        int i12 = (int) (f12 * 255.0f);
                        f3Var.d.setAlpha(i12);
                        GradientDrawable gradientDrawable = g3Var.H;
                        gradientDrawable.setAlpha(i12);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(24.0f) * f22)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f22, f22, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22));
                        canvas2.translate(imageReceiver.getCenterX() - (g3Var.J / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f22)) - f3Var.c.getHeight());
                        f3Var.c.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!a3Var.G2) {
                    f13 = 0.0f;
                }
                this.d.d(f13, r15);
                if (a3Var.K1) {
                    boolean z16 = l2Var.getVisibility() == 0 && (a3Var.g3 || l2Var.w0);
                    a3Var.j3 = l2Var.getVisibility() == 0 && l2Var.getProgressToBlackout() > 0.0f;
                    u7 u7Var2 = ((l7) a3Var.Q1).d;
                    u7Var2.L0 = z16;
                    u7Var2.P();
                    ((l7) a3Var.Q1).d.m1 = a3Var.j3;
                }
                if (f11 <= 0.0f) {
                    super.dispatchDraw(canvas);
                    b(canvas);
                }
                izVar = a3Var.k1;
                if (izVar == null) {
                    izVar.e(canvas2);
                    return;
                }
                return;
            }
            if (!z2Var.f) {
                int dp2 = AndroidUtilities.dp(a3Var.x2 ? 56.0f : 110.0f);
                if ((a3Var.C1 || !a3Var.x2) && l2Var.getVisibility() == 0) {
                    dp2 = (int) (dp2 * 2.5f);
                }
                drawable2.setBounds(r15, h2Var.getMeasuredHeight() - dp2, getMeasuredWidth(), h2Var.getMeasuredHeight());
                drawable2.setAlpha((int) (hideInterfaceAlpha * 255.0f));
                drawable2.draw(canvas2);
            }
        }
        f11 = 0.0f;
        f12 = a3Var.m1;
        if (f12 != 0.0f) {
        }
        f13 = 1.0f;
        if (!a3Var.G2) {
        }
        this.d.d(f13, r15);
        if (a3Var.K1) {
        }
        if (f11 <= 0.0f) {
        }
        izVar = a3Var.k1;
        if (izVar == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t0 t0Var;
        a3 a3Var = this.x;
        k2.v vVar = a3Var.M2;
        if (!a3Var.K1 || a3Var.c3 || ((org.telegram.ui.m4) vVar.e) == null || (t0Var = (t0) vVar.b) == null || !t0Var.n() || !((org.telegram.ui.m4) vVar.e).dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.x.j1) {
            return true;
        }
        if (!this.r) {
            return super.drawChild(canvas, view, j3);
        }
        pc pcVar = pc.w;
        if (pcVar == null || view != pcVar.e) {
            return super.drawChild(canvas, view, j3);
        }
        if (this.s) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x.k1.j();
        pc.a(this, new rd(this, 9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.x;
        a3Var.k1.k();
        pc.h(this);
        w2 w2Var = a3Var.Q1;
        if (w2Var != null) {
            u7 u7Var = ((l7) w2Var).d;
            u7Var.Y0 = false;
            u7Var.P();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
