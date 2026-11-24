// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class up8 extends ela implements vk7 {
    public final az8 m0;
    public final /* synthetic */ ProfileActivity n0;
    public boolean o0;
    public final Paint p0;
    public boolean q0;
    public final ArrayList r0;
    public final qx7 s0;
    public final /* synthetic */ ProfileActivity t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up8(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.t0 = profileActivity;
        this.n0 = profileActivity;
        this.m0 = new az8((byte) 3);
        this.p0 = new Paint();
        this.r0 = new ArrayList();
        this.s0 = new qx7((byte) 6);
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        a aVar;
        ProfileActivity profileActivity = this.t0;
        xo8 xo8Var = profileActivity.y0;
        Paint paint = profileActivity.r2;
        Paint paint2 = profileActivity.z0;
        float f = profileActivity.L5;
        Paint paint3 = this.p0;
        if (f > 0.0f) {
            paint3.setColor(cmb.v0(cmb.Z6, profileActivity.A0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), profileActivity.d2(), paint3);
        }
        int i = cmb.Z6;
        paint.setColor(cmb.v0(i, profileActivity.A0));
        if (profileActivity.a.getVisibility() == 0) {
            paint3.setColor(cmb.v0(i, profileActivity.A0));
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.r0;
            arrayList.clear();
            boolean z = false;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = profileActivity.a.getChildAt(i2);
                profileActivity.a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i2));
                } else {
                    z = true;
                }
            }
            Collections.sort(arrayList, this.s0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.G1 && size > 0 && !z) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z2 = false;
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) arrayList.get(i3);
                boolean z3 = view.getBackground() != null;
                profileActivity.a.getY();
                view.getY();
                if (z2 == z3) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z2 = z3;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (xo8Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.y0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.x0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.x0.getLeft(), profileActivity.x0.getTop());
            View view2 = profileActivity.x0;
            aVar = ((d) profileActivity).actionBar;
            if (view2 == aVar.getBackButton()) {
                int max = Math.max(profileActivity.x0.getMeasuredWidth(), profileActivity.x0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((xo8Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f2 = max;
                canvas.drawCircle(f2, f2, 0.7f * f2, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.x0.draw(canvas);
            canvas.restoreToCount(save);
        }
        sb sbVar = profileActivity.U;
        if (sbVar != null && sbVar.getVisibility() == 0) {
            float alpha2 = profileActivity.U.getAlpha();
            sb sbVar2 = profileActivity.U;
            if (alpha2 == 1.0f) {
                sbVar2.draw(canvas);
            } else if (sbVar2.getAlpha() != 0.0f) {
                canvas2.saveLayerAlpha(profileActivity.U.getLeft(), profileActivity.U.getTop(), profileActivity.U.getRight(), profileActivity.U.getBottom(), (int) (profileActivity.U.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.U.getLeft(), profileActivity.U.getTop());
                profileActivity.U.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.J0) {
            return;
        }
        canvas.save();
        po8 po8Var = profileActivity.a;
        canvas.translate(po8Var != null ? po8Var.getTranslationX() : 0.0f, 0.0f);
        int v0 = cmb.v0(cmb.c6, profileActivity.A0);
        int i4 = profileActivity.U6;
        po8 po8Var2 = profileActivity.a;
        gm.O(canvas, this, v0, i4, po8Var2 != null ? po8Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iga[] igaVarArr;
        iga igaVar;
        ProfileActivity profileActivity = this.t0;
        dp8 dp8Var = profileActivity.e5;
        if (dp8Var.n) {
            return dp8Var.g(motionEvent);
        }
        wp8 wp8Var = profileActivity.O;
        if (wp8Var != null && (igaVar = (igaVarArr = wp8Var.n0)[0]) != null && igaVar.h.getFastScroll() != null && igaVarArr[0].h.getFastScroll().n) {
            wp8 wp8Var2 = profileActivity.O;
            if (wp8Var2.d) {
                return wp8Var2.I(motionEvent);
            }
        }
        wp8 wp8Var3 = profileActivity.O;
        if (wp8Var3 == null || !wp8Var3.A(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        ProfileActivity profileActivity = this.t0;
        if (profileActivity.e5.n) {
            if (view == profileActivity.Z) {
                return true;
            }
            aVar = ((d) profileActivity).actionBar;
            if (view == aVar || view == profileActivity.s) {
                return true;
            }
        }
        if (view == profileActivity.U) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // uk7
    public final void k(int i, View view) {
        this.m0.b = 0;
    }

    @Override // vk7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ProfileActivity profileActivity = this.n0;
        byte b = 1;
        try {
            if (view == profileActivity.a && profileActivity.Q) {
                r59 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i4;
                    currentListView.scrollBy(0, i4);
                }
            }
        } catch (Throwable th) {
            fc4.g(th, true);
            gm.c3(new tp8(this, b));
        }
    }

    @Override // uk7
    public final boolean n(View view, View view2, int i, int i2) {
        return this.n0.S4 != -1 && i == 2;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.t0;
        profileActivity.H0 = true;
        tm tmVar = profileActivity.G;
        if (tmVar != null) {
            tmVar.a();
        }
        tm tmVar2 = profileActivity.H;
        if (tmVar2 != null) {
            tmVar2.a();
        }
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.t0;
        profileActivity.H0 = false;
        tm tmVar = profileActivity.G;
        if (tmVar != null) {
            tmVar.b();
        }
        tm tmVar2 = profileActivity.H;
        if (tmVar2 != null) {
            tmVar2.b();
        }
    }

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ProfileActivity profileActivity = this.t0;
        profileActivity.w6 = -1;
        profileActivity.c5 = false;
        profileActivity.d5 = false;
        profileActivity.H1();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03af  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        a aVar;
        boolean z;
        int measuredWidth;
        int max;
        int i3;
        View view;
        a aVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        char c;
        int measuredWidth2;
        int max2;
        a aVar3;
        a aVar4;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.t0;
        HashMap hashMap = profileActivity.Z1;
        aVar = ((d) profileActivity).actionBar;
        int i8 = currentActionBarHeight + (aVar.getOccupyStatusBar() ? gm.m : 0);
        po8 po8Var = profileActivity.a;
        if (po8Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) po8Var.getLayoutParams();
            if (layoutParams.topMargin != i8) {
                layoutParams.topMargin = i8;
            }
        }
        r59 r59Var = profileActivity.b;
        if (r59Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r59Var.getLayoutParams();
            if (layoutParams2.topMargin != i8) {
                layoutParams2.topMargin = i8;
            }
        }
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.D0 == getMeasuredWidth() && profileActivity.E0 == getMeasuredHeight()) {
            z = false;
        } else {
            int i9 = profileActivity.D0;
            z = (i9 == 0 || i9 == getMeasuredWidth()) ? false : true;
            profileActivity.F0 = 0;
            int i10 = profileActivity.d.e.O2;
            profileActivity.D0 = getMeasuredWidth();
            profileActivity.E0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            for (int i11 = 0; i11 < i10; i11++) {
                int d = profileActivity.d.d(i11);
                hashMap.put(Integer.valueOf(i11), Integer.valueOf(profileActivity.F0));
                if (d == 13) {
                    profileActivity.F0 += profileActivity.a.getMeasuredHeight();
                } else {
                    u69 a = profileActivity.d.a(null, d);
                    View view2 = a.a;
                    profileActivity.d.t(a, i11);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.F0 += view2.getMeasuredHeight();
                }
            }
            a1b a1bVar = profileActivity.P;
            if (a1bVar != null) {
                ((FrameLayout.LayoutParams) a1bVar.getLayoutParams()).topMargin = profileActivity.e2() + gm.m;
            }
        }
        boolean z3 = profileActivity.w5;
        if (!z3 && ((z2 = profileActivity.n1) || (profileActivity.G1 && profileActivity.J1 == 2))) {
            this.o0 = true;
            if (z2) {
                zja zjaVar = profileActivity.U0;
                if (zjaVar != null) {
                    zjaVar.setAlpha(0.0f);
                    profileActivity.U0.setEnabled(false);
                    profileActivity.U0.setVisibility(8);
                }
                profileActivity.f.setTextColor(-1);
                profileActivity.f.setPivotY(r4.getMeasuredHeight());
                profileActivity.f.setScaleX(1.38f);
                profileActivity.f.setScaleY(1.38f);
                hs9 hs9Var = profileActivity.L;
                if (hs9Var != null) {
                    hs9Var.b(-1275068417);
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                x43 x43Var = profileActivity.J;
                if (x43Var != null) {
                    x43Var.a(1.0f);
                }
                x43 x43Var2 = profileActivity.K;
                if (x43Var2 != null) {
                    x43Var2.a(1.0f);
                }
                profileActivity.Q3(1.0f);
                profileActivity.r.setTextColor(-1275068417);
                aVar3 = ((d) profileActivity).actionBar;
                aVar3.G(1090519039, false);
                aVar4 = ((d) profileActivity).actionBar;
                aVar4.H(-1, false);
                mq8 mq8Var = profileActivity.N;
                mq8Var.F = true;
                mq8Var.setVisibility(0);
                profileActivity.N.e(false, 1.0f);
                profileActivity.f0.setForegroundAlpha(1.0f);
                profileActivity.Y.setVisibility(4);
                profileActivity.o0.L();
                profileActivity.o0.setVisibility(0);
                vq8 vq8Var = profileActivity.K6;
                if (vq8Var != null) {
                    vq8Var.a(603979775);
                }
                bp8 bp8Var = profileActivity.v0;
                if (bp8Var != null) {
                    bp8Var.setExpandProgress(1.0f);
                }
                xs8 xs8Var = profileActivity.w0;
                if (xs8Var != null) {
                    xs8Var.setExpandProgress(1.0f);
                }
                qn8 qn8Var = profileActivity.a0;
                if (qn8Var != null) {
                    qn8Var.setParentExpanded(1.0f);
                }
                profileActivity.t3(1.0f);
                mt8 mt8Var = profileActivity.c0;
                if (mt8Var != null) {
                    mt8Var.setParentExpanded(1.0f);
                }
                ita itaVar = profileActivity.T;
                if (itaVar != null) {
                    itaVar.setParentExpanded(1.0f);
                }
                c = 0;
                profileActivity.n1 = false;
                profileActivity.N3();
            } else {
                c = 0;
            }
            profileActivity.F1();
            profileActivity.p2 = true;
            profileActivity.q2 = true;
            nm7 e = nm7.e();
            Object[] objArr = new Object[1];
            objArr[c] = Boolean.TRUE;
            e.k(nm7.v4, objArr);
            if (profileActivity.T0 != null) {
                boolean s2 = profileActivity.s2();
                zja zjaVar2 = profileActivity.T0;
                if (s2) {
                    zjaVar2.u(21);
                } else {
                    zjaVar2.S(21);
                }
                if (profileActivity.r0 != null) {
                    profileActivity.T0.S(34);
                    profileActivity.T0.S(35);
                    profileActivity.T0.u(31);
                }
            }
            profileActivity.m2 = 1.0f;
            if (profileActivity.o2) {
                measuredWidth2 = profileActivity.e2() + i8;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.Y1();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.e2() + profileActivity.F0) + i8));
            }
            if (profileActivity.E1 != 0) {
                max2 += gm.L(48.0f) + gm.n;
                profileActivity.a.setBottomGlowOffset(gm.L(48.0f) + gm.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f = measuredWidth2 - i8;
            profileActivity.S1 = f;
            if (profileActivity.J1 == 0) {
                profileActivity.Q1 = f;
            }
            profileActivity.c.g1(0, -i8);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i, 0, i2, 0);
            po8 po8Var2 = profileActivity.a;
            po8Var2.layout(0, i8, po8Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i8);
            this.o0 = false;
        } else if (z3 && !profileActivity.G1 && !profileActivity.c5) {
            this.o0 = true;
            if (profileActivity.J0 || !(profileActivity.o2 || gm.O1())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.Y1();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.e2() + profileActivity.F0) + i8));
            } else {
                measuredWidth = profileActivity.e2();
                max = 0;
            }
            if (profileActivity.E1 != 0) {
                max += gm.L(48.0f) + gm.n;
                profileActivity.a.setBottomGlowOffset(gm.L(48.0f) + gm.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i12 = 0;
            while (true) {
                if (i12 >= profileActivity.a.getChildCount()) {
                    i3 = -1;
                    view = null;
                    break;
                } else {
                    i3 = RecyclerView.R(profileActivity.a.getChildAt(i12));
                    if (i3 != -1) {
                        view = profileActivity.a.getChildAt(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                po8 po8Var3 = profileActivity.a;
                View F = po8Var3.F(view);
                u69 T = F != null ? po8Var3.T(F) : null;
                i3 = T.b();
                if (i3 == -1 && (i3 = T.g) == -1) {
                    i3 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            aVar2 = ((d) profileActivity).actionBar;
            if ((aVar2.o0 || profileActivity.r1) && (i4 = profileActivity.S4) >= 0) {
                profileActivity.c.g1(i4, -measuredWidth);
            } else {
                if (profileActivity.d5 || paddingTop != measuredWidth) {
                    int i13 = profileActivity.w6;
                    if (i13 >= 0) {
                        profileActivity.c.g1(i13, profileActivity.x6 - measuredWidth);
                    } else if ((z && profileActivity.p2) || view == null) {
                        i6 = 0;
                        profileActivity.c.g1(0, profileActivity.e2() - measuredWidth);
                        i5 = i6;
                        if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                            profileActivity.a.setPadding(i6, measuredWidth, i6, max);
                            i7 = 1;
                        } else {
                            i7 = i5;
                        }
                        if (i7 != 0) {
                            measureChildWithMargins(profileActivity.a, i, 0, i2, 0);
                            try {
                                po8 po8Var4 = profileActivity.a;
                                po8Var4.layout(0, i8, po8Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i8);
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                        }
                        this.o0 = false;
                    } else {
                        if (i3 == 0 && !profileActivity.p2 && top > profileActivity.e2()) {
                            top = profileActivity.e2();
                        }
                        profileActivity.c.g1(i3, top - measuredWidth);
                    }
                }
                i6 = 0;
                i5 = i6;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i6, measuredWidth, i6, max);
                i7 = 1;
                if (i7 != 0) {
                }
                this.o0 = false;
            }
            i5 = 1;
            i6 = 0;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i6, measuredWidth, i6, max);
            i7 = 1;
            if (i7 != 0) {
            }
            this.o0 = false;
        }
        boolean z4 = size > View.MeasureSpec.getSize(i);
        if (z4 != this.q0) {
            post(new tp8(this, (byte) 0));
            this.q0 = z4;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ProfileActivity profileActivity = this.t0;
        tl0.c(profileActivity.V6, profileActivity.fragmentView);
        profileActivity.W6.d();
    }

    @Override // uk7
    public final void q(View view, View view2, int i, int i2) {
        this.m0.b = i;
    }

    @Override // uk7
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        a aVar;
        int i4;
        r59 currentListView;
        int K0;
        ProfileActivity profileActivity = this.n0;
        if (view == profileActivity.a) {
            if (profileActivity.S4 == -1 || !profileActivity.Q) {
                return;
            }
            aVar = ((d) profileActivity).actionBar;
            boolean z = aVar.o0;
            int top = profileActivity.O.getTop();
            boolean z2 = false;
            if (i2 >= 0) {
                if (z) {
                    r59 currentListView2 = profileActivity.O.getCurrentListView();
                    iArr[1] = i2;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i4);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (K0 = ((u46) currentListView.getLayoutManager()).K0()) != -1) {
                u69 K = currentListView.K(K0);
                int top2 = K != null ? K.a.getTop() : -1;
                int paddingTop = currentListView.getPaddingTop();
                if (top2 != paddingTop || K0 != 0) {
                    iArr[1] = K0 != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                    currentListView.scrollBy(0, i2);
                    z2 = true;
                }
            }
            if (z) {
                if (z2 || top >= 0) {
                    iArr[1] = i2;
                } else {
                    iArr[1] = i2 - Math.max(top, i2);
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.o0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // uk7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
