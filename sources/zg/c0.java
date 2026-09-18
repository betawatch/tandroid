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
import ci.n6;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yv;
import org.telegram.ui.bo;
import org.telegram.ui.c61;
import org.telegram.ui.f61;
import org.telegram.ui.j61;
import org.telegram.ui.j70;
import org.telegram.ui.r61;
import org.telegram.ui.v51;
import w7.x5;
import yh.w3;
import yh.y2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
    public final w3 c;
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
    public bc0 p;
    public boolean q;
    public final o2 r;
    public final f6 s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final int y;
    public ch.d z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();

    public c0(int i10, o2 o2Var, ArrayList arrayList, HashSet hashSet, gk0 gk0Var, f6 f6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i11 = 0;
        this.F = 0;
        this.y = i10;
        this.o = arrayList;
        this.r = o2Var;
        this.s = f6Var;
        Context context = o2Var != null ? o2Var.getContext() : gk0Var.getContext();
        w3 w3Var = new w3(this, context);
        this.c = w3Var;
        w3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        b0 b0Var = new b0(this, context);
        this.a = b0Var;
        boolean z12 = z11;
        y yVar = new y(this, o2Var, context, gk0Var.getWindowType(), i10 != 1, f6Var, gk0Var, o2Var);
        this.m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z13 = gk0Var.f1;
        boolean z14 = gk0Var.g1;
        if (yVar.K1 != z13) {
            yVar.K1 = z13;
            yVar.L1 = z14;
            f61 f61Var = yVar.h0;
            if (f61Var != null) {
                f61Var.invalidate();
            }
            v51 v51Var = yVar.i0;
            if (v51Var != null) {
                v51Var.invalidate();
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
            w3Var.setClipChildren(false);
            w3Var.setClipToPadding(false);
        }
        float f7 = i12;
        w3Var.addView(b0Var, x5.d(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        w3Var.setClipChildren(false);
        if (i10 == 1 || (gk0Var.getDelegate() != null && gk0Var.getDelegate().q())) {
            yVar.setBackgroundDelegate(new tg.d(17, this, gk0Var));
        }
        if (z12) {
            ((ViewGroup) gk0Var.getParent()).addView(w3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, w3Var, b10);
            windowManager.addView(w3Var, b10);
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
            f61 f61Var = yVar.h0;
            if (z10) {
                yVar.d0.m(false);
                f61Var.invalidate();
                ArrayList arrayList = f61Var.a3;
                f61Var.g1();
                yVar.f0.b();
                yVar.sendAccessibilityEvent(32);
                gk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= f61Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (f61Var.getChildAt(i10) instanceof r61) {
                            view = f61Var.getChildAt(i10);
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
                    n6 n6Var = gk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    gk0Var.invalidate();
                } else {
                    gk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = gk0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    gk0Var.B0 = 0.0f;
                    n6 n6Var2 = gk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                    }
                    gk0Var.invalidate();
                }
                v51 v51Var = yVar.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j61 j61Var = (j61) arrayList.get(i11);
                    for (int i12 = 0; i12 < j61Var.O.size(); i12++) {
                        if (((r61) j61Var.O.get(i12)).b) {
                            ((r61) j61Var.O.get(i12)).b = false;
                            ((r61) j61Var.O.get(i12)).invalidate();
                            j61Var.k();
                        }
                    }
                }
                f61Var.invalidate();
                for (int i13 = 0; i13 < v51Var.a3.size(); i13++) {
                    j61 j61Var2 = (j61) v51Var.a3.get(i13);
                    for (int i14 = 0; i14 < j61Var2.O.size(); i14++) {
                        if (((r61) j61Var2.O.get(i14)).b) {
                            ((r61) j61Var2.O.get(i14)).b = false;
                            ((r61) j61Var2.O.get(i14)).invalidate();
                            j61Var2.k();
                        }
                    }
                }
                v51Var.invalidate();
                c0Var.i();
                c0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof r61) {
            ((r61) view).setAnimatedScale(f7);
        } else if (view instanceof yv) {
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
        w3 w3Var = this.c;
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
        w3Var.getLocationOnScreen(iArr2);
        float topOffset = gk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (yVar.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (gk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (b0Var.getMeasuredHeight() + topOffset > w3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (w3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            b0Var.setTranslationX(((w3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
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
            ew0 ew0Var = new ew0();
            ew0Var.a = 0;
            ew0Var.b = 0;
            ew0Var.setFloatValues(new float[]{f7, f10});
            valueAnimator = ew0Var;
        }
        this.x = valueAnimator;
        valueAnimator.addUpdateListener(new bb(12, this, z10));
        if (!z10) {
            i();
        }
        this.x.addListener(new j70(17, this, z10));
        if (i10 == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(qr.h);
        } else if (this.w) {
            this.x.setDuration(450L);
            this.x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.x.setDuration(350L);
            this.x.setInterpolator(qr.f);
        }
        b0Var.invalidate();
        h(true);
        if (z10) {
            gk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            y2 y2Var = new y2(valueAnimator3, 9);
            f0.f = this.w;
            f0.e = true;
            f0.g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.c = y2Var;
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
            n6 n6Var = gk0Var.S;
            if (n6Var != null) {
                n6Var.invalidate();
            }
            gk0Var.invalidate();
        }
        oc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            o2 o2Var = this.r;
            if (o2Var instanceof bo) {
                ((bo) o2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        oc.e();
        this.q = true;
        w3 w3Var = this.c;
        AndroidUtilities.hideKeyboard(w3Var);
        w3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
        if (this.v) {
            o2 o2Var = this.r;
            if (o2Var instanceof bo) {
                ((bo) o2Var).T9(true, true);
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
            f61 f61Var = yVar.h0;
            f61 f61Var2 = yVar.h0;
            if (i10 >= f61Var.getChildCount()) {
                return;
            }
            if (f61Var2.getChildAt(i10) instanceof r61) {
                r61 r61Var = (r61) f61Var2.getChildAt(i10);
                if (r61Var.x != null) {
                    r61Var.b = false;
                    r61Var.invalidate();
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
        c61 c61Var = yVar.a0;
        float y10 = c61Var.getY() + y3;
        f61 f61Var = yVar.h0;
        int y11 = (int) (f61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = f61Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = f61Var.getChildAt(i11);
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
        int y12 = (int) (yVar.d0.getY() + c61Var.getY() + yVar.getY());
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
                ofFloat.setInterpolator(qr.h);
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
        c61 c61Var = yVar.a0;
        c61 c61Var2 = yVar.a0;
        boolean z10 = this.w;
        b0 b0Var = this.a;
        c61Var.setTranslationX(z10 ? 0.0f : b0Var.f);
        c61Var2.setTranslationY(b0Var.h);
        c61Var2.setPivotX(b0Var.r);
        c61Var2.setPivotY(b0Var.s);
        c61Var2.setScaleX(b0Var.n);
        c61Var2.setScaleY(b0Var.n);
    }
}
