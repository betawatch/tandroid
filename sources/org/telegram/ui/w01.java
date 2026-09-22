package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class w01 extends View {
    public int a;
    public int b;
    public final /* synthetic */ z01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(z01 z01Var, Context context) {
        super(context);
        this.c = z01Var;
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
        if (childCount != profileActivity.d.e.N2) {
            setMeasuredDimension(profileActivity.a.getMeasuredWidth(), this.a);
            return;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = profileActivity.a.getChildAt(i14);
            profileActivity.a.getClass();
            int S = RecyclerView.S(childAt);
            if (S >= 0 && S != profileActivity.C3) {
                i13 += profileActivity.a.getChildAt(i14).getMeasuredHeight();
            }
        }
        View view = profileActivity.fragmentView;
        int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i13;
        if (measuredHeight > profileActivity.T3()) {
            measuredHeight = 0;
        }
        int i15 = measuredHeight > 0 ? measuredHeight : 0;
        int measuredWidth = profileActivity.a.getMeasuredWidth();
        this.a = i15;
        setMeasuredDimension(measuredWidth, i15);
    }
}
