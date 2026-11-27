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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class qbb extends wma {
    public final xh4 g0;
    public final ScaleGestureDetector h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public float n0;
    public final /* synthetic */ rbb o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbb(rbb rbbVar, Activity activity) {
        super(activity, null);
        this.o0 = rbbVar;
        this.k0 = false;
        this.g0 = new xh4(activity, new obb(this));
        this.h0 = new ScaleGestureDetector(activity, new pbb(this));
    }

    public final void X(float f, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        rbb rbbVar = this.o0;
        float width2 = width / rbbVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = rbbVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = rbbVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(rbbVar.i0.getX() + rbbVar.r.getX(), rbbVar.i0.getY() + rbbVar.r.getY());
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
        canvas.translate(rbbVar.r.getX(), rbbVar.r.getY());
        for (int i = 0; i < rbbVar.r.getChildCount(); i++) {
            View childAt = rbbVar.r.getChildAt(i);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == rbbVar.i0) {
                    for (int i2 = 0; i2 < rbbVar.i0.getChildCount(); i2++) {
                        View childAt2 = rbbVar.i0.getChildAt(i2);
                        if (childAt2 != rbbVar.Y0 && childAt2 != rbbVar.C0 && childAt2.getVisibility() == 0) {
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
        vab vabVar;
        float f;
        float f2;
        s39 s39Var;
        rbb rbbVar = this.o0;
        RectF rectF = rbbVar.I;
        Path path = rbbVar.f0;
        RectF rectF2 = rbbVar.e0;
        RectF rectF3 = rbbVar.d0;
        Float f3 = rbbVar.M;
        float floatValue = f3 != null ? f3.floatValue() : rbbVar.L;
        if (!rbbVar.K) {
            canvas.drawColor(vm2.o(-16777216, (int) ((1.0f - floatValue) * rbbVar.J * 255.0f)));
        }
        float R1 = hl.R1(rbbVar.H, 0.0f, rbbVar.J);
        if (rbbVar.J != 1.0f) {
            boolean z3 = rbbVar.K;
            if (z3) {
                boolean z4 = false;
                z = z4;
                if (z3) {
                    rbbVar.h();
                    z = z4;
                }
            } else {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(rbbVar.r.getTranslationX(), rbbVar.r.getTranslationY());
                hl.X1(rectF, rectF2, rbbVar.J, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, R1, R1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(rbbVar.J * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (rbbVar.r.getTranslationY() * rbbVar.J));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z2 = true;
                vabVar = rbbVar.w1;
                if (vabVar != null) {
                    qbb qbbVar = vabVar.w1;
                    float[] fArr = vabVar.X1;
                    if (vabVar.N1) {
                        vabVar.N1 = r11;
                        if (vabVar.J1 != null && (s39Var = vabVar.K1) != null) {
                            fArr[r11] = s39Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = vabVar.K1.getMeasuredHeight() / 2.0f;
                            vabVar.K1.getMatrix().mapPoints(fArr);
                            f = 1.0f;
                            float scaleX = fArr[1] - (vabVar.K1.getScaleX() * (vabVar.K1.getMeasuredHeight() / 2.0f));
                            f2 = 0.0f;
                            float scaleX2 = (vabVar.K1.getScaleX() * (vabVar.K1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX >= hl.L(120.0f) || scaleX2 <= qbbVar.getMeasuredHeight() - hl.L(200.0f)) {
                                float L = hl.L(120.0f);
                                i49 i49Var = vabVar.J1;
                                if (scaleX < L) {
                                    i49Var.setTop(true);
                                    vabVar.J1.setTranslationY((vabVar.K1.getScaleX() * (vabVar.K1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                                } else {
                                    i49Var.setTop((boolean) r11);
                                    vabVar.J1.setTranslationY((scaleX - r7.getMeasuredHeight()) + hl.L(16.0f));
                                }
                            } else {
                                vabVar.J1.setTop((boolean) r11);
                                vabVar.J1.setTranslationY(hl.L(16.0f) + (hl.L(120.0f) - vabVar.J1.getMeasuredHeight()));
                            }
                            if (fArr[r11] < vabVar.getMeasuredWidth() / 2.0f) {
                                vabVar.J1.setMirrorX(true);
                                float measuredWidth = ((vabVar.J1.getMeasuredWidth() / 2.0f) + vabVar.J1.getX()) - (fArr[r11] - (vabVar.K1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    vabVar.J1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((vabVar.J1.getMeasuredWidth() / 2.0f) + vabVar.J1.getX()) - ((vabVar.K1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    vabVar.J1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                vabVar.J1.setMirrorX(r11);
                            }
                            vabVar.J1.setTranslationX((qbbVar.getMeasuredWidth() - vabVar.J1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z2) {
                                canvas.restore();
                                canvas.restore();
                                if (rbbVar.G != null) {
                                    float i = Utilities.i(f - (rbbVar.J * 1.5f), f, f2);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    rectF3.width();
                                    rectF3.height();
                                    mbb mbbVar = rbbVar.G;
                                    ImageReceiver imageReceiver = mbbVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.k0(rectF3);
                                        ImageReceiver imageReceiver2 = rbbVar.G.e;
                                        int i2 = imageReceiver2.X0[r11];
                                        imageReceiver2.q0((int) R1);
                                        rbbVar.G.e.setAlpha(i);
                                        rbbVar.G.e.h(canvas, null);
                                        rbbVar.G.e.q0(i2);
                                    } else {
                                        mea meaVar = mbbVar.d;
                                        if (meaVar != null) {
                                            meaVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            mea meaVar2 = rbbVar.G.d;
                                            meaVar2.g = (int) xnb.C(i, 255.0f, i, i);
                                            meaVar2.draw(canvas);
                                        }
                                    }
                                    rbbVar.G.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    rbbVar.G.a(canvas, i);
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
        vabVar = rbbVar.w1;
        if (vabVar != null) {
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
        rbb rbbVar = this.o0;
        el2 el2Var = rbbVar.J0;
        if (el2Var != null && el2Var.e) {
            float y = rbbVar.J0.getY() + rbbVar.j0.getY() + rbbVar.r.getY();
            if ((motionEvent.getY() >= y && motionEvent.getY() <= y + rbbVar.J0.getHeight()) || this.j0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = true;
                }
                this.j0 = z;
                return super.dispatchTouchEvent(motionEvent);
            }
            rbbVar.J0.a(false, true);
            rbbVar.l0(true);
        }
        if (this.j0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.j0 = false;
        }
        this.h0.onTouchEvent(motionEvent);
        this.g0.E(motionEvent);
        if (motionEvent.getAction() == 1 && !this.i0) {
            if (rbbVar.r.getTranslationY() <= 0.0f) {
                zt4 zt4Var = rbbVar.N0;
                if (zt4Var != null && zt4Var.getTranslationY() > 0.0f && !rbbVar.M0) {
                    rbbVar.c(!rbbVar.R1 && rbbVar.N0.getTranslationY() < ((float) rbbVar.N0.getPadding()));
                }
            } else if (rbbVar.L > 0.4f) {
                rbbVar.o(true);
            } else {
                rbbVar.b();
            }
            rbbVar.M0 = false;
            rbbVar.X = false;
            rbbVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // wma
    public int getBottomPadding() {
        int height = getHeight();
        rbb rbbVar = this.o0;
        return (height - rbbVar.r.getBottom()) + rbbVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.o0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        rbb rbbVar = this.o0;
        return (height - rbbVar.c0) - rbbVar.r.getBottom();
    }

    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        o24 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        rbb rbbVar = this.o0;
        int i6 = rbbVar.a0;
        int measuredHeight2 = rbbVar.n0.getMeasuredHeight();
        if (rbbVar.W) {
            i6 = 0;
        }
        int i7 = rbbVar.T;
        int b = ete.b((measuredWidth - i7) / 2, rbbVar.Z, (measuredWidth - rbbVar.b0) - i7);
        int i8 = rbbVar.T + b;
        if (rbbVar.W) {
            i5 = rbbVar.U;
        } else {
            int i9 = rbbVar.c0;
            int i10 = rbbVar.U;
            int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
            if (rbbVar.K) {
                float f = rbbVar.I.top;
                if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                    i6 = (int) f;
                    i5 = rbbVar.U;
                }
            }
            if (i11 - i6 >= hl.L(40.0f)) {
                i6 = i11;
            }
            i5 = rbbVar.U;
        }
        rbbVar.r.layout(b, i6, i8, i5 + i6 + measuredHeight2);
        rbbVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        bbb bbbVar = rbbVar.D2;
        if (bbbVar != null) {
            bbbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        zt4 zt4Var = rbbVar.N0;
        if (zt4Var != null) {
            zt4Var.layout((measuredWidth - zt4Var.getMeasuredWidth()) / 2, 0, (rbbVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        hbb hbbVar = rbbVar.d1;
        if (hbbVar != null && (emojiView = hbbVar.f.getEmojiView()) != null) {
            emojiView.layout(rbbVar.Z, (measuredHeight - rbbVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - rbbVar.b0, measuredHeight - rbbVar.c0);
        }
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            o24 o24Var = vabVar.d2;
            if (o24Var != null) {
                o24Var.layout(rbbVar.Z, (measuredHeight - rbbVar.c0) - o24Var.getMeasuredHeight(), measuredWidth - rbbVar.b0, measuredHeight - rbbVar.c0);
            }
            i49 i49Var = rbbVar.w1.J1;
            if (i49Var != null) {
                int i12 = rbbVar.Z;
                i49Var.layout(i12, rbbVar.a0, i49Var.getMeasuredWidth() + i12, rbbVar.w1.J1.getMeasuredHeight() + rbbVar.a0);
                tt ttVar = rbbVar.w1.J1.getReactionsWindow() != null ? rbbVar.w1.J1.getReactionsWindow().c : null;
                if (ttVar != null) {
                    int i13 = rbbVar.Z;
                    ttVar.layout(i13, rbbVar.a0, ttVar.getMeasuredWidth() + i13, ttVar.getMeasuredHeight() + rbbVar.a0);
                }
            }
        }
        cbb cbbVar = rbbVar.s1;
        if (cbbVar != null) {
            cbbVar.e.setPadding(0, rbbVar.a0, 0, rbbVar.c0);
            rbbVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            rbbVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        dbb dbbVar = rbbVar.t1;
        if (dbbVar != null) {
            dbbVar.f.setPadding(0, rbbVar.a0, 0, rbbVar.c0);
            rbbVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            rbbVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
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
        rbb rbbVar = this.o0;
        int i3 = (size - rbbVar.Z) - rbbVar.b0;
        int i4 = rbbVar.a0;
        int i5 = rbbVar.c0;
        int ceil = (int) Math.ceil((i3 / 9.0f) * 16.0f);
        int L = hl.L(48.0f);
        rbbVar.V = L;
        int i6 = ceil + L;
        int i7 = size2 - i5;
        if (i6 <= i7) {
            rbbVar.T = i3;
            rbbVar.U = ceil;
            rbbVar.W = i6 > i7 - i4;
        } else {
            rbbVar.W = false;
            rbbVar.U = qd4.f(size2, L, i5, i4);
            rbbVar.T = (int) Math.ceil((r8 * 9.0f) / 16.0f);
        }
        rbbVar.V = Utilities.j((size2 - rbbVar.U) - (rbbVar.W ? 0 : i4), hl.L(68.0f), hl.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(rbbVar.W ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        rbbVar.r.measure(View.MeasureSpec.makeMeasureSpec(rbbVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(rbbVar.U + rbbVar.V, TLObject.FLAG_30));
        rbbVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        bbb bbbVar = rbbVar.D2;
        if (bbbVar != null) {
            bbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        zt4 zt4Var = rbbVar.N0;
        if (zt4Var != null) {
            zt4Var.measure(View.MeasureSpec.makeMeasureSpec(rbbVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        hbb hbbVar = rbbVar.d1;
        if (hbbVar != null) {
            o24 emojiView = hbbVar.f.getEmojiView();
            Q();
            hl.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            o24 o24Var = vabVar.d2;
            if (o24Var != null) {
                o24Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(rbbVar.w1.d2.getLayoutParams().height, TLObject.FLAG_30));
            }
            i49 i49Var = rbbVar.w1.J1;
            if (i49Var != null) {
                measureChild(i49Var, i, i2);
                if (rbbVar.w1.J1.getReactionsWindow() != null) {
                    measureChild(rbbVar.w1.J1.getReactionsWindow().c, i, i2);
                }
            }
        }
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof eq3) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof l11) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(340.0f), size2 - (rbbVar.W ? 0 : i4)), TLObject.FLAG_30));
            }
        }
        cbb cbbVar = rbbVar.s1;
        if (cbbVar != null) {
            cbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            rbbVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        dbb dbbVar = rbbVar.t1;
        if (dbbVar != null) {
            dbbVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            rbbVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
