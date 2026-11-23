package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import bi.k8;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.si;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.qw0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class m1 extends ek0 implements gs, n0 {
    public final ArrayList f3;
    public final v4.c0 g3;
    public boolean h3;
    public boolean i3;
    public final int j3;
    public boolean k3;
    public boolean l3;
    public final s4.s0 m3;
    public final nr n3;
    public final ArrayList o3;
    public final qw0 p3;
    public View q3;
    public boolean r3;
    public int s3;
    public int t3;
    public boolean u3;
    public boolean v3;

    public m1(Context context, int i7) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f3 = arrayList;
        this.h3 = true;
        this.i3 = true;
        u0 u0Var = (u0) this;
        this.m3 = new s4.s0(u0Var, 5);
        this.n3 = new nr(0.0f, 0.5f, 0.5f, 1.0f);
        this.o3 = new ArrayList();
        this.p3 = new qw0(12);
        this.t3 = -1;
        this.j3 = i7;
        v4.c0 c0Var = new v4.c0();
        this.g3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new j1(u0Var));
        setClipChildren(false);
        setOnScrollListener(new i1(u0Var, 0));
        setOnItemClickListener(new k8(u0Var, 23));
        si.d0(i7).r1();
        arrayList.clear();
        arrayList.addAll(si.d0(i7).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (this.v3) {
            s4.s0 s0Var = this.m3;
            org.telegram.messenger.g0.r(s0Var);
            org.telegram.messenger.g0.h3(s0Var, 2700L);
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.o5) {
            ArrayList arrayList = this.f3;
            arrayList.clear();
            arrayList.addAll(si.d0(this.j3).C0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.u3) {
            ArrayList arrayList = this.o3;
            arrayList.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                l1 l1Var = (l1) getChildAt(i7);
                float measuredHeight = ((l1Var.getMeasuredHeight() + l1Var.getTop()) + (l1Var.getMeasuredHeight() >> 1)) / (l1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i10 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                l1Var.a = i10;
                l1Var.b.setTranslationX((1.0f - this.n3.getInterpolation(i10)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(l1Var);
            }
            Collections.sort(arrayList, this.p3);
            if ((this.i3 || this.r3) && arrayList.size() > 0 && !this.f3.isEmpty()) {
                View view = (View) i5.c.h(1, arrayList);
                this.q3 = view;
                z1(view, !this.i3);
                this.i3 = false;
                this.r3 = false;
            } else if (this.q3 != i5.c.h(1, arrayList)) {
                this.q3 = (View) i5.c.h(1, arrayList);
                if (this.l3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((l1) arrayList.get(i11)).getX(), ((l1) arrayList.get(i11)).getY());
                ((l1) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.j3).c(this, ls.o5);
        A1();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.j3).n(this, ls.o5);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.h3 && !this.f3.isEmpty() && getChildCount() > 0) {
            this.h3 = false;
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 27));
        }
        int i13 = this.t3;
        if (i13 > 0) {
            v4.f1 K = K(i13);
            if (K != null) {
                z1(K.a, false);
            }
            this.t3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i7)) {
            this.s3 = View.MeasureSpec.getSize(i7);
        } else {
            this.s3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i7, i10);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.v3 != z10) {
            this.v3 = z10;
            if (!z10) {
                org.telegram.messenger.g0.r(this.m3);
                z1(null, true);
            } else {
                A1();
                this.r3 = true;
                invalidate();
            }
        }
    }

    @Override // ug.n0
    public void setOffset(float f10) {
        boolean z10 = Math.abs(f10 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.u3 != z10) {
            this.u3 = z10;
            invalidate();
        }
    }

    public final void z1(View view, boolean z10) {
        this.k3 = view != null;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            l1 l1Var = (l1) getChildAt(i7);
            if (l1Var == view) {
                l1Var.a(true, true, z10);
            } else {
                l1Var.a(!this.k3, false, z10);
            }
        }
    }
}
