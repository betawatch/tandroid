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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Wallet.n5;
import org.telegram.ui.mb1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class p1 extends qm0 implements NotificationCenter.NotificationCenterDelegate, l0 {
    public final ArrayList V2;
    public final s4.d0 W2;
    public boolean X2;
    public boolean Y2;
    public final int Z2;
    public boolean a3;
    public boolean b3;
    public final n5 c3;
    public final hs d3;
    public final ArrayList e3;
    public final mb1 f3;
    public View g3;
    public boolean h3;
    public int i3;
    public int j3;
    public boolean k3;
    public boolean l3;

    public p1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.V2 = arrayList;
        this.X2 = true;
        this.Y2 = true;
        s0 s0Var = (s0) this;
        this.c3 = new n5(s0Var, 5);
        this.d3 = new hs(0.0f, 0.5f, 0.5f, 1.0f);
        this.e3 = new ArrayList();
        this.f3 = new mb1(8);
        this.j3 = -1;
        this.Z2 = i10;
        s4.d0 d0Var = new s4.d0();
        this.W2 = d0Var;
        setLayoutManager(d0Var);
        setAdapter(new m1(s0Var));
        setClipChildren(false);
        setOnScrollListener(new mh0(s0Var, 14));
        setOnItemClickListener(new ai.g(s0Var, 17));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.V2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.Z2).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.k3) {
            ArrayList arrayList = this.e3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                o1 o1Var = (o1) getChildAt(i10);
                float measuredHeight = ((o1Var.getMeasuredHeight() + o1Var.getTop()) + (o1Var.getMeasuredHeight() >> 1)) / (o1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                o1Var.a = clamp;
                o1Var.b.setTranslationX((1.0f - this.d3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(o1Var);
            }
            Collections.sort(arrayList, this.f3);
            if ((this.Y2 || this.h3) && arrayList.size() > 0 && !this.V2.isEmpty()) {
                View view = (View) hg.c.g(1, arrayList);
                this.g3 = view;
                x1(view, !this.Y2);
                this.Y2 = false;
                this.h3 = false;
            } else if (this.g3 != hg.c.g(1, arrayList)) {
                this.g3 = (View) hg.c.g(1, arrayList);
                if (this.b3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((o1) arrayList.get(i11)).getX(), ((o1) arrayList.get(i11)).getY());
                ((o1) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return true;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.Z2).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        y1();
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.Z2).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.X2 && !this.V2.isEmpty() && getChildCount() > 0) {
            this.X2 = false;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 28));
        }
        int i14 = this.j3;
        if (i14 > 0) {
            s4.d1 K = K(i14);
            if (K != null) {
                x1(K.a, false);
            }
            this.j3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.i3 = View.MeasureSpec.getSize(i10);
        } else {
            this.i3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.l3 != z10) {
            this.l3 = z10;
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.c3);
                x1(null, true);
            } else {
                y1();
                this.h3 = true;
                invalidate();
            }
        }
    }

    @Override // rg.l0
    public void setOffset(float f7) {
        boolean z10 = Math.abs(f7 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.k3 != z10) {
            this.k3 = z10;
            invalidate();
        }
    }

    public final void x1(View view, boolean z10) {
        this.a3 = view != null;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            o1 o1Var = (o1) getChildAt(i10);
            if (o1Var == view) {
                o1Var.a(true, true, z10);
            } else {
                o1Var.a(!this.a3, false, z10);
            }
        }
    }

    public final void y1() {
        if (this.l3) {
            n5 n5Var = this.c3;
            AndroidUtilities.cancelRunOnUIThread(n5Var);
            AndroidUtilities.runOnUIThread(n5Var, 2700L);
        }
    }
}
