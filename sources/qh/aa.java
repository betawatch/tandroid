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
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.za;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class aa extends pv0 {
    public float A0;
    public final /* synthetic */ ba B0;
    public final ai t0;
    public final ScaleGestureDetector u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ba baVar, Activity activity) {
        super(activity, null);
        this.B0 = baVar;
        this.x0 = false;
        this.t0 = new ai(activity, new y9(this));
        this.u0 = new ScaleGestureDetector(activity, new z9(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        ba baVar = this.B0;
        float width2 = width / baVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = baVar.U0.getTextureView();
        if (textureView == null) {
            textureView = baVar.U0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(baVar.e0.getX() + baVar.r.getX(), baVar.e0.getY() + baVar.r.getY());
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
        canvas.translate(baVar.r.getX(), baVar.r.getY());
        for (int i10 = 0; i10 < baVar.r.getChildCount(); i10++) {
            View childAt = baVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == baVar.e0) {
                    for (int i11 = 0; i11 < baVar.e0.getChildCount(); i11++) {
                        View childAt2 = baVar.e0.getChildAt(i11);
                        if (childAt2 != baVar.U0 && childAt2 != baVar.y0 && childAt2.getVisibility() == 0) {
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
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        boolean z10;
        ?? r11;
        e9 e9Var;
        float f10;
        eg.y2 y2Var;
        ba baVar = this.B0;
        RectF rectF = baVar.E;
        Path path = baVar.b0;
        RectF rectF2 = baVar.a0;
        RectF rectF3 = baVar.Z;
        Float f11 = baVar.I;
        float floatValue = f11 != null ? f11.floatValue() : baVar.H;
        if (baVar.G == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * baVar.F * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(baVar.D, 0.0f, baVar.F);
        if (baVar.F != 1.0f) {
            int i10 = baVar.G;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(baVar.r.getTranslationX(), baVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, baVar.F, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(baVar.F * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (baVar.r.getTranslationY() * baVar.F));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z10 = true;
                e9Var = baVar.s1;
                if (e9Var != null) {
                    aa aaVar = e9Var.J1;
                    float[] fArr = e9Var.g2;
                    if (e9Var.a2) {
                        e9Var.a2 = r11;
                        if (e9Var.W1 != null && (y2Var = e9Var.X1) != null) {
                            fArr[r11] = y2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = e9Var.X1.getMeasuredHeight() / 2.0f;
                            e9Var.X1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (e9Var.X1.getScaleX() * (e9Var.X1.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (e9Var.X1.getScaleX() * (e9Var.X1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > aaVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                e9Var.W1.setTop((boolean) r11);
                                e9Var.W1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - e9Var.W1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                e9Var.W1.setTop(true);
                                e9Var.W1.setTranslationY((e9Var.X1.getScaleX() * (e9Var.X1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                e9Var.W1.setTop((boolean) r11);
                                e9Var.W1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < e9Var.getMeasuredWidth() / 2.0f) {
                                e9Var.W1.setMirrorX(true);
                                float measuredWidth = ((e9Var.W1.getMeasuredWidth() / 2.0f) + e9Var.W1.getX()) - (fArr[r11] - (e9Var.X1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    e9Var.W1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((e9Var.W1.getMeasuredWidth() / 2.0f) + e9Var.W1.getX()) - ((e9Var.X1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    e9Var.W1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                e9Var.W1.setMirrorX(r11);
                            }
                            e9Var.W1.setTranslationX((aaVar.getMeasuredWidth() - e9Var.W1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z10) {
                                canvas.restore();
                                canvas.restore();
                                if (baVar.C != null) {
                                    float clamp = Utilities.clamp(f10 - (baVar.F * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    w9 w9Var = baVar.C;
                                    ImageReceiver imageReceiver = w9Var.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = baVar.C.e.getRoundRadius()[r11];
                                        baVar.C.e.setRoundRadius((int) lerp);
                                        baVar.C.e.setAlpha(clamp);
                                        baVar.C.e.draw(canvas);
                                        baVar.C.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.d7 d7Var = w9Var.d;
                                        if (d7Var != null) {
                                            d7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.d7 d7Var2 = baVar.C.d;
                                            d7Var2.d = (int) e2.c.z(clamp, 255.0f, clamp, clamp);
                                            d7Var2.draw(canvas);
                                        }
                                    }
                                    baVar.C.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    baVar.C.a(canvas, clamp);
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
                    baVar.k();
                }
            }
        } else {
            z4 = false;
        }
        z10 = false;
        r11 = z4;
        e9Var = baVar.s1;
        if (e9Var != null) {
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
        ba baVar = this.B0;
        u uVar = baVar.F0;
        if (uVar != null && uVar.e) {
            float y10 = baVar.F0.getY() + baVar.f0.getY() + baVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + baVar.F0.getHeight()) || this.w0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z4 = true;
                }
                this.w0 = z4;
                return super.dispatchTouchEvent(motionEvent);
            }
            baVar.F0.a(false, true);
            baVar.m0(true);
        }
        if (this.w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.w0 = false;
        }
        this.u0.onTouchEvent(motionEvent);
        this.t0.J(motionEvent);
        if (motionEvent.getAction() == 1 && !this.v0) {
            if (baVar.r.getTranslationY() <= 0.0f) {
                b9 b9Var = baVar.J0;
                if (b9Var != null && b9Var.getTranslationY() > 0.0f && !baVar.I0) {
                    baVar.f(!baVar.N1 && baVar.J0.getTranslationY() < ((float) baVar.J0.getPadding()));
                }
            } else if (baVar.H > 0.4f) {
                baVar.q(true);
            } else {
                ba.c(baVar);
            }
            baVar.I0 = false;
            baVar.T = false;
            baVar.U = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pv0
    public int getBottomPadding() {
        int height = getHeight();
        ba baVar = this.B0;
        return (height - baVar.r.getBottom()) + baVar.R;
    }

    public int getBottomPadding2() {
        return getHeight() - this.B0.r.getBottom();
    }

    @Override // org.telegram.ui.Components.pv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        ba baVar = this.B0;
        return (height - baVar.Y) - baVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        mz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ba baVar = this.B0;
        int i15 = baVar.W;
        int measuredHeight2 = baVar.j0.getMeasuredHeight();
        if (baVar.S) {
            i15 = 0;
        }
        int i16 = baVar.P;
        int b10 = k7.o.b((measuredWidth - i16) / 2, baVar.V, (measuredWidth - baVar.X) - i16);
        int i17 = baVar.P + b10;
        if (baVar.S) {
            i14 = baVar.Q;
        } else {
            int i18 = baVar.Y;
            int i19 = baVar.Q;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (baVar.G == 1) {
                float f10 = baVar.E.top;
                if (i19 + f10 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f10;
                    i14 = baVar.Q;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = baVar.Q;
        }
        baVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        baVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        wo woVar = baVar.z2;
        if (woVar != null) {
            woVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        b9 b9Var = baVar.J0;
        if (b9Var != null) {
            b9Var.layout((measuredWidth - b9Var.getMeasuredWidth()) / 2, 0, (baVar.J0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        q9 q9Var = baVar.Z0;
        if (q9Var != null && (emojiView = q9Var.f.getEmojiView()) != null) {
            emojiView.layout(baVar.V, (measuredHeight - baVar.Y) - emojiView.getMeasuredHeight(), measuredWidth - baVar.X, measuredHeight - baVar.Y);
        }
        e9 e9Var = baVar.s1;
        if (e9Var != null) {
            mz mzVar = e9Var.m2;
            if (mzVar != null) {
                mzVar.layout(baVar.V, (measuredHeight - baVar.Y) - mzVar.getMeasuredHeight(), measuredWidth - baVar.X, measuredHeight - baVar.Y);
            }
            qk0 qk0Var = baVar.s1.W1;
            if (qk0Var != null) {
                int i21 = baVar.V;
                qk0Var.layout(i21, baVar.W, qk0Var.getMeasuredWidth() + i21, baVar.s1.W1.getMeasuredHeight() + baVar.W);
                ag.l lVar = baVar.s1.W1.getReactionsWindow() != null ? baVar.s1.W1.getReactionsWindow().c : null;
                if (lVar != null) {
                    int i22 = baVar.V;
                    lVar.layout(i22, baVar.W, lVar.getMeasuredWidth() + i22, lVar.getMeasuredHeight() + baVar.W);
                }
            }
        }
        k9 k9Var = baVar.o1;
        if (k9Var != null) {
            k9Var.e.setPadding(0, baVar.W, 0, baVar.Y);
            baVar.o1.layout(0, 0, measuredWidth, measuredHeight);
            baVar.o1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        l9 l9Var = baVar.p1;
        if (l9Var != null) {
            l9Var.f.setPadding(0, baVar.W, 0, baVar.Y);
            baVar.p1.layout(0, 0, measuredWidth, measuredHeight);
            baVar.p1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        ba baVar = this.B0;
        int i12 = (size - baVar.V) - baVar.X;
        int i13 = baVar.W;
        int i14 = baVar.Y;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        baVar.R = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            baVar.P = i12;
            baVar.Q = ceil;
            baVar.S = i15 > i16 - i13;
        } else {
            baVar.S = false;
            baVar.Q = ((size2 - dp) - i14) - i13;
            baVar.P = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        baVar.R = Utilities.clamp((size2 - baVar.Q) - (baVar.S ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(baVar.S ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        baVar.r.measure(View.MeasureSpec.makeMeasureSpec(baVar.P, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(baVar.Q + baVar.R, TLObject.FLAG_30));
        baVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        wo woVar = baVar.z2;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        b9 b9Var = baVar.J0;
        if (b9Var != null) {
            b9Var.measure(View.MeasureSpec.makeMeasureSpec(baVar.P, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        q9 q9Var = baVar.Z0;
        if (q9Var != null) {
            mz emojiView = q9Var.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        e9 e9Var = baVar.s1;
        if (e9Var != null) {
            mz mzVar = e9Var.m2;
            if (mzVar != null) {
                mzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(baVar.s1.m2.getLayoutParams().height, TLObject.FLAG_30));
            }
            qk0 qk0Var = baVar.s1.W1;
            if (qk0Var != null) {
                measureChild(qk0Var, i10, i11);
                if (baVar.s1.W1.getReactionsWindow() != null) {
                    measureChild(baVar.s1.W1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof m0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof za) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (baVar.S ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        k9 k9Var = baVar.o1;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            baVar.o1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        l9 l9Var = baVar.p1;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            baVar.p1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
