package zg;

import ai.bb;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import ci.m6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.d61;
import org.telegram.ui.g70;
import org.telegram.ui.l61;
import org.telegram.ui.p51;
import org.telegram.ui.w51;
import org.telegram.ui.yn;
import org.telegram.ui.z51;
import w7.z5;
import yh.r2;
import yh.r5;
import yh.t3;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class b0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 a;
    public final WindowManager b;
    public final t3 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final x m;
    public final sk0 n;
    public final List o;
    public lc0 p;
    public boolean q;
    public final n2 r;
    public final d6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public ch.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public b0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, sk0 sk0Var, d6 d6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i11 = 0;
        this.F = 0;
        this.y = i10;
        this.o = arrayList;
        this.r = n2Var;
        this.s = d6Var;
        Context context = n2Var != null ? n2Var.getContext() : sk0Var.getContext();
        t3 t3Var = new t3(this, context);
        this.c = t3Var;
        int i12 = 28;
        t3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, i12));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        a0 a0Var = new a0(this, context);
        this.a = a0Var;
        boolean z12 = z11;
        x xVar = new x(this, n2Var, context, sk0Var.getWindowType(), i10 != 1, d6Var, sk0Var, n2Var);
        this.m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z13 = sk0Var.f1;
        boolean z14 = sk0Var.g1;
        if (xVar.K1 != z13) {
            xVar.K1 = z13;
            xVar.L1 = z14;
            z51 z51Var = xVar.h0;
            if (z51Var != null) {
                z51Var.invalidate();
            }
            p51 p51Var = xVar.i0;
            if (p51Var != null) {
                p51Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new n2.c(sk0Var, i12));
        xVar.setOnRecentClearedListener(new t7.u());
        xVar.setRecentReactions(arrayList);
        xVar.setSelectedReactions((HashSet<o0>) hashSet);
        xVar.setDrawBackground(false);
        xVar.s(null);
        a0Var.addView(xVar, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i13 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            t3Var.setClipChildren(false);
            t3Var.setClipToPadding(false);
        }
        float f7 = i13;
        t3Var.addView(a0Var, z5.d(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        t3Var.setClipChildren(false);
        if (i10 == 1 || (sk0Var.getDelegate() != null && sk0Var.getDelegate().p())) {
            xVar.setBackgroundDelegate(new rg.x(20, this, sk0Var));
        }
        if (z12) {
            ((ViewGroup) sk0Var.getParent()).addView(t3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, t3Var, b10);
            windowManager.addView(t3Var, b10);
        }
        this.n = sk0Var;
        sk0Var.setOnSwitchedToLoopView(new u(this, i11));
        sk0Var.b1 = true;
        sk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new r5(6, this, sk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        sk0 sk0Var = b0Var.n;
        x xVar = b0Var.m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.unlock();
            xVar.setEnterAnimationInProgress(false);
            z51 z51Var = xVar.h0;
            if (z10) {
                xVar.d0.m(false);
                z51Var.invalidate();
                ArrayList arrayList = z51Var.h3;
                z51Var.h1();
                xVar.f0.b();
                xVar.sendAccessibilityEvent(32);
                sk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= z51Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (z51Var.getChildAt(i10) instanceof l61) {
                            view = z51Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    xVar.performAccessibilityAction(64, null);
                }
                if (sk0Var.getPullingLeftProgress() > 0.0f) {
                    sk0Var.O0 = false;
                    ValueAnimator valueAnimator = sk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    sk0Var.B0 = 0.0f;
                    m6 m6Var = sk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    sk0Var.invalidate();
                } else {
                    sk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = sk0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    sk0Var.B0 = 0.0f;
                    m6 m6Var2 = sk0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    sk0Var.invalidate();
                }
                p51 p51Var = xVar.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    d61 d61Var = (d61) arrayList.get(i11);
                    for (int i12 = 0; i12 < d61Var.O.size(); i12++) {
                        if (((l61) d61Var.O.get(i12)).b) {
                            ((l61) d61Var.O.get(i12)).b = false;
                            ((l61) d61Var.O.get(i12)).invalidate();
                            d61Var.k();
                        }
                    }
                }
                z51Var.invalidate();
                for (int i13 = 0; i13 < p51Var.h3.size(); i13++) {
                    d61 d61Var2 = (d61) p51Var.h3.get(i13);
                    for (int i14 = 0; i14 < d61Var2.O.size(); i14++) {
                        if (((l61) d61Var2.O.get(i14)).b) {
                            ((l61) d61Var2.O.get(i14)).b = false;
                            ((l61) d61Var2.O.get(i14)).invalidate();
                            d61Var2.k();
                        }
                    }
                }
                p51Var.invalidate();
                b0Var.i();
                b0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof l61) {
            ((l61) view).setAnimatedScale(f7);
        } else if (view instanceof cw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.y;
        layoutParams.type = (i10 == 0 || i10 == 3) ? MediaDataController.MAX_STYLE_RUNS_COUNT : 99;
        layoutParams.softInputMode = 16;
        if (z10) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    public final void c(boolean z10) {
        char c10;
        boolean z11;
        ValueAnimator valueAnimator;
        boolean z12;
        x xVar = this.m;
        int i10 = this.y;
        t3 t3Var = this.c;
        int[] iArr = this.A;
        a0 a0Var = this.a;
        RectF rectF = this.f;
        sk0 sk0Var = this.n;
        rectF.set(sk0Var.w);
        this.e = sk0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            sk0Var.getLocationOnScreen(iArr);
        }
        t3Var.getLocationOnScreen(iArr2);
        float topOffset = sk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (xVar.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (sk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > t3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (t3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - a0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            a0Var.setTranslationX(((t3Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i10 == 2 || i10 == 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
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
        float y3 = (iArr[c10] - iArr2[c10]) - a0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        sk0Var.setCustomEmojiEnterProgress(this.j);
        if (z10) {
            this.w = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
            this.k = false;
        } else {
            this.w = false;
        }
        if (this.w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        xVar.d0.m(z10 && this.w);
        this.B.lock();
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
            zw0 zw0Var = new zw0();
            zw0Var.a = 0;
            zw0Var.b = 0;
            zw0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = zw0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new g70(17, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(tr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(tr.f);
        }
        a0Var.invalidate();
        h(true);
        if (z10) {
            sk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            r2 r2Var = new r2(valueAnimator3, 10);
            e0.f = this.w;
            e0.e = true;
            e0.g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.c = r2Var;
        } else {
            sk0Var.O0 = true;
            sk0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = e0.a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z12 = true;
            cacheOutQueue.b = new CountDownLatch(1);
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
        sk0 sk0Var = this.n;
        if (sk0Var != null) {
            ValueAnimator valueAnimator = sk0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            sk0Var.B0 = 0.0f;
            m6 m6Var = sk0Var.S;
            if (m6Var != null) {
                m6Var.invalidate();
            }
            sk0Var.invalidate();
        }
        rc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof yn) {
                ((yn) n2Var).S9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        rc.e();
        this.q = true;
        t3 t3Var = this.c;
        AndroidUtilities.hideKeyboard(t3Var);
        t3Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof yn) {
                ((yn) n2Var).S9(true, true);
            }
        }
    }

    public final void f() {
        int i10 = 1;
        if (this.y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new u(this, i10));
    }

    public final void h(boolean z10) {
        int i10 = z10 ? 2 : 0;
        x xVar = this.m;
        xVar.h0.setLayerType(i10, null);
        xVar.f0.setLayerType(i10, null);
        if (!this.w) {
            xVar.e0.setLayerType(i10, null);
            xVar.d0.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(xVar.d0.b.getChildCount(), 16); i11++) {
                xVar.d0.b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            x xVar = this.m;
            z51 z51Var = xVar.h0;
            z51 z51Var2 = xVar.h0;
            if (i10 >= z51Var.getChildCount()) {
                return;
            }
            if (z51Var2.getChildAt(i10) instanceof l61) {
                l61 l61Var = (l61) z51Var2.getChildAt(i10);
                if (l61Var.x != null) {
                    l61Var.b = false;
                    l61Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f7, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        x xVar = this.m;
        float y3 = xVar.getY();
        w51 w51Var = xVar.a0;
        float y10 = w51Var.getY() + y3;
        z51 z51Var = xVar.h0;
        int y11 = (int) (z51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = z51Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = z51Var.getChildAt(i11);
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
            i11++;
        }
        int y12 = (int) (xVar.d0.getY() + w51Var.getY() + xVar.getY());
        for (int i12 = 0; i12 < xVar.d0.b.getChildCount(); i12++) {
            View childAt2 = xVar.d0.b.getChildAt(i12);
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
            xVar.k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(i10, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(tr.h);
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
        x xVar = this.m;
        xVar.f0.setAlpha(this.j);
        xVar.h0.setAlpha(this.j);
        xVar.i0.setAlpha(this.j);
        xVar.d0.setAlpha(this.j);
        xVar.e0.setAlpha(this.j);
    }

    public final void l() {
        x xVar = this.m;
        w51 w51Var = xVar.a0;
        w51 w51Var2 = xVar.a0;
        boolean z10 = this.w;
        a0 a0Var = this.a;
        w51Var.setTranslationX(z10 ? 0.0f : a0Var.f);
        w51Var2.setTranslationY(a0Var.h);
        w51Var2.setPivotX(a0Var.r);
        w51Var2.setPivotY(a0Var.s);
        w51Var2.setScaleX(a0Var.n);
        w51Var2.setScaleY(a0Var.n);
    }
}
