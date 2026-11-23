package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yf0 extends org.telegram.ui.Components.cu0 {
    public final int[] g0;
    public final int[] h0;
    public int i0;
    public final int[] j0;
    public final org.telegram.ui.Components.i61 k0;
    public final Paint l0;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 m0;
    public final /* synthetic */ dg0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(dg0 dg0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null);
        this.n0 = dg0Var;
        this.m0 = i6Var;
        this.g0 = new int[2];
        this.h0 = new int[2];
        this.i0 = 0;
        this.j0 = new int[2];
        this.k0 = new org.telegram.ui.Components.i61(1);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f;
        this.l0 = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        ?? r10;
        int[] iArr;
        char c10;
        org.telegram.ui.Cells.r1 r1Var;
        char c11;
        TextPaint textPaint;
        float f10;
        float height;
        float f11;
        float f12;
        float f13;
        final float f14;
        int i7;
        char c12;
        float f15;
        dg0 dg0Var = this.n0;
        int[] iArr2 = dg0Var.r0;
        Paint paint = dg0Var.T;
        float[] fArr = dg0Var.s0;
        Rect rect = dg0Var.y0;
        zf0 zf0Var = dg0Var.K;
        if (dg0Var.w && (r1Var = dg0Var.Q) != null && r1Var.getCurrentPosition() == null) {
            if (dg0Var.x) {
                org.telegram.ui.Components.hf hfVar = dg0Var.S;
                if (hfVar != null) {
                    hfVar.setAlpha(0.0f);
                } else {
                    ab.q qVar = dg0Var.m0;
                    if (qVar != null) {
                        qVar.C(true);
                    }
                }
                dg0Var.x = false;
            }
            boolean z10 = dg0Var.Q.getMessageObject() != null && dg0Var.Q.getMessageObject().D == 15;
            float textX = z10 ? dg0Var.Q.getPhotoImage().L0 : dg0Var.Q.getTextX();
            float textY = z10 ? dg0Var.Q.getPhotoImage().M0 : dg0Var.Q.getTextY();
            float x10 = dg0Var.Q.getX() + zf0Var.getX() + textX;
            float y10 = dg0Var.Q.getY() + zf0Var.getY() + textY;
            float f16 = textY;
            if (dg0Var.Q.getMessageObject() != null) {
                org.telegram.messenger.fj messageObject = dg0Var.Q.getMessageObject();
                c11 = 3;
                if (messageObject.P1 >= 1 && messageObject.k != null && !messageObject.u2()) {
                    int i10 = messageObject.P1;
                    int i11 = messageObject.Q1;
                    boolean z11 = i10 == i11;
                    switch (Math.max(i10, i11)) {
                        case 0:
                        case 1:
                        case 2:
                            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr[2];
                                break;
                            } else {
                                textPaint = textPaintArr[0];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr2[3];
                                break;
                            } else {
                                textPaint = textPaintArr2[1];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr3[4];
                                break;
                            } else {
                                textPaint = textPaintArr3[2];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr4[5];
                                break;
                            } else {
                                textPaint = textPaintArr4[3];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.n6.y2;
                            if (!z11) {
                                textPaint = textPaintArr5[5];
                                break;
                            } else {
                                textPaint = textPaintArr5[4];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.n6.y2[5];
                            break;
                    }
                } else {
                    textPaint = org.telegram.ui.ActionBar.n6.o2;
                }
            } else {
                c11 = 3;
                textPaint = org.telegram.ui.ActionBar.n6.o2;
            }
            float textSize = textPaint.getTextSize();
            org.telegram.ui.Components.hf hfVar2 = dg0Var.S;
            if (hfVar2 != null) {
                int[] iArr3 = this.g0;
                hfVar2.getLocationOnScreen(iArr3);
                float paddingLeft = dg0Var.S.getPaddingLeft() + iArr3[0];
                float paddingTop = (dg0Var.S.getPaddingTop() + iArr3[1]) - dg0Var.S.getScrollY();
                float textSize2 = dg0Var.S.getTextSize();
                int i12 = iArr3[1];
                float f17 = i12;
                height = dg0Var.S.getMeasuredHeight() + i12;
                float T1 = org.telegram.messenger.g0.T1(paddingLeft, x10, dg0Var.E);
                float T12 = org.telegram.messenger.g0.T1(paddingTop, y10, dg0Var.E);
                float T13 = org.telegram.messenger.g0.T1(textSize2, textSize, dg0Var.E);
                f10 = textX;
                f12 = T12;
                f13 = f17;
                f14 = T13;
                f11 = T1;
            } else {
                ab.q qVar2 = dg0Var.m0;
                if (qVar2 != null) {
                    float[] fArr2 = (float[]) qVar2.b;
                    if (((boolean[]) qVar2.c)[0] && qVar2.a) {
                        f10 = textX;
                        i7 = 4;
                    } else {
                        ji.e eVar = (ji.e) ((androidx.activity.n) qVar2.d).d;
                        eVar.getLocationOnScreen(eVar.r3);
                        int[] iArr4 = eVar.r3;
                        f10 = textX;
                        fArr2[0] = iArr4[0] + eVar.O2;
                        int i13 = iArr4[1];
                        fArr2[1] = i13 + eVar.P2;
                        RectF rectF = eVar.j0;
                        fArr2[2] = i13 + rectF.top;
                        fArr2[3] = i13 + rectF.bottom;
                        qVar2.a = true;
                        i7 = 4;
                    }
                    System.arraycopy(fArr2, 0, fArr, 0, i7);
                    float b10 = ((androidx.activity.n) dg0Var.m0.d).b();
                    f13 = fArr[2];
                    float f18 = fArr[c11];
                    float T14 = org.telegram.messenger.g0.T1(fArr[0], x10, dg0Var.E);
                    float T15 = org.telegram.messenger.g0.T1(fArr[1], y10, dg0Var.E);
                    height = f18;
                    f11 = T14;
                    f12 = T15;
                    f14 = org.telegram.messenger.g0.T1(b10, textSize, dg0Var.E);
                } else {
                    f10 = textX;
                    height = getHeight();
                    f11 = x10;
                    f12 = y10;
                    f13 = 0.0f;
                    f14 = textSize;
                }
            }
            float f19 = dg0Var.E;
            if (dg0Var.v0 != null) {
                f13 = dg0Var.w0;
            }
            float T16 = org.telegram.messenger.g0.T1(f13, ((1.0f - zf0Var.getScaleY()) * zf0Var.getHeight()) + zf0Var.getY(), dg0Var.E);
            float T17 = org.telegram.messenger.g0.T1(0.0f, zf0Var.canScrollVertically(-1) ? 1.0f : 0.0f, dg0Var.E);
            if (dg0Var.v0 != null) {
                height = dg0Var.x0;
            }
            float T18 = org.telegram.messenger.g0.T1(height, zf0Var.getY() + zf0Var.getHeight(), dg0Var.E);
            float T19 = org.telegram.messenger.g0.T1(0.0f, zf0Var.canScrollVertically(1) ? 1.0f : 0.0f, dg0Var.E);
            iArr = iArr2;
            float f20 = f10;
            canvas.saveLayerAlpha(0.0f, T16 + 1.0f, getWidth(), T18 - 1.0f, org.telegram.messenger.ks.e4, 31);
            if (dg0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f19) * 255.0f), 31);
                canvas2.translate(f11, f12);
                canvas2.translate((-dg0Var.S.getX()) - dg0Var.S.getPaddingLeft(), ((-dg0Var.S.getY()) - dg0Var.S.getPaddingTop()) + dg0Var.S.getScrollY());
                float alpha = dg0Var.S.getAlpha();
                dg0Var.S.setAlpha(1.0f);
                if (dg0Var.E >= 0.001f) {
                    f15 = alpha;
                } else if (dg0Var.V != null) {
                    canvas2.save();
                    canvas2.translate(0.0f, dg0Var.S.getY());
                    f15 = alpha;
                    canvas2.saveLayerAlpha(dg0Var.S.getX() + dg0Var.S.getPaddingLeft(), 0.0f, ((dg0Var.S.getX() + dg0Var.S.getPaddingLeft()) + dg0Var.S.getWidth()) - dg0Var.S.getPaddingRight(), dg0Var.S.getHeight(), (int) org.telegram.messenger.m10.y(dg0Var.E, 0.1f, 1.0f, 255.0f), 31);
                    dg0Var.V.a(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                } else {
                    f15 = alpha;
                    paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Je, this.m0));
                    paint.setAlpha((int) org.telegram.messenger.m10.y(dg0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                    canvas2.drawRect(dg0Var.S.getPaddingLeft(), dg0Var.S.getY(), ((dg0Var.S.getX() + dg0Var.S.getPaddingLeft()) + dg0Var.S.getWidth()) - dg0Var.S.getPaddingRight(), dg0Var.S.getY() + dg0Var.S.getHeight(), paint);
                }
                org.telegram.ui.Components.d dVar = dg0Var.U;
                if (dVar != null) {
                    dVar.a(canvas2, new org.telegram.messenger.o10() { // from class: org.telegram.ui.xf0
                        @Override // org.telegram.messenger.o10
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            dg0 dg0Var2 = yf0.this.n0;
                            canvas3.translate(dg0Var2.S.getX(), dg0Var2.S.getY() - dg0Var2.S.getScrollY());
                            float textSize3 = f14 / dg0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, dg0Var2.S.getPaddingLeft(), dg0Var2.S.getPaddingTop());
                            dg0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                dg0Var.S.setAlpha(f15);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                if (dg0Var.m0 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f19) * 255.0f), 31);
                    canvas2.translate(f11, f12);
                    float b11 = f14 / ((androidx.activity.n) dg0Var.m0.d).b();
                    canvas2.scale(b11, b11);
                    ab.q qVar3 = dg0Var.m0;
                    if (!((boolean[]) qVar3.c)[0]) {
                        ji.e eVar2 = (ji.e) ((androidx.activity.n) qVar3.d).d;
                        StaticLayout staticLayout = eVar2.P0;
                        TextPaint textPaint2 = eVar2.d;
                        if (staticLayout != null) {
                            int alpha2 = textPaint2.getAlpha();
                            textPaint2.setAlpha(org.telegram.messenger.ks.e4);
                            eVar2.P0.draw(canvas2);
                            textPaint2.setAlpha(alpha2);
                        }
                    }
                    canvas2.restore();
                }
            }
            r10 = 1;
            dg0Var.Q.getTransitionParams().y0 = true;
            org.telegram.ui.Cells.r1 r1Var2 = dg0Var.v0;
            if (r1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f19 * 255.0f), 31);
                canvas2.translate(f11, f12);
                canvas2.translate(-f20, -f16);
                float T110 = org.telegram.messenger.g0.T1(1.0f, zf0Var.getScaleX(), dg0Var.E);
                canvas2.scale(T110, T110, (-dg0Var.Q.getX()) + zf0Var.getWidth(), (-dg0Var.Q.getY()) + zf0Var.getHeight());
                float f21 = f14 / textSize;
                canvas2.scale(f21, f21, f20, f16);
                if (dg0Var.Q.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, dg0Var.Q.getPaddingTop());
                    dg0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                }
                dg0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr5 = this.h0;
                r1Var2.getLocationInWindow(iArr5);
                int translationY = dg0Var.v0.getParent() instanceof View ? (int) ((View) dg0Var.v0.getParent()).getTranslationY() : 0;
                int i14 = this.i0;
                int[] iArr6 = this.j0;
                if (i14 <= translationY || iArr6[1] - iArr5[1] <= i14) {
                    c12 = 0;
                    iArr6[0] = iArr5[0];
                    iArr6[1] = iArr5[1];
                } else {
                    c12 = 0;
                }
                this.i0 = translationY;
                float T111 = org.telegram.messenger.g0.T1(dg0Var.Q.getX() + zf0Var.getX(), iArr6[c12], 1.0f - dg0Var.E);
                float T112 = org.telegram.messenger.g0.T1(dg0Var.Q.getY() + zf0Var.getY(), iArr6[1], 1.0f - dg0Var.E);
                canvas2.save();
                canvas2.translate(T111, T112);
                float T113 = org.telegram.messenger.g0.T1(1.0f, zf0Var.getScaleX(), dg0Var.E);
                canvas2.scale(T113, T113, (-dg0Var.Q.getX()) + zf0Var.getWidth(), (-dg0Var.Q.getY()) + zf0Var.getHeight());
                dg0Var.Q.getTransitionParams().L1 = 1.0f - dg0Var.E;
                dg0Var.Q.getTransitionParams().h0 = rect.left * dg0Var.E;
                dg0Var.Q.getTransitionParams().k0 = rect.top * dg0Var.E;
                dg0Var.Q.getTransitionParams().i0 = rect.right * dg0Var.E;
                org.telegram.ui.Cells.y1 transitionParams = dg0Var.Q.getTransitionParams();
                float f22 = rect.bottom;
                float f23 = dg0Var.E;
                transitionParams.j0 = f22 * f23;
                dg0Var.Q.setTimeAlpha(1.0f - f23);
                if (dg0Var.Q.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, dg0Var.v0.getWidth(), dg0Var.v0.getHeight(), (int) (dg0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, dg0Var.Q.getPaddingTop());
                    dg0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, dg0Var.v0.getWidth(), dg0Var.v0.getHeight(), (int) ((1.0f - dg0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, dg0Var.v0.getPaddingTop());
                    dg0Var.v0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                dg0Var.Q.draw(canvas2);
                if (dg0Var.Q.getTransitionParams().x0) {
                    dg0Var.Q.h1(canvas2, 1.0f);
                    dg0Var.Q.y1(1.0f - dg0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, T16, getWidth(), org.telegram.messenger.g0.L(14.0f) + T16);
            org.telegram.ui.Components.i61 i61Var = this.k0;
            i61Var.u(canvas2, rectF2, 1, T17);
            rectF2.set(0.0f, T18 - org.telegram.messenger.g0.L(14.0f), getWidth(), T18);
            i61Var.u(canvas2, rectF2, 3, T19);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            r10 = 1;
            iArr = iArr2;
        }
        if (dg0Var.w) {
            if (dg0Var.y) {
                dg0Var.o(r10, 1.0f);
                c10 = 0;
                dg0Var.y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i15 = iArr[c10];
            int width = dg0Var.X.getWidth();
            dg0Var.X.getHeight();
            canvas2.translate(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(6.0f) + (i15 - (width - r4.m())), dg0Var.X.getX(), dg0Var.E), org.telegram.messenger.g0.T1(iArr[r10], dg0Var.X.getY(), dg0Var.E));
            if (dg0Var.s && dg0Var.r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, dg0Var.X.getWidth(), dg0Var.X.getHeight(), (int) (dg0Var.E * 255.0f), 31);
            }
            dg0Var.X.draw(canvas2);
            if (dg0Var.s && dg0Var.r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (dg0Var.l0 != null) {
            if (dg0Var.J == null) {
                dg0Var.J = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 23, this, false);
            }
            Rect rect2 = org.telegram.messenger.g0.Q;
            rect2.set((int) ((dg0Var.l0.right - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) ((dg0Var.l0.bottom - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) (dg0Var.l0.right - org.telegram.messenger.g0.L(12.0f)), (int) (dg0Var.l0.bottom - org.telegram.messenger.g0.L(12.0f)));
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(rect2);
            rectF3.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(6.0f));
            float height2 = rectF3.height() / 2.0f;
            Paint paint2 = this.l0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (dg0Var.J.e() * 30.0f * dg0Var.E));
            canvas2.drawRoundRect(rectF3, height2, height2, paint2);
            dg0Var.J.setBounds(rect2);
            org.telegram.ui.Components.m5 m5Var = dg0Var.J;
            m5Var.w = (int) (dg0Var.E * 255.0f);
            m5Var.draw(canvas2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dg0 dg0Var = this.n0;
        if (dg0Var.w) {
            if (view == dg0Var.X) {
                return false;
            }
            org.telegram.ui.Cells.r1 r1Var = dg0Var.Q;
            if (view == r1Var && r1Var != null && r1Var.getCurrentPosition() == null) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
