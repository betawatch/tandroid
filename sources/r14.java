// default package

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r14 extends r59 {
    public boolean f3;
    public final SparseArray g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public int l3;
    public SparseArray m3;
    public final /* synthetic */ e34 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r14(e34 e34Var, Context context) {
        super(context, null);
        this.n3 = e34Var;
        this.g3 = new SparseArray();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = -1;
        d53 d53Var = d53.f;
    }

    public final void A1(View view) {
        if (this.m3 != null) {
            int i = 0;
            while (i < this.m3.size()) {
                q14 q14Var = (q14) this.m3.valueAt(i);
                if (q14Var.d == view) {
                    this.m3.removeAt(i);
                    i--;
                    if (q14Var.d.getBackground() instanceof RippleDrawable) {
                        q14Var.d.getBackground().setState(new int[0]);
                    }
                    q14Var.d.setPressed(false);
                }
                i++;
            }
        }
    }

    public final void B1() {
        e34 e34Var = this.n3;
        int i = e34Var.c;
        r14 r14Var = e34Var.Q;
        gn[] gnVarArr = new gn[r14Var.getChildCount()];
        for (int i2 = 0; i2 < r14Var.getChildCount(); i2++) {
            View childAt = r14Var.getChildAt(i2);
            if (childAt instanceof n24) {
                gnVarArr[i2] = ((n24) childAt).getSpan();
            }
        }
        e34Var.e2 = gn.update(i, this, gnVarArr, (LongSparseArray<vm>) e34Var.e2);
    }

    @Override // r59
    public final void K0(Canvas canvas, RectF rectF, long j) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        boolean z;
        Canvas canvas2 = canvas;
        e34 e34Var = this.n3;
        r14 r14Var = e34Var.Q;
        super.K0(canvas, rectF, j);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.l3 != getChildCount()) {
            B1();
            this.l3 = getChildCount();
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            sparseArray = this.g3;
            int size = sparseArray.size();
            arrayList = this.j3;
            if (i3 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i3);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i3++;
        }
        sparseArray.clear();
        int i4 = 1;
        boolean z2 = e34Var.v2 > 0 && SystemClock.elapsedRealtime() - e34Var.v2 < z1() && e34Var.s2 != null && e34Var.t2 >= 0;
        float f = 0.0f;
        if (e34Var.e2 != null && r14Var != null) {
            int i5 = 0;
            while (i5 < r14Var.getChildCount()) {
                View childAt = r14Var.getChildAt(i5);
                if (childAt instanceof n24) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) td4.m(i4, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((n24) childAt);
                }
                if (z2 && childAt != null && RecyclerView.R(childAt) == e34Var.t2 - i4) {
                    z = z2;
                    float interpolation = d53.g.getInterpolation(pqe.a((SystemClock.elapsedRealtime() - e34Var.v2) / 140.0f, f, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i = i5;
                    } else {
                        float f2 = 1.0f - interpolation;
                        i = i5;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f2), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f3 = (f2 * 0.5f) + 0.5f;
                        canvas2.scale(f3, f3, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        e34Var.s2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i = i5;
                    z = z2;
                }
                i5 = i + 1;
                z2 = z;
                f = 0.0f;
                i4 = 1;
            }
        }
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i6 = 0;
        while (true) {
            int size2 = sparseArray.size();
            p14 p14Var = null;
            arrayList2 = this.k3;
            if (i6 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i6);
            n24 n24Var = (n24) arrayList7.get(i2);
            int i7 = n24Var.a;
            int i8 = i2;
            while (true) {
                if (i8 >= arrayList5.size()) {
                    break;
                }
                if (((p14) arrayList5.get(i8)).N == i7) {
                    p14Var = (p14) arrayList5.get(i8);
                    arrayList5.remove(i8);
                    break;
                }
                i8++;
            }
            if (p14Var == null) {
                p14Var = !arrayList2.isEmpty() ? (p14) td4.m(1, arrayList2) : new p14(this);
                p14Var.N = i7;
                p14Var.e();
            }
            arrayList6.add(p14Var);
            p14Var.P = arrayList7;
            canvas2.save();
            canvas2.translate(n24Var.getLeft(), n24Var.getY() + n24Var.getPaddingTop());
            p14Var.O = n24Var.getLeft();
            int measuredWidth = getMeasuredWidth() - (n24Var.getLeft() << 1);
            int measuredHeight = n24Var.getMeasuredHeight() - n24Var.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0 && (Build.VERSION.SDK_INT < 30 || !canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight))) {
                p14Var.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i6++;
            canvas2 = canvas;
            i2 = 0;
        }
        for (int i9 = 0; i9 < arrayList5.size(); i9++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((p14) arrayList5.get(i9));
                ((p14) arrayList5.get(i9)).P = null;
                ((p14) arrayList5.get(i9)).k();
            } else {
                ((p14) arrayList5.get(i9)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        e34 e34Var = this.n3;
        r14 r14Var = e34Var.Q;
        e34Var.n2.g();
        if (this.l3 != getChildCount()) {
            B1();
            this.l3 = getChildCount();
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            sparseArray = this.g3;
            int size = sparseArray.size();
            arrayList = this.j3;
            if (i2 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i2);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i2++;
        }
        sparseArray.clear();
        boolean z = e34Var.v2 > 0 && SystemClock.elapsedRealtime() - e34Var.v2 < z1() && e34Var.s2 != null && e34Var.t2 >= 0;
        if (e34Var.e2 != null && r14Var != null) {
            for (int i3 = 0; i3 < r14Var.getChildCount(); i3++) {
                View childAt = r14Var.getChildAt(i3);
                if (childAt instanceof n24) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) td4.m(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((n24) childAt);
                }
                if (z && childAt != null && RecyclerView.R(childAt) == e34Var.t2 - 1) {
                    float interpolation = d53.g.getInterpolation(pqe.a((SystemClock.elapsedRealtime() - e34Var.v2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f2 = (f * 0.5f) + 0.5f;
                        canvas.scale(f2, f2, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        e34Var.s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = 0;
        while (true) {
            int size2 = sparseArray.size();
            p14 p14Var = null;
            arrayList2 = this.k3;
            if (i4 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i4);
            n24 n24Var = (n24) arrayList7.get(i);
            int i5 = n24Var.a;
            int i6 = i;
            while (true) {
                if (i6 >= arrayList5.size()) {
                    break;
                }
                if (((p14) arrayList5.get(i6)).N == i5) {
                    p14Var = (p14) arrayList5.get(i6);
                    arrayList5.remove(i6);
                    break;
                }
                i6++;
            }
            if (p14Var == null) {
                p14Var = !arrayList2.isEmpty() ? (p14) td4.m(1, arrayList2) : new p14(this);
                p14Var.N = i5;
                p14Var.e();
            }
            arrayList6.add(p14Var);
            p14Var.P = arrayList7;
            canvas2.save();
            canvas2.translate(n24Var.getLeft(), n24Var.getY() + n24Var.getPaddingTop());
            p14Var.O = n24Var.getLeft();
            int measuredWidth = getMeasuredWidth() - (n24Var.getLeft() << 1);
            int measuredHeight = n24Var.getMeasuredHeight() - n24Var.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                p14Var.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i4++;
            canvas2 = canvas;
            i = 0;
        }
        for (int i7 = 0; i7 < arrayList5.size(); i7++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((p14) arrayList5.get(i7));
                ((p14) arrayList5.get(i7)).P = null;
                ((p14) arrayList5.get(i7)).k();
            } else {
                ((p14) arrayList5.get(i7)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z2 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z3 = motionEvent.getActionMasked() == 3;
        if (z || z2 || z3) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.m3 == null) {
                this.m3 = new SparseArray();
            }
            float x = motionEvent.getX(actionIndex);
            float y = motionEvent.getY(actionIndex);
            View E = E(x, y);
            if (!z) {
                q14 q14Var = (q14) this.m3.get(pointerId);
                this.m3.remove(pointerId);
                if (E != null && q14Var != null) {
                    if (Math.sqrt(Math.pow(y - q14Var.b, 2.0d) + Math.pow(x - q14Var.a, 2.0d)) < gm.e * 3.0f && !z3) {
                        e34 e34Var = this.n3;
                        if (!e34Var.C1.isShowing() || SystemClock.elapsedRealtime() - q14Var.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = q14Var.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof n24) {
                                    e34Var.G((n24) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof u14) {
                                    e34Var.S.E(R, (u14) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (q14Var != null && (q14Var.d.getBackground() instanceof RippleDrawable)) {
                    q14Var.d.getBackground().setState(new int[0]);
                }
                if (q14Var != null) {
                    q14Var.d.setPressed(false);
                }
            } else if (E != null) {
                q14 q14Var2 = new q14();
                q14Var2.a = x;
                q14Var2.b = y;
                q14Var2.c = SystemClock.elapsedRealtime();
                q14Var2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                q14Var2.d.setPressed(true);
                this.m3.put(pointerId, q14Var2);
                D0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z3 && this.m3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i) {
        if (i == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            e34 e34Var = this.n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                e34Var.L(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            e34Var.o(1, gm.L(36.0f));
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        gn.release(this, (LongSparseArray<vm>) this.n3.e2);
        int i = 0;
        int i2 = 0;
        while (true) {
            arrayList = this.h3;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((p14) arrayList.get(i2)).f();
            i2++;
        }
        while (true) {
            ArrayList arrayList2 = this.k3;
            if (i >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((p14) arrayList2.get(i)).f();
                i++;
            }
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e34 e34Var = this.n3;
        if (e34Var.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || hx2.e().g(motionEvent, this, e34Var.h2, this.o2);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e34 e34Var = this.n3;
        if (e34Var.e0 && e34Var.d0) {
            this.f3 = true;
            e34Var.R.g1(0, 0);
            e34Var.d0 = false;
            this.f3 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        e34Var.h(true);
        B1();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f3 = true;
        int size = View.MeasureSpec.getSize(i);
        e34 e34Var = this.n3;
        f14 f14Var = e34Var.R;
        int i3 = f14Var.J;
        f14Var.x1(Math.max(1, size / gm.L(gm.O1() ? 60.0f : 45.0f)));
        this.f3 = false;
        super.onMeasure(i, i2);
        if (i3 != f14Var.J) {
            e34Var.S.F(false);
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e34 e34Var = this.n3;
        int[] iArr = e34Var.E1;
        rx3 rx3Var = e34Var.C1;
        if (e34Var.S1 != null && rx3Var != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (rx3Var != null && rx3Var.isShowing() && !rx3Var.d) {
                    rx3Var.dismiss();
                    int i = rx3Var.c.n[0];
                    String str = (i < 1 || i > 5) ? null : (String) bs2.a.get(i - 1);
                    String str2 = (String) e34Var.S1.getTag();
                    if (e34Var.S1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        n24 n24Var = e34Var.S1;
                        if (str != null) {
                            e34Var.G(n24Var, e34.c(replace, str));
                        } else {
                            e34Var.G(n24Var, replace);
                        }
                    } else {
                        if (str != null) {
                            gw3.j.put(str2, str);
                            str2 = e34.c(str2, str);
                        } else {
                            gw3.j.remove(str2);
                        }
                        e34Var.S1.a(gw3.f(str2), e34Var.S1.c);
                        e34Var.G(e34Var.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        gw3.q();
                    }
                }
                if (rx3Var == null || !rx3Var.d) {
                    e34Var.S1 = null;
                }
                e34Var.V1 = -10000.0f;
                e34Var.W1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f = e34Var.V1;
                if (f != -10000.0f) {
                    if (Math.abs(f - motionEvent.getX()) > gm.Z0(true, 0.2f) || Math.abs(e34Var.W1 - motionEvent.getY()) > gm.Z0(false, 0.2f)) {
                        e34Var.V1 = -10000.0f;
                        e34Var.W1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x = motionEvent.getX() + iArr[0];
                rx3Var.c.getLocationOnScreen(iArr);
                int L = (int) (x - (gm.L(3.0f) + iArr[0]));
                boolean z = rx3Var.d;
                qx3 qx3Var = rx3Var.c;
                if (!z) {
                    int max = Math.max(0, Math.min(5, L / (gm.L(4.0f) + rx3Var.e)));
                    if (qx3Var.n[0] != max) {
                        gm.W3(qx3Var);
                        int[] iArr2 = qx3Var.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            qx3Var.invalidate();
                        }
                    }
                }
            }
            if (rx3Var == null || !rx3Var.d || rx3Var.isShowing()) {
                return true;
            }
        }
        e34Var.T1 = motionEvent.getX();
        e34Var.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        e34 e34Var = this.n3;
        return Math.max(400L, Math.min(45, e34Var.u2 - e34Var.t2) * 35) + Math.max(600L, Math.min(55, e34Var.u2 - e34Var.t2) * 40) + 150;
    }
}
