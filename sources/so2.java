// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class so2 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final mm b;
    public float c;
    public final Path d;
    public final /* synthetic */ nx0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so2(xo2 xo2Var, Context context) {
        super(context);
        this.e = xo2Var;
        this.b = new mm(250L, this, k43.h);
        this.d = new Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        View[] viewArr;
        FrameLayout frameLayout;
        float f3;
        float f4;
        byte b = this.a;
        mm mmVar = this.b;
        float f5 = 0.0f;
        nx0 nx0Var = this.e;
        float f6 = 1.0f;
        Path path = this.d;
        switch (b) {
            case 0:
                float f7 = 1.0f;
                xo2 xo2Var = (xo2) nx0Var;
                View[] viewPages = xo2Var.n1.getViewPages();
                this.c = 0.0f;
                int i = 0;
                while (i < viewPages.length) {
                    View view = viewPages[i];
                    if (view == null) {
                        f = f7;
                    } else {
                        vo2 vo2Var = (vo2) view;
                        f = f7;
                        this.c = (vo2Var.b() * Utilities.i(f7 - Math.abs(vo2Var.getTranslationX() / vo2Var.getMeasuredWidth()), f, 0.0f)) + this.c;
                        if (vo2Var.getVisibility() == 0) {
                            vo2Var.c();
                        }
                    }
                    i++;
                    f7 = f;
                }
                float f8 = f7;
                if (this.c > hl.m) {
                    f8 = 0.0f;
                }
                float e = mmVar.e(false, f8);
                float max = (Math.max(hl.m, this.c) - (hl.m * e)) - (hl.L(10.0f) * Math.max(xo2Var.l1.e, xo2Var.m1.e));
                this.c = max;
                RectF rectF = hl.P;
                rectF.set(xo2Var.u0, max, getWidth() - xo2Var.u0, hl.L(8.0f) + getHeight());
                float U1 = hl.U1(e, hl.L(14.0f), 0);
                canvas.drawRoundRect(rectF, U1, U1, xo2Var.J1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                w9b w9bVar = (w9b) nx0Var;
                View[] viewPages2 = w9bVar.l1.getViewPages();
                this.c = 0.0f;
                int i2 = 0;
                while (i2 < viewPages2.length) {
                    View view2 = viewPages2[i2];
                    if (view2 == null) {
                        viewArr = viewPages2;
                        f2 = f6;
                    } else {
                        r9b r9bVar = (r9b) view2;
                        float i3 = Utilities.i(f6 - Math.abs(r9bVar.getTranslationX() / r9bVar.getMeasuredWidth()), f6, f5);
                        float f9 = this.c;
                        d79 d79Var = r9bVar.f;
                        FrameLayout frameLayout2 = r9bVar.e;
                        x46 x46Var = r9bVar.h;
                        f2 = f6;
                        float f10 = (x46Var.t || r9bVar.a == 0) ? hl.q.y : f5;
                        int i4 = 0;
                        while (i4 < d79Var.getChildCount()) {
                            View childAt = d79Var.getChildAt(i4);
                            viewArr = viewPages2;
                            if (x46Var.t) {
                                float y = childAt.getY() + frameLayout2.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y < f10) {
                                    f10 = hl.R1(f10, y, alpha);
                                }
                            } else if (r9bVar.a != 0) {
                                if (childAt.getTag() instanceof Integer) {
                                    frameLayout = frameLayout2;
                                    if (((Integer) childAt.getTag()).intValue() == 33) {
                                        f4 = childAt.getBottom() + frameLayout.getPaddingTop();
                                        f3 = childAt.getTranslationY();
                                        f10 = f3 + f4;
                                        this.c = (f10 * i3) + f9;
                                        if (r9bVar.getVisibility() == 0) {
                                            r9bVar.k();
                                        }
                                    }
                                } else {
                                    frameLayout = frameLayout2;
                                }
                                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                    f4 = frameLayout.getPaddingTop();
                                    f3 = childAt.getY();
                                    f10 = f3 + f4;
                                    this.c = (f10 * i3) + f9;
                                    if (r9bVar.getVisibility() == 0) {
                                    }
                                }
                                i4++;
                                viewPages2 = viewArr;
                                frameLayout2 = frameLayout;
                            } else if (!(childAt instanceof q9b)) {
                                f10 = Math.min(childAt.getY() + frameLayout2.getPaddingTop(), f10);
                            }
                            frameLayout = frameLayout2;
                            i4++;
                            viewPages2 = viewArr;
                            frameLayout2 = frameLayout;
                        }
                        viewArr = viewPages2;
                        this.c = (f10 * i3) + f9;
                        if (r9bVar.getVisibility() == 0) {
                        }
                    }
                    i2++;
                    f6 = f2;
                    viewPages2 = viewArr;
                    f5 = 0.0f;
                }
                float e2 = mmVar.e(false, this.c <= ((float) hl.m) ? f6 : 0.0f);
                float max2 = Math.max(hl.m, this.c) - (hl.m * e2);
                this.c = max2;
                RectF rectF2 = hl.P;
                rectF2.set(w9bVar.u0, max2, getWidth() - w9bVar.u0, hl.L(8.0f) + getHeight());
                float U12 = hl.U1(e2, hl.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, U12, U12, w9bVar.L1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, U12, U12, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        nx0 nx0Var = this.e;
        switch (b) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((xo2) nx0Var).dismiss();
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((w9b) nx0Var).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so2(w9b w9bVar, Context context) {
        super(context);
        this.e = w9bVar;
        this.b = new mm(250L, this, k43.h);
        this.d = new Path();
    }
}
