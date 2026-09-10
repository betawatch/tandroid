package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class q1 extends vl0 implements NotificationCenter.NotificationCenterDelegate, n0 {
    public final ArrayList X2;
    public final s4.c0 Y2;
    public boolean Z2;
    public boolean a3;
    public final int b3;
    public boolean c3;
    public boolean d3;
    public final l9 e3;
    public final wr f3;
    public final ArrayList g3;
    public final m9 h3;
    public View i3;
    public boolean j3;
    public int k3;
    public int l3;
    public boolean m3;
    public boolean n3;

    public q1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.X2 = arrayList;
        this.Z2 = true;
        this.a3 = true;
        v0 v0Var = (v0) this;
        this.e3 = new l9(v0Var, 28);
        this.f3 = new wr(0.0f, 0.5f, 0.5f, 1.0f);
        this.g3 = new ArrayList();
        this.h3 = new m9(29);
        this.l3 = -1;
        this.b3 = i10;
        s4.c0 c0Var = new s4.c0();
        this.Y2 = c0Var;
        setLayoutManager(c0Var);
        setAdapter(new n1(v0Var));
        setClipChildren(false);
        setOnScrollListener(new al0(v0Var, 9));
        setOnItemClickListener(new ai.g(v0Var, 16));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.X2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.b3).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.m3) {
            ArrayList arrayList = this.g3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                p1 p1Var = (p1) getChildAt(i10);
                float measuredHeight = ((p1Var.getMeasuredHeight() + p1Var.getTop()) + (p1Var.getMeasuredHeight() >> 1)) / (p1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                p1Var.a = clamp;
                p1Var.b.setTranslationX((1.0f - this.f3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(p1Var);
            }
            Collections.sort(arrayList, this.h3);
            if ((this.a3 || this.j3) && arrayList.size() > 0 && !this.X2.isEmpty()) {
                View view = (View) hc.b.i(1, arrayList);
                this.i3 = view;
                v1(view, !this.a3);
                this.a3 = false;
                this.j3 = false;
            } else if (this.i3 != hc.b.i(1, arrayList)) {
                this.i3 = (View) hc.b.i(1, arrayList);
                if (this.d3) {
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

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.b3).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        w1();
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.b3).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z2 && !this.X2.isEmpty() && getChildCount() > 0) {
            this.Z2 = false;
            AndroidUtilities.runOnUIThread(new q0(this, 2));
        }
        int i14 = this.l3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                v1(K.a, false);
            }
            this.l3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.k3 = View.MeasureSpec.getSize(i10);
        } else {
            this.k3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.n3 != z10) {
            this.n3 = z10;
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.e3);
                v1(null, true);
            } else {
                w1();
                this.j3 = true;
                invalidate();
            }
        }
    }

    @Override // qg.n0
    public void setOffset(float f7) {
        boolean z10 = Math.abs(f7 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.m3 != z10) {
            this.m3 = z10;
            invalidate();
        }
    }

    public final void v1(View view, boolean z10) {
        this.c3 = view != null;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            p1 p1Var = (p1) getChildAt(i10);
            if (p1Var == view) {
                p1Var.a(true, true, z10);
            } else {
                p1Var.a(!this.c3, false, z10);
            }
        }
    }

    public final void w1() {
        if (this.n3) {
            l9 l9Var = this.e3;
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            AndroidUtilities.runOnUIThread(l9Var, 2700L);
        }
    }
}
