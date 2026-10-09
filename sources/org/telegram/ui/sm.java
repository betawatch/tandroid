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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sm extends org.telegram.ui.Components.sw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final /* synthetic */ zn J0;
    public int w0;
    public int x0;
    public int y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(zn znVar, Context context, org.telegram.ui.ActionBar.d5 d5Var) {
        super(context, d5Var);
        this.J0 = znVar;
        this.w0 = 0;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new rm(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.J0;
        znVar.X0.setTranslationY(f7);
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        kVar.setTranslationY(0.0f);
        el elVar = znVar.bb;
        if (elVar != null) {
            elVar.setTranslationY(znVar.o1 != null ? r3.getCurrentHeight() : 0);
        }
        ci.d4 d4Var = znVar.w1;
        if (d4Var != null) {
            d4Var.setTranslationY(0.0f);
        }
        ci.d4 d4Var2 = znVar.v1;
        if (d4Var2 != null) {
            d4Var2.setTranslationY(0.0f);
        }
        znVar.Q0.setTranslationY(0.0f);
        znVar.P.setTranslationY(0.0f);
        znVar.w9 = 0.0f;
        znVar.x9 = 0.0f;
        znVar.X0.setBackgroundTranslation(0);
        org.telegram.ui.Components.y60 y60Var = znVar.b3;
        if (y60Var != null) {
            y60Var.e(0.0f);
        }
        ci.r6 r6Var = znVar.y2;
        if (r6Var != null) {
            org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) r6Var.b;
            iaVar.u = 0.0f;
            iaVar.d.invalidate();
        }
        znVar.setFragmentPanTranslationOffset(0);
        znVar.t9();
    }

    @Override // org.telegram.ui.Components.sw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.sw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.sw0
    public final int R() {
        ai.h4 h4Var = this.J0.J1;
        if (h4Var == null || !h4Var.isShowing()) {
            return super.R();
        }
        this.f = 0;
        return 0;
    }

    @Override // org.telegram.ui.Components.sw0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.cd0) {
            ((org.telegram.ui.Components.cd0) drawable).p();
        }
        zn znVar = this.J0;
        fh.a c10 = znVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(znVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(znVar.W.a(c10));
        znVar.Db = computePerceivedBrightness <= 0.721f;
        znVar.Eb = computePerceivedBrightness2 <= 0.9f;
        znVar.L.a = c10;
        jh.f fVar = znVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        hh.f fVar2 = znVar.S;
        if (fVar2 != null) {
            fVar2.invalidate();
        }
        znVar.s9();
        znVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.u1 u1Var, int i10) {
        int save = canvas.save();
        zn znVar = this.J0;
        float x10 = u1Var.getX() + znVar.x0.getLeft();
        float y3 = u1Var.getY() + znVar.x0.getY() + u1Var.getPaddingTop();
        float alpha = u1Var.a() ? u1Var.getAlpha() : 1.0f;
        canvas.clipRect(znVar.x0.getLeft(), f7, znVar.x0.getRight(), ((((znVar.x0.getY() + znVar.x0.getMeasuredHeight()) - znVar.Ba) - znVar.v.e()) - znVar.sc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((u1Var.getCurrentPosition() == null || (1 & u1Var.getCurrentPosition().flags) != 0) && znVar.M8 != null)) {
            float f10 = (znVar.H8 * znVar.K8) / 0.2f;
            canvas.save();
            u1Var.h2(canvas, znVar.M8, f10, znVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            u1Var.i2(this, canvas, znVar.N8, znVar.M8, f10);
            canvas.restore();
        }
        u1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ug ugVar;
        zn znVar = this.J0;
        ah.c cVar = znVar.J;
        ok okVar = znVar.Y;
        if (okVar == null || view != okVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            jh.f fVar = znVar.X;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        ok okVar2 = znVar.Y;
        if (okVar2 != null && view == okVar2.m0) {
            ei.y yVar = (ei.y) view;
            yVar.setBackgroundDrawable(cVar.c(yVar.c, znVar.x, false));
        }
        ok okVar3 = znVar.Y;
        if (okVar3 == null || view != (ugVar = okVar3.O1)) {
            return;
        }
        ugVar.setBlurredBackgroundFactory(cVar);
    }

    public final boolean b0(View view) {
        if (view == this.L) {
            return true;
        }
        zn znVar = this.J0;
        return view == znVar.y2 || view == znVar.q1 || view == znVar.m9 || view == znVar.X || view == znVar.K3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0c1a, code lost:
    
        if (r0.getVisibility() != 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x077f, code lost:
    
        if ((r5 & 1) != 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0b71  */
    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        float f7;
        float f10;
        int i11;
        Integer num;
        Paint paint;
        Paint paint2;
        float f11;
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
        sm smVar;
        float f12;
        float f13;
        View view3;
        org.telegram.ui.Components.pb0 pb0Var;
        org.telegram.ui.Components.pb0 pb0Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        View view4;
        View view5;
        ai.g7 g7Var;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        ai.g7 g7Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        float f14;
        ArrayList arrayList4;
        float f15;
        int i12;
        Integer num3;
        Paint paint8;
        Paint paint9;
        float f16;
        float f17;
        Paint paint10;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        Paint paint11;
        Paint paint12;
        ai.g7 g7Var3;
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject.GroupedMessages groupedMessages2;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        View view7;
        MessageObject.GroupedMessages groupedMessages3;
        View view8;
        int i13;
        int i14;
        ArrayList arrayList5;
        org.telegram.ui.Cells.u1 u1Var2;
        ArrayList arrayList6;
        rj rjVar;
        Integer num4;
        float f18;
        float f19;
        boolean z10;
        ai.g7 g7Var4;
        ai.g7 g7Var5;
        org.telegram.ui.Components.pb0 pb0Var3;
        float f20;
        float f21;
        ai.g7 g7Var6;
        ai.g7 g7Var7;
        ai.g7 g7Var8;
        ai.g7 g7Var9;
        Canvas canvas4;
        float f22;
        float f23;
        View view9;
        float f24;
        float f25;
        float f26;
        Integer num5;
        float f27;
        float f28;
        int i15;
        Integer num6;
        Paint paint13;
        org.telegram.ui.Cells.w0 w0Var2;
        Paint paint14;
        float f29;
        float f30;
        Paint paint15;
        float f31;
        float f32;
        float f33;
        float f34;
        ai.g7 g7Var10;
        ai.g7 g7Var11;
        Integer num7;
        ai.g7 g7Var12;
        ai.g7 g7Var13;
        Integer num8;
        sm smVar2;
        Matrix matrix7;
        Matrix matrix8;
        Matrix matrix9;
        Paint paint16;
        Paint paint17;
        Paint paint18;
        float f35;
        float f36;
        View view10;
        int i16;
        Paint paint19;
        float f37;
        float f38;
        Paint paint20;
        float f39;
        float f40;
        float f41;
        Canvas canvas5;
        float f42;
        float f43;
        float f44;
        ai.g7 g7Var14;
        ai.g7 g7Var15;
        Integer num9;
        ai.g7 g7Var16;
        ai.g7 g7Var17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f45;
        Integer num11;
        ai.g7 g7Var18;
        ai.g7 g7Var19;
        Integer num12;
        org.telegram.ui.Components.qf qfVar;
        org.telegram.ui.Components.pb0 pb0Var4;
        org.telegram.ui.Components.pb0 pb0Var5;
        org.telegram.ui.Cells.u1 u1Var3;
        float f46;
        ai.g7 g7Var20;
        org.telegram.ui.Cells.u1 u1Var4;
        boolean z11;
        org.telegram.ui.Components.pb0 pb0Var6;
        float f47;
        org.telegram.ui.Components.pb0 pb0Var7;
        float f48;
        ai.g7 g7Var21;
        org.telegram.ui.Components.pb0 pb0Var8;
        org.telegram.ui.Components.pb0 pb0Var9;
        ai.g7 g7Var22;
        View view11;
        float f49;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.k kVar6;
        View view15;
        float f50;
        Paint paint23;
        float f51;
        float f52;
        Paint paint24;
        View view16;
        View view17;
        View view18;
        View view19;
        View view20;
        View view21;
        View view22;
        View view23;
        float f53;
        Integer num13;
        float f54;
        Paint paint25;
        Paint paint26;
        float f55;
        float f56;
        Paint paint27;
        Matrix matrix13;
        Matrix matrix14;
        Matrix matrix15;
        Paint paint28;
        Paint paint29;
        float f57;
        Paint paint30;
        float f58;
        float f59;
        Paint paint31;
        View view24;
        float f60;
        float f61;
        org.telegram.ui.ActionBar.k kVar7;
        int i17;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.Components.z40 z40Var;
        View view25;
        jj jjVar;
        View view26;
        yj yjVar;
        sm smVar3 = this;
        zn znVar = smVar3.J0;
        rj rjVar2 = znVar.v;
        ArrayList arrayList7 = znVar.n6;
        znVar.Y.S1();
        znVar.nc();
        if (znVar.ra || ((yjVar = znVar.y0) != null && yjVar.k())) {
            znVar.ra = false;
            znVar.yc();
        }
        znVar.Qc(false, false);
        znVar.Ac();
        jj jjVar2 = znVar.g2;
        if (jjVar2 != null && jjVar2.getTag() != null && (view26 = (jjVar = znVar.g2).e) != null) {
            jjVar.g(view26);
        }
        org.telegram.ui.Components.z40 z40Var2 = znVar.i2;
        if (z40Var2 != null && z40Var2.getTag() != null && (view25 = (z40Var = znVar.i2).e) != null) {
            z40Var.g(view25);
        }
        float f62 = 0.2f;
        float f63 = 2.0f;
        if (znVar.ka) {
            kVar10 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            canvas2 = canvas;
            i10 = canvas2.saveLayerAlpha(0.0f, kVar10.getBottom(), smVar3.getMeasuredWidth(), smVar3.getMeasuredHeight(), (int) (znVar.la * 255.0f), 31);
            float f64 = (znVar.la * 0.2f) + 0.8f;
            canvas2.scale(f64, f64, smVar3.getMeasuredWidth() / 2.0f, smVar3.getMeasuredHeight() / 2.0f);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        int i18 = i10;
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        int i19 = 0;
        while (true) {
            f7 = 1.0f;
            f10 = 0.0f;
            i11 = 1;
            if (i19 >= size) {
                break;
            }
            org.telegram.ui.Cells.u1 u1Var5 = (org.telegram.ui.Cells.u1) arrayList7.get(i19);
            MessageObject.SendAnimationData sendAnimationData = u1Var5.getMessageObject().sendAnimationData;
            if (sendAnimationData != null) {
                canvas2.save();
                kVar7 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar7.getVisibility() == 0) {
                    kVar8 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    int translationY = (int) kVar8.getTranslationY();
                    kVar9 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    int measuredHeight = kVar9.getMeasuredHeight() + translationY;
                    zk zkVar = znVar.o1;
                    int currentHeight = measuredHeight + (zkVar != null ? zkVar.getCurrentHeight() : 0);
                    lk lkVar = znVar.p1;
                    int currentHeight2 = currentHeight + (lkVar != null ? lkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
                    i17 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i17 = 0;
                }
                f60 = f63;
                f61 = f62;
                canvas2.clipRect(0.0f, i17 + znVar.t9, smVar3.getWidth(), smVar3.getHeight());
                ImageReceiver photoImage = u1Var5.getPhotoImage();
                u1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((znVar.Y.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) com.google.android.gms.internal.vision.e2.b(1.0f, sendAnimationData.progress, u1Var5.getTranslationY(), r9[1])));
                if (sendAnimationData.fromPreview) {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, topViewEnterProgress, sendAnimationData.progress));
                } else {
                    canvas2.translate(sendAnimationData.currentX, AndroidUtilities.lerp(sendAnimationData.y, photoImage.getCenterY() + topViewEnterProgress, sendAnimationData.progress));
                }
                float f65 = sendAnimationData.currentScale;
                canvas2.scale(f65, f65);
                if (!sendAnimationData.fromPreview) {
                    canvas2.translate(-photoImage.getCenterX(), -photoImage.getCenterY());
                }
                u1Var5.setTimeAlpha(sendAnimationData.timeAlpha);
                u1Var5.draw(canvas2);
                canvas2.restore();
            } else {
                f60 = f63;
                f61 = f62;
            }
            i19++;
            f63 = f60;
            f62 = f61;
        }
        float f66 = f63;
        float f67 = f62;
        num = znVar.M8;
        if (num != null) {
            view24 = znVar.J8;
        }
        paint = znVar.D8;
        if (paint != null) {
            matrix = znVar.E8;
            matrix.reset();
            float measuredWidth = smVar3.getMeasuredWidth() / znVar.B8.getWidth();
            matrix2 = znVar.E8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = znVar.C8;
            matrix3 = znVar.E8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = znVar.D8;
            paint5.setAlpha((int) (znVar.L8 * 255.0f));
            paint6 = znVar.D8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = smVar3.getMeasuredWidth();
                float measuredHeight2 = smVar3.getMeasuredHeight();
                paint7 = znVar.D8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = znVar.F8;
            f11 = znVar.H8;
            float f68 = f11 * 255.0f;
            view = znVar.J8;
            paint2.setAlpha((int) (f68 * (view != null ? znVar.K8 : 1.0f)));
            paint3 = znVar.F8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = smVar3.getMeasuredWidth();
                float measuredHeight3 = smVar3.getMeasuredHeight();
                paint4 = znVar.F8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = znVar.M8;
        if (num2 != null && znVar.O8) {
            smVar3.invalidate();
        }
        view2 = znVar.J8;
        if (view2 != null) {
            view4 = znVar.J8;
            if (view4 == znVar.j1) {
                f57 = znVar.K8;
                if (f57 < 1.0f) {
                    paint30 = znVar.F8;
                    f58 = znVar.H8;
                    f59 = znVar.K8;
                    paint30.setAlpha((int) ((1.0f - f59) * f58 * 255.0f));
                    float measuredWidth4 = smVar3.getMeasuredWidth();
                    float measuredHeight4 = smVar3.getMeasuredHeight();
                    paint31 = znVar.F8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = znVar.J8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f49 = znVar.K8;
                    if (f49 < 1.0f) {
                        view20 = znVar.J8;
                        float left = view20.getLeft();
                        view21 = znVar.J8;
                        float top = view21.getTop();
                        view22 = znVar.J8;
                        float right = view22.getRight();
                        view23 = znVar.J8;
                        float bottom = view23.getBottom();
                        f53 = znVar.K8;
                        int i20 = (int) (f53 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i20, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = znVar.J8;
                    float left2 = view12.getLeft();
                    view13 = znVar.J8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = znVar.J8;
                    kVar6 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (view14 == kVar6.getBackButton()) {
                        view16 = znVar.J8;
                        float x10 = view16.getX();
                        view17 = znVar.J8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = znVar.J8;
                        float measuredWidth5 = view18.getMeasuredWidth() / f66;
                        view19 = znVar.J8;
                        float measuredHeight5 = view19.getMeasuredHeight() / f66;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, znVar.G8);
                    }
                    view15 = znVar.J8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f50 = znVar.K8;
                    if (f50 < 1.0f) {
                        paint23 = znVar.F8;
                        f51 = znVar.H8;
                        f52 = znVar.K8;
                        paint23.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                        float measuredWidth6 = smVar3.getMeasuredWidth();
                        float measuredHeight6 = smVar3.getMeasuredHeight();
                        paint24 = znVar.F8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    g7Var = znVar.x0;
                    float y3 = ((g7Var.getY() + znVar.s9) - znVar.u9) - AndroidUtilities.dp(4.0f);
                    view6 = znVar.J8;
                    if (view6 instanceof org.telegram.ui.Cells.u1) {
                        view11 = znVar.J8;
                        groupedMessages = ((org.telegram.ui.Cells.u1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    g7Var2 = znVar.x0;
                    int childCount = g7Var2.getChildCount();
                    int i21 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = smVar3.B0;
                        f13 = 20.0f;
                        arrayList2 = smVar3.A0;
                        arrayList3 = smVar3.z0;
                        f14 = f10;
                        arrayList4 = smVar3.C0;
                        if (i21 >= childCount) {
                            break;
                        }
                        g7Var3 = znVar.x0;
                        View childAt = g7Var3.getChildAt(i21);
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
                        float f69 = y3;
                        view7 = znVar.J8;
                        if ((childAt == view7 || (groupedMessages != null && groupedMessages == groupedMessages2)) && childAt.getAlpha() != f14) {
                            if (z13 || u1Var == null || groupedMessages == null || (u1Var3 = groupedMessages.transitionParams.cell) == null) {
                                groupedMessages3 = groupedMessages;
                                view8 = childAt;
                                i13 = childCount;
                                i14 = i21;
                                arrayList5 = arrayList;
                                u1Var2 = u1Var;
                                arrayList6 = arrayList4;
                                rjVar = rjVar2;
                                num4 = null;
                                f18 = 9.0f;
                                f19 = 1.0f;
                                z10 = z13;
                            } else {
                                f18 = 9.0f;
                                float E2 = u1Var3.E2(true);
                                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                                float f70 = transitionParams.left + E2 + transitionParams.offsetLeft;
                                view8 = childAt;
                                float f71 = transitionParams.top + transitionParams.offsetTop;
                                float f72 = transitionParams.right + E2 + transitionParams.offsetRight;
                                i13 = childCount;
                                float f73 = transitionParams.bottom + transitionParams.offsetBottom;
                                if (transitionParams.backgroundChangeBounds) {
                                    f46 = f71;
                                } else {
                                    f46 = transitionParams.cell.getTranslationY() + f71;
                                    f73 += groupedMessages.transitionParams.cell.getTranslationY();
                                }
                                float f74 = f46;
                                float dp = f74 < (znVar.s9 - ((float) znVar.u9)) - ((float) AndroidUtilities.dp(20.0f)) ? (znVar.s9 - znVar.u9) - AndroidUtilities.dp(20.0f) : f74;
                                g7Var20 = znVar.x0;
                                if (f73 > AndroidUtilities.dp(20.0f) + g7Var20.getMeasuredHeight()) {
                                    g7Var22 = znVar.x0;
                                    f73 = AndroidUtilities.dp(20.0f) + g7Var22.getMeasuredHeight();
                                }
                                int size2 = groupedMessages.messages.size();
                                i14 = i21;
                                int i22 = 0;
                                while (true) {
                                    if (i22 >= size2) {
                                        arrayList5 = arrayList;
                                        u1Var4 = u1Var;
                                        z11 = true;
                                        break;
                                    }
                                    int i23 = size2;
                                    MessageObject messageObject = groupedMessages.messages.get(i22);
                                    arrayList5 = arrayList;
                                    if (znVar.W5[messageObject.getDialogId() == znVar.T5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                                        u1Var4 = u1Var;
                                        z11 = false;
                                        break;
                                    } else {
                                        i22++;
                                        size2 = i23;
                                        arrayList = arrayList5;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight7 = ((getMeasuredHeight() - rjVar2.e()) - znVar.sc) - AndroidUtilities.dp(9.0f);
                                pb0Var6 = znVar.I1;
                                if (pb0Var6 != null) {
                                    pb0Var9 = znVar.I1;
                                    f47 = pb0Var9.d();
                                } else {
                                    f47 = f14;
                                }
                                float f75 = measuredHeight7 - f47;
                                pb0Var7 = znVar.I1;
                                if (pb0Var7 != null) {
                                    pb0Var8 = znVar.I1;
                                    f48 = pb0Var8.e();
                                } else {
                                    f48 = f14;
                                }
                                org.telegram.ui.Cells.u1 u1Var6 = u1Var4;
                                canvas3.clipRect(f14, f69 + f48, getMeasuredWidth(), f75);
                                g7Var21 = znVar.x0;
                                canvas3.translate(f14, g7Var21.getY());
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages.transitionParams;
                                groupedMessages3 = groupedMessages;
                                arrayList6 = arrayList4;
                                rjVar = rjVar2;
                                num4 = null;
                                u1Var2 = u1Var6;
                                f19 = 1.0f;
                                transitionParams2.cell.B1(canvas, (int) f70, (int) dp, (int) f72, (int) f73, transitionParams2.pinnedTop, transitionParams2.pinnedBotton, z11, 0);
                                canvas.restore();
                                z10 = true;
                            }
                            if (u1Var2 != null && u1Var2.getPhotoImage().isAnimationRunning()) {
                                invalidate();
                            }
                            g7Var4 = znVar.x0;
                            float left3 = g7Var4.getLeft();
                            g7Var5 = znVar.x0;
                            float right2 = g7Var5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - rjVar.e()) - znVar.sc) - znVar.b9(org.telegram.ui.Components.y31.c)) - AndroidUtilities.dp(f18);
                            pb0Var3 = znVar.I1;
                            if (pb0Var3 != null) {
                                pb0Var4 = znVar.I1;
                                float max = Math.max(0.0f, pb0Var4.e());
                                pb0Var5 = znVar.I1;
                                f21 = Math.max(0.0f, pb0Var5.d());
                                f20 = max;
                            } else {
                                f20 = 0.0f;
                                f21 = 0.0f;
                            }
                            ok okVar = znVar.Y;
                            if (okVar != null && (qfVar = okVar.m0) != null) {
                                f21 = Math.max(f21, qfVar.f ? 0.0f : Math.max(0.0f, qfVar.getMeasuredHeight() - (qfVar.c.getTranslationY() + qfVar.e)));
                            }
                            float f76 = f69 + f20;
                            float f77 = measuredHeight8 - f21;
                            if (u1Var2 == null || !u1Var2.getTransitionParams().w0) {
                                g7Var6 = znVar.x0;
                                left3 = Math.max(left3, view8.getX() + g7Var6.getLeft());
                                g7Var7 = znVar.x0;
                                f76 = Math.max(f76, view8.getY() + g7Var7.getY());
                                g7Var8 = znVar.x0;
                                right2 = Math.min(right2, view8.getX() + g7Var8.getLeft() + view8.getMeasuredWidth());
                                g7Var9 = znVar.x0;
                                f77 = Math.min(f77, view8.getY() + g7Var9.getY() + view8.getMeasuredHeight());
                            }
                            float f78 = f77;
                            float f79 = f76;
                            float f80 = right2;
                            float max2 = Math.max(left3, znVar.W8());
                            if (f79 < f78) {
                                if (view8.getAlpha() != f19) {
                                    canvas4 = canvas;
                                    canvas4.saveLayerAlpha(max2, f79, f80, f78, (int) (view8.getAlpha() * 255.0f), 31);
                                    f45 = f79;
                                    f23 = f78;
                                    f25 = max2;
                                    f26 = f80;
                                } else {
                                    canvas4 = canvas;
                                    f45 = f79;
                                    f23 = f78;
                                    f25 = max2;
                                    f26 = f80;
                                    canvas4.save();
                                }
                                if (u1Var2 != null) {
                                    u1Var2.setInvalidatesParent(true);
                                    num12 = znVar.M8;
                                    u1Var2.setScrimReaction(num12);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(true);
                                    num11 = znVar.M8;
                                    w0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f25, f45, f26, f23);
                                g7Var18 = znVar.x0;
                                float x11 = view8.getX() + g7Var18.getLeft();
                                g7Var19 = znVar.x0;
                                canvas4.translate(x11, view8.getY() + g7Var19.getY());
                                if (u1Var2 != null && groupedMessages3 == null && u1Var2.C1()) {
                                    canvas4.save();
                                    canvas4.translate(0.0f, u1Var2.getPaddingTop());
                                    u1Var2.D1(canvas4, true, false);
                                    canvas4.restore();
                                }
                                view9 = view8;
                                view9.draw(canvas4);
                                if (u1Var2 == null || !u1Var2.U2()) {
                                    f22 = f45;
                                    f24 = 0.0f;
                                } else {
                                    canvas4.save();
                                    f22 = f45;
                                    f24 = 0.0f;
                                    canvas4.translate(0.0f, u1Var2.getPaddingTop());
                                    u1Var2.X1(canvas4);
                                    canvas4.restore();
                                }
                                if (w0Var != null) {
                                    w0Var.C(canvas4);
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
                                f22 = f79;
                                f23 = f78;
                                view9 = view8;
                                f24 = 0.0f;
                                f25 = max2;
                                f26 = f80;
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
                                    int i24 = groupedMessagePosition2.flags;
                                    if ((i24 & 8) != 0) {
                                    }
                                }
                                arrayList6.add(u1Var2);
                            }
                            num5 = znVar.M8;
                            if (num5 == null || u1Var2 == null || groupedMessages3 != null) {
                                float f81 = f26;
                                float f82 = f25;
                                View view27 = view9;
                                f27 = f24;
                                float f83 = f23;
                                float f84 = f22;
                                f28 = f69;
                                i15 = 1;
                                num6 = znVar.M8;
                                if (num6 != null && w0Var != null) {
                                    paint13 = znVar.D8;
                                    if (paint13 != null) {
                                        matrix7 = znVar.E8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / znVar.B8.getWidth();
                                        matrix8 = znVar.E8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = znVar.C8;
                                        matrix9 = znVar.E8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = znVar.D8;
                                        paint16.setAlpha((int) (znVar.L8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = znVar.D8;
                                        w0Var2 = w0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint14 = znVar.F8;
                                        f29 = znVar.H8;
                                        f30 = znVar.K8;
                                        paint14.setAlpha((int) (f30 * f29 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = znVar.F8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f79 < f78) {
                                        f31 = znVar.H8;
                                        f32 = znVar.K8;
                                        float f85 = (f32 * f31) / f67;
                                        float alpha = view27.getAlpha();
                                        f33 = znVar.K8;
                                        float f86 = f33 * alpha;
                                        if (f86 < f19) {
                                            canvas.saveLayerAlpha(f82, f84, f81, f83, (int) (f86 * 255.0f), 31);
                                            f83 = f83;
                                            f34 = f84;
                                            canvas3 = canvas;
                                        } else {
                                            canvas3 = canvas;
                                            f34 = f84;
                                            canvas3.save();
                                        }
                                        canvas3.clipRect(f82, f34, f81, f83);
                                        g7Var10 = znVar.x0;
                                        float x12 = view27.getX() + g7Var10.getLeft();
                                        g7Var11 = znVar.x0;
                                        canvas3.translate(x12, view27.getY() + g7Var11.getY() + view27.getPaddingTop());
                                        num7 = znVar.M8;
                                        boolean z14 = znVar.I8;
                                        zg.o0 o0Var = w0Var2.E0;
                                        if (!o0Var.b) {
                                            org.telegram.ui.ActionBar.e6 e6Var = w0Var2.g1;
                                            if (e6Var != null) {
                                                e6Var.m(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.i6.q(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            }
                                            o0Var.D = f85;
                                            o0Var.E = z14;
                                            o0Var.d(canvas3, w0Var2.r2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        g7Var12 = znVar.x0;
                                        float x13 = view27.getX() + g7Var12.getLeft();
                                        g7Var13 = znVar.x0;
                                        canvas3.translate(x13, view27.getY() + g7Var13.getY() + view27.getPaddingTop());
                                        int i25 = znVar.N8;
                                        num8 = znVar.M8;
                                        w0Var2.F(this, canvas3, i25, num8, f85);
                                        smVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = znVar.D8;
                                if (paint18 != null) {
                                    matrix10 = znVar.E8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / znVar.B8.getWidth();
                                    matrix11 = znVar.E8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = znVar.C8;
                                    matrix12 = znVar.E8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = znVar.D8;
                                    paint21.setAlpha((int) (znVar.L8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = znVar.D8;
                                    f35 = f26;
                                    f36 = f25;
                                    view10 = view9;
                                    i16 = 1;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f35 = f26;
                                    f36 = f25;
                                    view10 = view9;
                                    i16 = 1;
                                    paint19 = znVar.F8;
                                    f37 = znVar.H8;
                                    f38 = znVar.K8;
                                    paint19.setAlpha((int) (f38 * f37 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = znVar.F8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f79 < f78) {
                                    f39 = znVar.H8;
                                    f40 = znVar.K8;
                                    float f87 = (f40 * f39) / f67;
                                    float alpha2 = view10.getAlpha();
                                    f41 = znVar.K8;
                                    float f88 = f41 * alpha2;
                                    if (f88 < f19) {
                                        f42 = f24;
                                        canvas5 = canvas;
                                        f43 = f23;
                                        float f89 = f22;
                                        canvas5.saveLayerAlpha(f36, f89, f35, f43, (int) (f88 * 255.0f), 31);
                                        f44 = f89;
                                    } else {
                                        canvas5 = canvas;
                                        f42 = f24;
                                        f43 = f23;
                                        f44 = f22;
                                        canvas5.save();
                                    }
                                    canvas5.clipRect(f36, f44, f35, f43);
                                    g7Var14 = znVar.x0;
                                    float x14 = view10.getX() + g7Var14.getLeft();
                                    g7Var15 = znVar.x0;
                                    canvas5.translate(x14, view10.getY() + g7Var15.getY() + view10.getPaddingTop());
                                    num9 = znVar.M8;
                                    u1Var2.h2(canvas5, num9, f87, znVar.I8);
                                    canvas5.restore();
                                    canvas5.save();
                                    g7Var16 = znVar.x0;
                                    float x15 = view10.getX() + g7Var16.getLeft();
                                    g7Var17 = znVar.x0;
                                    canvas5.translate(x15, view10.getY() + g7Var17.getY() + view10.getPaddingTop());
                                    int i26 = znVar.N8;
                                    num10 = znVar.M8;
                                    i15 = i16;
                                    f28 = f69;
                                    f27 = f42;
                                    u1Var2.i2(this, canvas5, i26, num10, f87);
                                    canvas.restore();
                                } else {
                                    i15 = i16;
                                    f28 = f69;
                                    f27 = f24;
                                }
                            }
                            smVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            i15 = 1;
                            f19 = 1.0f;
                            smVar2 = this;
                            i13 = childCount;
                            i14 = i21;
                            rjVar = rjVar2;
                            f27 = f14;
                            f28 = f69;
                            groupedMessages3 = groupedMessages;
                        }
                        i21 = i14 + 1;
                        smVar3 = smVar2;
                        y3 = f28;
                        groupedMessages = groupedMessages3;
                        f10 = f27;
                        rjVar2 = rjVar;
                        i11 = i15;
                        childCount = i13;
                        f7 = f19;
                    }
                    f15 = f7;
                    f12 = f14;
                    float f90 = y3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    int i27 = i11;
                    smVar = smVar3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i28 = 0; i28 < size3; i28++) {
                            smVar.a0(canvas3, f90, (org.telegram.ui.Cells.u1) arrayList3.get(i28), 0);
                        }
                        i12 = 0;
                        arrayList3.clear();
                    } else {
                        i12 = 0;
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i29 = i12; i29 < size4; i29++) {
                            smVar.a0(canvas3, f90, (org.telegram.ui.Cells.u1) arrayList2.get(i29), i27);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i30 = i12; i30 < size5; i30++) {
                            org.telegram.ui.Cells.u1 u1Var7 = (org.telegram.ui.Cells.u1) arrayList.get(i30);
                            if (u1Var7.getCurrentPosition() != null || u1Var7.getTransitionParams().w0) {
                                smVar.a0(canvas3, f90, u1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i31 = i12; i31 < size6; i31++) {
                            org.telegram.ui.Cells.u1 u1Var8 = (org.telegram.ui.Cells.u1) arrayList4.get(i31);
                            if (u1Var8.getCurrentPosition() != null || u1Var8.getTransitionParams().w0) {
                                smVar.a0(canvas3, f90, u1Var8, 3);
                            }
                        }
                    }
                    num3 = znVar.M8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = znVar.D8;
                        if (paint8 != null) {
                            matrix4 = znVar.E8;
                            matrix4.reset();
                            float measuredWidth13 = smVar.getMeasuredWidth() / znVar.B8.getWidth();
                            matrix5 = znVar.E8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = znVar.C8;
                            matrix6 = znVar.E8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = znVar.D8;
                            paint11.setAlpha((int) (znVar.L8 * 255.0f));
                            float measuredWidth14 = smVar.getMeasuredWidth();
                            float measuredHeight13 = smVar.getMeasuredHeight();
                            paint12 = znVar.D8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = znVar.F8;
                            f16 = znVar.H8;
                            f17 = znVar.K8;
                            paint9.setAlpha((int) (f17 * f16 * 255.0f));
                            float measuredWidth15 = smVar.getMeasuredWidth();
                            float measuredHeight14 = smVar.getMeasuredHeight();
                            paint10 = znVar.F8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i32 = i12; i32 < size7; i32++) {
                            org.telegram.ui.Cells.u1 u1Var9 = (org.telegram.ui.Cells.u1) arrayList4.get(i32);
                            if (u1Var9.getCurrentPosition() != null || u1Var9.getTransitionParams().w0) {
                                smVar.a0(canvas3, f90, u1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = znVar.M8;
                    if (num13 == null) {
                        f54 = znVar.K8;
                        if (f54 < f15) {
                            paint25 = znVar.D8;
                            if (paint25 != null) {
                                matrix13 = znVar.E8;
                                matrix13.reset();
                                float measuredWidth16 = smVar.getMeasuredWidth() / znVar.B8.getWidth();
                                matrix14 = znVar.E8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = znVar.C8;
                                matrix15 = znVar.E8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = znVar.D8;
                                paint28.setAlpha((int) (znVar.L8 * 255.0f));
                                float measuredWidth17 = smVar.getMeasuredWidth();
                                float measuredHeight15 = smVar.getMeasuredHeight();
                                paint29 = znVar.D8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = znVar.F8;
                                f55 = znVar.H8;
                                f56 = znVar.K8;
                                paint26.setAlpha((int) ((f15 - f56) * f55 * 255.0f));
                                float measuredWidth18 = smVar.getMeasuredWidth();
                                float measuredHeight16 = smVar.getMeasuredHeight();
                                paint27 = znVar.F8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            smVar = smVar3;
            f15 = 1.0f;
            f12 = 0.0f;
            f13 = 20.0f;
            num13 = znVar.M8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            smVar = smVar3;
            f12 = 0.0f;
            f13 = 20.0f;
        }
        view3 = znVar.J8;
        if (view3 != null || ((ArrayList) znVar.M9.c).size() > 0) {
            pb0Var = znVar.I1;
            if (pb0Var != null) {
                pb0Var2 = znVar.I1;
            }
            super.drawChild(canvas3, znVar.j1, SystemClock.uptimeMillis());
            fk fkVar = znVar.X2;
            if (fkVar != null && fkVar.getTag() != null) {
                super.drawChild(canvas3, znVar.X2, SystemClock.uptimeMillis());
            }
            ek ekVar = znVar.Y2;
            if (ekVar != null && ekVar.getTag() != null) {
                super.drawChild(canvas3, znVar.Y2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.h10 h10Var = znVar.m9;
            if (h10Var != null) {
                super.drawChild(canvas3, h10Var, SystemClock.uptimeMillis());
            }
            uh.i iVar = znVar.X9;
            if (iVar != null) {
                super.drawChild(canvas3, iVar, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.z40 z40Var3 = znVar.e2;
            if (z40Var3 != null) {
                super.drawChild(canvas3, z40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = znVar.y3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.y3, SystemClock.uptimeMillis());
            }
            kl klVar = znVar.z3;
            if (klVar != null && klVar.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.z3, SystemClock.uptimeMillis());
            }
            ci.d4 d4Var = znVar.x1;
            if (d4Var != null && d4Var.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.x1, SystemClock.uptimeMillis());
            }
            yl ylVar = znVar.B1;
            if (ylVar != null && ylVar.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.B1, SystemClock.uptimeMillis());
            }
            ci.d4 d4Var2 = znVar.z1;
            if (d4Var2 != null && d4Var2.getVisibility() == 0) {
                super.drawChild(canvas3, znVar.z1, SystemClock.uptimeMillis());
            }
            ok okVar2 = znVar.Y;
            if (okVar2 != null && okVar2.L != null) {
                canvas3.save();
                canvas3.translate(znVar.Y.L.getX() + znVar.Y.getX(), znVar.Y.L.getY() + znVar.Y.getY());
                znVar.Y.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (znVar.pa > 0 && smVar.f < AndroidUtilities.dp(f13)) {
            int themedColor = znVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6);
            if (smVar.D0 == null) {
                smVar.D0 = new Paint();
            }
            if (smVar.E0 != themedColor) {
                Paint paint32 = smVar.D0;
                smVar.E0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, smVar.getMeasuredHeight() - znVar.pa, smVar.getMeasuredWidth(), smVar.getMeasuredHeight(), smVar.D0);
            canvas3 = canvas6;
        }
        xp xpVar = znVar.P9;
        if (xpVar != null && xpVar.e()) {
            int inputBubbleTop = (int) znVar.S.getInputBubbleTop();
            int inputBubbleBottom = (int) znVar.S.getInputBubbleBottom();
            zn znVar2 = znVar.T9;
            int i33 = inputBubbleTop - ((int) (znVar.U9 * (znVar2 == null ? f12 : znVar2.O9)));
            xp xpVar2 = znVar.P9;
            smVar.getMeasuredWidth();
            xpVar2.b(canvas3, i33, inputBubbleBottom);
        }
        if (znVar.T9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, smVar.getMeasuredWidth(), smVar.getMeasuredHeight(), (int) (znVar.U9 * 255.0f), 31);
            canvas3 = canvas;
            znVar.T9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        znVar.xa.e(canvas3);
        if (i18 >= 0) {
            canvas3.restore();
        }
        if (znVar.ka) {
            canvas3.save();
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            float x16 = kVar.getX();
            kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            canvas3.translate(x16, kVar2.getY());
            kVar3 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            float width = kVar3.getWidth();
            kVar4 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, kVar4.getHeight(), (int) (znVar.la * 255.0f), 31);
            kVar5 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            kVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jl jlVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (jlVar = this.J0.Fa) == null || !jlVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        jlVar.a(true);
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
        xk xkVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.J0;
        hh.e eVar = znVar.N3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || znVar.isInBubbleMode()) ? (znVar.Y.getEmojiView() != null ? znVar.Y.getEmojiView() : znVar.Y).getY() : znVar.Y.getY();
        View view = znVar.J8;
        if (view != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        }
        ok okVar = znVar.Y;
        if (okVar == null || !okVar.z3 || motionEvent.getY() >= y3) {
            znVar.j9 = motionEvent.getY();
            org.telegram.ui.Cells.aa n10 = znVar.c9.n(getContext());
            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
            if (!znVar.c9.x() || !znVar.c9.n(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(n10.getX(), n10.getY());
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                ci.h1 h1Var = znVar.q1;
                if (h1Var != null) {
                    if (znVar.u3 != null) {
                        z10 = h1Var.A(motionEvent);
                        if (znVar.q1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !znVar.c9.x() || (motionEvent.getY() >= znVar.x0.getTop() && motionEvent.getY() <= znVar.x0.getBottom())) {
                            xkVar = znVar.wa;
                            if (!xkVar.n) {
                                return xkVar.g(motionEvent);
                            }
                            com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
                            if (mVar == null || !mVar.a) {
                                if (znVar.isInPreviewMode() && znVar.J9) {
                                    if (motionEvent.getAction() == 0) {
                                        int i10 = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (znVar.j1 != null) {
                                            int i11 = 0;
                                            for (int i12 = 3; i11 < i12; i12 = 3) {
                                                aa.a aVar = znVar.j1.e[i11 == 0 ? 1 : i11 == 1 ? i10 : i12];
                                                if (aVar != null) {
                                                    ((ih.b) aVar.b).getLocationInWindow(iArr2);
                                                    Rect rect = AndroidUtilities.rectTmp2;
                                                    int i13 = iArr2[0] - iArr[0];
                                                    rect.set(i13, iArr2[1] - iArr[1], AndroidUtilities.dp(56.0f) + i13, AndroidUtilities.dp(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                i11++;
                                                i10 = 2;
                                            }
                                        }
                                        z11 = false;
                                        qj qjVar = znVar.a1;
                                        if (qjVar != null) {
                                            qjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i14 = iArr2[0] - iArr[0];
                                            rect2.set(i14, iArr2[1] - iArr[1], znVar.a1.getMeasuredWidth() + i14, znVar.a1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.F0 = motionEvent.getX();
                                                    this.G0 = motionEvent.getY();
                                                    this.H0 = SystemClock.elapsedRealtime();
                                                    this.I0 = z12;
                                                    qj qjVar2 = znVar.a1;
                                                    if (qjVar2 != null) {
                                                        qjVar2.h0.c(z12);
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
                                        qj qjVar3 = znVar.a1;
                                        if (qjVar3 != null) {
                                            qjVar3.h0.c(false);
                                        }
                                        if (this.I0 || (v7.z6.a(this.F0, this.G0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.H0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.I0) {
                                                d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                                                znVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) d5Var2).P(ProfileActivity.m4(znVar.T5));
                                            } else {
                                                d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
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
                                r4 r4Var = (r4) com.google.firebase.messaging.m.m().d;
                                if (r4Var != null) {
                                    r4Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-n10.getX(), -n10.getY());
                            if (znVar.c9.n(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(n10.getX(), n10.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = h1Var.e;
                        if (h1Var.H) {
                            h1Var.I = true;
                            h1Var.H = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(h1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            h1Var.d = 0;
                            h1Var.c = 1.0f;
                            org.telegram.ui.Components.d91 d91Var = h1Var.M;
                            if (d91Var != null) {
                                d91Var.e(1.0f, 0, h1Var.b);
                            }
                            h1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                xkVar = znVar.wa;
                if (!xkVar.n) {
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
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
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
        rk rkVar;
        MessageObject messageObject;
        org.telegram.ui.Components.y60 y60Var;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        zn znVar = this.J0;
        boolean z12 = false;
        if ((znVar.J8 == null && ((ArrayList) znVar.M9.c).size() <= 0) || (view != znVar.j1 && view != znVar.X2 && view != znVar.Y2 && view != znVar.m9 && view != znVar.X9 && view != znVar.e2 && view != null && view != znVar.y3 && view != znVar.z3)) {
            if ((view != znVar.y3 || !PhotoViewer.t1().R1()) && (!znVar.S9 || view != znVar.x0)) {
                if (znVar.ka) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                }
                if (view != znVar.b3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (r6Var = znVar.y2) != null && r6Var.a() && znVar.y2.getTag() != null) {
                            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                            if (view != kVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == znVar.t8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    } else {
                        if (view != znVar.x0) {
                            if (view != znVar.S) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == znVar.t8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-znVar.N9) - (znVar.U9 != 0.0f ? (znVar.x0.getMeasuredHeight() - znVar.N9) * znVar.U9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.i6.k3 != null && znVar.v8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(znVar.t8.getScaleX(), znVar.t8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.i6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.i6.k3.setBounds(x10, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(znVar.H9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(znVar.H9()) + y3);
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
                                if (view == znVar.S && (y60Var = znVar.b3) != null && y60Var.getVisibility() == 0) {
                                    super.drawChild(canvas, znVar.b3, j3);
                                }
                                z12 = super.drawChild(canvas, view, j3);
                                if (z11 && view == znVar.x0 && playingMessageObject.type != 5 && (rkVar = znVar.t8) != null && rkVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-znVar.N9) - (znVar.U9 != 0.0f ? (znVar.x0.getMeasuredHeight() - znVar.N9) * znVar.U9 : 0.0f)) + znVar.O9);
                                    super.drawChild(canvas, znVar.t8, j3);
                                    if (znVar.u8 != null) {
                                        canvas.save();
                                        canvas.translate(znVar.u8.getX(), znVar.x0.getY() + znVar.u8.getTop());
                                        if (z10) {
                                            znVar.u8.g2(canvas);
                                            invalidate();
                                            znVar.u8.invalidate();
                                        } else {
                                            znVar.u8.Y1(canvas);
                                            org.telegram.ui.Cells.u1 u1Var = znVar.u8;
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
                        if (view == znVar.t8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.sw0
    public float getBottomOffset() {
        return this.J0.x0.getBottom();
    }

    public zn getChatActivity() {
        return this.J0;
    }

    @Override // org.telegram.ui.Components.sw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.sw0
    public int getKeyboardHeight() {
        if (this.J0.Pa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.sw0
    public float getListTranslationY() {
        return this.J0.x0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.sw0
    public Drawable getNewDrawable() {
        Drawable d = this.J0.ea.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.sw0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.ea.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.sw0
    public int getScrollOffset() {
        return this.J0.x0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        super.onAttachedToWindow();
        zn znVar = this.J0;
        if (znVar.Pa) {
            this.H.b = znVar.X0;
        } else {
            d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
            if (d5Var != null) {
                d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                if (((ActionBarLayout) d5Var2).b) {
                    org.telegram.ui.ActionBar.p1 p1Var = this.H;
                    d5Var3 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
                    p1Var.b = (FrameLayout) d5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        znVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == znVar.T5)) {
            MediaController.getInstance().setTextureView(znVar.Q7(false), znVar.v8, znVar.t8, true);
        }
        xp xpVar = znVar.P9;
        if (xpVar != null) {
            xpVar.f();
        }
        znVar.xa.i();
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        zn znVar = this.J0;
        xp xpVar = znVar.P9;
        if (xpVar != null) {
            NotificationCenter.getInstance(xpVar.e0).removeObserver(xpVar, NotificationCenter.updateInterfaces);
            xpVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.s5 s5Var = xpVar.k0;
            if (s5Var != null && (view = xpVar.a0) != null) {
                s5Var.o(view);
            }
            xpVar.Q = 0.0f;
            xpVar.P = 0L;
            znVar.P9 = null;
        }
        znVar.xa.j();
        AndroidUtilities.runOnUIThread(new ai.f(19));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zn znVar;
        ci.r6 r6Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (r6Var = (znVar = this.J0).y2) == null || !r6Var.a() || znVar.y2.getTag() == null) {
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
    @Override // org.telegram.ui.Components.sw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int z11;
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
        boolean z12;
        org.telegram.ui.ActionBar.k kVar3;
        int i21;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        zn znVar = this.J0;
        rj rjVar = znVar.v;
        int i22 = (measuredWidth - znVar.Ua) - znVar.Va;
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
                    z11 = hg.c.z(i22, measuredWidth2, 2, znVar.Ua) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = znVar.Ua + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar5 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                            if (childAt != kVar5) {
                                kVar6 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                if (kVar6.getVisibility() == 0) {
                                    kVar7 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
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
                            if (childAt != znVar.M9 && childAt != znVar.X9 && childAt != znVar.S && !(childAt instanceof org.telegram.ui.Components.z40) && !(childAt instanceof org.telegram.ui.Components.gq)) {
                                if (childAt instanceof org.telegram.ui.Cells.aa) {
                                    i20 = znVar.Aa;
                                } else if (childAt == znVar.Q0) {
                                    kVar3 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                    if (kVar3.getVisibility() == 0) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                        i21 = kVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (znVar.Y.s0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z12 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
                                        if (!z12) {
                                            i18 = znVar.Y.getBottom();
                                        }
                                    }
                                    i18 = znVar.Y.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    ok okVar = znVar.Y;
                                    if (okVar != null && (childAt == okVar.O1 || childAt == okVar.N1)) {
                                        i18 = org.telegram.messenger.bi.z(7.0f, rjVar.e(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == znVar.w2) {
                                        i18 = org.telegram.messenger.bi.z(7.0f, rjVar.e(), i18);
                                    } else if (okVar == null || childAt != okVar.e1) {
                                        if (childAt == znVar.e2 || childAt == znVar.s2 || childAt == znVar.f2) {
                                            i19 = this.w0;
                                        } else if (childAt == znVar.x0 || childAt == znVar.v0 || childAt == znVar.X2 || childAt == znVar.Y2 || childAt == znVar.Z2) {
                                            i20 = znVar.Aa;
                                        } else if (childAt != znVar.P) {
                                            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                            if (childAt == kVar) {
                                                i18 -= getPaddingTop();
                                                if (znVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == znVar.t8) {
                                                kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                                i18 = kVar2.getMeasuredHeight();
                                            } else if (childAt != znVar.b3 && childAt != znVar.c3 && childAt != znVar.u0) {
                                                if (childAt instanceof org.telegram.ui.Components.vc0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != znVar.T) {
                                                    if (childAt != znVar.N3) {
                                                    }
                                                }
                                            }
                                        } else if (okVar.x0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.bi.z(9.0f, rjVar.e(), i18);
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
                    z11 = (measuredWidth - znVar.Va) - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = z11 - i14;
                if (i25 == 16) {
                }
                i18 = i16 - i17;
                if (b0(childAt)) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight + i18);
            }
        }
        ek ekVar = znVar.Y2;
        if (ekVar != null) {
            ekVar.setBackgroundHeight(getMeasuredHeight());
        }
        znVar.t9();
        znVar.w9();
        znVar.Qc(false, false);
        S();
        znVar.w7();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0548  */
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
        org.telegram.ui.Components.tc tcVar;
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
        zn znVar = this.J0;
        rj rjVar = znVar.v;
        yf.b0 b0Var = znVar.Dc;
        ViewParent parent = b0Var.getParent();
        if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(b0Var)) >= 0 && indexOfChild != viewGroup.getChildCount() - 1) {
            viewGroup.bringChildToFront(b0Var);
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - znVar.Ua) - znVar.Va;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        fh.a aVar = znVar.L.a;
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).b(i15, size2);
        }
        int i16 = 0;
        if (this.y0 != i15) {
            znVar.F4 = false;
            this.y0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
            if (z13 || (user = znVar.f) == null || !user.self) {
                znVar.K9 = false;
            } else {
                org.telegram.ui.ActionBar.j5 titleTextView = znVar.a1.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    znVar.K9 = !znVar.L9;
                } else {
                    znVar.K9 = false;
                }
            }
            if (znVar.K9 || znVar.L9 || UserObject.isBotForumWithEditableTopics(znVar.f)) {
                qj qjVar = znVar.a1;
                if (qjVar != null && qjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) znVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(znVar.R3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                qj qjVar2 = znVar.a1;
                if (qjVar2 != null && qjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) znVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (znVar.K9) {
                kVar8 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (!kVar8.n0 && (v0Var = znVar.m0) != null) {
                    v0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var2 = znVar.h0;
                if (v0Var2 != null) {
                    v0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.v0 v0Var3 = znVar.h0;
                if (v0Var3 != null) {
                    v0Var3.K(40);
                }
                org.telegram.ui.ActionBar.v0 v0Var4 = znVar.m0;
                if (v0Var4 != null) {
                    v0Var4.setVisibility(8);
                }
            }
            kVar7 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (!kVar7.n0 && (yVar = znVar.n0) != null) {
                yVar.f((!znVar.L9 || znVar.K9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = znVar.h0;
            if (v0Var5 != null) {
                TLRPC.UserFull userFull = znVar.a8;
                if (znVar.L9) {
                    v0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    v0Var5.K(32);
                }
            }
            znVar.F4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        measureChildWithMargins(kVar, makeMeasureSpec, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + znVar.oa >= AndroidUtilities.dp(20.0f);
        if (this.x0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (znVar.pa > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            znVar.oa = znVar.pa;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            znVar.oa = znVar.Y.r0() ? znVar.Y.getEmojiPadding() : 0;
        } else {
            znVar.oa = 0;
        }
        setEmojiKeyboardHeight(znVar.oa);
        boolean z15 = this.f + znVar.oa >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i17 = 0; i17 < znVar.x0.getChildCount(); i17++) {
                View childAt = znVar.x0.getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        znVar.x0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            znVar.z0.i1(R, (int) (((((znVar.x0.getMeasuredHeight() - znVar.s9) - znVar.Ba) + ((this.f + znVar.oa) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(znVar.H9()))) / 2.0f), false);
                            znVar.A0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i18 = paddingTop;
                            measureChildWithMargins(znVar.Y, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
                            if (!z10 || znVar.Pa) {
                                this.w0 = 0;
                            } else {
                                this.w0 = znVar.Y.getMeasuredHeight();
                            }
                            znVar.Aa = 0;
                            znVar.Ba = 0;
                            if (SharedConfig.chatBlurEnabled() && !znVar.Pa && znVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i19 = znVar.G;
                                znVar.Aa = i19;
                                znVar.Ba = i19;
                            }
                            i12 = 0;
                            while (i12 < childCount) {
                                int i20 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null) {
                                    if (childAt2.getVisibility() != 8 && childAt2 != znVar.Y) {
                                        kVar4 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                        if (childAt2 != kVar4) {
                                            if (b0(childAt2)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                            } else {
                                                if (childAt2 == znVar.x0 || childAt2 == znVar.v0 || (childAt2 instanceof org.telegram.ui.Cells.aa)) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), znVar.Aa + size2 + znVar.Ba), TLObject.FLAG_30));
                                                } else if (childAt2 == znVar.P) {
                                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int dp = AndroidUtilities.dp(10.0f);
                                                    int i21 = i18 - this.w0;
                                                    z12 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
                                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((znVar.Y.x0() ? 48 : i16) + 2) + (i21 - (z12 ? AndroidUtilities.statusBarHeight : i16))), TLObject.FLAG_30));
                                                } else if (childAt2 == znVar.b3) {
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                    znVar.b3.setInternalPadding(AndroidUtilities.dp(12.0f) + rjVar.e() + ((int) znVar.tc));
                                                    childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                                } else if (childAt2 == znVar.c3) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - rjVar.e()) - ((int) znVar.tc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                                } else if (childAt2 == znVar.Q0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30));
                                                } else if (znVar.Y.s0(childAt2)) {
                                                    org.telegram.ui.Components.dg dgVar = znVar.Y.H1;
                                                    if (childAt2 == dgVar && dgVar != null) {
                                                        i20 = dgVar.getKeyboardHeight();
                                                    }
                                                    z11 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
                                                    if (z11) {
                                                        int paddingTop2 = getPaddingTop() + (i18 - this.w0) + measuredHeight;
                                                        if (i20 < 0) {
                                                            i20 = Math.max(Math.min(paddingTop2, AndroidUtilities.dp(350.0f)), paddingTop2 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                    } else if (AndroidUtilities.isInMultiwindow) {
                                                        int paddingTop3 = getPaddingTop() + (((i18 - this.w0) + measuredHeight) - AndroidUtilities.statusBarHeight);
                                                        if (i20 < 0) {
                                                            i20 = Math.max(Math.min(paddingTop3, AndroidUtilities.dp(350.0f)), paddingTop3 / 2);
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i20, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                                    }
                                                } else {
                                                    gk gkVar = znVar.I1;
                                                    if (childAt2 == gkVar) {
                                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gkVar.getLayoutParams();
                                                        gg.j1 adapter = znVar.I1.getAdapter();
                                                        if (adapter.w0 == null || adapter.h0) {
                                                            znVar.I1.setIgnoreLayout(true);
                                                            layoutParams.height = i18;
                                                            layoutParams.topMargin = 0;
                                                            znVar.I1.setIgnoreLayout(false);
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                        } else {
                                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_31));
                                                        }
                                                    } else if (childAt2 == znVar.c9.n(getContext())) {
                                                        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                        int i22 = i18 + znVar.Aa;
                                                        if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || znVar.Pa) {
                                                            tm tmVar = znVar.c9;
                                                            tmVar.d0 = 0;
                                                            tmVar.w();
                                                        } else {
                                                            i22 += keyboardHeight;
                                                            tm tmVar2 = znVar.c9;
                                                            tmVar2.d0 = keyboardHeight;
                                                            tmVar2.w();
                                                        }
                                                        childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
                                                    } else if (childAt2 instanceof org.telegram.ui.Components.vc0) {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                    } else if (childAt2 == znVar.R1) {
                                                        kVar5 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                                        if (kVar5.getVisibility() == 0) {
                                                            kVar6 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                                            i14 = size2 - kVar6.getMeasuredHeight();
                                                        } else {
                                                            i14 = size2;
                                                        }
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                                                    } else {
                                                        measureChildWithMargins(childAt2, makeMeasureSpec, 0, i11, 0);
                                                    }
                                                }
                                                i12++;
                                                i16 = 0;
                                            }
                                        }
                                    }
                                    i12++;
                                    i16 = 0;
                                }
                                i12++;
                                i16 = 0;
                            }
                            if (znVar.E4) {
                                znVar.F4 = true;
                                znVar.t9();
                                znVar.w9();
                                znVar.E4 = false;
                                wj wjVar = znVar.x0;
                                wjVar.measure(View.MeasureSpec.makeMeasureSpec(wjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(znVar.x0.getMeasuredHeight(), TLObject.FLAG_30));
                                znVar.F4 = false;
                            }
                            i13 = znVar.x4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new ai.p8(this, i13, 25));
                                znVar.x4 = -1;
                            }
                            tcVar = org.telegram.ui.Components.tc.w;
                            if (tcVar != null && znVar.Zb != null) {
                                tcVar.l();
                            }
                            znVar.V6();
                            this.x0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.df dfVar = znVar.Y.Y3;
        AndroidUtilities.cancelRunOnUIThread(dfVar);
        dfVar.run();
        childCount = getChildCount();
        int i182 = paddingTop;
        measureChildWithMargins(znVar.Y, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        if (z10) {
        }
        this.w0 = 0;
        znVar.Aa = 0;
        znVar.Ba = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i192 = znVar.G;
            znVar.Aa = i192;
            znVar.Ba = i192;
        }
        i12 = 0;
        while (i12 < childCount) {
        }
        if (znVar.E4) {
        }
        i13 = znVar.x4;
        if (i13 != -1) {
        }
        tcVar = org.telegram.ui.Components.tc.w;
        if (tcVar != null) {
            tcVar.l();
        }
        znVar.V6();
        this.x0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        zn znVar = this.J0;
        gh.d.c(znVar.z8, znVar.fragmentView);
        znVar.A8.d();
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
        zn znVar = this.J0;
        znVar.v9 = i11;
        znVar.t9();
        znVar.w9();
    }

    @Override // org.telegram.ui.Components.sw0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.sw0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.sw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
