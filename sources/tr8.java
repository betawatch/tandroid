// default package

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tr8 extends View {
    public int a;
    public int b;
    public final /* synthetic */ wr8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr8(wr8 wr8Var, Context context) {
        super(context);
        this.c = wr8Var;
        this.a = 0;
        this.b = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        ProfileActivity profileActivity = this.c.e;
        if (i3 != profileActivity.a.getMeasuredHeight()) {
            this.a = 0;
        }
        this.b = profileActivity.a.getMeasuredHeight();
        int childCount = profileActivity.a.getChildCount();
        if (childCount != profileActivity.d.e.O2) {
            setMeasuredDimension(profileActivity.a.getMeasuredWidth(), this.a);
            return;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = profileActivity.a.getChildAt(i5);
            profileActivity.a.getClass();
            int S = RecyclerView.S(childAt);
            if (S >= 0 && S != profileActivity.D3) {
                i4 += profileActivity.a.getChildAt(i5).getMeasuredHeight();
            }
        }
        View view = profileActivity.fragmentView;
        int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - a.getCurrentActionBarHeight()) - hl.m) - i4;
        if (measuredHeight > profileActivity.d2()) {
            measuredHeight = 0;
        }
        int i6 = measuredHeight > 0 ? measuredHeight : 0;
        int measuredWidth = profileActivity.a.getMeasuredWidth();
        this.a = i6;
        setMeasuredDimension(measuredWidth, i6);
    }
}
