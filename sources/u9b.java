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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class u9b extends ela {
    public final ai4 m0;
    public final ScaleGestureDetector n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public float r0;
    public float s0;
    public float t0;
    public final /* synthetic */ v9b u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9b(v9b v9bVar, Activity activity) {
        super(activity, null);
        this.u0 = v9bVar;
        this.q0 = false;
        this.m0 = new ai4(activity, new s9b(this));
        this.n0 = new ScaleGestureDetector(activity, new t9b(this));
    }

    public final void X(float f, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        v9b v9bVar = this.u0;
        float width2 = width / v9bVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = v9bVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = v9bVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(v9bVar.i0.getX() + v9bVar.r.getX(), v9bVar.i0.getY() + v9bVar.r.getY());
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
        canvas.translate(v9bVar.r.getX(), v9bVar.r.getY());
        for (int i = 0; i < v9bVar.r.getChildCount(); i++) {
            View childAt = v9bVar.r.getChildAt(i);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == v9bVar.i0) {
                    for (int i2 = 0; i2 < v9bVar.i0.getChildCount(); i2++) {
                        View childAt2 = v9bVar.i0.getChildAt(i2);
                        if (childAt2 != v9bVar.Y0 && childAt2 != v9bVar.C0 && childAt2.getVisibility() == 0) {
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
    @Override // ela, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        ?? r11;
        z8b z8bVar;
        float f;
        float f2;
        g29 g29Var;
        v9b v9bVar = this.u0;
        RectF rectF = v9bVar.I;
        Path path = v9bVar.f0;
        RectF rectF2 = v9bVar.e0;
        RectF rectF3 = v9bVar.d0;
        Float f3 = v9bVar.M;
        float floatValue = f3 != null ? f3.floatValue() : v9bVar.L;
        if (!v9bVar.K) {
            canvas.drawColor(on2.p(-16777216, (int) ((1.0f - floatValue) * v9bVar.J * 255.0f)));
        }
        float R1 = gm.R1(v9bVar.H, 0.0f, v9bVar.J);
        if (v9bVar.J != 1.0f) {
            boolean z3 = v9bVar.K;
            if (z3) {
                boolean z4 = false;
                z = z4;
                if (z3) {
                    v9bVar.h();
                    z = z4;
                }
            } else {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(v9bVar.r.getTranslationX(), v9bVar.r.getTranslationY());
                gm.X1(rectF, rectF2, v9bVar.J, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, R1, R1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(v9bVar.J * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (v9bVar.r.getTranslationY() * v9bVar.J));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z2 = true;
                z8bVar = v9bVar.w1;
                if (z8bVar != null) {
                    u9b u9bVar = z8bVar.C1;
                    float[] fArr = z8bVar.d2;
                    if (z8bVar.T1) {
                        z8bVar.T1 = r11;
                        if (z8bVar.P1 != null && (g29Var = z8bVar.Q1) != null) {
                            fArr[r11] = g29Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = z8bVar.Q1.getMeasuredHeight() / 2.0f;
                            z8bVar.Q1.getMatrix().mapPoints(fArr);
                            f = 1.0f;
                            float scaleX = fArr[1] - (z8bVar.Q1.getScaleX() * (z8bVar.Q1.getMeasuredHeight() / 2.0f));
                            f2 = 0.0f;
                            float scaleX2 = (z8bVar.Q1.getScaleX() * (z8bVar.Q1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX >= gm.L(120.0f) || scaleX2 <= u9bVar.getMeasuredHeight() - gm.L(200.0f)) {
                                float L = gm.L(120.0f);
                                v29 v29Var = z8bVar.P1;
                                if (scaleX < L) {
                                    v29Var.setTop(true);
                                    z8bVar.P1.setTranslationY((z8bVar.Q1.getScaleX() * (z8bVar.Q1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                                } else {
                                    v29Var.setTop((boolean) r11);
                                    z8bVar.P1.setTranslationY((scaleX - r7.getMeasuredHeight()) + gm.L(16.0f));
                                }
                            } else {
                                z8bVar.P1.setTop((boolean) r11);
                                z8bVar.P1.setTranslationY(gm.L(16.0f) + (gm.L(120.0f) - z8bVar.P1.getMeasuredHeight()));
                            }
                            if (fArr[r11] < z8bVar.getMeasuredWidth() / 2.0f) {
                                z8bVar.P1.setMirrorX(true);
                                float measuredWidth = ((z8bVar.P1.getMeasuredWidth() / 2.0f) + z8bVar.P1.getX()) - (fArr[r11] - (z8bVar.Q1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    z8bVar.P1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((z8bVar.P1.getMeasuredWidth() / 2.0f) + z8bVar.P1.getX()) - ((z8bVar.Q1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    z8bVar.P1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                z8bVar.P1.setMirrorX(r11);
                            }
                            z8bVar.P1.setTranslationX((u9bVar.getMeasuredWidth() - z8bVar.P1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z2) {
                                canvas.restore();
                                canvas.restore();
                                if (v9bVar.G != null) {
                                    float i = Utilities.i(f - (v9bVar.J * 1.5f), f, f2);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    rectF3.width();
                                    rectF3.height();
                                    q9b q9bVar = v9bVar.G;
                                    ImageReceiver imageReceiver = q9bVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.k0(rectF3);
                                        ImageReceiver imageReceiver2 = v9bVar.G.e;
                                        int i2 = imageReceiver2.X0[r11];
                                        imageReceiver2.q0((int) R1);
                                        v9bVar.G.e.setAlpha(i);
                                        v9bVar.G.e.h(canvas, null);
                                        v9bVar.G.e.q0(i2);
                                    } else {
                                        vca vcaVar = q9bVar.d;
                                        if (vcaVar != null) {
                                            vcaVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            vca vcaVar2 = v9bVar.G.d;
                                            vcaVar2.g = (int) mlb.C(i, 255.0f, i, i);
                                            vcaVar2.draw(canvas);
                                        }
                                    }
                                    v9bVar.G.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    v9bVar.G.a(canvas, i);
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
        z8bVar = v9bVar.w1;
        if (z8bVar != null) {
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
        this.u0.K();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.o0 = false;
        v9b v9bVar = this.u0;
        wl2 wl2Var = v9bVar.J0;
        if (wl2Var != null && wl2Var.e) {
            float y = v9bVar.J0.getY() + v9bVar.j0.getY() + v9bVar.r.getY();
            if ((motionEvent.getY() >= y && motionEvent.getY() <= y + v9bVar.J0.getHeight()) || this.p0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = true;
                }
                this.p0 = z;
                return super.dispatchTouchEvent(motionEvent);
            }
            v9bVar.J0.a(false, true);
            v9bVar.l0(true);
        }
        if (this.p0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.p0 = false;
        }
        this.n0.onTouchEvent(motionEvent);
        this.m0.I(motionEvent);
        if (motionEvent.getAction() == 1 && !this.o0) {
            if (v9bVar.r.getTranslationY() <= 0.0f) {
                wt4 wt4Var = v9bVar.N0;
                if (wt4Var != null && wt4Var.getTranslationY() > 0.0f && !v9bVar.M0) {
                    v9bVar.c(!v9bVar.R1 && v9bVar.N0.getTranslationY() < ((float) v9bVar.N0.getPadding()));
                }
            } else if (v9bVar.L > 0.4f) {
                v9bVar.o(true);
            } else {
                v9bVar.b();
            }
            v9bVar.M0 = false;
            v9bVar.X = false;
            v9bVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // ela
    public int getBottomPadding() {
        int height = getHeight();
        v9b v9bVar = this.u0;
        return (height - v9bVar.r.getBottom()) + v9bVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.u0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        v9b v9bVar = this.u0;
        return (height - v9bVar.c0) - v9bVar.r.getBottom();
    }

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        e34 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        v9b v9bVar = this.u0;
        int i6 = v9bVar.a0;
        int measuredHeight2 = v9bVar.n0.getMeasuredHeight();
        if (v9bVar.W) {
            i6 = 0;
        }
        int i7 = v9bVar.T;
        int b = pqe.b((measuredWidth - i7) / 2, v9bVar.Z, (measuredWidth - v9bVar.b0) - i7);
        int i8 = v9bVar.T + b;
        if (v9bVar.W) {
            i5 = v9bVar.U;
        } else {
            int i9 = v9bVar.c0;
            int i10 = v9bVar.U;
            int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
            if (v9bVar.K) {
                float f = v9bVar.I.top;
                if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                    i6 = (int) f;
                    i5 = v9bVar.U;
                }
            }
            if (i11 - i6 >= gm.L(40.0f)) {
                i6 = i11;
            }
            i5 = v9bVar.U;
        }
        v9bVar.r.layout(b, i6, i8, i5 + i6 + measuredHeight2);
        v9bVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        f9b f9bVar = v9bVar.D2;
        if (f9bVar != null) {
            f9bVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        wt4 wt4Var = v9bVar.N0;
        if (wt4Var != null) {
            wt4Var.layout((measuredWidth - wt4Var.getMeasuredWidth()) / 2, 0, (v9bVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        l9b l9bVar = v9bVar.d1;
        if (l9bVar != null && (emojiView = l9bVar.f.getEmojiView()) != null) {
            emojiView.layout(v9bVar.Z, (measuredHeight - v9bVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - v9bVar.b0, measuredHeight - v9bVar.c0);
        }
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            e34 e34Var = z8bVar.j2;
            if (e34Var != null) {
                e34Var.layout(v9bVar.Z, (measuredHeight - v9bVar.c0) - e34Var.getMeasuredHeight(), measuredWidth - v9bVar.b0, measuredHeight - v9bVar.c0);
            }
            v29 v29Var = v9bVar.w1.P1;
            if (v29Var != null) {
                int i12 = v9bVar.Z;
                v29Var.layout(i12, v9bVar.a0, v29Var.getMeasuredWidth() + i12, v9bVar.w1.P1.getMeasuredHeight() + v9bVar.a0);
                su suVar = v9bVar.w1.P1.getReactionsWindow() != null ? v9bVar.w1.P1.getReactionsWindow().c : null;
                if (suVar != null) {
                    int i13 = v9bVar.Z;
                    suVar.layout(i13, v9bVar.a0, suVar.getMeasuredWidth() + i13, suVar.getMeasuredHeight() + v9bVar.a0);
                }
            }
        }
        g9b g9bVar = v9bVar.s1;
        if (g9bVar != null) {
            g9bVar.e.setPadding(0, v9bVar.a0, 0, v9bVar.c0);
            v9bVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            v9bVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        h9b h9bVar = v9bVar.t1;
        if (h9bVar != null) {
            h9bVar.f.setPadding(0, v9bVar.a0, 0, v9bVar.c0);
            v9bVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            v9bVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof xq3) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof k21) {
                childAt.layout(0, i6, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i6);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        v9b v9bVar = this.u0;
        int i3 = (size - v9bVar.Z) - v9bVar.b0;
        int i4 = v9bVar.a0;
        int i5 = v9bVar.c0;
        int ceil = (int) Math.ceil((i3 / 9.0f) * 16.0f);
        int L = gm.L(48.0f);
        v9bVar.V = L;
        int i6 = ceil + L;
        int i7 = size2 - i5;
        if (i6 <= i7) {
            v9bVar.T = i3;
            v9bVar.U = ceil;
            v9bVar.W = i6 > i7 - i4;
        } else {
            v9bVar.W = false;
            v9bVar.U = td4.f(size2, L, i5, i4);
            v9bVar.T = (int) Math.ceil((r8 * 9.0f) / 16.0f);
        }
        v9bVar.V = Utilities.j((size2 - v9bVar.U) - (v9bVar.W ? 0 : i4), gm.L(68.0f), gm.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(v9bVar.W ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        v9bVar.r.measure(View.MeasureSpec.makeMeasureSpec(v9bVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(v9bVar.U + v9bVar.V, TLObject.FLAG_30));
        v9bVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        f9b f9bVar = v9bVar.D2;
        if (f9bVar != null) {
            f9bVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        wt4 wt4Var = v9bVar.N0;
        if (wt4Var != null) {
            wt4Var.measure(View.MeasureSpec.makeMeasureSpec(v9bVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        l9b l9bVar = v9bVar.d1;
        if (l9bVar != null) {
            e34 emojiView = l9bVar.f.getEmojiView();
            Q();
            gm.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            e34 e34Var = z8bVar.j2;
            if (e34Var != null) {
                e34Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(v9bVar.w1.j2.getLayoutParams().height, TLObject.FLAG_30));
            }
            v29 v29Var = v9bVar.w1.P1;
            if (v29Var != null) {
                measureChild(v29Var, i, i2);
                if (v9bVar.w1.P1.getReactionsWindow() != null) {
                    measureChild(v9bVar.w1.P1.getReactionsWindow().c, i, i2);
                }
            }
        }
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof xq3) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof k21) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(340.0f), size2 - (v9bVar.W ? 0 : i4)), TLObject.FLAG_30));
            }
        }
        g9b g9bVar = v9bVar.s1;
        if (g9bVar != null) {
            g9bVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            v9bVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        h9b h9bVar = v9bVar.t1;
        if (h9bVar != null) {
            h9bVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            v9bVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
