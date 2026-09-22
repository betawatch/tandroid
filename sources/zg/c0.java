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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yv;
import org.telegram.ui.b61;
import org.telegram.ui.bo;
import org.telegram.ui.e61;
import org.telegram.ui.h70;
import org.telegram.ui.i61;
import org.telegram.ui.q61;
import org.telegram.ui.u51;
import w7.x5;
import yh.v3;
import yh.x2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
    public final v3 c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final y m;
    public final fk0 n;
    public final List o;
    public bc0 p;
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

    public c0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, fk0 fk0Var, e6 e6Var, boolean z10) {
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
        Context context = n2Var != null ? n2Var.getContext() : fk0Var.getContext();
        v3 v3Var = new v3(this, context);
        this.c = v3Var;
        v3Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 28));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        b0 b0Var = new b0(this, context);
        this.a = b0Var;
        boolean z12 = z11;
        y yVar = new y(this, n2Var, context, fk0Var.getWindowType(), i10 != 1, e6Var, fk0Var, n2Var);
        this.m = yVar;
        yVar.setOutlineProvider(new z(this));
        yVar.setClipToOutline(true);
        boolean z13 = fk0Var.f1;
        boolean z14 = fk0Var.g1;
        if (yVar.K1 != z13) {
            yVar.K1 = z13;
            yVar.L1 = z14;
            e61 e61Var = yVar.h0;
            if (e61Var != null) {
                e61Var.invalidate();
            }
            u51 u51Var = yVar.i0;
            if (u51Var != null) {
                u51Var.invalidate();
            }
        }
        yVar.setOnLongPressedListener(new v8.s(fk0Var));
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
            v3Var.setClipChildren(false);
            v3Var.setClipToPadding(false);
        }
        float f7 = i12;
        v3Var.addView(b0Var, x5.d(-1, -1.0f, i10 == 5 ? 85 : 48, f7, f7, f7, 16.0f));
        v3Var.setClipChildren(false);
        if (i10 == 1 || (fk0Var.getDelegate() != null && fk0Var.getDelegate().q())) {
            yVar.setBackgroundDelegate(new tg.d(17, this, fk0Var));
        }
        if (z12) {
            ((ViewGroup) fk0Var.getParent()).addView(v3Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, v3Var, b10);
            windowManager.addView(v3Var, b10);
        }
        this.n = fk0Var;
        fk0Var.setOnSwitchedToLoopView(new u(this, i11));
        fk0Var.b1 = true;
        fk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new v(i11, this, fk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(c0 c0Var, boolean z10) {
        View view;
        fk0 fk0Var = c0Var.n;
        y yVar = c0Var.m;
        if (c0Var.E.isEmpty()) {
            c0Var.h(false);
            f0.a();
            c0Var.B.unlock();
            yVar.setEnterAnimationInProgress(false);
            e61 e61Var = yVar.h0;
            if (z10) {
                yVar.d0.m(false);
                e61Var.invalidate();
                ArrayList arrayList = e61Var.a3;
                e61Var.f1();
                yVar.f0.b();
                yVar.sendAccessibilityEvent(32);
                fk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= e61Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (e61Var.getChildAt(i10) instanceof q61) {
                            view = e61Var.getChildAt(i10);
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
                if (fk0Var.getPullingLeftProgress() > 0.0f) {
                    fk0Var.O0 = false;
                    ValueAnimator valueAnimator = fk0Var.y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fk0Var.B0 = 0.0f;
                    n6 n6Var = fk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    fk0Var.invalidate();
                } else {
                    fk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = fk0Var.y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    fk0Var.B0 = 0.0f;
                    n6 n6Var2 = fk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
                    }
                    fk0Var.invalidate();
                }
                u51 u51Var = yVar.i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i61 i61Var = (i61) arrayList.get(i11);
                    for (int i12 = 0; i12 < i61Var.O.size(); i12++) {
                        if (((q61) i61Var.O.get(i12)).b) {
                            ((q61) i61Var.O.get(i12)).b = false;
                            ((q61) i61Var.O.get(i12)).invalidate();
                            i61Var.k();
                        }
                    }
                }
                e61Var.invalidate();
                for (int i13 = 0; i13 < u51Var.a3.size(); i13++) {
                    i61 i61Var2 = (i61) u51Var.a3.get(i13);
                    for (int i14 = 0; i14 < i61Var2.O.size(); i14++) {
                        if (((q61) i61Var2.O.get(i14)).b) {
                            ((q61) i61Var2.O.get(i14)).b = false;
                            ((q61) i61Var2.O.get(i14)).invalidate();
                            i61Var2.k();
                        }
                    }
                }
                u51Var.invalidate();
                c0Var.i();
                c0Var.a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof q61) {
            ((q61) view).setAnimatedScale(f7);
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
        v3 v3Var = this.c;
        int[] iArr = this.A;
        b0 b0Var = this.a;
        RectF rectF = this.f;
        fk0 fk0Var = this.n;
        rectF.set(fk0Var.w);
        this.e = fk0Var.y;
        int[] iArr2 = new int[2];
        if (z10) {
            fk0Var.getLocationOnScreen(iArr);
        }
        v3Var.getLocationOnScreen(iArr2);
        float topOffset = fk0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (yVar.O0 ? AndroidUtilities.dp(26.0f) : 0));
        if (fk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (b0Var.getMeasuredHeight() + topOffset > v3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (v3Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - b0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            b0Var.setTranslationX(((v3Var.getMeasuredWidth() - b0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
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
        fk0Var.setCustomEmojiEnterProgress(this.j);
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
        this.x.addListener(new h70(17, this, z10));
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
            fk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            x2 x2Var = new x2(valueAnimator3, 9);
            f0.f = this.w;
            f0.e = true;
            f0.g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.c = x2Var;
        } else {
            fk0Var.O0 = true;
            fk0Var.invalidate();
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
        fk0 fk0Var = this.n;
        if (fk0Var != null) {
            ValueAnimator valueAnimator = fk0Var.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            fk0Var.B0 = 0.0f;
            n6 n6Var = fk0Var.S;
            if (n6Var != null) {
                n6Var.invalidate();
            }
            fk0Var.invalidate();
        }
        oc.e();
        this.q = true;
        AndroidUtilities.hideKeyboard(this.c);
        c(false);
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof bo) {
                ((bo) n2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        oc.e();
        this.q = true;
        v3 v3Var = this.c;
        AndroidUtilities.hideKeyboard(v3Var);
        v3Var.animate().alpha(0.0f).setDuration(150L).setListener(new a0(this, 1));
        if (this.v) {
            n2 n2Var = this.r;
            if (n2Var instanceof bo) {
                ((bo) n2Var).T9(true, true);
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
            e61 e61Var = yVar.h0;
            e61 e61Var2 = yVar.h0;
            if (i10 >= e61Var.getChildCount()) {
                return;
            }
            if (e61Var2.getChildAt(i10) instanceof q61) {
                q61 q61Var = (q61) e61Var2.getChildAt(i10);
                if (q61Var.x != null) {
                    q61Var.b = false;
                    q61Var.invalidate();
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
        b61 b61Var = yVar.a0;
        float y10 = b61Var.getY() + y3;
        e61 e61Var = yVar.h0;
        int y11 = (int) (e61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = e61Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = e61Var.getChildAt(i11);
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
        int y12 = (int) (yVar.d0.getY() + b61Var.getY() + yVar.getY());
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
        b61 b61Var = yVar.a0;
        b61 b61Var2 = yVar.a0;
        boolean z10 = this.w;
        b0 b0Var = this.a;
        b61Var.setTranslationX(z10 ? 0.0f : b0Var.f);
        b61Var2.setTranslationY(b0Var.h);
        b61Var2.setPivotX(b0Var.r);
        b61Var2.setPivotY(b0Var.s);
        b61Var2.setScaleX(b0Var.n);
        b61Var2.setScaleY(b0Var.n);
    }
}
