package org.telegram.ui;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tm extends org.telegram.ui.Components.pv0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final /* synthetic */ bo J0;
    public int w0;
    public int x0;
    public int y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(bo boVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = boVar;
        this.w0 = 0;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new sm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.J0;
        boVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        kVar.setTranslationY(0.0f);
        dl dlVar = boVar.ab;
        if (dlVar != null) {
            dlVar.setTranslationY(boVar.o1 != null ? r3.getCurrentHeight() : 0);
        }
        ci.f4 f4Var = boVar.w1;
        if (f4Var != null) {
            f4Var.setTranslationY(0.0f);
        }
        ci.f4 f4Var2 = boVar.v1;
        if (f4Var2 != null) {
            f4Var2.setTranslationY(0.0f);
        }
        boVar.Q0.setTranslationY(0.0f);
        boVar.P.setTranslationY(0.0f);
        boVar.w9 = 0.0f;
        boVar.x9 = 0.0f;
        boVar.X0.setBackgroundTranslation(0);
        gl glVar = boVar.b3;
        if (glVar != null) {
            glVar.t0 = 0.0f;
            glVar.s();
        }
        ci.s6 s6Var = boVar.y2;
        if (s6Var != null) {
            org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) s6Var.b;
            daVar.u = 0.0f;
            daVar.d.invalidate();
        }
        boVar.setFragmentPanTranslationOffset(0);
        boVar.o9();
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.cc0) {
            ((org.telegram.ui.Components.cc0) drawable).p();
        }
        bo boVar = this.J0;
        fh.a c10 = boVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(boVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(boVar.W.a(c10));
        boVar.Cb = computePerceivedBrightness <= 0.721f;
        boVar.Db = computePerceivedBrightness2 <= 0.9f;
        boVar.L.a = c10;
        jh.f fVar = boVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.g gVar = boVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        boVar.n9();
        boVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.t1 t1Var, int i10) {
        int save = canvas.save();
        bo boVar = this.J0;
        float x10 = t1Var.getX() + boVar.x0.getLeft();
        float y3 = t1Var.getY() + boVar.x0.getY() + t1Var.getPaddingTop();
        float alpha = t1Var.a() ? t1Var.getAlpha() : 1.0f;
        canvas.clipRect(boVar.x0.getLeft(), f7, boVar.x0.getRight(), ((((boVar.x0.getY() + boVar.x0.getMeasuredHeight()) - boVar.Aa) - boVar.v.d()) - boVar.rc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y3);
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.m2(alpha, canvas, true);
        } else if (i10 == 1) {
            t1Var.W1(canvas, alpha);
        } else if (i10 == 2) {
            t1Var.I1(alpha, canvas, t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z10 = t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0;
            t1Var.N1(canvas, alpha);
            if (!z10) {
                t1Var.d2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && boVar.M8 != null)) {
            float f10 = (boVar.H8 * boVar.K8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, boVar.M8, f10, boVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            t1Var.i2(this, canvas, boVar.N8, boVar.M8, f10);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.qg qgVar;
        bo boVar = this.J0;
        ah.c cVar = boVar.J;
        mk mkVar = boVar.Y;
        if (mkVar == null || view != mkVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            jh.f fVar = boVar.X;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        mk mkVar2 = boVar.Y;
        if (mkVar2 != null && view == mkVar2.m0) {
            ei.y yVar = (ei.y) view;
            yVar.setBackgroundDrawable(cVar.c(yVar.c, boVar.x, false));
        }
        mk mkVar3 = boVar.Y;
        if (mkVar3 == null || view != (qgVar = mkVar3.N1)) {
            return;
        }
        qgVar.setBlurredBackgroundFactory(cVar);
    }

    public final boolean b0(View view) {
        if (view == this.L) {
            return true;
        }
        bo boVar = this.J0;
        return view == boVar.y2 || view == boVar.q1 || view == boVar.m9 || view == boVar.X || view == boVar.K3;
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
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
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
        tm tmVar;
        float f10;
        View view3;
        org.telegram.ui.Components.na0 na0Var;
        org.telegram.ui.Components.na0 na0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        xm xmVar;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        xm xmVar2;
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
        xm xmVar3;
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i11;
        int i12;
        ArrayList arrayList5;
        org.telegram.ui.Cells.t1 t1Var2;
        ArrayList arrayList6;
        ph.i iVar;
        Integer num4;
        float f14;
        float f15;
        boolean z10;
        xm xmVar4;
        xm xmVar5;
        org.telegram.ui.Components.na0 na0Var3;
        float f16;
        float f17;
        xm xmVar6;
        xm xmVar7;
        xm xmVar8;
        xm xmVar9;
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
        xm xmVar10;
        xm xmVar11;
        Integer num7;
        xm xmVar12;
        xm xmVar13;
        Integer num8;
        tm tmVar2;
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
        xm xmVar14;
        xm xmVar15;
        Integer num9;
        xm xmVar16;
        xm xmVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f38;
        Integer num11;
        xm xmVar18;
        xm xmVar19;
        Integer num12;
        org.telegram.ui.Components.lf lfVar;
        org.telegram.ui.Components.na0 na0Var4;
        org.telegram.ui.Components.na0 na0Var5;
        org.telegram.ui.Cells.t1 t1Var3;
        float f39;
        xm xmVar20;
        org.telegram.ui.Cells.t1 t1Var4;
        boolean z11;
        org.telegram.ui.Components.na0 na0Var6;
        float f40;
        org.telegram.ui.Components.na0 na0Var7;
        float f41;
        xm xmVar21;
        org.telegram.ui.Components.na0 na0Var8;
        org.telegram.ui.Components.na0 na0Var9;
        xm xmVar22;
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
        org.telegram.ui.Components.i40 i40Var;
        View view25;
        ij ijVar;
        View view26;
        wj wjVar;
        tm tmVar3 = this;
        bo boVar = tmVar3.J0;
        ph.i iVar2 = boVar.v;
        ArrayList arrayList7 = boVar.n6;
        boVar.Y.U1();
        boVar.jc();
        if (boVar.ra || ((wjVar = boVar.y0) != null && wjVar.k())) {
            boVar.ra = false;
            boVar.uc();
        }
        boVar.Mc(false, false);
        boVar.wc();
        ij ijVar2 = boVar.g2;
        if (ijVar2 != null && ijVar2.getTag() != null && (view26 = (ijVar = boVar.g2).e) != null) {
            ijVar.g(view26);
        }
        org.telegram.ui.Components.i40 i40Var2 = boVar.i2;
        if (i40Var2 != null && i40Var2.getTag() != null && (view25 = (i40Var = boVar.i2).e) != null) {
            i40Var.g(view25);
        }
        if (boVar.ka) {
            kVar10 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), tmVar3.getMeasuredWidth(), tmVar3.getMeasuredHeight(), (int) (boVar.la * 255.0f), 31);
            float f53 = (boVar.la * 0.2f) + 0.8f;
            canvas2.scale(f53, f53, tmVar3.getMeasuredWidth() / 2.0f, tmVar3.getMeasuredHeight() / 2.0f);
            i10 = saveLayerAlpha;
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        for (int i14 = 0; i14 < size; i14++) {
            org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList7.get(i14);
            MessageObject.SendAnimationData sendAnimationData = t1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    yk ykVar = boVar.o1;
                    int currentHeight = measuredHeight + (ykVar != null ? ykVar.getCurrentHeight() : 0);
                    kk kkVar = boVar.p1;
                    int currentHeight2 = currentHeight + (kkVar != null ? kkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
                    i13 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + boVar.t9, tmVar3.getWidth(), tmVar3.getHeight());
                ImageReceiver photoImage = t1Var5.getPhotoImage();
                t1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((boVar.Y.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) com.google.android.gms.internal.vision.e2.b(1.0f, sendAnimationData.progress, t1Var5.getTranslationY(), r9[1])));
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
                t1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                t1Var5.draw(canvas2);
                canvas2.restore();
            }
        }
        num = boVar.M8;
        if (num != null) {
            view24 = boVar.J8;
        }
        paint = boVar.D8;
        if (paint != null) {
            matrix = boVar.E8;
            matrix.reset();
            float measuredWidth = tmVar3.getMeasuredWidth() / boVar.B8.getWidth();
            matrix2 = boVar.E8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = boVar.C8;
            matrix3 = boVar.E8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = boVar.D8;
            paint5.setAlpha((int) (boVar.L8 * 255.0f));
            paint6 = boVar.D8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = tmVar3.getMeasuredWidth();
                float measuredHeight2 = tmVar3.getMeasuredHeight();
                paint7 = boVar.D8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = boVar.F8;
            f7 = boVar.H8;
            float f55 = f7 * 255.0f;
            view = boVar.J8;
            paint2.setAlpha((int) (f55 * (view != null ? boVar.K8 : 1.0f)));
            paint3 = boVar.F8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = tmVar3.getMeasuredWidth();
                float measuredHeight3 = tmVar3.getMeasuredHeight();
                paint4 = boVar.F8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = boVar.M8;
        if (num2 != null && boVar.O8) {
            tmVar3.invalidate();
        }
        view2 = boVar.J8;
        if (view2 != null) {
            view4 = boVar.J8;
            if (view4 == boVar.j1) {
                f50 = boVar.K8;
                if (f50 < 1.0f) {
                    paint30 = boVar.F8;
                    f51 = boVar.H8;
                    f52 = boVar.K8;
                    paint30.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                    float measuredWidth4 = tmVar3.getMeasuredWidth();
                    float measuredHeight4 = tmVar3.getMeasuredHeight();
                    paint31 = boVar.F8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = boVar.J8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f42 = boVar.K8;
                    if (f42 < 1.0f) {
                        view20 = boVar.J8;
                        float left = view20.getLeft();
                        view21 = boVar.J8;
                        float top = view21.getTop();
                        view22 = boVar.J8;
                        float right = view22.getRight();
                        view23 = boVar.J8;
                        float bottom = view23.getBottom();
                        f46 = boVar.K8;
                        int i15 = (int) (f46 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = boVar.J8;
                    float left2 = view12.getLeft();
                    view13 = boVar.J8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = boVar.J8;
                    kVar6 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = boVar.J8;
                        float x10 = view16.getX();
                        view17 = boVar.J8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = boVar.J8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = boVar.J8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, boVar.G8);
                    }
                    view15 = boVar.J8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f43 = boVar.K8;
                    if (f43 < 1.0f) {
                        paint23 = boVar.F8;
                        f44 = boVar.H8;
                        f45 = boVar.K8;
                        paint23.setAlpha((int) ((1.0f - f45) * f44 * 255.0f));
                        float measuredWidth6 = tmVar3.getMeasuredWidth();
                        float measuredHeight6 = tmVar3.getMeasuredHeight();
                        paint24 = boVar.F8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    xmVar = boVar.x0;
                    float y3 = ((xmVar.getY() + boVar.s9) - boVar.u9) - AndroidUtilities.dp(4.0f);
                    view6 = boVar.J8;
                    if (view6 instanceof org.telegram.ui.Cells.t1) {
                        view11 = boVar.J8;
                        groupedMessages = ((org.telegram.ui.Cells.t1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    xmVar2 = boVar.x0;
                    int childCount = xmVar2.getChildCount();
                    int i16 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = tmVar3.B0;
                        f10 = 20.0f;
                        arrayList2 = tmVar3.A0;
                        arrayList3 = tmVar3.z0;
                        arrayList4 = tmVar3.C0;
                        if (i16 >= childCount) {
                            break;
                        }
                        xmVar3 = boVar.x0;
                        View childAt = xmVar3.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            t1Var = (org.telegram.ui.Cells.t1) childAt;
                            groupedMessages2 = t1Var.getCurrentMessagesGroup();
                            groupedMessagePosition = t1Var.getCurrentPosition();
                            w0Var = null;
                        } else {
                            w0Var = childAt instanceof org.telegram.ui.Cells.w0 ? (org.telegram.ui.Cells.w0) childAt : null;
                            groupedMessages2 = null;
                            t1Var = null;
                            groupedMessagePosition = null;
                        }
                        float f56 = y3;
                        view7 = boVar.J8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != 0.0f) {
                            if (z13 || t1Var == null || groupedMessages == null || (t1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i11 = childCount;
                                i12 = i16;
                                arrayList5 = arrayList;
                                t1Var2 = t1Var;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                f14 = 9.0f;
                                f15 = 1.0f;
                                z10 = z13;
                            } else {
                                f14 = 9.0f;
                                float E2 = t1Var3.E2(true);
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
                                float dp = f61 < (boVar.s9 - ((float) boVar.u9)) - ((float) AndroidUtilities.dp(20.0f)) ? (boVar.s9 - boVar.u9) - AndroidUtilities.dp(20.0f) : f61;
                                xmVar20 = boVar.x0;
                                if (f60 > AndroidUtilities.dp(20.0f) + xmVar20.getMeasuredHeight()) {
                                    xmVar22 = boVar.x0;
                                    f60 = AndroidUtilities.dp(20.0f) + xmVar22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i12 = i16;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size2) {
                                        arrayList5 = arrayList;
                                        t1Var4 = t1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i18 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i17);
                                    arrayList5 = arrayList;
                                    if (boVar.W5[messageObject.getDialogId() == boVar.T5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        t1Var4 = t1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i17++;
                                        size2 = i18;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - boVar.rc) - AndroidUtilities.dp(9.0f);
                                na0Var6 = boVar.I1;
                                if (na0Var6 != null) {
                                    na0Var9 = boVar.I1;
                                    f40 = na0Var9.d();
                                } else {
                                    f40 = 0.0f;
                                }
                                float f62 = measuredHeight7 - f40;
                                na0Var7 = boVar.I1;
                                if (na0Var7 != null) {
                                    na0Var8 = boVar.I1;
                                    f41 = na0Var8.e();
                                } else {
                                    f41 = 0.0f;
                                }
                                org.telegram.ui.Cells.t1 t1Var6 = t1Var4;
                                canvas3.clipRect(0.0f, f56 + f41, getMeasuredWidth(), f62);
                                xmVar21 = boVar.x0;
                                canvas3.translate(0.0f, xmVar21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                t1Var2 = t1Var6;
                                f15 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f57, (int) dp, (int) f59, (int) f60, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (t1Var2 != null && t1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            xmVar4 = boVar.x0;
                            float left3 = xmVar4.getLeft();
                            xmVar5 = boVar.x0;
                            float right2 = xmVar5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - boVar.rc) - boVar.W8(org.telegram.ui.Components.t21.c)) - AndroidUtilities.dp(f14);
                            na0Var3 = boVar.I1;
                            if (na0Var3 != null) {
                                na0Var4 = boVar.I1;
                                float max = Math.max(0.0f, na0Var4.e());
                                na0Var5 = boVar.I1;
                                f17 = Math.max(0.0f, na0Var5.d());
                                f16 = max;
                            } else {
                                f16 = 0.0f;
                                f17 = 0.0f;
                            }
                            mk mkVar = boVar.Y;
                            if (mkVar != null && (lfVar = mkVar.m0) != null) {
                                f17 = Math.max(f17, lfVar.f ? 0.0f : Math.max(0.0f, lfVar.getMeasuredHeight() - (lfVar.c.getTranslationY() + lfVar.e)));
                            }
                            float f63 = f56 + f16;
                            float f64 = measuredHeight8 - f17;
                            if (t1Var2 == null || !t1Var2.getTransitionParams().w0) {
                                xmVar6 = boVar.x0;
                                left3 = Math.max(left3, view8.getX() + xmVar6.getLeft());
                                xmVar7 = boVar.x0;
                                f63 = Math.max(f63, view8.getY() + xmVar7.getY());
                                xmVar8 = boVar.x0;
                                right2 = Math.min(right2, view8.getX() + xmVar8.getLeft() + view8.getMeasuredWidth());
                                xmVar9 = boVar.x0;
                                f64 = Math.min(f64, view8.getY() + xmVar9.getY() + view8.getMeasuredHeight());
                            }
                            float f65 = f64;
                            float f66 = f63;
                            float f67 = right2;
                            float max2 = Math.max(left3, boVar.R8());
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
                                if (t1Var2 != null) {
                                    t1Var2.setInvalidatesParent(true);
                                    num12 = boVar.M8;
                                    t1Var2.setScrimReaction(num12);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(true);
                                    num11 = boVar.M8;
                                    w0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f20, f38, f21, f19);
                                xmVar18 = boVar.x0;
                                float x11 = view8.getX() + xmVar18.getLeft();
                                xmVar19 = boVar.x0;
                                canvas4.translate(x11, view8.getY() + xmVar19.getY());
                                if (t1Var2 != null && groupedMessages3 == null && t1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, t1Var2.getPaddingTop());
                                    t1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (t1Var2 == null || !t1Var2.U2()) {
                                    f18 = f38;
                                } else {
                                    canvas4.save();
                                    f18 = f38;
                                    canvas4.translate(0.0f, t1Var2.getPaddingTop());
                                    t1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (w0Var != null) {
                                    w0Var.z(canvas4);
                                }
                                canvas4.restore();
                                if (t1Var2 != null) {
                                    t1Var2.setInvalidatesParent(false);
                                    t1Var2.setScrimReaction(num4);
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
                            if (groupedMessagePosition2 != null || (t1Var2 != null && t1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(t1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && t1Var2.T2())) {
                                        arrayList2.add(t1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & t1Var2.t0()) != 0) {
                                    arrayList5.add(t1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i19 = groupedMessagePosition2.flags;
                                    if ((i19 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(t1Var2);
                            }
                            num5 = boVar.M8;
                            if (num5 == null || t1Var2 == null || groupedMessages3 != null) {
                                float f68 = f21;
                                float f69 = f20;
                                View view27 = view9;
                                float f70 = f19;
                                float f71 = f18;
                                f22 = f56;
                                num6 = boVar.M8;
                                if (num6 != null && w0Var != null) {
                                    paint13 = boVar.D8;
                                    if (paint13 != null) {
                                        matrix7 = boVar.E8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / boVar.B8.getWidth();
                                        matrix8 = boVar.E8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = boVar.C8;
                                        matrix9 = boVar.E8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = boVar.D8;
                                        paint16.setAlpha((int) (boVar.L8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = boVar.D8;
                                        w0Var2 = w0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint14 = boVar.F8;
                                        f23 = boVar.H8;
                                        f24 = boVar.K8;
                                        paint14.setAlpha((int) (f24 * f23 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = boVar.F8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f66 < f65) {
                                        f25 = boVar.H8;
                                        f26 = boVar.K8;
                                        float f72 = (f26 * f25) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f27 = boVar.K8;
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
                                        xmVar10 = boVar.x0;
                                        float x12 = view27.getX() + xmVar10.getLeft();
                                        xmVar11 = boVar.x0;
                                        canvas3.translate(x12, view27.getY() + xmVar11.getY() + view27.getPaddingTop());
                                        num7 = boVar.M8;
                                        boolean z14 = boVar.I8;
                                        zg.q0 q0Var = w0Var2.C0;
                                        if (!q0Var.b) {
                                            org.telegram.ui.ActionBar.e6 e6Var = w0Var2.Y0;
                                            if (e6Var != null) {
                                                e6Var.m(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.i6.q(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            }
                                            q0Var.D = f72;
                                            q0Var.E = z14;
                                            q0Var.d(canvas3, w0Var2.j2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        xmVar12 = boVar.x0;
                                        float x13 = view27.getX() + xmVar12.getLeft();
                                        xmVar13 = boVar.x0;
                                        canvas3.translate(x13, view27.getY() + xmVar13.getY() + view27.getPaddingTop());
                                        int i20 = boVar.N8;
                                        num8 = boVar.M8;
                                        w0Var2.E(this, canvas3, i20, num8, f72);
                                        tmVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = boVar.D8;
                                if (paint18 != null) {
                                    matrix10 = boVar.E8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / boVar.B8.getWidth();
                                    matrix11 = boVar.E8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = boVar.C8;
                                    matrix12 = boVar.E8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = boVar.D8;
                                    paint21.setAlpha((int) (boVar.L8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = boVar.D8;
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    paint19 = boVar.F8;
                                    f31 = boVar.H8;
                                    f32 = boVar.K8;
                                    paint19.setAlpha((int) (f32 * f31 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = boVar.F8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f66 < f65) {
                                    f33 = boVar.H8;
                                    f34 = boVar.K8;
                                    float f74 = (f34 * f33) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f35 = boVar.K8;
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
                                    xmVar14 = boVar.x0;
                                    float x14 = view10.getX() + xmVar14.getLeft();
                                    xmVar15 = boVar.x0;
                                    canvas5.translate(x14, view10.getY() + xmVar15.getY() + view10.getPaddingTop());
                                    num9 = boVar.M8;
                                    t1Var2.h2(canvas5, num9, f74, boVar.I8);
                                    canvas5.restore();
                                    canvas5.save();
                                    xmVar16 = boVar.x0;
                                    float x15 = view10.getX() + xmVar16.getLeft();
                                    xmVar17 = boVar.x0;
                                    canvas5.translate(x15, view10.getY() + xmVar17.getY() + view10.getPaddingTop());
                                    int i21 = boVar.N8;
                                    num10 = boVar.M8;
                                    f22 = f56;
                                    t1Var2.i2(this, canvas5, i21, num10, f74);
                                    canvas.restore();
                                } else {
                                    f22 = f56;
                                }
                            }
                            tmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f22 = f56;
                            tmVar2 = this;
                        }
                        i16 = i12 + 1;
                        tmVar3 = tmVar2;
                        y3 = f22;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    tmVar = tmVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f11 = 1.0f;
                    float f77 = y3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            tmVar.a0(canvas3, f77, (org.telegram.ui.Cells.t1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            tmVar.a0(canvas3, f77, (org.telegram.ui.Cells.t1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList.get(i24);
                            if (t1Var7.getCurrentPosition() != null || t1Var7.getTransitionParams().w0) {
                                tmVar.a0(canvas3, f77, t1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList4.get(i25);
                            if (t1Var8.getCurrentPosition() != null || t1Var8.getTransitionParams().w0) {
                                tmVar.a0(canvas3, f77, t1Var8, 3);
                            }
                        }
                    }
                    num3 = boVar.M8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = boVar.D8;
                        if (paint8 != null) {
                            matrix4 = boVar.E8;
                            matrix4.reset();
                            float measuredWidth13 = tmVar.getMeasuredWidth() / boVar.B8.getWidth();
                            matrix5 = boVar.E8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = boVar.C8;
                            matrix6 = boVar.E8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = boVar.D8;
                            paint11.setAlpha((int) (boVar.L8 * 255.0f));
                            float measuredWidth14 = tmVar.getMeasuredWidth();
                            float measuredHeight13 = tmVar.getMeasuredHeight();
                            paint12 = boVar.D8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = boVar.F8;
                            f12 = boVar.H8;
                            f13 = boVar.K8;
                            paint9.setAlpha((int) (f13 * f12 * 255.0f));
                            float measuredWidth15 = tmVar.getMeasuredWidth();
                            float measuredHeight14 = tmVar.getMeasuredHeight();
                            paint10 = boVar.F8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.t1 t1Var9 = (org.telegram.ui.Cells.t1) arrayList4.get(i26);
                            if (t1Var9.getCurrentPosition() != null || t1Var9.getTransitionParams().w0) {
                                tmVar.a0(canvas3, f77, t1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = boVar.M8;
                    if (num13 == null) {
                        f47 = boVar.K8;
                        if (f47 < f11) {
                            paint25 = boVar.D8;
                            if (paint25 != null) {
                                matrix13 = boVar.E8;
                                matrix13.reset();
                                float measuredWidth16 = tmVar.getMeasuredWidth() / boVar.B8.getWidth();
                                matrix14 = boVar.E8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = boVar.C8;
                                matrix15 = boVar.E8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = boVar.D8;
                                paint28.setAlpha((int) (boVar.L8 * 255.0f));
                                float measuredWidth17 = tmVar.getMeasuredWidth();
                                float measuredHeight15 = tmVar.getMeasuredHeight();
                                paint29 = boVar.D8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = boVar.F8;
                                f48 = boVar.H8;
                                f49 = boVar.K8;
                                paint26.setAlpha((int) ((f11 - f49) * f48 * 255.0f));
                                float measuredWidth18 = tmVar.getMeasuredWidth();
                                float measuredHeight16 = tmVar.getMeasuredHeight();
                                paint27 = boVar.F8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            tmVar = tmVar3;
            f10 = 20.0f;
            f11 = 1.0f;
            num13 = boVar.M8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            tmVar = tmVar3;
            f10 = 20.0f;
        }
        view3 = boVar.J8;
        if (view3 != null || ((ArrayList) boVar.M9.c).size() > 0) {
            na0Var = boVar.I1;
            if (na0Var != null) {
                na0Var2 = boVar.I1;
            }
            super.drawChild(canvas3, boVar.j1, SystemClock.uptimeMillis());
            dk dkVar = boVar.X2;
            if (dkVar != null && dkVar.getTag() != null) {
                super.drawChild(canvas3, boVar.X2, SystemClock.uptimeMillis());
            }
            ck ckVar = boVar.Y2;
            if (ckVar != null && ckVar.getTag() != null) {
                super.drawChild(canvas3, boVar.Y2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.r00 r00Var = boVar.m9;
            if (r00Var != null) {
                super.drawChild(canvas3, r00Var, SystemClock.uptimeMillis());
            }
            uh.j jVar = boVar.X9;
            if (jVar != null) {
                super.drawChild(canvas3, jVar, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.i40 i40Var3 = boVar.e2;
            if (i40Var3 != null) {
                super.drawChild(canvas3, i40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = boVar.y3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, boVar.y3, SystemClock.uptimeMillis());
            }
            jl jlVar = boVar.z3;
            if (jlVar != null && jlVar.getVisibility() == 0) {
                super.drawChild(canvas3, boVar.z3, SystemClock.uptimeMillis());
            }
            ci.f4 f4Var = boVar.x1;
            if (f4Var != null && f4Var.getVisibility() == 0) {
                super.drawChild(canvas3, boVar.x1, SystemClock.uptimeMillis());
            }
            yl ylVar = boVar.B1;
            if (ylVar != null && ylVar.getVisibility() == 0) {
                super.drawChild(canvas3, boVar.B1, SystemClock.uptimeMillis());
            }
            ci.f4 f4Var2 = boVar.z1;
            if (f4Var2 != null && f4Var2.getVisibility() == 0) {
                super.drawChild(canvas3, boVar.z1, SystemClock.uptimeMillis());
            }
            mk mkVar2 = boVar.Y;
            if (mkVar2 != null && mkVar2.L != null) {
                canvas3.save();
                canvas3.translate(boVar.Y.L.getX() + boVar.Y.getX(), boVar.Y.L.getY() + boVar.Y.getY());
                boVar.Y.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (boVar.pa > 0 && tmVar.f < AndroidUtilities.dp(f10)) {
            int themedColor = boVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6);
            if (tmVar.D0 == null) {
                tmVar.D0 = new Paint();
            }
            if (tmVar.E0 != themedColor) {
                Paint paint32 = tmVar.D0;
                tmVar.E0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, tmVar.getMeasuredHeight() - boVar.pa, tmVar.getMeasuredWidth(), tmVar.getMeasuredHeight(), tmVar.D0);
            canvas3 = canvas6;
        }
        zp zpVar = boVar.P9;
        if (zpVar != null && zpVar.e()) {
            int inputBubbleTop = (int) boVar.S.getInputBubbleTop();
            int inputBubbleBottom = (int) boVar.S.getInputBubbleBottom();
            bo boVar2 = boVar.T9;
            int i27 = inputBubbleTop - ((int) (boVar.U9 * (boVar2 == null ? 0.0f : boVar2.O9)));
            zp zpVar2 = boVar.P9;
            tmVar.getMeasuredWidth();
            zpVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (boVar.T9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, tmVar.getMeasuredWidth(), tmVar.getMeasuredHeight(), (int) (boVar.U9 * 255.0f), 31);
            canvas3 = canvas;
            boVar.T9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        boVar.xa.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (boVar.ka) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (boVar.la * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        il ilVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (ilVar = this.J0.Ea) == null || !ilVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ilVar.a(true);
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
        vk vkVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.J0;
        hh.e eVar = boVar.N3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || boVar.isInBubbleMode()) ? (boVar.Y.getEmojiView() != null ? boVar.Y.getEmojiView() : boVar.Y).getY() : boVar.Y.getY();
        View view = boVar.J8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        }
        mk mkVar = boVar.Y;
        if (mkVar == null || !mkVar.y3 || motionEvent.getY() >= y3) {
            boVar.j9 = motionEvent.getY();
            org.telegram.ui.Cells.ca o9 = boVar.c9.o(getContext());
            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
            if (!boVar.c9.y() || !boVar.c9.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o9.getX(), o9.getY());
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                ci.i1 i1Var = boVar.q1;
                if (i1Var != null) {
                    if (boVar.u3 != null) {
                        z10 = i1Var.A(motionEvent);
                        if (boVar.q1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !boVar.c9.y() || (motionEvent.getY() >= boVar.x0.getTop() && motionEvent.getY() <= boVar.x0.getBottom())) {
                            vkVar = boVar.wa;
                            if (!vkVar.n) {
                                return vkVar.g(motionEvent);
                            }
                            com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
                            if (mVar == null || !mVar.a) {
                                if (boVar.isInPreviewMode() && boVar.J9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (boVar.j1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                aa.a aVar = boVar.j1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
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
                                        pj pjVar = boVar.a1;
                                        if (pjVar != null) {
                                            pjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], boVar.a1.getMeasuredWidth() + i13, boVar.a1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.F0 = motionEvent.getX();
                                                    this.G0 = motionEvent.getY();
                                                    this.H0 = SystemClock.elapsedRealtime();
                                                    this.I0 = z12;
                                                    pj pjVar2 = boVar.a1;
                                                    if (pjVar2 != null) {
                                                        pjVar2.h0.c(z12);
                                                    }
                                                    z10 = true;
                                                } else {
                                                    this.H0 = -1L;
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        pj pjVar3 = boVar.a1;
                                        if (pjVar3 != null) {
                                            pjVar3.h0.c(false);
                                        }
                                        if (this.I0 || (v7.z6.a(this.F0, this.G0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.H0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.I0) {
                                                d5Var2 = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                                                boVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) d5Var2).P(ProfileActivity.m4(boVar.T5));
                                            } else {
                                                d5Var = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                                                ((ActionBarLayout) d5Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.H0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.H0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z10) {
                                }
                            } else {
                                r4 r4Var = (r4) com.google.firebase.messaging.m.k().d;
                                if (r4Var != null) {
                                    r4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
                            if (boVar.c9.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o9.getX(), o9.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = i1Var.e;
                        if (i1Var.H) {
                            i1Var.I = true;
                            i1Var.H = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(i1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            i1Var.d = 0;
                            i1Var.c = 1.0f;
                            org.telegram.ui.Components.y71 y71Var = i1Var.M;
                            if (y71Var != null) {
                                y71Var.e(1.0f, 0, i1Var.b);
                            }
                            i1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                vkVar = boVar.wa;
                if (!vkVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.O0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.x0) goto L69;
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
        ci.s6 s6Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        qk qkVar;
        MessageObject messageObject;
        gl glVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        bo boVar = this.J0;
        boolean z12 = false;
        if ((boVar.J8 == null && ((ArrayList) boVar.M9.c).size() <= 0) || (view != boVar.j1 && view != boVar.X2 && view != boVar.Y2 && view != boVar.m9 && view != boVar.X9 && view != boVar.e2 && view != null && view != boVar.y3 && view != boVar.z3)) {
            if ((view != boVar.y3 || !PhotoViewer.t1().Q1()) && (!boVar.S9 || view != boVar.x0)) {
                if (boVar.ka) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                }
                if (view != boVar.b3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (s6Var = boVar.y2) != null && s6Var.a() && boVar.y2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == boVar.t8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    } else {
                        if (view != boVar.x0) {
                            if (view != boVar.S) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == boVar.t8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-boVar.N9) - (boVar.U9 != 0.0f ? (boVar.x0.getMeasuredHeight() - boVar.N9) * boVar.U9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.i6.k3 != null && boVar.v8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(boVar.t8.getScaleX(), boVar.t8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.i6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.i6.k3.setBounds(x10, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(boVar.C9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(boVar.C9()) + y3);
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
                                if (view == boVar.S && (glVar = boVar.b3) != null && glVar.getVisibility() == 0) {
                                    super.drawChild(canvas, boVar.b3, j3);
                                }
                                z12 = super.drawChild(canvas, view, j3);
                                if (z11 && view == boVar.x0 && playingMessageObject.type != 5 && (qkVar = boVar.t8) != null && qkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-boVar.N9) - (boVar.U9 != 0.0f ? (boVar.x0.getMeasuredHeight() - boVar.N9) * boVar.U9 : 0.0f)) + boVar.O9);
                                    super.drawChild(canvas, boVar.t8, j3);
                                    if (boVar.u8 != null) {
                                        canvas.save();
                                        canvas.translate(boVar.u8.getX(), boVar.x0.getY() + boVar.u8.getTop());
                                        if (z10) {
                                            boVar.u8.g2(canvas);
                                            invalidate();
                                            boVar.u8.invalidate();
                                        } else {
                                            boVar.u8.Y1(canvas);
                                            org.telegram.ui.Cells.t1 t1Var = boVar.u8;
                                            if (!t1Var.vb && ((messageObject = t1Var.y7) == null || messageObject.type != 27)) {
                                                t1Var.m2(t1Var.getAlpha(), canvas, true);
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
                        if (view == boVar.t8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.pv0
    public float getBottomOffset() {
        return this.J0.x0.getBottom();
    }

    public bo getChatActivity() {
        return this.J0;
    }

    @Override // org.telegram.ui.Components.pv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.pv0
    public int getKeyboardHeight() {
        if (this.J0.Oa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.pv0
    public float getListTranslationY() {
        return this.J0.x0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.pv0
    public Drawable getNewDrawable() {
        Drawable d = this.J0.ea.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.pv0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.ea.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.pv0
    public int getScrollOffset() {
        return this.J0.x0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        bo boVar = this.J0;
        if (boVar.Oa) {
            this.H.b = boVar.X0;
        } else {
            d5Var = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                if (((ActionBarLayout) d5Var2).b) {
                    org.telegram.ui.ActionBar.p1 p1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.n2) boVar).parentLayout;
                    p1Var.b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        boVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == boVar.T5)) {
            MediaController.getInstance().setTextureView(boVar.N7(false), boVar.v8, boVar.t8, true);
        }
        zp zpVar = boVar.P9;
        if (zpVar != null) {
            zpVar.f();
        }
        boVar.xa.j();
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        bo boVar = this.J0;
        zp zpVar = boVar.P9;
        if (zpVar != null) {
            NotificationCenter.getInstance(zpVar.e0).removeObserver(zpVar, NotificationCenter.updateInterfaces);
            zpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.o5 o5Var = zpVar.k0;
            if (o5Var != null && (view = zpVar.a0) != null) {
                o5Var.o(view);
            }
            zpVar.Q = 0.0f;
            zpVar.P = 0L;
            boVar.P9 = null;
        }
        boVar.xa.k();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        bo boVar;
        ci.s6 s6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (s6Var = (boVar = this.J0).y2) == null || !s6Var.a() || boVar.y2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.Bc) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int C;
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
        bo boVar = this.J0;
        ph.i iVar = boVar.v;
        int i22 = (measuredWidth - boVar.Ta) - boVar.Ua;
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
                    C = hg.c.C(i22, measuredWidth2, 2, boVar.Ta) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = boVar.Ta + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
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
                            if (childAt != boVar.M9 && childAt != boVar.X9 && childAt != boVar.S && !(childAt instanceof org.telegram.ui.Components.i40) && !(childAt instanceof org.telegram.ui.Components.qp)) {
                                if (childAt instanceof org.telegram.ui.Cells.ca) {
                                    i20 = boVar.za;
                                } else if (childAt == boVar.Q0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (boVar.Y.v0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.n2) boVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = boVar.Y.getBottom();
                                        }
                                    }
                                    i18 = boVar.Y.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    mk mkVar = boVar.Y;
                                    if (mkVar != null && (childAt == mkVar.N1 || childAt == mkVar.M1)) {
                                        i18 = org.telegram.messenger.vl.w(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == boVar.w2) {
                                        i18 = org.telegram.messenger.vl.w(7.0f, iVar.d(), i18);
                                    } else if (mkVar == null || childAt != mkVar.e1) {
                                        if (childAt == boVar.e2 || childAt == boVar.s2 || childAt == boVar.f2) {
                                            i19 = this.w0;
                                        } else if (childAt == boVar.x0 || childAt == boVar.v0 || childAt == boVar.X2 || childAt == boVar.Y2 || childAt == boVar.Z2) {
                                            i20 = boVar.za;
                                        } else if (childAt != boVar.P) {
                                            kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (boVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == boVar.t8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != boVar.b3 && childAt != boVar.c3 && childAt != boVar.u0) {
                                                if (childAt instanceof org.telegram.ui.Components.vb0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != boVar.T) {
                                                    if (childAt != boVar.N3) {
                                                    }
                                                }
                                            }
                                        } else if (mkVar.A0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.vl.w(9.0f, iVar.d(), i18);
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
                    C = (measuredWidth - boVar.Ua) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = C - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        ck ckVar = boVar.Y2;
        if (ckVar != null) {
            ckVar.setBackgroundHeight(getMeasuredHeight());
        }
        boVar.o9();
        boVar.r9();
        boVar.Mc(false, false);
        S();
        boVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0548  */
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
        org.telegram.ui.Components.oc ocVar;
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
        ViewGroup viewGroup;
        int indexOfChild;
        bo boVar = this.J0;
        ph.i iVar = boVar.v;
        yf.b0 b0Var = boVar.Cc;
        ViewParent parent = b0Var.getParent();
        if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(b0Var)) >= 0 && indexOfChild != viewGroup.getChildCount() - 1) {
            viewGroup.bringChildToFront(b0Var);
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - boVar.Ta) - boVar.Ua;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        fh.a aVar = boVar.L.a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).b(i15, size2);
        }
        if (this.y0 != i15) {
            boVar.F4 = false;
            this.y0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
            if (z13 || (user = boVar.f) == null || !user.self) {
                boVar.K9 = false;
            } else {
                org.telegram.ui.ActionBar.j5 titleTextView = boVar.a1.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    boVar.K9 = !boVar.L9;
                } else {
                    boVar.K9 = false;
                }
            }
            if (boVar.K9 || boVar.L9 || UserObject.isBotForumWithEditableTopics(boVar.f)) {
                pj pjVar = boVar.a1;
                if (pjVar != null && pjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) boVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(boVar.R3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                pj pjVar2 = boVar.a1;
                if (pjVar2 != null && pjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) boVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (boVar.K9) {
                kVar8 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                if (!kVar8.n0 && (v0Var = boVar.m0) != null) {
                    v0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var2 = boVar.h0;
                if (v0Var2 != null) {
                    v0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.v0 v0Var3 = boVar.h0;
                if (v0Var3 != null) {
                    v0Var3.K(40);
                }
                org.telegram.ui.ActionBar.v0 v0Var4 = boVar.m0;
                if (v0Var4 != null) {
                    v0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            if (!kVar7.n0 && (yVar = boVar.n0) != null) {
                yVar.f((!boVar.L9 || boVar.K9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = boVar.h0;
            if (v0Var5 != null) {
                TLRPC.UserFull userFull = boVar.a8;
                if (boVar.L9) {
                    v0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    v0Var5.K(32);
                }
            }
            boVar.F4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + boVar.oa >= AndroidUtilities.dp(20.0f);
        if (this.x0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (boVar.pa > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            boVar.oa = boVar.pa;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            boVar.oa = boVar.Y.u0() ? boVar.Y.getEmojiPadding() : 0;
        } else {
            boVar.oa = 0;
        }
        setEmojiKeyboardHeight(boVar.oa);
        boolean z15 = this.f + boVar.oa >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i16 = 0; i16 < boVar.x0.getChildCount(); i16++) {
                View childAt = boVar.x0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        boVar.x0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            boVar.z0.i1(R, (int) (((((boVar.x0.getMeasuredHeight() - boVar.s9) - boVar.Aa) + ((this.f + boVar.oa) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(boVar.C9()))) / 2.0f), false);
                            boVar.A0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(boVar.Y, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
                            if (!z10 || boVar.Oa) {
                                this.w0 = 0;
                            } else {
                                this.w0 = boVar.Y.getMeasuredHeight();
                            }
                            boVar.za = 0;
                            boVar.Aa = 0;
                            if (SharedConfig.chatBlurEnabled() && !boVar.Oa && boVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = boVar.G;
                                boVar.za = i18;
                                boVar.Aa = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != boVar.Y) {
                                    kVar4 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                                    if (childAt2 != kVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == boVar.x0 || childAt2 == boVar.v0 || (childAt2 instanceof org.telegram.ui.Cells.ca)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), boVar.za + size2 + boVar.Aa), TLObject.FLAG_30));
                                            } else if (childAt2 == boVar.P) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.w0;
                                                z12 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((boVar.Y.A0() ? 48 : 0) + 2) + (i20 - (z12 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == boVar.b3) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                boVar.b3.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) boVar.sc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == boVar.c3) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) boVar.sc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == boVar.Q0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (boVar.Y.v0(childAt2)) {
                                                org.telegram.ui.Components.zf zfVar = boVar.Y.G1;
                                                if (childAt2 == zfVar && zfVar != null) {
                                                    i19 = zfVar.getKeyboardHeight();
                                                }
                                                z11 = ((org.telegram.ui.ActionBar.n2) boVar).inBubbleMode;
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
                                                fk fkVar = boVar.I1;
                                                if (childAt2 == fkVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fkVar.getLayoutParams();
                                                    gg.k1 adapter = boVar.I1.getAdapter();
                                                    if (adapter.w0 == null || adapter.h0) {
                                                        boVar.I1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        boVar.I1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == boVar.c9.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + boVar.za;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || boVar.Oa) {
                                                        um umVar = boVar.c9;
                                                        umVar.e0 = 0;
                                                        umVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        um umVar2 = boVar.c9;
                                                        umVar2.e0 = keyboardHeight;
                                                        umVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.vb0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == boVar.R1) {
                                                    kVar5 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                                                    if (kVar5.getVisibility() == 0) {
                                                        kVar6 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
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
                            if (boVar.E4) {
                                boVar.F4 = true;
                                boVar.o9();
                                boVar.r9();
                                boVar.E4 = false;
                                uj ujVar = boVar.x0;
                                ujVar.measure(View.MeasureSpec.makeMeasureSpec(ujVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(boVar.x0.getMeasuredHeight(), TLObject.FLAG_30));
                                boVar.F4 = false;
                            }
                            i13 = boVar.x4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ai.n8(this, i13, 25));
                                boVar.x4 = -1;
                            }
                            ocVar = org.telegram.ui.Components.oc.w;
                            if (ocVar != null && boVar.Yb != null) {
                                ocVar.l();
                            }
                            boVar.S6();
                            this.x0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.ye yeVar = boVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(yeVar);
        yeVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(boVar.Y, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
        if (z10) {
        }
        this.w0 = 0;
        boVar.za = 0;
        boVar.Aa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = boVar.G;
            boVar.za = i182;
            boVar.Aa = i182;
        }
        while (i12 < childCount) {
        }
        if (boVar.E4) {
        }
        i13 = boVar.x4;
        if (i13 != -1) {
        }
        ocVar = org.telegram.ui.Components.oc.w;
        if (ocVar != null) {
            ocVar.l();
        }
        boVar.S6();
        this.x0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        bo boVar = this.J0;
        gh.d.c(boVar.z8, boVar.fragmentView);
        boVar.A8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.J0.F4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        bo boVar = this.J0;
        boVar.v9 = i11;
        boVar.o9();
        boVar.r9();
    }

    @Override // org.telegram.ui.Components.pv0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.pv0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.pv0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
