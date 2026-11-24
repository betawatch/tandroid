// default package

import android.content.Context;
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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class s7b extends cja {
    public final z24 m0;
    public final ScaleGestureDetector n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public float r0;
    public float s0;
    public float t0;
    public final /* synthetic */ t7b u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7b(t7b t7bVar, Context context) {
        super(context, null);
        this.u0 = t7bVar;
        this.q0 = false;
        this.m0 = new z24(context, new q7b(this));
        this.n0 = new ScaleGestureDetector(context, new r7b(this));
    }

    public final void X(float f, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        t7b t7bVar = this.u0;
        float width2 = width / t7bVar.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = t7bVar.Y0.getTextureView();
        if (textureView == null) {
            textureView = t7bVar.Y0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(t7bVar.i0.getX() + t7bVar.r.getX(), t7bVar.i0.getY() + t7bVar.r.getY());
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
        canvas.translate(t7bVar.r.getX(), t7bVar.r.getY());
        for (int i = 0; i < t7bVar.r.getChildCount(); i++) {
            View childAt = t7bVar.r.getChildAt(i);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == t7bVar.i0) {
                    for (int i2 = 0; i2 < t7bVar.i0.getChildCount(); i2++) {
                        View childAt2 = t7bVar.i0.getChildAt(i2);
                        if (childAt2 != t7bVar.Y0 && childAt2 != t7bVar.C0 && childAt2.getVisibility() == 0) {
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
    @Override // cja, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        ?? r11;
        x6b x6bVar;
        float f;
        float f2;
        e09 e09Var;
        t7b t7bVar = this.u0;
        RectF rectF = t7bVar.I;
        Path path = t7bVar.f0;
        RectF rectF2 = t7bVar.e0;
        RectF rectF3 = t7bVar.d0;
        Float f3 = t7bVar.M;
        float floatValue = f3 != null ? f3.floatValue() : t7bVar.L;
        if (!t7bVar.K) {
            canvas.drawColor(bm2.o(-16777216, (int) ((1.0f - floatValue) * t7bVar.J * 255.0f)));
        }
        float R1 = gl.R1(t7bVar.H, 0.0f, t7bVar.J);
        if (t7bVar.J != 1.0f) {
            boolean z3 = t7bVar.K;
            if (z3) {
                boolean z4 = false;
                z = z4;
                if (z3) {
                    t7bVar.h();
                    z = z4;
                }
            } else {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(t7bVar.r.getTranslationX(), t7bVar.r.getTranslationY());
                gl.X1(rectF, rectF2, t7bVar.J, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, R1, R1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(t7bVar.J * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (t7bVar.r.getTranslationY() * t7bVar.J));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z2 = true;
                x6bVar = t7bVar.w1;
                if (x6bVar != null) {
                    s7b s7bVar = x6bVar.C1;
                    float[] fArr = x6bVar.d2;
                    if (x6bVar.T1) {
                        x6bVar.T1 = r11;
                        if (x6bVar.P1 != null && (e09Var = x6bVar.Q1) != null) {
                            fArr[r11] = e09Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = x6bVar.Q1.getMeasuredHeight() / 2.0f;
                            x6bVar.Q1.getMatrix().mapPoints(fArr);
                            f = 1.0f;
                            float scaleX = fArr[1] - (x6bVar.Q1.getScaleX() * (x6bVar.Q1.getMeasuredHeight() / 2.0f));
                            f2 = 0.0f;
                            float scaleX2 = (x6bVar.Q1.getScaleX() * (x6bVar.Q1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX >= gl.L(120.0f) || scaleX2 <= s7bVar.getMeasuredHeight() - gl.L(200.0f)) {
                                float L = gl.L(120.0f);
                                t09 t09Var = x6bVar.P1;
                                if (scaleX < L) {
                                    t09Var.setTop(true);
                                    x6bVar.P1.setTranslationY((x6bVar.Q1.getScaleX() * (x6bVar.Q1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                                } else {
                                    t09Var.setTop((boolean) r11);
                                    x6bVar.P1.setTranslationY((scaleX - r7.getMeasuredHeight()) + gl.L(16.0f));
                                }
                            } else {
                                x6bVar.P1.setTop((boolean) r11);
                                x6bVar.P1.setTranslationY(gl.L(16.0f) + (gl.L(120.0f) - x6bVar.P1.getMeasuredHeight()));
                            }
                            if (fArr[r11] < x6bVar.getMeasuredWidth() / 2.0f) {
                                x6bVar.P1.setMirrorX(true);
                                float measuredWidth = ((x6bVar.P1.getMeasuredWidth() / 2.0f) + x6bVar.P1.getX()) - (fArr[r11] - (x6bVar.Q1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    x6bVar.P1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((x6bVar.P1.getMeasuredWidth() / 2.0f) + x6bVar.P1.getX()) - ((x6bVar.Q1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    x6bVar.P1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                x6bVar.P1.setMirrorX(r11);
                            }
                            x6bVar.P1.setTranslationX((s7bVar.getMeasuredWidth() - x6bVar.P1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z2) {
                                canvas.restore();
                                canvas.restore();
                                if (t7bVar.G != null) {
                                    float i = Utilities.i(f - (t7bVar.J * 1.5f), f, f2);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    rectF3.width();
                                    rectF3.height();
                                    o7b o7bVar = t7bVar.G;
                                    ImageReceiver imageReceiver = o7bVar.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.k0(rectF3);
                                        ImageReceiver imageReceiver2 = t7bVar.G.e;
                                        int i2 = imageReceiver2.X0[r11];
                                        imageReceiver2.q0((int) R1);
                                        t7bVar.G.e.setAlpha(i);
                                        t7bVar.G.e.h(canvas, null);
                                        t7bVar.G.e.q0(i2);
                                    } else {
                                        vaa vaaVar = o7bVar.d;
                                        if (vaaVar != null) {
                                            vaaVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            vaa vaaVar2 = t7bVar.G.d;
                                            vaaVar2.g = (int) yjb.C(i, 255.0f, i, i);
                                            vaaVar2.draw(canvas);
                                        }
                                    }
                                    t7bVar.G.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    t7bVar.G.a(canvas, i);
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
        x6bVar = t7bVar.w1;
        if (x6bVar != null) {
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
        t7b t7bVar = this.u0;
        jk2 jk2Var = t7bVar.J0;
        if (jk2Var != null && jk2Var.e) {
            float y = t7bVar.J0.getY() + t7bVar.j0.getY() + t7bVar.r.getY();
            if ((motionEvent.getY() >= y && motionEvent.getY() <= y + t7bVar.J0.getHeight()) || this.p0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z = true;
                }
                this.p0 = z;
                return super.dispatchTouchEvent(motionEvent);
            }
            t7bVar.J0.a(false, true);
            t7bVar.l0(true);
        }
        if (this.p0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.p0 = false;
        }
        this.n0.onTouchEvent(motionEvent);
        this.m0.X(motionEvent);
        if (motionEvent.getAction() == 1 && !this.o0) {
            if (t7bVar.r.getTranslationY() <= 0.0f) {
                vr4 vr4Var = t7bVar.N0;
                if (vr4Var != null && vr4Var.getTranslationY() > 0.0f && !t7bVar.M0) {
                    t7bVar.c(!t7bVar.R1 && t7bVar.N0.getTranslationY() < ((float) t7bVar.N0.getPadding()));
                }
            } else if (t7bVar.L > 0.4f) {
                t7bVar.o(true);
            } else {
                t7bVar.b();
            }
            t7bVar.M0 = false;
            t7bVar.X = false;
            t7bVar.Y = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // cja
    public int getBottomPadding() {
        int height = getHeight();
        t7b t7bVar = this.u0;
        return (height - t7bVar.r.getBottom()) + t7bVar.V;
    }

    public int getBottomPadding2() {
        return getHeight() - this.u0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        t7b t7bVar = this.u0;
        return (height - t7bVar.c0) - t7bVar.r.getBottom();
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        t14 emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        t7b t7bVar = this.u0;
        int i6 = t7bVar.a0;
        int measuredHeight2 = t7bVar.n0.getMeasuredHeight();
        if (t7bVar.W) {
            i6 = 0;
        }
        int i7 = t7bVar.T;
        int b = moe.b((measuredWidth - i7) / 2, t7bVar.Z, (measuredWidth - t7bVar.b0) - i7);
        int i8 = t7bVar.T + b;
        if (t7bVar.W) {
            i5 = t7bVar.U;
        } else {
            int i9 = t7bVar.c0;
            int i10 = t7bVar.U;
            int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
            if (t7bVar.K) {
                float f = t7bVar.I.top;
                if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                    i6 = (int) f;
                    i5 = t7bVar.U;
                }
            }
            if (i11 - i6 >= gl.L(40.0f)) {
                i6 = i11;
            }
            i5 = t7bVar.U;
        }
        t7bVar.r.layout(b, i6, i8, i5 + i6 + measuredHeight2);
        t7bVar.s.b.layout(0, 0, measuredWidth, measuredHeight);
        d7b d7bVar = t7bVar.D2;
        if (d7bVar != null) {
            d7bVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        vr4 vr4Var = t7bVar.N0;
        if (vr4Var != null) {
            vr4Var.layout((measuredWidth - vr4Var.getMeasuredWidth()) / 2, 0, (t7bVar.N0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        j7b j7bVar = t7bVar.d1;
        if (j7bVar != null && (emojiView = j7bVar.f.getEmojiView()) != null) {
            emojiView.layout(t7bVar.Z, (measuredHeight - t7bVar.c0) - emojiView.getMeasuredHeight(), measuredWidth - t7bVar.b0, measuredHeight - t7bVar.c0);
        }
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            t14 t14Var = x6bVar.j2;
            if (t14Var != null) {
                t14Var.layout(t7bVar.Z, (measuredHeight - t7bVar.c0) - t14Var.getMeasuredHeight(), measuredWidth - t7bVar.b0, measuredHeight - t7bVar.c0);
            }
            t09 t09Var = t7bVar.w1.P1;
            if (t09Var != null) {
                int i12 = t7bVar.Z;
                t09Var.layout(i12, t7bVar.a0, t09Var.getMeasuredWidth() + i12, t7bVar.w1.P1.getMeasuredHeight() + t7bVar.a0);
                st stVar = t7bVar.w1.P1.getReactionsWindow() != null ? t7bVar.w1.P1.getReactionsWindow().c : null;
                if (stVar != null) {
                    int i13 = t7bVar.Z;
                    stVar.layout(i13, t7bVar.a0, stVar.getMeasuredWidth() + i13, stVar.getMeasuredHeight() + t7bVar.a0);
                }
            }
        }
        e7b e7bVar = t7bVar.s1;
        if (e7bVar != null) {
            e7bVar.e.setPadding(0, t7bVar.a0, 0, t7bVar.c0);
            t7bVar.s1.layout(0, 0, measuredWidth, measuredHeight);
            t7bVar.s1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        f7b f7bVar = t7bVar.t1;
        if (f7bVar != null) {
            f7bVar.f.setPadding(0, t7bVar.a0, 0, t7bVar.c0);
            t7bVar.t1.layout(0, 0, measuredWidth, measuredHeight);
            t7bVar.t1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof np3) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof c11) {
                childAt.layout(0, i6, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i6);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        t7b t7bVar = this.u0;
        int i3 = (size - t7bVar.Z) - t7bVar.b0;
        int i4 = t7bVar.a0;
        int i5 = t7bVar.c0;
        int ceil = (int) Math.ceil((i3 / 9.0f) * 16.0f);
        int L = gl.L(48.0f);
        t7bVar.V = L;
        int i6 = ceil + L;
        int i7 = size2 - i5;
        if (i6 <= i7) {
            t7bVar.T = i3;
            t7bVar.U = ceil;
            t7bVar.W = i6 > i7 - i4;
        } else {
            t7bVar.W = false;
            t7bVar.U = tb4.f(size2, L, i5, i4);
            t7bVar.T = (int) Math.ceil((r8 * 9.0f) / 16.0f);
        }
        t7bVar.V = Utilities.j((size2 - t7bVar.U) - (t7bVar.W ? 0 : i4), gl.L(68.0f), gl.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(t7bVar.W ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        t7bVar.r.measure(View.MeasureSpec.makeMeasureSpec(t7bVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(t7bVar.U + t7bVar.V, TLObject.FLAG_30));
        t7bVar.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        d7b d7bVar = t7bVar.D2;
        if (d7bVar != null) {
            d7bVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        vr4 vr4Var = t7bVar.N0;
        if (vr4Var != null) {
            vr4Var.measure(View.MeasureSpec.makeMeasureSpec(t7bVar.T, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        j7b j7bVar = t7bVar.d1;
        if (j7bVar != null) {
            t14 emojiView = j7bVar.f.getEmojiView();
            Q();
            gl.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            t14 t14Var = x6bVar.j2;
            if (t14Var != null) {
                t14Var.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(t7bVar.w1.j2.getLayoutParams().height, TLObject.FLAG_30));
            }
            t09 t09Var = t7bVar.w1.P1;
            if (t09Var != null) {
                measureChild(t09Var, i, i2);
                if (t7bVar.w1.P1.getReactionsWindow() != null) {
                    measureChild(t7bVar.w1.P1.getReactionsWindow().c, i, i2);
                }
            }
        }
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof np3) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof c11) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(340.0f), size2 - (t7bVar.W ? 0 : i4)), TLObject.FLAG_30));
            }
        }
        e7b e7bVar = t7bVar.s1;
        if (e7bVar != null) {
            e7bVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            t7bVar.s1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        f7b f7bVar = t7bVar.t1;
        if (f7bVar != null) {
            f7bVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            t7bVar.t1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
