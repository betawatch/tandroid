// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yk8 extends FrameLayout {
    public View a;
    public ArrayList b;
    public xk8 c;
    public String d;
    public boolean e;
    public qac f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i, int i2, String str) {
        vk8 vk8Var = new vk8(this, getContext(), i, i2);
        vk8Var.setContentDescription(str);
        this.b.add(vk8Var);
        addView(vk8Var);
    }

    public final void b(boolean z, boolean z2) {
        if (this.r == z) {
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = z;
        if (!z2) {
            this.n = z ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new fx7(this, (byte) 12));
        boolean z3 = this.r;
        ValueAnimator valueAnimator2 = this.s;
        if (z3) {
            valueAnimator2.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            valueAnimator2.setDuration(350L);
            this.s.setInterpolator(d53.h);
        }
        this.s.start();
    }

    public final boolean c() {
        ArrayList arrayList = this.b;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            vk8 vk8Var = (vk8) arrayList.get(i);
            if (vk8Var.a != 4) {
                i++;
            } else if (vk8Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i, boolean z) {
        ArrayList arrayList = this.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            vk8 vk8Var = (vk8) arrayList.get(i2);
            if (vk8Var.a == i) {
                vk8Var.setVisibility(z ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * gm.L(16.0f));
        for (int i = 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            float f = this.n;
            if (this.r) {
                f = d53.h.getInterpolation(gm.s(f, i - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f);
            childAt.setTranslationY((1.0f - f) * gm.L(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.b;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.a.layout(0, 0, i5, i6);
        xk8 xk8Var = this.c;
        xk8Var.layout(i5 - xk8Var.getMeasuredWidth(), (i6 - this.c.getMeasuredHeight()) / 2, i5, (this.c.getMeasuredHeight() + i6) / 2);
        int L = (i5 - gm.L(32.33f)) - this.c.getMeasuredWidth();
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (((vk8) arrayList.get(i8)).getVisibility() == 0) {
                i7++;
            }
        }
        int min = Math.min(gm.L(c() ? 20.0f : 30.0f), i7 < 2 ? 0 : (L - (gm.L(40.0f) * i7)) / (i7 - 1));
        int D = wi8.D(40.0f, i6, 2);
        int L2 = (gm.L(40.0f) + i6) / 2;
        int L3 = gm.L(12.33f) + (!c() ? ((L - (gm.L(40.0f) * i7)) - ((i7 - 1) * min)) / 2 : 0);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((vk8) arrayList.get(i9)).getVisibility() == 0) {
                ((vk8) arrayList.get(i9)).layout(L3, D, gm.L(40.0f) + L3, L2);
                L3 = hg9.v(40.0f, min, L3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(qac qacVar) {
        this.f = qacVar;
    }

    public void setShareEnabled(boolean z) {
        if (this.h != z) {
            this.h = z;
            xk8 xk8Var = this.c;
            xk8Var.s = z;
            xk8Var.invalidate();
        }
    }
}
