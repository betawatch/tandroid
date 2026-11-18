package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y50 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public float b;
    public final Path c;
    public final Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(a60 a60Var, Context context) {
        super(context);
        this.f = a60Var;
        this.c = new Path();
        this.e = new RectF();
        this.b = -1.0f;
        fh.g c10 = a60Var.getBaseSimpleGlass().c.c(this, null, false);
        c10.p(c8.i0.m(a60Var.getResourceProvider()));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(a60Var.e, c8.ma.c(-1.0f, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View[] viewArr;
        org.telegram.ui.Components.l41 G;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.e;
                fh.g gVar = (fh.g) this.d;
                float f10 = ((a60) this.f).a.f;
                if (f10 >= 1.0f) {
                    float min = Math.min(1.0f, f10 / org.telegram.messenger.g0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.g0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f10);
                    float min2 = Math.min(f10 / 2.0f, org.telegram.messenger.g0.L(22.0f));
                    if (Math.abs(min2 - this.b) > 0.5f) {
                        this.b = min2;
                        gVar.r(min2);
                    }
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    gVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    gVar.setAlpha((int) (min * 255.0f));
                    gVar.draw(canvas);
                    canvas.save();
                    Path path = this.c;
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                qy0 qy0Var = (qy0) this.f;
                View[] viewPages = qy0Var.m1.getViewPages();
                float f11 = 0.0f;
                this.b = 0.0f;
                int length = viewPages.length;
                int i7 = 0;
                while (i7 < length) {
                    View view = viewPages[i7];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        py0 py0Var = (py0) view;
                        FrameLayout frameLayout = py0Var.e;
                        org.telegram.ui.Components.e51 e51Var = py0Var.f;
                        float i10 = Utilities.i(1.0f - Math.abs(py0Var.getTranslationX() / py0Var.getMeasuredWidth()), 1.0f, f11);
                        float f12 = this.b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i11 = 0;
                        while (true) {
                            int childCount = e51Var.getChildCount();
                            org.telegram.ui.Components.z41 z41Var = e51Var.g3;
                            if (i11 < childCount) {
                                View childAt = e51Var.getChildAt(i11);
                                e51Var.f3.getClass();
                                int H = v4.p0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < z41Var.E.size() && (G = z41Var.G(H)) != null && G.a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i11++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.b = (paddingTop * i10) + f12;
                                if (py0Var.getVisibility() == 0) {
                                    di.n4 n4Var = py0Var.h;
                                    float f13 = -n4Var.getHeight();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < e51Var.getChildCount()) {
                                            View childAt2 = e51Var.getChildAt(i12);
                                            e51Var.f3.getClass();
                                            if (z41Var.G(v4.p0.H(childAt2)).a == 28) {
                                                f13 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    n4Var.setTranslationY(Math.max(org.telegram.messenger.g0.m, f13));
                                }
                            }
                        }
                    }
                    i7++;
                    viewPages = viewArr;
                    f11 = 0.0f;
                }
                float e10 = ((org.telegram.ui.Components.c6) this.d).e(false, this.b <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
                float f14 = org.telegram.messenger.g0.m;
                float f15 = f14 * e10;
                float max = Math.max(f14, this.b) - (org.telegram.messenger.g0.m * e10);
                this.b = max;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(qy0Var.u0, max, getWidth() - qy0Var.u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, qy0Var.n1);
                canvas.save();
                Path path2 = this.c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                boolean z10 = f15 > ((float) org.telegram.messenger.g0.m) / 2.0f;
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z10) {
                    boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, qy0Var.J0)) > 0.721f;
                    boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s8, qy0Var.J0), 855638016)) > 0.721f;
                    this.e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    org.telegram.messenger.g0.r3(qy0Var.getWindow(), z11);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() != 0 || motionEvent.getY() <= ((a60) this.f).a.f) {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.b) {
                    ((qy0) this.f).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 1:
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((a60) this.f).x, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(qy0 qy0Var, Context context) {
        super(context);
        this.f = qy0Var;
        this.d = new org.telegram.ui.Components.c6(this, 250L, org.telegram.ui.Components.lr.h);
        this.c = new Path();
    }
}
