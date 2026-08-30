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
import android.view.ViewGroup;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qz0 extends org.telegram.ui.Components.qv0 implements r0.n {
    public final /* synthetic */ ProfileActivity A0;
    public final c5.e t0;
    public final /* synthetic */ ProfileActivity u0;
    public boolean v0;
    public final Paint w0;
    public boolean x0;
    public final ArrayList y0;
    public final cu z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.A0 = profileActivity;
        this.u0 = profileActivity;
        this.t0 = new c5.e();
        this.w0 = new Paint();
        this.y0 = new ArrayList();
        this.z0 = new cu(8);
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.sl0 currentListView;
        int L0;
        ProfileActivity profileActivity = this.u0;
        if (viewGroup == profileActivity.a) {
            if (profileActivity.G4 == -1 || !profileActivity.N) {
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            boolean z4 = kVar.k0;
            int top = profileActivity.L.getTop();
            boolean z10 = false;
            if (i11 >= 0) {
                if (z4) {
                    org.telegram.ui.Components.sl0 currentListView2 = profileActivity.L.getCurrentListView();
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
            if (top <= 0 && (currentListView = profileActivity.L.getCurrentListView()) != null && (L0 = ((f2.i0) currentListView.getLayoutManager()).L0()) != -1) {
                f2.l1 K = currentListView.K(L0);
                int top2 = K != null ? K.a.getTop() : -1;
                int paddingTop = currentListView.getPaddingTop();
                if (top2 != paddingTop || L0 != 0) {
                    iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                    currentListView.scrollBy(0, i11);
                    z10 = true;
                }
            }
            if (z4) {
                if (z10 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.u0;
        canvas.translate(0.0f, profileActivity.a.getY());
        profileActivity.L.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.A0;
        org.telegram.ui.Components.i50 i50Var = profileActivity.u0;
        Paint paint = profileActivity.n2;
        sg.d dVar = profileActivity.k6;
        ng.e eVar = profileActivity.j6;
        Paint paint2 = profileActivity.v0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, profileActivity.w0));
                if (SharedConfig.chatBlurEnabled()) {
                    eVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.w0));
        if (profileActivity.a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.w0);
            Paint paint3 = this.w0;
            paint3.setColor(v02);
            if (profileActivity.E1) {
                paint.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            if (profileActivity.E1) {
                paint3.setAlpha((int) (profileActivity.a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.a.getChildCount();
            ArrayList arrayList = this.y0;
            arrayList.clear();
            boolean z4 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.a.getChildAt(i11);
                profileActivity.a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.a.getChildAt(i11));
                } else {
                    z4 = true;
                }
            }
            Collections.sort(arrayList, this.z0);
            profileActivity.a.getY();
            int size = arrayList.size();
            if (!profileActivity.D1 && size > 0 && !z4) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z10 = false;
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList.get(i12);
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
        if (i50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.u0);
        }
        if (profileActivity.t0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.t0.getLeft(), profileActivity.t0.getTop());
            View view2 = profileActivity.t0;
            kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int max = Math.max(profileActivity.t0.getMeasuredWidth(), profileActivity.t0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((i50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f10 = max;
                canvas.drawCircle(f10, f10, 0.7f * f10, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.t0.draw(canvas);
            canvas.restoreToCount(save);
        }
        gw0 gw0Var = profileActivity.R;
        if (gw0Var != null && gw0Var.getVisibility() == 0) {
            if (profileActivity.R.getAlpha() == 1.0f) {
                profileActivity.R.draw(canvas);
            } else if (profileActivity.R.getAlpha() != 0.0f) {
                canvas.saveLayerAlpha(profileActivity.R.getLeft(), profileActivity.R.getTop(), profileActivity.R.getRight(), profileActivity.R.getBottom(), (int) (profileActivity.R.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.R.getLeft(), profileActivity.R.getTop());
                profileActivity.R.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.F0) {
            return;
        }
        canvas.save();
        my0 my0Var = profileActivity.a;
        canvas.translate(my0Var != null ? my0Var.getTranslationX() : 0.0f, 0.0f);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.w0);
        int i13 = profileActivity.i6;
        my0 my0Var2 = profileActivity.a;
        AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i13, my0Var2 != null ? my0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.qt0[] qt0VarArr;
        org.telegram.ui.Components.qt0 qt0Var;
        ProfileActivity profileActivity = this.A0;
        bz0 bz0Var = profileActivity.S4;
        if (bz0Var.n) {
            return bz0Var.g(motionEvent);
        }
        sz0 sz0Var = profileActivity.L;
        if (sz0Var != null && (qt0Var = (qt0VarArr = sz0Var.h0)[0]) != null && qt0Var.h.getFastScroll() != null && qt0VarArr[0].h.getFastScroll().n) {
            sz0 sz0Var2 = profileActivity.L;
            if (sz0Var2.d) {
                return sz0Var2.O(motionEvent);
            }
        }
        sz0 sz0Var3 = profileActivity.L;
        if (sz0Var3 == null || !sz0Var3.H(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.A0;
        if (profileActivity.S4.n) {
            if (view == profileActivity.W) {
                return true;
            }
            kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (view == kVar || view == profileActivity.v) {
                return true;
            }
        }
        if (view == profileActivity.R) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.u0;
        try {
            if (viewGroup == profileActivity.a && profileActivity.N) {
                org.telegram.ui.Components.sl0 currentListView = profileActivity.L.getCurrentListView();
                if (profileActivity.L.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new pz0(this, 1));
        }
    }

    @Override // r0.m
    public final void n(int i10, View view) {
        this.t0.a = 0;
    }

    @Override // r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.u0.G4 != -1 && i10 == 2;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.A0;
        profileActivity.D0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
            if (i11 >= j5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.j5 j5Var = j5VarArr[i11];
            if (j5Var != null) {
                j5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr2 = profileActivity.E;
            if (i10 >= j5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.j5 j5Var2 = j5VarArr2[i10];
            if (j5Var2 != null) {
                j5Var2.a();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.A0;
        int i10 = 0;
        profileActivity.D0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr = profileActivity.D;
            if (i11 >= j5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.j5 j5Var = j5VarArr[i11];
            if (j5Var != null) {
                j5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr2 = profileActivity.E;
            if (i10 >= j5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.j5 j5Var2 = j5VarArr2[i10];
            if (j5Var2 != null) {
                j5Var2.b();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.A0;
        profileActivity.R5 = -1;
        profileActivity.Q4 = false;
        profileActivity.R4 = false;
        profileActivity.A3();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0432  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        char c3;
        org.telegram.ui.Components.mr[] mrVarArr;
        int measuredWidth;
        int max;
        View view;
        int i12;
        org.telegram.ui.ActionBar.k kVar2;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        int measuredWidth2;
        int max2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.A0;
        org.telegram.ui.Components.mr[] mrVarArr2 = profileActivity.H;
        org.telegram.ui.Components.mr[] mrVarArr3 = profileActivity.G;
        HashMap hashMap = profileActivity.V1;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f;
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        int i15 = 0;
        int i16 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        my0 my0Var = profileActivity.a;
        if (my0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) my0Var.getLayoutParams();
            if (layoutParams.topMargin != i16) {
                layoutParams.topMargin = i16;
            }
        }
        org.telegram.ui.Components.sl0 sl0Var = profileActivity.b;
        if (sl0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) sl0Var.getLayoutParams();
            if (layoutParams2.topMargin != i16) {
                layoutParams2.topMargin = i16;
            }
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        if (profileActivity.z0 == getMeasuredWidth() && profileActivity.A0 == getMeasuredHeight()) {
            mrVarArr = mrVarArr2;
            z4 = false;
            c3 = 0;
        } else {
            int i17 = profileActivity.z0;
            z4 = (i17 == 0 || i17 == getMeasuredWidth()) ? false : true;
            profileActivity.B0 = 0;
            int i18 = profileActivity.d.e.K2;
            profileActivity.z0 = getMeasuredWidth();
            profileActivity.A0 = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.a.getMeasuredHeight(), 0);
            hashMap.clear();
            c3 = 0;
            while (i15 < i18) {
                int j10 = profileActivity.d.j(i15);
                org.telegram.ui.Components.mr[] mrVarArr4 = mrVarArr2;
                hashMap.put(Integer.valueOf(i15), Integer.valueOf(profileActivity.B0));
                if (j10 == 13) {
                    profileActivity.B0 += profileActivity.a.getMeasuredHeight();
                } else {
                    f2.l1 g10 = profileActivity.d.g(null, j10);
                    View view2 = g10.a;
                    profileActivity.d.v(g10, i15);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.B0 += view2.getMeasuredHeight();
                }
                i15++;
                mrVarArr2 = mrVarArr4;
            }
            mrVarArr = mrVarArr2;
            org.telegram.ui.Components.zw0 zw0Var = profileActivity.M;
            if (zw0Var != null) {
                ((FrameLayout.LayoutParams) zw0Var.getLayoutParams()).topMargin = profileActivity.T3() + AndroidUtilities.statusBarHeight;
            }
        }
        if (profileActivity.d5 != null) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[c3];
            k5Var.setRightPadding(k5Var.getMeasuredWidth() - profileActivity.d5.o().getTitleTextView().getMeasuredWidth());
        }
        boolean z14 = profileActivity.i5;
        if (!z14 && ((z13 = profileActivity.k1) || (profileActivity.D1 && profileActivity.G1 == 2))) {
            this.v0 = true;
            if (z13) {
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null) {
                    w0Var.setAlpha(0.0f);
                    profileActivity.R0.setEnabled(false);
                    profileActivity.R0.setVisibility(8);
                }
                k5VarArr[1].setTextColor(-1);
                k5VarArr[1].setPivotY(r8.getMeasuredHeight());
                k5VarArr[1].setScaleX(1.38f);
                k5VarArr[1].setScaleY(1.38f);
                org.telegram.ui.Components.fm0 fm0Var = profileActivity.I;
                if (fm0Var != null) {
                    fm0Var.b(Color.argb(179, 255, 255, 255));
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                org.telegram.ui.Components.mr mrVar = mrVarArr3[0];
                if (mrVar != null) {
                    mrVar.b(1.0f);
                }
                org.telegram.ui.Components.mr mrVar2 = mrVarArr3[1];
                if (mrVar2 != null) {
                    mrVar2.b(1.0f);
                }
                org.telegram.ui.Components.mr mrVar3 = mrVarArr[0];
                if (mrVar3 != null) {
                    mrVar3.b(1.0f);
                }
                org.telegram.ui.Components.mr mrVar4 = mrVarArr[1];
                if (mrVar4 != null) {
                    mrVar4.b(1.0f);
                }
                profileActivity.Y4(1.0f);
                profileActivity.r[1].setTextColor(-1275068417);
                kVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                kVar3.B(1090519039, false);
                kVar4 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                kVar4.C(-1, false);
                h01 h01Var = profileActivity.K;
                h01Var.B = true;
                h01Var.setVisibility(0);
                profileActivity.K.e(1.0f, false);
                profileActivity.b0.setForegroundAlpha(1.0f);
                profileActivity.V.setVisibility(4);
                profileActivity.k0.L();
                profileActivity.k0.setVisibility(0);
                s01 s01Var = profileActivity.Y5;
                if (s01Var != null) {
                    s01Var.a(603979775);
                }
                zy0 zy0Var = profileActivity.r0;
                if (zy0Var != null) {
                    zy0Var.setExpandProgress(1.0f);
                }
                lh.u0 u0Var = profileActivity.s0;
                if (u0Var != null) {
                    u0Var.setExpandProgress(1.0f);
                }
                org.telegram.ui.Components.jh0 jh0Var = profileActivity.X;
                if (jh0Var != null) {
                    jh0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.ci0 ci0Var = profileActivity.Z;
                if (ci0Var != null) {
                    ci0Var.setParentExpanded(1.0f);
                }
                org.telegram.ui.Components.jw0 jw0Var = profileActivity.Q;
                if (jw0Var != null) {
                    jw0Var.setParentExpanded(1.0f);
                }
                c10 = 0;
                profileActivity.k1 = false;
                profileActivity.V4();
            } else {
                c10 = 0;
            }
            profileActivity.z3();
            profileActivity.l2 = true;
            profileActivity.m2 = true;
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i19 = NotificationCenter.needCheckSystemBarColors;
            Object[] objArr = new Object[1];
            objArr[c10] = Boolean.TRUE;
            globalInstance.lambda$postNotificationNameOnUIThread$1(i19, objArr);
            if (profileActivity.Q0 != null) {
                if (profileActivity.g4()) {
                    profileActivity.Q0.r(21);
                } else {
                    profileActivity.Q0.K(21);
                }
                if (profileActivity.n0 != null) {
                    profileActivity.Q0.K(34);
                    profileActivity.Q0.K(35);
                    profileActivity.Q0.r(31);
                }
            }
            profileActivity.i2 = 1.0f;
            if (profileActivity.k2) {
                measuredWidth2 = profileActivity.T3() + i16;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.B0) + i16));
            }
            if (profileActivity.B1 != 0) {
                max2 += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            float f10 = measuredWidth2 - i16;
            profileActivity.O1 = f10;
            if (profileActivity.G1 == 0) {
                profileActivity.N1 = f10;
            }
            profileActivity.c.h1(0, -i16);
            profileActivity.a.setPadding(0, measuredWidth2, 0, max2);
            measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
            my0 my0Var2 = profileActivity.a;
            my0Var2.layout(0, i16, my0Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
            this.v0 = false;
        } else if (z14 && !profileActivity.D1 && !profileActivity.Q4) {
            this.v0 = true;
            if (profileActivity.F0 || !(profileActivity.k2 || AndroidUtilities.isTablet())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.O3();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.B0) + i16));
            } else {
                measuredWidth = profileActivity.T3();
                max = 0;
            }
            if (profileActivity.B1 != 0) {
                max += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                profileActivity.a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
            } else {
                profileActivity.a.setBottomGlowOffset(0);
            }
            int paddingTop = profileActivity.a.getPaddingTop();
            int i20 = 0;
            while (true) {
                if (i20 >= profileActivity.a.getChildCount()) {
                    view = null;
                    i12 = -1;
                    break;
                } else {
                    i12 = RecyclerView.R(profileActivity.a.getChildAt(i20));
                    if (i12 != -1) {
                        view = profileActivity.a.getChildAt(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (view == null && (view = profileActivity.a.getChildAt(0)) != null) {
                my0 my0Var3 = profileActivity.a;
                View F = my0Var3.F(view);
                f2.l1 T = F == null ? null : my0Var3.T(F);
                i12 = T.b();
                if (i12 == -1 && (i12 = T.g) == -1) {
                    i12 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if ((kVar2.k0 || profileActivity.o1) && (i13 = profileActivity.G4) >= 0) {
                profileActivity.c.h1(i13, -measuredWidth);
            } else {
                if (profileActivity.R4 || paddingTop != measuredWidth) {
                    int i21 = profileActivity.R5;
                    if (i21 >= 0) {
                        profileActivity.c.h1(i21, profileActivity.S5 - measuredWidth);
                    } else {
                        if ((z4 && profileActivity.l2) || view == null) {
                            i14 = 0;
                            profileActivity.c.h1(0, profileActivity.T3() - measuredWidth);
                            z10 = false;
                            if (paddingTop == measuredWidth || profileActivity.a.getPaddingBottom() != max) {
                                profileActivity.a.setPadding(i14, measuredWidth, i14, max);
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (z11) {
                                measureChildWithMargins(profileActivity.a, i10, 0, i11, 0);
                                try {
                                    my0 my0Var4 = profileActivity.a;
                                    my0Var4.layout(0, i16, my0Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i16);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            this.v0 = false;
                            z12 = size <= View.MeasureSpec.getSize(i10);
                            if (z12 == this.x0) {
                                post(new pz0(this, 0));
                                this.x0 = z12;
                                return;
                            }
                            return;
                        }
                        if (i12 == 0 && !profileActivity.l2 && top > profileActivity.T3()) {
                            top = profileActivity.T3();
                        }
                        profileActivity.c.h1(i12, top - measuredWidth);
                    }
                }
                i14 = 0;
                z10 = false;
                if (paddingTop == measuredWidth) {
                }
                profileActivity.a.setPadding(i14, measuredWidth, i14, max);
                z11 = true;
                if (z11) {
                }
                this.v0 = false;
                if (size <= View.MeasureSpec.getSize(i10)) {
                }
                if (z12 == this.x0) {
                }
            }
            i14 = 0;
            z10 = true;
            if (paddingTop == measuredWidth) {
            }
            profileActivity.a.setPadding(i14, measuredWidth, i14, max);
            z11 = true;
            if (z11) {
            }
            this.v0 = false;
            if (size <= View.MeasureSpec.getSize(i10)) {
            }
            if (z12 == this.x0) {
            }
        }
        if (size <= View.MeasureSpec.getSize(i10)) {
        }
        if (z12 == this.x0) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.A0;
        tg.c.c(profileActivity.m6, profileActivity.fragmentView);
        profileActivity.n6.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v0) {
            return;
        }
        super.requestLayout();
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        this.t0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
