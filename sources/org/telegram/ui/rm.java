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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rm extends org.telegram.ui.Components.qv0 {
    public Paint A0;
    public int B0;
    public float C0;
    public float D0;
    public long E0;
    public boolean F0;
    public final /* synthetic */ zn G0;
    public int t0;
    public int u0;
    public int v0;
    public final ArrayList w0;
    public final ArrayList x0;
    public final ArrayList y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(zn znVar, Context context, org.telegram.ui.ActionBar.e5 e5Var) {
        super(context, e5Var);
        this.G0 = znVar;
        this.t0 = 0;
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.E = new qm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.G0;
        znVar.U0.setTranslationY(f10);
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        kVar.setTranslationY(0.0f);
        cl clVar = znVar.Ya;
        if (clVar != null) {
            clVar.setTranslationY(znVar.l1 != null ? r3.getCurrentHeight() : 0);
        }
        ph.f3 f3Var = znVar.t1;
        if (f3Var != null) {
            f3Var.setTranslationY(0.0f);
        }
        ph.f3 f3Var2 = znVar.s1;
        if (f3Var2 != null) {
            f3Var2.setTranslationY(0.0f);
        }
        znVar.N0.setTranslationY(0.0f);
        znVar.M.setTranslationY(0.0f);
        znVar.t9 = 0.0f;
        znVar.u9 = 0.0f;
        znVar.U0.setBackgroundTranslation(0);
        fl flVar = znVar.Y2;
        if (flVar != null) {
            flVar.q0 = 0.0f;
            flVar.s();
        }
        eg.i0 i0Var = znVar.v2;
        if (i0Var != null) {
            org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.b;
            x9Var.u = 0.0f;
            x9Var.d.invalidate();
        }
        znVar.setFragmentPanTranslationOffset(0);
        znVar.o9();
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.ec0) {
            ((org.telegram.ui.Components.ec0) drawable).p();
        }
        zn znVar = this.G0;
        sg.a c3 = znVar.T.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(znVar.T.b(c3));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(znVar.T.a(c3));
        znVar.Ab = computePerceivedBrightness <= 0.721f;
        znVar.Bb = computePerceivedBrightness2 <= 0.9f;
        znVar.I.a = c3;
        wg.f fVar = znVar.U;
        if (fVar != null) {
            fVar.invalidate();
        }
        ug.f fVar2 = znVar.P;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        znVar.n9();
        znVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f10, org.telegram.ui.Cells.s1 s1Var, int i10) {
        int save = canvas.save();
        zn znVar = this.G0;
        float x10 = s1Var.getX() + znVar.u0.getLeft();
        float y10 = s1Var.getY() + znVar.u0.getY() + s1Var.getPaddingTop();
        float alpha = s1Var.a() ? s1Var.getAlpha() : 1.0f;
        canvas.clipRect(znVar.u0.getLeft(), f10, znVar.u0.getRight(), ((((znVar.u0.getY() + znVar.u0.getMeasuredHeight()) - znVar.xa) - znVar.v.d()) - znVar.pc) - AndroidUtilities.dp(9.0f));
        canvas.translate(x10, y10);
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(alpha, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, alpha);
        } else if (i10 == 2) {
            s1Var.I1(alpha, canvas, s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0);
        } else if (i10 == 3) {
            boolean z4 = s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0;
            s1Var.N1(canvas, alpha);
            if (!z4) {
                s1Var.d2(canvas, alpha, null);
            }
        } else if (i10 == 4 && ((s1Var.getCurrentPosition() == null || (1 & s1Var.getCurrentPosition().flags) != 0) && znVar.J8 != null)) {
            float f11 = (znVar.E8 * znVar.H8) / 0.2f;
            canvas.save();
            s1Var.h2(canvas, znVar.J8, f11, znVar.F8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y10);
            s1Var.i2(this, canvas, znVar.K8, znVar.J8, f11);
            canvas.restore();
        }
        s1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ig igVar;
        zn znVar = this.G0;
        ng.a aVar = znVar.G;
        lk lkVar = znVar.V;
        if (lkVar == null || view != lkVar.j0) {
            super.addView(view, i10, layoutParams);
        } else {
            wg.f fVar = znVar.U;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        lk lkVar2 = znVar.V;
        if (lkVar2 != null && view == lkVar2.j0) {
            rh.v vVar = (rh.v) view;
            vVar.setBackgroundDrawable(aVar.c(vVar.c, znVar.x, false));
        }
        lk lkVar3 = znVar.V;
        if (lkVar3 == null || view != (igVar = lkVar3.K1)) {
            return;
        }
        igVar.setBlurredBackgroundFactory(aVar);
    }

    public final boolean b0(View view) {
        if (view == this.I) {
            return true;
        }
        zn znVar = this.G0;
        return view == znVar.v2 || view == znVar.n1 || view == znVar.j9 || view == znVar.U || view == znVar.H3;
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
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Integer num;
        Paint paint;
        Paint paint2;
        float f10;
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
        rm rmVar;
        float f11;
        View view3;
        org.telegram.ui.Components.qa0 qa0Var;
        org.telegram.ui.Components.qa0 qa0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        vm vmVar;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        vm vmVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        float f12;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f13;
        float f14;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        Paint paint12;
        vm vmVar3;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i11;
        int i12;
        ArrayList arrayList5;
        org.telegram.ui.Cells.s1 s1Var2;
        ArrayList arrayList6;
        ch.i iVar;
        Integer num4;
        float f15;
        float f16;
        boolean z4;
        vm vmVar4;
        vm vmVar5;
        org.telegram.ui.Components.qa0 qa0Var3;
        float f17;
        float f18;
        vm vmVar6;
        vm vmVar7;
        vm vmVar8;
        vm vmVar9;
        Canvas canvas4;
        float f19;
        float f20;
        View view9;
        float f21;
        float f22;
        Integer num5;
        float f23;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.v0 v0Var2;
        Paint paint14;
        float f24;
        float f25;
        Paint paint15;
        float f26;
        float f27;
        float f28;
        float f29;
        vm vmVar10;
        vm vmVar11;
        Integer num7;
        vm vmVar12;
        vm vmVar13;
        Integer num8;
        rm rmVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        Paint paint17;
        Paint paint18;
        float f30;
        float f31;
        View view10;
        Paint paint19;
        float f32;
        float f33;
        Paint paint20;
        float f34;
        float f35;
        float f36;
        Canvas canvas5;
        float f37;
        float f38;
        vm vmVar14;
        vm vmVar15;
        Integer num9;
        vm vmVar16;
        vm vmVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f39;
        Integer num11;
        vm vmVar18;
        vm vmVar19;
        Integer num12;
        org.telegram.ui.Components.df dfVar;
        org.telegram.ui.Components.qa0 qa0Var4;
        org.telegram.ui.Components.qa0 qa0Var5;
        org.telegram.ui.Cells.s1 s1Var3;
        float f40;
        vm vmVar20;
        org.telegram.ui.Cells.s1 s1Var4;
        boolean z10;
        org.telegram.ui.Components.qa0 qa0Var6;
        float f41;
        org.telegram.ui.Components.qa0 qa0Var7;
        float f42;
        vm vmVar21;
        org.telegram.ui.Components.qa0 qa0Var8;
        org.telegram.ui.Components.qa0 qa0Var9;
        vm vmVar22;
        View view11;
        float f43;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.k kVar6;
        View view15;
        float f44;
        Paint paint23;
        float f45;
        float f46;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f47;
        Integer num13;
        float f48;
        Paint paint25;
        Paint paint26;
        float f49;
        float f50;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        Paint paint29;
        float f51;
        Paint paint30;
        float f52;
        float f53;
        Paint paint31;
        View view24;
        org.telegram.ui.ActionBar.k kVar7;
        int i13;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.l40 l40Var;
        View view25;
        gj gjVar;
        View view26;
        uj ujVar;
        rm rmVar3 = this;
        zn znVar = rmVar3.G0;
        ch.i iVar2 = znVar.v;
        ArrayList arrayList7 = znVar.k6;
        znVar.V.T1();
        znVar.jc();
        if (znVar.oa || ((ujVar = znVar.v0) != null && ujVar.k())) {
            znVar.oa = false;
            znVar.uc();
        }
        znVar.Mc(false, false);
        znVar.wc();
        gj gjVar2 = znVar.d2;
        if (gjVar2 != null && gjVar2.getTag() != null && (view26 = (gjVar = znVar.d2).e) != null) {
            gjVar.g(view26);
        }
        org.telegram.ui.Components.l40 l40Var2 = znVar.f2;
        if (l40Var2 != null && l40Var2.getTag() != null && (view25 = (l40Var = znVar.f2).e) != null) {
            l40Var.g(view25);
        }
        if (znVar.ha) {
            kVar10 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), rmVar3.getMeasuredWidth(), rmVar3.getMeasuredHeight(), (int) (znVar.ia * 255.0f), 31);
            float f54 = (znVar.ia * 0.2f) + 0.8f;
            canvas2.scale(f54, f54, rmVar3.getMeasuredWidth() / 2.0f, rmVar3.getMeasuredHeight() / 2.0f);
            i10 = saveLayerAlpha;
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        for (int i14 = 0; i14 < size; i14++) {
            org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) arrayList7.get(i14);
            MessageObject.SendAnimationData sendAnimationData = s1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    xk xkVar = znVar.l1;
                    int currentHeight = measuredHeight + (xkVar != null ? xkVar.getCurrentHeight() : 0);
                    jk jkVar = znVar.m1;
                    int currentHeight2 = currentHeight + (jkVar != null ? jkVar.getCurrentHeight() : 0);
                    z11 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
                    i13 = currentHeight2 + (z11 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + znVar.q9, rmVar3.getWidth(), rmVar3.getHeight());
                ImageReceiver photoImage = s1Var5.getPhotoImage();
                s1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((znVar.V.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) ai.c(1.0f, sendAnimationData.progress, s1Var5.getTranslationY(), r9[1])));
                if (sendAnimationData.fromPreview) {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, topViewEnterProgress, sendAnimationData.progress));
                } else {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, photoImage.getCenterY() + topViewEnterProgress, sendAnimationData.progress));
                }
                float f55 = sendAnimationData.currentScale;
                canvas2.scale(f55, f55);
                if (!sendAnimationData.fromPreview) {
                    canvas2.translate(-photoImage.getCenterX(), -photoImage.getCenterY());
                }
                s1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                s1Var5.draw(canvas2);
                canvas2.restore();
            }
        }
        num = znVar.J8;
        if (num != null) {
            view24 = znVar.G8;
        }
        paint = znVar.A8;
        if (paint != null) {
            matrix = znVar.B8;
            matrix.reset();
            float measuredWidth = rmVar3.getMeasuredWidth() / znVar.y8.getWidth();
            matrix2 = znVar.B8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = znVar.z8;
            matrix3 = znVar.B8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = znVar.A8;
            paint5.setAlpha((int) (znVar.I8 * 255.0f));
            paint6 = znVar.A8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = rmVar3.getMeasuredWidth();
                float measuredHeight2 = rmVar3.getMeasuredHeight();
                paint7 = znVar.A8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = znVar.C8;
            f10 = znVar.E8;
            float f56 = f10 * 255.0f;
            view = znVar.G8;
            paint2.setAlpha((int) (f56 * (view != null ? znVar.H8 : 1.0f)));
            paint3 = znVar.C8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = rmVar3.getMeasuredWidth();
                float measuredHeight3 = rmVar3.getMeasuredHeight();
                paint4 = znVar.C8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = znVar.J8;
        if (num2 != null && znVar.L8) {
            rmVar3.invalidate();
        }
        view2 = znVar.G8;
        if (view2 != null) {
            view4 = znVar.G8;
            if (view4 == znVar.g1) {
                f51 = znVar.H8;
                if (f51 < 1.0f) {
                    paint30 = znVar.C8;
                    f52 = znVar.E8;
                    f53 = znVar.H8;
                    paint30.setAlpha((int) ((1.0f - f53) * f52 * 255.0f));
                    float measuredWidth4 = rmVar3.getMeasuredWidth();
                    float measuredHeight4 = rmVar3.getMeasuredHeight();
                    paint31 = znVar.C8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = znVar.G8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f43 = znVar.H8;
                    if (f43 < 1.0f) {
                        view20 = znVar.G8;
                        float left = view20.getLeft();
                        view21 = znVar.G8;
                        float top = view21.getTop();
                        view22 = znVar.G8;
                        float right = view22.getRight();
                        view23 = znVar.G8;
                        float bottom = view23.getBottom();
                        f47 = znVar.H8;
                        int i15 = (int) (f47 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = znVar.G8;
                    float left2 = view12.getLeft();
                    view13 = znVar.G8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = znVar.G8;
                    kVar6 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = znVar.G8;
                        float x10 = view16.getX();
                        view17 = znVar.G8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = znVar.G8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = znVar.G8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, znVar.D8);
                    }
                    view15 = znVar.G8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f44 = znVar.H8;
                    if (f44 < 1.0f) {
                        paint23 = znVar.C8;
                        f45 = znVar.E8;
                        f46 = znVar.H8;
                        paint23.setAlpha((int) ((1.0f - f46) * f45 * 255.0f));
                        float measuredWidth6 = rmVar3.getMeasuredWidth();
                        float measuredHeight6 = rmVar3.getMeasuredHeight();
                        paint24 = znVar.C8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    vmVar = znVar.u0;
                    float y10 = ((vmVar.getY() + znVar.p9) - znVar.r9) - AndroidUtilities.dp(4.0f);
                    view6 = znVar.G8;
                    if (view6 instanceof org.telegram.ui.Cells.s1) {
                        view11 = znVar.G8;
                        groupedMessages = ((org.telegram.ui.Cells.s1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    vmVar2 = znVar.u0;
                    int childCount = vmVar2.getChildCount();
                    int i16 = 0;
                    boolean z12 = false;
                    while (true) {
                        arrayList = rmVar3.y0;
                        f11 = 20.0f;
                        arrayList2 = rmVar3.x0;
                        arrayList3 = rmVar3.w0;
                        arrayList4 = rmVar3.z0;
                        if (i16 >= childCount) {
                            break;
                        }
                        vmVar3 = znVar.u0;
                        View childAt = vmVar3.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            s1Var = (org.telegram.ui.Cells.s1) childAt;
                            groupedMessages2 = s1Var.getCurrentMessagesGroup();
                            groupedMessagePosition = s1Var.getCurrentPosition();
                            v0Var = null;
                        } else {
                            v0Var = childAt instanceof org.telegram.ui.Cells.v0 ? (org.telegram.ui.Cells.v0) childAt : null;
                            groupedMessages2 = null;
                            s1Var = null;
                            groupedMessagePosition = null;
                        }
                        float f57 = y10;
                        view7 = znVar.G8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != 0.0f) {
                            if (z12 || s1Var == null || groupedMessages == null || (s1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i11 = childCount;
                                i12 = i16;
                                arrayList5 = arrayList;
                                s1Var2 = s1Var;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                f15 = 9.0f;
                                f16 = 1.0f;
                                z4 = z12;
                            } else {
                                f15 = 9.0f;
                                float E2 = s1Var3.E2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f58 = transitionParams.left + E2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f59 = transitionParams.top + transitionParams.offsetTop;
                                float f60 = transitionParams.right + E2 + transitionParams.offsetRight;
                                i11 = childCount;
                                float f61 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f40 = f59;
                                } else {
                                    f40 = transitionParams.cell.getTranslationY() + f59;
                                    f61 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f62 = f40;
                                float dp = f62 < (znVar.p9 - ((float) znVar.r9)) - ((float) AndroidUtilities.dp(20.0f)) ? (znVar.p9 - znVar.r9) - AndroidUtilities.dp(20.0f) : f62;
                                vmVar20 = znVar.u0;
                                if (f61 > AndroidUtilities.dp(20.0f) + vmVar20.getMeasuredHeight()) {
                                    vmVar22 = znVar.u0;
                                    f61 = AndroidUtilities.dp(20.0f) + vmVar22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i12 = i16;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size2) {
                                        arrayList5 = arrayList;
                                        s1Var4 = s1Var;
                                        z10 = true;
                                        break;
                                    }
                                    int i18 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i17);
                                    arrayList5 = arrayList;
                                    if (znVar.T5[messageObject.getDialogId() == znVar.Q5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        s1Var4 = s1Var;
                                        z10 = false;
                                        break;
                                    } else {
                                        i17++;
                                        size2 = i18;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - znVar.pc) - AndroidUtilities.dp(9.0f);
                                qa0Var6 = znVar.F1;
                                if (qa0Var6 != null) {
                                    qa0Var9 = znVar.F1;
                                    f41 = qa0Var9.d();
                                } else {
                                    f41 = 0.0f;
                                }
                                float f63 = measuredHeight7 - f41;
                                qa0Var7 = znVar.F1;
                                if (qa0Var7 != null) {
                                    qa0Var8 = znVar.F1;
                                    f42 = qa0Var8.e();
                                } else {
                                    f42 = 0.0f;
                                }
                                org.telegram.ui.Cells.s1 s1Var6 = s1Var4;
                                canvas3.clipRect(0.0f, f57 + f42, getMeasuredWidth(), f63);
                                vmVar21 = znVar.u0;
                                canvas3.translate(0.0f, vmVar21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                iVar = iVar2;
                                num4 = null;
                                s1Var2 = s1Var6;
                                f16 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f58, (int) dp, (int) f60, (int) f61, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z10, 0);
                                canvas.restore();
                                z4 = true;
                            }
                            if (s1Var2 != null && s1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            vmVar4 = znVar.u0;
                            float left3 = vmVar4.getLeft();
                            vmVar5 = znVar.u0;
                            float right2 = vmVar5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - znVar.pc) - znVar.W8(org.telegram.ui.Components.s21.c)) - AndroidUtilities.dp(f15);
                            qa0Var3 = znVar.F1;
                            if (qa0Var3 != null) {
                                qa0Var4 = znVar.F1;
                                float max = Math.max(0.0f, qa0Var4.e());
                                qa0Var5 = znVar.F1;
                                f18 = Math.max(0.0f, qa0Var5.d());
                                f17 = max;
                            } else {
                                f17 = 0.0f;
                                f18 = 0.0f;
                            }
                            lk lkVar = znVar.V;
                            if (lkVar != null && (dfVar = lkVar.j0) != null) {
                                f18 = Math.max(f18, dfVar.f ? 0.0f : Math.max(0.0f, dfVar.getMeasuredHeight() - (dfVar.c.getTranslationY() + dfVar.e)));
                            }
                            float f64 = f57 + f17;
                            float f65 = measuredHeight8 - f18;
                            if (s1Var2 == null || !s1Var2.getTransitionParams().w0) {
                                vmVar6 = znVar.u0;
                                left3 = Math.max(left3, view8.getX() + vmVar6.getLeft());
                                vmVar7 = znVar.u0;
                                f64 = Math.max(f64, view8.getY() + vmVar7.getY());
                                vmVar8 = znVar.u0;
                                right2 = Math.min(right2, view8.getX() + vmVar8.getLeft() + view8.getMeasuredWidth());
                                vmVar9 = znVar.u0;
                                f65 = Math.min(f65, view8.getY() + vmVar9.getY() + view8.getMeasuredHeight());
                            }
                            float f66 = f65;
                            float f67 = f64;
                            float f68 = right2;
                            float max2 = Math.max(left3, znVar.R8());
                            if (f67 < f66) {
                                if (view8.getAlpha() != f16) {
                                    canvas4 = canvas;
                                    canvas4.saveLayerAlpha(max2, f67, f68, f66, (int) (view8.getAlpha() * 255.0f), 31);
                                    f39 = f67;
                                    f20 = f66;
                                    f21 = max2;
                                    f22 = f68;
                                } else {
                                    canvas4 = canvas;
                                    f39 = f67;
                                    f20 = f66;
                                    f21 = max2;
                                    f22 = f68;
                                    canvas4.save();
                                }
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(true);
                                    num12 = znVar.J8;
                                    s1Var2.setScrimReaction(num12);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(true);
                                    num11 = znVar.J8;
                                    v0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f21, f39, f22, f20);
                                vmVar18 = znVar.u0;
                                float x11 = view8.getX() + vmVar18.getLeft();
                                vmVar19 = znVar.u0;
                                canvas4.translate(x11, view8.getY() + vmVar19.getY());
                                if (s1Var2 != null && groupedMessages3 == null && s1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (s1Var2 == null || !s1Var2.U2()) {
                                    f19 = f39;
                                } else {
                                    canvas4.save();
                                    f19 = f39;
                                    canvas4.translate(0.0f, s1Var2.getPaddingTop());
                                    s1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (v0Var != null) {
                                    v0Var.A(canvas4);
                                }
                                canvas4.restore();
                                if (s1Var2 != null) {
                                    s1Var2.setInvalidatesParent(false);
                                    s1Var2.setScrimReaction(num4);
                                } else if (v0Var != null) {
                                    v0Var.setInvalidatesParent(false);
                                    v0Var.setScrimReaction(num4);
                                }
                            } else {
                                canvas4 = canvas;
                                f19 = f67;
                                f20 = f66;
                                view9 = view8;
                                f21 = max2;
                                f22 = f68;
                            }
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePosition;
                            if (groupedMessagePosition2 != null || (s1Var2 != null && s1Var2.getTransitionParams().w0)) {
                                if (groupedMessagePosition2 == null || groupedMessagePosition2.last || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) {
                                    if (groupedMessagePosition2 == null || groupedMessagePosition2.last) {
                                        arrayList3.add(s1Var2);
                                    }
                                    if (groupedMessagePosition2 == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0 && s1Var2.T2())) {
                                        arrayList2.add(s1Var2);
                                    }
                                }
                                if (groupedMessagePosition2 == null || (groupedMessagePosition2.flags & s1Var2.t0()) != 0) {
                                    arrayList5.add(s1Var2);
                                }
                                if (groupedMessagePosition2 != null) {
                                    int i19 = groupedMessagePosition2.flags;
                                    if ((i19 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(s1Var2);
                            }
                            num5 = znVar.J8;
                            if (num5 == null || s1Var2 == null || groupedMessages3 != null) {
                                float f69 = f22;
                                float f70 = f21;
                                View view27 = view9;
                                float f71 = f20;
                                float f72 = f19;
                                f23 = f57;
                                num6 = znVar.J8;
                                if (num6 != null && v0Var != null) {
                                    paint13 = znVar.A8;
                                    if (paint13 != null) {
                                        matrix7 = znVar.B8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / znVar.y8.getWidth();
                                        matrix8 = znVar.B8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = znVar.z8;
                                        matrix9 = znVar.B8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = znVar.A8;
                                        paint16.setAlpha((int) (znVar.I8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = znVar.A8;
                                        v0Var2 = v0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        v0Var2 = v0Var;
                                        paint14 = znVar.C8;
                                        f24 = znVar.E8;
                                        f25 = znVar.H8;
                                        paint14.setAlpha((int) (f25 * f24 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = znVar.C8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f67 < f66) {
                                        f26 = znVar.E8;
                                        f27 = znVar.H8;
                                        float f73 = (f27 * f26) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f28 = znVar.H8;
                                        float f74 = f28 * alpha;
                                        if (f74 < f16) {
                                            canvas.saveLayerAlpha(f70, f72, f69, f71, (int) (f74 * 255.0f), 31);
                                            f71 = f71;
                                            f29 = f72;
                                            canvas3 = canvas;
                                        } else {
                                            canvas3 = canvas;
                                            f29 = f72;
                                            canvas3.save();
                                        }
                                        canvas3.clipRect(f70, f29, f69, f71);
                                        vmVar10 = znVar.u0;
                                        float x12 = view27.getX() + vmVar10.getLeft();
                                        vmVar11 = znVar.u0;
                                        canvas3.translate(x12, view27.getY() + vmVar11.getY() + view27.getPaddingTop());
                                        num7 = znVar.J8;
                                        boolean z13 = znVar.F8;
                                        mg.r0 r0Var = v0Var2.z0;
                                        if (!r0Var.b) {
                                            org.telegram.ui.ActionBar.f6 f6Var = v0Var2.V0;
                                            if (f6Var != null) {
                                                f6Var.l(v0Var2.r0, v0Var2.q0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.s0);
                                            } else {
                                                org.telegram.ui.ActionBar.j6.q(v0Var2.r0, v0Var2.q0 + AndroidUtilities.dp(4.0f), v0Var2.getMeasuredWidth(), v0Var2.s0);
                                            }
                                            r0Var.D = f73;
                                            r0Var.E = z13;
                                            r0Var.d(canvas3, v0Var2.f2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        vmVar12 = znVar.u0;
                                        float x13 = view27.getX() + vmVar12.getLeft();
                                        vmVar13 = znVar.u0;
                                        canvas3.translate(x13, view27.getY() + vmVar13.getY() + view27.getPaddingTop());
                                        int i20 = znVar.K8;
                                        num8 = znVar.J8;
                                        v0Var2.D(this, canvas3, i20, num8, f73);
                                        rmVar2 = this;
                                        canvas3.restore();
                                        z12 = z4;
                                    }
                                }
                            } else {
                                paint18 = znVar.A8;
                                if (paint18 != null) {
                                    matrix10 = znVar.B8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / znVar.y8.getWidth();
                                    matrix11 = znVar.B8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = znVar.z8;
                                    matrix12 = znVar.B8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = znVar.A8;
                                    paint21.setAlpha((int) (znVar.I8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = znVar.A8;
                                    f30 = f22;
                                    f31 = f21;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f30 = f22;
                                    f31 = f21;
                                    view10 = view9;
                                    paint19 = znVar.C8;
                                    f32 = znVar.E8;
                                    f33 = znVar.H8;
                                    paint19.setAlpha((int) (f33 * f32 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = znVar.C8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f67 < f66) {
                                    f34 = znVar.E8;
                                    f35 = znVar.H8;
                                    float f75 = (f35 * f34) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f36 = znVar.H8;
                                    float f76 = f36 * alpha2;
                                    if (f76 < f16) {
                                        canvas5 = canvas;
                                        f37 = f20;
                                        float f77 = f19;
                                        canvas5.saveLayerAlpha(f31, f77, f30, f37, (int) (f76 * 255.0f), 31);
                                        f38 = f77;
                                    } else {
                                        canvas5 = canvas;
                                        f37 = f20;
                                        f38 = f19;
                                        canvas5.save();
                                    }
                                    canvas5.clipRect(f31, f38, f30, f37);
                                    vmVar14 = znVar.u0;
                                    float x14 = view10.getX() + vmVar14.getLeft();
                                    vmVar15 = znVar.u0;
                                    canvas5.translate(x14, view10.getY() + vmVar15.getY() + view10.getPaddingTop());
                                    num9 = znVar.J8;
                                    s1Var2.h2(canvas5, num9, f75, znVar.F8);
                                    canvas5.restore();
                                    canvas5.save();
                                    vmVar16 = znVar.u0;
                                    float x15 = view10.getX() + vmVar16.getLeft();
                                    vmVar17 = znVar.u0;
                                    canvas5.translate(x15, view10.getY() + vmVar17.getY() + view10.getPaddingTop());
                                    int i21 = znVar.K8;
                                    num10 = znVar.J8;
                                    f23 = f57;
                                    s1Var2.i2(this, canvas5, i21, num10, f75);
                                    canvas.restore();
                                } else {
                                    f23 = f57;
                                }
                            }
                            rmVar2 = this;
                            canvas3 = canvas;
                            z12 = z4;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f23 = f57;
                            rmVar2 = this;
                        }
                        i16 = i12 + 1;
                        rmVar3 = rmVar2;
                        y10 = f23;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    rmVar = rmVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f12 = 1.0f;
                    float f78 = y10;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            rmVar.a0(canvas3, f78, (org.telegram.ui.Cells.s1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            rmVar.a0(canvas3, f78, (org.telegram.ui.Cells.s1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.s1 s1Var7 = (org.telegram.ui.Cells.s1) arrayList.get(i24);
                            if (s1Var7.getCurrentPosition() != null || s1Var7.getTransitionParams().w0) {
                                rmVar.a0(canvas3, f78, s1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.s1 s1Var8 = (org.telegram.ui.Cells.s1) arrayList4.get(i25);
                            if (s1Var8.getCurrentPosition() != null || s1Var8.getTransitionParams().w0) {
                                rmVar.a0(canvas3, f78, s1Var8, 3);
                            }
                        }
                    }
                    num3 = znVar.J8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = znVar.A8;
                        if (paint8 != null) {
                            matrix4 = znVar.B8;
                            matrix4.reset();
                            float measuredWidth13 = rmVar.getMeasuredWidth() / znVar.y8.getWidth();
                            matrix5 = znVar.B8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = znVar.z8;
                            matrix6 = znVar.B8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = znVar.A8;
                            paint11.setAlpha((int) (znVar.I8 * 255.0f));
                            float measuredWidth14 = rmVar.getMeasuredWidth();
                            float measuredHeight13 = rmVar.getMeasuredHeight();
                            paint12 = znVar.A8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = znVar.C8;
                            f13 = znVar.E8;
                            f14 = znVar.H8;
                            paint9.setAlpha((int) (f14 * f13 * 255.0f));
                            float measuredWidth15 = rmVar.getMeasuredWidth();
                            float measuredHeight14 = rmVar.getMeasuredHeight();
                            paint10 = znVar.C8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.s1 s1Var9 = (org.telegram.ui.Cells.s1) arrayList4.get(i26);
                            if (s1Var9.getCurrentPosition() != null || s1Var9.getTransitionParams().w0) {
                                rmVar.a0(canvas3, f78, s1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = znVar.J8;
                    if (num13 == null) {
                        f48 = znVar.H8;
                        if (f48 < f12) {
                            paint25 = znVar.A8;
                            if (paint25 != null) {
                                matrix13 = znVar.B8;
                                matrix13.reset();
                                float measuredWidth16 = rmVar.getMeasuredWidth() / znVar.y8.getWidth();
                                matrix14 = znVar.B8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = znVar.z8;
                                matrix15 = znVar.B8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = znVar.A8;
                                paint28.setAlpha((int) (znVar.I8 * 255.0f));
                                float measuredWidth17 = rmVar.getMeasuredWidth();
                                float measuredHeight15 = rmVar.getMeasuredHeight();
                                paint29 = znVar.A8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = znVar.C8;
                                f49 = znVar.E8;
                                f50 = znVar.H8;
                                paint26.setAlpha((int) ((f12 - f50) * f49 * 255.0f));
                                float measuredWidth18 = rmVar.getMeasuredWidth();
                                float measuredHeight16 = rmVar.getMeasuredHeight();
                                paint27 = znVar.C8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            rmVar = rmVar3;
            f11 = 20.0f;
            f12 = 1.0f;
            num13 = znVar.J8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            rmVar = rmVar3;
            f11 = 20.0f;
        }
        view3 = znVar.G8;
        if (view3 != null || ((ArrayList) znVar.J9.c).size() > 0) {
            qa0Var = znVar.F1;
            if (qa0Var != null) {
                qa0Var2 = znVar.F1;
            }
            super.drawChild(canvas3, znVar.g1, SystemClock.uptimeMillis());
            bk bkVar = znVar.U2;
            if (bkVar != null && bkVar.getTag() != null) {
                super.drawChild(canvas3, znVar.U2, SystemClock.uptimeMillis());
            }
            ak akVar = znVar.V2;
            if (akVar != null && akVar.getTag() != null) {
                super.drawChild(canvas3, znVar.V2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.s00 s00Var = znVar.j9;
            if (s00Var != null) {
                super.drawChild(canvas3, s00Var, SystemClock.uptimeMillis());
            }
            hh.k kVar11 = znVar.U9;
            if (kVar11 != null) {
                super.drawChild(canvas3, kVar11, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.l40 l40Var3 = znVar.b2;
            if (l40Var3 != null) {
                super.drawChild(canvas3, l40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = znVar.v3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.v3, SystemClock.uptimeMillis());
            }
            il ilVar = znVar.w3;
            if (ilVar != null && ilVar.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.w3, SystemClock.uptimeMillis());
            }
            ph.f3 f3Var = znVar.u1;
            if (f3Var != null && f3Var.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.u1, SystemClock.uptimeMillis());
            }
            xl xlVar = znVar.y1;
            if (xlVar != null && xlVar.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.y1, SystemClock.uptimeMillis());
            }
            ph.f3 f3Var2 = znVar.w1;
            if (f3Var2 != null && f3Var2.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.w1, SystemClock.uptimeMillis());
            }
            lk lkVar2 = znVar.V;
            if (lkVar2 != null && lkVar2.I != null) {
                canvas3.save();
                canvas3.translate(znVar.V.I.getX() + znVar.V.getX(), znVar.V.I.getY() + znVar.V.getY());
                znVar.V.I.draw(canvas3);
                canvas3.restore();
            }
        }
        if (znVar.ma > 0 && rmVar.f < AndroidUtilities.dp(f11)) {
            int themedColor = znVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            if (rmVar.A0 == null) {
                rmVar.A0 = new Paint();
            }
            if (rmVar.B0 != themedColor) {
                Paint paint32 = rmVar.A0;
                rmVar.B0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, rmVar.getMeasuredHeight() - znVar.ma, rmVar.getMeasuredWidth(), rmVar.getMeasuredHeight(), rmVar.A0);
            canvas3 = canvas6;
        }
        vp vpVar = znVar.M9;
        if (vpVar != null && vpVar.e()) {
            int inputBubbleTop = (int) znVar.P.getInputBubbleTop();
            int inputBubbleBottom = (int) znVar.P.getInputBubbleBottom();
            zn znVar2 = znVar.Q9;
            int i27 = inputBubbleTop - ((int) (znVar.R9 * (znVar2 == null ? 0.0f : znVar2.L9)));
            vp vpVar2 = znVar.M9;
            rmVar.getMeasuredWidth();
            vpVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (znVar.Q9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, rmVar.getMeasuredWidth(), rmVar.getMeasuredHeight(), (int) (znVar.R9 * 255.0f), 31);
            canvas3 = canvas;
            znVar.Q9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        znVar.ua.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (znVar.ha) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (znVar.ia * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hl hlVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (hlVar = this.G0.Ba) == null || !hlVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        hlVar.a(true);
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
        boolean z4;
        uk ukVar;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.G0;
        ug.d dVar = znVar.K3;
        if (dVar != null) {
            dVar.n = SystemClock.uptimeMillis();
        }
        float y10 = (AndroidUtilities.isInMultiwindow || znVar.isInBubbleMode()) ? (znVar.V.getEmojiView() != null ? znVar.V.getEmojiView() : znVar.V).getY() : znVar.V.getY();
        View view = znVar.G8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        }
        lk lkVar = znVar.V;
        if (lkVar == null || !lkVar.v3 || motionEvent.getY() >= y10) {
            znVar.g9 = motionEvent.getY();
            org.telegram.ui.Cells.x9 o10 = znVar.Z8.o(getContext());
            motionEvent.offsetLocation(-o10.getX(), -o10.getY());
            if (!znVar.Z8.y() || !znVar.Z8.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o10.getX(), o10.getY());
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                gk gkVar = znVar.n1;
                if (gkVar != null) {
                    if (znVar.r3 != null) {
                        z4 = gkVar.A(motionEvent);
                        if (znVar.n1.E) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !znVar.Z8.y() || (motionEvent.getY() >= znVar.u0.getTop() && motionEvent.getY() <= znVar.u0.getBottom())) {
                            ukVar = znVar.ta;
                            if (!ukVar.n) {
                                return ukVar.g(motionEvent);
                            }
                            cb.m mVar = cb.m.e;
                            if (mVar == null || !mVar.a) {
                                if (znVar.isInPreviewMode() && znVar.G9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (znVar.g1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                s5.m mVar2 = znVar.g1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
                                                if (mVar2 != null) {
                                                    ((vg.b) mVar2.b).getLocationInWindow(iArr2);
                                                    Rect rect = AndroidUtilities.rectTmp2;
                                                    int i12 = iArr2[0] - iArr[0];
                                                    rect.set(i12, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i12, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z10 = true;
                                                        break;
                                                    }
                                                }
                                                i10++;
                                            }
                                        }
                                        z10 = false;
                                        nj njVar = znVar.X0;
                                        if (njVar != null) {
                                            njVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], znVar.X0.getMeasuredWidth() + i13, znVar.X0.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z11 = true;
                                                if (z10) {
                                                    this.C0 = motionEvent.getX();
                                                    this.D0 = motionEvent.getY();
                                                    this.E0 = SystemClock.elapsedRealtime();
                                                    this.F0 = z11;
                                                    nj njVar2 = znVar.X0;
                                                    if (njVar2 != null) {
                                                        njVar2.e0.c(z11);
                                                    }
                                                    z4 = true;
                                                } else {
                                                    this.E0 = -1L;
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z10) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        nj njVar3 = znVar.X0;
                                        if (njVar3 != null) {
                                            njVar3.e0.c(false);
                                        }
                                        if (this.F0 || (k7.n6.a(this.C0, this.D0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.E0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.F0) {
                                                e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                                                znVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) e5Var2).P(ProfileActivity.m4(znVar.Q5));
                                            } else {
                                                e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                                                ((ActionBarLayout) e5Var).r();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.E0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.E0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z4) {
                                }
                            } else {
                                w4 w4Var = (w4) cb.m.l().d;
                                if (w4Var != null) {
                                    w4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o10.getX(), -o10.getY());
                            if (znVar.Z8.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o10.getX(), o10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = gkVar.e;
                        if (gkVar.E) {
                            gkVar.F = true;
                            gkVar.E = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(gkVar.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            gkVar.d = 0;
                            gkVar.c = 1.0f;
                            org.telegram.ui.Components.a81 a81Var = gkVar.J;
                            if (a81Var != null) {
                                a81Var.e(1.0f, 0, gkVar.b);
                            }
                            gkVar.w(false);
                        }
                    }
                }
                z4 = false;
                if (motionEvent.getAction() == 0) {
                }
                ukVar = znVar.ta;
                if (!ukVar.n) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0086, code lost:
    
        if (r11 != r0.L0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
    
        if (r11 != r0.u0) goto L69;
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        eg.i0 i0Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z4;
        boolean z10;
        pk pkVar;
        MessageObject messageObject;
        fl flVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        zn znVar = this.G0;
        boolean z11 = false;
        if ((znVar.G8 == null && ((ArrayList) znVar.J9.c).size() <= 0) || (view != znVar.g1 && view != znVar.U2 && view != znVar.V2 && view != znVar.j9 && view != znVar.U9 && view != znVar.b2 && view != null && view != znVar.v3 && view != znVar.w3)) {
            if ((view != znVar.v3 || !PhotoViewer.t1().Q1()) && (!znVar.P9 || view != znVar.u0)) {
                if (znVar.ha) {
                    kVar3 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                }
                if (view != znVar.Y2) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (i0Var = znVar.v2) != null && i0Var.a() && znVar.v2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z4 = false;
                        z10 = false;
                        if (view == znVar.q8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    } else {
                        if (view != znVar.u0) {
                            if (view != znVar.P) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z4 = playingMessageObject.isRoundVideo();
                            if (z4 || playingMessageObject.isVideo()) {
                                z10 = true;
                                if (view == znVar.q8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-znVar.K9) - (znVar.R9 != 0.0f ? (znVar.u0.getMeasuredHeight() - znVar.K9) * znVar.R9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.j6.k3 != null && znVar.s8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y10 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(znVar.q8.getScaleX(), znVar.q8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.j6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.j6.k3.setBounds(x10, y10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(znVar.C9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(znVar.C9()) + y10);
                                            org.telegram.ui.ActionBar.j6.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z11 = super.drawChild(canvas, view, j10);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-AndroidUtilities.dp(1000.0f));
                                        z11 = super.drawChild(canvas, view, j10);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z11;
                                }
                                if (view == znVar.P && (flVar = znVar.Y2) != null && flVar.getVisibility() == 0) {
                                    super.drawChild(canvas, znVar.Y2, j10);
                                }
                                z11 = super.drawChild(canvas, view, j10);
                                if (z10 && view == znVar.u0 && playingMessageObject.type != 5 && (pkVar = znVar.q8) != null && pkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-znVar.K9) - (znVar.R9 != 0.0f ? (znVar.u0.getMeasuredHeight() - znVar.K9) * znVar.R9 : 0.0f)) + znVar.L9);
                                    super.drawChild(canvas, znVar.q8, j10);
                                    if (znVar.r8 != null) {
                                        canvas.save();
                                        canvas.translate(znVar.r8.getX(), znVar.u0.getY() + znVar.r8.getTop());
                                        if (z4) {
                                            znVar.r8.g2(canvas);
                                            invalidate();
                                            znVar.r8.invalidate();
                                        } else {
                                            znVar.r8.Y1(canvas);
                                            org.telegram.ui.Cells.s1 s1Var = znVar.r8;
                                            if (!s1Var.sb && ((messageObject = s1Var.v7) == null || messageObject.type != 27)) {
                                                s1Var.m2(s1Var.getAlpha(), canvas, true);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                }
                            }
                        } else {
                            z4 = false;
                        }
                        z10 = false;
                        if (view == znVar.q8) {
                        }
                    }
                }
            }
            return true;
        }
        return z11;
    }

    @Override // org.telegram.ui.Components.qv0
    public float getBottomOffset() {
        return this.G0.u0.getBottom();
    }

    public zn getChatActivity() {
        return this.G0;
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.qv0
    public int getKeyboardHeight() {
        if (this.G0.La) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.qv0
    public float getListTranslationY() {
        return this.G0.u0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.qv0
    public Drawable getNewDrawable() {
        Drawable d = this.G0.ba.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.qv0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.G0.ba.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.qv0
    public int getScrollOffset() {
        return this.G0.u0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        super.onAttachedToWindow();
        zn znVar = this.G0;
        if (znVar.La) {
            this.E.b = znVar.U0;
        } else {
            e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                if (((ActionBarLayout) e5Var2).b) {
                    org.telegram.ui.ActionBar.r1 r1Var = this.E;
                    e5Var3 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
                    r1Var.b = (FrameLayout) e5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.E.c();
        znVar.V.setAdjustPanLayoutHelper(this.E);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == znVar.Q5)) {
            MediaController.getInstance().setTextureView(znVar.N7(false), znVar.s8, znVar.q8, true);
        }
        vp vpVar = znVar.M9;
        if (vpVar != null) {
            vpVar.f();
        }
        znVar.ua.j();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.E.d();
        zn znVar = this.G0;
        vp vpVar = znVar.M9;
        if (vpVar != null) {
            NotificationCenter.getInstance(vpVar.b0).removeObserver(vpVar, NotificationCenter.updateInterfaces);
            vpVar.C.onDetachedFromWindow();
            org.telegram.ui.Components.l5 l5Var = vpVar.h0;
            if (l5Var != null && (view = vpVar.X) != null) {
                l5Var.o(view);
            }
            vpVar.N = 0.0f;
            vpVar.M = 0L;
            znVar.M9 = null;
        }
        znVar.ua.k();
        AndroidUtilities.runOnUIThread(new cg.n0(22));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zn znVar;
        eg.i0 i0Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (i0Var = (znVar = this.G0).v2) == null || !i0Var.a() || znVar.v2.getTag() == null) {
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
    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int d;
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
        boolean z10;
        org.telegram.ui.ActionBar.k kVar3;
        int i21;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        zn znVar = this.G0;
        ch.i iVar = znVar.v;
        int i22 = (measuredWidth - znVar.Ra) - znVar.Sa;
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
                    d = kf.k0.d(i22, measuredWidth2, 2, znVar.Ra) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = znVar.Ra + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
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
                            if (childAt != znVar.J9 && childAt != znVar.U9 && childAt != znVar.P && !(childAt instanceof org.telegram.ui.Components.l40) && !(childAt instanceof org.telegram.ui.Components.np)) {
                                if (childAt instanceof org.telegram.ui.Cells.x9) {
                                    i20 = znVar.wa;
                                } else if (childAt == znVar.N0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (znVar.V.u0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z10 = ((org.telegram.ui.ActionBar.p2) znVar).inBubbleMode;
                                        if (!z10) {
                                            i18 = znVar.V.getBottom();
                                        }
                                    }
                                    i18 = znVar.V.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    lk lkVar = znVar.V;
                                    if (lkVar != null && (childAt == lkVar.K1 || childAt == lkVar.J1)) {
                                        i18 = b.t(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == znVar.t2) {
                                        i18 = b.t(7.0f, iVar.d(), i18);
                                    } else if (lkVar == null || childAt != lkVar.b1) {
                                        if (childAt == znVar.b2 || childAt == znVar.p2 || childAt == znVar.c2) {
                                            i19 = this.t0;
                                        } else if (childAt == znVar.u0 || childAt == znVar.s0 || childAt == znVar.U2 || childAt == znVar.V2 || childAt == znVar.W2) {
                                            i20 = znVar.wa;
                                        } else if (childAt != znVar.M) {
                                            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (znVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == znVar.q8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != znVar.Y2 && childAt != znVar.Z2 && childAt != znVar.r0) {
                                                if (childAt instanceof org.telegram.ui.Components.xb0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != znVar.Q) {
                                                    if (childAt != znVar.K3) {
                                                    }
                                                }
                                            }
                                        } else if (lkVar.z0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = b.t(9.0f, iVar.d(), i18);
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
                    d = (measuredWidth - znVar.Sa) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = d - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        ak akVar = znVar.V2;
        if (akVar != null) {
            akVar.setBackgroundHeight(getMeasuredHeight());
        }
        znVar.o9();
        znVar.r9();
        znVar.Mc(false, false);
        S();
        znVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0531  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int childCount;
        boolean z4;
        int i12;
        int i13;
        org.telegram.ui.Components.ic icVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.w0 w0Var;
        TLRPC.User user;
        zn znVar = this.G0;
        ch.i iVar = znVar.v;
        znVar.Ac.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - znVar.Ra) - znVar.Sa;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        sg.a aVar = znVar.I.a;
        if (aVar instanceof sg.b) {
            ((sg.b) aVar).c(i15, size2);
        }
        if (this.v0 != i15) {
            znVar.C4 = false;
            this.v0 = makeMeasureSpec;
            z12 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
            if (z12 || (user = znVar.f) == null || !user.self) {
                znVar.H9 = false;
            } else {
                org.telegram.ui.ActionBar.k5 titleTextView = znVar.X0.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    znVar.H9 = !znVar.I9;
                } else {
                    znVar.H9 = false;
                }
            }
            if (znVar.H9 || znVar.I9 || UserObject.isBotForumWithEditableTopics(znVar.f)) {
                nj njVar = znVar.X0;
                if (njVar != null && njVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) znVar.X0.getLayoutParams()).rightMargin = AndroidUtilities.dp(znVar.O3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                nj njVar2 = znVar.X0;
                if (njVar2 != null && njVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) znVar.X0.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (znVar.H9) {
                kVar8 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                if (!kVar8.k0 && (w0Var = znVar.j0) != null) {
                    w0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = znVar.e0;
                if (w0Var2 != null) {
                    w0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.w0 w0Var3 = znVar.e0;
                if (w0Var3 != null) {
                    w0Var3.K(40);
                }
                org.telegram.ui.ActionBar.w0 w0Var4 = znVar.j0;
                if (w0Var4 != null) {
                    w0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            if (!kVar7.k0 && (yVar = znVar.k0) != null) {
                yVar.f((!znVar.I9 || znVar.H9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = znVar.e0;
            if (w0Var5 != null) {
                TLRPC.UserFull userFull = znVar.X7;
                if (znVar.I9) {
                    w0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    w0Var5.K(32);
                }
            }
            znVar.C4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z13 = this.f + znVar.la >= AndroidUtilities.dp(20.0f);
        if (this.u0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (znVar.ma > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            znVar.la = znVar.ma;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            znVar.la = znVar.V.t0() ? znVar.V.getEmojiPadding() : 0;
        } else {
            znVar.la = 0;
        }
        setEmojiKeyboardHeight(znVar.la);
        boolean z14 = this.f + znVar.la >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z13 != z14) {
            for (int i16 = 0; i16 < znVar.u0.getChildCount(); i16++) {
                View childAt = znVar.u0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        znVar.u0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            znVar.w0.i1(R, (int) (((((znVar.u0.getMeasuredHeight() - znVar.p9) - znVar.xa) + ((this.f + znVar.la) - r1)) - (z14 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(znVar.C9()))) / 2.0f), false);
                            znVar.x0.m(R);
                            this.E.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(znVar.V, makeMeasureSpec, 0, i11, 0);
                            z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
                            if (!z4 || znVar.La) {
                                this.t0 = 0;
                            } else {
                                this.t0 = znVar.V.getMeasuredHeight();
                            }
                            znVar.wa = 0;
                            znVar.xa = 0;
                            if (SharedConfig.chatBlurEnabled() && !znVar.La && znVar.C != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = znVar.D;
                                znVar.wa = i18;
                                znVar.xa = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != znVar.V) {
                                    kVar4 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                                    if (childAt2 != kVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == znVar.u0 || childAt2 == znVar.s0 || (childAt2 instanceof org.telegram.ui.Cells.x9)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), znVar.wa + size2 + znVar.xa), TLObject.FLAG_30));
                                            } else if (childAt2 == znVar.M) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.t0;
                                                z11 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((znVar.V.z0() ? 48 : 0) + 2) + (i20 - (z11 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == znVar.Y2) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                znVar.Y2.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) znVar.qc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == znVar.Z2) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) znVar.qc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == znVar.N0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (znVar.V.u0(childAt2)) {
                                                org.telegram.ui.Components.rf rfVar = znVar.V.D1;
                                                if (childAt2 == rfVar && rfVar != null) {
                                                    i19 = rfVar.getKeyboardHeight();
                                                }
                                                z10 = ((org.telegram.ui.ActionBar.p2) znVar).inBubbleMode;
                                                if (z10) {
                                                    int paddingTop2 = getPaddingTop() + (i17 - this.t0) + measuredHeight;
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else if (AndroidUtilities.isInMultiwindow) {
                                                    int paddingTop3 = getPaddingTop() + (((i17 - this.t0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                    if (i19 < 0) {
                                                        i19 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                    }
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                }
                                            } else {
                                                dk dkVar = znVar.F1;
                                                if (childAt2 == dkVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dkVar.getLayoutParams();
                                                    tf.u0 adapter = znVar.F1.getAdapter();
                                                    if (adapter.t0 == null || adapter.e0) {
                                                        znVar.F1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        znVar.F1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == znVar.Z8.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + znVar.wa;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || znVar.La) {
                                                        sm smVar = znVar.Z8;
                                                        smVar.e0 = 0;
                                                        smVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        sm smVar2 = znVar.Z8;
                                                        smVar2.e0 = keyboardHeight;
                                                        smVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.xb0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == znVar.O1) {
                                                    kVar5 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                                                    if (kVar5.getVisibility() == 0) {
                                                        kVar6 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
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
                            if (znVar.B4) {
                                znVar.C4 = true;
                                znVar.o9();
                                znVar.r9();
                                znVar.B4 = false;
                                sj sjVar = znVar.u0;
                                sjVar.measure(View.MeasureSpec.makeMeasureSpec(sjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(znVar.u0.getMeasuredHeight(), TLObject.FLAG_30));
                                znVar.C4 = false;
                            }
                            i13 = znVar.u4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ah.b(this, i13, 22));
                                znVar.u4 = -1;
                            }
                            icVar = org.telegram.ui.Components.ic.w;
                            if (icVar != null && znVar.Wb != null) {
                                icVar.l();
                            }
                            znVar.S6();
                            this.u0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.re reVar = znVar.V.U3;
        AndroidUtilities.cancelRunOnUIThread(reVar);
        reVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(znVar.V, makeMeasureSpec, 0, i11, 0);
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        if (z4) {
        }
        this.t0 = 0;
        znVar.wa = 0;
        znVar.xa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = znVar.D;
            znVar.wa = i182;
            znVar.xa = i182;
        }
        while (i12 < childCount) {
        }
        if (znVar.B4) {
        }
        i13 = znVar.u4;
        if (i13 != -1) {
        }
        icVar = org.telegram.ui.Components.ic.w;
        if (icVar != null) {
            icVar.l();
        }
        znVar.S6();
        this.u0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        zn znVar = this.G0;
        tg.c.c(znVar.w8, znVar.fragmentView);
        znVar.x8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G0.C4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        zn znVar = this.G0;
        znVar.s9 = i11;
        znVar.o9();
        znVar.r9();
    }

    @Override // org.telegram.ui.Components.qv0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.qv0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
    }
}
