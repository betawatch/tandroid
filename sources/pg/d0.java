package pg;

import ai.b8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.rr;
import v7.z6;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d0 {
    public static final rr B = new rr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final d1 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public v0 g;
    public v0 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final l1 s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final v0[] m = new v0[3];
    public final float[] u = new float[2];
    public final z y = new z(this, 1);

    /* JADX WARN: Type inference failed for: r2v6, types: [pg.h1] */
    public d0(d1 d1Var) {
        this.a = d1Var;
        Context context = d1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final l1 l1Var = new l1();
        l1Var.b = new ArrayList();
        l1Var.c = new ArrayList();
        l1Var.i = null;
        l1Var.j = new AtomicBoolean(false);
        l1Var.k = new AtomicBoolean(false);
        final int i10 = 0;
        l1Var.l = new Runnable() { // from class: pg.h1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                g1 g1Var;
                int e;
                double d;
                long j3;
                int i11;
                double d10;
                char c10;
                String string;
                int i12;
                switch (i10) {
                    case 0:
                        l1 l1Var2 = l1Var;
                        if (l1Var2.j.get()) {
                            return;
                        }
                        l1Var2.k.set(false);
                        l1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (l1Var2) {
                            try {
                                if (l1Var2.b.size() < 8) {
                                    l1Var2.j.set(false);
                                } else {
                                    ArrayList f7 = l1.f(l1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((i1) f7.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f7.size()) {
                                        i1 i1Var = (i1) f7.get(i13 - 1);
                                        i1 i1Var2 = (i1) f7.get(i13);
                                        i1Var.getClass();
                                        d11 += i1Var.a(i1Var2.a, i1Var2.b);
                                        i13++;
                                        l1Var2 = l1Var2;
                                    }
                                    l1 l1Var3 = l1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f7.size()) {
                                        int i15 = i14 - 1;
                                        i1 i1Var3 = (i1) f7.get(i15);
                                        i1 i1Var4 = (i1) f7.get(i14);
                                        i1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = i1Var3.a(i1Var4.a, i1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i11 = i16;
                                            d10 = d12;
                                            j3 = currentTimeMillis;
                                            i1 i1Var5 = new i1(((((i1) f7.get(i11)).a - ((i1) f7.get(i15)).a) * d16) + ((i1) f7.get(i15)).a, ((((i1) f7.get(i11)).b - ((i1) f7.get(i15)).b) * d16) + ((i1) f7.get(i15)).b);
                                            arrayList.add(i1Var5);
                                            f7.add(i11, i1Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j3 = currentTimeMillis;
                                            i11 = i16;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i14 = i11 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j3;
                                    }
                                    long j10 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((i1) hg.c.h(1, f7));
                                    }
                                    ArrayList f10 = l1.f(arrayList);
                                    i1 b10 = l1.b(f10);
                                    double atan2 = Math.atan2(b10.b - ((i1) f10.get(0)).b, b10.a - ((i1) f10.get(0)).a);
                                    i1 b11 = l1.b(f10);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f10.size()) {
                                        i1 i1Var6 = (i1) f10.get(i17);
                                        double d17 = i1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = i1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        i1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        i1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    i1 b12 = l1.b(f10);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f10.size(); i18++) {
                                        i1 i1Var7 = (i1) f10.get(i18);
                                        i1Var7.a += d24;
                                        i1Var7.b += d25;
                                    }
                                    j1 a10 = l1.a(f10);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f10.size(); i19++) {
                                        i1 i1Var8 = (i1) f10.get(i19);
                                        i1Var8.a = (250.0d / d26) * i1Var8.a;
                                        i1Var8.b = (250.0d / d27) * i1Var8.b;
                                    }
                                    i1 b13 = l1.b(f10);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < l1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((k1) l1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = l1.d(f10, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = l1.d(f10, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = l1.d(f10, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = l1.d(f10, b13, arrayList2, d43);
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
                                            i20 = ((k1) l1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / l1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        g1 g1Var2 = new g1(l.p(i23));
                                        if (i23 == 4) {
                                            int e7 = l1.e(0, arrayList);
                                            if (e7 > 0) {
                                                if (e7 > 10) {
                                                    e7 -= 2;
                                                }
                                                i1 i1Var9 = (i1) arrayList.get(e7);
                                                i1 i1Var10 = (i1) arrayList.get(e7 / 2);
                                                i1 i1Var11 = (i1) arrayList.get(0);
                                                g1Var2.b = (float) i1Var9.a;
                                                g1Var2.c = (float) i1Var9.b;
                                                g1Var2.i = (float) i1Var10.a;
                                                g1Var2.j = (float) i1Var10.b;
                                                g1Var2.d = (float) i1Var11.a;
                                                g1Var2.e = (float) i1Var11.b;
                                                g1Var2.k = 16.0f;
                                            }
                                        } else {
                                            i1 b14 = l1.b(arrayList);
                                            g1Var2.b = (float) b14.a;
                                            g1Var2.c = (float) b14.b;
                                            j1 a11 = l1.a(arrayList);
                                            g1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            g1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e = l1.e(1, arrayList)) > 0) {
                                                i1 i1Var12 = (i1) arrayList.get(e);
                                                g1Var2.h = (float) Math.atan2(i1Var12.b - g1Var2.c, i1Var12.a - g1Var2.b);
                                            }
                                        }
                                        g1Var = g1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            sb2.append(g1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(g1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new r11(l1Var3, g1Var, i21, f10, 14));
                                        l1Var3.j.set(false);
                                    }
                                    g1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new r11(l1Var3, g1Var, i21, f10, 14));
                                    l1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        l1 l1Var4 = l1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    k1 k1Var = new k1();
                                    k1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            k1Var.b.add(new i1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        k1Var.c = l1Var4.g.getInt("score" + l1Var4.c.size(), 0);
                                        l1Var4.c.add(k1Var);
                                    }
                                }
                            }
                            if (l1Var4.h && (string = l1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = l1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    k1 k1Var2 = new k1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        k1Var2.a = Integer.parseInt(split2[c10]);
                                        while (i26 < split2.length) {
                                            k1Var2.b.add(new i1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        k1Var2.c = l1Var4.g.getInt("score" + (size + i12), 0);
                                        l1Var4.c.add(k1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c10 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        };
        l1Var.f = context;
        l1Var.e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        l1Var.g = sharedPreferences;
        l1Var.h = sharedPreferences.getBoolean("learning", false);
        l1Var.a = sharedPreferences.getInt("scoreall", 0);
        final int i11 = 1;
        l1.m.postRunnable(new Runnable() { // from class: pg.h1
            /* JADX WARN: Removed duplicated region for block: B:136:0x0465  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                g1 g1Var;
                int e;
                double d;
                long j3;
                int i112;
                double d10;
                char c10;
                String string;
                int i12;
                switch (i11) {
                    case 0:
                        l1 l1Var2 = l1Var;
                        if (l1Var2.j.get()) {
                            return;
                        }
                        l1Var2.k.set(false);
                        l1Var2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (l1Var2) {
                            try {
                                if (l1Var2.b.size() < 8) {
                                    l1Var2.j.set(false);
                                } else {
                                    ArrayList f7 = l1.f(l1Var2.b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((i1) f7.get(0));
                                    int i13 = 1;
                                    double d11 = 0.0d;
                                    while (i13 < f7.size()) {
                                        i1 i1Var = (i1) f7.get(i13 - 1);
                                        i1 i1Var2 = (i1) f7.get(i13);
                                        i1Var.getClass();
                                        d11 += i1Var.a(i1Var2.a, i1Var2.b);
                                        i13++;
                                        l1Var2 = l1Var2;
                                    }
                                    l1 l1Var3 = l1Var2;
                                    double d12 = d11 / 47;
                                    int i14 = 1;
                                    double d13 = 0.0d;
                                    while (i14 < f7.size()) {
                                        int i15 = i14 - 1;
                                        i1 i1Var3 = (i1) f7.get(i15);
                                        i1 i1Var4 = (i1) f7.get(i14);
                                        i1Var3.getClass();
                                        double d14 = d13;
                                        int i16 = i14;
                                        double a2 = i1Var3.a(i1Var4.a, i1Var4.b);
                                        double d15 = d14 + a2;
                                        if (d15 >= d12) {
                                            double d16 = (d12 - d14) / a2;
                                            i112 = i16;
                                            d10 = d12;
                                            j3 = currentTimeMillis;
                                            i1 i1Var5 = new i1(((((i1) f7.get(i112)).a - ((i1) f7.get(i15)).a) * d16) + ((i1) f7.get(i15)).a, ((((i1) f7.get(i112)).b - ((i1) f7.get(i15)).b) * d16) + ((i1) f7.get(i15)).b);
                                            arrayList.add(i1Var5);
                                            f7.add(i112, i1Var5);
                                            d13 = 0.0d;
                                        } else {
                                            j3 = currentTimeMillis;
                                            i112 = i16;
                                            d10 = d12;
                                            d13 = d15;
                                        }
                                        i14 = i112 + 1;
                                        d12 = d10;
                                        currentTimeMillis = j3;
                                    }
                                    long j10 = currentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((i1) hg.c.h(1, f7));
                                    }
                                    ArrayList f10 = l1.f(arrayList);
                                    i1 b10 = l1.b(f10);
                                    double atan2 = Math.atan2(b10.b - ((i1) f10.get(0)).b, b10.a - ((i1) f10.get(0)).a);
                                    i1 b11 = l1.b(f10);
                                    double cos = Math.cos(atan2);
                                    double sin = Math.sin(atan2);
                                    int i17 = 0;
                                    while (i17 < f10.size()) {
                                        i1 i1Var6 = (i1) f10.get(i17);
                                        double d17 = i1Var6.a;
                                        double d18 = b11.a;
                                        double d19 = d17 - d18;
                                        double d20 = sin;
                                        double d21 = i1Var6.b;
                                        double d22 = b11.b;
                                        double d23 = d21 - d22;
                                        i1Var6.b = (d23 * cos) + (d19 * d20) + d22;
                                        i1Var6.a = ((d19 * cos) - (d23 * d20)) + d18;
                                        i17++;
                                        sin = d20;
                                    }
                                    i1 b12 = l1.b(f10);
                                    double d24 = -b12.a;
                                    double d25 = -b12.b;
                                    for (int i18 = 0; i18 < f10.size(); i18++) {
                                        i1 i1Var7 = (i1) f10.get(i18);
                                        i1Var7.a += d24;
                                        i1Var7.b += d25;
                                    }
                                    j1 a10 = l1.a(f10);
                                    double d26 = a10.c - a10.a;
                                    double d27 = a10.d - a10.b;
                                    for (int i19 = 0; i19 < f10.size(); i19++) {
                                        i1 i1Var8 = (i1) f10.get(i19);
                                        i1Var8.a = (250.0d / d26) * i1Var8.a;
                                        i1Var8.b = (250.0d / d27) * i1Var8.b;
                                    }
                                    i1 b13 = l1.b(f10);
                                    double d28 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < l1Var3.c.size(); i22++) {
                                        ArrayList arrayList2 = ((k1) l1Var3.c.get(i22)).b;
                                        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d29 = -1.5707963267948966d;
                                        double d30 = 1.0d - sqrt;
                                        double d31 = 1.5707963267948966d;
                                        double d32 = d28;
                                        double d33 = (d30 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                        double d34 = l1.d(f10, b13, arrayList2, d33);
                                        double d35 = d33;
                                        double d36 = (sqrt * 1.5707963267948966d) + (d30 * (-1.5707963267948966d));
                                        double d37 = l1.d(f10, b13, arrayList2, d36);
                                        double d38 = d36;
                                        double d39 = d34;
                                        double d40 = d37;
                                        while (Math.abs(d31 - d29) > 0.06981317007977318d) {
                                            if (d39 < d40) {
                                                double d41 = (d30 * d38) + (sqrt * d29);
                                                double d42 = l1.d(f10, b13, arrayList2, d41);
                                                d = d41;
                                                d40 = d39;
                                                d39 = d42;
                                                d31 = d38;
                                                d38 = d35;
                                            } else {
                                                double d43 = (d30 * d35) + (sqrt * d31);
                                                double d44 = l1.d(f10, b13, arrayList2, d43);
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
                                            i20 = ((k1) l1Var3.c.get(i22)).a;
                                            d28 = min;
                                            i21 = i22;
                                        } else {
                                            d28 = d32;
                                        }
                                    }
                                    int i23 = 1.0d - (d28 / l1.n) < 0.8d ? -1 : i20;
                                    if (i23 >= 0 && i23 < l.b.size() && arrayList.size() >= 1) {
                                        g1 g1Var2 = new g1(l.p(i23));
                                        if (i23 == 4) {
                                            int e7 = l1.e(0, arrayList);
                                            if (e7 > 0) {
                                                if (e7 > 10) {
                                                    e7 -= 2;
                                                }
                                                i1 i1Var9 = (i1) arrayList.get(e7);
                                                i1 i1Var10 = (i1) arrayList.get(e7 / 2);
                                                i1 i1Var11 = (i1) arrayList.get(0);
                                                g1Var2.b = (float) i1Var9.a;
                                                g1Var2.c = (float) i1Var9.b;
                                                g1Var2.i = (float) i1Var10.a;
                                                g1Var2.j = (float) i1Var10.b;
                                                g1Var2.d = (float) i1Var11.a;
                                                g1Var2.e = (float) i1Var11.b;
                                                g1Var2.k = 16.0f;
                                            }
                                        } else {
                                            i1 b14 = l1.b(arrayList);
                                            g1Var2.b = (float) b14.a;
                                            g1Var2.c = (float) b14.b;
                                            j1 a11 = l1.a(arrayList);
                                            g1Var2.d = ((float) (a11.c - a11.a)) / 2.0f;
                                            g1Var2.e = ((float) (a11.d - a11.b)) / 2.0f;
                                            if (i23 == 2 && (e = l1.e(1, arrayList)) > 0) {
                                                i1 i1Var12 = (i1) arrayList.get(e);
                                                g1Var2.h = (float) Math.atan2(i1Var12.b - g1Var2.c, i1Var12.a - g1Var2.b);
                                            }
                                        }
                                        g1Var = g1Var2;
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            sb2.append(g1Var != null ? "" : "not ");
                                            sb2.append("detect a shape");
                                            sb2.append(g1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new r11(l1Var3, g1Var, i21, f10, 14));
                                        l1Var3.j.set(false);
                                    }
                                    g1Var = null;
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    AndroidUtilities.runOnUIThread(new r11(l1Var3, g1Var, i21, f10, 14));
                                    l1Var3.j.set(false);
                                }
                            } finally {
                            }
                        }
                        return;
                    default:
                        l1 l1Var4 = l1Var;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    k1 k1Var = new k1();
                                    k1Var.a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i24 = 0; i24 < read; i24++) {
                                            k1Var.b.add(new i1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        k1Var.c = l1Var4.g.getInt("score" + l1Var4.c.size(), 0);
                                        l1Var4.c.add(k1Var);
                                    }
                                }
                            }
                            if (l1Var4.h && (string = l1Var4.g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = l1Var4.c.size();
                                int i25 = 0;
                                while (i25 < split.length) {
                                    k1 k1Var2 = new k1();
                                    String[] split2 = split[i25].split(",");
                                    int i26 = 1;
                                    if (split2.length <= 1) {
                                        i12 = i25;
                                    } else {
                                        k1Var2.a = Integer.parseInt(split2[c10]);
                                        while (i26 < split2.length) {
                                            k1Var2.b.add(new i1(Double.parseDouble(split2[i26]), Double.parseDouble(split2[i26 + 1])));
                                            i26 += 2;
                                            i25 = i25;
                                        }
                                        i12 = i25;
                                        k1Var2.c = l1Var4.g.getInt("score" + (size + i12), 0);
                                        l1Var4.c.add(k1Var2);
                                    }
                                    i25 = i12 + 1;
                                    c10 = 0;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        });
        this.s = l1Var;
    }

    public final void a(d dVar, boolean z10, x0 x0Var) {
        c1 c1Var;
        if (this.l) {
            d1 d1Var = this.a;
            if (d1Var.getPainting().G || this.g == null) {
                return;
            }
            m currentBrush = dVar == null ? d1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final m mVar = currentBrush;
            this.l = false;
            if (mVar instanceof d) {
                d1Var.getPainting().E = false;
            }
            r0 painting = d1Var.getPainting();
            painting.f.f(new o0(painting, 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z10 && (c1Var = d1Var.a) != null) {
                c1Var.f();
            }
            jv0 jv0Var = d1Var.getPainting().g;
            v0 v0Var = this.g;
            float a2 = z6.a((float) v0Var.a, (float) v0Var.b, 0.0f, 0.0f);
            v0 v0Var2 = this.g;
            float max = Math.max(a2, z6.a((float) v0Var2.a, (float) v0Var2.b, jv0Var.a, 0.0f));
            v0 v0Var3 = this.g;
            float a10 = z6.a((float) v0Var3.a, (float) v0Var3.b, 0.0f, jv0Var.b);
            v0 v0Var4 = this.g;
            final float max2 = Math.max(max, Math.max(a10, z6.a((float) v0Var4.a, (float) v0Var4.b, jv0Var.a, jv0Var.b))) / 0.84f;
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
            v0 v0Var5 = this.g;
            final v0 v0Var6 = new v0(v0Var5.a, v0Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pg.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    d1 d1Var2 = d0.this.a;
                    float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    s0 s0Var = new s0(new v0[]{v0Var6});
                    m mVar2 = mVar;
                    mVar2.getClass();
                    int currentColor = mVar2 instanceof d ? -1 : d1Var2.getCurrentColor();
                    float f7 = floatValue * max2;
                    s0Var.c = currentColor;
                    s0Var.d = f7;
                    s0Var.e = mVar2;
                    r0 painting2 = d1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z11 = true;
                    painting2.f.f(new b8(painting2, s0Var, z11, z11, null, 4));
                }
            });
            this.x.addListener(new c0(this, v0Var6, max2, mVar, z10, x0Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(rr.h);
            this.x.start();
            if (z10) {
                BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
            }
        }
    }

    public final void b(s0 s0Var) {
        d1 d1Var = this.a;
        int currentColor = d1Var.getCurrentColor();
        float currentWeight = d1Var.getCurrentWeight();
        m currentBrush = d1Var.getCurrentBrush();
        s0Var.c = currentColor;
        s0Var.d = currentWeight;
        s0Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        s0Var.a = this.i;
        r0 painting = d1Var.getPainting();
        boolean z10 = this.f;
        b0 b0Var = new b0(this, s0Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f.f(new b8(painting, s0Var, z10, z11, b0Var, 4));
        }
        this.f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.n;
        v0[] v0VarArr = this.m;
        if (i10 <= 2) {
            v0[] v0VarArr2 = new v0[i10];
            System.arraycopy(v0VarArr, 0, v0VarArr2, 0, i10);
            b(new s0(v0VarArr2));
            return;
        }
        Vector vector = new Vector();
        v0 v0Var = v0VarArr[0];
        v0 v0Var2 = v0VarArr[1];
        v0 v0Var3 = v0VarArr[2];
        if (v0Var3 == null || v0Var2 == null || v0Var == null) {
            return;
        }
        v0 b10 = v0Var2.b(v0Var);
        v0 b11 = v0Var3.b(v0Var2);
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
        float f10 = 1.0f;
        float f11 = 1.0f / min;
        int i11 = 0;
        float f12 = 0.0f;
        while (i11 < min) {
            float f13 = f10 - f12;
            double d = f13;
            double pow = Math.pow(d, 2.0d);
            double d10 = f12 * f12;
            double d11 = f13 * f13;
            double d12 = f12;
            double d13 = (b11.a * d10) + (v0Var2.a * 2.0d * d12 * d) + (b10.a * d11);
            double d14 = (b11.b * d10) + (v0Var2.b * 2.0d * d12 * d) + (b10.b * d11);
            double lerp = ((((b11.c * d10) + ((v0Var2.c * ((2.0f * f13) * f12)) + (b10.c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.p.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            v0 v0Var4 = new v0(d13, d14, lerp);
            if (this.c) {
                v0Var4.d = true;
                this.c = false;
            }
            vector.add(v0Var4);
            this.p += lerp;
            this.q += 1.0d;
            f12 += f11;
            i11++;
            f10 = 1.0f;
        }
        if (z10) {
            b11.d = true;
        }
        vector.add(b11);
        v0[] v0VarArr3 = new v0[vector.size()];
        vector.toArray(v0VarArr3);
        b(new s0(v0VarArr3));
        System.arraycopy(v0VarArr, 1, v0VarArr, 0, 2);
        if (z10) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
