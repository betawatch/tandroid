package sg;

import ag.p2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.ic;
import org.telegram.messenger.tc;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.b21;
import org.telegram.ui.e21;
import org.telegram.ui.i21;
import org.telegram.ui.q21;
import org.telegram.ui.t11;
import org.telegram.ui.un;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b0 {
    public final int[] A;
    public final e2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 a;
    public final WindowManager b;
    public final ph.k c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final w m;
    public final nj0 n;
    public final List o;
    public eb0 p;
    public boolean q;
    public final k2 r;
    public final p6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public vg.f z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public b0(int i10, k2 k2Var, ArrayList arrayList, HashSet hashSet, nj0 nj0Var, p6 p6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new e2.f((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        int i11 = 0;
        this.F = 0;
        this.y = i10;
        this.o = arrayList;
        this.r = k2Var;
        this.s = p6Var;
        Context context = k2Var != null ? k2Var.getContext() : nj0Var.getContext();
        ph.k kVar = new ph.k(this, context);
        this.c = kVar;
        kVar.setOnClickListener(new rh.s(this, 10));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        a0 a0Var = new a0(this, context);
        this.a = a0Var;
        boolean z12 = z11;
        w wVar = new w(this, k2Var, context, nj0Var.getWindowType(), i10 != 1, p6Var, nj0Var, k2Var);
        this.m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z13 = nj0Var.g1;
        boolean z14 = nj0Var.h1;
        if (wVar.L1 != z13) {
            wVar.L1 = z13;
            wVar.M1 = z14;
            e21 e21Var = wVar.h0;
            if (e21Var != null) {
                e21Var.invalidate();
            }
            t11 t11Var = wVar.i0;
            if (t11Var != null) {
                t11Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new r2.y(nj0Var, 7));
        wVar.setOnRecentClearedListener(new oa.d(20));
        wVar.setRecentReactions(arrayList);
        wVar.setSelectedReactions((HashSet<o0>) hashSet);
        wVar.setDrawBackground(false);
        wVar.s(null);
        a0Var.addView(wVar, b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = 16;
        int i13 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            kVar.setClipChildren(false);
            kVar.setClipToPadding(false);
        }
        float f7 = i13;
        kVar.addView(a0Var, b6.d(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        kVar.setClipChildren(false);
        if (i10 == 1 || (nj0Var.getDelegate() != null && nj0Var.getDelegate().A())) {
            wVar.setBackgroundDelegate(new org.telegram.ui.web.k0(i12, this, nj0Var));
        }
        if (z12) {
            ((ViewGroup) nj0Var.getParent()).addView(kVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.i0.W(context).getWindowManager();
            this.b = windowManager;
            org.telegram.messenger.i0.x3(windowManager, kVar, b10);
            windowManager.addView(kVar, b10);
        }
        this.n = nj0Var;
        nj0Var.setOnSwitchedToLoopView(new t(this, i11));
        nj0Var.c1 = true;
        nj0Var.invalidate();
        org.telegram.messenger.i0.h3(new rh.n(24, this, nj0Var), 50L);
        if (i10 != 5) {
            at.e().k(at.j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        nj0 nj0Var = b0Var.n;
        w wVar = b0Var.m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.e();
            wVar.setEnterAnimationInProgress(false);
            e21 e21Var = wVar.h0;
            if (z10) {
                wVar.d0.m(false);
                e21Var.invalidate();
                ArrayList arrayList = e21Var.h3;
                e21Var.g1();
                wVar.f0.b();
                wVar.sendAccessibilityEvent(32);
                nj0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= e21Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (e21Var.getChildAt(i10) instanceof q21) {
                            view = e21Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    wVar.performAccessibilityAction(64, null);
                }
                if (nj0Var.getPullingLeftProgress() > 0.0f) {
                    nj0Var.O0 = false;
                    ValueAnimator valueAnimator = nj0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    nj0Var.B0 = 0.0f;
                    fg.i iVar = nj0Var.S;
                    if (iVar != null) {
                        iVar.invalidate();
                    }
                    nj0Var.invalidate();
                } else {
                    nj0Var.O0 = true;
                    ValueAnimator valueAnimator2 = nj0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    nj0Var.B0 = 0.0f;
                    fg.i iVar2 = nj0Var.S;
                    if (iVar2 != null) {
                        iVar2.invalidate();
                    }
                    nj0Var.invalidate();
                }
                t11 t11Var = wVar.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i21 i21Var = (i21) arrayList.get(i11);
                    for (int i12 = 0; i12 < i21Var.O.size(); i12++) {
                        if (((q21) i21Var.O.get(i12)).b) {
                            ((q21) i21Var.O.get(i12)).b = false;
                            ((q21) i21Var.O.get(i12)).invalidate();
                            i21Var.k();
                        }
                    }
                }
                e21Var.invalidate();
                for (int i13 = 0; i13 < t11Var.h3.size(); i13++) {
                    i21 i21Var2 = (i21) t11Var.h3.get(i13);
                    for (int i14 = 0; i14 < i21Var2.O.size(); i14++) {
                        if (((q21) i21Var2.O.get(i14)).b) {
                            ((q21) i21Var2.O.get(i14)).b = false;
                            ((q21) i21Var2.O.get(i14)).invalidate();
                            i21Var2.k();
                        }
                    }
                }
                t11Var.invalidate();
                b0Var.i();
                b0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof q21) {
            ((q21) view).setAnimatedScale(f7);
        } else if (view instanceof iv) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.y;
        layoutParams.type = (i10 == 0 || i10 == 3) ? 1000 : 99;
        layoutParams.softInputMode = 16;
        if (z10) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    public final void c(boolean z10) {
        ?? r18;
        boolean z11;
        ValueAnimator valueAnimator;
        boolean z12;
        w wVar = this.m;
        int i10 = this.y;
        ph.k kVar = this.c;
        int[] iArr = this.A;
        a0 a0Var = this.a;
        RectF rectF = this.f;
        nj0 nj0Var = this.n;
        rectF.set(nj0Var.x);
        this.e = nj0Var.D;
        int[] iArr2 = new int[2];
        if (z10) {
            nj0Var.getLocationOnScreen(iArr);
        }
        kVar.getLocationOnScreen(iArr2);
        int i11 = 0;
        float topOffset = nj0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - org.telegram.messenger.i0.L(44.0f)) - org.telegram.messenger.i0.L(52.0f)) - (wVar.O0 ? org.telegram.messenger.i0.L(26.0f) : 0));
        if (nj0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.i0.L(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > kVar.getMeasuredHeight() - org.telegram.messenger.i0.L(32.0f)) {
            topOffset = (kVar.getMeasuredHeight() - org.telegram.messenger.i0.L(32.0f)) - a0Var.getMeasuredHeight();
        }
        if (topOffset < org.telegram.messenger.i0.L(16.0f)) {
            topOffset = org.telegram.messenger.i0.L(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            r18 = 1;
            a0Var.setTranslationX(((kVar.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.i0.L(16.0f));
        } else {
            boolean z13 = true;
            if (i10 == 2 || i10 == 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.i0.L(18.0f));
                r18 = z13;
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.i0.L(2.0f));
                r18 = z13;
            }
        }
        if (z10) {
            this.t = topOffset;
            a0Var.setTranslationY(topOffset);
        } else {
            this.t = a0Var.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        nj0Var.setCustomEmojiEnterProgress(this.j);
        if (z10) {
            this.w = (uz.o() < 2 || !tc.e(8200)) ? false : r18;
            this.k = false;
        } else {
            this.w = false;
        }
        if (this.w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        wVar.d0.m(z10 && this.w);
        this.B.d();
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f7 = this.j;
        if (i10 == 4) {
            valueAnimator = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
        } else {
            float f10 = z10 ? 1.0f : 0.0f;
            jv0 jv0Var = new jv0();
            jv0Var.a = 0;
            jv0Var.b = 0;
            jv0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = jv0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new jg.o0(10, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new y(i11, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(gr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            a30.j(0.5f, this.x);
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(gr.f);
        }
        a0Var.invalidate();
        h(true);
        if (z10) {
            nj0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            v vVar = new v(valueAnimator3, i11);
            e0.f = this.w;
            e0.e = true;
            e0.g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.c = vVar;
        } else {
            nj0Var.O0 = true;
            nj0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = e0.a;
        com.google.android.gms.internal.cast.c0 c0Var = ic.D().p;
        if (((CountDownLatch) c0Var.c) == null) {
            z12 = true;
            c0Var.c = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        e0.b = z12;
        e0.e = false;
        e0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        nj0 nj0Var = this.n;
        if (nj0Var != null) {
            ValueAnimator valueAnimator = nj0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            nj0Var.B0 = 0.0f;
            fg.i iVar = nj0Var.S;
            if (iVar != null) {
                iVar.invalidate();
            }
            nj0Var.invalidate();
        }
        wb.e();
        this.q = true;
        org.telegram.messenger.i0.v1(this.c);
        c(false);
        if (this.v) {
            k2 k2Var = this.r;
            if (k2Var instanceof un) {
                ((un) k2Var).oa(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        wb.e();
        this.q = true;
        ph.k kVar = this.c;
        org.telegram.messenger.i0.v1(kVar);
        kVar.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
        if (this.v) {
            k2 k2Var = this.r;
            if (k2Var instanceof un) {
                ((un) k2Var).oa(true, true);
            }
        }
    }

    public final void f() {
        int i10 = 1;
        if (this.y != 5) {
            at.e().k(at.k1, 7);
        }
        org.telegram.messenger.i0.g3(new t(this, i10));
    }

    public final void h(boolean z10) {
        int i10 = z10 ? 2 : 0;
        w wVar = this.m;
        wVar.h0.setLayerType(i10, null);
        wVar.f0.setLayerType(i10, null);
        if (!this.w) {
            wVar.e0.setLayerType(i10, null);
            wVar.d0.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(wVar.d0.b.getChildCount(), 16); i11++) {
                wVar.d0.b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            w wVar = this.m;
            e21 e21Var = wVar.h0;
            e21 e21Var2 = wVar.h0;
            if (i10 >= e21Var.getChildCount()) {
                return;
            }
            if (e21Var2.getChildAt(i10) instanceof q21) {
                q21 q21Var = (q21) e21Var2.getChildAt(i10);
                if (q21Var.y != null) {
                    q21Var.b = false;
                    q21Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(boolean z10, float f7) {
        RectF rectF;
        HashSet hashSet;
        w wVar = this.m;
        float y3 = wVar.getY();
        b21 b21Var = wVar.a0;
        float y10 = b21Var.getY() + y3;
        e21 e21Var = wVar.h0;
        int y11 = (int) (e21Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = e21Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = e21Var.getChildAt(i10);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y11;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f7 == 0.0f) {
                    g(childAt, 0.0f);
                    z11 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                }
            }
            i10++;
        }
        int y12 = (int) (wVar.d0.getY() + b21Var.getY() + wVar.getY());
        for (int i11 = 0; i11 < wVar.d0.b.getChildCount(); i11++) {
            View childAt2 = wVar.d0.b.getChildAt(i11);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y12;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f7 == 0.0f) {
                    g(childAt2, 0.0f);
                    z11 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                }
            }
        }
        if (z11) {
            wVar.k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new p2(28, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 14));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(gr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (this.w) {
            return;
        }
        w wVar = this.m;
        wVar.f0.setAlpha(this.j);
        wVar.h0.setAlpha(this.j);
        wVar.i0.setAlpha(this.j);
        wVar.d0.setAlpha(this.j);
        wVar.e0.setAlpha(this.j);
    }

    public final void l() {
        w wVar = this.m;
        b21 b21Var = wVar.a0;
        b21 b21Var2 = wVar.a0;
        boolean z10 = this.w;
        a0 a0Var = this.a;
        b21Var.setTranslationX(z10 ? 0.0f : a0Var.f);
        b21Var2.setTranslationY(a0Var.h);
        b21Var2.setPivotX(a0Var.r);
        b21Var2.setPivotY(a0Var.s);
        b21Var2.setScaleX(a0Var.n);
        b21Var2.setScaleY(a0Var.n);
    }
}
