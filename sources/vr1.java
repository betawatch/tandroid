// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vr1 extends qu1 {
    public final xk4 A3;
    public final zna B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final /* synthetic */ yv1 G3;
    public int g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public int m3;
    public int n3;
    public int o3;
    public long p3;
    public float q3;
    public float r3;
    public boolean s3;
    public final float t3;
    public final Paint u3;
    public final Paint v3;
    public final xk4 w3;
    public final zna x3;
    public final xk4 y3;
    public final zna z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(yv1 yv1Var, Context context, wv1 wv1Var) {
        super(yv1Var, context, wv1Var);
        this.G3 = yv1Var;
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList(10);
        this.t3 = 2000.0f;
        final byte b = 1;
        Paint paint = new Paint(1);
        this.u3 = paint;
        Paint paint2 = new Paint(1);
        this.v3 = paint2;
        xk4 xk4Var = new xk4(0.0f);
        this.w3 = xk4Var;
        zna znaVar = new zna(xk4Var);
        znaVar.h = 0.0f;
        znaVar.g = 2000.0f;
        znaVar.m = aq1.j(0.0f, 1500.0f, 1.0f);
        final byte b2 = 0;
        znaVar.b(new it3(this) { // from class: ur1
            public final /* synthetic */ vr1 b;

            {
                this.b = this;
            }

            @Override // it3
            public final void a(zna znaVar2, float f, float f2) {
                byte b3 = b2;
                vr1 vr1Var = this.b;
                switch (b3) {
                    case 0:
                        vr1Var.invalidate();
                        break;
                    case 1:
                        vr1Var.invalidate();
                        break;
                    default:
                        vr1Var.invalidate();
                        break;
                }
            }
        });
        this.x3 = znaVar;
        xk4 xk4Var2 = new xk4(0.0f);
        this.y3 = xk4Var2;
        zna znaVar2 = new zna(xk4Var2);
        znaVar2.h = 0.0f;
        znaVar2.m = aq1.j(0.0f, 400.0f, 0.5f);
        znaVar2.b(new it3(this) { // from class: ur1
            public final /* synthetic */ vr1 b;

            {
                this.b = this;
            }

            @Override // it3
            public final void a(zna znaVar22, float f, float f2) {
                byte b3 = b;
                vr1 vr1Var = this.b;
                switch (b3) {
                    case 0:
                        vr1Var.invalidate();
                        break;
                    case 1:
                        vr1Var.invalidate();
                        break;
                    default:
                        vr1Var.invalidate();
                        break;
                }
            }
        });
        this.z3 = znaVar2;
        xk4 xk4Var3 = new xk4(0.0f);
        this.A3 = xk4Var3;
        zna znaVar3 = new zna(xk4Var3);
        znaVar3.h = 0.0f;
        znaVar3.m = aq1.j(0.0f, 200.0f, 1.0f);
        final byte b3 = 2;
        znaVar3.b(new it3(this) { // from class: ur1
            public final /* synthetic */ vr1 b;

            {
                this.b = this;
            }

            @Override // it3
            public final void a(zna znaVar22, float f, float f2) {
                byte b32 = b3;
                vr1 vr1Var = this.b;
                switch (b32) {
                    case 0:
                        vr1Var.invalidate();
                        break;
                    case 1:
                        vr1Var.invalidate();
                        break;
                    default:
                        vr1Var.invalidate();
                        break;
                }
            }
        });
        this.B3 = znaVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(gm.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gm.L(2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(Canvas canvas, RectF rectF) {
        float f;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.h3;
        int size = arrayList3.size();
        yv1 yv1Var = this.G3;
        boolean z = 1;
        boolean z2 = false;
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                rc2 rc2Var = (rc2) arrayList3.get(i);
                if (!yv1Var.Xa(rc2Var, rectF)) {
                    canvas.save();
                    canvas.translate(rc2Var.U1(false) + rc2Var.getLeft(), rc2Var.getY() + rc2Var.getPaddingTop());
                    rc2Var.A1(rc2Var.a() ? rc2Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.i3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                rc2 rc2Var2 = (rc2) arrayList4.get(i2);
                if (!yv1Var.Xa(rc2Var2, rectF)) {
                    float U1 = rc2Var2.U1(false) + rc2Var2.getLeft();
                    float y = rc2Var2.getY() + rc2Var2.getPaddingTop();
                    float alpha = rc2Var2.a() ? rc2Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(U1, y);
                    rc2Var2.setInvalidatesParent(true);
                    rc2Var2.h1(canvas, alpha);
                    rc2Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.j3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i3 = 0;
            while (i3 < size3) {
                rc2 rc2Var3 = (rc2) arrayList5.get(i3);
                if (yv1Var.Xa(rc2Var3, rectF)) {
                    arrayList2 = arrayList5;
                } else {
                    boolean z3 = (rc2Var3.getCurrentPosition() == null || (rc2Var3.getCurrentPosition().l & z) != 0) ? z2 : z;
                    float alpha2 = rc2Var3.a() ? rc2Var3.getAlpha() : 1.0f;
                    float U12 = rc2Var3.U1(z2) + rc2Var3.getLeft();
                    float y2 = rc2Var3.getY() + rc2Var3.getPaddingTop();
                    canvas.save();
                    f47 currentMessagesGroup = rc2Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        e47 e47Var = currentMessagesGroup.m;
                        if (e47Var.j) {
                            float U13 = rc2Var3.U1(z);
                            float f2 = e47Var.a + U13 + e47Var.e;
                            arrayList2 = arrayList5;
                            float f3 = e47Var.b + e47Var.f;
                            float f4 = e47Var.c + U13 + e47Var.g;
                            float f5 = e47Var.d + e47Var.h;
                            if (!e47Var.j) {
                                f3 += rc2Var3.getTranslationY();
                                f5 += rc2Var3.getTranslationY();
                            }
                            canvas.clipRect(f2 + gm.L(8.0f), f3 + gm.L(8.0f), f4 - gm.L(8.0f), f5 - gm.L(8.0f));
                            if (rc2Var3.getTransitionParams().w0) {
                                canvas.translate(U12, y2);
                                rc2Var3.setInvalidatesParent(true);
                                rc2Var3.Q0(alpha2, canvas, z3);
                                rc2Var3.setInvalidatesParent(false);
                            }
                            canvas.restore();
                        }
                    }
                    arrayList2 = arrayList5;
                    if (rc2Var3.getTransitionParams().w0) {
                    }
                    canvas.restore();
                }
                i3++;
                arrayList5 = arrayList2;
                z = 1;
                z2 = false;
            }
            f = 8.0f;
            arrayList5.clear();
        } else {
            f = 8.0f;
        }
        ArrayList arrayList6 = this.k3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            int i4 = 0;
            while (i4 < size4) {
                rc2 rc2Var4 = (rc2) arrayList6.get(i4);
                if (yv1Var.Xa(rc2Var4, rectF)) {
                    arrayList = arrayList6;
                } else {
                    boolean z4 = rc2Var4.getCurrentPosition() != null && (rc2Var4.getCurrentPosition().l & 1) == 0;
                    float alpha3 = rc2Var4.a() ? rc2Var4.getAlpha() : 1.0f;
                    float U14 = rc2Var4.U1(false) + rc2Var4.getLeft();
                    float y3 = rc2Var4.getY() + rc2Var4.getPaddingTop();
                    canvas.save();
                    f47 currentMessagesGroup2 = rc2Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        e47 e47Var2 = currentMessagesGroup2.m;
                        if (e47Var2.j) {
                            float U15 = rc2Var4.U1(true);
                            float f6 = e47Var2.a + U15 + e47Var2.e;
                            float f7 = e47Var2.b + e47Var2.f;
                            float f8 = e47Var2.c + U15 + e47Var2.g;
                            arrayList = arrayList6;
                            float f9 = e47Var2.d + e47Var2.h;
                            if (!e47Var2.j) {
                                f7 += rc2Var4.getTranslationY();
                                f9 += rc2Var4.getTranslationY();
                            }
                            canvas.clipRect(f6 + gm.L(f), f7 + gm.L(f), f8 - gm.L(f), f9 - gm.L(f));
                            if (!z4 && rc2Var4.getTransitionParams().w0) {
                                canvas.translate(U14, y3);
                                rc2Var4.setInvalidatesParent(true);
                                rc2Var4.q1(canvas, alpha3, null);
                                rc2Var4.V0(canvas, alpha3);
                                rc2Var4.setInvalidatesParent(false);
                            }
                            canvas.restore();
                        }
                    }
                    arrayList = arrayList6;
                    if (!z4) {
                        canvas.translate(U14, y3);
                        rc2Var4.setInvalidatesParent(true);
                        rc2Var4.q1(canvas, alpha3, null);
                        rc2Var4.V0(canvas, alpha3);
                        rc2Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i4++;
                arrayList6 = arrayList;
            }
            arrayList6.clear();
        }
    }

    public final void B1(boolean z) {
        float f;
        VelocityTracker velocityTracker;
        yv1 yv1Var = this.G3;
        if (!z || (velocityTracker = yv1Var.B9) == null) {
            f = 0.0f;
        } else {
            velocityTracker.computeCurrentVelocity(1000);
            f = yv1Var.B9.getXVelocity();
        }
        VelocityTracker velocityTracker2 = yv1Var.B9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            yv1Var.B9 = null;
        }
        yv1Var.y9 = false;
        yv1Var.C0.R = true;
        oyb oybVar = yv1Var.n0;
        if (oybVar != null) {
            oybVar.settle(f);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        f47 T6;
        k47 k47Var;
        boolean z;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z2;
        yv1 yv1Var = this.G3;
        if (motionEvent != null) {
            yv1Var.R4 = true;
        }
        if (yv1Var.k8() && yv1Var.v9 == null) {
            if (motionEvent == null) {
                if (yv1Var.y9) {
                    B1(false);
                }
                yv1Var.x9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z2 = ((d) yv1Var).inPreviewMode;
                    boolean z3 = (z2 || yv1Var.B7() || motionEvent.getX() < ((float) getMeasuredWidth()) * 0.55f) ? false : true;
                    yv1Var.x9 = z3;
                    if (z3) {
                        yv1Var.y9 = false;
                        yv1Var.z9 = motionEvent.getX();
                        yv1Var.A9 = motionEvent.getY();
                        VelocityTracker velocityTracker = yv1Var.B9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        yv1Var.B9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                    yv1Var.y9 = false;
                } else if (yv1Var.x9 || yv1Var.y9) {
                    if (actionMasked != 2) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            if (yv1Var.y9) {
                                VelocityTracker velocityTracker2 = yv1Var.B9;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.addMovement(motionEvent);
                                }
                                B1(actionMasked == 1);
                            }
                            yv1Var.x9 = false;
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker3 = yv1Var.B9;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x = motionEvent.getX() - yv1Var.z9;
                    float abs = Math.abs(motionEvent.getY() - yv1Var.A9);
                    if (!yv1Var.x9 || yv1Var.y9 || getScrollState() != 0 || x > (-gm.Z0(true, 0.4f)) || Math.abs(x) / 3.0f <= abs || yv1Var.C6() == null) {
                        if (yv1Var.y9) {
                            yv1Var.n0.setProgress((-(motionEvent.getX() - yv1Var.z9)) / yv1Var.n0.getContentWidth());
                            return;
                        }
                        return;
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.onInterceptTouchEvent(obtain2);
                    obtain2.recycle();
                    yv1Var.C0.R = false;
                    yv1Var.x9 = false;
                    yv1Var.y9 = true;
                    yv1Var.z9 = motionEvent.getX();
                    oyb oybVar = yv1Var.n0;
                    ValueAnimator valueAnimator = oybVar.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        oybVar.K = null;
                    }
                    gm.t1(yv1Var.m1);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    return;
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !yv1Var.C9 && !yv1Var.w9 && yv1Var.v9 == null) {
            z = ((d) yv1Var).inPreviewMode;
            if (!z) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof rc2)) {
                    if (!(pressedChildView instanceof cm1)) {
                        return;
                    }
                    cm1 cm1Var = (cm1) pressedChildView;
                    float x2 = motionEvent.getX() - pressedChildView.getX();
                    float y = motionEvent.getY() - pressedChildView.getY();
                    if (!cm1Var.S()) {
                        return;
                    }
                    mmc mmcVar = cm1Var.J0;
                    float f = (x2 - cm1Var.L0) - (cm1Var.k0 / 2.0f);
                    float paddingTop = (y - cm1Var.M0) - cm1Var.getPaddingTop();
                    lmc lmcVar = mmcVar.m;
                    if (lmcVar != null && lmcVar.n && mmcVar.w.contains((int) f, (int) paddingTop)) {
                        return;
                    }
                }
                if (yv1Var.v9 != null) {
                    yv1Var.Bc(0.0f);
                }
                yv1Var.v9 = pressedChildView;
                k47 q7 = yv1Var.q7();
                boolean O4 = yv1Var.O4(q7);
                int i = yv1Var.g4;
                if ((i != 0 && i != 5 && i != 8 && (i != 3 || yv1Var.s4 != yv1Var.getUserConfig().e())) || (((arrayList = yv1Var.p4) != null && arrayList.contains(q7)) || ((yv1Var.Z6(q7) == 1 && (k47.B0(q7.k) == yv1Var.d7 || q7.l5())) || ((yv1Var.h == null && q7.e1() < 0) || (((chat2 = yv1Var.e) != null && sd2.c0(chat2) && !O4) || yv1Var.B7() || (k47.c3(q7.k) && q7.N3())))))) {
                    yv1Var.Bc(0.0f);
                    yv1Var.v9 = null;
                    return;
                } else {
                    this.o3 = motionEvent.getPointerId(0);
                    yv1Var.w9 = true;
                    this.m3 = (int) motionEvent.getX();
                    this.n3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (yv1Var.v9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.o3) {
            int max = Math.max(gm.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.n3);
            if (getScrollState() == 0 && yv1Var.w9 && !yv1Var.C9 && max <= (-gm.Z0(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                yv1Var.v9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                yv1Var.C0.R = false;
                yv1Var.w9 = false;
                yv1Var.C9 = true;
                this.m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (yv1Var.C9) {
                if (Math.abs(max) < gm.L(50.0f)) {
                    this.s3 = false;
                } else if (!this.s3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.s3 = true;
                }
                float f2 = max;
                yv1Var.Bc(f2);
                k47 q72 = yv1Var.q7();
                if (q72 != null && (q72.g4() || k47.K4(q72.k))) {
                    yv1Var.vd(false, false);
                }
                View view = yv1Var.v9;
                if (view instanceof rc2) {
                    D1((rc2) view, f2);
                }
                invalidate();
                return;
            }
            return;
        }
        if (yv1Var.v9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.o3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = yv1Var.v9;
                if (Math.abs(view2 instanceof rc2 ? ((rc2) view2).U1(false) : view2 instanceof cm1 ? ((cm1) view2).getWalletSlidingOffset() : 0.0f) >= gm.L(50.0f)) {
                    k47 q73 = yv1Var.q7();
                    boolean O42 = yv1Var.O4(q73);
                    qs1 qs1Var = yv1Var.d1;
                    if ((qs1Var == null || qs1Var.getVisibility() != 0 || ((yv1Var.X0 && O42) || q73.X1)) && ((chat = yv1Var.e) == null || ((!sd2.r0(chat) || yv1Var.j8()) && ((!sd2.T(yv1Var.e) || sd2.w(5, yv1Var.e) || yv1Var.e.megagroup) && sd2.n(yv1Var.e))))) {
                        yv1Var.dc(yv1Var.q7());
                    } else {
                        if (q73.c1() != 0 && (T6 = yv1Var.T6(q73.c1())) != null && (k47Var = T6.h) != null) {
                            q73 = k47Var;
                        }
                        yv1Var.F5 = q73;
                        Bundle j = td4.j(3, "onlySelect", "dialogsType", true);
                        j.putBoolean("quote", true);
                        j.putBoolean("reply_to", true);
                        yv1Var.Wa(j, q73);
                        j.putInt("messagesCount", 1);
                        j.putBoolean("canSelectTopics", true);
                        nk3 nk3Var = new nk3(j);
                        nk3Var.E2 = yv1Var;
                        yv1Var.presentFragment(nk3Var);
                    }
                }
            }
            View view3 = yv1Var.v9;
            float slidingOffsetX = view3 instanceof rc2 ? ((rc2) view3).getSlidingOffsetX() : view3 instanceof cm1 ? ((cm1) view3).getWalletSlidingOffset() : 0.0f;
            this.r3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                yv1Var.v9 = null;
            }
            this.p3 = System.currentTimeMillis();
            this.q3 = 0.0f;
            invalidate();
            yv1Var.w9 = false;
            yv1Var.C9 = false;
            yv1Var.C0.R = true;
        }
    }

    public final void D1(rc2 rc2Var, float f) {
        f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != rc2Var && (childAt instanceof rc2)) {
                rc2 rc2Var2 = (rc2) childAt;
                if (rc2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    rc2Var2.setSlidingOffset(f);
                    rc2Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // r59
    public final boolean G0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yv1 yv1Var = this.G3;
        yv1Var.K8 = null;
        canvas.save();
        this.F1.setEmpty();
        if (yv1Var.ka != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-yv1Var.ka) - (yv1Var.ra != 0.0f ? (yv1Var.A0.getMeasuredHeight() - yv1Var.ka) * yv1Var.ra : 0.0f);
            yv1Var.Wa = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
        }
        canvas.restore();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.f7) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(android.graphics.Canvas r44) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vr1.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0289, code lost:
    
        if ((r4 & 1) != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x023b, code lost:
    
        if (r8.c != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022e, code lost:
    
        if (r7.getTransitionParams().x0 != false) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v45, types: [mk5] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v54, types: [mk5] */
    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        rc2 rc2Var;
        boolean z;
        rc2 rc2Var2;
        cm1 cm1Var;
        int i;
        f47 f47Var;
        int i2;
        boolean z2;
        float f;
        boolean z3;
        float f2;
        boolean z4;
        float f3;
        boolean z5;
        boolean z6;
        int paddingTop;
        rc2 rc2Var3;
        float f4;
        float checkBoxTranslation;
        int layoutHeight;
        float f5;
        int b;
        f47 f47Var2;
        int top;
        ?? r0;
        float checkBoxTranslation2;
        int b2;
        int i3;
        float x;
        float y;
        byte b3;
        k47 k47Var;
        yv1 yv1Var = this.G3;
        if (yv1Var.h8()) {
            invalidate();
        }
        boolean z7 = view == yv1Var.Z8;
        boolean z8 = view instanceof rc2;
        if (z8) {
            rc2Var = (rc2) view;
            z = rc2Var.ub.x0;
        } else {
            rc2Var = null;
            z = false;
        }
        if ((!ela.l0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z7 = true;
        }
        if (z8) {
            rc2Var2 = (rc2) view;
            if (yv1Var.F6.contains(rc2Var2)) {
                z7 = true;
            }
            c47 currentPosition = rc2Var2.getCurrentPosition();
            f47Var = rc2Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i4 = currentPosition.e;
                int i5 = currentPosition.i;
                if (i4 != i5 && i5 == 1000 && currentPosition.m == null && f47Var.b) {
                    i = rc2Var2.getBackgroundDrawableLeft();
                    i2 = 0;
                    b3 = rc2Var2.M1;
                    if (b3 != 7) {
                    }
                    yv1Var.K8 = rc2Var2;
                    if (!z7) {
                    }
                    if (z7) {
                    }
                    cm1Var = null;
                } else if (currentPosition.m != null) {
                    i2 = view.getBottom() - gm.L((rc2Var2.K2() ? 1 : 0) + 1);
                    i = 0;
                    b3 = rc2Var2.M1;
                    if ((b3 != 7 || b3 == 4) && (k47Var = rc2Var2.Q5) != null && k47Var.D != 5 && MediaController.w().D(rc2Var2.Q5)) {
                        yv1Var.K8 = rc2Var2;
                    }
                    if (!z7) {
                        View view2 = yv1Var.Z8;
                        if (view2 instanceof rc2) {
                            rc2 rc2Var4 = (rc2) view2;
                            if (rc2Var4.getCurrentMessagesGroup() != null && rc2Var4.getCurrentMessagesGroup() == f47Var) {
                                z7 = true;
                            }
                        }
                    }
                    if (z7) {
                        rc2Var2.getPhotoImage().getClass();
                    }
                    cm1Var = null;
                }
            }
            i = 0;
            i2 = 0;
            b3 = rc2Var2.M1;
            if (b3 != 7) {
            }
            yv1Var.K8 = rc2Var2;
            if (!z7) {
            }
            if (z7) {
            }
            cm1Var = null;
        } else {
            if (view instanceof cm1) {
                cm1Var = (cm1) view;
                rc2Var2 = null;
            } else {
                rc2Var2 = null;
                cm1Var = null;
            }
            i = 0;
            f47Var = null;
            i2 = 0;
        }
        if (i != 0) {
            canvas.save();
        } else if (i2 != 0) {
            canvas.save();
        }
        if (z7) {
            z7 = false;
        }
        if (z7) {
            z2 = true;
            f = 0.0f;
            z3 = false;
        } else {
            boolean z9 = (rc2Var2 == null || rc2Var2.ub.w1 || f47Var == null || !f47Var.m.j) ? false : true;
            if (z9) {
                canvas.save();
                float U1 = rc2Var2.U1(true);
                e47 e47Var = f47Var.m;
                z2 = true;
                float f6 = e47Var.c + U1;
                f = 0.0f;
                canvas.clipRect(e47Var.a + U1 + e47Var.e + gm.L(4.0f), e47Var.b + e47Var.f + gm.L(4.0f), (f6 + e47Var.g) - gm.L(4.0f), (e47Var.d + e47Var.h) - gm.L(4.0f));
            } else {
                z2 = true;
                f = 0.0f;
            }
            if (rc2Var2 != null) {
                yc2 yc2Var = rc2Var2.ub;
                if (yc2Var.w1) {
                    canvas.save();
                    canvas.translate(rc2Var2.getX(), rc2Var2.getY());
                    rc2Var2.d1(canvas);
                    canvas.restore();
                    z3 = yc2Var.h;
                } else if (z9) {
                    z3 = super.drawChild(canvas, view, j);
                }
                if (z9) {
                    canvas.restore();
                }
                if (rc2Var2 == null && rc2Var2.l2()) {
                    canvas.save();
                    canvas.translate(rc2Var2.getX(), rc2Var2.getPaddingTopAnimated() + rc2Var2.getY());
                    rc2Var2.i1(canvas);
                    canvas.restore();
                } else if (cm1Var != null) {
                    canvas.save();
                    canvas.translate(cm1Var.getX(), cm1Var.getY());
                    cm1Var.H(canvas);
                    canvas.restore();
                }
            }
            z3 = super.drawChild(canvas, view, j);
            if (z9) {
            }
            if (rc2Var2 == null) {
            }
            if (cm1Var != null) {
            }
        }
        if (i != 0 || i2 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f) {
            canvas.save();
            f2 = f;
            canvas.translate(f2, view.getTranslationY());
        } else {
            f2 = f;
        }
        if (rc2Var2 != null) {
            rc2Var2.S0(canvas);
        }
        if (view.getTranslationY() != f2) {
            canvas.restore();
        }
        if (view.getTranslationY() != f2) {
            canvas.save();
            canvas.translate(f2, view.getTranslationY());
        }
        if (rc2Var2 != null) {
            k47 messageObject = rc2Var2.getMessageObject();
            c47 currentPosition2 = rc2Var2.getCurrentPosition();
            if (!z7) {
                if (currentPosition2 != null) {
                    if (!currentPosition2.h) {
                        if (currentPosition2.a == 0) {
                        }
                        if (currentPosition2 == null || rc2Var2.getTransitionParams().D0 || rc2Var2.getTransitionParams().x0) {
                            if (currentPosition2 != null || (currentPosition2.l & rc2Var2.C()) != 0) {
                                this.j3.add(rc2Var2);
                            }
                            if (currentPosition2 != null) {
                                int i6 = currentPosition2.l;
                                if ((i6 & 8) != 0) {
                                }
                            }
                            this.k3.add(rc2Var2);
                        }
                        if (yv1Var.J8 != null && ((messageObject.g4() || k47.K4(messageObject.k)) && !messageObject.S4() && MediaController.w().D(messageObject))) {
                            ImageReceiver photoImage = rc2Var2.getPhotoImage();
                            x = rc2Var2.getX() + photoImage.L0;
                            y = (yv1Var.A0.getY() + ((rc2Var2.getY() + rc2Var2.getPaddingTop()) + photoImage.M0)) - yv1Var.J8.getTop();
                            if (yv1Var.J8.getTranslationX() == x || yv1Var.J8.getTranslationY() != y) {
                                yv1Var.J8.setTranslationX(x);
                                yv1Var.J8.setTranslationY(y);
                                yv1Var.fragmentView.invalidate();
                                yv1Var.J8.invalidate();
                            }
                        }
                    }
                }
                if (currentPosition2 == null || currentPosition2.h) {
                    this.h3.add(rc2Var2);
                }
                if ((currentPosition2 == null || (currentPosition2.a == 0 && currentPosition2.c == 0)) && rc2Var2.k2()) {
                    this.i3.add(rc2Var2);
                }
                if (currentPosition2 == null) {
                }
                if (currentPosition2 != null) {
                }
                this.j3.add(rc2Var2);
                if (currentPosition2 != null) {
                }
                this.k3.add(rc2Var2);
                if (yv1Var.J8 != null) {
                    ImageReceiver photoImage2 = rc2Var2.getPhotoImage();
                    x = rc2Var2.getX() + photoImage2.L0;
                    y = (yv1Var.A0.getY() + ((rc2Var2.getY() + rc2Var2.getPaddingTop()) + photoImage2.M0)) - yv1Var.J8.getTop();
                    if (yv1Var.J8.getTranslationX() == x) {
                    }
                    yv1Var.J8.setTranslationX(x);
                    yv1Var.J8.setTranslationY(y);
                    yv1Var.fragmentView.invalidate();
                    yv1Var.J8.invalidate();
                }
            }
        }
        if (rc2Var != null) {
            k47 messageObject2 = rc2Var.getMessageObject();
            c47 currentPosition3 = rc2Var.getCurrentPosition();
            ImageReceiver avatarImage = rc2Var.getAvatarImage();
            if (avatarImage != null && yv1Var.n7() < 1.0f) {
                f47 v7 = yv1Var.v7(messageObject2);
                if (!rc2Var.getMessageObject().Z) {
                    yv1Var.A0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z5 = z2;
                        z6 = (!yv1Var.A0.W1 || (v7 != null && v7.m.j)) ? z2 : false;
                        paddingTop = view.getPaddingTop() + (!z6 ? view.getTop() : (int) view.getY());
                        if (rc2Var.n()) {
                            if (rc2Var.La) {
                                b2 = ((SparseArray) yv1Var.o9.s).indexOfValue(view);
                                if (b2 >= 0) {
                                    b2 = ((SparseArray) yv1Var.o9.s).keyAt(b2);
                                }
                            } else {
                                b2 = yv1Var.A0.T(view).b();
                            }
                            if (b2 >= 0) {
                                if (v7 != null) {
                                    ArrayList arrayList = v7.e;
                                    if (currentPosition3 != null) {
                                        int indexOf = arrayList.indexOf(currentPosition3);
                                        f4 = 1.0f;
                                        int size = arrayList.size();
                                        z4 = z3;
                                        if ((currentPosition3.l & 8) == 0) {
                                            i3 = b2 - 1;
                                            int i7 = indexOf + 1;
                                            while (i7 < size) {
                                                rc2Var3 = rc2Var2;
                                                if (((c47) arrayList.get(i7)).c > currentPosition3.d) {
                                                    break;
                                                }
                                                i3--;
                                                i7++;
                                                rc2Var2 = rc2Var3;
                                            }
                                        } else {
                                            i3 = (b2 - size) + indexOf;
                                        }
                                        rc2Var3 = rc2Var2;
                                        if (rc2Var.La) {
                                            if (yv1Var.A0.K(i3) != null) {
                                                if (view.getTranslationY() != 0.0f) {
                                                    canvas.restore();
                                                }
                                                avatarImage.v0(false, false);
                                                return z4;
                                            }
                                        } else if (((View) ((SparseArray) yv1Var.o9.s).get(i3)) != null) {
                                            if (view.getTranslationY() != 0.0f) {
                                                canvas.restore();
                                            }
                                            avatarImage.v0(false, false);
                                            return z4;
                                        }
                                        checkBoxTranslation = rc2Var.getCheckBoxTranslation() + rc2Var.getSlidingOffsetX();
                                        layoutHeight = (int) (rc2Var3.getLayoutHeight() + rc2Var3.getTransitionParams().j0 + ((int) (rc2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                                        int measuredHeight = yv1Var.A0.getMeasuredHeight() - yv1Var.A0.getPaddingBottom();
                                        boolean z10 = ((!rc2Var.n1 || rc2Var.o1) && checkBoxTranslation == 0.0f) ? z2 : false;
                                        if (!rc2Var.M2() || rc2Var.getTransitionParams().l2) {
                                            if (rc2Var.getTransitionParams().l2) {
                                                float f7 = rc2Var.getTransitionParams().L1;
                                                if (!rc2Var.M2()) {
                                                    f7 = f4 - f7;
                                                }
                                                layoutHeight = (int) td4.A(f4, f7, Math.min(layoutHeight, measuredHeight), layoutHeight * f7);
                                            }
                                        } else if (layoutHeight > measuredHeight) {
                                            layoutHeight = measuredHeight;
                                        }
                                        if (!z6 && view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        if (rc2Var.j()) {
                                            if (rc2Var.La) {
                                                b = ((SparseArray) yv1Var.o9.s).indexOfValue(view);
                                                if (b >= 0) {
                                                    b = ((SparseArray) yv1Var.o9.s).keyAt(b);
                                                }
                                            } else {
                                                b = yv1Var.A0.T(view).b();
                                            }
                                            if (b >= 0) {
                                                int i8 = paddingTop;
                                                int i9 = b;
                                                rc2 rc2Var5 = rc2Var;
                                                float f8 = checkBoxTranslation;
                                                int i10 = 0;
                                                while (i10 < 20) {
                                                    i10++;
                                                    if (v7 != null) {
                                                        ArrayList arrayList2 = v7.e;
                                                        if (currentPosition3 != null) {
                                                            int indexOf2 = arrayList2.indexOf(currentPosition3);
                                                            if (indexOf2 < 0) {
                                                                break;
                                                            }
                                                            arrayList2.size();
                                                            f47Var2 = v7;
                                                            if ((currentPosition3.l & 4) == 0) {
                                                                i9++;
                                                                int i11 = indexOf2 - 1;
                                                                while (i11 >= 0) {
                                                                    int i12 = i11;
                                                                    if (((c47) arrayList2.get(i11)).d < currentPosition3.c) {
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                    i11 = i12 - 1;
                                                                }
                                                            } else {
                                                                i9 = i9 + indexOf2 + 1;
                                                            }
                                                            if (!rc2Var5.m()) {
                                                                ?? r02 = (View) ((SparseArray) yv1Var.o9.s).get(i9);
                                                                if (r02 == 0) {
                                                                    break;
                                                                }
                                                                top = r02.getTop() + r02.getPaddingTop();
                                                                if (!(r02 instanceof mk5)) {
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = f8;
                                                                    rc2Var = rc2Var5;
                                                                    break;
                                                                }
                                                                r0 = (mk5) r02;
                                                                checkBoxTranslation2 = r0.getCheckBoxTranslation() + r0.getSlidingOffsetX();
                                                                if (!z10 || checkBoxTranslation2 <= 0.0f) {
                                                                    checkBoxTranslation2 = f8;
                                                                }
                                                                if (!r0.j()) {
                                                                    rc2Var = r0;
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = checkBoxTranslation2;
                                                                    break;
                                                                }
                                                                rc2Var5 = r0;
                                                                f8 = checkBoxTranslation2;
                                                                i8 = top;
                                                                v7 = f47Var2;
                                                            } else {
                                                                u69 K = yv1Var.A0.K(i9);
                                                                if (K == null) {
                                                                    break;
                                                                }
                                                                ?? r03 = K.a;
                                                                top = r03.getTop() + r03.getPaddingTop();
                                                                if (!(r03 instanceof rc2)) {
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = f8;
                                                                    rc2Var = rc2Var5;
                                                                    break;
                                                                }
                                                                r0 = (mk5) r03;
                                                                checkBoxTranslation2 = r0.getCheckBoxTranslation() + r0.getSlidingOffsetX();
                                                                if (!z10 || checkBoxTranslation2 <= 0.0f) {
                                                                    checkBoxTranslation2 = f8;
                                                                }
                                                                if (!r0.j()) {
                                                                    rc2Var = r0;
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = checkBoxTranslation2;
                                                                    break;
                                                                }
                                                                rc2Var5 = r0;
                                                                f8 = checkBoxTranslation2;
                                                                i8 = top;
                                                                v7 = f47Var2;
                                                            }
                                                        }
                                                    }
                                                    f47Var2 = v7;
                                                    i9++;
                                                    if (!rc2Var5.m()) {
                                                    }
                                                }
                                                checkBoxTranslation = f8;
                                                rc2Var = rc2Var5;
                                                paddingTop = i8;
                                            }
                                        }
                                        if (layoutHeight - gm.L(48.0f) < paddingTop) {
                                            layoutHeight = gm.L(48.0f) + paddingTop;
                                        }
                                        if (!rc2Var.n()) {
                                            int bottom = z6 ? view.getBottom() : (int) (rc2Var.getDeltaBottom() + rc2Var.getY() + rc2Var.getMeasuredHeight());
                                            if (layoutHeight > bottom) {
                                                layoutHeight = bottom;
                                            }
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                            canvas.translate(checkBoxTranslation, 0.0f);
                                        }
                                        if (rc2Var instanceof rc2) {
                                            rc2 rc2Var6 = rc2Var;
                                            if (rc2Var6.getCurrentMessagesGroup() != null && rc2Var6.getCurrentMessagesGroup().m.j) {
                                                layoutHeight = (int) (layoutHeight - rc2Var6.getTranslationY());
                                            }
                                        }
                                        if (z5) {
                                            avatarImage.M0 = layoutHeight - gm.L(44.0f);
                                        }
                                        if (rc2Var.a()) {
                                            f5 = 1.0f;
                                            avatarImage.setAlpha(1.0f - yv1Var.n7());
                                        } else {
                                            avatarImage.setAlpha(rc2Var.getAlpha() * (1.0f - yv1Var.n7()));
                                            canvas.scale(rc2Var.getScaleX(), rc2Var.getScaleY(), rc2Var.getPivotX() + rc2Var.getX(), rc2Var.getY() + (rc2Var.getHeight() >> 1));
                                            f5 = 1.0f;
                                        }
                                        if (z5) {
                                            avatarImage.v0(z2, false);
                                        }
                                        if (yv1Var.n7() <= 0.0f) {
                                            canvas.scale(f5 - yv1Var.n7(), f5 - yv1Var.n7(), avatarImage.w(), avatarImage.x());
                                            f3 = 0.0f;
                                            canvas.translate(yv1Var.n7() * gm.L(24.0f), 0.0f);
                                        } else {
                                            f3 = 0.0f;
                                        }
                                        avatarImage.h(canvas, null);
                                        canvas.restore();
                                        if (!z6 && view.getTranslationY() != f3) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f3) {
                                            canvas.restore();
                                        }
                                        return z4;
                                    }
                                }
                                z4 = z3;
                                rc2Var3 = rc2Var2;
                                f4 = 1.0f;
                                i3 = b2 - 1;
                                if (rc2Var.La) {
                                }
                                checkBoxTranslation = rc2Var.getCheckBoxTranslation() + rc2Var.getSlidingOffsetX();
                                layoutHeight = (int) (rc2Var3.getLayoutHeight() + rc2Var3.getTransitionParams().j0 + ((int) (rc2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                                int measuredHeight2 = yv1Var.A0.getMeasuredHeight() - yv1Var.A0.getPaddingBottom();
                                if (rc2Var.n1) {
                                }
                                if (rc2Var.M2()) {
                                }
                                if (rc2Var.getTransitionParams().l2) {
                                }
                                if (!z6) {
                                    canvas.restore();
                                }
                                if (rc2Var.j()) {
                                }
                                if (layoutHeight - gm.L(48.0f) < paddingTop) {
                                }
                                if (!rc2Var.n()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (rc2Var instanceof rc2) {
                                }
                                if (z5) {
                                }
                                if (rc2Var.a()) {
                                }
                                if (z5) {
                                }
                                if (yv1Var.n7() <= 0.0f) {
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                if (!z6) {
                                    canvas.save();
                                }
                                if (view.getTranslationY() != f3) {
                                }
                                return z4;
                            }
                        }
                        z4 = z3;
                        rc2Var3 = rc2Var2;
                        f4 = 1.0f;
                        checkBoxTranslation = rc2Var.getCheckBoxTranslation() + rc2Var.getSlidingOffsetX();
                        layoutHeight = (int) (rc2Var3.getLayoutHeight() + rc2Var3.getTransitionParams().j0 + ((int) (rc2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                        int measuredHeight22 = yv1Var.A0.getMeasuredHeight() - yv1Var.A0.getPaddingBottom();
                        if (rc2Var.n1) {
                        }
                        if (rc2Var.M2()) {
                        }
                        if (rc2Var.getTransitionParams().l2) {
                        }
                        if (!z6) {
                        }
                        if (rc2Var.j()) {
                        }
                        if (layoutHeight - gm.L(48.0f) < paddingTop) {
                        }
                        if (!rc2Var.n()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (rc2Var instanceof rc2) {
                        }
                        if (z5) {
                        }
                        if (rc2Var.a()) {
                        }
                        if (z5) {
                        }
                        if (yv1Var.n7() <= 0.0f) {
                        }
                        avatarImage.h(canvas, null);
                        canvas.restore();
                        if (!z6) {
                        }
                        if (view.getTranslationY() != f3) {
                        }
                        return z4;
                    }
                }
                z5 = false;
                if (yv1Var.A0.W1) {
                }
                paddingTop = view.getPaddingTop() + (!z6 ? view.getTop() : (int) view.getY());
                if (rc2Var.n()) {
                }
                z4 = z3;
                rc2Var3 = rc2Var2;
                f4 = 1.0f;
                checkBoxTranslation = rc2Var.getCheckBoxTranslation() + rc2Var.getSlidingOffsetX();
                layoutHeight = (int) (rc2Var3.getLayoutHeight() + rc2Var3.getTransitionParams().j0 + ((int) (rc2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                int measuredHeight222 = yv1Var.A0.getMeasuredHeight() - yv1Var.A0.getPaddingBottom();
                if (rc2Var.n1) {
                }
                if (rc2Var.M2()) {
                }
                if (rc2Var.getTransitionParams().l2) {
                }
                if (!z6) {
                }
                if (rc2Var.j()) {
                }
                if (layoutHeight - gm.L(48.0f) < paddingTop) {
                }
                if (!rc2Var.n()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (rc2Var instanceof rc2) {
                }
                if (z5) {
                }
                if (rc2Var.a()) {
                }
                if (z5) {
                }
                if (yv1Var.n7() <= 0.0f) {
                }
                avatarImage.h(canvas, null);
                canvas.restore();
                if (!z6) {
                }
                if (view.getTranslationY() != f3) {
                }
                return z4;
            }
        }
        z4 = z3;
        f3 = 0.0f;
        if (view.getTranslationY() != f3) {
        }
        return z4;
    }

    @Override // r59
    public final void k1(View view, float f, float f2, boolean z) {
        f47 currentMessagesGroup;
        super.k1(view, f, f2, z);
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            k47 messageObject = rc2Var.getMessageObject();
            if (messageObject.I3() || messageObject.U2() || (currentMessagesGroup = rc2Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != view && (childAt instanceof rc2)) {
                    rc2 rc2Var2 = (rc2) childAt;
                    if (rc2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        rc2Var2.setPressed(z);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        int i;
        vd2 vd2Var;
        int i2;
        float f3;
        int i3;
        String M0;
        String M02;
        String M03;
        int i4;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i5;
        vr1 vr1Var;
        Paint paint;
        Paint paint2;
        float f4;
        float f5;
        float f6;
        xk4 xk4Var;
        float f7;
        float f8;
        Paint paint3;
        float f9;
        Paint paint4;
        Paint paint5;
        float f10;
        float f11;
        Paint paint6;
        ylb ylbVar;
        float f12;
        xk4 xk4Var2;
        float f13;
        int i6;
        Paint paint7;
        super.onDraw(canvas);
        yv1 yv1Var = this.G3;
        View view = yv1Var.v9;
        if (view != null) {
            float slidingOffsetX = view instanceof rc2 ? ((rc2) view).getSlidingOffsetX() : view instanceof cm1 ? ((cm1) view).getWalletSlidingOffset() : 0.0f;
            if (!yv1Var.w9 && !yv1Var.C9 && this.r3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f14 = ((currentTimeMillis - this.p3) / 180.0f) + this.q3;
                this.q3 = f14;
                if (f14 > 1.0f) {
                    this.q3 = 1.0f;
                    f14 = 1.0f;
                }
                this.p3 = currentTimeMillis;
                float interpolation = (1.0f - gm.F.getInterpolation(f14)) * this.r3;
                if (interpolation == 0.0f) {
                    this.r3 = 0.0f;
                }
                View view2 = yv1Var.v9;
                if (view2 instanceof rc2) {
                    D1((rc2) view2, interpolation);
                }
                yv1Var.Bc(interpolation);
                k47 q7 = yv1Var.q7();
                if (q7 != null && (q7.g4() || k47.K4(q7.k))) {
                    yv1Var.vd(false, false);
                }
                float f15 = this.q3;
                if (f15 == 1.0f || f15 == 0.0f) {
                    yv1Var.Bc(0.0f);
                    yv1Var.v9 = null;
                }
                invalidate();
            }
            if (yv1Var.v9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint X0 = X0("paintChatActionBackground");
                Paint paint8 = cmb.g2;
                Paint paint9 = this.u3;
                if (paint9.getColor() != X0.getColor()) {
                    paint9.setColor(X0.getColor());
                }
                Paint paint10 = this.v3;
                if (paint10.getColor() != paint8.getColor()) {
                    paint10.setColor(paint8.getColor());
                }
                if (paint9.getShader() != X0.getShader()) {
                    paint9.setShader(X0.getShader());
                }
                if (paint10.getShader() != paint8.getShader()) {
                    paint10.setShader(paint8.getShader());
                }
                xk4 xk4Var3 = this.y3;
                float f16 = xk4Var3.a;
                f = 255.0f;
                float f17 = this.t3;
                float f18 = f16 / f17;
                f2 = 2.0f;
                int color = paint10.getColor();
                if (f18 > 1.0f) {
                    this.C3 = true;
                }
                View view3 = yv1Var.v9;
                i = 2;
                float U1 = view3 instanceof rc2 ? ((rc2) view3).U1(false) : view3 instanceof cm1 ? ((cm1) view3).getWalletSlidingOffset() : 0.0f;
                xk4 xk4Var4 = this.w3;
                float f19 = xk4Var4.a;
                xk4 xk4Var5 = this.A3;
                zna znaVar = this.B3;
                zna znaVar2 = this.z3;
                if (f19 == 0.0f) {
                    znaVar2.d();
                    paint = X0;
                    paint2 = paint8;
                    znaVar2.m.i = 0.0d;
                    xk4Var3.a = 0.0f;
                    znaVar.d();
                    znaVar.m.i = 0.0d;
                    xk4Var5.a = 0.0f;
                    this.C3 = false;
                } else {
                    paint = X0;
                    paint2 = paint8;
                }
                if (((float) znaVar2.m.i) != f17) {
                    f4 = 1.0f;
                    f5 = pqe.a(((-U1) - gm.L(20.0f)) / gm.L(30.0f), 0.0f, 1.0f);
                } else {
                    f4 = 1.0f;
                    f5 = 1.0f;
                }
                if (f5 == f4) {
                    aoa aoaVar = znaVar2.m;
                    f6 = 20.0f;
                    xk4Var = xk4Var5;
                    if (((float) aoaVar.i) != f17) {
                        double d = f17;
                        aoaVar.i = d;
                        znaVar2.h();
                        znaVar.m.i = d;
                        znaVar.h();
                    }
                } else {
                    f6 = 20.0f;
                    xk4Var = xk4Var5;
                }
                float f20 = U1 <= ((float) (-gm.L(f6))) ? f17 : 0.0f;
                zna znaVar3 = this.x3;
                aoa aoaVar2 = znaVar3.m;
                if (f20 != ((float) aoaVar2.i)) {
                    aoaVar2.i = f20;
                    if (!znaVar3.f) {
                        znaVar3.h();
                    }
                }
                float f21 = xk4Var4.a / f17;
                k47 q72 = yv1Var.q7();
                float measuredWidth = (U1 * ((q72 == null || !q72.N3()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (yv1Var.v9.getMeasuredHeight() / 2.0f) + yv1Var.v9.getTop();
                if (this.C3) {
                    f8 = f18;
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f - f18;
                    f8 = f21;
                }
                int i7 = cmb.c6;
                ylb ylbVar2 = this.o2;
                boolean z = on2.h(cmb.v0(i7, ylbVar2)) <= 0.5d;
                if (f21 != 0.0f) {
                    RectF rectF = gm.P;
                    xk4 xk4Var6 = xk4Var;
                    rectF.set((int) ((paint9.getStrokeWidth() / 2.0f) + (measuredWidth - (gm.L(16.0f) * f8))), (int) ((paint9.getStrokeWidth() / 2.0f) + (measuredHeight - (gm.L(16.0f) * f8))), (int) (((gm.L(16.0f) * f8) + measuredWidth) - (paint9.getStrokeWidth() / 2.0f)), (int) (((gm.L(16.0f) * f8) + measuredHeight) - (paint9.getStrokeWidth() / 2.0f)));
                    cmb.q(0.0f, getY() + rectF.top, getMeasuredWidth(), gm.q.y);
                    if (f18 == 0.0f) {
                        int alpha = paint9.getAlpha();
                        paint9.setAlpha((int) (alpha * f21));
                        float f22 = f5 * 360.0f;
                        f9 = f21;
                        paint5 = paint;
                        f11 = f17;
                        ylbVar = ylbVar2;
                        f10 = measuredWidth;
                        paint6 = paint2;
                        f12 = f5;
                        xk4Var2 = xk4Var6;
                        canvas.drawArc(rectF, -90.0f, f22, false, paint9);
                        paint9.setAlpha(alpha);
                        if (yv1Var.Ba.g()) {
                            int alpha2 = paint10.getAlpha();
                            paint4 = paint10;
                            if (z) {
                                paint4.setColor(-1);
                            }
                            paint4.setAlpha((int) (alpha2 * f9));
                            paint3 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f22, false, paint4);
                        } else {
                            paint3 = paint9;
                            paint4 = paint10;
                            canvas2 = canvas;
                        }
                    } else {
                        canvas2 = canvas;
                        paint3 = paint9;
                        f9 = f21;
                        paint4 = paint10;
                        paint5 = paint;
                        f10 = measuredWidth;
                        f11 = f17;
                        paint6 = paint2;
                        ylbVar = ylbVar2;
                        f12 = f5;
                        xk4Var2 = xk4Var6;
                    }
                } else {
                    canvas2 = canvas;
                    paint3 = paint9;
                    f9 = f21;
                    paint4 = paint10;
                    paint5 = paint;
                    f10 = measuredWidth;
                    f11 = f17;
                    paint6 = paint2;
                    ylbVar = ylbVar2;
                    f12 = f5;
                    xk4Var2 = xk4Var;
                }
                RectF rectF2 = gm.P;
                rectF2.set((int) (f10 - (gm.L(16.0f) * f8)), (int) (measuredHeight - (gm.L(16.0f) * f8)), (int) ((gm.L(16.0f) * f8) + f10), (int) ((gm.L(16.0f) * f8) + measuredHeight));
                int measuredWidth2 = getMeasuredWidth();
                Point point = gm.q;
                cmb.q(0.0f, getY() + rectF2.top, measuredWidth2, point.y);
                Path path = this.D3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, gm.L(16.0f) * f8, gm.L(16.0f) * f8, direction);
                int alpha3 = paint5.getAlpha();
                float f23 = 0.6f * f9 * f12;
                int i8 = (int) (alpha3 * f23);
                Paint paint11 = paint5;
                paint11.setAlpha(i8);
                canvas2.drawPath(path, paint11);
                paint11.setAlpha(alpha3);
                if (yv1Var.Ba.g()) {
                    int alpha4 = cmb.g2.getAlpha();
                    if (z) {
                        f13 = f7;
                        cmb.g2.setColor(-1);
                    } else {
                        f13 = f7;
                    }
                    cmb.g2.setAlpha((int) (alpha4 * f23));
                    canvas2.drawPath(path, cmb.g2);
                    cmb.g2.setAlpha(alpha4);
                } else {
                    f13 = f7;
                }
                int i9 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                if (i9 != 0) {
                    i6 = i9;
                    paint7 = paint6;
                    rectF2.set((int) (f10 - (gm.L(16.0f) * f13)), (int) (measuredHeight - (gm.L(16.0f) * f13)), (int) ((gm.L(16.0f) * f13) + f10), (int) ((gm.L(16.0f) * f13) + measuredHeight));
                    path.rewind();
                    path.addRoundRect(rectF2, gm.L(16.0f), gm.L(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i6 = i9;
                    paint7 = paint6;
                }
                rectF2.set((int) (f10 - (gm.L(16.0f) * f8)), (int) (measuredHeight - (gm.L(16.0f) * f8)), (int) ((gm.L(16.0f) * f8) + f10), (int) ((gm.L(16.0f) * f8) + measuredHeight));
                cmb.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                path.rewind();
                path.addRoundRect(rectF2, gm.L(16.0f) * f8, gm.L(16.0f) * f8, direction);
                int alpha5 = paint11.getAlpha();
                float f24 = 0.4f * f9;
                paint11.setAlpha((int) (alpha5 * f24));
                canvas2.drawPath(path, paint11);
                paint11.setAlpha(alpha5);
                if (yv1Var.Ba.g()) {
                    int alpha6 = cmb.g2.getAlpha();
                    if (z) {
                        cmb.g2.setColor(-1);
                    }
                    cmb.g2.setAlpha((int) (f24 * alpha6));
                    canvas2.drawPath(path, cmb.g2);
                    cmb.g2.setAlpha(alpha6);
                }
                if (i6 != 0) {
                    canvas2.restore();
                }
                float f25 = xk4Var2.a / f11;
                if (f25 != 0.0f && f25 != 1.0f) {
                    float f26 = f25 + 1.0f;
                    float strokeWidth = paint3.getStrokeWidth();
                    float f27 = (1.0f - f25) * strokeWidth;
                    if (f27 != 0.0f) {
                        rectF2.set((int) ((f10 - (gm.L(16.0f) * f26)) + f27), (int) ((measuredHeight - (gm.L(16.0f) * f26)) + f27), (int) (((gm.L(16.0f) * f26) + f10) - f27), (int) (((gm.L(16.0f) * f26) + measuredHeight) - f27));
                        cmb.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                        int alpha7 = paint3.getAlpha();
                        paint3.setAlpha((int) (alpha7 * f9));
                        paint3.setStrokeWidth(f27);
                        canvas2.drawRoundRect(rectF2, gm.L(16.0f) * f26, gm.L(16.0f) * f26, paint3);
                        paint3.setStrokeWidth(strokeWidth);
                        paint3.setAlpha(alpha7);
                        if (yv1Var.Ba.g()) {
                            int alpha8 = paint4.getAlpha();
                            if (z) {
                                paint4.setColor(-1);
                            }
                            paint4.setAlpha((int) (alpha8 * f9));
                            paint4.setStrokeWidth(f27);
                            canvas2.drawRoundRect(rectF2, gm.L(16.0f) * f26, gm.L(16.0f) * f26, paint4);
                            paint4.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i10 = (int) (f9 * 255.0f);
                Drawable drawable = ylbVar != null ? ylbVar.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = cmb.P0("drawableReplyIcon");
                }
                drawable.setAlpha(i10);
                drawable.setBounds((int) (f10 - ((drawable.getIntrinsicWidth() / 2) * f8)), (int) (measuredHeight - ((drawable.getIntrinsicHeight() / 2) * f8)), (int) (((drawable.getIntrinsicWidth() / 2) * f8) + f10), (int) (((drawable.getIntrinsicHeight() / 2) * f8) + measuredHeight));
                drawable.draw(canvas2);
                drawable.setAlpha(nm7.d4);
                paint4.setColor(color);
                paint7.setColor(color);
                if (yv1Var.ka != 0.0f || yv1Var.isInPreviewMode() || yv1Var.mb || (i2 = yv1Var.g4) == 3 || i2 == 1) {
                    vd2Var = yv1Var.ma;
                    if (vd2Var == null) {
                        vd2Var.P = 0.0f;
                        vd2Var.O = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (yv1Var.ra != 0.0f) {
                    float measuredHeight2 = yv1Var.A0.getMeasuredHeight() - yv1Var.ka;
                    yv1 yv1Var2 = yv1Var.qa;
                    f3 = (measuredHeight2 + (yv1Var2 == null ? 0.0f : yv1Var2.la)) * yv1Var.ra;
                } else {
                    f3 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - yv1Var.Ya) - f3);
                if (yv1Var.ma == null) {
                    i5 = ((d) yv1Var).currentAccount;
                    vd2 vd2Var2 = new vd2(i5, yv1Var.fragmentView, yv1Var.l6, yv1Var.Ra, yv1Var.Sa, yv1Var.d(), yv1Var.Ba);
                    yv1Var.ma = vd2Var2;
                    vd2Var2.T = yv1Var.nd.e;
                    ArrayList arrayList = yv1Var.Nb;
                    if (arrayList == null || arrayList.isEmpty()) {
                        boolean z2 = yv1Var.x4;
                        vd2 vd2Var3 = yv1Var.ma;
                        if (z2) {
                            vd2Var3.h();
                        } else {
                            vd2Var3.f();
                        }
                    } else {
                        yv1Var.ma.g((TLRPC.Chat) yv1Var.Nb.get(0));
                    }
                    vd2 vd2Var4 = yv1Var.ma;
                    vd2Var4.G.I();
                    vm vmVar = vd2Var4.l0;
                    if (vmVar != null && (vr1Var = vd2Var4.b0) != null) {
                        vmVar.b(vr1Var);
                    }
                    nm7.f(vd2Var4.f0).b(vd2Var4, i);
                }
                vd2 vd2Var5 = yv1Var.ma;
                int measuredWidth3 = getMeasuredWidth() - (yv1Var.f8() ? gm.L(71.0f) : 0);
                ImageReceiver imageReceiver = vd2Var5.G;
                TextPaint textPaint = vd2Var5.f;
                TextPaint textPaint2 = vd2Var5.h;
                boolean z3 = vd2Var5.Y;
                if (measuredWidth3 != vd2Var5.c || (z3 && (tL_forumTopic = vd2Var5.I) != null && vd2Var5.J != tL_forumTopic.id)) {
                    vd2Var5.d = gm.L(56.0f) / f2;
                    vd2Var5.c = measuredWidth3;
                    TLRPC.Chat chat = vd2Var5.H;
                    if (chat != null) {
                        M0 = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = vd2Var5.I;
                        if (tL_forumTopic2 != null) {
                            M0 = tL_forumTopic2.title;
                        } else {
                            if (z3) {
                                i3 = 0;
                                M0 = jb6.a0(null, null, 2131743993, oc7.r1(vd2Var5.f0).L0(Long.valueOf(-vd2Var5.j0)).title);
                            } else {
                                i3 = 0;
                                M0 = jb6.M0(2131743996, null);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) M0, i3, M0.length());
                            vd2Var5.y = measureText;
                            int x = b10.x(60.0f, vd2Var5.c, measureText);
                            vd2Var5.y = x;
                            vd2Var5.s = oya.c(M0, textPaint, x, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, x, 1, true);
                            if (!vd2Var5.W) {
                                M02 = jb6.M0(2131743994, null);
                                M03 = jb6.M0(2131746060, null);
                            } else if (z3) {
                                M02 = jb6.M0(2131743992, null);
                                M03 = jb6.M0(2131746059, null);
                            } else {
                                boolean z4 = vd2Var5.X;
                                if (z4 && (i4 = vd2Var5.a) != vd2Var5.g0 && i4 != 0) {
                                    M02 = jb6.M0(2131743998, null);
                                    M03 = jb6.M0(2131746063, null);
                                } else if (z4) {
                                    M02 = jb6.M0(2131743995, null);
                                    M03 = jb6.M0(2131746061, null);
                                } else {
                                    M02 = jb6.M0(2131743997, null);
                                    M03 = jb6.M0(2131746062, null);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(M02);
                            vd2Var5.E = measureText2;
                            vd2Var5.E = b10.x(60.0f, vd2Var5.c, measureText2);
                            int i11 = vd2Var5.E;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            vd2Var5.w = new StaticLayout(M02, textPaint2, i11, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(M03);
                            vd2Var5.F = measureText3;
                            vd2Var5.F = b10.x(60.0f, vd2Var5.c, measureText3);
                            vd2Var5.x = new StaticLayout(M03, textPaint2, vd2Var5.F, alignment, 1.0f, 0.0f, false);
                            imageReceiver.i0((vd2Var5.c / f2) - (gm.L(40.0f) / f2), (gm.L(12.0f) + vd2Var5.d) - (gm.L(40.0f) / f2), gm.L(40.0f), gm.L(40.0f));
                            imageReceiver.q0((int) (gm.L(40.0f) / f2));
                            vd2Var5.d0.d(gm.L(28.0f), gm.L(100.0f));
                            if (z3) {
                                vd2Var5.J = vd2Var5.I == null ? 0L : r3.id;
                            }
                        }
                    }
                    i3 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) M0, i3, M0.length());
                    vd2Var5.y = measureText4;
                    int x2 = b10.x(60.0f, vd2Var5.c, measureText4);
                    vd2Var5.y = x2;
                    vd2Var5.s = oya.c(M0, textPaint, x2, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, x2, 1, true);
                    if (!vd2Var5.W) {
                    }
                    int measureText22 = (int) textPaint2.measureText(M02);
                    vd2Var5.E = measureText22;
                    vd2Var5.E = b10.x(60.0f, vd2Var5.c, measureText22);
                    int i112 = vd2Var5.E;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    vd2Var5.w = new StaticLayout(M02, textPaint2, i112, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(M03);
                    vd2Var5.F = measureText32;
                    vd2Var5.F = b10.x(60.0f, vd2Var5.c, measureText32);
                    vd2Var5.x = new StaticLayout(M03, textPaint2, vd2Var5.F, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.i0((vd2Var5.c / f2) - (gm.L(40.0f) / f2), (gm.L(12.0f) + vd2Var5.d) - (gm.L(40.0f) / f2), gm.L(40.0f), gm.L(40.0f));
                    imageReceiver.q0((int) (gm.L(40.0f) / f2));
                    vd2Var5.d0.d(gm.L(28.0f), gm.L(100.0f));
                    if (z3) {
                    }
                }
                float min = Math.min(1.0f, yv1Var.ka / gm.L(110.0f));
                canvas2.translate(yv1Var.f8() ? gm.U1(yv1Var.n7(), gm.L(32.0f), gm.L(71.0f)) : 0.0f, -(yv1Var.u7(izb.c) + yv1Var.U.getInputBubbleHeight() + yv1Var.w.d() + gm.L(10.0f)));
                yv1Var.ma.a(canvas2, yv1Var.A0, min, 1.0f - yv1Var.ra);
                canvas2.restore();
                if (yv1Var.qa != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.A0.getMeasuredWidth(), yv1Var.qa.A0.getMeasuredHeight(), (int) (yv1Var.ra * f), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - yv1Var.ka) - f3);
                    yv1Var.qa.A0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f = 255.0f;
        f2 = 2.0f;
        i = 2;
        if (yv1Var.ka != 0.0f) {
        }
        vd2Var = yv1Var.ma;
        if (vd2Var == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xz8 xz8Var;
        a aVar;
        yv1 yv1Var = this.G3;
        nu1 nu1Var = yv1Var.u9;
        nu1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gm.r(nu1Var.f0);
            nu1Var.z = false;
        }
        if (!this.W1 && ((xz8Var = yv1Var.ua) == null || !xz8Var.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            aVar = ((d) yv1Var).actionBar;
            if (aVar.y() || yv1Var.c8()) {
                return onInterceptTouchEvent;
            }
            C1(motionEvent);
            if (onInterceptTouchEvent || yv1Var.y9) {
                return true;
            }
        }
        return false;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        vr1 vr1Var;
        hu1 hu1Var;
        View view;
        k47 messageObject;
        yv1 yv1Var = this.G3;
        if (yv1Var.ub && yv1Var.tb && getMeasuredHeight() > 0 && getPaddingTop() > 0 && yv1Var.D0 != null) {
            yv1Var.ub = false;
            yv1Var.C0.G = false;
            k47 k47Var = (k47) yv1Var.G6[0].get(yv1Var.vb);
            int indexOf = k47Var != null ? yv1Var.M6.indexOf(k47Var) : -1;
            if (indexOf >= 0) {
                yv1Var.C0.h1(yv1Var.D0.K + indexOf, Math.max(gm.L(50.0f) + yv1Var.h7(k47Var), gm.L(102.0f)), false);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        if (yv1Var.vb != 0 && (vr1Var = yv1Var.A0) != null && (hu1Var = yv1Var.D0) != null && !hu1Var.O && !vr1Var.W1) {
            int childCount = vr1Var.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    view = null;
                    break;
                }
                view = yv1Var.A0.getChildAt(i5);
                if ((view instanceof rc2) && (messageObject = ((rc2) view).getMessageObject()) != null && messageObject.e1() == yv1Var.vb && k47.B0(messageObject.k) == yv1Var.l6) {
                    break;
                } else {
                    i5++;
                }
            }
            int i6 = yv1Var.wb;
            if (view == null) {
                if (i6 != Integer.MIN_VALUE) {
                    yv1Var.vb = 0;
                    yv1Var.wb = TLObject.FLAG_31;
                }
            } else if (i6 != Integer.MIN_VALUE) {
                int top = view.getTop() - i6;
                if (top != 0) {
                    yv1Var.A0.scrollBy(0, top);
                }
            } else if (yv1Var.A0.getPaddingTop() > 0 && !yv1Var.ub) {
                yv1Var.wb = view.getTop();
            }
        }
        int i7 = this.g3;
        int i8 = i3 - i;
        if (i7 != i8) {
            if (i7 != 0) {
                yv1Var.H7(false);
            }
            this.g3 = i8;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            xr1 xr1Var = yv1Var.B0;
            if (xr1Var != null) {
                xr1Var.g();
            }
            yv1Var.o9.e();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        yv1Var.j6 = false;
        nu1 nu1Var = yv1Var.u9;
        if (nu1Var != null && nu1Var.w()) {
            yv1Var.u9.v();
        }
        yv1Var.P7();
        yv1Var.h8();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        vd2 vd2Var;
        yv1 yv1Var = this.G3;
        fn0 fn0Var = yv1Var.nd;
        nu1 nu1Var = yv1Var.u9;
        nu1Var.getClass();
        final byte b = 3;
        final byte b2 = 0;
        final byte b3 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gm.r(nu1Var.f0);
            nu1Var.z = false;
        }
        if (motionEvent.getAction() == 0) {
            yv1Var.Pa = true;
        }
        if (yv1Var.ka != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, yv1Var.ka / gm.L(110.0f));
            final byte b4 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (vd2Var = yv1Var.ma) == null || vd2Var.S) {
                vd2 vd2Var2 = yv1Var.ma;
                if (vd2Var2 != null && vd2Var2.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    vd2 vd2Var3 = yv1Var.ma;
                    if (currentTimeMillis - vd2Var3.V < 500 && vd2Var3.N) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        yv1Var.na = animatorSet;
                        if (yv1Var.ma != null) {
                            fn0Var.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(yv1Var.ka, gm.L(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tr1
                            public final /* synthetic */ vr1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b5 = b3;
                                vr1 vr1Var = this.b;
                                switch (b5) {
                                    case 0:
                                        yv1 yv1Var2 = vr1Var.G3;
                                        yv1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var2.A0.invalidate();
                                        break;
                                    case 1:
                                        yv1 yv1Var3 = vr1Var.G3;
                                        yv1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var3.A0.invalidate();
                                        break;
                                    case 2:
                                        yv1 yv1Var4 = vr1Var.G3;
                                        yv1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var4.A0.invalidate();
                                        break;
                                    default:
                                        yv1 yv1Var5 = vr1Var.G3;
                                        yv1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(d53.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(gm.L(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tr1
                            public final /* synthetic */ vr1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b5 = b4;
                                vr1 vr1Var = this.b;
                                switch (b5) {
                                    case 0:
                                        yv1 yv1Var2 = vr1Var.G3;
                                        yv1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var2.A0.invalidate();
                                        break;
                                    case 1:
                                        yv1 yv1Var3 = vr1Var.G3;
                                        yv1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var3.A0.invalidate();
                                        break;
                                    case 2:
                                        yv1 yv1Var4 = vr1Var.G3;
                                        yv1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var4.A0.invalidate();
                                        break;
                                    default:
                                        yv1 yv1Var5 = vr1Var.G3;
                                        yv1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        yv1Var5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(wb2.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(yv1Var.ka, 0.0f);
                yv1Var.na = ofFloat3;
                if (yv1Var.ma != null) {
                    fn0Var.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tr1
                    public final /* synthetic */ vr1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b;
                        vr1 vr1Var = this.b;
                        switch (b5) {
                            case 0:
                                yv1 yv1Var2 = vr1Var.G3;
                                yv1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var2.A0.invalidate();
                                break;
                            case 1:
                                yv1 yv1Var3 = vr1Var.G3;
                                yv1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var3.A0.invalidate();
                                break;
                            case 2:
                                yv1 yv1Var4 = vr1Var.G3;
                                yv1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var4.A0.invalidate();
                                break;
                            default:
                                yv1 yv1Var5 = vr1Var.G3;
                                yv1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(wb2.V);
                ofFloat3.start();
            } else if (vd2Var.L != 1.0f) {
                float f = yv1Var.ka;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f, gm.L(8.0f) + f);
                yv1Var.na = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tr1
                    public final /* synthetic */ vr1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b2;
                        vr1 vr1Var = this.b;
                        switch (b5) {
                            case 0:
                                yv1 yv1Var2 = vr1Var.G3;
                                yv1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var2.A0.invalidate();
                                break;
                            case 1:
                                yv1 yv1Var3 = vr1Var.G3;
                                yv1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var3.A0.invalidate();
                                break;
                            case 2:
                                yv1 yv1Var4 = vr1Var.G3;
                                yv1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var4.A0.invalidate();
                                break;
                            default:
                                yv1 yv1Var5 = vr1Var.G3;
                                yv1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                yv1Var5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                d53 d53Var = d53.f;
                ofFloat4.setInterpolator(d53Var);
                ofFloat4.start();
                final vd2 vd2Var4 = yv1Var.ma;
                fo1 fo1Var = new fo1(this, (byte) 4);
                AnimatorSet animatorSet2 = vd2Var4.K;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    vd2Var4.K.cancel();
                }
                vd2Var4.Z = fo1Var;
                vd2Var4.K = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(vd2Var4.L, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ud2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b2;
                        vd2 vd2Var5 = vd2Var4;
                        vd2Var5.getClass();
                        switch (b5) {
                            case 0:
                                vd2Var5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vd2Var5.U.invalidate();
                                vr1 vr1Var = vd2Var5.b0;
                                if (vr1Var != null) {
                                    vr1Var.invalidate();
                                    break;
                                }
                                break;
                            default:
                                vd2Var5.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vr1 vr1Var2 = vd2Var5.b0;
                                if (vr1Var2 != null) {
                                    vr1Var2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(vd2Var4.M, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ud2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b3;
                        vd2 vd2Var5 = vd2Var4;
                        vd2Var5.getClass();
                        switch (b5) {
                            case 0:
                                vd2Var5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vd2Var5.U.invalidate();
                                vr1 vr1Var = vd2Var5.b0;
                                if (vr1Var != null) {
                                    vr1Var.invalidate();
                                    break;
                                }
                                break;
                            default:
                                vd2Var5.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vr1 vr1Var2 = vd2Var5.b0;
                                if (vr1Var2 != null) {
                                    vr1Var2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                vd2Var4.K.addListener(new b91((Object) vd2Var4, (byte) 24));
                vd2Var4.K.playTogether(ofFloat5, ofFloat6);
                vd2Var4.K.setDuration(120L);
                vd2Var4.K.setInterpolator(d53Var);
                vd2Var4.K.start();
            } else {
                yv1Var.G4();
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            aVar = ((d) yv1Var).actionBar;
            if (aVar.y() || yv1Var.c8()) {
                return onTouchEvent;
            }
            C1(motionEvent);
            if (yv1Var.C9 || yv1Var.y9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.G3.g9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        al9 f4;
        hyc hycVar;
        super.requestDisallowInterceptTouchEvent(z);
        View view = this.G3.v9;
        if (view != null) {
            if ((view instanceof rc2) && (f4 = ((rc2) view).f4()) != null && (hycVar = f4.e0) != null && f4.f0 && hycVar.w && !hycVar.E) {
                if (!hycVar.x) {
                    return;
                }
                if (!hycVar.y && (hycVar.L & 3) != 1) {
                    return;
                }
            }
            C1(null);
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E3) {
            return;
        }
        hw1 hw1Var = this.G3.Ec;
        if (hw1Var.b != 0) {
            int childCount = hw1Var.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                hw1Var.a.getChildAt(i).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(d69 d69Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(d69Var);
    }

    @Override // r59, android.view.View
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            yv1 yv1Var = this.G3;
            yv1Var.O7();
            yv1Var.Q7();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0459  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z1(Canvas canvas, RectF rectF) {
        int i;
        int i2;
        float f;
        yv1 yv1Var;
        float f2;
        int i3;
        float f3;
        int i4;
        f47 f47Var;
        int i5;
        ArrayList arrayList;
        e47 e47Var;
        boolean z;
        int i6;
        f47 currentMessagesGroup;
        int i7;
        int backgroundDrawableLeft;
        int backgroundDrawableRight;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        a aVar;
        int measuredHeight;
        int i15;
        int i16;
        a aVar2;
        int measuredHeight2;
        vr1 vr1Var = this;
        Canvas canvas2 = canvas;
        int childCount = vr1Var.getChildCount();
        f47 f47Var2 = null;
        int i17 = 0;
        while (true) {
            i = 8;
            i2 = 2;
            f = 0.0f;
            yv1Var = vr1Var.G3;
            if (i17 >= childCount) {
                f2 = 1.0f;
                break;
            }
            View childAt = vr1Var.getChildAt(i17);
            f2 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8 && !yv1Var.Xa(childAt, rectF)) {
                if (childAt instanceof zc2) {
                    canvas2.save();
                    canvas2.translate(childAt.getX(), childAt.getY());
                    ((zc2) childAt).a(canvas2);
                    canvas2.restore();
                } else if (yv1Var.D0.n && (childAt instanceof er0)) {
                    float measuredHeight3 = ((((vr1Var.getMeasuredHeight() - yv1Var.P9) - yv1Var.Ya) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + yv1Var.P9;
                    if (!((er0) childAt).J && !yv1Var.A0.W1) {
                        if (childAt.getTop() > measuredHeight3) {
                            childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                        } else {
                            childAt.setTranslationY(0.0f);
                        }
                    }
                } else if (childAt instanceof h9c) {
                    float measuredHeight4 = ((((vr1Var.getMeasuredHeight() - yv1Var.P9) - yv1Var.Ya) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + yv1Var.P9;
                    if (!((h9c) childAt).P && !yv1Var.A0.W1) {
                        if (childAt.getTop() > measuredHeight4) {
                            childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                        } else {
                            childAt.setTranslationY(0.0f);
                        }
                    }
                } else {
                    if (childAt instanceof rc2) {
                        rc2 rc2Var = (rc2) childAt;
                        f47 currentMessagesGroup2 = rc2Var.getCurrentMessagesGroup();
                        if (currentMessagesGroup2 == null || currentMessagesGroup2 != f47Var2) {
                            c47 currentPosition = rc2Var.getCurrentPosition();
                            f37 backgroundDrawable = rc2Var.getBackgroundDrawable();
                            if ((backgroundDrawable.f || rc2Var.B2()) && (currentPosition == null || (currentPosition.l & 2) != 0)) {
                                boolean z3 = rc2Var.x6;
                                ylb ylbVar = vr1Var.o2;
                                z2 = true;
                                if (z3 || rc2Var.y6) {
                                    i14 = i17;
                                    if (currentPosition == null) {
                                        Paint X0 = vr1Var.X0("paintChatMessageBackgroundSelected");
                                        wv1 wv1Var = yv1Var.Ba;
                                        if ((wv1Var == null || !wv1Var.q) && X0 != null) {
                                            if (yv1Var.Y7()) {
                                                measuredHeight = yv1Var.A0.getTop();
                                            } else {
                                                aVar = ((d) yv1Var).actionBar;
                                                measuredHeight = aVar.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY = measuredHeight - yv1Var.m1.getBackgroundTranslationY();
                                            int backgroundSizeY = yv1Var.m1.getBackgroundSizeY();
                                            wv1 wv1Var2 = yv1Var.Ba;
                                            if (wv1Var2 != null) {
                                                wv1Var2.b(rc2Var.getX(), backgroundTranslationY, vr1Var.getMeasuredWidth(), backgroundSizeY);
                                            } else {
                                                cmb.q(rc2Var.getX(), backgroundTranslationY, vr1Var.getMeasuredWidth(), backgroundSizeY);
                                            }
                                        } else {
                                            X0 = cmb.Z1;
                                            X0.setColor(cmb.v0(cmb.xd, ylbVar));
                                        }
                                        Paint paint = X0;
                                        canvas2.save();
                                        canvas2.translate(0.0f, rc2Var.getTranslationY());
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (rc2Var.getAlpha() * rc2Var.getHighlightAlpha() * alpha));
                                        canvas2.drawRect(0.0f, rc2Var.getTop(), vr1Var.getMeasuredWidth(), rc2Var.getBottom(), paint);
                                        paint.setAlpha(alpha);
                                        canvas2.restore();
                                    }
                                } else {
                                    int y = (int) rc2Var.getY();
                                    canvas2.save();
                                    if (currentPosition == null) {
                                        i15 = rc2Var.getMeasuredHeight();
                                        i14 = i17;
                                    } else {
                                        int measuredHeight5 = rc2Var.getMeasuredHeight() + y;
                                        long j = 0;
                                        float f4 = 0.0f;
                                        int i18 = 0;
                                        while (i18 < childCount) {
                                            View childAt2 = vr1Var.getChildAt(i18);
                                            int i19 = i17;
                                            if (childAt2 instanceof rc2) {
                                                rc2 rc2Var2 = (rc2) childAt2;
                                                if (rc2Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                    f37 backgroundDrawable2 = rc2Var2.getBackgroundDrawable();
                                                    i16 = i18;
                                                    y = Math.min(y, (int) rc2Var2.getY());
                                                    measuredHeight5 = Math.max(measuredHeight5, rc2Var2.getMeasuredHeight() + ((int) rc2Var2.getY()));
                                                    long j2 = backgroundDrawable2.l;
                                                    if (j2 > j) {
                                                        j = j2;
                                                        f = rc2Var2.getX() + backgroundDrawable2.h;
                                                        f4 = rc2Var2.getY() + backgroundDrawable2.i;
                                                    }
                                                    i18 = i16 + 1;
                                                    i17 = i19;
                                                }
                                            }
                                            i16 = i18;
                                            i18 = i16 + 1;
                                            i17 = i19;
                                        }
                                        i14 = i17;
                                        backgroundDrawable.j = f;
                                        backgroundDrawable.k = f4 - y;
                                        i15 = measuredHeight5 - y;
                                    }
                                    int i20 = i15 + y;
                                    canvas2.clipRect(0, y, vr1Var.getMeasuredWidth(), i20);
                                    Paint X02 = vr1Var.X0("paintChatMessageBackgroundSelected");
                                    wv1 wv1Var3 = yv1Var.Ba;
                                    if (wv1Var3 == null || wv1Var3.q || X02 == null) {
                                        backgroundDrawable.b = null;
                                        backgroundDrawable.a.setColor(cmb.v0(cmb.xd, ylbVar));
                                    } else {
                                        backgroundDrawable.b = X02;
                                        if (yv1Var.Y7()) {
                                            measuredHeight2 = yv1Var.A0.getTop();
                                        } else {
                                            aVar2 = ((d) yv1Var).actionBar;
                                            measuredHeight2 = aVar2.getMeasuredHeight();
                                        }
                                        float backgroundTranslationY2 = measuredHeight2 - yv1Var.m1.getBackgroundTranslationY();
                                        int backgroundSizeY2 = yv1Var.m1.getBackgroundSizeY();
                                        wv1 wv1Var4 = yv1Var.Ba;
                                        if (wv1Var4 != null) {
                                            wv1Var4.b(rc2Var.getX(), backgroundTranslationY2, vr1Var.getMeasuredWidth(), backgroundSizeY2);
                                        } else {
                                            cmb.q(rc2Var.getX(), backgroundTranslationY2, vr1Var.getMeasuredWidth(), backgroundSizeY2);
                                        }
                                    }
                                    backgroundDrawable.setBounds(0, y, vr1Var.getMeasuredWidth(), i20);
                                    backgroundDrawable.draw(canvas2);
                                    canvas2.restore();
                                }
                            } else {
                                i14 = i17;
                                z2 = true;
                            }
                            f47Var2 = currentMessagesGroup2;
                        } else {
                            i14 = i17;
                            z2 = true;
                        }
                        if (yv1Var.Z8 != rc2Var && currentMessagesGroup2 == null && rc2Var.L0()) {
                            canvas2.save();
                            canvas2.translate(rc2Var.getX(), rc2Var.getY() + rc2Var.getPaddingTop());
                            if (rc2Var.getScaleX() != 1.0f) {
                                canvas2.scale(rc2Var.getScaleX(), rc2Var.getScaleY(), rc2Var.getPivotX(), rc2Var.getHeight() >> 1);
                            }
                            rc2Var.M0(canvas2, z2, false);
                            canvas2.restore();
                        }
                    } else {
                        i14 = i17;
                        if (childAt instanceof cm1) {
                            cm1 cm1Var = (cm1) childAt;
                            if (cm1Var.Q()) {
                                canvas2.save();
                                canvas2.translate(cm1Var.getX(), cm1Var.getY() + cm1Var.getPaddingTop());
                                canvas2.scale(cm1Var.getScaleX(), cm1Var.getScaleY(), cm1Var.getMeasuredWidth() / 2.0f, cm1Var.getMeasuredHeight() / 2.0f);
                                canvas2.translate(yv1Var.o7() / 2.0f, 0.0f);
                                cm1Var.F(canvas2, true);
                                cm1Var.I(canvas2, true);
                                canvas2.restore();
                            }
                        }
                    }
                    i17 = i14 + 1;
                }
            }
            i14 = i17;
            i17 = i14 + 1;
        }
        View view = yv1Var.Z8;
        f47 currentMessagesGroup3 = view instanceof rc2 ? ((rc2) view).getCurrentMessagesGroup() : null;
        int i21 = 0;
        while (i21 < 3) {
            ArrayList arrayList2 = vr1Var.l3;
            arrayList2.clear();
            if (i21 != i2 || yv1Var.A0.W1) {
                int i22 = 0;
                while (i22 < childCount) {
                    View childAt3 = yv1Var.A0.getChildAt(i22);
                    if (childAt3 instanceof rc2) {
                        rc2 rc2Var3 = (rc2) childAt3;
                        if (childAt3.getY() <= yv1Var.A0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f && rc2Var3.getVisibility() != i && (currentMessagesGroup = rc2Var3.getCurrentMessagesGroup()) != null) {
                            e47 e47Var2 = currentMessagesGroup.m;
                            if (i21 == 0) {
                                i6 = i;
                                i7 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i22++;
                                    i = i6;
                                    i2 = 2;
                                    f = 0.0f;
                                }
                            } else {
                                i6 = i;
                                i7 = 1;
                            }
                            if ((i21 != i7 || e47Var2.i) && ((i21 != 0 || !rc2Var3.getMessageObject().Z) && (i21 != 1 || rc2Var3.getMessageObject().Z))) {
                                boolean z4 = rc2Var3.La;
                                if (i21 == i2) {
                                    if (!z4) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                        e47Var2.a = 0;
                                        e47Var2.b = 0;
                                        e47Var2.c = 0;
                                        e47Var2.d = 0;
                                        e47Var2.l = false;
                                        e47Var2.k = false;
                                        e47Var2.m = rc2Var3;
                                        arrayList2.add(currentMessagesGroup);
                                    }
                                    e47Var2.k = rc2Var3.L2();
                                    e47Var2.l = rc2Var3.K2();
                                    backgroundDrawableLeft = rc2Var3.getBackgroundDrawableLeft() + rc2Var3.getLeft();
                                    backgroundDrawableRight = rc2Var3.getBackgroundDrawableRight() + rc2Var3.getLeft();
                                    int backgroundDrawableTop = rc2Var3.getBackgroundDrawableTop() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                    int backgroundDrawableBottom = rc2Var3.getBackgroundDrawableBottom() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                    if ((rc2Var3.getCurrentPosition().l & 4) == 0) {
                                        backgroundDrawableTop -= gm.L(10.0f);
                                    }
                                    i8 = backgroundDrawableTop;
                                    if ((rc2Var3.getCurrentPosition().l & 8) == 0) {
                                        backgroundDrawableBottom = gm.L(10.0f) + backgroundDrawableBottom;
                                    }
                                    i9 = backgroundDrawableBottom;
                                    if (rc2Var3.La) {
                                        e47Var2.m = rc2Var3;
                                    }
                                    i10 = e47Var2.b;
                                    if (i10 != 0 || i8 < i10) {
                                        e47Var2.b = i8;
                                    }
                                    i11 = e47Var2.d;
                                    if (i11 != 0 || i9 > i11) {
                                        e47Var2.d = i9;
                                    }
                                    i12 = e47Var2.a;
                                    if (i12 != 0 || backgroundDrawableLeft < i12) {
                                        e47Var2.a = backgroundDrawableLeft;
                                    }
                                    i13 = e47Var2.c;
                                    if (i13 != 0 || backgroundDrawableRight > i13) {
                                        e47Var2.c = backgroundDrawableRight;
                                    }
                                } else {
                                    if (z4) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                    }
                                    e47Var2.k = rc2Var3.L2();
                                    e47Var2.l = rc2Var3.K2();
                                    backgroundDrawableLeft = rc2Var3.getBackgroundDrawableLeft() + rc2Var3.getLeft();
                                    backgroundDrawableRight = rc2Var3.getBackgroundDrawableRight() + rc2Var3.getLeft();
                                    int backgroundDrawableTop2 = rc2Var3.getBackgroundDrawableTop() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                    int backgroundDrawableBottom2 = rc2Var3.getBackgroundDrawableBottom() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                    if ((rc2Var3.getCurrentPosition().l & 4) == 0) {
                                    }
                                    i8 = backgroundDrawableTop2;
                                    if ((rc2Var3.getCurrentPosition().l & 8) == 0) {
                                    }
                                    i9 = backgroundDrawableBottom2;
                                    if (rc2Var3.La) {
                                    }
                                    i10 = e47Var2.b;
                                    if (i10 != 0) {
                                    }
                                    e47Var2.b = i8;
                                    i11 = e47Var2.d;
                                    if (i11 != 0) {
                                    }
                                    e47Var2.d = i9;
                                    i12 = e47Var2.a;
                                    if (i12 != 0) {
                                    }
                                    e47Var2.a = backgroundDrawableLeft;
                                    i13 = e47Var2.c;
                                    if (i13 != 0) {
                                    }
                                    e47Var2.c = backgroundDrawableRight;
                                }
                            }
                            i22++;
                            i = i6;
                            i2 = 2;
                            f = 0.0f;
                        }
                    }
                    i6 = i;
                    i22++;
                    i = i6;
                    i2 = 2;
                    f = 0.0f;
                }
                i3 = i;
                int i23 = 0;
                while (i23 < arrayList2.size()) {
                    f47 f47Var3 = (f47) arrayList2.get(i23);
                    e47 e47Var3 = f47Var3.m;
                    ArrayList arrayList3 = f47Var3.d;
                    float U1 = e47Var3.m.U1(true);
                    float f5 = e47Var3.a + U1 + e47Var3.e;
                    float f6 = e47Var3.b + e47Var3.f;
                    float f7 = e47Var3.g + e47Var3.c + U1;
                    float f8 = e47Var3.d + e47Var3.h;
                    if (!e47Var3.j) {
                        f6 += e47Var3.m.getTranslationY();
                        f8 += e47Var3.m.getTranslationY();
                    }
                    float f9 = f6;
                    if (f8 > gm.L(20.0f) + yv1Var.A0.getMeasuredHeight()) {
                        f8 = gm.L(20.0f) + yv1Var.A0.getMeasuredHeight();
                    }
                    boolean z5 = (e47Var3.m.getScaleX() == f2 && e47Var3.m.getScaleY() == f2) ? false : true;
                    if (z5) {
                        canvas2.save();
                        f47Var = f47Var3;
                        i5 = i21;
                        arrayList = arrayList2;
                        canvas2.scale(e47Var3.m.getScaleX(), e47Var3.m.getScaleY(), aq1.z(f7, f5, 2.0f, f5), aq1.z(f8, f9, 2.0f, f9));
                    } else {
                        f47Var = f47Var3;
                        i5 = i21;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            e47Var = e47Var3;
                            z = true;
                            break;
                        }
                        k47 k47Var = (k47) arrayList3.get(i24);
                        e47Var = e47Var3;
                        if (yv1Var.o6[k47.B0(k47Var.k) == yv1Var.l6 ? (char) 0 : (char) 1].indexOfKey(k47Var.e1()) < 0) {
                            z = false;
                            break;
                        } else {
                            i24++;
                            e47Var3 = e47Var;
                        }
                    }
                    float f10 = f8;
                    yv1 yv1Var2 = yv1Var;
                    boolean z6 = z;
                    f47 f47Var4 = f47Var;
                    e47Var.m.K0(canvas, (int) f5, (int) f9, (int) f7, (int) f8, e47Var.k, e47Var.l, z6, 0);
                    if (f47Var4 != currentMessagesGroup3) {
                        e47Var.m = null;
                    }
                    e47Var.o = f47Var4.c;
                    if (z5) {
                        canvas.restore();
                        for (int i25 = 0; i25 < childCount; i25++) {
                            View childAt4 = yv1Var2.A0.getChildAt(i25);
                            if (childAt4 instanceof rc2) {
                                rc2 rc2Var4 = (rc2) childAt4;
                                if (rc2Var4.getCurrentMessagesGroup() == f47Var4) {
                                    int left = rc2Var4.getLeft();
                                    int top = rc2Var4.getTop();
                                    childAt4.setPivotX(((f7 - f5) / 2.0f) + (f5 - left));
                                    childAt4.setPivotY(((f10 - f9) / 2.0f) + (f9 - top));
                                }
                            }
                        }
                    }
                    i23++;
                    canvas2 = canvas;
                    yv1Var = yv1Var2;
                    i21 = i5;
                    arrayList2 = arrayList;
                }
                f3 = 0.0f;
                i4 = 2;
            } else {
                i3 = i;
                i4 = i2;
                f3 = f;
            }
            canvas2 = canvas;
            yv1Var = yv1Var;
            i = i3;
            f = f3;
            i2 = i4;
            i21++;
            vr1Var = this;
        }
    }
}
