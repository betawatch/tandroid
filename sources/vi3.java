// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vi3 extends cja {
    public final Paint m0;
    public int n0;
    public int o0;
    public int p0;
    public VelocityTracker q0;
    public final Rect r0;
    public boolean s0;
    public final hi2 t0;
    public final /* synthetic */ cj3 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi3(cj3 cj3Var, Context context) {
        super(context, null);
        this.u0 = cj3Var;
        this.m0 = new Paint(1);
        this.r0 = new Rect();
        this.t0 = new hi2(new gi3(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r13.a() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r13 = kk7.H2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r13 = kk7.s3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (bkb.I.o() == false) goto L17;
     */
    @Override // cja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        int i;
        wjb wjbVar;
        wjb wjbVar2;
        int i2;
        wjb wjbVar3;
        if (Build.VERSION.SDK_INT >= 29 && gba.f()) {
            cj3 cj3Var = this.u0;
            if (cj3Var.p4 != null) {
                i = ((d) cj3Var).currentAccount;
                wjbVar = ((d) cj3Var).resourceProvider;
                if (nod.d(i, wjbVar)) {
                    wjbVar2 = ((d) cj3Var).resourceProvider;
                    if (wjbVar2 != null) {
                        wjbVar3 = ((d) cj3Var).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f);
                    cj3Var.p4.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(i2);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override // cja
    public final void J(Canvas canvas, ArrayList arrayList) {
        hi3 hi3Var;
        o39 o;
        cj3 cj3Var = this.u0;
        if (cj3Var.s3 && (hi3Var = cj3Var.D0) != null && hi3Var.getVisibility() == 0) {
            hi3 hi3Var2 = cj3Var.D0;
            View[] viewArr = hi3Var2.e;
            for (int i = 0; i < viewArr.length; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0 && (o = wec.o(viewArr[i])) != null) {
                    for (int i2 = 0; i2 < o.getChildCount(); i2++) {
                        View childAt = o.getChildAt(i2);
                        if (childAt.getY() < gl.L(100.0f) + gl.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i].getX(), childAt.getY() + o.getY() + viewArr[i].getY() + hi3Var2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // cja
    public final void K() {
        qw4 qw4Var;
        super.K();
        qw4Var = ((d) this.u0).glassEngine;
        qw4Var.g();
    }

    @Override // cja
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        cj3 cj3Var = this.u0;
        if (!cj3Var.j3) {
            return false;
        }
        boolean z = cj3Var.m3;
        bj3[] bj3VarArr = cj3Var.f0;
        if (!z) {
            if (Math.abs(bj3VarArr[1].getTranslationX()) < 1.0f) {
                cj3Var.f0[0].setTranslationX(r0.getMeasuredWidth() * (cj3Var.k3 ? -1 : 1));
                cj3Var.f0[1].setTranslationX(0.0f);
                cj3Var.f5(true);
                animatorSet = cj3Var.i3;
                if (animatorSet != null) {
                }
                cj3Var.j3 = false;
            }
            return cj3Var.j3;
        }
        if (Math.abs(bj3VarArr[0].getTranslationX()) < 1.0f) {
            cj3Var.f0[0].setTranslationX(0.0f);
            cj3Var.f0[1].setTranslationX(r0[0].getMeasuredWidth() * (cj3Var.k3 ? 1 : -1));
            cj3Var.f5(true);
            animatorSet = cj3Var.i3;
            if (animatorSet != null) {
                animatorSet.cancel();
                cj3Var.i3 = null;
            }
            cj3Var.j3 = false;
        }
        return cj3Var.j3;
    }

    public final int Y() {
        a aVar;
        cj3 cj3Var = this.u0;
        aVar = ((d) cj3Var).actionBar;
        float height = aVar.getHeight();
        rh3 rh3Var = cj3Var.H3;
        float f = (rh3Var == null || !rh3Var.c()) ? 0.0f : cj3Var.H3.e;
        if (cj3Var.L) {
            height = tb4.A(1.0f, cj3Var.w3, (1.0f - f) * (1.0f - cj3Var.z1) * gl.L(81.0f), height);
        }
        return (int) tb4.A(1.0f, f, (1.0f - cj3Var.z1) * (1.0f - cj3Var.w3) * gl.L(48.0f), height + cj3Var.U);
    }

    public final int Z() {
        cj3 cj3Var = this.u0;
        float f = cj3Var.O;
        rh3 rh3Var = cj3Var.H3;
        return (int) tb4.A(1.0f, cj3Var.z1, tb4.z(1.0f, (rh3Var == null || !rh3Var.c()) ? 0.0f : cj3Var.H3.e, 1.0f - cj3Var.w3, f), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z) {
        a aVar;
        cj3 cj3Var = this.u0;
        qi3 qi3Var = cj3Var.A0;
        int i = qi3Var.k0.get(qi3Var.L + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        cj3Var.p3 = false;
        cj3Var.o3 = true;
        this.o0 = (int) (motionEvent.getX() + cj3Var.l3);
        aVar = ((d) cj3Var).actionBar;
        aVar.setEnabled(false);
        cj3Var.A0.setEnabled(false);
        bj3 bj3Var = cj3Var.f0[1];
        bj3Var.h = i;
        bj3Var.setVisibility(0);
        cj3Var.k3 = z;
        cj3Var.f5(false);
        cj3Var.j5(true);
        bj3[] bj3VarArr = cj3Var.f0;
        if (z) {
            bj3VarArr[1].setTranslationX(bj3VarArr[0].getMeasuredWidth());
            return true;
        }
        bj3VarArr[1].setTranslationX(-bj3VarArr[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r1 == 1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0200  */
    @Override // cja, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        qw4 qw4Var;
        boolean z;
        float f;
        boolean z2;
        Canvas canvas2;
        rh3 rh3Var;
        pi3 pi3Var;
        float f2;
        sb sbVar;
        float alpha;
        float f3;
        pi3 pi3Var2;
        float f4;
        a aVar;
        rh3 rh3Var2;
        cj3 cj3Var = this.u0;
        Paint paint = cj3Var.h1;
        qw4Var = ((d) cj3Var).glassEngine;
        qw4Var.g();
        if (cj3Var.R && (((rh3Var2 = cj3Var.H3) == null || !rh3Var2.c()) && cj3Var.w3 == 0.0f)) {
            cj3Var.R = false;
            int i = (cj3Var.w3() && cj3Var.f0[0].s == 0) ? 1 : 0;
            yi3 yi3Var = cj3Var.f0[0].a;
            boolean z3 = cj3Var.S;
            if (z3) {
                if (!cj3Var.d1) {
                    if (i == 0) {
                        cj3Var.S = false;
                        z3 = false;
                    }
                    if (z3) {
                        s49 L = yi3Var.L(0, false);
                        if (L == null) {
                            cj3Var.S = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= yi3Var.getPaddingTop() - gl.L(81.0f)) {
                                cj3Var.S = false;
                            } else if (view.getTop() >= yi3Var.getPaddingTop()) {
                                cj3Var.S = false;
                            }
                        }
                        if (cj3Var.S) {
                        }
                    }
                }
                i = 0;
            }
            s49 L2 = yi3Var.L(i, false);
            if (L2 != null) {
                float paddingTop = yi3Var.getPaddingTop() - L2.a.getTop();
                if (paddingTop >= 0.0f) {
                    float f5 = -paddingTop;
                    float f6 = -cj3Var.o3();
                    if (f5 < f6) {
                        f5 = f6;
                    } else if (f5 > 0.0f) {
                        f5 = 0.0f;
                    }
                    cj3Var.S4(f5);
                } else {
                    cj3Var.S4(0.0f);
                }
            } else {
                cj3Var.S4(-cj3Var.o3());
            }
        }
        int Y = Y();
        z = ((d) cj3Var).inPreviewMode;
        int Z = z ? gl.m : Z();
        int i2 = Z + Y;
        cj3Var.H3.setCurrentTop(i2);
        boolean z4 = cj3Var.u3;
        Rect rect = this.r0;
        Paint paint2 = this.m0;
        if (z4) {
            float f7 = cj3Var.z1;
            if (f7 == 1.0f) {
                paint2.setColor(cj3Var.getThemedColor(bkb.c6));
            } else if (f7 == 0.0f && (pi3Var2 = cj3Var.Y) != null) {
                pi3Var2.setTranslationY(cj3Var.s3() + cj3Var.O);
            }
            rect.set(0, Z, getMeasuredWidth(), i2 - gl.L(cj3Var.z1 * 2.0f));
            float f8 = cj3Var.z1;
            if (f8 < 0.0f) {
                if (f8 == 1.0f) {
                    paint = paint2;
                }
                f4 = 2.0f;
                f = 1.0f;
                H(canvas, 0.0f, this.r0, paint, true);
            } else {
                f4 = 2.0f;
                f = 1.0f;
            }
            float f9 = cj3Var.z1;
            if (f9 > 0.0f && f9 < f) {
                paint2.setColor(cj3Var.getThemedColor(bkb.c6));
                if (!cj3Var.s3 && cj3Var.t3) {
                    rect.set(0, Z, getMeasuredWidth(), i2 - gl.L(cj3Var.z1 * f4));
                    H(canvas, 0.0f, this.r0, paint2, true);
                }
                pi3 pi3Var3 = cj3Var.Y;
                if (pi3Var3 != null) {
                    aVar = ((d) cj3Var).actionBar;
                    int height = aVar.getHeight();
                    pi3Var3.setTranslationY(cj3Var.s3() + (i2 - (height + (cj3Var.A0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f = 1.0f;
            z2 = ((d) cj3Var).inPreviewMode;
            if (!z2) {
                if (cj3Var.w3 > 0.0f) {
                    paint2.setColor(cj3Var.getThemedColor(bkb.c6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i2 - gl.L(cj3Var.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.r0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i2 - gl.L(cj3Var.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.r0, paint, true);
                }
                cj3Var.z3 = 0.0f;
                cj3Var.y3 = 0.0f;
                float min = cj3Var.z3 - Math.min((gl.L(48.0f) + gl.L(!cj3Var.L ? 81.0f : 0.0f)) + cj3Var.O, cj3Var.w3 * (gl.L(48.0f) + gl.L(!cj3Var.L ? 81.0f : 0.0f)));
                cj3Var.z3 = min;
                cj3Var.y3 = min;
                rh3Var = cj3Var.H3;
                if (rh3Var == null && rh3Var.c()) {
                    float f10 = cj3Var.H3.e;
                    float o3 = cj3Var.z3 - ((cj3Var.o3() + cj3Var.O) * f10);
                    cj3Var.z3 = o3;
                    cj3Var.y3 = o3;
                    float i3 = cj3Var.H0 ? f - Utilities.i(f10 / 0.5f, f, 0.0f) : f;
                    qi3 qi3Var = cj3Var.A0;
                    if (qi3Var != null && qi3Var.getVisibility() == 0) {
                        cj3Var.z3 -= (f - cj3Var.r.e) * cj3Var.A0.getMeasuredHeight();
                    }
                    pi3 pi3Var4 = cj3Var.Y;
                    if (pi3Var4 != null) {
                        pi3Var4.setTranslationY(cj3Var.s3() + gl.R1(cj3Var.O + cj3Var.z3, -gl.L(cj3Var.L ? 81.0f : 0.0f), f10));
                    }
                    if (cj3Var.E) {
                        float f11 = cj3Var.F ? 0.0f : cj3Var.O;
                        f3 = -gl.R1(-f11, f11, cj3Var.H3.e);
                    } else {
                        f3 = 0.0f;
                    }
                    cj3Var.f0[0].setTranslationY(f3 - (((cj3Var.L ? gl.L(81.0f) + 0.0f : 0.0f) + gl.L(48.0f)) * cj3Var.H3.e));
                    f2 = i3;
                } else {
                    pi3Var = cj3Var.Y;
                    if (pi3Var != null) {
                        pi3Var.setTranslationY(gl.R1(((cj3Var.O + cj3Var.z3) + cj3Var.U) - gl.L(4.0f), -gl.L((cj3Var.L ? 81 : 0) + 48), cj3Var.z1));
                    }
                    f2 = f;
                }
                cj3Var.k5();
                cj3Var.z5(f2);
                super.dispatchDraw(canvas);
                cj3Var.j3(canvas2, i2);
                sbVar = cj3Var.L0;
                if (sbVar != null && sbVar.getVisibility() == 0) {
                    alpha = cj3Var.L0.getAlpha();
                    sb sbVar2 = cj3Var.L0;
                    if (alpha != f) {
                        sbVar2.draw(canvas2);
                    } else if (sbVar2.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(cj3Var.L0.getLeft(), cj3Var.L0.getTop(), cj3Var.L0.getRight(), cj3Var.L0.getBottom(), (int) (cj3Var.L0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(cj3Var.L0.getLeft(), cj3Var.L0.getTop());
                        cj3Var.L0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!cj3Var.X && cj3Var.a3 == 0) {
                    gl.O(canvas2, this, cj3Var.getThemedColor(bkb.c6), cj3Var.k4, f);
                }
                cj3Var.W = true;
            }
        }
        canvas2 = canvas;
        cj3Var.z3 = 0.0f;
        cj3Var.y3 = 0.0f;
        float min2 = cj3Var.z3 - Math.min((gl.L(48.0f) + gl.L(!cj3Var.L ? 81.0f : 0.0f)) + cj3Var.O, cj3Var.w3 * (gl.L(48.0f) + gl.L(!cj3Var.L ? 81.0f : 0.0f)));
        cj3Var.z3 = min2;
        cj3Var.y3 = min2;
        rh3Var = cj3Var.H3;
        if (rh3Var == null) {
        }
        pi3Var = cj3Var.Y;
        if (pi3Var != null) {
        }
        f2 = f;
        cj3Var.k5();
        cj3Var.z5(f2);
        super.dispatchDraw(canvas);
        cj3Var.j3(canvas2, i2);
        sbVar = cj3Var.L0;
        if (sbVar != null) {
            alpha = cj3Var.L0.getAlpha();
            sb sbVar22 = cj3Var.L0;
            if (alpha != f) {
            }
        }
        if (!cj3Var.X) {
            gl.O(canvas2, this, cj3Var.getThemedColor(bkb.c6), cj3Var.k4, f);
        }
        cj3Var.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.t0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        cj3 cj3Var = this.u0;
        if (view == cj3Var.L0) {
            return true;
        }
        if (cja.l0) {
            return super.drawChild(canvas, view, j);
        }
        bj3[] bj3VarArr = cj3Var.f0;
        if (view == bj3VarArr[0] || ((bj3VarArr.length > 1 && view == bj3VarArr[1]) || view == cj3Var.L1 || view == cj3Var.A0)) {
            canvas.save();
            if (view != cj3Var.L1 && view != cj3Var.A0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f = cj3Var.b4;
            if (f != 1.0f) {
                if (cj3Var.c4) {
                    canvas.translate((1.0f - cj3Var.b4) * gl.L(40.0f) * (-1), 0.0f);
                } else {
                    float B = ls6.B(1.0f, f, 0.05f, 1.0f);
                    canvas.translate((1.0f - cj3Var.b4) * (-gl.L(4.0f)), 0.0f);
                    canvas.scale(B, B, 0.0f, (-getY()) + cj3Var.O + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        aVar = ((d) cj3Var).actionBar;
        if (view != aVar || cj3Var.b4 == 1.0f) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        if (cj3Var.c4) {
            canvas.translate((1.0f - cj3Var.b4) * gl.L(40.0f) * (-1), 0.0f);
        } else {
            float B2 = ls6.B(1.0f, cj3Var.b4, 0.05f, 1.0f);
            canvas.translate((1.0f - cj3Var.b4) * (-gl.L(4.0f)), 0.0f);
            aVar2 = ((d) cj3Var).actionBar;
            canvas.scale(B2, B2, 0.0f, (a.getCurrentActionBarHeight() / 2.0f) + (aVar2.getOccupyStatusBar() ? gl.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tl tlVar = this.u0.F3;
        if (tlVar != null) {
            tlVar.a();
        }
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tl tlVar = this.u0.F3;
        if (tlVar != null) {
            tlVar.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        qi3 qi3Var;
        int actionMasked = motionEvent.getActionMasked();
        cj3 cj3Var = this.u0;
        if (actionMasked == 1 || actionMasked == 3) {
            aVar = ((d) cj3Var).actionBar;
            if (aVar.y()) {
                cj3Var.a1 = true;
            }
        }
        return X() || ((qi3Var = cj3Var.A0) != null && qi3Var.P) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0079  */
    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cj3 cj3Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a aVar;
        oh3 oh3Var;
        oh3 oh3Var2;
        a aVar2;
        a aVar3;
        vi3 vi3Var = this;
        int childCount = vi3Var.getChildCount();
        int Q = vi3Var.Q();
        int i11 = 0;
        vi3Var.setBottomClip(0);
        int measuredWidth = vi3Var.getMeasuredWidth();
        int measuredHeight = vi3Var.getMeasuredHeight();
        int i12 = 0;
        while (true) {
            cj3Var = vi3Var.u0;
            if (i12 >= childCount) {
                break;
            }
            View childAt = vi3Var.getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i13 = layoutParams.gravity;
                if (i13 == -1) {
                    i13 = 51;
                }
                int i14 = i13 & kk7.w1;
                int i15 = i13 & 7;
                if (i15 == 1) {
                    i5 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i15 != 5) {
                    i7 = layoutParams.leftMargin;
                    if (i14 == 16) {
                        if (i14 == 48) {
                            i10 = layoutParams.topMargin + vi3Var.getPaddingTop();
                        } else if (i14 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = measuredHeight - measuredHeight2;
                            i9 = layoutParams.bottomMargin;
                        }
                        if (childAt != cj3Var.Y || childAt == cj3Var.a0 || childAt == (oh3Var2 = cj3Var.F0)) {
                            aVar = ((d) cj3Var).actionBar;
                            i10 = aVar.getMeasuredHeight();
                            if (childAt != cj3Var.Y && childAt != cj3Var.F0 && childAt != cj3Var.a0) {
                                i10 += gl.L(48.0f);
                            }
                            if (cj3Var.L && childAt == cj3Var.Y) {
                                i10 = gl.L(81.0f) + i10;
                            }
                            oh3Var = cj3Var.F0;
                            if (childAt == oh3Var && oh3Var.getPremiumHint() != null) {
                                cj3Var.F0.getPremiumHint().layout(i7, b00.z(54.0f, i10, measuredHeight2), i7 + measuredWidth2, cj3Var.F0.getPremiumHint().getMeasuredHeight() + b00.z(54.0f, i10, measuredHeight2));
                            }
                            if (childAt == cj3Var.Y) {
                                i10 += gl.L(2.0f);
                            }
                        } else if (childAt == cj3Var.D0) {
                            i10 = -gl.L(cj3Var.a);
                        } else if (childAt instanceof k83) {
                            aVar3 = ((d) cj3Var).actionBar;
                            i10 = aVar3.getMeasuredHeight();
                        } else if (childAt instanceof bj3) {
                            i10 = i11;
                        } else if (childAt == cj3Var.L1 || childAt == cj3Var.M1 || childAt == cj3Var.A0) {
                            aVar2 = ((d) cj3Var).actionBar;
                            i10 = gl.L(48.0f) + aVar2.getMeasuredHeight() + i10;
                        } else if (oh3Var2 != null && oh3Var2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                    } else {
                        i8 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (childAt != cj3Var.Y) {
                    }
                    aVar = ((d) cj3Var).actionBar;
                    i10 = aVar.getMeasuredHeight();
                    if (childAt != cj3Var.Y) {
                        i10 += gl.L(48.0f);
                    }
                    if (cj3Var.L) {
                        i10 = gl.L(81.0f) + i10;
                    }
                    oh3Var = cj3Var.F0;
                    if (childAt == oh3Var) {
                        cj3Var.F0.getPremiumHint().layout(i7, b00.z(54.0f, i10, measuredHeight2), i7 + measuredWidth2, cj3Var.F0.getPremiumHint().getMeasuredHeight() + b00.z(54.0f, i10, measuredHeight2));
                    }
                    if (childAt == cj3Var.Y) {
                    }
                    childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                } else {
                    i5 = measuredWidth - measuredWidth2;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i14 == 16) {
                }
                i10 = i8 - i9;
                if (childAt != cj3Var.Y) {
                }
                aVar = ((d) cj3Var).actionBar;
                i10 = aVar.getMeasuredHeight();
                if (childAt != cj3Var.Y) {
                }
                if (cj3Var.L) {
                }
                oh3Var = cj3Var.F0;
                if (childAt == oh3Var) {
                }
                if (childAt == cj3Var.Y) {
                }
                childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
            }
            i12++;
            i11 = 0;
            vi3Var = this;
        }
        hi3 hi3Var = cj3Var.D0;
        if (hi3Var != null) {
            hi3Var.setKeyboardHeight(Q);
        }
        R();
        cj3Var.q5();
        cj3Var.k5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        cj3 cj3Var = this.u0;
        byte b = cj3Var.a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = size2 > size;
        setMeasuredDimension(size, size2);
        r7 r7Var = cj3Var.n0;
        if (r7Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r7Var.getLayoutParams();
            aVar5 = ((d) cj3Var).actionBar;
            layoutParams.topMargin = aVar5.getOccupyStatusBar() ? gl.m : 0;
            layoutParams.height = a.getCurrentActionBarHeight();
        }
        aVar = ((d) cj3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar2 = ((d) cj3Var).actionBar;
                if (childAt != aVar2) {
                    if (childAt instanceof k83) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i2);
                        int L = gl.L(10.0f);
                        int L2 = gl.L(2.0f) + size3;
                        aVar4 = ((d) cj3Var).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - aVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof bj3) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = gl.L(2.0f) + size2;
                        if (cj3Var.H3.c()) {
                            if (cj3Var.x) {
                                L3 = gl.L(50.0f) + L3;
                            }
                            if (cj3Var.L) {
                                L3 = gl.L(81.0f) + L3;
                            }
                            L3 = gl.L(48.0f) + L3;
                        }
                        int i4 = L3 + cj3Var.Q;
                        if (cj3Var.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i5 = cj3Var.d4 ? (int) (i4 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i5);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(10.0f), i4 + i5), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        hi3 hi3Var = cj3Var.D0;
                        if (childAt == hi3Var) {
                            hi3Var.setTranslationY(cj3Var.J0);
                            cj3Var.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(gl.L(b) + View.MeasureSpec.getSize(i2), TLObject.FLAG_30);
                            cj3Var.a3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = gl.Q;
                            aVar3 = ((d) cj3Var).actionBar;
                            rect.set(0, (gl.L(b) + aVar3.getMeasuredHeight()) - gl.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            hh3 hh3Var = cj3Var.D1;
                            if (hh3Var == null || !hh3Var.R0(childAt)) {
                                if (childAt == cj3Var.H3) {
                                    int size4 = View.MeasureSpec.getSize(i2);
                                    int i6 = cj3Var.d4 ? (int) (size4 * 0.05f) : 0;
                                    cj3Var.H3.setTransitionPaddingBottom(i6);
                                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(10.0f), size4 + i6), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i, 0, i2, 0);
                                }
                            } else if (!gl.E) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (gl.O1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(320.0f), getPaddingTop() + (size2 - gl.m)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - gl.m), TLObject.FLAG_30));
                            }
                        }
                    }
                }
            }
        }
        if (z != this.s0) {
            post(new ui3(this, (byte) 1));
            this.s0 = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r3 == 8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ui5 ui5Var;
        qi3 qi3Var;
        ui5 ui5Var2;
        ui5 ui5Var3;
        ui5 ui5Var4;
        float f;
        float f2;
        a aVar;
        boolean z;
        float measuredWidth;
        int i;
        int i2;
        j92 j92Var;
        cj3 cj3Var = this.u0;
        ui5Var = ((d) cj3Var).parentLayout;
        Object[] objArr = 0;
        if (ui5Var != null && (qi3Var = cj3Var.A0) != null && !qi3Var.n && !cj3Var.l2 && !cj3Var.H3.c()) {
            ui5Var2 = ((d) cj3Var).parentLayout;
            if (!((ActionBarLayout) ui5Var2).h()) {
                ui5Var3 = ((d) cj3Var).parentLayout;
                if (!((ActionBarLayout) ui5Var3).w()) {
                    ui5Var4 = ((d) cj3Var).parentLayout;
                    if (!((ActionBarLayout) ui5Var4).n && (motionEvent == null || cj3Var.o3 || (motionEvent.getY() > Y() + Z() && ((j92Var = cj3Var.A1) == null || j92Var.getVisibility() != 0 || motionEvent.getY() < cj3Var.A1.getY())))) {
                        if (cj3Var.T0 != 3) {
                            i = ((d) cj3Var).currentAccount;
                            if (gba.m(i) != 5) {
                                i2 = ((d) cj3Var).currentAccount;
                                if (gba.m(i2) == 2) {
                                    bj3 bj3Var = cj3Var.f0[0];
                                    if (bj3Var != null) {
                                        int i3 = bj3Var.d.h;
                                        if (i3 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            VelocityTracker velocityTracker = this.q0;
                            if (velocityTracker == null) {
                                velocityTracker = VelocityTracker.obtain();
                                this.q0 = velocityTracker;
                            }
                            velocityTracker.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && X()) {
                            cj3Var.o3 = true;
                            this.n0 = motionEvent.getPointerId(0);
                            int x = (int) motionEvent.getX();
                            this.o0 = x;
                            boolean z2 = cj3Var.k3;
                            bj3[] bj3VarArr = cj3Var.f0;
                            float f3 = x;
                            if (z2) {
                                float translationX = cj3Var.f0[0].getTranslationX() + bj3VarArr[0].getMeasuredWidth();
                                bj3[] bj3VarArr2 = cj3Var.f0;
                                if (f3 < translationX) {
                                    cj3Var.l3 = bj3VarArr2[0].getTranslationX();
                                } else {
                                    bj3 bj3Var2 = bj3VarArr2[0];
                                    bj3 bj3Var3 = bj3VarArr2[1];
                                    bj3VarArr2[0] = bj3Var3;
                                    bj3VarArr2[1] = bj3Var2;
                                    cj3Var.k3 = false;
                                    cj3Var.l3 = bj3Var3.getTranslationX();
                                    cj3Var.A0.h(1.0f, cj3Var.f0[0].h);
                                    cj3Var.A0.h(cj3Var.l3 / r10[0].getMeasuredWidth(), cj3Var.f0[1].h);
                                    cj3Var.j5(true);
                                    cj3Var.f0[0].d.getClass();
                                    cj3Var.f0[1].d.getClass();
                                }
                            } else {
                                float translationX2 = cj3Var.f0[1].getTranslationX() + bj3VarArr[1].getMeasuredWidth();
                                bj3[] bj3VarArr3 = cj3Var.f0;
                                if (f3 < translationX2) {
                                    bj3 bj3Var4 = bj3VarArr3[0];
                                    bj3 bj3Var5 = bj3VarArr3[1];
                                    bj3VarArr3[0] = bj3Var5;
                                    bj3VarArr3[1] = bj3Var4;
                                    cj3Var.k3 = true;
                                    cj3Var.l3 = bj3Var5.getTranslationX();
                                    cj3Var.A0.h(1.0f, cj3Var.f0[0].h);
                                    cj3Var.A0.h((-cj3Var.l3) / r10[0].getMeasuredWidth(), cj3Var.f0[1].h);
                                    cj3Var.j5(true);
                                    cj3Var.f0[0].d.getClass();
                                    cj3Var.f0[1].d.getClass();
                                } else {
                                    cj3Var.l3 = bj3VarArr3[0].getTranslationX();
                                }
                            }
                            cj3Var.i3.removeAllListeners();
                            cj3Var.i3.cancel();
                            cj3Var.j3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            cj3Var.l3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !cj3Var.o3 && !cj3Var.p3 && cj3Var.A0.getVisibility() == 0) {
                            this.n0 = motionEvent.getPointerId(0);
                            cj3Var.p3 = true;
                            this.o0 = (int) motionEvent.getX();
                            this.p0 = (int) motionEvent.getY();
                            this.q0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n0) {
                            int x2 = (int) ((motionEvent.getX() - this.o0) + cj3Var.l3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.p0);
                            if (cj3Var.o3 && (!cj3Var.k3 ? x2 < 0 : x2 > 0)) {
                                if (!a0(motionEvent, x2 < 0)) {
                                    cj3Var.p3 = true;
                                    cj3Var.o3 = false;
                                    cj3Var.f0[0].setTranslationX(0.0f);
                                    cj3Var.f0[1].setTranslationX(cj3Var.k3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    cj3Var.A0.h(0.0f, cj3Var.f0[1].h);
                                }
                            }
                            if (cj3Var.p3 && !cj3Var.o3) {
                                float Z0 = gl.Z0(true, 0.3f);
                                int x3 = (int) (motionEvent.getX() - this.o0);
                                if (Math.abs(x3) >= Z0 && Math.abs(x3) > abs) {
                                    a0(motionEvent, x2 < 0);
                                }
                            } else if (cj3Var.o3) {
                                cj3Var.f0[0].setTranslationX(x2);
                                boolean z3 = cj3Var.k3;
                                bj3[] bj3VarArr4 = cj3Var.f0;
                                if (z3) {
                                    bj3VarArr4[1].setTranslationX(bj3VarArr4[0].getMeasuredWidth() + x2);
                                } else {
                                    bj3VarArr4[1].setTranslationX(x2 - bj3VarArr4[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x2) / cj3Var.f0[0].getMeasuredWidth();
                                bj3 bj3Var6 = cj3Var.f0[1];
                                if (bj3Var6.F && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    cj3Var.A0.l(cj3Var.f0[1].h);
                                    gl.d3(new ui3(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                cj3Var.A0.h(abs2, bj3Var6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.n0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.q0.computeCurrentVelocity(1000, cj3Var.n3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f = 0.0f;
                                f2 = 0.0f;
                            } else {
                                f = this.q0.getXVelocity();
                                f2 = this.q0.getYVelocity();
                                if (!cj3Var.o3 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                                    a0(motionEvent, f < 0.0f);
                                }
                            }
                            if (cj3Var.o3) {
                                float x4 = cj3Var.f0[0].getX();
                                cj3Var.i3 = new AnimatorSet();
                                if (cj3Var.f0[1].F) {
                                    cj3Var.m3 = true;
                                    z = true;
                                } else if (cj3Var.l3 != 0.0f) {
                                    float abs3 = Math.abs(f);
                                    boolean z4 = cj3Var.k3;
                                    if (abs3 > 1500.0f) {
                                        z = !z4 ? f >= 0.0f : f <= 0.0f;
                                        cj3Var.m3 = z;
                                    } else {
                                        bj3[] bj3VarArr5 = cj3Var.f0;
                                        if (z4) {
                                            z = bj3VarArr5[1].getX() > ((float) (cj3Var.f0[0].getMeasuredWidth() >> 1));
                                            cj3Var.m3 = z;
                                        } else {
                                            z = bj3VarArr5[0].getX() < ((float) (cj3Var.f0[0].getMeasuredWidth() >> 1));
                                            cj3Var.m3 = z;
                                        }
                                    }
                                } else {
                                    z = Math.abs(x4) < ((float) cj3Var.f0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                                    cj3Var.m3 = z;
                                }
                                Property property = View.TRANSLATION_X;
                                if (z) {
                                    measuredWidth = Math.abs(x4);
                                    boolean z5 = cj3Var.k3;
                                    AnimatorSet animatorSet = cj3Var.i3;
                                    if (z5) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(cj3Var.f0[0], (Property<bj3, Float>) property, 0.0f), ObjectAnimator.ofFloat(cj3Var.f0[1], (Property<bj3, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(cj3Var.f0[0], (Property<bj3, Float>) property, 0.0f), ObjectAnimator.ofFloat(cj3Var.f0[1], (Property<bj3, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = cj3Var.f0[0].getMeasuredWidth() - Math.abs(x4);
                                    cj3Var.B5(cj3Var.f0[1].h, true);
                                    boolean z6 = cj3Var.k3;
                                    AnimatorSet animatorSet2 = cj3Var.i3;
                                    if (z6) {
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(cj3Var.f0[0], (Property<bj3, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(cj3Var.f0[1], (Property<bj3, Float>) property, 0.0f));
                                    } else {
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(cj3Var.f0[0], (Property<bj3, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(cj3Var.f0[1], (Property<bj3, Float>) property, 0.0f));
                                    }
                                }
                                cj3Var.i3.setInterpolator(cj3.E4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f4 = measuredWidth2 / 2;
                                float I = (gl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f4) + f4;
                                cj3Var.i3.setDuration(Math.max(kk7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r5) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                cj3Var.i3.addListener(new im2(this, (byte) 9));
                                cj3Var.i3.start();
                                cj3Var.j3 = true;
                                cj3Var.o3 = false;
                            } else {
                                cj3Var.p3 = false;
                                aVar = ((d) cj3Var).actionBar;
                                aVar.setEnabled(true);
                                cj3Var.A0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker2 = this.q0;
                            if (velocityTracker2 != null) {
                                velocityTracker2.recycle();
                                this.q0 = null;
                            }
                        }
                        return cj3Var.o3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        cj3 cj3Var = this.u0;
        if (cj3Var.p3 && !cj3Var.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
