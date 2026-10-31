package vh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.jc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ a7(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String L0;
        int i10 = this.a;
        boolean z10 = false;
        o8 o8Var = this.b;
        switch (i10) {
            case 0:
                o8 o8Var2 = this.b;
                if (o8Var2.K1 != null && o8Var2.C2 == null && o8Var2.i1 != null) {
                    ValueAnimator valueAnimator = o8Var2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = o8Var2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(o8Var2.n.getWidth(), o8Var2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        o8Var2.i1.setAlpha(0.0f);
                        d8 d8Var = o8Var2.X0;
                        if (d8Var != null) {
                            d8Var.g0 = true;
                        }
                        s7 s7Var = o8Var2.v1;
                        if (s7Var != null) {
                            s7Var.r0 = true;
                        }
                        o8Var2.n.draw(canvas);
                        d8 d8Var2 = o8Var2.X0;
                        if (d8Var2 != null) {
                            d8Var2.g0 = false;
                        }
                        s7 s7Var2 = o8Var2.v1;
                        if (s7Var2 != null) {
                            s7Var2.r0 = false;
                        }
                        o8Var2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        o8Var2.i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        y7 y7Var = new y7(o8Var2, o8Var2.b, z11, canvas, (o8Var2.i1.getMeasuredWidth() / 2.0f) + f7, (o8Var2.i1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10);
                        o8Var2.C2 = y7Var;
                        y7Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        o8Var2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        o8Var2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new jc(o8Var2, 3));
                        o8Var2.E2.addListener(new q7(o8Var2, 2));
                        o8Var2.E2.setStartDelay(80L);
                        o8Var2.E2.setDuration(z11 ? 320L : 450L);
                        o8Var2.E2.setInterpolator(z11 ? gr.i : gr.h);
                        o8Var2.E2.start();
                        o8Var2.n.addView(o8Var2.C2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new y6(o8Var2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!o8Var.S1) {
                    o8Var.L();
                    break;
                }
                break;
            case 2:
                n5 n5Var = o8Var.K1;
                if (n5Var != null && !o8Var.S1) {
                    n5Var.Y = !n5Var.Y;
                    ArrayList arrayList = n5Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((n5) obj).Y = o8Var.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(o8Var.K1.y);
                    n5 n5Var2 = o8Var.K1;
                    boolean z12 = n5Var2.o0 != null;
                    if (o8Var.g0 == -1) {
                        p2 p2Var = o8Var.k1;
                        if (n5Var2.Y) {
                            L0 = cd.L0((!isEmpty || z12) ? 2131744611 : 2131744486, null);
                        } else {
                            L0 = cd.L0((!isEmpty || z12) ? 2131744610 : 2131744485, null);
                        }
                        boolean z13 = o8Var.k1.V;
                        if (p2Var.getMeasuredWidth() < 0) {
                            p2Var.G = L0;
                        } else {
                            org.telegram.ui.Components.e6 e6Var = p2Var.H;
                            if (!cd.X && z13) {
                                z10 = true;
                            }
                            e6Var.t(L0, z10, true);
                        }
                        o8Var.k1.u();
                    }
                    o8Var.e0(o8Var.K1.Y, true);
                    o8Var.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = o8Var.X0.k();
                o8Var.X0.x(-9982, k10);
                ((kf0) o8Var.j1.c).a(!k10, true);
                break;
            case 4:
                if (o8Var.B0 != null && !o8Var.S1) {
                    String B = o8Var.B();
                    String E = o8Var.E();
                    if (B != null && !B.equals(E)) {
                        t7 t7Var = o8Var.B0;
                        if (t7Var != null && t7Var.getCameraSession() != null) {
                            if (!o8Var.B0.isFrontface() || o8Var.B0.getCameraSession().hasFlashModes()) {
                                o8Var.B0.getCameraSession().setCurrentFlashMode(E);
                            } else {
                                int indexOf = o8Var.u2.indexOf(E);
                                if (indexOf >= 0) {
                                    o8Var.t2 = indexOf;
                                    vp.d1().edit().putInt("frontflash", o8Var.t2).apply();
                                }
                            }
                        }
                        o8Var.d0(E);
                        break;
                    }
                }
                break;
            case 5:
                t7 t7Var2 = o8Var.B0;
                if (t7Var2 != null && o8Var.f0 == 0) {
                    t7Var2.toggleDual();
                    o8Var.F0.setValue(o8Var.B0.isDual());
                    o8Var.F0.setContentDescription(cd.L0(o8Var.B0.isDual() ? 2131754886 : 2131754887, null));
                    o8Var.l1.e(true);
                    vp.d1().edit().putInt("storydualhint", 2).apply();
                    if (o8Var.m1.V) {
                        vp.d1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    o8Var.m1.e(true);
                    break;
                }
                break;
            case 6:
                if (o8Var.f0 == 0 && !o8Var.a2) {
                    t7 t7Var3 = o8Var.B0;
                    if (t7Var3 != null && t7Var3.isDual()) {
                        o8Var.B0.toggleDual();
                    }
                    if (!o8Var.I0.e && !o8Var.A0.j()) {
                        o8Var.A0.o(o8Var.z0);
                        o8Var.I0.setSelected(o8Var.z0);
                        o8Var.G0.a(new ob0(o8Var.z0, false), true);
                        o8Var.G0.setSelected(true);
                        t7 t7Var4 = o8Var.B0;
                        if (t7Var4 != null) {
                            t7Var4.recordHevc = !o8Var.A0.j();
                        }
                        m2 m2Var = o8Var.M0;
                        if (m2Var != null) {
                            m2Var.setMultipleOnClick(o8Var.A0.j());
                            o8Var.M0.setMaxCount(Math.min(10, r.b() - o8Var.A0.getFilledCount()));
                        }
                    }
                    o8Var.I0.a(!r1.e, true);
                    o8Var.l0(true);
                    break;
                }
                break;
            case 7:
                o8Var.A0.o(null);
                o8Var.A0.e();
                o8Var.I0.setSelected((r) null);
                t7 t7Var5 = o8Var.B0;
                if (t7Var5 != null) {
                    t7Var5.recordHevc = !o8Var.A0.j();
                }
                o8Var.I0.a(false, true);
                o8Var.l0(true);
                m2 m2Var2 = o8Var.M0;
                if (m2Var2 != null) {
                    m2Var2.setMultipleOnClick(o8Var.A0.j());
                    o8Var.M0.setMaxCount(Math.min(10, r.b() - o8Var.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                o8Var.j0();
                break;
            case 9:
                t7 t7Var6 = o8Var.B0;
                if (t7Var6 != null && !o8Var.S1 && !o8Var.P1 && t7Var6.isInited() && o8Var.f0 == 0) {
                    o8Var.B0.switchCamera();
                    o8Var.O0.d(180.0f);
                    o8.Z(o8Var.B0.isFrontface());
                    if (!o8Var.p0()) {
                        o8Var.s.d();
                        break;
                    } else {
                        o8Var.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                o8Var.j0();
                break;
            case 11:
                n5 n5Var3 = o8Var.K1;
                if (n5Var3 != null) {
                    n5Var3.f0 = true;
                    n5Var3.e0 = o8Var.M1;
                    o8Var.W();
                    n5 n5Var4 = o8Var.K1;
                    if (n5Var4 != null && !n5Var4.b0) {
                        org.telegram.messenger.i0.h3(new y6(o8Var, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (o8Var.s2) {
                    o8Var.Y(true);
                    break;
                }
                break;
            case 13:
                o8Var.k0(-1, false, true);
                break;
            default:
                o8Var.k0(-1, false, true);
                break;
        }
    }
}
