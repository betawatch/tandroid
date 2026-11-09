package sg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c1 {
    public static final q5 m = new q5("ShapeDetector", true);
    public static final double n = Math.sqrt(125000.0d) / 2.0d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public ii.c e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public z0 l;

    public static m8.d a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((a1) arrayList.get(0)).a;
        double d2 = ((a1) arrayList.get(0)).b;
        m8.d dVar = new m8.d(1);
        dVar.b = d;
        dVar.c = d2;
        dVar.d = d;
        dVar.e = d2;
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            a1 a1Var = (a1) arrayList.get(i7);
            double d10 = a1Var.a;
            double d11 = a1Var.b;
            if (dVar.b >= d10) {
                dVar.b = d10;
            }
            if (dVar.c >= d11) {
                dVar.c = d11;
            }
            if (dVar.d <= d10) {
                dVar.d = d10;
            }
            if (dVar.e <= d11) {
                dVar.e = d11;
            }
        }
        return dVar;
    }

    public static a1 b(ArrayList arrayList) {
        a1 a1Var = new a1(0.0d, 0.0d);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            a1 a1Var2 = (a1) arrayList.get(i7);
            a1Var.a += a1Var2.a;
            a1Var.b += a1Var2.b;
        }
        a1Var.a /= arrayList.size();
        a1Var.b /= arrayList.size();
        return a1Var;
    }

    public static double d(ArrayList arrayList, a1 a1Var, ArrayList arrayList2, double d) {
        a1 a1Var2 = a1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i7 = 0;
        while (i7 < min) {
            a1 a1Var3 = (a1) arrayList.get(i7);
            a1 a1Var4 = (a1) arrayList2.get(i7);
            double d10 = a1Var3.a;
            double d11 = cos;
            double d12 = a1Var2.a;
            double d13 = d10 - d12;
            double d14 = a1Var3.b;
            double d15 = a1Var2.b;
            double d16 = d14 - d15;
            d2 += a1Var4.a(((d13 * d11) - (d16 * sin)) + d12, (d16 * d11) + (d13 * sin) + d15);
            i7++;
            a1Var2 = a1Var;
            cos = d11;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i7, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            a1 a1Var = (a1) arrayList.get(max - 1);
            a1 a1Var2 = (a1) arrayList.get(max);
            int i10 = max + 1;
            a1 a1Var3 = (a1) arrayList.get(i10);
            a1Var.getClass();
            double a10 = a1Var.a(a1Var2.a, a1Var2.b);
            double a11 = a1Var.a(a1Var3.a, a1Var3.b);
            double a12 = a1Var2.a(a1Var3.a, a1Var3.b);
            if ((Math.acos((((a11 * a11) + (a10 * a10)) - (a12 * a12)) / ((a10 * 2.0d) * a11)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i7 <= 0) {
                    return max;
                }
                i7--;
            }
            max = i10;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            a1 a1Var = (a1) arrayList.get(i7);
            arrayList2.add(new a1(a1Var.a, a1Var.b));
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
        alertDialog$Builder.a.R = "Shape?";
        alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new og.j(14, this, arrayList));
        alertDialog$Builder.p();
        this.i = null;
    }
}
