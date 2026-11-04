package vg;

import ai.j6;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m1 extends tj0 implements cs, k0 {
    public final ArrayList f3;
    public final u4.b0 g3;
    public boolean h3;
    public boolean i3;
    public final int j3;
    public boolean k3;
    public boolean l3;
    public final lt m3;
    public final xq n3;
    public final ArrayList o3;
    public final i1 p3;
    public View q3;
    public boolean r3;
    public int s3;
    public int t3;
    public boolean u3;
    public boolean v3;

    public m1(Context context, int i3) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f3 = arrayList;
        this.h3 = true;
        this.i3 = true;
        r0 r0Var = (r0) this;
        this.m3 = new lt(r0Var, 28);
        this.n3 = new xq(0.0f, 0.5f, 0.5f, 1.0f);
        this.o3 = new ArrayList();
        this.p3 = new i1(0);
        this.t3 = -1;
        this.j3 = i3;
        u4.b0 b0Var = new u4.b0();
        this.g3 = b0Var;
        setLayoutManager(b0Var);
        setAdapter(new j1(r0Var));
        setClipChildren(false);
        setOnScrollListener(new ji(r0Var, 29));
        setOnItemClickListener(new j6(r0Var, 23));
        li.b0(i3).o1();
        arrayList.clear();
        arrayList.addAll(li.b0(i3).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (this.v3) {
            lt ltVar = this.m3;
            org.telegram.messenger.g0.r(ltVar);
            org.telegram.messenger.g0.i3(ltVar, 2700L);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.l5) {
            ArrayList arrayList = this.f3;
            arrayList.clear();
            arrayList.addAll(li.b0(this.j3).C0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.u3) {
            ArrayList arrayList = this.o3;
            arrayList.clear();
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                l1 l1Var = (l1) getChildAt(i3);
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
                View view = (View) k2.p1.h(1, arrayList);
                this.q3 = view;
                z1(view, !this.i3);
                this.i3 = false;
                this.r3 = false;
            } else if (this.q3 != k2.p1.h(1, arrayList)) {
                this.q3 = (View) k2.p1.h(1, arrayList);
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

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.j3).c(this, hs.l5);
        A1();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.j3).n(this, hs.l5);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.h3 && !this.f3.isEmpty() && getChildCount() > 0) {
            this.h3 = false;
            org.telegram.messenger.g0.h3(new r4.u(this, 21));
        }
        int i13 = this.t3;
        if (i13 > 0) {
            u4.d1 K = K(i13);
            if (K != null) {
                z1(K.a, false);
            }
            this.t3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i3)) {
            this.s3 = View.MeasureSpec.getSize(i3);
        } else {
            this.s3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i3, i10);
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

    @Override // vg.k0
    public void setOffset(float f10) {
        boolean z10 = Math.abs(f10 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.u3 != z10) {
            this.u3 = z10;
            invalidate();
        }
    }

    public final void z1(View view, boolean z10) {
        this.k3 = view != null;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            l1 l1Var = (l1) getChildAt(i3);
            if (l1Var == view) {
                l1Var.a(true, true, z10);
            } else {
                l1Var.a(!this.k3, false, z10);
            }
        }
    }
}
