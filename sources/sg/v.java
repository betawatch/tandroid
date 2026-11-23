package sg;

import a8.x9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import c8.m9;
import fi.q5;
import hi.c7;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a8;
import org.telegram.messenger.q2;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v {
    public static final kr B = new kr(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final t0 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public l0 g;
    public l0 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final a1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final l0[] m = new l0[3];
    public final float[] u = new float[2];
    public final s y = new s(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [sg.x0] */
    public v(t0 t0Var) {
        this.a = t0Var;
        Context context = t0Var.getContext();
        c7 c7Var = new c7(this, 26);
        final a1 a1Var = new a1();
        a1Var.b = new ArrayList();
        a1Var.c = new ArrayList();
        a1Var.i = null;
        a1Var.j = new AtomicBoolean(false);
        a1Var.k = new AtomicBoolean(false);
        final int i7 = 0;
        a1Var.l = new Runnable() { // from class: sg.x0
            /* JADX WARN: Removed duplicated region for block: B:136:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:5:0x000b, B:6:0x0017, B:8:0x001f, B:12:0x0045, B:14:0x006a, B:16:0x0091, B:18:0x0097, B:20:0x00a2, B:21:0x00af, B:23:0x00b2, B:27:0x0109, B:28:0x00c4, B:29:0x00cd, B:31:0x00d0, B:33:0x00eb, B:36:0x010c), top: B:4:0x000b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                w0 w0Var;
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
                        a1 a1Var2 = a1Var;
                        if (a1Var2.j.get()) {
                            return;
                        }
                        a1Var2.k.set(false);
                        a1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (a1Var2) {
                            try {
                                if (a1Var2.b.size() < 8) {
                                    a1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = a1.f(a1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((y0) f10.get(0));
                                    int i12 = 1;
                                    double d10 = 0.0d;
                                    while (i12 < f10.size()) {
                                        y0 y0Var = (y0) f10.get(i12 - 1);
                                        y0 y0Var2 = (y0) f10.get(i12);
                                        y0Var.getClass();
                                        d10 += y0Var.a(y0Var2.a, y0Var2.b);
                                        i12++;
                                        a1Var2 = a1Var2;
                                    }
                                    a1 a1Var3 = a1Var2;
                                    double d11 = d10 / 47;
                                    int i13 = 1;
                                    double d12 = 0.0d;
                                    while (i13 < f10.size()) {
                                        int i14 = i13 - 1;
                                        y0 y0Var3 = (y0) f10.get(i14);
                                        y0 y0Var4 = (y0) f10.get(i13);
                                        y0Var3.getClass();
                                        double d13 = d12;
                                        int i15 = i13;
                                        double a10 = y0Var3.a(y0Var4.a, y0Var4.b);
                                        double d14 = d13 + a10;
                                        if (d14 >= d11) {
                                            double d15 = (d11 - d13) / a10;
                                            i10 = i15;
                                            d2 = d11;
                                            j3 = currentTimeMillis;
                                            y0 y0Var5 = new y0(((((y0) f10.get(i10)).a - ((y0) f10.get(i14)).a) * d15) + ((y0) f10.get(i14)).a, ((((y0) f10.get(i10)).b - ((y0) f10.get(i14)).b) * d15) + ((y0) f10.get(i14)).b);
                                            arrayList.add(y0Var5);
                                            f10.add(i10, y0Var5);
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
                                        arrayList.add((y0) i5.c.h(1, f10));
                                    }
                                    ArrayList f11 = a1.f(arrayList);
                                    y0 b10 = a1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((y0) f11.get(0)).b, b10.a - ((y0) f11.get(0)).a);
                                    y0 b11 = a1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i16 = 0;
                                    while (i16 < f11.size()) {
                                        y0 y0Var6 = (y0) f11.get(i16);
                                        double d16 = y0Var6.a;
                                        double d17 = b11.a;
                                        double d18 = d16 - d17;
                                        double d19 = sin;
                                        double d20 = y0Var6.b;
                                        double d21 = b11.b;
                                        double d22 = d20 - d21;
                                        y0Var6.b = (d22 * cos) + (d18 * d19) + d21;
                                        y0Var6.a = ((d18 * cos) - (d22 * d19)) + d17;
                                        i16++;
                                        sin = d19;
                                    }
                                    y0 b12 = a1.b(f11);
                                    double d23 = -b12.a;
                                    double d24 = -b12.b;
                                    for (int i17 = 0; i17 < f11.size(); i17++) {
                                        y0 y0Var7 = (y0) f11.get(i17);
                                        y0Var7.a += d23;
                                        y0Var7.b += d24;
                                    }
                                    m8.d a11 = a1.a(f11);
                                    double d25 = a11.d - a11.b;
                                    double d26 = a11.e - a11.c;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        y0 y0Var8 = (y0) f11.get(i18);
                                        y0Var8.a = (250.0d / d25) * y0Var8.a;
                                        y0Var8.b = (250.0d / d26) * y0Var8.b;
                                    }
                                    y0 b13 = a1.b(f11);
                                    double d27 = Double.MAX_VALUE;
                                    int i19 = -1;
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < a1Var3.c.size(); i21++) {
                                        ArrayList arrayList2 = ((z0) a1Var3.c.get(i21)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d28 = -1.5707963267948966d;
                                        double d29 = 1.0d - sqrt;
                                        double d30 = 1.5707963267948966d;
                                        double d31 = d27;
                                        double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d33 = a1.d(f11, b13, arrayList2, d32);
                                        double d34 = d32;
                                        double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                        double d36 = a1.d(f11, b13, arrayList2, d35);
                                        double d37 = d35;
                                        double d38 = d33;
                                        double d39 = d36;
                                        while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                            if (d38 < d39) {
                                                double d40 = (d29 * d37) + (sqrt * d28);
                                                double d41 = a1.d(f11, b13, arrayList2, d40);
                                                d = d40;
                                                d39 = d38;
                                                d38 = d41;
                                                d30 = d37;
                                                d37 = d34;
                                            } else {
                                                double d42 = (d29 * d34) + (sqrt * d30);
                                                double d43 = a1.d(f11, b13, arrayList2, d42);
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
                                            i19 = ((z0) a1Var3.c.get(i21)).a;
                                            d27 = min;
                                            i20 = i21;
                                        } else {
                                            d27 = d31;
                                        }
                                    }
                                    int i22 = 1.0d - (d27 / a1.n) < 0.8d ? -1 : i19;
                                    if (i22 >= 0 && i22 < g.c.size() && arrayList.size() >= 1) {
                                        w0 w0Var2 = new w0(g.p(i22));
                                        if (i22 == 4) {
                                            int e11 = a1.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                y0 y0Var9 = (y0) arrayList.get(e11);
                                                y0 y0Var10 = (y0) arrayList.get(e11 / 2);
                                                y0 y0Var11 = (y0) arrayList.get(0);
                                                w0Var2.b = (float) y0Var9.a;
                                                w0Var2.c = (float) y0Var9.b;
                                                w0Var2.i = (float) y0Var10.a;
                                                w0Var2.j = (float) y0Var10.b;
                                                w0Var2.d = (float) y0Var11.a;
                                                w0Var2.e = (float) y0Var11.b;
                                                w0Var2.k = 16.0f;
                                            }
                                        } else {
                                            y0 b14 = a1.b(arrayList);
                                            w0Var2.b = (float) b14.a;
                                            w0Var2.c = (float) b14.b;
                                            m8.d a12 = a1.a(arrayList);
                                            w0Var2.d = ((float) (a12.d - a12.b)) / 2.0f;
                                            w0Var2.e = ((float) (a12.e - a12.c)) / 2.0f;
                                            if (i22 == 2 && (e10 = a1.e(1, arrayList)) > 0) {
                                                y0 y0Var12 = (y0) arrayList.get(e10);
                                                w0Var2.h = (float) Math.atan2(y0Var12.b - w0Var2.c, y0Var12.a - w0Var2.b);
                                            }
                                        }
                                        w0Var = w0Var2;
                                        if (s2.a) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            sb2.append(w0Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(w0Var != null ? " (template#" + i20 + " shape#" + i22 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        org.telegram.messenger.g0.g3(new kp0(a1Var3, w0Var, i20, f11, 24));
                                        a1Var3.j.set(false);
                                    }
                                    w0Var = null;
                                    if (s2.a) {
                                    }
                                    org.telegram.messenger.g0.g3(new kp0(a1Var3, w0Var, i20, f11, 24));
                                    a1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        a1 a1Var4 = a1Var;
                        try {
                            InputStream open = org.telegram.messenger.t0.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                z0 z0Var = new z0();
                                z0Var.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < read * 2) {
                                    InputStream inputStream = open;
                                    if (a1Var4.h && (string = a1Var4.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size = a1Var4.c.size();
                                        for (i11 = 0; i11 < split.length; i11++) {
                                            z0 z0Var2 = new z0();
                                            String[] split2 = split[i11].split(",");
                                            if (split2.length > 1) {
                                                z0Var2.a = Integer.parseInt(split2[0]);
                                                for (int i23 = 1; i23 < split2.length; i23 += 2) {
                                                    z0Var2.b.add(new y0(Double.parseDouble(split2[i23]), Double.parseDouble(split2[i23 + 1])));
                                                }
                                                z0Var2.c = a1Var4.g.getInt("score" + (size + i11), 0);
                                                a1Var4.c.add(z0Var2);
                                            }
                                        }
                                    }
                                    inputStream.close();
                                    return;
                                }
                                int i24 = 0;
                                while (i24 < read) {
                                    z0Var.b.add(new y0((open.read() - read2) - 127, (open.read() - read3) - 127));
                                    i24++;
                                    open = open;
                                }
                                z0Var.c = a1Var4.g.getInt("score" + a1Var4.c.size(), 0);
                                a1Var4.c.add(z0Var);
                                open = open;
                            }
                            InputStream inputStream2 = open;
                            if (a1Var4.h) {
                                split = string.split("\\|");
                                int size2 = a1Var4.c.size();
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
        a1Var.f = context;
        a1Var.e = c7Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        a1Var.g = sharedPreferences;
        a1Var.h = sharedPreferences.getBoolean("learning", false);
        a1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i10 = 1;
        a1.m.postRunnable(new Runnable() { // from class: sg.x0
            /* JADX WARN: Removed duplicated region for block: B:136:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:5:0x000b, B:6:0x0017, B:8:0x001f, B:12:0x0045, B:14:0x006a, B:16:0x0091, B:18:0x0097, B:20:0x00a2, B:21:0x00af, B:23:0x00b2, B:27:0x0109, B:28:0x00c4, B:29:0x00cd, B:31:0x00d0, B:33:0x00eb, B:36:0x010c), top: B:4:0x000b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                w0 w0Var;
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
                        a1 a1Var2 = a1Var;
                        if (a1Var2.j.get()) {
                            return;
                        }
                        a1Var2.k.set(false);
                        a1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (a1Var2) {
                            try {
                                if (a1Var2.b.size() < 8) {
                                    a1Var2.j.set(false);
                                } else {
                                    ArrayList f10 = a1.f(a1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((y0) f10.get(0));
                                    int i12 = 1;
                                    double d10 = 0.0d;
                                    while (i12 < f10.size()) {
                                        y0 y0Var = (y0) f10.get(i12 - 1);
                                        y0 y0Var2 = (y0) f10.get(i12);
                                        y0Var.getClass();
                                        d10 += y0Var.a(y0Var2.a, y0Var2.b);
                                        i12++;
                                        a1Var2 = a1Var2;
                                    }
                                    a1 a1Var3 = a1Var2;
                                    double d11 = d10 / 47;
                                    int i13 = 1;
                                    double d12 = 0.0d;
                                    while (i13 < f10.size()) {
                                        int i14 = i13 - 1;
                                        y0 y0Var3 = (y0) f10.get(i14);
                                        y0 y0Var4 = (y0) f10.get(i13);
                                        y0Var3.getClass();
                                        double d13 = d12;
                                        int i15 = i13;
                                        double a10 = y0Var3.a(y0Var4.a, y0Var4.b);
                                        double d14 = d13 + a10;
                                        if (d14 >= d11) {
                                            double d15 = (d11 - d13) / a10;
                                            i102 = i15;
                                            d2 = d11;
                                            j3 = currentTimeMillis;
                                            y0 y0Var5 = new y0(((((y0) f10.get(i102)).a - ((y0) f10.get(i14)).a) * d15) + ((y0) f10.get(i14)).a, ((((y0) f10.get(i102)).b - ((y0) f10.get(i14)).b) * d15) + ((y0) f10.get(i14)).b);
                                            arrayList.add(y0Var5);
                                            f10.add(i102, y0Var5);
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
                                        arrayList.add((y0) i5.c.h(1, f10));
                                    }
                                    ArrayList f11 = a1.f(arrayList);
                                    y0 b10 = a1.b(f11);
                                    double atan2 = Math.atan2(b10.b - ((y0) f11.get(0)).b, b10.a - ((y0) f11.get(0)).a);
                                    y0 b11 = a1.b(f11);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i16 = 0;
                                    while (i16 < f11.size()) {
                                        y0 y0Var6 = (y0) f11.get(i16);
                                        double d16 = y0Var6.a;
                                        double d17 = b11.a;
                                        double d18 = d16 - d17;
                                        double d19 = sin;
                                        double d20 = y0Var6.b;
                                        double d21 = b11.b;
                                        double d22 = d20 - d21;
                                        y0Var6.b = (d22 * cos) + (d18 * d19) + d21;
                                        y0Var6.a = ((d18 * cos) - (d22 * d19)) + d17;
                                        i16++;
                                        sin = d19;
                                    }
                                    y0 b12 = a1.b(f11);
                                    double d23 = -b12.a;
                                    double d24 = -b12.b;
                                    for (int i17 = 0; i17 < f11.size(); i17++) {
                                        y0 y0Var7 = (y0) f11.get(i17);
                                        y0Var7.a += d23;
                                        y0Var7.b += d24;
                                    }
                                    m8.d a11 = a1.a(f11);
                                    double d25 = a11.d - a11.b;
                                    double d26 = a11.e - a11.c;
                                    for (int i18 = 0; i18 < f11.size(); i18++) {
                                        y0 y0Var8 = (y0) f11.get(i18);
                                        y0Var8.a = (250.0d / d25) * y0Var8.a;
                                        y0Var8.b = (250.0d / d26) * y0Var8.b;
                                    }
                                    y0 b13 = a1.b(f11);
                                    double d27 = Double.MAX_VALUE;
                                    int i19 = -1;
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < a1Var3.c.size(); i21++) {
                                        ArrayList arrayList2 = ((z0) a1Var3.c.get(i21)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d28 = -1.5707963267948966d;
                                        double d29 = 1.0d - sqrt;
                                        double d30 = 1.5707963267948966d;
                                        double d31 = d27;
                                        double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d33 = a1.d(f11, b13, arrayList2, d32);
                                        double d34 = d32;
                                        double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                        double d36 = a1.d(f11, b13, arrayList2, d35);
                                        double d37 = d35;
                                        double d38 = d33;
                                        double d39 = d36;
                                        while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                            if (d38 < d39) {
                                                double d40 = (d29 * d37) + (sqrt * d28);
                                                double d41 = a1.d(f11, b13, arrayList2, d40);
                                                d = d40;
                                                d39 = d38;
                                                d38 = d41;
                                                d30 = d37;
                                                d37 = d34;
                                            } else {
                                                double d42 = (d29 * d34) + (sqrt * d30);
                                                double d43 = a1.d(f11, b13, arrayList2, d42);
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
                                            i19 = ((z0) a1Var3.c.get(i21)).a;
                                            d27 = min;
                                            i20 = i21;
                                        } else {
                                            d27 = d31;
                                        }
                                    }
                                    int i22 = 1.0d - (d27 / a1.n) < 0.8d ? -1 : i19;
                                    if (i22 >= 0 && i22 < g.c.size() && arrayList.size() >= 1) {
                                        w0 w0Var2 = new w0(g.p(i22));
                                        if (i22 == 4) {
                                            int e11 = a1.e(0, arrayList);
                                            if (e11 > 0) {
                                                if (e11 > 10) {
                                                    e11 -= 2;
                                                }
                                                y0 y0Var9 = (y0) arrayList.get(e11);
                                                y0 y0Var10 = (y0) arrayList.get(e11 / 2);
                                                y0 y0Var11 = (y0) arrayList.get(0);
                                                w0Var2.b = (float) y0Var9.a;
                                                w0Var2.c = (float) y0Var9.b;
                                                w0Var2.i = (float) y0Var10.a;
                                                w0Var2.j = (float) y0Var10.b;
                                                w0Var2.d = (float) y0Var11.a;
                                                w0Var2.e = (float) y0Var11.b;
                                                w0Var2.k = 16.0f;
                                            }
                                        } else {
                                            y0 b14 = a1.b(arrayList);
                                            w0Var2.b = (float) b14.a;
                                            w0Var2.c = (float) b14.b;
                                            m8.d a12 = a1.a(arrayList);
                                            w0Var2.d = ((float) (a12.d - a12.b)) / 2.0f;
                                            w0Var2.e = ((float) (a12.e - a12.c)) / 2.0f;
                                            if (i22 == 2 && (e10 = a1.e(1, arrayList)) > 0) {
                                                y0 y0Var12 = (y0) arrayList.get(e10);
                                                w0Var2.h = (float) Math.atan2(y0Var12.b - w0Var2.c, y0Var12.a - w0Var2.b);
                                            }
                                        }
                                        w0Var = w0Var2;
                                        if (s2.a) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            sb2.append(w0Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(w0Var != null ? " (template#" + i20 + " shape#" + i22 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        org.telegram.messenger.g0.g3(new kp0(a1Var3, w0Var, i20, f11, 24));
                                        a1Var3.j.set(false);
                                    }
                                    w0Var = null;
                                    if (s2.a) {
                                    }
                                    org.telegram.messenger.g0.g3(new kp0(a1Var3, w0Var, i20, f11, 24));
                                    a1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        a1 a1Var4 = a1Var;
                        try {
                            InputStream open = org.telegram.messenger.t0.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                z0 z0Var = new z0();
                                z0Var.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < read * 2) {
                                    InputStream inputStream2 = open;
                                    if (a1Var4.h && (string = a1Var4.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size2 = a1Var4.c.size();
                                        for (i11 = 0; i11 < split.length; i11++) {
                                            z0 z0Var2 = new z0();
                                            String[] split2 = split[i11].split(",");
                                            if (split2.length > 1) {
                                                z0Var2.a = Integer.parseInt(split2[0]);
                                                for (int i23 = 1; i23 < split2.length; i23 += 2) {
                                                    z0Var2.b.add(new y0(Double.parseDouble(split2[i23]), Double.parseDouble(split2[i23 + 1])));
                                                }
                                                z0Var2.c = a1Var4.g.getInt("score" + (size2 + i11), 0);
                                                a1Var4.c.add(z0Var2);
                                            }
                                        }
                                    }
                                    inputStream2.close();
                                    return;
                                }
                                int i24 = 0;
                                while (i24 < read) {
                                    z0Var.b.add(new y0((open.read() - read2) - 127, (open.read() - read3) - 127));
                                    i24++;
                                    open = open;
                                }
                                z0Var.c = a1Var4.g.getInt("score" + a1Var4.c.size(), 0);
                                a1Var4.c.add(z0Var);
                                open = open;
                            }
                            InputStream inputStream22 = open;
                            if (a1Var4.h) {
                                split = string.split("\\|");
                                int size22 = a1Var4.c.size();
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
        this.s = a1Var;
    }

    public final void a(d dVar, boolean z10, n0 n0Var) {
        s0 s0Var;
        if (this.l) {
            t0 t0Var = this.a;
            if (t0Var.getPainting().G || this.g == null) {
                return;
            }
            h currentBrush = dVar == null ? t0Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            h hVar = currentBrush;
            this.l = false;
            if (hVar instanceof d) {
                t0Var.getPainting().E = false;
            }
            h0 painting = t0Var.getPainting();
            painting.f.f(new e0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z10 && (s0Var = t0Var.a) != null) {
                s0Var.x0();
            }
            xt0 xt0Var = t0Var.getPainting().g;
            l0 l0Var = this.g;
            float a10 = x9.a((float) l0Var.a, (float) l0Var.b, 0.0f, 0.0f);
            l0 l0Var2 = this.g;
            float max = Math.max(a10, x9.a((float) l0Var2.a, (float) l0Var2.b, xt0Var.a, 0.0f));
            l0 l0Var3 = this.g;
            float a11 = x9.a((float) l0Var3.a, (float) l0Var3.b, 0.0f, xt0Var.b);
            l0 l0Var4 = this.g;
            float max2 = Math.max(max, Math.max(a11, x9.a((float) l0Var4.a, (float) l0Var4.b, xt0Var.a, xt0Var.b))) / 0.84f;
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
            l0 l0Var5 = this.g;
            l0 l0Var6 = new l0(l0Var5.a, l0Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new wd(this, l0Var6, hVar, max2));
            this.x.addListener(new u(this, l0Var6, max2, hVar, z10, n0Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(kr.h);
            this.x.start();
            if (z10) {
                q2.h.a();
            }
        }
    }

    public final void b(i0 i0Var) {
        t0 t0Var = this.a;
        int currentColor = t0Var.getCurrentColor();
        float currentWeight = t0Var.getCurrentWeight();
        h currentBrush = t0Var.getCurrentBrush();
        i0Var.c = currentColor;
        i0Var.d = currentWeight;
        i0Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        i0Var.a = this.i;
        h0 painting = t0Var.getPainting();
        boolean z10 = this.f;
        t tVar = new t(this, i0Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f.f(new q5(painting, i0Var, z10, z11, tVar, 5));
        }
        this.f = false;
    }

    public final void c(boolean z10, float f10) {
        int i7 = this.n;
        l0[] l0VarArr = this.m;
        if (i7 <= 2) {
            l0[] l0VarArr2 = new l0[i7];
            System.arraycopy(l0VarArr, 0, l0VarArr2, 0, i7);
            b(new i0(l0VarArr2));
            return;
        }
        Vector vector = new Vector();
        l0 l0Var = l0VarArr[0];
        l0 l0Var2 = l0VarArr[1];
        l0 l0Var3 = l0VarArr[2];
        if (l0Var3 == null || l0Var2 == null || l0Var == null) {
            return;
        }
        l0 b10 = l0Var2.b(l0Var);
        l0 b11 = l0Var3.b(l0Var2);
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
            double d12 = (b11.a * d2) + (l0Var2.a * 2.0d * d11 * d) + (b10.a * d10);
            double d13 = (b11.b * d2) + (l0Var2.b * 2.0d * d11 * d) + (b10.b * d10);
            double T1 = ((((b11.c * d2) + ((l0Var2.c * ((2.0f * f14) * f13)) + (b10.c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, m9.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            l0 l0Var4 = new l0(d12, d13, T1);
            if (this.c) {
                l0Var4.d = true;
                this.c = false;
            }
            vector.add(l0Var4);
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
        l0[] l0VarArr3 = new l0[vector.size()];
        vector.toArray(l0VarArr3);
        b(new i0(l0VarArr3));
        System.arraycopy(l0VarArr, 1, l0VarArr, 0, 2);
        if (z10) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
