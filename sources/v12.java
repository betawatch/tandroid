// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v12 extends ela {
    public int m0;
    public final RectF n0;
    public boolean o0;
    public float p0;
    public final u12 q0;
    public final /* synthetic */ i22 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v12(i22 i22Var, Context context) {
        super(context, null);
        this.r0 = i22Var;
        this.n0 = new RectF();
        this.q0 = new u12(this, this);
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int L;
        int L2;
        float f2;
        float f3;
        float f4;
        int v0;
        float alpha;
        float f5;
        a22 a22Var;
        canvas.save();
        i22 i22Var = this.r0;
        a22 a22Var2 = i22Var.v2;
        x62 x62Var = i22Var.k2;
        if ((a22Var2 == x62Var || (a22Var = i22Var.w2) == x62Var || (a22Var2 == i22Var.d2 && a22Var == null)) && a22Var2 != null) {
            canvas.save();
            float f6 = i22Var.i4;
            boolean z = i22Var.a2;
            su suVar = i22Var.L2;
            h12 h12Var = i22Var.f3;
            canvas.translate(0.0f, f6);
            int alpha2 = (int) (a22Var2.getAlpha() * 255.0f);
            int j = a22Var2.j();
            int L3 = gm.L(13.0f) + ((int) ((h12Var != null ? h12Var.getAlpha() : 0.0f) * gm.L(26.0f))) + ((int) (suVar != null ? suVar.getAlpha() * suVar.getMeasuredHeight() : 0.0f));
            int X0 = (i22Var.X0(0) - i22Var.t0) - L3;
            if (i22Var.B0 == 1 || i22Var.q3 != null) {
                X0 = (int) (a22Var2.getTranslationY() + X0);
            }
            int L4 = gm.L(20.0f) + X0;
            getMeasuredHeight();
            int i = i22Var.t0;
            if (j != 0) {
                i = a.getCurrentActionBarHeight();
            }
            if (j != 2) {
                float f7 = L3;
                f = 1.0f;
                if (a22Var2 == i22Var.i2) {
                    L = gm.L(11.0f);
                } else {
                    if (a22Var2 == i22Var.g2) {
                        L2 = gm.L(3.0f);
                    } else if (a22Var2 == i22Var.h2) {
                        L2 = gm.L(3.0f);
                    } else {
                        L = gm.L(4.0f);
                    }
                    f2 = f7 - L2;
                    float alpha3 = i22Var.U2.getAlpha();
                    int i2 = (int) (((i - f2) + gm.m) * alpha3);
                    X0 -= i2;
                    L4 -= i2;
                    f3 = 1.0f - alpha3;
                }
                f2 = f7 + L;
                float alpha32 = i22Var.U2.getAlpha();
                int i22 = (int) (((i - f2) + gm.m) * alpha32);
                X0 -= i22;
                L4 -= i22;
                f3 = 1.0f - alpha32;
            } else if (X0 < i) {
                f3 = aq1.x(i - X0, i22Var.t0, 1.0f, 0.0f);
                f = 1.0f;
            } else {
                f3 = 1.0f;
                f = 1.0f;
            }
            if (!z) {
                int i3 = gm.m;
                X0 += i3;
                L4 += i3;
            }
            int customBackground = i22Var.v2.h() ? i22Var.v2.getCustomBackground() : i22Var.Y0(true);
            i22Var.s0.setAlpha(alpha2);
            i22Var.s0.setBounds(0, X0, getMeasuredWidth(), gm.L(45.0f) + getMeasuredHeight() + i22Var.t0);
            i22Var.s0.draw(canvas);
            RectF rectF = this.n0;
            if (j == 2) {
                cmb.s0.setColor(customBackground);
                cmb.s0.setAlpha(alpha2);
                f4 = 24.0f;
                rectF.set(i22Var.u0, i22Var.t0 + X0, getMeasuredWidth() - i22Var.u0, gm.L(24.0f) + i22Var.t0 + X0);
            } else {
                f4 = 24.0f;
            }
            if ((f3 != f && j != 2) || i22Var.v2.g()) {
                Paint paint = cmb.s0;
                if (i22Var.v2.g()) {
                    customBackground = i22Var.v2.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                cmb.s0.setAlpha(alpha2);
                rectF.set(i22Var.u0, i22Var.t0 + X0, getMeasuredWidth() - i22Var.u0, gm.L(f4) + i22Var.t0 + X0);
            }
            if (i22Var.v2.g()) {
                cmb.s0.setColor(i22Var.v2.getCustomActionBarBackground());
                cmb.s0.setAlpha(alpha2);
                int X02 = i22Var.X0(0);
                if (!z) {
                    X02 += gm.m;
                }
                rectF.set(i22Var.u0, (gm.L(12.0f) + i22Var.t0 + X0) * f3, getMeasuredWidth() - i22Var.u0, gm.L(12.0f) + X02);
                canvas.save();
                canvas.drawRect(rectF, cmb.s0);
                canvas.restore();
            }
            if ((h12Var == null || h12Var.getAlpha() != f) && f3 != 0.0f) {
                int L5 = gm.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, L4, (getMeasuredWidth() + L5) / 2, gm.L(4.0f) + L4);
                if (j == 2) {
                    v0 = TLObject.FLAG_29;
                    f5 = f3;
                } else if (i22Var.v2.g()) {
                    int customActionBarBackground = i22Var.v2.getCustomActionBarBackground();
                    v0 = on2.f(0.5f, customActionBarBackground, on2.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (h12Var != null) {
                        alpha = h12Var.getAlpha();
                        f5 = f - alpha;
                    }
                    f5 = f;
                } else {
                    v0 = cmb.v0(cmb.yj, i22Var.J0);
                    if (h12Var != null) {
                        alpha = h12Var.getAlpha();
                        f5 = f - alpha;
                    }
                    f5 = f;
                }
                int alpha4 = Color.alpha(v0);
                cmb.s0.setColor(v0);
                cmb.s0.setAlpha((int) (a22Var2.getAlpha() * alpha4 * f5 * f3));
                canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        int L;
        int L2;
        float f2;
        float f3;
        int L3;
        int L4;
        float f4;
        float f5;
        float f6;
        boolean drawChild;
        int v0;
        float alpha;
        a22 a22Var;
        i22 i22Var = this.r0;
        boolean z = i22Var.a2;
        su suVar = i22Var.L2;
        im0 im0Var = i22Var.x2;
        h12 h12Var = i22Var.f3;
        x20 x20Var = i22Var.U2;
        if (!(view instanceof a22) || view.getAlpha() <= 0.0f) {
            if (view != x20Var) {
                if (!(view instanceof e34) || im0Var == null) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                im0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(im0Var.S.k);
                im0Var.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = x20Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            float x = x20Var.getX();
            a22 a22Var2 = i22Var.v2;
            if (a22Var2 != null) {
                int j2 = a22Var2.j();
                int L5 = gm.L(13.0f) + ((int) ((h12Var != null ? h12Var.getAlpha() : 0.0f) * gm.L(26.0f))) + ((int) (suVar != null ? suVar.getAlpha() * suVar.getMeasuredHeight() : 0.0f));
                int X0 = (i22Var.X0(0) - i22Var.t0) - L5;
                if (i22Var.B0 == 1 || i22Var.q3 != null) {
                    X0 = (int) (a22Var2.getTranslationY() + X0);
                }
                int L6 = gm.L(20.0f) + X0;
                int currentActionBarHeight = j2 != 0 ? a.getCurrentActionBarHeight() : i22Var.t0;
                if (j2 != 2 && X0 + i22Var.t0 < currentActionBarHeight) {
                    float f7 = L5;
                    if (a22Var2 == i22Var.i2) {
                        L = gm.L(11.0f);
                    } else {
                        if (a22Var2 == i22Var.g2) {
                            L2 = gm.L(3.0f);
                        } else if (a22Var2 == i22Var.h2) {
                            L2 = gm.L(3.0f);
                        } else {
                            L = gm.L(4.0f);
                        }
                        f2 = f7 - L2;
                        L6 -= (int) (x20Var.getAlpha() * ((currentActionBarHeight - f2) + gm.m));
                    }
                    f2 = f7 + L;
                    L6 -= (int) (x20Var.getAlpha() * ((currentActionBarHeight - f2) + gm.m));
                }
                if (!z) {
                    L6 += gm.m;
                }
                f = L6;
            } else {
                f = 0.0f;
            }
            canvas.clipRect(x, f, x20Var.getX() + x20Var.getWidth(), x20Var.getY() + x20Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, i22Var.i4);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        a22 a22Var3 = (a22) view;
        int j3 = a22Var3.j();
        int L7 = gm.L(13.0f) + (h12Var != null ? gm.L(h12Var.getAlpha() * 26.0f) : 0) + ((int) (suVar != null ? suVar.getAlpha() * suVar.getMeasuredHeight() : 0.0f));
        int X02 = (i22Var.X0(a22Var3 == i22Var.v2 ? 0 : 1) - i22Var.t0) - L7;
        if (i22Var.B0 == 1 || i22Var.q3 != null) {
            X02 = (int) (view.getTranslationY() + X02);
        }
        int L8 = gm.L(20.0f) + X02;
        int L9 = gm.L(45.0f) + getMeasuredHeight();
        int i = i22Var.t0;
        int i2 = L9 + i;
        if (j3 != 0) {
            i = a.getCurrentActionBarHeight();
        }
        if (j3 != 2) {
            f3 = 0.0f;
            if (i22Var.t0 + X02 < i) {
                float f8 = L7;
                if (a22Var3 == i22Var.i2) {
                    L3 = gm.L(11.0f);
                } else {
                    if (a22Var3 == i22Var.g2) {
                        L4 = gm.L(3.0f);
                    } else if (a22Var3 == i22Var.h2) {
                        L4 = gm.L(3.0f);
                    } else {
                        L3 = gm.L(4.0f);
                    }
                    f4 = f8 - L4;
                    float min = Math.min(1.0f, ((i - X02) - i22Var.t0) / f4);
                    int i3 = (int) ((i - f4) * min);
                    X02 -= i3;
                    L8 -= i3;
                    i2 += i3;
                    f5 = 1.0f - min;
                }
                f4 = f8 + L3;
                float min2 = Math.min(1.0f, ((i - X02) - i22Var.t0) / f4);
                int i32 = (int) ((i - f4) * min2);
                X02 -= i32;
                L8 -= i32;
                i2 += i32;
                f5 = 1.0f - min2;
            }
            f5 = 1.0f;
        } else if (X02 < i) {
            f5 = aq1.x(i - X02, i22Var.t0, 1.0f, 0.0f);
            f3 = 0.0f;
        } else {
            f3 = 0.0f;
            f5 = 1.0f;
        }
        if (!z) {
            int i4 = gm.m;
            X02 += i4;
            L8 += i4;
            i2 -= i4;
        }
        int i5 = i2;
        int customBackground = i22Var.v2.h() ? i22Var.v2.getCustomBackground() : i22Var.Y0(true);
        a22 a22Var4 = i22Var.v2;
        x62 x62Var = i22Var.k2;
        boolean z2 = (a22Var4 == x62Var || (a22Var = i22Var.w2) == x62Var || (a22Var4 == i22Var.d2 && a22Var == null)) ? false : true;
        RectF rectF = this.n0;
        if (z2) {
            i22Var.s0.setAlpha(alpha3);
            f6 = 24.0f;
            i22Var.s0.setBounds(0, X02, getMeasuredWidth(), i5);
            i22Var.s0.draw(canvas);
            if (j3 == 2) {
                cmb.s0.setColor(customBackground);
                cmb.s0.setAlpha(alpha3);
                rectF.set(i22Var.u0, i22Var.t0 + X02, getMeasuredWidth() - i22Var.u0, gm.L(24.0f) + i22Var.t0 + X02);
            }
        } else {
            f6 = 24.0f;
        }
        a22Var3.F(((i22Var.t0 + X02) - view.getTop()) - view.getTranslationY(), f5);
        if (view == i22Var.e2 || view == i22Var.m2 || view == i22Var.f2) {
            drawChild = super.drawChild(canvas, view, j);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        }
        if (z2) {
            if (f5 != 1.0f && j3 != 2) {
                cmb.s0.setColor(customBackground);
                cmb.s0.setAlpha(alpha3);
                rectF.set(i22Var.u0, i22Var.t0 + X02, getMeasuredWidth() - i22Var.u0, gm.L(f6) + i22Var.t0 + X02);
            }
            if ((h12Var == null || h12Var.getAlpha() != 1.0f) && f5 != f3) {
                int L10 = gm.L(36.0f);
                rectF.set((getMeasuredWidth() - L10) / 2, L8, (getMeasuredWidth() + L10) / 2, gm.L(4.0f) + L8);
                if (j3 == 2) {
                    v0 = TLObject.FLAG_29;
                    alpha = f5;
                } else {
                    v0 = cmb.v0(cmb.yj, i22Var.J0);
                    alpha = h12Var == null ? 1.0f : 1.0f - h12Var.getAlpha();
                }
                int alpha4 = Color.alpha(v0);
                cmb.s0.setColor(v0);
                cmb.s0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f5));
                canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u12 u12Var = this.q0;
        u12Var.b = this;
        u12Var.c();
        i22 i22Var = this.r0;
        i22Var.B2.setAdjustPanLayoutHelper(u12Var);
        i22Var.M2.setAdjustPanLayoutHelper(u12Var);
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q0.d();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i22 i22Var = this.r0;
        int[] iArr = i22Var.Y3;
        if (i22Var.v2.o(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y = motionEvent.getY();
                su suVar = i22Var.L2;
                int i = iArr[0] - (i22Var.t0 << 1);
                int L = gm.L(13.0f);
                h12 h12Var = i22Var.f3;
                int L2 = gm.L(20.0f) + ((i - (L + (h12Var != null ? gm.L(h12Var.getAlpha() * 26.0f) : 0))) - ((int) (suVar != null ? suVar.getAlpha() * suVar.getMeasuredHeight() : 0.0f)));
                if (!i22Var.a2) {
                    L2 += gm.m;
                }
                if (y < L2 && i22Var.U2.getAlpha() == 0.0f) {
                    i22Var.l0();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d62 d62Var;
        su suVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        k12 k12Var;
        m12 m12Var;
        v72 v72Var;
        v72 v72Var2;
        int i13;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        v12 v12Var = this;
        i22 i22Var = v12Var.r0;
        su suVar2 = i22Var.L2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
        int i14 = i3 - i;
        if (v12Var.m0 != i14) {
            v12Var.m0 = i14;
            oy1 oy1Var = i22Var.b2;
            if (oy1Var != null && !oy1Var.u0) {
                oy1Var.dismiss();
            }
        }
        int childCount = v12Var.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            i22Var.h4.set(i, i2, i3, i4);
            v12Var.setSystemGestureExclusionRects(i22Var.g4);
        }
        WeakHashMap weakHashMap = kfc.a;
        wzc a = dfc.a(v12Var);
        int i15 = 8;
        int i16 = a != null ? a.a.f(8).d : 0;
        int paddingBottom = v12Var.getPaddingBottom();
        if (!i22Var.d) {
            v72 v72Var3 = i22Var.g2;
            if (v72Var3 == null || i22Var.v2 != v72Var3 || v72Var3.F == null) {
                v72 v72Var4 = i22Var.h2;
                if (v72Var4 == null || i22Var.v2 != v72Var4 || v72Var4.F == null) {
                    if (i16 <= gm.L(20.0f) && !gm.E && !gm.O1()) {
                        emojiPadding = i22Var.U0().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i16 <= gm.L(20.0f) && !gm.E && !gm.O1()) {
                        emojiPadding = i22Var.h2.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i16 <= gm.L(20.0f) && !gm.E && !gm.O1()) {
                    emojiPadding = i22Var.g2.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        v12Var.setBottomClip(paddingBottom);
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = v12Var.getChildAt(i17);
            if (childAt.getVisibility() == i15) {
                suVar = suVar2;
                i5 = childCount;
                i6 = i14;
            } else {
                int i18 = gm.m;
                int max2 = i16 == 0 ? Math.max(gm.n, paddingBottom) : 0;
                if (childAt instanceof a22) {
                    a22 a22Var = (a22) childAt;
                    if (a22Var.h) {
                        i18 = 0;
                    }
                    if (a22Var.f) {
                        max2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                suVar = suVar2;
                int i19 = layoutParams.gravity;
                i5 = childCount;
                if (i19 == -1) {
                    i19 = 51;
                }
                int i20 = i19 & nm7.w1;
                int i21 = i19 & 7;
                i6 = i14;
                if (i21 == 1) {
                    i7 = ((i6 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i8 = layoutParams.rightMargin;
                } else if (i21 != 5) {
                    i9 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i20 == 16) {
                        if (i20 == 48) {
                            i12 = layoutParams.topMargin + i18;
                        } else if (i20 != 80) {
                            i12 = layoutParams.topMargin;
                        } else {
                            i10 = td4.f(i4, max2, i2, measuredHeight3);
                            i11 = layoutParams.bottomMargin;
                        }
                        if (childAt != i22Var.U2 || childAt == i22Var.s3) {
                            i12 = 0;
                        }
                        k12Var = i22Var.B2;
                        if ((k12Var == null && k12Var.l(childAt)) || (((m12Var = i22Var.M2) != null && m12Var.l(childAt)) || (((v72Var = i22Var.g2) != null && childAt == v72Var.F) || ((v72Var2 = i22Var.h2) != null && childAt == v72Var2.F)))) {
                            if (gm.O1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i16;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i12 = measuredHeight - measuredHeight2;
                        } else if (childAt == i22Var.B4) {
                            if (i22Var.W1) {
                                i13 = gm.m;
                                max = a.getCurrentActionBarHeight();
                                i12 = i13 + max;
                            }
                        } else if (childAt == i22Var.t3) {
                            i13 = i12 + gm.n;
                            max = Math.max(i16, i22Var.W0());
                            i12 = i13 + max;
                        }
                        childAt.layout(i9, i12, measuredWidth + i9, measuredHeight3 + i12);
                    } else {
                        i10 = ((((i4 - max2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i11 = layoutParams.bottomMargin;
                    }
                    i12 = i10 - i11;
                    if (childAt != i22Var.U2) {
                    }
                    i12 = 0;
                    k12Var = i22Var.B2;
                    if (k12Var == null) {
                    }
                    if (childAt == i22Var.B4) {
                    }
                } else {
                    i7 = ((i6 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i8 = i22Var.u0;
                }
                i9 = i7 - i8;
                if (i20 == 16) {
                }
                i12 = i10 - i11;
                if (childAt != i22Var.U2) {
                }
                i12 = 0;
                k12Var = i22Var.B2;
                if (k12Var == null) {
                }
                if (childAt == i22Var.B4) {
                }
            }
            i17++;
            v12Var = this;
            suVar2 = suVar;
            childCount = i5;
            i14 = i6;
            i15 = 8;
        }
        su suVar3 = suVar2;
        R();
        i22Var.H1(i22Var.v2, 0);
        i22Var.H1(i22Var.w2, 0);
        if (i22Var.W1) {
            i22Var.E1();
        }
        if (chatAttachAlertPhotoLayout == null || (d62Var = chatAttachAlertPhotoLayout.F) == null || d62Var.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.F.getFastScroll().i0 = a.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.q1 + (i22Var.W1 ? (int) (suVar3.getAlpha() * suVar3.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.F.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        v72 v72Var;
        v72 v72Var2;
        int W0;
        v12 v12Var = this;
        i22 i22Var = v12Var.r0;
        r7 r7Var = i22Var.X2;
        boolean z = i22Var.a2;
        int size = v12Var.getLayoutParams().height > 0 ? v12Var.getLayoutParams().height : View.MeasureSpec.getSize(i2);
        if (!z) {
            v12Var.o0 = true;
            int i4 = i22Var.u0;
            v12Var.setPadding(i4, 0, i4, 0);
            v12Var.o0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i) - (i22Var.u0 << 1);
        if (gm.O1()) {
            r7Var.setAdditionalYOffset(-gm.L(3.0f));
        } else {
            Point point = gm.q;
            if (point.x > point.y) {
                r7Var.setAdditionalYOffset(0);
            } else {
                r7Var.setAdditionalYOffset(-gm.L(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) i22Var.c3.getLayoutParams()).height = a.getCurrentActionBarHeight();
        v12Var.o0 = true;
        int min = (int) (size2 / Math.min(4.5f, i22Var.x3.b()));
        if (i22Var.V3 != min) {
            i22Var.V3 = min;
            gm.c3(new fo1(v12Var, (byte) 18));
        }
        v12Var.o0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        v12Var.setMeasuredDimension(size3, size4);
        int i5 = i22Var.u0;
        m12 m12Var = i22Var.M2;
        k12 k12Var = i22Var.B2;
        int i6 = size3 - (i5 << 1);
        if (!k12Var.O && gm.L(20.0f) >= 0 && !k12Var.e && !k12Var.P) {
            v12Var.o0 = true;
            k12Var.j();
            v12Var.o0 = false;
        }
        if (!m12Var.O && gm.L(20.0f) >= 0 && !m12Var.e && !m12Var.P) {
            v12Var.o0 = true;
            m12Var.j();
            v12Var.o0 = false;
        }
        if (i22Var.g2 != null && gm.L(20.0f) >= 0) {
            v72 v72Var3 = i22Var.g2;
            if (!v72Var3.H && !v72Var3.b1 && !v72Var3.g1 && !v72Var3.i1) {
                v12Var.o0 = true;
                v72Var3.a0();
                v12Var.o0 = false;
            }
        }
        if (i22Var.h2 != null && gm.L(20.0f) >= 0) {
            v72 v72Var4 = i22Var.h2;
            if (!v72Var4.H && !v72Var4.b1 && !v72Var4.g1 && !v72Var4.i1) {
                v12Var.o0 = true;
                v72Var4.a0();
                v12Var.o0 = false;
            }
        }
        if (gm.L(20.0f) >= 0) {
            if (i22Var.d) {
                a22 a22Var = i22Var.v2;
                v72 v72Var5 = i22Var.g2;
                if (a22Var == v72Var5 && v72Var5.F != null && v72Var5.i1) {
                    W0 = gm.L(120.0f);
                } else {
                    v72 v72Var6 = i22Var.h2;
                    W0 = (a22Var == v72Var6 && v72Var6.F != null && v72Var6.i1) ? gm.L(120.0f) : 0;
                }
            } else {
                W0 = i22Var.W0();
            }
            WeakHashMap weakHashMap = kfc.a;
            wzc a = dfc.a(v12Var);
            int i7 = a != null ? a.a.f(8).d : 0;
            wzc a2 = dfc.a(v12Var);
            if (a2 != null) {
                int i8 = a2.a.f(527).d;
            }
            int max = Math.max(i7 > 0 ? 0 : gm.n, W0);
            v12Var.o0 = true;
            a22 a22Var2 = i22Var.v2;
            if (a22Var2.f) {
                a22Var2.e = gm.L(62.0f) + max;
                i22Var.v2.B(i6, size4);
            } else {
                a22Var2.e = gm.n;
                a22Var2.B(i6, size4 - W0);
            }
            a22 a22Var3 = i22Var.w2;
            if (a22Var3 != null) {
                if (a22Var3.f) {
                    a22Var3.e = gm.L(62.0f) + max;
                    i22Var.w2.B(i6, size4);
                } else {
                    a22Var3.e = gm.n;
                    a22Var3.B(i6, size4 - W0);
                }
            }
            v12Var.o0 = false;
        }
        int childCount = v12Var.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            int i10 = i9;
            View childAt = v12Var.getChildAt(i10);
            if (childAt == null || childAt.getVisibility() == 8) {
                i3 = i10;
            } else if (childAt == i22Var.s3) {
                i3 = i10;
                v12Var.measureChildWithMargins(childAt, i, 0, makeMeasureSpec, 0);
            } else {
                i3 = i10;
                int i11 = gm.m;
                int i12 = gm.n;
                if (childAt instanceof a22) {
                    a22 a22Var4 = (a22) childAt;
                    if (a22Var4.h) {
                        i11 = 0;
                    }
                    if (a22Var4.f) {
                        i12 = 0;
                    }
                }
                if (!k12Var.l(childAt) && !m12Var.l(childAt) && (((v72Var = i22Var.g2) == null || childAt != v72Var.F) && ((v72Var2 = i22Var.h2) == null || childAt != v72Var2.F))) {
                    measureChildWithMargins(childAt, i, 0, makeMeasureSpec, i11 + i12);
                } else if (z) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, TLObject.FLAG_30));
                } else if (!gm.E && !gm.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (gm.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(gm.O1() ? 200.0f : 320.0f), getPaddingTop() + (size4 - gm.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - gm.m), TLObject.FLAG_30));
                }
            }
            i9 = i3 + 1;
            v12Var = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i, i2, i3, i4);
        int i6 = 0;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
            i5 = 0;
        } else {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            i5 = roundedCorner == null ? 0 : roundedCorner.getRadius();
            if (roundedCorner2 != null) {
                i6 = roundedCorner2.getRadius();
            }
        }
        im0 im0Var = this.r0.x2;
        if (im0Var != null) {
            im0Var.t(gm.L(29.0f), gm.L(29.0f), i6, i5, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i22 i22Var = this.r0;
        if (i22Var.v2.o(motionEvent)) {
            return true;
        }
        return !i22Var.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.o0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        i22 i22Var = this.r0;
        h12 h12Var = i22Var.u3;
        float f2 = f + i22Var.i4;
        byte b = i22Var.B0;
        if (b == 0) {
            this.p0 = f2;
        }
        if (b == 1) {
            a22 a22Var = i22Var.v2;
            if (f2 < 0.0f) {
                a22Var.setTranslationY(f2);
                if (i22Var.N2 != 0 || i22Var.Q2) {
                    i22Var.f3.setTranslationY((i22Var.m3 + f2) - i22Var.i4);
                }
                h12Var.setTranslationY(0.0f);
                f2 = 0.0f;
            } else {
                a22Var.setTranslationY(0.0f);
                h12Var.setTranslationY(((f2 / this.p0) * h12Var.getMeasuredHeight()) + (-f2));
            }
            i22Var.b.invalidate();
        }
        super.setTranslationY((f2 - i22Var.i4) + i22Var.s2);
        if (i22Var.B0 != 1) {
            i22Var.v2.m(i22Var.i4);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // ela
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
