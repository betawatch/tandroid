package ph;

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
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.to;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class ca extends qv0 {
    public float A0;
    public final /* synthetic */ da B0;
    public final o2.i t0;
    public final ScaleGestureDetector u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(da daVar, Activity activity) {
        super(activity, null);
        this.B0 = daVar;
        this.x0 = false;
        this.t0 = new o2.i(activity, new aa(this));
        this.u0 = new ScaleGestureDetector(activity, new ba(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        da daVar = this.B0;
        float width2 = width / daVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = daVar.U0.getTextureView();
        if (textureView == null) {
            textureView = daVar.U0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(daVar.e0.getX() + daVar.r.getX(), daVar.e0.getY() + daVar.r.getY());
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
        canvas.translate(daVar.r.getX(), daVar.r.getY());
        for (int i10 = 0; i10 < daVar.r.getChildCount(); i10++) {
            View childAt = daVar.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == daVar.e0) {
                    for (int i11 = 0; i11 < daVar.e0.getChildCount(); i11++) {
                        View childAt2 = daVar.e0.getChildAt(i11);
                        if (childAt2 != daVar.U0 && childAt2 != daVar.y0 && childAt2.getVisibility() == 0) {
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
        h9 h9Var;
        float f10;
        dg.a3 a3Var;
        da daVar = this.B0;
        RectF rectF = daVar.E;
        Path path = daVar.b0;
        RectF rectF2 = daVar.a0;
        RectF rectF3 = daVar.Z;
        Float f11 = daVar.I;
        float floatValue = f11 != null ? f11.floatValue() : daVar.H;
        if (daVar.G == 0) {
            canvas.drawColor(i0.a.k(-16777216, (int) ((1.0f - floatValue) * daVar.F * 255.0f)));
        }
        float lerp = AndroidUtilities.lerp(daVar.D, 0.0f, daVar.F);
        if (daVar.F != 1.0f) {
            int i10 = daVar.G;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(daVar.r.getTranslationX(), daVar.r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, daVar.F, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(daVar.F * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (daVar.r.getTranslationY() * daVar.F));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z10 = true;
                h9Var = daVar.s1;
                if (h9Var != null) {
                    ca caVar = h9Var.J1;
                    float[] fArr = h9Var.g2;
                    if (h9Var.a2) {
                        h9Var.a2 = r11;
                        if (h9Var.W1 != null && (a3Var = h9Var.X1) != null) {
                            fArr[r11] = a3Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = h9Var.X1.getMeasuredHeight() / 2.0f;
                            h9Var.X1.getMatrix().mapPoints(fArr);
                            f10 = 1.0f;
                            float scaleX = fArr[1] - (h9Var.X1.getScaleX() * (h9Var.X1.getMeasuredHeight() / 2.0f));
                            float scaleX2 = (h9Var.X1.getScaleX() * (h9Var.X1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > caVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                                h9Var.W1.setTop((boolean) r11);
                                h9Var.W1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - h9Var.W1.getMeasuredHeight()));
                            } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                                h9Var.W1.setTop(true);
                                h9Var.W1.setTranslationY((h9Var.X1.getScaleX() * (h9Var.X1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                h9Var.W1.setTop((boolean) r11);
                                h9Var.W1.setTranslationY((scaleX - r7.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                            }
                            if (fArr[r11] < h9Var.getMeasuredWidth() / 2.0f) {
                                h9Var.W1.setMirrorX(true);
                                float measuredWidth = ((h9Var.W1.getMeasuredWidth() / 2.0f) + h9Var.W1.getX()) - (fArr[r11] - (h9Var.X1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    h9Var.W1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((h9Var.W1.getMeasuredWidth() / 2.0f) + h9Var.W1.getX()) - ((h9Var.X1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    h9Var.W1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                h9Var.W1.setMirrorX(r11);
                            }
                            h9Var.W1.setTranslationX((caVar.getMeasuredWidth() - h9Var.W1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z10) {
                                canvas.restore();
                                canvas.restore();
                                if (daVar.C != null) {
                                    float clamp = Utilities.clamp(f10 - (daVar.F * 1.5f), 1.0f, 0.0f);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    y9 y9Var = daVar.C;
                                    ImageReceiver imageReceiver = y9Var.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.setImageCoords(rectF3);
                                        int i11 = daVar.C.e.getRoundRadius()[r11];
                                        daVar.C.e.setRoundRadius((int) lerp);
                                        daVar.C.e.setAlpha(clamp);
                                        daVar.C.e.draw(canvas);
                                        daVar.C.e.setRoundRadius(i11);
                                    } else {
                                        org.telegram.ui.Cells.c7 c7Var = y9Var.d;
                                        if (c7Var != null) {
                                            c7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.c7 c7Var2 = daVar.C.d;
                                            c7Var2.d = (int) e2.c.z(clamp, 255.0f, clamp, clamp);
                                            c7Var2.draw(canvas);
                                        }
                                    }
                                    daVar.C.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    daVar.C.a(canvas, clamp);
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
                    daVar.k();
                }
            }
        } else {
            z4 = false;
        }
        z10 = false;
        r11 = z4;
        h9Var = daVar.s1;
        if (h9Var != null) {
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
        da daVar = this.B0;
        u uVar = daVar.F0;
        if (uVar != null && uVar.e) {
            float y10 = daVar.F0.getY() + daVar.f0.getY() + daVar.r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + daVar.F0.getHeight()) || this.w0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z4 = true;
                }
                this.w0 = z4;
                return super.dispatchTouchEvent(motionEvent);
            }
            daVar.F0.a(false, true);
            daVar.m0(true);
        }
        if (this.w0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.w0 = false;
        }
        this.u0.onTouchEvent(motionEvent);
        this.t0.w2(motionEvent);
        if (motionEvent.getAction() == 1 && !this.v0) {
            if (daVar.r.getTranslationY() <= 0.0f) {
                e9 e9Var = daVar.J0;
                if (e9Var != null && e9Var.getTranslationY() > 0.0f && !daVar.I0) {
                    daVar.f(!daVar.N1 && daVar.J0.getTranslationY() < ((float) daVar.J0.getPadding()));
                }
            } else if (daVar.H > 0.4f) {
                daVar.q(true);
            } else {
                da.c(daVar);
            }
            daVar.I0 = false;
            daVar.T = false;
            daVar.U = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qv0
    public int getBottomPadding() {
        int height = getHeight();
        da daVar = this.B0;
        return (height - daVar.r.getBottom()) + daVar.R;
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
        da daVar = this.B0;
        return (height - daVar.Y) - daVar.r.getBottom();
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        kz emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        da daVar = this.B0;
        int i15 = daVar.W;
        int measuredHeight2 = daVar.j0.getMeasuredHeight();
        if (daVar.S) {
            i15 = 0;
        }
        int i16 = daVar.P;
        int b10 = k7.n.b((measuredWidth - i16) / 2, daVar.V, (measuredWidth - daVar.X) - i16);
        int i17 = daVar.P + b10;
        if (daVar.S) {
            i14 = daVar.Q;
        } else {
            int i18 = daVar.Y;
            int i19 = daVar.Q;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (daVar.G == 1) {
                float f10 = daVar.E.top;
                if (i19 + f10 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f10;
                    i14 = daVar.Q;
                }
            }
            if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = daVar.Q;
        }
        daVar.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        daVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        to toVar = daVar.z2;
        if (toVar != null) {
            toVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        e9 e9Var = daVar.J0;
        if (e9Var != null) {
            e9Var.layout((measuredWidth - e9Var.getMeasuredWidth()) / 2, 0, (daVar.J0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null && (emojiView = t9Var.f.getEmojiView()) != null) {
            emojiView.layout(daVar.V, (measuredHeight - daVar.Y) - emojiView.getMeasuredHeight(), measuredWidth - daVar.X, measuredHeight - daVar.Y);
        }
        h9 h9Var = daVar.s1;
        if (h9Var != null) {
            kz kzVar = h9Var.m2;
            if (kzVar != null) {
                kzVar.layout(daVar.V, (measuredHeight - daVar.Y) - kzVar.getMeasuredHeight(), measuredWidth - daVar.X, measuredHeight - daVar.Y);
            }
            pk0 pk0Var = daVar.s1.W1;
            if (pk0Var != null) {
                int i21 = daVar.V;
                pk0Var.layout(i21, daVar.W, pk0Var.getMeasuredWidth() + i21, daVar.s1.W1.getMeasuredHeight() + daVar.W);
                ah.e eVar = daVar.s1.W1.getReactionsWindow() != null ? daVar.s1.W1.getReactionsWindow().c : null;
                if (eVar != null) {
                    int i22 = daVar.V;
                    eVar.layout(i22, daVar.W, eVar.getMeasuredWidth() + i22, eVar.getMeasuredHeight() + daVar.W);
                }
            }
        }
        n9 n9Var = daVar.o1;
        if (n9Var != null) {
            n9Var.e.setPadding(0, daVar.W, 0, daVar.Y);
            daVar.o1.layout(0, 0, measuredWidth, measuredHeight);
            daVar.o1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        o9 o9Var = daVar.p1;
        if (o9Var != null) {
            o9Var.f.setPadding(0, daVar.W, 0, daVar.Y);
            daVar.p1.layout(0, 0, measuredWidth, measuredHeight);
            daVar.p1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof m0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        da daVar = this.B0;
        int i12 = (size - daVar.V) - daVar.X;
        int i13 = daVar.W;
        int i14 = daVar.Y;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int dp = AndroidUtilities.dp(48.0f);
        daVar.R = dp;
        int i15 = ceil + dp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            daVar.P = i12;
            daVar.Q = ceil;
            daVar.S = i15 > i16 - i13;
        } else {
            daVar.S = false;
            daVar.Q = ((size2 - dp) - i14) - i13;
            daVar.P = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        daVar.R = Utilities.clamp((size2 - daVar.Q) - (daVar.S ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(daVar.S ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        daVar.r.measure(View.MeasureSpec.makeMeasureSpec(daVar.P, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(daVar.Q + daVar.R, TLObject.FLAG_30));
        daVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        to toVar = daVar.z2;
        if (toVar != null) {
            toVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        e9 e9Var = daVar.J0;
        if (e9Var != null) {
            e9Var.measure(View.MeasureSpec.makeMeasureSpec(daVar.P, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            kz emojiView = t9Var.f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        h9 h9Var = daVar.s1;
        if (h9Var != null) {
            kz kzVar = h9Var.m2;
            if (kzVar != null) {
                kzVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(daVar.s1.m2.getLayoutParams().height, TLObject.FLAG_30));
            }
            pk0 pk0Var = daVar.s1.W1;
            if (pk0Var != null) {
                measureChild(pk0Var, i10, i11);
                if (daVar.s1.W1.getReactionsWindow() != null) {
                    measureChild(daVar.s1.W1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof m0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof org.telegram.ui.Components.za) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (daVar.S ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        n9 n9Var = daVar.o1;
        if (n9Var != null) {
            n9Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            daVar.o1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        o9 o9Var = daVar.p1;
        if (o9Var != null) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            daVar.p1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
