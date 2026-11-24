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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class zn2 extends FrameLayout {
    public final /* synthetic */ byte a = 0;
    public final lm b;
    public float c;
    public final Path d;
    public final /* synthetic */ fx0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn2(eo2 eo2Var, Context context) {
        super(context);
        this.e = eo2Var;
        this.b = new lm(250L, this, s33.h);
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
        lm lmVar = this.b;
        float f5 = 0.0f;
        fx0 fx0Var = this.e;
        float f6 = 1.0f;
        Path path = this.d;
        switch (b) {
            case 0:
                float f7 = 1.0f;
                eo2 eo2Var = (eo2) fx0Var;
                View[] viewPages = eo2Var.n1.getViewPages();
                this.c = 0.0f;
                int i = 0;
                while (i < viewPages.length) {
                    View view = viewPages[i];
                    if (view == null) {
                        f = f7;
                    } else {
                        co2 co2Var = (co2) view;
                        f = f7;
                        this.c = (co2Var.b() * Utilities.i(f7 - Math.abs(co2Var.getTranslationX() / co2Var.getMeasuredWidth()), f, 0.0f)) + this.c;
                        if (co2Var.getVisibility() == 0) {
                            co2Var.c();
                        }
                    }
                    i++;
                    f7 = f;
                }
                float f8 = f7;
                if (this.c > gl.m) {
                    f8 = 0.0f;
                }
                float e = lmVar.e(false, f8);
                float max = (Math.max(gl.m, this.c) - (gl.m * e)) - (gl.L(10.0f) * Math.max(eo2Var.l1.e, eo2Var.m1.e));
                this.c = max;
                RectF rectF = gl.P;
                rectF.set(eo2Var.u0, max, getWidth() - eo2Var.u0, gl.L(8.0f) + getHeight());
                float U1 = gl.U1(e, gl.L(14.0f), 0);
                canvas.drawRoundRect(rectF, U1, U1, eo2Var.J1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                y5b y5bVar = (y5b) fx0Var;
                View[] viewPages2 = y5bVar.l1.getViewPages();
                this.c = 0.0f;
                int i2 = 0;
                while (i2 < viewPages2.length) {
                    View view2 = viewPages2[i2];
                    if (view2 == null) {
                        viewArr = viewPages2;
                        f2 = f6;
                    } else {
                        t5b t5bVar = (t5b) view2;
                        float i3 = Utilities.i(f6 - Math.abs(t5bVar.getTranslationX() / t5bVar.getMeasuredWidth()), f6, f5);
                        float f9 = this.c;
                        o39 o39Var = t5bVar.f;
                        FrameLayout frameLayout2 = t5bVar.e;
                        t26 t26Var = t5bVar.h;
                        f2 = f6;
                        float f10 = (t26Var.t || t5bVar.a == 0) ? gl.q.y : f5;
                        int i4 = 0;
                        while (i4 < o39Var.getChildCount()) {
                            View childAt = o39Var.getChildAt(i4);
                            viewArr = viewPages2;
                            if (t26Var.t) {
                                float y = childAt.getY() + frameLayout2.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y < f10) {
                                    f10 = gl.R1(f10, y, alpha);
                                }
                            } else if (t5bVar.a != 0) {
                                if (childAt.getTag() instanceof Integer) {
                                    frameLayout = frameLayout2;
                                    if (((Integer) childAt.getTag()).intValue() == 33) {
                                        f4 = childAt.getBottom() + frameLayout.getPaddingTop();
                                        f3 = childAt.getTranslationY();
                                        f10 = f3 + f4;
                                        this.c = (f10 * i3) + f9;
                                        if (t5bVar.getVisibility() == 0) {
                                            t5bVar.k();
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
                                    if (t5bVar.getVisibility() == 0) {
                                    }
                                }
                                i4++;
                                viewPages2 = viewArr;
                                frameLayout2 = frameLayout;
                            } else if (!(childAt instanceof s5b)) {
                                f10 = Math.min(childAt.getY() + frameLayout2.getPaddingTop(), f10);
                            }
                            frameLayout = frameLayout2;
                            i4++;
                            viewPages2 = viewArr;
                            frameLayout2 = frameLayout;
                        }
                        viewArr = viewPages2;
                        this.c = (f10 * i3) + f9;
                        if (t5bVar.getVisibility() == 0) {
                        }
                    }
                    i2++;
                    f6 = f2;
                    viewPages2 = viewArr;
                    f5 = 0.0f;
                }
                float e2 = lmVar.e(false, this.c <= ((float) gl.m) ? f6 : 0.0f);
                float max2 = Math.max(gl.m, this.c) - (gl.m * e2);
                this.c = max2;
                RectF rectF2 = gl.P;
                rectF2.set(y5bVar.u0, max2, getWidth() - y5bVar.u0, gl.L(8.0f) + getHeight());
                float U12 = gl.U1(e2, gl.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, U12, U12, y5bVar.L1);
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
        fx0 fx0Var = this.e;
        switch (b) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((eo2) fx0Var).dismiss();
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((y5b) fx0Var).dismiss();
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
    public zn2(y5b y5bVar, Context context) {
        super(context);
        this.e = y5bVar;
        this.b = new lm(250L, this, s33.h);
        this.d = new Path();
    }
}
