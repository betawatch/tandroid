package vh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f4 extends FrameLayout {
    public View a;
    public ArrayList b;
    public e4 c;
    public String d;
    public boolean e;
    public q20 f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i10, int i11, String str) {
        d4 d4Var = new d4(this, getContext(), i10, i11);
        d4Var.setContentDescription(str);
        this.b.add(d4Var);
        addView(d4Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = z10;
        if (!z11) {
            this.n = z10 ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new c4(0, this));
        if (this.r) {
            this.s.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            this.s.setDuration(350L);
            this.s.setInterpolator(gr.h);
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
            d4 d4Var = (d4) arrayList.get(i10);
            if (d4Var.a != 4) {
                i10++;
            } else if (d4Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10, boolean z10) {
        ArrayList arrayList = this.b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d4 d4Var = (d4) arrayList.get(i11);
            if (d4Var.a == i10) {
                d4Var.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * org.telegram.messenger.i0.L(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f7 = this.n;
            if (this.r) {
                f7 = gr.h.getInterpolation(org.telegram.messenger.i0.s(f7, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f7);
            childAt.setTranslationY((1.0f - f7) * org.telegram.messenger.i0.L(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.b;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.a.layout(0, 0, i14, i15);
        e4 e4Var = this.c;
        e4Var.layout(i14 - e4Var.getMeasuredWidth(), (i15 - this.c.getMeasuredHeight()) / 2, i14, (this.c.getMeasuredHeight() + i15) / 2);
        int L = (i14 - org.telegram.messenger.i0.L(32.33f)) - this.c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((d4) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        int min = Math.min(org.telegram.messenger.i0.L(c() ? 20.0f : 30.0f), i16 < 2 ? 0 : z20.A(40.0f, i16, L) / (i16 - 1));
        int y3 = z20.y(40.0f, i15, 2);
        int L2 = (org.telegram.messenger.i0.L(40.0f) + i15) / 2;
        int L3 = org.telegram.messenger.i0.L(12.33f) + (!c() ? (z20.A(40.0f, i16, L) - ((i16 - 1) * min)) / 2 : 0);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((d4) arrayList.get(i18)).getVisibility() == 0) {
                ((d4) arrayList.get(i18)).layout(L3, y3, org.telegram.messenger.i0.L(40.0f) + L3, L2);
                L3 = org.telegram.messenger.m5.C(40.0f, min, L3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(q20 q20Var) {
        this.f = q20Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            e4 e4Var = this.c;
            e4Var.s = z10;
            e4Var.invalidate();
        }
    }
}
