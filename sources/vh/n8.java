package vh;

import android.app.Activity;
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
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n8 extends uu0 {
    public final m2.t f0;
    public final ScaleGestureDetector g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;
    public float m0;
    public final /* synthetic */ o8 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(o8 o8Var, Activity activity) {
        super(activity, null);
        this.n0 = o8Var;
        this.j0 = false;
        this.f0 = new m2.t((Context) activity, (r10) new l8(this));
        this.g0 = new ScaleGestureDetector(activity, new m8(this));
    }

    public final void X(float f7, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        o8 o8Var = this.n0;
        float width2 = width / o8Var.n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = o8Var.X0.getTextureView();
        if (textureView == null) {
            textureView = o8Var.X0.r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(o8Var.h0.getX() + o8Var.r.getX(), o8Var.h0.getY() + o8Var.r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f7), (int) (textureView.getHeight() / f7));
                float f10 = 1.0f / width2;
                canvas.scale(f10, f10);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(o8Var.r.getX(), o8Var.r.getY());
        for (int i10 = 0; i10 < o8Var.r.getChildCount(); i10++) {
            View childAt = o8Var.r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == o8Var.h0) {
                    for (int i11 = 0; i11 < o8Var.h0.getChildCount(); i11++) {
                        View childAt2 = o8Var.h0.getChildAt(i11);
                        if (childAt2 != o8Var.X0 && childAt2 != o8Var.B0 && childAt2.getVisibility() == 0) {
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        s7 s7Var;
        float f7;
        float f10;
        jg.h2 h2Var;
        o8 o8Var = this.n0;
        RectF rectF = o8Var.H;
        Path path = o8Var.e0;
        RectF rectF2 = o8Var.d0;
        RectF rectF3 = o8Var.c0;
        Float f11 = o8Var.L;
        float floatValue = f11 != null ? f11.floatValue() : o8Var.K;
        if (o8Var.J == 0) {
            canvas.drawColor(i0.b.o(-16777216, (int) ((1.0f - floatValue) * o8Var.I * 255.0f)));
        }
        float T1 = org.telegram.messenger.i0.T1(o8Var.G, 0.0f, o8Var.I);
        if (o8Var.I != 1.0f) {
            int i10 = o8Var.J;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(o8Var.r.getTranslationX(), o8Var.r.getTranslationY());
                org.telegram.messenger.i0.Z1(rectF, rectF2, o8Var.I, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, T1, T1, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.i(o8Var.I * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (o8Var.r.getTranslationY() * o8Var.I));
                float max = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(max, max);
                z11 = true;
                s7Var = o8Var.v1;
                if (s7Var != null) {
                    n8 n8Var = s7Var.v1;
                    float[] fArr = s7Var.S1;
                    if (s7Var.M1) {
                        s7Var.M1 = r11;
                        if (s7Var.I1 != null && (h2Var = s7Var.J1) != null) {
                            fArr[r11] = h2Var.getMeasuredWidth() / 2.0f;
                            fArr[1] = s7Var.J1.getMeasuredHeight() / 2.0f;
                            s7Var.J1.getMatrix().mapPoints(fArr);
                            f7 = 1.0f;
                            float scaleX = fArr[1] - (s7Var.J1.getScaleX() * (s7Var.J1.getMeasuredHeight() / 2.0f));
                            f10 = 0.0f;
                            float scaleX2 = (s7Var.J1.getScaleX() * (s7Var.J1.getMeasuredHeight() / 2.0f)) + fArr[1];
                            if (scaleX < org.telegram.messenger.i0.L(120.0f) && scaleX2 > n8Var.getMeasuredHeight() - org.telegram.messenger.i0.L(200.0f)) {
                                s7Var.I1.setTop((boolean) r11);
                                s7Var.I1.setTranslationY(org.telegram.messenger.i0.L(16.0f) + (org.telegram.messenger.i0.L(120.0f) - s7Var.I1.getMeasuredHeight()));
                            } else if (scaleX < org.telegram.messenger.i0.L(120.0f)) {
                                s7Var.I1.setTop(true);
                                s7Var.I1.setTranslationY((s7Var.J1.getScaleX() * (s7Var.J1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                            } else {
                                s7Var.I1.setTop((boolean) r11);
                                s7Var.I1.setTranslationY((scaleX - r7.getMeasuredHeight()) + org.telegram.messenger.i0.L(16.0f));
                            }
                            if (fArr[r11] < s7Var.getMeasuredWidth() / 2.0f) {
                                s7Var.I1.setMirrorX(true);
                                float measuredWidth = ((s7Var.I1.getMeasuredWidth() / 2.0f) + s7Var.I1.getX()) - (fArr[r11] - (s7Var.J1.getMeasuredHeight() / 2.0f));
                                if (measuredWidth > 0.0f) {
                                    s7Var.I1.setBubbleOffset(((r4.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                                }
                            } else {
                                float measuredWidth2 = ((s7Var.I1.getMeasuredWidth() / 2.0f) + s7Var.I1.getX()) - ((s7Var.J1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                                if (measuredWidth2 < 0.0f) {
                                    s7Var.I1.setBubbleOffset((-((r4.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                                }
                                s7Var.I1.setMirrorX(r11);
                            }
                            s7Var.I1.setTranslationX((n8Var.getMeasuredWidth() - s7Var.I1.getMeasuredWidth()) / 2.0f);
                            super.dispatchDraw(canvas);
                            if (z11) {
                                canvas.restore();
                                canvas.restore();
                                if (o8Var.F != null) {
                                    float i11 = Utilities.i(f7 - (o8Var.I * 1.5f), f7, f10);
                                    rectF3.centerX();
                                    rectF3.centerY();
                                    Math.min(rectF3.width(), rectF3.height());
                                    j8 j8Var = o8Var.F;
                                    ImageReceiver imageReceiver = j8Var.e;
                                    if (imageReceiver != null) {
                                        imageReceiver.A0(rectF3);
                                        ImageReceiver imageReceiver2 = o8Var.F.e;
                                        int i12 = imageReceiver2.W0[r11];
                                        imageReceiver2.J0((int) T1);
                                        o8Var.F.e.setAlpha(i11);
                                        o8Var.F.e.h(canvas, null);
                                        o8Var.F.e.J0(i12);
                                    } else {
                                        org.telegram.ui.Cells.g7 g7Var = j8Var.d;
                                        if (g7Var != null) {
                                            g7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                            org.telegram.ui.Cells.g7 g7Var2 = o8Var.F.d;
                                            g7Var2.g = (int) c3.i0.E(i11, 255.0f, i11, i11);
                                            g7Var2.draw(canvas);
                                        }
                                    }
                                    o8Var.F.getClass();
                                    canvas.save();
                                    canvas.translate(rectF.left, rectF.top);
                                    o8Var.F.a(canvas, i11);
                                    canvas.restore();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                f7 = 1.0f;
                f10 = 0.0f;
                super.dispatchDraw(canvas);
                if (z11) {
                }
            } else {
                boolean z12 = false;
                z10 = z12;
                if (i10 == 1) {
                    o8Var.j();
                    z10 = z12;
                }
            }
        } else {
            z10 = false;
        }
        z11 = z10 ? 1 : 0;
        r11 = z10;
        s7Var = o8Var.v1;
        if (s7Var != null) {
        }
        f7 = 1.0f;
        f10 = 0.0f;
        super.dispatchDraw(canvas);
        if (z11) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.n0.L();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.h0 = false;
        o8 o8Var = this.n0;
        t tVar = o8Var.I0;
        if (tVar != null && tVar.e) {
            float y3 = o8Var.I0.getY() + o8Var.i0.getY() + o8Var.r.getY();
            if ((motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + o8Var.I0.getHeight()) || this.i0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.i0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            o8Var.I0.a(false, true);
            o8Var.l0(true);
        }
        if (this.i0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.i0 = false;
        }
        this.g0.onTouchEvent(motionEvent);
        this.f0.I(motionEvent);
        if (motionEvent.getAction() == 1 && !this.h0) {
            if (o8Var.r.getTranslationY() <= 0.0f) {
                m2 m2Var = o8Var.M0;
                if (m2Var != null && m2Var.getTranslationY() > 0.0f && !o8Var.L0) {
                    o8Var.e(!o8Var.Q1 && o8Var.M0.getTranslationY() < ((float) o8Var.M0.getPadding()));
                }
            } else if (o8Var.K > 0.4f) {
                o8Var.p(true);
            } else {
                o8.b(o8Var);
            }
            o8Var.L0 = false;
            o8Var.W = false;
            o8Var.X = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uu0
    public int getBottomPadding() {
        int height = getHeight();
        o8 o8Var = this.n0;
        return (height - o8Var.r.getBottom()) + o8Var.U;
    }

    public int getBottomPadding2() {
        return getHeight() - this.n0.r.getBottom();
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        o8 o8Var = this.n0;
        return (height - o8Var.b0) - o8Var.r.getBottom();
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        vy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o8 o8Var = this.n0;
        int i15 = o8Var.Z;
        int measuredHeight2 = o8Var.m0.getMeasuredHeight();
        if (o8Var.V) {
            i15 = 0;
        }
        int i16 = o8Var.S;
        int b10 = w7.u.b((measuredWidth - i16) / 2, o8Var.Y, (measuredWidth - o8Var.a0) - i16);
        int i17 = o8Var.S + b10;
        if (o8Var.V) {
            i14 = o8Var.T;
        } else {
            int i18 = o8Var.b0;
            int i19 = o8Var.T;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (o8Var.J == 1) {
                float f7 = o8Var.H.top;
                if (i19 + f7 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f7;
                    i14 = o8Var.T;
                }
            }
            if (i20 - i15 >= org.telegram.messenger.i0.L(40.0f)) {
                i15 = i20;
            }
            i14 = o8Var.T;
        }
        o8Var.r.layout(b10, i15, i17, i14 + i15 + measuredHeight2);
        o8Var.s.b.layout(0, 0, measuredWidth, measuredHeight);
        y7 y7Var = o8Var.C2;
        if (y7Var != null) {
            y7Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        m2 m2Var = o8Var.M0;
        if (m2Var != null) {
            m2Var.layout((measuredWidth - m2Var.getMeasuredWidth()) / 2, 0, (o8Var.M0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        e8 e8Var = o8Var.c1;
        if (e8Var != null && (emojiView = e8Var.f.getEmojiView()) != null) {
            emojiView.layout(o8Var.Y, (measuredHeight - o8Var.b0) - emojiView.getMeasuredHeight(), measuredWidth - o8Var.a0, measuredHeight - o8Var.b0);
        }
        s7 s7Var = o8Var.v1;
        if (s7Var != null) {
            vy vyVar = s7Var.Y1;
            if (vyVar != null) {
                vyVar.layout(o8Var.Y, (measuredHeight - o8Var.b0) - vyVar.getMeasuredHeight(), measuredWidth - o8Var.a0, measuredHeight - o8Var.b0);
            }
            mj0 mj0Var = o8Var.v1.I1;
            if (mj0Var != null) {
                int i21 = o8Var.Y;
                mj0Var.layout(i21, o8Var.Z, mj0Var.getMeasuredWidth() + i21, o8Var.v1.I1.getMeasuredHeight() + o8Var.Z);
                ph.k kVar = o8Var.v1.I1.getReactionsWindow() != null ? o8Var.v1.I1.getReactionsWindow().c : null;
                if (kVar != null) {
                    int i22 = o8Var.Y;
                    kVar.layout(i22, o8Var.Z, kVar.getMeasuredWidth() + i22, kVar.getMeasuredHeight() + o8Var.Z);
                }
            }
        }
        z7 z7Var = o8Var.r1;
        if (z7Var != null) {
            z7Var.e.setPadding(0, o8Var.Z, 0, o8Var.b0);
            o8Var.r1.layout(0, 0, measuredWidth, measuredHeight);
            o8Var.r1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        a8 a8Var = o8Var.s1;
        if (a8Var != null) {
            a8Var.f.setPadding(0, o8Var.Z, 0, o8Var.b0);
            o8Var.s1.layout(0, 0, measuredWidth, measuredHeight);
            o8Var.s1.e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof m0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof oa) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        o8 o8Var = this.n0;
        int i12 = (size - o8Var.Y) - o8Var.a0;
        int i13 = o8Var.Z;
        int i14 = o8Var.b0;
        int ceil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int L = org.telegram.messenger.i0.L(48.0f);
        o8Var.U = L;
        int i15 = ceil + L;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            o8Var.S = i12;
            o8Var.T = ceil;
            o8Var.V = i15 > i16 - i13;
        } else {
            o8Var.V = false;
            o8Var.T = ((size2 - L) - i14) - i13;
            o8Var.S = (int) Math.ceil((r9 * 9.0f) / 16.0f);
        }
        o8Var.U = Utilities.j((size2 - o8Var.T) - (o8Var.V ? 0 : i13), org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(o8Var.V ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        o8Var.r.measure(View.MeasureSpec.makeMeasureSpec(o8Var.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o8Var.T + o8Var.U, TLObject.FLAG_30));
        o8Var.s.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        y7 y7Var = o8Var.C2;
        if (y7Var != null) {
            y7Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        m2 m2Var = o8Var.M0;
        if (m2Var != null) {
            m2Var.measure(View.MeasureSpec.makeMeasureSpec(o8Var.S, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        e8 e8Var = o8Var.c1;
        if (e8Var != null) {
            vy emojiView = e8Var.f.getEmojiView();
            Q();
            org.telegram.messenger.i0.L(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, TLObject.FLAG_30));
            }
        }
        s7 s7Var = o8Var.v1;
        if (s7Var != null) {
            vy vyVar = s7Var.Y1;
            if (vyVar != null) {
                vyVar.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o8Var.v1.Y1.getLayoutParams().height, TLObject.FLAG_30));
            }
            mj0 mj0Var = o8Var.v1.I1;
            if (mj0Var != null) {
                measureChild(mj0Var, i10, i11);
                if (o8Var.v1.I1.getReactionsWindow() != null) {
                    measureChild(o8Var.v1.I1.getReactionsWindow().c, i10, i11);
                }
            }
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt instanceof m0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof oa) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(340.0f), size2 - (o8Var.V ? 0 : i13)), TLObject.FLAG_30));
            }
        }
        z7 z7Var = o8Var.r1;
        if (z7Var != null) {
            z7Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            o8Var.r1.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        a8 a8Var = o8Var.s1;
        if (a8Var != null) {
            a8Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            o8Var.s1.e.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        setMeasuredDimension(size, size2);
    }
}
