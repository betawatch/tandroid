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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w60 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public float b;
    public final Path c;
    public final Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(y60 y60Var, Context context) {
        super(context);
        this.f = y60Var;
        this.c = new Path();
        this.e = new RectF();
        this.b = -1.0f;
        vg.f c10 = y60Var.getBaseSimpleGlass().c.c(this, null, false);
        c10.o(w7.b9.m(y60Var.getResourceProvider()));
        c10.p(org.telegram.messenger.i0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(y60Var.e, w7.b6.c(-1.0f, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View[] viewArr;
        org.telegram.ui.Components.a51 G;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.e;
                vg.f fVar = (vg.f) this.d;
                float f7 = ((y60) this.f).a.f;
                if (f7 >= 1.0f) {
                    float min = Math.min(1.0f, f7 / org.telegram.messenger.i0.L(44.0f));
                    float L = (1.0f - min) * org.telegram.messenger.i0.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f7);
                    float min2 = Math.min(f7 / 2.0f, org.telegram.messenger.i0.L(22.0f));
                    if (Math.abs(min2 - this.b) > 0.5f) {
                        this.b = min2;
                        fVar.q(min2);
                    }
                    int L2 = org.telegram.messenger.i0.L(6.0f);
                    fVar.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    fVar.setAlpha((int) (min * 255.0f));
                    fVar.draw(canvas);
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
                c01 c01Var = (c01) this.f;
                View[] viewPages = c01Var.i1.getViewPages();
                float f10 = 0.0f;
                this.b = 0.0f;
                int length = viewPages.length;
                int i10 = 0;
                while (i10 < length) {
                    View view = viewPages[i10];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        b01 b01Var = (b01) view;
                        FrameLayout frameLayout = b01Var.e;
                        org.telegram.ui.Components.u51 u51Var = b01Var.f;
                        float i11 = Utilities.i(1.0f - Math.abs(b01Var.getTranslationX() / b01Var.getMeasuredWidth()), 1.0f, f10);
                        float f11 = this.b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i12 = 0;
                        while (true) {
                            int childCount = u51Var.getChildCount();
                            org.telegram.ui.Components.p51 p51Var = u51Var.f3;
                            if (i12 < childCount) {
                                View childAt = u51Var.getChildAt(i12);
                                u51Var.e3.getClass();
                                int H = s4.n0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < p51Var.D.size() && (G = p51Var.G(H)) != null && G.a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i12++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.b = (paddingTop * i11) + f11;
                                if (b01Var.getVisibility() == 0) {
                                    jg.b1 b1Var = b01Var.h;
                                    float f12 = -b1Var.getHeight();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < u51Var.getChildCount()) {
                                            View childAt2 = u51Var.getChildAt(i13);
                                            u51Var.e3.getClass();
                                            if (p51Var.G(s4.n0.H(childAt2)).a == 28) {
                                                f12 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                    b1Var.setTranslationY(Math.max(org.telegram.messenger.i0.m, f12));
                                }
                            }
                        }
                    }
                    i10++;
                    viewPages = viewArr;
                    f10 = 0.0f;
                }
                float e = ((org.telegram.ui.Components.t5) this.d).e(false, this.b <= ((float) org.telegram.messenger.i0.m) ? 1.0f : 0.0f);
                float f13 = org.telegram.messenger.i0.m;
                float f14 = f13 * e;
                float max = Math.max(f13, this.b) - (org.telegram.messenger.i0.m * e);
                this.b = max;
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(c01Var.t0, max, getWidth() - c01Var.t0, org.telegram.messenger.i0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, c01Var.j1);
                canvas.save();
                Path path2 = this.c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                boolean z10 = f14 > ((float) org.telegram.messenger.i0.m) / 2.0f;
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z10) {
                    boolean z11 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, c01Var.I0)) > 0.721f;
                    boolean z12 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, c01Var.I0), 855638016)) > 0.721f;
                    this.e = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    org.telegram.messenger.i0.r3(c01Var.getWindow(), z11);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() != 0 || motionEvent.getY() <= ((y60) this.f).a.f) {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.b) {
                    ((c01) this.f).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((y60) this.f).x, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(c01 c01Var, Context context) {
        super(context);
        this.f = c01Var;
        this.d = new org.telegram.ui.Components.t5(this, 250L, org.telegram.ui.Components.gr.h);
        this.c = new Path();
    }
}
