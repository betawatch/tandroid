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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class y8 extends org.telegram.ui.Components.mw0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ Object x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(Object obj, Context context, int i10) {
        super(context, null);
        this.w0 = i10;
        this.x0 = obj;
    }

    @Override // org.telegram.ui.Components.mw0
    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.w0) {
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.u0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    contactsActivity.u0.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
            default:
                super.J(canvas, f7, rect, paint, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public boolean P() {
        switch (this.w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public boolean Q() {
        switch (this.w0) {
            case 2:
                return false;
            default:
                return super.Q();
        }
    }

    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        li.p pVar;
        switch (this.w0) {
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                fh.d dVar = contactsActivity.v0;
                fh.d dVar2 = contactsActivity.u0;
                ah.i iVar = contactsActivity.t0;
                if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
                    contactsActivity.g0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.r) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar.b(a2, -3);
                        }
                        dVar2.c();
                    }
                    if (dVar != null && !dVar.r) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar.b(a10, -2);
                        }
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 7:
                super.dispatchDraw(canvas);
                y81 y81Var = (y81) this.x0;
                pVar = ((org.telegram.ui.ActionBar.n2) y81Var).glassEngine;
                pVar.g();
                if (!y81Var.L) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, y81Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6), y81Var.T);
                    break;
                }
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
                if (motionEvent.getY() < ((org.telegram.ui.Components.cc0) this.x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.mw0, org.telegram.ui.ActionBar.y5
    public void e() {
        switch (this.w0) {
            case 7:
                ((y81) this.x0).n0();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public Drawable getNewDrawable() {
        switch (this.w0) {
            case 1:
                Drawable d = ((wn) ((org.telegram.ui.Components.cc0) this.x0).c0.F).d();
                if (d == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.mw0
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        switch (this.w0) {
            case 2:
                return ((org.telegram.ui.Components.x01) this.x0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // org.telegram.ui.Components.mw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
                ((m9) this.x0).b0();
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
                vb0 vb0Var = (vb0) this.x0;
                int scrollY = vb0Var.J.getScrollY();
                super.onLayout(z10, i10, i11, i12, i13);
                if (scrollY != vb0Var.J.getScrollY()) {
                    vb0Var.J.setTranslationY(r11.getScrollY() - scrollY);
                    vb0Var.J.animate().cancel();
                    vb0Var.J.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
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
                                } else if (childAt == popupNotificationActivity.b.N1) {
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
        switch (this.w0) {
            case 0:
                ((m9) this.x0).c0();
                super.onMeasure(i10, i11);
                break;
            case 1:
            case 7:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.x01) this.x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.x0;
                kVar = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) contactsActivity.Y.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                break;
            case 4:
                vb0 vb0Var = (vb0) this.x0;
                super.onMeasure(i10, i11);
                R();
                int i12 = this.f;
                if (i12 != 0 && i12 < AndroidUtilities.dp(20.0f)) {
                    vb0Var.F.clearFocus();
                    vb0Var.K.clearFocus();
                }
                vb0Var.H.setVisibility(this.f > AndroidUtilities.dp(20.0f) ? 8 : 0);
                break;
            case 5:
                ug0 ug0Var = (ug0) this.x0;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ug0Var.N.getLayoutParams();
                int dp = ug0Var.h1() ? AndroidUtilities.dp(226.0f) : 0;
                if (ug0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    dp -= R();
                }
                org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.w;
                if (rcVar == null || !rcVar.l) {
                    marginLayoutParams3.bottomMargin = AndroidUtilities.dp(14.0f) + dp;
                } else {
                    super.onMeasure(i10, i11);
                    marginLayoutParams3.bottomMargin = org.telegram.messenger.bi.D(10.0f, org.telegram.ui.Components.rc.w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), dp);
                }
                int i13 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) ug0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) ug0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) ug0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                TextView textView = ug0Var.f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                }
                if (R() > AndroidUtilities.dp(20.0f) && ug0Var.c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !ug0Var.a0) {
                    ValueAnimator valueAnimator = ug0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ug0Var.c.setVisibility(8);
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
                        } else if (childAt == popupNotificationActivity.b.N1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i14), TLObject.FLAG_30));
                        }
                    }
                }
                break;
            case 8:
                xh.i4 i4Var = (xh.i4) this.x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i4Var.y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar4 = ((org.telegram.ui.ActionBar.n2) i4Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) i4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar5 = ((org.telegram.ui.ActionBar.n2) i4Var).actionBar;
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + (kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i4Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar6 = ((org.telegram.ui.ActionBar.n2) i4Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (kVar6.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) i4Var.w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar7 = ((org.telegram.ui.ActionBar.n2) i4Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (kVar7.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i10, i11);
                break;
        }
    }
}
