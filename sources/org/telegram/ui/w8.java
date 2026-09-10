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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w8 extends org.telegram.ui.Components.aw0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ Object x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(Object obj, Context context, int i10) {
        super(context, null);
        this.w0 = i10;
        this.x0 = obj;
    }

    @Override // org.telegram.ui.Components.aw0
    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.w0) {
            case 0:
                k9 k9Var = (k9) this.x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && k9Var.Z != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    k9Var.Z.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                    contactsActivity.u0.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                k91 k91Var = (k91) this.x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && k91Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    k91Var.W.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                fb1 fb1Var = (fb1) this.x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && fb1Var.D0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    fb1Var.D0.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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

    @Override // org.telegram.ui.Components.aw0
    public boolean P() {
        switch (this.w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public boolean Q() {
        switch (this.w0) {
            case 2:
                return false;
            default:
                return super.Q();
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.w0) {
            case 0:
                k9 k9Var = (k9) this.x0;
                eh.d dVar = k9Var.a0;
                eh.d dVar2 = k9Var.Z;
                zg.e eVar = k9Var.Y;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    k9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(k9Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.c();
                    }
                    if (dVar != null && !dVar.n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(k9Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a10, -2);
                        }
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                eh.d dVar3 = contactsActivity.v0;
                eh.d dVar4 = contactsActivity.u0;
                zg.e eVar2 = contactsActivity.t0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -3);
                        }
                        dVar4.c();
                    }
                    if (dVar3 != null && !dVar3.n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a12, -2);
                        }
                        dVar3.c();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 7:
                k91 k91Var = (k91) this.x0;
                eh.d dVar5 = k91Var.X;
                eh.d dVar6 = k91Var.W;
                zg.e eVar3 = k91Var.V;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    k91Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(k91Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -3);
                        }
                        dVar6.c();
                    }
                    if (dVar5 != null && !dVar5.n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(k91Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a14, -2);
                        }
                        dVar5.c();
                    }
                }
                super.dispatchDraw(canvas);
                if (!k91Var.M) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, k91Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6), k91Var.S);
                    break;
                }
                break;
            case 8:
                fb1 fb1Var = (fb1) this.x0;
                eh.d dVar7 = fb1Var.E0;
                eh.d dVar8 = fb1Var.D0;
                zg.e eVar4 = fb1Var.C0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    fb1.W(fb1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(fb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a15, -3);
                        }
                        dVar8.c();
                    }
                    if (dVar7 != null && !dVar7.n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(fb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a16, -2);
                        }
                        dVar7.c();
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
                if (motionEvent.getY() < ((org.telegram.ui.Components.yb0) this.x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.aw0, org.telegram.ui.ActionBar.a6
    public void e() {
        switch (this.w0) {
            case 7:
                ((k91) this.x0).p0();
                break;
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public Drawable getNewDrawable() {
        switch (this.w0) {
            case 1:
                Drawable d = ((bo) ((org.telegram.ui.Components.yb0) this.x0).c0.F).d();
                if (d == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.aw0
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.w0) {
            case 2:
                return ((org.telegram.ui.Components.n01) this.x0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
                    xb0Var.J.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.l lVar9;
        org.telegram.ui.ActionBar.l lVar10;
        org.telegram.ui.ActionBar.l lVar11;
        switch (this.w0) {
            case 0:
                k9 k9Var = (k9) this.x0;
                lVar = ((org.telegram.ui.ActionBar.p2) k9Var).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k9Var.M.getLayoutParams();
                lVar2 = ((org.telegram.ui.ActionBar.p2) k9Var).actionBar;
                marginLayoutParams.topMargin = lVar2.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) k9Var.b.getLayoutParams();
                lVar3 = ((org.telegram.ui.ActionBar.p2) k9Var).actionBar;
                marginLayoutParams2.topMargin = lVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) k9Var.r.getLayoutParams();
                lVar4 = ((org.telegram.ui.ActionBar.p2) k9Var).actionBar;
                marginLayoutParams3.topMargin = lVar4.getMeasuredHeight();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.n01) this.x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                lVar5 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                measureChildWithMargins(lVar5, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams();
                lVar6 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                marginLayoutParams4.topMargin = AndroidUtilities.dp(48.0f) + lVar6.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) contactsActivity.Y.getLayoutParams();
                lVar7 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                marginLayoutParams5.topMargin = lVar7.getMeasuredHeight();
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
                xg0 xg0Var = (xg0) this.x0;
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) xg0Var.N.getLayoutParams();
                int dp = xg0Var.h1() ? AndroidUtilities.dp(226.0f) : 0;
                if (xg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    dp -= R();
                }
                org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
                if (pcVar == null || !pcVar.l) {
                    marginLayoutParams6.bottomMargin = AndroidUtilities.dp(14.0f) + dp;
                } else {
                    super.onMeasure(i10, i11);
                    marginLayoutParams6.bottomMargin = org.telegram.messenger.em.D(10.0f, org.telegram.ui.Components.pc.w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), dp);
                }
                int i13 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) xg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) xg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) xg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                TextView textView = xg0Var.f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                }
                if (R() > AndroidUtilities.dp(20.0f) && xg0Var.c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !xg0Var.a0) {
                    ValueAnimator valueAnimator = xg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    xg0Var.c.setVisibility(8);
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
                wh.h4 h4Var = (wh.h4) this.x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h4Var.y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar8 = ((org.telegram.ui.ActionBar.p2) h4Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (lVar8.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar9 = ((org.telegram.ui.ActionBar.p2) h4Var).actionBar;
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + (lVar9.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h4Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar10 = ((org.telegram.ui.ActionBar.p2) h4Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (lVar10.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) h4Var.w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                lVar11 = ((org.telegram.ui.ActionBar.p2) h4Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (lVar11.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i10, i11);
                break;
        }
    }
}
