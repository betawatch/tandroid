// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x53 {
    public boolean C;
    public final w53 a;
    public final WindowManager b;
    public final su c;
    public final boolean d;
    public float e;
    public float g;
    public float h;
    public float j;
    public boolean k;
    public boolean l;
    public final t53 m;
    public final v29 n;
    public final ArrayList o;
    public pp8 p;
    public boolean q;
    public final d r;
    public final ylb s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public final byte y;
    public im0 z;
    public final RectF f = new RectF();
    public final RectF i = new RectF();
    public final int[] A = new int[2];
    public final po B = new po(null);
    public final HashSet D = new HashSet();
    public final ArrayList E = new ArrayList();
    public int F = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public x53(int i, d dVar, ArrayList arrayList, HashSet hashSet, v29 v29Var, ylb ylbVar, boolean z) {
        byte b = 0;
        this.y = i;
        this.o = arrayList;
        this.r = dVar;
        this.s = ylbVar;
        Context context = dVar != null ? dVar.getContext() : v29Var.getContext();
        su suVar = new su(this, context);
        this.c = suVar;
        suVar.setOnClickListener(new k81(this, (byte) 25));
        boolean z2 = i == 2 || i == 4 || i == 5 || z;
        this.d = z2;
        w53 w53Var = new w53(this, context);
        this.a = w53Var;
        boolean z3 = z2;
        t53 t53Var = new t53(this, dVar, context, v29Var.getWindowType(), i != 1, ylbVar, v29Var, dVar);
        this.m = t53Var;
        t53Var.setOutlineProvider(new u53(this));
        t53Var.setClipToOutline(true);
        boolean z4 = v29Var.h1;
        boolean z5 = v29Var.i1;
        if (t53Var.M1 != z4) {
            t53Var.M1 = z4;
            t53Var.N1 = z5;
            ty9 ty9Var = t53Var.i0;
            if (ty9Var != null) {
                ty9Var.invalidate();
            }
            jy9 jy9Var = t53Var.j0;
            if (jy9Var != null) {
                jy9Var.invalidate();
            }
        }
        t53Var.setOnLongPressedListener(new ni6(v29Var, (byte) 22));
        byte b2 = 16;
        t53Var.setOnRecentClearedListener(new q7f(b2));
        t53Var.setRecentReactions(arrayList);
        t53Var.setSelectedReactions((HashSet<k39>) hashSet);
        t53Var.setDrawBackground(false);
        t53Var.r(null);
        w53Var.addView(t53Var, qoe.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i == 5) {
            w53Var.setClipChildren(false);
            w53Var.setClipToPadding(false);
            suVar.setClipChildren(false);
            suVar.setClipToPadding(false);
            b2 = 2;
        }
        float f = b2;
        suVar.addView(w53Var, qoe.d(-1, -1.0f, i == 5 ? 85 : 48, f, f, f, 16.0f));
        suVar.setClipChildren(false);
        if (i == 1 || (v29Var.getDelegate() != null && v29Var.getDelegate().s())) {
            t53Var.setBackgroundDelegate(new x92((Object) this, (Object) v29Var, (byte) 14));
        }
        if (z3) {
            ((ViewGroup) v29Var.getParent()).addView(suVar);
        } else {
            WindowManager.LayoutParams b3 = b(false);
            WindowManager windowManager = gm.W(context).getWindowManager();
            this.b = windowManager;
            gm.s3(windowManager, suVar, b3);
            windowManager.addView(suVar, b3);
        }
        this.n = v29Var;
        v29Var.setOnSwitchedToLoopView(new r53(this, b));
        v29Var.d1 = true;
        v29Var.invalidate();
        gm.d3(new mv2((Object) this, (Object) v29Var, (byte) 24), 50L);
        if (i != 5) {
            nm7.e().k(nm7.j1, 7);
        }
    }

    public static void g(View view, float f) {
        if (view instanceof fz9) {
            ((fz9) view).setAnimatedScale(f);
        } else if (view instanceof jz3) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public final void a(boolean z) {
        View view;
        if (this.E.isEmpty()) {
            h(false);
            oi5.a();
            this.B.e();
            t53 t53Var = this.m;
            t53Var.setEnterAnimationInProgress(false);
            ty9 ty9Var = t53Var.i0;
            if (z) {
                t53Var.e0.m(false);
                ty9Var.invalidate();
                ty9Var.h1();
                t53Var.g0.a();
                t53Var.sendAccessibilityEvent(32);
                v29 v29Var = this.n;
                v29Var.setImportantForAccessibility(4);
                int i = 0;
                while (true) {
                    if (i >= ty9Var.getChildCount()) {
                        view = null;
                        break;
                    } else {
                        if (ty9Var.getChildAt(i) instanceof fz9) {
                            view = ty9Var.getChildAt(i);
                            break;
                        }
                        i++;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    t53Var.performAccessibilityAction(64, null);
                }
                if (v29Var.getPullingLeftProgress() > 0.0f) {
                    v29Var.P0 = false;
                    ValueAnimator valueAnimator = v29Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    v29Var.C0 = 0.0f;
                    su suVar = v29Var.T;
                    if (suVar != null) {
                        suVar.invalidate();
                    }
                    v29Var.invalidate();
                } else {
                    v29Var.P0 = true;
                    ValueAnimator valueAnimator2 = v29Var.z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    v29Var.C0 = 0.0f;
                    su suVar2 = v29Var.T;
                    if (suVar2 != null) {
                        suVar2.invalidate();
                    }
                    v29Var.invalidate();
                }
                jy9 jy9Var = t53Var.j0;
                for (int i2 = 0; i2 < ty9Var.i3.size(); i2++) {
                    xy9 xy9Var = (xy9) ty9Var.i3.get(i2);
                    for (int i3 = 0; i3 < xy9Var.P.size(); i3++) {
                        if (((fz9) xy9Var.P.get(i3)).b) {
                            ((fz9) xy9Var.P.get(i3)).b = false;
                            ((fz9) xy9Var.P.get(i3)).invalidate();
                            xy9Var.k();
                        }
                    }
                }
                ty9Var.invalidate();
                for (int i4 = 0; i4 < jy9Var.i3.size(); i4++) {
                    xy9 xy9Var2 = (xy9) jy9Var.i3.get(i4);
                    for (int i5 = 0; i5 < xy9Var2.P.size(); i5++) {
                        if (((fz9) xy9Var2.P.get(i5)).b) {
                            ((fz9) xy9Var2.P.get(i5)).b = false;
                            ((fz9) xy9Var2.P.get(i5)).invalidate();
                            xy9Var2.k();
                        }
                    }
                }
                jy9Var.invalidate();
                i();
                this.a.invalidate();
            }
        }
    }

    public final WindowManager.LayoutParams b(boolean z) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        byte b = this.y;
        layoutParams.type = (b == 0 || b == 3) ? 1000 : 99;
        layoutParams.softInputMode = 16;
        if (z) {
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
    /* JADX WARN: Type inference failed for: r2v15, types: [android.animation.ValueAnimator] */
    public final void c(boolean z) {
        ?? r18;
        boolean z2;
        boolean z3;
        hoa hoaVar;
        boolean z4;
        t53 t53Var = this.m;
        byte b = this.y;
        su suVar = this.c;
        int[] iArr = this.A;
        w53 w53Var = this.a;
        RectF rectF = this.f;
        v29 v29Var = this.n;
        rectF.set(v29Var.x);
        this.e = v29Var.E;
        int[] iArr2 = new int[2];
        if (z) {
            v29Var.getLocationOnScreen(iArr);
        }
        suVar.getLocationOnScreen(iArr2);
        float topOffset = v29Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - gm.L(44.0f)) - gm.L(52.0f)) - (t53Var.P0 ? gm.L(26.0f) : 0));
        if (v29Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - gm.L(12.0f);
        }
        if (w53Var.getMeasuredHeight() + topOffset > suVar.getMeasuredHeight() - gm.L(32.0f)) {
            topOffset = (suVar.getMeasuredHeight() - gm.L(32.0f)) - w53Var.getMeasuredHeight();
        }
        if (topOffset < gm.L(16.0f)) {
            topOffset = gm.L(16.0f);
        }
        if (b == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (b == 1) {
            r18 = 1;
            w53Var.setTranslationX(((suVar.getMeasuredWidth() - w53Var.getMeasuredWidth()) / 2.0f) - gm.L(16.0f));
        } else {
            boolean z5 = true;
            if (b == 2 || b == 4) {
                w53Var.setTranslationX((iArr[0] - iArr2[0]) - gm.L(18.0f));
                r18 = z5;
            } else {
                w53Var.setTranslationX((iArr[0] - iArr2[0]) - gm.L(2.0f));
                r18 = z5;
            }
        }
        if (z) {
            this.t = topOffset;
            w53Var.setTranslationY(topOffset);
        } else {
            this.t = w53Var.getTranslationY();
        }
        float x = (iArr[0] - iArr2[0]) - w53Var.getX();
        this.g = x;
        float y = (iArr[r18] - iArr2[r18]) - w53Var.getY();
        this.h = y;
        rectF.offset(x, y);
        v29Var.setCustomEmojiEnterProgress(this.j);
        if (z) {
            z2 = (gda.o() < 2 || !e86.e(8200)) ? false : r18;
            this.w = z2;
            this.k = false;
        } else {
            this.w = false;
            z2 = false;
        }
        if (z2) {
            z3 = r18;
            j(z3, 0.0f);
        } else {
            z3 = r18;
        }
        k();
        t53Var.setEnterAnimationInProgress(z3);
        t53Var.e0.m(z && this.w);
        this.B.d();
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.C = true;
        float f = this.j;
        if (b == 4) {
            hoaVar = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
        } else {
            float[] fArr = {f, z ? 1.0f : 0.0f};
            hoa hoaVar2 = new hoa();
            hoaVar2.a = 0;
            hoaVar2.b = 0;
            hoaVar2.setFloatValues(fArr);
            hoaVar = hoaVar2;
        }
        this.x = hoaVar;
        hoaVar.addUpdateListener(new d30((byte) 3, this, z));
        if (!z) {
            i();
        }
        this.x.addListener(new y7((byte) 27, (Object) this, z));
        if (b == 4) {
            this.x.setDuration(420L);
            this.x.setInterpolator(d53.h);
        } else {
            boolean z6 = this.w;
            ValueAnimator valueAnimator2 = this.x;
            if (z6) {
                valueAnimator2.setDuration(450L);
                b10.n(0.5f, this.x);
            } else {
                valueAnimator2.setDuration(350L);
                this.x.setInterpolator(d53.f);
            }
        }
        w53Var.invalidate();
        h(true);
        if (z) {
            v29Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.x;
            Objects.requireNonNull(valueAnimator3);
            xf2 xf2Var = new xf2(valueAnimator3, (byte) 21);
            oi5.f = this.w;
            oi5.e = true;
            oi5.g = false;
            if (oi5.d) {
                oi5.d = false;
            }
            oi5.c = xf2Var;
        } else {
            v29Var.P0 = true;
            v29Var.invalidate();
            this.x.setStartDelay(30L);
            this.x.start();
        }
        HashSet hashSet = oi5.a;
        ix2 ix2Var = fn5.z().p;
        if (((CountDownLatch) ix2Var.c) == null) {
            z4 = true;
            ix2Var.c = new CountDownLatch(1);
        } else {
            z4 = true;
        }
        oi5.b = z4;
        oi5.e = false;
        oi5.g = false;
    }

    public final void d() {
        if (this.q) {
            return;
        }
        v29 v29Var = this.n;
        if (v29Var != null) {
            ValueAnimator valueAnimator = v29Var.z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            v29Var.C0 = 0.0f;
            su suVar = v29Var.T;
            if (suVar != null) {
                suVar.invalidate();
            }
            v29Var.invalidate();
        }
        u31.e();
        this.q = true;
        gm.t1(this.c);
        c(false);
        if (this.v) {
            d dVar = this.r;
            if (dVar instanceof yv1) {
                ((yv1) dVar).ia(true, true);
            }
        }
    }

    public final void e() {
        if (this.q) {
            return;
        }
        u31.e();
        this.q = true;
        su suVar = this.c;
        gm.t1(suVar);
        suVar.animate().alpha(0.0f).setDuration(150L).setListener(new v53(this, (byte) 1));
        if (this.v) {
            d dVar = this.r;
            if (dVar instanceof yv1) {
                ((yv1) dVar).ia(true, true);
            }
        }
    }

    public final void f() {
        byte b = 1;
        if (this.y != 5) {
            nm7.e().k(nm7.k1, 7);
        }
        gm.c3(new r53(this, b));
    }

    public final void h(boolean z) {
        int i = z ? 2 : 0;
        t53 t53Var = this.m;
        t53Var.i0.setLayerType(i, null);
        t53Var.g0.setLayerType(i, null);
        if (!this.w) {
            t53Var.f0.setLayerType(i, null);
            t53Var.e0.setLayerType(i, null);
        } else {
            for (int i2 = 0; i2 < Math.min(t53Var.e0.b.getChildCount(), 16); i2++) {
                t53Var.e0.b.getChildAt(i2).setLayerType(i, null);
            }
        }
    }

    public final void i() {
        int i = 0;
        while (true) {
            t53 t53Var = this.m;
            ty9 ty9Var = t53Var.i0;
            ty9 ty9Var2 = t53Var.i0;
            if (i >= ty9Var.getChildCount()) {
                return;
            }
            if (ty9Var2.getChildAt(i) instanceof fz9) {
                fz9 fz9Var = (fz9) ty9Var2.getChildAt(i);
                if (fz9Var.y != null) {
                    fz9Var.b = false;
                    fz9Var.invalidate();
                }
            }
            i++;
        }
    }

    public final void j(boolean z, float f) {
        RectF rectF;
        HashSet hashSet;
        t53 t53Var = this.m;
        float y = t53Var.getY();
        qy9 qy9Var = t53Var.b0;
        float y2 = qy9Var.getY() + y;
        ty9 ty9Var = t53Var.i0;
        int y3 = (int) (ty9Var.getY() + y2);
        ArrayList arrayList = null;
        int i = 0;
        boolean z2 = false;
        while (true) {
            int childCount = ty9Var.getChildCount();
            rectF = this.i;
            hashSet = this.D;
            if (i >= childCount) {
                break;
            }
            View childAt = ty9Var.getChildAt(i);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y3;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f == 0.0f) {
                    g(childAt, 0.0f);
                    z2 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                }
            }
            i++;
        }
        int y4 = (int) (t53Var.e0.getY() + qy9Var.getY() + t53Var.getY());
        for (int i2 = 0; i2 < t53Var.e0.b.getChildCount(); i2++) {
            View childAt2 = t53Var.e0.b.getChildAt(i2);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y4;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f == 0.0f) {
                    g(childAt2, 0.0f);
                    z2 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                }
            }
        }
        if (z2) {
            t53Var.l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new pl(this, arrayList, (byte) 10));
            this.E.add(ofFloat);
            ofFloat.addListener(new qx((Object) this, (Object) ofFloat, z, (byte) 3));
            if (this.y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(d53.h);
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
        t53 t53Var = this.m;
        t53Var.g0.setAlpha(this.j);
        t53Var.i0.setAlpha(this.j);
        t53Var.j0.setAlpha(this.j);
        t53Var.e0.setAlpha(this.j);
        t53Var.f0.setAlpha(this.j);
    }

    public final void l() {
        t53 t53Var = this.m;
        qy9 qy9Var = t53Var.b0;
        qy9 qy9Var2 = t53Var.b0;
        boolean z = this.w;
        w53 w53Var = this.a;
        qy9Var.setTranslationX(z ? 0.0f : w53Var.f);
        qy9Var2.setTranslationY(w53Var.h);
        qy9Var2.setPivotX(w53Var.r);
        qy9Var2.setPivotY(w53Var.s);
        qy9Var2.setScaleX(w53Var.n);
        qy9Var2.setScaleY(w53Var.n);
    }
}
