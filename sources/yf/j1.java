package yf;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.n6;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j1 {
    public static final DispatchQueue m = new DispatchQueue("ShapeDetector");
    public static final double n = Math.sqrt(125000.0d) / 2.0d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public n6 e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public f1 l;

    public static h1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((g1) arrayList.get(0)).a;
        double d10 = ((g1) arrayList.get(0)).b;
        h1 h1Var = new h1();
        h1Var.a = d;
        h1Var.b = d10;
        h1Var.c = d;
        h1Var.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            g1 g1Var = (g1) arrayList.get(i10);
            double d11 = g1Var.a;
            double d12 = g1Var.b;
            if (h1Var.a >= d11) {
                h1Var.a = d11;
            }
            if (h1Var.b >= d12) {
                h1Var.b = d12;
            }
            if (h1Var.c <= d11) {
                h1Var.c = d11;
            }
            if (h1Var.d <= d12) {
                h1Var.d = d12;
            }
        }
        return h1Var;
    }

    public static g1 b(ArrayList arrayList) {
        g1 g1Var = new g1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g1 g1Var2 = (g1) arrayList.get(i10);
            g1Var.a += g1Var2.a;
            g1Var.b += g1Var2.b;
        }
        g1Var.a /= arrayList.size();
        g1Var.b /= arrayList.size();
        return g1Var;
    }

    public static double d(ArrayList arrayList, g1 g1Var, ArrayList arrayList2, double d) {
        g1 g1Var2 = g1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            g1 g1Var3 = (g1) arrayList.get(i10);
            g1 g1Var4 = (g1) arrayList2.get(i10);
            double d11 = g1Var3.a;
            double d12 = cos;
            double d13 = g1Var2.a;
            double d14 = d11 - d13;
            double d15 = g1Var3.b;
            double d16 = g1Var2.b;
            double d17 = d15 - d16;
            d10 += g1Var4.a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            g1Var2 = g1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            g1 g1Var = (g1) arrayList.get(max - 1);
            g1 g1Var2 = (g1) arrayList.get(max);
            int i11 = max + 1;
            g1 g1Var3 = (g1) arrayList.get(i11);
            g1Var.getClass();
            double a2 = g1Var.a(g1Var2.a, g1Var2.b);
            double a3 = g1Var.a(g1Var3.a, g1Var3.b);
            double a10 = g1Var2.a(g1Var3.a, g1Var3.b);
            if ((Math.acos((((a3 * a3) + (a2 * a2)) - (a10 * a10)) / ((a2 * 2.0d) * a3)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i10 <= 0) {
                    return max;
                }
                i10--;
            }
            max = i11;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g1 g1Var = (g1) arrayList.get(i10);
            arrayList2.add(new g1(g1Var.a, g1Var.b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.b.clear();
        }
        m.cancelRunnable(this.l);
        this.k.set(false);
        this.d = false;
        if (!this.h || (arrayList = this.i) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f);
        alertDialog$Builder.a.N = "Shape?";
        alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new org.telegram.ui.w(13, this, arrayList));
        alertDialog$Builder.o();
        this.i = null;
    }
}
