package ug;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.z80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q0 extends FrameLayout implements o0 {
    public final i6 a;
    public final ArrayList b;
    public final p0 c;
    public final p0 d;
    public final p0 e;
    public final boolean f;

    public q0(Context context, i6 i6Var) {
        super(context);
        this.b = new ArrayList();
        this.a = i6Var;
        for (z80 z80Var : z80.values()) {
            if (z80Var.e) {
                this.b.add(z80Var);
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

    public final p0 a(Context context, int i7) {
        z80 z80Var = (z80) this.b.get(i7);
        p0 p0Var = new p0(context);
        t1 t1Var = new t1(20);
        p0Var.e = t1Var;
        Paint paint = new Paint(1);
        p0Var.f = paint;
        t1Var.r = 12;
        t1Var.s = 8;
        t1Var.t = 6;
        if (i7 == 1) {
            t1Var.O = 1001;
        }
        if (i7 == 0) {
            t1Var.O = 1002;
        }
        t1Var.P = this.a;
        t1Var.Q = n6.Qk;
        t1Var.c();
        paint.setColor(-1);
        p0Var.setLayoutParams(ma.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        p0Var.setForeground(z80Var.c);
        p0Var.setBackgroundResource(z80Var.b);
        p0Var.setPadding(org.telegram.messenger.g0.L(8.0f));
        p0Var.setBackgroundOuterPadding(org.telegram.messenger.g0.L(32.0f));
        addView(p0Var);
        return p0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
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

    @Override // ug.o0
    public void setOffset(float f10) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f10 / getMeasuredWidth());
        float interpolation = lr.i.getInterpolation(abs);
        int right = getRight();
        p0 p0Var = this.e;
        p0Var.setTranslationX(((p0Var.getWidth() * 1.5f) + (right - p0Var.getRight()) + org.telegram.messenger.g0.L(32.0f)) * interpolation);
        p0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * interpolation);
        float i7 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        p0Var.setScaleX(i7);
        p0Var.setScaleY(i7);
        int top = getTop();
        p0 p0Var2 = this.c;
        p0Var2.setTranslationY((((top - p0Var2.getTop()) - (p0Var2.getHeight() * 1.8f)) - org.telegram.messenger.g0.L(32.0f)) * abs);
        p0Var2.setTranslationX(org.telegram.messenger.g0.L(16.0f) * abs);
        float i10 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        p0Var2.setScaleX(i10);
        p0Var2.setScaleY(i10);
        float interpolation2 = lr.g.getInterpolation(abs);
        int left = getLeft();
        p0 p0Var3 = this.d;
        p0Var3.setTranslationX((((left - p0Var3.getLeft()) - (p0Var3.getWidth() * 2.5f)) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        p0Var3.setTranslationY(((p0Var3.getHeight() * 2.5f) + (getBottom() - p0Var3.getBottom()) + org.telegram.messenger.g0.L(32.0f)) * interpolation2);
        float i11 = Utilities.i(org.telegram.messenger.g0.T1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        p0Var3.setScaleX(i11);
        p0Var3.setScaleY(i11);
        float f11 = abs < 0.4f ? abs / 0.4f : 1.0f;
        p0Var.h = f11;
        p0Var2.h = f11;
        p0Var3.h = f11;
    }
}
