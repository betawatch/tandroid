package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d6 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.t5 b;
    public float c;
    public final Path d;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(yh.a0 a0Var, Context context) {
        super(context);
        this.e = a0Var;
        this.b = new org.telegram.ui.Components.t5(this, 250L, gr.h);
        this.d = new Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ab A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float paddingTop;
        float y3;
        switch (this.a) {
            case 0:
                w6 w6Var = (w6) this.e;
                View[] viewPages = w6Var.i1.getViewPages();
                float f7 = 0.0f;
                this.c = 0.0f;
                int i10 = 0;
                while (i10 < viewPages.length) {
                    View view = viewPages[i10];
                    if (view != null) {
                        r6 r6Var = (r6) view;
                        float i11 = Utilities.i(1.0f - Math.abs(r6Var.getTranslationX() / r6Var.getMeasuredWidth()), 1.0f, f7);
                        float f10 = this.c;
                        tk0 tk0Var = r6Var.f;
                        FrameLayout frameLayout = r6Var.e;
                        s4.a0 a0Var = r6Var.h;
                        float f11 = (a0Var.t || r6Var.a == 0) ? org.telegram.messenger.i0.q.y : f7;
                        for (int i12 = 0; i12 < tk0Var.getChildCount(); i12++) {
                            View childAt = tk0Var.getChildAt(i12);
                            if (a0Var.t) {
                                float y10 = childAt.getY() + frameLayout.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y10 < f11) {
                                    f11 = org.telegram.messenger.i0.T1(f11, y10, alpha);
                                }
                            } else if (r6Var.a != 0) {
                                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 33) {
                                    paddingTop = childAt.getBottom() + frameLayout.getPaddingTop();
                                    y3 = childAt.getTranslationY();
                                } else if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                    paddingTop = frameLayout.getPaddingTop();
                                    y3 = childAt.getY();
                                }
                                f11 = y3 + paddingTop;
                                this.c = (f11 * i11) + f10;
                                if (w6Var.d) {
                                    int i13 = r6Var.a;
                                }
                                if (r6Var.getVisibility() != 0) {
                                    r6Var.k();
                                }
                            } else if (!(childAt instanceof q6)) {
                                f11 = Math.min(childAt.getY() + frameLayout.getPaddingTop(), f11);
                            }
                        }
                        this.c = (f11 * i11) + f10;
                        if (w6Var.d) {
                        }
                        if (r6Var.getVisibility() != 0) {
                        }
                    }
                    i10++;
                    f7 = 0.0f;
                }
                float e = this.b.e(false, this.c <= ((float) org.telegram.messenger.i0.m) ? 1.0f : 0.0f);
                float max = Math.max(org.telegram.messenger.i0.m, this.c) - (org.telegram.messenger.i0.m * e);
                this.c = max;
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(w6Var.t0, max, getWidth() - w6Var.t0, org.telegram.messenger.i0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(14.0f), 0);
                canvas.drawRoundRect(rectF, W1, W1, w6Var.I1);
                canvas.save();
                Path path = this.d;
                path.rewind();
                path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                yh.a0 a0Var2 = (yh.a0) this.e;
                View[] viewPages2 = a0Var2.k1.getViewPages();
                this.c = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        yh.y yVar = (yh.y) view2;
                        this.c = (yVar.b() * Utilities.i(1.0f - Math.abs(yVar.getTranslationX() / yVar.getMeasuredWidth()), 1.0f, 0.0f)) + this.c;
                        if (yVar.getVisibility() == 0) {
                            yVar.c();
                        }
                    }
                }
                float e7 = this.b.e(false, this.c <= ((float) org.telegram.messenger.i0.m) ? 1.0f : 0.0f);
                float max2 = (Math.max(org.telegram.messenger.i0.m, this.c) - (org.telegram.messenger.i0.m * e7)) - (org.telegram.messenger.i0.L(10.0f) * Math.max(a0Var2.i1.e, a0Var2.j1.e));
                this.c = max2;
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(a0Var2.t0, max2, getWidth() - a0Var2.t0, org.telegram.messenger.i0.L(8.0f) + getHeight());
                float W12 = org.telegram.messenger.i0.W1(e7, org.telegram.messenger.i0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W12, W12, a0Var2.G1);
                canvas.save();
                Path path2 = this.d;
                path2.rewind();
                path2.addRoundRect(rectF2, W12, W12, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((w6) this.e).dismiss();
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((yh.a0) this.e).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(w6 w6Var, Context context) {
        super(context);
        this.e = w6Var;
        this.b = new org.telegram.ui.Components.t5(this, 250L, gr.h);
        this.d = new Path();
    }
}
