package zh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i7 extends aw0 {
    public final Path A0;
    public final RectF B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public final RectF F0;
    public final SparseArray G0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 H0;
    public final /* synthetic */ u7 I0;
    public float w0;
    public float x0;
    public float y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(u7 u7Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        this.I0 = u7Var;
        this.H0 = p2Var;
        this.z0 = new float[8];
        this.A0 = new Path();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = new RectF();
        this.G0 = new SparseArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        char c10;
        char c11;
        float f10;
        x2 x2Var;
        float f11;
        char c12;
        float f12;
        RectF rectF;
        float f13;
        float[] fArr;
        float f14;
        float f15;
        RectF rectF2;
        RectF rectF3;
        float f16;
        RectF rectF4;
        float f17;
        float f18;
        float f19;
        x5 x5Var;
        float f20;
        Paint paint;
        View view;
        x5 x5Var2;
        p7 p7Var;
        o7 o7Var;
        a3 currentPeerView;
        h2 h2Var;
        x5 x5Var3;
        int i10;
        a3 t10;
        lj0 lj0Var;
        u7 u7Var = this.I0;
        RectF rectF5 = u7Var.T;
        r7 r7Var = u7Var.s0;
        canvas.drawColor(i0.a.k(-16777216, (int) ((((1.0f - u7Var.V) * 0.5f) + 0.5f) * u7Var.U * 255.0f)));
        if (u7Var.b) {
            boolean z10 = (1.0f - u7Var.V) * u7Var.U == 1.0f;
            if (u7Var.K0 != z10) {
                u7Var.K0 = z10;
                org.telegram.ui.ActionBar.p2 p2Var = this.H0;
                if (p2Var.getLayoutContainer() != null) {
                    p2Var.getLayoutContainer().invalidate();
                }
            }
        }
        a3 currentPeerView2 = u7Var.n0.getCurrentPeerView();
        RectF rectF6 = this.F0;
        RectF rectF7 = this.E0;
        if (currentPeerView2 != null) {
            x2 x2Var2 = currentPeerView2.o1;
            if (u7Var.V0) {
                x2Var2.a.getImageReceiver().setVisible(u7Var.U == 1.0f, true);
            } else {
                x2Var2.a.getImageReceiver().setVisible(true, false);
            }
            if (u7Var.h1) {
                u7Var.h1 = false;
                gg.i1 i1Var = x2Var2.a;
                float f21 = 0.0f;
                float f22 = 0.0f;
                f7 = 255.0f;
                c10 = 1;
                for (View view2 = x2Var2.a; view2 != this; view2 = (View) view2.getParent()) {
                    if (view2.getParent() == this) {
                        f21 += view2.getLeft();
                        f22 += view2.getTop();
                    } else if (view2.getParent() != u7Var.n0) {
                        f21 += view2.getX();
                        f22 += view2.getY();
                    }
                }
                c11 = 0;
                f10 = 1.0f;
                rectF7.set(f21, f22, i1Var.getMeasuredWidth() + f21, i1Var.getMeasuredHeight() + f22);
                rectF6.set(0.0f, currentPeerView2.c1.getTop() + currentPeerView2.getTop(), u7Var.v.getMeasuredWidth(), u7Var.v.getMeasuredHeight());
                u7Var.v.getMatrix().mapRect(rectF7);
                u7Var.v.getMatrix().mapRect(rectF6);
            } else {
                f7 = 255.0f;
                c10 = 1;
                c11 = 0;
                f10 = 1.0f;
            }
            x2Var = x2Var2;
        } else {
            f7 = 255.0f;
            c10 = 1;
            c11 = 0;
            f10 = 1.0f;
            x2Var = null;
        }
        u7Var.d1.setAlpha(f10 - u7Var.V);
        float clamp = u7Var.X == 0.0f ? 1.0f - Utilities.clamp(Math.abs(u7Var.W / getMeasuredHeight()), 1.0f, 0.0f) : 1.0f;
        u7Var.n0.setHorizontalProgressToDismiss((u7Var.X / u7Var.v.getMeasuredWidth()) * u7Var.U);
        if (u7Var.N != 0.0f || u7Var.O != 0.0f) {
            float f23 = u7Var.U;
            if (f23 != 1.0f) {
                if (u7Var.H0 && u7Var.V0) {
                    float clamp2 = 1.0f - Utilities.clamp(((1.0f - f23) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f11 = 0.15f;
                    f12 = Utilities.clamp(com.google.android.gms.internal.vision.e2.a(1.0f, clamp2, 0.05f, f23), 1.0f, 0.0f);
                    c12 = 2;
                    u7Var.v.setAlpha(clamp2);
                } else {
                    f11 = 0.15f;
                    c12 = 2;
                    u7Var.v.setAlpha(1.0f);
                    f12 = f23;
                }
                if (!u7Var.H0 || r7Var == null || r7Var.c == null) {
                    rectF = rectF7;
                } else {
                    j7 j7Var = u7Var.v;
                    rectF = rectF7;
                    j7Var.setAlpha(j7Var.getAlpha() * ((float) Math.pow(f23, 0.20000000298023224d)));
                }
                j7 j7Var2 = u7Var.v;
                float left = (u7Var.N - j7Var2.getLeft()) - (u7Var.v.getMeasuredWidth() / 2.0f);
                float f24 = u7Var.U;
                j7Var2.setTranslationX((u7Var.X * f24) + ((1.0f - f24) * left));
                j7 j7Var3 = u7Var.v;
                float top = (u7Var.O - j7Var3.getTop()) - (u7Var.v.getMeasuredHeight() / 2.0f);
                float f25 = u7Var.U;
                j7Var3.setTranslationY((u7Var.W * f25) + ((1.0f - f25) * top));
                float lerp = AndroidUtilities.lerp(u7Var.R / u7Var.v.getMeasuredWidth(), (clamp * f11) + 0.85f, f12);
                u7Var.v.setScaleX(lerp);
                u7Var.v.setScaleY(lerp);
                Path path = this.A0;
                path.rewind();
                float f26 = u7Var.N;
                float f27 = u7Var.R / 2.0f;
                float f28 = u7Var.O;
                float f29 = u7Var.S / 2.0f;
                float f30 = f29 + f28;
                RectF rectF8 = this.B0;
                rectF8.set(f26 - f27, f28 - f29, f27 + f26, f30);
                boolean z11 = u7Var.H0;
                RectF rectF9 = this.C0;
                if (z11 && u7Var.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.c1.getTop() + u7Var.b0, getMeasuredWidth(), getMeasuredHeight() + u7Var.b0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (u7Var.H0 && u7Var.V0) {
                    rectF8.inset(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                }
                float lerp2 = AndroidUtilities.lerp(rectF8.centerX(), rectF9.centerX(), u7Var.U);
                float lerp3 = AndroidUtilities.lerp(rectF8.centerY(), rectF9.centerY(), u7Var.U);
                float lerp4 = AndroidUtilities.lerp(rectF8.height(), rectF9.height(), f12);
                float lerp5 = AndroidUtilities.lerp(rectF8.width(), rectF9.width(), f12);
                if (u7Var.H0 && u7Var.V0) {
                    f13 = lerp2;
                    rectF8.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                } else {
                    f13 = lerp2;
                }
                RectF rectF10 = AndroidUtilities.rectTmp;
                float f31 = lerp5 / 2.0f;
                float f32 = lerp4 / 2.0f;
                rectF10.set(f13 - f31, lerp3 - f32, f13 + f31, lerp3 + f32);
                boolean z12 = u7Var.V0;
                float[] fArr2 = this.z0;
                if (z12) {
                    float lerp6 = AndroidUtilities.lerp(u7Var.R / 2.0f, 0.0f, f12);
                    fArr = fArr2;
                    fArr[7] = lerp6;
                    fArr[6] = lerp6;
                    fArr[5] = lerp6;
                    fArr[4] = lerp6;
                    fArr[3] = lerp6;
                    fArr[c12] = lerp6;
                    fArr[c10] = lerp6;
                    fArr[c11] = lerp6;
                } else {
                    fArr = fArr2;
                    int[] iArr = u7Var.W0;
                    if (iArr == null) {
                        f14 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[c12] = 0.0f;
                        fArr[c10] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f15 = u7Var.P;
                        if (f15 != f14 && u7Var.Q != f14) {
                            canvas.clipRect(f14, AndroidUtilities.lerp(f14, f15, (float) Math.pow(1.0f - u7Var.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), u7Var.Q, 1.0f - u7Var.U));
                        }
                        if (r7Var == null && (x5Var3 = r7Var.m) != null && x5Var3.w && u7Var.V0) {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f23 * f7), 31);
                        } else {
                            rectF2 = rectF8;
                            rectF3 = rectF5;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.D0;
                        if (r7Var != null || r7Var.c == null || (currentPeerView = u7Var.n0.getCurrentPeerView()) == null || (h2Var = currentPeerView.c1) == null) {
                            f16 = f23;
                            rectF4 = rectF2;
                            f17 = 0.0f;
                        } else {
                            boolean visible = r7Var.c.getVisible();
                            f17 = 0.0f;
                            rectF9.set(h2Var.getX() + currentPeerView.getX() + u7Var.X + u7Var.v.getLeft(), h2Var.getY() + currentPeerView.getY() + u7Var.W + u7Var.v.getTop(), ((u7Var.X + u7Var.v.getRight()) - (u7Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - h2Var.getRight()), ((u7Var.W + u7Var.v.getBottom()) - (u7Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - h2Var.getBottom()));
                            AndroidUtilities.lerp(rectF2, rectF9, f23, rectF11);
                            float imageX = r7Var.c.getImageX();
                            float imageY = r7Var.c.getImageY();
                            float imageWidth = r7Var.c.getImageWidth();
                            float imageHeight = r7Var.c.getImageHeight();
                            r7Var.c.setImageCoords(rectF11);
                            float f33 = 1.0f - f23;
                            r7Var.c.setAlpha(f33);
                            f16 = f23;
                            rectF4 = rectF2;
                            r7Var.c.setVisible(true, false);
                            int saveCount = canvas.getSaveCount();
                            o7 o7Var2 = r7Var.f;
                            if (o7Var2 != null) {
                                o7Var2.g(f33, canvas, rectF11, u7Var.E);
                            }
                            r7Var.c.draw(canvas);
                            p7 p7Var2 = r7Var.e;
                            if (p7Var2 != null) {
                                p7Var2.i(canvas, rectF11, f33);
                            }
                            r7Var.c.setVisible(visible, false);
                            r7Var.c.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (x2Var != null) {
                            gg.i1 i1Var2 = x2Var.a;
                            float f34 = u7Var.X;
                            float f35 = u7Var.W;
                            if (u7Var.H0 && u7Var.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = i1Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f34 += view3.getLeft();
                                        f35 += view3.getTop();
                                    } else if (view3.getParent() != u7Var.n0) {
                                        float x10 = view3.getX() + f34;
                                        f35 = view3.getY() + f35;
                                        f34 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f34, f35, i1Var2.getMeasuredWidth() + f34, i1Var2.getMeasuredHeight() + f35);
                            }
                            AndroidUtilities.lerp(rectF4, rectF9, u7Var.U, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (r7Var != null && (o7Var = r7Var.f) != null) {
                                o7Var.g(1.0f - f16, canvas, rectF11, u7Var.E);
                            }
                            if (u7Var.V0) {
                                boolean z13 = (r7Var == null || r7Var.l == null) ? false : true;
                                if (z13 && u7Var.U == f17) {
                                    f18 = f16;
                                } else {
                                    if (r7Var != null && (x5Var2 = r7Var.m) != null && x5Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - AndroidUtilities.dp(4.0f), rectF11.top - AndroidUtilities.dp(4.0f), rectF11.right + AndroidUtilities.dp(4.0f), rectF11.bottom + AndroidUtilities.dp(4.0f), 255, 31);
                                    }
                                    i1Var2.getImageReceiver().setImageCoords(rectF11);
                                    i1Var2.getImageReceiver().setRoundRadius((int) AndroidUtilities.lerp(rectF11.width() / 2.0f, ((r7Var == null || r7Var.b == null) ? null : Integer.valueOf((int) (r7Var.b.getRoundRadius()[0] * ((!r7Var.n || (view = r7Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) r7Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - u7Var.U));
                                    i1Var2.getImageReceiver().setVisible(true, false);
                                    float f36 = z13 ? u7Var.U : 1.0f;
                                    if (r7Var == null || r7Var.k >= 1.0f || (paint = r7Var.j) == null) {
                                        f18 = f16;
                                        f19 = f36;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f16) * f7));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, r7Var.j);
                                        f18 = f16;
                                        f19 = AndroidUtilities.lerp(r7Var.k, f36, f18);
                                    }
                                    i1Var2.getImageReceiver().setAlpha(f19);
                                    x2Var.b(u7Var.U, canvas, rectF11, !u7.A1);
                                    i1Var2.getImageReceiver().draw(canvas);
                                    i1Var2.getImageReceiver().setAlpha(f36);
                                    i1Var2.getImageReceiver().setVisible(false, false);
                                    if (r7Var != null && (x5Var = r7Var.m) != null && x5Var.w) {
                                        RectF rectF12 = AndroidUtilities.rectTmp;
                                        rectF12.set(rectF11);
                                        f20 = 1.0f;
                                        a6.k(canvas, rectF12, 1.0f - u7Var.U, true, 0.0f);
                                        canvas.restore();
                                        if (u7Var.U != f20 && z13) {
                                            RectF rectF13 = rectF3;
                                            rectF13.set(r7Var.l.getImageX(), r7Var.l.getImageY(), r7Var.l.getImageX2(), r7Var.l.getImageY2());
                                            int i11 = r7Var.l.getRoundRadius()[0];
                                            boolean visible2 = r7Var.l.getVisible();
                                            r7Var.l.setImageCoords(rectF11);
                                            r7Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                            r7Var.l.setVisible(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - u7Var.U) * f7), 31);
                                            r7Var.l.draw(canvas);
                                            canvas.restore();
                                            r7Var.l.setVisible(visible2, false);
                                            r7Var.l.setImageCoords(rectF13);
                                            r7Var.l.setRoundRadius(i11);
                                        }
                                        if (r7Var != null && (p7Var = r7Var.e) != null) {
                                            p7Var.i(canvas, rectF11, 1.0f - f18);
                                        }
                                    }
                                }
                                f20 = 1.0f;
                                if (u7Var.U != f20) {
                                    RectF rectF132 = rectF3;
                                    rectF132.set(r7Var.l.getImageX(), r7Var.l.getImageY(), r7Var.l.getImageX2(), r7Var.l.getImageY2());
                                    int i112 = r7Var.l.getRoundRadius()[0];
                                    boolean visible22 = r7Var.l.getVisible();
                                    r7Var.l.setImageCoords(rectF11);
                                    r7Var.l.setRoundRadius((int) (rectF11.width() / 2.0f));
                                    r7Var.l.setVisible(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - u7Var.U) * f7), 31);
                                    r7Var.l.draw(canvas);
                                    canvas.restore();
                                    r7Var.l.setVisible(visible22, false);
                                    r7Var.l.setImageCoords(rectF132);
                                    r7Var.l.setRoundRadius(i112);
                                }
                                if (r7Var != null) {
                                    p7Var.i(canvas, rectF11, 1.0f - f18);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (u7Var.M != null) {
                            float clamp3 = Utilities.clamp(u7Var.U / 0.4f, 1.0f, 0.0f);
                            if (clamp3 != 1.0f) {
                                RectF rectF14 = AndroidUtilities.rectTmp;
                                float f37 = u7Var.N;
                                float f38 = u7Var.O;
                                rectF14.set(f37, f38, u7Var.R + f37, u7Var.S + f38);
                                rectF14.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(16.0f));
                                if (clamp3 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - clamp3) * f7), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(u7Var.K, u7Var.L);
                                ((org.telegram.ui.Cells.r2) u7Var.M).A(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (u7.A1) {
                            ArrayList arrayList = u7Var.x0;
                            u7Var.Q();
                            u7Var.U = 0.0f;
                            u7Var.M(true);
                            u7Var.d = false;
                            u7.x1 = true;
                            u7Var.b0 = u7Var.W;
                            if (r7Var.d != null && (t10 = u7Var.t()) != null && (lj0Var = t10.o1.d) != null) {
                                lj0 lj0Var2 = r7Var.d;
                                lj0Var.c = lj0Var2.c;
                                lj0Var.f = lj0Var2.f;
                                lj0Var.b = lj0Var2.b;
                                lj0Var.a = System.currentTimeMillis();
                                lj0Var.c();
                            }
                            u7Var.E = true;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            u7Var.F = ofFloat;
                            ofFloat.addUpdateListener(new c7(u7Var, 1));
                            u7Var.J0.lock();
                            j7 j7Var4 = u7Var.v;
                            if (j7Var4 != null) {
                                p.c = true;
                                i10 = 2;
                                j7Var4.setLayerType(2, null);
                            } else {
                                i10 = 2;
                            }
                            u7Var.F.addListener(new d7(u7Var, i10));
                            u7Var.F.setStartDelay(40L);
                            u7Var.F.setDuration(250L);
                            u7Var.F.setInterpolator(wr.f);
                            u7Var.F.start();
                            if (!arrayList.isEmpty()) {
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((Runnable) arrayList.get(i12)).run();
                                }
                                arrayList.clear();
                            }
                            u7.A1 = false;
                            return;
                        }
                        return;
                    }
                    float lerp7 = AndroidUtilities.lerp(iArr[c11], 0, f23);
                    fArr[c10] = lerp7;
                    fArr[0] = lerp7;
                    float lerp8 = AndroidUtilities.lerp(u7Var.W0[c10], 0, f23);
                    fArr[3] = lerp8;
                    fArr[c12] = lerp8;
                    float lerp9 = AndroidUtilities.lerp(u7Var.W0[c12], 0, f23);
                    fArr[5] = lerp9;
                    fArr[4] = lerp9;
                    float lerp10 = AndroidUtilities.lerp(u7Var.W0[3], 0, f23);
                    fArr[7] = lerp10;
                    fArr[6] = lerp10;
                }
                f14 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f15 = u7Var.P;
                if (f15 != f14) {
                    canvas.clipRect(f14, AndroidUtilities.lerp(f14, f15, (float) Math.pow(1.0f - u7Var.U, 0.4000000059604645d)), getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), u7Var.Q, 1.0f - u7Var.U));
                }
                if (r7Var == null) {
                }
                rectF2 = rectF8;
                rectF3 = rectF5;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.D0;
                if (r7Var != null) {
                }
                f16 = f23;
                rectF4 = rectF2;
                f17 = 0.0f;
                canvas.restore();
                if (x2Var != null) {
                }
                if (u7Var.M != null) {
                }
                canvas.restore();
                if (u7.A1) {
                }
            }
        }
        u7Var.v.setAlpha(u7Var.U);
        float f39 = (clamp * 0.15f) + (u7Var.U * 0.1f) + 0.75f;
        u7Var.v.setScaleX(f39);
        u7Var.v.setScaleY(f39);
        u7Var.v.setTranslationY(u7Var.W);
        u7Var.v.setTranslationX(u7Var.X);
        super.dispatchDraw(canvas);
        if (u7.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        u7 u7Var = this.I0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            u7Var.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        u7Var.onAttachedBackPressed();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0310  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        k7 k7Var;
        int i10;
        pk0 pk0Var;
        u7 u7Var = this.I0;
        float[] fArr = u7Var.o0;
        a3 currentPeerView = u7Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            l2 l2Var = currentPeerView.K0;
            if (l2Var.W.y()) {
                float x10 = currentPeerView.getX();
                float y3 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y3);
                if (!l2Var.W.o(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y3);
                }
                return true;
            }
        }
        float f7 = 0.0f;
        int i11 = 0;
        if (u7Var.p1 && currentPeerView != null && (pk0Var = currentPeerView.r3) != null) {
            float f10 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f7 += view.getX();
                f10 += view.getY();
            }
            if (currentPeerView.r3.getReactionsWindow() != null && currentPeerView.r3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f7, (-f10) - currentPeerView.r3.getReactionsWindow().c.getTranslationY());
                currentPeerView.r3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            pk0Var.getHitRect(rect);
            rect.offset((int) f7, (int) f10);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.b1(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            pk0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            u7Var.j0 = false;
            AndroidUtilities.cancelRunOnUIThread(u7Var.b1);
            float f11 = u7Var.X;
            if (f11 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                u7Var.G = ofFloat;
                ofFloat.addUpdateListener(new f7(this, i11));
                u7Var.G.addListener(new g7(this, i11));
                u7Var.G.setDuration(250L);
                u7Var.G.setInterpolator(wr.f);
                u7Var.G.start();
            }
            if (u7Var.V >= 0.3f) {
                u7Var.q(true);
            }
            u7Var.K(false);
            u7Var.L(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            u7Var.a0 = false;
            if (currentPeerView != null) {
                m91 m91Var = currentPeerView.y0;
                z6 z6Var = currentPeerView.C0;
                h2 h2Var = currentPeerView.c1;
                bi.x4 x4Var = currentPeerView.F0;
                if (x4Var != null && x4Var.V && z6Var != null && !x4Var.r0.contains(motionEvent.getX() - (currentPeerView.F0.getX() + (h2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.F0.getY() + (h2Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, z6Var)) {
                    currentPeerView.F0.e(true);
                }
                bi.x4 x4Var2 = currentPeerView.G0;
                if (x4Var2 != null && x4Var2.V && m91Var != null && !x4Var2.r0.contains(motionEvent.getX() - (currentPeerView.G0.getX() + (h2Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.G0.getY() + (h2Var.getY() + currentPeerView.getY()))) && !currentPeerView.H0(motionEvent, m91Var)) {
                    currentPeerView.G0.e(true);
                }
            }
            u7Var.n0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (u7Var.x || u7Var.H0 || u7Var.I0) ? false : true;
        float f12 = u7Var.e0;
        SparseArray sparseArray = this.G0;
        if (f12 == 0.0f && !u7Var.j0 && u7Var.n0.F0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i10 = (k7Var = u7Var.n0).I0) == 0 && k7Var.K0 == 0.0f && floatValue < 0.0f) || (i10 == k7Var.getAdapter().b() - 1 && k7Var.K0 == 0.0f && floatValue > 0.0f))) || u7Var.X != 0.0f) {
                float f13 = u7Var.X;
                if (f13 == 0.0f) {
                    u7Var.Y = -floatValue;
                }
                if ((floatValue < 0.0f && u7Var.Y > 0.0f) || (floatValue > 0.0f && u7Var.Y < 0.0f)) {
                    floatValue *= 0.2f;
                }
                u7Var.X = f13 - floatValue;
                u7.k(u7Var);
                float f14 = u7Var.X;
                if ((f14 > 0.0f && u7Var.Y < 0.0f) || (f14 < 0.0f && u7Var.Y > 0.0f)) {
                    u7Var.X = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && u7Var.e0 == 0.0f && !u7Var.j0 && !u7Var.L0 && !u7Var.I0 && u7Var.n0.F0 != 1) {
                    AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    a3 currentPeerView2 = u7Var.n0.getCurrentPeerView();
                    currentPeerView2.X2.a(motionEvent, currentPeerView2.c1, null, null, 0);
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
                        if (u7Var.e0 != 0.0f && !u7Var.g1 && u7Var.p0 < AndroidUtilities.dp(20.0f)) {
                            u7Var.n(u7Var.w.f > 0.5f);
                        }
                        a3 t10 = u7Var.t();
                        if (t10 != null) {
                            t10.K0.w0 = false;
                        }
                    }
                    if (z10 && !u7Var.a0) {
                        u7Var.m();
                    }
                    if (!dispatchTouchEvent && (!u7.x1 || !u7Var.q0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = false;
        if (currentPeerView != null) {
            AndroidUtilities.getViewPositionInParent(currentPeerView.c1, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            a3 currentPeerView22 = u7Var.n0.getCurrentPeerView();
            currentPeerView22.X2.a(motionEvent, currentPeerView22.c1, null, null, 0);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.I0.y0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u7 u7Var = this.I0;
        if (u7Var.b && !u7Var.c) {
            org.telegram.ui.ActionBar.p2 p2Var = this.H0;
            AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
        }
        pc.a(this, new h7(this));
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(u7Var.h).addObserver(u7Var, NotificationCenter.storyDeleted);
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this);
        u7 u7Var = this.I0;
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.articleClosed);
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.openArticle);
        NotificationCenter.getInstance(u7Var.h).removeObserver(u7Var, NotificationCenter.storyDeleted);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e8  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f7;
        o1 o1Var;
        t7 t7Var;
        a3 currentPeerView;
        boolean z10;
        k5 k5Var;
        k2.v vVar;
        a3 currentPeerView2;
        z2 z2Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        o1 o1Var2;
        u7 u7Var = this.I0;
        j2 j2Var = u7Var.b1;
        if (motionEvent.getAction() == 0 && u7Var.U == 1.0f) {
            float x10 = motionEvent.getX();
            this.y0 = x10;
            this.w0 = x10;
            this.x0 = motionEvent.getY();
            u7Var.g0 = false;
            u7Var.f0 = (u7Var.I0 || u7.i(u7Var, u7Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            u7Var.h0 = (u7Var.I0 || u7.i(u7Var, u7Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            u7Var.K(u7Var.f0 && !u7Var.m1);
            a3 t10 = u7Var.t();
            if (u7Var.f0 && t10 != null && (o1Var2 = t10.L0) != null) {
                o1Var2.setAllowTouches(false);
            }
            if (u7Var.f0 && !u7Var.I0 && u7Var.m1) {
                k5 k5Var2 = new k5(this, 9);
                u7Var.n1 = k5Var2;
                AndroidUtilities.runOnUIThread(k5Var2, 150L);
            }
            if (u7Var.f0 && !u7Var.x && !u7Var.I0 && !u7Var.j1) {
                AndroidUtilities.runOnUIThread(j2Var, 400L);
            }
            f7 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.x0 - motionEvent.getY());
            float abs2 = Math.abs(this.w0 - motionEvent.getX());
            if (u7Var.a1 && u7Var.k0 && !u7Var.f1 && !u7Var.j0 && (vVar = u7Var.G0) != null && ((t7) vVar.c) != null && (currentPeerView2 = u7Var.n0.getCurrentPeerView()) != null && (z2Var = currentPeerView2.O1) != null && z2Var.b == null && z2Var.e) {
                long j3 = currentPeerView2.R2;
                if (j3 <= 0 && (storyItem = z2Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j3 = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                if (j3 > 0) {
                    float x11 = motionEvent.getX();
                    t7 t7Var2 = (t7) u7Var.G0.c;
                    f7 = 1.0f;
                    if (((int) (t7Var2.seek((x11 - this.y0) / AndroidUtilities.dp(220.0f), j3) * 10.0f)) != ((int) (t7Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.c1.invalidate();
                    this.y0 = x11;
                    if (abs > abs2 && !u7Var.k0 && !u7Var.g0 && abs > AndroidUtilities.touchSlop * 2.0f) {
                        u7Var.g0 = true;
                    }
                    if (!u7Var.j0 && !u7Var.k0 && !u7Var.x && u7Var.h0) {
                        if (abs > abs2 && abs > AndroidUtilities.touchSlop * 2.0f) {
                            u7Var.j0 = true;
                            currentPeerView = u7Var.n0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.p0();
                            }
                            boolean z11 = currentPeerView == null && !currentPeerView.O1.f && (currentPeerView.C1 || (currentPeerView.D1 && currentPeerView.B3));
                            u7Var.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || u7Var.u1 != null) ? false : true;
                            z10 = (z11 || currentPeerView.c3 || currentPeerView.O1.a == null || u7Var.u1 != null) ? false : true;
                            u7Var.c0 = z10;
                            if (z10 && this.f != 0) {
                                u7Var.c0 = false;
                            }
                            if (u7Var.c0) {
                                u7Var.p();
                            }
                            u7Var.Z = 0.0f;
                            k5Var = u7Var.n1;
                            if (k5Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(k5Var);
                                u7Var.n1.run();
                                u7Var.n1 = null;
                            }
                            AndroidUtilities.cancelRunOnUIThread(j2Var);
                        }
                        u7Var.y();
                    }
                }
            }
            f7 = 1.0f;
            if (abs > abs2) {
                u7Var.g0 = true;
            }
            if (!u7Var.j0) {
                if (abs > abs2) {
                    u7Var.j0 = true;
                    currentPeerView = u7Var.n0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    u7Var.l0 = (!z11 || currentPeerView == null || currentPeerView.D1 || currentPeerView.F1 || u7Var.u1 != null) ? false : true;
                    if (z11) {
                    }
                    u7Var.c0 = z10;
                    if (z10) {
                        u7Var.c0 = false;
                    }
                    if (u7Var.c0) {
                    }
                    u7Var.Z = 0.0f;
                    k5Var = u7Var.n1;
                    if (k5Var != null) {
                    }
                    AndroidUtilities.cancelRunOnUIThread(j2Var);
                }
                u7Var.y();
            }
        } else {
            f7 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(j2Var);
                k5 k5Var3 = u7Var.n1;
                if (k5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(k5Var3);
                    u7Var.n1 = null;
                }
                u7Var.K(false);
                u7Var.g0 = false;
                u7Var.k0 = false;
                k2.v vVar2 = u7Var.G0;
                if (vVar2 != null && (t7Var = (t7) vVar2.c) != null) {
                    t7Var.setSeeking(false);
                }
                a3 t11 = u7Var.t();
                if (t11 != null && (o1Var = t11.L0) != null) {
                    o1Var.setAllowTouches(true);
                }
            }
        }
        g4 g4Var = u7Var.w;
        boolean z12 = g4Var != null && g4Var.f == f7;
        if (!u7Var.j0 && !z12) {
            u7Var.i0.onTouchEvent(motionEvent);
        }
        return u7Var.j0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        u7 u7Var = this.I0;
        ((FrameLayout.LayoutParams) u7Var.d1.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(2.0f);
        u7Var.d1.getLayoutParams().height = AndroidUtilities.dp(2.0f);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o1 o1Var;
        int action = motionEvent.getAction();
        u7 u7Var = this.I0;
        int i10 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            u7Var.j0 = false;
            u7Var.K(false);
            if (u7Var.V >= 1.0f) {
                u7Var.q(true);
            } else if (!u7Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(u7Var.W, 0.0f);
                u7Var.G = ofFloat;
                ofFloat.addUpdateListener(new f7(this, i10));
                u7Var.G.addListener(new g7(this, i10));
                u7Var.G.setDuration(150L);
                u7Var.G.setInterpolator(wr.f);
                u7Var.G.start();
            }
            a3 t10 = u7Var.t();
            if (t10 != null && (o1Var = t10.L0) != null) {
                o1Var.setAllowTouches(true);
            }
        }
        if (!u7Var.j0 && !u7Var.x && u7Var.Z == 0.0f && ((u7Var.e0 == 0.0f || (!u7Var.f0 && !u7Var.g0)) && !u7Var.j1)) {
            return false;
        }
        u7Var.i0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.I0.f0 = false;
    }
}
