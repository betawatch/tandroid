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
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.zv;
import org.telegram.ui.a61;
import org.telegram.ui.e70;
import org.telegram.ui.i61;
import org.telegram.ui.m51;
import org.telegram.ui.t51;
import org.telegram.ui.w51;
import org.telegram.ui.xn;
import w7.x5;
import yh.u3;
import yh.w2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
    public final u3 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final y m;
    public final gk0 n;
    public final List o;
    public ac0 p;
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

    public c0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, gk0 gk0Var, d6 d6Var, boolean z10) {
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
        Context context = n2Var != null ? n2Var.getContext() : gk0Var.getContext();
        u3 u3Var = new u3(this, context);
        this.c = u3Var;
        u3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        b0 b0Var = new b0(this, context);
        this.a = b0Var;
        boolean z12 = z11;
        y yVar = new y(this, n2Var, context, gk0Var.getWindowType(), i10 != 1, d6Var, gk0Var, n2Var);
        this.m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z13 = gk0Var.f1;
        boolean z14 = gk0Var.g1;
        if (yVar.K1 != z13) {
            yVar.K1 = z13;
            yVar.L1 = z14;
            w51 w51Var = yVar.h0;
            if (w51Var != null) {
                w51Var.invalidate();
            }
            m51 m51Var = yVar.i0;
            if (m51Var != null) {
                m51Var.invalidate();
            }
        }
        yVar.setOnLongPressedListener(new v8.s(gk0Var));
        yVar.setOnRecentClearedListener(new t7.u());
        yVar.setRecentReactions(arrayList);
        yVar.setSelectedReactions((HashSet<p0>) hashSet);
        yVar.setDrawBackground(false);
        yVar.s(null);
        b0Var.addView(yVar, x5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            b0Var.setClipChildren(false);
            b0Var.setClipToPadding(false);
            u3Var.setClipChildren(false);
            u3Var.setClipToPadding(false);
        }
        float f7 = i12;
        u3Var.addView(b0Var, x5.d(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        u3Var.setClipChildren(false);
        if (i10 == 1 || (gk0Var.getDelegate() != null && gk0Var.getDelegate().q())) {
            yVar.setBackgroundDelegate(new tg.d(18, this, gk0Var));
        }
        if (z12) {
            ((ViewGroup) gk0Var.getParent()).addView(u3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, u3Var, b10);
            windowManager.addView(u3Var, b10);
        }
        this.n = gk0Var;
        gk0Var.setOnSwitchedToLoopView(new u(this, i11));
        gk0Var.b1 = true;
        gk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new v(i11, this, gk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        gk0 gk0Var = c0Var.n;
        y yVar = c0Var.m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            w51 w51Var = yVar.h0;
            if (z10) {
                yVar.d0.m(false);
                w51Var.invalidate();
                ArrayList arrayList = w51Var.a3;
                w51Var.f1();
                yVar.f0.b();
                yVar.sendAccessibilityEvent(32);
                gk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= w51Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (w51Var.getChildAt(i10) instanceof i61) {
                            view = w51Var.getChildAt(i10);
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
                if (gk0Var.getPullingLeftProgress() > 0.0f) {
                    gk0Var.O0 = false;
                    ValueAnimator valueAnimator = gk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    gk0Var.B0 = 0.0f;
                    m6 m6Var = gk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    gk0Var.invalidate();
                } else {
                    gk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = gk0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    gk0Var.B0 = 0.0f;
                    m6 m6Var2 = gk0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    gk0Var.invalidate();
                }
                m51 m51Var = yVar.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    a61 a61Var = (a61) arrayList.get(i11);
                    for (int i12 = 0; i12 < a61Var.O.size(); i12++) {
                        if (((i61) a61Var.O.get(i12)).b) {
                            ((i61) a61Var.O.get(i12)).b = false;
                            ((i61) a61Var.O.get(i12)).invalidate();
                            a61Var.k();
                        }
                    }
                }
                w51Var.invalidate();
                for (int i13 = 0; i13 < m51Var.a3.size(); i13++) {
                    a61 a61Var2 = (a61) m51Var.a3.get(i13);
                    for (int i14 = 0; i14 < a61Var2.O.size(); i14++) {
                        if (((i61) a61Var2.O.get(i14)).b) {
                            ((i61) a61Var2.O.get(i14)).b = false;
                            ((i61) a61Var2.O.get(i14)).invalidate();
                            a61Var2.k();
                        }
                    }
                }
                m51Var.invalidate();
                c0Var.i();
                c0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof i61) {
            ((i61) view).setAnimatedScale(f7);
        } else if (view instanceof zv) {
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
        u3 u3Var = this.c;
        int[] iArr = this.A;
        b0 b0Var = this.a;
        RectF rectF = this.f;
        gk0 gk0Var = this.n;
        rectF.set(gk0Var.w);
        this.e = gk0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            gk0Var.getLocationOnScreen(iArr);
        }
        u3Var.getLocationOnScreen(iArr2);
        float topOffset = gk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (yVar.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (gk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (b0Var.getMeasuredHeight() + topOffset > u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            b0Var.setTranslationX(((u3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
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
        gk0Var.setCustomEmojiEnterProgress(this.j);
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
            dw0 dw0Var = new dw0();
            dw0Var.a = 0;
            dw0Var.b = 0;
            dw0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = dw0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new e70(17, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(rr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(rr.f);
        }
        b0Var.invalidate();
        h(true);
        if (z10) {
            gk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            w2 w2Var = new w2(valueAnimator3, 9);
            f0.f = this.w;
            f0.e = true;
            f0.g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.c = w2Var;
        } else {
            gk0Var.O0 = true;
            gk0Var.invalidate();
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
        gk0 gk0Var = this.n;
        if (gk0Var != null) {
            ValueAnimator valueAnimator = gk0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            gk0Var.B0 = 0.0f;
            m6 m6Var = gk0Var.S;
            if (m6Var != null) {
                m6Var.invalidate();
            }
            gk0Var.invalidate();
        }
        qc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof xn) {
                ((xn) n2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        qc.e();
        this.q = true;
        u3 u3Var = this.c;
        AndroidUtilities.hideKeyboard(u3Var);
        u3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof xn) {
                ((xn) n2Var).T9(true, true);
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
            w51 w51Var = yVar.h0;
            w51 w51Var2 = yVar.h0;
            if (i10 >= w51Var.getChildCount()) {
                return;
            }
            if (w51Var2.getChildAt(i10) instanceof i61) {
                i61 i61Var = (i61) w51Var2.getChildAt(i10);
                if (i61Var.x != null) {
                    i61Var.b = false;
                    i61Var.invalidate();
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
        t51 t51Var = yVar.a0;
        float y10 = t51Var.getY() + y3;
        w51 w51Var = yVar.h0;
        int y11 = (int) (w51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = w51Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = w51Var.getChildAt(i11);
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
        int y12 = (int) (yVar.d0.getY() + t51Var.getY() + yVar.getY());
        for (int i12 = 0; i12 < yVar.d0.b.getChildCount(); i12++) {
            View childAt2 = yVar.d0.b.getChildAt(i12);
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
            ofFloat.addUpdateListener(new x(i10, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 13));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(rr.h);
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
        t51 t51Var = yVar.a0;
        t51 t51Var2 = yVar.a0;
        boolean z10 = this.w;
        b0 b0Var = this.a;
        t51Var.setTranslationX(z10 ? 0.0f : b0Var.f);
        t51Var2.setTranslationY(b0Var.h);
        t51Var2.setPivotX(b0Var.r);
        t51Var2.setPivotY(b0Var.s);
        t51Var2.setScaleX(b0Var.n);
        t51Var2.setScaleY(b0Var.n);
    }
}
