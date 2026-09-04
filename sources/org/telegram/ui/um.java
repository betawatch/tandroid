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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class um extends org.telegram.ui.Components.ov0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final /* synthetic */ co J0;
    public int w0;
    public int x0;
    public int y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um(co coVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = coVar;
        this.w0 = 0;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new tm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.J0;
        coVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        kVar.setTranslationY(0.0f);
        dl dlVar = coVar.bb;
        if (dlVar != null) {
            dlVar.setTranslationY(coVar.o1 != null ? r3.getCurrentHeight() : 0);
        }
        di.f4 f4Var = coVar.w1;
        if (f4Var != null) {
            f4Var.setTranslationY(0.0f);
        }
        di.f4 f4Var2 = coVar.v1;
        if (f4Var2 != null) {
            f4Var2.setTranslationY(0.0f);
        }
        coVar.Q0.setTranslationY(0.0f);
        coVar.P.setTranslationY(0.0f);
        coVar.w9 = 0.0f;
        coVar.x9 = 0.0f;
        coVar.X0.setBackgroundTranslation(0);
        gl glVar = coVar.b3;
        if (glVar != null) {
            glVar.t0 = 0.0f;
            glVar.s();
        }
        di.r6 r6Var = coVar.y2;
        if (r6Var != null) {
            org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.b;
            faVar.u = 0.0f;
            faVar.d.invalidate();
        }
        coVar.setFragmentPanTranslationOffset(0);
        coVar.o9();
    }

    @Override // org.telegram.ui.Components.ov0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.ov0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ov0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.dc0) {
            ((org.telegram.ui.Components.dc0) drawable).p();
        }
        co coVar = this.J0;
        gh.a c10 = coVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(coVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(coVar.W.a(c10));
        coVar.Db = computePerceivedBrightness <= 0.721f;
        coVar.Eb = computePerceivedBrightness2 <= 0.9f;
        coVar.L.a = c10;
        kh.f fVar = coVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        ih.g gVar = coVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        coVar.n9();
        coVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.t1 t1Var, int i10) {
        int save = canvas.save();
        co coVar = this.J0;
        float x10 = t1Var.getX() + coVar.x0.getLeft();
        float y3 = t1Var.getY() + coVar.x0.getY() + t1Var.getPaddingTop();
        float alpha = t1Var.a() ? t1Var.getAlpha() : 1.0f;
        canvas.clipRect(coVar.x0.getLeft(), f7, coVar.x0.getRight(), ((((coVar.x0.getY() + coVar.x0.getMeasuredHeight()) - coVar.Aa) - coVar.v.d()) - coVar.sc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && coVar.M8 != null)) {
            float f10 = (coVar.H8 * coVar.K8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, coVar.M8, f10, coVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            t1Var.i2(this, canvas, coVar.N8, coVar.M8, f10);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.sg sgVar;
        co coVar = this.J0;
        bh.b bVar = coVar.J;
        mk mkVar = coVar.Y;
        if (mkVar == null || view != mkVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            kh.f fVar = coVar.X;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        mk mkVar2 = coVar.Y;
        if (mkVar2 != null && view == mkVar2.m0) {
            fi.y yVar = (fi.y) view;
            yVar.setBackgroundDrawable(bVar.c(yVar.c, coVar.x, false));
        }
        mk mkVar3 = coVar.Y;
        if (mkVar3 == null || view != (sgVar = mkVar3.N1)) {
            return;
        }
        sgVar.setBlurredBackgroundFactory(bVar);
    }

    public final boolean b0(View view) {
        if (view == this.L) {
            return true;
        }
        co coVar = this.J0;
        return view == coVar.y2 || view == coVar.q1 || view == coVar.m9 || view == coVar.X || view == coVar.K3;
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
    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
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
        um umVar;
        float f10;
        View view3;
        org.telegram.ui.Components.oa0 oa0Var;
        org.telegram.ui.Components.oa0 oa0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        ym ymVar;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        ym ymVar2;
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
        ym ymVar3;
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
        qh.i iVar;
        Integer num4;
        float f14;
        float f15;
        boolean z10;
        ym ymVar4;
        ym ymVar5;
        org.telegram.ui.Components.oa0 oa0Var3;
        float f16;
        float f17;
        ym ymVar6;
        ym ymVar7;
        ym ymVar8;
        ym ymVar9;
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
        ym ymVar10;
        ym ymVar11;
        Integer num7;
        ym ymVar12;
        ym ymVar13;
        Integer num8;
        um umVar2;
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
        ym ymVar14;
        ym ymVar15;
        Integer num9;
        ym ymVar16;
        ym ymVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f38;
        Integer num11;
        ym ymVar18;
        ym ymVar19;
        Integer num12;
        org.telegram.ui.Components.of ofVar;
        org.telegram.ui.Components.oa0 oa0Var4;
        org.telegram.ui.Components.oa0 oa0Var5;
        org.telegram.ui.Cells.t1 t1Var3;
        float f39;
        ym ymVar20;
        org.telegram.ui.Cells.t1 t1Var4;
        boolean z11;
        org.telegram.ui.Components.oa0 oa0Var6;
        float f40;
        org.telegram.ui.Components.oa0 oa0Var7;
        float f41;
        ym ymVar21;
        org.telegram.ui.Components.oa0 oa0Var8;
        org.telegram.ui.Components.oa0 oa0Var9;
        ym ymVar22;
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
        um umVar3 = this;
        co coVar = umVar3.J0;
        qh.i iVar2 = coVar.v;
        ArrayList arrayList7 = coVar.n6;
        coVar.Y.T1();
        coVar.jc();
        if (coVar.ra || ((wjVar = coVar.y0) != null && wjVar.k())) {
            coVar.ra = false;
            coVar.uc();
        }
        coVar.Mc(false, false);
        coVar.wc();
        ij ijVar2 = coVar.g2;
        if (ijVar2 != null && ijVar2.getTag() != null && (view26 = (ijVar = coVar.g2).e) != null) {
            ijVar.g(view26);
        }
        org.telegram.ui.Components.i40 i40Var2 = coVar.i2;
        if (i40Var2 != null && i40Var2.getTag() != null && (view25 = (i40Var = coVar.i2).e) != null) {
            i40Var.g(view25);
        }
        if (coVar.ka) {
            kVar10 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), umVar3.getMeasuredWidth(), umVar3.getMeasuredHeight(), (int) (coVar.la * 255.0f), 31);
            float f53 = (coVar.la * 0.2f) + 0.8f;
            canvas2.scale(f53, f53, umVar3.getMeasuredWidth() / 2.0f, umVar3.getMeasuredHeight() / 2.0f);
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
                kVar7 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    yk ykVar = coVar.o1;
                    int currentHeight = measuredHeight + (ykVar != null ? ykVar.getCurrentHeight() : 0);
                    kk kkVar = coVar.p1;
                    int currentHeight2 = currentHeight + (kkVar != null ? kkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
                    i13 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + coVar.t9, umVar3.getWidth(), umVar3.getHeight());
                ImageReceiver photoImage = t1Var5.getPhotoImage();
                t1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((coVar.Y.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) com.google.android.gms.internal.vision.e2.b(1.0f, sendAnimationData.progress, t1Var5.getTranslationY(), r9[1])));
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
        num = coVar.M8;
        if (num != null) {
            view24 = coVar.J8;
        }
        paint = coVar.D8;
        if (paint != null) {
            matrix = coVar.E8;
            matrix.reset();
            float measuredWidth = umVar3.getMeasuredWidth() / coVar.B8.getWidth();
            matrix2 = coVar.E8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = coVar.C8;
            matrix3 = coVar.E8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = coVar.D8;
            paint5.setAlpha((int) (coVar.L8 * 255.0f));
            paint6 = coVar.D8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = umVar3.getMeasuredWidth();
                float measuredHeight2 = umVar3.getMeasuredHeight();
                paint7 = coVar.D8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = coVar.F8;
            f7 = coVar.H8;
            float f55 = f7 * 255.0f;
            view = coVar.J8;
            paint2.setAlpha((int) (f55 * (view != null ? coVar.K8 : 1.0f)));
            paint3 = coVar.F8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = umVar3.getMeasuredWidth();
                float measuredHeight3 = umVar3.getMeasuredHeight();
                paint4 = coVar.F8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = coVar.M8;
        if (num2 != null && coVar.O8) {
            umVar3.invalidate();
        }
        view2 = coVar.J8;
        if (view2 != null) {
            view4 = coVar.J8;
            if (view4 == coVar.j1) {
                f50 = coVar.K8;
                if (f50 < 1.0f) {
                    paint30 = coVar.F8;
                    f51 = coVar.H8;
                    f52 = coVar.K8;
                    paint30.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                    float measuredWidth4 = umVar3.getMeasuredWidth();
                    float measuredHeight4 = umVar3.getMeasuredHeight();
                    paint31 = coVar.F8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = coVar.J8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f42 = coVar.K8;
                    if (f42 < 1.0f) {
                        view20 = coVar.J8;
                        float left = view20.getLeft();
                        view21 = coVar.J8;
                        float top = view21.getTop();
                        view22 = coVar.J8;
                        float right = view22.getRight();
                        view23 = coVar.J8;
                        float bottom = view23.getBottom();
                        f46 = coVar.K8;
                        int i15 = (int) (f46 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = coVar.J8;
                    float left2 = view12.getLeft();
                    view13 = coVar.J8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = coVar.J8;
                    kVar6 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = coVar.J8;
                        float x10 = view16.getX();
                        view17 = coVar.J8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = coVar.J8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = coVar.J8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, coVar.G8);
                    }
                    view15 = coVar.J8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f43 = coVar.K8;
                    if (f43 < 1.0f) {
                        paint23 = coVar.F8;
                        f44 = coVar.H8;
                        f45 = coVar.K8;
                        paint23.setAlpha((int) ((1.0f - f45) * f44 * 255.0f));
                        float measuredWidth6 = umVar3.getMeasuredWidth();
                        float measuredHeight6 = umVar3.getMeasuredHeight();
                        paint24 = coVar.F8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    ymVar = coVar.x0;
                    float y3 = ((ymVar.getY() + coVar.s9) - coVar.u9) - AndroidUtilities.dp(4.0f);
                    view6 = coVar.J8;
                    if (view6 instanceof org.telegram.ui.Cells.t1) {
                        view11 = coVar.J8;
                        groupedMessages = ((org.telegram.ui.Cells.t1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    ymVar2 = coVar.x0;
                    int childCount = ymVar2.getChildCount();
                    int i16 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = umVar3.B0;
                        f10 = 20.0f;
                        arrayList2 = umVar3.A0;
                        arrayList3 = umVar3.z0;
                        arrayList4 = umVar3.C0;
                        if (i16 >= childCount) {
                            break;
                        }
                        ymVar3 = coVar.x0;
                        View childAt = ymVar3.getChildAt(i16);
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
                        view7 = coVar.J8;
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
                                float dp = f61 < (coVar.s9 - ((float) coVar.u9)) - ((float) AndroidUtilities.dp(20.0f)) ? (coVar.s9 - coVar.u9) - AndroidUtilities.dp(20.0f) : f61;
                                ymVar20 = coVar.x0;
                                if (f60 > AndroidUtilities.dp(20.0f) + ymVar20.getMeasuredHeight()) {
                                    ymVar22 = coVar.x0;
                                    f60 = AndroidUtilities.dp(20.0f) + ymVar22.getMeasuredHeight();
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
                                    if (coVar.W5[messageObject.getDialogId() == coVar.T5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
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
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - coVar.sc) - AndroidUtilities.dp(9.0f);
                                oa0Var6 = coVar.I1;
                                if (oa0Var6 != null) {
                                    oa0Var9 = coVar.I1;
                                    f40 = oa0Var9.d();
                                } else {
                                    f40 = 0.0f;
                                }
                                float f62 = measuredHeight7 - f40;
                                oa0Var7 = coVar.I1;
                                if (oa0Var7 != null) {
                                    oa0Var8 = coVar.I1;
                                    f41 = oa0Var8.e();
                                } else {
                                    f41 = 0.0f;
                                }
                                org.telegram.ui.Cells.t1 t1Var6 = t1Var4;
                                canvas3.clipRect(0.0f, f56 + f41, getMeasuredWidth(), f62);
                                ymVar21 = coVar.x0;
                                canvas3.translate(0.0f, ymVar21.getY());
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
                            ymVar4 = coVar.x0;
                            float left3 = ymVar4.getLeft();
                            ymVar5 = coVar.x0;
                            float right2 = ymVar5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - coVar.sc) - coVar.W8(org.telegram.ui.Components.s21.c)) - AndroidUtilities.dp(f14);
                            oa0Var3 = coVar.I1;
                            if (oa0Var3 != null) {
                                oa0Var4 = coVar.I1;
                                float max = Math.max(0.0f, oa0Var4.e());
                                oa0Var5 = coVar.I1;
                                f17 = Math.max(0.0f, oa0Var5.d());
                                f16 = max;
                            } else {
                                f16 = 0.0f;
                                f17 = 0.0f;
                            }
                            mk mkVar = coVar.Y;
                            if (mkVar != null && (ofVar = mkVar.m0) != null) {
                                f17 = Math.max(f17, ofVar.f ? 0.0f : Math.max(0.0f, ofVar.getMeasuredHeight() - (ofVar.c.getTranslationY() + ofVar.e)));
                            }
                            float f63 = f56 + f16;
                            float f64 = measuredHeight8 - f17;
                            if (t1Var2 == null || !t1Var2.getTransitionParams().w0) {
                                ymVar6 = coVar.x0;
                                left3 = Math.max(left3, view8.getX() + ymVar6.getLeft());
                                ymVar7 = coVar.x0;
                                f63 = Math.max(f63, view8.getY() + ymVar7.getY());
                                ymVar8 = coVar.x0;
                                right2 = Math.min(right2, view8.getX() + ymVar8.getLeft() + view8.getMeasuredWidth());
                                ymVar9 = coVar.x0;
                                f64 = Math.min(f64, view8.getY() + ymVar9.getY() + view8.getMeasuredHeight());
                            }
                            float f65 = f64;
                            float f66 = f63;
                            float f67 = right2;
                            float max2 = Math.max(left3, coVar.R8());
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
                                    num12 = coVar.M8;
                                    t1Var2.setScrimReaction(num12);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(true);
                                    num11 = coVar.M8;
                                    w0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f20, f38, f21, f19);
                                ymVar18 = coVar.x0;
                                float x11 = view8.getX() + ymVar18.getLeft();
                                ymVar19 = coVar.x0;
                                canvas4.translate(x11, view8.getY() + ymVar19.getY());
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
                                    w0Var.A(canvas4);
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
                            num5 = coVar.M8;
                            if (num5 == null || t1Var2 == null || groupedMessages3 != null) {
                                float f68 = f21;
                                float f69 = f20;
                                View view27 = view9;
                                float f70 = f19;
                                float f71 = f18;
                                f22 = f56;
                                num6 = coVar.M8;
                                if (num6 != null && w0Var != null) {
                                    paint13 = coVar.D8;
                                    if (paint13 != null) {
                                        matrix7 = coVar.E8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / coVar.B8.getWidth();
                                        matrix8 = coVar.E8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = coVar.C8;
                                        matrix9 = coVar.E8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = coVar.D8;
                                        paint16.setAlpha((int) (coVar.L8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = coVar.D8;
                                        w0Var2 = w0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint14 = coVar.F8;
                                        f23 = coVar.H8;
                                        f24 = coVar.K8;
                                        paint14.setAlpha((int) (f24 * f23 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = coVar.F8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f66 < f65) {
                                        f25 = coVar.H8;
                                        f26 = coVar.K8;
                                        float f72 = (f26 * f25) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f27 = coVar.K8;
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
                                        ymVar10 = coVar.x0;
                                        float x12 = view27.getX() + ymVar10.getLeft();
                                        ymVar11 = coVar.x0;
                                        canvas3.translate(x12, view27.getY() + ymVar11.getY() + view27.getPaddingTop());
                                        num7 = coVar.M8;
                                        boolean z14 = coVar.I8;
                                        ah.k1 k1Var = w0Var2.C0;
                                        if (!k1Var.b) {
                                            org.telegram.ui.ActionBar.f6 f6Var = w0Var2.Y0;
                                            if (f6Var != null) {
                                                f6Var.l(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.j6.q(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            }
                                            k1Var.D = f72;
                                            k1Var.E = z14;
                                            k1Var.d(canvas3, w0Var2.i2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        ymVar12 = coVar.x0;
                                        float x13 = view27.getX() + ymVar12.getLeft();
                                        ymVar13 = coVar.x0;
                                        canvas3.translate(x13, view27.getY() + ymVar13.getY() + view27.getPaddingTop());
                                        int i20 = coVar.N8;
                                        num8 = coVar.M8;
                                        w0Var2.D(this, canvas3, i20, num8, f72);
                                        umVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = coVar.D8;
                                if (paint18 != null) {
                                    matrix10 = coVar.E8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / coVar.B8.getWidth();
                                    matrix11 = coVar.E8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = coVar.C8;
                                    matrix12 = coVar.E8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = coVar.D8;
                                    paint21.setAlpha((int) (coVar.L8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = coVar.D8;
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    paint19 = coVar.F8;
                                    f31 = coVar.H8;
                                    f32 = coVar.K8;
                                    paint19.setAlpha((int) (f32 * f31 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = coVar.F8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f66 < f65) {
                                    f33 = coVar.H8;
                                    f34 = coVar.K8;
                                    float f74 = (f34 * f33) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f35 = coVar.K8;
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
                                    ymVar14 = coVar.x0;
                                    float x14 = view10.getX() + ymVar14.getLeft();
                                    ymVar15 = coVar.x0;
                                    canvas5.translate(x14, view10.getY() + ymVar15.getY() + view10.getPaddingTop());
                                    num9 = coVar.M8;
                                    t1Var2.h2(canvas5, num9, f74, coVar.I8);
                                    canvas5.restore();
                                    canvas5.save();
                                    ymVar16 = coVar.x0;
                                    float x15 = view10.getX() + ymVar16.getLeft();
                                    ymVar17 = coVar.x0;
                                    canvas5.translate(x15, view10.getY() + ymVar17.getY() + view10.getPaddingTop());
                                    int i21 = coVar.N8;
                                    num10 = coVar.M8;
                                    f22 = f56;
                                    t1Var2.i2(this, canvas5, i21, num10, f74);
                                    canvas.restore();
                                } else {
                                    f22 = f56;
                                }
                            }
                            umVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f22 = f56;
                            umVar2 = this;
                        }
                        i16 = i12 + 1;
                        umVar3 = umVar2;
                        y3 = f22;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    umVar = umVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f11 = 1.0f;
                    float f77 = y3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            umVar.a0(canvas3, f77, (org.telegram.ui.Cells.t1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            umVar.a0(canvas3, f77, (org.telegram.ui.Cells.t1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList.get(i24);
                            if (t1Var7.getCurrentPosition() != null || t1Var7.getTransitionParams().w0) {
                                umVar.a0(canvas3, f77, t1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList4.get(i25);
                            if (t1Var8.getCurrentPosition() != null || t1Var8.getTransitionParams().w0) {
                                umVar.a0(canvas3, f77, t1Var8, 3);
                            }
                        }
                    }
                    num3 = coVar.M8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = coVar.D8;
                        if (paint8 != null) {
                            matrix4 = coVar.E8;
                            matrix4.reset();
                            float measuredWidth13 = umVar.getMeasuredWidth() / coVar.B8.getWidth();
                            matrix5 = coVar.E8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = coVar.C8;
                            matrix6 = coVar.E8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = coVar.D8;
                            paint11.setAlpha((int) (coVar.L8 * 255.0f));
                            float measuredWidth14 = umVar.getMeasuredWidth();
                            float measuredHeight13 = umVar.getMeasuredHeight();
                            paint12 = coVar.D8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = coVar.F8;
                            f12 = coVar.H8;
                            f13 = coVar.K8;
                            paint9.setAlpha((int) (f13 * f12 * 255.0f));
                            float measuredWidth15 = umVar.getMeasuredWidth();
                            float measuredHeight14 = umVar.getMeasuredHeight();
                            paint10 = coVar.F8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.t1 t1Var9 = (org.telegram.ui.Cells.t1) arrayList4.get(i26);
                            if (t1Var9.getCurrentPosition() != null || t1Var9.getTransitionParams().w0) {
                                umVar.a0(canvas3, f77, t1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = coVar.M8;
                    if (num13 == null) {
                        f47 = coVar.K8;
                        if (f47 < f11) {
                            paint25 = coVar.D8;
                            if (paint25 != null) {
                                matrix13 = coVar.E8;
                                matrix13.reset();
                                float measuredWidth16 = umVar.getMeasuredWidth() / coVar.B8.getWidth();
                                matrix14 = coVar.E8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = coVar.C8;
                                matrix15 = coVar.E8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = coVar.D8;
                                paint28.setAlpha((int) (coVar.L8 * 255.0f));
                                float measuredWidth17 = umVar.getMeasuredWidth();
                                float measuredHeight15 = umVar.getMeasuredHeight();
                                paint29 = coVar.D8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = coVar.F8;
                                f48 = coVar.H8;
                                f49 = coVar.K8;
                                paint26.setAlpha((int) ((f11 - f49) * f48 * 255.0f));
                                float measuredWidth18 = umVar.getMeasuredWidth();
                                float measuredHeight16 = umVar.getMeasuredHeight();
                                paint27 = coVar.F8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            umVar = umVar3;
            f10 = 20.0f;
            f11 = 1.0f;
            num13 = coVar.M8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            umVar = umVar3;
            f10 = 20.0f;
        }
        view3 = coVar.J8;
        if (view3 != null || ((ArrayList) coVar.M9.c).size() > 0) {
            oa0Var = coVar.I1;
            if (oa0Var != null) {
                oa0Var2 = coVar.I1;
            }
            super.drawChild(canvas3, coVar.j1, SystemClock.uptimeMillis());
            dk dkVar = coVar.X2;
            if (dkVar != null && dkVar.getTag() != null) {
                super.drawChild(canvas3, coVar.X2, SystemClock.uptimeMillis());
            }
            ck ckVar = coVar.Y2;
            if (ckVar != null && ckVar.getTag() != null) {
                super.drawChild(canvas3, coVar.Y2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.r00 r00Var = coVar.m9;
            if (r00Var != null) {
                super.drawChild(canvas3, r00Var, SystemClock.uptimeMillis());
            }
            vh.i iVar3 = coVar.X9;
            if (iVar3 != null) {
                super.drawChild(canvas3, iVar3, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.i40 i40Var3 = coVar.e2;
            if (i40Var3 != null) {
                super.drawChild(canvas3, i40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = coVar.y3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, coVar.y3, SystemClock.uptimeMillis());
            }
            jl jlVar = coVar.z3;
            if (jlVar != null && jlVar.getVisibility() == 0) {
                super.drawChild(canvas3, coVar.z3, SystemClock.uptimeMillis());
            }
            di.f4 f4Var = coVar.x1;
            if (f4Var != null && f4Var.getVisibility() == 0) {
                super.drawChild(canvas3, coVar.x1, SystemClock.uptimeMillis());
            }
            yl ylVar = coVar.B1;
            if (ylVar != null && ylVar.getVisibility() == 0) {
                super.drawChild(canvas3, coVar.B1, SystemClock.uptimeMillis());
            }
            di.f4 f4Var2 = coVar.z1;
            if (f4Var2 != null && f4Var2.getVisibility() == 0) {
                super.drawChild(canvas3, coVar.z1, SystemClock.uptimeMillis());
            }
            mk mkVar2 = coVar.Y;
            if (mkVar2 != null && mkVar2.L != null) {
                canvas3.save();
                canvas3.translate(coVar.Y.L.getX() + coVar.Y.getX(), coVar.Y.L.getY() + coVar.Y.getY());
                coVar.Y.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (coVar.pa > 0 && umVar.f < AndroidUtilities.dp(f10)) {
            int themedColor = coVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            if (umVar.D0 == null) {
                umVar.D0 = new Paint();
            }
            if (umVar.E0 != themedColor) {
                Paint paint32 = umVar.D0;
                umVar.E0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, umVar.getMeasuredHeight() - coVar.pa, umVar.getMeasuredWidth(), umVar.getMeasuredHeight(), umVar.D0);
            canvas3 = canvas6;
        }
        aq aqVar = coVar.P9;
        if (aqVar != null && aqVar.e()) {
            int inputBubbleTop = (int) coVar.S.getInputBubbleTop();
            int inputBubbleBottom = (int) coVar.S.getInputBubbleBottom();
            co coVar2 = coVar.T9;
            int i27 = inputBubbleTop - ((int) (coVar.U9 * (coVar2 == null ? 0.0f : coVar2.O9)));
            aq aqVar2 = coVar.P9;
            umVar.getMeasuredWidth();
            aqVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (coVar.T9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, umVar.getMeasuredWidth(), umVar.getMeasuredHeight(), (int) (coVar.U9 * 255.0f), 31);
            canvas3 = canvas;
            coVar.T9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        coVar.xa.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (coVar.ka) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (coVar.la * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
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
        co coVar = this.J0;
        ih.e eVar = coVar.N3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || coVar.isInBubbleMode()) ? (coVar.Y.getEmojiView() != null ? coVar.Y.getEmojiView() : coVar.Y).getY() : coVar.Y.getY();
        View view = coVar.J8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        }
        mk mkVar = coVar.Y;
        if (mkVar == null || !mkVar.y3 || motionEvent.getY() >= y3) {
            coVar.j9 = motionEvent.getY();
            org.telegram.ui.Cells.ca o9 = coVar.c9.o(getContext());
            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
            if (!coVar.c9.y() || !coVar.c9.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o9.getX(), o9.getY());
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                di.i1 i1Var = coVar.q1;
                if (i1Var != null) {
                    if (coVar.u3 != null) {
                        z10 = i1Var.A(motionEvent);
                        if (coVar.q1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !coVar.c9.y() || (motionEvent.getY() >= coVar.x0.getTop() && motionEvent.getY() <= coVar.x0.getBottom())) {
                            vkVar = coVar.wa;
                            if (!vkVar.n) {
                                return vkVar.g(motionEvent);
                            }
                            com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
                            if (mVar == null || !mVar.a) {
                                if (coVar.isInPreviewMode() && coVar.J9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (coVar.j1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                aa.a aVar = coVar.j1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
                                                if (aVar != null) {
                                                    ((jh.b) aVar.b).getLocationInWindow(iArr2);
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
                                        pj pjVar = coVar.a1;
                                        if (pjVar != null) {
                                            pjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], coVar.a1.getMeasuredWidth() + i13, coVar.a1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.F0 = motionEvent.getX();
                                                    this.G0 = motionEvent.getY();
                                                    this.H0 = SystemClock.elapsedRealtime();
                                                    this.I0 = z12;
                                                    pj pjVar2 = coVar.a1;
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
                                        pj pjVar3 = coVar.a1;
                                        if (pjVar3 != null) {
                                            pjVar3.h0.c(false);
                                        }
                                        if (this.I0 || (v7.z6.a(this.F0, this.G0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.H0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.I0) {
                                                d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                                                coVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) d5Var2).P(ProfileActivity.m4(coVar.T5));
                                            } else {
                                                d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
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
                                s4 s4Var = (s4) com.google.firebase.messaging.m.k().d;
                                if (s4Var != null) {
                                    s4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
                            if (coVar.c9.o(getContext()).onTouchEvent(motionEvent)) {
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
                vkVar = coVar.wa;
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
        di.r6 r6Var;
        org.telegram.ui.ActionBar.k kVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        qk qkVar;
        MessageObject messageObject;
        gl glVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        co coVar = this.J0;
        boolean z12 = false;
        if ((coVar.J8 == null && ((ArrayList) coVar.M9.c).size() <= 0) || (view != coVar.j1 && view != coVar.X2 && view != coVar.Y2 && view != coVar.m9 && view != coVar.X9 && view != coVar.e2 && view != null && view != coVar.y3 && view != coVar.z3)) {
            if ((view != coVar.y3 || !PhotoViewer.t1().Q1()) && (!coVar.S9 || view != coVar.x0)) {
                if (coVar.ka) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                }
                if (view != coVar.b3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (r6Var = coVar.y2) != null && r6Var.a() && coVar.y2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == coVar.t8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    } else {
                        if (view != coVar.x0) {
                            if (view != coVar.S) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == coVar.t8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-coVar.N9) - (coVar.U9 != 0.0f ? (coVar.x0.getMeasuredHeight() - coVar.N9) * coVar.U9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.j6.k3 != null && coVar.v8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(coVar.t8.getScaleX(), coVar.t8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.j6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.j6.k3.setBounds(x10, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(coVar.C9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(coVar.C9()) + y3);
                                            org.telegram.ui.ActionBar.j6.k3.draw(canvas);
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
                                if (view == coVar.S && (glVar = coVar.b3) != null && glVar.getVisibility() == 0) {
                                    super.drawChild(canvas, coVar.b3, j3);
                                }
                                z12 = super.drawChild(canvas, view, j3);
                                if (z11 && view == coVar.x0 && playingMessageObject.type != 5 && (qkVar = coVar.t8) != null && qkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-coVar.N9) - (coVar.U9 != 0.0f ? (coVar.x0.getMeasuredHeight() - coVar.N9) * coVar.U9 : 0.0f)) + coVar.O9);
                                    super.drawChild(canvas, coVar.t8, j3);
                                    if (coVar.u8 != null) {
                                        canvas.save();
                                        canvas.translate(coVar.u8.getX(), coVar.x0.getY() + coVar.u8.getTop());
                                        if (z10) {
                                            coVar.u8.g2(canvas);
                                            invalidate();
                                            coVar.u8.invalidate();
                                        } else {
                                            coVar.u8.Y1(canvas);
                                            org.telegram.ui.Cells.t1 t1Var = coVar.u8;
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
                        if (view == coVar.t8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.ov0
    public float getBottomOffset() {
        return this.J0.x0.getBottom();
    }

    public co getChatActivity() {
        return this.J0;
    }

    @Override // org.telegram.ui.Components.ov0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.ov0
    public int getKeyboardHeight() {
        if (this.J0.Oa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.ov0
    public float getListTranslationY() {
        return this.J0.x0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.ov0
    public Drawable getNewDrawable() {
        Drawable d = this.J0.ea.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.ov0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.ea.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.ov0
    public int getScrollOffset() {
        return this.J0.x0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        co coVar = this.J0;
        if (coVar.Oa) {
            this.H.b = coVar.X0;
        } else {
            d5Var = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                if (((ActionBarLayout) d5Var2).b) {
                    org.telegram.ui.ActionBar.p1 p1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.n2) coVar).parentLayout;
                    p1Var.b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        coVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == coVar.T5)) {
            MediaController.getInstance().setTextureView(coVar.N7(false), coVar.v8, coVar.t8, true);
        }
        aq aqVar = coVar.P9;
        if (aqVar != null) {
            aqVar.f();
        }
        coVar.xa.j();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        co coVar = this.J0;
        aq aqVar = coVar.P9;
        if (aqVar != null) {
            NotificationCenter.getInstance(aqVar.e0).removeObserver(aqVar, NotificationCenter.updateInterfaces);
            aqVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.q5 q5Var = aqVar.k0;
            if (q5Var != null && (view = aqVar.a0) != null) {
                q5Var.o(view);
            }
            aqVar.Q = 0.0f;
            aqVar.P = 0L;
            coVar.P9 = null;
        }
        coVar.xa.k();
        AndroidUtilities.runOnUIThread(new ah.j(20));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        co coVar;
        di.r6 r6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (r6Var = (coVar = this.J0).y2) == null || !r6Var.a() || coVar.y2.getTag() == null) {
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        if (r8 != r3.Cc) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        co coVar = this.J0;
        qh.i iVar = coVar.v;
        int i22 = (measuredWidth - coVar.Ua) - coVar.Va;
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
                    C = i2.g.C(i22, measuredWidth2, 2, coVar.Ua) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = coVar.Ua + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
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
                            if (childAt != coVar.M9 && childAt != coVar.X9 && childAt != coVar.S && !(childAt instanceof org.telegram.ui.Components.i40) && !(childAt instanceof org.telegram.ui.Components.pp)) {
                                if (childAt instanceof org.telegram.ui.Cells.ca) {
                                    i20 = coVar.za;
                                } else if (childAt == coVar.Q0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (coVar.Y.u0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.n2) coVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = coVar.Y.getBottom();
                                        }
                                    }
                                    i18 = coVar.Y.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    mk mkVar = coVar.Y;
                                    if (mkVar != null && (childAt == mkVar.N1 || childAt == mkVar.M1)) {
                                        i18 = org.telegram.messenger.wl.v(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == coVar.w2) {
                                        i18 = org.telegram.messenger.wl.v(7.0f, iVar.d(), i18);
                                    } else if (mkVar == null || childAt != mkVar.e1) {
                                        if (childAt == coVar.e2 || childAt == coVar.s2 || childAt == coVar.f2) {
                                            i19 = this.w0;
                                        } else if (childAt == coVar.x0 || childAt == coVar.v0 || childAt == coVar.X2 || childAt == coVar.Y2 || childAt == coVar.Z2) {
                                            i20 = coVar.za;
                                        } else if (childAt != coVar.P) {
                                            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (coVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == coVar.t8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != coVar.b3 && childAt != coVar.c3 && childAt != coVar.u0) {
                                                if (childAt instanceof org.telegram.ui.Components.wb0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != coVar.T) {
                                                    if (childAt != coVar.N3) {
                                                    }
                                                }
                                            }
                                        } else if (mkVar.z0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.wl.v(9.0f, iVar.d(), i18);
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
                    C = (measuredWidth - coVar.Va) - measuredWidth2;
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
        ck ckVar = coVar.Y2;
        if (ckVar != null) {
            ckVar.setBackgroundHeight(getMeasuredHeight());
        }
        coVar.o9();
        coVar.r9();
        coVar.Mc(false, false);
        S();
        coVar.t7();
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
        boolean z10;
        int i12;
        int i13;
        org.telegram.ui.Components.qc qcVar;
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
        co coVar = this.J0;
        qh.i iVar = coVar.v;
        coVar.Dc.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - coVar.Ua) - coVar.Va;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        gh.a aVar = coVar.L.a;
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).b(i15, size2);
        }
        if (this.y0 != i15) {
            coVar.F4 = false;
            this.y0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
            if (z13 || (user = coVar.f) == null || !user.self) {
                coVar.K9 = false;
            } else {
                org.telegram.ui.ActionBar.j5 titleTextView = coVar.a1.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    coVar.K9 = !coVar.L9;
                } else {
                    coVar.K9 = false;
                }
            }
            if (coVar.K9 || coVar.L9 || UserObject.isBotForumWithEditableTopics(coVar.f)) {
                pj pjVar = coVar.a1;
                if (pjVar != null && pjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) coVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(coVar.R3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                pj pjVar2 = coVar.a1;
                if (pjVar2 != null && pjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) coVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (coVar.K9) {
                kVar8 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                if (!kVar8.n0 && (v0Var = coVar.m0) != null) {
                    v0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var2 = coVar.h0;
                if (v0Var2 != null) {
                    v0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.v0 v0Var3 = coVar.h0;
                if (v0Var3 != null) {
                    v0Var3.K(40);
                }
                org.telegram.ui.ActionBar.v0 v0Var4 = coVar.m0;
                if (v0Var4 != null) {
                    v0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (!kVar7.n0 && (yVar = coVar.n0) != null) {
                yVar.f((!coVar.L9 || coVar.K9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = coVar.h0;
            if (v0Var5 != null) {
                TLRPC.UserFull userFull = coVar.a8;
                if (coVar.L9) {
                    v0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    v0Var5.K(32);
                }
            }
            coVar.F4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + coVar.oa >= AndroidUtilities.dp(20.0f);
        if (this.x0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (coVar.pa > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            coVar.oa = coVar.pa;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            coVar.oa = coVar.Y.t0() ? coVar.Y.getEmojiPadding() : 0;
        } else {
            coVar.oa = 0;
        }
        setEmojiKeyboardHeight(coVar.oa);
        boolean z15 = this.f + coVar.oa >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i16 = 0; i16 < coVar.x0.getChildCount(); i16++) {
                View childAt = coVar.x0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        coVar.x0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            coVar.z0.i1(R, (int) (((((coVar.x0.getMeasuredHeight() - coVar.s9) - coVar.Aa) + ((this.f + coVar.oa) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(coVar.C9()))) / 2.0f), false);
                            coVar.A0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(coVar.Y, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
                            if (!z10 || coVar.Oa) {
                                this.w0 = 0;
                            } else {
                                this.w0 = coVar.Y.getMeasuredHeight();
                            }
                            coVar.za = 0;
                            coVar.Aa = 0;
                            if (SharedConfig.chatBlurEnabled() && !coVar.Oa && coVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = coVar.G;
                                coVar.za = i18;
                                coVar.Aa = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != coVar.Y) {
                                    kVar4 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                    if (childAt2 != kVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == coVar.x0 || childAt2 == coVar.v0 || (childAt2 instanceof org.telegram.ui.Cells.ca)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), coVar.za + size2 + coVar.Aa), TLObject.FLAG_30));
                                            } else if (childAt2 == coVar.P) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.w0;
                                                z12 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((coVar.Y.z0() ? 48 : 0) + 2) + (i20 - (z12 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == coVar.b3) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                coVar.b3.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) coVar.tc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == coVar.c3) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) coVar.tc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == coVar.Q0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (coVar.Y.u0(childAt2)) {
                                                org.telegram.ui.Components.bg bgVar = coVar.Y.G1;
                                                if (childAt2 == bgVar && bgVar != null) {
                                                    i19 = bgVar.getKeyboardHeight();
                                                }
                                                z11 = ((org.telegram.ui.ActionBar.n2) coVar).inBubbleMode;
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
                                                fk fkVar = coVar.I1;
                                                if (childAt2 == fkVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fkVar.getLayoutParams();
                                                    hg.k1 adapter = coVar.I1.getAdapter();
                                                    if (adapter.w0 == null || adapter.h0) {
                                                        coVar.I1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        coVar.I1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == coVar.c9.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + coVar.za;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || coVar.Oa) {
                                                        vm vmVar = coVar.c9;
                                                        vmVar.e0 = 0;
                                                        vmVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        vm vmVar2 = coVar.c9;
                                                        vmVar2.e0 = keyboardHeight;
                                                        vmVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.wb0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == coVar.R1) {
                                                    kVar5 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                                    if (kVar5.getVisibility() == 0) {
                                                        kVar6 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
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
                            if (coVar.E4) {
                                coVar.F4 = true;
                                coVar.o9();
                                coVar.r9();
                                coVar.E4 = false;
                                uj ujVar = coVar.x0;
                                ujVar.measure(View.MeasureSpec.makeMeasureSpec(ujVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(coVar.x0.getMeasuredHeight(), TLObject.FLAG_30));
                                coVar.F4 = false;
                            }
                            i13 = coVar.x4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ah.g(this, i13, 26));
                                coVar.x4 = -1;
                            }
                            qcVar = org.telegram.ui.Components.qc.w;
                            if (qcVar != null && coVar.Zb != null) {
                                qcVar.l();
                            }
                            coVar.S6();
                            this.x0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.bf bfVar = coVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(bfVar);
        bfVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(coVar.Y, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
        if (z10) {
        }
        this.w0 = 0;
        coVar.za = 0;
        coVar.Aa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = coVar.G;
            coVar.za = i182;
            coVar.Aa = i182;
        }
        while (i12 < childCount) {
        }
        if (coVar.E4) {
        }
        i13 = coVar.x4;
        if (i13 != -1) {
        }
        qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar != null) {
            qcVar.l();
        }
        coVar.S6();
        this.x0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        co coVar = this.J0;
        hh.d.c(coVar.z8, coVar.fragmentView);
        coVar.A8.d();
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
        co coVar = this.J0;
        coVar.v9 = i11;
        coVar.o9();
        coVar.r9();
    }

    @Override // org.telegram.ui.Components.ov0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.ov0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.ov0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
