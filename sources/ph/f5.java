package ph;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f5 extends FrameLayout {
    public View a;
    public ArrayList b;
    public e5 c;
    public String d;
    public boolean e;
    public Utilities.Callback f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i10, int i11, String str) {
        d5 d5Var = new d5(this, getContext(), i10, i11);
        d5Var.setContentDescription(str);
        this.b.add(d5Var);
        addView(d5Var);
    }

    public final void b(boolean z4, boolean z10) {
        if (this.r == z4) {
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = z4;
        if (!z10) {
            this.n = z4 ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z4 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 18));
        if (this.r) {
            this.s.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            this.s.setDuration(350L);
            this.s.setInterpolator(mr.h);
        }
        this.s.start();
    }

    public final boolean c() {
        ArrayList arrayList = this.b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            d5 d5Var = (d5) arrayList.get(i10);
            if (d5Var.a != 4) {
                i10++;
            } else if (d5Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10, boolean z4) {
        ArrayList arrayList = this.b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d5 d5Var = (d5) arrayList.get(i11);
            if (d5Var.a == i10) {
                d5Var.setVisibility(z4 ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f10 = this.n;
            if (this.r) {
                f10 = mr.h.getInterpolation(AndroidUtilities.cascade(f10, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.b;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.a.layout(0, 0, i14, i15);
        e5 e5Var = this.c;
        e5Var.layout(i14 - e5Var.getMeasuredWidth(), (i15 - this.c.getMeasuredHeight()) / 2, i14, (this.c.getMeasuredHeight() + i15) / 2);
        int dp = (i14 - AndroidUtilities.dp(32.33f)) - this.c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((d5) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        int min = Math.min(AndroidUtilities.dp(c() ? 20.0f : 30.0f), i16 < 2 ? 0 : org.telegram.ui.b.z(40.0f, i16, dp) / (i16 - 1));
        int x10 = org.telegram.ui.b.x(40.0f, i15, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i15) / 2;
        int dp3 = AndroidUtilities.dp(12.33f) + (!c() ? (org.telegram.ui.b.z(40.0f, i16, dp) - ((i16 - 1) * min)) / 2 : 0);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((d5) arrayList.get(i18)).getVisibility() == 0) {
                ((d5) arrayList.get(i18)).layout(dp3, x10, AndroidUtilities.dp(40.0f) + dp3, dp2);
                dp3 = org.telegram.messenger.y3.C(40.0f, min, dp3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f = callback;
    }

    public void setShareEnabled(boolean z4) {
        if (this.h != z4) {
            this.h = z4;
            e5 e5Var = this.c;
            e5Var.s = z4;
            e5Var.invalidate();
        }
    }
}
