package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import bi.i8;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.qw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class n1 extends ck0 implements fs, o0 {
    public final ArrayList f3;
    public final v4.c0 g3;
    public boolean h3;
    public boolean i3;
    public final int j3;
    public boolean k3;
    public boolean l3;
    public final s4.s0 m3;
    public final lr n3;
    public final ArrayList o3;
    public final qw0 p3;
    public View q3;
    public boolean r3;
    public int s3;
    public int t3;
    public boolean u3;
    public boolean v3;

    public n1(Context context, int i7) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f3 = arrayList;
        this.h3 = true;
        this.i3 = true;
        v0 v0Var = (v0) this;
        this.m3 = new s4.s0(v0Var, 5);
        this.n3 = new lr(0.0f, 0.5f, 0.5f, 1.0f);
        this.o3 = new ArrayList();
        this.p3 = new qw0(12);
        this.t3 = -1;
        this.j3 = i7;
        v4.c0 c0Var = new v4.c0();
        this.g3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new k1(v0Var));
        setClipChildren(false);
        setOnScrollListener(new j1(v0Var, 0));
        setOnItemClickListener(new i8(v0Var, 23));
        ri.d0(i7).r1();
        arrayList.clear();
        arrayList.addAll(ri.d0(i7).C0);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.n5) {
            ArrayList arrayList = this.f3;
            arrayList.clear();
            arrayList.addAll(ri.d0(this.j3).C0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.u3) {
            ArrayList arrayList = this.o3;
            arrayList.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                m1 m1Var = (m1) getChildAt(i7);
                float measuredHeight = ((m1Var.getMeasuredHeight() + m1Var.getTop()) + (m1Var.getMeasuredHeight() >> 1)) / (m1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i10 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                m1Var.a = i10;
                m1Var.b.setTranslationX((1.0f - this.n3.getInterpolation(i10)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(m1Var);
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
                canvas.translate(((m1) arrayList.get(i11)).getX(), ((m1) arrayList.get(i11)).getY());
                ((m1) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.j3).c(this, ks.n5);
        A1();
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.j3).n(this, ks.n5);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
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

    @Override // ug.o0
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
            m1 m1Var = (m1) getChildAt(i7);
            if (m1Var == view) {
                m1Var.a(true, true, z10);
            } else {
                m1Var.a(!this.k3, false, z10);
            }
        }
    }
}
