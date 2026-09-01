package qh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.za;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class ba extends qv0 {
    public float A0;
    public final /* synthetic */ ca B0;
    public final ai t0;
    public final ScaleGestureDetector u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ca caVar, Activity activity) {
        super(activity, null);
        this.B0 = caVar;
        this.x0 = false;
        this.t0 = new ai(activity, new z9(this));
        this.u0 = new ScaleGestureDetector(activity, new aa(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        ca caVar = this.B0;
        float width2 = width / caVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = caVar.U0.getTextureView();
        if (textureView == null) {
            textureView = caVar.U0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(caVar.e0.getX() + caVar.r.getX(), caVar.e0.getY() + caVar.r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f10), (int) (textureView.getHeight() / f10));
                float f11 = 1.0f / width2;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(caVar.r.getX(), caVar.r.getY());
        for (int i10 = 0; i10 < caVar.r.getChildCount(); i10++) {
            View childAt = caVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == caVar.e0) {
                    for (int i11 = 0; i11 < caVar.e0.getChildCount(); i11++) {
                        View childAt2 = caVar.e0.getChildAt(i11);
                        if (childAt2 != caVar.U0 && childAt2 != caVar.y0 && childAt2.getVisibility() == 0) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            childAt2.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    childAt.draw(canvas);
                }
                canvas.restore();
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        boolean z10;
        ?? r11;
        f9 f9Var;
        float f10;
        eg.y2 y2Var;
        ca caVar = this.B0;
        RectF rectF = caVar.E;
        Path path = caVar.b0;
        RectF rectF2 = caVar.a0;
        RectF rectF3 = caVar.Z;
        Float f11 = caVar.I;
        float floatValue = f11 != null ? f11.floatValue() : caVar.H;
        if (caVar.G == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * caVar.F * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(caVar.D, 0.0f, caVar.F);
        if (caVar.F != 1.0f) {
            int i10 = caVar.G;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(caVar.r.getTranslationX(), caVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, caVar.F, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(caVar.F * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (caVar.r.getTranslationY() * caVar.F));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z10 = true;
                f9Var = caVar.s1;
                if (f9Var != null) {
                    ba baVar = f9Var.J1;
                    float[] fArr = f9Var.g2;
                    if (f9Var.a2) {
                        f9Var.a2 = r11;
                        if (f9Var.W1 != null && (y2Var = f9Var.X1) != null) {
                            fArr[r11] = y2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = f9Var.X1.getMeasuredHeight() / 2.0f;
                            f9Var.X1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (f9Var.X1.getScaleX() * (f9Var.X1.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (f9Var.X1.getScaleX() * (f9Var.X1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > baVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                f9Var.W1.setTop((boolean) r11);
                                f9Var.W1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - f9Var.W1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                f9Var.W1.setTop(true);
                                f9Var.W1.setTranslationY((f9Var.X1.getScaleX() * (f9Var.X1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                f9Var.W1.setTop((boolean) r11);
                                f9Var.W1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < f9Var.getMeasuredWidth() / 2.0f) {
                                f9Var.W1.setMirrorX(true);
                                float measuredWidth = ((f9Var.W1.getMeasuredWidth() / 2.0f) + f9Var.W1.getX()) - (fArr[r11] - (f9Var.X1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    f9Var.W1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((f9Var.W1.getMeasuredWidth() / 2.0f) + f9Var.W1.getX()) - ((f9Var.X1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    f9Var.W1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                f9Var.W1.setMirrorX(r11);
                            }
                            f9Var.W1.setTranslationX((baVar.getMeasuredWidth() - f9Var.W1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z10) {
                                canvas.restore();
                                canvas.restore();
                                if (caVar.C != null) {
                                    float clamp = Utilities.clamp(f10 - (caVar.F * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    x9 x9Var = caVar.C;
                                    ImageReceiver imageReceiver = x9Var.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = caVar.C.e.getRoundRadius()[r11];
                                        caVar.C.e.setRoundRadius((int) lerp);
                                        caVar.C.e.setAlpha(clamp);
                                        caVar.C.e.draw(canvas);
                                        caVar.C.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.d7 d7Var = x9Var.d;
                                        if (d7Var != null) {
                                            d7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.d7 d7Var2 = caVar.C.d;
                                            d7Var2.d = (int) e2.c.z(clamp, 255.0f, clamp, clamp);
                                            d7Var2.draw(canvas);
                                        }
                                    }
                                    caVar.C.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    caVar.C.a(canvas, clamp);
                                    canvas.restore();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                f10 = 1.0f;
                super.dispatchDraw(canvas);
                if (z10) {
                }
            } else {
                z4 = false;
                z4 = false;
                if (i10 == 1) {
                    caVar.k();
                }
            }
        } else {
            z4 = false;
        }
        z10 = false;
        r11 = z4;
        f9Var = caVar.s1;
        if (f9Var != null) {
        }
        f10 = 1.0f;
        super.dispatchDraw(canvas);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.B0.M();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4 = false;
        this.v0 = false;
        ca caVar = this.B0;
        u uVar = caVar.F0;
        if (uVar != null && uVar.e) {
            float y10 = caVar.F0.getY() + caVar.f0.getY() + caVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + caVar.F0.getHeight()) || this.w0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z4 = true;
                }
                this.w0 = z4;
                return super.dispatchTouchEvent(motionEvent);
            }
            caVar.F0.a(false, true);
            caVar.m0(true);
        }
        if (this.w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.w0 = false;
        }
        this.u0.onTouchEvent(motionEvent);
        this.t0.J(motionEvent);
        if (motionEvent.getAction() == 1 && !this.v0) {
            if (caVar.r.getTranslationY() <= 0.0f) {
                c9 c9Var = caVar.J0;
                if (c9Var != null && c9Var.getTranslationY() > 0.0f && !caVar.I0) {
                    caVar.f(!caVar.N1 && caVar.J0.getTranslationY() < ((float) caVar.J0.getPadding()));
                }
            } else if (caVar.H > 0.4f) {
                caVar.q(true);
            } else {
                ca.c(caVar);
            }
            caVar.I0 = false;
            caVar.T = false;
            caVar.U = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qv0
    public int getBottomPadding() {
        int height = getHeight();
        ca caVar = this.B0;
        return (height - caVar.r.getBottom()) + caVar.R;
    }

    public int getBottomPadding2() {
        return getHeight() - this.B0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        ca caVar = this.B0;
        return (height - caVar.Y) - caVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        mz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ca caVar = this.B0;
        int i15 = caVar.W;
        int measuredHeight2 = caVar.j0.getMeasuredHeight();
        if (caVar.S) {
            i15 = 0;
        }
        int i16 = caVar.P;
        int b10 = k7.o.b((measuredWidth - i16) / 2, caVar.V, (measuredWidth - caVar.X) - i16);
        int i17 = caVar.P + b10;
        if (caVar.S) {
            i14 = caVar.Q;
        } else {
            int i18 = caVar.Y;
            int i19 = caVar.Q;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (caVar.G == 1) {
                float f10 = caVar.E.top;
                if (i19 + f10 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f10;
                    i14 = caVar.Q;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = caVar.Q;
        }
        caVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        caVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        wo woVar = caVar.z2;
        if (woVar != null) {
            woVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        c9 c9Var = caVar.J0;
        if (c9Var != null) {
            c9Var.layout((measuredWidth - c9Var.getMeasuredWidth()) / 2, 0, (caVar.J0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        r9 r9Var = caVar.Z0;
        if (r9Var != null && (emojiView = r9Var.f.getEmojiView()) != null) {
            emojiView.layout(caVar.V, (measuredHeight - caVar.Y) - emojiView.getMeasuredHeight(), measuredWidth - caVar.X, measuredHeight - caVar.Y);
        }
        f9 f9Var = caVar.s1;
        if (f9Var != null) {
            mz mzVar = f9Var.m2;
            if (mzVar != null) {
                mzVar.layout(caVar.V, (measuredHeight - caVar.Y) - mzVar.getMeasuredHeight(), measuredWidth - caVar.X, measuredHeight - caVar.Y);
            }
            rk0 rk0Var = caVar.s1.W1;
            if (rk0Var != null) {
                int i21 = caVar.V;
                rk0Var.layout(i21, caVar.W, rk0Var.getMeasuredWidth() + i21, caVar.s1.W1.getMeasuredHeight() + caVar.W);
                ag.l lVar = caVar.s1.W1.getReactionsWindow() != null ? caVar.s1.W1.getReactionsWindow().c : null;
                if (lVar != null) {
                    int i22 = caVar.V;
                    lVar.layout(i22, caVar.W, lVar.getMeasuredWidth() + i22, lVar.getMeasuredHeight() + caVar.W);
                }
            }
        }
        l9 l9Var = caVar.o1;
        if (l9Var != null) {
            l9Var.e.setPadding(0, caVar.W, 0, caVar.Y);
            caVar.o1.layout(0, 0, measuredWidth, measuredHeight);
            caVar.o1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        m9 m9Var = caVar.p1;
        if (m9Var != null) {
            m9Var.f.setPadding(0, caVar.W, 0, caVar.Y);
            caVar.p1.layout(0, 0, measuredWidth, measuredHeight);
            caVar.p1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof m0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof za) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ca caVar = this.B0;
        int i12 = (size - caVar.V) - caVar.X;
        int i13 = caVar.W;
        int i14 = caVar.Y;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        caVar.R = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            caVar.P = i12;
            caVar.Q = ceil;
            caVar.S = i15 > i16 - i13;
        } else {
            caVar.S = false;
            caVar.Q = ((size2 - dp) - i14) - i13;
            caVar.P = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        caVar.R = Utilities.clamp((size2 - caVar.Q) - (caVar.S ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(caVar.S ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        caVar.r.measure(View.MeasureSpec.makeMeasureSpec(caVar.P, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(caVar.Q + caVar.R, TLObject.FLAG_30));
        caVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        wo woVar = caVar.z2;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        c9 c9Var = caVar.J0;
        if (c9Var != null) {
            c9Var.measure(View.MeasureSpec.makeMeasureSpec(caVar.P, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        r9 r9Var = caVar.Z0;
        if (r9Var != null) {
            mz emojiView = r9Var.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        f9 f9Var = caVar.s1;
        if (f9Var != null) {
            mz mzVar = f9Var.m2;
            if (mzVar != null) {
                mzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(caVar.s1.m2.getLayoutParams().height, TLObject.FLAG_30));
            }
            rk0 rk0Var = caVar.s1.W1;
            if (rk0Var != null) {
                measureChild(rk0Var, i10, i11);
                if (caVar.s1.W1.getReactionsWindow() != null) {
                    measureChild(caVar.s1.W1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof m0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof za) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (caVar.S ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        l9 l9Var = caVar.o1;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            caVar.o1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        m9 m9Var = caVar.p1;
        if (m9Var != null) {
            m9Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            caVar.p1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
