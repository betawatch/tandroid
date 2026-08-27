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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r21 extends FrameLayout {
    public final org.telegram.ui.Components.y5 a;
    public float b;
    public final Path c;
    public Boolean d;
    public final /* synthetic */ x21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(x21 x21Var, Context context) {
        super(context);
        this.e = x21Var;
        this.a = new org.telegram.ui.Components.y5(this, 250L, org.telegram.ui.Components.er.h);
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        org.telegram.ui.Components.b51 b51Var;
        View[] viewArr;
        org.telegram.ui.Components.n41 G;
        x21 x21Var = this.e;
        View[] viewPages = x21Var.b.getViewPages();
        float f10 = 0.0f;
        this.b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                w21 w21Var = (w21) view;
                FrameLayout frameLayout = w21Var.e;
                org.telegram.ui.Components.k51 k51Var = w21Var.f;
                float clamp = Utilities.clamp(1.0f - Math.abs(w21Var.getTranslationX() / w21Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = k51Var.getChildCount();
                    b51Var = k51Var.U2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = k51Var.getChildAt(i13);
                    k51Var.T2.getClass();
                    int H = f2.x0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < b51Var.x.size() && (G = b51Var.G(H)) != null && G.a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.b = (paddingTop * clamp) + f11;
                if (w21Var.getVisibility() == 0) {
                    ag.w wVar = w21Var.h;
                    float f12 = -wVar.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= k51Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = k51Var.getChildAt(i14);
                        k51Var.T2.getClass();
                        if (b51Var.G(f2.x0.H(childAt2)).a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    wVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        float d = this.a.d(this.b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.b = Math.max(f13, this.b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) x21Var).backgroundPaddingLeft;
        float f15 = this.b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) x21Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, x21Var.c);
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
            boolean z11 = AndroidUtilities.computePerceivedBrightness(x21Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(x21Var.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(x21Var.getWindow(), z11);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }
}
