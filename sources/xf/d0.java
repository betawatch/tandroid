package xf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import ih.u5;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.y01;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d0 {
    public static final gr B = new gr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final c1 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public u0 g;
    public u0 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final k1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final u0[] m = new u0[3];
    public final float[] u = new float[2];
    public final z y = new z(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [xf.g1] */
    public d0(c1 c1Var) {
        this.a = c1Var;
        Context context = c1Var.getContext();
        i9 i9Var = new i9(this, 20);
        final k1 k1Var = new k1();
        k1Var.b = new ArrayList();
        k1Var.c = new ArrayList();
        k1Var.i = null;
        k1Var.j = new AtomicBoolean(false);
        k1Var.k = new AtomicBoolean(false);
        final int i9 = 0;
        k1Var.l = new Runnable() { // from class: xf.g1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                f1 f1Var;
                int e10;
                double d;
                long j10;
                int i10;
                double d9;
                char c10;
                String string;
                int i11;
                switch (i9) {
                    case 0:
                        k1 k1Var2 = k1Var;
                        if (k1Var2.j.get()) {
                            return;
                        }
                        k1Var2.k.set(false);
                        k1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (k1Var2) {
                            try {
                                if (k1Var2.b.size() < 8) {
                                    k1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = k1.f(k1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((h1) f10.get(0));
                                    int i12 = 1;
                                    double d10 = 0.0d;
                                    while (i12 < f10.size()) {
                                        h1 h1Var = (h1) f10.get(i12 - 1);
                                        h1 h1Var2 = (h1) f10.get(i12);
                                        h1Var.getClass();
                                        d10 += h1Var.a(h1Var2.a, h1Var2.b);
                                        i12++;
                                        k1Var2 = k1Var2;
                                    }
                                    k1 k1Var3 = k1Var2;
                                    double d11 = d10 / 47;
                                    int i13 = 1;
                                    double d12 = 0.0d;
                                    while (i13 < f10.size()) {
                                        int i14 = i13 - 1;
                                        h1 h1Var3 = (h1) f10.get(i14);
                                        h1 h1Var4 = (h1) f10.get(i13);
                                        h1Var3.getClass();
                                        double d13 = d12;
                                        int i15 = i13;
                                        double a2 = h1Var3.a(h1Var4.a, h1Var4.b);
                                        double d14 = d13 + a2;
                                        if (d14 >= d11) {
                                            double d15 = (d11 - d13) / a2;
                                            i10 = i15;
                                            d9 = d11;
                                            j10 = currentTimeMillis;
                                            h1 h1Var5 = new h1(((((h1) f10.get(i10)).a - ((h1) f10.get(i14)).a) * d15) + ((h1) f10.get(i14)).a, ((((h1) f10.get(i10)).b - ((h1) f10.get(i14)).b) * d15) + ((h1) f10.get(i14)).b);
                                            arrayList.add(h1Var5);
                                            f10.add(i10, h1Var5);
                                            d12 = 0.0d;
                                        } else {
                                            j10 = currentTimeMillis;
                                            i10 = i15;
                                            d9 = d11;
                                            d12 = d14;
                                        }
                                        i13 = i10 + 1;
                                        d11 = d9;
                                        currentTimeMillis = j10;
                                    }
                                    long j11 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((h1) j3.r0.j(1, f10));
                                    }
                                    ArrayList f11 = k1.f(arrayList);
                                    h1 b10 = k1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((h1) f11.get(0)).b, b10.a - ((h1) f11.get(0)).a);
                                    h1 b11 = k1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i16 = 0;
                                    while (i16 < f11.size()) {
                                        h1 h1Var6 = (h1) f11.get(i16);
                                        double d16 = h1Var6.a;
                                        double d17 = b11.a;
                                        double d18 = d16 - d17;
                                        double d19 = sin;
                                        double d20 = h1Var6.b;
                                        double d21 = b11.b;
                                        double d22 = d20 - d21;
                                        h1Var6.b = (d22 * cos) + (d18 * d19) + d21;
                                        h1Var6.a = ((d18 * cos) - (d22 * d19)) + d17;
                                        i16++;
                                        sin = d19;
                                    }
                                    h1 b12 = k1.b(f11);
                                    double d23 = -b12.a;
                                    double d24 = -b12.b;
                                    for (int i17 = 0; i17 < f11.size(); i17++) {
                                        h1 h1Var7 = (h1) f11.get(i17);
                                        h1Var7.a += d23;
                                        h1Var7.b += d24;
                                    }
                                    i1 a3 = k1.a(f11);
                                    double d25 = a3.c - a3.a;
                                    double d26 = a3.d - a3.b;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        h1 h1Var8 = (h1) f11.get(i18);
                                        h1Var8.a = (250.0d / d25) * h1Var8.a;
                                        h1Var8.b = (250.0d / d26) * h1Var8.b;
                                    }
                                    h1 b13 = k1.b(f11);
                                    double d27 = Double.MAX_VALUE;
                                    int i19 = -1;
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < k1Var3.c.size(); i21++) {
                                        ArrayList arrayList2 = ((j1) k1Var3.c.get(i21)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d28 = -1.5707963267948966d;
                                        double d29 = 1.0d - sqrt;
                                        double d30 = 1.5707963267948966d;
                                        double d31 = d27;
                                        double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d33 = k1.d(f11, b13, arrayList2, d32);
                                        double d34 = d32;
                                        double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                        double d36 = k1.d(f11, b13, arrayList2, d35);
                                        double d37 = d35;
                                        double d38 = d33;
                                        double d39 = d36;
                                        while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                            if (d38 < d39) {
                                                double d40 = (d29 * d37) + (sqrt * d28);
                                                double d41 = k1.d(f11, b13, arrayList2, d40);
                                                d = d40;
                                                d39 = d38;
                                                d38 = d41;
                                                d30 = d37;
                                                d37 = d34;
                                            } else {
                                                double d42 = (d29 * d34) + (sqrt * d30);
                                                double d43 = k1.d(f11, b13, arrayList2, d42);
                                                d = d37;
                                                d37 = d42;
                                                d38 = d39;
                                                d39 = d43;
                                                d28 = d34;
                                            }
                                            d34 = d;
                                        }
                                        double min = Math.min(d38, d39);
                                        if (min < d31) {
                                            i19 = ((j1) k1Var3.c.get(i21)).a;
                                            d27 = min;
                                            i20 = i21;
                                        } else {
                                            d27 = d31;
                                        }
                                    }
                                    int i22 = 1.0d - (d27 / k1.n) < 0.8d ? -1 : i19;
                                    if (i22 >= 0 && i22 < l.b.size() && arrayList.size() >= 1) {
                                        f1 f1Var2 = new f1(l.p(i22));
                                        if (i22 == 4) {
                                            int e11 = k1.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                h1 h1Var9 = (h1) arrayList.get(e11);
                                                h1 h1Var10 = (h1) arrayList.get(e11 / 2);
                                                h1 h1Var11 = (h1) arrayList.get(0);
                                                f1Var2.b = (float) h1Var9.a;
                                                f1Var2.c = (float) h1Var9.b;
                                                f1Var2.i = (float) h1Var10.a;
                                                f1Var2.j = (float) h1Var10.b;
                                                f1Var2.d = (float) h1Var11.a;
                                                f1Var2.e = (float) h1Var11.b;
                                                f1Var2.k = 16.0f;
                                            }
                                        } else {
                                            h1 b14 = k1.b(arrayList);
                                            f1Var2.b = (float) b14.a;
                                            f1Var2.c = (float) b14.b;
                                            i1 a10 = k1.a(arrayList);
                                            f1Var2.d = ((float) (a10.c - a10.a)) / 2.0f;
                                            f1Var2.e = ((float) (a10.d - a10.b)) / 2.0f;
                                            if (i22 == 2 && (e10 = k1.e(1, arrayList)) > 0) {
                                                h1 h1Var12 = (h1) arrayList.get(e10);
                                                f1Var2.h = (float) Math.atan2(h1Var12.b - f1Var2.c, h1Var12.a - f1Var2.b);
                                            }
                                        }
                                        f1Var = f1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(f1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(f1Var != null ? " (template#" + i20 + " shape#" + i22 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new y01(k1Var3, f1Var, i20, f11, 14));
                                        k1Var3.j.set(false);
                                    }
                                    f1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new y01(k1Var3, f1Var, i20, f11, 14));
                                    k1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        k1 k1Var4 = k1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    j1 j1Var = new j1();
                                    j1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i23 = 0; i23 < read; i23++) {
                                            j1Var.b.add(new h1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        j1Var.c = k1Var4.g.getInt("score" + k1Var4.c.size(), 0);
                                        k1Var4.c.add(j1Var);
                                    }
                                }
                            }
                            if (k1Var4.h && (string = k1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = k1Var4.c.size();
                                int i24 = 0;
                                while (i24 < split.length) {
                                    j1 j1Var2 = new j1();
                                    String[] split2 = split[i24].split(",");
                                    int i25 = 1;
                                    if (split2.length <= 1) {
                                        i11 = i24;
                                    } else {
                                        j1Var2.a = Integer.parseInt(split2[c10]);
                                        while (i25 < split2.length) {
                                            j1Var2.b.add(new h1(Double.parseDouble(split2[i25]), Double.parseDouble(split2[i25 + 1])));
                                            i25 += 2;
                                            i24 = i24;
                                        }
                                        i11 = i24;
                                        j1Var2.c = k1Var4.g.getInt("score" + (size + i11), 0);
                                        k1Var4.c.add(j1Var2);
                                    }
                                    i24 = i11 + 1;
                                    c10 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                }
            }
        };
        k1Var.f = context;
        k1Var.e = i9Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        k1Var.g = sharedPreferences;
        k1Var.h = sharedPreferences.getBoolean("learning", false);
        k1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i10 = 1;
        k1.m.postRunnable(new Runnable() { // from class: xf.g1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                f1 f1Var;
                int e10;
                double d;
                long j10;
                int i102;
                double d9;
                char c10;
                String string;
                int i11;
                switch (i10) {
                    case 0:
                        k1 k1Var2 = k1Var;
                        if (k1Var2.j.get()) {
                            return;
                        }
                        k1Var2.k.set(false);
                        k1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (k1Var2) {
                            try {
                                if (k1Var2.b.size() < 8) {
                                    k1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = k1.f(k1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((h1) f10.get(0));
                                    int i12 = 1;
                                    double d10 = 0.0d;
                                    while (i12 < f10.size()) {
                                        h1 h1Var = (h1) f10.get(i12 - 1);
                                        h1 h1Var2 = (h1) f10.get(i12);
                                        h1Var.getClass();
                                        d10 += h1Var.a(h1Var2.a, h1Var2.b);
                                        i12++;
                                        k1Var2 = k1Var2;
                                    }
                                    k1 k1Var3 = k1Var2;
                                    double d11 = d10 / 47;
                                    int i13 = 1;
                                    double d12 = 0.0d;
                                    while (i13 < f10.size()) {
                                        int i14 = i13 - 1;
                                        h1 h1Var3 = (h1) f10.get(i14);
                                        h1 h1Var4 = (h1) f10.get(i13);
                                        h1Var3.getClass();
                                        double d13 = d12;
                                        int i15 = i13;
                                        double a2 = h1Var3.a(h1Var4.a, h1Var4.b);
                                        double d14 = d13 + a2;
                                        if (d14 >= d11) {
                                            double d15 = (d11 - d13) / a2;
                                            i102 = i15;
                                            d9 = d11;
                                            j10 = currentTimeMillis;
                                            h1 h1Var5 = new h1(((((h1) f10.get(i102)).a - ((h1) f10.get(i14)).a) * d15) + ((h1) f10.get(i14)).a, ((((h1) f10.get(i102)).b - ((h1) f10.get(i14)).b) * d15) + ((h1) f10.get(i14)).b);
                                            arrayList.add(h1Var5);
                                            f10.add(i102, h1Var5);
                                            d12 = 0.0d;
                                        } else {
                                            j10 = currentTimeMillis;
                                            i102 = i15;
                                            d9 = d11;
                                            d12 = d14;
                                        }
                                        i13 = i102 + 1;
                                        d11 = d9;
                                        currentTimeMillis = j10;
                                    }
                                    long j11 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((h1) j3.r0.j(1, f10));
                                    }
                                    ArrayList f11 = k1.f(arrayList);
                                    h1 b10 = k1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((h1) f11.get(0)).b, b10.a - ((h1) f11.get(0)).a);
                                    h1 b11 = k1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i16 = 0;
                                    while (i16 < f11.size()) {
                                        h1 h1Var6 = (h1) f11.get(i16);
                                        double d16 = h1Var6.a;
                                        double d17 = b11.a;
                                        double d18 = d16 - d17;
                                        double d19 = sin;
                                        double d20 = h1Var6.b;
                                        double d21 = b11.b;
                                        double d22 = d20 - d21;
                                        h1Var6.b = (d22 * cos) + (d18 * d19) + d21;
                                        h1Var6.a = ((d18 * cos) - (d22 * d19)) + d17;
                                        i16++;
                                        sin = d19;
                                    }
                                    h1 b12 = k1.b(f11);
                                    double d23 = -b12.a;
                                    double d24 = -b12.b;
                                    for (int i17 = 0; i17 < f11.size(); i17++) {
                                        h1 h1Var7 = (h1) f11.get(i17);
                                        h1Var7.a += d23;
                                        h1Var7.b += d24;
                                    }
                                    i1 a3 = k1.a(f11);
                                    double d25 = a3.c - a3.a;
                                    double d26 = a3.d - a3.b;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        h1 h1Var8 = (h1) f11.get(i18);
                                        h1Var8.a = (250.0d / d25) * h1Var8.a;
                                        h1Var8.b = (250.0d / d26) * h1Var8.b;
                                    }
                                    h1 b13 = k1.b(f11);
                                    double d27 = Double.MAX_VALUE;
                                    int i19 = -1;
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < k1Var3.c.size(); i21++) {
                                        ArrayList arrayList2 = ((j1) k1Var3.c.get(i21)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d28 = -1.5707963267948966d;
                                        double d29 = 1.0d - sqrt;
                                        double d30 = 1.5707963267948966d;
                                        double d31 = d27;
                                        double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d33 = k1.d(f11, b13, arrayList2, d32);
                                        double d34 = d32;
                                        double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                        double d36 = k1.d(f11, b13, arrayList2, d35);
                                        double d37 = d35;
                                        double d38 = d33;
                                        double d39 = d36;
                                        while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                            if (d38 < d39) {
                                                double d40 = (d29 * d37) + (sqrt * d28);
                                                double d41 = k1.d(f11, b13, arrayList2, d40);
                                                d = d40;
                                                d39 = d38;
                                                d38 = d41;
                                                d30 = d37;
                                                d37 = d34;
                                            } else {
                                                double d42 = (d29 * d34) + (sqrt * d30);
                                                double d43 = k1.d(f11, b13, arrayList2, d42);
                                                d = d37;
                                                d37 = d42;
                                                d38 = d39;
                                                d39 = d43;
                                                d28 = d34;
                                            }
                                            d34 = d;
                                        }
                                        double min = Math.min(d38, d39);
                                        if (min < d31) {
                                            i19 = ((j1) k1Var3.c.get(i21)).a;
                                            d27 = min;
                                            i20 = i21;
                                        } else {
                                            d27 = d31;
                                        }
                                    }
                                    int i22 = 1.0d - (d27 / k1.n) < 0.8d ? -1 : i19;
                                    if (i22 >= 0 && i22 < l.b.size() && arrayList.size() >= 1) {
                                        f1 f1Var2 = new f1(l.p(i22));
                                        if (i22 == 4) {
                                            int e11 = k1.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                h1 h1Var9 = (h1) arrayList.get(e11);
                                                h1 h1Var10 = (h1) arrayList.get(e11 / 2);
                                                h1 h1Var11 = (h1) arrayList.get(0);
                                                f1Var2.b = (float) h1Var9.a;
                                                f1Var2.c = (float) h1Var9.b;
                                                f1Var2.i = (float) h1Var10.a;
                                                f1Var2.j = (float) h1Var10.b;
                                                f1Var2.d = (float) h1Var11.a;
                                                f1Var2.e = (float) h1Var11.b;
                                                f1Var2.k = 16.0f;
                                            }
                                        } else {
                                            h1 b14 = k1.b(arrayList);
                                            f1Var2.b = (float) b14.a;
                                            f1Var2.c = (float) b14.b;
                                            i1 a10 = k1.a(arrayList);
                                            f1Var2.d = ((float) (a10.c - a10.a)) / 2.0f;
                                            f1Var2.e = ((float) (a10.d - a10.b)) / 2.0f;
                                            if (i22 == 2 && (e10 = k1.e(1, arrayList)) > 0) {
                                                h1 h1Var12 = (h1) arrayList.get(e10);
                                                f1Var2.h = (float) Math.atan2(h1Var12.b - f1Var2.c, h1Var12.a - f1Var2.b);
                                            }
                                        }
                                        f1Var = f1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(f1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(f1Var != null ? " (template#" + i20 + " shape#" + i22 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new y01(k1Var3, f1Var, i20, f11, 14));
                                        k1Var3.j.set(false);
                                    }
                                    f1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new y01(k1Var3, f1Var, i20, f11, 14));
                                    k1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        k1 k1Var4 = k1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    j1 j1Var = new j1();
                                    j1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i23 = 0; i23 < read; i23++) {
                                            j1Var.b.add(new h1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        j1Var.c = k1Var4.g.getInt("score" + k1Var4.c.size(), 0);
                                        k1Var4.c.add(j1Var);
                                    }
                                }
                            }
                            if (k1Var4.h && (string = k1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = k1Var4.c.size();
                                int i24 = 0;
                                while (i24 < split.length) {
                                    j1 j1Var2 = new j1();
                                    String[] split2 = split[i24].split(",");
                                    int i25 = 1;
                                    if (split2.length <= 1) {
                                        i11 = i24;
                                    } else {
                                        j1Var2.a = Integer.parseInt(split2[c10]);
                                        while (i25 < split2.length) {
                                            j1Var2.b.add(new h1(Double.parseDouble(split2[i25]), Double.parseDouble(split2[i25 + 1])));
                                            i25 += 2;
                                            i24 = i24;
                                        }
                                        i11 = i24;
                                        j1Var2.c = k1Var4.g.getInt("score" + (size + i11), 0);
                                        k1Var4.c.add(j1Var2);
                                    }
                                    i24 = i11 + 1;
                                    c10 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                }
            }
        });
        this.s = k1Var;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        b1 b1Var;
        if (this.l) {
            c1 c1Var = this.a;
            if (c1Var.getPainting().G || this.g == null) {
                return;
            }
            m currentBrush = dVar == null ? c1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final m mVar = currentBrush;
            this.l = false;
            if (mVar instanceof d) {
                c1Var.getPainting().E = false;
            }
            q0 painting = c1Var.getPainting();
            painting.f.f(new m0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z10 && (b1Var = c1Var.a) != null) {
                b1Var.f();
            }
            qu0 qu0Var = c1Var.getPainting().g;
            u0 u0Var = this.g;
            float a2 = g7.w.a((float) u0Var.a, (float) u0Var.b, 0.0f, 0.0f);
            u0 u0Var2 = this.g;
            float max = Math.max(a2, g7.w.a((float) u0Var2.a, (float) u0Var2.b, qu0Var.a, 0.0f));
            u0 u0Var3 = this.g;
            float a3 = g7.w.a((float) u0Var3.a, (float) u0Var3.b, 0.0f, qu0Var.b);
            u0 u0Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a3, g7.w.a((float) u0Var4.a, (float) u0Var4.b, qu0Var.a, qu0Var.b))) / 0.84f;
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            ValueAnimator valueAnimator2 = this.x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.x = null;
            }
            u0 u0Var5 = this.g;
            final u0 u0Var6 = new u0(u0Var5.a, u0Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xf.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    c1 c1Var2 = d0.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    r0 r0Var = new r0(new u0[]{u0Var6});
                    m mVar2 = mVar;
                    mVar2.getClass();
                    int currentColor = mVar2 instanceof d ? -1 : c1Var2.getCurrentColor();
                    float f10 = floatValue * max2;
                    r0Var.c = currentColor;
                    r0Var.d = f10;
                    r0Var.e = mVar2;
                    q0 painting2 = c1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z11 = true;
                    painting2.f.f(new u5(painting2, r0Var, z11, z11, null, 4));
                }
            });
            this.x.addListener(new c0(this, u0Var6, max2, mVar, z10, w0Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(gr.h);
            this.x.start();
            if (z10) {
                BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.c = currentColor;
        r0Var.d = currentWeight;
        r0Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        r0Var.a = this.i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f;
        b0 b0Var = new b0(this, r0Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f.f(new u5(painting, r0Var, z10, z11, b0Var, 4));
        }
        this.f = false;
    }

    public final void c(float f10, boolean z10) {
        int i9 = this.n;
        u0[] u0VarArr = this.m;
        if (i9 <= 2) {
            u0[] u0VarArr2 = new u0[i9];
            System.arraycopy(u0VarArr, 0, u0VarArr2, 0, i9);
            b(new r0(u0VarArr2));
            return;
        }
        Vector vector = new Vector();
        u0 u0Var = u0VarArr[0];
        u0 u0Var2 = u0VarArr[1];
        u0 u0Var3 = u0VarArr[2];
        if (u0Var3 == null || u0Var2 == null || u0Var == null) {
            return;
        }
        u0 b10 = u0Var2.b(u0Var);
        u0 b11 = u0Var3.b(u0Var2);
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
        float f11 = 1.0f;
        float f12 = 1.0f / min;
        int i10 = 0;
        float f13 = 0.0f;
        while (i10 < min) {
            float f14 = f11 - f13;
            double d = f14;
            double pow = Math.pow(d, 2.0d);
            double d9 = f13 * f13;
            double d10 = f14 * f14;
            double d11 = f13;
            double d12 = (b11.a * d9) + (u0Var2.a * 2.0d * d11 * d) + (b10.a * d10);
            double d13 = (b11.b * d9) + (u0Var2.b * 2.0d * d11 * d) + (b10.b * d10);
            double lerp = ((((b11.c * d9) + ((u0Var2.c * ((2.0f * f14) * f13)) + (b10.c * pow))) - 1.0d) * AndroidUtilities.lerp(f10, 1.0f, g7.n.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            u0 u0Var4 = new u0(d12, d13, lerp);
            if (this.c) {
                u0Var4.d = true;
                this.c = false;
            }
            vector.add(u0Var4);
            this.p += lerp;
            this.q += 1.0d;
            f13 += f12;
            i10++;
            f11 = 1.0f;
        }
        if (z10) {
            b11.d = true;
        }
        vector.add(b11);
        u0[] u0VarArr3 = new u0[vector.size()];
        vector.toArray(u0VarArr3);
        b(new r0(u0VarArr3));
        System.arraycopy(u0VarArr, 1, u0VarArr, 0, 2);
        if (z10) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
