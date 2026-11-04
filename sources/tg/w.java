package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import b8.be;
import ei.a6;
import gi.j8;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.p2;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zo0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w {
    public static final xq B = new xq(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final u0 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public m0 g;
    public m0 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final b1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final m0[] m = new m0[3];
    public final float[] u = new float[2];
    public final s y = new s(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [tg.y0] */
    public w(u0 u0Var) {
        this.a = u0Var;
        Context context = u0Var.getContext();
        j8 j8Var = new j8(this, 23);
        final b1 b1Var = new b1();
        b1Var.b = new ArrayList();
        b1Var.c = new ArrayList();
        b1Var.i = null;
        b1Var.j = new AtomicBoolean(false);
        b1Var.k = new AtomicBoolean(false);
        final int i3 = 0;
        b1Var.l = new Runnable() { // from class: tg.y0
            /* JADX WARN: Removed duplicated region for block: B:136:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:5:0x000b, B:6:0x0017, B:8:0x001f, B:12:0x0045, B:14:0x006a, B:16:0x0091, B:18:0x0097, B:20:0x00a2, B:21:0x00af, B:23:0x00b2, B:27:0x0109, B:28:0x00c4, B:29:0x00cd, B:31:0x00d0, B:33:0x00eb, B:36:0x010c), top: B:4:0x000b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                x0 x0Var;
                int e10;
                double d;
                long j10;
                int i10;
                double d10;
                String string;
                String[] split;
                int i11;
                switch (i3) {
                    case 0:
                        b1 b1Var2 = b1Var;
                        if (b1Var2.j.get()) {
                            return;
                        }
                        b1Var2.k.set(false);
                        b1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (b1Var2) {
                            try {
                                if (b1Var2.b.size() < 8) {
                                    b1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = b1.f(b1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((z0) f10.get(0));
                                    int i12 = 1;
                                    double d11 = 0.0d;
                                    while (i12 < f10.size()) {
                                        z0 z0Var = (z0) f10.get(i12 - 1);
                                        z0 z0Var2 = (z0) f10.get(i12);
                                        z0Var.getClass();
                                        d11 += z0Var.a(z0Var2.a, z0Var2.b);
                                        i12++;
                                        b1Var2 = b1Var2;
                                    }
                                    b1 b1Var3 = b1Var2;
                                    double d12 = d11 / 47;
                                    int i13 = 1;
                                    double d13 = 0.0d;
                                    while (i13 < f10.size()) {
                                        int i14 = i13 - 1;
                                        z0 z0Var3 = (z0) f10.get(i14);
                                        z0 z0Var4 = (z0) f10.get(i13);
                                        z0Var3.getClass();
                                        double d14 = d13;
                                        int i15 = i13;
                                        double a10 = z0Var3.a(z0Var4.a, z0Var4.b);
                                        double d15 = d14 + a10;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a10;
                                            i10 = i15;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            z0 z0Var5 = new z0(((((z0) f10.get(i10)).a - ((z0) f10.get(i14)).a) * d16) + ((z0) f10.get(i14)).a, ((((z0) f10.get(i10)).b - ((z0) f10.get(i14)).b) * d16) + ((z0) f10.get(i14)).b);
                                            arrayList.add(z0Var5);
                                            f10.add(i10, z0Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j10 = currentTimeMillis;
                                            i10 = i15;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i13 = i10 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j10;
                                    }
                                    long j11 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((z0) p1.h(1, f10));
                                    }
                                    ArrayList f11 = b1.f(arrayList);
                                    z0 b10 = b1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((z0) f11.get(0)).b, b10.a - ((z0) f11.get(0)).a);
                                    z0 b11 = b1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i16 = 0;
                                    while (i16 < f11.size()) {
                                        z0 z0Var6 = (z0) f11.get(i16);
                                        double d17 = z0Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = z0Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        z0Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        z0Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i16++;
                                        sin = d20;
                                    }
                                    z0 b12 = b1.b(f11);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i17 = 0; i17 < f11.size(); i17++) {
                                        z0 z0Var7 = (z0) f11.get(i17);
                                        z0Var7.a += d24;
                                        z0Var7.b += d25;
                                    }
                                    l8.d a11 = b1.a(f11);
                                    double d26 = a11.d - a11.b;
                                    double d27 = a11.e - a11.c;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        z0 z0Var8 = (z0) f11.get(i18);
                                        z0Var8.a = (250.0d / d26) * z0Var8.a;
                                        z0Var8.b = (250.0d / d27) * z0Var8.b;
                                    }
                                    z0 b13 = b1.b(f11);
                                    double d28 = Double.MAX_VALUE;
                                    int i19 = -1;
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < b1Var3.c.size(); i21++) {
                                        ArrayList arrayList2 = ((a1) b1Var3.c.get(i21)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = b1.d(f11, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = b1.d(f11, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = b1.d(f11, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = b1.d(f11, b13, arrayList2, d43);
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
                                            i19 = ((a1) b1Var3.c.get(i21)).a;
                                            d28 = min;
                                            i20 = i21;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i22 = 1.0d - (d28 / b1.n) < 0.8d ? -1 : i19;
                                    if (i22 >= 0 && i22 < g.c.size() && arrayList.size() >= 1) {
                                        x0 x0Var2 = new x0(g.p(i22));
                                        if (i22 == 4) {
                                            int e11 = b1.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                z0 z0Var9 = (z0) arrayList.get(e11);
                                                z0 z0Var10 = (z0) arrayList.get(e11 / 2);
                                                z0 z0Var11 = (z0) arrayList.get(0);
                                                x0Var2.b = (float) z0Var9.a;
                                                x0Var2.c = (float) z0Var9.b;
                                                x0Var2.i = (float) z0Var10.a;
                                                x0Var2.j = (float) z0Var10.b;
                                                x0Var2.d = (float) z0Var11.a;
                                                x0Var2.e = (float) z0Var11.b;
                                                x0Var2.k = 16.0f;
                                            }
                                        } else {
                                            z0 b14 = b1.b(arrayList);
                                            x0Var2.b = (float) b14.a;
                                            x0Var2.c = (float) b14.b;
                                            l8.d a12 = b1.a(arrayList);
                                            x0Var2.d = ((float) (a12.d - a12.b)) / 2.0f;
                                            x0Var2.e = ((float) (a12.e - a12.c)) / 2.0f;
                                            if (i22 == 2 && (e10 = b1.e(1, arrayList)) > 0) {
                                                z0 z0Var12 = (z0) arrayList.get(e10);
                                                x0Var2.h = (float) Math.atan2(z0Var12.b - x0Var2.c, z0Var12.a - x0Var2.b);
                                            }
                                        }
                                        x0Var = x0Var2;
                                        if (r2.a) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(x0Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(x0Var != null ? " (template#" + i20 + " shape#" + i22 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        org.telegram.messenger.g0.h3(new zo0(b1Var3, x0Var, i20, f11, 23));
                                        b1Var3.j.set(false);
                                    }
                                    x0Var = null;
                                    if (r2.a) {
                                    }
                                    org.telegram.messenger.g0.h3(new zo0(b1Var3, x0Var, i20, f11, 23));
                                    b1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        b1 b1Var4 = b1Var;
                        try {
                            InputStream open = org.telegram.messenger.t0.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                a1 a1Var = new a1();
                                a1Var.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < read * 2) {
                                    InputStream inputStream = open;
                                    if (b1Var4.h && (string = b1Var4.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size = b1Var4.c.size();
                                        for (i11 = 0; i11 < split.length; i11++) {
                                            a1 a1Var2 = new a1();
                                            String[] split2 = split[i11].split(",");
                                            if (split2.length > 1) {
                                                a1Var2.a = Integer.parseInt(split2[0]);
                                                for (int i23 = 1; i23 < split2.length; i23 += 2) {
                                                    a1Var2.b.add(new z0(Double.parseDouble(split2[i23]), Double.parseDouble(split2[i23 + 1])));
                                                }
                                                a1Var2.c = b1Var4.g.getInt("score" + (size + i11), 0);
                                                b1Var4.c.add(a1Var2);
                                            }
                                        }
                                    }
                                    inputStream.close();
                                    return;
                                }
                                int i24 = 0;
                                while (i24 < read) {
                                    a1Var.b.add(new z0((open.read() - read2) - 127, (open.read() - read3) - 127));
                                    i24++;
                                    open = open;
                                }
                                a1Var.c = b1Var4.g.getInt("score" + b1Var4.c.size(), 0);
                                b1Var4.c.add(a1Var);
                                open = open;
                            }
                            InputStream inputStream2 = open;
                            if (b1Var4.h) {
                                split = string.split("\\|");
                                int size2 = b1Var4.c.size();
                                while (i11 < split.length) {
                                }
                            }
                            inputStream2.close();
                            return;
                        } catch (Exception e12) {
                            a8.g(e12, true);
                            return;
                        }
                }
            }
        };
        b1Var.f = context;
        b1Var.e = j8Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        b1Var.g = sharedPreferences;
        b1Var.h = sharedPreferences.getBoolean("learning", false);
        b1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i10 = 1;
        b1.m.postRunnable(new Runnable() { // from class: tg.y0
            /* JADX WARN: Removed duplicated region for block: B:136:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:5:0x000b, B:6:0x0017, B:8:0x001f, B:12:0x0045, B:14:0x006a, B:16:0x0091, B:18:0x0097, B:20:0x00a2, B:21:0x00af, B:23:0x00b2, B:27:0x0109, B:28:0x00c4, B:29:0x00cd, B:31:0x00d0, B:33:0x00eb, B:36:0x010c), top: B:4:0x000b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                x0 x0Var;
                int e10;
                double d;
                long j10;
                int i102;
                double d10;
                String string;
                String[] split;
                int i11;
                switch (i10) {
                    case 0:
                        b1 b1Var2 = b1Var;
                        if (b1Var2.j.get()) {
                            return;
                        }
                        b1Var2.k.set(false);
                        b1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (b1Var2) {
                            try {
                                if (b1Var2.b.size() < 8) {
                                    b1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = b1.f(b1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((z0) f10.get(0));
                                    int i12 = 1;
                                    double d11 = 0.0d;
                                    while (i12 < f10.size()) {
                                        z0 z0Var = (z0) f10.get(i12 - 1);
                                        z0 z0Var2 = (z0) f10.get(i12);
                                        z0Var.getClass();
                                        d11 += z0Var.a(z0Var2.a, z0Var2.b);
                                        i12++;
                                        b1Var2 = b1Var2;
                                    }
                                    b1 b1Var3 = b1Var2;
                                    double d12 = d11 / 47;
                                    int i13 = 1;
                                    double d13 = 0.0d;
                                    while (i13 < f10.size()) {
                                        int i14 = i13 - 1;
                                        z0 z0Var3 = (z0) f10.get(i14);
                                        z0 z0Var4 = (z0) f10.get(i13);
                                        z0Var3.getClass();
                                        double d14 = d13;
                                        int i15 = i13;
                                        double a10 = z0Var3.a(z0Var4.a, z0Var4.b);
                                        double d15 = d14 + a10;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a10;
                                            i102 = i15;
                                            d10 = d12;
                                            j10 = currentTimeMillis;
                                            z0 z0Var5 = new z0(((((z0) f10.get(i102)).a - ((z0) f10.get(i14)).a) * d16) + ((z0) f10.get(i14)).a, ((((z0) f10.get(i102)).b - ((z0) f10.get(i14)).b) * d16) + ((z0) f10.get(i14)).b);
                                            arrayList.add(z0Var5);
                                            f10.add(i102, z0Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j10 = currentTimeMillis;
                                            i102 = i15;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i13 = i102 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j10;
                                    }
                                    long j11 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((z0) p1.h(1, f10));
                                    }
                                    ArrayList f11 = b1.f(arrayList);
                                    z0 b10 = b1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((z0) f11.get(0)).b, b10.a - ((z0) f11.get(0)).a);
                                    z0 b11 = b1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i16 = 0;
                                    while (i16 < f11.size()) {
                                        z0 z0Var6 = (z0) f11.get(i16);
                                        double d17 = z0Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = z0Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        z0Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        z0Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i16++;
                                        sin = d20;
                                    }
                                    z0 b12 = b1.b(f11);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i17 = 0; i17 < f11.size(); i17++) {
                                        z0 z0Var7 = (z0) f11.get(i17);
                                        z0Var7.a += d24;
                                        z0Var7.b += d25;
                                    }
                                    l8.d a11 = b1.a(f11);
                                    double d26 = a11.d - a11.b;
                                    double d27 = a11.e - a11.c;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        z0 z0Var8 = (z0) f11.get(i18);
                                        z0Var8.a = (250.0d / d26) * z0Var8.a;
                                        z0Var8.b = (250.0d / d27) * z0Var8.b;
                                    }
                                    z0 b13 = b1.b(f11);
                                    double d28 = Double.MAX_VALUE;
                                    int i19 = -1;
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < b1Var3.c.size(); i21++) {
                                        ArrayList arrayList2 = ((a1) b1Var3.c.get(i21)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = b1.d(f11, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = b1.d(f11, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = b1.d(f11, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = b1.d(f11, b13, arrayList2, d43);
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
                                            i19 = ((a1) b1Var3.c.get(i21)).a;
                                            d28 = min;
                                            i20 = i21;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i22 = 1.0d - (d28 / b1.n) < 0.8d ? -1 : i19;
                                    if (i22 >= 0 && i22 < g.c.size() && arrayList.size() >= 1) {
                                        x0 x0Var2 = new x0(g.p(i22));
                                        if (i22 == 4) {
                                            int e11 = b1.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                z0 z0Var9 = (z0) arrayList.get(e11);
                                                z0 z0Var10 = (z0) arrayList.get(e11 / 2);
                                                z0 z0Var11 = (z0) arrayList.get(0);
                                                x0Var2.b = (float) z0Var9.a;
                                                x0Var2.c = (float) z0Var9.b;
                                                x0Var2.i = (float) z0Var10.a;
                                                x0Var2.j = (float) z0Var10.b;
                                                x0Var2.d = (float) z0Var11.a;
                                                x0Var2.e = (float) z0Var11.b;
                                                x0Var2.k = 16.0f;
                                            }
                                        } else {
                                            z0 b14 = b1.b(arrayList);
                                            x0Var2.b = (float) b14.a;
                                            x0Var2.c = (float) b14.b;
                                            l8.d a12 = b1.a(arrayList);
                                            x0Var2.d = ((float) (a12.d - a12.b)) / 2.0f;
                                            x0Var2.e = ((float) (a12.e - a12.c)) / 2.0f;
                                            if (i22 == 2 && (e10 = b1.e(1, arrayList)) > 0) {
                                                z0 z0Var12 = (z0) arrayList.get(e10);
                                                x0Var2.h = (float) Math.atan2(z0Var12.b - x0Var2.c, z0Var12.a - x0Var2.b);
                                            }
                                        }
                                        x0Var = x0Var2;
                                        if (r2.a) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            sb2.append(x0Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(x0Var != null ? " (template#" + i20 + " shape#" + i22 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        org.telegram.messenger.g0.h3(new zo0(b1Var3, x0Var, i20, f11, 23));
                                        b1Var3.j.set(false);
                                    }
                                    x0Var = null;
                                    if (r2.a) {
                                    }
                                    org.telegram.messenger.g0.h3(new zo0(b1Var3, x0Var, i20, f11, 23));
                                    b1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        b1 b1Var4 = b1Var;
                        try {
                            InputStream open = org.telegram.messenger.t0.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                a1 a1Var = new a1();
                                a1Var.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < read * 2) {
                                    InputStream inputStream2 = open;
                                    if (b1Var4.h && (string = b1Var4.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size2 = b1Var4.c.size();
                                        for (i11 = 0; i11 < split.length; i11++) {
                                            a1 a1Var2 = new a1();
                                            String[] split2 = split[i11].split(",");
                                            if (split2.length > 1) {
                                                a1Var2.a = Integer.parseInt(split2[0]);
                                                for (int i23 = 1; i23 < split2.length; i23 += 2) {
                                                    a1Var2.b.add(new z0(Double.parseDouble(split2[i23]), Double.parseDouble(split2[i23 + 1])));
                                                }
                                                a1Var2.c = b1Var4.g.getInt("score" + (size2 + i11), 0);
                                                b1Var4.c.add(a1Var2);
                                            }
                                        }
                                    }
                                    inputStream2.close();
                                    return;
                                }
                                int i24 = 0;
                                while (i24 < read) {
                                    a1Var.b.add(new z0((open.read() - read2) - 127, (open.read() - read3) - 127));
                                    i24++;
                                    open = open;
                                }
                                a1Var.c = b1Var4.g.getInt("score" + b1Var4.c.size(), 0);
                                b1Var4.c.add(a1Var);
                                open = open;
                            }
                            InputStream inputStream22 = open;
                            if (b1Var4.h) {
                                split = string.split("\\|");
                                int size22 = b1Var4.c.size();
                                while (i11 < split.length) {
                                }
                            }
                            inputStream22.close();
                            return;
                        } catch (Exception e12) {
                            a8.g(e12, true);
                            return;
                        }
                }
            }
        });
        this.s = b1Var;
    }

    public final void a(d dVar, boolean z10, o0 o0Var) {
        t0 t0Var;
        if (this.l) {
            u0 u0Var = this.a;
            if (u0Var.getPainting().G || this.g == null) {
                return;
            }
            h currentBrush = dVar == null ? u0Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final h hVar = currentBrush;
            this.l = false;
            if (hVar instanceof d) {
                u0Var.getPainting().E = false;
            }
            i0 painting = u0Var.getPainting();
            painting.f.f(new f0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z10 && (t0Var = u0Var.a) != null) {
                t0Var.Z();
            }
            lt0 lt0Var = u0Var.getPainting().g;
            m0 m0Var = this.g;
            float a10 = a7.h.a((float) m0Var.a, (float) m0Var.b, 0.0f, 0.0f);
            m0 m0Var2 = this.g;
            float max = Math.max(a10, a7.h.a((float) m0Var2.a, (float) m0Var2.b, lt0Var.a, 0.0f));
            m0 m0Var3 = this.g;
            float a11 = a7.h.a((float) m0Var3.a, (float) m0Var3.b, 0.0f, lt0Var.b);
            m0 m0Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a11, a7.h.a((float) m0Var4.a, (float) m0Var4.b, lt0Var.a, lt0Var.b))) / 0.84f;
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
            m0 m0Var5 = this.g;
            final m0 m0Var6 = new m0(m0Var5.a, m0Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tg.t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    u0 u0Var2 = w.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    j0 j0Var = new j0(new m0[]{m0Var6});
                    h hVar2 = hVar;
                    hVar2.getClass();
                    int currentColor = hVar2 instanceof d ? -1 : u0Var2.getCurrentColor();
                    float f10 = floatValue * max2;
                    j0Var.c = currentColor;
                    j0Var.d = f10;
                    j0Var.e = hVar2;
                    i0 painting2 = u0Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z11 = true;
                    painting2.f.f(new a6(painting2, j0Var, z11, z11, null, 5));
                }
            });
            this.x.addListener(new v(this, m0Var6, max2, hVar, z10, o0Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(xq.h);
            this.x.start();
            if (z10) {
                p2.h.a();
            }
        }
    }

    public final void b(j0 j0Var) {
        u0 u0Var = this.a;
        int currentColor = u0Var.getCurrentColor();
        float currentWeight = u0Var.getCurrentWeight();
        h currentBrush = u0Var.getCurrentBrush();
        j0Var.c = currentColor;
        j0Var.d = currentWeight;
        j0Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        j0Var.a = this.i;
        i0 painting = u0Var.getPainting();
        boolean z10 = this.f;
        u uVar = new u(this, j0Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f.f(new a6(painting, j0Var, z10, z11, uVar, 5));
        }
        this.f = false;
    }

    public final void c(boolean z10, float f10) {
        int i3 = this.n;
        m0[] m0VarArr = this.m;
        if (i3 <= 2) {
            m0[] m0VarArr2 = new m0[i3];
            System.arraycopy(m0VarArr, 0, m0VarArr2, 0, i3);
            b(new j0(m0VarArr2));
            return;
        }
        Vector vector = new Vector();
        m0 m0Var = m0VarArr[0];
        m0 m0Var2 = m0VarArr[1];
        m0 m0Var3 = m0VarArr[2];
        if (m0Var3 == null || m0Var2 == null || m0Var == null) {
            return;
        }
        m0 b10 = m0Var2.b(m0Var);
        m0 b11 = m0Var3.b(m0Var2);
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
        float f11 = 1.0f;
        float f12 = 1.0f / min;
        int i10 = 0;
        float f13 = 0.0f;
        while (i10 < min) {
            float f14 = f11 - f13;
            double d = f14;
            double pow = Math.pow(d, 2.0d);
            double d10 = f13 * f13;
            double d11 = f14 * f14;
            double d12 = f13;
            double d13 = (b11.a * d10) + (m0Var2.a * 2.0d * d12 * d) + (b10.a * d11);
            double d14 = (b11.b * d10) + (m0Var2.b * 2.0d * d12 * d) + (b10.b * d11);
            double T1 = ((((b11.c * d10) + ((m0Var2.c * ((2.0f * f14) * f13)) + (b10.c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, be.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            m0 m0Var4 = new m0(d13, d14, T1);
            if (this.c) {
                m0Var4.d = true;
                this.c = false;
            }
            vector.add(m0Var4);
            this.p += T1;
            this.q += 1.0d;
            f13 += f12;
            i10++;
            f11 = 1.0f;
        }
        if (z10) {
            b11.d = true;
        }
        vector.add(b11);
        m0[] m0VarArr3 = new m0[vector.size()];
        vector.toArray(m0VarArr3);
        b(new j0(m0VarArr3));
        System.arraycopy(m0VarArr, 1, m0VarArr, 0, 2);
        if (z10) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
