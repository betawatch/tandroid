package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w8 extends org.telegram.ui.Components.ov0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ Object x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(Object obj, Context context, int i10) {
        super(context, null);
        this.w0 = i10;
        this.x0 = obj;
    }

    @Override // org.telegram.ui.Components.ov0
    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.w0) {
            case 0:
                k9 k9Var = (k9) this.x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && k9Var.Z != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    k9Var.Z.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    break;
                } else {
                    canvas.drawRect(rect, paint);
                    break;
                }
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.u0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    contactsActivity.u0.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha2 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha2);
                    break;
                } else {
                    canvas.drawRect(rect, paint);
                    break;
                }
            case 7:
                i91 i91Var = (i91) this.x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && i91Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    i91Var.W.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha3 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha3);
                    break;
                } else {
                    canvas.drawRect(rect, paint);
                    break;
                }
            case 8:
                bb1 bb1Var = (bb1) this.x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && bb1Var.D0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    bb1Var.D0.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha4 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha4);
                    break;
                } else {
                    canvas.drawRect(rect, paint);
                    break;
                }
            default:
                super.J(canvas, f7, rect, paint, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ov0
    public boolean P() {
        switch (this.w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override // org.telegram.ui.Components.ov0
    public boolean Q() {
        switch (this.w0) {
            case 2:
                return false;
            default:
                return super.Q();
        }
    }

    @Override // org.telegram.ui.Components.ov0, org.telegram.ui.ActionBar.z5
    public void d() {
        switch (this.w0) {
            case 7:
                ((i91) this.x0).p0();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.w0) {
            case 0:
                k9 k9Var = (k9) this.x0;
                gh.d dVar = k9Var.a0;
                gh.d dVar2 = k9Var.Z;
                bh.f fVar = k9Var.Y;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    k9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(k9Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar.b(a2, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(k9Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar.b(a10, -2);
                        }
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                gh.d dVar3 = contactsActivity.v0;
                gh.d dVar4 = contactsActivity.u0;
                bh.f fVar2 = contactsActivity.t0;
                if (Build.VERSION.SDK_INT >= 31 && fVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar2.b(a11, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar2.b(a12, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 7:
                i91 i91Var = (i91) this.x0;
                gh.d dVar5 = i91Var.X;
                gh.d dVar6 = i91Var.W;
                bh.f fVar3 = i91Var.V;
                if (Build.VERSION.SDK_INT >= 31 && fVar3 != null) {
                    i91Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(i91Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar3.b(a13, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(i91Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar3.b(a14, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!i91Var.M) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, i91Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6), i91Var.S);
                    break;
                }
                break;
            case 8:
                bb1 bb1Var = (bb1) this.x0;
                gh.d dVar7 = bb1Var.E0;
                gh.d dVar8 = bb1Var.D0;
                bh.f fVar4 = bb1Var.C0;
                if (Build.VERSION.SDK_INT >= 31 && fVar4 != null) {
                    bb1.W(bb1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar4.b(a15, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar4.b(a16, -2);
                        }
                        dVar7.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.w0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.qb0) this.x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.ov0
    public Drawable getNewDrawable() {
        switch (this.w0) {
            case 1:
                Drawable d = ((ao) ((org.telegram.ui.Components.qb0) this.x0).c0.F).d();
                if (d == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.ov0
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.w0) {
            case 2:
                return ((org.telegram.ui.Components.a01) this.x0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        switch (this.w0) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                k9 k9Var = (k9) this.x0;
                k9Var.g0();
                k9Var.h0();
                break;
            case 1:
            case 2:
            case 5:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                contactsActivity.h0();
                contactsActivity.k0();
                contactsActivity.m0();
                contactsActivity.i0();
                ContactsActivity.d0(contactsActivity);
                break;
            case 4:
                xb0 xb0Var = (xb0) this.x0;
                int scrollY = xb0Var.J.getScrollY();
                super.onLayout(z10, i10, i11, i12, i13);
                if (scrollY != xb0Var.J.getScrollY()) {
                    xb0Var.J.setTranslationY(r11.getScrollY() - scrollY);
                    xb0Var.J.animate().cancel();
                    xb0Var.J.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                    break;
                }
                break;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.x0;
                int childCount = getChildCount();
                int emojiPadding = R() <= AndroidUtilities.dp(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i21 = layoutParams.gravity;
                        if (i21 == -1) {
                            i21 = 51;
                        }
                        int i22 = i21 & 112;
                        int i23 = i21 & 7;
                        if (i23 == 1) {
                            i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        } else if (i23 != 5) {
                            i16 = layoutParams.leftMargin;
                            if (i22 != 16) {
                                i17 = ((((i13 - emojiPadding) - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                                i18 = layoutParams.bottomMargin;
                            } else if (i22 != 80) {
                                i19 = layoutParams.topMargin;
                                if (popupNotificationActivity.b.u0(childAt)) {
                                    int measuredHeight2 = getMeasuredHeight();
                                    if (emojiPadding != 0) {
                                        measuredHeight2 -= emojiPadding;
                                    }
                                    i19 = measuredHeight2;
                                } else if (childAt == popupNotificationActivity.b.M1) {
                                    i19 = ((popupNotificationActivity.E.getMeasuredHeight() + popupNotificationActivity.E.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    i16 = ((popupNotificationActivity.E.getMeasuredWidth() + popupNotificationActivity.E.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                }
                                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                            } else {
                                i17 = ((i13 - emojiPadding) - i11) - measuredHeight;
                                i18 = layoutParams.bottomMargin;
                            }
                            i19 = i17 - i18;
                            if (popupNotificationActivity.b.u0(childAt)) {
                            }
                            childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                        } else {
                            i14 = i12 - measuredWidth;
                            i15 = layoutParams.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i22 != 16) {
                        }
                        i19 = i17 - i18;
                        if (popupNotificationActivity.b.u0(childAt)) {
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    }
                }
                S();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.ActionBar.k kVar11;
        switch (this.w0) {
            case 0:
                k9 k9Var = (k9) this.x0;
                kVar = ((org.telegram.ui.ActionBar.n2) k9Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k9Var.M.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.n2) k9Var).actionBar;
                marginLayoutParams.topMargin = kVar2.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) k9Var.b.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.n2) k9Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) k9Var.r.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.n2) k9Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                k9Var.i0();
                super.onMeasure(i10, i11);
                break;
            case 1:
            case 7:
            case 8:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.a01) this.x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                kVar5 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                measureChildWithMargins(kVar5, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                marginLayoutParams4.topMargin = AndroidUtilities.dp(48.0f) + kVar6.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) contactsActivity.Y.getLayoutParams();
                kVar7 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                marginLayoutParams5.topMargin = kVar7.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                break;
            case 4:
                xb0 xb0Var = (xb0) this.x0;
                super.onMeasure(i10, i11);
                R();
                int i12 = this.f;
                if (i12 != 0 && i12 < AndroidUtilities.dp(20.0f)) {
                    xb0Var.F.clearFocus();
                    xb0Var.K.clearFocus();
                }
                xb0Var.H.setVisibility(this.f > AndroidUtilities.dp(20.0f) ? 8 : 0);
                break;
            case 5:
                wg0 wg0Var = (wg0) this.x0;
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) wg0Var.N.getLayoutParams();
                int dp = wg0Var.h1() ? AndroidUtilities.dp(226.0f) : 0;
                if (wg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    dp -= R();
                }
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
                if (qcVar == null || !qcVar.l) {
                    marginLayoutParams6.bottomMargin = AndroidUtilities.dp(14.0f) + dp;
                } else {
                    super.onMeasure(i10, i11);
                    marginLayoutParams6.bottomMargin = org.telegram.messenger.wl.D(10.0f, org.telegram.ui.Components.qc.w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), dp);
                }
                int i13 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) wg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) wg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) wg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                TextView textView = wg0Var.f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                }
                if (R() > AndroidUtilities.dp(20.0f) && wg0Var.c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !wg0Var.a0) {
                    ValueAnimator valueAnimator = wg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    wg0Var.c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                break;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.x0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i14 = size2;
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.M1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i14), TLObject.FLAG_30));
                        }
                    }
                }
                break;
            case 9:
                yh.g4 g4Var = (yh.g4) this.x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g4Var.y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar8 = ((org.telegram.ui.ActionBar.n2) g4Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar8.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar9 = ((org.telegram.ui.ActionBar.n2) g4Var).actionBar;
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + (kVar9.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) g4Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar10 = ((org.telegram.ui.ActionBar.n2) g4Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (kVar10.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) g4Var.w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar11 = ((org.telegram.ui.ActionBar.n2) g4Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (kVar11.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i10, i11);
                break;
        }
    }
}
