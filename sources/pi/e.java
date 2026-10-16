package pi;

import a0.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.o;
import b2.c1;
import b2.u;
import b2.z0;
import bi.c3;
import com.google.android.gms.internal.play_billing.k3;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import e9.y0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import ji.v2;
import l.a0;
import l.k;
import l.r;
import m.h3;
import m4.e0;
import m4.k1;
import m4.o1;
import m4.p1;
import m4.v;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.da1;
import org.telegram.ui.Components.s10;
import org.telegram.ui.web.l1;
import org.telegram.ui.web.m1;
import v7.u6;
import z3.m;
import z3.n;
import z9.w0;
import z9.x0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class e implements n, n5.b {
    public static volatile e e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public e(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(A(bufferedReader));
        m1 m1Var = (m1) hashMap.get("content-type");
        String str = m1Var == null ? null : (String) m1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            l1 l1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (l1Var != null) {
                        l1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(l1Var);
                        m1 m1Var2 = (m1) l1Var.a.get("content-location");
                        hashMap2.put(m1Var2 == null ? null : m1Var2.a, l1Var);
                    }
                    l1Var = new l1();
                    l1Var.b = (File) this.a;
                    l1Var.a.putAll(A(bufferedReader));
                    l1Var.c = jArr[0];
                }
            }
            if (l1Var != null && l1Var.c != 0 && l1Var.d != 0) {
                arrayList.add(l1Var);
                m1 m1Var3 = (m1) l1Var.a.get("content-location");
                hashMap2.put(m1Var3 != null ? m1Var3.a : null, l1Var);
            }
        }
        bufferedReader.close();
    }

    public static void D(long j10, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    public static void c(String str, String str2, HashMap hashMap) {
        m1 m1Var = new m1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    m1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = k3.j(1, 1, trim3);
                    }
                    m1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), m1Var);
    }

    public HashMap A(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb2;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                long[] jArr = (long[]) this.d;
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                String trim = readLine.trim();
                if (trim.isEmpty()) {
                    break loop0;
                }
                if (str == null || sb2 == null) {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb2 = a1.g.u(trim3);
                            str = trim2;
                        } else {
                            c(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            c(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            c(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void B() {
        boolean z10;
        if (((d) this.b) != null) {
            return;
        }
        d dVar = (d) ((ArrayDeque) this.a).pollFirst();
        this.b = dVar;
        if (dVar == null) {
            return;
        }
        b bVar = new b(this, dVar, 0);
        this.c = bVar;
        AndroidUtilities.runOnUIThread(bVar, 10000L);
        a aVar = dVar.b;
        String str = aVar.b;
        String str2 = aVar.f;
        c cVar = new c(this, dVar);
        h3 i10 = j.i(str);
        byte[] d = j.d(str2);
        int i11 = 0;
        if (i10 != null && d != null) {
            try {
                z10 = a.a.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                FileLog.e(th2);
                z10 = false;
            }
            if (z10) {
                synchronized (j.y) {
                    j jVar = j.A;
                    if (jVar != null) {
                        jVar.o();
                        j.A = null;
                    }
                    try {
                        j jVar2 = new j(i10, str2, d);
                        j.A = jVar2;
                        jVar2.x = cVar;
                        s10 s10Var = s10.getInstance();
                        if (s10Var != null) {
                            s10Var.addListener(jVar2);
                        }
                        jVar2.j.execute(new f(jVar2, 1));
                        AndroidUtilities.runOnUIThread(new f(jVar2, 2));
                        i11 = j.A.i.getLocalPort();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        j jVar3 = j.A;
                        if (jVar3 != null) {
                            jVar3.o();
                            j.A = null;
                        }
                    }
                }
            }
        }
        dVar.d = i11;
        if (i11 == 0) {
            h(dVar);
        }
    }

    public void C(v vVar) {
        synchronized (this.a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.c).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.b).remove(hVar.a);
                hVar.b.g();
                e0 e0Var = (e0) ((WeakReference) this.d).get();
                if (e0Var == null || e0Var.j()) {
                    return;
                }
                m0.W(e0Var.l, new m4.e(e0Var, vVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m2.b E(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.c;
        ArrayList d = d(list);
        if (d.size() < 2) {
            return (m2.b) s.l(d, null);
        }
        Collections.sort(d, new a4.d(24));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) d.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= d.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) d.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (m2.b) d.get(0);
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = d.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((m2.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.d).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (m2.b) s.m(subList);
                break;
            }
            bVar = (m2.b) subList.get(i10);
            i15 += bVar.d;
            if (nextInt < i15) {
                break;
            }
            i10++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    @Override // z3.n
    public int X() {
        return 2;
    }

    public void a(Object obj, v vVar, p1 p1Var, c1 c1Var) {
        synchronized (this.a) {
            try {
                v n10 = n(obj);
                if (n10 == null) {
                    ((a0.f) this.b).put(obj, vVar);
                    a0.f fVar = (a0.f) this.c;
                    com.google.android.gms.common.api.internal.v vVar2 = new com.google.android.gms.common.api.internal.v();
                    vVar2.c = new Object();
                    vVar2.d = new a0.f(0);
                    fVar.put(vVar, new m4.h(obj, vVar2, p1Var, c1Var));
                } else {
                    m4.h hVar = (m4.h) ((a0.f) this.c).get(n10);
                    hVar.getClass();
                    hVar.d = p1Var;
                    hVar.e = c1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(v vVar, int i10, m4.g gVar) {
        synchronized (this.a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.c).get(vVar);
                if (hVar != null) {
                    c1 c1Var = hVar.g;
                    c1Var.getClass();
                    u uVar = new u();
                    uVar.c(c1Var.a);
                    uVar.b(i10);
                    hVar.g = new c1(uVar.d());
                    hVar.c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList d(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        D(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        D(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public w0 e() {
        String str = ((x0) this.a) == null ? " rolloutVariant" : "";
        if (((String) this.b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.c) == null) {
            str = t8.b.u(str, " parameterValue");
        }
        if (((Long) this.d) == null) {
            str = t8.b.u(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.a, (String) this.b, (String) this.c, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void f(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            s(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String g(String str) {
        ArrayList arrayList = (ArrayList) this.a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                f(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    @Override // hd.a
    public Object get() {
        return new com.google.firebase.messaging.s((Executor) ((hd.a) this.a).get(), (s5.d) ((hd.a) this.b).get(), (h3) ((h3) this.c).get(), (t5.c) ((hd.a) this.d).get(), 9);
    }

    public void h(d dVar) {
        if (((d) this.b) != dVar) {
            return;
        }
        b bVar = (b) this.c;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.c = null;
        }
        b bVar2 = (b) this.d;
        if (bVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.d = null;
        }
        synchronized (j.y) {
            try {
                j jVar = j.A;
                if (jVar != null) {
                    jVar.o();
                    j.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b = null;
        dVar.c.run(-1L);
        B();
    }

    public void i(m4.h hVar) {
        e0 e0Var = (e0) ((WeakReference) this.d).get();
        if (e0Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            m4.g gVar = (m4.g) hVar.c.poll();
            if (gVar == null) {
                hVar.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            m4.h hVar2 = hVar;
            m0.W(e0Var.l, new v2(e0Var, n(hVar.a), new c3(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 10)));
            atomicBoolean2.set(false);
            hVar = hVar2;
        }
    }

    public void j(final v vVar) {
        synchronized (this.a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.c).get(vVar);
                if (hVar == null) {
                    return;
                }
                final c1 c1Var = hVar.g;
                hVar.g = c1.b;
                hVar.c.add(new m4.g(vVar, c1Var) { // from class: m4.f
                    public final /* synthetic */ v b;

                    @Override // m4.g
                    public final j9.y run() {
                        e0 e0Var = (e0) ((WeakReference) pi.e.this.d).get();
                        if (e0Var != null) {
                            e0Var.p(this.b);
                        }
                        return j9.w.b;
                    }
                });
                if (hVar.f) {
                    return;
                }
                hVar.f = true;
                i(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e k(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public c1 l(v vVar) {
        synchronized (this.a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.c).get(vVar);
                if (hVar == null) {
                    return null;
                }
                return hVar.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public n0 m() {
        n0 u10;
        synchronized (this.a) {
            u10 = n0.u(((a0.f) this.b).values());
        }
        return u10;
    }

    @Override // z3.n
    public void m0(byte[] bArr, int i10, int i11, m mVar, e2.j jVar) {
        d2.b bVar;
        int i12;
        int i13;
        int i14;
        int D;
        c4.a aVar = (c4.a) this.c;
        x xVar = (x) this.b;
        x xVar2 = (x) this.a;
        xVar2.L(i10 + i11, bArr);
        xVar2.N(i10);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (m0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.c, xVar.a);
        }
        int i15 = 0;
        aVar.d = 0;
        int[] iArr = aVar.b;
        x xVar3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        xVar3.K(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i16 = xVar2.c;
            int A = xVar2.A();
            int H = xVar2.H();
            int i17 = xVar2.b + H;
            if (i17 > i16) {
                xVar2.N(i16);
                i12 = i15;
                bVar = null;
            } else {
                char c10 = 128;
                if (A != 128) {
                    switch (A) {
                        case 20:
                            if (H % 5 == 2) {
                                xVar2.O(2);
                                Arrays.fill(iArr, i15);
                                int i18 = H / 5;
                                int i19 = i15;
                                while (i19 < i18) {
                                    int A2 = xVar2.A();
                                    char c11 = c10;
                                    double A3 = xVar2.A();
                                    double A4 = xVar2.A() - 128;
                                    double A5 = xVar2.A() - 128;
                                    iArr[A2] = m0.i((int) ((A5 * 1.772d) + A3), 0, 255) | (xVar2.A() << 24) | (m0.i((int) ((1.402d * A4) + A3), 0, 255) << 16) | (m0.i((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, 255) << 8);
                                    i19++;
                                    c10 = c11;
                                    aVar = aVar;
                                }
                                aVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                xVar2.O(3);
                                int i20 = H - 4;
                                if (((128 & xVar2.A()) != 0 ? 1 : i15) != 0) {
                                    if (i20 >= 7 && (D = xVar2.D()) >= 4) {
                                        aVar.h = xVar2.H();
                                        aVar.i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i20 = H - 11;
                                    }
                                }
                                int i21 = xVar3.b;
                                int i22 = xVar3.c;
                                if (i21 < i22 && i20 > 0) {
                                    int min = Math.min(i20, i22 - i21);
                                    xVar2.k(i21, min, xVar3.a);
                                    xVar3.N(i21 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.e = xVar2.H();
                                xVar2.O(11);
                                aVar.f = xVar2.H();
                                aVar.g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i12 = 0;
                    bVar = null;
                } else {
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i13 = xVar3.c) == 0 || xVar3.b != i13 || !aVar.c) {
                        bVar = null;
                    } else {
                        xVar3.N(0);
                        int i23 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i23];
                        int i24 = 0;
                        while (i24 < i23) {
                            int A6 = xVar3.A();
                            if (A6 != 0) {
                                i14 = i24 + 1;
                                iArr2[i24] = iArr[A6];
                            } else {
                                int A7 = xVar3.A();
                                if (A7 != 0) {
                                    i14 = ((A7 & 64) == 0 ? A7 & 63 : ((A7 & 63) << 8) | xVar3.A()) + i24;
                                    Arrays.fill(iArr2, i24, i14, (A7 & 128) == 0 ? iArr[0] : iArr[xVar3.A()]);
                                }
                            }
                            i24 = i14;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f7 = aVar.f;
                        float f10 = aVar.d;
                        float f11 = f7 / f10;
                        float f12 = aVar.g;
                        float f13 = aVar.e;
                        bVar = new d2.b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f10, aVar.i / f13, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                    }
                    i12 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    xVar3.K(0);
                    aVar.c = false;
                }
                xVar2.N(i17);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i15 = i12;
        }
        jVar.accept(new z3.b(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public v n(Object obj) {
        v vVar;
        synchronized (this.a) {
            vVar = (v) ((a0.f) this.b).get(obj);
        }
        return vVar;
    }

    public z0 o(v vVar) {
        synchronized (this.a) {
            try {
                return ((m4.h) ((a0.f) this.c).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k1 p(v vVar) {
        synchronized (this.a) {
            try {
                return ((m4.h) ((a0.f) this.c).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.v q(v vVar) {
        m4.h hVar;
        synchronized (this.a) {
            hVar = (m4.h) ((a0.f) this.c).get(vVar);
        }
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        throw new java.lang.Exception(t8.b.h("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = da1.z0.matcher(trim);
            int i11 = 0;
            while (true) {
                if (!matcher.find()) {
                    break;
                }
                if (matcher.group(0).indexOf(48) == 40) {
                    i11++;
                } else {
                    i11--;
                    if (i11 == 0) {
                        r(i10, trim.substring(1, matcher.start()), hashMap);
                        trim = trim.substring(matcher.end()).trim();
                        if (TextUtils.isEmpty(trim)) {
                            return;
                        }
                    }
                }
            }
        }
        int i12 = 0;
        while (true) {
            String[] strArr = (String[]) this.d;
            if (i12 < strArr.length) {
                String str2 = strArr[i12];
                Locale locale = Locale.US;
                Matcher matcher2 = Pattern.compile("(?x)([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\[([^\\]]+?)\\])?\\s*" + Pattern.quote(str2) + "(.*)$").matcher(trim);
                if (matcher2.find()) {
                    r(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        r(i10, group, hashMap);
                        return;
                    }
                }
                i12++;
            } else {
                try {
                    Integer.parseInt(trim);
                    return;
                } catch (Exception unused) {
                    Locale locale2 = Locale.US;
                    if (Pattern.compile("(?!if|return|true|false)([a-zA-Z_$][a-zA-Z_$0-9]*)$").matcher(trim).find()) {
                        return;
                    }
                    if (trim.charAt(0) == '\"' && trim.charAt(trim.length() - 1) == '\"') {
                        return;
                    }
                    try {
                        new JSONObject(trim).toString();
                        return;
                    } catch (Exception unused2) {
                        Locale locale3 = Locale.US;
                        Matcher matcher3 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher3.find()) {
                            matcher3.group(1);
                            r(i10 - 1, matcher3.group(2), hashMap);
                            return;
                        }
                        Matcher matcher4 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\.([^(]+)|\\[([^]]+)\\])\\s*(?:\\(+([^()]*)\\))?$").matcher(trim);
                        if (matcher4.find()) {
                            String group2 = matcher4.group(1);
                            String group3 = matcher4.group(2);
                            String group4 = matcher4.group(3);
                            if (TextUtils.isEmpty(group3)) {
                                group3 = group4;
                            }
                            group3.replace("\"", "");
                            String group5 = matcher4.group(4);
                            if (hashMap.get(group2) == null) {
                                ArrayList arrayList = (ArrayList) this.a;
                                new HashMap();
                                Matcher matcher5 = Pattern.compile("(?:var\\s+)?" + Pattern.quote(group2) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher((String) this.b);
                                String str3 = null;
                                while (true) {
                                    if (!matcher5.find()) {
                                        break;
                                    }
                                    String group6 = matcher5.group();
                                    String group7 = matcher5.group(2);
                                    if (TextUtils.isEmpty(group7)) {
                                        str3 = group7;
                                    } else {
                                        if (!arrayList.contains(group6)) {
                                            arrayList.add(matcher5.group());
                                        }
                                        str3 = group7;
                                    }
                                }
                                Matcher matcher6 = Pattern.compile("((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+'))\\s*:\\s*function\\(([a-z,]+)\\)\\{([^}]+)\\}").matcher(str3);
                                while (matcher6.find()) {
                                    f(matcher6.group(3), matcher6.group(2).split(","));
                                }
                            }
                            if (group5 == null) {
                                return;
                            }
                            if (trim.charAt(trim.length() - 1) != ')') {
                                throw new Exception("last char not ')'");
                            }
                            if (group5.length() != 0) {
                                for (String str4 : group5.split(",")) {
                                    r(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            r(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.c;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    g(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                s(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(k3.k("Premature left-side return of ", str5, " in ", trim));
                                }
                                s(matcher9.group(2), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(k3.k("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i13++;
                        }
                    }
                }
            }
        }
    }

    public void s(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = da1.x0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = da1.y0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        r(i10, trim, hashMap);
    }

    public boolean t(v vVar) {
        boolean z10;
        synchronized (this.a) {
            z10 = ((a0.f) this.c).get(vVar) != null;
        }
        return z10;
    }

    public boolean u(v vVar, int i10) {
        m4.h hVar;
        synchronized (this.a) {
            hVar = (m4.h) ((a0.f) this.c).get(vVar);
        }
        e0 e0Var = (e0) ((WeakReference) this.d).get();
        return hVar != null && hVar.e.a(i10) && e0Var != null && e0Var.t.s().a(i10);
    }

    public boolean v(v vVar, int i10) {
        m4.h hVar;
        synchronized (this.a) {
            hVar = (m4.h) ((a0.f) this.c).get(vVar);
        }
        if (hVar != null) {
            p1 p1Var = hVar.d;
            p1Var.getClass();
            u6.f("Use contains(Command) for custom command", i10 != 0);
            Iterator<E> it = p1Var.a.iterator();
            while (it.hasNext()) {
                if (((o1) it.next()).a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean w(v vVar, o1 o1Var) {
        m4.h hVar;
        synchronized (this.a) {
            hVar = (m4.h) ((a0.f) this.c).get(vVar);
        }
        if (hVar == null) {
            return false;
        }
        y0 y0Var = hVar.d.a;
        o1Var.getClass();
        return y0Var.contains(o1Var) || m4.d.j(o1Var.b);
    }

    @Override // z3.n
    public /* synthetic */ z3.e x(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    public boolean y(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(k(aVar), new r((Context) this.b, (l0.a) menuItem));
    }

    public boolean z(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        k.e k10 = k(aVar);
        l lVar = (l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.b, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(k10, menu2);
    }

    public e(int i10) {
        switch (i10) {
            case 2:
                this.a = new x();
                this.b = new x();
                this.c = new c4.a();
                break;
            case 5:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }

    public e(e0 e0Var) {
        this.b = new a0.f(0);
        this.c = new a0.f(0);
        this.a = new Object();
        this.d = new WeakReference(e0Var);
    }

    public e(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.d = typeface;
        this.a = bVar;
        this.c = new androidx.emoji2.text.s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.b = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            o oVar = new o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.a) : 0, (char[]) this.b, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.c;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                sVar.a(oVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    @Override // z3.n
    public /* synthetic */ void reset() {
    }

    public e(String str) {
        this.a = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public e(x1 x1Var, f2.j jVar, qf.b bVar, f2.j jVar2) {
        Object obj;
        if (x1Var != null) {
            obj = n0.u(x1Var);
        } else {
            l0 l0Var = n0.b;
            obj = x1.e;
        }
        this.a = obj;
        this.b = jVar;
        this.c = bVar;
        this.d = jVar2;
    }
}
