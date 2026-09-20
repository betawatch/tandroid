package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vi0 extends org.telegram.ui.Components.aw0 {
    public final l20 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 C0;
    public final /* synthetic */ dj0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.D0 = dj0Var;
        this.C0 = f6Var;
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
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.u1 u1Var;
        float f7;
        float f10;
        float height;
        final float f11;
        float f12;
        char c11;
        float f13;
        dj0 dj0Var = this.D0;
        int[] iArr2 = dj0Var.o0;
        Paint paint = dj0Var.T;
        Rect rect = dj0Var.u0;
        wi0 wi0Var = dj0Var.K;
        if (dj0Var.w && (u1Var = dj0Var.Q) != null && u1Var.getCurrentPosition() == null) {
            if (dj0Var.x) {
                org.telegram.ui.Components.pf pfVar = dj0Var.S;
                if (pfVar != null) {
                    pfVar.setAlpha(0.0f);
                }
                dj0Var.x = false;
            }
            boolean z10 = dj0Var.Q.getMessageObject() != null && dj0Var.Q.getMessageObject().type == 15;
            float imageX = z10 ? dj0Var.Q.getPhotoImage().getImageX() : dj0Var.Q.getTextX();
            float imageY = z10 ? dj0Var.Q.getPhotoImage().getImageY() : dj0Var.Q.getTextY();
            float x10 = dj0Var.Q.getX() + wi0Var.getX() + imageX;
            float y3 = dj0Var.Q.getY() + wi0Var.getY() + imageY;
            float textSize = (dj0Var.Q.getMessageObject() != null ? dj0Var.Q.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.j6.o2).getTextSize();
            org.telegram.ui.Components.pf pfVar2 = dj0Var.S;
            if (pfVar2 != null) {
                int[] iArr3 = this.w0;
                pfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = dj0Var.S.getPaddingLeft() + iArr3[0];
                float paddingTop = (dj0Var.S.getPaddingTop() + iArr3[1]) - dj0Var.S.getScrollY();
                float textSize2 = dj0Var.S.getTextSize();
                int i10 = iArr3[1];
                f7 = imageY;
                height = dj0Var.S.getMeasuredHeight() + i10;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, dj0Var.E);
                y3 = AndroidUtilities.lerp(paddingTop, y3, dj0Var.E);
                f11 = AndroidUtilities.lerp(textSize2, textSize, dj0Var.E);
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
            float f16 = dj0Var.E;
            if (dj0Var.r0 != null) {
                f12 = dj0Var.s0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - wi0Var.getScaleY()) * wi0Var.getHeight()) + wi0Var.getY(), dj0Var.E);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, wi0Var.canScrollVertically(-1) ? 1.0f : 0.0f, dj0Var.E);
            float lerp3 = AndroidUtilities.lerp(dj0Var.r0 != null ? dj0Var.t0 : f17, wi0Var.getY() + wi0Var.getHeight(), dj0Var.E);
            float lerp4 = AndroidUtilities.lerp(0.0f, wi0Var.canScrollVertically(1) ? 1.0f : 0.0f, dj0Var.E);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (dj0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-dj0Var.S.getX()) - dj0Var.S.getPaddingLeft(), ((-dj0Var.S.getY()) - dj0Var.S.getPaddingTop()) + dj0Var.S.getScrollY());
                float alpha = dj0Var.S.getAlpha();
                dj0Var.S.setAlpha(1.0f);
                if (dj0Var.E >= 0.001f) {
                    f13 = alpha;
                } else if (dj0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, dj0Var.S.getY());
                    canvas2.saveLayerAlpha(dj0Var.S.getX() + dj0Var.S.getPaddingLeft(), 0.0f, ((dj0Var.S.getX() + dj0Var.S.getPaddingLeft()) + dj0Var.S.getWidth()) - dj0Var.S.getPaddingRight(), dj0Var.S.getHeight(), (int) org.telegram.messenger.rk.w(dj0Var.E, 0.1f, 1.0f, 255.0f), 31);
                    dj0Var.V.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.rk.w(dj0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(dj0Var.S.getPaddingLeft(), dj0Var.S.getY(), ((dj0Var.S.getX() + dj0Var.S.getPaddingLeft()) + dj0Var.S.getWidth()) - dj0Var.S.getPaddingRight(), dj0Var.S.getY() + dj0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = dj0Var.U;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.ui0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            dj0 dj0Var2 = vi0.this.D0;
                            canvas3.translate(dj0Var2.S.getX(), dj0Var2.S.getY() - dj0Var2.S.getScrollY());
                            float textSize3 = f11 / dj0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, dj0Var2.S.getPaddingLeft(), dj0Var2.S.getPaddingTop());
                            dj0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                dj0Var.S.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            dj0Var.Q.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.u1 u1Var2 = dj0Var.r0;
            if (u1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, wi0Var.getScaleX(), dj0Var.E);
                canvas2.scale(lerp5, lerp5, (-dj0Var.Q.getX()) + wi0Var.getWidth(), (-dj0Var.Q.getY()) + wi0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (dj0Var.Q.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, dj0Var.Q.getPaddingTop());
                    dj0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                }
                dj0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                u1Var2.getLocationInWindow(iArr4);
                int translationY = dj0Var.r0.getParent() instanceof View ? (int) ((View) dj0Var.r0.getParent()).getTranslationY() : 0;
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
                float lerp6 = AndroidUtilities.lerp(dj0Var.Q.getX() + wi0Var.getX(), iArr5[c11], 1.0f - dj0Var.E);
                float lerp7 = AndroidUtilities.lerp(dj0Var.Q.getY() + wi0Var.getY(), iArr5[1], 1.0f - dj0Var.E);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, wi0Var.getScaleX(), dj0Var.E);
                canvas2.scale(lerp8, lerp8, (-dj0Var.Q.getX()) + wi0Var.getWidth(), (-dj0Var.Q.getY()) + wi0Var.getHeight());
                dj0Var.Q.getTransitionParams().K1 = 1.0f - dj0Var.E;
                dj0Var.Q.getTransitionParams().g0 = rect.left * dj0Var.E;
                dj0Var.Q.getTransitionParams().j0 = rect.top * dj0Var.E;
                dj0Var.Q.getTransitionParams().h0 = rect.right * dj0Var.E;
                org.telegram.ui.Cells.t1 transitionParams = dj0Var.Q.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = dj0Var.E;
                transitionParams.i0 = f21 * f22;
                dj0Var.Q.setTimeAlpha(1.0f - f22);
                if (dj0Var.Q.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, dj0Var.r0.getWidth(), dj0Var.r0.getHeight(), (int) (dj0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, dj0Var.Q.getPaddingTop());
                    dj0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, dj0Var.r0.getWidth(), dj0Var.r0.getHeight(), (int) ((1.0f - dj0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, dj0Var.r0.getPaddingTop());
                    dj0Var.r0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                dj0Var.Q.draw(canvas2);
                if (dj0Var.Q.getTransitionParams().w0) {
                    dj0Var.Q.W1(canvas2, 1.0f);
                    dj0Var.Q.m2(1.0f - dj0Var.E, canvas2, true);
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
        if (dj0Var.w) {
            if (dj0Var.y) {
                org.telegram.ui.Components.ug ugVar = dj0Var.W;
                if (ugVar != null) {
                    ugVar.setAlpha(0.0f);
                }
                c10 = 0;
                dj0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i12 = iArr[c10];
            int width = dj0Var.X.getWidth();
            dj0Var.X.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - r4.m())), dj0Var.X.getX(), dj0Var.E), AndroidUtilities.lerp(iArr[1], dj0Var.X.getY(), dj0Var.E));
            if (dj0Var.v && dj0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, dj0Var.X.getWidth(), dj0Var.X.getHeight(), (int) (dj0Var.E * 255.0f), 31);
            }
            dj0Var.X.draw(canvas2);
            if (dj0Var.v && dj0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (dj0Var.l0 != null) {
            if (dj0Var.J == null) {
                dj0Var.J = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((dj0Var.l0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((dj0Var.l0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (dj0Var.l0.right - AndroidUtilities.dp(12.0f)), (int) (dj0Var.l0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (dj0Var.J.e() * 30.0f * dj0Var.E));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            dj0Var.J.setBounds(rect2);
            org.telegram.ui.Components.n5 n5Var = dj0Var.J;
            n5Var.v = (int) (dj0Var.E * 255.0f);
            n5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dj0 dj0Var = this.D0;
        if (dj0Var.w) {
            if (view == dj0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.u1 u1Var = dj0Var.Q;
            if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
