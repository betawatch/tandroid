// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yp5 {
    public static final d53 B = new d53(0.0d, 0.5d, 0.0d, 1.0d);
    public u11 A;
    public final e99 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public jf8 g;
    public jf8 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final hba s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final jf8[] m = new jf8[3];
    public final float[] u = new float[2];
    public final vp5 y = new vp5(this, (byte) 1);

    /* JADX WARN: Type inference failed for: r3v6, types: [eba] */
    public yp5(e99 e99Var) {
        final byte b = 1;
        this.a = e99Var;
        Context context = e99Var.getContext();
        sk3 sk3Var = new sk3(this, (byte) 19);
        final hba hbaVar = new hba();
        hbaVar.b = new ArrayList();
        hbaVar.c = new ArrayList();
        hbaVar.i = null;
        final byte b2 = 0;
        hbaVar.j = new AtomicBoolean(false);
        hbaVar.k = new AtomicBoolean(false);
        hbaVar.l = new Runnable() { // from class: eba
            /* JADX WARN: Removed duplicated region for block: B:133:0x042c  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x0101, TryCatch #1 {Exception -> 0x0101, blocks: (B:5:0x000c, B:6:0x0018, B:8:0x001f, B:12:0x0045, B:14:0x0062, B:16:0x0085, B:18:0x0089, B:20:0x0094, B:21:0x00a1, B:23:0x00a4, B:25:0x00b5, B:26:0x00be, B:28:0x00c1, B:30:0x00dc, B:32:0x00fa, B:35:0x00fd), top: B:4:0x000c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                dba dbaVar;
                int e;
                double d;
                long j;
                ArrayList arrayList;
                String string;
                String[] split;
                int i;
                switch (b2) {
                    case 0:
                        hba hbaVar2 = hbaVar;
                        if (hbaVar2.j.get()) {
                            return;
                        }
                        hbaVar2.k.set(false);
                        hbaVar2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (hbaVar2) {
                            if (hbaVar2.b.size() < 8) {
                                hbaVar2.j.set(false);
                            } else {
                                ArrayList f = hba.f(hbaVar2.b);
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add((fba) f.get(0));
                                double d2 = 0.0d;
                                for (int i2 = 1; i2 < f.size(); i2++) {
                                    fba fbaVar = (fba) f.get(i2 - 1);
                                    fba fbaVar2 = (fba) f.get(i2);
                                    fbaVar.getClass();
                                    d2 += fbaVar.a(fbaVar2.a, fbaVar2.b);
                                }
                                double d3 = d2 / 47.0d;
                                int i3 = 1;
                                double d4 = 0.0d;
                                while (i3 < f.size()) {
                                    int i4 = i3 - 1;
                                    fba fbaVar3 = (fba) f.get(i4);
                                    fba fbaVar4 = (fba) f.get(i3);
                                    fbaVar3.getClass();
                                    ArrayList arrayList3 = arrayList2;
                                    double a = fbaVar3.a(fbaVar4.a, fbaVar4.b);
                                    double d5 = d4 + a;
                                    if (d5 >= d3) {
                                        double d6 = (d3 - d4) / a;
                                        j = currentTimeMillis;
                                        fba fbaVar5 = new fba(((((fba) f.get(i3)).a - ((fba) f.get(i4)).a) * d6) + ((fba) f.get(i4)).a, ((((fba) f.get(i3)).b - ((fba) f.get(i4)).b) * d6) + ((fba) f.get(i4)).b);
                                        arrayList = arrayList3;
                                        arrayList.add(fbaVar5);
                                        f.add(i3, fbaVar5);
                                        d4 = 0.0d;
                                    } else {
                                        j = currentTimeMillis;
                                        arrayList = arrayList3;
                                        d4 = d5;
                                    }
                                    i3++;
                                    arrayList2 = arrayList;
                                    currentTimeMillis = j;
                                }
                                long j2 = currentTimeMillis;
                                ArrayList arrayList4 = arrayList2;
                                if (arrayList4.size() == 47) {
                                    arrayList4.add((fba) b10.f(1, f));
                                }
                                ArrayList f2 = hba.f(arrayList4);
                                fba b3 = hba.b(f2);
                                double atan2 = Math.atan2(b3.b - ((fba) f2.get(0)).b, b3.a - ((fba) f2.get(0)).a);
                                fba b4 = hba.b(f2);
                                double cos = Math.cos(atan2);
                                double sin = Math.sin(atan2);
                                int i5 = 0;
                                while (i5 < f2.size()) {
                                    fba fbaVar6 = (fba) f2.get(i5);
                                    double d7 = fbaVar6.a;
                                    double d8 = b4.a;
                                    double d9 = d7 - d8;
                                    double d10 = sin;
                                    double d11 = fbaVar6.b;
                                    double d12 = b4.b;
                                    double d13 = d11 - d12;
                                    fbaVar6.b = (d13 * cos) + (d9 * d10) + d12;
                                    fbaVar6.a = ((d9 * cos) - (d13 * d10)) + d8;
                                    i5++;
                                    sin = d10;
                                }
                                fba b5 = hba.b(f2);
                                double d14 = -b5.a;
                                double d15 = -b5.b;
                                for (int i6 = 0; i6 < f2.size(); i6++) {
                                    fba fbaVar7 = (fba) f2.get(i6);
                                    fbaVar7.a += d14;
                                    fbaVar7.b += d15;
                                }
                                kz5 a2 = hba.a(f2);
                                double d16 = a2.d - a2.b;
                                double d17 = a2.e - a2.c;
                                for (int i7 = 0; i7 < f2.size(); i7++) {
                                    fba fbaVar8 = (fba) f2.get(i7);
                                    fbaVar8.a = (250.0d / d16) * fbaVar8.a;
                                    fbaVar8.b = (250.0d / d17) * fbaVar8.b;
                                }
                                fba b6 = hba.b(f2);
                                double d18 = Double.MAX_VALUE;
                                int i8 = -1;
                                int i9 = -1;
                                for (int i10 = 0; i10 < hbaVar2.c.size(); i10++) {
                                    ArrayList arrayList5 = ((gba) hbaVar2.c.get(i10)).b;
                                    double d19 = -0.37081471193057003d;
                                    double d20 = hba.d(f2, b6, arrayList5, -0.37081471193057003d);
                                    double d21 = d18;
                                    double d22 = -1.5707963267948966d;
                                    double d23 = 1.5707963267948966d;
                                    double d24 = 0.37081471193057003d;
                                    double d25 = hba.d(f2, b6, arrayList5, 0.37081471193057003d);
                                    while (Math.abs(d23 - d22) > 0.06981317007977318d) {
                                        if (d20 < d25) {
                                            double d26 = (0.3819660112501051d * d24) + (0.6180339887498949d * d22);
                                            double d27 = hba.d(f2, b6, arrayList5, d26);
                                            d = d19;
                                            d19 = d26;
                                            d25 = d20;
                                            d20 = d27;
                                            d23 = d24;
                                        } else {
                                            double d28 = (0.6180339887498949d * d23) + (0.3819660112501051d * d19);
                                            double d29 = hba.d(f2, b6, arrayList5, d28);
                                            d = d28;
                                            d20 = d25;
                                            d25 = d29;
                                            d22 = d19;
                                            d19 = d24;
                                        }
                                        d24 = d;
                                    }
                                    double min = Math.min(d20, d25);
                                    if (min < d21) {
                                        i8 = ((gba) hbaVar2.c.get(i10)).a;
                                        d18 = min;
                                        i9 = i10;
                                    } else {
                                        d18 = d21;
                                    }
                                }
                                int i11 = 1.0d - (d18 / hba.n) < 0.8d ? -1 : i8;
                                if (i11 >= 0 && i11 < t11.c.size() && arrayList4.size() >= 1) {
                                    dba dbaVar2 = new dba(t11.o(i11));
                                    if (i11 == 4) {
                                        int e2 = hba.e(0, arrayList4);
                                        if (e2 > 0) {
                                            if (e2 > 10) {
                                                e2 -= 2;
                                            }
                                            fba fbaVar9 = (fba) arrayList4.get(e2);
                                            fba fbaVar10 = (fba) arrayList4.get(e2 / 2);
                                            fba fbaVar11 = (fba) arrayList4.get(0);
                                            dbaVar2.b = (float) fbaVar9.a;
                                            dbaVar2.c = (float) fbaVar9.b;
                                            dbaVar2.i = (float) fbaVar10.a;
                                            dbaVar2.j = (float) fbaVar10.b;
                                            dbaVar2.d = (float) fbaVar11.a;
                                            dbaVar2.e = (float) fbaVar11.b;
                                            dbaVar2.k = 16.0f;
                                        }
                                    } else {
                                        fba b7 = hba.b(arrayList4);
                                        dbaVar2.b = (float) b7.a;
                                        dbaVar2.c = (float) b7.b;
                                        kz5 a3 = hba.a(arrayList4);
                                        dbaVar2.d = ((float) (a3.d - a3.b)) / 2.0f;
                                        dbaVar2.e = ((float) (a3.e - a3.c)) / 2.0f;
                                        if (i11 == 2 && (e = hba.e(1, arrayList4)) > 0) {
                                            fba fbaVar12 = (fba) arrayList4.get(e);
                                            dbaVar2.h = (float) Math.atan2(fbaVar12.b - dbaVar2.c, fbaVar12.a - dbaVar2.b);
                                        }
                                    }
                                    dbaVar = dbaVar2;
                                    if (e21.a) {
                                        StringBuilder sb = new StringBuilder("took ");
                                        sb.append(System.currentTimeMillis() - j2);
                                        sb.append("ms to ");
                                        sb.append(dbaVar != null ? "" : "not ");
                                        sb.append("detect a shape");
                                        sb.append(dbaVar != null ? " (template#" + i9 + " shape#" + i11 + ")" : "");
                                        Log.i("shapedetector", sb.toString());
                                    }
                                    gm.c3(new v36(hbaVar2, dbaVar, i9, f2));
                                    hbaVar2.j.set(false);
                                }
                                dbaVar = null;
                                if (e21.a) {
                                }
                                gm.c3(new v36(hbaVar2, dbaVar, i9, f2));
                                hbaVar2.j.set(false);
                            }
                        }
                        return;
                    default:
                        hba hbaVar3 = hbaVar;
                        try {
                            InputStream open = a.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                gba gbaVar = new gba();
                                gbaVar.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < (read << 1)) {
                                    if (hbaVar3.h && (string = hbaVar3.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size = hbaVar3.c.size();
                                        for (i = 0; i < split.length; i++) {
                                            gba gbaVar2 = new gba();
                                            String[] split2 = split[i].split(",");
                                            if (split2.length > 1) {
                                                gbaVar2.a = Integer.parseInt(split2[0]);
                                                for (int i12 = 1; i12 < split2.length; i12 += 2) {
                                                    gbaVar2.b.add(new fba(Double.parseDouble(split2[i12]), Double.parseDouble(split2[i12 + 1])));
                                                }
                                                gbaVar2.c = hbaVar3.g.getInt("score" + (size + i), 0);
                                                hbaVar3.c.add(gbaVar2);
                                            }
                                        }
                                    }
                                    open.close();
                                    return;
                                }
                                for (int i13 = 0; i13 < read; i13++) {
                                    gbaVar.b.add(new fba((open.read() - read2) - 127, (open.read() - read3) - 127));
                                }
                                gbaVar.c = hbaVar3.g.getInt("score" + hbaVar3.c.size(), 0);
                                hbaVar3.c.add(gbaVar);
                            }
                            if (hbaVar3.h) {
                                split = string.split("\\|");
                                int size2 = hbaVar3.c.size();
                                while (i < split.length) {
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                            return;
                        }
                }
            }
        };
        hbaVar.f = context;
        hbaVar.e = sk3Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        hbaVar.g = sharedPreferences;
        hbaVar.h = sharedPreferences.getBoolean("learning", false);
        hbaVar.a = sharedPreferences.getInt("scoreall", 0);
        hba.m.postRunnable(new Runnable() { // from class: eba
            /* JADX WARN: Removed duplicated region for block: B:133:0x042c  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x0101, TryCatch #1 {Exception -> 0x0101, blocks: (B:5:0x000c, B:6:0x0018, B:8:0x001f, B:12:0x0045, B:14:0x0062, B:16:0x0085, B:18:0x0089, B:20:0x0094, B:21:0x00a1, B:23:0x00a4, B:25:0x00b5, B:26:0x00be, B:28:0x00c1, B:30:0x00dc, B:32:0x00fa, B:35:0x00fd), top: B:4:0x000c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                dba dbaVar;
                int e;
                double d;
                long j;
                ArrayList arrayList;
                String string;
                String[] split;
                int i;
                switch (b) {
                    case 0:
                        hba hbaVar2 = hbaVar;
                        if (hbaVar2.j.get()) {
                            return;
                        }
                        hbaVar2.k.set(false);
                        hbaVar2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (hbaVar2) {
                            if (hbaVar2.b.size() < 8) {
                                hbaVar2.j.set(false);
                            } else {
                                ArrayList f = hba.f(hbaVar2.b);
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add((fba) f.get(0));
                                double d2 = 0.0d;
                                for (int i2 = 1; i2 < f.size(); i2++) {
                                    fba fbaVar = (fba) f.get(i2 - 1);
                                    fba fbaVar2 = (fba) f.get(i2);
                                    fbaVar.getClass();
                                    d2 += fbaVar.a(fbaVar2.a, fbaVar2.b);
                                }
                                double d3 = d2 / 47.0d;
                                int i3 = 1;
                                double d4 = 0.0d;
                                while (i3 < f.size()) {
                                    int i4 = i3 - 1;
                                    fba fbaVar3 = (fba) f.get(i4);
                                    fba fbaVar4 = (fba) f.get(i3);
                                    fbaVar3.getClass();
                                    ArrayList arrayList3 = arrayList2;
                                    double a = fbaVar3.a(fbaVar4.a, fbaVar4.b);
                                    double d5 = d4 + a;
                                    if (d5 >= d3) {
                                        double d6 = (d3 - d4) / a;
                                        j = currentTimeMillis;
                                        fba fbaVar5 = new fba(((((fba) f.get(i3)).a - ((fba) f.get(i4)).a) * d6) + ((fba) f.get(i4)).a, ((((fba) f.get(i3)).b - ((fba) f.get(i4)).b) * d6) + ((fba) f.get(i4)).b);
                                        arrayList = arrayList3;
                                        arrayList.add(fbaVar5);
                                        f.add(i3, fbaVar5);
                                        d4 = 0.0d;
                                    } else {
                                        j = currentTimeMillis;
                                        arrayList = arrayList3;
                                        d4 = d5;
                                    }
                                    i3++;
                                    arrayList2 = arrayList;
                                    currentTimeMillis = j;
                                }
                                long j2 = currentTimeMillis;
                                ArrayList arrayList4 = arrayList2;
                                if (arrayList4.size() == 47) {
                                    arrayList4.add((fba) b10.f(1, f));
                                }
                                ArrayList f2 = hba.f(arrayList4);
                                fba b3 = hba.b(f2);
                                double atan2 = Math.atan2(b3.b - ((fba) f2.get(0)).b, b3.a - ((fba) f2.get(0)).a);
                                fba b4 = hba.b(f2);
                                double cos = Math.cos(atan2);
                                double sin = Math.sin(atan2);
                                int i5 = 0;
                                while (i5 < f2.size()) {
                                    fba fbaVar6 = (fba) f2.get(i5);
                                    double d7 = fbaVar6.a;
                                    double d8 = b4.a;
                                    double d9 = d7 - d8;
                                    double d10 = sin;
                                    double d11 = fbaVar6.b;
                                    double d12 = b4.b;
                                    double d13 = d11 - d12;
                                    fbaVar6.b = (d13 * cos) + (d9 * d10) + d12;
                                    fbaVar6.a = ((d9 * cos) - (d13 * d10)) + d8;
                                    i5++;
                                    sin = d10;
                                }
                                fba b5 = hba.b(f2);
                                double d14 = -b5.a;
                                double d15 = -b5.b;
                                for (int i6 = 0; i6 < f2.size(); i6++) {
                                    fba fbaVar7 = (fba) f2.get(i6);
                                    fbaVar7.a += d14;
                                    fbaVar7.b += d15;
                                }
                                kz5 a2 = hba.a(f2);
                                double d16 = a2.d - a2.b;
                                double d17 = a2.e - a2.c;
                                for (int i7 = 0; i7 < f2.size(); i7++) {
                                    fba fbaVar8 = (fba) f2.get(i7);
                                    fbaVar8.a = (250.0d / d16) * fbaVar8.a;
                                    fbaVar8.b = (250.0d / d17) * fbaVar8.b;
                                }
                                fba b6 = hba.b(f2);
                                double d18 = Double.MAX_VALUE;
                                int i8 = -1;
                                int i9 = -1;
                                for (int i10 = 0; i10 < hbaVar2.c.size(); i10++) {
                                    ArrayList arrayList5 = ((gba) hbaVar2.c.get(i10)).b;
                                    double d19 = -0.37081471193057003d;
                                    double d20 = hba.d(f2, b6, arrayList5, -0.37081471193057003d);
                                    double d21 = d18;
                                    double d22 = -1.5707963267948966d;
                                    double d23 = 1.5707963267948966d;
                                    double d24 = 0.37081471193057003d;
                                    double d25 = hba.d(f2, b6, arrayList5, 0.37081471193057003d);
                                    while (Math.abs(d23 - d22) > 0.06981317007977318d) {
                                        if (d20 < d25) {
                                            double d26 = (0.3819660112501051d * d24) + (0.6180339887498949d * d22);
                                            double d27 = hba.d(f2, b6, arrayList5, d26);
                                            d = d19;
                                            d19 = d26;
                                            d25 = d20;
                                            d20 = d27;
                                            d23 = d24;
                                        } else {
                                            double d28 = (0.6180339887498949d * d23) + (0.3819660112501051d * d19);
                                            double d29 = hba.d(f2, b6, arrayList5, d28);
                                            d = d28;
                                            d20 = d25;
                                            d25 = d29;
                                            d22 = d19;
                                            d19 = d24;
                                        }
                                        d24 = d;
                                    }
                                    double min = Math.min(d20, d25);
                                    if (min < d21) {
                                        i8 = ((gba) hbaVar2.c.get(i10)).a;
                                        d18 = min;
                                        i9 = i10;
                                    } else {
                                        d18 = d21;
                                    }
                                }
                                int i11 = 1.0d - (d18 / hba.n) < 0.8d ? -1 : i8;
                                if (i11 >= 0 && i11 < t11.c.size() && arrayList4.size() >= 1) {
                                    dba dbaVar2 = new dba(t11.o(i11));
                                    if (i11 == 4) {
                                        int e2 = hba.e(0, arrayList4);
                                        if (e2 > 0) {
                                            if (e2 > 10) {
                                                e2 -= 2;
                                            }
                                            fba fbaVar9 = (fba) arrayList4.get(e2);
                                            fba fbaVar10 = (fba) arrayList4.get(e2 / 2);
                                            fba fbaVar11 = (fba) arrayList4.get(0);
                                            dbaVar2.b = (float) fbaVar9.a;
                                            dbaVar2.c = (float) fbaVar9.b;
                                            dbaVar2.i = (float) fbaVar10.a;
                                            dbaVar2.j = (float) fbaVar10.b;
                                            dbaVar2.d = (float) fbaVar11.a;
                                            dbaVar2.e = (float) fbaVar11.b;
                                            dbaVar2.k = 16.0f;
                                        }
                                    } else {
                                        fba b7 = hba.b(arrayList4);
                                        dbaVar2.b = (float) b7.a;
                                        dbaVar2.c = (float) b7.b;
                                        kz5 a3 = hba.a(arrayList4);
                                        dbaVar2.d = ((float) (a3.d - a3.b)) / 2.0f;
                                        dbaVar2.e = ((float) (a3.e - a3.c)) / 2.0f;
                                        if (i11 == 2 && (e = hba.e(1, arrayList4)) > 0) {
                                            fba fbaVar12 = (fba) arrayList4.get(e);
                                            dbaVar2.h = (float) Math.atan2(fbaVar12.b - dbaVar2.c, fbaVar12.a - dbaVar2.b);
                                        }
                                    }
                                    dbaVar = dbaVar2;
                                    if (e21.a) {
                                        StringBuilder sb = new StringBuilder("took ");
                                        sb.append(System.currentTimeMillis() - j2);
                                        sb.append("ms to ");
                                        sb.append(dbaVar != null ? "" : "not ");
                                        sb.append("detect a shape");
                                        sb.append(dbaVar != null ? " (template#" + i9 + " shape#" + i11 + ")" : "");
                                        Log.i("shapedetector", sb.toString());
                                    }
                                    gm.c3(new v36(hbaVar2, dbaVar, i9, f2));
                                    hbaVar2.j.set(false);
                                }
                                dbaVar = null;
                                if (e21.a) {
                                }
                                gm.c3(new v36(hbaVar2, dbaVar, i9, f2));
                                hbaVar2.j.set(false);
                            }
                        }
                        return;
                    default:
                        hba hbaVar3 = hbaVar;
                        try {
                            InputStream open = a.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                gba gbaVar = new gba();
                                gbaVar.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < (read << 1)) {
                                    if (hbaVar3.h && (string = hbaVar3.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size2 = hbaVar3.c.size();
                                        for (i = 0; i < split.length; i++) {
                                            gba gbaVar2 = new gba();
                                            String[] split2 = split[i].split(",");
                                            if (split2.length > 1) {
                                                gbaVar2.a = Integer.parseInt(split2[0]);
                                                for (int i12 = 1; i12 < split2.length; i12 += 2) {
                                                    gbaVar2.b.add(new fba(Double.parseDouble(split2[i12]), Double.parseDouble(split2[i12 + 1])));
                                                }
                                                gbaVar2.c = hbaVar3.g.getInt("score" + (size2 + i), 0);
                                                hbaVar3.c.add(gbaVar2);
                                            }
                                        }
                                    }
                                    open.close();
                                    return;
                                }
                                for (int i13 = 0; i13 < read; i13++) {
                                    gbaVar.b.add(new fba((open.read() - read2) - 127, (open.read() - read3) - 127));
                                }
                                gbaVar.c = hbaVar3.g.getInt("score" + hbaVar3.c.size(), 0);
                                hbaVar3.c.add(gbaVar);
                            }
                            if (hbaVar3.h) {
                                split = string.split("\\|");
                                int size22 = hbaVar3.c.size();
                                while (i < split.length) {
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                            return;
                        }
                }
            }
        });
        this.s = hbaVar;
    }

    public final void a(q11 q11Var, boolean z, y89 y89Var) {
        d99 d99Var;
        if (this.l) {
            e99 e99Var = this.a;
            if (e99Var.getPainting().G || this.g == null) {
                return;
            }
            u11 currentBrush = q11Var == null ? e99Var.getCurrentBrush() : q11Var;
            if ((currentBrush instanceof p11) || (currentBrush instanceof r11)) {
                currentBrush = new s11();
            }
            u11 u11Var = currentBrush;
            this.l = false;
            if (u11Var instanceof q11) {
                e99Var.getPainting().E = false;
            }
            hw7 painting = e99Var.getPainting();
            painting.f.f(new ew7(painting, (byte) 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z && (d99Var = e99Var.a) != null) {
                d99Var.T();
            }
            xka xkaVar = e99Var.getPainting().g;
            jf8 jf8Var = this.g;
            float a = oqe.a((float) jf8Var.a, (float) jf8Var.b, 0.0f, 0.0f);
            jf8 jf8Var2 = this.g;
            float max = Math.max(a, oqe.a((float) jf8Var2.a, (float) jf8Var2.b, xkaVar.a, 0.0f));
            jf8 jf8Var3 = this.g;
            float a2 = oqe.a((float) jf8Var3.a, (float) jf8Var3.b, 0.0f, xkaVar.b);
            jf8 jf8Var4 = this.g;
            float max2 = Math.max(max, Math.max(a2, oqe.a((float) jf8Var4.a, (float) jf8Var4.b, xkaVar.a, xkaVar.b))) / 0.84f;
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
            jf8 jf8Var5 = this.g;
            jf8 jf8Var6 = new jf8(jf8Var5.a, jf8Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new kx1(this, jf8Var6, u11Var, max2));
            this.x.addListener(new xp5(this, jf8Var6, max2, u11Var, z, y89Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(d53.h);
            this.x.start();
            if (z) {
                xx0.h.a();
            }
        }
    }

    public final void b(f08 f08Var) {
        e99 e99Var = this.a;
        int currentColor = e99Var.getCurrentColor();
        float currentWeight = e99Var.getCurrentWeight();
        u11 currentBrush = e99Var.getCurrentBrush();
        f08Var.c = currentColor;
        f08Var.d = currentWeight;
        f08Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        f08Var.a = this.i;
        hw7 painting = e99Var.getPainting();
        boolean z = this.f;
        wp5 wp5Var = new wp5(this, f08Var, (byte) 0);
        boolean z2 = false;
        if (painting.L == null) {
            painting.f.f(new hy6(painting, f08Var, z, z2, wp5Var, (byte) 1));
        }
        this.f = false;
    }

    public final void c(boolean z, float f) {
        int i = this.n;
        jf8[] jf8VarArr = this.m;
        if (i <= 2) {
            jf8[] jf8VarArr2 = new jf8[i];
            System.arraycopy(jf8VarArr, 0, jf8VarArr2, 0, i);
            b(new f08(jf8VarArr2));
            return;
        }
        Vector vector = new Vector();
        jf8 jf8Var = jf8VarArr[0];
        jf8 jf8Var2 = jf8VarArr[1];
        jf8 jf8Var3 = jf8VarArr[2];
        if (jf8Var3 == null || jf8Var2 == null || jf8Var == null) {
            return;
        }
        jf8 b = jf8Var2.b(jf8Var);
        jf8 b2 = jf8Var3.b(jf8Var2);
        float f2 = 1.0f;
        int min = (int) Math.min(48.0d, Math.max(Math.floor(b.a(b2) / 1.0f), 24.0d));
        float f3 = 1.0f / min;
        int i2 = 0;
        float f4 = 0.0f;
        while (i2 < min) {
            float f5 = f2 - f4;
            double d = f5;
            float f6 = f3;
            double pow = Math.pow(d, 2.0d);
            int i3 = i2;
            double d2 = f4 * f4;
            double d3 = f5 * f5;
            double d4 = f4;
            double d5 = (b2.a * d2) + (jf8Var2.a * 2.0d * d4 * d) + (b.a * d3);
            double d6 = (b2.b * d2) + (jf8Var2.b * 2.0d * d4 * d) + (b.b * d3);
            double R1 = ((((b2.c * d2) + ((jf8Var2.c * ((2.0f * f5) * f4)) + (b.c * pow))) - 1.0d) * gm.R1(f, 1.0f, pqe.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            jf8 jf8Var4 = new jf8(d5, d6, R1);
            if (this.c) {
                jf8Var4.d = true;
                this.c = false;
            }
            vector.add(jf8Var4);
            this.p += R1;
            this.q += 1.0d;
            f4 += f6;
            f2 = 1.0f;
            f3 = f6;
            i2 = i3 + 1;
        }
        if (z) {
            b2.d = true;
        }
        vector.add(b2);
        jf8[] jf8VarArr3 = new jf8[vector.size()];
        vector.toArray(jf8VarArr3);
        b(new f08(jf8VarArr3));
        System.arraycopy(jf8VarArr, 1, jf8VarArr, 0, 2);
        if (z) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
