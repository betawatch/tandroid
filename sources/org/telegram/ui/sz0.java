package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sz0 extends View {
    public int a;
    public int b;
    public final /* synthetic */ vz0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(vz0 vz0Var, Context context) {
        super(context);
        this.c = vz0Var;
        this.a = 0;
        this.b = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.b;
        ProfileActivity profileActivity = this.c.e;
        if (i11 != profileActivity.a.getMeasuredHeight()) {
            this.a = 0;
        }
        this.b = profileActivity.a.getMeasuredHeight();
        int childCount = profileActivity.a.getChildCount();
        if (childCount != profileActivity.d.e.J2) {
            setMeasuredDimension(profileActivity.a.getMeasuredWidth(), this.a);
            return;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = profileActivity.a.getChildAt(i13);
            profileActivity.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0 && R != profileActivity.y3) {
                i12 += profileActivity.a.getChildAt(i13).getMeasuredHeight();
            }
        }
        View view = profileActivity.fragmentView;
        int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i12;
        if (measuredHeight > profileActivity.T3()) {
            measuredHeight = 0;
        }
        int i14 = measuredHeight > 0 ? measuredHeight : 0;
        int measuredWidth = profileActivity.a.getMeasuredWidth();
        this.a = i14;
        setMeasuredDimension(measuredWidth, i14);
    }
}
