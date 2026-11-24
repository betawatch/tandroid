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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yn5 {
    public static final s33 B = new s33(0.0d, 0.5d, 0.0d, 1.0d);
    public m01 A;
    public final c79 a;
    public boolean b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public hd8 g;
    public hd8 h;
    public double i;
    public boolean j;
    public float k;
    public boolean l;
    public int n;
    public int o;
    public double p;
    public double q;
    public ValueAnimator r;
    public final h9a s;
    public Matrix t;
    public long v;
    public float w;
    public ValueAnimator x;
    public boolean z;
    public final hd8[] m = new hd8[3];
    public final float[] u = new float[2];
    public final vn5 y = new vn5(this, (byte) 1);

    /* JADX WARN: Type inference failed for: r3v6, types: [e9a] */
    public yn5(c79 c79Var) {
        final byte b = 1;
        this.a = c79Var;
        Context context = c79Var.getContext();
        hj3 hj3Var = new hj3(this, (byte) 19);
        final h9a h9aVar = new h9a();
        h9aVar.b = new ArrayList();
        h9aVar.c = new ArrayList();
        h9aVar.i = null;
        final byte b2 = 0;
        h9aVar.j = new AtomicBoolean(false);
        h9aVar.k = new AtomicBoolean(false);
        h9aVar.l = new Runnable() { // from class: e9a
            /* JADX WARN: Removed duplicated region for block: B:135:0x042d  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x0101, TryCatch #1 {Exception -> 0x0101, blocks: (B:5:0x000c, B:6:0x0018, B:8:0x001f, B:12:0x0045, B:14:0x0062, B:16:0x0085, B:18:0x0089, B:20:0x0094, B:21:0x00a1, B:23:0x00a4, B:25:0x00b5, B:26:0x00be, B:28:0x00c1, B:30:0x00dc, B:32:0x00fa, B:35:0x00fd), top: B:4:0x000c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                d9a d9aVar;
                int e;
                int i;
                long j;
                String string;
                String[] split;
                int i2;
                switch (b2) {
                    case 0:
                        h9a h9aVar2 = h9aVar;
                        if (h9aVar2.j.get()) {
                            return;
                        }
                        h9aVar2.k.set(false);
                        h9aVar2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (h9aVar2) {
                            if (h9aVar2.b.size() < 8) {
                                h9aVar2.j.set(false);
                            } else {
                                ArrayList f = h9a.f(h9aVar2.b);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((f9a) f.get(0));
                                double d = 0.0d;
                                for (int i3 = 1; i3 < f.size(); i3++) {
                                    f9a f9aVar = (f9a) f.get(i3 - 1);
                                    f9a f9aVar2 = (f9a) f.get(i3);
                                    f9aVar.getClass();
                                    d += f9aVar.a(f9aVar2.a, f9aVar2.b);
                                }
                                double d2 = d / 47.0d;
                                int i4 = 1;
                                double d3 = 0.0d;
                                while (i4 < f.size()) {
                                    int i5 = i4 - 1;
                                    f9a f9aVar3 = (f9a) f.get(i5);
                                    f9a f9aVar4 = (f9a) f.get(i4);
                                    f9aVar3.getClass();
                                    int i6 = i4;
                                    double a = f9aVar3.a(f9aVar4.a, f9aVar4.b);
                                    double d4 = d3 + a;
                                    if (d4 >= d2) {
                                        double d5 = (d2 - d3) / a;
                                        i = i6;
                                        j = currentTimeMillis;
                                        f9a f9aVar5 = new f9a(((((f9a) f.get(i)).a - ((f9a) f.get(i5)).a) * d5) + ((f9a) f.get(i5)).a, ((((f9a) f.get(i)).b - ((f9a) f.get(i5)).b) * d5) + ((f9a) f.get(i5)).b);
                                        arrayList.add(f9aVar5);
                                        f.add(i, f9aVar5);
                                        d3 = 0.0d;
                                    } else {
                                        i = i6;
                                        j = currentTimeMillis;
                                        d3 = d4;
                                    }
                                    i4 = i + 1;
                                    currentTimeMillis = j;
                                }
                                long j2 = currentTimeMillis;
                                if (arrayList.size() == 47) {
                                    arrayList.add((f9a) b00.f(1, f));
                                }
                                ArrayList f2 = h9a.f(arrayList);
                                f9a b3 = h9a.b(f2);
                                double atan2 = Math.atan2(b3.b - ((f9a) f2.get(0)).b, b3.a - ((f9a) f2.get(0)).a);
                                f9a b4 = h9a.b(f2);
                                double cos = Math.cos(atan2);
                                double sin = Math.sin(atan2);
                                int i7 = 0;
                                while (i7 < f2.size()) {
                                    f9a f9aVar6 = (f9a) f2.get(i7);
                                    double d6 = f9aVar6.a;
                                    double d7 = b4.a;
                                    double d8 = d6 - d7;
                                    double d9 = sin;
                                    double d10 = f9aVar6.b;
                                    double d11 = b4.b;
                                    double d12 = d10 - d11;
                                    f9aVar6.b = (d12 * cos) + (d8 * d9) + d11;
                                    f9aVar6.a = ((d8 * cos) - (d12 * d9)) + d7;
                                    i7++;
                                    sin = d9;
                                }
                                f9a b5 = h9a.b(f2);
                                double d13 = -b5.a;
                                double d14 = -b5.b;
                                for (int i8 = 0; i8 < f2.size(); i8++) {
                                    f9a f9aVar7 = (f9a) f2.get(i8);
                                    f9aVar7.a += d13;
                                    f9aVar7.b += d14;
                                }
                                kx5 a2 = h9a.a(f2);
                                double d15 = a2.d - a2.b;
                                double d16 = a2.e - a2.c;
                                for (int i9 = 0; i9 < f2.size(); i9++) {
                                    f9a f9aVar8 = (f9a) f2.get(i9);
                                    f9aVar8.a = (250.0d / d15) * f9aVar8.a;
                                    f9aVar8.b = (250.0d / d16) * f9aVar8.b;
                                }
                                f9a b6 = h9a.b(f2);
                                double d17 = Double.MAX_VALUE;
                                int i10 = 0;
                                int i11 = -1;
                                int i12 = -1;
                                while (i10 < h9aVar2.c.size()) {
                                    ArrayList arrayList2 = ((g9a) h9aVar2.c.get(i10)).b;
                                    double d18 = -1.5707963267948966d;
                                    double d19 = 1.5707963267948966d;
                                    int i13 = i10;
                                    double d20 = d17;
                                    double d21 = h9a.d(f2, b6, arrayList2, -0.37081471193057003d);
                                    double d22 = h9a.d(f2, b6, arrayList2, 0.37081471193057003d);
                                    double d23 = 0.37081471193057003d;
                                    double d24 = -0.37081471193057003d;
                                    while (Math.abs(d19 - d18) > 0.06981317007977318d) {
                                        if (d21 < d22) {
                                            double d25 = (0.3819660112501051d * d23) + (0.6180339887498949d * d18);
                                            double d26 = h9a.d(f2, b6, arrayList2, d25);
                                            d19 = d23;
                                            d23 = d24;
                                            d24 = d25;
                                            d22 = d21;
                                            d21 = d26;
                                        } else {
                                            double d27 = (0.6180339887498949d * d19) + (0.3819660112501051d * d24);
                                            double d28 = h9a.d(f2, b6, arrayList2, d27);
                                            d18 = d24;
                                            d24 = d23;
                                            d23 = d27;
                                            d21 = d22;
                                            d22 = d28;
                                        }
                                    }
                                    double min = Math.min(d21, d22);
                                    if (min < d20) {
                                        i11 = ((g9a) h9aVar2.c.get(i13)).a;
                                        d17 = min;
                                        i12 = i13;
                                    } else {
                                        d17 = d20;
                                    }
                                    i10 = i13 + 1;
                                }
                                int i14 = 1.0d - (d17 / h9a.n) < 0.8d ? -1 : i11;
                                if (i14 >= 0 && i14 < l01.c.size() && arrayList.size() >= 1) {
                                    d9a d9aVar2 = new d9a(l01.o(i14));
                                    if (i14 == 4) {
                                        int e2 = h9a.e(0, arrayList);
                                        if (e2 > 0) {
                                            if (e2 > 10) {
                                                e2 -= 2;
                                            }
                                            f9a f9aVar9 = (f9a) arrayList.get(e2);
                                            f9a f9aVar10 = (f9a) arrayList.get(e2 / 2);
                                            f9a f9aVar11 = (f9a) arrayList.get(0);
                                            d9aVar2.b = (float) f9aVar9.a;
                                            d9aVar2.c = (float) f9aVar9.b;
                                            d9aVar2.i = (float) f9aVar10.a;
                                            d9aVar2.j = (float) f9aVar10.b;
                                            d9aVar2.d = (float) f9aVar11.a;
                                            d9aVar2.e = (float) f9aVar11.b;
                                            d9aVar2.k = 16.0f;
                                        }
                                    } else {
                                        f9a b7 = h9a.b(arrayList);
                                        d9aVar2.b = (float) b7.a;
                                        d9aVar2.c = (float) b7.b;
                                        kx5 a3 = h9a.a(arrayList);
                                        d9aVar2.d = ((float) (a3.d - a3.b)) / 2.0f;
                                        d9aVar2.e = ((float) (a3.e - a3.c)) / 2.0f;
                                        if (i14 == 2 && (e = h9a.e(1, arrayList)) > 0) {
                                            f9a f9aVar12 = (f9a) arrayList.get(e);
                                            d9aVar2.h = (float) Math.atan2(f9aVar12.b - d9aVar2.c, f9aVar12.a - d9aVar2.b);
                                        }
                                    }
                                    d9aVar = d9aVar2;
                                    if (w01.a) {
                                        StringBuilder sb = new StringBuilder("took ");
                                        sb.append(System.currentTimeMillis() - j2);
                                        sb.append("ms to ");
                                        sb.append(d9aVar != null ? "" : "not ");
                                        sb.append("detect a shape");
                                        sb.append(d9aVar != null ? " (template#" + i12 + " shape#" + i14 + ")" : "");
                                        Log.i("shapedetector", sb.toString());
                                    }
                                    gl.d3(new q76((Object) h9aVar2, (Object) d9aVar, i12, (Object) f2, (byte) 26));
                                    h9aVar2.j.set(false);
                                }
                                d9aVar = null;
                                if (w01.a) {
                                }
                                gl.d3(new q76((Object) h9aVar2, (Object) d9aVar, i12, (Object) f2, (byte) 26));
                                h9aVar2.j.set(false);
                            }
                        }
                        return;
                    default:
                        h9a h9aVar3 = h9aVar;
                        try {
                            InputStream open = a.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                g9a g9aVar = new g9a();
                                g9aVar.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < (read << 1)) {
                                    if (h9aVar3.h && (string = h9aVar3.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size = h9aVar3.c.size();
                                        for (i2 = 0; i2 < split.length; i2++) {
                                            g9a g9aVar2 = new g9a();
                                            String[] split2 = split[i2].split(",");
                                            if (split2.length > 1) {
                                                g9aVar2.a = Integer.parseInt(split2[0]);
                                                for (int i15 = 1; i15 < split2.length; i15 += 2) {
                                                    g9aVar2.b.add(new f9a(Double.parseDouble(split2[i15]), Double.parseDouble(split2[i15 + 1])));
                                                }
                                                g9aVar2.c = h9aVar3.g.getInt("score" + (size + i2), 0);
                                                h9aVar3.c.add(g9aVar2);
                                            }
                                        }
                                    }
                                    open.close();
                                    return;
                                }
                                for (int i16 = 0; i16 < read; i16++) {
                                    g9aVar.b.add(new f9a((open.read() - read2) - 127, (open.read() - read3) - 127));
                                }
                                g9aVar.c = h9aVar3.g.getInt("score" + h9aVar3.c.size(), 0);
                                h9aVar3.c.add(g9aVar);
                            }
                            if (h9aVar3.h) {
                                split = string.split("\\|");
                                int size2 = h9aVar3.c.size();
                                while (i2 < split.length) {
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                            return;
                        }
                }
            }
        };
        h9aVar.f = context;
        h9aVar.e = hj3Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        h9aVar.g = sharedPreferences;
        h9aVar.h = sharedPreferences.getBoolean("learning", false);
        h9aVar.a = sharedPreferences.getInt("scoreall", 0);
        h9a.m.postRunnable(new Runnable() { // from class: e9a
            /* JADX WARN: Removed duplicated region for block: B:135:0x042d  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: Exception -> 0x0101, TryCatch #1 {Exception -> 0x0101, blocks: (B:5:0x000c, B:6:0x0018, B:8:0x001f, B:12:0x0045, B:14:0x0062, B:16:0x0085, B:18:0x0089, B:20:0x0094, B:21:0x00a1, B:23:0x00a4, B:25:0x00b5, B:26:0x00be, B:28:0x00c1, B:30:0x00dc, B:32:0x00fa, B:35:0x00fd), top: B:4:0x000c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                d9a d9aVar;
                int e;
                int i;
                long j;
                String string;
                String[] split;
                int i2;
                switch (b) {
                    case 0:
                        h9a h9aVar2 = h9aVar;
                        if (h9aVar2.j.get()) {
                            return;
                        }
                        h9aVar2.k.set(false);
                        h9aVar2.j.set(true);
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (h9aVar2) {
                            if (h9aVar2.b.size() < 8) {
                                h9aVar2.j.set(false);
                            } else {
                                ArrayList f = h9a.f(h9aVar2.b);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((f9a) f.get(0));
                                double d = 0.0d;
                                for (int i3 = 1; i3 < f.size(); i3++) {
                                    f9a f9aVar = (f9a) f.get(i3 - 1);
                                    f9a f9aVar2 = (f9a) f.get(i3);
                                    f9aVar.getClass();
                                    d += f9aVar.a(f9aVar2.a, f9aVar2.b);
                                }
                                double d2 = d / 47.0d;
                                int i4 = 1;
                                double d3 = 0.0d;
                                while (i4 < f.size()) {
                                    int i5 = i4 - 1;
                                    f9a f9aVar3 = (f9a) f.get(i5);
                                    f9a f9aVar4 = (f9a) f.get(i4);
                                    f9aVar3.getClass();
                                    int i6 = i4;
                                    double a = f9aVar3.a(f9aVar4.a, f9aVar4.b);
                                    double d4 = d3 + a;
                                    if (d4 >= d2) {
                                        double d5 = (d2 - d3) / a;
                                        i = i6;
                                        j = currentTimeMillis;
                                        f9a f9aVar5 = new f9a(((((f9a) f.get(i)).a - ((f9a) f.get(i5)).a) * d5) + ((f9a) f.get(i5)).a, ((((f9a) f.get(i)).b - ((f9a) f.get(i5)).b) * d5) + ((f9a) f.get(i5)).b);
                                        arrayList.add(f9aVar5);
                                        f.add(i, f9aVar5);
                                        d3 = 0.0d;
                                    } else {
                                        i = i6;
                                        j = currentTimeMillis;
                                        d3 = d4;
                                    }
                                    i4 = i + 1;
                                    currentTimeMillis = j;
                                }
                                long j2 = currentTimeMillis;
                                if (arrayList.size() == 47) {
                                    arrayList.add((f9a) b00.f(1, f));
                                }
                                ArrayList f2 = h9a.f(arrayList);
                                f9a b3 = h9a.b(f2);
                                double atan2 = Math.atan2(b3.b - ((f9a) f2.get(0)).b, b3.a - ((f9a) f2.get(0)).a);
                                f9a b4 = h9a.b(f2);
                                double cos = Math.cos(atan2);
                                double sin = Math.sin(atan2);
                                int i7 = 0;
                                while (i7 < f2.size()) {
                                    f9a f9aVar6 = (f9a) f2.get(i7);
                                    double d6 = f9aVar6.a;
                                    double d7 = b4.a;
                                    double d8 = d6 - d7;
                                    double d9 = sin;
                                    double d10 = f9aVar6.b;
                                    double d11 = b4.b;
                                    double d12 = d10 - d11;
                                    f9aVar6.b = (d12 * cos) + (d8 * d9) + d11;
                                    f9aVar6.a = ((d8 * cos) - (d12 * d9)) + d7;
                                    i7++;
                                    sin = d9;
                                }
                                f9a b5 = h9a.b(f2);
                                double d13 = -b5.a;
                                double d14 = -b5.b;
                                for (int i8 = 0; i8 < f2.size(); i8++) {
                                    f9a f9aVar7 = (f9a) f2.get(i8);
                                    f9aVar7.a += d13;
                                    f9aVar7.b += d14;
                                }
                                kx5 a2 = h9a.a(f2);
                                double d15 = a2.d - a2.b;
                                double d16 = a2.e - a2.c;
                                for (int i9 = 0; i9 < f2.size(); i9++) {
                                    f9a f9aVar8 = (f9a) f2.get(i9);
                                    f9aVar8.a = (250.0d / d15) * f9aVar8.a;
                                    f9aVar8.b = (250.0d / d16) * f9aVar8.b;
                                }
                                f9a b6 = h9a.b(f2);
                                double d17 = Double.MAX_VALUE;
                                int i10 = 0;
                                int i11 = -1;
                                int i12 = -1;
                                while (i10 < h9aVar2.c.size()) {
                                    ArrayList arrayList2 = ((g9a) h9aVar2.c.get(i10)).b;
                                    double d18 = -1.5707963267948966d;
                                    double d19 = 1.5707963267948966d;
                                    int i13 = i10;
                                    double d20 = d17;
                                    double d21 = h9a.d(f2, b6, arrayList2, -0.37081471193057003d);
                                    double d22 = h9a.d(f2, b6, arrayList2, 0.37081471193057003d);
                                    double d23 = 0.37081471193057003d;
                                    double d24 = -0.37081471193057003d;
                                    while (Math.abs(d19 - d18) > 0.06981317007977318d) {
                                        if (d21 < d22) {
                                            double d25 = (0.3819660112501051d * d23) + (0.6180339887498949d * d18);
                                            double d26 = h9a.d(f2, b6, arrayList2, d25);
                                            d19 = d23;
                                            d23 = d24;
                                            d24 = d25;
                                            d22 = d21;
                                            d21 = d26;
                                        } else {
                                            double d27 = (0.6180339887498949d * d19) + (0.3819660112501051d * d24);
                                            double d28 = h9a.d(f2, b6, arrayList2, d27);
                                            d18 = d24;
                                            d24 = d23;
                                            d23 = d27;
                                            d21 = d22;
                                            d22 = d28;
                                        }
                                    }
                                    double min = Math.min(d21, d22);
                                    if (min < d20) {
                                        i11 = ((g9a) h9aVar2.c.get(i13)).a;
                                        d17 = min;
                                        i12 = i13;
                                    } else {
                                        d17 = d20;
                                    }
                                    i10 = i13 + 1;
                                }
                                int i14 = 1.0d - (d17 / h9a.n) < 0.8d ? -1 : i11;
                                if (i14 >= 0 && i14 < l01.c.size() && arrayList.size() >= 1) {
                                    d9a d9aVar2 = new d9a(l01.o(i14));
                                    if (i14 == 4) {
                                        int e2 = h9a.e(0, arrayList);
                                        if (e2 > 0) {
                                            if (e2 > 10) {
                                                e2 -= 2;
                                            }
                                            f9a f9aVar9 = (f9a) arrayList.get(e2);
                                            f9a f9aVar10 = (f9a) arrayList.get(e2 / 2);
                                            f9a f9aVar11 = (f9a) arrayList.get(0);
                                            d9aVar2.b = (float) f9aVar9.a;
                                            d9aVar2.c = (float) f9aVar9.b;
                                            d9aVar2.i = (float) f9aVar10.a;
                                            d9aVar2.j = (float) f9aVar10.b;
                                            d9aVar2.d = (float) f9aVar11.a;
                                            d9aVar2.e = (float) f9aVar11.b;
                                            d9aVar2.k = 16.0f;
                                        }
                                    } else {
                                        f9a b7 = h9a.b(arrayList);
                                        d9aVar2.b = (float) b7.a;
                                        d9aVar2.c = (float) b7.b;
                                        kx5 a3 = h9a.a(arrayList);
                                        d9aVar2.d = ((float) (a3.d - a3.b)) / 2.0f;
                                        d9aVar2.e = ((float) (a3.e - a3.c)) / 2.0f;
                                        if (i14 == 2 && (e = h9a.e(1, arrayList)) > 0) {
                                            f9a f9aVar12 = (f9a) arrayList.get(e);
                                            d9aVar2.h = (float) Math.atan2(f9aVar12.b - d9aVar2.c, f9aVar12.a - d9aVar2.b);
                                        }
                                    }
                                    d9aVar = d9aVar2;
                                    if (w01.a) {
                                        StringBuilder sb = new StringBuilder("took ");
                                        sb.append(System.currentTimeMillis() - j2);
                                        sb.append("ms to ");
                                        sb.append(d9aVar != null ? "" : "not ");
                                        sb.append("detect a shape");
                                        sb.append(d9aVar != null ? " (template#" + i12 + " shape#" + i14 + ")" : "");
                                        Log.i("shapedetector", sb.toString());
                                    }
                                    gl.d3(new q76((Object) h9aVar2, (Object) d9aVar, i12, (Object) f2, (byte) 26));
                                    h9aVar2.j.set(false);
                                }
                                d9aVar = null;
                                if (w01.a) {
                                }
                                gl.d3(new q76((Object) h9aVar2, (Object) d9aVar, i12, (Object) f2, (byte) 26));
                                h9aVar2.j.set(false);
                            }
                        }
                        return;
                    default:
                        h9a h9aVar3 = h9aVar;
                        try {
                            InputStream open = a.b.getAssets().open("shapes.dat");
                            while (open.available() > 5) {
                                g9a g9aVar = new g9a();
                                g9aVar.a = open.read();
                                int read = open.read();
                                int read2 = open.read() - 64;
                                int read3 = open.read() - 64;
                                if (open.available() < (read << 1)) {
                                    if (h9aVar3.h && (string = h9aVar3.g.getString("moretemplates", null)) != null) {
                                        split = string.split("\\|");
                                        int size2 = h9aVar3.c.size();
                                        for (i2 = 0; i2 < split.length; i2++) {
                                            g9a g9aVar2 = new g9a();
                                            String[] split2 = split[i2].split(",");
                                            if (split2.length > 1) {
                                                g9aVar2.a = Integer.parseInt(split2[0]);
                                                for (int i15 = 1; i15 < split2.length; i15 += 2) {
                                                    g9aVar2.b.add(new f9a(Double.parseDouble(split2[i15]), Double.parseDouble(split2[i15 + 1])));
                                                }
                                                g9aVar2.c = h9aVar3.g.getInt("score" + (size2 + i2), 0);
                                                h9aVar3.c.add(g9aVar2);
                                            }
                                        }
                                    }
                                    open.close();
                                    return;
                                }
                                for (int i16 = 0; i16 < read; i16++) {
                                    g9aVar.b.add(new f9a((open.read() - read2) - 127, (open.read() - read3) - 127));
                                }
                                g9aVar.c = h9aVar3.g.getInt("score" + h9aVar3.c.size(), 0);
                                h9aVar3.c.add(g9aVar);
                            }
                            if (h9aVar3.h) {
                                split = string.split("\\|");
                                int size22 = h9aVar3.c.size();
                                while (i2 < split.length) {
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                            return;
                        }
                }
            }
        });
        this.s = h9aVar;
    }

    public final void a(i01 i01Var, boolean z, w69 w69Var) {
        b79 b79Var;
        if (this.l) {
            c79 c79Var = this.a;
            if (c79Var.getPainting().G || this.g == null) {
                return;
            }
            m01 currentBrush = i01Var == null ? c79Var.getCurrentBrush() : i01Var;
            if ((currentBrush instanceof h01) || (currentBrush instanceof j01)) {
                currentBrush = new k01();
            }
            m01 m01Var = currentBrush;
            this.l = false;
            if (m01Var instanceof i01) {
                c79Var.getPainting().E = false;
            }
            gu7 painting = c79Var.getPainting();
            painting.f.f(new du7(painting, (byte) 1));
            this.n = 0;
            this.o = 0;
            this.j = false;
            this.b = false;
            if (z && (b79Var = c79Var.a) != null) {
                b79Var.S();
            }
            via viaVar = c79Var.getPainting().g;
            hd8 hd8Var = this.g;
            float a = loe.a((float) hd8Var.a, (float) hd8Var.b, 0.0f, 0.0f);
            hd8 hd8Var2 = this.g;
            float max = Math.max(a, loe.a((float) hd8Var2.a, (float) hd8Var2.b, viaVar.a, 0.0f));
            hd8 hd8Var3 = this.g;
            float a2 = loe.a((float) hd8Var3.a, (float) hd8Var3.b, 0.0f, viaVar.b);
            hd8 hd8Var4 = this.g;
            float max2 = Math.max(max, Math.max(a2, loe.a((float) hd8Var4.a, (float) hd8Var4.b, viaVar.a, viaVar.b))) / 0.84f;
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
            hd8 hd8Var5 = this.g;
            hd8 hd8Var6 = new hd8(hd8Var5.a, hd8Var5.b, 1.0d);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new xv1(this, hd8Var6, m01Var, max2));
            this.x.addListener(new xn5(this, hd8Var6, max2, m01Var, z, w69Var));
            this.x.setDuration(450L);
            this.x.setInterpolator(s33.h);
            this.x.start();
            if (z) {
                pw0.h.a();
            }
        }
    }

    public final void b(dy7 dy7Var) {
        c79 c79Var = this.a;
        int currentColor = c79Var.getCurrentColor();
        float currentWeight = c79Var.getCurrentWeight();
        m01 currentBrush = c79Var.getCurrentBrush();
        dy7Var.c = currentColor;
        dy7Var.d = currentWeight;
        dy7Var.e = currentBrush;
        if (this.f) {
            this.i = 0.0d;
        }
        dy7Var.a = this.i;
        gu7 painting = c79Var.getPainting();
        boolean z = this.f;
        wn5 wn5Var = new wn5(this, dy7Var, (byte) 0);
        boolean z2 = false;
        if (painting.L == null) {
            painting.f.f(new hw6(painting, dy7Var, z, z2, wn5Var, (byte) 1));
        }
        this.f = false;
    }

    public final void c(boolean z, float f) {
        int i = this.n;
        hd8[] hd8VarArr = this.m;
        if (i <= 2) {
            hd8[] hd8VarArr2 = new hd8[i];
            System.arraycopy(hd8VarArr, 0, hd8VarArr2, 0, i);
            b(new dy7(hd8VarArr2));
            return;
        }
        Vector vector = new Vector();
        hd8 hd8Var = hd8VarArr[0];
        hd8 hd8Var2 = hd8VarArr[1];
        hd8 hd8Var3 = hd8VarArr[2];
        if (hd8Var3 == null || hd8Var2 == null || hd8Var == null) {
            return;
        }
        hd8 b = hd8Var2.b(hd8Var);
        hd8 b2 = hd8Var3.b(hd8Var2);
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
            double d5 = (b2.a * d2) + (hd8Var2.a * 2.0d * d4 * d) + (b.a * d3);
            double d6 = (b2.b * d2) + (hd8Var2.b * 2.0d * d4 * d) + (b.b * d3);
            double R1 = ((((b2.c * d2) + ((hd8Var2.c * ((2.0f * f5) * f4)) + (b.c * pow))) - 1.0d) * gl.R1(f, 1.0f, moe.a(this.o / 16.0f, 0.0f, 1.0f))) + 1.0d;
            hd8 hd8Var4 = new hd8(d5, d6, R1);
            if (this.c) {
                hd8Var4.d = true;
                this.c = false;
            }
            vector.add(hd8Var4);
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
        hd8[] hd8VarArr3 = new hd8[vector.size()];
        vector.toArray(hd8VarArr3);
        b(new dy7(hd8VarArr3));
        System.arraycopy(hd8VarArr, 1, hd8VarArr, 0, 2);
        if (z) {
            this.n = 0;
        } else {
            this.n = 2;
        }
    }
}
