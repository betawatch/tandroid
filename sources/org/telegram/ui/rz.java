package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rz extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public float b;
    public Path c;
    public Object d;
    public Object e;

    public /* synthetic */ rz(Context context) {
        super(context);
    }

    public void a(float f10, float f11) {
        float[] fArr = (float[]) this.e;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        View[] viewArr;
        boolean z4;
        float f10;
        float f11;
        int i12;
        int i13;
        switch (this.a) {
            case 1:
                Path path = this.c;
                qh.c8 c8Var = (qh.c8) this.e;
                View[] viewPages = c8Var.b.getViewPages();
                float f12 = 0.0f;
                this.b = 0.0f;
                int i14 = 0;
                while (i14 < viewPages.length) {
                    View view = viewPages[i14];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        qh.w7 w7Var = (qh.w7) view;
                        float clamp = Utilities.clamp(1.0f - Math.abs(w7Var.getTranslationX() / w7Var.getMeasuredWidth()), 1.0f, f12);
                        float f13 = this.b;
                        org.telegram.ui.Components.sl0 sl0Var = w7Var.f;
                        FrameLayout frameLayout = w7Var.e;
                        f2.j0 j0Var = w7Var.h;
                        float f14 = (j0Var.t || w7Var.a == 0) ? AndroidUtilities.displaySize.y : 0.0f;
                        int i15 = 0;
                        while (i15 < sl0Var.getChildCount()) {
                            View childAt = sl0Var.getChildAt(i15);
                            if (j0Var.t) {
                                float y10 = childAt.getY() + frameLayout.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y10 < f14) {
                                    f14 = AndroidUtilities.lerp(f14, y10, alpha);
                                }
                            } else {
                                if (w7Var.a != 0) {
                                    if (childAt.getTag() instanceof Integer) {
                                        viewArr = viewPages;
                                        if (((Integer) childAt.getTag()).intValue() == 33) {
                                            f11 = childAt.getBottom() + frameLayout.getPaddingTop();
                                            f10 = childAt.getTranslationY();
                                            f14 = f10 + f11;
                                            this.b = (f14 * clamp) + f13;
                                            z4 = ((org.telegram.ui.ActionBar.h3) c8Var).keyboardVisible;
                                            if (z4) {
                                                int i16 = w7Var.a;
                                            }
                                            if (w7Var.getVisibility() == 0) {
                                                w7Var.j();
                                            }
                                        }
                                    } else {
                                        viewArr = viewPages;
                                    }
                                    if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                        f11 = frameLayout.getPaddingTop();
                                        f10 = childAt.getY();
                                        f14 = f10 + f11;
                                        this.b = (f14 * clamp) + f13;
                                        z4 = ((org.telegram.ui.ActionBar.h3) c8Var).keyboardVisible;
                                        if (z4) {
                                        }
                                        if (w7Var.getVisibility() == 0) {
                                        }
                                    }
                                } else if (!(childAt instanceof qh.v7)) {
                                    viewArr = viewPages;
                                    f14 = Math.min(childAt.getY() + frameLayout.getPaddingTop(), f14);
                                }
                                i15++;
                                viewPages = viewArr;
                            }
                            viewArr = viewPages;
                            i15++;
                            viewPages = viewArr;
                        }
                        viewArr = viewPages;
                        this.b = (f14 * clamp) + f13;
                        z4 = ((org.telegram.ui.ActionBar.h3) c8Var).keyboardVisible;
                        if (z4) {
                        }
                        if (w7Var.getVisibility() == 0) {
                        }
                    }
                    i14++;
                    viewPages = viewArr;
                    f12 = 0.0f;
                }
                float d = ((org.telegram.ui.Components.z5) this.d).d(this.b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.b = Math.max(AndroidUtilities.statusBarHeight, this.b) - (AndroidUtilities.statusBarHeight * d);
                RectF rectF = AndroidUtilities.rectTmp;
                i10 = ((org.telegram.ui.ActionBar.h3) c8Var).backgroundPaddingLeft;
                float f15 = this.b;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.h3) c8Var).backgroundPaddingLeft;
                rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
                canvas.drawRoundRect(rectF, lerp, lerp, c8Var.O);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 2:
                Path path2 = this.c;
                th.i0 i0Var = (th.i0) this.e;
                View[] viewPages2 = i0Var.d.getViewPages();
                this.b = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        th.f0 f0Var = (th.f0) view2;
                        this.b = (f0Var.b() * Utilities.clamp(1.0f - Math.abs(f0Var.getTranslationX() / f0Var.getMeasuredWidth()), 1.0f, 0.0f)) + this.b;
                        if (f0Var.getVisibility() == 0) {
                            f0Var.c();
                        }
                    }
                }
                float d10 = ((org.telegram.ui.Components.z5) this.d).d(this.b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.b = (Math.max(AndroidUtilities.statusBarHeight, this.b) - (AndroidUtilities.statusBarHeight * d10)) - (AndroidUtilities.dp(10.0f) * Math.max(i0Var.b.e, i0Var.c.e));
                RectF rectF2 = AndroidUtilities.rectTmp;
                i12 = ((org.telegram.ui.ActionBar.h3) i0Var).backgroundPaddingLeft;
                float f16 = this.b;
                int width2 = getWidth();
                i13 = ((org.telegram.ui.ActionBar.h3) i0Var).backgroundPaddingLeft;
                rectF2.set(i12, f16, width2 - i13, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d10);
                canvas.drawRoundRect(rectF2, lerp2, lerp2, i0Var.M);
                canvas.save();
                path2.rewind();
                path2.addRoundRect(rectF2, lerp2, lerp2, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                ((qh.c8) this.e).dismiss();
                return true;
            case 2:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                ((th.i0) this.e).dismiss();
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                Path path = this.c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.b), getMeasuredHeight());
                a(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.b));
                float[] fArr = (float[]) this.e;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                Paint paint = (Paint) this.d;
                canvas.drawPath(path, paint);
                path.rewind();
                rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.b), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a(AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.b), AndroidUtilities.dp(8.0f));
                path.addRoundRect(rectF, fArr, direction);
                canvas.drawPath(path, paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(th.i0 i0Var, Context context) {
        super(context);
        this.e = i0Var;
        this.d = new org.telegram.ui.Components.z5(this, 250L, org.telegram.ui.Components.pr.h);
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(qh.c8 c8Var, Context context) {
        super(context);
        this.e = c8Var;
        this.d = new org.telegram.ui.Components.z5(this, 250L, org.telegram.ui.Components.pr.h);
        this.c = new Path();
    }
}
