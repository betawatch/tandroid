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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class x31 extends FrameLayout {
    public final org.telegram.ui.Components.d6 a;
    public float b;
    public final Path c;
    public Boolean d;
    public final /* synthetic */ c41 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(c41 c41Var, Context context) {
        super(context);
        this.e = c41Var;
        this.a = new org.telegram.ui.Components.d6(this, 250L, org.telegram.ui.Components.qr.h);
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        org.telegram.ui.Components.k61 k61Var;
        View[] viewArr;
        org.telegram.ui.Components.w51 G;
        c41 c41Var = this.e;
        View[] viewPages = c41Var.b.getViewPages();
        float f7 = 0.0f;
        this.b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                b41 b41Var = (b41) view;
                FrameLayout frameLayout = b41Var.e;
                org.telegram.ui.Components.s61 s61Var = b41Var.f;
                float clamp = Utilities.clamp(1.0f - Math.abs(b41Var.getTranslationX() / b41Var.getMeasuredWidth()), 1.0f, f7);
                float f10 = this.b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = s61Var.getChildCount();
                    k61Var = s61Var.Y2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = s61Var.getChildAt(i13);
                    s61Var.X2.getClass();
                    int H = s4.o0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < k61Var.x.size() && (G = k61Var.G(H)) != null && G.a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.b = (paddingTop * clamp) + f10;
                if (b41Var.getVisibility() == 0) {
                    t5 t5Var = b41Var.h;
                    float f11 = -t5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= s61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = s61Var.getChildAt(i14);
                        s61Var.X2.getClass();
                        if (k61Var.G(s4.o0.H(childAt2)).a == 28) {
                            f11 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    t5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f11));
                }
            }
            i12++;
            viewPages = viewArr;
            f7 = 0.0f;
        }
        float d = this.a.d(this.b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
        float f12 = AndroidUtilities.statusBarHeight;
        float f13 = f12 * d;
        this.b = Math.max(f12, this.b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) c41Var).backgroundPaddingLeft;
        float f14 = this.b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) c41Var).backgroundPaddingLeft;
        rectF.set(i10, f14, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, c41Var.c);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        boolean z10 = f13 > ((float) AndroidUtilities.statusBarHeight) / 2.0f;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = AndroidUtilities.computePerceivedBrightness(c41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(c41Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(c41Var.getWindow(), z11);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }
}
