package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.xq;
import org.telegram.ui.un0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class j1 extends pj0 implements ls, l0 {
    public final ArrayList e3;
    public final v4.b0 f3;
    public boolean g3;
    public boolean h3;
    public final int i3;
    public boolean j3;
    public boolean k3;
    public final tg.y l3;
    public final xq m3;
    public final ArrayList n3;
    public final un0 o3;
    public View p3;
    public boolean q3;
    public int r3;
    public int s3;
    public boolean t3;
    public boolean u3;

    public j1(Context context, int i7) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.e3 = arrayList;
        this.g3 = true;
        this.h3 = true;
        s0 s0Var = (s0) this;
        this.l3 = new tg.y(s0Var, 2);
        this.m3 = new xq(0.0f, 0.5f, 0.5f, 1.0f);
        this.n3 = new ArrayList();
        this.o3 = new un0(13);
        this.s3 = -1;
        this.i3 = i7;
        v4.b0 b0Var = new v4.b0();
        this.f3 = b0Var;
        setLayoutManager(b0Var);
        setAdapter(new g1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new ui(s0Var, 26));
        setOnItemClickListener(new ai.k(s0Var, 22));
        org.telegram.messenger.ui.b0(i7).o1();
        arrayList.clear();
        arrayList.addAll(org.telegram.messenger.ui.b0(i7).B0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (this.u3) {
            tg.y yVar = this.l3;
            org.telegram.messenger.g0.r(yVar);
            org.telegram.messenger.g0.i3(yVar, 2700L);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.l5) {
            ArrayList arrayList = this.e3;
            arrayList.clear();
            arrayList.addAll(org.telegram.messenger.ui.b0(this.i3).B0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.t3) {
            ArrayList arrayList = this.n3;
            arrayList.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                i1 i1Var = (i1) getChildAt(i7);
                float measuredHeight = ((i1Var.getMeasuredHeight() + i1Var.getTop()) + (i1Var.getMeasuredHeight() >> 1)) / (i1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i10 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                i1Var.a = i10;
                i1Var.b.setTranslationX((1.0f - this.m3.getInterpolation(i10)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(i1Var);
            }
            Collections.sort(arrayList, this.o3);
            if ((this.h3 || this.q3) && arrayList.size() > 0 && !this.e3.isEmpty()) {
                View view = (View) jg.g.i(1, arrayList);
                this.p3 = view;
                z1(view, !this.h3);
                this.h3 = false;
                this.q3 = false;
            } else if (this.p3 != jg.g.i(1, arrayList)) {
                this.p3 = (View) jg.g.i(1, arrayList);
                if (this.k3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((i1) arrayList.get(i11)).getX(), ((i1) arrayList.get(i11)).getY());
                ((i1) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.i3).c(this, qs.l5);
        A1();
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.i3).n(this, qs.l5);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.g3 && !this.e3.isEmpty() && getChildCount() > 0) {
            this.g3 = false;
            org.telegram.messenger.g0.h3(new sg.t0(this, 19));
        }
        int i13 = this.s3;
        if (i13 > 0) {
            v4.d1 K = K(i13);
            if (K != null) {
                z1(K.a, false);
            }
            this.s3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i7)) {
            this.r3 = View.MeasureSpec.getSize(i7);
        } else {
            this.r3 = View.MeasureSpec.getSize(i10);
        }
        super.onMeasure(i7, i10);
    }

    public void setAutoPlayEnabled(boolean z9) {
        if (this.u3 != z9) {
            this.u3 = z9;
            if (!z9) {
                org.telegram.messenger.g0.r(this.l3);
                z1(null, true);
            } else {
                A1();
                this.q3 = true;
                invalidate();
            }
        }
    }

    @Override // ug.l0
    public void setOffset(float f10) {
        boolean z9 = Math.abs(f10 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.t3 != z9) {
            this.t3 = z9;
            invalidate();
        }
    }

    public final void z1(View view, boolean z9) {
        this.j3 = view != null;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            i1 i1Var = (i1) getChildAt(i7);
            if (i1Var == view) {
                i1Var.a(true, true, z9);
            } else {
                i1Var.a(!this.j3, false, z9);
            }
        }
    }
}
