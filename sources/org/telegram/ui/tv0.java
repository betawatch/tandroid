package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class tv0 extends org.telegram.ui.Components.rt0 implements r0.l {
    public final e2.r0 f0;
    public final /* synthetic */ ProfileActivity g0;
    public boolean h0;
    public final Paint i0;
    public boolean j0;
    public final ArrayList k0;
    public final un0 l0;
    public final /* synthetic */ ProfileActivity m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.m0 = profileActivity;
        this.g0 = profileActivity;
        this.f0 = new e2.r0();
        this.i0 = new Paint();
        this.k0 = new ArrayList();
        this.l0 = new un0(1);
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.m0;
        org.telegram.ui.Components.t30 t30Var = profileActivity.x0;
        Paint paint = profileActivity.p2;
        Paint paint2 = profileActivity.y0;
        float f10 = profileActivity.A5;
        Paint paint3 = this.i0;
        if (f10 > 0.0f) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, profileActivity.z0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ProfileActivity.J0(profileActivity), paint3);
        }
        int i7 = org.telegram.ui.ActionBar.k6.a7;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, profileActivity.z0));
        if (profileActivity.a.getVisibility() == 0) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i7, profileActivity.z0));
            if (profileActivity.G1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.G1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.k0;
            arrayList.clear();
            boolean z9 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.a.getChildAt(i10);
                profileActivity.a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i10));
                } else {
                    z9 = true;
                }
            }
            Collections.sort(arrayList, this.l0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.F1 && size > 0 && !z9) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) arrayList.get(i11);
                boolean z11 = view.getBackground() != null;
                profileActivity.a.getY();
                view.getY();
                if (z10 == z11) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z10 = z11;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (t30Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.x0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.w0.getLeft(), profileActivity.w0.getTop());
            View view2 = profileActivity.w0;
            kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int max = Math.max(profileActivity.w0.getMeasuredWidth(), profileActivity.w0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((t30Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f11 = max;
                canvas.drawCircle(f11, f11, 0.7f * f11, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        l00 l00Var = profileActivity.T;
        if (l00Var != null && l00Var.getVisibility() == 0) {
            if (profileActivity.T.getAlpha() == 1.0f) {
                profileActivity.T.draw(canvas);
            } else if (profileActivity.T.getAlpha() != 0.0f) {
                canvas2.saveLayerAlpha(profileActivity.T.getLeft(), profileActivity.T.getTop(), profileActivity.T.getRight(), profileActivity.T.getBottom(), (int) (profileActivity.T.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.T.getLeft(), profileActivity.T.getTop());
                profileActivity.T.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.I0) {
            return;
        }
        canvas.save();
        qu0 qu0Var = profileActivity.a;
        canvas.translate(qu0Var != null ? qu0Var.getTranslationX() : 0.0f, 0.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, profileActivity.z0);
        int i12 = profileActivity.I6;
        qu0 qu0Var2 = profileActivity.a;
        org.telegram.messenger.g0.O(canvas, this, w02, i12, qu0Var2 != null ? qu0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.sr0[] sr0VarArr;
        org.telegram.ui.Components.sr0 sr0Var;
        ProfileActivity profileActivity = this.m0;
        ev0 ev0Var = profileActivity.V4;
        if (ev0Var.n) {
            return ev0Var.g(motionEvent);
        }
        vv0 vv0Var = profileActivity.N;
        if (vv0Var != null && (sr0Var = (sr0VarArr = vv0Var.m0)[0]) != null && sr0Var.h.getFastScroll() != null && sr0VarArr[0].h.getFastScroll().n) {
            vv0 vv0Var2 = profileActivity.N;
            if (vv0Var2.d) {
                return vv0Var2.Z(motionEvent);
            }
        }
        vv0 vv0Var3 = profileActivity.N;
        if (vv0Var3 == null || !vv0Var3.P(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.m0;
        if (profileActivity.V4.n) {
            if (view == profileActivity.Y) {
                return true;
            }
            kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (view == kVar || view == profileActivity.s) {
                return true;
            }
        }
        if (view == profileActivity.T) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        this.f0.a = 0;
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ProfileActivity profileActivity = this.g0;
        try {
            if (view == profileActivity.a && profileActivity.P) {
                org.telegram.ui.Components.pj0 currentListView = profileActivity.N.getCurrentListView();
                if (profileActivity.N.getTop() == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            org.telegram.messenger.g0.h3(new sv0(this, 1));
        }
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        return this.g0.J4 != -1 && i7 == 2;
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = true;
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (g5Var != null) {
            g5Var.a();
        }
        org.telegram.ui.Components.g5 g5Var2 = profileActivity.G;
        if (g5Var2 != null) {
            g5Var2.a();
        }
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.m0;
        profileActivity.G0 = false;
        org.telegram.ui.Components.g5 g5Var = profileActivity.F;
        if (g5Var != null) {
            g5Var.b();
        }
        org.telegram.ui.Components.g5 g5Var2 = profileActivity.G;
        if (g5Var2 != null) {
            g5Var2.b();
        }
    }

    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ProfileActivity profileActivity = this.m0;
        profileActivity.k6 = -1;
        profileActivity.T4 = false;
        profileActivity.U4 = false;
        profileActivity.O3();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03be  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z9;
        int measuredWidth;
        int max;
        int i11;
        View view;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        char c10;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.m0;
        HashMap hashMap = profileActivity.X1;
        kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
        int i16 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        qu0 qu0Var = profileActivity.a;
        if (qu0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qu0Var.getLayoutParams();
            if (layoutParams.topMargin != i16) {
                layoutParams.topMargin = i16;
            }
        }
        org.telegram.ui.Components.pj0 pj0Var = profileActivity.b;
        if (pj0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pj0Var.getLayoutParams();
            if (layoutParams2.topMargin != i16) {
                layoutParams2.topMargin = i16;
            }
        }
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.C0 == getMeasuredWidth() && profileActivity.D0 == getMeasuredHeight()) {
            z9 = false;
        } else {
            int i17 = profileActivity.C0;
            z9 = (i17 == 0 || i17 == getMeasuredWidth()) ? false : true;
            profileActivity.E0 = 0;
            int i18 = profileActivity.d.e.M2;
            profileActivity.C0 = getMeasuredWidth();
            profileActivity.D0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            for (int i19 = 0; i19 < i18; i19++) {
                int d = profileActivity.d.d(i19);
                hashMap.put(Integer.valueOf(i19), Integer.valueOf(profileActivity.E0));
                if (d == 13) {
                    profileActivity.E0 += profileActivity.a.getMeasuredHeight();
                } else {
                    v4.d1 a10 = profileActivity.d.a(null, d);
                    View view2 = a10.a;
                    profileActivity.d.t(a10, i19);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.E0 += view2.getMeasuredHeight();
                }
            }
            org.telegram.ui.Components.av0 av0Var = profileActivity.O;
            if (av0Var != null) {
                ((FrameLayout.LayoutParams) av0Var.getLayoutParams()).topMargin = profileActivity.j4() + org.telegram.messenger.g0.m;
            }
        }
        boolean z11 = profileActivity.l5;
        if (!z11 && ((z10 = profileActivity.m1) || (profileActivity.F1 && profileActivity.I1 == 2))) {
            this.h0 = true;
            if (z10) {
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                if (f5Var != null) {
                    f5Var.setAlpha(0.0f);
                    profileActivity.T0.setEnabled(false);
                    profileActivity.T0.setVisibility(8);
                }
                profileActivity.f.setTextColor(-1);
                profileActivity.f.setPivotY(r4.getMeasuredHeight());
                profileActivity.f.setScaleX(1.38f);
                profileActivity.f.setScaleY(1.38f);
                org.telegram.ui.Components.gk0 gk0Var = profileActivity.K;
                if (gk0Var != null) {
                    gk0Var.b(Color.argb(org.telegram.messenger.qs.J2, org.telegram.messenger.qs.e4, org.telegram.messenger.qs.e4, org.telegram.messenger.qs.e4));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.wq wqVar = profileActivity.I;
                if (wqVar != null) {
                    wqVar.a(1.0f);
                }
                org.telegram.ui.Components.wq wqVar2 = profileActivity.J;
                if (wqVar2 != null) {
                    wqVar2.a(1.0f);
                }
                profileActivity.t5(1.0f);
                profileActivity.r.setTextColor(-1275068417);
                kVar3 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                kVar3.C(1090519039, false);
                kVar4 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                kVar4.D(-1, false);
                kw0 kw0Var = profileActivity.M;
                kw0Var.E = true;
                kw0Var.setVisibility(0);
                profileActivity.M.e(false, 1.0f);
                profileActivity.e0.setForegroundAlpha(1.0f);
                profileActivity.X.setVisibility(4);
                profileActivity.n0.L();
                profileActivity.n0.setVisibility(0);
                uw0 uw0Var = profileActivity.y6;
                if (uw0Var != null) {
                    uw0Var.a(603979775);
                }
                cv0 cv0Var = profileActivity.u0;
                if (cv0Var != null) {
                    cv0Var.setExpandProgress(1.0f);
                }
                bi.g1 g1Var = profileActivity.v0;
                if (g1Var != null) {
                    g1Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.ef0 ef0Var = profileActivity.Z;
                if (ef0Var != null) {
                    ef0Var.setParentExpanded(1.0f);
                }
                profileActivity.Z4(1.0f);
                org.telegram.ui.Components.zf0 zf0Var = profileActivity.b0;
                if (zf0Var != null) {
                    zf0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.lu0 lu0Var = profileActivity.S;
                if (lu0Var != null) {
                    lu0Var.setParentExpanded(1.0f);
                }
                c10 = 0;
                profileActivity.m1 = false;
                profileActivity.q5();
            } else {
                c10 = 0;
            }
            profileActivity.M3();
            profileActivity.n2 = true;
            profileActivity.o2 = true;
            org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
            Object[] objArr = new Object[1];
            objArr[c10] = Boolean.TRUE;
            e10.k(org.telegram.messenger.qs.r4, objArr);
            if (profileActivity.S0 != null) {
                if (profileActivity.u4()) {
                    profileActivity.S0.t(21);
                } else {
                    profileActivity.S0.S(21);
                }
                if (profileActivity.q0 != null) {
                    profileActivity.S0.S(34);
                    profileActivity.S0.S(35);
                    profileActivity.S0.t(31);
                }
            }
            profileActivity.k2 = 1.0f;
            if (profileActivity.m2) {
                measuredWidth2 = profileActivity.j4() + i16;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.e4();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.j4() + profileActivity.E0) + i16));
            }
            if (profileActivity.D1 != 0) {
                max2 += org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n;
                profileActivity.a.setBottomGlowOffset(org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f10 = measuredWidth2 - i16;
            profileActivity.Q1 = f10;
            if (profileActivity.I1 == 0) {
                profileActivity.P1 = f10;
            }
            profileActivity.c.h1(0, -i16);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i7, 0, i10, 0);
            qu0 qu0Var2 = profileActivity.a;
            qu0Var2.layout(0, i16, qu0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
            this.h0 = false;
        } else if (z11 && !profileActivity.F1 && !profileActivity.T4) {
            this.h0 = true;
            if (profileActivity.I0 || !(profileActivity.m2 || org.telegram.messenger.g0.Q1())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.e4();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.j4() + profileActivity.E0) + i16));
            } else {
                measuredWidth = profileActivity.j4();
                max = 0;
            }
            if (profileActivity.D1 != 0) {
                max += org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n;
                profileActivity.a.setBottomGlowOffset(org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.n);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i20 = 0;
            while (true) {
                if (i20 >= profileActivity.a.getChildCount()) {
                    i11 = -1;
                    view = null;
                    break;
                } else {
                    i11 = RecyclerView.R(profileActivity.a.getChildAt(i20));
                    if (i11 != -1) {
                        view = profileActivity.a.getChildAt(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                qu0 qu0Var3 = profileActivity.a;
                View F = qu0Var3.F(view);
                v4.d1 T = F != null ? qu0Var3.T(F) : null;
                i11 = T.b();
                if (i11 == -1 && (i11 = T.g) == -1) {
                    i11 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            kVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if ((kVar2.n0 || profileActivity.q1) && (i12 = profileActivity.J4) >= 0) {
                profileActivity.c.h1(i12, -measuredWidth);
            } else {
                if (profileActivity.U4 || paddingTop != measuredWidth) {
                    int i21 = profileActivity.k6;
                    if (i21 >= 0) {
                        profileActivity.c.h1(i21, profileActivity.l6 - measuredWidth);
                    } else if ((z9 && profileActivity.n2) || view == null) {
                        i14 = 0;
                        profileActivity.c.h1(0, profileActivity.j4() - measuredWidth);
                        i13 = i14;
                        if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                            profileActivity.a.setPadding(i14, measuredWidth, i14, max);
                            i15 = 1;
                        } else {
                            i15 = i13;
                        }
                        if (i15 != 0) {
                            measureChildWithMargins(profileActivity.a, i7, 0, i10, 0);
                            try {
                                qu0 qu0Var4 = profileActivity.a;
                                qu0Var4.layout(0, i16, qu0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                        }
                        this.h0 = false;
                    } else {
                        if (i11 == 0 && !profileActivity.n2 && top > profileActivity.j4()) {
                            top = profileActivity.j4();
                        }
                        profileActivity.c.h1(i11, top - measuredWidth);
                    }
                }
                i14 = 0;
                i13 = i14;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i14, measuredWidth, i14, max);
                i15 = 1;
                if (i15 != 0) {
                }
                this.h0 = false;
            }
            i13 = 1;
            i14 = 0;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i14, measuredWidth, i14, max);
            i15 = 1;
            if (i15 != 0) {
            }
            this.h0 = false;
        }
        boolean z12 = size > View.MeasureSpec.getSize(i7);
        if (z12 != this.j0) {
            post(new sv0(this, 0));
            this.j0 = z12;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        ProfileActivity profileActivity = this.m0;
        ih.d.c(profileActivity.J6, profileActivity.fragmentView);
        profileActivity.K6.d();
    }

    @Override // r0.k
    public final void r(View view, View view2, int i7, int i10) {
        this.f0.a = i7;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }

    @Override // r0.k
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.pj0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.g0;
        if (view == profileActivity.a) {
            if (profileActivity.J4 == -1 || !profileActivity.P) {
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            boolean z9 = kVar.n0;
            int top = profileActivity.N.getTop();
            boolean z10 = false;
            if (i10 >= 0) {
                if (z9) {
                    org.telegram.ui.Components.pj0 currentListView2 = profileActivity.N.getCurrentListView();
                    iArr[1] = i10;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i12 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i12);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = profileActivity.N.getCurrentListView()) != null && (L0 = ((v4.b0) currentListView.getLayoutManager()).L0()) != -1) {
                v4.d1 K = currentListView.K(L0);
                int top2 = K != null ? K.a.getTop() : -1;
                int paddingTop = currentListView.getPaddingTop();
                if (top2 != paddingTop || L0 != 0) {
                    iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
                    currentListView.scrollBy(0, i10);
                    z10 = true;
                }
            }
            if (z9) {
                if (z10 || top >= 0) {
                    iArr[1] = i10;
                } else {
                    iArr[1] = i10 - Math.max(top, i10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
