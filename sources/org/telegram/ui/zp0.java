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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class zp0 extends NestedScrollView {
    public final Paint a0;
    public final q1.g b0;
    public boolean c0;
    public float d0;
    public float e0;
    public float f0;
    public final Method g0;
    public final OverScroller h0;
    public boolean i0;
    public int j0;
    public int k0;
    public float l0;
    public boolean m0;
    public int n0;
    public final cq0 o0;
    public final FrameLayout p0;

    public zp0(Context context, cq0 cq0Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.a0 = paint;
        this.l0 = 1.0f;
        this.n0 = -1;
        this.o0 = cq0Var;
        this.p0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        q1.g gVar = new q1.g((Object) cq0Var, (q1.e) q1.g.p, 0.0f);
        this.b0 = gVar;
        gVar.m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new wa0(this, 2));
        gVar.a(new k9(this, 2));
        gVar.m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("a", null);
            this.g0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e10) {
            this.g0 = null;
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.h0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.h0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean A(int i3, int i10) {
        if (i10 == 0) {
            this.b0.d();
            this.c0 = true;
            this.d0 = this.o0.getTranslationY();
            F();
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void C(int i3) {
        OverScroller overScroller;
        if (this.c0 && i3 == 0) {
            this.c0 = false;
            if (this.d0 != 0.0f && (overScroller = this.h0) != null && overScroller.isFinished()) {
                float f10 = this.f0;
                q1.g gVar = this.b0;
                if (!gVar.f) {
                    gVar.a = f10;
                    gVar.h();
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
    public final void H(int i3, int i10) {
        int i11;
        int fontMetricsInt;
        int L;
        if (i3 != 0 && i10 != 0) {
            cq0 cq0Var = this.o0;
            TextView currentView = cq0Var.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = org.telegram.messenger.g0.q;
            boolean z10 = point.x > point.y;
            if (this.j0 != hashCode || this.i0 != z10 || this.k0 != i10) {
                this.j0 = hashCode;
                this.i0 = z10;
                this.k0 = i10;
                currentView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                Layout layout = currentView.getLayout();
                int lineCount = layout.getLineCount();
                if ((!z10 || lineCount > 2) && (z10 || lineCount > 5)) {
                    int min = Math.min(z10 ? 2 : 5, lineCount);
                    loop0: while (min > 1) {
                        int i12 = min - 1;
                        for (int lineStart = layout.getLineStart(i12); lineStart < layout.getLineEnd(i12); lineStart++) {
                            if (!Character.isWhitespace(text.charAt(lineStart))) {
                                break loop0;
                            }
                        }
                        min--;
                    }
                    fontMetricsInt = i10 - (currentView.getPaint().getFontMetricsInt(null) * min);
                    L = org.telegram.messenger.g0.L(8.0f);
                } else {
                    fontMetricsInt = i10 - currentView.getMeasuredHeight();
                    L = cq0Var.getPaddingBottom();
                }
                i11 = fontMetricsInt - L;
                if (i11 < 0) {
                    if (this.m0) {
                        this.n0 = i11;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) this.p0.getLayoutParams()).topMargin = i11;
                        this.n0 = -1;
                        return;
                    }
                }
                return;
            }
        }
        i11 = -1;
        if (i11 < 0) {
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.c0 && this.d0 != 0.0f && (overScroller = this.h0) != null && overScroller.isFinished()) {
            q1.g gVar = this.b0;
            if (!gVar.f) {
                gVar.a = 0.0f;
                gVar.h();
            }
        }
        G();
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean d(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.c0) {
            float f10 = this.d0;
            if ((f10 > 0.0f && i10 > 0) || (f10 < 0.0f && i10 < 0)) {
                float f11 = i10;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.d0 = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.d0 = f12;
                        iArr[1] = i10;
                    }
                } else if (f12 > 0.0f) {
                    this.d0 = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.d0 = f12;
                    iArr[1] = i10;
                }
                G();
                this.o0.setTranslationY(this.d0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i3 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i3);
        int i10 = (int) (this.l0 * 127.0f);
        Paint paint = this.a0;
        paint.setAlpha(i10);
        canvas.drawRect(0.0f, this.o0.getTranslationY() + this.p0.getTop(), width, i3, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void e(int i3, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.d0) / (this.p0.getTop() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (D() ? org.telegram.messenger.g0.m : 0))))) * i12);
            if (round != 0) {
                boolean z10 = this.c0;
                cq0 cq0Var = this.o0;
                if (z10) {
                    float f11 = this.d0 - round;
                    this.d0 = f11;
                    cq0Var.setTranslationY(f11);
                } else {
                    q1.g gVar = this.b0;
                    if (!gVar.f) {
                        OverScroller overScroller = this.h0;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f10 = 0.0f;
                        } else {
                            Point point = org.telegram.messenger.g0.q;
                            float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            round = (int) ((round * min) / currVelocity);
                            f10 = min * (-this.e0);
                        }
                        if (round != 0) {
                            float f12 = this.d0 - round;
                            this.d0 = f12;
                            cq0Var.setTranslationY(f12);
                        }
                        if (!gVar.f) {
                            gVar.a = f10;
                            gVar.h();
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
        int i3 = this.n0;
        if (i3 >= 0) {
            return i3 - ((ViewGroup.MarginLayoutParams) this.p0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void i(int i3) {
        super.i(i3);
        this.e0 = Math.signum(i3);
        this.f0 = 0.0f;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        H(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        super.onMeasure(i3, i10);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.o0.getTranslationY() + (this.p0.getTop() - getScrollY())) {
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
