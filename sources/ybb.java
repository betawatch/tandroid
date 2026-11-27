// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ybb extends wma {
    public float g0;
    public float h0;
    public float i0;
    public final float[] j0;
    public final Path k0;
    public final RectF l0;
    public final RectF m0;
    public final RectF n0;
    public final RectF o0;
    public final RectF p0;
    public final SparseArray q0;
    public final /* synthetic */ e r0;
    public final /* synthetic */ lcb s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybb(lcb lcbVar, Context context, e eVar) {
        super(context, null);
        this.s0 = lcbVar;
        this.r0 = eVar;
        this.j0 = new float[8];
        this.k0 = new Path();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new RectF();
        this.q0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // wma, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        int i;
        l68 l68Var;
        float f3;
        float f4;
        int i2;
        float f5;
        RectF rectF;
        float f6;
        float[] fArr;
        float f7;
        float f8;
        RectF rectF2;
        float f9;
        RectF rectF3;
        float f10;
        float f11;
        RectF rectF4;
        float f12;
        float f13;
        q6b q6bVar;
        float f14;
        Paint paint;
        View view;
        q6b q6bVar2;
        gcb gcbVar;
        fcb fcbVar;
        o68 currentPeerView;
        t58 t58Var;
        q6b q6bVar3;
        byte b;
        o68 w;
        g29 g29Var;
        boolean z2;
        float f15;
        Canvas canvas2 = canvas;
        lcb lcbVar = this.s0;
        RectF rectF5 = lcbVar.U;
        icb icbVar = lcbVar.t0;
        float f16 = 1.0f;
        canvas2.drawColor(vm2.o(-16777216, (int) ((((1.0f - lcbVar.W) * 0.5f) + 0.5f) * lcbVar.V * 255.0f)));
        int i3 = 0;
        if (lcbVar.b) {
            boolean z3 = (1.0f - lcbVar.W) * lcbVar.V == 1.0f;
            if (lcbVar.K0 != z3) {
                lcbVar.K0 = z3;
                e eVar = this.r0;
                if (eVar.getLayoutContainer() != null) {
                    eVar.getLayoutContainer().invalidate();
                }
            }
        }
        o68 currentPeerView2 = lcbVar.o0.getCurrentPeerView();
        RectF rectF6 = this.p0;
        RectF rectF7 = this.o0;
        if (currentPeerView2 != null) {
            l68 l68Var2 = currentPeerView2.Y0;
            if (lcbVar.V0) {
                l68Var2.a.getImageReceiver().v0(lcbVar.V == 1.0f, true);
            } else {
                l68Var2.a.getImageReceiver().v0(true, false);
            }
            if (lcbVar.h1) {
                lcbVar.h1 = false;
                View view2 = l68Var2.a;
                mb0 mb0Var = l68Var2.a;
                f2 = 255.0f;
                z2 = true;
                float f17 = 0.0f;
                float f18 = 0.0f;
                while (view2 != this) {
                    int i4 = i3;
                    if (view2.getParent() == this) {
                        f17 += view2.getLeft();
                        f18 += view2.getTop();
                        f15 = f16;
                    } else {
                        f15 = f16;
                        if (view2.getParent() != lcbVar.o0) {
                            f17 += view2.getX();
                            f18 += view2.getY();
                        }
                    }
                    view2 = (View) view2.getParent();
                    i3 = i4;
                    f16 = f15;
                }
                f = f16;
                i = i3;
                rectF7.set(f17, f18, mb0Var.getMeasuredWidth() + f17, mb0Var.getMeasuredHeight() + f18);
                rectF6.set(0.0f, currentPeerView2.M0.getTop() + currentPeerView2.getTop(), lcbVar.w.getMeasuredWidth(), lcbVar.w.getMeasuredHeight());
                lcbVar.w.getMatrix().mapRect(rectF7);
                lcbVar.w.getMatrix().mapRect(rectF6);
            } else {
                f = 1.0f;
                f2 = 255.0f;
                z2 = true;
                i = 0;
            }
            l68Var = l68Var2;
            z = z2;
        } else {
            f = 1.0f;
            f2 = 255.0f;
            z = 1;
            i = 0;
            l68Var = null;
        }
        lcbVar.d1.setAlpha(f - lcbVar.W);
        if (lcbVar.Y == 0.0f) {
            float f19 = f;
            f3 = f19 - Utilities.i(Math.abs(lcbVar.X / getMeasuredHeight()), f19, 0.0f);
        } else {
            f3 = 1.0f;
        }
        lcbVar.o0.setHorizontalProgressToDismiss((lcbVar.Y / lcbVar.w.getMeasuredWidth()) * lcbVar.V);
        if (lcbVar.O != 0.0f || lcbVar.P != 0.0f) {
            float f20 = lcbVar.V;
            if (f20 != 1.0f) {
                if (lcbVar.H0 && lcbVar.V0) {
                    float i5 = 1.0f - Utilities.i(((1.0f - f20) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f4 = 0.15f;
                    f5 = Utilities.i(qu6.B(1.0f, i5, 0.05f, f20), 1.0f, 0.0f);
                    i2 = 2;
                    lcbVar.w.setAlpha(i5);
                } else {
                    f4 = 0.15f;
                    i2 = 2;
                    lcbVar.w.setAlpha(1.0f);
                    f5 = f20;
                }
                if (!lcbVar.H0 || icbVar == null || icbVar.c == null) {
                    rectF = rectF7;
                } else {
                    zbb zbbVar = lcbVar.w;
                    rectF = rectF7;
                    zbbVar.setAlpha(zbbVar.getAlpha() * ((float) Math.pow(f20, 0.20000000298023224d)));
                }
                zbb zbbVar2 = lcbVar.w;
                float left = (lcbVar.O - zbbVar2.getLeft()) - (lcbVar.w.getMeasuredWidth() / 2.0f);
                float f21 = lcbVar.V;
                zbbVar2.setTranslationX((lcbVar.Y * f21) + ((1.0f - f21) * left));
                zbb zbbVar3 = lcbVar.w;
                float top = (lcbVar.P - zbbVar3.getTop()) - (lcbVar.w.getMeasuredHeight() / 2.0f);
                float f22 = lcbVar.V;
                zbbVar3.setTranslationY((lcbVar.X * f22) + ((1.0f - f22) * top));
                float R1 = hl.R1(lcbVar.S / lcbVar.w.getMeasuredWidth(), (f3 * f4) + 0.85f, f5);
                lcbVar.w.setScaleX(R1);
                lcbVar.w.setScaleY(R1);
                Path path = this.k0;
                path.rewind();
                float f23 = lcbVar.O;
                float f24 = lcbVar.S / 2.0f;
                float f25 = lcbVar.P;
                float f26 = lcbVar.T / 2.0f;
                float f27 = f26 + f25;
                RectF rectF8 = this.l0;
                rectF8.set(f23 - f24, f25 - f26, f24 + f23, f27);
                boolean z4 = lcbVar.H0;
                RectF rectF9 = this.m0;
                if (z4 && lcbVar.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.M0.getTop() + lcbVar.c0, getMeasuredWidth(), getMeasuredHeight() + lcbVar.c0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (lcbVar.H0 && lcbVar.V0) {
                    rectF8.inset(hl.L(12.0f), hl.L(12.0f));
                }
                float R12 = hl.R1(rectF8.centerX(), rectF9.centerX(), lcbVar.V);
                float R13 = hl.R1(rectF8.centerY(), rectF9.centerY(), lcbVar.V);
                float R14 = hl.R1(rectF8.height(), rectF9.height(), f5);
                float R15 = hl.R1(rectF8.width(), rectF9.width(), f5);
                if (lcbVar.H0 && lcbVar.V0) {
                    f6 = R12;
                    rectF8.inset(-hl.L(12.0f), -hl.L(12.0f));
                } else {
                    f6 = R12;
                }
                RectF rectF10 = hl.P;
                float f28 = R15 / 2.0f;
                float f29 = R14 / 2.0f;
                rectF10.set(f6 - f28, R13 - f29, f6 + f28, R13 + f29);
                boolean z5 = lcbVar.V0;
                float[] fArr2 = this.j0;
                if (z5) {
                    float R16 = hl.R1(lcbVar.S / 2.0f, 0.0f, f5);
                    fArr = fArr2;
                    fArr[7] = R16;
                    fArr[6] = R16;
                    fArr[5] = R16;
                    fArr[4] = R16;
                    fArr[3] = R16;
                    fArr[i2] = R16;
                    fArr[z] = R16;
                    fArr[i] = R16;
                } else {
                    fArr = fArr2;
                    int[] iArr = lcbVar.W0;
                    if (iArr == null) {
                        f7 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[i2] = 0.0f;
                        fArr[z] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas2.save();
                        f8 = lcbVar.Q;
                        if (f8 != f7 && lcbVar.R != f7) {
                            canvas2.clipRect(f7, hl.R1(f7, f8, (float) Math.pow(1.0f - lcbVar.V, 0.4000000059604645d)), getMeasuredWidth(), hl.R1(getMeasuredHeight(), lcbVar.R, 1.0f - lcbVar.V));
                        }
                        if (icbVar == null && (q6bVar3 = icbVar.m) != null && q6bVar3.w && lcbVar.V0) {
                            rectF2 = rectF5;
                            f9 = f7;
                            rectF3 = rectF8;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f20 * f2), 31);
                        } else {
                            rectF2 = rectF5;
                            f9 = f7;
                            rectF3 = rectF8;
                            canvas2.save();
                        }
                        canvas2.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.n0;
                        if (icbVar != null || icbVar.c == null || (currentPeerView = lcbVar.o0.getCurrentPeerView()) == null || (t58Var = currentPeerView.M0) == null) {
                            f10 = f9;
                            f11 = f20;
                            rectF4 = rectF3;
                        } else {
                            boolean z6 = icbVar.c.R0;
                            f10 = f9;
                            rectF9.set(t58Var.getX() + currentPeerView.getX() + lcbVar.Y + lcbVar.w.getLeft(), t58Var.getY() + currentPeerView.getY() + lcbVar.X + lcbVar.w.getTop(), ((lcbVar.Y + lcbVar.w.getRight()) - (lcbVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - t58Var.getRight()), ((lcbVar.X + lcbVar.w.getBottom()) - (lcbVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - t58Var.getBottom()));
                            hl.X1(rectF3, rectF9, f20, rectF11);
                            ImageReceiver imageReceiver = icbVar.c;
                            float f30 = imageReceiver.L0;
                            float f31 = imageReceiver.M0;
                            float f32 = imageReceiver.N0;
                            float f33 = imageReceiver.O0;
                            imageReceiver.k0(rectF11);
                            float f34 = 1.0f - f20;
                            icbVar.c.setAlpha(f34);
                            f11 = f20;
                            rectF4 = rectF3;
                            icbVar.c.v0(z, false);
                            int saveCount = canvas2.getSaveCount();
                            fcb fcbVar2 = icbVar.f;
                            if (fcbVar2 != null) {
                                fcbVar2.f(f34, canvas2, rectF11, lcbVar.F);
                            }
                            icbVar.c.h(canvas2, null);
                            gcb gcbVar2 = icbVar.e;
                            if (gcbVar2 != null) {
                                gcbVar2.l(canvas2, rectF11, f34);
                            }
                            icbVar.c.v0(z6, false);
                            icbVar.c.i0(f30, f31, f32, f33);
                            canvas2.restoreToCount(saveCount);
                        }
                        canvas2.restore();
                        if (l68Var != null) {
                            mb0 mb0Var2 = l68Var.a;
                            float f35 = lcbVar.Y;
                            float f36 = lcbVar.X;
                            if (lcbVar.H0 && lcbVar.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = mb0Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f35 += view3.getLeft();
                                        f36 += view3.getTop();
                                    } else if (view3.getParent() != lcbVar.o0) {
                                        float x = view3.getX() + f35;
                                        f36 = view3.getY() + f36;
                                        f35 = x;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f35, f36, mb0Var2.getMeasuredWidth() + f35, mb0Var2.getMeasuredHeight() + f36);
                            }
                            hl.X1(rectF4, rectF9, lcbVar.V, rectF11);
                            int saveCount2 = canvas2.getSaveCount();
                            if (icbVar != null && (fcbVar = icbVar.f) != null) {
                                fcbVar.f(1.0f - f11, canvas2, rectF11, lcbVar.F);
                            }
                            if (lcbVar.V0) {
                                boolean z7 = (icbVar == null || icbVar.l == null) ? false : true;
                                if (z7 && lcbVar.V == f10) {
                                    f12 = f11;
                                } else {
                                    if (icbVar != null && (q6bVar2 = icbVar.m) != null && q6bVar2.w) {
                                        canvas2.saveLayerAlpha(rectF11.left - hl.L(4.0f), rectF11.top - hl.L(4.0f), rectF11.right + hl.L(4.0f), rectF11.bottom + hl.L(4.0f), jn7.d4, 31);
                                        canvas2 = canvas2;
                                    }
                                    mb0Var2.getImageReceiver().k0(rectF11);
                                    mb0Var2.getImageReceiver().q0((int) hl.R1(rectF11.width() / 2.0f, ((icbVar == null || icbVar.b == null) ? null : Integer.valueOf((int) (icbVar.b.X0[0] * ((!icbVar.n || (view = icbVar.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) icbVar.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - lcbVar.V));
                                    mb0Var2.getImageReceiver().v0(true, false);
                                    float f37 = z7 ? lcbVar.V : 1.0f;
                                    if (icbVar == null || icbVar.k >= 1.0f || (paint = icbVar.j) == null) {
                                        f12 = f11;
                                        f13 = f37;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f11) * f2));
                                        canvas2.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, icbVar.j);
                                        f12 = f11;
                                        f13 = hl.R1(icbVar.k, f37, f12);
                                    }
                                    mb0Var2.getImageReceiver().setAlpha(f13);
                                    l68Var.a(lcbVar.V, canvas2, rectF11, !lcb.A1);
                                    mb0Var2.getImageReceiver().h(canvas2, null);
                                    mb0Var2.getImageReceiver().setAlpha(f37);
                                    mb0Var2.getImageReceiver().v0(false, false);
                                    if (icbVar != null && (q6bVar = icbVar.m) != null && q6bVar.w) {
                                        RectF rectF12 = hl.P;
                                        rectF12.set(rectF11);
                                        f14 = 1.0f;
                                        t6b.k(1.0f - lcbVar.V, f10, canvas2, rectF12, true);
                                        canvas2.restore();
                                        if (lcbVar.V != f14 && z7) {
                                            ImageReceiver imageReceiver2 = icbVar.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.w(), icbVar.l.x());
                                            ImageReceiver imageReceiver3 = icbVar.l;
                                            int i6 = imageReceiver3.X0[0];
                                            boolean z8 = imageReceiver3.R0;
                                            imageReceiver3.k0(rectF11);
                                            icbVar.l.q0((int) (rectF11.width() / 2.0f));
                                            icbVar.l.v0(true, false);
                                            canvas2.saveLayerAlpha(rectF11, (int) ((1.0f - lcbVar.V) * f2), 31);
                                            icbVar.l.h(canvas2, null);
                                            canvas2.restore();
                                            icbVar.l.v0(z8, false);
                                            icbVar.l.k0(rectF13);
                                            icbVar.l.q0(i6);
                                        }
                                        if (icbVar != null && (gcbVar = icbVar.e) != null) {
                                            gcbVar.l(canvas2, rectF11, 1.0f - f12);
                                        }
                                    }
                                }
                                f14 = 1.0f;
                                if (lcbVar.V != f14) {
                                    ImageReceiver imageReceiver22 = icbVar.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.L0, imageReceiver22.M0, imageReceiver22.w(), icbVar.l.x());
                                    ImageReceiver imageReceiver32 = icbVar.l;
                                    int i62 = imageReceiver32.X0[0];
                                    boolean z82 = imageReceiver32.R0;
                                    imageReceiver32.k0(rectF11);
                                    icbVar.l.q0((int) (rectF11.width() / 2.0f));
                                    icbVar.l.v0(true, false);
                                    canvas2.saveLayerAlpha(rectF11, (int) ((1.0f - lcbVar.V) * f2), 31);
                                    icbVar.l.h(canvas2, null);
                                    canvas2.restore();
                                    icbVar.l.v0(z82, false);
                                    icbVar.l.k0(rectF132);
                                    icbVar.l.q0(i62);
                                }
                                if (icbVar != null) {
                                    gcbVar.l(canvas2, rectF11, 1.0f - f12);
                                }
                            }
                            canvas2.restoreToCount(saveCount2);
                        }
                        if (lcbVar.N != null) {
                            float i7 = Utilities.i(lcbVar.V / 0.4f, 1.0f, 0.0f);
                            if (i7 != 1.0f) {
                                RectF rectF14 = hl.P;
                                float f38 = lcbVar.O;
                                float f39 = lcbVar.P;
                                rectF14.set(f38, f39, lcbVar.S + f38, lcbVar.T + f39);
                                rectF14.inset(-hl.L(16.0f), -hl.L(16.0f));
                                if (i7 != 0.0f) {
                                    canvas2.saveLayerAlpha(rectF14, (int) ((1.0f - i7) * f2), 31);
                                } else {
                                    canvas2.save();
                                }
                                canvas2.translate(lcbVar.L, lcbVar.M);
                                ((of3) lcbVar.N).J(canvas2);
                                canvas2.restore();
                            }
                        }
                        canvas2.restore();
                        if (lcb.A1) {
                            ArrayList arrayList = lcbVar.y0;
                            lcbVar.W();
                            lcbVar.V = 0.0f;
                            lcbVar.Q(true);
                            lcbVar.d = false;
                            lcb.x1 = true;
                            lcbVar.c0 = lcbVar.X;
                            if (icbVar.d != null && (w = lcbVar.w()) != null && (g29Var = w.Y0.d) != null) {
                                g29 g29Var2 = icbVar.d;
                                g29Var.c = g29Var2.c;
                                g29Var.f = g29Var2.f;
                                g29Var.b = g29Var2.b;
                                g29Var.a = System.currentTimeMillis();
                                g29Var.c();
                            }
                            lcbVar.F = true;
                            float[] fArr3 = new float[i2];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            lcbVar.G = ofFloat;
                            ofFloat.addUpdateListener(new sbb(lcbVar, (byte) 1));
                            lcbVar.J0.d();
                            zbb zbbVar4 = lcbVar.w;
                            if (zbbVar4 != null) {
                                si5.c = true;
                                b = 2;
                                zbbVar4.setLayerType(2, null);
                            } else {
                                b = 2;
                            }
                            lcbVar.G.addListener(new tbb(lcbVar, b));
                            lcbVar.G.setStartDelay(40L);
                            lcbVar.G.setDuration(250L);
                            lcbVar.G.setInterpolator(k43.f);
                            lcbVar.G.start();
                            if (!arrayList.isEmpty()) {
                                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                    ((Runnable) arrayList.get(i8)).run();
                                }
                                arrayList.clear();
                            }
                            lcb.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i9 = i;
                    float U1 = hl.U1(f20, iArr[i], i9);
                    fArr[z] = U1;
                    fArr[i9] = U1;
                    float U12 = hl.U1(f20, lcbVar.W0[z], i9);
                    fArr[3] = U12;
                    fArr[i2] = U12;
                    float U13 = hl.U1(f20, lcbVar.W0[i2], i9);
                    fArr[5] = U13;
                    fArr[4] = U13;
                    float U14 = hl.U1(f20, lcbVar.W0[3], i9);
                    fArr[7] = U14;
                    fArr[6] = U14;
                }
                f7 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas2.save();
                f8 = lcbVar.Q;
                if (f8 != f7) {
                    canvas2.clipRect(f7, hl.R1(f7, f8, (float) Math.pow(1.0f - lcbVar.V, 0.4000000059604645d)), getMeasuredWidth(), hl.R1(getMeasuredHeight(), lcbVar.R, 1.0f - lcbVar.V));
                }
                if (icbVar == null) {
                }
                rectF2 = rectF5;
                f9 = f7;
                rectF3 = rectF8;
                canvas2.save();
                canvas2.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.n0;
                if (icbVar != null) {
                }
                f10 = f9;
                f11 = f20;
                rectF4 = rectF3;
                canvas2.restore();
                if (l68Var != null) {
                }
                if (lcbVar.N != null) {
                }
                canvas2.restore();
                if (lcb.A1) {
                }
            }
        }
        lcbVar.w.setAlpha(lcbVar.V);
        float f40 = (f3 * 0.15f) + (lcbVar.V * 0.1f) + 0.75f;
        lcbVar.w.setScaleX(f40);
        lcbVar.w.setScaleY(f40);
        lcbVar.w.setTranslationY(lcbVar.X);
        lcbVar.w.setTranslationX(lcbVar.Y);
        super.dispatchDraw(canvas);
        i2 = 2;
        if (lcb.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        lcb lcbVar = this.s0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            lcbVar.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        lcbVar.p();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0308  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        acb acbVar;
        int i;
        i49 i49Var;
        lcb lcbVar = this.s0;
        float[] fArr = lcbVar.p0;
        o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            y58 y58Var = currentPeerView.u0;
            if (y58Var.W.w()) {
                float x = currentPeerView.getX();
                float y = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x, -y);
                if (!y58Var.W.m(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x, y);
                }
                return true;
            }
        }
        float f = 0.0f;
        byte b = 0;
        if (lcbVar.p1 && currentPeerView != null && (i49Var = currentPeerView.b3) != null) {
            float f2 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f += view.getX();
                f2 += view.getY();
            }
            if (currentPeerView.b3.getReactionsWindow() != null && currentPeerView.b3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f, (-f2) - currentPeerView.b3.getReactionsWindow().c.getTranslationY());
                currentPeerView.b3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = hl.Q;
            i49Var.getHitRect(rect);
            rect.offset((int) f, (int) f2);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.W0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            i49Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            lcbVar.k0 = false;
            hl.r(lcbVar.b1);
            float f3 = lcbVar.Y;
            if (f3 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
                lcbVar.H = ofFloat;
                ofFloat.addUpdateListener(new vbb(this, b));
                lcbVar.H.addListener(new wbb(this, b));
                lcbVar.H.setDuration(250L);
                lcbVar.H.setInterpolator(k43.f);
                lcbVar.H.start();
            }
            if (lcbVar.W >= 0.3f) {
                lcbVar.o(true);
            }
            lcbVar.O(false);
            lcbVar.P(false);
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 0) {
            lcbVar.b0 = false;
            if (currentPeerView != null) {
                b6 b6Var = currentPeerView.i0;
                x9b x9bVar = currentPeerView.m0;
                t58 t58Var = currentPeerView.M0;
                kg5 kg5Var = currentPeerView.p0;
                if (kg5Var != null && kg5Var.W && x9bVar != null && !kg5Var.D0.contains(motionEvent.getX() - (currentPeerView.p0.getX() + (t58Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.p0.getY() + (t58Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(x9bVar, motionEvent)) {
                    currentPeerView.p0.f(true);
                }
                kg5 kg5Var2 = currentPeerView.q0;
                if (kg5Var2 != null && kg5Var2.W && b6Var != null && !kg5Var2.D0.contains(motionEvent.getX() - (currentPeerView.q0.getX() + (t58Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.q0.getY() + (t58Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(b6Var, motionEvent)) {
                    currentPeerView.q0.f(true);
                }
            }
            lcbVar.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z3 = (lcbVar.y || lcbVar.H0 || lcbVar.I0) ? false : true;
        float f4 = lcbVar.f0;
        SparseArray sparseArray = this.q0;
        if (f4 == 0.0f && !lcbVar.k0 && lcbVar.o0.G0 == 1 && motionEvent.getAction() == 2 && z3) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i = (acbVar = lcbVar.o0).J0) == 0 && acbVar.L0 == 0.0f && floatValue < 0.0f) || (i == acbVar.getAdapter().b() - 1 && acbVar.L0 == 0.0f && floatValue > 0.0f))) || lcbVar.Y != 0.0f) {
                float f5 = lcbVar.Y;
                if (f5 == 0.0f) {
                    lcbVar.Z = -floatValue;
                }
                if ((floatValue < 0.0f && lcbVar.Z > 0.0f) || (floatValue > 0.0f && lcbVar.Z < 0.0f)) {
                    floatValue *= 0.2f;
                }
                lcbVar.Y = f5 - floatValue;
                lcbVar.V();
                float f6 = lcbVar.Y;
                if ((f6 > 0.0f && lcbVar.Z < 0.0f) || (f6 < 0.0f && lcbVar.Z > 0.0f)) {
                    lcbVar.Y = 0.0f;
                }
                z2 = true;
                if (currentPeerView != null && lcbVar.f0 == 0.0f && !lcbVar.k0 && !lcbVar.L0 && !lcbVar.I0 && lcbVar.o0.G0 != 1) {
                    hl.p1(currentPeerView.M0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    o68 currentPeerView2 = lcbVar.o0.getCurrentPeerView();
                    currentPeerView2.H2.a(motionEvent, currentPeerView2.M0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                        sparseArray.put(motionEvent.getPointerId(i2), Float.valueOf(motionEvent.getX(i2)));
                    }
                }
                if (!z2) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (lcbVar.f0 != 0.0f && !lcbVar.g1 && lcbVar.q0 < hl.L(20.0f)) {
                            lcbVar.k(lcbVar.x.f > 0.5f);
                        }
                        o68 w = lcbVar.w();
                        if (w != null) {
                            w.u0.w0 = false;
                        }
                    }
                    if (z && !lcbVar.b0) {
                        lcbVar.i();
                    }
                    if (!dispatchTouchEvent && (!lcb.x1 || !lcbVar.r0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z2 = false;
        if (currentPeerView != null) {
            hl.p1(currentPeerView.M0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            o68 currentPeerView22 = lcbVar.o0.getCurrentPeerView();
            currentPeerView22.H2.a(motionEvent, currentPeerView22.M0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1) {
        }
        sparseArray.clear();
        if (!z2) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.s0.z0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lcb lcbVar = this.s0;
        if (lcbVar.b && !lcbVar.c) {
            e eVar = this.r0;
            hl.V2(eVar.getParentActivity(), eVar.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new xbb(this));
        jn7.f(lcbVar.h).b(lcbVar, jn7.A5);
        jn7.f(lcbVar.h).b(lcbVar, jn7.y5);
        jn7.f(lcbVar.h).b(lcbVar, jn7.d1);
        jn7.f(lcbVar.h).b(lcbVar, jn7.c1);
        jn7.f(lcbVar.h).b(lcbVar, jn7.z5);
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        lcb lcbVar = this.s0;
        jn7.f(lcbVar.h).n(lcbVar, jn7.A5);
        jn7.f(lcbVar.h).n(lcbVar, jn7.y5);
        jn7.f(lcbVar.h).n(lcbVar, jn7.d1);
        jn7.f(lcbVar.h).n(lcbVar, jn7.c1);
        jn7.f(lcbVar.h).n(lcbVar, jn7.z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01df  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        b58 b58Var;
        kcb kcbVar;
        o68 currentPeerView;
        boolean z;
        boolean z2;
        s8b s8bVar;
        d30 d30Var;
        o68 currentPeerView2;
        n68 n68Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        b58 b58Var2;
        lcb lcbVar = this.s0;
        x58 x58Var = lcbVar.b1;
        if (motionEvent.getAction() == 0 && lcbVar.V == 1.0f) {
            float x = motionEvent.getX();
            this.i0 = x;
            this.g0 = x;
            this.h0 = motionEvent.getY();
            lcbVar.h0 = false;
            lcbVar.g0 = (lcbVar.I0 || lcbVar.v(lcbVar.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            lcbVar.i0 = (lcbVar.I0 || lcbVar.v(lcbVar.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            lcbVar.O(lcbVar.g0 && !lcbVar.m1);
            o68 w = lcbVar.w();
            if (lcbVar.g0 && w != null && (b58Var2 = w.v0) != null) {
                b58Var2.setAllowTouches(false);
            }
            if (lcbVar.g0 && !lcbVar.I0 && lcbVar.m1) {
                s8b s8bVar2 = new s8b(this, (byte) 8);
                lcbVar.n1 = s8bVar2;
                hl.d3(s8bVar2, 150L);
            }
            if (lcbVar.g0 && !lcbVar.y && !lcbVar.I0 && !lcbVar.j1) {
                hl.d3(x58Var, 400L);
            }
            f = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.h0 - motionEvent.getY());
            float abs2 = Math.abs(this.g0 - motionEvent.getX());
            if (lcbVar.a1 && lcbVar.l0 && !lcbVar.f1 && !lcbVar.k0 && (d30Var = lcbVar.G0) != null && ((kcb) d30Var.c) != null && (currentPeerView2 = lcbVar.o0.getCurrentPeerView()) != null && (n68Var = currentPeerView2.y1) != null && n68Var.b == null && n68Var.e) {
                long j = currentPeerView2.B2;
                if (j <= 0 && (storyItem = n68Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j = (long) (r47.H0(document) * 1000.0d);
                }
                if (j > 0) {
                    float x2 = motionEvent.getX();
                    kcb kcbVar2 = (kcb) lcbVar.G0.c;
                    f = 1.0f;
                    if (((int) (kcbVar2.seek((x2 - this.i0) / hl.L(220.0f), j) * 10.0f)) != ((int) (kcbVar2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.M0.invalidate();
                    this.i0 = x2;
                    if (abs > abs2 && !lcbVar.l0 && !lcbVar.h0 && abs > hl.e * 2.0f) {
                        lcbVar.h0 = true;
                    }
                    if (!lcbVar.k0 && !lcbVar.l0 && !lcbVar.y && lcbVar.i0) {
                        if (abs > abs2 && abs > hl.e * 2.0f) {
                            lcbVar.k0 = true;
                            currentPeerView = lcbVar.o0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.f0();
                                if (!currentPeerView.y1.f && (currentPeerView.m1 || (currentPeerView.n1 && currentPeerView.l3))) {
                                    z = true;
                                    lcbVar.m0 = (!z || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || lcbVar.u1 != null) ? false : true;
                                    z2 = (z || currentPeerView.M2 || currentPeerView.y1.a == null || lcbVar.u1 != null) ? false : true;
                                    lcbVar.d0 = z2;
                                    if (z2 && this.f != 0) {
                                        lcbVar.d0 = false;
                                        z2 = false;
                                    }
                                    if (z2) {
                                        lcbVar.m();
                                    }
                                    lcbVar.a0 = 0.0f;
                                    s8bVar = lcbVar.n1;
                                    if (s8bVar != null) {
                                        hl.r(s8bVar);
                                        lcbVar.n1.run();
                                        lcbVar.n1 = null;
                                    }
                                    hl.r(x58Var);
                                }
                            }
                            z = false;
                            lcbVar.m0 = (!z || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || lcbVar.u1 != null) ? false : true;
                            if (z) {
                            }
                            lcbVar.d0 = z2;
                            if (z2) {
                                lcbVar.d0 = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            lcbVar.a0 = 0.0f;
                            s8bVar = lcbVar.n1;
                            if (s8bVar != null) {
                            }
                            hl.r(x58Var);
                        }
                        lcbVar.C();
                    }
                }
            }
            f = 1.0f;
            if (abs > abs2) {
                lcbVar.h0 = true;
            }
            if (!lcbVar.k0) {
                if (abs > abs2) {
                    lcbVar.k0 = true;
                    currentPeerView = lcbVar.o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    z = false;
                    lcbVar.m0 = (!z || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || lcbVar.u1 != null) ? false : true;
                    if (z) {
                    }
                    lcbVar.d0 = z2;
                    if (z2) {
                    }
                    if (z2) {
                    }
                    lcbVar.a0 = 0.0f;
                    s8bVar = lcbVar.n1;
                    if (s8bVar != null) {
                    }
                    hl.r(x58Var);
                }
                lcbVar.C();
            }
        } else {
            f = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                hl.r(x58Var);
                s8b s8bVar3 = lcbVar.n1;
                if (s8bVar3 != null) {
                    hl.r(s8bVar3);
                    lcbVar.n1 = null;
                }
                lcbVar.O(false);
                lcbVar.h0 = false;
                lcbVar.l0 = false;
                d30 d30Var2 = lcbVar.G0;
                if (d30Var2 != null && (kcbVar = (kcb) d30Var2.c) != null) {
                    kcbVar.setSeeking(false);
                }
                o68 w2 = lcbVar.w();
                if (w2 != null && (b58Var = w2.v0) != null) {
                    b58Var.setAllowTouches(true);
                }
            }
        }
        g4a g4aVar = lcbVar.x;
        boolean z3 = g4aVar != null && g4aVar.f == f;
        if (!lcbVar.k0 && !z3) {
            lcbVar.j0.onTouchEvent(motionEvent);
        }
        return lcbVar.k0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        lcb lcbVar = this.s0;
        ((FrameLayout.LayoutParams) lcbVar.d1.getLayoutParams()).topMargin = hl.m - hl.L(2.0f);
        lcbVar.d1.getLayoutParams().height = hl.L(2.0f);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b58 b58Var;
        int action = motionEvent.getAction();
        lcb lcbVar = this.s0;
        byte b = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            lcbVar.k0 = false;
            lcbVar.O(false);
            if (lcbVar.W >= 1.0f) {
                lcbVar.o(true);
            } else if (!lcbVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(lcbVar.X, 0.0f);
                lcbVar.H = ofFloat;
                ofFloat.addUpdateListener(new vbb(this, b));
                lcbVar.H.addListener(new wbb(this, b));
                lcbVar.H.setDuration(150L);
                lcbVar.H.setInterpolator(k43.f);
                lcbVar.H.start();
            }
            o68 w = lcbVar.w();
            if (w != null && (b58Var = w.v0) != null) {
                b58Var.setAllowTouches(true);
            }
        }
        if (!lcbVar.k0 && !lcbVar.y && lcbVar.a0 == 0.0f && ((lcbVar.f0 == 0.0f || (!lcbVar.g0 && !lcbVar.h0)) && !lcbVar.j1)) {
            return false;
        }
        lcbVar.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.s0.g0 = false;
    }
}
