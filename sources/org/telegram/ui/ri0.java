package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ri0 extends org.telegram.ui.Components.mw0 {
    public final k20 A0;
    public final Paint B0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 C0;
    public final /* synthetic */ zi0 D0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(zi0 zi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = zi0Var;
        this.C0 = d6Var;
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = 0;
        this.z0 = new int[2];
        this.A0 = new k20();
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.f;
        this.B0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x037e, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L81;
     */
    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
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
        zi0 zi0Var = this.D0;
        int[] iArr2 = zi0Var.o0;
        Paint paint = zi0Var.T;
        Rect rect = zi0Var.u0;
        si0 si0Var = zi0Var.K;
        if (zi0Var.w && (u1Var = zi0Var.Q) != null && u1Var.getCurrentPosition() == null) {
            if (zi0Var.x) {
                org.telegram.ui.Components.rf rfVar = zi0Var.S;
                if (rfVar != null) {
                    rfVar.setAlpha(0.0f);
                }
                zi0Var.x = false;
            }
            boolean z10 = zi0Var.Q.getMessageObject() != null && zi0Var.Q.getMessageObject().type == 15;
            float imageX = z10 ? zi0Var.Q.getPhotoImage().getImageX() : zi0Var.Q.getTextX();
            float imageY = z10 ? zi0Var.Q.getPhotoImage().getImageY() : zi0Var.Q.getTextY();
            float x10 = zi0Var.Q.getX() + si0Var.getX() + imageX;
            float y3 = zi0Var.Q.getY() + si0Var.getY() + imageY;
            float textSize = (zi0Var.Q.getMessageObject() != null ? zi0Var.Q.getMessageObject().getTextPaint() : org.telegram.ui.ActionBar.i6.o2).getTextSize();
            org.telegram.ui.Components.rf rfVar2 = zi0Var.S;
            if (rfVar2 != null) {
                int[] iArr3 = this.w0;
                rfVar2.getLocationOnScreen(iArr3);
                f10 = 255.0f;
                float paddingLeft = zi0Var.S.getPaddingLeft() + iArr3[0];
                float paddingTop = (zi0Var.S.getPaddingTop() + iArr3[1]) - zi0Var.S.getScrollY();
                float textSize2 = zi0Var.S.getTextSize();
                int i10 = iArr3[1];
                f7 = imageY;
                height = zi0Var.S.getMeasuredHeight() + i10;
                x10 = AndroidUtilities.lerp(paddingLeft, x10, zi0Var.E);
                y3 = AndroidUtilities.lerp(paddingTop, y3, zi0Var.E);
                f11 = AndroidUtilities.lerp(textSize2, textSize, zi0Var.E);
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
            float f16 = zi0Var.E;
            if (zi0Var.r0 != null) {
                f12 = zi0Var.s0;
            }
            float lerp = AndroidUtilities.lerp(f12, ((1.0f - si0Var.getScaleY()) * si0Var.getHeight()) + si0Var.getY(), zi0Var.E);
            float f17 = height;
            float lerp2 = AndroidUtilities.lerp(0.0f, si0Var.canScrollVertically(-1) ? 1.0f : 0.0f, zi0Var.E);
            float lerp3 = AndroidUtilities.lerp(zi0Var.r0 != null ? zi0Var.t0 : f17, si0Var.getY() + si0Var.getHeight(), zi0Var.E);
            float lerp4 = AndroidUtilities.lerp(0.0f, si0Var.canScrollVertically(1) ? 1.0f : 0.0f, zi0Var.E);
            float f18 = imageX;
            iArr = iArr2;
            float f19 = f7;
            canvas.saveLayerAlpha(0.0f, lerp + 1.0f, getWidth(), lerp3 - 1.0f, 255, 31);
            if (zi0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f16) * f10), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-zi0Var.S.getX()) - zi0Var.S.getPaddingLeft(), ((-zi0Var.S.getY()) - zi0Var.S.getPaddingTop()) + zi0Var.S.getScrollY());
                float alpha = zi0Var.S.getAlpha();
                zi0Var.S.setAlpha(1.0f);
                if (zi0Var.E >= 0.001f) {
                    f13 = alpha;
                } else if (zi0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, zi0Var.S.getY());
                    canvas2.saveLayerAlpha(zi0Var.S.getX() + zi0Var.S.getPaddingLeft(), 0.0f, ((zi0Var.S.getX() + zi0Var.S.getPaddingLeft()) + zi0Var.S.getWidth()) - zi0Var.S.getPaddingRight(), zi0Var.S.getHeight(), (int) org.telegram.messenger.bi.x(zi0Var.E, 0.1f, 1.0f, 255.0f), 31);
                    zi0Var.V.run(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f13 = alpha;
                } else {
                    f13 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sd, this.C0));
                    paint.setAlpha((int) org.telegram.messenger.bi.x(zi0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(zi0Var.S.getPaddingLeft(), zi0Var.S.getY(), ((zi0Var.S.getX() + zi0Var.S.getPaddingLeft()) + zi0Var.S.getWidth()) - zi0Var.S.getPaddingRight(), zi0Var.S.getY() + zi0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = zi0Var.U;
                if (dVar != null) {
                    dVar.run(canvas2, new Utilities.Callback0Return() { // from class: org.telegram.ui.qi0
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            zi0 zi0Var2 = ri0.this.D0;
                            canvas3.translate(zi0Var2.S.getX(), zi0Var2.S.getY() - zi0Var2.S.getScrollY());
                            float textSize3 = f11 / zi0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, zi0Var2.S.getPaddingLeft(), zi0Var2.S.getPaddingTop());
                            zi0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                zi0Var.S.setAlpha(f13);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            zi0Var.Q.getTransitionParams().x0 = true;
            org.telegram.ui.Cells.u1 u1Var2 = zi0Var.r0;
            if (u1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f16 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f18, -f19);
                float lerp5 = AndroidUtilities.lerp(1.0f, si0Var.getScaleX(), zi0Var.E);
                canvas2.scale(lerp5, lerp5, (-zi0Var.Q.getX()) + si0Var.getWidth(), (-zi0Var.Q.getY()) + si0Var.getHeight());
                float f20 = f11 / textSize;
                canvas2.scale(f20, f20, f18, f19);
                if (zi0Var.Q.C1()) {
                    canvas2.save();
                    canvas2.translate(0.0f, zi0Var.Q.getPaddingTop());
                    zi0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                }
                zi0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.x0;
                u1Var2.getLocationInWindow(iArr4);
                int translationY = zi0Var.r0.getParent() instanceof View ? (int) ((View) zi0Var.r0.getParent()).getTranslationY() : 0;
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
                float lerp6 = AndroidUtilities.lerp(zi0Var.Q.getX() + si0Var.getX(), iArr5[c11], 1.0f - zi0Var.E);
                float lerp7 = AndroidUtilities.lerp(zi0Var.Q.getY() + si0Var.getY(), iArr5[1], 1.0f - zi0Var.E);
                canvas2.save();
                canvas2.translate(lerp6, lerp7);
                float lerp8 = AndroidUtilities.lerp(1.0f, si0Var.getScaleX(), zi0Var.E);
                canvas2.scale(lerp8, lerp8, (-zi0Var.Q.getX()) + si0Var.getWidth(), (-zi0Var.Q.getY()) + si0Var.getHeight());
                zi0Var.Q.getTransitionParams().K1 = 1.0f - zi0Var.E;
                zi0Var.Q.getTransitionParams().g0 = rect.left * zi0Var.E;
                zi0Var.Q.getTransitionParams().j0 = rect.top * zi0Var.E;
                zi0Var.Q.getTransitionParams().h0 = rect.right * zi0Var.E;
                org.telegram.ui.Cells.t1 transitionParams = zi0Var.Q.getTransitionParams();
                float f21 = rect.bottom;
                float f22 = zi0Var.E;
                transitionParams.i0 = f21 * f22;
                zi0Var.Q.setTimeAlpha(1.0f - f22);
                if (zi0Var.Q.C1()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, zi0Var.r0.getWidth(), zi0Var.r0.getHeight(), (int) (zi0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, zi0Var.Q.getPaddingTop());
                    zi0Var.Q.D1(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, zi0Var.r0.getWidth(), zi0Var.r0.getHeight(), (int) ((1.0f - zi0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, zi0Var.r0.getPaddingTop());
                    zi0Var.r0.D1(canvas2, true, false);
                    canvas2.restore();
                }
                zi0Var.Q.draw(canvas2);
                if (zi0Var.Q.getTransitionParams().w0) {
                    zi0Var.Q.W1(canvas2, 1.0f);
                    zi0Var.Q.m2(1.0f - zi0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + lerp);
            k20 k20Var = this.A0;
            k20Var.b(canvas2, rectF, 1, lerp2);
            rectF.set(0.0f, lerp3 - AndroidUtilities.dp(14.0f), getWidth(), lerp3);
            k20Var.b(canvas2, rectF, 3, lerp4);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (zi0Var.w) {
            if (zi0Var.y) {
                org.telegram.ui.Components.wg wgVar = zi0Var.W;
                if (wgVar != null) {
                    wgVar.setAlpha(0.0f);
                }
                c10 = 0;
                zi0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i12 = iArr[c10];
            int width = zi0Var.X.getWidth();
            zi0Var.X.getHeight();
            canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i12 - (width - r4.m())), zi0Var.X.getX(), zi0Var.E), AndroidUtilities.lerp(iArr[1], zi0Var.X.getY(), zi0Var.E));
            if (zi0Var.v && zi0Var.s) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, zi0Var.X.getWidth(), zi0Var.X.getHeight(), (int) (zi0Var.E * 255.0f), 31);
            }
            zi0Var.X.draw(canvas2);
            if (zi0Var.v && zi0Var.s) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (zi0Var.l0 != null) {
            if (zi0Var.J == null) {
                zi0Var.J = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 23, this, false);
            }
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) ((zi0Var.l0.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((zi0Var.l0.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (zi0Var.l0.right - AndroidUtilities.dp(12.0f)), (int) (zi0Var.l0.bottom - AndroidUtilities.dp(12.0f)));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.B0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (zi0Var.J.e() * 30.0f * zi0Var.E));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            zi0Var.J.setBounds(rect2);
            org.telegram.ui.Components.o5 o5Var = zi0Var.J;
            o5Var.v = (int) (zi0Var.E * 255.0f);
            o5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zi0 zi0Var = this.D0;
        if (zi0Var.w) {
            if (view == zi0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.u1 u1Var = zi0Var.Q;
            if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
