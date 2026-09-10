package yg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import bi.m7;
import bi.n7;
import gg.t1;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.f61;
import org.telegram.ui.i61;
import org.telegram.ui.iw0;
import org.telegram.ui.m61;
import org.telegram.ui.u61;
import org.telegram.ui.y51;
import w7.a6;
import xh.t3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final b0 a;
    public final WindowManager b;
    public final t3 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final y m;
    public final pk0 n;
    public final List o;
    public kc0 p;
    public boolean q;
    public final p2 r;
    public final f6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public bh.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public c0(int i10, p2 p2Var, ArrayList arrayList, HashSet hashSet, pk0 pk0Var, f6 f6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i11 = 0;
        this.F = 0;
        this.y = i10;
        this.o = arrayList;
        this.r = p2Var;
        this.s = f6Var;
        Context context = p2Var != null ? p2Var.getContext() : pk0Var.getContext();
        t3 t3Var = new t3(this, context);
        this.c = t3Var;
        t3Var.setOnClickListener(new org.telegram.ui.web.c(this, 23));
        int i12 = 1;
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        b0 b0Var = new b0(this, context);
        this.a = b0Var;
        boolean z12 = z11;
        y yVar = new y(this, p2Var, context, pk0Var.getWindowType(), i10 != 1, f6Var, pk0Var, p2Var);
        this.m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z13 = pk0Var.f1;
        boolean z14 = pk0Var.g1;
        if (yVar.K1 != z13) {
            yVar.K1 = z13;
            yVar.L1 = z14;
            i61 i61Var = yVar.h0;
            if (i61Var != null) {
                i61Var.invalidate();
            }
            y51 y51Var = yVar.i0;
            if (y51Var != null) {
                y51Var.invalidate();
            }
        }
        yVar.setOnLongPressedListener(new l2.g(pk0Var, 25));
        yVar.setOnRecentClearedListener(new t7.u());
        yVar.setRecentReactions(arrayList);
        yVar.setSelectedReactions((HashSet<p0>) hashSet);
        yVar.setDrawBackground(false);
        yVar.s(null);
        b0Var.addView(yVar, a6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i13 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            b0Var.setClipChildren(false);
            b0Var.setClipToPadding(false);
            t3Var.setClipChildren(false);
            t3Var.setClipToPadding(false);
        }
        float f7 = i13;
        t3Var.addView(b0Var, a6.d(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        t3Var.setClipChildren(false);
        if (i10 == 1 || (pk0Var.getDelegate() != null && pk0Var.getDelegate().t())) {
            yVar.setBackgroundDelegate(new sg.f0(13, this, pk0Var));
        }
        if (z12) {
            ((ViewGroup) pk0Var.getParent()).addView(t3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, t3Var, b10);
            windowManager.addView(t3Var, b10);
        }
        this.n = pk0Var;
        pk0Var.setOnSwitchedToLoopView(new w(this, i11));
        pk0Var.b1 = true;
        pk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new q(i12, this, pk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        pk0 pk0Var = c0Var.n;
        y yVar = c0Var.m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            i61 i61Var = yVar.h0;
            if (z10) {
                yVar.d0.m(false);
                i61Var.invalidate();
                ArrayList arrayList = i61Var.a3;
                i61Var.e1();
                yVar.f0.b();
                yVar.sendAccessibilityEvent(32);
                pk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= i61Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (i61Var.getChildAt(i10) instanceof u61) {
                            view = i61Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    yVar.performAccessibilityAction(64, null);
                }
                if (pk0Var.getPullingLeftProgress() > 0.0f) {
                    pk0Var.O0 = false;
                    ValueAnimator valueAnimator = pk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pk0Var.B0 = 0.0f;
                    n7 n7Var = pk0Var.S;
                    if (n7Var != null) {
                        n7Var.invalidate();
                    }
                    pk0Var.invalidate();
                } else {
                    pk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = pk0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    pk0Var.B0 = 0.0f;
                    n7 n7Var2 = pk0Var.S;
                    if (n7Var2 != null) {
                        n7Var2.invalidate();
                    }
                    pk0Var.invalidate();
                }
                y51 y51Var = yVar.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    m61 m61Var = (m61) arrayList.get(i11);
                    for (int i12 = 0; i12 < m61Var.O.size(); i12++) {
                        if (((u61) m61Var.O.get(i12)).b) {
                            ((u61) m61Var.O.get(i12)).b = false;
                            ((u61) m61Var.O.get(i12)).invalidate();
                            m61Var.k();
                        }
                    }
                }
                i61Var.invalidate();
                for (int i13 = 0; i13 < y51Var.a3.size(); i13++) {
                    m61 m61Var2 = (m61) y51Var.a3.get(i13);
                    for (int i14 = 0; i14 < m61Var2.O.size(); i14++) {
                        if (((u61) m61Var2.O.get(i14)).b) {
                            ((u61) m61Var2.O.get(i14)).b = false;
                            ((u61) m61Var2.O.get(i14)).invalidate();
                            m61Var2.k();
                        }
                    }
                }
                y51Var.invalidate();
                c0Var.i();
                c0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof u61) {
            ((u61) view).setAnimatedScale(f7);
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
        y yVar = this.m;
        int i10 = this.y;
        t3 t3Var = this.c;
        int[] iArr = this.A;
        b0 b0Var = this.a;
        RectF rectF = this.f;
        pk0 pk0Var = this.n;
        rectF.set(pk0Var.w);
        this.e = pk0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            pk0Var.getLocationOnScreen(iArr);
        }
        t3Var.getLocationOnScreen(iArr2);
        float topOffset = pk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (yVar.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (pk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (b0Var.getMeasuredHeight() + topOffset > t3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (t3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            b0Var.setTranslationX(((t3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i10 == 2 || i10 == 4) {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            } else {
                b0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            }
        }
        if (z10) {
            this.t = topOffset;
            b0Var.setTranslationY(topOffset);
        } else {
            this.t = b0Var.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - b0Var.getX();
        this.g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - b0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        pk0Var.setCustomEmojiEnterProgress(this.j);
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
        yVar.setEnterAnimationInProgress(z11);
        yVar.d0.m(z10 && this.w);
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
            ow0 ow0Var = new ow0();
            ow0Var.a = 0;
            ow0Var.b = 0;
            ow0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = ow0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new m7(11, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new iw0(13, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(wr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(wr.f);
        }
        b0Var.invalidate();
        h(true);
        if (z10) {
            pk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            xh.x xVar = new xh.x(valueAnimator3, 16);
            f0.f = this.w;
            f0.e = true;
            f0.g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.c = xVar;
        } else {
            pk0Var.O0 = true;
            pk0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = f0.a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z12 = true;
            cacheOutQueue.b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        f0.b = z12;
        f0.e = false;
        f0.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        pk0 pk0Var = this.n;
        if (pk0Var != null) {
            ValueAnimator valueAnimator = pk0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            pk0Var.B0 = 0.0f;
            n7 n7Var = pk0Var.S;
            if (n7Var != null) {
                n7Var.invalidate();
            }
            pk0Var.invalidate();
        }
        pc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            p2 p2Var = this.r;
            if (p2Var instanceof eo) {
                ((eo) p2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        pc.e();
        this.q = true;
        t3 t3Var = this.c;
        AndroidUtilities.hideKeyboard(t3Var);
        t3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
        if (this.v) {
            p2 p2Var = this.r;
            if (p2Var instanceof eo) {
                ((eo) p2Var).T9(true, true);
            }
        }
    }

    public final void f() {
        int i10 = 1;
        if (this.y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new w(this, i10));
    }

    public final void h(boolean z10) {
        int i10 = z10 ? 2 : 0;
        y yVar = this.m;
        yVar.h0.setLayerType(i10, null);
        yVar.f0.setLayerType(i10, null);
        if (!this.w) {
            yVar.e0.setLayerType(i10, null);
            yVar.d0.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(yVar.d0.b.getChildCount(), 16); i11++) {
                yVar.d0.b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            y yVar = this.m;
            i61 i61Var = yVar.h0;
            i61 i61Var2 = yVar.h0;
            if (i10 >= i61Var.getChildCount()) {
                return;
            }
            if (i61Var2.getChildAt(i10) instanceof u61) {
                u61 u61Var = (u61) i61Var2.getChildAt(i10);
                if (u61Var.x != null) {
                    u61Var.b = false;
                    u61Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f7, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        y yVar = this.m;
        float y3 = yVar.getY();
        f61 f61Var = yVar.a0;
        float y10 = f61Var.getY() + y3;
        i61 i61Var = yVar.h0;
        int y11 = (int) (i61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = i61Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = i61Var.getChildAt(i10);
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
        int y12 = (int) (yVar.d0.getY() + f61Var.getY() + yVar.getY());
        for (int i11 = 0; i11 < yVar.d0.b.getChildCount(); i11++) {
            View childAt2 = yVar.d0.b.getChildAt(i11);
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
            yVar.k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new t1(28, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(wr.h);
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
        y yVar = this.m;
        yVar.f0.setAlpha(this.j);
        yVar.h0.setAlpha(this.j);
        yVar.i0.setAlpha(this.j);
        yVar.d0.setAlpha(this.j);
        yVar.e0.setAlpha(this.j);
    }

    public final void l() {
        y yVar = this.m;
        f61 f61Var = yVar.a0;
        f61 f61Var2 = yVar.a0;
        boolean z10 = this.w;
        b0 b0Var = this.a;
        f61Var.setTranslationX(z10 ? 0.0f : b0Var.f);
        f61Var2.setTranslationY(b0Var.h);
        f61Var2.setPivotX(b0Var.r);
        f61Var2.setPivotY(b0Var.s);
        f61Var2.setScaleX(b0Var.n);
        f61Var2.setScaleY(b0Var.n);
    }
}
