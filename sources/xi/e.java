package xi;

import a0.k;
import a8.p9;
import ab.c0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import androidx.fragment.app.s;
import c4.l;
import c4.m;
import com.google.android.gms.internal.vision.e2;
import h2.j;
import h2.l0;
import h2.x;
import h9.i0;
import h9.o;
import h9.s1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import jg.w;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.j6;
import org.telegram.messenger.js;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.an;
import org.telegram.ui.ay0;
import org.telegram.ui.fe;
import org.telegram.ui.hy0;
import org.telegram.ui.ld0;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.b1;
import q4.q;
import ug.x0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class e implements m, js, hy0, q5.b {
    public static volatile e e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static void H(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            hashMap.remove(arrayList.get(i7));
        }
    }

    public static void h(String str, String str2, HashMap hashMap) {
        b1 b1Var = new b1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i7 = 0; i7 < split.length; i7++) {
            String trim = split[i7].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i7 == 0 || indexOf < 0) {
                    b1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = e2.k(trim3, 1, 1);
                    }
                    b1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), b1Var);
    }

    public void A(p0 p0Var) {
        s sVar = p0Var.c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void B(p0 p0Var) {
        HashMap hashMap = (HashMap) this.b;
        s sVar = p0Var.c;
        if (sVar.T) {
            ((m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public void C(float f10, float f11) {
        ji.e eVar;
        int[] iArr = (int[]) this.b;
        int[] iArr2 = (int[]) this.a;
        ji.m mVar = (ji.m) this.d;
        gf gfVar = mVar.b;
        if (Float.isNaN(f10) || (eVar = mVar.K) == null || mVar.c == 0) {
            gfVar.g(Float.NaN, 0.0f);
            return;
        }
        eVar.getLocationInWindow(iArr2);
        ((ViewGroup) this.c).getLocationInWindow(iArr);
        gfVar.g((f10 + iArr2[1]) - iArr[1], f11);
    }

    public void D(float f10, float f11, float f12, float f13) {
        ji.m mVar = (ji.m) this.d;
        int[] iArr = mVar.d0;
        int[] iArr2 = mVar.c0;
        EditTextBoldCursor editTextBoldCursor = mVar.X;
        if (editTextBoldCursor == null || mVar.K == null) {
            return;
        }
        int max = Math.max(1, Math.round(f12 - f10));
        int max2 = Math.max(1, Math.round(f13 - f11));
        ViewGroup.LayoutParams layoutParams = editTextBoldCursor.getLayoutParams();
        if (layoutParams != null && (layoutParams.width != max || layoutParams.height != max2)) {
            layoutParams.width = max;
            layoutParams.height = max2;
            editTextBoldCursor.setLayoutParams(layoutParams);
        }
        mVar.K.getLocationInWindow(iArr2);
        editTextBoldCursor.getLocationInWindow(iArr);
        float translationX = iArr[0] - editTextBoldCursor.getTranslationX();
        float translationY = iArr[1] - editTextBoldCursor.getTranslationY();
        editTextBoldCursor.setTranslationX((iArr2[0] + f10) - translationX);
        editTextBoldCursor.setTranslationY((iArr2[1] + f11) - translationY);
    }

    public kf.f E(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        gf.g gVar = new gf.g((ArrayList) this.a, (lf.b) this.c, (ArrayList) this.b);
        int i7 = 0;
        while (true) {
            int length = str.length();
            int i10 = i7;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                char charAt = str.charAt(i10);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                break;
            }
            gVar.i(str.substring(i7, i10));
            i7 = i10 + 1;
            if (i7 < str.length() && str.charAt(i10) == '\r' && str.charAt(i7) == '\n') {
                i7 = i10 + 2;
            }
        }
        if (str.length() > 0 && (i7 == 0 || i7 < str.length())) {
            gVar.i(str.substring(i7));
        }
        gVar.f(gVar.n);
        lf.a a10 = gVar.j.a(new wf.b(23, gVar.k, gVar.m));
        Iterator it = gVar.o.iterator();
        while (it.hasNext()) {
            ((mf.a) it.next()).g(a10);
        }
        kf.f fVar = (kf.f) gVar.l.b;
        Iterator it2 = ((ArrayList) this.d).iterator();
        if (!it2.hasNext()) {
            return fVar;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public HashMap F(BufferedReader bufferedReader) {
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
                            sb2 = e2.m(trim3);
                            str = trim2;
                        } else {
                            h(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            h(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            h(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void G() {
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
        g0.i3(bVar, 10000L);
        a aVar = dVar.b;
        String str = aVar.b;
        String str2 = aVar.f;
        c cVar = new c(this, dVar);
        ld0 k10 = i.k(str);
        byte[] f10 = i.f(str2);
        int i7 = 0;
        if (k10 != null && f10 != null) {
            try {
                z10 = p9.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                a8.g(th2, true);
                z10 = false;
            }
            if (z10) {
                synchronized (i.y) {
                    i iVar = i.A;
                    if (iVar != null) {
                        iVar.q();
                        i.A = null;
                    }
                    try {
                        i iVar2 = new i(k10, str2, f10);
                        i.A = iVar2;
                        iVar2.x = cVar;
                        r0 r0Var = r0.f;
                        if (r0Var != null) {
                            r0Var.d.add(iVar2);
                        }
                        iVar2.j.execute(new f(iVar2, 1));
                        g0.h3(new f(iVar2, 2));
                        i7 = i.A.i.getLocalPort();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        i iVar3 = i.A;
                        if (iVar3 != null) {
                            iVar3.q();
                            i.A = null;
                        }
                    }
                }
            }
        }
        dVar.d = i7;
        if (i7 == 0) {
            m(dVar);
        }
    }

    public p2.b I(List list) {
        p2.b bVar;
        HashMap hashMap = (HashMap) this.c;
        ArrayList i7 = i(list);
        if (i7.size() < 2) {
            return (p2.b) o.m(i7, null);
        }
        Collections.sort(i7, new w(9));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((p2.b) i7.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= i7.size()) {
                break;
            }
            p2.b bVar2 = (p2.b) i7.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (p2.b) i7.get(0);
            }
        }
        p2.b bVar3 = (p2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = i7.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((p2.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.d).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (p2.b) o.n(subList);
                break;
            }
            bVar = (p2.b) subList.get(i10);
            i15 += bVar.d;
            if (nextInt < i15) {
                break;
            }
            i10++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    public Bundle J(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    @Override // c4.m
    public void K(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        g2.b bVar;
        int i11;
        int i12;
        int i13;
        int D;
        f4.a aVar = (f4.a) this.c;
        x xVar = (x) this.b;
        x xVar2 = (x) this.a;
        xVar2.L(i7 + i10, bArr);
        xVar2.N(i7);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (l0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.c, xVar.a);
        }
        int i14 = 0;
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
            int i15 = xVar2.c;
            int A = xVar2.A();
            int H = xVar2.H();
            int i16 = xVar2.b + H;
            if (i16 > i15) {
                xVar2.N(i15);
                i11 = i14;
                bVar = null;
            } else {
                char c10 = 128;
                if (A != 128) {
                    switch (A) {
                        case 20:
                            if (H % 5 == 2) {
                                xVar2.O(2);
                                Arrays.fill(iArr, i14);
                                int i17 = H / 5;
                                int i18 = i14;
                                while (i18 < i17) {
                                    int A2 = xVar2.A();
                                    char c11 = c10;
                                    double A3 = xVar2.A();
                                    double A4 = xVar2.A() - 128;
                                    double A5 = xVar2.A() - 128;
                                    iArr[A2] = l0.i((int) ((A5 * 1.772d) + A3), 0, ns.e4) | (xVar2.A() << 24) | (l0.i((int) ((1.402d * A4) + A3), 0, ns.e4) << 16) | (l0.i((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, ns.e4) << 8);
                                    i18++;
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
                                int i19 = H - 4;
                                if (((128 & xVar2.A()) != 0 ? 1 : i14) != 0) {
                                    if (i19 >= 7 && (D = xVar2.D()) >= 4) {
                                        aVar.h = xVar2.H();
                                        aVar.i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i19 = H - 11;
                                    }
                                }
                                int i20 = xVar3.b;
                                int i21 = xVar3.c;
                                if (i20 < i21 && i19 > 0) {
                                    int min = Math.min(i19, i21 - i20);
                                    xVar2.k(i20, min, xVar3.a);
                                    xVar3.N(i20 + min);
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
                    i11 = 0;
                    bVar = null;
                } else {
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i12 = xVar3.c) == 0 || xVar3.b != i12 || !aVar.c) {
                        bVar = null;
                    } else {
                        xVar3.N(0);
                        int i22 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int A6 = xVar3.A();
                            if (A6 != 0) {
                                i13 = i23 + 1;
                                iArr2[i23] = iArr[A6];
                            } else {
                                int A7 = xVar3.A();
                                if (A7 != 0) {
                                    i13 = ((A7 & 64) == 0 ? A7 & 63 : ((A7 & 63) << 8) | xVar3.A()) + i23;
                                    Arrays.fill(iArr2, i23, i13, (A7 & 128) == 0 ? iArr[0] : iArr[xVar3.A()]);
                                }
                            }
                            i23 = i13;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.f;
                        float f11 = aVar.d;
                        float f12 = f10 / f11;
                        float f13 = aVar.g;
                        float f14 = aVar.e;
                        bVar = new g2.b(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f11, aVar.i / f14, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                    }
                    i11 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    xVar3.K(0);
                    aVar.c = false;
                }
                xVar2.N(i16);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i14 = i11;
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // c4.m
    public int Q() {
        return 2;
    }

    @Override // org.telegram.ui.hy0
    public void a() {
        g0.i3(new ay0((an) this.a, (Activity) this.b, (e6) this.c, (gj) this.d, 2), 200L);
    }

    @Override // org.telegram.messenger.js
    public void b() {
        k kVar = (k) this.c;
        if (((is) this.b) == null) {
            return;
        }
        e eVar = (e) this.d;
        if (eVar != null) {
            eVar.b();
            this.d = null;
        }
        int i7 = kVar.b;
        for (int i10 = 0; i10 < i7; i10++) {
            ns nsVar = (ns) this.a;
            is isVar = (is) this.b;
            if (i10 < 0) {
                kVar.getClass();
            } else if (i10 < kVar.b) {
                nsVar.n(isVar, kVar.a[i10]);
            }
            StringBuilder m10 = i5.c.m(i10, "Index ", " must be in 0..");
            m10.append(kVar.b - 1);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        kVar.b = 0;
        this.a = null;
        this.b = null;
    }

    public e c(int i7) {
        if (((is) this.b) == null) {
            return this;
        }
        k kVar = (k) this.c;
        int i10 = kVar.b + 1;
        int[] iArr = kVar.a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            kVar.a = copyOf;
        }
        int[] iArr2 = kVar.a;
        int i11 = kVar.b;
        iArr2[i11] = i7;
        kVar.b = i11 + 1;
        ((ns) this.a).b((is) this.b, i7);
        return this;
    }

    @Override // org.telegram.ui.hy0
    public void d() {
        g0.i3(new fe((an) this.a, (gj) this.d, 8), 200L);
    }

    public void e(s sVar) {
        if (((ArrayList) this.a).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(sVar);
        }
        sVar.w = true;
    }

    public e f(int i7) {
        if (((is) this.b) == null) {
            return this;
        }
        if (((e) this.d) == null) {
            this.d = new e(ns.e(), (is) this.b);
        }
        ((e) this.d).c(i7);
        return this;
    }

    @Override // org.telegram.ui.hy0
    public void g() {
        an anVar = (an) this.a;
        anVar.showDialog(new x0((org.telegram.ui.ActionBar.e2) anVar, 3, true));
    }

    @Override // fd.a
    public Object get() {
        return new c0((Executor) ((fd.a) this.a).get(), (v5.d) ((fd.a) this.b).get(), (ld0) ((ld0) this.c).get(), (w5.c) ((fd.a) this.d).get(), 14);
    }

    public ArrayList i(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        H(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        H(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            p2.b bVar = (p2.b) list.get(i7);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void j(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            z(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public fh.g k(ji.e eVar) {
        fh.g gVar;
        gh.a aVar;
        ChatActivityEnterView chatActivityEnterView = ((ji.m) this.d).b.a;
        int i7 = ChatActivityEnterView.N6;
        jh.f r02 = chatActivityEnterView.r0();
        dh.c cVar = chatActivityEnterView.D1;
        if (cVar == null || r02 == null || (gVar = r02.h) == null || (aVar = gVar.w) == null) {
            return null;
        }
        return cVar.c(eVar, aVar, false);
    }

    public String l(String str) {
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
                j(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e10) {
            arrayList.clear();
            a8.g(e10, true);
        }
        return TextUtils.join("", arrayList);
    }

    public void m(d dVar) {
        if (((d) this.b) != dVar) {
            return;
        }
        b bVar = (b) this.c;
        if (bVar != null) {
            g0.r(bVar);
            this.c = null;
        }
        b bVar2 = (b) this.d;
        if (bVar2 != null) {
            g0.r(bVar2);
            this.d = null;
        }
        synchronized (i.y) {
            try {
                i iVar = i.A;
                if (iVar != null) {
                    iVar.q();
                    i.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b = null;
        dVar.c.run(-1L);
        G();
    }

    public s n(String str) {
        p0 p0Var = (p0) ((HashMap) this.b).get(str);
        if (p0Var != null) {
            return p0Var.c;
        }
        return null;
    }

    public s o(String str) {
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                s sVar = p0Var.c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.M.c.o(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public float r() {
        EditTextBoldCursor editTextBoldCursor = ((ji.m) this.d).X;
        if (editTextBoldCursor == null) {
            return -1.0f;
        }
        if (editTextBoldCursor.getLayout() != null) {
            return editTextBoldCursor.getLayout().getHeight();
        }
        return 0.0f;
    }

    public Drawable s() {
        ChatActivityEnterView chatActivityEnterView = ((ji.m) this.d).b.a;
        long j3 = chatActivityEnterView.n6;
        if (j3 == 0) {
            return null;
        }
        if (chatActivityEnterView.f6 != j3) {
            chatActivityEnterView.f6 = j3;
            TLRPC.TL_availableEffect Z0 = np.s1(chatActivityEnterView.R).Z0(chatActivityEnterView.n6);
            chatActivityEnterView.g6 = Z0 != null ? j6.g(Z0.emoticon) : null;
        }
        return chatActivityEnterView.g6;
    }

    public boolean t(RectF rectF, boolean z10) {
        char c10;
        int[] iArr = (int[]) this.b;
        int[] iArr2 = (int[]) this.a;
        ji.m mVar = (ji.m) this.d;
        if (mVar.K != null) {
            ChatActivityEnterView chatActivityEnterView = mVar.b.a;
            st0 st0Var = chatActivityEnterView.U1;
            RectF rectF2 = chatActivityEnterView.A4;
            if (st0Var != null && chatActivityEnterView.getWidth() > 0) {
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr3);
                st0Var.getLocationInWindow(iArr4);
                float f10 = iArr3[0] - iArr4[0];
                float f11 = iArr3[1] - iArr4[1];
                if (z10) {
                    rectF.set(f10 + 0.0f, 0.0f, (f10 + chatActivityEnterView.getWidth()) - 0.0f, f11);
                    if (rectF.width() > g0.L(80.0f)) {
                        c10 = 0;
                    }
                } else {
                    c10 = 0;
                    float width = (chatActivityEnterView.getWidth() + f10) - g0.L(64.0f);
                    if (chatActivityEnterView.w2 != null && !rectF2.isEmpty() && chatActivityEnterView.w2.getVisibility() == 0) {
                        chatActivityEnterView.w2.getLocationInWindow(new int[2]);
                        width = ((r6[0] - iArr4[0]) + rectF2.left) - g0.L(8.0f);
                    }
                    rectF.set(f10, 0.0f, width, f11);
                    if (rectF.width() <= g0.L(80.0f)) {
                        return false;
                    }
                }
                mVar.K.getLocationInWindow(iArr2);
                ((ViewGroup) this.c).getLocationInWindow(iArr);
                rectF.offset(iArr[c10] - iArr2[c10], iArr[1] - iArr2[1]);
                return true;
            }
        }
        return false;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public float v() {
        xe xeVar = ((ji.m) this.d).b.a.F0;
        return xeVar != null ? xeVar.getTextSize() : g0.L(18.0f);
    }

    public boolean w() {
        ((ji.m) this.d).getClass();
        return DictationAsr.B() && DictationAsr.C().length > 0;
    }

    @Override // c4.m
    public /* synthetic */ c4.d x(int i7, int i10, byte[] bArr) {
        return a8.p0.a(this, bArr, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        throw new java.lang.Exception(r.b.k("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(int i7, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = m71.A0.matcher(trim);
            int i10 = 0;
            while (true) {
                if (!matcher.find()) {
                    break;
                }
                if (matcher.group(0).indexOf(48) == 40) {
                    i10++;
                } else {
                    i10--;
                    if (i10 == 0) {
                        y(i7, trim.substring(1, matcher.start()), hashMap);
                        trim = trim.substring(matcher.end()).trim();
                        if (TextUtils.isEmpty(trim)) {
                            return;
                        }
                    }
                }
            }
        }
        int i11 = 0;
        while (true) {
            String[] strArr = (String[]) this.d;
            if (i11 < strArr.length) {
                String str2 = strArr[i11];
                Locale locale = Locale.US;
                Matcher matcher2 = Pattern.compile("(?x)([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\[([^\\]]+?)\\])?\\s*" + Pattern.quote(str2) + "(.*)$").matcher(trim);
                if (matcher2.find()) {
                    y(i7 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        y(i7, group, hashMap);
                        return;
                    }
                }
                i11++;
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
                            y(i7 - 1, matcher3.group(2), hashMap);
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
                                    j(matcher6.group(3), matcher6.group(2).split(","));
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
                                    y(i7, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            y(i7 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i12 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.c;
                            if (i12 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    l(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i12];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i13 = i7 - 1;
                                z(matcher9.group(1), hashMap, zArr, i13);
                                if (zArr[0]) {
                                    throw new Exception(e2.l("Premature left-side return of ", str5, " in ", trim));
                                }
                                z(matcher9.group(2), hashMap, zArr, i13);
                                if (zArr[0]) {
                                    throw new Exception(e2.l("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i12++;
                        }
                    }
                }
            }
        }
    }

    public void z(String str, HashMap hashMap, boolean[] zArr, int i7) {
        if (i7 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = m71.y0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = m71.z0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        y(i7, trim, hashMap);
    }

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
        hashMap.putAll(F(bufferedReader));
        b1 b1Var = (b1) hashMap.get("content-type");
        String str = b1Var == null ? null : (String) b1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            a1 a1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (a1Var != null) {
                        a1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(a1Var);
                        b1 b1Var2 = (b1) a1Var.a.get("content-location");
                        hashMap2.put(b1Var2 == null ? null : b1Var2.a, a1Var);
                    }
                    a1Var = new a1();
                    a1Var.b = (File) this.a;
                    a1Var.a.putAll(F(bufferedReader));
                    a1Var.c = jArr[0];
                }
            }
            if (a1Var != null && a1Var.c != 0 && a1Var.d != 0) {
                arrayList.add(a1Var);
                b1 b1Var3 = (b1) a1Var.a.get("content-location");
                hashMap2.put(b1Var3 != null ? b1Var3.a : null, a1Var);
            }
        }
        bufferedReader.close();
    }

    public e(int i7) {
        switch (i7) {
            case 1:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 2:
                this.a = new x();
                this.b = new x();
                this.c = new f4.a();
                break;
            case 7:
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

    public e(String str) {
        this.a = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public e(s1 s1Var, i2.i iVar, q qVar, i2.i iVar2) {
        Object obj;
        if (s1Var != null) {
            obj = i0.q(s1Var);
        } else {
            h9.g0 g0Var = i0.b;
            obj = s1.e;
        }
        this.a = obj;
        this.b = iVar;
        this.c = qVar;
        this.d = iVar2;
    }

    public e(ns nsVar, is isVar) {
        k kVar = new k();
        kVar.a = new int[16];
        this.c = kVar;
        this.a = nsVar;
        this.b = isVar;
    }

    @Override // c4.m
    public /* synthetic */ void reset() {
    }
}
