package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ti0 extends org.telegram.ui.Components.pv0 {
    public final l20 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 C0;
    public final /* synthetic */ bj0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.D0 = bj0Var;
        this.C0 = e6Var;
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = 0;
        this.z0 = new int[2];
        this.A0 = new l20();
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f;
        this.B0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x037e, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.t1 t1Var;
        float f7;
        float f10;
        float height;
        final float f11;
        float f12;
        char c11;
        float f13;
        bj0 bj0Var = this.D0;
        int[] iArr2 = bj0Var.o0;
        Paint paint = bj0Var.T;
        Rect rect = bj0Var.u0;
        ui0 ui0Var = bj0Var.K;
        if (bj0Var.w && (t1Var = bj0Var.Q) != null && t1Var.getCurrentPosition() == null) {
            if (bj0Var.x) {
                org.telegram.ui.Components.of ofVar = bj0Var.S;
                if (ofVar != null) {
                    ofVar.setAlpha(0.0f);
                }
                bj0Var.x = false;
            }
            boolean z10 = bj0Var.Q.getMessageObject() != null && bj0Var.Q.getMessageObject().type == 15;
            float imageX = z10 ? bj0Var.Q.getPhotoImage().getImageX() : bj0Var.Q.getTextX();
            float imageY = z10 ? bj0Var.Q.getPhotoImage().getImageY() : bj0Var.Q.getTextY();
            float x10 = bj0Var.Q.getX() + ui0Var.getX() + imageX;
            float y3 = bj0Var.Q.getY() + ui0Var.getY() + imageY;
            float textSize = (bj0Var.Q.getMessageObject() != null ? bj0Var.Q.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.i6.o2).getTextSize();
            org.telegram.ui.Components.of ofVar2 = bj0Var.S;
            if (ofVar2 != null) {
                int[] iArr3 = this.w0;
                ofVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = bj0Var.S.getPaddingLeft() + iArr3[0];
                float paddingTop = (bj0Var.S.getPaddingTop() + iArr3[1]) - bj0Var.S.getScrollY();
                float textSize2 = bj0Var.S.getTextSize();
                int i10 = iArr3[1];
                f7 = imageY;
                height = bj0Var.S.getMeasuredHeight() + i10;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, bj0Var.E);
                y3 = AndroidUtilities.lerp(paddingTop, y3, bj0Var.E);
                f11 = AndroidUtilities.lerp(textSize2, textSize, bj0Var.E);
                f12 = i10;
            } else {
                f7 = imageY;
                f10 = 255.0f;
                height = getHeight();
                f11 = textSize;
                f12 = 0.0f;
            }
            float f14 = x10;
            float f15 = y3;
            float f16 = bj0Var.E;
            if (bj0Var.r0 != null) {
                f12 = bj0Var.s0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - ui0Var.getScaleY()) * ui0Var.getHeight()) + ui0Var.getY(), bj0Var.E);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, ui0Var.canScrollVertically(-1) ? 1.0f : 0.0f, bj0Var.E);
            float lerp3 = AndroidUtilities.lerp(bj0Var.r0 != null ? bj0Var.t0 : f17, ui0Var.getY() + ui0Var.getHeight(), bj0Var.E);
            float lerp4 = AndroidUtilities.lerp(0.0f, ui0Var.canScrollVertically(1) ? 1.0f : 0.0f, bj0Var.E);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (bj0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-bj0Var.S.getX()) - bj0Var.S.getPaddingLeft(), ((-bj0Var.S.getY()) - bj0Var.S.getPaddingTop()) + bj0Var.S.getScrollY());
                float alpha = bj0Var.S.getAlpha();
                bj0Var.S.setAlpha(1.0f);
                if (bj0Var.E >= 0.001f) {
                    f13 = alpha;
                } else if (bj0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, bj0Var.S.getY());
                    canvas2.saveLayerAlpha(bj0Var.S.getX() + bj0Var.S.getPaddingLeft(), 0.0f, ((bj0Var.S.getX() + bj0Var.S.getPaddingLeft()) + bj0Var.S.getWidth()) - bj0Var.S.getPaddingRight(), bj0Var.S.getHeight(), (int) org.telegram.messenger.vl.v(bj0Var.E, 0.1f, 1.0f, 255.0f), 31);
                    bj0Var.V.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.vl.v(bj0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(bj0Var.S.getPaddingLeft(), bj0Var.S.getY(), ((bj0Var.S.getX() + bj0Var.S.getPaddingLeft()) + bj0Var.S.getWidth()) - bj0Var.S.getPaddingRight(), bj0Var.S.getY() + bj0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = bj0Var.U;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.si0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            bj0 bj0Var2 = ti0.this.D0;
                            canvas3.translate(bj0Var2.S.getX(), bj0Var2.S.getY() - bj0Var2.S.getScrollY());
                            float textSize3 = f11 / bj0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, bj0Var2.S.getPaddingLeft(), bj0Var2.S.getPaddingTop());
                            bj0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                bj0Var.S.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            bj0Var.Q.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.t1 t1Var2 = bj0Var.r0;
            if (t1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, ui0Var.getScaleX(), bj0Var.E);
                canvas2.scale(lerp5, lerp5, (-bj0Var.Q.getX()) + ui0Var.getWidth(), (-bj0Var.Q.getY()) + ui0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (bj0Var.Q.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, bj0Var.Q.getPaddingTop());
                    bj0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                }
                bj0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                t1Var2.getLocationInWindow(iArr4);
                int translationY = bj0Var.r0.getParent() instanceof View ? (int) ((View) bj0Var.r0.getParent()).getTranslationY() : 0;
                int i11 = this.y0;
                int[] iArr5 = this.z0;
                if (i11 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.y0 = translationY;
                float lerp6 = AndroidUtilities.lerp(bj0Var.Q.getX() + ui0Var.getX(), iArr5[c11], 1.0f - bj0Var.E);
                float lerp7 = AndroidUtilities.lerp(bj0Var.Q.getY() + ui0Var.getY(), iArr5[1], 1.0f - bj0Var.E);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, ui0Var.getScaleX(), bj0Var.E);
                canvas2.scale(lerp8, lerp8, (-bj0Var.Q.getX()) + ui0Var.getWidth(), (-bj0Var.Q.getY()) + ui0Var.getHeight());
                bj0Var.Q.getTransitionParams().K1 = 1.0f - bj0Var.E;
                bj0Var.Q.getTransitionParams().g0 = rect.left * bj0Var.E;
                bj0Var.Q.getTransitionParams().j0 = rect.top * bj0Var.E;
                bj0Var.Q.getTransitionParams().h0 = rect.right * bj0Var.E;
                org.telegram.ui.Cells.s1 transitionParams = bj0Var.Q.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = bj0Var.E;
                transitionParams.i0 = f21 * f22;
                bj0Var.Q.setTimeAlpha(1.0f - f22);
                if (bj0Var.Q.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, bj0Var.r0.getWidth(), bj0Var.r0.getHeight(), (int) (bj0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, bj0Var.Q.getPaddingTop());
                    bj0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, bj0Var.r0.getWidth(), bj0Var.r0.getHeight(), (int) ((1.0f - bj0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, bj0Var.r0.getPaddingTop());
                    bj0Var.r0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                bj0Var.Q.draw(canvas2);
                if (bj0Var.Q.getTransitionParams().w0) {
                    bj0Var.Q.W1(canvas2, 1.0f);
                    bj0Var.Q.m2(1.0f - bj0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            l20 l20Var = this.A0;
            l20Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            l20Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (bj0Var.w) {
            if (bj0Var.y) {
                org.telegram.ui.Components.tg tgVar = bj0Var.W;
                if (tgVar != null) {
                    tgVar.setAlpha(0.0f);
                }
                c10 = 0;
                bj0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i12 = iArr[c10];
            int width = bj0Var.X.getWidth();
            bj0Var.X.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - r4.m())), bj0Var.X.getX(), bj0Var.E), AndroidUtilities.lerp(iArr[1], bj0Var.X.getY(), bj0Var.E));
            if (bj0Var.v && bj0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, bj0Var.X.getWidth(), bj0Var.X.getHeight(), (int) (bj0Var.E * 255.0f), 31);
            }
            bj0Var.X.draw(canvas2);
            if (bj0Var.v && bj0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (bj0Var.l0 != null) {
            if (bj0Var.J == null) {
                bj0Var.J = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((bj0Var.l0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((bj0Var.l0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (bj0Var.l0.right - AndroidUtilities.dp(12.0f)), (int) (bj0Var.l0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (bj0Var.J.e() * 30.0f * bj0Var.E));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            bj0Var.J.setBounds(rect2);
            org.telegram.ui.Components.m5 m5Var = bj0Var.J;
            m5Var.v = (int) (bj0Var.E * 255.0f);
            m5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bj0 bj0Var = this.D0;
        if (bj0Var.w) {
            if (view == bj0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.t1 t1Var = bj0Var.Q;
            if (view == t1Var && t1Var != null && t1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
