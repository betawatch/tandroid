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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vv0 extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Paint c;
    public final /* synthetic */ PremiumPreviewFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.c = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v20 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.d0;
        ag.i2 i2Var = premiumPreviewFragment.i0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.q0 != null) {
            premiumPreviewFragment.j0();
        }
        if (!premiumPreviewFragment.V) {
            if (premiumPreviewFragment.W) {
                float f10 = premiumPreviewFragment.X + 0.016f;
                premiumPreviewFragment.X = f10;
                if (f10 > 3.0f) {
                    premiumPreviewFragment.W = false;
                }
            } else {
                float f11 = premiumPreviewFragment.X - 0.016f;
                premiumPreviewFragment.X = f11;
                if (f11 < 1.0f) {
                    premiumPreviewFragment.W = true;
                }
            }
        }
        View m10 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
        premiumPreviewFragment.Y = m10 == null ? 0 : m10.getBottom();
        kVar = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((premiumPreviewFragment.Y - dp) / (premiumPreviewFragment.U - dp));
        premiumPreviewFragment.b0 = f12;
        premiumPreviewFragment.b0 = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.Y < dp2) {
            premiumPreviewFragment.Y = dp2;
        }
        float f13 = premiumPreviewFragment.m0;
        premiumPreviewFragment.m0 = 0.0f;
        if (premiumPreviewFragment.Y < AndroidUtilities.dp(30.0f) + dp2) {
            premiumPreviewFragment.m0 = ((AndroidUtilities.dp(30.0f) + dp2) - premiumPreviewFragment.Y) / AndroidUtilities.dp(30.0f);
        }
        if (premiumPreviewFragment.S) {
            premiumPreviewFragment.m0 = 1.0f;
            premiumPreviewFragment.b0 = 1.0f;
        }
        if (f13 != premiumPreviewFragment.m0) {
            premiumPreviewFragment.a.invalidate();
        }
        int i10 = premiumPreviewFragment.Y;
        kVar3 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        float dp3 = AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(premiumPreviewFragment.Q.e.getVisibility() == 0 ? 24.0f : 16.0f) + (i10 - ((premiumPreviewFragment.Q.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.T));
        kVar4 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.T) - premiumPreviewFragment.Q.a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.T) - premiumPreviewFragment.Q.getTop()) - premiumPreviewFragment.Q.a.getTop(), dp3);
        float dp4 = ((-max) / 4.0f) + AndroidUtilities.dp(16.0f);
        premiumPreviewFragment.Q.setTranslationY(max);
        premiumPreviewFragment.Q.d.setTranslationY(dp4 + AndroidUtilities.dp(premiumPreviewFragment.c0 == 1 ? 9.0f : 16.0f));
        float f14 = premiumPreviewFragment.b0;
        float z11 = com.google.android.recaptcha.internal.a.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        premiumPreviewFragment.Q.d.setScaleX(z11);
        premiumPreviewFragment.Q.d.setScaleY(z11);
        premiumPreviewFragment.Q.d.setAlpha(f15);
        premiumPreviewFragment.Q.b.setAlpha(f15);
        premiumPreviewFragment.Q.e.setAlpha(f15);
        premiumPreviewFragment.R.setAlpha(1.0f - premiumPreviewFragment.b0);
        premiumPreviewFragment.R.setTranslationY(premiumPreviewFragment.Q.c.getY() + premiumPreviewFragment.Q.getY() + ((-(r1.getMeasuredHeight() - premiumPreviewFragment.Q.d.getMeasuredWidth())) / 2.0f));
        float dp5 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.Q.a.getLeft();
        float f16 = premiumPreviewFragment.b0;
        premiumPreviewFragment.Q.a.setTranslationX((1.0f - org.telegram.ui.Components.er.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * dp5);
        fw0 fw0Var = premiumPreviewFragment.Q;
        fw0Var.d.b.p = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.X) + (premiumPreviewFragment.Q.c.getX() + fw0Var.getX())) / getMeasuredWidth();
        fw0 fw0Var2 = premiumPreviewFragment.Q;
        fw0Var2.d.b.q = (premiumPreviewFragment.Q.c.getY() + fw0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.V) {
            invalidate();
            premiumPreviewFragment.G.invalidate();
            premiumPreviewFragment.F.invalidate();
        }
        i2Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i11 = org.telegram.ui.ActionBar.g6.a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i11);
            Paint paint = this.c;
            paint.setColor(themedColor);
            r11 = 0;
            r11 = 0;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.m0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.b.d(premiumPreviewFragment.m0, premiumPreviewFragment.getThemedColor(i11), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.g6.d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                }
            }
            canvas2 = canvas;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), i2Var.f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.F.getVisibility() != 0) {
            premiumPreviewFragment.p0.b(premiumPreviewFragment.k0.d, r11);
            premiumPreviewFragment.p0.setBounds(r11, getHeight() - premiumPreviewFragment.k0.d, getWidth(), getHeight());
            premiumPreviewFragment.p0.draw(canvas2);
        }
        b5Var = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).parentLayout;
        if (b5Var == null || !z10) {
            return;
        }
        b5Var2 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).parentLayout;
        int i12 = (int) (premiumPreviewFragment.m0 * 255.0f);
        kVar5 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
        ((ActionBarLayout) b5Var2).p(canvas2, i12, kVar5.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x8 = premiumPreviewFragment.Q.c.getX() + premiumPreviewFragment.Q.getX();
        float y10 = premiumPreviewFragment.Q.c.getY() + premiumPreviewFragment.Q.getY();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(x8, y10, (premiumPreviewFragment.Q.d == null ? 0 : r4.getMeasuredWidth()) + x8, (premiumPreviewFragment.Q.d == null ? 0 : r6.getMeasuredHeight()) + y10);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.a) && !premiumPreviewFragment.a.G1) {
            motionEvent.offsetLocation(-x8, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.a = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.a = false;
            }
            premiumPreviewFragment.Q.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x10 = premiumPreviewFragment.Q.e.getX() + premiumPreviewFragment.Q.getX();
        float y11 = premiumPreviewFragment.Q.e.getY() + premiumPreviewFragment.Q.getY();
        rectF.set(x10, y11, premiumPreviewFragment.Q.e.getWidth() + x10, premiumPreviewFragment.Q.e.getHeight() + y11);
        if (premiumPreviewFragment.m0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.b) && !premiumPreviewFragment.a.G1)) {
            motionEvent.offsetLocation(-x10, -y11);
            if (motionEvent.getAction() == 0) {
                this.b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.b = false;
            }
            premiumPreviewFragment.Q.e.dispatchTouchEvent(motionEvent);
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
        premiumPreviewFragment.Q.d.b.r = r3.getMeasuredWidth() / getMeasuredWidth();
        premiumPreviewFragment.Q.d.b.s = r3.getMeasuredHeight() / getMeasuredHeight();
        fw0 fw0Var = premiumPreviewFragment.Q;
        fw0Var.d.b.p = (premiumPreviewFragment.Q.d.getX() + fw0Var.getX()) / getMeasuredWidth();
        fw0 fw0Var2 = premiumPreviewFragment.Q;
        fw0Var2.d.b.q = (premiumPreviewFragment.Q.d.getY() + fw0Var2.getY()) / getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.S = z10;
        premiumPreviewFragment.T = AndroidUtilities.statusBarHeight;
        premiumPreviewFragment.Q.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.R.getLayoutParams().height = premiumPreviewFragment.Q.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.F;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(68.0f);
        }
        org.telegram.ui.Components.dz dzVar = premiumPreviewFragment.L;
        dzVar.M = (premiumPreviewFragment.T + i12) - AndroidUtilities.dp(16.0f);
        dzVar.p1();
        premiumPreviewFragment.L.S = i12;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.s0();
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
            premiumPreviewFragment.H.a((gw0) arrayList2.get(i15), false);
            premiumPreviewFragment.H.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            ((gw0) arrayList2.get(i15)).e = i14;
            i14 += premiumPreviewFragment.H.getMeasuredHeight();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            premiumPreviewFragment.H.a((gw0) arrayList.get(i16), false);
            premiumPreviewFragment.H.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            ((gw0) arrayList.get(i16)).e = i14;
            i14 += premiumPreviewFragment.H.getMeasuredHeight();
        }
        premiumPreviewFragment.J = i14;
    }
}
