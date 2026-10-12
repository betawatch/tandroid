package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zi0 extends org.telegram.ui.Components.ow0 {
    public final p20 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 C0;
    public final /* synthetic */ hj0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(hj0 hj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.D0 = hj0Var;
        this.C0 = c6Var;
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = 0;
        this.z0 = new int[2];
        this.A0 = new p20();
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
        this.B0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0380, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.u1 u1Var;
        float f7;
        int i10;
        boolean z10;
        float f10;
        float height;
        final float f11;
        float f12;
        char c11;
        float f13;
        hj0 hj0Var = this.D0;
        int[] iArr2 = hj0Var.o0;
        Paint paint = hj0Var.T;
        Rect rect = hj0Var.u0;
        aj0 aj0Var = hj0Var.K;
        if (hj0Var.w && (u1Var = hj0Var.Q) != null && u1Var.getCurrentPosition() == null) {
            if (hj0Var.x) {
                org.telegram.ui.Components.rf rfVar = hj0Var.S;
                if (rfVar != null) {
                    rfVar.setAlpha(0.0f);
                }
                hj0Var.x = false;
            }
            boolean z11 = hj0Var.Q.getMessageObject() != null && hj0Var.Q.getMessageObject().type == 15;
            float imageX = z11 ? hj0Var.Q.getPhotoImage().getImageX() : hj0Var.Q.getTextX();
            float imageY = z11 ? hj0Var.Q.getPhotoImage().getImageY() : hj0Var.Q.getTextY();
            float x10 = hj0Var.Q.getX() + aj0Var.getX() + imageX;
            float y3 = hj0Var.Q.getY() + aj0Var.getY() + imageY;
            float textSize = (hj0Var.Q.getMessageObject() != null ? hj0Var.Q.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.g6.o2).getTextSize();
            org.telegram.ui.Components.rf rfVar2 = hj0Var.S;
            if (rfVar2 != null) {
                z10 = false;
                int[] iArr3 = this.w0;
                rfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = hj0Var.S.getPaddingLeft() + iArr3[0];
                i10 = 1;
                float paddingTop = (hj0Var.S.getPaddingTop() + iArr3[1]) - hj0Var.S.getScrollY();
                float textSize2 = hj0Var.S.getTextSize();
                int i11 = iArr3[1];
                f7 = imageY;
                height = hj0Var.S.getMeasuredHeight() + i11;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, hj0Var.E);
                y3 = AndroidUtilities.lerp(paddingTop, y3, hj0Var.E);
                f11 = AndroidUtilities.lerp(textSize2, textSize, hj0Var.E);
                f12 = i11;
            } else {
                f7 = imageY;
                i10 = 1;
                z10 = false;
                f10 = 255.0f;
                height = getHeight();
                f11 = textSize;
                f12 = 0.0f;
            }
            float f14 = x10;
            float f15 = y3;
            float f16 = hj0Var.E;
            if (hj0Var.r0 != null) {
                f12 = hj0Var.s0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - aj0Var.getScaleY()) * aj0Var.getHeight()) + aj0Var.getY(), hj0Var.E);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, aj0Var.canScrollVertically(-1) ? 1.0f : 0.0f, hj0Var.E);
            float lerp3 = AndroidUtilities.lerp(hj0Var.r0 != null ? hj0Var.t0 : f17, aj0Var.getY() + aj0Var.getHeight(), hj0Var.E);
            float lerp4 = AndroidUtilities.lerp(0.0f, aj0Var.canScrollVertically(i10) ? 1.0f : 0.0f, hj0Var.E);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (hj0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-hj0Var.S.getX()) - hj0Var.S.getPaddingLeft(), ((-hj0Var.S.getY()) - hj0Var.S.getPaddingTop()) + hj0Var.S.getScrollY());
                float alpha = hj0Var.S.getAlpha();
                hj0Var.S.setAlpha(1.0f);
                if (hj0Var.E >= 0.001f) {
                    f13 = alpha;
                } else if (hj0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, hj0Var.S.getY());
                    canvas2.saveLayerAlpha(hj0Var.S.getX() + hj0Var.S.getPaddingLeft(), 0.0f, ((hj0Var.S.getX() + hj0Var.S.getPaddingLeft()) + hj0Var.S.getWidth()) - hj0Var.S.getPaddingRight(), hj0Var.S.getHeight(), (int) org.telegram.messenger.yh.x(hj0Var.E, 0.1f, 1.0f, f10), 31);
                    hj0Var.V.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.yh.x(hj0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(hj0Var.S.getPaddingLeft(), hj0Var.S.getY(), ((hj0Var.S.getX() + hj0Var.S.getPaddingLeft()) + hj0Var.S.getWidth()) - hj0Var.S.getPaddingRight(), hj0Var.S.getY() + hj0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = hj0Var.U;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.yi0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            hj0 hj0Var2 = zi0.this.D0;
                            canvas3.translate(hj0Var2.S.getX(), hj0Var2.S.getY() - hj0Var2.S.getScrollY());
                            float textSize3 = f11 / hj0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, hj0Var2.S.getPaddingLeft(), hj0Var2.S.getPaddingTop());
                            hj0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                hj0Var.S.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            hj0Var.Q.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.u1 u1Var2 = hj0Var.r0;
            if (u1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, aj0Var.getScaleX(), hj0Var.E);
                canvas2.scale(lerp5, lerp5, (-hj0Var.Q.getX()) + aj0Var.getWidth(), (-hj0Var.Q.getY()) + aj0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (hj0Var.Q.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, hj0Var.Q.getPaddingTop());
                    hj0Var.Q.D1(canvas2, true, z10);
                    canvas2.restore();
                }
                hj0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                u1Var2.getLocationInWindow(iArr4);
                int translationY = hj0Var.r0.getParent() instanceof View ? (int) ((View) hj0Var.r0.getParent()).getTranslationY() : 0;
                int i12 = this.y0;
                int[] iArr5 = this.z0;
                if (i12 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.y0 = translationY;
                float lerp6 = AndroidUtilities.lerp(hj0Var.Q.getX() + aj0Var.getX(), iArr5[c11], 1.0f - hj0Var.E);
                float lerp7 = AndroidUtilities.lerp(hj0Var.Q.getY() + aj0Var.getY(), iArr5[1], 1.0f - hj0Var.E);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, aj0Var.getScaleX(), hj0Var.E);
                canvas2.scale(lerp8, lerp8, (-hj0Var.Q.getX()) + aj0Var.getWidth(), (-hj0Var.Q.getY()) + aj0Var.getHeight());
                hj0Var.Q.getTransitionParams().K1 = 1.0f - hj0Var.E;
                hj0Var.Q.getTransitionParams().g0 = rect.left * hj0Var.E;
                hj0Var.Q.getTransitionParams().j0 = rect.top * hj0Var.E;
                hj0Var.Q.getTransitionParams().h0 = rect.right * hj0Var.E;
                org.telegram.ui.Cells.t1 transitionParams = hj0Var.Q.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = hj0Var.E;
                transitionParams.i0 = f21 * f22;
                hj0Var.Q.setTimeAlpha(1.0f - f22);
                if (hj0Var.Q.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, hj0Var.r0.getWidth(), hj0Var.r0.getHeight(), (int) (hj0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, hj0Var.Q.getPaddingTop());
                    hj0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, hj0Var.r0.getWidth(), hj0Var.r0.getHeight(), (int) ((1.0f - hj0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, hj0Var.r0.getPaddingTop());
                    hj0Var.r0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                hj0Var.Q.draw(canvas2);
                if (hj0Var.Q.getTransitionParams().w0) {
                    hj0Var.Q.W1(canvas2, 1.0f);
                    hj0Var.Q.m2(1.0f - hj0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            p20 p20Var = this.A0;
            p20Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            p20Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (hj0Var.w) {
            if (hj0Var.y) {
                org.telegram.ui.Components.wg wgVar = hj0Var.W;
                if (wgVar != null) {
                    wgVar.setAlpha(0.0f);
                }
                c10 = 0;
                hj0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i13 = iArr[c10];
            int width = hj0Var.X.getWidth();
            hj0Var.X.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i13 - (width - r4.m())), hj0Var.X.getX(), hj0Var.E), AndroidUtilities.lerp(iArr[1], hj0Var.X.getY(), hj0Var.E));
            if (hj0Var.v && hj0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, hj0Var.X.getWidth(), hj0Var.X.getHeight(), (int) (hj0Var.E * 255.0f), 31);
            }
            hj0Var.X.draw(canvas2);
            if (hj0Var.v && hj0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (hj0Var.l0 != null) {
            if (hj0Var.J == null) {
                hj0Var.J = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((hj0Var.l0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((hj0Var.l0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (hj0Var.l0.right - AndroidUtilities.dp(12.0f)), (int) (hj0Var.l0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (hj0Var.J.e() * 30.0f * hj0Var.E));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            hj0Var.J.setBounds(rect2);
            org.telegram.ui.Components.q5 q5Var = hj0Var.J;
            q5Var.v = (int) (hj0Var.E * 255.0f);
            q5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hj0 hj0Var = this.D0;
        if (hj0Var.w) {
            if (view == hj0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.u1 u1Var = hj0Var.Q;
            if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
