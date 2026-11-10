package org.telegram.ui;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ql extends org.telegram.ui.Components.st0 {
    public int f0;
    public int g0;
    public int h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public Paint m0;
    public int n0;
    public final ol o0;
    public final ol p0;
    public final RectF q0;
    public float r0;
    public float s0;
    public long t0;
    public boolean u0;
    public ColorDrawable v0;
    public final /* synthetic */ cn w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.ol] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.ol] */
    public ql(cn cnVar, Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context, r4Var);
        this.w0 = cnVar;
        this.f0 = 0;
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        final int i7 = 0;
        this.o0 = new eh.a(this) { // from class: org.telegram.ui.ol
            public final /* synthetic */ ql b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // eh.a
            public final void c(dh.a aVar, RectF rectF) {
                switch (i7) {
                }
                aVar.a = true;
            }

            @Override // eh.a
            public final void d(Canvas canvas, RectF rectF) {
                switch (i7) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        cn cnVar2 = this.b.w0;
                        if (!cnVar2.z0.Y0() || cnVar2.z0.getOverScrollMode() == 2) {
                            cnVar2.z0.z1(canvas, rectF);
                            for (int i10 = 0; i10 < cnVar2.z0.getChildCount(); i10++) {
                                View childAt = cnVar2.z0.getChildAt(i10);
                                if (!cn.m2(cnVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                        if (q1Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, q1Var.V);
                                            q1Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        cnVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.j2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                        cnVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                                        canvas.restore();
                                    } else {
                                        cnVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            cnVar2.z0.A1(canvas, rectF);
                            break;
                        } else {
                            cnVar2.z0.d(canvas, rectF);
                            break;
                        }
                        break;
                    default:
                        ql qlVar = this.b;
                        cn cnVar3 = qlVar.w0;
                        RectF rectF2 = qlVar.q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, qlVar.getWidth(), qlVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = cnVar3.ed.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.r1(f10 * 0.85f, cnVar3.getThemedColor(org.telegram.ui.ActionBar.m6.d6))));
                            }
                            ih.d.b(qlVar.o0, canvas, rectF, cnVar3.z0, qlVar, i11);
                            bi.q1 q1Var2 = cnVar3.Z3;
                            if (q1Var2 != null) {
                                ih.d.b(q1Var2, canvas, rectF, q1Var2, qlVar, i12);
                            }
                            fi.g1 g1Var = cnVar3.E1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = cnVar3.E1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = cnVar3.E1.getChildAt(i13);
                                    if ((childAt2 instanceof en) && childAt2.getVisibility() == 0) {
                                        ql qlVar2 = ((en) childAt2).a.l1;
                                        ih.d.a(qlVar2.p0, canvas, rectF, qlVar2, qlVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.p0 = new eh.a(this) { // from class: org.telegram.ui.ol
            public final /* synthetic */ ql b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // eh.a
            public final void c(dh.a aVar, RectF rectF) {
                switch (i10) {
                }
                aVar.a = true;
            }

            @Override // eh.a
            public final void d(Canvas canvas, RectF rectF) {
                switch (i10) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        cn cnVar2 = this.b.w0;
                        if (!cnVar2.z0.Y0() || cnVar2.z0.getOverScrollMode() == 2) {
                            cnVar2.z0.z1(canvas, rectF);
                            for (int i102 = 0; i102 < cnVar2.z0.getChildCount(); i102++) {
                                View childAt = cnVar2.z0.getChildAt(i102);
                                if (!cn.m2(cnVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                        if (q1Var.L0()) {
                                            canvas.save();
                                            canvas.translate(0.0f, q1Var.V);
                                            q1Var.M0(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        cnVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        if (q1Var.j2()) {
                                            canvas.save();
                                            canvas.translate(q1Var.getX(), q1Var.getY());
                                            q1Var.i1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                        cnVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                                        canvas.restore();
                                    } else {
                                        cnVar2.z0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            cnVar2.z0.A1(canvas, rectF);
                            break;
                        } else {
                            cnVar2.z0.d(canvas, rectF);
                            break;
                        }
                        break;
                    default:
                        ql qlVar = this.b;
                        cn cnVar3 = qlVar.w0;
                        RectF rectF2 = qlVar.q0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, qlVar.getWidth(), qlVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f10 = cnVar3.ed.e;
                            int i11 = (int) ((1.0f - f10) * 255.0f);
                            int i12 = (int) (255.0f * f10);
                            if (f10 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.m6.n0(org.telegram.ui.ActionBar.m6.r1(f10 * 0.85f, cnVar3.getThemedColor(org.telegram.ui.ActionBar.m6.d6))));
                            }
                            ih.d.b(qlVar.o0, canvas, rectF, cnVar3.z0, qlVar, i11);
                            bi.q1 q1Var2 = cnVar3.Z3;
                            if (q1Var2 != null) {
                                ih.d.b(q1Var2, canvas, rectF, q1Var2, qlVar, i12);
                            }
                            fi.g1 g1Var = cnVar3.E1;
                            if (g1Var != null && g1Var.getVisibility() == 0) {
                                int childCount = cnVar3.E1.getChildCount();
                                for (int i13 = 0; i13 < childCount; i13++) {
                                    View childAt2 = cnVar3.E1.getChildAt(i13);
                                    if ((childAt2 instanceof en) && childAt2.getVisibility() == 0) {
                                        ql qlVar2 = ((en) childAt2).a.l1;
                                        ih.d.a(qlVar2.p0, canvas, rectF, qlVar2, qlVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.q0 = new RectF();
        this.H = new pl(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.l lVar;
        cn cnVar = this.w0;
        cnVar.l1.setTranslationY(f10);
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        lVar.setTranslationY(0.0f);
        jk jkVar = cnVar.zb;
        if (jkVar != null) {
            jkVar.setTranslationY(cnVar.C1 != null ? r3.getCurrentHeight() : 0);
        }
        fi.m3 m3Var = cnVar.K1;
        if (m3Var != null) {
            m3Var.setTranslationY(0.0f);
        }
        fi.m3 m3Var2 = cnVar.J1;
        if (m3Var2 != null) {
            m3Var2.setTranslationY(0.0f);
        }
        cnVar.e1.setTranslationY(0.0f);
        cnVar.Q.setTranslationY(0.0f);
        cnVar.R9 = 0.0f;
        cnVar.S9 = 0.0f;
        cnVar.l1.setBackgroundTranslation(0);
        org.telegram.ui.Components.t40 t40Var = cnVar.p3;
        if (t40Var != null) {
            t40Var.g(0.0f);
        }
        fi.p5 p5Var = cnVar.M2;
        if (p5Var != null) {
            org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) p5Var.b;
            v9Var.u = 0.0f;
            v9Var.d.invalidate();
        }
        cnVar.setFragmentPanTranslationOffset(0);
        cnVar.L9();
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final int Q() {
        di.u2 u2Var = this.w0.X1;
        if (u2Var == null || !u2Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.st0
    public final void T(Drawable drawable) {
        cn cnVar = this.w0;
        jh.l lVar = cnVar.X;
        if (drawable instanceof org.telegram.ui.Components.qa0) {
            ((org.telegram.ui.Components.qa0) drawable).p();
        }
        ri.a c10 = lVar.c(drawable);
        float B = org.telegram.messenger.g0.B(lVar.b(c10));
        float B2 = org.telegram.messenger.g0.B(lVar.a(c10));
        cnVar.fc = B <= 0.721f;
        cnVar.gc = B2 <= 0.9f;
        cnVar.M.a = c10;
        ri.f fVar = cnVar.I;
        if (fVar != null) {
            Iterator it = fVar.w.iterator();
            while (it.hasNext()) {
                fh.e eVar = ((fh.g) it.next()).f0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ri.f fVar2 = cnVar.J;
        if (fVar2 != null) {
            Iterator it2 = fVar2.w.iterator();
            while (it2.hasNext()) {
                fh.e eVar2 = ((fh.g) it2.next()).f0;
                if (eVar2 != null) {
                    eVar2.h = true;
                }
            }
        }
        lh.f fVar3 = cnVar.Y;
        if (fVar3 != null) {
            fVar3.setOverlayColor(cnVar.R9() ? cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.va) : 0);
            cnVar.Y.invalidate();
        }
        jh.f fVar4 = cnVar.T;
        if (fVar4 != null) {
            fVar4.invalidate();
        }
        cnVar.l1.invalidate();
        Iterator it3 = cnVar.E.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        cnVar.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f10, org.telegram.ui.Cells.q1 q1Var, int i7) {
        int save = canvas.save();
        cn cnVar = this.w0;
        float x10 = q1Var.getX() + cnVar.z0.getLeft();
        float y10 = q1Var.getY() + cnVar.z0.getY() + q1Var.getPaddingTop();
        float alpha = q1Var.b() ? q1Var.getAlpha() : 1.0f;
        canvas.clipRect(cnVar.z0.getLeft(), f10, cnVar.z0.getRight(), ((((cnVar.z0.getY() + cnVar.z0.getMeasuredHeight()) - cnVar.Wa) - cnVar.w.e()) - cnVar.Yc) - org.telegram.messenger.g0.L(9.0f));
        canvas.translate(x10, y10);
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.x1(alpha, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, alpha);
        } else if (i7 == 2) {
            q1Var.Q0(alpha, canvas, q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0);
        } else if (i7 == 3) {
            boolean z9 = q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0;
            q1Var.V0(canvas, alpha);
            if (!z9) {
                q1Var.o1(canvas, alpha, null);
            }
        } else if (i7 == 4 && ((q1Var.getCurrentPosition() == null || (1 & q1Var.getCurrentPosition().l) != 0) && cnVar.a9 != null)) {
            float f11 = (cnVar.V8 * cnVar.Y8) / 0.2f;
            canvas.save();
            q1Var.s1(canvas, cnVar.a9, f11, cnVar.W8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            q1Var.t1(this, canvas, cnVar.b9, cnVar.a9, f11);
            canvas.restore();
        }
        q1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.c1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.z0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(Canvas canvas, View view, long j3) {
        fi.p5 p5Var;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.messenger.ij ijVar;
        boolean z9;
        boolean z10;
        vj vjVar;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.Components.t40 t40Var;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        cn cnVar = this.w0;
        boolean z11 = false;
        if ((cnVar.X8 == null && ((ArrayList) cnVar.ha.c).size() <= 0) || (view != cnVar.x1 && view != cnVar.l3 && view != cnVar.m3 && view != cnVar.H9 && view != cnVar.sa && view != cnVar.s2 && view != null && view != cnVar.M3 && view != cnVar.N3)) {
            if ((view != cnVar.M3 || !PhotoViewer.p1().P1()) && (!cnVar.na || view != cnVar.z0)) {
                if (cnVar.Fa) {
                    lVar3 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                }
                if (view != cnVar.p3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (p5Var = cnVar.M2) != null && p5Var.a() && cnVar.M2.getTag() != null) {
                            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                            if (view != lVar) {
                            }
                        }
                        ijVar = MediaController.B().u0;
                        if (ijVar == null) {
                        }
                        z9 = false;
                        z10 = false;
                        if (view == cnVar.H8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    } else {
                        if (view != cnVar.z0) {
                            if (view != cnVar.T) {
                            }
                        }
                        ijVar = MediaController.B().u0;
                        if (ijVar == null && ijVar.T == 0) {
                            z9 = ijVar.h4();
                            if (z9 || org.telegram.messenger.ij.L4(ijVar.k)) {
                                z10 = true;
                                if (view == cnVar.H8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-cnVar.ia) - (cnVar.pa != 0.0f ? (cnVar.z0.getMeasuredHeight() - cnVar.ia) * cnVar.pa : 0.0f));
                                    if (ijVar != null && ijVar.D == 5) {
                                        if (org.telegram.ui.ActionBar.m6.k3 != null && cnVar.J8.d) {
                                            int x10 = ((int) view.getX()) - org.telegram.messenger.g0.L(3.0f);
                                            int y10 = ((int) view.getY()) - org.telegram.messenger.g0.L(2.0f);
                                            canvas.save();
                                            canvas.scale(cnVar.H8.getScaleX(), cnVar.H8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.m6.k3.setAlpha(org.telegram.messenger.qs.e4);
                                            org.telegram.ui.ActionBar.m6.k3.setBounds(x10, y10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.g3(cnVar.aa(), cnVar.R9()) + x10, org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.g3(cnVar.aa(), cnVar.R9()) + y10);
                                            org.telegram.ui.ActionBar.m6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z11 = super.drawChild(canvas, view, j3);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-org.telegram.messenger.g0.L(1000.0f));
                                        z11 = super.drawChild(canvas, view, j3);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z11;
                                }
                                if (view == cnVar.T && (t40Var = cnVar.p3) != null && t40Var.getVisibility() == 0) {
                                    super.drawChild(canvas, cnVar.p3, j3);
                                }
                                z11 = super.drawChild(canvas, view, j3);
                                if (z10 && view == cnVar.z0 && ijVar.D != 5 && (vjVar = cnVar.H8) != null && vjVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-cnVar.ia) - (cnVar.pa != 0.0f ? (cnVar.z0.getMeasuredHeight() - cnVar.ia) * cnVar.pa : 0.0f)) + cnVar.ja);
                                    super.drawChild(canvas, cnVar.H8, j3);
                                    if (cnVar.I8 != null) {
                                        canvas.save();
                                        canvas.translate(cnVar.I8.getX(), cnVar.z0.getY() + cnVar.I8.getTop());
                                        if (z9) {
                                            cnVar.I8.r1(canvas);
                                            invalidate();
                                            cnVar.I8.invalidate();
                                        } else {
                                            cnVar.I8.j1(canvas);
                                            org.telegram.ui.Cells.q1 q1Var = cnVar.I8;
                                            if (!q1Var.F9 && ((ijVar2 = q1Var.P5) == null || ijVar2.D != 27)) {
                                                q1Var.x1(q1Var.getAlpha(), canvas, true);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                }
                            }
                        } else {
                            z9 = false;
                        }
                        z10 = false;
                        if (view == cnVar.H8) {
                        }
                    }
                }
            }
            return true;
        }
        return z11;
    }

    public final boolean a0(View view) {
        if (view == this.L) {
            return true;
        }
        cn cnVar = this.w0;
        return view == cnVar.M2 || view == cnVar.E1 || view == cnVar.H9 || view == cnVar.Y || view == cnVar.Y3 || view == cnVar.m0 || (view instanceof org.telegram.ui.ActionBar.j5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.zf zfVar;
        cn cnVar = this.w0;
        sj sjVar = cnVar.Z;
        if (sjVar == null || view != sjVar.m0) {
            super.addView(view, i7, layoutParams);
        } else {
            lh.f fVar = cnVar.Y;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i7 = indexOfChild;
            }
            super.addView(view, i7, layoutParams);
        }
        sj sjVar2 = cnVar.Z;
        if (sjVar2 != null && view == sjVar2.m0) {
            hi.u uVar = (hi.u) view;
            uVar.setBackgroundDrawable(cnVar.K.c(uVar.c, cnVar.D, false));
        }
        sj sjVar3 = cnVar.Z;
        if (sjVar3 == null || view != (zfVar = sjVar3.O1)) {
            return;
        }
        zfVar.setBlurredBackgroundFactory(cnVar.K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0c32, code lost:
    
        if (r0.getVisibility() != 0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0792, code lost:
    
        if ((r5 & 1) != 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018c, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0b87  */
    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        float f10;
        float f11;
        int i10;
        Integer num;
        Paint paint;
        Paint paint2;
        float f12;
        View view;
        Paint paint3;
        Paint paint4;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Paint paint5;
        float f13;
        Paint paint6;
        Paint paint7;
        Integer num2;
        View view2;
        Canvas canvas3;
        ql qlVar;
        float f14;
        float f15;
        View view3;
        org.telegram.ui.Components.g90 g90Var;
        org.telegram.ui.Components.g90 g90Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        View view4;
        View view5;
        ul ulVar;
        View view6;
        org.telegram.messenger.dj djVar;
        ul ulVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f16;
        int i11;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f17;
        float f18;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        float f19;
        Paint paint12;
        ul ulVar3;
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.dj djVar2;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.aj ajVar;
        View view7;
        org.telegram.messenger.dj djVar3;
        View view8;
        int i12;
        int i13;
        ArrayList arrayList5;
        org.telegram.ui.Cells.q1 q1Var2;
        ArrayList arrayList6;
        xi xiVar;
        Integer num4;
        float f20;
        float f21;
        boolean z9;
        ul ulVar4;
        ul ulVar5;
        org.telegram.ui.Components.g90 g90Var3;
        float f22;
        float f23;
        sj sjVar;
        ul ulVar6;
        ul ulVar7;
        ul ulVar8;
        ul ulVar9;
        float f24;
        float f25;
        Canvas canvas4;
        float f26;
        float f27;
        View view9;
        float f28;
        float f29;
        float f30;
        org.telegram.messenger.aj ajVar2;
        Integer num5;
        float f31;
        int i14;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.t0 t0Var2;
        Paint paint14;
        float f32;
        float f33;
        Paint paint15;
        float f34;
        float f35;
        float f36;
        float f37;
        ul ulVar10;
        ul ulVar11;
        Integer num7;
        ul ulVar12;
        ul ulVar13;
        Integer num8;
        ql qlVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        float f38;
        Paint paint17;
        Paint paint18;
        float f39;
        float f40;
        View view10;
        int i15;
        Paint paint19;
        float f41;
        float f42;
        Paint paint20;
        float f43;
        float f44;
        float f45;
        Canvas canvas5;
        float f46;
        float f47;
        float f48;
        ul ulVar14;
        ul ulVar15;
        Integer num9;
        ul ulVar16;
        ul ulVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        float f49;
        Paint paint22;
        float f50;
        Integer num11;
        ul ulVar18;
        ul ulVar19;
        float f51;
        Integer num12;
        org.telegram.ui.Components.ue ueVar;
        org.telegram.ui.Components.g90 g90Var4;
        org.telegram.ui.Components.g90 g90Var5;
        ul ulVar20;
        float f52;
        org.telegram.ui.Cells.q1 q1Var3;
        boolean z10;
        org.telegram.ui.Components.g90 g90Var6;
        float f53;
        org.telegram.ui.Components.g90 g90Var7;
        float f54;
        ul ulVar21;
        org.telegram.ui.Components.g90 g90Var8;
        org.telegram.ui.Components.g90 g90Var9;
        ul ulVar22;
        View view11;
        float f55;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.l lVar6;
        View view15;
        float f56;
        Paint paint23;
        float f57;
        float f58;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f59;
        Integer num13;
        float f60;
        Paint paint25;
        Paint paint26;
        float f61;
        float f62;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        float f63;
        Paint paint29;
        float f64;
        Paint paint30;
        float f65;
        float f66;
        Paint paint31;
        View view24;
        float f67;
        float f68;
        org.telegram.ui.ActionBar.l lVar7;
        int i16;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.l lVar9;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar10;
        ej ejVar;
        ql qlVar3 = this;
        cn cnVar = qlVar3.w0;
        xi xiVar2 = cnVar.w;
        ArrayList arrayList7 = cnVar.D6;
        cnVar.Z.V1();
        cnVar.Qc();
        if (cnVar.Ma || ((ejVar = cnVar.A0) != null && ejVar.k())) {
            cnVar.Ma = false;
            cnVar.bd();
        }
        cnVar.ud(false, false);
        cnVar.dd();
        fi.m3 m3Var = cnVar.u2;
        if (m3Var != null && m3Var.V) {
            m3Var.z();
        }
        fi.m3 m3Var2 = cnVar.w2;
        if (m3Var2 != null && m3Var2.V) {
            m3Var2.z();
        }
        float f69 = 0.2f;
        float f70 = 2.0f;
        if (cnVar.Fa) {
            lVar10 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            canvas2 = canvas;
            i7 = canvas2.saveLayerAlpha(0.0f, lVar10.getBottom(), qlVar3.getMeasuredWidth(), qlVar3.getMeasuredHeight(), (int) (cnVar.Ga * 255.0f), 31);
            float f71 = (cnVar.Ga * 0.2f) + 0.8f;
            canvas2.scale(f71, f71, qlVar3.getMeasuredWidth() / 2.0f, qlVar3.getMeasuredHeight() / 2.0f);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        int i17 = i7;
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        int i18 = 0;
        while (true) {
            f10 = 1.0f;
            f11 = 0.0f;
            i10 = 1;
            if (i18 >= size) {
                break;
            }
            org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList7.get(i18);
            org.telegram.messenger.ej ejVar2 = q1Var4.getMessageObject().L1;
            if (ejVar2 != null) {
                canvas2.save();
                lVar7 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (lVar7.getVisibility() == 0) {
                    lVar8 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    int translationY = (int) lVar8.getTranslationY();
                    lVar9 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    int measuredHeight = lVar9.getMeasuredHeight() + translationY;
                    ck ckVar = cnVar.C1;
                    int currentHeight = measuredHeight + (ckVar != null ? ckVar.getCurrentHeight() : 0);
                    pj pjVar = cnVar.D1;
                    int currentHeight2 = currentHeight + (pjVar != null ? pjVar.getCurrentHeight() : 0);
                    z11 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
                    i16 = currentHeight2 + (z11 ? org.telegram.messenger.g0.m : 0);
                } else {
                    i16 = 0;
                }
                f67 = f70;
                f68 = f69;
                canvas2.clipRect(0.0f, i16 + cnVar.O9, qlVar3.getWidth(), qlVar3.getHeight());
                ImageReceiver photoImage = q1Var4.getPhotoImage();
                q1Var4.getLocationInWindow(org.telegram.messenger.g0.R);
                int topViewEnterProgress = (int) ((cnVar.Z.getTopViewEnterProgress() * org.telegram.messenger.g0.L(48.0f)) + ((int) com.google.android.recaptcha.internal.a.v(1.0f, ejVar2.g, q1Var4.getTranslationY(), r9[1])));
                if (ejVar2.h) {
                    canvas2.translate(ejVar2.e, org.telegram.messenger.g0.T1(ejVar2.b, topViewEnterProgress, ejVar2.g));
                } else {
                    canvas2.translate(ejVar2.e, org.telegram.messenger.g0.T1(ejVar2.b, photoImage.s() + topViewEnterProgress, ejVar2.g));
                }
                float f72 = ejVar2.d;
                canvas2.scale(f72, f72);
                if (!ejVar2.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                q1Var4.setTimeAlpha(ejVar2.f);
                q1Var4.draw(canvas2);
                canvas2.restore();
            } else {
                f67 = f70;
                f68 = f69;
            }
            i18++;
            f70 = f67;
            f69 = f68;
        }
        float f73 = f70;
        float f74 = f69;
        num = cnVar.a9;
        if (num != null) {
            view24 = cnVar.X8;
        }
        paint = cnVar.R8;
        if (paint != null) {
            matrix = cnVar.S8;
            matrix.reset();
            float measuredWidth = qlVar3.getMeasuredWidth() / cnVar.P8.getWidth();
            matrix2 = cnVar.S8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = cnVar.Q8;
            matrix3 = cnVar.S8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = cnVar.R8;
            f13 = cnVar.Z8;
            paint5.setAlpha((int) (f13 * 255.0f));
            paint6 = cnVar.R8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = qlVar3.getMeasuredWidth();
                float measuredHeight2 = qlVar3.getMeasuredHeight();
                paint7 = cnVar.R8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = cnVar.T8;
            f12 = cnVar.V8;
            float f75 = f12 * 255.0f;
            view = cnVar.X8;
            paint2.setAlpha((int) (f75 * (view != null ? cnVar.Y8 : 1.0f)));
            paint3 = cnVar.T8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = qlVar3.getMeasuredWidth();
                float measuredHeight3 = qlVar3.getMeasuredHeight();
                paint4 = cnVar.T8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = cnVar.a9;
        if (num2 != null && cnVar.c9) {
            qlVar3.invalidate();
        }
        view2 = cnVar.X8;
        if (view2 != null) {
            view4 = cnVar.X8;
            if (view4 == cnVar.x1) {
                f64 = cnVar.Y8;
                if (f64 < 1.0f) {
                    paint30 = cnVar.T8;
                    f65 = cnVar.V8;
                    f66 = cnVar.Y8;
                    paint30.setAlpha((int) ((1.0f - f66) * f65 * 255.0f));
                    float measuredWidth4 = qlVar3.getMeasuredWidth();
                    float measuredHeight4 = qlVar3.getMeasuredHeight();
                    paint31 = cnVar.T8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = cnVar.X8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f55 = cnVar.Y8;
                    if (f55 < 1.0f) {
                        view20 = cnVar.X8;
                        float left = view20.getLeft();
                        view21 = cnVar.X8;
                        float top = view21.getTop();
                        view22 = cnVar.X8;
                        float right = view22.getRight();
                        view23 = cnVar.X8;
                        float bottom = view23.getBottom();
                        f59 = cnVar.Y8;
                        int i19 = (int) (f59 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i19, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = cnVar.X8;
                    float left2 = view12.getLeft();
                    view13 = cnVar.X8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = cnVar.X8;
                    lVar6 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    if (view14 == lVar6.getBackButton()) {
                        view16 = cnVar.X8;
                        float x10 = view16.getX();
                        view17 = cnVar.X8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = cnVar.X8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f73;
                        view19 = cnVar.X8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f73;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, cnVar.U8);
                    }
                    view15 = cnVar.X8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f56 = cnVar.Y8;
                    if (f56 < 1.0f) {
                        paint23 = cnVar.T8;
                        f57 = cnVar.V8;
                        f58 = cnVar.Y8;
                        paint23.setAlpha((int) ((1.0f - f58) * f57 * 255.0f));
                        float measuredWidth6 = qlVar3.getMeasuredWidth();
                        float measuredHeight6 = qlVar3.getMeasuredHeight();
                        paint24 = cnVar.T8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    ulVar = cnVar.z0;
                    float y10 = ((ulVar.getY() + cnVar.N9) - cnVar.P9) - org.telegram.messenger.g0.L(4.0f);
                    view6 = cnVar.X8;
                    if (view6 instanceof org.telegram.ui.Cells.q1) {
                        view11 = cnVar.X8;
                        djVar = ((org.telegram.ui.Cells.q1) view11).getCurrentMessagesGroup();
                    } else {
                        djVar = null;
                    }
                    ulVar2 = cnVar.z0;
                    int childCount = ulVar2.getChildCount();
                    int i20 = 0;
                    boolean z12 = false;
                    while (true) {
                        arrayList = qlVar3.k0;
                        f15 = 20.0f;
                        arrayList2 = qlVar3.j0;
                        arrayList3 = qlVar3.i0;
                        f14 = f11;
                        arrayList4 = qlVar3.l0;
                        if (i20 >= childCount) {
                            break;
                        }
                        ulVar3 = cnVar.z0;
                        View childAt = ulVar3.getChildAt(i20);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            q1Var = (org.telegram.ui.Cells.q1) childAt;
                            djVar2 = q1Var.getCurrentMessagesGroup();
                            ajVar = q1Var.getCurrentPosition();
                            t0Var = null;
                        } else {
                            t0Var = childAt instanceof org.telegram.ui.Cells.t0 ? (org.telegram.ui.Cells.t0) childAt : null;
                            djVar2 = null;
                            q1Var = null;
                            ajVar = null;
                        }
                        float f76 = y10;
                        view7 = cnVar.X8;
                        if ((childAt == view7 || (djVar != null && djVar == djVar2)) && childAt.getAlpha() != f14) {
                            if (z12 || q1Var == null || djVar == null) {
                                djVar3 = djVar;
                                view8 = childAt;
                                i12 = childCount;
                                i13 = i20;
                                arrayList5 = arrayList;
                                q1Var2 = q1Var;
                                arrayList6 = arrayList4;
                                xiVar = xiVar2;
                                num4 = null;
                                f20 = 1.0f;
                                f21 = 9.0f;
                            } else {
                                ArrayList arrayList8 = djVar.d;
                                f21 = 9.0f;
                                org.telegram.messenger.cj cjVar = djVar.m;
                                djVar3 = djVar;
                                org.telegram.ui.Cells.q1 q1Var5 = cjVar.m;
                                view8 = childAt;
                                if (q1Var5 != null) {
                                    float R1 = q1Var5.R1(true);
                                    float f77 = cjVar.a + R1 + cjVar.e;
                                    float f78 = cjVar.b + cjVar.f;
                                    float f79 = cjVar.c + R1 + cjVar.g;
                                    float f80 = f78;
                                    float f81 = cjVar.d + cjVar.h;
                                    if (!cjVar.j) {
                                        f80 = cjVar.m.getTranslationY() + f80;
                                        f81 = cjVar.m.getTranslationY() + f81;
                                    }
                                    float L = f80 < (cnVar.N9 - ((float) cnVar.P9)) - ((float) org.telegram.messenger.g0.L(20.0f)) ? (cnVar.N9 - cnVar.P9) - org.telegram.messenger.g0.L(20.0f) : f80;
                                    ulVar20 = cnVar.z0;
                                    i12 = childCount;
                                    if (f81 > org.telegram.messenger.g0.L(20.0f) + ulVar20.getMeasuredHeight()) {
                                        ulVar22 = cnVar.z0;
                                        f52 = org.telegram.messenger.g0.L(20.0f) + ulVar22.getMeasuredHeight();
                                    } else {
                                        f52 = f81;
                                    }
                                    i13 = i20;
                                    int size2 = arrayList8.size();
                                    arrayList5 = arrayList;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size2) {
                                            q1Var3 = q1Var;
                                            z10 = true;
                                            break;
                                        }
                                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList8.get(i21);
                                        ArrayList arrayList9 = arrayList8;
                                        int i22 = i21;
                                        if (cnVar.m6[ijVar.A0() == cnVar.j6 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) < 0) {
                                            q1Var3 = q1Var;
                                            z10 = false;
                                            break;
                                        } else {
                                            i21 = i22 + 1;
                                            arrayList8 = arrayList9;
                                        }
                                    }
                                    canvas3.save();
                                    float measuredHeight7 = ((getMeasuredHeight() - xiVar2.e()) - cnVar.Yc) - org.telegram.messenger.g0.L(9.0f);
                                    g90Var6 = cnVar.W1;
                                    if (g90Var6 != null) {
                                        g90Var9 = cnVar.W1;
                                        f53 = g90Var9.d();
                                    } else {
                                        f53 = f14;
                                    }
                                    float f82 = measuredHeight7 - f53;
                                    g90Var7 = cnVar.W1;
                                    if (g90Var7 != null) {
                                        g90Var8 = cnVar.W1;
                                        f54 = g90Var8.e();
                                    } else {
                                        f54 = f14;
                                    }
                                    org.telegram.ui.Cells.q1 q1Var6 = q1Var3;
                                    canvas3.clipRect(f14, f76 + f54, getMeasuredWidth(), f82);
                                    ulVar21 = cnVar.z0;
                                    canvas3.translate(f14, ulVar21.getY());
                                    boolean z13 = cjVar.k;
                                    boolean z14 = cjVar.l;
                                    arrayList6 = arrayList4;
                                    xiVar = xiVar2;
                                    q1Var2 = q1Var6;
                                    num4 = null;
                                    f20 = 1.0f;
                                    cjVar.m.K0(canvas, (int) f77, (int) L, (int) f79, (int) f52, z13, z14, z10, 0);
                                    canvas.restore();
                                    z9 = true;
                                    if (q1Var2 != null && q1Var2.getPhotoImage().M()) {
                                        invalidate();
                                    }
                                    ulVar4 = cnVar.z0;
                                    float left3 = ulVar4.getLeft();
                                    ulVar5 = cnVar.z0;
                                    float right2 = ulVar5.getRight();
                                    float measuredHeight8 = (((getMeasuredHeight() - xiVar.e()) - cnVar.Yc) - cnVar.s9(org.telegram.ui.Components.i11.c)) - org.telegram.messenger.g0.L(f21);
                                    g90Var3 = cnVar.W1;
                                    if (g90Var3 == null) {
                                        g90Var4 = cnVar.W1;
                                        float max = Math.max(0.0f, g90Var4.e());
                                        g90Var5 = cnVar.W1;
                                        f23 = Math.max(0.0f, g90Var5.d());
                                        f22 = max;
                                    } else {
                                        f22 = 0.0f;
                                        f23 = 0.0f;
                                    }
                                    sjVar = cnVar.Z;
                                    if (sjVar != null && (ueVar = sjVar.m0) != null) {
                                        f23 = Math.max(f23, ueVar.f ? 0.0f : Math.max(0.0f, ueVar.getMeasuredHeight() - (ueVar.c.getTranslationY() + ueVar.e)));
                                    }
                                    float f83 = f76 + f22;
                                    float f84 = measuredHeight8 - f23;
                                    if (q1Var2 != null || !q1Var2.getTransitionParams().x0) {
                                        ulVar6 = cnVar.z0;
                                        left3 = Math.max(left3, view8.getX() + ulVar6.getLeft());
                                        ulVar7 = cnVar.z0;
                                        f83 = Math.max(f83, view8.getY() + ulVar7.getY());
                                        ulVar8 = cnVar.z0;
                                        right2 = Math.min(right2, view8.getX() + ulVar8.getLeft() + view8.getMeasuredWidth());
                                        ulVar9 = cnVar.z0;
                                        f84 = Math.min(f84, view8.getY() + ulVar9.getY() + view8.getMeasuredHeight());
                                    }
                                    f24 = f84;
                                    f25 = f83;
                                    float f85 = right2;
                                    float max2 = Math.max(left3, cnVar.m9());
                                    if (f25 >= f24) {
                                        if (view8.getAlpha() != f20) {
                                            canvas4 = canvas;
                                            canvas4.saveLayerAlpha(max2, f25, f85, f24, (int) (view8.getAlpha() * 255.0f), 31);
                                            f50 = f25;
                                            f27 = f24;
                                            f29 = max2;
                                            f30 = f85;
                                        } else {
                                            canvas4 = canvas;
                                            f50 = f25;
                                            f27 = f24;
                                            f29 = max2;
                                            f30 = f85;
                                            canvas4.save();
                                        }
                                        if (q1Var2 != null) {
                                            q1Var2.setInvalidatesParent(true);
                                            num12 = cnVar.a9;
                                            q1Var2.setScrimReaction(num12);
                                        } else if (t0Var != null) {
                                            t0Var.setInvalidatesParent(true);
                                            num11 = cnVar.a9;
                                            t0Var.setScrimReaction(num11);
                                        }
                                        canvas4.clipRect(f29, f50, f30, f27);
                                        ulVar18 = cnVar.z0;
                                        float x11 = view8.getX() + ulVar18.getLeft();
                                        ulVar19 = cnVar.z0;
                                        canvas4.translate(x11, view8.getY() + ulVar19.getY());
                                        if (q1Var2 != null && djVar3 == null && q1Var2.L0()) {
                                            canvas4.save();
                                            canvas4.translate(0.0f, q1Var2.getPaddingTop());
                                            q1Var2.M0(canvas4, true, false);
                                            canvas4.restore();
                                        }
                                        if (q1Var2 != null && djVar3 == null) {
                                            f51 = cnVar.Z8;
                                            q1Var2.b1(canvas4, f51);
                                        }
                                        view9 = view8;
                                        view9.draw(canvas4);
                                        if (q1Var2 == null || !q1Var2.j2()) {
                                            f26 = f50;
                                            f28 = 0.0f;
                                        } else {
                                            canvas4.save();
                                            f26 = f50;
                                            f28 = 0.0f;
                                            canvas4.translate(0.0f, q1Var2.getPaddingTop());
                                            q1Var2.i1(canvas4);
                                            canvas4.restore();
                                        }
                                        if (t0Var != null) {
                                            t0Var.G(canvas4);
                                        }
                                        canvas4.restore();
                                        if (q1Var2 != null) {
                                            q1Var2.setInvalidatesParent(false);
                                            q1Var2.setScrimReaction(num4);
                                        } else if (t0Var != null) {
                                            t0Var.setInvalidatesParent(false);
                                            t0Var.setScrimReaction(num4);
                                        }
                                    } else {
                                        canvas4 = canvas;
                                        f26 = f25;
                                        f27 = f24;
                                        view9 = view8;
                                        f28 = 0.0f;
                                        f29 = max2;
                                        f30 = f85;
                                    }
                                    ajVar2 = ajVar;
                                    if (ajVar2 == null || (q1Var2 != null && q1Var2.getTransitionParams().x0)) {
                                        if (ajVar2 != null || ajVar2.h || (ajVar2.a == 0 && ajVar2.c == 0)) {
                                            if (ajVar2 != null || ajVar2.h) {
                                                arrayList3.add(q1Var2);
                                            }
                                            if (ajVar2 != null || (ajVar2.a == 0 && ajVar2.c == 0 && q1Var2.i2())) {
                                                arrayList2.add(q1Var2);
                                            }
                                        }
                                        if (ajVar2 != null || (ajVar2.l & q1Var2.B()) != 0) {
                                            arrayList5.add(q1Var2);
                                        }
                                        if (ajVar2 != null) {
                                            int i23 = ajVar2.l;
                                            if ((i23 & 8) != 0) {
                                            }
                                        }
                                        arrayList6.add(q1Var2);
                                    }
                                    num5 = cnVar.a9;
                                    if (num5 == null && q1Var2 != null && djVar3 == null) {
                                        paint18 = cnVar.R8;
                                        if (paint18 != null) {
                                            matrix10 = cnVar.S8;
                                            matrix10.reset();
                                            float measuredWidth7 = getMeasuredWidth() / cnVar.P8.getWidth();
                                            matrix11 = cnVar.S8;
                                            matrix11.postScale(measuredWidth7, measuredWidth7);
                                            BitmapShader bitmapShader2 = cnVar.Q8;
                                            matrix12 = cnVar.S8;
                                            bitmapShader2.setLocalMatrix(matrix12);
                                            paint21 = cnVar.R8;
                                            f49 = cnVar.Z8;
                                            paint21.setAlpha((int) (f49 * 255.0f));
                                            float measuredWidth8 = getMeasuredWidth();
                                            float measuredHeight9 = getMeasuredHeight();
                                            paint22 = cnVar.R8;
                                            f39 = f30;
                                            f40 = f29;
                                            view10 = view9;
                                            i15 = 1;
                                            canvas4.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint22);
                                        } else {
                                            f39 = f30;
                                            f40 = f29;
                                            view10 = view9;
                                            i15 = 1;
                                            paint19 = cnVar.T8;
                                            f41 = cnVar.V8;
                                            f42 = cnVar.Y8;
                                            paint19.setAlpha((int) (f42 * f41 * 255.0f));
                                            float measuredWidth9 = getMeasuredWidth();
                                            float measuredHeight10 = getMeasuredHeight();
                                            paint20 = cnVar.T8;
                                            canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint20);
                                        }
                                        if (f25 < f24) {
                                            f43 = cnVar.V8;
                                            f44 = cnVar.Y8;
                                            float f86 = (f44 * f43) / f74;
                                            float alpha = view10.getAlpha();
                                            f45 = cnVar.Y8;
                                            float f87 = f45 * alpha;
                                            if (f87 < f20) {
                                                f46 = f28;
                                                canvas5 = canvas;
                                                f47 = f27;
                                                float f88 = f26;
                                                canvas5.saveLayerAlpha(f40, f88, f39, f47, (int) (f87 * 255.0f), 31);
                                                f48 = f88;
                                            } else {
                                                canvas5 = canvas;
                                                f46 = f28;
                                                f47 = f27;
                                                f48 = f26;
                                                canvas5.save();
                                            }
                                            canvas5.clipRect(f40, f48, f39, f47);
                                            ulVar14 = cnVar.z0;
                                            float x12 = view10.getX() + ulVar14.getLeft();
                                            ulVar15 = cnVar.z0;
                                            canvas5.translate(x12, view10.getY() + ulVar15.getY() + view10.getPaddingTop());
                                            num9 = cnVar.a9;
                                            q1Var2.s1(canvas5, num9, f86, cnVar.W8);
                                            canvas5.restore();
                                            canvas5.save();
                                            ulVar16 = cnVar.z0;
                                            float x13 = view10.getX() + ulVar16.getLeft();
                                            ulVar17 = cnVar.z0;
                                            canvas5.translate(x13, view10.getY() + ulVar17.getY() + view10.getPaddingTop());
                                            int i24 = cnVar.b9;
                                            num10 = cnVar.a9;
                                            i14 = i15;
                                            f31 = f76;
                                            f14 = f46;
                                            q1Var2.t1(this, canvas5, i24, num10, f86);
                                            canvas.restore();
                                        } else {
                                            i14 = i15;
                                            f31 = f76;
                                            f14 = f28;
                                        }
                                    } else {
                                        float f89 = f30;
                                        float f90 = f29;
                                        View view25 = view9;
                                        f14 = f28;
                                        float f91 = f27;
                                        float f92 = f26;
                                        f31 = f76;
                                        i14 = 1;
                                        num6 = cnVar.a9;
                                        if (num6 != null && t0Var != null) {
                                            paint13 = cnVar.R8;
                                            if (paint13 == null) {
                                                matrix7 = cnVar.S8;
                                                matrix7.reset();
                                                float measuredWidth10 = getMeasuredWidth() / cnVar.P8.getWidth();
                                                matrix8 = cnVar.S8;
                                                matrix8.postScale(measuredWidth10, measuredWidth10);
                                                BitmapShader bitmapShader3 = cnVar.Q8;
                                                matrix9 = cnVar.S8;
                                                bitmapShader3.setLocalMatrix(matrix9);
                                                paint16 = cnVar.R8;
                                                f38 = cnVar.Z8;
                                                paint16.setAlpha((int) (f38 * 255.0f));
                                                float measuredWidth11 = getMeasuredWidth();
                                                float measuredHeight11 = getMeasuredHeight();
                                                paint17 = cnVar.R8;
                                                t0Var2 = t0Var;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint17);
                                            } else {
                                                t0Var2 = t0Var;
                                                paint14 = cnVar.T8;
                                                f32 = cnVar.V8;
                                                f33 = cnVar.Y8;
                                                paint14.setAlpha((int) (f33 * f32 * 255.0f));
                                                float measuredWidth12 = getMeasuredWidth();
                                                float measuredHeight12 = getMeasuredHeight();
                                                paint15 = cnVar.T8;
                                                canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint15);
                                            }
                                            if (f25 < f24) {
                                                f34 = cnVar.V8;
                                                f35 = cnVar.Y8;
                                                float f93 = (f35 * f34) / f74;
                                                float alpha2 = view25.getAlpha();
                                                f36 = cnVar.Y8;
                                                float f94 = f36 * alpha2;
                                                if (f94 < f20) {
                                                    canvas.saveLayerAlpha(f90, f92, f89, f91, (int) (f94 * 255.0f), 31);
                                                    f91 = f91;
                                                    f37 = f92;
                                                    canvas3 = canvas;
                                                } else {
                                                    canvas3 = canvas;
                                                    f37 = f92;
                                                    canvas3.save();
                                                }
                                                canvas3.clipRect(f90, f37, f89, f91);
                                                ulVar10 = cnVar.z0;
                                                float x14 = view25.getX() + ulVar10.getLeft();
                                                ulVar11 = cnVar.z0;
                                                canvas3.translate(x14, view25.getY() + ulVar11.getY() + view25.getPaddingTop());
                                                num7 = cnVar.a9;
                                                boolean z15 = cnVar.W8;
                                                ch.p0 p0Var = t0Var2.E0;
                                                p0Var.getClass();
                                                org.telegram.ui.ActionBar.h6 h6Var = t0Var2.g1;
                                                if (h6Var != null) {
                                                    h6Var.b(t0Var2.u0, t0Var2.t0 + org.telegram.messenger.g0.L(4.0f), t0Var2.getMeasuredWidth(), t0Var2.v0);
                                                } else {
                                                    org.telegram.ui.ActionBar.m6.r(t0Var2.u0, t0Var2.t0 + org.telegram.messenger.g0.L(4.0f), t0Var2.getMeasuredWidth(), t0Var2.v0);
                                                }
                                                p0Var.A = f93;
                                                p0Var.B = z15;
                                                p0Var.d(canvas3, t0Var2.r2.c, num7);
                                                canvas3.restore();
                                                canvas3.save();
                                                ulVar12 = cnVar.z0;
                                                float x15 = view25.getX() + ulVar12.getLeft();
                                                ulVar13 = cnVar.z0;
                                                canvas3.translate(x15, view25.getY() + ulVar13.getY() + view25.getPaddingTop());
                                                int i25 = cnVar.b9;
                                                num8 = cnVar.a9;
                                                t0Var2.J(this, canvas3, i25, num8, f93);
                                                qlVar2 = this;
                                                canvas3.restore();
                                                z12 = z9;
                                            }
                                        }
                                    }
                                    qlVar2 = this;
                                    canvas3 = canvas;
                                    z12 = z9;
                                } else {
                                    i12 = childCount;
                                    i13 = i20;
                                    arrayList5 = arrayList;
                                    q1Var2 = q1Var;
                                    arrayList6 = arrayList4;
                                    xiVar = xiVar2;
                                    num4 = null;
                                    f20 = 1.0f;
                                }
                            }
                            z9 = z12;
                            if (q1Var2 != null) {
                                invalidate();
                            }
                            ulVar4 = cnVar.z0;
                            float left32 = ulVar4.getLeft();
                            ulVar5 = cnVar.z0;
                            float right22 = ulVar5.getRight();
                            float measuredHeight82 = (((getMeasuredHeight() - xiVar.e()) - cnVar.Yc) - cnVar.s9(org.telegram.ui.Components.i11.c)) - org.telegram.messenger.g0.L(f21);
                            g90Var3 = cnVar.W1;
                            if (g90Var3 == null) {
                            }
                            sjVar = cnVar.Z;
                            if (sjVar != null) {
                                f23 = Math.max(f23, ueVar.f ? 0.0f : Math.max(0.0f, ueVar.getMeasuredHeight() - (ueVar.c.getTranslationY() + ueVar.e)));
                            }
                            float f832 = f76 + f22;
                            float f842 = measuredHeight82 - f23;
                            if (q1Var2 != null) {
                            }
                            ulVar6 = cnVar.z0;
                            left32 = Math.max(left32, view8.getX() + ulVar6.getLeft());
                            ulVar7 = cnVar.z0;
                            f832 = Math.max(f832, view8.getY() + ulVar7.getY());
                            ulVar8 = cnVar.z0;
                            right22 = Math.min(right22, view8.getX() + ulVar8.getLeft() + view8.getMeasuredWidth());
                            ulVar9 = cnVar.z0;
                            f842 = Math.min(f842, view8.getY() + ulVar9.getY() + view8.getMeasuredHeight());
                            f24 = f842;
                            f25 = f832;
                            float f852 = right22;
                            float max22 = Math.max(left32, cnVar.m9());
                            if (f25 >= f24) {
                            }
                            ajVar2 = ajVar;
                            if (ajVar2 == null) {
                            }
                            if (ajVar2 != null) {
                            }
                            if (ajVar2 != null) {
                            }
                            arrayList3.add(q1Var2);
                            if (ajVar2 != null) {
                            }
                            arrayList2.add(q1Var2);
                            if (ajVar2 != null) {
                            }
                            arrayList5.add(q1Var2);
                            if (ajVar2 != null) {
                            }
                            arrayList6.add(q1Var2);
                            num5 = cnVar.a9;
                            if (num5 == null) {
                            }
                            float f892 = f30;
                            float f902 = f29;
                            View view252 = view9;
                            f14 = f28;
                            float f912 = f27;
                            float f922 = f26;
                            f31 = f76;
                            i14 = 1;
                            num6 = cnVar.a9;
                            if (num6 != null) {
                                paint13 = cnVar.R8;
                                if (paint13 == null) {
                                }
                                if (f25 < f24) {
                                }
                            }
                            qlVar2 = this;
                            canvas3 = canvas;
                            z12 = z9;
                        } else {
                            f20 = 1.0f;
                            i14 = 1;
                            qlVar2 = this;
                            djVar3 = djVar;
                            i12 = childCount;
                            i13 = i20;
                            xiVar = xiVar2;
                            f31 = f76;
                        }
                        i20 = i13 + 1;
                        qlVar3 = qlVar2;
                        y10 = f31;
                        f11 = f14;
                        xiVar2 = xiVar;
                        f10 = f20;
                        i10 = i14;
                        djVar = djVar3;
                        childCount = i12;
                    }
                    org.telegram.messenger.dj djVar4 = djVar;
                    int i26 = i10;
                    f16 = f10;
                    float f95 = y10;
                    qlVar = qlVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i27 = 0; i27 < size3; i27++) {
                            qlVar.Y(canvas3, f95, (org.telegram.ui.Cells.q1) arrayList3.get(i27), 0);
                        }
                        i11 = 0;
                        arrayList3.clear();
                    } else {
                        i11 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i28 = i11; i28 < size4; i28++) {
                            qlVar.Y(canvas3, f95, (org.telegram.ui.Cells.q1) arrayList2.get(i28), i26);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i29 = i11; i29 < size5; i29++) {
                            org.telegram.ui.Cells.q1 q1Var7 = (org.telegram.ui.Cells.q1) arrayList.get(i29);
                            if (q1Var7.getCurrentPosition() != null || q1Var7.getTransitionParams().x0) {
                                qlVar.Y(canvas3, f95, q1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i30 = i11; i30 < size6; i30++) {
                            org.telegram.ui.Cells.q1 q1Var8 = (org.telegram.ui.Cells.q1) arrayList4.get(i30);
                            if (q1Var8.getCurrentPosition() != null || q1Var8.getTransitionParams().x0) {
                                qlVar.Y(canvas3, f95, q1Var8, 3);
                            }
                        }
                    }
                    num3 = cnVar.a9;
                    if (num3 != null && djVar4 != null) {
                        paint8 = cnVar.R8;
                        if (paint8 != null) {
                            matrix4 = cnVar.S8;
                            matrix4.reset();
                            float measuredWidth13 = qlVar.getMeasuredWidth() / cnVar.P8.getWidth();
                            matrix5 = cnVar.S8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = cnVar.Q8;
                            matrix6 = cnVar.S8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = cnVar.R8;
                            f19 = cnVar.Z8;
                            paint11.setAlpha((int) (f19 * 255.0f));
                            float measuredWidth14 = qlVar.getMeasuredWidth();
                            float measuredHeight13 = qlVar.getMeasuredHeight();
                            paint12 = cnVar.R8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = cnVar.T8;
                            f17 = cnVar.V8;
                            f18 = cnVar.Y8;
                            paint9.setAlpha((int) (f18 * f17 * 255.0f));
                            float measuredWidth15 = qlVar.getMeasuredWidth();
                            float measuredHeight14 = qlVar.getMeasuredHeight();
                            paint10 = cnVar.T8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i31 = i11; i31 < size7; i31++) {
                            org.telegram.ui.Cells.q1 q1Var9 = (org.telegram.ui.Cells.q1) arrayList4.get(i31);
                            if (q1Var9.getCurrentPosition() != null || q1Var9.getTransitionParams().x0) {
                                qlVar.Y(canvas3, f95, q1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = cnVar.a9;
                    if (num13 == null) {
                        f60 = cnVar.Y8;
                        if (f60 < f16) {
                            paint25 = cnVar.R8;
                            if (paint25 != null) {
                                matrix13 = cnVar.S8;
                                matrix13.reset();
                                float measuredWidth16 = qlVar.getMeasuredWidth() / cnVar.P8.getWidth();
                                matrix14 = cnVar.S8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = cnVar.Q8;
                                matrix15 = cnVar.S8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = cnVar.R8;
                                f63 = cnVar.Z8;
                                paint28.setAlpha((int) (f63 * 255.0f));
                                float measuredWidth17 = qlVar.getMeasuredWidth();
                                float measuredHeight15 = qlVar.getMeasuredHeight();
                                paint29 = cnVar.R8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = cnVar.T8;
                                f61 = cnVar.V8;
                                f62 = cnVar.Y8;
                                paint26.setAlpha((int) ((f16 - f62) * f61 * 255.0f));
                                float measuredWidth18 = qlVar.getMeasuredWidth();
                                float measuredHeight16 = qlVar.getMeasuredHeight();
                                paint27 = cnVar.T8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            qlVar = qlVar3;
            f16 = 1.0f;
            f14 = 0.0f;
            f15 = 20.0f;
            num13 = cnVar.a9;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            qlVar = qlVar3;
            f14 = 0.0f;
            f15 = 20.0f;
        }
        view3 = cnVar.X8;
        if (view3 != null || ((ArrayList) cnVar.ha.c).size() > 0) {
            g90Var = cnVar.W1;
            if (g90Var != null) {
                g90Var2 = cnVar.W1;
            }
            super.drawChild(canvas3, cnVar.x1, SystemClock.uptimeMillis());
            kj kjVar = cnVar.l3;
            if (kjVar != null && kjVar.getTag() != null) {
                super.drawChild(canvas3, cnVar.l3, SystemClock.uptimeMillis());
            }
            ij ijVar2 = cnVar.m3;
            if (ijVar2 != null && ijVar2.getTag() != null) {
                super.drawChild(canvas3, cnVar.m3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.jz jzVar = cnVar.H9;
            if (jzVar != null) {
                super.drawChild(canvas3, jzVar, SystemClock.uptimeMillis());
            }
            wh.i iVar = cnVar.sa;
            if (iVar != null) {
                super.drawChild(canvas3, iVar, SystemClock.uptimeMillis());
            }
            fi.m3 m3Var3 = cnVar.s2;
            if (m3Var3 != null) {
                super.drawChild(canvas3, m3Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = cnVar.M3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, cnVar.M3, SystemClock.uptimeMillis());
            }
            ok okVar = cnVar.N3;
            if (okVar != null && okVar.getVisibility() == 0) {
                super.drawChild(canvas3, cnVar.N3, SystemClock.uptimeMillis());
            }
            fi.m3 m3Var4 = cnVar.L1;
            if (m3Var4 != null && m3Var4.getVisibility() == 0) {
                super.drawChild(canvas3, cnVar.L1, SystemClock.uptimeMillis());
            }
            bl blVar = cnVar.P1;
            if (blVar != null && blVar.getVisibility() == 0) {
                super.drawChild(canvas3, cnVar.P1, SystemClock.uptimeMillis());
            }
            fi.m3 m3Var5 = cnVar.N1;
            if (m3Var5 != null && m3Var5.getVisibility() == 0) {
                super.drawChild(canvas3, cnVar.N1, SystemClock.uptimeMillis());
            }
            sj sjVar2 = cnVar.Z;
            if (sjVar2 != null && sjVar2.L != null) {
                canvas3.save();
                canvas3.translate(cnVar.Z.L.getX() + cnVar.Z.getX(), cnVar.Z.L.getY() + cnVar.Z.getY());
                cnVar.Z.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (cnVar.Ka > 0 && qlVar.f < org.telegram.messenger.g0.L(f15)) {
            int themedColor = cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6);
            if (qlVar.m0 == null) {
                qlVar.m0 = new Paint();
            }
            if (qlVar.n0 != themedColor) {
                Paint paint32 = qlVar.m0;
                qlVar.n0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, qlVar.getMeasuredHeight() - cnVar.Ka, qlVar.getMeasuredWidth(), qlVar.getMeasuredHeight(), qlVar.m0);
            canvas3 = canvas6;
        }
        xo xoVar = cnVar.ka;
        if (xoVar != null) {
            if (xoVar.S > 0.0f && !xoVar.R) {
                int inputBubbleTop = (int) cnVar.T.getInputBubbleTop();
                int inputBubbleBottom = (int) cnVar.T.getInputBubbleBottom();
                cn cnVar2 = cnVar.oa;
                int i32 = inputBubbleTop - ((int) (cnVar.pa * (cnVar2 == null ? f14 : cnVar2.ja)));
                xo xoVar2 = cnVar.ka;
                qlVar.getMeasuredWidth();
                xoVar2.b(canvas3, i32, inputBubbleBottom);
            }
        }
        if (cnVar.oa != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, qlVar.getMeasuredWidth(), qlVar.getMeasuredHeight(), (int) (cnVar.pa * 255.0f), 31);
            canvas3 = canvas;
            cnVar.oa.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        cnVar.Sa.e(canvas3);
        if (i17 >= 0) {
            canvas3.restore();
        }
        if (cnVar.Fa) {
            canvas3.save();
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            float x16 = lVar.getX();
            lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            canvas3.translate(x16, lVar2.getY());
            lVar3 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            float width = lVar3.getWidth();
            lVar4 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, lVar4.getHeight(), (int) (cnVar.Ga * 255.0f), 31);
            lVar5 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            lVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nk nkVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (nkVar = this.w0.ab) == null || !nkVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        nkVar.a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r4 == r6.getBackButton()) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        ak akVar;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar;
        cn cnVar = this.w0;
        jh.e eVar = cnVar.b4;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y10 = (org.telegram.messenger.g0.E || cnVar.isInBubbleMode()) ? (cnVar.Z.getEmojiView() != null ? cnVar.Z.getEmojiView() : cnVar.Z).getY() : cnVar.Z.getY();
        View view = cnVar.X8;
        if (view != null) {
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        }
        sj sjVar = cnVar.Z;
        if (sjVar == null || !sjVar.z3 || motionEvent.getY() >= y10) {
            cnVar.E9 = motionEvent.getY();
            org.telegram.ui.Cells.u9 n10 = cnVar.s9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!cnVar.s9.x() || !cnVar.s9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                fi.g1 g1Var = cnVar.E1;
                if (g1Var != null) {
                    if (cnVar.I3 != null) {
                        z9 = g1Var.B(motionEvent);
                        if (cnVar.E1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !cnVar.s9.x() || (motionEvent.getY() >= cnVar.z0.getTop() && motionEvent.getY() <= cnVar.z0.getBottom())) {
                            akVar = cnVar.Ra;
                            if (!akVar.n) {
                                return akVar.g(motionEvent);
                            }
                            ab.q qVar = ab.q.e;
                            if (qVar == null || !qVar.a) {
                                if (cnVar.isInPreviewMode() && cnVar.ea) {
                                    if (motionEvent.getAction() == 0) {
                                        int i7 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (cnVar.x1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                h6.m mVar = cnVar.x1.e[i10 == 0 ? 1 : i10 == 1 ? i7 : i11];
                                                if (mVar != null) {
                                                    ((kh.b) mVar.b).getLocationInWindow(iArr2);
                                                    Rect rect = org.telegram.messenger.g0.Q;
                                                    int i12 = iArr2[0] - iArr[0];
                                                    rect.set(i12, iArr2[1] - iArr[1], org.telegram.messenger.g0.L(56.0f) + i12, org.telegram.messenger.g0.L(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z10 = true;
                                                        break;
                                                    }
                                                }
                                                i10++;
                                                i7 = 2;
                                            }
                                        }
                                        z10 = false;
                                        wi wiVar = cnVar.o1;
                                        if (wiVar != null) {
                                            wiVar.getLocationInWindow(iArr2);
                                            Rect rect2 = org.telegram.messenger.g0.Q;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], cnVar.o1.getMeasuredWidth() + i13, cnVar.o1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z11 = true;
                                                if (z10) {
                                                    this.r0 = motionEvent.getX();
                                                    this.s0 = motionEvent.getY();
                                                    this.t0 = SystemClock.elapsedRealtime();
                                                    this.u0 = z11;
                                                    wi wiVar2 = cnVar.o1;
                                                    if (wiVar2 != null) {
                                                        wiVar2.h0.c(z11);
                                                    }
                                                    z9 = true;
                                                } else {
                                                    this.t0 = -1L;
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z10) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        wi wiVar3 = cnVar.o1;
                                        if (wiVar3 != null) {
                                            wiVar3.h0.c(false);
                                        }
                                        if (this.u0 || (a8.r9.a(this.r0, this.s0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.L(6.0f) && SystemClock.elapsedRealtime() - this.t0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.u0) {
                                                r4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                                                cnVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) r4Var2).S(ProfileActivity.D4(cnVar.j6));
                                            } else {
                                                r4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                                                ((ActionBarLayout) r4Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.t0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.t0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z9) {
                                }
                            } else {
                                r4 r4Var3 = (r4) ab.q.o().d;
                                if (r4Var3 != null) {
                                    r4Var3.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (cnVar.s9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n10.getX(), n10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = g1Var.e;
                        if (g1Var.H) {
                            g1Var.I = true;
                            g1Var.H = false;
                            g1Var.F(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                g1Var.F(view2, g1Var.D ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            g1Var.d = 0;
                            g1Var.c = 1.0f;
                            org.telegram.ui.Components.k61 k61Var = g1Var.M;
                            if (k61Var != null) {
                                k61Var.e(1.0f, 0, g1Var.b);
                            }
                            g1Var.x(false);
                        }
                    }
                }
                z9 = false;
                if (motionEvent.getAction() == 0) {
                }
                akVar = cnVar.Ra;
                if (!akVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        cn cnVar = this.w0;
        org.telegram.ui.Components.s01 s01Var = cnVar.m0;
        float progress = (view == s01Var || view == this.L || view == cnVar.Y || (view instanceof org.telegram.ui.ActionBar.j5) || s01Var == null) ? 0.0f : s01Var.getProgress() * cnVar.m0.getContentWidth();
        if (progress <= 0.0f) {
            return Z(canvas, view, j3);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j3);
        canvas.restore();
        return Z;
    }

    @Override // org.telegram.ui.Components.st0
    public float getBottomOffset() {
        return this.w0.z0.getBottom();
    }

    public cn getChatActivity() {
        return this.w0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.w0.getThemedColor(org.telegram.ui.ActionBar.m6.ua);
        ColorDrawable colorDrawable = this.v0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.v0 = new ColorDrawable(themedColor);
        }
        return this.v0;
    }

    @Override // org.telegram.ui.Components.st0
    public int getKeyboardHeight() {
        if (this.w0.kb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.st0
    public float getListTranslationY() {
        return this.w0.z0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.st0
    public Drawable getNewDrawable() {
        cn cnVar = this.w0;
        if (cnVar.R9()) {
            return getCompactBackground();
        }
        Drawable m10 = cnVar.za.m();
        return m10 != null ? m10 : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.st0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.w0.za.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.st0
    public int getScrollOffset() {
        return this.w0.z0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        View view;
        super.onAttachedToWindow();
        cn cnVar = this.w0;
        if (cnVar.kb) {
            this.H.b = cnVar.l1;
        } else {
            r4Var = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                if (((ActionBarLayout) r4Var2).b) {
                    org.telegram.ui.ActionBar.i1 i1Var = this.H;
                    r4Var3 = ((org.telegram.ui.ActionBar.f2) cnVar).parentLayout;
                    i1Var.b = (FrameLayout) r4Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        cnVar.Z.setAdjustPanLayoutHelper(this.H);
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if (ijVar != null && ((ijVar.h4() || org.telegram.messenger.ij.L4(ijVar.k)) && ijVar.T == 0 && org.telegram.messenger.ij.B0(ijVar.k) == cnVar.j6)) {
            MediaController.B().p0(cnVar.d8(false), cnVar.J8, cnVar.H8, true);
        }
        xo xoVar = cnVar.ka;
        if (xoVar != null) {
            xoVar.F.P();
            org.telegram.ui.Components.h5 h5Var = xoVar.k0;
            if (h5Var != null && (view = xoVar.a0) != null) {
                h5Var.a(view);
            }
            org.telegram.messenger.qs.f(xoVar.e0).c(xoVar, org.telegram.messenger.qs.r);
        }
        cnVar.Sa.i();
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        cn cnVar = this.w0;
        xo xoVar = cnVar.ka;
        if (xoVar != null) {
            org.telegram.messenger.qs.f(xoVar.e0).n(xoVar, org.telegram.messenger.qs.r);
            xoVar.F.R();
            org.telegram.ui.Components.h5 h5Var = xoVar.k0;
            if (h5Var != null && (view = xoVar.a0) != null) {
                h5Var.n(view);
            }
            xoVar.Q = 0.0f;
            xoVar.P = 0L;
            cnVar.ka = null;
        }
        cnVar.Sa.j();
        org.telegram.messenger.g0.h3(new org.telegram.messenger.rc(15));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        cn cnVar;
        fi.p5 p5Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (p5Var = (cnVar = this.w0).M2) == null || !p5Var.a() || cnVar.M2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        if (r8 != r3.id) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int D;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int L;
        boolean z10;
        org.telegram.ui.ActionBar.l lVar3;
        int i19;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        cn cnVar = this.w0;
        xi xiVar = cnVar.w;
        int i20 = (measuredWidth - cnVar.pb) - cnVar.qb;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.qs.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    D = jg.g.D(i20, measuredWidth2, 2, cnVar.pb) + layoutParams.leftMargin;
                    i13 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i14 = cnVar.pb + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i17 = layoutParams.topMargin + getPaddingTop();
                            lVar5 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                            if (childAt != lVar5) {
                                lVar6 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                if (lVar6.getVisibility() == 0) {
                                    lVar7 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                    i17 += lVar7.getMeasuredHeight();
                                }
                            }
                        } else if (i23 != 80) {
                            i17 = layoutParams.topMargin;
                        } else {
                            i15 = (i12 - i10) - measuredHeight;
                            i16 = layoutParams.bottomMargin;
                        }
                        if (a0(childAt)) {
                            i17 = 0;
                            i14 = 0;
                        } else {
                            if (childAt != cnVar.ha && childAt != cnVar.sa && childAt != cnVar.T && !(childAt instanceof org.telegram.ui.Components.y20) && childAt != cnVar.m0) {
                                if (childAt instanceof org.telegram.ui.Cells.u9) {
                                    i18 = cnVar.Va;
                                } else if (childAt == cnVar.e1) {
                                    lVar3 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                    if (lVar3.getVisibility() == 0) {
                                        lVar4 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                        i19 = lVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    i17 += i19;
                                } else if (cnVar.Z.t0(childAt)) {
                                    if (!org.telegram.messenger.g0.E) {
                                        z10 = ((org.telegram.ui.ActionBar.f2) cnVar).inBubbleMode;
                                        if (!z10) {
                                            i17 = cnVar.Z.getBottom();
                                        }
                                    }
                                    i17 = cnVar.Z.getTop() - childAt.getMeasuredHeight();
                                    L = org.telegram.messenger.g0.L(1.0f);
                                    i17 += L;
                                } else {
                                    sj sjVar = cnVar.Z;
                                    if (sjVar != null && (childAt == sjVar.O1 || childAt == sjVar.N1)) {
                                        i17 = org.telegram.messenger.camera.q.w(7.0f, xiVar.e(), i17);
                                        i14 -= org.telegram.messenger.g0.L(3.0f);
                                    } else if (childAt == cnVar.K2) {
                                        i17 = org.telegram.messenger.camera.q.w(7.0f, xiVar.e(), i17);
                                    } else if (sjVar != null && childAt == sjVar.e1) {
                                        i17 = org.telegram.messenger.camera.q.w(9.0f, xiVar.e(), i17);
                                    } else if (childAt == cnVar.z0 || childAt == cnVar.x0 || childAt == cnVar.l3 || childAt == cnVar.m3 || childAt == cnVar.n3) {
                                        i18 = cnVar.Va;
                                    } else if (childAt != cnVar.Q) {
                                        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                        if (childAt == lVar) {
                                            i17 -= getPaddingTop();
                                            if (cnVar.isInPreviewMode()) {
                                                L = org.telegram.messenger.g0.L(1.0f);
                                                i17 += L;
                                            }
                                        } else if (childAt == cnVar.H8) {
                                            lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                            i17 = lVar2.getMeasuredHeight();
                                        } else if (childAt != cnVar.p3 && childAt != cnVar.q3 && childAt != cnVar.w0) {
                                            if (childAt instanceof org.telegram.ui.Components.ia0) {
                                                i17 = org.telegram.messenger.g0.m;
                                            } else if (childAt != cnVar.U) {
                                                if (childAt != cnVar.b4) {
                                                }
                                            }
                                        }
                                    } else if (sjVar.z0()) {
                                        i17 -= org.telegram.messenger.g0.L(48.0f);
                                    }
                                }
                                i17 = -i18;
                            }
                            i17 = 0;
                        }
                        childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
                    } else {
                        i15 = (((i12 - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    i17 = i15 - i16;
                    if (a0(childAt)) {
                    }
                    childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
                } else {
                    D = (measuredWidth - cnVar.qb) - measuredWidth2;
                    i13 = layoutParams.rightMargin;
                }
                i14 = D - i13;
                if (i23 == 16) {
                }
                i17 = i15 - i16;
                if (a0(childAt)) {
                }
                childAt.layout(i14, i17, measuredWidth2 + i14, measuredHeight + i17);
            }
        }
        ij ijVar = cnVar.m3;
        if (ijVar != null) {
            ijVar.setBackgroundHeight(getMeasuredHeight());
        }
        cnVar.L9();
        cnVar.N9();
        cnVar.ud(false, false);
        R();
        cnVar.I7();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x053b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int childCount;
        boolean z9;
        int i11;
        int i12;
        org.telegram.ui.Components.bc bcVar;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        int i13;
        org.telegram.ui.ActionBar.l lVar6;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.x xVar;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.r0 r0Var2;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        cn cnVar = this.w0;
        xi xiVar = cnVar.w;
        int i14 = (size - cnVar.pb) - cnVar.qb;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
        ri.a aVar = cnVar.M.a;
        if (aVar instanceof ri.b) {
            ((ri.b) aVar).b(i14, size2);
        }
        int i15 = 0;
        if (this.h0 != i14) {
            cnVar.R4 = false;
            this.h0 = makeMeasureSpec;
            z12 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
            if (z12 || (user = cnVar.f) == null || !user.self) {
                cnVar.fa = false;
            } else {
                org.telegram.ui.ActionBar.m5 titleTextView = cnVar.o1.getTitleTextView();
                if (i14 - org.telegram.messenger.g0.L(152.0f) > org.telegram.messenger.g0.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    cnVar.fa = !cnVar.ga;
                } else {
                    cnVar.fa = false;
                }
            }
            if (cnVar.fa || cnVar.ga || org.telegram.messenger.t10.v(cnVar.f)) {
                wi wiVar = cnVar.o1;
                if (wiVar != null && wiVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) cnVar.o1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(cnVar.f4 == 3 && ((r0Var = cnVar.l0) == null || r0Var.getVisibility() != 0) ? 52.0f : 92.0f);
                }
            } else {
                wi wiVar2 = cnVar.o1;
                if (wiVar2 != null && wiVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) cnVar.o1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(52.0f);
                }
            }
            if (cnVar.fa) {
                lVar8 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (!lVar8.n0 && (r0Var2 = cnVar.o0) != null) {
                    r0Var2.setVisibility(0);
                }
                org.telegram.ui.ActionBar.r0 r0Var3 = cnVar.i0;
                if (r0Var3 != null) {
                    r0Var3.t(40);
                }
            } else {
                org.telegram.ui.ActionBar.r0 r0Var4 = cnVar.i0;
                if (r0Var4 != null) {
                    r0Var4.S(40);
                }
                org.telegram.ui.ActionBar.r0 r0Var5 = cnVar.o0;
                if (r0Var5 != null) {
                    r0Var5.setVisibility(8);
                }
            }
            lVar7 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!lVar7.n0 && (xVar = cnVar.p0) != null) {
                xVar.e((!cnVar.ga || cnVar.fa) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.r0 r0Var6 = cnVar.i0;
            if (r0Var6 != null) {
                TLRPC.UserFull userFull = cnVar.q8;
                if (cnVar.ga) {
                    r0Var6.t(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    r0Var6.S(32);
                }
            }
            cnVar.R4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        measureChildWithMargins(lVar, makeMeasureSpec, 0, i10, 0);
        lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z13 = this.f + cnVar.Ja >= org.telegram.messenger.g0.L(20.0f);
        if (this.g0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (cnVar.Ka > 0 && keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            cnVar.Ja = cnVar.Ka;
        } else if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f)) {
            cnVar.Ja = cnVar.Z.s0() ? cnVar.Z.getEmojiPadding() : 0;
        } else {
            cnVar.Ja = 0;
        }
        setEmojiKeyboardHeight(cnVar.Ja);
        boolean z14 = this.f + cnVar.Ja >= org.telegram.messenger.g0.L(20.0f);
        if (MediaController.B().u0 != null && MediaController.B().u0.h4() && z13 != z14) {
            for (int i16 = 0; i16 < cnVar.z0.getChildCount(); i16++) {
                View childAt = cnVar.z0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.messenger.ij messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                    if (messageObject.h4() && MediaController.B().I(messageObject)) {
                        cnVar.z0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            cnVar.B0.i1(R, (int) (((((cnVar.z0.getMeasuredHeight() - cnVar.N9) - cnVar.Wa) + ((this.f + cnVar.Ja) - r1)) - (z14 ? org.telegram.messenger.g0.u : org.telegram.messenger.g0.g3(cnVar.aa(), cnVar.R9()))) / 2.0f), false);
                            cnVar.C0.g(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(cnVar.Z, makeMeasureSpec, 0, i10, 0);
                            z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
                            if (!z9 || cnVar.kb) {
                                this.f0 = 0;
                            } else {
                                this.f0 = cnVar.Z.getMeasuredHeight();
                            }
                            cnVar.Va = 0;
                            cnVar.Wa = 0;
                            if (org.telegram.messenger.iz.f() && !cnVar.kb && cnVar.G != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = cnVar.H;
                                cnVar.Va = i18;
                                cnVar.Wa = i18;
                            }
                            i11 = 0;
                            while (i11 < childCount) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i11);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != cnVar.Z) {
                                        lVar4 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                        if (childAt2 != lVar4) {
                                            if (a0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == cnVar.z0 || childAt2 == cnVar.x0 || (childAt2 instanceof org.telegram.ui.Cells.u9)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), cnVar.Va + size2 + cnVar.Wa), TLObject.FLAG_30));
                                                } else if (childAt2 == cnVar.Q) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int L = org.telegram.messenger.g0.L(10.0f);
                                                    int i20 = i17 - this.f0;
                                                    z11 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, org.telegram.messenger.g0.L((cnVar.Z.z0() ? 48 : i15) + 2) + (i20 - (z11 ? org.telegram.messenger.g0.m : i15))), TLObject.FLAG_30));
                                                } else if (childAt2 == cnVar.p3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    cnVar.p3.setInternalPadding(org.telegram.messenger.g0.L(12.0f) + xiVar.e() + ((int) cnVar.Zc));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == cnVar.q3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - xiVar.e()) - ((int) cnVar.Zc)) - org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == cnVar.e1) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                                } else if (cnVar.Z.t0(childAt2)) {
                                                    org.telegram.ui.Components.hf hfVar = cnVar.Z.H1;
                                                    if (childAt2 == hfVar && hfVar != null) {
                                                        i19 = hfVar.getKeyboardHeight();
                                                    }
                                                    z10 = ((org.telegram.ui.ActionBar.f2) cnVar).inBubbleMode;
                                                    if (z10) {
                                                        int paddingTop2 = getPaddingTop() + (i17 - this.f0) + measuredHeight;
                                                        if (i19 < 0) {
                                                            i19 = Math.max(Math.min(paddingTop2, org.telegram.messenger.g0.L(350.0f)), paddingTop2 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                    } else if (org.telegram.messenger.g0.E) {
                                                        int paddingTop3 = getPaddingTop() + (((i17 - this.f0) + measuredHeight) - org.telegram.messenger.g0.m);
                                                        if (i19 < 0) {
                                                            i19 = Math.max(Math.min(paddingTop3, org.telegram.messenger.g0.L(350.0f)), paddingTop3 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                    }
                                                } else {
                                                    lj ljVar = cnVar.W1;
                                                    if (childAt2 == ljVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ljVar.getLayoutParams();
                                                        jg.i1 adapter = cnVar.W1.getAdapter();
                                                        if (adapter.w0 == null || adapter.h0) {
                                                            cnVar.W1.setIgnoreLayout(true);
                                                            layoutParams.height = i17;
                                                            layoutParams.topMargin = 0;
                                                            cnVar.W1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == cnVar.s9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                        int i21 = i17 + cnVar.Va;
                                                        if (keyboardHeight <= org.telegram.messenger.g0.L(20.0f) || getLayoutParams().height >= 0 || cnVar.kb) {
                                                            rl rlVar = cnVar.s9;
                                                            rlVar.d0 = 0;
                                                            rlVar.w();
                                                        } else {
                                                            i21 += keyboardHeight;
                                                            rl rlVar2 = cnVar.s9;
                                                            rlVar2.d0 = keyboardHeight;
                                                            rlVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.ia0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n, TLObject.FLAG_30));
                                                    } else if (childAt2 == cnVar.f2) {
                                                        lVar5 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                                        if (lVar5.getVisibility() == 0) {
                                                            lVar6 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                                            i13 = size2 - lVar6.getMeasuredHeight();
                                                        } else {
                                                            i13 = size2;
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
                                                    } else {
                                                        measureChildWithMargins(childAt2, makeMeasureSpec, 0, i10, 0);
                                                    }
                                                }
                                                i11++;
                                                i15 = 0;
                                            }
                                        }
                                    }
                                    i11++;
                                    i15 = 0;
                                }
                                i11++;
                                i15 = 0;
                            }
                            if (cnVar.Q4) {
                                cnVar.R4 = true;
                                cnVar.L9();
                                cnVar.N9();
                                cnVar.Q4 = false;
                                cj cjVar = cnVar.z0;
                                cjVar.measure(View.MeasureSpec.makeMeasureSpec(cjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(cnVar.z0.getMeasuredHeight(), TLObject.FLAG_30));
                                cnVar.R4 = false;
                            }
                            i12 = cnVar.L4;
                            if (i12 != -1) {
                                org.telegram.messenger.g0.h3(new bg.m0(this, i12, 27));
                                cnVar.L4 = -1;
                            }
                            bcVar = org.telegram.ui.Components.bc.w;
                            if (bcVar != null && cnVar.Cc != null) {
                                bcVar.l();
                            }
                            cnVar.h7();
                            this.g0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.ie ieVar = cnVar.Z.Y3;
        org.telegram.messenger.g0.r(ieVar);
        ieVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(cnVar.Z, makeMeasureSpec, 0, i10, 0);
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
        if (z9) {
        }
        this.f0 = 0;
        cnVar.Va = 0;
        cnVar.Wa = 0;
        if (org.telegram.messenger.iz.f()) {
            int i182 = cnVar.H;
            cnVar.Va = i182;
            cnVar.Wa = i182;
        }
        i11 = 0;
        while (i11 < childCount) {
        }
        if (cnVar.Q4) {
        }
        i12 = cnVar.L4;
        if (i12 != -1) {
        }
        bcVar = org.telegram.ui.Components.bc.w;
        if (bcVar != null) {
            bcVar.l();
        }
        cnVar.h7();
        this.g0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        cn cnVar = this.w0;
        ih.d.c(cnVar.N8, cnVar.fragmentView);
        cnVar.O8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w0.R4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        cn cnVar = this.w0;
        cnVar.Q9 = i10;
        cnVar.L9();
        cnVar.N9();
    }

    @Override // org.telegram.ui.Components.st0
    public final void L() {
    }

    @Override // org.telegram.ui.Components.st0
    public final void V() {
    }

    @Override // org.telegram.ui.Components.st0
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
    }
}
