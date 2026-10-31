package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c7 extends uu0 {
    public float f0;
    public float g0;
    public float h0;
    public final float[] i0;
    public final Path j0;
    public final RectF k0;
    public final RectF l0;
    public final RectF m0;
    public final RectF n0;
    public final RectF o0;
    public final SparseArray p0;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 q0;
    public final /* synthetic */ o7 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(o7 o7Var, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null);
        this.r0 = o7Var;
        this.q0 = k2Var;
        this.i0 = new float[8];
        this.j0 = new Path();
        this.k0 = new RectF();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        int i10;
        w2 w2Var;
        float f11;
        float f12;
        int i11;
        float f13;
        RectF rectF;
        float f14;
        float[] fArr;
        float f15;
        float f16;
        RectF rectF2;
        float f17;
        RectF rectF3;
        float f18;
        float f19;
        RectF rectF4;
        float f20;
        float f21;
        t5 t5Var;
        float f22;
        Paint paint;
        View view;
        t5 t5Var2;
        j7 j7Var;
        i7 i7Var;
        z2 currentPeerView;
        g2 g2Var;
        t5 t5Var3;
        int i12;
        z2 H;
        fi0 fi0Var;
        boolean z11;
        float f23;
        o7 o7Var = this.r0;
        RectF rectF5 = o7Var.T;
        l7 l7Var = o7Var.s0;
        float f24 = 1.0f;
        canvas.drawColor(i0.b.o(-16777216, (int) ((((1.0f - o7Var.V) * 0.5f) + 0.5f) * o7Var.U * 255.0f)));
        int i13 = 0;
        if (o7Var.b) {
            boolean z12 = (1.0f - o7Var.V) * o7Var.U == 1.0f;
            if (o7Var.K0 != z12) {
                o7Var.K0 = z12;
                org.telegram.ui.ActionBar.k2 k2Var = this.q0;
                if (k2Var.getLayoutContainer() != null) {
                    k2Var.getLayoutContainer().invalidate();
                }
            }
        }
        z2 currentPeerView2 = o7Var.n0.getCurrentPeerView();
        RectF rectF6 = this.o0;
        RectF rectF7 = this.n0;
        if (currentPeerView2 != null) {
            w2 w2Var2 = currentPeerView2.X0;
            if (o7Var.V0) {
                w2Var2.a.getImageReceiver().O0(o7Var.U == 1.0f, true);
            } else {
                w2Var2.a.getImageReceiver().O0(true, false);
            }
            if (o7Var.h1) {
                o7Var.h1 = false;
                View view2 = w2Var2.a;
                ag.d2 d2Var = w2Var2.a;
                f10 = 255.0f;
                z11 = true;
                float f25 = 0.0f;
                float f26 = 0.0f;
                while (view2 != this) {
                    int i14 = i13;
                    if (view2.getParent() == this) {
                        f25 += view2.getLeft();
                        f26 += view2.getTop();
                        f23 = f24;
                    } else {
                        f23 = f24;
                        if (view2.getParent() != o7Var.n0) {
                            f25 += view2.getX();
                            f26 += view2.getY();
                        }
                    }
                    view2 = (View) view2.getParent();
                    i13 = i14;
                    f24 = f23;
                }
                f7 = f24;
                i10 = i13;
                rectF7.set(f25, f26, d2Var.getMeasuredWidth() + f25, d2Var.getMeasuredHeight() + f26);
                rectF6.set(0.0f, currentPeerView2.L0.getTop() + currentPeerView2.getTop(), o7Var.w.getMeasuredWidth(), o7Var.w.getMeasuredHeight());
                o7Var.w.getMatrix().mapRect(rectF7);
                o7Var.w.getMatrix().mapRect(rectF6);
            } else {
                f7 = 1.0f;
                f10 = 255.0f;
                z11 = true;
                i10 = 0;
            }
            w2Var = w2Var2;
            z10 = z11;
        } else {
            f7 = 1.0f;
            f10 = 255.0f;
            z10 = 1;
            i10 = 0;
            w2Var = null;
        }
        o7Var.d1.setAlpha(f7 - o7Var.V);
        if (o7Var.X == 0.0f) {
            float f27 = f7;
            f11 = f27 - Utilities.i(Math.abs(o7Var.W / getMeasuredHeight()), f27, 0.0f);
        } else {
            f11 = 1.0f;
        }
        o7Var.n0.setHorizontalProgressToDismiss((o7Var.X / o7Var.w.getMeasuredWidth()) * o7Var.U);
        if (o7Var.N != 0.0f || o7Var.O != 0.0f) {
            float f28 = o7Var.U;
            if (f28 != 1.0f) {
                if (o7Var.H0 && o7Var.V0) {
                    float i15 = 1.0f - Utilities.i(((1.0f - f28) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f12 = 0.15f;
                    f13 = Utilities.i(sc.e.z(1.0f, i15, 0.05f, f28), 1.0f, 0.0f);
                    i11 = 2;
                    o7Var.w.setAlpha(i15);
                } else {
                    f12 = 0.15f;
                    i11 = 2;
                    o7Var.w.setAlpha(1.0f);
                    f13 = f28;
                }
                if (!o7Var.H0 || l7Var == null || l7Var.c == null) {
                    rectF = rectF7;
                } else {
                    d7 d7Var = o7Var.w;
                    rectF = rectF7;
                    d7Var.setAlpha(d7Var.getAlpha() * ((float) Math.pow(f28, 0.20000000298023224d)));
                }
                d7 d7Var2 = o7Var.w;
                float left = (o7Var.N - d7Var2.getLeft()) - (o7Var.w.getMeasuredWidth() / 2.0f);
                float f29 = o7Var.U;
                d7Var2.setTranslationX((o7Var.X * f29) + ((1.0f - f29) * left));
                d7 d7Var3 = o7Var.w;
                float top = (o7Var.O - d7Var3.getTop()) - (o7Var.w.getMeasuredHeight() / 2.0f);
                float f30 = o7Var.U;
                d7Var3.setTranslationY((o7Var.W * f30) + ((1.0f - f30) * top));
                float T1 = org.telegram.messenger.i0.T1(o7Var.R / o7Var.w.getMeasuredWidth(), (f11 * f12) + 0.85f, f13);
                o7Var.w.setScaleX(T1);
                o7Var.w.setScaleY(T1);
                Path path = this.j0;
                path.rewind();
                float f31 = o7Var.N;
                float f32 = o7Var.R / 2.0f;
                float f33 = o7Var.O;
                float f34 = o7Var.S / 2.0f;
                float f35 = f34 + f33;
                RectF rectF8 = this.k0;
                rectF8.set(f31 - f32, f33 - f34, f32 + f31, f35);
                boolean z13 = o7Var.H0;
                RectF rectF9 = this.l0;
                if (z13 && o7Var.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.L0.getTop() + o7Var.b0, getMeasuredWidth(), getMeasuredHeight() + o7Var.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (o7Var.H0 && o7Var.V0) {
                    rectF8.inset(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
                }
                float T12 = org.telegram.messenger.i0.T1(rectF8.centerX(), rectF9.centerX(), o7Var.U);
                float T13 = org.telegram.messenger.i0.T1(rectF8.centerY(), rectF9.centerY(), o7Var.U);
                float T14 = org.telegram.messenger.i0.T1(rectF8.height(), rectF9.height(), f13);
                float T15 = org.telegram.messenger.i0.T1(rectF8.width(), rectF9.width(), f13);
                if (o7Var.H0 && o7Var.V0) {
                    f14 = T12;
                    rectF8.inset(-org.telegram.messenger.i0.L(12.0f), -org.telegram.messenger.i0.L(12.0f));
                } else {
                    f14 = T12;
                }
                RectF rectF10 = org.telegram.messenger.i0.P;
                float f36 = T15 / 2.0f;
                float f37 = T14 / 2.0f;
                rectF10.set(f14 - f36, T13 - f37, f14 + f36, T13 + f37);
                boolean z14 = o7Var.V0;
                float[] fArr2 = this.i0;
                if (z14) {
                    float T16 = org.telegram.messenger.i0.T1(o7Var.R / 2.0f, 0.0f, f13);
                    fArr = fArr2;
                    fArr[7] = T16;
                    fArr[6] = T16;
                    fArr[5] = T16;
                    fArr[4] = T16;
                    fArr[3] = T16;
                    fArr[i11] = T16;
                    fArr[z10] = T16;
                    fArr[i10] = T16;
                } else {
                    fArr = fArr2;
                    int[] iArr = o7Var.W0;
                    if (iArr == null) {
                        f15 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[i11] = 0.0f;
                        fArr[z10] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f16 = o7Var.P;
                        if (f16 != f15 && o7Var.Q != f15) {
                            canvas.clipRect(f15, org.telegram.messenger.i0.T1(f15, f16, (float) Math.pow(1.0f - o7Var.U, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.i0.T1(getMeasuredHeight(), o7Var.Q, 1.0f - o7Var.U));
                        }
                        if (l7Var == null && (t5Var3 = l7Var.m) != null && t5Var3.w && o7Var.V0) {
                            rectF2 = rectF5;
                            f17 = f15;
                            rectF3 = rectF8;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f28 * f10), 31);
                        } else {
                            rectF2 = rectF5;
                            f17 = f15;
                            rectF3 = rectF8;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.m0;
                        if (l7Var != null || l7Var.c == null || (currentPeerView = o7Var.n0.getCurrentPeerView()) == null || (g2Var = currentPeerView.L0) == null) {
                            f18 = f17;
                            f19 = f28;
                            rectF4 = rectF3;
                        } else {
                            boolean z15 = l7Var.c.Q0;
                            f18 = f17;
                            rectF9.set(g2Var.getX() + currentPeerView.getX() + o7Var.X + o7Var.w.getLeft(), g2Var.getY() + currentPeerView.getY() + o7Var.W + o7Var.w.getTop(), ((o7Var.X + o7Var.w.getRight()) - (o7Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - g2Var.getRight()), ((o7Var.W + o7Var.w.getBottom()) - (o7Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - g2Var.getBottom()));
                            org.telegram.messenger.i0.Z1(rectF3, rectF9, f28, rectF11);
                            ImageReceiver imageReceiver = l7Var.c;
                            float f38 = imageReceiver.K0;
                            float f39 = imageReceiver.L0;
                            float f40 = imageReceiver.M0;
                            float f41 = imageReceiver.N0;
                            imageReceiver.A0(rectF11);
                            float f42 = 1.0f - f28;
                            l7Var.c.setAlpha(f42);
                            f19 = f28;
                            rectF4 = rectF3;
                            l7Var.c.O0(z10, false);
                            int saveCount = canvas.getSaveCount();
                            i7 i7Var2 = l7Var.f;
                            if (i7Var2 != null) {
                                i7Var2.j(f42, canvas, rectF11, o7Var.E);
                            }
                            l7Var.c.h(canvas, null);
                            j7 j7Var2 = l7Var.e;
                            if (j7Var2 != null) {
                                j7Var2.n(canvas, rectF11, f42);
                            }
                            l7Var.c.O0(z15, false);
                            l7Var.c.y0(f38, f39, f40, f41);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (w2Var != null) {
                            ag.d2 d2Var2 = w2Var.a;
                            float f43 = o7Var.X;
                            float f44 = o7Var.W;
                            if (o7Var.H0 && o7Var.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = d2Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f43 += view3.getLeft();
                                        f44 += view3.getTop();
                                    } else if (view3.getParent() != o7Var.n0) {
                                        float x10 = view3.getX() + f43;
                                        f44 = view3.getY() + f44;
                                        f43 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f43, f44, d2Var2.getMeasuredWidth() + f43, d2Var2.getMeasuredHeight() + f44);
                            }
                            org.telegram.messenger.i0.Z1(rectF4, rectF9, o7Var.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (l7Var != null && (i7Var = l7Var.f) != null) {
                                i7Var.j(1.0f - f19, canvas, rectF11, o7Var.E);
                            }
                            if (o7Var.V0) {
                                boolean z16 = (l7Var == null || l7Var.l == null) ? false : true;
                                if (z16 && o7Var.U == f18) {
                                    f20 = f19;
                                } else {
                                    if (l7Var != null && (t5Var2 = l7Var.m) != null && t5Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - org.telegram.messenger.i0.L(4.0f), rectF11.top - org.telegram.messenger.i0.L(4.0f), rectF11.right + org.telegram.messenger.i0.L(4.0f), rectF11.bottom + org.telegram.messenger.i0.L(4.0f), zs.e4, 31);
                                    }
                                    d2Var2.getImageReceiver().A0(rectF11);
                                    d2Var2.getImageReceiver().J0((int) org.telegram.messenger.i0.T1(rectF11.width() / 2.0f, ((l7Var == null || l7Var.b == null) ? null : Integer.valueOf((int) (l7Var.b.W0[0] * ((!l7Var.n || (view = l7Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) l7Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - o7Var.U));
                                    d2Var2.getImageReceiver().O0(true, false);
                                    float f45 = z16 ? o7Var.U : 1.0f;
                                    if (l7Var == null || l7Var.k >= 1.0f || (paint = l7Var.j) == null) {
                                        f20 = f19;
                                        f21 = f45;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f19) * f10));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, l7Var.j);
                                        f20 = f19;
                                        f21 = org.telegram.messenger.i0.T1(l7Var.k, f45, f20);
                                    }
                                    d2Var2.getImageReceiver().setAlpha(f21);
                                    w2Var.b(o7Var.U, canvas, rectF11, !o7.A1);
                                    d2Var2.getImageReceiver().h(canvas, null);
                                    d2Var2.getImageReceiver().setAlpha(f45);
                                    d2Var2.getImageReceiver().O0(false, false);
                                    if (l7Var != null && (t5Var = l7Var.m) != null && t5Var.w) {
                                        RectF rectF12 = org.telegram.messenger.i0.P;
                                        rectF12.set(rectF11);
                                        f22 = 1.0f;
                                        w5.k(1.0f - o7Var.U, f18, canvas, rectF12, true);
                                        canvas.restore();
                                        if (o7Var.U != f22 && z16) {
                                            ImageReceiver imageReceiver2 = l7Var.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.K0, imageReceiver2.L0, imageReceiver2.y(), l7Var.l.A());
                                            ImageReceiver imageReceiver3 = l7Var.l;
                                            int i16 = imageReceiver3.W0[0];
                                            boolean z17 = imageReceiver3.Q0;
                                            imageReceiver3.A0(rectF11);
                                            l7Var.l.J0((int) (rectF11.width() / 2.0f));
                                            l7Var.l.O0(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - o7Var.U) * f10), 31);
                                            l7Var.l.h(canvas, null);
                                            canvas.restore();
                                            l7Var.l.O0(z17, false);
                                            l7Var.l.A0(rectF13);
                                            l7Var.l.J0(i16);
                                        }
                                        if (l7Var != null && (j7Var = l7Var.e) != null) {
                                            j7Var.n(canvas, rectF11, 1.0f - f20);
                                        }
                                    }
                                }
                                f22 = 1.0f;
                                if (o7Var.U != f22) {
                                    ImageReceiver imageReceiver22 = l7Var.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.K0, imageReceiver22.L0, imageReceiver22.y(), l7Var.l.A());
                                    ImageReceiver imageReceiver32 = l7Var.l;
                                    int i162 = imageReceiver32.W0[0];
                                    boolean z172 = imageReceiver32.Q0;
                                    imageReceiver32.A0(rectF11);
                                    l7Var.l.J0((int) (rectF11.width() / 2.0f));
                                    l7Var.l.O0(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - o7Var.U) * f10), 31);
                                    l7Var.l.h(canvas, null);
                                    canvas.restore();
                                    l7Var.l.O0(z172, false);
                                    l7Var.l.A0(rectF132);
                                    l7Var.l.J0(i162);
                                }
                                if (l7Var != null) {
                                    j7Var.n(canvas, rectF11, 1.0f - f20);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (o7Var.M != null) {
                            float i17 = Utilities.i(o7Var.U / 0.4f, 1.0f, 0.0f);
                            if (i17 != 1.0f) {
                                RectF rectF14 = org.telegram.messenger.i0.P;
                                float f46 = o7Var.N;
                                float f47 = o7Var.O;
                                rectF14.set(f46, f47, o7Var.R + f46, o7Var.S + f47);
                                rectF14.inset(-org.telegram.messenger.i0.L(16.0f), -org.telegram.messenger.i0.L(16.0f));
                                if (i17 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - i17) * f10), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(o7Var.K, o7Var.L);
                                ((org.telegram.ui.Cells.v2) o7Var.M).I(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (o7.A1) {
                            ArrayList arrayList = o7Var.x0;
                            o7Var.e0();
                            o7Var.U = 0.0f;
                            o7Var.a0(true);
                            o7Var.d = false;
                            o7.x1 = true;
                            o7Var.b0 = o7Var.W;
                            if (l7Var.d != null && (H = o7Var.H()) != null && (fi0Var = H.X0.d) != null) {
                                fi0 fi0Var2 = l7Var.d;
                                fi0Var.c = fi0Var2.c;
                                fi0Var.f = fi0Var2.f;
                                fi0Var.b = fi0Var2.b;
                                fi0Var.a = System.currentTimeMillis();
                                fi0Var.c();
                            }
                            o7Var.E = true;
                            float[] fArr3 = new float[i11];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            o7Var.F = ofFloat;
                            ofFloat.addUpdateListener(new w6(o7Var, 1));
                            o7Var.J0.d();
                            d7 d7Var4 = o7Var.w;
                            if (d7Var4 != null) {
                                p.c = true;
                                i12 = 2;
                                d7Var4.setLayerType(2, null);
                            } else {
                                i12 = 2;
                            }
                            o7Var.F.addListener(new x6(o7Var, i12));
                            o7Var.F.setStartDelay(40L);
                            o7Var.F.setDuration(250L);
                            o7Var.F.setInterpolator(gr.f);
                            o7Var.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    ((Runnable) arrayList.get(i18)).run();
                                }
                                arrayList.clear();
                            }
                            o7.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i19 = i10;
                    float W1 = org.telegram.messenger.i0.W1(f28, iArr[i10], i19);
                    fArr[z10] = W1;
                    fArr[i19] = W1;
                    float W12 = org.telegram.messenger.i0.W1(f28, o7Var.W0[z10], i19);
                    fArr[3] = W12;
                    fArr[i11] = W12;
                    float W13 = org.telegram.messenger.i0.W1(f28, o7Var.W0[i11], i19);
                    fArr[5] = W13;
                    fArr[4] = W13;
                    float W14 = org.telegram.messenger.i0.W1(f28, o7Var.W0[3], i19);
                    fArr[7] = W14;
                    fArr[6] = W14;
                }
                f15 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f16 = o7Var.P;
                if (f16 != f15) {
                    canvas.clipRect(f15, org.telegram.messenger.i0.T1(f15, f16, (float) Math.pow(1.0f - o7Var.U, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.i0.T1(getMeasuredHeight(), o7Var.Q, 1.0f - o7Var.U));
                }
                if (l7Var == null) {
                }
                rectF2 = rectF5;
                f17 = f15;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.m0;
                if (l7Var != null) {
                }
                f18 = f17;
                f19 = f28;
                rectF4 = rectF3;
                canvas.restore();
                if (w2Var != null) {
                }
                if (o7Var.M != null) {
                }
                canvas.restore();
                if (o7.A1) {
                }
            }
        }
        o7Var.w.setAlpha(o7Var.U);
        float f48 = (f11 * 0.15f) + (o7Var.U * 0.1f) + 0.75f;
        o7Var.w.setScaleX(f48);
        o7Var.w.setScaleY(f48);
        o7Var.w.setTranslationY(o7Var.W);
        o7Var.w.setTranslationX(o7Var.X);
        super.dispatchDraw(canvas);
        i11 = 2;
        if (o7.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        o7 o7Var = this.r0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            o7Var.F(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        o7Var.p();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x030f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        e7 e7Var;
        int i10;
        mj0 mj0Var;
        o7 o7Var = this.r0;
        float[] fArr = o7Var.o0;
        z2 currentPeerView = o7Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            k2 k2Var = currentPeerView.t0;
            if (k2Var.W.x()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!k2Var.W.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        int i11 = 0;
        if (o7Var.p1 && currentPeerView != null && (mj0Var = currentPeerView.a3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.a3.getReactionsWindow() != null && currentPeerView.a3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.a3.getReactionsWindow().c.getTranslationY());
                currentPeerView.a3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.i0.Q;
            mj0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            mj0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            o7Var.j0 = false;
            org.telegram.messenger.i0.r(o7Var.b1);
            float f11 = o7Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                o7Var.G = ofFloat;
                ofFloat.addUpdateListener(new z6(this, i11));
                o7Var.G.addListener(new a7(this, i11));
                o7Var.G.setDuration(250L);
                o7Var.G.setInterpolator(gr.f);
                o7Var.G.start();
            }
            if (o7Var.V >= 0.3f) {
                o7Var.D(true);
            }
            o7Var.Y(false);
            o7Var.Z(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            o7Var.a0 = false;
            if (currentPeerView != null) {
                dg0 dg0Var = currentPeerView.h0;
                t6 t6Var = currentPeerView.l0;
                g2 g2Var = currentPeerView.L0;
                vh.p2 p2Var = currentPeerView.o0;
                if (p2Var != null && p2Var.V && t6Var != null && !p2Var.r0.contains(motionEvent.getX() - (currentPeerView.o0.getX() + (g2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.o0.getY() + (g2Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(t6Var, motionEvent)) {
                    currentPeerView.o0.e(true);
                }
                vh.p2 p2Var2 = currentPeerView.p0;
                if (p2Var2 != null && p2Var2.V && dg0Var != null && !p2Var2.r0.contains(motionEvent.getX() - (currentPeerView.p0.getX() + (g2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.p0.getY() + (g2Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(dg0Var, motionEvent)) {
                    currentPeerView.p0.e(true);
                }
            }
            o7Var.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (o7Var.y || o7Var.H0 || o7Var.I0) ? false : true;
        float f12 = o7Var.e0;
        SparseArray sparseArray = this.p0;
        if (f12 == 0.0f && !o7Var.j0 && o7Var.n0.F0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (e7Var = o7Var.n0).I0) == 0 && e7Var.K0 == 0.0f && floatValue < 0.0f) || (i10 == e7Var.getAdapter().b() - 1 && e7Var.K0 == 0.0f && floatValue > 0.0f))) || o7Var.X != 0.0f) {
                float f13 = o7Var.X;
                if (f13 == 0.0f) {
                    o7Var.Y = -floatValue;
                }
                if ((floatValue < 0.0f && o7Var.Y > 0.0f) || (floatValue > 0.0f && o7Var.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                o7Var.X = f13 - floatValue;
                o7.w(o7Var);
                float f14 = o7Var.X;
                if ((f14 > 0.0f && o7Var.Y < 0.0f) || (f14 < 0.0f && o7Var.Y > 0.0f)) {
                    o7Var.X = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && o7Var.e0 == 0.0f && !o7Var.j0 && !o7Var.L0 && !o7Var.I0 && o7Var.n0.F0 != 1) {
                    org.telegram.messenger.i0.r1(currentPeerView.L0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    z2 currentPeerView2 = o7Var.n0.getCurrentPeerView();
                    currentPeerView2.G2.a(motionEvent, currentPeerView2.L0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                        sparseArray.put(motionEvent.getPointerId(i12), Float.valueOf(motionEvent.getX(i12)));
                    }
                }
                if (!z11) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (o7Var.e0 != 0.0f && !o7Var.g1 && o7Var.p0 < org.telegram.messenger.i0.L(20.0f)) {
                            o7Var.A(o7Var.x.f > 0.5f);
                        }
                        z2 H = o7Var.H();
                        if (H != null) {
                            H.t0.w0 = false;
                        }
                    }
                    if (z10 && !o7Var.a0) {
                        o7Var.y();
                    }
                    if (!dispatchTouchEvent && (!o7.x1 || !o7Var.q0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = false;
        if (currentPeerView != null) {
            org.telegram.messenger.i0.r1(currentPeerView.L0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            z2 currentPeerView22 = o7Var.n0.getCurrentPeerView();
            currentPeerView22.G2.a(motionEvent, currentPeerView22.L0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1) {
        }
        sparseArray.clear();
        if (!z11) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.r0.y0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o7 o7Var = this.r0;
        if (o7Var.b && !o7Var.c) {
            org.telegram.ui.ActionBar.k2 k2Var = this.q0;
            org.telegram.messenger.i0.Z2(k2Var.getParentActivity(), k2Var.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new b7(this));
        zs.f(o7Var.h).c(o7Var, zs.x5);
        zs.f(o7Var.h).c(o7Var, zs.v5);
        zs.f(o7Var.h).c(o7Var, zs.d1);
        zs.f(o7Var.h).c(o7Var, zs.c1);
        zs.f(o7Var.h).c(o7Var, zs.w5);
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        o7 o7Var = this.r0;
        zs.f(o7Var.h).n(o7Var, zs.x5);
        zs.f(o7Var.h).n(o7Var, zs.v5);
        zs.f(o7Var.h).n(o7Var, zs.d1);
        zs.f(o7Var.h).n(o7Var, zs.c1);
        zs.f(o7Var.h).n(o7Var, zs.w5);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e3  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f7;
        p1 p1Var;
        n7 n7Var;
        z2 currentPeerView;
        boolean z10;
        sg.v vVar;
        k2.t0 t0Var;
        z2 currentPeerView2;
        y2 y2Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        p1 p1Var2;
        o7 o7Var = this.r0;
        i2 i2Var = o7Var.b1;
        if (motionEvent.getAction() == 0 && o7Var.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.h0 = x10;
            this.f0 = x10;
            this.g0 = motionEvent.getY();
            o7Var.g0 = false;
            o7Var.f0 = (o7Var.I0 || o7.u(o7Var, o7Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            o7Var.h0 = (o7Var.I0 || o7.u(o7Var, o7Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            o7Var.Y(o7Var.f0 && !o7Var.m1);
            z2 H = o7Var.H();
            if (o7Var.f0 && H != null && (p1Var2 = H.u0) != null) {
                p1Var2.setAllowTouches(false);
            }
            if (o7Var.f0 && !o7Var.I0 && o7Var.m1) {
                sg.v vVar2 = new sg.v(this, 23);
                o7Var.n1 = vVar2;
                org.telegram.messenger.i0.h3(vVar2, 150L);
            }
            if (o7Var.f0 && !o7Var.y && !o7Var.I0 && !o7Var.j1) {
                org.telegram.messenger.i0.h3(i2Var, 400L);
            }
            f7 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.g0 - motionEvent.getY());
            float abs2 = Math.abs(this.f0 - motionEvent.getX());
            if (o7Var.a1 && o7Var.k0 && !o7Var.f1 && !o7Var.j0 && (t0Var = o7Var.G0) != null && ((n7) t0Var.c) != null && (currentPeerView2 = o7Var.n0.getCurrentPeerView()) != null && (y2Var = currentPeerView2.x1) != null && y2Var.b == null && y2Var.e) {
                long j10 = currentPeerView2.A2;
                if (j10 <= 0 && (storyItem = y2Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j10 = (long) (jj.H0(document) * 1000.0d);
                }
                if (j10 > 0) {
                    float x11 = motionEvent.getX();
                    n7 n7Var2 = (n7) o7Var.G0.c;
                    f7 = 1.0f;
                    if (((int) (n7Var2.seek((x11 - this.h0) / org.telegram.messenger.i0.L(220.0f), j10) * 10.0f)) != ((int) (n7Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.L0.invalidate();
                    this.h0 = x11;
                    if (abs > abs2 && !o7Var.k0 && !o7Var.g0 && abs > org.telegram.messenger.i0.e * 2.0f) {
                        o7Var.g0 = true;
                    }
                    if (!o7Var.j0 && !o7Var.k0 && !o7Var.y && o7Var.h0) {
                        if (abs > abs2 && abs > org.telegram.messenger.i0.e * 2.0f) {
                            o7Var.j0 = true;
                            currentPeerView = o7Var.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.n0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.x1.f && (currentPeerView.l1 || (currentPeerView.m1 && currentPeerView.k3));
                            o7Var.l0 = (!z11 || currentPeerView == null || currentPeerView.m1 || currentPeerView.o1 || o7Var.u1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.L2 || currentPeerView.x1.a == null || o7Var.u1 != null) ? false : true;
                            o7Var.c0 = z10;
                            if (z10 && this.f != 0) {
                                o7Var.c0 = false;
                            }
                            if (o7Var.c0) {
                                o7Var.C();
                            }
                            o7Var.Z = 0.0f;
                            vVar = o7Var.n1;
                            if (vVar != null) {
                                org.telegram.messenger.i0.r(vVar);
                                o7Var.n1.run();
                                o7Var.n1 = null;
                            }
                            org.telegram.messenger.i0.r(i2Var);
                        }
                        o7Var.M();
                    }
                }
            }
            f7 = 1.0f;
            if (abs > abs2) {
                o7Var.g0 = true;
            }
            if (!o7Var.j0) {
                if (abs > abs2) {
                    o7Var.j0 = true;
                    currentPeerView = o7Var.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    o7Var.l0 = (!z11 || currentPeerView == null || currentPeerView.m1 || currentPeerView.o1 || o7Var.u1 != null) ? false : true;
                    if (z11) {
                    }
                    o7Var.c0 = z10;
                    if (z10) {
                        o7Var.c0 = false;
                    }
                    if (o7Var.c0) {
                    }
                    o7Var.Z = 0.0f;
                    vVar = o7Var.n1;
                    if (vVar != null) {
                    }
                    org.telegram.messenger.i0.r(i2Var);
                }
                o7Var.M();
            }
        } else {
            f7 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                org.telegram.messenger.i0.r(i2Var);
                sg.v vVar3 = o7Var.n1;
                if (vVar3 != null) {
                    org.telegram.messenger.i0.r(vVar3);
                    o7Var.n1 = null;
                }
                o7Var.Y(false);
                o7Var.g0 = false;
                o7Var.k0 = false;
                k2.t0 t0Var2 = o7Var.G0;
                if (t0Var2 != null && (n7Var = (n7) t0Var2.c) != null) {
                    n7Var.setSeeking(false);
                }
                z2 H2 = o7Var.H();
                if (H2 != null && (p1Var = H2.u0) != null) {
                    p1Var.setAllowTouches(true);
                }
            }
        }
        f4 f4Var = o7Var.x;
        boolean z12 = f4Var != null && f4Var.f == f7;
        if (!o7Var.j0 && !z12) {
            o7Var.i0.onTouchEvent(motionEvent);
        }
        return o7Var.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        o7 o7Var = this.r0;
        ((FrameLayout.LayoutParams) o7Var.d1.getLayoutParams()).topMargin = org.telegram.messenger.i0.m - org.telegram.messenger.i0.L(2.0f);
        o7Var.d1.getLayoutParams().height = org.telegram.messenger.i0.L(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p1 p1Var;
        int action = motionEvent.getAction();
        o7 o7Var = this.r0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            o7Var.j0 = false;
            o7Var.Y(false);
            if (o7Var.V >= 1.0f) {
                o7Var.D(true);
            } else if (!o7Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(o7Var.W, 0.0f);
                o7Var.G = ofFloat;
                ofFloat.addUpdateListener(new z6(this, i10));
                o7Var.G.addListener(new a7(this, i10));
                o7Var.G.setDuration(150L);
                o7Var.G.setInterpolator(gr.f);
                o7Var.G.start();
            }
            z2 H = o7Var.H();
            if (H != null && (p1Var = H.u0) != null) {
                p1Var.setAllowTouches(true);
            }
        }
        if (!o7Var.j0 && !o7Var.y && o7Var.Z == 0.0f && ((o7Var.e0 == 0.0f || (!o7Var.f0 && !o7Var.g0)) && !o7Var.j1)) {
            return false;
        }
        o7Var.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.r0.f0 = false;
    }
}
