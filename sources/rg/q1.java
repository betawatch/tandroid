package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.eb1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class q1 extends zl0 implements NotificationCenter.NotificationCenterDelegate, m0 {
    public final ArrayList e3;
    public final s4.c0 f3;
    public boolean g3;
    public boolean h3;
    public final int i3;
    public boolean j3;
    public boolean k3;
    public final pg.c1 l3;
    public final tr m3;
    public final ArrayList n3;
    public final eb1 o3;
    public View p3;
    public boolean q3;
    public int r3;
    public int s3;
    public boolean t3;
    public boolean u3;

    public q1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.e3 = arrayList;
        this.g3 = true;
        this.h3 = true;
        t0 t0Var = (t0) this;
        this.l3 = new pg.c1(t0Var, 2);
        this.m3 = new tr(0.0f, 0.5f, 0.5f, 1.0f);
        this.n3 = new ArrayList();
        this.o3 = new eb1(6);
        this.s3 = -1;
        this.i3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.f3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new n1(t0Var));
        setClipChildren(false);
        setOnScrollListener(new xb0(t0Var, 13));
        setOnItemClickListener(new ai.g(t0Var, 17));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.e3;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.i3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.t3) {
            ArrayList arrayList = this.n3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                p1 p1Var = (p1) getChildAt(i10);
                float measuredHeight = ((p1Var.getMeasuredHeight() + p1Var.getTop()) + (p1Var.getMeasuredHeight() >> 1)) / (p1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                p1Var.a = clamp;
                p1Var.b.setTranslationX((1.0f - this.m3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(p1Var);
            }
            Collections.sort(arrayList, this.o3);
            if ((this.h3 || this.q3) && arrayList.size() > 0 && !this.e3.isEmpty()) {
                View view = (View) hg.c.g(1, arrayList);
                this.p3 = view;
                x1(view, !this.h3);
                this.h3 = false;
                this.q3 = false;
            } else if (this.p3 != hg.c.g(1, arrayList)) {
                this.p3 = (View) hg.c.g(1, arrayList);
                if (this.k3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((p1) arrayList.get(i11)).getX(), ((p1) arrayList.get(i11)).getY());
                ((p1) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.i3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        y1();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.i3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.g3 && !this.e3.isEmpty() && getChildCount() > 0) {
            this.g3 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 29));
        }
        int i14 = this.s3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                x1(K.a, false);
            }
            this.s3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.r3 = View.MeasureSpec.getSize(i10);
        } else {
            this.r3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.u3 != z10) {
            this.u3 = z10;
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.l3);
                x1(null, true);
            } else {
                y1();
                this.q3 = true;
                invalidate();
            }
        }
    }

    @Override // rg.m0
    public void setOffset(float f7) {
        boolean z10 = Math.abs(f7 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.t3 != z10) {
            this.t3 = z10;
            invalidate();
        }
    }

    public final void x1(View view, boolean z10) {
        this.j3 = view != null;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            p1 p1Var = (p1) getChildAt(i10);
            if (p1Var == view) {
                p1Var.a(true, true, z10);
            } else {
                p1Var.a(!this.j3, false, z10);
            }
        }
    }

    public final void y1() {
        if (this.u3) {
            pg.c1 c1Var = this.l3;
            AndroidUtilities.cancelRunOnUIThread(c1Var);
            AndroidUtilities.runOnUIThread(c1Var, 2700L);
        }
    }
}
