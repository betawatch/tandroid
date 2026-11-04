package za;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.j0;
import androidx.fragment.app.p0;
import b8.ib;
import db.x0;
import g9.i0;
import g9.s1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.p1;
import l1.b0;
import l1.m0;
import l1.y0;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.cs;
import org.telegram.messenger.ds;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.ge;
import org.telegram.ui.tx0;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.c1;
import org.telegram.ui.wm;
import org.telegram.ui.zx0;
import vg.v0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p implements fb.b, ds, zx0 {
    public static p e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static void e(String str, String str2, HashMap hashMap) {
        c1 c1Var = new c1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i3 = 0; i3 < split.length; i3++) {
            String trim = split[i3].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i3 == 0 || indexOf < 0) {
                    c1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = com.google.android.recaptcha.internal.a.j(trim3, 1, 1);
                    }
                    c1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), c1Var);
    }

    public static synchronized p r() {
        p pVar;
        synchronized (p.class) {
            try {
                if (e == null) {
                    e = new p(0);
                }
                pVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    public static void z(long j10, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hashMap.remove(arrayList.get(i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:25:0x0064, B:29:0x0074), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v5, types: [fe.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(hd.c cVar) {
        y0 y0Var;
        int i3;
        fe.d dVar;
        p pVar;
        fe.a aVar;
        Throwable th2;
        p pVar2;
        try {
            if (cVar instanceof y0) {
                y0Var = (y0) cVar;
                int i10 = y0Var.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    y0Var.e = i10 - TLObject.FLAG_31;
                    Object obj = y0Var.c;
                    gd.a aVar2 = gd.a.a;
                    i3 = y0Var.e;
                    dd.k kVar = dd.k.a;
                    if (i3 != 0) {
                        ib.b(obj);
                        if (((wd.t) this.b).A()) {
                            return kVar;
                        }
                        dVar = (fe.d) this.a;
                        y0Var.a = this;
                        y0Var.b = dVar;
                        y0Var.e = 1;
                        if (dVar.d(y0Var) != aVar2) {
                            pVar = this;
                        }
                        return aVar2;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = y0Var.b;
                        pVar2 = y0Var.a;
                        try {
                            ib.b(obj);
                            ((wd.t) pVar2.b).C(kVar);
                            ((fe.d) aVar).f(null);
                            return kVar;
                        } catch (Throwable th3) {
                            th2 = th3;
                            ((fe.d) aVar).f(null);
                            throw th2;
                        }
                    }
                    ?? r22 = y0Var.b;
                    pVar = y0Var.a;
                    ib.b(obj);
                    dVar = r22;
                    if (!((wd.t) pVar.b).A()) {
                        dVar.f(null);
                        return kVar;
                    }
                    y0Var.a = pVar;
                    y0Var.b = dVar;
                    y0Var.e = 2;
                    if (pVar.k(y0Var) != aVar2) {
                        aVar = dVar;
                        pVar2 = pVar;
                        ((wd.t) pVar2.b).C(kVar);
                        ((fe.d) aVar).f(null);
                        return kVar;
                    }
                    return aVar2;
                }
            }
            if (!((wd.t) pVar.b).A()) {
            }
        } catch (Throwable th4) {
            aVar = dVar;
            th2 = th4;
            ((fe.d) aVar).f(null);
            throw th2;
        }
        y0Var = new y0(this, cVar);
        Object obj2 = y0Var.c;
        gd.a aVar22 = gd.a.a;
        i3 = y0Var.e;
        dd.k kVar2 = dd.k.a;
        if (i3 != 0) {
        }
    }

    public o2.b B(List list) {
        o2.b bVar;
        HashMap hashMap = (HashMap) this.c;
        ArrayList h = h(list);
        if (h.size() < 2) {
            return (o2.b) g9.o.m(h, null);
        }
        Collections.sort(h, new a3.u(28));
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i10 = ((o2.b) h.get(0)).c;
        int i11 = 0;
        while (true) {
            if (i11 >= h.size()) {
                break;
            }
            o2.b bVar2 = (o2.b) h.get(i11);
            if (i10 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (o2.b) h.get(0);
            }
        }
        o2.b bVar3 = (o2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = h.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < subList.size(); i13++) {
            i12 += ((o2.b) subList.get(i13)).d;
        }
        int nextInt = ((Random) this.d).nextInt(i12);
        int i14 = 0;
        while (true) {
            if (i3 >= subList.size()) {
                bVar = (o2.b) g9.o.n(subList);
                break;
            }
            bVar = (o2.b) subList.get(i3);
            i14 += bVar.d;
            if (nextInt < i14) {
                break;
            }
            i3++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    public Bundle C(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    @Override // org.telegram.messenger.ds
    public void a() {
        a0.k kVar = (a0.k) this.c;
        if (((cs) this.b) == null) {
            return;
        }
        p pVar = (p) this.d;
        if (pVar != null) {
            pVar.a();
            this.d = null;
        }
        int i3 = kVar.b;
        for (int i10 = 0; i10 < i3; i10++) {
            hs hsVar = (hs) this.a;
            cs csVar = (cs) this.b;
            if (i10 < 0) {
                kVar.getClass();
            } else if (i10 < kVar.b) {
                hsVar.n(csVar, kVar.a[i10]);
            }
            StringBuilder m10 = p1.m(i10, "Index ", " must be in 0..");
            m10.append(kVar.b - 1);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        kVar.b = 0;
        this.a = null;
        this.b = null;
    }

    public p b(int i3) {
        if (((cs) this.b) == null) {
            return this;
        }
        a0.k kVar = (a0.k) this.c;
        int i10 = kVar.b + 1;
        int[] iArr = kVar.a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            kVar.a = copyOf;
        }
        int[] iArr2 = kVar.a;
        int i11 = kVar.b;
        iArr2[i11] = i3;
        kVar.b = i11 + 1;
        ((hs) this.a).b((cs) this.b, i3);
        return this;
    }

    public void c(androidx.fragment.app.s sVar) {
        if (((ArrayList) this.a).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(sVar);
        }
        sVar.w = true;
    }

    public p d(int i3) {
        if (((cs) this.b) == null) {
            return this;
        }
        if (((p) this.d) == null) {
            this.d = new p(hs.e(), (cs) this.b);
        }
        ((p) this.d).b(i3);
        return this;
    }

    @Override // org.telegram.ui.zx0
    public void f() {
        g0.i3(new tx0((wm) this.a, (Activity) this.b, (e6) this.c, (zi) this.d, 2), 200L);
    }

    @Override // org.telegram.ui.zx0
    public void g() {
        g0.i3(new ge((wm) this.a, (zi) this.d, 8), 200L);
    }

    @Override // cd.a
    public Object get() {
        return new db.n((n9.h) ((e.a) this.a).a, (gb.l) ((fb.c) this.b).get(), (fd.h) ((fb.c) this.c).get(), (x0) ((fb.c) this.d).get());
    }

    public ArrayList h(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        z(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        z(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            o2.b bVar = (o2.b) list.get(i3);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.zx0
    public void i() {
        wm wmVar = (wm) this.a;
        wmVar.showDialog(new v0((d2) wmVar, 3, true));
    }

    public void j(String str, String[] strArr) {
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(hd.c cVar) {
        l1.h hVar;
        int i3;
        p pVar;
        l1.c cVar2;
        b0 b0Var = (b0) this.d;
        if (cVar instanceof l1.h) {
            hVar = (l1.h) cVar;
            int i10 = hVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                hVar.d = i10 - TLObject.FLAG_31;
                Object obj = hVar.b;
                gd.a aVar = gd.a.a;
                i3 = hVar.d;
                if (i3 != 0) {
                    ib.b(obj);
                    List list = (List) this.c;
                    if (list == null || list.isEmpty()) {
                        hVar.a = this;
                        hVar.d = 1;
                        obj = b0.f(b0Var, false, hVar);
                        if (obj != aVar) {
                            pVar = this;
                            cVar2 = (l1.c) obj;
                        }
                    } else {
                        m0 g7 = b0Var.g();
                        l1.k kVar = new l1.k(b0Var, this, null);
                        hVar.a = this;
                        hVar.d = 2;
                        obj = g7.b(kVar, hVar);
                        if (obj != aVar) {
                            pVar = this;
                            cVar2 = (l1.c) obj;
                        }
                    }
                    return aVar;
                }
                if (i3 == 1) {
                    pVar = hVar.a;
                    ib.b(obj);
                    cVar2 = (l1.c) obj;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = hVar.a;
                    ib.b(obj);
                    cVar2 = (l1.c) obj;
                }
                ((b0) pVar.d).h.t2(cVar2);
                return dd.k.a;
            }
        }
        hVar = new l1.h(this, cVar);
        Object obj2 = hVar.b;
        gd.a aVar2 = gd.a.a;
        i3 = hVar.d;
        if (i3 != 0) {
        }
        ((b0) pVar.d).h.t2(cVar2);
        return dd.k.a;
    }

    public String l(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.a);
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

    public androidx.fragment.app.s m(String str) {
        p0 p0Var = (p0) ((HashMap) this.b).get(str);
        if (p0Var != null) {
            return p0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.s n(String str) {
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.M.c.n(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList p() {
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

    public List q() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public boolean s(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean t(Context context) {
        if (((Boolean) this.b) == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.b).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        throw new java.lang.Exception(t4.c.f("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(int i3, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = d71.A0.matcher(trim);
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
                        u(i3, trim.substring(1, matcher.start()), hashMap);
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
                    u(i3 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        u(i3, group, hashMap);
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
                            u(i3 - 1, matcher3.group(2), hashMap);
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
                                ArrayList arrayList = (ArrayList) this.b;
                                new HashMap();
                                Matcher matcher5 = Pattern.compile("(?:var\\s+)?" + Pattern.quote(group2) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher((String) this.a);
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
                                    u(i3, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            u(i3 - 1, matcher7.group(2), hashMap);
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
                                int i13 = i3 - 1;
                                v(matcher9.group(1), hashMap, zArr, i13);
                                if (zArr[0]) {
                                    throw new Exception(com.google.android.recaptcha.internal.a.k("Premature left-side return of ", str5, " in ", trim));
                                }
                                v(matcher9.group(2), hashMap, zArr, i13);
                                if (zArr[0]) {
                                    throw new Exception(com.google.android.recaptcha.internal.a.k("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i12++;
                        }
                    }
                }
            }
        }
    }

    public void v(String str, HashMap hashMap, boolean[] zArr, int i3) {
        if (i3 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = d71.y0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = d71.z0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        u(i3, trim, hashMap);
    }

    public void w(p0 p0Var) {
        androidx.fragment.app.s sVar = p0Var.c;
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

    public void x(p0 p0Var) {
        HashMap hashMap = (HashMap) this.b;
        androidx.fragment.app.s sVar = p0Var.c;
        if (sVar.T) {
            ((androidx.fragment.app.m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public HashMap y(BufferedReader bufferedReader) {
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
                            sb2 = com.google.android.recaptcha.internal.a.l(trim3);
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

    public p(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(y(bufferedReader));
        c1 c1Var = (c1) hashMap.get("content-type");
        String str = c1Var == null ? null : (String) c1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            b1 b1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (b1Var != null) {
                        b1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(b1Var);
                        c1 c1Var2 = (c1) b1Var.a.get("content-location");
                        hashMap2.put(c1Var2 == null ? null : c1Var2.a, b1Var);
                    }
                    b1Var = new b1();
                    b1Var.b = (File) this.a;
                    b1Var.a.putAll(y(bufferedReader));
                    b1Var.c = jArr[0];
                }
            }
            if (b1Var != null && b1Var.c != 0 && b1Var.d != 0) {
                arrayList.add(b1Var);
                c1 c1Var3 = (c1) b1Var.a.get("content-location");
                hashMap2.put(c1Var3 != null ? c1Var3.a : null, b1Var);
            }
        }
        bufferedReader.close();
    }

    public p(int i3) {
        switch (i3) {
            case 1:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 6:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = new ArrayDeque();
                break;
        }
    }

    public p(String str) {
        this.b = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.a = str;
    }

    public p(s1 s1Var, h2.i iVar, p4.q qVar, h2.i iVar2) {
        Object obj;
        if (s1Var != null) {
            obj = i0.q(s1Var);
        } else {
            g9.g0 g0Var = i0.b;
            obj = s1.e;
        }
        this.a = obj;
        this.b = iVar;
        this.c = qVar;
        this.d = iVar2;
    }

    public p(hs hsVar, cs csVar) {
        a0.k kVar = new a0.k();
        kVar.a = new int[16];
        this.c = kVar;
        this.a = hsVar;
        this.b = csVar;
    }
}
