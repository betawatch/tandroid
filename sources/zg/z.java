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
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.b61;
import org.telegram.ui.g70;
import org.telegram.ui.j61;
import org.telegram.ui.n51;
import org.telegram.ui.u51;
import org.telegram.ui.x51;
import org.telegram.ui.yn;
import w7.z5;
import yh.o2;
import yh.s5;
import yh.u3;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class z {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final y a;
    public final WindowManager b;
    public final u3 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final v m;
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

    public z(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, sk0 sk0Var, d6 d6Var, boolean z10) {
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
        u3 u3Var = new u3(this, context);
        this.c = u3Var;
        int i12 = 28;
        u3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, i12));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        y yVar = new y(this, context);
        this.a = yVar;
        boolean z12 = z11;
        v vVar = new v(this, n2Var, context, sk0Var.getWindowType(), i10 != 1, d6Var, sk0Var, n2Var);
        this.m = vVar;
        vVar.setOutlineProvider(new w(this));
        vVar.setClipToOutline(true);
        boolean z13 = sk0Var.f1;
        boolean z14 = sk0Var.g1;
        if (vVar.K1 != z13) {
            vVar.K1 = z13;
            vVar.L1 = z14;
            x51 x51Var = vVar.h0;
            if (x51Var != null) {
                x51Var.invalidate();
            }
            n51 n51Var = vVar.i0;
            if (n51Var != null) {
                n51Var.invalidate();
            }
        }
        vVar.setOnLongPressedListener(new k2.e(sk0Var, i12));
        vVar.setOnRecentClearedListener(new t7.u());
        vVar.setRecentReactions(arrayList);
        vVar.setSelectedReactions((HashSet<m0>) hashSet);
        vVar.setDrawBackground(false);
        vVar.s(null);
        yVar.addView(vVar, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i13 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            yVar.setClipChildren(false);
            yVar.setClipToPadding(false);
            u3Var.setClipChildren(false);
            u3Var.setClipToPadding(false);
        }
        float f7 = i13;
        u3Var.addView(yVar, z5.d(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        u3Var.setClipChildren(false);
        if (i10 == 1 || (sk0Var.getDelegate() != null && sk0Var.getDelegate().K())) {
            vVar.setBackgroundDelegate(new rg.x(20, this, sk0Var));
        }
        if (z12) {
            ((ViewGroup) sk0Var.getParent()).addView(u3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, u3Var, b10);
            windowManager.addView(u3Var, b10);
        }
        this.n = sk0Var;
        sk0Var.setOnSwitchedToLoopView(new s(this, i11));
        sk0Var.b1 = true;
        sk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new s5(6, this, sk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(z zVar, boolean z10) {
        View view;
        sk0 sk0Var = zVar.n;
        v vVar = zVar.m;
        if (zVar.E.isEmpty()) {
            zVar.h(false);
            c0.a();
            zVar.B.unlock();
            vVar.setEnterAnimationInProgress(false);
            x51 x51Var = vVar.h0;
            if (z10) {
                vVar.d0.m(false);
                x51Var.invalidate();
                ArrayList arrayList = x51Var.h3;
                x51Var.g1();
                vVar.f0.b();
                vVar.sendAccessibilityEvent(32);
                sk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= x51Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (x51Var.getChildAt(i10) instanceof j61) {
                            view = x51Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    vVar.performAccessibilityAction(64, null);
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
                n51 n51Var = vVar.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b61 b61Var = (b61) arrayList.get(i11);
                    for (int i12 = 0; i12 < b61Var.O.size(); i12++) {
                        if (((j61) b61Var.O.get(i12)).b) {
                            ((j61) b61Var.O.get(i12)).b = false;
                            ((j61) b61Var.O.get(i12)).invalidate();
                            b61Var.k();
                        }
                    }
                }
                x51Var.invalidate();
                for (int i13 = 0; i13 < n51Var.h3.size(); i13++) {
                    b61 b61Var2 = (b61) n51Var.h3.get(i13);
                    for (int i14 = 0; i14 < b61Var2.O.size(); i14++) {
                        if (((j61) b61Var2.O.get(i14)).b) {
                            ((j61) b61Var2.O.get(i14)).b = false;
                            ((j61) b61Var2.O.get(i14)).invalidate();
                            b61Var2.k();
                        }
                    }
                }
                n51Var.invalidate();
                zVar.i();
                zVar.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof j61) {
            ((j61) view).setAnimatedScale(f7);
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
        v vVar = this.m;
        int i10 = this.y;
        u3 u3Var = this.c;
        int[] iArr = this.A;
        y yVar = this.a;
        RectF rectF = this.f;
        sk0 sk0Var = this.n;
        rectF.set(sk0Var.w);
        this.e = sk0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            sk0Var.getLocationOnScreen(iArr);
        }
        u3Var.getLocationOnScreen(iArr2);
        float topOffset = sk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (vVar.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (sk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (yVar.getMeasuredHeight() + topOffset > u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (u3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - yVar.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            yVar.setTranslationX(((u3Var.getMeasuredWidth() - yVar.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i10 == 2 || i10 == 4) {
                yVar.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            } else {
                yVar.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            }
        }
        if (z10) {
            this.t = topOffset;
            yVar.setTranslationY(topOffset);
        } else {
            this.t = yVar.getTranslationY();
        }
        float x10 = (iArr[0] - iArr2[0]) - yVar.getX();
        this.g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - yVar.getY();
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
        vVar.setEnterAnimationInProgress(z11);
        vVar.d0.m(z10 && this.w);
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
            ax0 ax0Var = new ax0();
            ax0Var.a = 0;
            ax0Var.b = 0;
            ax0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = ax0Var;
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
        yVar.invalidate();
        h(true);
        if (z10) {
            sk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            o2 o2Var = new o2(valueAnimator3, 11);
            c0.f = this.w;
            c0.e = true;
            c0.g = false;
            if (c0.d) {
                c0.d = false;
            }
            c0.c = o2Var;
        } else {
            sk0Var.O0 = true;
            sk0Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = c0.a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.b == null) {
            z12 = true;
            cacheOutQueue.b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        c0.b = z12;
        c0.e = false;
        c0.g = false;
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
        u3 u3Var = this.c;
        AndroidUtilities.hideKeyboard(u3Var);
        u3Var.animate().alpha(0.0f).setDuration(150L).setListener(new x(this, 1));
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
        AndroidUtilities.runOnUIThread(new s(this, i10));
    }

    public final void h(boolean z10) {
        int i10 = z10 ? 2 : 0;
        v vVar = this.m;
        vVar.h0.setLayerType(i10, null);
        vVar.f0.setLayerType(i10, null);
        if (!this.w) {
            vVar.e0.setLayerType(i10, null);
            vVar.d0.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(vVar.d0.b.getChildCount(), 16); i11++) {
                vVar.d0.b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            v vVar = this.m;
            x51 x51Var = vVar.h0;
            x51 x51Var2 = vVar.h0;
            if (i10 >= x51Var.getChildCount()) {
                return;
            }
            if (x51Var2.getChildAt(i10) instanceof j61) {
                j61 j61Var = (j61) x51Var2.getChildAt(i10);
                if (j61Var.x != null) {
                    j61Var.b = false;
                    j61Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f7, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        v vVar = this.m;
        float y3 = vVar.getY();
        u51 u51Var = vVar.a0;
        float y10 = u51Var.getY() + y3;
        x51 x51Var = vVar.h0;
        int y11 = (int) (x51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = x51Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = x51Var.getChildAt(i11);
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
        int y12 = (int) (vVar.d0.getY() + u51Var.getY() + vVar.getY());
        for (int i12 = 0; i12 < vVar.d0.b.getChildCount(); i12++) {
            View childAt2 = vVar.d0.b.getChildAt(i12);
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
            vVar.k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new u(i10, this, arrayList));
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
        v vVar = this.m;
        vVar.f0.setAlpha(this.j);
        vVar.h0.setAlpha(this.j);
        vVar.i0.setAlpha(this.j);
        vVar.d0.setAlpha(this.j);
        vVar.e0.setAlpha(this.j);
    }

    public final void l() {
        v vVar = this.m;
        u51 u51Var = vVar.a0;
        u51 u51Var2 = vVar.a0;
        boolean z10 = this.w;
        y yVar = this.a;
        u51Var.setTranslationX(z10 ? 0.0f : yVar.f);
        u51Var2.setTranslationY(yVar.h);
        u51Var2.setPivotX(yVar.r);
        u51Var2.setPivotY(yVar.s);
        u51Var2.setScaleX(yVar.n);
        u51Var2.setScaleY(yVar.n);
    }
}
