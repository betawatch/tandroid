package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qf0 extends org.telegram.ui.Components.qt0 {
    public final int[] g0;
    public final int[] h0;
    public int i0;
    public final int[] j0;
    public final k4.j k0;
    public final Paint l0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 m0;
    public final /* synthetic */ vf0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(vf0 vf0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.n0 = vf0Var;
        this.m0 = e6Var;
        this.g0 = new int[2];
        this.h0 = new int[2];
        this.i0 = 0;
        this.j0 = new int[2];
        this.k0 = new k4.j(24);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
        this.l0 = new Paint(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x03db, code lost:
    
        if ((r5[1] - r3[1]) > r4) goto L113;
     */
    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        int[] iArr;
        char c2;
        org.telegram.ui.Cells.q1 q1Var;
        TextPaint textPaint;
        float f10;
        int i3;
        boolean z10;
        float f11;
        float height;
        final float f12;
        float f13;
        float f14;
        float f15;
        char c10;
        float f16;
        vf0 vf0Var = this.n0;
        int[] iArr2 = vf0Var.o0;
        Paint paint = vf0Var.T;
        Rect rect = vf0Var.u0;
        rf0 rf0Var = vf0Var.K;
        if (vf0Var.w && (q1Var = vf0Var.Q) != null && q1Var.getCurrentPosition() == null) {
            if (vf0Var.x) {
                org.telegram.ui.Components.ve veVar = vf0Var.S;
                if (veVar != null) {
                    veVar.setAlpha(0.0f);
                }
                vf0Var.x = false;
            }
            boolean z11 = vf0Var.Q.getMessageObject() != null && vf0Var.Q.getMessageObject().D == 15;
            float textX = z11 ? vf0Var.Q.getPhotoImage().L0 : vf0Var.Q.getTextX();
            float textY = z11 ? vf0Var.Q.getPhotoImage().M0 : vf0Var.Q.getTextY();
            float x10 = vf0Var.Q.getX() + rf0Var.getX() + textX;
            float y9 = vf0Var.Q.getY() + rf0Var.getY() + textY;
            if (vf0Var.Q.getMessageObject() != null) {
                org.telegram.messenger.zi messageObject = vf0Var.Q.getMessageObject();
                if (messageObject.N1 >= 1 && messageObject.k != null && !messageObject.v2()) {
                    int i10 = messageObject.N1;
                    int i11 = messageObject.O1;
                    boolean z12 = i10 == i11;
                    switch (Math.max(i10, i11)) {
                        case 0:
                        case 1:
                        case 2:
                            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.y2;
                            if (!z12) {
                                textPaint = textPaintArr[2];
                                break;
                            } else {
                                textPaint = textPaintArr[0];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.y2;
                            if (!z12) {
                                textPaint = textPaintArr2[3];
                                break;
                            } else {
                                textPaint = textPaintArr2[1];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.k6.y2;
                            if (!z12) {
                                textPaint = textPaintArr3[4];
                                break;
                            } else {
                                textPaint = textPaintArr3[2];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.k6.y2;
                            if (!z12) {
                                textPaint = textPaintArr4[5];
                                break;
                            } else {
                                textPaint = textPaintArr4[3];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.k6.y2;
                            if (!z12) {
                                textPaint = textPaintArr5[5];
                                break;
                            } else {
                                textPaint = textPaintArr5[4];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.k6.y2[5];
                            break;
                    }
                } else {
                    textPaint = org.telegram.ui.ActionBar.k6.o2;
                }
            } else {
                textPaint = org.telegram.ui.ActionBar.k6.o2;
            }
            float textSize = textPaint.getTextSize();
            org.telegram.ui.Components.ve veVar2 = vf0Var.S;
            if (veVar2 != null) {
                z10 = false;
                int[] iArr3 = this.g0;
                veVar2.getLocationOnScreen(iArr3);
                f11 = 255.0f;
                float paddingLeft = vf0Var.S.getPaddingLeft() + iArr3[0];
                i3 = 1;
                float paddingTop = (vf0Var.S.getPaddingTop() + iArr3[1]) - vf0Var.S.getScrollY();
                float textSize2 = vf0Var.S.getTextSize();
                int i12 = iArr3[1];
                f10 = textY;
                height = vf0Var.S.getMeasuredHeight() + i12;
                float T1 = org.telegram.messenger.g0.T1(paddingLeft, x10, vf0Var.E);
                float T12 = org.telegram.messenger.g0.T1(paddingTop, y9, vf0Var.E);
                f12 = org.telegram.messenger.g0.T1(textSize2, textSize, vf0Var.E);
                f13 = i12;
                f15 = T12;
                f14 = T1;
            } else {
                f10 = textY;
                i3 = 1;
                z10 = false;
                f11 = 255.0f;
                height = getHeight();
                f12 = textSize;
                f13 = 0.0f;
                f14 = x10;
                f15 = y9;
            }
            float f17 = vf0Var.E;
            if (vf0Var.r0 != null) {
                f13 = vf0Var.s0;
            }
            float T13 = org.telegram.messenger.g0.T1(f13, ((1.0f - rf0Var.getScaleY()) * rf0Var.getHeight()) + rf0Var.getY(), vf0Var.E);
            float f18 = height;
            float T14 = org.telegram.messenger.g0.T1(0.0f, rf0Var.canScrollVertically(-1) ? 1.0f : 0.0f, vf0Var.E);
            float T15 = org.telegram.messenger.g0.T1(vf0Var.r0 != null ? vf0Var.t0 : f18, rf0Var.getY() + rf0Var.getHeight(), vf0Var.E);
            float T16 = org.telegram.messenger.g0.T1(0.0f, rf0Var.canScrollVertically(i3) ? 1.0f : 0.0f, vf0Var.E);
            float f19 = textX;
            iArr = iArr2;
            float f20 = f10;
            canvas.saveLayerAlpha(0.0f, T13 + 1.0f, getWidth(), T15 - 1.0f, org.telegram.messenger.hs.e4, 31);
            if (vf0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f17) * f11), 31);
                canvas2.translate(f14, f15);
                canvas2.translate((-vf0Var.S.getX()) - vf0Var.S.getPaddingLeft(), ((-vf0Var.S.getY()) - vf0Var.S.getPaddingTop()) + vf0Var.S.getScrollY());
                float alpha = vf0Var.S.getAlpha();
                vf0Var.S.setAlpha(1.0f);
                if (vf0Var.E >= 0.001f) {
                    f16 = alpha;
                } else if (vf0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, vf0Var.S.getY());
                    canvas2.saveLayerAlpha(vf0Var.S.getX() + vf0Var.S.getPaddingLeft(), 0.0f, ((vf0Var.S.getX() + vf0Var.S.getPaddingLeft()) + vf0Var.S.getWidth()) - vf0Var.S.getPaddingRight(), vf0Var.S.getHeight(), (int) org.telegram.messenger.camera.q.x(vf0Var.E, 0.1f, 1.0f, f11), 31);
                    vf0Var.V.a(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    f16 = alpha;
                } else {
                    f16 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, this.m0));
                    paint.setAlpha((int) org.telegram.messenger.camera.q.x(vf0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(vf0Var.S.getPaddingLeft(), vf0Var.S.getY(), ((vf0Var.S.getX() + vf0Var.S.getPaddingLeft()) + vf0Var.S.getWidth()) - vf0Var.S.getPaddingRight(), vf0Var.S.getY() + vf0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.e eVar = vf0Var.U;
                if (eVar != null) {
                    eVar.a(canvas2, new org.telegram.messenger.m10() { // from class: org.telegram.ui.pf0
                        @Override // org.telegram.messenger.m10
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            vf0 vf0Var2 = qf0.this.n0;
                            canvas3.translate(vf0Var2.S.getX(), vf0Var2.S.getY() - vf0Var2.S.getScrollY());
                            float textSize3 = f12 / vf0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, vf0Var2.S.getPaddingLeft(), vf0Var2.S.getPaddingTop());
                            vf0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                vf0Var.S.setAlpha(f16);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            vf0Var.Q.getTransitionParams().y0 = true;
            org.telegram.ui.Cells.q1 q1Var2 = vf0Var.r0;
            if (q1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f17 * 255.0f), 31);
                canvas2.translate(f14, f15);
                canvas2.translate(-f19, -f20);
                float T17 = org.telegram.messenger.g0.T1(1.0f, rf0Var.getScaleX(), vf0Var.E);
                canvas2.scale(T17, T17, (-vf0Var.Q.getX()) + rf0Var.getWidth(), (-vf0Var.Q.getY()) + rf0Var.getHeight());
                float f21 = f12 / textSize;
                canvas2.scale(f21, f21, f19, f20);
                if (vf0Var.Q.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, vf0Var.Q.getPaddingTop());
                    vf0Var.Q.M0(canvas2, true, z10);
                    canvas2.restore();
                }
                vf0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr4 = this.h0;
                q1Var2.getLocationInWindow(iArr4);
                int translationY = vf0Var.r0.getParent() instanceof View ? (int) ((View) vf0Var.r0.getParent()).getTranslationY() : 0;
                int i13 = this.i0;
                int[] iArr5 = this.j0;
                if (i13 > translationY) {
                    c10 = 0;
                } else {
                    c10 = 0;
                }
                iArr5[c10] = iArr4[c10];
                iArr5[1] = iArr4[1];
                this.i0 = translationY;
                float T18 = org.telegram.messenger.g0.T1(vf0Var.Q.getX() + rf0Var.getX(), iArr5[c10], 1.0f - vf0Var.E);
                float T19 = org.telegram.messenger.g0.T1(vf0Var.Q.getY() + rf0Var.getY(), iArr5[1], 1.0f - vf0Var.E);
                canvas2.save();
                canvas2.translate(T18, T19);
                float T110 = org.telegram.messenger.g0.T1(1.0f, rf0Var.getScaleX(), vf0Var.E);
                canvas2.scale(T110, T110, (-vf0Var.Q.getX()) + rf0Var.getWidth(), (-vf0Var.Q.getY()) + rf0Var.getHeight());
                vf0Var.Q.getTransitionParams().L1 = 1.0f - vf0Var.E;
                vf0Var.Q.getTransitionParams().h0 = rect.left * vf0Var.E;
                vf0Var.Q.getTransitionParams().k0 = rect.top * vf0Var.E;
                vf0Var.Q.getTransitionParams().i0 = rect.right * vf0Var.E;
                org.telegram.ui.Cells.x1 transitionParams = vf0Var.Q.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = vf0Var.E;
                transitionParams.j0 = f22 * f23;
                vf0Var.Q.setTimeAlpha(1.0f - f23);
                if (vf0Var.Q.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, vf0Var.r0.getWidth(), vf0Var.r0.getHeight(), (int) (vf0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, vf0Var.Q.getPaddingTop());
                    vf0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, vf0Var.r0.getWidth(), vf0Var.r0.getHeight(), (int) ((1.0f - vf0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, vf0Var.r0.getPaddingTop());
                    vf0Var.r0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                vf0Var.Q.draw(canvas2);
                if (vf0Var.Q.getTransitionParams().x0) {
                    vf0Var.Q.h1(canvas2, 1.0f);
                    vf0Var.Q.x1(1.0f - vf0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, T13, getWidth(), org.telegram.messenger.g0.L(14.0f) + T13);
            k4.j jVar = this.k0;
            jVar.w(canvas2, rectF, 1, T14);
            rectF.set(0.0f, T15 - org.telegram.messenger.g0.L(14.0f), getWidth(), T15);
            jVar.w(canvas2, rectF, 3, T16);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            iArr = iArr2;
        }
        if (vf0Var.w) {
            if (vf0Var.y) {
                org.telegram.ui.Components.bg bgVar = vf0Var.W;
                if (bgVar != null) {
                    bgVar.setAlpha(0.0f);
                }
                c2 = 0;
                vf0Var.y = false;
            } else {
                c2 = 0;
            }
            canvas2.save();
            int i14 = iArr[c2];
            int width = vf0Var.X.getWidth();
            vf0Var.X.getHeight();
            canvas2.translate(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(6.0f) + (i14 - (width - r4.m())), vf0Var.X.getX(), vf0Var.E), org.telegram.messenger.g0.T1(iArr[1], vf0Var.X.getY(), vf0Var.E));
            if (vf0Var.s && vf0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, vf0Var.X.getWidth(), vf0Var.X.getHeight(), (int) (vf0Var.E * 255.0f), 31);
            }
            vf0Var.X.draw(canvas2);
            if (vf0Var.s && vf0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (vf0Var.l0 != null) {
            if (vf0Var.J == null) {
                vf0Var.J = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 23, this, false);
            }
            Rect rect2 = org.telegram.messenger.g0.Q;
            rect2.set((int) ((vf0Var.l0.right - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) ((vf0Var.l0.bottom - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) (vf0Var.l0.right - org.telegram.messenger.g0.L(12.0f)), (int) (vf0Var.l0.bottom - org.telegram.messenger.g0.L(12.0f)));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rect2);
            rectF2.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(6.0f));
            float height2 = rectF2.height() / 2.0f;
            Paint paint2 = this.l0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (vf0Var.J.e() * 30.0f * vf0Var.E));
            canvas2.drawRoundRect(rectF2, height2, height2, paint2);
            vf0Var.J.setBounds(rect2);
            org.telegram.ui.Components.e5 e5Var = vf0Var.J;
            e5Var.w = (int) (vf0Var.E * 255.0f);
            e5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        vf0 vf0Var = this.n0;
        if (vf0Var.w) {
            if (view == vf0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.q1 q1Var = vf0Var.Q;
            if (view == q1Var && q1Var != null && q1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
