package xf;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.i9;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k1 {
    public static final DispatchQueue m = new DispatchQueue("ShapeDetector");
    public static final double n = Math.sqrt(125000.0d) / 2.0d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public i9 e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public g1 l;

    public static i1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((h1) arrayList.get(0)).a;
        double d9 = ((h1) arrayList.get(0)).b;
        i1 i1Var = new i1();
        i1Var.a = d;
        i1Var.b = d9;
        i1Var.c = d;
        i1Var.d = d9;
        for (int i9 = 1; i9 < arrayList.size(); i9++) {
            h1 h1Var = (h1) arrayList.get(i9);
            double d10 = h1Var.a;
            double d11 = h1Var.b;
            if (i1Var.a >= d10) {
                i1Var.a = d10;
            }
            if (i1Var.b >= d11) {
                i1Var.b = d11;
            }
            if (i1Var.c <= d10) {
                i1Var.c = d10;
            }
            if (i1Var.d <= d11) {
                i1Var.d = d11;
            }
        }
        return i1Var;
    }

    public static h1 b(ArrayList arrayList) {
        h1 h1Var = new h1(0.0d, 0.0d);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            h1 h1Var2 = (h1) arrayList.get(i9);
            h1Var.a += h1Var2.a;
            h1Var.b += h1Var2.b;
        }
        h1Var.a /= arrayList.size();
        h1Var.b /= arrayList.size();
        return h1Var;
    }

    public static double d(ArrayList arrayList, h1 h1Var, ArrayList arrayList2, double d) {
        h1 h1Var2 = h1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d9 = 0.0d;
        int i9 = 0;
        while (i9 < min) {
            h1 h1Var3 = (h1) arrayList.get(i9);
            h1 h1Var4 = (h1) arrayList2.get(i9);
            double d10 = h1Var3.a;
            double d11 = cos;
            double d12 = h1Var2.a;
            double d13 = d10 - d12;
            double d14 = h1Var3.b;
            double d15 = h1Var2.b;
            double d16 = d14 - d15;
            d9 += h1Var4.a(((d13 * d11) - (d16 * sin)) + d12, (d16 * d11) + (d13 * sin) + d15);
            i9++;
            h1Var2 = h1Var;
            cos = d11;
        }
        return d9 / arrayList.size();
    }

    public static int e(int i9, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            h1 h1Var = (h1) arrayList.get(max - 1);
            h1 h1Var2 = (h1) arrayList.get(max);
            int i10 = max + 1;
            h1 h1Var3 = (h1) arrayList.get(i10);
            h1Var.getClass();
            double a2 = h1Var.a(h1Var2.a, h1Var2.b);
            double a3 = h1Var.a(h1Var3.a, h1Var3.b);
            double a10 = h1Var2.a(h1Var3.a, h1Var3.b);
            if ((Math.acos((((a3 * a3) + (a2 * a2)) - (a10 * a10)) / ((a2 * 2.0d) * a3)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i9 <= 0) {
                    return max;
                }
                i9--;
            }
            max = i10;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            h1 h1Var = (h1) arrayList.get(i9);
            arrayList2.add(new h1(h1Var.a, h1Var.b));
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
        alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new org.telegram.ui.v(13, this, arrayList));
        alertDialog$Builder.o();
        this.i = null;
    }
}
