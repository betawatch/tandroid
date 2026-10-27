package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vz0 extends org.telegram.ui.Components.ww0 implements r0.m {
    public final b2.v0 l0;
    public final /* synthetic */ ProfileActivity m0;
    public boolean n0;
    public final Paint o0;
    public boolean p0;
    public final ArrayList q0;
    public final dv r0;
    public final /* synthetic */ ProfileActivity s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.s0 = profileActivity;
        this.m0 = profileActivity;
        this.l0 = new b2.v0();
        this.o0 = new Paint();
        this.q0 = new ArrayList();
        this.r0 = new dv(8);
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.s0;
        org.telegram.ui.Components.r50 r50Var = profileActivity.x0;
        Paint paint = profileActivity.q2;
        hh.d dVar = profileActivity.B6;
        ch.f fVar = profileActivity.A6;
        Paint paint2 = profileActivity.y0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            ProfileActivity.C0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.r) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, profileActivity.z0));
                if (SharedConfig.chatBlurEnabled()) {
                    fVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.y6.a7;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, profileActivity.z0));
        if (profileActivity.a.getVisibility() == 0) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, profileActivity.z0);
            Paint paint3 = this.o0;
            paint3.setColor(w02);
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.q0;
            arrayList.clear();
            boolean z10 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.a.getChildAt(i11);
                profileActivity.a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i11));
                } else {
                    z10 = true;
                }
            }
            Collections.sort(arrayList, this.r0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.G1 && size > 0 && !z10) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList.get(i12);
                boolean z12 = view.getBackground() != null;
                profileActivity.a.getY();
                view.getY();
                if (z11 == z12) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z11 = z12;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (r50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.x0);
        }
        if (profileActivity.w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.w0.getLeft(), profileActivity.w0.getTop());
            View view2 = profileActivity.w0;
            kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int max = Math.max(profileActivity.w0.getMeasuredWidth(), profileActivity.w0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((r50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f7 = max;
                canvas.drawCircle(f7, f7, 0.7f * f7, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        b20 b20Var = profileActivity.T;
        if (b20Var != null && b20Var.getVisibility() == 0) {
            if (profileActivity.T.getAlpha() == 1.0f) {
                profileActivity.T.draw(canvas);
            } else if (profileActivity.T.getAlpha() != 0.0f) {
                canvas.saveLayerAlpha(profileActivity.T.getLeft(), profileActivity.T.getTop(), profileActivity.T.getRight(), profileActivity.T.getBottom(), (int) (profileActivity.T.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.T.getLeft(), profileActivity.T.getTop());
                profileActivity.T.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.I0) {
            return;
        }
        canvas.save();
        ry0 ry0Var = profileActivity.a;
        canvas.translate(ry0Var != null ? ry0Var.getTranslationX() : 0.0f, 0.0f);
        int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, profileActivity.z0);
        int i13 = profileActivity.z6;
        ry0 ry0Var2 = profileActivity.a;
        AndroidUtilities.drawNavigationBarProtection(canvas, this, w03, i13, ry0Var2 != null ? ry0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.uu0[] uu0VarArr;
        org.telegram.ui.Components.uu0 uu0Var;
        ProfileActivity profileActivity = this.s0;
        fz0 fz0Var = profileActivity.b5;
        if (fz0Var.n) {
            return fz0Var.g(motionEvent);
        }
        xz0 xz0Var = profileActivity.N;
        if (xz0Var != null && (uu0Var = (uu0VarArr = xz0Var.m0)[0]) != null && uu0Var.h.getFastScroll() != null && uu0VarArr[0].h.getFastScroll().n) {
            xz0 xz0Var2 = profileActivity.N;
            if (xz0Var2.d) {
                return xz0Var2.W(motionEvent);
            }
        }
        xz0 xz0Var3 = profileActivity.N;
        if (xz0Var3 == null || !xz0Var3.N(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.s0;
        if (profileActivity.b5.n) {
            if (view == profileActivity.Y) {
                return true;
            }
            kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            if (view == kVar || view == profileActivity.s) {
                return true;
            }
        }
        if (view == profileActivity.T) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        this.l0.a = 0;
    }

    @Override // r0.m
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.m0;
        try {
            if (view == profileActivity.a && profileActivity.P) {
                org.telegram.ui.Components.nm0 currentListView = profileActivity.N.getCurrentListView();
                if (profileActivity.N.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new uz0(this, 1));
        }
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.s0;
        profileActivity.G0 = true;
        org.telegram.ui.Components.r5 r5Var = profileActivity.F;
        if (r5Var != null) {
            r5Var.a();
        }
        org.telegram.ui.Components.r5 r5Var2 = profileActivity.G;
        if (r5Var2 != null) {
            r5Var2.a();
        }
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.s0;
        profileActivity.G0 = false;
        org.telegram.ui.Components.r5 r5Var = profileActivity.F;
        if (r5Var != null) {
            r5Var.b();
        }
        org.telegram.ui.Components.r5 r5Var2 = profileActivity.G;
        if (r5Var2 != null) {
            r5Var2.b();
        }
    }

    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.s0;
        profileActivity.b6 = -1;
        profileActivity.Z4 = false;
        profileActivity.a5 = false;
        profileActivity.I3();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03bb  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        int measuredWidth;
        int max;
        int i12;
        View view;
        org.telegram.ui.ActionBar.k kVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        char c10;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.s0;
        HashMap hashMap = profileActivity.Y1;
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        int i17 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        ry0 ry0Var = profileActivity.a;
        if (ry0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ry0Var.getLayoutParams();
            if (layoutParams.topMargin != i17) {
                layoutParams.topMargin = i17;
            }
        }
        org.telegram.ui.Components.nm0 nm0Var = profileActivity.b;
        if (nm0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) nm0Var.getLayoutParams();
            if (layoutParams2.topMargin != i17) {
                layoutParams2.topMargin = i17;
            }
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.C0 == getMeasuredWidth() && profileActivity.D0 == getMeasuredHeight()) {
            z10 = false;
        } else {
            int i18 = profileActivity.C0;
            z10 = (i18 == 0 || i18 == getMeasuredWidth()) ? false : true;
            profileActivity.E0 = 0;
            int i19 = profileActivity.d.e.N2;
            profileActivity.C0 = getMeasuredWidth();
            profileActivity.D0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            for (int i20 = 0; i20 < i19; i20++) {
                int j10 = profileActivity.d.j(i20);
                hashMap.put(Integer.valueOf(i20), Integer.valueOf(profileActivity.E0));
                if (j10 == 13) {
                    profileActivity.E0 += profileActivity.a.getMeasuredHeight();
                } else {
                    s4.e1 g7 = profileActivity.d.g(null, j10);
                    View view2 = g7.a;
                    profileActivity.d.v(g7, i20);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.E0 += view2.getMeasuredHeight();
                }
            }
            org.telegram.ui.Components.fy0 fy0Var = profileActivity.O;
            if (fy0Var != null) {
                ((FrameLayout.LayoutParams) fy0Var.getLayoutParams()).topMargin = profileActivity.c4() + AndroidUtilities.statusBarHeight;
            }
        }
        boolean z12 = profileActivity.r5;
        if (!z12 && ((z11 = profileActivity.n1) || (profileActivity.G1 && profileActivity.J1 == 2))) {
            this.n0 = true;
            if (z11) {
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null) {
                    w0Var.setAlpha(0.0f);
                    profileActivity.U0.setEnabled(false);
                    profileActivity.U0.setVisibility(8);
                }
                profileActivity.f.setTextColor(-1);
                profileActivity.f.setPivotY(r4.getMeasuredHeight());
                profileActivity.f.setScaleX(1.38f);
                profileActivity.f.setScaleY(1.38f);
                org.telegram.ui.Components.fn0 fn0Var = profileActivity.K;
                if (fn0Var != null) {
                    fn0Var.b(Color.argb(179, 255, 255, 255));
                }
                Drawable drawable = profileActivity.w;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.cs csVar = profileActivity.I;
                if (csVar != null) {
                    csVar.a(1.0f);
                }
                org.telegram.ui.Components.cs csVar2 = profileActivity.J;
                if (csVar2 != null) {
                    csVar2.a(1.0f);
                }
                profileActivity.k5(1.0f);
                profileActivity.r.setTextColor(-1275068417);
                kVar3 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                kVar3.x(1090519039, false);
                kVar4 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                kVar4.y(-1, false);
                m01 m01Var = profileActivity.M;
                m01Var.E = true;
                m01Var.setVisibility(0);
                profileActivity.M.e(1.0f, false);
                profileActivity.e0.setForegroundAlpha(1.0f);
                profileActivity.X.setVisibility(4);
                profileActivity.n0.L();
                profileActivity.n0.setVisibility(0);
                x01 x01Var = profileActivity.p6;
                if (x01Var != null) {
                    x01Var.a(603979775);
                }
                dz0 dz0Var = profileActivity.u0;
                if (dz0Var != null) {
                    dz0Var.setExpandProgress(1.0f);
                }
                bi.i1 i1Var = profileActivity.v0;
                if (i1Var != null) {
                    i1Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.ci0 ci0Var = profileActivity.Z;
                if (ci0Var != null) {
                    ci0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.vi0 vi0Var = profileActivity.b0;
                if (vi0Var != null) {
                    vi0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.px0 px0Var = profileActivity.S;
                if (px0Var != null) {
                    px0Var.setParentExpanded(1.0f);
                }
                c10 = 0;
                profileActivity.n1 = false;
                profileActivity.h5();
            } else {
                c10 = 0;
            }
            profileActivity.H3();
            profileActivity.o2 = true;
            profileActivity.p2 = true;
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i21 = NotificationCenter.needCheckSystemBarColors;
            Object[] objArr = new Object[1];
            objArr[c10] = Boolean.TRUE;
            globalInstance.lambda$postNotificationNameOnUIThread$1(i21, objArr);
            if (profileActivity.T0 != null) {
                if (profileActivity.n4()) {
                    profileActivity.T0.t(21);
                } else {
                    profileActivity.T0.S(21);
                }
                if (profileActivity.q0 != null) {
                    profileActivity.T0.S(34);
                    profileActivity.T0.S(35);
                    profileActivity.T0.t(31);
                }
            }
            profileActivity.l2 = 1.0f;
            if (profileActivity.n2) {
                measuredWidth2 = profileActivity.c4() + i17;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.X3();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.c4() + profileActivity.E0) + i17));
            }
            if (profileActivity.E1 != 0) {
                max2 += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f7 = measuredWidth2 - i17;
            profileActivity.R1 = f7;
            if (profileActivity.J1 == 0) {
                profileActivity.Q1 = f7;
            }
            profileActivity.c.h1(0, -i17);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
            ry0 ry0Var2 = profileActivity.a;
            ry0Var2.layout(0, i17, ry0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i17);
            this.n0 = false;
        } else if (z12 && !profileActivity.G1 && !profileActivity.Z4) {
            this.n0 = true;
            if (profileActivity.I0 || !(profileActivity.n2 || AndroidUtilities.isTablet())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.X3();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.c4() + profileActivity.E0) + i17));
            } else {
                measuredWidth = profileActivity.c4();
                max = 0;
            }
            if (profileActivity.E1 != 0) {
                max += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i22 = 0;
            while (true) {
                if (i22 >= profileActivity.a.getChildCount()) {
                    i12 = -1;
                    view = null;
                    break;
                } else {
                    i12 = RecyclerView.R(profileActivity.a.getChildAt(i22));
                    if (i12 != -1) {
                        view = profileActivity.a.getChildAt(i22);
                        break;
                    }
                    i22++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                ry0 ry0Var3 = profileActivity.a;
                View F = ry0Var3.F(view);
                s4.e1 T = F != null ? ry0Var3.T(F) : null;
                i12 = T.b();
                if (i12 == -1 && (i12 = T.g) == -1) {
                    i12 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            if ((kVar2.n0 || profileActivity.r1) && (i13 = profileActivity.P4) >= 0) {
                profileActivity.c.h1(i13, -measuredWidth);
            } else {
                if (profileActivity.a5 || paddingTop != measuredWidth) {
                    int i23 = profileActivity.b6;
                    if (i23 >= 0) {
                        profileActivity.c.h1(i23, profileActivity.c6 - measuredWidth);
                    } else if ((z10 && profileActivity.o2) || view == null) {
                        i15 = 0;
                        profileActivity.c.h1(0, profileActivity.c4() - measuredWidth);
                        i14 = i15;
                        if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                            profileActivity.a.setPadding(i15, measuredWidth, i15, max);
                            i16 = 1;
                        } else {
                            i16 = i14;
                        }
                        if (i16 != 0) {
                            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
                            try {
                                ry0 ry0Var4 = profileActivity.a;
                                ry0Var4.layout(0, i17, ry0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i17);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        this.n0 = false;
                    } else {
                        if (i12 == 0 && !profileActivity.o2 && top > profileActivity.c4()) {
                            top = profileActivity.c4();
                        }
                        profileActivity.c.h1(i12, top - measuredWidth);
                    }
                }
                i15 = 0;
                i14 = i15;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i15, measuredWidth, i15, max);
                i16 = 1;
                if (i16 != 0) {
                }
                this.n0 = false;
            }
            i14 = 1;
            i15 = 0;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i15, measuredWidth, i15, max);
            i16 = 1;
            if (i16 != 0) {
            }
            this.n0 = false;
        }
        boolean z13 = size > View.MeasureSpec.getSize(i10);
        if (z13 != this.p0) {
            post(new uz0(this, 0));
            this.p0 = z13;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.s0;
        ih.d.c(profileActivity.E6, profileActivity.fragmentView);
        profileActivity.F6.d();
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return this.m0.P4 != -1 && i10 == 2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.n0) {
            return;
        }
        super.requestLayout();
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.l0.a = i10;
    }

    @Override // r0.l
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.nm0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.m0;
        if (view == profileActivity.a) {
            if (profileActivity.P4 == -1 || !profileActivity.P) {
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            boolean z10 = kVar.n0;
            int top = profileActivity.N.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.nm0 currentListView2 = profileActivity.N.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i13);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = profileActivity.N.getCurrentListView()) != null && (L0 = ((s4.c0) currentListView.getLayoutManager()).L0()) != -1) {
                s4.e1 K = currentListView.K(L0);
                int top2 = K != null ? K.a.getTop() : -1;
                int paddingTop = currentListView.getPaddingTop();
                if (top2 != paddingTop || L0 != 0) {
                    iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                    currentListView.scrollBy(0, i11);
                    z11 = true;
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
