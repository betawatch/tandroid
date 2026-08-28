package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s21 extends FrameLayout {
    public final org.telegram.ui.Components.y5 a;
    public float b;
    public final Path c;
    public Boolean d;
    public final /* synthetic */ y21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(y21 y21Var, Context context) {
        super(context);
        this.e = y21Var;
        this.a = new org.telegram.ui.Components.y5(this, 250L, org.telegram.ui.Components.gr.h);
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        int i10;
        org.telegram.ui.Components.z41 z41Var;
        View[] viewArr;
        org.telegram.ui.Components.l41 G;
        y21 y21Var = this.e;
        View[] viewPages = y21Var.b.getViewPages();
        float f10 = 0.0f;
        this.b = 0.0f;
        int length = viewPages.length;
        int i11 = 0;
        while (i11 < length) {
            View view = viewPages[i11];
            if (view == null) {
                viewArr = viewPages;
            } else {
                x21 x21Var = (x21) view;
                FrameLayout frameLayout = x21Var.e;
                org.telegram.ui.Components.i51 i51Var = x21Var.f;
                float clamp = Utilities.clamp(1.0f - Math.abs(x21Var.getTranslationX() / x21Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.b;
                float paddingTop = frameLayout.getPaddingTop();
                int i12 = 0;
                while (true) {
                    int childCount = i51Var.getChildCount();
                    z41Var = i51Var.U2;
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = i51Var.getChildAt(i12);
                    i51Var.T2.getClass();
                    int H = f2.z0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < z41Var.x.size() && (G = z41Var.G(H)) != null && G.a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i12++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.b = (paddingTop * clamp) + f11;
                if (x21Var.getVisibility() == 0) {
                    bh.g gVar = x21Var.h;
                    float f12 = -gVar.getHeight();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i51Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = i51Var.getChildAt(i13);
                        i51Var.T2.getClass();
                        if (z41Var.G(f2.z0.H(childAt2)).a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i13++;
                    }
                    gVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i11++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        float d = this.a.d(this.b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.b = Math.max(f13, this.b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i9 = ((org.telegram.ui.ActionBar.f3) y21Var).backgroundPaddingLeft;
        float f15 = this.b;
        int width = getWidth();
        i10 = ((org.telegram.ui.ActionBar.f3) y21Var).backgroundPaddingLeft;
        rectF.set(i9, f15, width - i10, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, y21Var.c);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        boolean z10 = f14 > ((float) AndroidUtilities.statusBarHeight) / 2.0f;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = AndroidUtilities.computePerceivedBrightness(y21Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(y21Var.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(y21Var.getWindow(), z11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.e.dismiss();
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }
}
