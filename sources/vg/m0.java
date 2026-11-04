package vg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout implements k0 {
    public final e6 a;
    public final ArrayList b;
    public final l0 c;
    public final l0 d;
    public final l0 e;
    public final boolean f;

    public m0(Context context, e6 e6Var) {
        super(context);
        this.b = new ArrayList();
        this.a = e6Var;
        for (t80 t80Var : t80.values()) {
            if (t80Var.e) {
                this.b.add(t80Var);
            }
            if (this.b.size() == 3) {
                break;
            }
        }
        if (this.b.size() < 3) {
            a8.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f = true;
        } else {
            this.c = a(context, 0);
            this.d = a(context, 1);
            this.e = a(context, 2);
            setClipChildren(false);
        }
    }

    public final l0 a(Context context, int i3) {
        t80 t80Var = (t80) this.b.get(i3);
        l0 l0Var = new l0(context);
        s1 s1Var = new s1(20);
        l0Var.e = s1Var;
        Paint paint = new Paint(1);
        l0Var.f = paint;
        s1Var.r = 12;
        s1Var.s = 8;
        s1Var.t = 6;
        if (i3 == 1) {
            s1Var.O = 1001;
        }
        if (i3 == 0) {
            s1Var.O = 1002;
        }
        s1Var.P = this.a;
        s1Var.Q = k6.Nk;
        s1Var.c();
        paint.setColor(-1);
        l0Var.setLayoutParams(mf.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        l0Var.setForeground(t80Var.c);
        l0Var.setBackgroundResource(t80Var.b);
        l0Var.setPadding(org.telegram.messenger.g0.L(8.0f));
        l0Var.setBackgroundOuterPadding(org.telegram.messenger.g0.L(32.0f));
        addView(l0Var);
        return l0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        int L = org.telegram.messenger.g0.L(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.height = L;
        layoutParams.width = L;
        float f10 = L;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f10);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = L;
        layoutParams2.width = L;
        int i11 = (int) (f10 * 0.95f);
        layoutParams2.rightMargin = i11;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.height = L;
        layoutParams3.width = L;
        layoutParams3.leftMargin = i11;
    }

    @Override // vg.k0
    public void setOffset(float f10) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = xq.i.getInterpolation(abs);
        int right = getRight();
        l0 l0Var = this.e;
        l0Var.setTranslationX(((l0Var.getWidth() * 1.5f) + (right - l0Var.getRight()) + org.telegram.messenger.g0.L(32.0f)) * interpolation);
        l0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * interpolation);
        float i3 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        l0Var.setScaleX(i3);
        l0Var.setScaleY(i3);
        int top = getTop();
        l0 l0Var2 = this.c;
        l0Var2.setTranslationY((((top - l0Var2.getTop()) - (l0Var2.getHeight() * 1.8f)) - org.telegram.messenger.g0.L(32.0f)) * abs);
        l0Var2.setTranslationX(org.telegram.messenger.g0.L(16.0f) * abs);
        float i10 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        l0Var2.setScaleX(i10);
        l0Var2.setScaleY(i10);
        float interpolation2 = xq.g.getInterpolation(abs);
        int left = getLeft();
        l0 l0Var3 = this.d;
        l0Var3.setTranslationX((((left - l0Var3.getLeft()) - (l0Var3.getWidth() * 2.5f)) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        l0Var3.setTranslationY(((l0Var3.getHeight() * 2.5f) + (getBottom() - l0Var3.getBottom()) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        float i11 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        l0Var3.setScaleX(i11);
        l0Var3.setScaleY(i11);
        float f11 = abs < 0.4f ? abs / 0.4f : 1.0f;
        l0Var.h = f11;
        l0Var2.h = f11;
        l0Var3.h = f11;
    }
}
