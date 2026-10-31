package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vt0 extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Paint c;
    public final /* synthetic */ PremiumPreviewFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.c = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.h0;
        kg.k1 k1Var = premiumPreviewFragment.m0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.w0 != null) {
            premiumPreviewFragment.n0();
        }
        if (!premiumPreviewFragment.Z) {
            if (premiumPreviewFragment.a0) {
                float f7 = premiumPreviewFragment.b0 + 0.016f;
                premiumPreviewFragment.b0 = f7;
                if (f7 > 3.0f) {
                    premiumPreviewFragment.a0 = false;
                }
            } else {
                float f10 = premiumPreviewFragment.b0 - 0.016f;
                premiumPreviewFragment.b0 = f10;
                if (f10 < 1.0f) {
                    premiumPreviewFragment.a0 = true;
                }
            }
        }
        View m10 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
        premiumPreviewFragment.c0 = m10 == null ? 0 : m10.getBottom();
        lVar = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        int L = org.telegram.messenger.i0.L(16.0f) + lVar.getBottom();
        float f11 = 1.0f - ((premiumPreviewFragment.c0 - L) / (premiumPreviewFragment.Y - L));
        premiumPreviewFragment.f0 = f11;
        premiumPreviewFragment.f0 = Utilities.i(f11, 1.0f, 0.0f);
        lVar2 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        int L2 = org.telegram.messenger.i0.L(16.0f) + lVar2.getBottom();
        if (premiumPreviewFragment.c0 < L2) {
            premiumPreviewFragment.c0 = L2;
        }
        float f12 = premiumPreviewFragment.q0;
        premiumPreviewFragment.q0 = 0.0f;
        if (premiumPreviewFragment.c0 < org.telegram.messenger.i0.L(30.0f) + L2) {
            premiumPreviewFragment.q0 = ((org.telegram.messenger.i0.L(30.0f) + L2) - premiumPreviewFragment.c0) / org.telegram.messenger.i0.L(30.0f);
        }
        if (premiumPreviewFragment.W) {
            premiumPreviewFragment.q0 = 1.0f;
            premiumPreviewFragment.f0 = 1.0f;
        }
        if (f12 != premiumPreviewFragment.q0) {
            premiumPreviewFragment.a.invalidate();
        }
        int i10 = premiumPreviewFragment.c0;
        lVar3 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        float L3 = org.telegram.messenger.i0.L(24.0f) + org.telegram.messenger.i0.L(premiumPreviewFragment.U.e.getVisibility() == 0 ? 24.0f : 16.0f) + (i10 - ((premiumPreviewFragment.U.getMeasuredHeight() + lVar3.getMeasuredHeight()) - premiumPreviewFragment.X));
        lVar4 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((lVar4.getMeasuredHeight() - premiumPreviewFragment.X) - premiumPreviewFragment.U.a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.X) - premiumPreviewFragment.U.getTop()) - premiumPreviewFragment.U.a.getTop(), L3);
        float L4 = ((-max) / 4.0f) + org.telegram.messenger.i0.L(16.0f);
        premiumPreviewFragment.U.setTranslationY(max);
        premiumPreviewFragment.U.d.setTranslationY(L4 + org.telegram.messenger.i0.L(premiumPreviewFragment.g0 == 1 ? 9.0f : 16.0f));
        float f13 = premiumPreviewFragment.f0;
        float z11 = c3.i0.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        premiumPreviewFragment.U.d.setScaleX(z11);
        premiumPreviewFragment.U.d.setScaleY(z11);
        premiumPreviewFragment.U.d.setAlpha(f14);
        premiumPreviewFragment.U.b.setAlpha(f14);
        premiumPreviewFragment.U.e.setAlpha(f14);
        premiumPreviewFragment.V.setAlpha(1.0f - premiumPreviewFragment.f0);
        premiumPreviewFragment.V.setTranslationY(premiumPreviewFragment.U.c.getY() + premiumPreviewFragment.U.getY() + ((-(r1.getMeasuredHeight() - premiumPreviewFragment.U.d.getMeasuredWidth())) / 2.0f));
        float L5 = org.telegram.messenger.i0.L(72.0f) - premiumPreviewFragment.U.a.getLeft();
        float f15 = premiumPreviewFragment.f0;
        premiumPreviewFragment.U.a.setTranslationX((1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * L5);
        du0 du0Var = premiumPreviewFragment.U;
        du0Var.d.b.s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.b0) + (premiumPreviewFragment.U.c.getX() + du0Var.getX())) / getMeasuredWidth();
        du0 du0Var2 = premiumPreviewFragment.U;
        du0Var2.d.b.t = (premiumPreviewFragment.U.c.getY() + du0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.Z) {
            invalidate();
            premiumPreviewFragment.K.invalidate();
            premiumPreviewFragment.J.invalidate();
        }
        k1Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.b0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i11 = org.telegram.ui.ActionBar.t6.a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i11);
            Paint paint = this.c;
            paint.setColor(themedColor);
            boolean z12 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.q0 > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
                if (lVar6 != null) {
                    paint.setColor(i0.b.f(premiumPreviewFragment.q0, premiumPreviewFragment.getThemedColor(i11), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.t6.d6)));
                    float measuredWidth = getMeasuredWidth();
                    lVar7 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
                    float height = lVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z12;
                }
            }
            canvas2 = canvas;
            r11 = z12;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), k1Var.f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.J.getVisibility() != 0) {
            premiumPreviewFragment.v0.b(premiumPreviewFragment.o0.d, r11);
            premiumPreviewFragment.v0.setBounds(r11, getHeight() - premiumPreviewFragment.o0.d, getWidth(), getHeight());
            premiumPreviewFragment.v0.draw(canvas2);
        }
        z4Var = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).parentLayout;
        if (z4Var == null || !z10) {
            return;
        }
        z4Var2 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).parentLayout;
        int i12 = (int) (premiumPreviewFragment.q0 * 255.0f);
        lVar5 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        ((ActionBarLayout) z4Var2).p(canvas2, i12, lVar5.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.U.c.getX() + premiumPreviewFragment.U.getX();
        float y3 = premiumPreviewFragment.U.c.getY() + premiumPreviewFragment.U.getY();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(x10, y3, (premiumPreviewFragment.U.d == null ? 0 : r4.getMeasuredWidth()) + x10, (premiumPreviewFragment.U.d == null ? 0 : r6.getMeasuredHeight()) + y3);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.a) && !premiumPreviewFragment.a.I1) {
            motionEvent.offsetLocation(-x10, -y3);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.a = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.a = false;
            }
            premiumPreviewFragment.U.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.U.e.getX() + premiumPreviewFragment.U.getX();
        float y10 = premiumPreviewFragment.U.e.getY() + premiumPreviewFragment.U.getY();
        rectF.set(x11, y10, premiumPreviewFragment.U.e.getWidth() + x11, premiumPreviewFragment.U.e.getHeight() + y10);
        if (premiumPreviewFragment.q0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.b) && !premiumPreviewFragment.a.I1)) {
            motionEvent.offsetLocation(-x11, -y10);
            if (motionEvent.getAction() == 0) {
                this.b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.b = false;
            }
            premiumPreviewFragment.U.e.dispatchTouchEvent(motionEvent);
            if (this.b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.U.d.b.u = r3.getMeasuredWidth() / getMeasuredWidth();
        premiumPreviewFragment.U.d.b.v = r3.getMeasuredHeight() / getMeasuredHeight();
        du0 du0Var = premiumPreviewFragment.U;
        du0Var.d.b.s = (premiumPreviewFragment.U.d.getX() + du0Var.getX()) / getMeasuredWidth();
        du0 du0Var2 = premiumPreviewFragment.U;
        du0Var2.d.b.t = (premiumPreviewFragment.U.d.getY() + du0Var2.getY()) / getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.W = z10;
        premiumPreviewFragment.X = org.telegram.messenger.i0.m;
        premiumPreviewFragment.U.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.V.getLayoutParams().height = premiumPreviewFragment.U.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.J;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i12 = org.telegram.messenger.i0.L(68.0f);
        }
        org.telegram.ui.Components.az azVar = premiumPreviewFragment.P;
        azVar.M = (premiumPreviewFragment.X + i12) - org.telegram.messenger.i0.L(16.0f);
        azVar.p1();
        premiumPreviewFragment.P.S = i12;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.w0();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.c;
        ArrayList arrayList2 = premiumPreviewFragment.b;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            premiumPreviewFragment.L.a((eu0) arrayList2.get(i15), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            ((eu0) arrayList2.get(i15)).e = i14;
            i14 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            premiumPreviewFragment.L.a((eu0) arrayList.get(i16), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            ((eu0) arrayList.get(i16)).e = i14;
            i14 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        premiumPreviewFragment.N = i14;
    }
}
