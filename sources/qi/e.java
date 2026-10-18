package qi;

import a0.l;
import ai.t0;
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
import b2.b1;
import b2.t;
import b2.y0;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.play_billing.k3;
import e2.j;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
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
import l.a0;
import l.k;
import l.r;
import m.g3;
import m4.f0;
import m4.o1;
import m4.p1;
import m4.v;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.u91;
import org.telegram.ui.web.k1;
import org.telegram.ui.web.l1;
import v7.u6;
import z3.m;
import z9.w0;
import z9.x0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class e implements m, n5.b {
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
        hashMap.putAll(C(bufferedReader));
        l1 l1Var = (l1) hashMap.get("content-type");
        String str = l1Var == null ? null : (String) l1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            k1 k1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (k1Var != null) {
                        k1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(k1Var);
                        l1 l1Var2 = (l1) k1Var.a.get("content-location");
                        hashMap2.put(l1Var2 == null ? null : l1Var2.a, k1Var);
                    }
                    k1Var = new k1();
                    k1Var.b = (File) this.a;
                    k1Var.a.putAll(C(bufferedReader));
                    k1Var.c = jArr[0];
                }
            }
            if (k1Var != null && k1Var.c != 0 && k1Var.d != 0) {
                arrayList.add(k1Var);
                l1 l1Var3 = (l1) k1Var.a.get("content-location");
                hashMap2.put(l1Var3 != null ? l1Var3.a : null, k1Var);
            }
        }
        bufferedReader.close();
    }

    public static void F(long j10, HashMap hashMap) {
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

    public static void e(String str, String str2, HashMap hashMap) {
        l1 l1Var = new l1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    l1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = k3.j(1, 1, trim3);
                    }
                    l1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), l1Var);
    }

    public boolean A(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(n(aVar), new r((Context) this.b, (l0.a) menuItem));
    }

    public boolean B(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        k.e n10 = n(aVar);
        l lVar = (l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.b, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(n10, menu2);
    }

    public HashMap C(BufferedReader bufferedReader) {
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
                            e(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            e(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            e(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void D() {
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
        g3 i10 = i.i(str);
        byte[] d = i.d(str2);
        int i11 = 0;
        if (i10 != null && d != null) {
            try {
                z10 = a.a.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                FileLog.e(th2);
                z10 = false;
            }
            if (z10) {
                synchronized (i.y) {
                    i iVar = i.A;
                    if (iVar != null) {
                        iVar.o();
                        i.A = null;
                    }
                    try {
                        i iVar2 = new i(i10, str2, d);
                        i.A = iVar2;
                        iVar2.x = cVar;
                        o10 o10Var = o10.getInstance();
                        if (o10Var != null) {
                            o10Var.addListener(iVar2);
                        }
                        iVar2.j.execute(new f(iVar2, 1));
                        AndroidUtilities.runOnUIThread(new f(iVar2, 2));
                        i11 = i.A.i.getLocalPort();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        i iVar3 = i.A;
                        if (iVar3 != null) {
                            iVar3.o();
                            i.A = null;
                        }
                    }
                }
            }
        }
        dVar.d = i11;
        if (i11 == 0) {
            k(dVar);
        }
    }

    public void E(v vVar) {
        synchronized (this.a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.c).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.b).remove(hVar.a);
                hVar.b.g();
                f0 f0Var = (f0) ((WeakReference) this.d).get();
                if (f0Var == null || f0Var.j()) {
                    return;
                }
                m0.W(f0Var.l, new m4.e(f0Var, vVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m2.b G(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.c;
        ArrayList f7 = f(list);
        if (f7.size() < 2) {
            return (m2.b) s.l(f7, null);
        }
        Collections.sort(f7, new a4.d(26));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) f7.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= f7.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) f7.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (m2.b) f7.get(0);
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = f7.subList(0, arrayList.size());
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

    @Override // z3.m
    public /* synthetic */ z3.d a(int i10, int i11, byte[] bArr) {
        return r4.c.a(this, bArr, i11);
    }

    public void b(Object obj, v vVar, p1 p1Var, b1 b1Var) {
        synchronized (this.a) {
            try {
                v q6 = q(obj);
                if (q6 == null) {
                    ((a0.f) this.b).put(obj, vVar);
                    a0.f fVar = (a0.f) this.c;
                    u uVar = new u();
                    uVar.c = new Object();
                    uVar.d = new a0.f(0);
                    fVar.put(vVar, new m4.h(obj, uVar, p1Var, b1Var));
                } else {
                    m4.h hVar = (m4.h) ((a0.f) this.c).get(q6);
                    hVar.getClass();
                    hVar.d = p1Var;
                    hVar.e = b1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z3.m
    public int c() {
        return 2;
    }

    public void d(v vVar, int i10, m4.g gVar) {
        synchronized (this.a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.c).get(vVar);
                if (hVar != null) {
                    b1 b1Var = hVar.g;
                    b1Var.getClass();
                    t tVar = new t();
                    tVar.c(b1Var.a);
                    tVar.b(i10);
                    hVar.g = new b1(tVar.d());
                    hVar.c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList f(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        F(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        F(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // z3.m
    public void g(byte[] bArr, int i10, int i11, z3.l lVar, j jVar) {
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
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // hd.a
    public Object get() {
        return new com.google.firebase.messaging.r((Executor) ((hd.a) this.a).get(), (s5.d) ((hd.a) this.b).get(), (g3) ((g3) this.c).get(), (t5.c) ((hd.a) this.d).get(), 9);
    }

    public w0 h() {
        String str = ((x0) this.a) == null ? " rolloutVariant" : "";
        if (((String) this.b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.c) == null) {
            str = r4.c.u(str, " parameterValue");
        }
        if (((Long) this.d) == null) {
            str = r4.c.u(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.a, (String) this.b, (String) this.c, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void i(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            v(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String j(String str) {
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
                i(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    public void k(d dVar) {
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
        synchronized (i.y) {
            try {
                i iVar = i.A;
                if (iVar != null) {
                    iVar.o();
                    i.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b = null;
        dVar.c.run(-1L);
        D();
    }

    public void l(m4.h hVar) {
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (f0Var == null) {
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
            m0.W(f0Var.l, new hi.t(f0Var, q(hVar.a), new t0(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 18)));
            atomicBoolean2.set(false);
            hVar = hVar2;
        }
    }

    public void m(final v vVar) {
        synchronized (this.a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.c).get(vVar);
                if (hVar == null) {
                    return;
                }
                final b1 b1Var = hVar.g;
                hVar.g = b1.b;
                hVar.c.add(new m4.g(vVar, b1Var) { // from class: m4.f
                    public final /* synthetic */ v b;

                    @Override // m4.g
                    public final j9.y run() {
                        f0 f0Var = (f0) ((WeakReference) qi.e.this.d).get();
                        if (f0Var != null) {
                            f0Var.p(this.b);
                        }
                        return j9.w.b;
                    }
                });
                if (hVar.f) {
                    return;
                }
                hVar.f = true;
                l(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e n(k.a aVar) {
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

    public b1 o(v vVar) {
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

    public n0 p() {
        n0 u10;
        synchronized (this.a) {
            u10 = n0.u(((a0.f) this.b).values());
        }
        return u10;
    }

    public v q(Object obj) {
        v vVar;
        synchronized (this.a) {
            vVar = (v) ((a0.f) this.b).get(obj);
        }
        return vVar;
    }

    public y0 r(v vVar) {
        synchronized (this.a) {
            try {
                return ((m4.h) ((a0.f) this.c).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m4.k1 s(v vVar) {
        synchronized (this.a) {
            try {
                return ((m4.h) ((a0.f) this.c).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u t(v vVar) {
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
    
        throw new java.lang.Exception(r4.c.h("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = u91.z0.matcher(trim);
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
                        u(i10, trim.substring(1, matcher.start()), hashMap);
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
                    u(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        u(i10, group, hashMap);
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
                            u(i10 - 1, matcher3.group(2), hashMap);
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
                                    i(matcher6.group(3), matcher6.group(2).split(","));
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
                                    u(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            u(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.c;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    j(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                v(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(k3.k("Premature left-side return of ", str5, " in ", trim));
                                }
                                v(matcher9.group(2), hashMap, zArr, i14);
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

    public void v(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = u91.x0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = u91.y0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        u(i10, trim, hashMap);
    }

    public boolean w(v vVar) {
        boolean z10;
        synchronized (this.a) {
            z10 = ((a0.f) this.c).get(vVar) != null;
        }
        return z10;
    }

    public boolean x(v vVar, int i10) {
        m4.h hVar;
        synchronized (this.a) {
            hVar = (m4.h) ((a0.f) this.c).get(vVar);
        }
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        return hVar != null && hVar.e.a(i10) && f0Var != null && f0Var.t.s().a(i10);
    }

    public boolean y(v vVar, int i10) {
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

    public boolean z(v vVar, o1 o1Var) {
        m4.h hVar;
        synchronized (this.a) {
            hVar = (m4.h) ((a0.f) this.c).get(vVar);
        }
        if (hVar == null) {
            return false;
        }
        e9.y0 y0Var = hVar.d.a;
        o1Var.getClass();
        return y0Var.contains(o1Var) || m4.d.j(o1Var.b);
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

    public e(f0 f0Var) {
        this.b = new a0.f(0);
        this.c = new a0.f(0);
        this.a = new Object();
        this.d = new WeakReference(f0Var);
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

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    public e(String str) {
        this.a = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public e(x1 x1Var, f2.k kVar, qf.b bVar, f2.k kVar2) {
        Object obj;
        if (x1Var != null) {
            obj = n0.u(x1Var);
        } else {
            l0 l0Var = n0.b;
            obj = x1.e;
        }
        this.a = obj;
        this.b = kVar;
        this.c = bVar;
        this.d = kVar2;
    }
}
