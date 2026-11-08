package sg;

import a8.r9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import c8.j9;
import di.z5;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a8;
import org.telegram.messenger.p2;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class w {
    public static final xq B = new xq(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final w0 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public n0 g;
    public n0 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final d1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final n0[] m = new n0[3];
    public final float[] u = new float[2];
    public final s y = new s(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [sg.a1] */
    public w(w0 w0Var) {
        this.a = w0Var;
        Context context = w0Var.getContext();
        ii.c cVar = new ii.c(this, 20);
        final d1 d1Var = new d1();
        d1Var.b = new ArrayList();
        d1Var.c = new ArrayList();
        d1Var.i = null;
        d1Var.j = new AtomicBoolean(false);
        d1Var.k = new AtomicBoolean(false);
        final int i7 = 0;
        d1Var.l = new Runnable() { // from class: sg.a1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:5:0x000b, B:6:0x0017, B:8:0x001f, B:12:0x0045, B:14:0x006a, B:16:0x0091, B:18:0x0097, B:20:0x00a2, B:21:0x00af, B:23:0x00b2, B:27:0x0109, B:28:0x00c4, B:29:0x00cd, B:31:0x00d0, B:33:0x00eb, B:36:0x010c), top: B:4:0x000b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                z0 z0Var;
                int e10;
                double d;
                long j3;
                int i10;
                double d2;
                String string;
                String[] split;
                int i11;
                switch (i7) {
                    case 0:
                        d1 d1Var2 = d1Var;
                        if (d1Var2.j.get()) {
                            return;
                        }
                        d1Var2.k.set(false);
                        d1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (d1Var2) {
                            try {
                                if (d1Var2.b.size() < 8) {
                                    d1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = d1.f(d1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((b1) f10.get(0));
                                    int i12 = 1;
                                    double d10 = 0.0d;
                                    while (i12 < f10.size()) {
                                        b1 b1Var = (b1) f10.get(i12 - 1);
                                        b1 b1Var2 = (b1) f10.get(i12);
                                        b1Var.getClass();
                                        d10 += b1Var.a(b1Var2.a, b1Var2.b);
                                        i12++;
                                        d1Var2 = d1Var2;
                                    }
                                    d1 d1Var3 = d1Var2;
                                    double d11 = d10 / 47;
                                    int i13 = 1;
                                    double d12 = 0.0d;
                                    while (i13 < f10.size()) {
                                        int i14 = i13 - 1;
                                        b1 b1Var3 = (b1) f10.get(i14);
                                        b1 b1Var4 = (b1) f10.get(i13);
                                        b1Var3.getClass();
                                        double d13 = d12;
                                        int i15 = i13;
                                        double a10 = b1Var3.a(b1Var4.a, b1Var4.b);
                                        double d14 = d13 + a10;
                                        if (d14 >= d11) {
                                            double d15 = (d11 - d13) / a10;
                                            i10 = i15;
                                            d2 = d11;
                                            j3 = currentTimeMillis;
                                            b1 b1Var5 = new b1(((((b1) f10.get(i10)).a - ((b1) f10.get(i14)).a) * d15) + ((b1) f10.get(i14)).a, ((((b1) f10.get(i10)).b - ((b1) f10.get(i14)).b) * d15) + ((b1) f10.get(i14)).b);
                                            arrayList.add(b1Var5);
                                            f10.add(i10, b1Var5);
                                            d12 = 0.0d;
                                        } else {
                                            j3 = currentTimeMillis;
                                            i10 = i15;
                                            d2 = d11;
                                            d12 = d14;
                                        }
                                        i13 = i10 + 1;
                                        d11 = d2;
                                        currentTimeMillis = j3;
                                    }
                                    long j10 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((b1) jg.g.i(1, f10));
                                    }
                                    ArrayList f11 = d1.f(arrayList);
                                    b1 b10 = d1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((b1) f11.get(0)).b, b10.a - ((b1) f11.get(0)).a);
                                    b1 b11 = d1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i16 = 0;
                                    while (i16 < f11.size()) {
                                        b1 b1Var6 = (b1) f11.get(i16);
                                        double d16 = b1Var6.a;
                                        double d17 = b11.a;
                                        double d18 = d16 - d17;
                                        double d19 = sin;
                                        double d20 = b1Var6.b;
                                        double d21 = b11.b;
                                        double d22 = d20 - d21;
                                        b1Var6.b = (d22 * cos) + (d18 * d19) + d21;
                                        b1Var6.a = ((d18 * cos) - (d22 * d19)) + d17;
                                        i16++;
                                        sin = d19;
                                    }
                                    b1 b12 = d1.b(f11);
                                    double d23 = -b12.a;
                                    double d24 = -b12.b;
                                    for (int i17 = 0; i17 < f11.size(); i17++) {
                                        b1 b1Var7 = (b1) f11.get(i17);
                                        b1Var7.a += d23;
                                        b1Var7.b += d24;
                                    }
                                    m8.d a11 = d1.a(f11);
                                    double d25 = a11.d - a11.b;
                                    double d26 = a11.e - a11.c;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        b1 b1Var8 = (b1) f11.get(i18);
                                        b1Var8.a = (250.0d / d25) * b1Var8.a;
                                        b1Var8.b = (250.0d / d26) * b1Var8.b;
                                    }
                                    b1 b13 = d1.b(f11);
                                    double d27 = Double.MAX_VALUE;
                                    int i19 = -1;
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < d1Var3.c.size(); i21++) {
                                        ArrayList arrayList2 = ((c1) d1Var3.c.get(i21)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d28 = -1.5707963267948966d;
                                        double d29 = 1.0d - sqrt;
                                        double d30 = 1.5707963267948966d;
                                        double d31 = d27;
                                        double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d33 = d1.d(f11, b13, arrayList2, d32);
                                        double d34 = d32;
                                        double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                        double d36 = d1.d(f11, b13, arrayList2, d35);
                                        double d37 = d35;
                                        double d38 = d33;
                                        double d39 = d36;
                                        while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                            if (d38 < d39) {
                                                double d40 = (d29 * d37) + (sqrt * d28);
                                                double d41 = d1.d(f11, b13, arrayList2, d40);
                                                d = d40;
                                                d39 = d38;
                                                d38 = d41;
                                                d30 = d37;
                                                d37 = d34;
                                            } else {
                                                double d42 = (d29 * d34) + (sqrt * d30);
                                                double d43 = d1.d(f11, b13, arrayList2, d42);
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
                                            i19 = ((c1) d1Var3.c.get(i21)).a;
                                            d27 = min;
                                            i20 = i21;
                                        } else {
                                            d27 = d31;
                                        }
                                    }
                                    int i22 = 1.0d - (d27 / d1.n) < 0.8d ? -1 : i19;
                                    if (i22 >= 0 && i22 < g.c.size() && arrayList.size() >= 1) {
                                        z0 z0Var2 = new z0(g.p(i22));
                                        if (i22 == 4) {
                                            int e11 = d1.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                b1 b1Var9 = (b1) arrayList.get(e11);
                                                b1 b1Var10 = (b1) arrayList.get(e11 / 2);
                                                b1 b1Var11 = (b1) arrayList.get(0);
                                                z0Var2.b = (float) b1Var9.a;
                                                z0Var2.c = (float) b1Var9.b;
                                                z0Var2.i = (float) b1Var10.a;
                                                z0Var2.j = (float) b1Var10.b;
                                                z0Var2.d = (float) b1Var11.a;
                                                z0Var2.e = (float) b1Var11.b;
                                                z0Var2.k = 16.0f;
                                            }
                                        } else {
                                            b1 b14 = d1.b(arrayList);
                                            z0Var2.b = (float) b14.a;
                                            z0Var2.c = (float) b14.b;
                                            m8.d a12 = d1.a(arrayList);
                                            z0Var2.d = ((float) (a12.d - a12.b)) / 2.0f;
                                            z0Var2.e = ((float) (a12.e - a12.c)) / 2.0f;
                                            if (i22 == 2 && (e10 = d1.e(1, arrayList)) > 0) {
                                                b1 b1Var12 = (b1) arrayList.get(e10);
                                                z0Var2.h = (float) Math.atan2(b1Var12.b - z0Var2.c, b1Var12.a - z0Var2.b);
                                            }
                                        }
                                        z0Var = z0Var2;
                                        if (r2.a) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            sb2.append(z0Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(z0Var != null ? " (template#" + i20 + " shape#" + i22 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        org.telegram.messenger.g0.h3(new pp0(d1Var3, z0Var, i20, f11, 22));
                                        d1Var3.j.set(false);
                                    }
                                    z0Var = null;
                                    if (r2.a) {
                                    }
                                    org.telegram.messenger.g0.h3(new pp0(d1Var3, z0Var, i20, f11, 22));
                                    d1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        d1 d1Var4 = d1Var;
                        try {
                            InputStream open = org.telegram.messenger.t0.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                c1 c1Var = new c1();
                                c1Var.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < read * 2) {
                                    InputStream inputStream = open;
                                    if (d1Var4.h && (string = d1Var4.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size = d1Var4.c.size();
                                        for (i11 = 0; i11 < split.length; i11++) {
                                            c1 c1Var2 = new c1();
                                            String[] split2 = split[i11].split(",");
                                            if (split2.length > 1) {
                                                c1Var2.a = Integer.parseInt(split2[0]);
                                                for (int i23 = 1; i23 < split2.length; i23 += 2) {
                                                    c1Var2.b.add(new b1(Double.parseDouble(split2[i23]), Double.parseDouble(split2[i23 + 1])));
                                                }
                                                c1Var2.c = d1Var4.g.getInt("score" + (size + i11), 0);
                                                d1Var4.c.add(c1Var2);
                                            }
                                        }
                                    }
                                    inputStream.close();
                                    return;
                                }
                                int i24 = 0;
                                while (i24 < read) {
                                    c1Var.b.add(new b1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                    i24++;
                                    open = open;
                                }
                                c1Var.c = d1Var4.g.getInt("score" + d1Var4.c.size(), 0);
                                d1Var4.c.add(c1Var);
                                open = open;
                            }
                            InputStream inputStream2 = open;
                            if (d1Var4.h) {
                                split = string.split("\\|");
                                int size2 = d1Var4.c.size();
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
        d1Var.f = context;
        d1Var.e = cVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        d1Var.g = sharedPreferences;
        d1Var.h = sharedPreferences.getBoolean("learning", false);
        d1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i10 = 1;
        d1.m.postRunnable(new Runnable() { // from class: sg.a1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:5:0x000b, B:6:0x0017, B:8:0x001f, B:12:0x0045, B:14:0x006a, B:16:0x0091, B:18:0x0097, B:20:0x00a2, B:21:0x00af, B:23:0x00b2, B:27:0x0109, B:28:0x00c4, B:29:0x00cd, B:31:0x00d0, B:33:0x00eb, B:36:0x010c), top: B:4:0x000b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                z0 z0Var;
                int e10;
                double d;
                long j3;
                int i102;
                double d2;
                String string;
                String[] split;
                int i11;
                switch (i10) {
                    case 0:
                        d1 d1Var2 = d1Var;
                        if (d1Var2.j.get()) {
                            return;
                        }
                        d1Var2.k.set(false);
                        d1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (d1Var2) {
                            try {
                                if (d1Var2.b.size() < 8) {
                                    d1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = d1.f(d1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((b1) f10.get(0));
                                    int i12 = 1;
                                    double d10 = 0.0d;
                                    while (i12 < f10.size()) {
                                        b1 b1Var = (b1) f10.get(i12 - 1);
                                        b1 b1Var2 = (b1) f10.get(i12);
                                        b1Var.getClass();
                                        d10 += b1Var.a(b1Var2.a, b1Var2.b);
                                        i12++;
                                        d1Var2 = d1Var2;
                                    }
                                    d1 d1Var3 = d1Var2;
                                    double d11 = d10 / 47;
                                    int i13 = 1;
                                    double d12 = 0.0d;
                                    while (i13 < f10.size()) {
                                        int i14 = i13 - 1;
                                        b1 b1Var3 = (b1) f10.get(i14);
                                        b1 b1Var4 = (b1) f10.get(i13);
                                        b1Var3.getClass();
                                        double d13 = d12;
                                        int i15 = i13;
                                        double a10 = b1Var3.a(b1Var4.a, b1Var4.b);
                                        double d14 = d13 + a10;
                                        if (d14 >= d11) {
                                            double d15 = (d11 - d13) / a10;
                                            i102 = i15;
                                            d2 = d11;
                                            j3 = currentTimeMillis;
                                            b1 b1Var5 = new b1(((((b1) f10.get(i102)).a - ((b1) f10.get(i14)).a) * d15) + ((b1) f10.get(i14)).a, ((((b1) f10.get(i102)).b - ((b1) f10.get(i14)).b) * d15) + ((b1) f10.get(i14)).b);
                                            arrayList.add(b1Var5);
                                            f10.add(i102, b1Var5);
                                            d12 = 0.0d;
                                        } else {
                                            j3 = currentTimeMillis;
                                            i102 = i15;
                                            d2 = d11;
                                            d12 = d14;
                                        }
                                        i13 = i102 + 1;
                                        d11 = d2;
                                        currentTimeMillis = j3;
                                    }
                                    long j10 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((b1) jg.g.i(1, f10));
                                    }
                                    ArrayList f11 = d1.f(arrayList);
                                    b1 b10 = d1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((b1) f11.get(0)).b, b10.a - ((b1) f11.get(0)).a);
                                    b1 b11 = d1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i16 = 0;
                                    while (i16 < f11.size()) {
                                        b1 b1Var6 = (b1) f11.get(i16);
                                        double d16 = b1Var6.a;
                                        double d17 = b11.a;
                                        double d18 = d16 - d17;
                                        double d19 = sin;
                                        double d20 = b1Var6.b;
                                        double d21 = b11.b;
                                        double d22 = d20 - d21;
                                        b1Var6.b = (d22 * cos) + (d18 * d19) + d21;
                                        b1Var6.a = ((d18 * cos) - (d22 * d19)) + d17;
                                        i16++;
                                        sin = d19;
                                    }
                                    b1 b12 = d1.b(f11);
                                    double d23 = -b12.a;
                                    double d24 = -b12.b;
                                    for (int i17 = 0; i17 < f11.size(); i17++) {
                                        b1 b1Var7 = (b1) f11.get(i17);
                                        b1Var7.a += d23;
                                        b1Var7.b += d24;
                                    }
                                    m8.d a11 = d1.a(f11);
                                    double d25 = a11.d - a11.b;
                                    double d26 = a11.e - a11.c;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        b1 b1Var8 = (b1) f11.get(i18);
                                        b1Var8.a = (250.0d / d25) * b1Var8.a;
                                        b1Var8.b = (250.0d / d26) * b1Var8.b;
                                    }
                                    b1 b13 = d1.b(f11);
                                    double d27 = Double.MAX_VALUE;
                                    int i19 = -1;
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < d1Var3.c.size(); i21++) {
                                        ArrayList arrayList2 = ((c1) d1Var3.c.get(i21)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d28 = -1.5707963267948966d;
                                        double d29 = 1.0d - sqrt;
                                        double d30 = 1.5707963267948966d;
                                        double d31 = d27;
                                        double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d33 = d1.d(f11, b13, arrayList2, d32);
                                        double d34 = d32;
                                        double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                        double d36 = d1.d(f11, b13, arrayList2, d35);
                                        double d37 = d35;
                                        double d38 = d33;
                                        double d39 = d36;
                                        while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                            if (d38 < d39) {
                                                double d40 = (d29 * d37) + (sqrt * d28);
                                                double d41 = d1.d(f11, b13, arrayList2, d40);
                                                d = d40;
                                                d39 = d38;
                                                d38 = d41;
                                                d30 = d37;
                                                d37 = d34;
                                            } else {
                                                double d42 = (d29 * d34) + (sqrt * d30);
                                                double d43 = d1.d(f11, b13, arrayList2, d42);
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
                                            i19 = ((c1) d1Var3.c.get(i21)).a;
                                            d27 = min;
                                            i20 = i21;
                                        } else {
                                            d27 = d31;
                                        }
                                    }
                                    int i22 = 1.0d - (d27 / d1.n) < 0.8d ? -1 : i19;
                                    if (i22 >= 0 && i22 < g.c.size() && arrayList.size() >= 1) {
                                        z0 z0Var2 = new z0(g.p(i22));
                                        if (i22 == 4) {
                                            int e11 = d1.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                b1 b1Var9 = (b1) arrayList.get(e11);
                                                b1 b1Var10 = (b1) arrayList.get(e11 / 2);
                                                b1 b1Var11 = (b1) arrayList.get(0);
                                                z0Var2.b = (float) b1Var9.a;
                                                z0Var2.c = (float) b1Var9.b;
                                                z0Var2.i = (float) b1Var10.a;
                                                z0Var2.j = (float) b1Var10.b;
                                                z0Var2.d = (float) b1Var11.a;
                                                z0Var2.e = (float) b1Var11.b;
                                                z0Var2.k = 16.0f;
                                            }
                                        } else {
                                            b1 b14 = d1.b(arrayList);
                                            z0Var2.b = (float) b14.a;
                                            z0Var2.c = (float) b14.b;
                                            m8.d a12 = d1.a(arrayList);
                                            z0Var2.d = ((float) (a12.d - a12.b)) / 2.0f;
                                            z0Var2.e = ((float) (a12.e - a12.c)) / 2.0f;
                                            if (i22 == 2 && (e10 = d1.e(1, arrayList)) > 0) {
                                                b1 b1Var12 = (b1) arrayList.get(e10);
                                                z0Var2.h = (float) Math.atan2(b1Var12.b - z0Var2.c, b1Var12.a - z0Var2.b);
                                            }
                                        }
                                        z0Var = z0Var2;
                                        if (r2.a) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            sb2.append(z0Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(z0Var != null ? " (template#" + i20 + " shape#" + i22 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        org.telegram.messenger.g0.h3(new pp0(d1Var3, z0Var, i20, f11, 22));
                                        d1Var3.j.set(false);
                                    }
                                    z0Var = null;
                                    if (r2.a) {
                                    }
                                    org.telegram.messenger.g0.h3(new pp0(d1Var3, z0Var, i20, f11, 22));
                                    d1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        d1 d1Var4 = d1Var;
                        try {
                            InputStream open = org.telegram.messenger.t0.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                c1 c1Var = new c1();
                                c1Var.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < read * 2) {
                                    InputStream inputStream2 = open;
                                    if (d1Var4.h && (string = d1Var4.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size2 = d1Var4.c.size();
                                        for (i11 = 0; i11 < split.length; i11++) {
                                            c1 c1Var2 = new c1();
                                            String[] split2 = split[i11].split(",");
                                            if (split2.length > 1) {
                                                c1Var2.a = Integer.parseInt(split2[0]);
                                                for (int i23 = 1; i23 < split2.length; i23 += 2) {
                                                    c1Var2.b.add(new b1(Double.parseDouble(split2[i23]), Double.parseDouble(split2[i23 + 1])));
                                                }
                                                c1Var2.c = d1Var4.g.getInt("score" + (size2 + i11), 0);
                                                d1Var4.c.add(c1Var2);
                                            }
                                        }
                                    }
                                    inputStream2.close();
                                    return;
                                }
                                int i24 = 0;
                                while (i24 < read) {
                                    c1Var.b.add(new b1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                    i24++;
                                    open = open;
                                }
                                c1Var.c = d1Var4.g.getInt("score" + d1Var4.c.size(), 0);
                                d1Var4.c.add(c1Var);
                                open = open;
                            }
                            InputStream inputStream22 = open;
                            if (d1Var4.h) {
                                split = string.split("\\|");
                                int size22 = d1Var4.c.size();
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
        this.s = d1Var;
    }

    public final void a(d dVar, boolean z9, p0 p0Var) {
        v0 v0Var;
        if (this.l) {
            w0 w0Var = this.a;
            if (w0Var.getPainting().G || this.g == null) {
                return;
            }
            h currentBrush = dVar == null ? w0Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final h hVar = currentBrush;
            this.l = false;
            if (hVar instanceof d) {
                w0Var.getPainting().E = false;
            }
            j0 painting = w0Var.getPainting();
            painting.f.f(new f0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z9 && (v0Var = w0Var.a) != null) {
                v0Var.d0();
            }
            mt0 mt0Var = w0Var.getPainting().g;
            n0 n0Var = this.g;
            float a10 = r9.a((float) n0Var.a, (float) n0Var.b, 0.0f, 0.0f);
            n0 n0Var2 = this.g;
            float max = Math.max(a10, r9.a((float) n0Var2.a, (float) n0Var2.b, mt0Var.a, 0.0f));
            n0 n0Var3 = this.g;
            float a11 = r9.a((float) n0Var3.a, (float) n0Var3.b, 0.0f, mt0Var.b);
            n0 n0Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a11, r9.a((float) n0Var4.a, (float) n0Var4.b, mt0Var.a, mt0Var.b))) / 0.84f;
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
            n0 n0Var5 = this.g;
            final n0 n0Var6 = new n0(n0Var5.a, n0Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    w0 w0Var2 = w.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    k0 k0Var = new k0(new n0[]{n0Var6});
                    h hVar2 = hVar;
                    hVar2.getClass();
                    int currentColor = hVar2 instanceof d ? -1 : w0Var2.getCurrentColor();
                    float f10 = floatValue * max2;
                    k0Var.c = currentColor;
                    k0Var.d = f10;
                    k0Var.e = hVar2;
                    j0 painting2 = w0Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z10 = true;
                    painting2.f.f(new z5(painting2, k0Var, z10, z10, null, 5));
                }
            });
            this.x.addListener(new v(this, n0Var6, max2, hVar, z9, p0Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(xq.h);
            this.x.start();
            if (z9) {
                p2.h.a();
            }
        }
    }

    public final void b(k0 k0Var) {
        w0 w0Var = this.a;
        int currentColor = w0Var.getCurrentColor();
        float currentWeight = w0Var.getCurrentWeight();
        h currentBrush = w0Var.getCurrentBrush();
        k0Var.c = currentColor;
        k0Var.d = currentWeight;
        k0Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        k0Var.a = this.i;
        j0 painting = w0Var.getPainting();
        boolean z9 = this.f;
        u uVar = new u(this, k0Var, 0);
        boolean z10 = false;
        if (painting.L == null) {
            painting.f.f(new z5(painting, k0Var, z9, z10, uVar, 5));
        }
        this.f = false;
    }

    public final void c(boolean z9, float f10) {
        int i7 = this.n;
        n0[] n0VarArr = this.m;
        if (i7 <= 2) {
            n0[] n0VarArr2 = new n0[i7];
            System.arraycopy(n0VarArr, 0, n0VarArr2, 0, i7);
            b(new k0(n0VarArr2));
            return;
        }
        Vector vector = new Vector();
        n0 n0Var = n0VarArr[0];
        n0 n0Var2 = n0VarArr[1];
        n0 n0Var3 = n0VarArr[2];
        if (n0Var3 == null || n0Var2 == null || n0Var == null) {
            return;
        }
        n0 b10 = n0Var2.b(n0Var);
        n0 b11 = n0Var3.b(n0Var2);
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
        float f11 = 1.0f;
        float f12 = 1.0f / min;
        int i10 = 0;
        float f13 = 0.0f;
        while (i10 < min) {
            float f14 = f11 - f13;
            double d = f14;
            double pow = Math.pow(d, 2.0d);
            double d2 = f13 * f13;
            double d10 = f14 * f14;
            double d11 = f13;
            double d12 = (b11.a * d2) + (n0Var2.a * 2.0d * d11 * d) + (b10.a * d10);
            double d13 = (b11.b * d2) + (n0Var2.b * 2.0d * d11 * d) + (b10.b * d10);
            double T1 = ((((b11.c * d2) + ((n0Var2.c * ((2.0f * f14) * f13)) + (b10.c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, j9.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            n0 n0Var4 = new n0(d12, d13, T1);
            if (this.c) {
                n0Var4.d = true;
                this.c = false;
            }
            vector.add(n0Var4);
            this.p += T1;
            this.q += 1.0d;
            f13 += f12;
            i10++;
            f11 = 1.0f;
        }
        if (z9) {
            b11.d = true;
        }
        vector.add(b11);
        n0[] n0VarArr3 = new n0[vector.size()];
        vector.toArray(n0VarArr3);
        b(new k0(n0VarArr3));
        System.arraycopy(n0VarArr, 1, n0VarArr, 0, 2);
        if (z9) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
