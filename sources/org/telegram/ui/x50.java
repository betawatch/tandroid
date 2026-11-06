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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x50 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public float b;
    public final Path c;
    public final Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(z50 z50Var, Context context) {
        super(context);
        this.f = z50Var;
        this.c = new Path();
        this.e = new RectF();
        this.b = -1.0f;
        fh.g c10 = z50Var.getBaseSimpleGlass().c.c(this, null, false);
        c10.p(c8.g0.m(z50Var.getResourceProvider()));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.d = c10;
        setWillNotDraw(false);
        addView(z50Var.e, c8.ha.c(-1.0f, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View[] viewArr;
        org.telegram.ui.Components.x31 G;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.e;
                fh.g gVar = (fh.g) this.d;
                float f10 = ((z50) this.f).a.f;
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
                oy0 oy0Var = (oy0) this.f;
                View[] viewPages = oy0Var.i1.getViewPages();
                float f11 = 0.0f;
                this.b = 0.0f;
                int length = viewPages.length;
                int i7 = 0;
                while (i7 < length) {
                    View view = viewPages[i7];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        ny0 ny0Var = (ny0) view;
                        FrameLayout frameLayout = ny0Var.e;
                        org.telegram.ui.Components.q41 q41Var = ny0Var.f;
                        float i10 = Utilities.i(1.0f - Math.abs(ny0Var.getTranslationX() / ny0Var.getMeasuredWidth()), 1.0f, f11);
                        float f12 = this.b;
                        float paddingTop = frameLayout.getPaddingTop();
                        int i11 = 0;
                        while (true) {
                            int childCount = q41Var.getChildCount();
                            org.telegram.ui.Components.l41 l41Var = q41Var.f3;
                            if (i11 < childCount) {
                                View childAt = q41Var.getChildAt(i11);
                                q41Var.e3.getClass();
                                int H = v4.n0.H(childAt);
                                View[] viewArr2 = viewPages;
                                if (H >= 0 && H < l41Var.D.size() && (G = l41Var.G(H)) != null && G.a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i11++;
                                viewPages = viewArr2;
                            } else {
                                viewArr = viewPages;
                                this.b = (paddingTop * i10) + f12;
                                if (ny0Var.getVisibility() == 0) {
                                    bi.m5 m5Var = ny0Var.h;
                                    float f13 = -m5Var.getHeight();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < q41Var.getChildCount()) {
                                            View childAt2 = q41Var.getChildAt(i12);
                                            q41Var.e3.getClass();
                                            if (l41Var.G(v4.n0.H(childAt2)).a == 28) {
                                                f13 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    m5Var.setTranslationY(Math.max(org.telegram.messenger.g0.m, f13));
                                }
                            }
                        }
                    }
                    i7++;
                    viewPages = viewArr;
                    f11 = 0.0f;
                }
                float e10 = ((org.telegram.ui.Components.w5) this.d).e(false, this.b <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
                float f14 = org.telegram.messenger.g0.m;
                float f15 = f14 * e10;
                float max = Math.max(f14, this.b) - (org.telegram.messenger.g0.m * e10);
                this.b = max;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(oy0Var.t0, max, getWidth() - oy0Var.t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W1, W1, oy0Var.j1);
                canvas.save();
                Path path2 = this.c;
                path2.rewind();
                path2.addRoundRect(rectF2, W1, W1, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                boolean z9 = f15 > ((float) org.telegram.messenger.g0.m) / 2.0f;
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z9) {
                    boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, oy0Var.I0)) > 0.721f;
                    boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, oy0Var.I0), 855638016)) > 0.721f;
                    this.e = Boolean.valueOf(z9);
                    if (!z9) {
                        z10 = z11;
                    }
                    org.telegram.messenger.g0.s3(oy0Var.getWindow(), z10);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() != 0 || motionEvent.getY() <= ((z50) this.f).a.f) {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.b) {
                    ((oy0) this.f).dismiss();
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
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((z50) this.f).x, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(oy0 oy0Var, Context context) {
        super(context);
        this.f = oy0Var;
        this.d = new org.telegram.ui.Components.w5(this, 250L, org.telegram.ui.Components.xq.h);
        this.c = new Path();
    }
}
