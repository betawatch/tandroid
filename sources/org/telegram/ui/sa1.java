package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sa1 extends ViewGroup {
    public final Paint a;
    public View b;
    public boolean c;

    public sa1(Context context) {
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
        float T1 = org.telegram.messenger.g0.T1(0.1f, 0.75f, org.telegram.messenger.g0.R0(getPaddingBottom()));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.r1(T1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)), x02);
        Paint paint = this.a;
        paint.setColor(x02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - r0, paint);
        paint.setColor(k10);
        canvas.drawRect(0.0f, getMeasuredHeight() - r0, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean a10 = a();
        int size = View.MeasureSpec.getSize(i3);
        int paddingBottom = a10 ? getPaddingBottom() + org.telegram.messenger.g0.L(44.0f) : 0;
        setMeasuredDimension(size, paddingBottom);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.c != a10) {
            this.c = a10;
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.b = view;
    }

    @Override // android.view.View
    public final void setPadding(int i3, int i10, int i11, int i12) {
        super.setPadding(i3, i10, i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).setPadding(i3, i10, i11, i12);
        }
    }
}
