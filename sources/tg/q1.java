package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.bv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class q1 extends mm0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList f3;
    public final s4.c0 g3;
    public boolean h3;
    public boolean i3;
    public final int j3;
    public boolean k3;
    public boolean l3;
    public final cy0 m3;
    public final ds n3;
    public final ArrayList o3;
    public final bv p3;
    public View q3;
    public boolean r3;
    public int s3;
    public int t3;
    public boolean u3;
    public boolean v3;

    public q1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f3 = arrayList;
        this.h3 = true;
        this.i3 = true;
        s0 s0Var = (s0) this;
        this.m3 = new cy0(s0Var, 13);
        this.n3 = new ds(0.0f, 0.5f, 0.5f, 1.0f);
        this.o3 = new ArrayList();
        this.p3 = new bv(19);
        this.t3 = -1;
        this.j3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.g3 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new n1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new ml(s0Var, 24));
        setOnItemClickListener(new ai.k(s0Var, 22));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    public final void C1(View view, boolean z10) {
        this.k3 = view != null;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            p1 p1Var = (p1) getChildAt(i10);
            if (p1Var == view) {
                p1Var.a(true, true, z10);
            } else {
                p1Var.a(!this.k3, false, z10);
            }
        }
    }

    public final void D1() {
        if (this.v3) {
            cy0 cy0Var = this.m3;
            AndroidUtilities.cancelRunOnUIThread(cy0Var);
            AndroidUtilities.runOnUIThread(cy0Var, 2700L);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.f3;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.j3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.u3) {
            ArrayList arrayList = this.o3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                p1 p1Var = (p1) getChildAt(i10);
                float measuredHeight = ((p1Var.getMeasuredHeight() + p1Var.getTop()) + (p1Var.getMeasuredHeight() >> 1)) / (p1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                p1Var.a = clamp;
                p1Var.b.setTranslationX((1.0f - this.n3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(p1Var);
            }
            Collections.sort(arrayList, this.p3);
            if ((this.i3 || this.r3) && arrayList.size() > 0 && !this.f3.isEmpty()) {
                View view = (View) ic.a.g(1, arrayList);
                this.q3 = view;
                C1(view, !this.i3);
                this.i3 = false;
                this.r3 = false;
            } else if (this.q3 != ic.a.g(1, arrayList)) {
                this.q3 = (View) ic.a.g(1, arrayList);
                if (this.l3) {
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.j3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        D1();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.j3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.h3 && !this.f3.isEmpty() && getChildCount() > 0) {
            this.h3 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(this, 27));
        }
        int i14 = this.t3;
        if (i14 > 0) {
            s4.e1 K = K(i14);
            if (K != null) {
                C1(K.a, false);
            }
            this.t3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.s3 = View.MeasureSpec.getSize(i10);
        } else {
            this.s3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.v3 != z10) {
            this.v3 = z10;
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.m3);
                C1(null, true);
            } else {
                D1();
                this.r3 = true;
                invalidate();
            }
        }
    }

    @Override // tg.l0
    public void setOffset(float f7) {
        boolean z10 = Math.abs(f7 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.u3 != z10) {
            this.u3 = z10;
            invalidate();
        }
    }
}
