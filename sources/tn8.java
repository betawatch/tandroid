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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tn8 extends cja implements ti7 {
    public final zw8 m0;
    public final /* synthetic */ ProfileActivity n0;
    public boolean o0;
    public final Paint p0;
    public boolean q0;
    public final ArrayList r0;
    public final fx7 s0;
    public final /* synthetic */ ProfileActivity t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn8(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.t0 = profileActivity;
        this.n0 = profileActivity;
        this.m0 = new zw8((byte) 3);
        this.p0 = new Paint();
        this.r0 = new ArrayList();
        this.s0 = new fx7((byte) 5);
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        a aVar;
        ProfileActivity profileActivity = this.t0;
        wm8 wm8Var = profileActivity.y0;
        Paint paint = profileActivity.r2;
        Paint paint2 = profileActivity.z0;
        float f = profileActivity.G5;
        Paint paint3 = this.p0;
        if (f > 0.0f) {
            paint3.setColor(bkb.v0(bkb.Z6, profileActivity.A0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), profileActivity.b2(), paint3);
        }
        int i = bkb.Z6;
        paint.setColor(bkb.v0(i, profileActivity.A0));
        if (profileActivity.a.getVisibility() == 0) {
            paint3.setColor(bkb.v0(i, profileActivity.A0));
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
        if (wm8Var.getAlpha() > 0) {
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
                paint2.setAlpha((int) (((wm8Var.getAlpha() / 255.0f) * alpha) / 0.3f));
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
        om8 om8Var = profileActivity.a;
        canvas.translate(om8Var != null ? om8Var.getTranslationX() : 0.0f, 0.0f);
        int v0 = bkb.v0(bkb.c6, profileActivity.A0);
        int i4 = profileActivity.P6;
        om8 om8Var2 = profileActivity.a;
        gl.O(canvas, this, v0, i4, om8Var2 != null ? om8Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iea[] ieaVarArr;
        iea ieaVar;
        ProfileActivity profileActivity = this.t0;
        cn8 cn8Var = profileActivity.Z4;
        if (cn8Var.n) {
            return cn8Var.g(motionEvent);
        }
        vn8 vn8Var = profileActivity.O;
        if (vn8Var != null && (ieaVar = (ieaVarArr = vn8Var.n0)[0]) != null && ieaVar.h.getFastScroll() != null && ieaVarArr[0].h.getFastScroll().n) {
            vn8 vn8Var2 = profileActivity.O;
            if (vn8Var2.d) {
                return vn8Var2.I(motionEvent);
            }
        }
        vn8 vn8Var3 = profileActivity.O;
        if (vn8Var3 == null || !vn8Var3.A(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        ProfileActivity profileActivity = this.t0;
        if (profileActivity.Z4.n) {
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

    @Override // si7
    public final void k(int i, View view) {
        this.m0.b = 0;
    }

    @Override // ti7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ProfileActivity profileActivity = this.n0;
        byte b = 1;
        try {
            if (view == profileActivity.a && profileActivity.Q) {
                o39 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i4;
                    currentListView.scrollBy(0, i4);
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
            gl.d3(new sn8(this, b));
        }
    }

    @Override // si7
    public final boolean n(View view, View view2, int i, int i2) {
        return this.n0.N4 != -1 && i == 2;
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.t0;
        profileActivity.H0 = true;
        tl tlVar = profileActivity.G;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = profileActivity.H;
        if (tlVar2 != null) {
            tlVar2.a();
        }
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.t0;
        profileActivity.H0 = false;
        tl tlVar = profileActivity.G;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = profileActivity.H;
        if (tlVar2 != null) {
            tlVar2.b();
        }
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ProfileActivity profileActivity = this.t0;
        profileActivity.r6 = -1;
        profileActivity.X4 = false;
        profileActivity.Y4 = false;
        profileActivity.F1();
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
        int i8 = currentActionBarHeight + (aVar.getOccupyStatusBar() ? gl.m : 0);
        om8 om8Var = profileActivity.a;
        if (om8Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) om8Var.getLayoutParams();
            if (layoutParams.topMargin != i8) {
                layoutParams.topMargin = i8;
            }
        }
        o39 o39Var = profileActivity.b;
        if (o39Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o39Var.getLayoutParams();
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
                    s49 a = profileActivity.d.a(null, d);
                    View view2 = a.a;
                    profileActivity.d.t(a, i11);
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    profileActivity.F0 += view2.getMeasuredHeight();
                }
            }
            zya zyaVar = profileActivity.P;
            if (zyaVar != null) {
                ((FrameLayout.LayoutParams) zyaVar.getLayoutParams()).topMargin = profileActivity.c2() + gl.m;
            }
        }
        boolean z3 = profileActivity.r5;
        if (!z3 && ((z2 = profileActivity.n1) || (profileActivity.G1 && profileActivity.J1 == 2))) {
            this.o0 = true;
            if (z2) {
                xha xhaVar = profileActivity.U0;
                if (xhaVar != null) {
                    xhaVar.setAlpha(0.0f);
                    profileActivity.U0.setEnabled(false);
                    profileActivity.U0.setVisibility(8);
                }
                profileActivity.f.setTextColor(-1);
                profileActivity.f.setPivotY(r4.getMeasuredHeight());
                profileActivity.f.setScaleX(1.38f);
                profileActivity.f.setScaleY(1.38f);
                gq9 gq9Var = profileActivity.L;
                if (gq9Var != null) {
                    gq9Var.b(-1275068417);
                }
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                }
                m33 m33Var = profileActivity.J;
                if (m33Var != null) {
                    m33Var.a(1.0f);
                }
                m33 m33Var2 = profileActivity.K;
                if (m33Var2 != null) {
                    m33Var2.a(1.0f);
                }
                profileActivity.M3(1.0f);
                profileActivity.r.setTextColor(-1275068417);
                aVar3 = ((d) profileActivity).actionBar;
                aVar3.G(1090519039, false);
                aVar4 = ((d) profileActivity).actionBar;
                aVar4.H(-1, false);
                lo8 lo8Var = profileActivity.N;
                lo8Var.F = true;
                lo8Var.setVisibility(0);
                profileActivity.N.e(false, 1.0f);
                profileActivity.f0.setForegroundAlpha(1.0f);
                profileActivity.Y.setVisibility(4);
                profileActivity.o0.L();
                profileActivity.o0.setVisibility(0);
                uo8 uo8Var = profileActivity.F6;
                if (uo8Var != null) {
                    uo8Var.a(603979775);
                }
                an8 an8Var = profileActivity.v0;
                if (an8Var != null) {
                    an8Var.setExpandProgress(1.0f);
                }
                vq8 vq8Var = profileActivity.w0;
                if (vq8Var != null) {
                    vq8Var.setExpandProgress(1.0f);
                }
                pl8 pl8Var = profileActivity.a0;
                if (pl8Var != null) {
                    pl8Var.setParentExpanded(1.0f);
                }
                profileActivity.p3(1.0f);
                jr8 jr8Var = profileActivity.c0;
                if (jr8Var != null) {
                    jr8Var.setParentExpanded(1.0f);
                }
                hra hraVar = profileActivity.T;
                if (hraVar != null) {
                    hraVar.setParentExpanded(1.0f);
                }
                c = 0;
                profileActivity.n1 = false;
                profileActivity.J3();
            } else {
                c = 0;
            }
            profileActivity.D1();
            profileActivity.p2 = true;
            profileActivity.q2 = true;
            kk7 e = kk7.e();
            Object[] objArr = new Object[1];
            objArr[c] = Boolean.TRUE;
            e.k(kk7.t4, objArr);
            if (profileActivity.T0 != null) {
                boolean p2 = profileActivity.p2();
                xha xhaVar2 = profileActivity.T0;
                if (p2) {
                    xhaVar2.u(21);
                } else {
                    xhaVar2.S(21);
                }
                if (profileActivity.r0 != null) {
                    profileActivity.T0.S(34);
                    profileActivity.T0.S(35);
                    profileActivity.T0.u(31);
                }
            }
            profileActivity.m2 = 1.0f;
            if (profileActivity.o2) {
                measuredWidth2 = profileActivity.c2() + i8;
                max2 = 0;
            } else {
                measuredWidth2 = profileActivity.a.getMeasuredWidth() + profileActivity.W1();
                max2 = Math.max(0, getMeasuredHeight() - ((profileActivity.c2() + profileActivity.F0) + i8));
            }
            if (profileActivity.E1 != 0) {
                max2 += gl.L(48.0f) + gl.n;
                profileActivity.a.setBottomGlowOffset(gl.L(48.0f) + gl.n);
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
            om8 om8Var2 = profileActivity.a;
            om8Var2.layout(0, i8, om8Var2.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i8);
            this.o0 = false;
        } else if (z3 && !profileActivity.G1 && !profileActivity.X4) {
            this.o0 = true;
            if (profileActivity.J0 || !(profileActivity.o2 || gl.O1())) {
                measuredWidth = profileActivity.a.getMeasuredWidth() + profileActivity.W1();
                max = Math.max(0, getMeasuredHeight() - ((profileActivity.c2() + profileActivity.F0) + i8));
            } else {
                measuredWidth = profileActivity.c2();
                max = 0;
            }
            if (profileActivity.E1 != 0) {
                max += gl.L(48.0f) + gl.n;
                profileActivity.a.setBottomGlowOffset(gl.L(48.0f) + gl.n);
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
                om8 om8Var3 = profileActivity.a;
                View F = om8Var3.F(view);
                s49 T = F != null ? om8Var3.T(F) : null;
                i3 = T.b();
                if (i3 == -1 && (i3 = T.g) == -1) {
                    i3 = T.c;
                }
            }
            int top = view != null ? view.getTop() : measuredWidth;
            aVar2 = ((d) profileActivity).actionBar;
            if ((aVar2.o0 || profileActivity.r1) && (i4 = profileActivity.N4) >= 0) {
                profileActivity.c.g1(i4, -measuredWidth);
            } else {
                if (profileActivity.Y4 || paddingTop != measuredWidth) {
                    int i13 = profileActivity.r6;
                    if (i13 >= 0) {
                        profileActivity.c.g1(i13, profileActivity.s6 - measuredWidth);
                    } else if ((z && profileActivity.p2) || view == null) {
                        i6 = 0;
                        profileActivity.c.g1(0, profileActivity.c2() - measuredWidth);
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
                                om8 om8Var4 = profileActivity.a;
                                om8Var4.layout(0, i8, om8Var4.getMeasuredWidth(), profileActivity.a.getMeasuredHeight() + i8);
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                        }
                        this.o0 = false;
                    } else {
                        if (i3 == 0 && !profileActivity.p2 && top > profileActivity.c2()) {
                            top = profileActivity.c2();
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
            post(new sn8(this, (byte) 0));
            this.q0 = z4;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ProfileActivity profileActivity = this.t0;
        tk0.c(profileActivity.Q6, profileActivity.fragmentView);
        profileActivity.R6.d();
    }

    @Override // si7
    public final void q(View view, View view2, int i, int i2) {
        this.m0.b = i;
    }

    @Override // si7
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        a aVar;
        int i4;
        o39 currentListView;
        int K0;
        ProfileActivity profileActivity = this.n0;
        if (view == profileActivity.a) {
            if (profileActivity.N4 == -1 || !profileActivity.Q) {
                return;
            }
            aVar = ((d) profileActivity).actionBar;
            boolean z = aVar.o0;
            int top = profileActivity.O.getTop();
            boolean z2 = false;
            if (i2 >= 0) {
                if (z) {
                    o39 currentListView2 = profileActivity.O.getCurrentListView();
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
            if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (K0 = ((t26) currentListView.getLayoutManager()).K0()) != -1) {
                s49 K = currentListView.K(K0);
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

    @Override // si7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
