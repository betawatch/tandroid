package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vc1 extends ViewGroup {
    public final Paint a;
    public View b;
    public boolean c;

    public vc1(Context context) {
        super(context);
        this.a = new Paint(1);
        setClipToPadding(false);
    }

    public final boolean a() {
        View view = this.b;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float T1 = org.telegram.messenger.i0.T1(0.1f, 0.75f, org.telegram.messenger.i0.R0(getPaddingBottom()));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        int k10 = i0.b.k(org.telegram.ui.ActionBar.t6.r1(T1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)), x02);
        Paint paint = this.a;
        paint.setColor(x02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - r0, paint);
        paint.setColor(k10);
        canvas.drawRect(0.0f, getMeasuredHeight() - r0, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean a2 = a();
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = a2 ? getPaddingBottom() + org.telegram.messenger.i0.L(44.0f) : 0;
        setMeasuredDimension(size, paddingBottom);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.c != a2) {
            this.c = a2;
            WeakHashMap weakHashMap = r0.h0.a;
            r0.x.c(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.b = view;
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14).setPadding(i10, i11, i12, i13);
        }
    }
}
