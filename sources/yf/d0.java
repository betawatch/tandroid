package yf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.q5;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.xs;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d0 {
    public static final er B = new er(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final b1 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public t0 g;
    public t0 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final j1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final t0[] m = new t0[3];
    public final float[] u = new float[2];
    public final z y = new z(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [yf.f1] */
    public d0(b1 b1Var) {
        this.a = b1Var;
        Context context = b1Var.getContext();
        n6 n6Var = new n6(this, 22);
        final j1 j1Var = new j1();
        j1Var.b = new ArrayList();
        j1Var.c = new ArrayList();
        j1Var.i = null;
        j1Var.j = new AtomicBoolean(false);
        j1Var.k = new AtomicBoolean(false);
        final int i10 = 0;
        j1Var.l = new Runnable() { // from class: yf.f1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                e1 e1Var;
                int e9;
                double d;
                long j10;
                int i11;
                double d10;
                char c10;
                String string;
                int i12;
                switch (i10) {
                    case 0:
                        j1 j1Var2 = j1Var;
                        if (j1Var2.j.get()) {
                            return;
                        }
                        j1Var2.k.set(false);
                        j1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (j1Var2) {
                            try {
                                if (j1Var2.b.size() < 8) {
                                    j1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = j1.f(j1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((g1) f10.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f10.size()) {
                                        g1 g1Var = (g1) f10.get(i13 - 1);
                                        g1 g1Var2 = (g1) f10.get(i13);
                                        g1Var.getClass();
                                        d11 += g1Var.a(g1Var2.a, g1Var2.b);
                                        i13++;
                                        j1Var2 = j1Var2;
                                    }
                                    j1 j1Var3 = j1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f10.size()) {
                                        int i15 = i14 - 1;
                                        g1 g1Var3 = (g1) f10.get(i15);
                                        g1 g1Var4 = (g1) f10.get(i14);
                                        g1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = g1Var3.a(g1Var4.a, g1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i11 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            g1 g1Var5 = new g1(((((g1) f10.get(i11)).a - ((g1) f10.get(i15)).a) * d16) + ((g1) f10.get(i15)).a, ((((g1) f10.get(i11)).b - ((g1) f10.get(i15)).b) * d16) + ((g1) f10.get(i15)).b);
                                            arrayList.add(g1Var5);
                                            f10.add(i11, g1Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j10 = currentTimeMillis;
                                            i11 = i16;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i14 = i11 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j10;
                                    }
                                    long j11 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((g1) i0.a.i(1, f10));
                                    }
                                    ArrayList f11 = j1.f(arrayList);
                                    g1 b10 = j1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((g1) f11.get(0)).b, b10.a - ((g1) f11.get(0)).a);
                                    g1 b11 = j1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f11.size()) {
                                        g1 g1Var6 = (g1) f11.get(i17);
                                        double d17 = g1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = g1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        g1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        g1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    g1 b12 = j1.b(f11);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        g1 g1Var7 = (g1) f11.get(i18);
                                        g1Var7.a += d24;
                                        g1Var7.b += d25;
                                    }
                                    h1 a3 = j1.a(f11);
                                    double d26 = a3.c - a3.a;
                                    double d27 = a3.d - a3.b;
                                    for (int i19 = 0; i19 < f11.size(); i19++) {
                                        g1 g1Var8 = (g1) f11.get(i19);
                                        g1Var8.a = (250.0d / d26) * g1Var8.a;
                                        g1Var8.b = (250.0d / d27) * g1Var8.b;
                                    }
                                    g1 b13 = j1.b(f11);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < j1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((i1) j1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = j1.d(f11, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = j1.d(f11, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = j1.d(f11, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = j1.d(f11, b13, arrayList2, d43);
                                                d = d38;
                                                d38 = d43;
                                                d39 = d40;
                                                d40 = d44;
                                                d29 = d35;
                                            }
                                            d35 = d;
                                        }
                                        double min = Math.min(d39, d40);
                                        if (min < d32) {
                                            i20 = ((i1) j1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / j1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        e1 e1Var2 = new e1(l.p(i23));
                                        if (i23 == 4) {
                                            int e10 = j1.e(0, arrayList);
                                            if (e10 > 0) {
                                                if (e10 > 10) {
                                                    e10 -= 2;
                                                }
                                                g1 g1Var9 = (g1) arrayList.get(e10);
                                                g1 g1Var10 = (g1) arrayList.get(e10 / 2);
                                                g1 g1Var11 = (g1) arrayList.get(0);
                                                e1Var2.b = (float) g1Var9.a;
                                                e1Var2.c = (float) g1Var9.b;
                                                e1Var2.i = (float) g1Var10.a;
                                                e1Var2.j = (float) g1Var10.b;
                                                e1Var2.d = (float) g1Var11.a;
                                                e1Var2.e = (float) g1Var11.b;
                                                e1Var2.k = 16.0f;
                                            }
                                        } else {
                                            g1 b14 = j1.b(arrayList);
                                            e1Var2.b = (float) b14.a;
                                            e1Var2.c = (float) b14.b;
                                            h1 a10 = j1.a(arrayList);
                                            e1Var2.d = ((float) (a10.c - a10.a)) / 2.0f;
                                            e1Var2.e = ((float) (a10.d - a10.b)) / 2.0f;
                                            if (i23 == 2 && (e9 = j1.e(1, arrayList)) > 0) {
                                                g1 g1Var12 = (g1) arrayList.get(e9);
                                                e1Var2.h = (float) Math.atan2(g1Var12.b - e1Var2.c, g1Var12.a - e1Var2.b);
                                            }
                                        }
                                        e1Var = e1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(e1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(e1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new xs(j1Var3, e1Var, i21, f11, 15));
                                        j1Var3.j.set(false);
                                    }
                                    e1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new xs(j1Var3, e1Var, i21, f11, 15));
                                    j1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        j1 j1Var4 = j1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    i1 i1Var = new i1();
                                    i1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            i1Var.b.add(new g1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        i1Var.c = j1Var4.g.getInt("score" + j1Var4.c.size(), 0);
                                        j1Var4.c.add(i1Var);
                                    }
                                }
                            }
                            if (j1Var4.h && (string = j1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = j1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    i1 i1Var2 = new i1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        i1Var2.a = Integer.parseInt(split2[c10]);
                                        while (i26 < split2.length) {
                                            i1Var2.b.add(new g1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        i1Var2.c = j1Var4.g.getInt("score" + (size + i12), 0);
                                        j1Var4.c.add(i1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c10 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                }
            }
        };
        j1Var.f = context;
        j1Var.e = n6Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        j1Var.g = sharedPreferences;
        j1Var.h = sharedPreferences.getBoolean("learning", false);
        j1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i11 = 1;
        j1.m.postRunnable(new Runnable() { // from class: yf.f1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                e1 e1Var;
                int e9;
                double d;
                long j10;
                int i112;
                double d10;
                char c10;
                String string;
                int i12;
                switch (i11) {
                    case 0:
                        j1 j1Var2 = j1Var;
                        if (j1Var2.j.get()) {
                            return;
                        }
                        j1Var2.k.set(false);
                        j1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (j1Var2) {
                            try {
                                if (j1Var2.b.size() < 8) {
                                    j1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = j1.f(j1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((g1) f10.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f10.size()) {
                                        g1 g1Var = (g1) f10.get(i13 - 1);
                                        g1 g1Var2 = (g1) f10.get(i13);
                                        g1Var.getClass();
                                        d11 += g1Var.a(g1Var2.a, g1Var2.b);
                                        i13++;
                                        j1Var2 = j1Var2;
                                    }
                                    j1 j1Var3 = j1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f10.size()) {
                                        int i15 = i14 - 1;
                                        g1 g1Var3 = (g1) f10.get(i15);
                                        g1 g1Var4 = (g1) f10.get(i14);
                                        g1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = g1Var3.a(g1Var4.a, g1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i112 = i16;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            g1 g1Var5 = new g1(((((g1) f10.get(i112)).a - ((g1) f10.get(i15)).a) * d16) + ((g1) f10.get(i15)).a, ((((g1) f10.get(i112)).b - ((g1) f10.get(i15)).b) * d16) + ((g1) f10.get(i15)).b);
                                            arrayList.add(g1Var5);
                                            f10.add(i112, g1Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j10 = currentTimeMillis;
                                            i112 = i16;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i14 = i112 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j10;
                                    }
                                    long j11 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((g1) i0.a.i(1, f10));
                                    }
                                    ArrayList f11 = j1.f(arrayList);
                                    g1 b10 = j1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((g1) f11.get(0)).b, b10.a - ((g1) f11.get(0)).a);
                                    g1 b11 = j1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f11.size()) {
                                        g1 g1Var6 = (g1) f11.get(i17);
                                        double d17 = g1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = g1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        g1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        g1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    g1 b12 = j1.b(f11);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        g1 g1Var7 = (g1) f11.get(i18);
                                        g1Var7.a += d24;
                                        g1Var7.b += d25;
                                    }
                                    h1 a3 = j1.a(f11);
                                    double d26 = a3.c - a3.a;
                                    double d27 = a3.d - a3.b;
                                    for (int i19 = 0; i19 < f11.size(); i19++) {
                                        g1 g1Var8 = (g1) f11.get(i19);
                                        g1Var8.a = (250.0d / d26) * g1Var8.a;
                                        g1Var8.b = (250.0d / d27) * g1Var8.b;
                                    }
                                    g1 b13 = j1.b(f11);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < j1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((i1) j1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = j1.d(f11, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = j1.d(f11, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = j1.d(f11, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = j1.d(f11, b13, arrayList2, d43);
                                                d = d38;
                                                d38 = d43;
                                                d39 = d40;
                                                d40 = d44;
                                                d29 = d35;
                                            }
                                            d35 = d;
                                        }
                                        double min = Math.min(d39, d40);
                                        if (min < d32) {
                                            i20 = ((i1) j1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / j1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        e1 e1Var2 = new e1(l.p(i23));
                                        if (i23 == 4) {
                                            int e10 = j1.e(0, arrayList);
                                            if (e10 > 0) {
                                                if (e10 > 10) {
                                                    e10 -= 2;
                                                }
                                                g1 g1Var9 = (g1) arrayList.get(e10);
                                                g1 g1Var10 = (g1) arrayList.get(e10 / 2);
                                                g1 g1Var11 = (g1) arrayList.get(0);
                                                e1Var2.b = (float) g1Var9.a;
                                                e1Var2.c = (float) g1Var9.b;
                                                e1Var2.i = (float) g1Var10.a;
                                                e1Var2.j = (float) g1Var10.b;
                                                e1Var2.d = (float) g1Var11.a;
                                                e1Var2.e = (float) g1Var11.b;
                                                e1Var2.k = 16.0f;
                                            }
                                        } else {
                                            g1 b14 = j1.b(arrayList);
                                            e1Var2.b = (float) b14.a;
                                            e1Var2.c = (float) b14.b;
                                            h1 a10 = j1.a(arrayList);
                                            e1Var2.d = ((float) (a10.c - a10.a)) / 2.0f;
                                            e1Var2.e = ((float) (a10.d - a10.b)) / 2.0f;
                                            if (i23 == 2 && (e9 = j1.e(1, arrayList)) > 0) {
                                                g1 g1Var12 = (g1) arrayList.get(e9);
                                                e1Var2.h = (float) Math.atan2(g1Var12.b - e1Var2.c, g1Var12.a - e1Var2.b);
                                            }
                                        }
                                        e1Var = e1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(e1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(e1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new xs(j1Var3, e1Var, i21, f11, 15));
                                        j1Var3.j.set(false);
                                    }
                                    e1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new xs(j1Var3, e1Var, i21, f11, 15));
                                    j1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        j1 j1Var4 = j1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    i1 i1Var = new i1();
                                    i1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            i1Var.b.add(new g1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        i1Var.c = j1Var4.g.getInt("score" + j1Var4.c.size(), 0);
                                        j1Var4.c.add(i1Var);
                                    }
                                }
                            }
                            if (j1Var4.h && (string = j1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = j1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    i1 i1Var2 = new i1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        i1Var2.a = Integer.parseInt(split2[c10]);
                                        while (i26 < split2.length) {
                                            i1Var2.b.add(new g1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        i1Var2.c = j1Var4.g.getInt("score" + (size + i12), 0);
                                        j1Var4.c.add(i1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c10 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                }
            }
        });
        this.s = j1Var;
    }

    public final void a(d dVar, boolean z10, v0 v0Var) {
        a1 a1Var;
        if (this.l) {
            b1 b1Var = this.a;
            if (b1Var.getPainting().G || this.g == null) {
                return;
            }
            m currentBrush = dVar == null ? b1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final m mVar = currentBrush;
            this.l = false;
            if (mVar instanceof d) {
                b1Var.getPainting().E = false;
            }
            p0 painting = b1Var.getPainting();
            painting.f.f(new m0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z10 && (a1Var = b1Var.a) != null) {
                a1Var.f();
            }
            tu0 tu0Var = b1Var.getPainting().g;
            t0 t0Var = this.g;
            float a2 = h7.y.a((float) t0Var.a, (float) t0Var.b, 0.0f, 0.0f);
            t0 t0Var2 = this.g;
            float max = Math.max(a2, h7.y.a((float) t0Var2.a, (float) t0Var2.b, tu0Var.a, 0.0f));
            t0 t0Var3 = this.g;
            float a3 = h7.y.a((float) t0Var3.a, (float) t0Var3.b, 0.0f, tu0Var.b);
            t0 t0Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a3, h7.y.a((float) t0Var4.a, (float) t0Var4.b, tu0Var.a, tu0Var.b))) / 0.84f;
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
            t0 t0Var5 = this.g;
            final t0 t0Var6 = new t0(t0Var5.a, t0Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yf.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    b1 b1Var2 = d0.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    q0 q0Var = new q0(new t0[]{t0Var6});
                    m mVar2 = mVar;
                    mVar2.getClass();
                    int currentColor = mVar2 instanceof d ? -1 : b1Var2.getCurrentColor();
                    float f10 = floatValue * max2;
                    q0Var.c = currentColor;
                    q0Var.d = f10;
                    q0Var.e = mVar2;
                    p0 painting2 = b1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z11 = true;
                    painting2.f.f(new q5(painting2, q0Var, z11, z11, null, 4));
                }
            });
            this.x.addListener(new c0(this, t0Var6, max2, mVar, z10, v0Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(er.h);
            this.x.start();
            if (z10) {
                BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
            }
        }
    }

    public final void b(q0 q0Var) {
        b1 b1Var = this.a;
        int currentColor = b1Var.getCurrentColor();
        float currentWeight = b1Var.getCurrentWeight();
        m currentBrush = b1Var.getCurrentBrush();
        q0Var.c = currentColor;
        q0Var.d = currentWeight;
        q0Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        q0Var.a = this.i;
        p0 painting = b1Var.getPainting();
        boolean z10 = this.f;
        b0 b0Var = new b0(this, q0Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f.f(new q5(painting, q0Var, z10, z11, b0Var, 4));
        }
        this.f = false;
    }

    public final void c(float f10, boolean z10) {
        int i10 = this.n;
        t0[] t0VarArr = this.m;
        if (i10 <= 2) {
            t0[] t0VarArr2 = new t0[i10];
            System.arraycopy(t0VarArr, 0, t0VarArr2, 0, i10);
            b(new q0(t0VarArr2));
            return;
        }
        Vector vector = new Vector();
        t0 t0Var = t0VarArr[0];
        t0 t0Var2 = t0VarArr[1];
        t0 t0Var3 = t0VarArr[2];
        if (t0Var3 == null || t0Var2 == null || t0Var == null) {
            return;
        }
        t0 b10 = t0Var2.b(t0Var);
        t0 b11 = t0Var3.b(t0Var2);
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
        float f11 = 1.0f;
        float f12 = 1.0f / min;
        int i11 = 0;
        float f13 = 0.0f;
        while (i11 < min) {
            float f14 = f11 - f13;
            double d = f14;
            double pow = Math.pow(d, 2.0d);
            double d10 = f13 * f13;
            double d11 = f14 * f14;
            double d12 = f13;
            double d13 = (b11.a * d10) + (t0Var2.a * 2.0d * d12 * d) + (b10.a * d11);
            double d14 = (b11.b * d10) + (t0Var2.b * 2.0d * d12 * d) + (b10.b * d11);
            double lerp = ((((b11.c * d10) + ((t0Var2.c * ((2.0f * f14) * f13)) + (b10.c * pow))) - 1.0d) * AndroidUtilities.lerp(f10, 1.0f, h7.n.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            t0 t0Var4 = new t0(d13, d14, lerp);
            if (this.c) {
                t0Var4.d = true;
                this.c = false;
            }
            vector.add(t0Var4);
            this.p += lerp;
            this.q += 1.0d;
            f13 += f12;
            i11++;
            f11 = 1.0f;
        }
        if (z10) {
            b11.d = true;
        }
        vector.add(b11);
        t0[] t0VarArr3 = new t0[vector.size()];
        vector.toArray(t0VarArr3);
        b(new q0(t0VarArr3));
        System.arraycopy(t0VarArr, 1, t0VarArr, 0, 2);
        if (z10) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
