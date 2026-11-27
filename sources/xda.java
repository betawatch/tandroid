// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xda extends wma {
    public boolean g0;
    public final RectF h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public final mm p0;
    public final /* synthetic */ kea q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xda(kea keaVar, Context context) {
        super(context, null);
        this.q0 = keaVar;
        this.g0 = false;
        this.h0 = new RectF();
        this.I = new wda(this, this);
        hl.B(aob.v0(aob.h5, keaVar.J0));
        this.p0 = new mm(this, 0L, 350L, k43.h);
    }

    @Override // wma
    public final void J(Canvas canvas, ArrayList arrayList) {
        kea keaVar = this.q0;
        mda mdaVar = keaVar.B1;
        d79 d79Var = keaVar.z1;
        mda mdaVar2 = keaVar.A1;
        if (mdaVar2.getVisibility() == 0 && mdaVar2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mdaVar2.getX(), mdaVar2.getY());
            mdaVar2.draw(canvas);
            canvas.restore();
        }
        if (d79Var.getVisibility() == 0 && d79Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(d79Var.getX(), d79Var.getY());
            d79Var.draw(canvas);
            canvas.restore();
        }
        if (mdaVar.getVisibility() != 0 || mdaVar.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(mdaVar.getX(), mdaVar.getY());
        mdaVar.draw(canvas);
        canvas.restore();
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        kea keaVar = this.q0;
        canvas.clipRect(0.0f, paddingTop + keaVar.o2, getMeasuredWidth(), getMeasuredHeight() + keaVar.o2 + hl.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        jl0 jl0Var = this.q0.P2;
        if (!(view instanceof o24) || jl0Var == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        jl0Var.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
        canvas.clipPath(jl0Var.S.k);
        jl0Var.draw(canvas);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // wma
    public final vnb getResourceProvider() {
        return this.q0.J0;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hb hbVar = this.I;
        hbVar.b = this;
        hbVar.c();
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        canvas.save();
        kea keaVar = this.q0;
        Drawable drawable = keaVar.M1;
        FrameLayout frameLayout = keaVar.w1;
        canvas.translate(0.0f, keaVar.o2);
        int L = hl.L(6.0f) + (keaVar.k2 - keaVar.t0) + this.j0;
        int L2 = ((keaVar.k2 - keaVar.t0) - hl.L(13.0f)) + this.j0;
        keaVar.S1 = L2;
        int L3 = hl.L(60.0f) + getMeasuredHeight();
        int i = keaVar.t0;
        int i2 = L3 + i;
        if (keaVar.W) {
            f = 0.0f;
        } else {
            int i3 = keaVar.B2.b;
            L += i3;
            f = this.p0.d(this.i0 && L2 + i < i3);
            L2 = hl.U1(f, L2 + i3, -i);
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i2);
        drawable.draw(canvas);
        float f2 = keaVar.t0 + L2 + keaVar.o2;
        if (keaVar.r1 != f2) {
            keaVar.r1 = f2;
            keaVar.l1.invalidate();
        }
        if (frameLayout != null) {
            if (L2 > keaVar.B2.b || frameLayout.getChildCount() <= 0) {
                frameLayout.setTranslationY(Math.max(0, ((L2 + keaVar.t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                v21 v21Var = v21.x;
                if (v21Var != null) {
                    z11 z11Var = v21Var.e;
                    if (z11Var != null) {
                        z11Var.setTop(true);
                    }
                    v21Var.b();
                }
            }
        }
        if (f < 1.0f) {
            int L4 = hl.L(36.0f);
            float measuredWidth = (getMeasuredWidth() - L4) / 2;
            float f3 = L;
            float measuredWidth2 = (getMeasuredWidth() + L4) / 2;
            float L5 = hl.L(4.0f) + L;
            RectF rectF = this.h0;
            rectF.set(measuredWidth, f3, measuredWidth2, L5);
            aob.s0.setColor(aob.v0(aob.zj, keaVar.J0));
            aob.s0.setAlpha((int) ((1.0f - f) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z = hl.B(aob.v0(aob.h5, keaVar.J0)) > 0.721f && 0.0f > ((float) keaVar.B2.b) * 0.5f;
        if (z != ((systemUiVisibility & TLObject.FLAG_13) > 0)) {
            setSystemUiVisibility(z ? systemUiVisibility | TLObject.FLAG_13 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.k0 = this.j0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.i0;
        kea keaVar = this.q0;
        if (z) {
            if (motionEvent.getAction() == 0 && keaVar.k2 != 0 && motionEvent.getY() < keaVar.k2 - hl.L(30.0f)) {
                keaVar.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.j0 - hl.L(30.0f)) {
            keaVar.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int Q = Q();
        kea keaVar = this.q0;
        qda qdaVar = keaVar.n1;
        int max = (keaVar.d || Q > hl.L(20.0f) || hl.E) ? 0 : Math.max(keaVar.B2.d, qdaVar.getEmojiPadding());
        setBottomClip(max);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i12 = layoutParams.gravity;
                if (i12 == -1) {
                    i12 = 51;
                }
                int i13 = i12 & jn7.w1;
                int i14 = i12 & 7;
                if (i14 == 1) {
                    i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i14 != 5) {
                    i7 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i13 == 16) {
                        if (i13 == 48) {
                            i10 = this.j0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i13 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = qd4.f(i4, max, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        if (qdaVar != null && qdaVar.l(childAt)) {
                            if (hl.O1()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i10 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == keaVar.s1) {
                            i10 += keaVar.B2.d;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                    } else {
                        i8 = ((((i4 - max) - (this.j0 + i2)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (qdaVar != null) {
                        if (hl.O1()) {
                        }
                        i10 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == keaVar.s1) {
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                } else {
                    i5 = (((i3 - i) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i6 = keaVar.u0;
                }
                i7 = i5 - i6;
                if (i13 == 16) {
                }
                i10 = i8 - i9;
                if (qdaVar != null) {
                }
                if (childAt == keaVar.s1) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
        keaVar.U0();
        keaVar.V0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        xda xdaVar = this;
        kea keaVar = xdaVar.q0;
        mda mdaVar = keaVar.B1;
        FrameLayout frameLayout = keaVar.X1;
        mda mdaVar2 = keaVar.A1;
        d79 d79Var = keaVar.z1;
        int size = xdaVar.getLayoutParams().height > 0 ? xdaVar.getLayoutParams().height : View.MeasureSpec.getSize(i2);
        int i4 = 0;
        keaVar.C1.G = xdaVar.getLayoutParams().height <= 0;
        keaVar.E1.G = xdaVar.getLayoutParams().height <= 0;
        if (!keaVar.W) {
            xdaVar.g0 = true;
            int i5 = keaVar.u0;
            xdaVar.setPadding(i5, keaVar.B2.b, i5, 0);
            xdaVar.g0 = false;
        }
        int paddingTop = size - xdaVar.getPaddingTop();
        int y = uh9.y(103.0f, Math.max(2, (int) Math.ceil(Math.max(keaVar.H1.b(), keaVar.F1.b() - 1) / 4.0f)), hl.L(48.0f) + hl.L(103.0f)) + keaVar.t0;
        if (d79Var.getVisibility() != 8) {
            int y2 = uh9.y(103.0f, Math.max(2, (int) Math.ceil((keaVar.G1.b() - 1) / 4.0f)), hl.L(48.0f) + hl.L(103.0f)) + keaVar.t0;
            if (y2 > y) {
                y = hl.U1(d79Var.getAlpha(), y, y2);
            }
        }
        int i6 = y < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int L = hl.L((frameLayout != null ? 48 : 0) + 100) + keaVar.B2.d;
        if (mdaVar2.getPaddingTop() != i6 || mdaVar2.getPaddingBottom() != L) {
            xdaVar.g0 = true;
            mdaVar2.setPadding(0, i6, 0, L);
            d79Var.setPadding(0, i6, 0, L);
            xdaVar.g0 = false;
        }
        if (keaVar.d && xdaVar.getLayoutParams().height <= 0 && mdaVar.getPaddingTop() != i6) {
            xdaVar.g0 = true;
            mdaVar.setPadding(0, 0, 0, hl.L((frameLayout == null ? 0 : 48) + 60) + keaVar.B2.d);
            xdaVar.g0 = false;
        }
        boolean z = y >= size;
        xdaVar.i0 = z;
        xdaVar.j0 = z ? 0 : size - y;
        xdaVar.g0 = true;
        keaVar.E0(false);
        xdaVar.g0 = false;
        xdaVar.setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i7 = keaVar.u0;
        FrameLayout frameLayout2 = keaVar.t1;
        qda qdaVar = keaVar.n1;
        int i8 = size2 - (i7 << 1);
        int Q = xdaVar.Q();
        keaVar.I2 = Q;
        if (!qdaVar.O && Q <= hl.L(20.0f) && !qdaVar.e && !qdaVar.P) {
            xdaVar.g0 = true;
            qdaVar.j();
            xdaVar.g0 = false;
        }
        xdaVar.g0 = true;
        if (keaVar.I2 <= hl.L(20.0f)) {
            if (!hl.E) {
                size3 -= keaVar.d ? 0 : qdaVar.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i9 = qdaVar.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i9);
            }
            i3 = 8;
        } else {
            if (!qdaVar.m()) {
                qdaVar.j();
            }
            i3 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i10 = makeMeasureSpec;
        int i11 = size3;
        xdaVar.g0 = false;
        int childCount = xdaVar.getChildCount();
        while (i4 < childCount) {
            View childAt = xdaVar.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != i3) {
                if (!qdaVar.l(childAt)) {
                    xdaVar.measureChildWithMargins(childAt, i, 0, i10, 0);
                } else if (!hl.E && !hl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (hl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(200.0f), xdaVar.getPaddingTop() + (i11 - keaVar.B2.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(xdaVar.getPaddingTop() + (i11 - keaVar.B2.b), TLObject.FLAG_30));
                }
            }
            i4++;
            xdaVar = this;
        }
        keaVar.U0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.q0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}
