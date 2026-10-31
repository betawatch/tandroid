package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ux0 extends View {
    public int a;
    public int b;
    public final /* synthetic */ xx0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux0(xx0 xx0Var, Context context) {
        super(context);
        this.c = xx0Var;
        this.a = 0;
        this.b = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.b;
        ProfileActivity profileActivity = this.c.e;
        if (i12 != profileActivity.a.getMeasuredHeight()) {
            this.a = 0;
        }
        this.b = profileActivity.a.getMeasuredHeight();
        int childCount = profileActivity.a.getChildCount();
        if (childCount != profileActivity.d.e.M2) {
            setMeasuredDimension(profileActivity.a.getMeasuredWidth(), this.a);
            return;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = profileActivity.a.getChildAt(i14);
            profileActivity.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0 && R != profileActivity.B3) {
                i13 += profileActivity.a.getChildAt(i14).getMeasuredHeight();
            }
        }
        View view = profileActivity.fragmentView;
        int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m) - i13;
        if (measuredHeight > profileActivity.i4()) {
            measuredHeight = 0;
        }
        int i15 = measuredHeight > 0 ? measuredHeight : 0;
        int measuredWidth = profileActivity.a.getMeasuredWidth();
        this.a = i15;
        setMeasuredDimension(measuredWidth, i15);
    }
}
