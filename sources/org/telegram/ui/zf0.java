package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zf0 extends org.telegram.ui.Components.st0 {
    public final int[] f0;
    public final int[] g0;
    public int h0;
    public final int[] i0;
    public final h6.m j0;
    public final Paint k0;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 l0;
    public final /* synthetic */ eg0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(eg0 eg0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null);
        this.m0 = eg0Var;
        this.l0 = h6Var;
        this.f0 = new int[2];
        this.g0 = new int[2];
        this.h0 = 0;
        this.i0 = new int[2];
        this.j0 = new h6.m(28);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f;
        this.k0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x03db, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L113;
     */
    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.q1 q1Var;
        TextPaint textPaint;
        float f10;
        int i7;
        boolean z9;
        float f11;
        float height;
        final float f12;
        float f13;
        float f14;
        float f15;
        char c11;
        float f16;
        eg0 eg0Var = this.m0;
        int[] iArr2 = eg0Var.n0;
        Paint paint = eg0Var.S;
        Rect rect = eg0Var.t0;
        ag0 ag0Var = eg0Var.J;
        if (eg0Var.w && (q1Var = eg0Var.P) != null && q1Var.getCurrentPosition() == null) {
            if (eg0Var.x) {
                org.telegram.ui.Components.we weVar = eg0Var.R;
                if (weVar != null) {
                    weVar.setAlpha(0.0f);
                }
                eg0Var.x = false;
            }
            boolean z10 = eg0Var.P.getMessageObject() != null && eg0Var.P.getMessageObject().D == 15;
            float textX = z10 ? eg0Var.P.getPhotoImage().K0 : eg0Var.P.getTextX();
            float textY = z10 ? eg0Var.P.getPhotoImage().L0 : eg0Var.P.getTextY();
            float x10 = eg0Var.P.getX() + ag0Var.getX() + textX;
            float y10 = eg0Var.P.getY() + ag0Var.getY() + textY;
            if (eg0Var.P.getMessageObject() != null) {
                org.telegram.messenger.ij messageObject = eg0Var.P.getMessageObject();
                if (messageObject.N1 >= 1 && messageObject.k != null && !messageObject.u2()) {
                    int i10 = messageObject.N1;
                    int i11 = messageObject.O1;
                    boolean z11 = i10 == i11;
                    switch (Math.max(i10, i11)) {
                        case 0:
                        case 1:
                        case 2:
                            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.m6.y2;
                            if (!z11) {
                                textPaint = textPaintArr[2];
                                break;
                            } else {
                                textPaint = textPaintArr[0];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.m6.y2;
                            if (!z11) {
                                textPaint = textPaintArr2[3];
                                break;
                            } else {
                                textPaint = textPaintArr2[1];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.m6.y2;
                            if (!z11) {
                                textPaint = textPaintArr3[4];
                                break;
                            } else {
                                textPaint = textPaintArr3[2];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.m6.y2;
                            if (!z11) {
                                textPaint = textPaintArr4[5];
                                break;
                            } else {
                                textPaint = textPaintArr4[3];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.m6.y2;
                            if (!z11) {
                                textPaint = textPaintArr5[5];
                                break;
                            } else {
                                textPaint = textPaintArr5[4];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.m6.y2[5];
                            break;
                    }
                } else {
                    textPaint = org.telegram.ui.ActionBar.m6.o2;
                }
            } else {
                textPaint = org.telegram.ui.ActionBar.m6.o2;
            }
            float textSize = textPaint.getTextSize();
            org.telegram.ui.Components.we weVar2 = eg0Var.R;
            if (weVar2 != null) {
                z9 = false;
                int[] iArr3 = this.f0;
                weVar2.getLocationOnScreen(iArr3);
                f11 = 255.0f;
                float paddingLeft = eg0Var.R.getPaddingLeft() + iArr3[0];
                i7 = 1;
                float paddingTop = (eg0Var.R.getPaddingTop() + iArr3[1]) - eg0Var.R.getScrollY();
                float textSize2 = eg0Var.R.getTextSize();
                int i12 = iArr3[1];
                f10 = textY;
                height = eg0Var.R.getMeasuredHeight() + i12;
                float T1 = org.telegram.messenger.g0.T1(paddingLeft, x10, eg0Var.D);
                float T12 = org.telegram.messenger.g0.T1(paddingTop, y10, eg0Var.D);
                f12 = org.telegram.messenger.g0.T1(textSize2, textSize, eg0Var.D);
                f13 = i12;
                f15 = T12;
                f14 = T1;
            } else {
                f10 = textY;
                i7 = 1;
                z9 = false;
                f11 = 255.0f;
                height = getHeight();
                f12 = textSize;
                f13 = 0.0f;
                f14 = x10;
                f15 = y10;
            }
            float f17 = eg0Var.D;
            if (eg0Var.q0 != null) {
                f13 = eg0Var.r0;
            }
            float T13 = org.telegram.messenger.g0.T1(f13, ((1.0f - ag0Var.getScaleY()) * ag0Var.getHeight()) + ag0Var.getY(), eg0Var.D);
            float f18 = height;
            float T14 = org.telegram.messenger.g0.T1(0.0f, ag0Var.canScrollVertically(-1) ? 1.0f : 0.0f, eg0Var.D);
            float T15 = org.telegram.messenger.g0.T1(eg0Var.q0 != null ? eg0Var.s0 : f18, ag0Var.getY() + ag0Var.getHeight(), eg0Var.D);
            float T16 = org.telegram.messenger.g0.T1(0.0f, ag0Var.canScrollVertically(i7) ? 1.0f : 0.0f, eg0Var.D);
            float f19 = textX;
            iArr = iArr2;
            float f20 = f10;
            canvas.saveLayerAlpha(0.0f, T13 + 1.0f, getWidth(), T15 - 1.0f, org.telegram.messenger.qs.e4, 31);
            if (eg0Var.R != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f17) * f11), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-eg0Var.R.getX()) - eg0Var.R.getPaddingLeft(), ((-eg0Var.R.getY()) - eg0Var.R.getPaddingTop()) + eg0Var.R.getScrollY());
                float alpha = eg0Var.R.getAlpha();
                eg0Var.R.setAlpha(1.0f);
                if (eg0Var.D >= 0.001f) {
                    f16 = alpha;
                } else if (eg0Var.U != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, eg0Var.R.getY());
                    canvas2.saveLayerAlpha(eg0Var.R.getX() + eg0Var.R.getPaddingLeft(), 0.0f, ((eg0Var.R.getX() + eg0Var.R.getPaddingLeft()) + eg0Var.R.getWidth()) - eg0Var.R.getPaddingRight(), eg0Var.R.getHeight(), (int) org.telegram.messenger.camera.q.x(eg0Var.D, 0.1f, 1.0f, f11), 31);
                    eg0Var.U.a(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f16 = alpha;
                } else {
                    f16 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ge, this.l0));
                    paint.setAlpha((int) org.telegram.messenger.camera.q.x(eg0Var.D, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(eg0Var.R.getPaddingLeft(), eg0Var.R.getY(), ((eg0Var.R.getX() + eg0Var.R.getPaddingLeft()) + eg0Var.R.getWidth()) - eg0Var.R.getPaddingRight(), eg0Var.R.getY() + eg0Var.R.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = eg0Var.T;
                if (dVar != null) {
                    dVar.a(canvas2, new org.telegram.messenger.u10() { // from class: org.telegram.ui.yf0
                        @Override // org.telegram.messenger.u10
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            eg0 eg0Var2 = zf0.this.m0;
                            canvas3.translate(eg0Var2.R.getX(), eg0Var2.R.getY() - eg0Var2.R.getScrollY());
                            float textSize3 = f12 / eg0Var2.R.getTextSize();
                            canvas3.scale(textSize3, textSize3, eg0Var2.R.getPaddingLeft(), eg0Var2.R.getPaddingTop());
                            eg0Var2.R.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                eg0Var.R.setAlpha(f16);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            eg0Var.P.getTransitionParams().y0 = true;
            org.telegram.ui.Cells.q1 q1Var2 = eg0Var.q0;
            if (q1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f17 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f19, -f20);
                float T17 = org.telegram.messenger.g0.T1(1.0f, ag0Var.getScaleX(), eg0Var.D);
                canvas2.scale(T17, T17, (-eg0Var.P.getX()) + ag0Var.getWidth(), (-eg0Var.P.getY()) + ag0Var.getHeight());
                float f21 = f12 / textSize;
                canvas2.scale(f21, f21, f19, f20);
                if (eg0Var.P.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, eg0Var.P.getPaddingTop());
                    eg0Var.P.M0(canvas2, true, z9);
                    canvas2.restore();
                }
                eg0Var.P.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.g0;
                q1Var2.getLocationInWindow(iArr4);
                int translationY = eg0Var.q0.getParent() instanceof View ? (int) ((View) eg0Var.q0.getParent()).getTranslationY() : 0;
                int i13 = this.h0;
                int[] iArr5 = this.i0;
                if (i13 > translationY) {
                    c11 = 0;
                } else {
                    c11 = 0;
                }
                iArr5[c11] = iArr4[c11];
                iArr5[1] = iArr4[1];
                this.h0 = translationY;
                float T18 = org.telegram.messenger.g0.T1(eg0Var.P.getX() + ag0Var.getX(), iArr5[c11], 1.0f - eg0Var.D);
                float T19 = org.telegram.messenger.g0.T1(eg0Var.P.getY() + ag0Var.getY(), iArr5[1], 1.0f - eg0Var.D);
                canvas2.save();
                canvas2.translate(T18, T19);
                float T110 = org.telegram.messenger.g0.T1(1.0f, ag0Var.getScaleX(), eg0Var.D);
                canvas2.scale(T110, T110, (-eg0Var.P.getX()) + ag0Var.getWidth(), (-eg0Var.P.getY()) + ag0Var.getHeight());
                eg0Var.P.getTransitionParams().L1 = 1.0f - eg0Var.D;
                eg0Var.P.getTransitionParams().h0 = rect.left * eg0Var.D;
                eg0Var.P.getTransitionParams().k0 = rect.top * eg0Var.D;
                eg0Var.P.getTransitionParams().i0 = rect.right * eg0Var.D;
                org.telegram.ui.Cells.x1 transitionParams = eg0Var.P.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = eg0Var.D;
                transitionParams.j0 = f22 * f23;
                eg0Var.P.setTimeAlpha(1.0f - f23);
                if (eg0Var.P.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, eg0Var.q0.getWidth(), eg0Var.q0.getHeight(), (int) (eg0Var.D * 255.0f), 31);
                    canvas2.translate(0.0f, eg0Var.P.getPaddingTop());
                    eg0Var.P.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, eg0Var.q0.getWidth(), eg0Var.q0.getHeight(), (int) ((1.0f - eg0Var.D) * 255.0f), 31);
                    canvas2.translate(0.0f, eg0Var.q0.getPaddingTop());
                    eg0Var.q0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                eg0Var.P.draw(canvas2);
                if (eg0Var.P.getTransitionParams().x0) {
                    eg0Var.P.h1(canvas2, 1.0f);
                    eg0Var.P.x1(1.0f - eg0Var.D, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, T13, getWidth(), org.telegram.messenger.g0.L(14.0f) + T13);
            h6.m mVar = this.j0;
            mVar.m(canvas2, rectF, 1, T14);
            rectF.set(0.0f, T15 - org.telegram.messenger.g0.L(14.0f), getWidth(), T15);
            mVar.m(canvas2, rectF, 3, T16);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (eg0Var.w) {
            if (eg0Var.y) {
                org.telegram.ui.Components.cg cgVar = eg0Var.V;
                if (cgVar != null) {
                    cgVar.setAlpha(0.0f);
                }
                c10 = 0;
                eg0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i14 = iArr[c10];
            int width = eg0Var.W.getWidth();
            eg0Var.W.getHeight();
            canvas2.translate(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(6.0f) + (i14 - (width - r4.m())), eg0Var.W.getX(), eg0Var.D), org.telegram.messenger.g0.T1(iArr[1], eg0Var.W.getY(), eg0Var.D));
            if (eg0Var.s && eg0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, eg0Var.W.getWidth(), eg0Var.W.getHeight(), (int) (eg0Var.D * 255.0f), 31);
            }
            eg0Var.W.draw(canvas2);
            if (eg0Var.s && eg0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (eg0Var.k0 != null) {
            if (eg0Var.I == null) {
                eg0Var.I = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), 23, this, false);
            }
            Rect rect2 = org.telegram.messenger.g0.Q;
            rect2.set((int) ((eg0Var.k0.right - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) ((eg0Var.k0.bottom - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) (eg0Var.k0.right - org.telegram.messenger.g0.L(12.0f)), (int) (eg0Var.k0.bottom - org.telegram.messenger.g0.L(12.0f)));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rect2);
            rectF2.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.k0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (eg0Var.I.e() * 30.0f * eg0Var.D));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            eg0Var.I.setBounds(rect2);
            org.telegram.ui.Components.f5 f5Var = eg0Var.I;
            f5Var.w = (int) (eg0Var.D * 255.0f);
            f5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        eg0 eg0Var = this.m0;
        if (eg0Var.w) {
            if (view == eg0Var.W) {
                return false;
            }
            org.telegram.ui.Cells.q1 q1Var = eg0Var.P;
            if (view == q1Var && q1Var != null && q1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
