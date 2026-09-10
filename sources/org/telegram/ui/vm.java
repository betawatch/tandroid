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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vm extends org.telegram.ui.Components.aw0 {
    public final ArrayList A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public long H0;
    public boolean I0;
    public final /* synthetic */ eo J0;
    public int w0;
    public int x0;
    public int y0;
    public final ArrayList z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(eo eoVar, Context context, org.telegram.ui.ActionBar.f5 f5Var) {
        super(context, f5Var);
        this.J0 = eoVar;
        this.w0 = 0;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.H = new um(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f7) {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.J0;
        eoVar.X0.setTranslationY(f7);
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        lVar.setTranslationY(0.0f);
        fl flVar = eoVar.bb;
        if (flVar != null) {
            flVar.setTranslationY(eoVar.o1 != null ? r3.getCurrentHeight() : 0);
        }
        bi.x4 x4Var = eoVar.w1;
        if (x4Var != null) {
            x4Var.setTranslationY(0.0f);
        }
        bi.x4 x4Var2 = eoVar.v1;
        if (x4Var2 != null) {
            x4Var2.setTranslationY(0.0f);
        }
        eoVar.Q0.setTranslationY(0.0f);
        eoVar.P.setTranslationY(0.0f);
        eoVar.w9 = 0.0f;
        eoVar.x9 = 0.0f;
        eoVar.X0.setBackgroundTranslation(0);
        il ilVar = eoVar.b3;
        if (ilVar != null) {
            ilVar.t0 = 0.0f;
            ilVar.s();
        }
        bi.s7 s7Var = eoVar.y2;
        if (s7Var != null) {
            org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) s7Var.b;
            eaVar.u = 0.0f;
            eaVar.d.invalidate();
        }
        eoVar.setFragmentPanTranslationOffset(0);
        eoVar.o9();
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.lc0) {
            ((org.telegram.ui.Components.lc0) drawable).p();
        }
        eo eoVar = this.J0;
        eh.a c10 = eoVar.W.c(drawable);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(eoVar.W.b(c10));
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(eoVar.W.a(c10));
        eoVar.Db = computePerceivedBrightness <= 0.721f;
        eoVar.Eb = computePerceivedBrightness2 <= 0.9f;
        eoVar.L.a = c10;
        ih.f fVar = eoVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
        gh.g gVar = eoVar.S;
        if (gVar != null) {
            gVar.invalidate();
        }
        eoVar.n9();
        eoVar.checkSystemBarColors();
    }

    public final void a0(Canvas canvas, float f7, org.telegram.ui.Cells.t1 t1Var, int i10) {
        int save = canvas.save();
        eo eoVar = this.J0;
        float x10 = t1Var.getX() + eoVar.x0.getLeft();
        float y3 = t1Var.getY() + eoVar.x0.getY() + t1Var.getPaddingTop();
        float alpha = t1Var.a() ? t1Var.getAlpha() : 1.0f;
        canvas.clipRect(eoVar.x0.getLeft(), f7, eoVar.x0.getRight(), ((((eoVar.x0.getY() + eoVar.x0.getMeasuredHeight()) - eoVar.Aa) - eoVar.v.d()) - eoVar.sc) - AndroidUtilities.dp(9.0f));
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
        } else if (i10 == 4 && ((t1Var.getCurrentPosition() == null || (1 & t1Var.getCurrentPosition().flags) != 0) && eoVar.M8 != null)) {
            float f10 = (eoVar.H8 * eoVar.K8) / 0.2f;
            canvas.save();
            t1Var.h2(canvas, eoVar.M8, f10, eoVar.I8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x10, y3);
            t1Var.i2(this, canvas, eoVar.N8, eoVar.M8, f10);
            canvas.restore();
        }
        t1Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        org.telegram.ui.Components.ug ugVar;
        eo eoVar = this.J0;
        zg.a aVar = eoVar.J;
        ok okVar = eoVar.Y;
        if (okVar == null || view != okVar.m0) {
            super.addView(view, i10, layoutParams);
        } else {
            ih.f fVar = eoVar.X;
            int indexOfChild = fVar != null ? indexOfChild(fVar) : -1;
            if (indexOfChild >= 0) {
                i10 = indexOfChild;
            }
            super.addView(view, i10, layoutParams);
        }
        ok okVar2 = eoVar.Y;
        if (okVar2 != null && view == okVar2.m0) {
            di.b0 b0Var = (di.b0) view;
            b0Var.setBackgroundDrawable(aVar.c(b0Var.c, eoVar.x, false));
        }
        ok okVar3 = eoVar.Y;
        if (okVar3 == null || view != (ugVar = okVar3.N1)) {
            return;
        }
        ugVar.setBlurredBackgroundFactory(aVar);
    }

    public final boolean b0(View view) {
        if (view == this.L) {
            return true;
        }
        eo eoVar = this.J0;
        return view == eoVar.y2 || view == eoVar.q1 || view == eoVar.m9 || view == eoVar.X || view == eoVar.K3;
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
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
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
        vm vmVar;
        float f10;
        View view3;
        org.telegram.ui.Components.xa0 xa0Var;
        org.telegram.ui.Components.xa0 xa0Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        View view4;
        View view5;
        zm zmVar;
        View view6;
        MessageObject.GroupedMessages groupedMessages;
        zm zmVar2;
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
        zm zmVar3;
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
        oh.i iVar;
        Integer num4;
        float f14;
        float f15;
        boolean z10;
        zm zmVar4;
        zm zmVar5;
        org.telegram.ui.Components.xa0 xa0Var3;
        float f16;
        float f17;
        zm zmVar6;
        zm zmVar7;
        zm zmVar8;
        zm zmVar9;
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
        zm zmVar10;
        zm zmVar11;
        Integer num7;
        zm zmVar12;
        zm zmVar13;
        Integer num8;
        vm vmVar2;
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
        zm zmVar14;
        zm zmVar15;
        Integer num9;
        zm zmVar16;
        zm zmVar17;
        Integer num10;
        Matrix matrix10;
        Matrix matrix11;
        Matrix matrix12;
        Paint paint21;
        Paint paint22;
        float f38;
        Integer num11;
        zm zmVar18;
        zm zmVar19;
        Integer num12;
        org.telegram.ui.Components.pf pfVar;
        org.telegram.ui.Components.xa0 xa0Var4;
        org.telegram.ui.Components.xa0 xa0Var5;
        org.telegram.ui.Cells.t1 t1Var3;
        float f39;
        zm zmVar20;
        org.telegram.ui.Cells.t1 t1Var4;
        boolean z11;
        org.telegram.ui.Components.xa0 xa0Var6;
        float f40;
        org.telegram.ui.Components.xa0 xa0Var7;
        float f41;
        zm zmVar21;
        org.telegram.ui.Components.xa0 xa0Var8;
        org.telegram.ui.Components.xa0 xa0Var9;
        zm zmVar22;
        View view11;
        float f42;
        View view12;
        View view13;
        View view14;
        org.telegram.ui.ActionBar.l lVar6;
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
        org.telegram.ui.ActionBar.l lVar7;
        int i13;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.l lVar9;
        boolean z12;
        org.telegram.ui.ActionBar.l lVar10;
        org.telegram.ui.Components.s40 s40Var;
        View view25;
        kj kjVar;
        View view26;
        yj yjVar;
        vm vmVar3 = this;
        eo eoVar = vmVar3.J0;
        oh.i iVar2 = eoVar.v;
        ArrayList arrayList7 = eoVar.n6;
        eoVar.Y.T1();
        eoVar.jc();
        if (eoVar.ra || ((yjVar = eoVar.y0) != null && yjVar.k())) {
            eoVar.ra = false;
            eoVar.uc();
        }
        eoVar.Mc(false, false);
        eoVar.wc();
        kj kjVar2 = eoVar.g2;
        if (kjVar2 != null && kjVar2.getTag() != null && (view26 = (kjVar = eoVar.g2).e) != null) {
            kjVar.g(view26);
        }
        org.telegram.ui.Components.s40 s40Var2 = eoVar.i2;
        if (s40Var2 != null && s40Var2.getTag() != null && (view25 = (s40Var = eoVar.i2).e) != null) {
            s40Var.g(view25);
        }
        if (eoVar.ka) {
            lVar10 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            canvas2 = canvas;
            int saveLayerAlpha = canvas2.saveLayerAlpha(0.0f, lVar10.getBottom(), vmVar3.getMeasuredWidth(), vmVar3.getMeasuredHeight(), (int) (eoVar.la * 255.0f), 31);
            float f53 = (eoVar.la * 0.2f) + 0.8f;
            canvas2.scale(f53, f53, vmVar3.getMeasuredWidth() / 2.0f, vmVar3.getMeasuredHeight() / 2.0f);
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
                lVar7 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (lVar7.getVisibility() == 0) {
                    lVar8 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    int translationY = (int) lVar8.getTranslationY();
                    lVar9 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    int measuredHeight = lVar9.getMeasuredHeight() + translationY;
                    al alVar = eoVar.o1;
                    int currentHeight = measuredHeight + (alVar != null ? alVar.getCurrentHeight() : 0);
                    mk mkVar = eoVar.p1;
                    int currentHeight2 = currentHeight + (mkVar != null ? mkVar.getCurrentHeight() : 0);
                    z12 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
                    i13 = currentHeight2 + (z12 ? AndroidUtilities.statusBarHeight : 0);
                } else {
                    i13 = 0;
                }
                canvas2.clipRect(0.0f, i13 + eoVar.t9, vmVar3.getWidth(), vmVar3.getHeight());
                ImageReceiver photoImage = t1Var5.getPhotoImage();
                t1Var5.getLocationInWindow(AndroidUtilities.pointTmp2);
                int topViewEnterProgress = (int) ((eoVar.Y.getTopViewEnterProgress() * AndroidUtilities.dp(48.0f)) + ((int) com.google.android.gms.internal.vision.e2.a(1.0f, sendAnimationData.progress, t1Var5.getTranslationY(), r9[1])));
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
        num = eoVar.M8;
        if (num != null) {
            view24 = eoVar.J8;
        }
        paint = eoVar.D8;
        if (paint != null) {
            matrix = eoVar.E8;
            matrix.reset();
            float measuredWidth = vmVar3.getMeasuredWidth() / eoVar.B8.getWidth();
            matrix2 = eoVar.E8;
            matrix2.postScale(measuredWidth, measuredWidth);
            BitmapShader bitmapShader = eoVar.C8;
            matrix3 = eoVar.E8;
            bitmapShader.setLocalMatrix(matrix3);
            paint5 = eoVar.D8;
            paint5.setAlpha((int) (eoVar.L8 * 255.0f));
            paint6 = eoVar.D8;
            if (paint6.getAlpha() > 0) {
                float measuredWidth2 = vmVar3.getMeasuredWidth();
                float measuredHeight2 = vmVar3.getMeasuredHeight();
                paint7 = eoVar.D8;
                canvas2.drawRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, paint7);
            }
        } else {
            paint2 = eoVar.F8;
            f7 = eoVar.H8;
            float f55 = f7 * 255.0f;
            view = eoVar.J8;
            paint2.setAlpha((int) (f55 * (view != null ? eoVar.K8 : 1.0f)));
            paint3 = eoVar.F8;
            if (paint3.getAlpha() > 0) {
                float measuredWidth3 = vmVar3.getMeasuredWidth();
                float measuredHeight3 = vmVar3.getMeasuredHeight();
                paint4 = eoVar.F8;
                canvas.drawRect(0.0f, 0.0f, measuredWidth3, measuredHeight3, paint4);
            }
        }
        num2 = eoVar.M8;
        if (num2 != null && eoVar.O8) {
            vmVar3.invalidate();
        }
        view2 = eoVar.J8;
        if (view2 != null) {
            view4 = eoVar.J8;
            if (view4 == eoVar.j1) {
                f50 = eoVar.K8;
                if (f50 < 1.0f) {
                    paint30 = eoVar.F8;
                    f51 = eoVar.H8;
                    f52 = eoVar.K8;
                    paint30.setAlpha((int) ((1.0f - f52) * f51 * 255.0f));
                    float measuredWidth4 = vmVar3.getMeasuredWidth();
                    float measuredHeight4 = vmVar3.getMeasuredHeight();
                    paint31 = eoVar.F8;
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, paint31);
                } else {
                    canvas3 = canvas;
                }
            } else {
                view5 = eoVar.J8;
                if (view5 instanceof ImageView) {
                    int save = canvas.save();
                    f42 = eoVar.K8;
                    if (f42 < 1.0f) {
                        view20 = eoVar.J8;
                        float left = view20.getLeft();
                        view21 = eoVar.J8;
                        float top = view21.getTop();
                        view22 = eoVar.J8;
                        float right = view22.getRight();
                        view23 = eoVar.J8;
                        float bottom = view23.getBottom();
                        f46 = eoVar.K8;
                        int i15 = (int) (f46 * 255.0f);
                        canvas3 = canvas;
                        canvas3.saveLayerAlpha(left, top, right, bottom, i15, 31);
                    } else {
                        canvas3 = canvas;
                    }
                    view12 = eoVar.J8;
                    float left2 = view12.getLeft();
                    view13 = eoVar.J8;
                    canvas3.translate(left2, view13.getTop());
                    view14 = eoVar.J8;
                    lVar6 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    if (view14 == lVar6.getBackButton()) {
                        view16 = eoVar.J8;
                        float x10 = view16.getX();
                        view17 = eoVar.J8;
                        canvas3.translate(x10 - view17.getLeft(), 0.0f);
                        view18 = eoVar.J8;
                        float measuredWidth5 = view18.getMeasuredWidth() / 2.0f;
                        view19 = eoVar.J8;
                        float measuredHeight5 = view19.getMeasuredHeight() / 2.0f;
                        canvas3.drawCircle(measuredWidth5, measuredHeight5, Math.max(measuredWidth5, measuredHeight5) * 0.7f, eoVar.G8);
                    }
                    view15 = eoVar.J8;
                    view15.draw(canvas3);
                    canvas3.restoreToCount(save);
                    f43 = eoVar.K8;
                    if (f43 < 1.0f) {
                        paint23 = eoVar.F8;
                        f44 = eoVar.H8;
                        f45 = eoVar.K8;
                        paint23.setAlpha((int) ((1.0f - f45) * f44 * 255.0f));
                        float measuredWidth6 = vmVar3.getMeasuredWidth();
                        float measuredHeight6 = vmVar3.getMeasuredHeight();
                        paint24 = eoVar.F8;
                        canvas3.drawRect(0.0f, 0.0f, measuredWidth6, measuredHeight6, paint24);
                    }
                } else {
                    canvas3 = canvas;
                    zmVar = eoVar.x0;
                    float y3 = ((zmVar.getY() + eoVar.s9) - eoVar.u9) - AndroidUtilities.dp(4.0f);
                    view6 = eoVar.J8;
                    if (view6 instanceof org.telegram.ui.Cells.t1) {
                        view11 = eoVar.J8;
                        groupedMessages = ((org.telegram.ui.Cells.t1) view11).getCurrentMessagesGroup();
                    } else {
                        groupedMessages = null;
                    }
                    zmVar2 = eoVar.x0;
                    int childCount = zmVar2.getChildCount();
                    int i16 = 0;
                    boolean z13 = false;
                    while (true) {
                        arrayList = vmVar3.B0;
                        f10 = 20.0f;
                        arrayList2 = vmVar3.A0;
                        arrayList3 = vmVar3.z0;
                        arrayList4 = vmVar3.C0;
                        if (i16 >= childCount) {
                            break;
                        }
                        zmVar3 = eoVar.x0;
                        View childAt = zmVar3.getChildAt(i16);
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
                        view7 = eoVar.J8;
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
                                float dp = f61 < (eoVar.s9 - ((float) eoVar.u9)) - ((float) AndroidUtilities.dp(20.0f)) ? (eoVar.s9 - eoVar.u9) - AndroidUtilities.dp(20.0f) : f61;
                                zmVar20 = eoVar.x0;
                                if (f60 > AndroidUtilities.dp(20.0f) + zmVar20.getMeasuredHeight()) {
                                    zmVar22 = eoVar.x0;
                                    f60 = AndroidUtilities.dp(20.0f) + zmVar22.getMeasuredHeight();
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
                                    if (eoVar.W5[messageObject.getDialogId() == eoVar.T5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
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
                                float measuredHeight7 = ((getMeasuredHeight() - iVar2.d()) - eoVar.sc) - AndroidUtilities.dp(9.0f);
                                xa0Var6 = eoVar.I1;
                                if (xa0Var6 != null) {
                                    xa0Var9 = eoVar.I1;
                                    f40 = xa0Var9.d();
                                } else {
                                    f40 = 0.0f;
                                }
                                float f62 = measuredHeight7 - f40;
                                xa0Var7 = eoVar.I1;
                                if (xa0Var7 != null) {
                                    xa0Var8 = eoVar.I1;
                                    f41 = xa0Var8.e();
                                } else {
                                    f41 = 0.0f;
                                }
                                org.telegram.ui.Cells.t1 t1Var6 = t1Var4;
                                canvas3.clipRect(0.0f, f56 + f41, getMeasuredWidth(), f62);
                                zmVar21 = eoVar.x0;
                                canvas3.translate(0.0f, zmVar21.getY());
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
                            zmVar4 = eoVar.x0;
                            float left3 = zmVar4.getLeft();
                            zmVar5 = eoVar.x0;
                            float right2 = zmVar5.getRight();
                            float measuredHeight8 = (((getMeasuredHeight() - iVar.d()) - eoVar.sc) - eoVar.W8(org.telegram.ui.Components.g31.c)) - AndroidUtilities.dp(f14);
                            xa0Var3 = eoVar.I1;
                            if (xa0Var3 != null) {
                                xa0Var4 = eoVar.I1;
                                float max = Math.max(0.0f, xa0Var4.e());
                                xa0Var5 = eoVar.I1;
                                f17 = Math.max(0.0f, xa0Var5.d());
                                f16 = max;
                            } else {
                                f16 = 0.0f;
                                f17 = 0.0f;
                            }
                            ok okVar = eoVar.Y;
                            if (okVar != null && (pfVar = okVar.m0) != null) {
                                f17 = Math.max(f17, pfVar.f ? 0.0f : Math.max(0.0f, pfVar.getMeasuredHeight() - (pfVar.c.getTranslationY() + pfVar.e)));
                            }
                            float f63 = f56 + f16;
                            float f64 = measuredHeight8 - f17;
                            if (t1Var2 == null || !t1Var2.getTransitionParams().w0) {
                                zmVar6 = eoVar.x0;
                                left3 = Math.max(left3, view8.getX() + zmVar6.getLeft());
                                zmVar7 = eoVar.x0;
                                f63 = Math.max(f63, view8.getY() + zmVar7.getY());
                                zmVar8 = eoVar.x0;
                                right2 = Math.min(right2, view8.getX() + zmVar8.getLeft() + view8.getMeasuredWidth());
                                zmVar9 = eoVar.x0;
                                f64 = Math.min(f64, view8.getY() + zmVar9.getY() + view8.getMeasuredHeight());
                            }
                            float f65 = f64;
                            float f66 = f63;
                            float f67 = right2;
                            float max2 = Math.max(left3, eoVar.R8());
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
                                    num12 = eoVar.M8;
                                    t1Var2.setScrimReaction(num12);
                                } else if (w0Var != null) {
                                    w0Var.setInvalidatesParent(true);
                                    num11 = eoVar.M8;
                                    w0Var.setScrimReaction(num11);
                                }
                                canvas4.clipRect(f20, f38, f21, f19);
                                zmVar18 = eoVar.x0;
                                float x11 = view8.getX() + zmVar18.getLeft();
                                zmVar19 = eoVar.x0;
                                canvas4.translate(x11, view8.getY() + zmVar19.getY());
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
                            num5 = eoVar.M8;
                            if (num5 == null || t1Var2 == null || groupedMessages3 != null) {
                                float f68 = f21;
                                float f69 = f20;
                                View view27 = view9;
                                float f70 = f19;
                                float f71 = f18;
                                f22 = f56;
                                num6 = eoVar.M8;
                                if (num6 != null && w0Var != null) {
                                    paint13 = eoVar.D8;
                                    if (paint13 != null) {
                                        matrix7 = eoVar.E8;
                                        matrix7.reset();
                                        float measuredWidth7 = getMeasuredWidth() / eoVar.B8.getWidth();
                                        matrix8 = eoVar.E8;
                                        matrix8.postScale(measuredWidth7, measuredWidth7);
                                        BitmapShader bitmapShader2 = eoVar.C8;
                                        matrix9 = eoVar.E8;
                                        bitmapShader2.setLocalMatrix(matrix9);
                                        paint16 = eoVar.D8;
                                        paint16.setAlpha((int) (eoVar.L8 * 255.0f));
                                        float measuredWidth8 = getMeasuredWidth();
                                        float measuredHeight9 = getMeasuredHeight();
                                        paint17 = eoVar.D8;
                                        w0Var2 = w0Var;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth8, measuredHeight9, paint17);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint14 = eoVar.F8;
                                        f23 = eoVar.H8;
                                        f24 = eoVar.K8;
                                        paint14.setAlpha((int) (f24 * f23 * 255.0f));
                                        float measuredWidth9 = getMeasuredWidth();
                                        float measuredHeight10 = getMeasuredHeight();
                                        paint15 = eoVar.F8;
                                        canvas.drawRect(0.0f, 0.0f, measuredWidth9, measuredHeight10, paint15);
                                    }
                                    if (f66 < f65) {
                                        f25 = eoVar.H8;
                                        f26 = eoVar.K8;
                                        float f72 = (f26 * f25) / 0.2f;
                                        float alpha = view27.getAlpha();
                                        f27 = eoVar.K8;
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
                                        zmVar10 = eoVar.x0;
                                        float x12 = view27.getX() + zmVar10.getLeft();
                                        zmVar11 = eoVar.x0;
                                        canvas3.translate(x12, view27.getY() + zmVar11.getY() + view27.getPaddingTop());
                                        num7 = eoVar.M8;
                                        boolean z14 = eoVar.I8;
                                        yg.q0 q0Var = w0Var2.C0;
                                        if (!q0Var.b) {
                                            org.telegram.ui.ActionBar.f6 f6Var = w0Var2.Y0;
                                            if (f6Var != null) {
                                                f6Var.l(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.j6.q(w0Var2.u0, w0Var2.t0 + AndroidUtilities.dp(4.0f), w0Var2.getMeasuredWidth(), w0Var2.v0);
                                            }
                                            q0Var.D = f72;
                                            q0Var.E = z14;
                                            q0Var.d(canvas3, w0Var2.i2.c, num7);
                                        }
                                        canvas3.restore();
                                        canvas3.save();
                                        zmVar12 = eoVar.x0;
                                        float x13 = view27.getX() + zmVar12.getLeft();
                                        zmVar13 = eoVar.x0;
                                        canvas3.translate(x13, view27.getY() + zmVar13.getY() + view27.getPaddingTop());
                                        int i20 = eoVar.N8;
                                        num8 = eoVar.M8;
                                        w0Var2.D(this, canvas3, i20, num8, f72);
                                        vmVar2 = this;
                                        canvas3.restore();
                                        z13 = z10;
                                    }
                                }
                            } else {
                                paint18 = eoVar.D8;
                                if (paint18 != null) {
                                    matrix10 = eoVar.E8;
                                    matrix10.reset();
                                    float measuredWidth10 = getMeasuredWidth() / eoVar.B8.getWidth();
                                    matrix11 = eoVar.E8;
                                    matrix11.postScale(measuredWidth10, measuredWidth10);
                                    BitmapShader bitmapShader3 = eoVar.C8;
                                    matrix12 = eoVar.E8;
                                    bitmapShader3.setLocalMatrix(matrix12);
                                    paint21 = eoVar.D8;
                                    paint21.setAlpha((int) (eoVar.L8 * 255.0f));
                                    float measuredWidth11 = getMeasuredWidth();
                                    float measuredHeight11 = getMeasuredHeight();
                                    paint22 = eoVar.D8;
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    canvas4.drawRect(0.0f, 0.0f, measuredWidth11, measuredHeight11, paint22);
                                } else {
                                    f29 = f21;
                                    f30 = f20;
                                    view10 = view9;
                                    paint19 = eoVar.F8;
                                    f31 = eoVar.H8;
                                    f32 = eoVar.K8;
                                    paint19.setAlpha((int) (f32 * f31 * 255.0f));
                                    float measuredWidth12 = getMeasuredWidth();
                                    float measuredHeight12 = getMeasuredHeight();
                                    paint20 = eoVar.F8;
                                    canvas.drawRect(0.0f, 0.0f, measuredWidth12, measuredHeight12, paint20);
                                }
                                if (f66 < f65) {
                                    f33 = eoVar.H8;
                                    f34 = eoVar.K8;
                                    float f74 = (f34 * f33) / 0.2f;
                                    float alpha2 = view10.getAlpha();
                                    f35 = eoVar.K8;
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
                                    zmVar14 = eoVar.x0;
                                    float x14 = view10.getX() + zmVar14.getLeft();
                                    zmVar15 = eoVar.x0;
                                    canvas5.translate(x14, view10.getY() + zmVar15.getY() + view10.getPaddingTop());
                                    num9 = eoVar.M8;
                                    t1Var2.h2(canvas5, num9, f74, eoVar.I8);
                                    canvas5.restore();
                                    canvas5.save();
                                    zmVar16 = eoVar.x0;
                                    float x15 = view10.getX() + zmVar16.getLeft();
                                    zmVar17 = eoVar.x0;
                                    canvas5.translate(x15, view10.getY() + zmVar17.getY() + view10.getPaddingTop());
                                    int i21 = eoVar.N8;
                                    num10 = eoVar.M8;
                                    f22 = f56;
                                    t1Var2.i2(this, canvas5, i21, num10, f74);
                                    canvas.restore();
                                } else {
                                    f22 = f56;
                                }
                            }
                            vmVar2 = this;
                            canvas3 = canvas;
                            z13 = z10;
                        } else {
                            groupedMessages3 = groupedMessages;
                            i11 = childCount;
                            i12 = i16;
                            iVar = iVar2;
                            f22 = f56;
                            vmVar2 = this;
                        }
                        i16 = i12 + 1;
                        vmVar3 = vmVar2;
                        y3 = f22;
                        groupedMessages = groupedMessages3;
                        iVar2 = iVar;
                        childCount = i11;
                    }
                    vmVar = vmVar3;
                    MessageObject.GroupedMessages groupedMessages4 = groupedMessages;
                    f11 = 1.0f;
                    float f77 = y3;
                    int size3 = arrayList3.size();
                    if (size3 > 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            vmVar.a0(canvas3, f77, (org.telegram.ui.Cells.t1) arrayList3.get(i22), 0);
                        }
                        arrayList3.clear();
                    }
                    int size4 = arrayList2.size();
                    if (size4 > 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            vmVar.a0(canvas3, f77, (org.telegram.ui.Cells.t1) arrayList2.get(i23), 1);
                        }
                        arrayList2.clear();
                    }
                    int size5 = arrayList.size();
                    if (size5 > 0) {
                        for (int i24 = 0; i24 < size5; i24++) {
                            org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList.get(i24);
                            if (t1Var7.getCurrentPosition() != null || t1Var7.getTransitionParams().w0) {
                                vmVar.a0(canvas3, f77, t1Var7, 2);
                            }
                        }
                        arrayList.clear();
                    }
                    int size6 = arrayList4.size();
                    if (size6 > 0) {
                        for (int i25 = 0; i25 < size6; i25++) {
                            org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList4.get(i25);
                            if (t1Var8.getCurrentPosition() != null || t1Var8.getTransitionParams().w0) {
                                vmVar.a0(canvas3, f77, t1Var8, 3);
                            }
                        }
                    }
                    num3 = eoVar.M8;
                    if (num3 != null && groupedMessages4 != null) {
                        paint8 = eoVar.D8;
                        if (paint8 != null) {
                            matrix4 = eoVar.E8;
                            matrix4.reset();
                            float measuredWidth13 = vmVar.getMeasuredWidth() / eoVar.B8.getWidth();
                            matrix5 = eoVar.E8;
                            matrix5.postScale(measuredWidth13, measuredWidth13);
                            BitmapShader bitmapShader4 = eoVar.C8;
                            matrix6 = eoVar.E8;
                            bitmapShader4.setLocalMatrix(matrix6);
                            paint11 = eoVar.D8;
                            paint11.setAlpha((int) (eoVar.L8 * 255.0f));
                            float measuredWidth14 = vmVar.getMeasuredWidth();
                            float measuredHeight13 = vmVar.getMeasuredHeight();
                            paint12 = eoVar.D8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth14, measuredHeight13, paint12);
                            canvas3 = canvas;
                        } else {
                            paint9 = eoVar.F8;
                            f12 = eoVar.H8;
                            f13 = eoVar.K8;
                            paint9.setAlpha((int) (f13 * f12 * 255.0f));
                            float measuredWidth15 = vmVar.getMeasuredWidth();
                            float measuredHeight14 = vmVar.getMeasuredHeight();
                            paint10 = eoVar.F8;
                            canvas.drawRect(0.0f, 0.0f, measuredWidth15, measuredHeight14, paint10);
                            canvas3 = canvas;
                        }
                    }
                    int size7 = arrayList4.size();
                    if (size7 > 0) {
                        for (int i26 = 0; i26 < size7; i26++) {
                            org.telegram.ui.Cells.t1 t1Var9 = (org.telegram.ui.Cells.t1) arrayList4.get(i26);
                            if (t1Var9.getCurrentPosition() != null || t1Var9.getTransitionParams().w0) {
                                vmVar.a0(canvas3, f77, t1Var9, 4);
                            }
                        }
                        arrayList4.clear();
                    }
                    num13 = eoVar.M8;
                    if (num13 == null) {
                        f47 = eoVar.K8;
                        if (f47 < f11) {
                            paint25 = eoVar.D8;
                            if (paint25 != null) {
                                matrix13 = eoVar.E8;
                                matrix13.reset();
                                float measuredWidth16 = vmVar.getMeasuredWidth() / eoVar.B8.getWidth();
                                matrix14 = eoVar.E8;
                                matrix14.postScale(measuredWidth16, measuredWidth16);
                                BitmapShader bitmapShader5 = eoVar.C8;
                                matrix15 = eoVar.E8;
                                bitmapShader5.setLocalMatrix(matrix15);
                                paint28 = eoVar.D8;
                                paint28.setAlpha((int) (eoVar.L8 * 255.0f));
                                float measuredWidth17 = vmVar.getMeasuredWidth();
                                float measuredHeight15 = vmVar.getMeasuredHeight();
                                paint29 = eoVar.D8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth17, measuredHeight15, paint29);
                                canvas3 = canvas;
                            } else {
                                paint26 = eoVar.F8;
                                f48 = eoVar.H8;
                                f49 = eoVar.K8;
                                paint26.setAlpha((int) ((f11 - f49) * f48 * 255.0f));
                                float measuredWidth18 = vmVar.getMeasuredWidth();
                                float measuredHeight16 = vmVar.getMeasuredHeight();
                                paint27 = eoVar.F8;
                                canvas.drawRect(0.0f, 0.0f, measuredWidth18, measuredHeight16, paint27);
                                canvas3 = canvas;
                            }
                        }
                    }
                }
            }
            vmVar = vmVar3;
            f10 = 20.0f;
            f11 = 1.0f;
            num13 = eoVar.M8;
            if (num13 == null) {
            }
        } else {
            canvas3 = canvas;
            vmVar = vmVar3;
            f10 = 20.0f;
        }
        view3 = eoVar.J8;
        if (view3 != null || ((ArrayList) eoVar.M9.c).size() > 0) {
            xa0Var = eoVar.I1;
            if (xa0Var != null) {
                xa0Var2 = eoVar.I1;
            }
            super.drawChild(canvas3, eoVar.j1, SystemClock.uptimeMillis());
            fk fkVar = eoVar.X2;
            if (fkVar != null && fkVar.getTag() != null) {
                super.drawChild(canvas3, eoVar.X2, SystemClock.uptimeMillis());
            }
            ek ekVar = eoVar.Y2;
            if (ekVar != null && ekVar.getTag() != null) {
                super.drawChild(canvas3, eoVar.Y2, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.y00 y00Var = eoVar.m9;
            if (y00Var != null) {
                super.drawChild(canvas3, y00Var, SystemClock.uptimeMillis());
            }
            th.j jVar = eoVar.X9;
            if (jVar != null) {
                super.drawChild(canvas3, jVar, SystemClock.uptimeMillis());
            }
            org.telegram.ui.Components.s40 s40Var3 = eoVar.e2;
            if (s40Var3 != null) {
                super.drawChild(canvas3, s40Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = eoVar.y3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, eoVar.y3, SystemClock.uptimeMillis());
            }
            ll llVar = eoVar.z3;
            if (llVar != null && llVar.getVisibility() == 0) {
                super.drawChild(canvas3, eoVar.z3, SystemClock.uptimeMillis());
            }
            bi.x4 x4Var = eoVar.x1;
            if (x4Var != null && x4Var.getVisibility() == 0) {
                super.drawChild(canvas3, eoVar.x1, SystemClock.uptimeMillis());
            }
            am amVar = eoVar.B1;
            if (amVar != null && amVar.getVisibility() == 0) {
                super.drawChild(canvas3, eoVar.B1, SystemClock.uptimeMillis());
            }
            bi.x4 x4Var2 = eoVar.z1;
            if (x4Var2 != null && x4Var2.getVisibility() == 0) {
                super.drawChild(canvas3, eoVar.z1, SystemClock.uptimeMillis());
            }
            ok okVar2 = eoVar.Y;
            if (okVar2 != null && okVar2.L != null) {
                canvas3.save();
                canvas3.translate(eoVar.Y.L.getX() + eoVar.Y.getX(), eoVar.Y.L.getY() + eoVar.Y.getY());
                eoVar.Y.L.draw(canvas3);
                canvas3.restore();
            }
        }
        if (eoVar.pa > 0 && vmVar.f < AndroidUtilities.dp(f10)) {
            int themedColor = eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            if (vmVar.D0 == null) {
                vmVar.D0 = new Paint();
            }
            if (vmVar.E0 != themedColor) {
                Paint paint32 = vmVar.D0;
                vmVar.E0 = themedColor;
                paint32.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, vmVar.getMeasuredHeight() - eoVar.pa, vmVar.getMeasuredWidth(), vmVar.getMeasuredHeight(), vmVar.D0);
            canvas3 = canvas6;
        }
        bq bqVar = eoVar.P9;
        if (bqVar != null && bqVar.e()) {
            int inputBubbleTop = (int) eoVar.S.getInputBubbleTop();
            int inputBubbleBottom = (int) eoVar.S.getInputBubbleBottom();
            eo eoVar2 = eoVar.T9;
            int i27 = inputBubbleTop - ((int) (eoVar.U9 * (eoVar2 == null ? 0.0f : eoVar2.O9)));
            bq bqVar2 = eoVar.P9;
            vmVar.getMeasuredWidth();
            bqVar2.b(canvas3, i27, inputBubbleBottom);
        }
        if (eoVar.T9 != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, vmVar.getMeasuredWidth(), vmVar.getMeasuredHeight(), (int) (eoVar.U9 * 255.0f), 31);
            canvas3 = canvas;
            eoVar.T9.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        eoVar.xa.e(canvas3);
        if (i10 >= 0) {
            canvas3.restore();
        }
        if (eoVar.ka) {
            canvas3.save();
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            float x16 = lVar.getX();
            lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            canvas3.translate(x16, lVar2.getY());
            lVar3 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            float width = lVar3.getWidth();
            lVar4 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, lVar4.getHeight(), (int) (eoVar.la * 255.0f), 31);
            lVar5 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            lVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        kl klVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (klVar = this.J0.Ea) == null || !klVar.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        klVar.a(true);
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
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.J0;
        gh.e eVar = eoVar.N3;
        if (eVar != null) {
            eVar.n = SystemClock.uptimeMillis();
        }
        float y3 = (AndroidUtilities.isInMultiwindow || eoVar.isInBubbleMode()) ? (eoVar.Y.getEmojiView() != null ? eoVar.Y.getEmojiView() : eoVar.Y).getY() : eoVar.Y.getY();
        View view = eoVar.J8;
        if (view != null) {
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        }
        ok okVar = eoVar.Y;
        if (okVar == null || !okVar.y3 || motionEvent.getY() >= y3) {
            eoVar.j9 = motionEvent.getY();
            org.telegram.ui.Cells.ea o9 = eoVar.c9.o(getContext());
            motionEvent.offsetLocation(-o9.getX(), -o9.getY());
            if (!eoVar.c9.y() || !eoVar.c9.o(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(o9.getX(), o9.getY());
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                bi.p1 p1Var = eoVar.q1;
                if (p1Var != null) {
                    if (eoVar.u3 != null) {
                        z10 = p1Var.A(motionEvent);
                        if (eoVar.q1.H) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !eoVar.c9.y() || (motionEvent.getY() >= eoVar.x0.getTop() && motionEvent.getY() <= eoVar.x0.getBottom())) {
                            xkVar = eoVar.wa;
                            if (!xkVar.n) {
                                return xkVar.g(motionEvent);
                            }
                            com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
                            if (mVar == null || !mVar.a) {
                                if (eoVar.isInPreviewMode() && eoVar.J9) {
                                    if (motionEvent.getAction() == 0) {
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (eoVar.j1 != null) {
                                            int i10 = 0;
                                            for (int i11 = 3; i10 < i11; i11 = 3) {
                                                aa.a aVar = eoVar.j1.e[i10 == 0 ? (char) 1 : i10 == 1 ? (char) 2 : (char) 3];
                                                if (aVar != null) {
                                                    ((hh.b) aVar.b).getLocationInWindow(iArr2);
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
                                        rj rjVar = eoVar.a1;
                                        if (rjVar != null) {
                                            rjVar.getLocationInWindow(iArr2);
                                            Rect rect2 = AndroidUtilities.rectTmp2;
                                            int i13 = iArr2[0] - iArr[0];
                                            rect2.set(i13, iArr2[1] - iArr[1], eoVar.a1.getMeasuredWidth() + i13, eoVar.a1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z12 = true;
                                                if (z11) {
                                                    this.F0 = motionEvent.getX();
                                                    this.G0 = motionEvent.getY();
                                                    this.H0 = SystemClock.elapsedRealtime();
                                                    this.I0 = z12;
                                                    rj rjVar2 = eoVar.a1;
                                                    if (rjVar2 != null) {
                                                        rjVar2.h0.c(z12);
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
                                        rj rjVar3 = eoVar.a1;
                                        if (rjVar3 != null) {
                                            rjVar3.h0.c(false);
                                        }
                                        if (this.I0 || (v7.a7.a(this.F0, this.G0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(6.0f) && SystemClock.elapsedRealtime() - this.H0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.I0) {
                                                f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                                                eoVar.removeSelfFromStack(false);
                                                ((ActionBarLayout) f5Var2).P(ProfileActivity.m4(eoVar.T5));
                                            } else {
                                                f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                                                ((ActionBarLayout) f5Var).r();
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
                            if (eoVar.c9.o(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(o9.getX(), o9.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = p1Var.e;
                        if (p1Var.H) {
                            p1Var.I = true;
                            p1Var.H = false;
                            viewArr[0].setTranslationX(0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                view2.setTranslationX(p1Var.y ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            p1Var.d = 0;
                            p1Var.c = 1.0f;
                            org.telegram.ui.Components.l81 l81Var = p1Var.M;
                            if (l81Var != null) {
                                l81Var.e(1.0f, 0, p1Var.b);
                            }
                            p1Var.w(false);
                        }
                    }
                }
                z10 = false;
                if (motionEvent.getAction() == 0) {
                }
                xkVar = eoVar.wa;
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
    /* JADX WARN: Removed duplicated region for block: B:58:0x018e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bi.s7 s7Var;
        org.telegram.ui.ActionBar.l lVar;
        MessageObject playingMessageObject;
        boolean z10;
        boolean z11;
        sk skVar;
        MessageObject messageObject;
        il ilVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        eo eoVar = this.J0;
        boolean z12 = false;
        if ((eoVar.J8 == null && ((ArrayList) eoVar.M9.c).size() <= 0) || (view != eoVar.j1 && view != eoVar.X2 && view != eoVar.Y2 && view != eoVar.m9 && view != eoVar.X9 && view != eoVar.e2 && view != null && view != eoVar.y3 && view != eoVar.z3)) {
            if ((view != eoVar.y3 || !PhotoViewer.t1().Q1()) && (!eoVar.S9 || view != eoVar.x0)) {
                if (eoVar.ka) {
                    lVar3 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                }
                if (view != eoVar.b3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (s7Var = eoVar.y2) != null && s7Var.a() && eoVar.y2.getTag() != null) {
                            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                            if (view != lVar) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                        }
                        z10 = false;
                        z11 = false;
                        if (view == eoVar.t8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    } else {
                        if (view != eoVar.x0) {
                            if (view != eoVar.S) {
                            }
                        }
                        playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null && playingMessageObject.eventId == 0) {
                            z10 = playingMessageObject.isRoundVideo();
                            if (z10 || playingMessageObject.isVideo()) {
                                z11 = true;
                                if (view == eoVar.t8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-eoVar.N9) - (eoVar.U9 != 0.0f ? (eoVar.x0.getMeasuredHeight() - eoVar.N9) * eoVar.U9 : 0.0f));
                                    if (playingMessageObject != null && playingMessageObject.type == 5) {
                                        if (org.telegram.ui.ActionBar.j6.k3 != null && eoVar.v8.d) {
                                            int x10 = ((int) view.getX()) - AndroidUtilities.dp(3.0f);
                                            int y3 = ((int) view.getY()) - AndroidUtilities.dp(2.0f);
                                            canvas.save();
                                            canvas.scale(eoVar.t8.getScaleX(), eoVar.t8.getScaleY(), view.getX(), view.getY());
                                            org.telegram.ui.ActionBar.j6.k3.setAlpha(255);
                                            org.telegram.ui.ActionBar.j6.k3.setBounds(x10, y3, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(eoVar.C9()) + x10, AndroidUtilities.dp(6.0f) + AndroidUtilities.roundPlayingMessageSize(eoVar.C9()) + y3);
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
                                if (view == eoVar.S && (ilVar = eoVar.b3) != null && ilVar.getVisibility() == 0) {
                                    super.drawChild(canvas, eoVar.b3, j3);
                                }
                                z12 = super.drawChild(canvas, view, j3);
                                if (z11 && view == eoVar.x0 && playingMessageObject.type != 5 && (skVar = eoVar.t8) != null && skVar.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-eoVar.N9) - (eoVar.U9 != 0.0f ? (eoVar.x0.getMeasuredHeight() - eoVar.N9) * eoVar.U9 : 0.0f)) + eoVar.O9);
                                    super.drawChild(canvas, eoVar.t8, j3);
                                    if (eoVar.u8 != null) {
                                        canvas.save();
                                        canvas.translate(eoVar.u8.getX(), eoVar.x0.getY() + eoVar.u8.getTop());
                                        if (z10) {
                                            eoVar.u8.g2(canvas);
                                            invalidate();
                                            eoVar.u8.invalidate();
                                        } else {
                                            eoVar.u8.Y1(canvas);
                                            org.telegram.ui.Cells.t1 t1Var = eoVar.u8;
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
                        if (view == eoVar.t8) {
                        }
                    }
                }
            }
            return true;
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.aw0
    public float getBottomOffset() {
        return this.J0.x0.getBottom();
    }

    public eo getChatActivity() {
        return this.J0;
    }

    @Override // org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Components.aw0
    public int getKeyboardHeight() {
        if (this.J0.Oa) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // org.telegram.ui.Components.aw0
    public float getListTranslationY() {
        return this.J0.x0.getTranslationY();
    }

    @Override // org.telegram.ui.Components.aw0
    public Drawable getNewDrawable() {
        Drawable d = this.J0.ea.d();
        return d != null ? d : super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.aw0
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.J0.ea.h;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // org.telegram.ui.Components.aw0
    public int getScrollOffset() {
        return this.J0.x0.computeVerticalScrollOffset();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        super.onAttachedToWindow();
        eo eoVar = this.J0;
        if (eoVar.Oa) {
            this.H.b = eoVar.X0;
        } else {
            f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
            if (f5Var != null) {
                f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                if (((ActionBarLayout) f5Var2).b) {
                    org.telegram.ui.ActionBar.r1 r1Var = this.H;
                    f5Var3 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
                    r1Var.b = (FrameLayout) f5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.H.c();
        eoVar.Y.setAdjustPanLayoutHelper(this.H);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && ((playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) && playingMessageObject.eventId == 0 && playingMessageObject.getDialogId() == eoVar.T5)) {
            MediaController.getInstance().setTextureView(eoVar.N7(false), eoVar.v8, eoVar.t8, true);
        }
        bq bqVar = eoVar.P9;
        if (bqVar != null) {
            bqVar.f();
        }
        eoVar.xa.j();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.H.d();
        eo eoVar = this.J0;
        bq bqVar = eoVar.P9;
        if (bqVar != null) {
            NotificationCenter.getInstance(bqVar.e0).removeObserver(bqVar, NotificationCenter.updateInterfaces);
            bqVar.F.onDetachedFromWindow();
            org.telegram.ui.Components.p5 p5Var = bqVar.k0;
            if (p5Var != null && (view = bqVar.a0) != null) {
                p5Var.o(view);
            }
            bqVar.Q = 0.0f;
            bqVar.P = 0L;
            eoVar.P9 = null;
        }
        eoVar.xa.k();
        AndroidUtilities.runOnUIThread(new bi.f0(14));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        eo eoVar;
        bi.s7 s7Var;
        if (getTag(67108867) != null) {
            return;
        }
        if (getTag(67108867) != null || (s7Var = (eoVar = this.J0).y2) == null || !s7Var.a() || eoVar.y2.getTag() == null) {
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
    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int dp;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar3;
        int i21;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        eo eoVar = this.J0;
        oh.i iVar = eoVar.v;
        int i22 = (measuredWidth - eoVar.Ua) - eoVar.Va;
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
                    C = hc.b.C(i22, measuredWidth2, 2, eoVar.Ua) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i26 != 5) {
                    i15 = eoVar.Ua + layoutParams.leftMargin;
                    if (i25 == 16) {
                        if (i25 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            lVar5 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                            if (childAt != lVar5) {
                                lVar6 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                if (lVar6.getVisibility() == 0) {
                                    lVar7 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                    i18 += lVar7.getMeasuredHeight();
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
                            if (childAt != eoVar.M9 && childAt != eoVar.X9 && childAt != eoVar.S && !(childAt instanceof org.telegram.ui.Components.s40) && !(childAt instanceof org.telegram.ui.Components.wp)) {
                                if (childAt instanceof org.telegram.ui.Cells.ea) {
                                    i20 = eoVar.za;
                                } else if (childAt == eoVar.Q0) {
                                    lVar3 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                    if (lVar3.getVisibility() == 0) {
                                        lVar4 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                        i21 = lVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i21 = 0;
                                    }
                                    i18 += i21;
                                } else if (eoVar.Y.u0(childAt)) {
                                    if (!AndroidUtilities.isInMultiwindow) {
                                        z11 = ((org.telegram.ui.ActionBar.p2) eoVar).inBubbleMode;
                                        if (!z11) {
                                            i18 = eoVar.Y.getBottom();
                                        }
                                    }
                                    i18 = eoVar.Y.getTop() - childAt.getMeasuredHeight();
                                    dp = AndroidUtilities.dp(1.0f);
                                    i18 += dp;
                                } else {
                                    ok okVar = eoVar.Y;
                                    if (okVar != null && (childAt == okVar.N1 || childAt == okVar.M1)) {
                                        i18 = org.telegram.messenger.em.v(7.0f, iVar.d(), i18);
                                        i15 -= AndroidUtilities.dp(3.0f);
                                    } else if (childAt == eoVar.w2) {
                                        i18 = org.telegram.messenger.em.v(7.0f, iVar.d(), i18);
                                    } else if (okVar == null || childAt != okVar.e1) {
                                        if (childAt == eoVar.e2 || childAt == eoVar.s2 || childAt == eoVar.f2) {
                                            i19 = this.w0;
                                        } else if (childAt == eoVar.x0 || childAt == eoVar.v0 || childAt == eoVar.X2 || childAt == eoVar.Y2 || childAt == eoVar.Z2) {
                                            i20 = eoVar.za;
                                        } else if (childAt != eoVar.P) {
                                            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                            if (childAt == lVar) {
                                                i18 -= getPaddingTop();
                                                if (eoVar.isInPreviewMode()) {
                                                    dp = AndroidUtilities.dp(1.0f);
                                                    i18 += dp;
                                                }
                                            } else if (childAt == eoVar.t8) {
                                                lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                                i18 = lVar2.getMeasuredHeight();
                                            } else if (childAt != eoVar.b3 && childAt != eoVar.c3 && childAt != eoVar.u0) {
                                                if (childAt instanceof org.telegram.ui.Components.ec0) {
                                                    i18 = AndroidUtilities.statusBarHeight;
                                                } else if (childAt != eoVar.T) {
                                                    if (childAt != eoVar.N3) {
                                                    }
                                                }
                                            }
                                        } else if (okVar.z0()) {
                                            i19 = AndroidUtilities.dp(48.0f);
                                        }
                                        i18 -= i19;
                                    } else {
                                        i18 = org.telegram.messenger.em.v(9.0f, iVar.d(), i18);
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
                    C = (measuredWidth - eoVar.Va) - measuredWidth2;
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
        ek ekVar = eoVar.Y2;
        if (ekVar != null) {
            ekVar.setBackgroundHeight(getMeasuredHeight());
        }
        eoVar.o9();
        eoVar.r9();
        eoVar.Mc(false, false);
        S();
        eoVar.t7();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0531  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int childCount;
        boolean z10;
        int i12;
        int i13;
        org.telegram.ui.Components.pc pcVar;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        int i14;
        org.telegram.ui.ActionBar.l lVar6;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.w0 w0Var;
        TLRPC.User user;
        eo eoVar = this.J0;
        oh.i iVar = eoVar.v;
        eoVar.Dc.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = (size - eoVar.Ua) - eoVar.Va;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
        eh.a aVar = eoVar.L.a;
        if (aVar instanceof eh.b) {
            ((eh.b) aVar).c(i15, size2);
        }
        if (this.y0 != i15) {
            eoVar.F4 = false;
            this.y0 = makeMeasureSpec;
            z13 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
            if (z13 || (user = eoVar.f) == null || !user.self) {
                eoVar.K9 = false;
            } else {
                org.telegram.ui.ActionBar.l5 titleTextView = eoVar.a1.getTitleTextView();
                if (i15 - AndroidUtilities.dp(152.0f) > AndroidUtilities.dp(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    eoVar.K9 = !eoVar.L9;
                } else {
                    eoVar.K9 = false;
                }
            }
            if (eoVar.K9 || eoVar.L9 || UserObject.isBotForumWithEditableTopics(eoVar.f)) {
                rj rjVar = eoVar.a1;
                if (rjVar != null && rjVar.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) eoVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(eoVar.R3 != 3 ? 92.0f : 52.0f);
                }
            } else {
                rj rjVar2 = eoVar.a1;
                if (rjVar2 != null && rjVar2.getLayoutParams() != null) {
                    ((ViewGroup.MarginLayoutParams) eoVar.a1.getLayoutParams()).rightMargin = AndroidUtilities.dp(52.0f);
                }
            }
            if (eoVar.K9) {
                lVar8 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (!lVar8.n0 && (w0Var = eoVar.m0) != null) {
                    w0Var.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = eoVar.h0;
                if (w0Var2 != null) {
                    w0Var2.r(40);
                }
            } else {
                org.telegram.ui.ActionBar.w0 w0Var3 = eoVar.h0;
                if (w0Var3 != null) {
                    w0Var3.K(40);
                }
                org.telegram.ui.ActionBar.w0 w0Var4 = eoVar.m0;
                if (w0Var4 != null) {
                    w0Var4.setVisibility(8);
                }
            }
            lVar7 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if (!lVar7.n0 && (yVar = eoVar.n0) != null) {
                yVar.f((!eoVar.L9 || eoVar.K9) ? 8 : 0);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = eoVar.h0;
            if (w0Var5 != null) {
                TLRPC.UserFull userFull = eoVar.a8;
                if (eoVar.L9) {
                    w0Var5.r(32);
                } else if (userFull != null && userFull.phone_calls_available) {
                    w0Var5.K(32);
                }
            }
            eoVar.F4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        measureChildWithMargins(lVar, makeMeasureSpec, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z14 = this.f + eoVar.oa >= AndroidUtilities.dp(20.0f);
        if (this.x0 != size2) {
            R();
        }
        int keyboardHeight = getKeyboardHeight();
        if (eoVar.pa > 0 && keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            eoVar.oa = eoVar.pa;
        } else if (keyboardHeight <= AndroidUtilities.dp(20.0f)) {
            eoVar.oa = eoVar.Y.t0() ? eoVar.Y.getEmojiPadding() : 0;
        } else {
            eoVar.oa = 0;
        }
        setEmojiKeyboardHeight(eoVar.oa);
        boolean z15 = this.f + eoVar.oa >= AndroidUtilities.dp(20.0f);
        if (MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isRoundVideo() && z14 != z15) {
            for (int i16 = 0; i16 < eoVar.x0.getChildCount(); i16++) {
                View childAt = eoVar.x0.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                    if (messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        eoVar.x0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            eoVar.z0.i1(R, (int) (((((eoVar.x0.getMeasuredHeight() - eoVar.s9) - eoVar.Aa) + ((this.f + eoVar.oa) - r1)) - (z15 ? AndroidUtilities.roundMessageSize : AndroidUtilities.roundPlayingMessageSize(eoVar.C9()))) / 2.0f), false);
                            eoVar.A0.m(R);
                            this.H.g = true;
                            childCount = getChildCount();
                            int i17 = paddingTop;
                            measureChildWithMargins(eoVar.Y, makeMeasureSpec, 0, i11, 0);
                            z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
                            if (!z10 || eoVar.Oa) {
                                this.w0 = 0;
                            } else {
                                this.w0 = eoVar.Y.getMeasuredHeight();
                            }
                            eoVar.za = 0;
                            eoVar.Aa = 0;
                            if (SharedConfig.chatBlurEnabled() && !eoVar.Oa && eoVar.F != null && Build.VERSION.SDK_INT >= 31) {
                                int i18 = eoVar.G;
                                eoVar.za = i18;
                                eoVar.Aa = i18;
                            }
                            for (i12 = 0; i12 < childCount; i12++) {
                                int i19 = -1;
                                View childAt2 = getChildAt(i12);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != eoVar.Y) {
                                    lVar4 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                    if (childAt2 != lVar4) {
                                        if (b0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else {
                                            if (childAt2 == eoVar.x0 || childAt2 == eoVar.v0 || (childAt2 instanceof org.telegram.ui.Cells.ea)) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), eoVar.za + size2 + eoVar.Aa), TLObject.FLAG_30));
                                            } else if (childAt2 == eoVar.P) {
                                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int dp = AndroidUtilities.dp(10.0f);
                                                int i20 = i17 - this.w0;
                                                z12 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
                                                childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(dp, AndroidUtilities.dp((eoVar.Y.z0() ? 48 : 0) + 2) + (i20 - (z12 ? AndroidUtilities.statusBarHeight : 0))), TLObject.FLAG_30));
                                            } else if (childAt2 == eoVar.b3) {
                                                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                                eoVar.b3.setInternalPadding(AndroidUtilities.dp(12.0f) + iVar.d() + ((int) eoVar.tc));
                                                childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                            } else if (childAt2 == eoVar.c3) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - iVar.d()) - ((int) eoVar.tc)) - AndroidUtilities.dp(12.0f), TLObject.FLAG_30));
                                            } else if (childAt2 == eoVar.Q0) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
                                            } else if (eoVar.Y.u0(childAt2)) {
                                                org.telegram.ui.Components.cg cgVar = eoVar.Y.G1;
                                                if (childAt2 == cgVar && cgVar != null) {
                                                    i19 = cgVar.getKeyboardHeight();
                                                }
                                                z11 = ((org.telegram.ui.ActionBar.p2) eoVar).inBubbleMode;
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
                                                hk hkVar = eoVar.I1;
                                                if (childAt2 == hkVar) {
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hkVar.getLayoutParams();
                                                    fg.l1 adapter = eoVar.I1.getAdapter();
                                                    if (adapter.w0 == null || adapter.h0) {
                                                        eoVar.I1.setIgnoreLayout(true);
                                                        layoutParams.height = i17;
                                                        layoutParams.topMargin = 0;
                                                        eoVar.I1.setIgnoreLayout(false);
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                    } else {
                                                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_31));
                                                    }
                                                } else if (childAt2 == eoVar.c9.o(getContext())) {
                                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                    int i21 = i17 + eoVar.za;
                                                    if (keyboardHeight <= AndroidUtilities.dp(20.0f) || getLayoutParams().height >= 0 || eoVar.Oa) {
                                                        wm wmVar = eoVar.c9;
                                                        wmVar.e0 = 0;
                                                        wmVar.x();
                                                    } else {
                                                        i21 += keyboardHeight;
                                                        wm wmVar2 = eoVar.c9;
                                                        wmVar2.e0 = keyboardHeight;
                                                        wmVar2.x();
                                                    }
                                                    childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
                                                } else if (childAt2 instanceof org.telegram.ui.Components.ec0) {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight, TLObject.FLAG_30));
                                                } else if (childAt2 == eoVar.R1) {
                                                    lVar5 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                                    if (lVar5.getVisibility() == 0) {
                                                        lVar6 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                                                        i14 = size2 - lVar6.getMeasuredHeight();
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
                            if (eoVar.E4) {
                                eoVar.F4 = true;
                                eoVar.o9();
                                eoVar.r9();
                                eoVar.E4 = false;
                                wj wjVar = eoVar.x0;
                                wjVar.measure(View.MeasureSpec.makeMeasureSpec(wjVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(eoVar.x0.getMeasuredHeight(), TLObject.FLAG_30));
                                eoVar.F4 = false;
                            }
                            i13 = eoVar.x4;
                            if (i13 != -1) {
                                AndroidUtilities.runOnUIThread(new bi.s(this, i13, 24));
                                eoVar.x4 = -1;
                            }
                            pcVar = org.telegram.ui.Components.pc.w;
                            if (pcVar != null && eoVar.Zb != null) {
                                pcVar.l();
                            }
                            eoVar.S6();
                            this.x0 = size2;
                        }
                    }
                }
            }
        }
        org.telegram.ui.Components.bf bfVar = eoVar.Y.X3;
        AndroidUtilities.cancelRunOnUIThread(bfVar);
        bfVar.run();
        childCount = getChildCount();
        int i172 = paddingTop;
        measureChildWithMargins(eoVar.Y, makeMeasureSpec, 0, i11, 0);
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        if (z10) {
        }
        this.w0 = 0;
        eoVar.za = 0;
        eoVar.Aa = 0;
        if (SharedConfig.chatBlurEnabled()) {
            int i182 = eoVar.G;
            eoVar.za = i182;
            eoVar.Aa = i182;
        }
        while (i12 < childCount) {
        }
        if (eoVar.E4) {
        }
        i13 = eoVar.x4;
        if (i13 != -1) {
        }
        pcVar = org.telegram.ui.Components.pc.w;
        if (pcVar != null) {
            pcVar.l();
        }
        eoVar.S6();
        this.x0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        eo eoVar = this.J0;
        fh.d.c(eoVar.z8, eoVar.fragmentView);
        eoVar.A8.d();
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
        eo eoVar = this.J0;
        eoVar.v9 = i11;
        eoVar.o9();
        eoVar.r9();
    }

    @Override // org.telegram.ui.Components.aw0
    public final void M() {
    }

    @Override // org.telegram.ui.Components.aw0
    public final void X() {
    }

    @Override // org.telegram.ui.Components.aw0
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
