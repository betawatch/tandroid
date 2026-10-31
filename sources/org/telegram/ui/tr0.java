package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class tr0 extends NestedScrollView {
    public final Paint W;
    public final o1.j a0;
    public boolean b0;
    public float c0;
    public float d0;
    public float e0;
    public final Method f0;
    public final OverScroller g0;
    public boolean h0;
    public int i0;
    public int j0;
    public float k0;
    public boolean l0;
    public int m0;
    public final wr0 n0;
    public final FrameLayout o0;

    public tr0(Context context, wr0 wr0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.k0 = 1.0f;
        this.m0 = -1;
        this.n0 = wr0Var;
        this.o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.i0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j((Object) wr0Var, (o1.h) o1.j.p, 0.0f);
        this.a0 = jVar;
        jVar.m.b(100.0f);
        jVar.f(1.0f);
        jVar.b(new jc0(this, 2));
        jVar.a(new m9(this, 2));
        jVar.m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("c", null);
            this.f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            this.f0 = null;
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.g0 = null;
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean A(int i10, int i11) {
        if (i11 == 0) {
            this.a0.d();
            this.b0 = true;
            this.c0 = this.n0.getTranslationY();
            F();
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void C(int i10) {
        OverScroller overScroller;
        if (this.b0 && i10 == 0) {
            this.b0 = false;
            if (this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
                float f7 = this.e0;
                o1.j jVar = this.a0;
                if (!jVar.f) {
                    jVar.a = f7;
                    jVar.h();
                }
            }
            E();
        }
    }

    public boolean D() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i10, int i11) {
        int i12;
        int fontMetricsInt;
        int L;
        if (i10 != 0 && i11 != 0) {
            wr0 wr0Var = this.n0;
            TextView currentView = wr0Var.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = org.telegram.messenger.i0.q;
            boolean z10 = point.x > point.y;
            if (this.i0 != hashCode || this.h0 != z10 || this.j0 != i11) {
                this.i0 = hashCode;
                this.h0 = z10;
                this.j0 = i11;
                currentView.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
                Layout layout = currentView.getLayout();
                int lineCount = layout.getLineCount();
                if ((!z10 || lineCount > 2) && (z10 || lineCount > 5)) {
                    int min = Math.min(z10 ? 2 : 5, lineCount);
                    loop0: while (min > 1) {
                        int i13 = min - 1;
                        for (int lineStart = layout.getLineStart(i13); lineStart < layout.getLineEnd(i13); lineStart++) {
                            if (!Character.isWhitespace(text.charAt(lineStart))) {
                                break loop0;
                            }
                        }
                        min--;
                    }
                    fontMetricsInt = i11 - (currentView.getPaint().getFontMetricsInt(null) * min);
                    L = org.telegram.messenger.i0.L(8.0f);
                } else {
                    fontMetricsInt = i11 - currentView.getMeasuredHeight();
                    L = wr0Var.getPaddingBottom();
                }
                i12 = fontMetricsInt - L;
                if (i12 < 0) {
                    if (this.l0) {
                        this.m0 = i12;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin = i12;
                        this.m0 = -1;
                        return;
                    }
                }
                return;
            }
        }
        i12 = -1;
        if (i12 < 0) {
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.b0 && this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
            o1.j jVar = this.a0;
            if (!jVar.f) {
                jVar.a = 0.0f;
                jVar.h();
            }
        }
        G();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i10);
        int i11 = (int) (this.k0 * 127.0f);
        Paint paint = this.W;
        paint.setAlpha(i11);
        canvas.drawRect(0.0f, this.n0.getTranslationY() + this.o0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean f(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.b0) {
            float f7 = this.c0;
            if ((f7 > 0.0f && i11 > 0) || (f7 < 0.0f && i11 < 0)) {
                float f10 = i11;
                float f11 = f7 - f10;
                if (f7 > 0.0f) {
                    if (f11 < 0.0f) {
                        this.c0 = 0.0f;
                        iArr[1] = (int) (f10 + f11 + 0);
                    } else {
                        this.c0 = f11;
                        iArr[1] = i11;
                    }
                } else if (f11 > 0.0f) {
                    this.c0 = 0.0f;
                    iArr[1] = (int) (f10 + f11 + 0);
                } else {
                    this.c0 = f11;
                    iArr[1] = i11;
                }
                G();
                this.n0.setTranslationY(this.c0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.c0) / (this.o0.getTop() - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (D() ? org.telegram.messenger.i0.m : 0))))) * i13);
            if (round != 0) {
                boolean z10 = this.b0;
                wr0 wr0Var = this.n0;
                if (z10) {
                    float f10 = this.c0 - round;
                    this.c0 = f10;
                    wr0Var.setTranslationY(f10);
                } else {
                    o1.j jVar = this.a0;
                    if (!jVar.f) {
                        OverScroller overScroller = this.g0;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f7 = 0.0f;
                        } else {
                            Point point = org.telegram.messenger.i0.q;
                            float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            round = (int) ((round * min) / currVelocity);
                            f7 = min * (-this.d0);
                        }
                        if (round != 0) {
                            float f11 = this.c0 - round;
                            this.c0 = f11;
                            wr0Var.setTranslationY(f11);
                        }
                        if (!jVar.f) {
                            jVar.a = f7;
                            jVar.h();
                        }
                    }
                }
            }
            G();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.m0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i10) {
        super.i(i10);
        this.d0 = Math.signum(i10);
        this.e0 = 0.0f;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.n0.getTranslationY() + (this.o0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }
}
