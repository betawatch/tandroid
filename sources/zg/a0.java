package zg;

import ai.cb;
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
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ow;
import org.telegram.ui.Components.tc;
import org.telegram.ui.e61;
import org.telegram.ui.f70;
import org.telegram.ui.h61;
import org.telegram.ui.l61;
import org.telegram.ui.t61;
import org.telegram.ui.x51;
import org.telegram.ui.zn;
import qg.x1;
import w7.x5;
import yh.i8;
import yh.t5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final z a;
    public final WindowManager b;
    public final xh.m c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final w m;
    public final kl0 n;
    public final List o;
    public bd0 p;
    public boolean q;
    public final n2 r;
    public final e6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public ch.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public a0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, kl0 kl0Var, e6 e6Var, boolean z10) {
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
        this.s = e6Var;
        Context context = n2Var != null ? n2Var.getContext() : kl0Var.getContext();
        xh.m mVar = new xh.m(this, context);
        this.c = mVar;
        mVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        int i12 = 5;
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        z zVar = new z(this, context);
        this.a = zVar;
        boolean z12 = z11;
        w wVar = new w(this, n2Var, context, kl0Var.getWindowType(), i10 != 1, e6Var, kl0Var, n2Var);
        this.m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z13 = kl0Var.f1;
        boolean z14 = kl0Var.g1;
        if (wVar.K1 != z13) {
            wVar.K1 = z13;
            wVar.L1 = z14;
            h61 h61Var = wVar.h0;
            if (h61Var != null) {
                h61Var.invalidate();
            }
            x51 x51Var = wVar.i0;
            if (x51Var != null) {
                x51Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new w3.b(kl0Var));
        wVar.setOnRecentClearedListener(new na.d(29));
        wVar.setRecentReactions(arrayList);
        wVar.setSelectedReactions((HashSet<n0>) hashSet);
        wVar.setDrawBackground(false);
        wVar.s(null);
        zVar.addView(wVar, x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        int i13 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            zVar.setClipChildren(false);
            zVar.setClipToPadding(false);
            mVar.setClipChildren(false);
            mVar.setClipToPadding(false);
        }
        float f7 = i13;
        mVar.addView(zVar, x5.a(-1.0f, f7, f7, f7, 16.0f, -1, i10 == 5 ? 85 : 48));
        mVar.setClipChildren(false);
        if (i10 == 1 || (kl0Var.getDelegate() != null && kl0Var.getDelegate().v())) {
            wVar.setBackgroundDelegate(new x1(23, this, kl0Var));
        }
        if (z12) {
            ((ViewGroup) kl0Var.getParent()).addView(mVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, mVar, b10);
            windowManager.addView(mVar, b10);
        }
        this.n = kl0Var;
        kl0Var.setOnSwitchedToLoopView(new u(this, i11));
        kl0Var.b1 = true;
        kl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new t5(i12, this, kl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(a0 a0Var, boolean z10) {
        View view;
        kl0 kl0Var = a0Var.n;
        w wVar = a0Var.m;
        if (a0Var.E.isEmpty()) {
            a0Var.h(false);
            d0.a();
            a0Var.B.unlock();
            wVar.setEnterAnimationInProgress(false);
            h61 h61Var = wVar.h0;
            if (z10) {
                wVar.d0.m(false);
                h61Var.invalidate();
                ArrayList arrayList = h61Var.Y2;
                h61Var.f1();
                wVar.f0.b();
                wVar.sendAccessibilityEvent(32);
                kl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= h61Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (h61Var.getChildAt(i10) instanceof t61) {
                            view = h61Var.getChildAt(i10);
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
                if (kl0Var.getPullingLeftProgress() > 0.0f) {
                    kl0Var.O0 = false;
                    ValueAnimator valueAnimator = kl0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    kl0Var.B0 = 0.0f;
                    m6 m6Var = kl0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    kl0Var.invalidate();
                } else {
                    kl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = kl0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    kl0Var.B0 = 0.0f;
                    m6 m6Var2 = kl0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    kl0Var.invalidate();
                }
                x51 x51Var = wVar.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    l61 l61Var = (l61) arrayList.get(i11);
                    for (int i12 = 0; i12 < l61Var.O.size(); i12++) {
                        if (((t61) l61Var.O.get(i12)).b) {
                            ((t61) l61Var.O.get(i12)).b = false;
                            ((t61) l61Var.O.get(i12)).invalidate();
                            l61Var.k();
                        }
                    }
                }
                h61Var.invalidate();
                for (int i13 = 0; i13 < x51Var.Y2.size(); i13++) {
                    l61 l61Var2 = (l61) x51Var.Y2.get(i13);
                    for (int i14 = 0; i14 < l61Var2.O.size(); i14++) {
                        if (((t61) l61Var2.O.get(i14)).b) {
                            ((t61) l61Var2.O.get(i14)).b = false;
                            ((t61) l61Var2.O.get(i14)).invalidate();
                            l61Var2.k();
                        }
                    }
                }
                x51Var.invalidate();
                a0Var.i();
                a0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof t61) {
            ((t61) view).setAnimatedScale(f7);
        } else if (view instanceof ow) {
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
        xh.m mVar = this.c;
        int[] iArr = this.A;
        z zVar = this.a;
        RectF rectF = this.f;
        kl0 kl0Var = this.n;
        rectF.set(kl0Var.w);
        this.e = kl0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            kl0Var.getLocationOnScreen(iArr);
        }
        mVar.getLocationOnScreen(iArr2);
        float topOffset = kl0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (wVar.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (kl0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (zVar.getMeasuredHeight() + topOffset > mVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (mVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - zVar.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            r18 = 1;
            zVar.setTranslationX(((mVar.getMeasuredWidth() - zVar.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            boolean z13 = true;
            if (i10 == 2 || i10 == 4) {
                zVar.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
                r18 = z13;
            } else {
                zVar.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
                r18 = z13;
            }
        }
        if (z10) {
            this.t = topOffset;
            zVar.setTranslationY(topOffset);
        } else {
            this.t = zVar.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - zVar.getX();
        this.g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - zVar.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        kl0Var.setCustomEmojiEnterProgress(this.j);
        if (z10) {
            this.w = (SharedConfig.getDevicePerformanceClass() < 2 || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) ? false : r18;
            this.k = false;
        } else {
            this.w = false;
        }
        if (this.w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z11);
        wVar.d0.m(z10 && this.w);
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
            gx0 gx0Var = new gx0();
            gx0Var.a = 0;
            gx0Var.b = 0;
            gx0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = gx0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new cb(12, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new f70(17, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(hs.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            bi.l(0.5f, this.x);
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(hs.f);
        }
        zVar.invalidate();
        h(true);
        if (z10) {
            kl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            yh.f0 f0Var = new yh.f0(valueAnimator3, 14);
            d0.f = this.w;
            d0.e = true;
            d0.g = false;
            if (d0.d) {
                d0.d = false;
            }
            d0.c = f0Var;
        } else {
            kl0Var.O0 = true;
            kl0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = d0.a;
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z12 = true;
            cacheOutQueue.b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        d0.b = z12;
        d0.e = false;
        d0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        kl0 kl0Var = this.n;
        if (kl0Var != null) {
            ValueAnimator valueAnimator = kl0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            kl0Var.B0 = 0.0f;
            m6 m6Var = kl0Var.S;
            if (m6Var != null) {
                m6Var.invalidate();
            }
            kl0Var.invalidate();
        }
        tc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof zn) {
                ((zn) n2Var).Y9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        tc.e();
        this.q = true;
        xh.m mVar = this.c;
        AndroidUtilities.hideKeyboard(mVar);
        mVar.animate().alpha(0.0f).setDuration(150L).setListener(new y(this, 1));
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof zn) {
                ((zn) n2Var).Y9(true, true);
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
            h61 h61Var = wVar.h0;
            h61 h61Var2 = wVar.h0;
            if (i10 >= h61Var.getChildCount()) {
                return;
            }
            if (h61Var2.getChildAt(i10) instanceof t61) {
                t61 t61Var = (t61) h61Var2.getChildAt(i10);
                if (t61Var.x != null) {
                    t61Var.b = false;
                    t61Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f7, boolean z10) {
        RectF rectF;
        int i10;
        HashSet hashSet;
        w wVar = this.m;
        float y3 = wVar.getY();
        e61 e61Var = wVar.a0;
        float y10 = e61Var.getY() + y3;
        h61 h61Var = wVar.h0;
        int y11 = (int) (h61Var.getY() + y10);
        ArrayList arrayList = null;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = h61Var.getChildCount();
            rectF = this.i;
            i10 = 1;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = h61Var.getChildAt(i11);
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
        int y12 = (int) (wVar.d0.getY() + e61Var.getY() + wVar.getY());
        for (int i12 = 0; i12 < wVar.d0.b.getChildCount(); i12++) {
            View childAt2 = wVar.d0.b.getChildAt(i12);
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
            ofFloat.addUpdateListener(new i8(i10, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(hs.h);
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
        e61 e61Var = wVar.a0;
        e61 e61Var2 = wVar.a0;
        boolean z10 = this.w;
        z zVar = this.a;
        e61Var.setTranslationX(z10 ? 0.0f : zVar.f);
        e61Var2.setTranslationY(zVar.h);
        e61Var2.setPivotX(zVar.r);
        e61Var2.setPivotY(zVar.s);
        e61Var2.setScaleX(zVar.n);
        e61Var2.setScaleY(zVar.n);
    }
}
