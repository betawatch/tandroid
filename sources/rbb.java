// default package

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class rbb extends wma {
    public final xh4 g0;
    public final ScaleGestureDetector h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public float n0;
    public final /* synthetic */ sbb o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbb(sbb sbbVar, Activity activity) {
        super(activity, null);
        this.o0 = sbbVar;
        this.k0 = false;
        this.g0 = new xh4(activity, new pbb(this));
        this.h0 = new ScaleGestureDetector(activity, new qbb(this));
    }

    public final void X(float f, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        sbb sbbVar = this.o0;
        float width2 = width / sbbVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = sbbVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = sbbVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(sbbVar.i0.getX() + sbbVar.r.getX(), sbbVar.i0.getY() + sbbVar.r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f), (int) (textureView.getHeight() / f));
                float f2 = 1.0f / width2;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(sbbVar.r.getX(), sbbVar.r.getY());
        for (int i = 0; i < sbbVar.r.getChildCount(); i++) {
            View childAt = sbbVar.r.getChildAt(i);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == sbbVar.i0) {
                    for (int i2 = 0; i2 < sbbVar.i0.getChildCount(); i2++) {
                        View childAt2 = sbbVar.i0.getChildAt(i2);
                        if (childAt2 != sbbVar.Y0 && childAt2 != sbbVar.C0 && childAt2.getVisibility() == 0) {
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // wma, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        ?? r11;
        wab wabVar;
        float f;
        float f2;
        s39 s39Var;
        sbb sbbVar = this.o0;
        RectF rectF = sbbVar.I;
        Path path = sbbVar.f0;
        RectF rectF2 = sbbVar.e0;
        RectF rectF3 = sbbVar.d0;
        Float f3 = sbbVar.M;
        float floatValue = f3 != null ? f3.floatValue() : sbbVar.L;
        if (!sbbVar.K) {
            canvas.drawColor(vm2.o(-16777216, (int) ((1.0f - floatValue) * sbbVar.J * 255.0f)));
        }
        float R1 = hl.R1(sbbVar.H, 0.0f, sbbVar.J);
        if (sbbVar.J != 1.0f) {
            boolean z3 = sbbVar.K;
            if (z3) {
                boolean z4 = false;
                z = z4;
                if (z3) {
                    sbbVar.h();
                    z = z4;
                }
            } else {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(sbbVar.r.getTranslationX(), sbbVar.r.getTranslationY());
                hl.X1(rectF, rectF2, sbbVar.J, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, R1, R1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(sbbVar.J * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (sbbVar.r.getTranslationY() * sbbVar.J));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z2 = true;
                wabVar = sbbVar.w1;
                if (wabVar != null) {
                    rbb rbbVar = wabVar.w1;
                    float[] fArr = wabVar.X1;
                    if (wabVar.N1) {
                        wabVar.N1 = r11;
                        if (wabVar.J1 != null && (s39Var = wabVar.K1) != null) {
                            fArr[r11] = s39Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = wabVar.K1.getMeasuredHeight() / 2.0f;
                            wabVar.K1.getMatrix().mapPoints(fArr);
                            f = 1.0f;
                            float scaleX = fArr[1] - (wabVar.K1.getScaleX() * (wabVar.K1.getMeasuredHeight() / 2.0f));
                            f2 = 0.0f;
                            float scaleX2 = (wabVar.K1.getScaleX() * (wabVar.K1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX >= hl.L(120.0f) || scaleX2 <= rbbVar.getMeasuredHeight() - hl.L(200.0f)) {
                                float L = hl.L(120.0f);
                                i49 i49Var = wabVar.J1;
                                if (scaleX < L) {
                                    i49Var.setTop(true);
                                    wabVar.J1.setTranslationY((wabVar.K1.getScaleX() * (wabVar.K1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                                } else {
                                    i49Var.setTop((boolean) r11);
                                    wabVar.J1.setTranslationY((scaleX - r7.getMeasuredHeight()) + hl.L(16.0f));
                                }
                            } else {
                                wabVar.J1.setTop((boolean) r11);
                                wabVar.J1.setTranslationY(hl.L(16.0f) + (hl.L(120.0f) - wabVar.J1.getMeasuredHeight()));
                            }
                            if (fArr[r11] < wabVar.getMeasuredWidth() / 2.0f) {
                                wabVar.J1.setMirrorX(true);
                                float measuredWidth = ((wabVar.J1.getMeasuredWidth() / 2.0f) + wabVar.J1.getX()) - (fArr[r11] - (wabVar.K1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    wabVar.J1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((wabVar.J1.getMeasuredWidth() / 2.0f) + wabVar.J1.getX()) - ((wabVar.K1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    wabVar.J1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                wabVar.J1.setMirrorX(r11);
                            }
                            wabVar.J1.setTranslationX((rbbVar.getMeasuredWidth() - wabVar.J1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z2) {
                                canvas.restore();
                                canvas.restore();
                                if (sbbVar.G != null) {
                                    float i = Utilities.i(f - (sbbVar.J * 1.5f), f, f2);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    rectF3.width();
                                    rectF3.height();
                                    nbb nbbVar = sbbVar.G;
                                    ImageReceiver imageReceiver = nbbVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.k0(rectF3);
                                        ImageReceiver imageReceiver2 = sbbVar.G.e;
                                        int i2 = imageReceiver2.X0[r11];
                                        imageReceiver2.q0((int) R1);
                                        sbbVar.G.e.setAlpha(i);
                                        sbbVar.G.e.h(canvas, null);
                                        sbbVar.G.e.q0(i2);
                                    } else {
                                        mea meaVar = nbbVar.d;
                                        if (meaVar != null) {
                                            meaVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            mea meaVar2 = sbbVar.G.d;
                                            meaVar2.g = (int) xnb.C(i, 255.0f, i, i);
                                            meaVar2.draw(canvas);
                                        }
                                    }
                                    sbbVar.G.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    sbbVar.G.a(canvas, i);
                                    canvas.restore();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                f = 1.0f;
                f2 = 0.0f;
                super.dispatchDraw(canvas);
                if (z2) {
                }
            }
        } else {
            z = false;
        }
        z2 = z ? 1 : 0;
        r11 = z;
        wabVar = sbbVar.w1;
        if (wabVar != null) {
        }
        f = 1.0f;
        f2 = 0.0f;
        super.dispatchDraw(canvas);
        if (z2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.o0.K();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.i0 = false;
        sbb sbbVar = this.o0;
        el2 el2Var = sbbVar.J0;
        if (el2Var != null && el2Var.e) {
            float y = sbbVar.J0.getY() + sbbVar.j0.getY() + sbbVar.r.getY();
            if ((motionEvent.getY() >= y && motionEvent.getY() <= y + sbbVar.J0.getHeight()) || this.j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = true;
                }
                this.j0 = z;
                return super.dispatchTouchEvent(motionEvent);
            }
            sbbVar.J0.a(false, true);
            sbbVar.l0(true);
        }
        if (this.j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.j0 = false;
        }
        this.h0.onTouchEvent(motionEvent);
        this.g0.E(motionEvent);
        if (motionEvent.getAction() == 1 && !this.i0) {
            if (sbbVar.r.getTranslationY() <= 0.0f) {
                zt4 zt4Var = sbbVar.N0;
                if (zt4Var != null && zt4Var.getTranslationY() > 0.0f && !sbbVar.M0) {
                    sbbVar.c(!sbbVar.R1 && sbbVar.N0.getTranslationY() < ((float) sbbVar.N0.getPadding()));
                }
            } else if (sbbVar.L > 0.4f) {
                sbbVar.o(true);
            } else {
                sbbVar.b();
            }
            sbbVar.M0 = false;
            sbbVar.X = false;
            sbbVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // wma
    public int getBottomPadding() {
        int height = getHeight();
        sbb sbbVar = this.o0;
        return (height - sbbVar.r.getBottom()) + sbbVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.o0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sbb sbbVar = this.o0;
        return (height - sbbVar.c0) - sbbVar.r.getBottom();
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        o24 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sbb sbbVar = this.o0;
        int i6 = sbbVar.a0;
        int measuredHeight2 = sbbVar.n0.getMeasuredHeight();
        if (sbbVar.W) {
            i6 = 0;
        }
        int i7 = sbbVar.T;
        int b = ete.b((measuredWidth - i7) / 2, sbbVar.Z, (measuredWidth - sbbVar.b0) - i7);
        int i8 = sbbVar.T + b;
        if (sbbVar.W) {
            i5 = sbbVar.U;
        } else {
            int i9 = sbbVar.c0;
            int i10 = sbbVar.U;
            int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
            if (sbbVar.K) {
                float f = sbbVar.I.top;
                if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                    i6 = (int) f;
                    i5 = sbbVar.U;
                }
            }
            if (i11 - i6 >= hl.L(40.0f)) {
                i6 = i11;
            }
            i5 = sbbVar.U;
        }
        sbbVar.r.layout(b, i6, i8, i5 + i6 + measuredHeight2);
        sbbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        cbb cbbVar = sbbVar.D2;
        if (cbbVar != null) {
            cbbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        zt4 zt4Var = sbbVar.N0;
        if (zt4Var != null) {
            zt4Var.layout((measuredWidth - zt4Var.getMeasuredWidth()) / 2, 0, (sbbVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ibb ibbVar = sbbVar.d1;
        if (ibbVar != null && (emojiView = ibbVar.f.getEmojiView()) != null) {
            emojiView.layout(sbbVar.Z, (measuredHeight - sbbVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - sbbVar.b0, measuredHeight - sbbVar.c0);
        }
        wab wabVar = sbbVar.w1;
        if (wabVar != null) {
            o24 o24Var = wabVar.d2;
            if (o24Var != null) {
                o24Var.layout(sbbVar.Z, (measuredHeight - sbbVar.c0) - o24Var.getMeasuredHeight(), measuredWidth - sbbVar.b0, measuredHeight - sbbVar.c0);
            }
            i49 i49Var = sbbVar.w1.J1;
            if (i49Var != null) {
                int i12 = sbbVar.Z;
                i49Var.layout(i12, sbbVar.a0, i49Var.getMeasuredWidth() + i12, sbbVar.w1.J1.getMeasuredHeight() + sbbVar.a0);
                tt ttVar = sbbVar.w1.J1.getReactionsWindow() != null ? sbbVar.w1.J1.getReactionsWindow().c : null;
                if (ttVar != null) {
                    int i13 = sbbVar.Z;
                    ttVar.layout(i13, sbbVar.a0, ttVar.getMeasuredWidth() + i13, ttVar.getMeasuredHeight() + sbbVar.a0);
                }
            }
        }
        dbb dbbVar = sbbVar.s1;
        if (dbbVar != null) {
            dbbVar.e.setPadding(0, sbbVar.a0, 0, sbbVar.c0);
            sbbVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            sbbVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        ebb ebbVar = sbbVar.t1;
        if (ebbVar != null) {
            ebbVar.f.setPadding(0, sbbVar.a0, 0, sbbVar.c0);
            sbbVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            sbbVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof eq3) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof l11) {
                childAt.layout(0, i6, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i6);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        sbb sbbVar = this.o0;
        int i3 = (size - sbbVar.Z) - sbbVar.b0;
        int i4 = sbbVar.a0;
        int i5 = sbbVar.c0;
        int ceil = (int) Math.ceil((i3 / 9.0f) * 16.0f);
        int L = hl.L(48.0f);
        sbbVar.V = L;
        int i6 = ceil + L;
        int i7 = size2 - i5;
        if (i6 <= i7) {
            sbbVar.T = i3;
            sbbVar.U = ceil;
            sbbVar.W = i6 > i7 - i4;
        } else {
            sbbVar.W = false;
            sbbVar.U = qd4.f(size2, L, i5, i4);
            sbbVar.T = (int) Math.ceil((r8 * 9.0f) / 16.0f);
        }
        sbbVar.V = Utilities.j((size2 - sbbVar.U) - (sbbVar.W ? 0 : i4), hl.L(68.0f), hl.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(sbbVar.W ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        sbbVar.r.measure(View.MeasureSpec.makeMeasureSpec(sbbVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sbbVar.U + sbbVar.V, TLObject.FLAG_30));
        sbbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        cbb cbbVar = sbbVar.D2;
        if (cbbVar != null) {
            cbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        zt4 zt4Var = sbbVar.N0;
        if (zt4Var != null) {
            zt4Var.measure(View.MeasureSpec.makeMeasureSpec(sbbVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ibb ibbVar = sbbVar.d1;
        if (ibbVar != null) {
            o24 emojiView = ibbVar.f.getEmojiView();
            Q();
            hl.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        wab wabVar = sbbVar.w1;
        if (wabVar != null) {
            o24 o24Var = wabVar.d2;
            if (o24Var != null) {
                o24Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sbbVar.w1.d2.getLayoutParams().height, TLObject.FLAG_30));
            }
            i49 i49Var = sbbVar.w1.J1;
            if (i49Var != null) {
                measureChild(i49Var, i, i2);
                if (sbbVar.w1.J1.getReactionsWindow() != null) {
                    measureChild(sbbVar.w1.J1.getReactionsWindow().c, i, i2);
                }
            }
        }
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof eq3) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof l11) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(340.0f), size2 - (sbbVar.W ? 0 : i4)), TLObject.FLAG_30));
            }
        }
        dbb dbbVar = sbbVar.s1;
        if (dbbVar != null) {
            dbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            sbbVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        ebb ebbVar = sbbVar.t1;
        if (ebbVar != null) {
            ebbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            sbbVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
