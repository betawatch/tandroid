package org.telegram.ui;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class qm extends org.telegram.ui.Components.mw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public final om F0;
    public final om G0;
    public final RectF H0;
    public float I0;
    public float J0;
    public long K0;
    public boolean L0;
    public final /* synthetic */ yn M0;
    public int w0;
    public int x0;
    public int y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.ui.om] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.om] */
    public qm(yn ynVar, Context context, org.telegram.ui.ActionBar.c5 c5Var) {
        super(context, c5Var);
        this.M0 = ynVar;
        this.w0 = 0;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        final int i10 = 0;
        this.F0 = new bh.a(this) { // from class: org.telegram.ui.om
            public final /* synthetic */ qm b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // bh.a
            public final void b(ah.a aVar, RectF rectF) {
                switch (i10) {
                }
                aVar.a = true;
            }

            @Override // bh.a
            public final void f(Canvas canvas, RectF rectF) {
                switch (i10) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        yn ynVar2 = this.b.M0;
                        if (ynVar2.v0.Z0()) {
                            ynVar2.v0.f(canvas, rectF);
                            break;
                        } else {
                            ynVar2.v0.x1(canvas, rectF);
                            for (int i11 = 0; i11 < ynVar2.v0.getChildCount(); i11++) {
                                View childAt = ynVar2.v0.getChildAt(i11);
                                if (!yn.d2(ynVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                                        if (u1Var.C1()) {
                                            canvas.save();
                                            canvas.translate(0.0f, u1Var.V);
                                            u1Var.D1(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        ynVar2.v0.drawChild(canvas, childAt, uptimeMillis);
                                        if (u1Var.U2()) {
                                            canvas.save();
                                            canvas.translate(u1Var.getX(), u1Var.getY());
                                            u1Var.X1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                                        ynVar2.v0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.w0) childAt).z(canvas);
                                        canvas.restore();
                                    } else {
                                        ynVar2.v0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            ynVar2.v0.y1(canvas, rectF);
                            break;
                        }
                    default:
                        qm qmVar = this.b;
                        yn ynVar3 = qmVar.M0;
                        RectF rectF2 = qmVar.H0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, qmVar.getWidth(), qmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = ynVar3.vc.e;
                            int i12 = (int) ((1.0f - f7) * 255.0f);
                            int i13 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.i6.l0(org.telegram.ui.ActionBar.i6.l1(f7 * 0.85f, ynVar3.getThemedColor(org.telegram.ui.ActionBar.i6.d6))));
                            }
                            gh.d.b(qmVar.F0, canvas, rectF, ynVar3.v0, qmVar, i12);
                            ai.w0 w0Var = ynVar3.J3;
                            if (w0Var != null) {
                                gh.d.b(w0Var, canvas, rectF, w0Var, qmVar, i13);
                            }
                            ci.i1 i1Var = ynVar3.o1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = ynVar3.o1.getChildCount();
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt2 = ynVar3.o1.getChildAt(i14);
                                    if ((childAt2 instanceof ao) && childAt2.getVisibility() == 0) {
                                        qm qmVar2 = ((ao) childAt2).a.V0;
                                        gh.d.a(qmVar2.G0, canvas, rectF, qmVar2, qmVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.G0 = new bh.a(this) { // from class: org.telegram.ui.om
            public final /* synthetic */ qm b;

            {
                this.b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // bh.a
            public final void b(ah.a aVar, RectF rectF) {
                switch (i11) {
                }
                aVar.a = true;
            }

            @Override // bh.a
            public final void f(Canvas canvas, RectF rectF) {
                switch (i11) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        yn ynVar2 = this.b.M0;
                        if (ynVar2.v0.Z0()) {
                            ynVar2.v0.f(canvas, rectF);
                            break;
                        } else {
                            ynVar2.v0.x1(canvas, rectF);
                            for (int i112 = 0; i112 < ynVar2.v0.getChildCount(); i112++) {
                                View childAt = ynVar2.v0.getChildAt(i112);
                                if (!yn.d2(ynVar2, childAt, rectF)) {
                                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                                        if (u1Var.C1()) {
                                            canvas.save();
                                            canvas.translate(0.0f, u1Var.V);
                                            u1Var.D1(canvas, true, false);
                                            canvas.restore();
                                        }
                                        canvas.restore();
                                        ynVar2.v0.drawChild(canvas, childAt, uptimeMillis);
                                        if (u1Var.U2()) {
                                            canvas.save();
                                            canvas.translate(u1Var.getX(), u1Var.getY());
                                            u1Var.X1(canvas);
                                            canvas.restore();
                                        }
                                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                                        ynVar2.v0.drawChild(canvas, childAt, uptimeMillis);
                                        canvas.save();
                                        canvas.translate(childAt.getX(), childAt.getY());
                                        ((org.telegram.ui.Cells.w0) childAt).z(canvas);
                                        canvas.restore();
                                    } else {
                                        ynVar2.v0.drawChild(canvas, childAt, uptimeMillis);
                                    }
                                }
                            }
                            ynVar2.v0.y1(canvas, rectF);
                            break;
                        }
                    default:
                        qm qmVar = this.b;
                        yn ynVar3 = qmVar.M0;
                        RectF rectF2 = qmVar.H0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, qmVar.getWidth(), qmVar.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f7 = ynVar3.vc.e;
                            int i12 = (int) ((1.0f - f7) * 255.0f);
                            int i13 = (int) (255.0f * f7);
                            if (f7 > 0.0f) {
                                canvas.drawRect(rectF2, org.telegram.ui.ActionBar.i6.l0(org.telegram.ui.ActionBar.i6.l1(f7 * 0.85f, ynVar3.getThemedColor(org.telegram.ui.ActionBar.i6.d6))));
                            }
                            gh.d.b(qmVar.F0, canvas, rectF, ynVar3.v0, qmVar, i12);
                            ai.w0 w0Var = ynVar3.J3;
                            if (w0Var != null) {
                                gh.d.b(w0Var, canvas, rectF, w0Var, qmVar, i13);
                            }
                            ci.i1 i1Var = ynVar3.o1;
                            if (i1Var != null && i1Var.getVisibility() == 0) {
                                int childCount = ynVar3.o1.getChildCount();
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt2 = ynVar3.o1.getChildAt(i14);
                                    if ((childAt2 instanceof ao) && childAt2.getVisibility() == 0) {
                                        qm qmVar2 = ((ao) childAt2).a.V0;
                                        gh.d.a(qmVar2.G0, canvas, rectF, qmVar2, qmVar);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.H0 = new RectF();
        this.H = new pm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.M0;
        ynVar.V0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        kVar.setTranslationY(0.0f);
        al alVar = ynVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(ynVar.m1 != null ? r3.getCurrentHeight() : 0);
        }
        ci.e4 e4Var = ynVar.u1;
        if (e4Var != null) {
            e4Var.setTranslationY(0.0f);
        }
        ci.e4 e4Var2 = ynVar.t1;
        if (e4Var2 != null) {
            e4Var2.setTranslationY(0.0f);
        }
        ynVar.O0.setTranslationY(0.0f);
        ynVar.N.setTranslationY(0.0f);
        ynVar.u9 = 0.0f;
        ynVar.v9 = 0.0f;
        ynVar.V0.setBackgroundTranslation(0);
        org.telegram.ui.Components.k60 k60Var = ynVar.Z2;
        if (k60Var != null) {
            k60Var.e(0.0f);
        }
        ci.r6 r6Var = ynVar.w2;
        if (r6Var != null) {
            org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) r6Var.b;
            gaVar.u = 0.0f;
            gaVar.d.invalidate();
        }
        ynVar.setFragmentPanTranslationOffset(0);
        ynVar.o9();
    }

    @Override // org.telegram.ui.Components.mw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.mw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.mw0
    public final void U(Drawable drawable) {
        yn ynVar = this.M0;
        hh.l lVar = ynVar.U;
        if (drawable instanceof org.telegram.ui.Components.pc0) {
            ((org.telegram.ui.Components.pc0) drawable).p();
        }
        fh.a c10 = lVar.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(lVar.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(lVar.a(c10));
        ynVar.Ab = computePerceivedBrightness <= 0.721f;
        ynVar.Bb = computePerceivedBrightness2 <= 0.9f;
        ynVar.J.a = c10;
        jh.f fVar = ynVar.V;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.g gVar = ynVar.Q;
        if (gVar != null) {
            gVar.invalidate();
        }
        ynVar.V0.invalidate();
        Iterator it = ynVar.y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        ynVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        int save = canvas.save();
        yn ynVar = this.M0;
        float x10 = u1Var.getX() + ynVar.v0.getLeft();
        float y3 = u1Var.getY() + ynVar.v0.getY() + u1Var.getPaddingTop();
        float alpha = u1Var.a() ? u1Var.getAlpha() : 1.0f;
        canvas.clipRect(ynVar.v0.getLeft(), f7, ynVar.v0.getRight(), ((((ynVar.v0.getY() + ynVar.v0.getMeasuredHeight()) - ynVar.ya) - ynVar.v.d()) - ynVar.pc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        u1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            u1Var.m2(alpha, canvas, true);
        } else if (i10 == 1) {
            u1Var.W1(canvas, alpha);
        } else if (i10 == 2) {
            u1Var.I1(alpha, canvas, u1Var.getCurrentPosition() != null && (u1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = u1Var.getCurrentPosition() != null && (u1Var.getCurrentPosition().flags & 1) == 0;
            u1Var.N1(canvas, alpha);
            if (!z10) {
                u1Var.d2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && ynVar.K8 != null)) {
            float f10 = (ynVar.F8 * ynVar.I8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, ynVar.K8, f10, ynVar.G8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, ynVar.L8, ynVar.K8, f10);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.tg tgVar;
        yn ynVar = this.M0;
        jk jkVar = ynVar.W;
        if (jkVar == null || view != jkVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            jh.f fVar = ynVar.V;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        jk jkVar2 = ynVar.W;
        if (jkVar2 != null && view == jkVar2.m0) {
            ei.z zVar = (ei.z) view;
            zVar.setBackgroundDrawable(ynVar.H.c(zVar.c, ynVar.x, false));
        }
        jk jkVar3 = ynVar.W;
        if (jkVar3 == null || view != (tgVar = jkVar3.O1)) {
            return;
        }
        tgVar.setBlurredBackgroundFactory(ynVar.H);
    }

    public final boolean b0(View view) {
        if (view == this.L) {
            return true;
        }
        yn ynVar = this.M0;
        return view == ynVar.w2 || view == ynVar.o1 || view == ynVar.k9 || view == ynVar.V || view == ynVar.I3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0c29, code lost:
    
        if (r0.getVisibility() != 0) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0788, code lost:
    
        if ((r5 & 1) != 0) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a5, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0b7f  */
    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Integer num;
        Paint paint;
        Paint paint2;
        float f7;
        View view;
        Paint paint3;
        Paint paint4;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Integer num2;
        View view2;
        Canvas canvas3;
        qm qmVar;
        float f10;
        View view3;
        org.telegram.ui.Components.bb0 bb0Var;
        org.telegram.ui.Components.bb0 bb0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        ai.f7 f7Var;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        ai.f7 f7Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f11;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f12;
        float f13;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        Paint paint12;
        ai.f7 f7Var3;
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i11;
        int i12;
        ArrayList arrayList5;
        org.telegram.ui.Cells.u1 u1Var2;
        ArrayList arrayList6;
        ph.i iVar;
        Integer num4;
        float f14;
        float f15;
        boolean z10;
        ai.f7 f7Var4;
        ai.f7 f7Var5;
        org.telegram.ui.Components.bb0 bb0Var3;
        float f16;
        float f17;
        ai.f7 f7Var6;
        ai.f7 f7Var7;
        ai.f7 f7Var8;
        ai.f7 f7Var9;
        Canvas canvas4;
        float f18;
        float f19;
        View view9;
        float f20;
        float f21;
        Integer num5;
        float f22;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.w0 w0Var2;
        Paint paint14;
        float f23;
        float f24;
        Paint paint15;
        float f25;
        float f26;
        float f27;
        float f28;
        ai.f7 f7Var10;
        ai.f7 f7Var11;
        Integer num7;
        ai.f7 f7Var12;
        ai.f7 f7Var13;
        Integer num8;
        qm qmVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        Paint paint17;
        Paint paint18;
        float f29;
        float f30;
        View view10;
        Paint paint19;
        float f31;
        float f32;
        Paint paint20;
        float f33;
        float f34;
        float f35;
        Canvas canvas5;
        float f36;
        float f37;
        ai.f7 f7Var14;
        ai.f7 f7Var15;
        Integer num9;
        ai.f7 f7Var16;
        ai.f7 f7Var17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f38;
        Integer num11;
        ai.f7 f7Var18;
        ai.f7 f7Var19;
        Integer num12;
        org.telegram.ui.Components.pf pfVar;
        org.telegram.ui.Components.bb0 bb0Var4;
        org.telegram.ui.Components.bb0 bb0Var5;
        org.telegram.ui.Cells.u1 u1Var3;
        float f39;
        ai.f7 f7Var20;
        org.telegram.ui.Cells.u1 u1Var4;
        boolean z11;
        org.telegram.ui.Components.bb0 bb0Var6;
        float f40;
        org.telegram.ui.Components.bb0 bb0Var7;
        float f41;
        ai.f7 f7Var21;
        org.telegram.ui.Components.bb0 bb0Var8;
        org.telegram.ui.Components.bb0 bb0Var9;
        ai.f7 f7Var22;
        View view11;
        float f42;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.k kVar6;
        View view15;
        float f43;
        Paint paint23;
        float f44;
        float f45;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f46;
        Integer num13;
        float f47;
        Paint paint25;
        Paint paint26;
        float f48;
        float f49;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        Paint paint29;
        float f50;
        Paint paint30;
        float f51;
        float f52;
        Paint paint31;
        View view24;
        org.telegram.ui.ActionBar.k kVar7;
        int i13;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.m40 m40Var;
        View view25;
        gj gjVar;
        View view26;
        uj ujVar;
        qm qmVar3 = this;
        yn ynVar = qmVar3.M0;
        ph.i iVar2 = ynVar.v;
        ArrayList arrayList7 = ynVar.l6;
        ynVar.W.T1();
        ynVar.ic();
        if (ynVar.pa || ((ujVar = ynVar.w0) != null && ujVar.k())) {
            ynVar.pa = false;
            ynVar.tc();
        }
        ynVar.Lc(false, false);
        ynVar.vc();
        gj gjVar2 = ynVar.e2;
        if (gjVar2 != null && gjVar2.getTag() != null && (view26 = (gjVar = ynVar.e2).e) != null) {
            gjVar.g(view26);
        }
        org.telegram.ui.Components.m40 m40Var2 = ynVar.g2;
        if (m40Var2 != null && m40Var2.getTag() != null && (view25 = (m40Var = ynVar.g2).e) != null) {
            m40Var.g(view25);
        }
        if (ynVar.ia) {
            kVar10 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), qmVar3.getMeasuredWidth(), qmVar3.getMeasuredHeight(), (int) (ynVar.ja * 255.0f), 31);
            float f53 = (ynVar.ja * 0.2f) + 0.8f;
            canvas2.scale(f53, f53, qmVar3.getMeasuredWidth() / 2.0f, qmVar3.getMeasuredHeight() / 2.0f);
            i10 = saveLayerAlpha;
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        for (int i14 = 0; i14 < size; i14++) {
            org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) arrayList7.get(i14);
            MessageObject.SendAnimationData sendAnimationData = u1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    vk vkVar = ynVar.m1;
                    int currentHeight = measuredHeight + (vkVar != null ? vkVar.getCurrentHeight() : 0);
                    hk hkVar = ynVar.n1;
                    int currentHeight2 = currentHeight + (hkVar != null ? hkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
                    i13 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + ynVar.r9, qmVar3.getWidth(), qmVar3.getHeight());
                ImageReceiver photoImage = u1Var5.getPhotoImage();
                u1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((ynVar.W.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) com.google.android.gms.internal.vision.e2.b(1.0f, sendAnimationData.progress, u1Var5.getTranslationY(), r9[1])));
                if (sendAnimationData.fromPreview) {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, topViewEnterProgress, sendAnimationData.progress));
                } else {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, photoImage.getCenterY() + topViewEnterProgress, sendAnimationData.progress));
                }
                float f54 = sendAnimationData.currentScale;
                canvas2.scale(f54, f54);
                if (!sendAnimationData.fromPreview) {
                    canvas2.translate(-photoImage.getCenterX(), -photoImage.getCenterY());
                }
                u1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                u1Var5.draw(canvas2);
                canvas2.restore();
            }
        }
        num = ynVar.K8;
        if (num != null) {
            view24 = ynVar.H8;
        }
        paint = ynVar.B8;
        if (paint != null) {
            matrix = ynVar.C8;
            matrix.reset();
            float measuredWidth = qmVar3.getMeasuredWidth() / ynVar.z8.getWidth();
            matrix2 = ynVar.C8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = ynVar.A8;
            matrix3 = ynVar.C8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = ynVar.B8;
            paint5.setAlpha((int) (ynVar.J8 * 255.0f));
            paint6 = ynVar.B8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = qmVar3.getMeasuredWidth();
                float measuredHeight2 = qmVar3.getMeasuredHeight();
                paint7 = ynVar.B8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = ynVar.D8;
            f7 = ynVar.F8;
            float f55 = f7 * 255.0f;
            view = ynVar.H8;
            paint2.setAlpha((int) (f55 * (view != null ? ynVar.I8 : 1.0f)));
            paint3 = ynVar.D8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = qmVar3.getMeasuredWidth();
                float measuredHeight3 = qmVar3.getMeasuredHeight();
                paint4 = ynVar.D8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = ynVar.K8;
        if (num2 != null && ynVar.M8) {
            qmVar3.invalidate();
        }
        view2 = ynVar.H8;
        if (view2 != null) {
            view4 = ynVar.H8;
            if (view4 == ynVar.h1) {
                f50 = ynVar.I8;
                if (f50 < 1.0f) {
                    paint30 = ynVar.D8;
                    f51 = ynVar.F8;
                    f52 = ynVar.I8;
                    paint30.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                    float measuredWidth4 = qmVar3.getMeasuredWidth();
                    float measuredHeight4 = qmVar3.getMeasuredHeight();
                    paint31 = ynVar.D8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = ynVar.H8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f42 = ynVar.I8;
                    if (f42 < 1.0f) {
                        view20 = ynVar.H8;
                        float left = view20.getLeft();
                        view21 = ynVar.H8;
                        float top = view21.getTop();
                        view22 = ynVar.H8;
                        float right = view22.getRight();
                        view23 = ynVar.H8;
                        float bottom = view23.getBottom();
                        f46 = ynVar.I8;
                        int i15 = (int) (f46 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = ynVar.H8;
                    float left2 = view12.getLeft();
                    view13 = ynVar.H8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = ynVar.H8;
                    kVar6 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = ynVar.H8;
                        float x10 = view16.getX();
                        view17 = ynVar.H8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = ynVar.H8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = ynVar.H8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, ynVar.E8);
                    }
                    view15 = ynVar.H8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f43 = ynVar.I8;
                    if (f43 < 1.0f) {
                        paint23 = ynVar.D8;
                        f44 = ynVar.F8;
                        f45 = ynVar.I8;
                        paint23.setAlpha((int) ((1.0f - f45) * f44 * 255.0f));
                        float measuredWidth6 = qmVar3.getMeasuredWidth();
                        float measuredHeight6 = qmVar3.getMeasuredHeight();
                        paint24 = ynVar.D8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    f7Var = ynVar.v0;
                    float y3 = ((f7Var.getY() + ynVar.q9) - ynVar.s9) - AndroidUtilities.dp(4.0f);
                    view6 = ynVar.H8;
                    if (view6 instanceof org.telegram.ui.Cells.u1) {
                        view11 = ynVar.H8;
                        groupedMessages = ((org.telegram.ui.Cells.u1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    f7Var2 = ynVar.v0;
                    int childCount = f7Var2.getChildCount();
                    int i16 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = qmVar3.B0;
                        f10 = 20.0f;
                        arrayList2 = qmVar3.A0;
                        arrayList3 = qmVar3.z0;
                        arrayList4 = qmVar3.C0;
                        if (i16 >= childCount) {
                            break;
                        }
                        f7Var3 = ynVar.v0;
                        View childAt = f7Var3.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            u1Var = (org.telegram.ui.Cells.u1) childAt;
                            groupedMessages2 = u1Var.getCurrentMessagesGroup();
                            groupedMessagePosition = u1Var.getCurrentPosition();
                            w0Var = null;
                        } else {
                            w0Var = childAt instanceof org.telegram.ui.Cells.w0 ? (org.telegram.ui.Cells.w0) childAt : null;
                            groupedMessages2 = null;
                            u1Var = null;
                            groupedMessagePosition = null;
                        }
                        float f56 = y3;
                        view7 = ynVar.H8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != 0.0f) {
                            if (z13 || u1Var == null || groupedMessages == null || (u1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i11 = childCount;
                                i12 = i16;
                                arrayList5 = arrayList;
                                u1Var2 = u1Var;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                f14 = 9.0f;
                                f15 = 1.0f;
                                z10 = z13;
                            } else {
                                f14 = 9.0f;
                                float E2 = u1Var3.E2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f57 = transitionParams.left + E2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f58 = transitionParams.top + transitionParams.offsetTop;
                                float f59 = transitionParams.right + E2 + transitionParams.offsetRight;
                                i11 = childCount;
                                float f60 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f39 = f58;
                                } else {
                                    f39 = transitionParams.cell.getTranslationY() + f58;
                                    f60 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f61 = f39;
                                float dp = f61 < (ynVar.q9 - ((float) ynVar.s9)) - ((float) AndroidUtilities.dp(20.0f)) ? (ynVar.q9 - ynVar.s9) - AndroidUtilities.dp(20.0f) : f61;
                                f7Var20 = ynVar.v0;
                                if (f60 > AndroidUtilities.dp(20.0f) + f7Var20.getMeasuredHeight()) {
                                    f7Var22 = ynVar.v0;
                                    f60 = AndroidUtilities.dp(20.0f) + f7Var22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i12 = i16;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size2) {
                                        arrayList5 = arrayList;
                                        u1Var4 = u1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i18 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i17);
                                    arrayList5 = arrayList;
                                    if (ynVar.U5[messageObject.getDialogId() == ynVar.R5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        u1Var4 = u1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i17++;
                                        size2 = i18;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - ynVar.pc) - AndroidUtilities.dp(9.0f);
                                bb0Var6 = ynVar.G1;
                                if (bb0Var6 != null) {
                                    bb0Var9 = ynVar.G1;
                                    f40 = bb0Var9.d();
                                } else {
                                    f40 = 0.0f;
                                }
                                float f62 = measuredHeight7 - f40;
                                bb0Var7 = ynVar.G1;
                                if (bb0Var7 != null) {
                                    bb0Var8 = ynVar.G1;
                                    f41 = bb0Var8.e();
                                } else {
                                    f41 = 0.0f;
                                }
                                org.telegram.ui.Cells.u1 u1Var6 = u1Var4;
                                canvas3.clipRect(0.0f, f56 + f41, getMeasuredWidth(), f62);
                                f7Var21 = ynVar.v0;
                                canvas3.translate(0.0f, f7Var21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                u1Var2 = u1Var6;
                                f15 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f57, (int) dp, (int) f59, (int) f60, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (u1Var2 != null && u1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            f7Var4 = ynVar.v0;
                            float left3 = f7Var4.getLeft();
                            f7Var5 = ynVar.v0;
                            float right2 = f7Var5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - ynVar.pc) - ynVar.X8(org.telegram.ui.Components.s31.c)) - AndroidUtilities.dp(f14);
                            bb0Var3 = ynVar.G1;
                            if (bb0Var3 != null) {
                                bb0Var4 = ynVar.G1;
                                float max = Math.max(0.0f, bb0Var4.e());
                                bb0Var5 = ynVar.G1;
                                f17 = Math.max(0.0f, bb0Var5.d());
                                f16 = max;
                            } else {
                                f16 = 0.0f;
                                f17 = 0.0f;
                            }
                            jk jkVar = ynVar.W;
                            if (jkVar != null && (pfVar = jkVar.m0) != null) {
                                f17 = Math.max(f17, pfVar.f ? 0.0f : Math.max(0.0f, pfVar.getMeasuredHeight() - (pfVar.c.getTranslationY() + pfVar.e)));
                            }
                            float f63 = f56 + f16;
                            float f64 = measuredHeight8 - f17;
                            if (u1Var2 == null || !u1Var2.getTransitionParams().w0) {
                                f7Var6 = ynVar.v0;
                                left3 = Math.max(left3, view8.getX() + f7Var6.getLeft());
                                f7Var7 = ynVar.v0;
                                f63 = Math.max(f63, view8.getY() + f7Var7.getY());
                                f7Var8 = ynVar.v0;
                                right2 = Math.min(right2, view8.getX() + f7Var8.getLeft() + view8.getMeasuredWidth());
                                f7Var9 = ynVar.v0;
                                f64 = Math.min(f64, view8.getY() + f7Var9.getY() + view8.getMeasuredHeight());
                            }
                            float f65 = f64;
                            float f66 = f63;
                            float f67 = right2;
                            float max2 = Math.max(left3, ynVar.S8());
                            if (f66 < f65) {
                                if (view8.getAlpha() != f15) {
                                    canvas4 = canvas;
                                    canvas4.saveLayerAlpha(max2, f66, f67, f65, (int) (view8.getAlpha() * 255.0f), 31);
                                    f38 = f66;
                                    f19 = f65;
                                    f20 = max2;
                                    f21 = f67;
                                } else {
                                    canvas4 = canvas;
                                    f38 = f66;
                                    f19 = f65;
                                    f20 = max2;
                                    f21 = f67;
                                    canvas4.save();
                                }
                                if (u1Var2 != null) {
                                    u1Var2.setInvalidatesParent(true);
                                    num12 = ynVar.K8;
                                    u1Var2.setScrimReaction(num12);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(true);
                                    num11 = ynVar.K8;
                                    w0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f20, f38, f21, f19);
                                f7Var18 = ynVar.v0;
                                float x11 = view8.getX() + f7Var18.getLeft();
                                f7Var19 = ynVar.v0;
                                canvas4.translate(x11, view8.getY() + f7Var19.getY());
                                if (u1Var2 != null && groupedMessages3 == null && u1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, u1Var2.getPaddingTop());
                                    u1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (u1Var2 == null || !u1Var2.U2()) {
                                    f18 = f38;
                                } else {
                                    canvas4.save();
                                    f18 = f38;
                                    canvas4.translate(0.0f, u1Var2.getPaddingTop());
                                    u1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (w0Var != null) {
                                    w0Var.z(canvas4);
                                }
                                canvas4.restore();
                                if (u1Var2 != null) {
                                    u1Var2.setInvalidatesParent(false);
                                    u1Var2.setScrimReaction(num4);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(false);
                                    w0Var.setScrimReaction(num4);
                                }
                            } else {
                                canvas4 = canvas;
                                f18 = f66;
                                f19 = f65;
                                view9 = view8;
                                f20 = max2;
                                f21 = f67;
                            }
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePosition;
                            if (groupedMessagePosition2 != null || (u1Var2 != null && u1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(u1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && u1Var2.T2())) {
                                        arrayList2.add(u1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & u1Var2.t0()) != 0) {
                                    arrayList5.add(u1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i19 = groupedMessagePosition2.flags;
                                    if ((i19 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(u1Var2);
                            }
                            num5 = ynVar.K8;
                            if (num5 == null || u1Var2 == null || groupedMessages3 != null) {
                                float f68 = f21;
                                float f69 = f20;
                                View view27 = view9;
                                float f70 = f19;
                                float f71 = f18;
                                f22 = f56;
                                num6 = ynVar.K8;
                                if (num6 != null && w0Var != null) {
                                    paint13 = ynVar.B8;
                                    if (paint13 != null) {
                                        matrix7 = ynVar.C8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / ynVar.z8.getWidth();
                                        matrix8 = ynVar.C8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = ynVar.A8;
                                        matrix9 = ynVar.C8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = ynVar.B8;
                                        paint16.setAlpha((int) (ynVar.J8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = ynVar.B8;
                                        w0Var2 = w0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint14 = ynVar.D8;
                                        f23 = ynVar.F8;
                                        f24 = ynVar.I8;
                                        paint14.setAlpha((int) (f24 * f23 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = ynVar.D8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f66 < f65) {
                                        f25 = ynVar.F8;
                                        f26 = ynVar.I8;
                                        float f72 = (f26 * f25) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f27 = ynVar.I8;
                                        float f73 = f27 * alpha;
                                        if (f73 < f15) {
                                            canvas.saveLayerAlpha(f69, f71, f68, f70, (int) (f73 * 255.0f), 31);
                                            f70 = f70;
                                            f28 = f71;
                                            canvas3 = canvas;
                                        } else {
                                            canvas3 = canvas;
                                            f28 = f71;
                                            canvas3.save();
                                        }
                                        canvas3.clipRect(f69, f28, f68, f70);
                                        f7Var10 = ynVar.v0;
                                        float x12 = view27.getX() + f7Var10.getLeft();
                                        f7Var11 = ynVar.v0;
                                        canvas3.translate(x12, view27.getY() + f7Var11.getY() + view27.getPaddingTop());
                                        num7 = ynVar.K8;
                                        boolean z14 = ynVar.G8;
                                        zg.n0 n0Var = w0Var2.C0;
                                        if (!n0Var.b) {
                                            org.telegram.ui.ActionBar.d6 d6Var = w0Var2.Y0;
                                            if (d6Var != null) {
                                                d6Var.m(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.i6.q(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            }
                                            n0Var.D = f72;
                                            n0Var.E = z14;
                                            n0Var.d(canvas3, w0Var2.j2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        f7Var12 = ynVar.v0;
                                        float x13 = view27.getX() + f7Var12.getLeft();
                                        f7Var13 = ynVar.v0;
                                        canvas3.translate(x13, view27.getY() + f7Var13.getY() + view27.getPaddingTop());
                                        int i20 = ynVar.L8;
                                        num8 = ynVar.K8;
                                        w0Var2.C(this, canvas3, i20, num8, f72);
                                        qmVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = ynVar.B8;
                                if (paint18 != null) {
                                    matrix10 = ynVar.C8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / ynVar.z8.getWidth();
                                    matrix11 = ynVar.C8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = ynVar.A8;
                                    matrix12 = ynVar.C8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = ynVar.B8;
                                    paint21.setAlpha((int) (ynVar.J8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = ynVar.B8;
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    paint19 = ynVar.D8;
                                    f31 = ynVar.F8;
                                    f32 = ynVar.I8;
                                    paint19.setAlpha((int) (f32 * f31 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = ynVar.D8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f66 < f65) {
                                    f33 = ynVar.F8;
                                    f34 = ynVar.I8;
                                    float f74 = (f34 * f33) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f35 = ynVar.I8;
                                    float f75 = f35 * alpha2;
                                    if (f75 < f15) {
                                        canvas5 = canvas;
                                        f36 = f19;
                                        float f76 = f18;
                                        canvas5.saveLayerAlpha(f30, f76, f29, f36, (int) (f75 * 255.0f), 31);
                                        f37 = f76;
                                    } else {
                                        canvas5 = canvas;
                                        f36 = f19;
                                        f37 = f18;
                                        canvas5.save();
                                    }
                                    canvas5.clipRect(f30, f37, f29, f36);
                                    f7Var14 = ynVar.v0;
                                    float x14 = view10.getX() + f7Var14.getLeft();
                                    f7Var15 = ynVar.v0;
                                    canvas5.translate(x14, view10.getY() + f7Var15.getY() + view10.getPaddingTop());
                                    num9 = ynVar.K8;
                                    u1Var2.h2(canvas5, num9, f74, ynVar.G8);
                                    canvas5.restore();
                                    canvas5.save();
                                    f7Var16 = ynVar.v0;
                                    float x15 = view10.getX() + f7Var16.getLeft();
                                    f7Var17 = ynVar.v0;
                                    canvas5.translate(x15, view10.getY() + f7Var17.getY() + view10.getPaddingTop());
                                    int i21 = ynVar.L8;
                                    num10 = ynVar.K8;
                                    f22 = f56;
                                    u1Var2.i2(this, canvas5, i21, num10, f74);
                                    canvas.restore();
                                } else {
                                    f22 = f56;
                                }
                            }
                            qmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f22 = f56;
                            qmVar2 = this;
                        }
                        i16 = i12 + 1;
                        qmVar3 = qmVar2;
                        y3 = f22;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    qmVar = qmVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f11 = 1.0f;
                    float f77 = y3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            qmVar.a0(canvas3, f77, (org.telegram.ui.Cells.u1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            qmVar.a0(canvas3, f77, (org.telegram.ui.Cells.u1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.u1 u1Var7 = (org.telegram.ui.Cells.u1) arrayList.get(i24);
                            if (u1Var7.getCurrentPosition() != null || u1Var7.getTransitionParams().w0) {
                                qmVar.a0(canvas3, f77, u1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.u1 u1Var8 = (org.telegram.ui.Cells.u1) arrayList4.get(i25);
                            if (u1Var8.getCurrentPosition() != null || u1Var8.getTransitionParams().w0) {
                                qmVar.a0(canvas3, f77, u1Var8, 3);
                            }
                        }
                    }
                    num3 = ynVar.K8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = ynVar.B8;
                        if (paint8 != null) {
                            matrix4 = ynVar.C8;
                            matrix4.reset();
                            float measuredWidth13 = qmVar.getMeasuredWidth() / ynVar.z8.getWidth();
                            matrix5 = ynVar.C8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = ynVar.A8;
                            matrix6 = ynVar.C8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = ynVar.B8;
                            paint11.setAlpha((int) (ynVar.J8 * 255.0f));
                            float measuredWidth14 = qmVar.getMeasuredWidth();
                            float measuredHeight13 = qmVar.getMeasuredHeight();
                            paint12 = ynVar.B8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = ynVar.D8;
                            f12 = ynVar.F8;
                            f13 = ynVar.I8;
                            paint9.setAlpha((int) (f13 * f12 * 255.0f));
                            float measuredWidth15 = qmVar.getMeasuredWidth();
                            float measuredHeight14 = qmVar.getMeasuredHeight();
                            paint10 = ynVar.D8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.u1 u1Var9 = (org.telegram.ui.Cells.u1) arrayList4.get(i26);
                            if (u1Var9.getCurrentPosition() != null || u1Var9.getTransitionParams().w0) {
                                qmVar.a0(canvas3, f77, u1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = ynVar.K8;
                    if (num13 == null) {
                        f47 = ynVar.I8;
                        if (f47 < f11) {
                            paint25 = ynVar.B8;
                            if (paint25 != null) {
                                matrix13 = ynVar.C8;
                                matrix13.reset();
                                float measuredWidth16 = qmVar.getMeasuredWidth() / ynVar.z8.getWidth();
                                matrix14 = ynVar.C8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = ynVar.A8;
                                matrix15 = ynVar.C8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = ynVar.B8;
                                paint28.setAlpha((int) (ynVar.J8 * 255.0f));
                                float measuredWidth17 = qmVar.getMeasuredWidth();
                                float measuredHeight15 = qmVar.getMeasuredHeight();
                                paint29 = ynVar.B8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = ynVar.D8;
                                f48 = ynVar.F8;
                                f49 = ynVar.I8;
                                paint26.setAlpha((int) ((f11 - f49) * f48 * 255.0f));
                                float measuredWidth18 = qmVar.getMeasuredWidth();
                                float measuredHeight16 = qmVar.getMeasuredHeight();
                                paint27 = ynVar.D8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            qmVar = qmVar3;
            f10 = 20.0f;
            f11 = 1.0f;
            num13 = ynVar.K8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            qmVar = qmVar3;
            f10 = 20.0f;
        }
        view3 = ynVar.H8;
        if (view3 != null || ((ArrayList) ynVar.K9.c).size() > 0) {
            bb0Var = ynVar.G1;
            if (bb0Var != null) {
                bb0Var2 = ynVar.G1;
            }
            super.drawChild(canvas3, ynVar.h1, SystemClock.uptimeMillis());
            ak akVar = ynVar.V2;
            if (akVar != null && akVar.getTag() != null) {
                super.drawChild(canvas3, ynVar.V2, SystemClock.uptimeMillis());
            }
            zj zjVar = ynVar.W2;
            if (zjVar != null && zjVar.getTag() != null) {
                super.drawChild(canvas3, ynVar.W2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.u00 u00Var = ynVar.k9;
            if (u00Var != null) {
                super.drawChild(canvas3, u00Var, SystemClock.uptimeMillis());
            }
            uh.i iVar3 = ynVar.V9;
            if (iVar3 != null) {
                super.drawChild(canvas3, iVar3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.m40 m40Var3 = ynVar.c2;
            if (m40Var3 != null) {
                super.drawChild(canvas3, m40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = ynVar.w3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, ynVar.w3, SystemClock.uptimeMillis());
            }
            fl flVar = ynVar.x3;
            if (flVar != null && flVar.getVisibility() == 0) {
                super.drawChild(canvas3, ynVar.x3, SystemClock.uptimeMillis());
            }
            ci.e4 e4Var = ynVar.v1;
            if (e4Var != null && e4Var.getVisibility() == 0) {
                super.drawChild(canvas3, ynVar.v1, SystemClock.uptimeMillis());
            }
            ul ulVar = ynVar.z1;
            if (ulVar != null && ulVar.getVisibility() == 0) {
                super.drawChild(canvas3, ynVar.z1, SystemClock.uptimeMillis());
            }
            ci.e4 e4Var2 = ynVar.x1;
            if (e4Var2 != null && e4Var2.getVisibility() == 0) {
                super.drawChild(canvas3, ynVar.x1, SystemClock.uptimeMillis());
            }
            jk jkVar2 = ynVar.W;
            if (jkVar2 != null && jkVar2.L != null) {
                canvas3.save();
                canvas3.translate(ynVar.W.L.getX() + ynVar.W.getX(), ynVar.W.L.getY() + ynVar.W.getY());
                ynVar.W.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (ynVar.na > 0 && qmVar.f < AndroidUtilities.dp(f10)) {
            int themedColor = ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6);
            if (qmVar.D0 == null) {
                qmVar.D0 = new Paint();
            }
            if (qmVar.E0 != themedColor) {
                Paint paint32 = qmVar.D0;
                qmVar.E0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, qmVar.getMeasuredHeight() - ynVar.na, qmVar.getMeasuredWidth(), qmVar.getMeasuredHeight(), qmVar.D0);
            canvas3 = canvas6;
        }
        wp wpVar = ynVar.N9;
        if (wpVar != null && wpVar.e()) {
            int inputBubbleTop = (int) ynVar.Q.getInputBubbleTop();
            int inputBubbleBottom = (int) ynVar.Q.getInputBubbleBottom();
            yn ynVar2 = ynVar.R9;
            int i27 = inputBubbleTop - ((int) (ynVar.S9 * (ynVar2 == null ? 0.0f : ynVar2.M9)));
            wp wpVar2 = ynVar.N9;
            qmVar.getMeasuredWidth();
            wpVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (ynVar.R9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, qmVar.getMeasuredWidth(), qmVar.getMeasuredHeight(), (int) (ynVar.S9 * 255.0f), 31);
            canvas3 = canvas;
            ynVar.R9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        ynVar.va.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (ynVar.ia) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (ynVar.ja * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        el elVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (elVar = this.M0.Ca) == null || !elVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        elVar.a(true);
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
        boolean z10;
        sk skVar;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.M0;
        hh.e eVar = ynVar.L3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || ynVar.isInBubbleMode()) ? (ynVar.W.getEmojiView() != null ? ynVar.W.getEmojiView() : ynVar.W).getY() : ynVar.W.getY();
        View view = ynVar.H8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        }
        jk jkVar = ynVar.W;
        if (jkVar == null || !jkVar.z3 || motionEvent.getY() >= y3) {
            ynVar.h9 = motionEvent.getY();
            org.telegram.ui.Cells.ca o9 = ynVar.a9.o(getContext());
            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
            if (!ynVar.a9.y() || !ynVar.a9.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o9.getX(), o9.getY());
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                ci.i1 i1Var = ynVar.o1;
                if (i1Var != null) {
                    if (ynVar.s3 != null) {
                        z10 = i1Var.B(motionEvent);
                        if (ynVar.o1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !ynVar.a9.y() || (motionEvent.getY() >= ynVar.v0.getTop() && motionEvent.getY() <= ynVar.v0.getBottom())) {
                            skVar = ynVar.ua;
                            if (!skVar.n) {
                                return skVar.g(motionEvent);
                            }
                            com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
                            if (mVar == null || !mVar.a) {
                                if (ynVar.isInPreviewMode() && ynVar.H9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (ynVar.h1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                aa.a aVar = ynVar.h1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
                                                if (aVar != null) {
                                                    ((ih.b) aVar.b).getLocationInWindow(iArr2);
                                                    Rect rect = AndroidUtilities.rectTmp2;
                                                    int i12 = iArr2[0] - iArr[0];
                                                    rect.set(i12, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i12, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                i10++;
                                            }
                                        }
                                        z11 = false;
                                        nj njVar = ynVar.Y0;
                                        if (njVar != null) {
                                            njVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], ynVar.Y0.getMeasuredWidth() + i13, ynVar.Y0.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.I0 = motionEvent.getX();
                                                    this.J0 = motionEvent.getY();
                                                    this.K0 = SystemClock.elapsedRealtime();
                                                    this.L0 = z12;
                                                    nj njVar2 = ynVar.Y0;
                                                    if (njVar2 != null) {
                                                        njVar2.h0.c(z12);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    this.K0 = -1L;
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        nj njVar3 = ynVar.Y0;
                                        if (njVar3 != null) {
                                            njVar3.h0.c(false);
                                        }
                                        if (this.L0 || (v7.z6.a(this.I0, this.J0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.K0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.L0) {
                                                c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                                                ynVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) c5Var2).P(ProfileActivity.m4(ynVar.R5));
                                            } else {
                                                c5Var = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                                                ((ActionBarLayout) c5Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.K0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.K0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z10) {
                                }
                            } else {
                                s4 s4Var = (s4) com.google.firebase.messaging.m.k().d;
                                if (s4Var != null) {
                                    s4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
                            if (ynVar.a9.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o9.getX(), o9.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = i1Var.e;
                        if (i1Var.H) {
                            i1Var.I = true;
                            i1Var.H = false;
                            i1Var.F(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                i1Var.F(view2, i1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            i1Var.d = 0;
                            i1Var.c = 1.0f;
                            org.telegram.ui.Components.w81 w81Var = i1Var.M;
                            if (w81Var != null) {
                                w81Var.e(1.0f, 0, i1Var.b);
                            }
                            i1Var.x(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                skVar = ynVar.ua;
                if (!skVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.M0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.v0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ci.r6 r6Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        nk nkVar;
        MessageObject messageObject;
        org.telegram.ui.Components.k60 k60Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        yn ynVar = this.M0;
        boolean z12 = false;
        if ((ynVar.H8 == null && ((ArrayList) ynVar.K9.c).size() <= 0) || (view != ynVar.h1 && view != ynVar.V2 && view != ynVar.W2 && view != ynVar.k9 && view != ynVar.V9 && view != ynVar.c2 && view != null && view != ynVar.w3 && view != ynVar.x3)) {
            if ((view != ynVar.w3 || !PhotoViewer.t1().R1()) && (!ynVar.Q9 || view != ynVar.v0)) {
                if (ynVar.ia) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                }
                if (view != ynVar.Z2) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (r6Var = ynVar.w2) != null && r6Var.a() && ynVar.w2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == ynVar.r8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    } else {
                        if (view != ynVar.v0) {
                            if (view != ynVar.Q) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == ynVar.r8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-ynVar.L9) - (ynVar.S9 != 0.0f ? (ynVar.v0.getMeasuredHeight() - ynVar.L9) * ynVar.S9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.i6.k3 != null && ynVar.t8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(ynVar.r8.getScaleX(), ynVar.r8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.i6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.i6.k3.setBounds(x10, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(ynVar.B9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(ynVar.B9()) + y3);
                                            org.telegram.ui.ActionBar.i6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z12 = super.drawChild(canvas, view, j3);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                                        z12 = super.drawChild(canvas, view, j3);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z12;
                                }
                                if (view == ynVar.Q && (k60Var = ynVar.Z2) != null && k60Var.getVisibility() == 0) {
                                    super.drawChild(canvas, ynVar.Z2, j3);
                                }
                                z12 = super.drawChild(canvas, view, j3);
                                if (z11 && view == ynVar.v0 && playingMessageObject.type != 5 && (nkVar = ynVar.r8) != null && nkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-ynVar.L9) - (ynVar.S9 != 0.0f ? (ynVar.v0.getMeasuredHeight() - ynVar.L9) * ynVar.S9 : 0.0f)) + ynVar.M9);
                                    super.drawChild(canvas, ynVar.r8, j3);
                                    if (ynVar.s8 != null) {
                                        canvas.save();
                                        canvas.translate(ynVar.s8.getX(), ynVar.v0.getY() + ynVar.s8.getTop());
                                        if (z10) {
                                            ynVar.s8.g2(canvas);
                                            invalidate();
                                            ynVar.s8.invalidate();
                                        } else {
                                            ynVar.s8.Y1(canvas);
                                            org.telegram.ui.Cells.u1 u1Var = ynVar.s8;
                                            if (!u1Var.vb && ((messageObject = u1Var.y7) == null || messageObject.type != 27)) {
                                                u1Var.m2(u1Var.getAlpha(), canvas, true);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                }
                            }
                        } else {
                            z10 = false;
                        }
                        z11 = false;
                        if (view == ynVar.r8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.mw0
    public float getBottomOffset() {
        return this.M0.v0.getBottom();
    }

    public yn getChatActivity() {
        return this.M0;
    }

    @Override // org.telegram.ui.Components.mw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.mw0
    public int getKeyboardHeight() {
        if (this.M0.Ma) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.mw0
    public float getListTranslationY() {
        return this.M0.v0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.mw0
    public Drawable getNewDrawable() {
        Drawable d = this.M0.ca.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.mw0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.M0.ca.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.mw0
    public int getScrollOffset() {
        return this.M0.v0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.c5 c5Var3;
        super.onAttachedToWindow();
        yn ynVar = this.M0;
        if (ynVar.Ma) {
            this.H.b = ynVar.V0;
        } else {
            c5Var = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
            if (c5Var != null) {
                c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                if (((ActionBarLayout) c5Var2).b) {
                    org.telegram.ui.ActionBar.p1 p1Var = this.H;
                    c5Var3 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
                    p1Var.b = (FrameLayout) c5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        ynVar.W.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == ynVar.R5)) {
            MediaController.getInstance().setTextureView(ynVar.N7(false), ynVar.t8, ynVar.r8, true);
        }
        wp wpVar = ynVar.N9;
        if (wpVar != null) {
            wpVar.f();
        }
        ynVar.va.j();
    }

    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        yn ynVar = this.M0;
        wp wpVar = ynVar.N9;
        if (wpVar != null) {
            NotificationCenter.getInstance(wpVar.e0).removeObserver(wpVar, NotificationCenter.updateInterfaces);
            wpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.q5 q5Var = wpVar.k0;
            if (q5Var != null && (view = wpVar.a0) != null) {
                q5Var.o(view);
            }
            wpVar.Q = 0.0f;
            wpVar.P = 0L;
            ynVar.N9 = null;
        }
        ynVar.va.k();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        yn ynVar;
        ci.r6 r6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (r6Var = (ynVar = this.M0).w2) == null || !r6Var.a() || ynVar.w2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.zc) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.mw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int y3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int dp;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar3;
        int i21;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        yn ynVar = this.M0;
        ph.i iVar = ynVar.v;
        int i22 = (measuredWidth - ynVar.Ra) - ynVar.Sa;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i24 = layoutParams.gravity;
                if (i24 == -1) {
                    i24 = 51;
                }
                int i25 = i24 & 112;
                int i26 = i24 & 7;
                if (i26 == 1) {
                    y3 = hg.c.y(i22, measuredWidth2, 2, ynVar.Ra) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = ynVar.Ra + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                    i18 += kVar7.getMeasuredHeight();
                                }
                            }
                        } else if (i25 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = (i13 - i11) - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (b0(childAt)) {
                            i18 = 0;
                            i15 = 0;
                        } else {
                            if (childAt != ynVar.K9 && childAt != ynVar.V9 && childAt != ynVar.Q && !(childAt instanceof org.telegram.ui.Components.m40) && !(childAt instanceof org.telegram.ui.Components.tp)) {
                                if (childAt instanceof org.telegram.ui.Cells.ca) {
                                    i20 = ynVar.xa;
                                } else if (childAt == ynVar.O0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (ynVar.W.u0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.n2) ynVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = ynVar.W.getBottom();
                                        }
                                    }
                                    i18 = ynVar.W.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    jk jkVar = ynVar.W;
                                    if (jkVar != null && (childAt == jkVar.O1 || childAt == jkVar.N1)) {
                                        i18 = org.telegram.messenger.bi.y(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == ynVar.u2) {
                                        i18 = org.telegram.messenger.bi.y(7.0f, iVar.d(), i18);
                                    } else if (jkVar == null || childAt != jkVar.e1) {
                                        if (childAt == ynVar.c2 || childAt == ynVar.q2 || childAt == ynVar.d2) {
                                            i19 = this.w0;
                                        } else if (childAt == ynVar.v0 || childAt == ynVar.t0 || childAt == ynVar.V2 || childAt == ynVar.W2 || childAt == ynVar.X2) {
                                            i20 = ynVar.xa;
                                        } else if (childAt != ynVar.N) {
                                            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (ynVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == ynVar.r8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != ynVar.Z2 && childAt != ynVar.a3 && childAt != ynVar.s0) {
                                                if (childAt instanceof org.telegram.ui.Components.ic0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != ynVar.R) {
                                                    if (childAt != ynVar.L3) {
                                                    }
                                                }
                                            }
                                        } else if (jkVar.z0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.bi.y(9.0f, iVar.d(), i18);
                                    }
                                }
                                i18 = -i20;
                            }
                            i18 = 0;
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                    } else {
                        i16 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (b0(childAt)) {
                    }
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
                } else {
                    y3 = (measuredWidth - ynVar.Sa) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = y3 - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        zj zjVar = ynVar.W2;
        if (zjVar != null) {
            zjVar.setBackgroundHeight(getMeasuredHeight());
        }
        ynVar.o9();
        ynVar.q9();
        ynVar.Lc(false, false);
        S();
        ynVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052c  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int childCount;
        boolean z10;
        int i12;
        int i13;
        org.telegram.ui.Components.rc rcVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.v0 v0Var;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        yn ynVar = this.M0;
        ph.i iVar = ynVar.v;
        int i15 = (size - ynVar.Ra) - ynVar.Sa;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        fh.a aVar = ynVar.J.a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).c(i15, size2);
        }
        if (this.y0 != i15) {
            ynVar.D4 = false;
            this.y0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
            if (z13 || (user = ynVar.f) == null || !user.self) {
                ynVar.I9 = false;
            } else {
                org.telegram.ui.ActionBar.i5 titleTextView = ynVar.Y0.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    ynVar.I9 = !ynVar.J9;
                } else {
                    ynVar.I9 = false;
                }
            }
            if (ynVar.I9 || ynVar.J9 || UserObject.isBotForumWithEditableTopics(ynVar.f)) {
                nj njVar = ynVar.Y0;
                if (njVar != null && njVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) ynVar.Y0.getLayoutParams()).rightMargin = AndroidUtilities.dp(ynVar.P3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                nj njVar2 = ynVar.Y0;
                if (njVar2 != null && njVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) ynVar.Y0.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (ynVar.I9) {
                kVar8 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                if (!kVar8.n0 && (v0Var = ynVar.k0) != null) {
                    v0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var2 = ynVar.f0;
                if (v0Var2 != null) {
                    v0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.v0 v0Var3 = ynVar.f0;
                if (v0Var3 != null) {
                    v0Var3.K(40);
                }
                org.telegram.ui.ActionBar.v0 v0Var4 = ynVar.k0;
                if (v0Var4 != null) {
                    v0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            if (!kVar7.n0 && (yVar = ynVar.l0) != null) {
                yVar.f((!ynVar.J9 || ynVar.I9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = ynVar.f0;
            if (v0Var5 != null) {
                TLRPC.UserFull userFull = ynVar.Y7;
                if (ynVar.J9) {
                    v0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    v0Var5.K(32);
                }
            }
            ynVar.D4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + ynVar.ma >= AndroidUtilities.dp(20.0f);
        if (this.x0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (ynVar.na > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            ynVar.ma = ynVar.na;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            ynVar.ma = ynVar.W.t0() ? ynVar.W.getEmojiPadding() : 0;
        } else {
            ynVar.ma = 0;
        }
        setEmojiKeyboardHeight(ynVar.ma);
        boolean z15 = this.f + ynVar.ma >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i16 = 0; i16 < ynVar.v0.getChildCount(); i16++) {
                View childAt = ynVar.v0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        ynVar.v0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            ynVar.x0.i1(R, (int) (((((ynVar.v0.getMeasuredHeight() - ynVar.q9) - ynVar.ya) + ((this.f + ynVar.ma) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(ynVar.B9()))) / 2.0f), false);
                            ynVar.y0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(ynVar.W, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
                            if (!z10 || ynVar.Ma) {
                                this.w0 = 0;
                            } else {
                                this.w0 = ynVar.W.getMeasuredHeight();
                            }
                            ynVar.xa = 0;
                            ynVar.ya = 0;
                            if (SharedConfig.chatBlurEnabled() && !ynVar.Ma && ynVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = ynVar.G;
                                ynVar.xa = i18;
                                ynVar.ya = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != ynVar.W) {
                                    kVar4 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                    if (childAt2 != kVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == ynVar.v0 || childAt2 == ynVar.t0 || (childAt2 instanceof org.telegram.ui.Cells.ca)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), ynVar.xa + size2 + ynVar.ya), TLObject.FLAG_30));
                                            } else if (childAt2 == ynVar.N) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.w0;
                                                z12 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((ynVar.W.z0() ? 48 : 0) + 2) + (i20 - (z12 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == ynVar.Z2) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                ynVar.Z2.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) ynVar.qc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == ynVar.a3) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) ynVar.qc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == ynVar.O0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (ynVar.W.u0(childAt2)) {
                                                org.telegram.ui.Components.cg cgVar = ynVar.W.H1;
                                                if (childAt2 == cgVar && cgVar != null) {
                                                    i19 = cgVar.getKeyboardHeight();
                                                }
                                                z11 = ((org.telegram.ui.ActionBar.n2) ynVar).inBubbleMode;
                                                if (z11) {
                                                    int paddingTop2 = getPaddingTop() + (i17 - this.w0) + measuredHeight;
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else if (AndroidUtilities.isInMultiwindow) {
                                                    int paddingTop3 = getPaddingTop() + (((i17 - this.w0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                }
                                            } else {
                                                ck ckVar = ynVar.G1;
                                                if (childAt2 == ckVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ckVar.getLayoutParams();
                                                    gg.k1 adapter = ynVar.G1.getAdapter();
                                                    if (adapter.w0 == null || adapter.h0) {
                                                        ynVar.G1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        ynVar.G1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == ynVar.a9.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + ynVar.xa;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || ynVar.Ma) {
                                                        rm rmVar = ynVar.a9;
                                                        rmVar.e0 = 0;
                                                        rmVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        rm rmVar2 = ynVar.a9;
                                                        rmVar2.e0 = keyboardHeight;
                                                        rmVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.ic0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == ynVar.P1) {
                                                    kVar5 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                                    if (kVar5.getVisibility() == 0) {
                                                        kVar6 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                                                        i14 = size2 - kVar6.getMeasuredHeight();
                                                    } else {
                                                        i14 = size2;
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                                                } else {
                                                    measureChildWithMargins(childAt2, makeMeasureSpec, 0, i11, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (ynVar.C4) {
                                ynVar.D4 = true;
                                ynVar.o9();
                                ynVar.q9();
                                ynVar.C4 = false;
                                sj sjVar = ynVar.v0;
                                sjVar.measure(View.MeasureSpec.makeMeasureSpec(sjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ynVar.v0.getMeasuredHeight(), TLObject.FLAG_30));
                                ynVar.D4 = false;
                            }
                            i13 = ynVar.v4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ai.o8(this, i13, 25));
                                ynVar.v4 = -1;
                            }
                            rcVar = org.telegram.ui.Components.rc.w;
                            if (rcVar != null && ynVar.Wb != null) {
                                rcVar.l();
                            }
                            ynVar.S6();
                            this.x0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.cf cfVar = ynVar.W.Y3;
        AndroidUtilities.cancelRunOnUIThread(cfVar);
        cfVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(ynVar.W, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
        if (z10) {
        }
        this.w0 = 0;
        ynVar.xa = 0;
        ynVar.ya = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = ynVar.G;
            ynVar.xa = i182;
            ynVar.ya = i182;
        }
        while (i12 < childCount) {
        }
        if (ynVar.C4) {
        }
        i13 = ynVar.v4;
        if (i13 != -1) {
        }
        rcVar = org.telegram.ui.Components.rc.w;
        if (rcVar != null) {
            rcVar.l();
        }
        ynVar.S6();
        this.x0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yn ynVar = this.M0;
        gh.d.c(ynVar.x8, ynVar.fragmentView);
        ynVar.y8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.M0.D4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        yn ynVar = this.M0;
        ynVar.t9 = i11;
        ynVar.o9();
        ynVar.q9();
    }

    @Override // org.telegram.ui.Components.mw0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.mw0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.mw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
