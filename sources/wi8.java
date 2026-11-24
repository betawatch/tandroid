// default package

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Random;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class wi8 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, nm7.m1, nm7.n1, nm7.o1, nm7.p1, nm7.q1, nm7.r1, nm7.s1, nm7.t1, nm7.u1, nm7.v1, nm7.w1, nm7.x1, nm7.y1, nm7.z1, nm7.A1, nm7.B1, nm7.C1, nm7.D1, nm7.E1, 121, nm7.F1, nm7.G1, nm7.H1, nm7.I1, nm7.J1, nm7.K1, 128, nm7.M1, nm7.N1, nm7.O1, nm7.P1, nm7.Q1, 134, 135, nm7.R1, nm7.S1, nm7.T1};

    public static /* synthetic */ boolean A(Object obj) {
        return obj != null;
    }

    public static int B(float f, int i, int i2) {
        return i2 - (gm.L(f) + i);
    }

    public static int C(ui5 ui5Var, float f, int i) {
        ui5Var.getClass();
        return gm.L(f) + i;
    }

    public static int D(float f, int i, int i2) {
        return (i - gm.L(f)) / i2;
    }

    public static int E(float f, int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(gm.L(f) + i, i2);
    }

    public static /* synthetic */ int F(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] G(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static int a(dx dxVar) {
        int boundLeft = dxVar.getBoundLeft();
        int boundRight = dxVar.getBoundRight();
        if (boundLeft < 0 || boundRight < 0 || boundRight < boundLeft) {
            return -1;
        }
        return boundRight - boundLeft;
    }

    public static /* synthetic */ Integer b(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static double d(double d, double d2, double d3) {
        return (Math.cos(d) * d2) + d3;
    }

    public static float e(Random random, float f, float f2) {
        return (random.nextFloat() * f) + f2;
    }

    public static int f(float f, int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(i - gm.L(f), i2);
    }

    public static int g(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static int h(ui5 ui5Var, float f, int i) {
        ui5Var.getClass();
        return i - gm.L(f);
    }

    public static my0 i(Activity activity, boolean z, int i, ylb ylbVar) {
        my0 my0Var = new my0(i, ylbVar, activity, z);
        my0Var.J();
        return my0Var;
    }

    public static vs2 j(String str, int i, int i2, int i3, bt2 bt2Var) {
        us2 b = ts2.b();
        b.b = str;
        b.v(i);
        b.w(i2, i3);
        return b.u(bt2Var);
    }

    public static vs2 k(String str, String str2, int i, bt2 bt2Var) {
        us2 b = ts2.b();
        b.b = str;
        b.c = str2;
        b.v(i);
        return b.u(bt2Var);
    }

    public static TextView l(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static TextView m(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static String n(long j, String str, String str2) {
        return str + j + str2;
    }

    public static StringBuilder o(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void q(long j, StringBuilder sb) {
        sb.append(j);
        fc4.b(sb.toString());
    }

    public static void r(im0 im0Var, float f, float f2) {
        im0Var.r(f);
        im0Var.q(gm.L(f2));
    }

    public static void s(ViewPropertyAnimator viewPropertyAnimator, float f, long j) {
        viewPropertyAnimator.alpha(f).setDuration(j).start();
    }

    public static void t(ViewPropertyAnimator viewPropertyAnimator, d53 d53Var, long j) {
        viewPropertyAnimator.setInterpolator(d53Var).setDuration(j).start();
    }

    public static void u(FrameLayout frameLayout, ylb ylbVar, TLRPC.TL_error tL_error, boolean z) {
        new c41(frameLayout, ylbVar).g0(tL_error, z);
    }

    public static void v(TextView textView, int i, float f) {
        textView.setTypeface(gm.o());
        textView.setTextSize(i, f);
    }

    public static void w(TextView textView, int i, float f, int i2, int i3) {
        textView.setTextSize(i, f);
        textView.setLines(i2);
        textView.setMaxLines(i3);
    }

    public static void x(TextView textView, int i, ylb ylbVar, String str, int i2) {
        anb.X(textView, i, ylbVar);
        textView.setText(jb6.M0(i2, str));
    }

    public static void y(String str, int i, AlertDialog$Builder alertDialog$Builder, ee eeVar) {
        alertDialog$Builder.g(jb6.M0(i, str), eeVar);
        alertDialog$Builder.o();
    }

    public static void z(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}
