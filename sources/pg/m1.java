package pg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class m1 {
    public static final DispatchQueue m = new DispatchQueue("ShapeDetector");
    public static final double n = Math.sqrt(125000.0d) / 2.0d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public org.telegram.ui.web.b1 e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public i1 l;

    public static k1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((j1) arrayList.get(0)).a;
        double d10 = ((j1) arrayList.get(0)).b;
        k1 k1Var = new k1();
        k1Var.a = d;
        k1Var.b = d10;
        k1Var.c = d;
        k1Var.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            j1 j1Var = (j1) arrayList.get(i10);
            double d11 = j1Var.a;
            double d12 = j1Var.b;
            if (k1Var.a >= d11) {
                k1Var.a = d11;
            }
            if (k1Var.b >= d12) {
                k1Var.b = d12;
            }
            if (k1Var.c <= d11) {
                k1Var.c = d11;
            }
            if (k1Var.d <= d12) {
                k1Var.d = d12;
            }
        }
        return k1Var;
    }

    public static j1 b(ArrayList arrayList) {
        j1 j1Var = new j1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j1 j1Var2 = (j1) arrayList.get(i10);
            j1Var.a += j1Var2.a;
            j1Var.b += j1Var2.b;
        }
        j1Var.a /= arrayList.size();
        j1Var.b /= arrayList.size();
        return j1Var;
    }

    public static double d(ArrayList arrayList, j1 j1Var, ArrayList arrayList2, double d) {
        j1 j1Var2 = j1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            j1 j1Var3 = (j1) arrayList.get(i10);
            j1 j1Var4 = (j1) arrayList2.get(i10);
            double d11 = j1Var3.a;
            double d12 = cos;
            double d13 = j1Var2.a;
            double d14 = d11 - d13;
            double d15 = j1Var3.b;
            double d16 = j1Var2.b;
            double d17 = d15 - d16;
            d10 += j1Var4.a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            j1Var2 = j1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            j1 j1Var = (j1) arrayList.get(max - 1);
            j1 j1Var2 = (j1) arrayList.get(max);
            int i11 = max + 1;
            j1 j1Var3 = (j1) arrayList.get(i11);
            j1Var.getClass();
            double a2 = j1Var.a(j1Var2.a, j1Var2.b);
            double a10 = j1Var.a(j1Var3.a, j1Var3.b);
            double a11 = j1Var2.a(j1Var3.a, j1Var3.b);
            if ((Math.acos((((a10 * a10) + (a2 * a2)) - (a11 * a11)) / ((a2 * 2.0d) * a10)) / 3.141592653589793d) * 180.0d > 18.0d) {
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
            j1 j1Var = (j1) arrayList.get(i10);
            arrayList2.add(new j1(j1Var.a, j1Var.b));
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
        alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new lg.j(14, this, arrayList));
        alertDialog$Builder.o();
        this.i = null;
    }
}
