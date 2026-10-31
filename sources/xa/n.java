package xa;

import ag.e3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import b2.b1;
import b2.y0;
import c3.i0;
import com.google.android.gms.tasks.Task;
import e2.l0;
import e9.n0;
import e9.x1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
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
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import kg.i1;
import l.b0;
import m4.f0;
import m4.l1;
import m4.p1;
import m4.q1;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.us;
import org.telegram.messenger.vs;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.m81;
import org.telegram.ui.rz0;
import org.telegram.ui.ue;
import org.telegram.ui.un;
import org.telegram.ui.web.e1;
import org.telegram.ui.web.f1;
import org.telegram.ui.xz0;
import v7.t6;
import z9.t0;
import z9.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n implements z3.m, vs, xz0, n5.b {
    public static n e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static synchronized n D() {
        n nVar;
        synchronized (n.class) {
            try {
                if (e == null) {
                    e = new n(0);
                }
                nVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    public static void V(long j10, HashMap hashMap) {
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

    public static void j(String str, String str2, HashMap hashMap) {
        f1 f1Var = new f1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 == 0 || indexOf < 0) {
                    f1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = i0.m(1, 1, trim3);
                    }
                    f1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), f1Var);
    }

    public n0 A() {
        n0 u10;
        synchronized (this.a) {
            u10 = n0.u(((a0.f) this.b).values());
        }
        return u10;
    }

    public m4.w B(Object obj) {
        m4.w wVar;
        synchronized (this.a) {
            wVar = (m4.w) ((a0.f) this.b).get(obj);
        }
        return wVar;
    }

    public List C() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public y0 E(m4.w wVar) {
        synchronized (this.a) {
            try {
                return ((m4.i) ((a0.f) this.c).get(wVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l1 F(m4.w wVar) {
        synchronized (this.a) {
            try {
                return ((m4.i) ((a0.f) this.c).get(wVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.v G(m4.w wVar) {
        m4.i iVar;
        synchronized (this.a) {
            iVar = (m4.i) ((a0.f) this.c).get(wVar);
        }
        if (iVar != null) {
            return iVar.b;
        }
        return null;
    }

    public boolean H(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean I(Context context) {
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
    
        throw new java.lang.Exception(sc.e.h("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void J(int i10, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = m81.z0.matcher(trim);
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
                        J(i10, trim.substring(1, matcher.start()), hashMap);
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
                    J(i10 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        J(i10, group, hashMap);
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
                            J(i10 - 1, matcher3.group(2), hashMap);
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
                                    p(matcher6.group(3), matcher6.group(2).split(","));
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
                                    J(i10, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            J(i10 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i13 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.c;
                            if (i13 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    q(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i13];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i14 = i10 - 1;
                                K(matcher9.group(1), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(i0.n("Premature left-side return of ", str5, " in ", trim));
                                }
                                K(matcher9.group(2), hashMap, zArr, i14);
                                if (zArr[0]) {
                                    throw new Exception(i0.n("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i13++;
                        }
                    }
                }
            }
        }
    }

    public void K(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = m81.x0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = m81.y0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        J(i10, trim, hashMap);
    }

    public boolean L(m4.w wVar) {
        boolean z10;
        synchronized (this.a) {
            z10 = ((a0.f) this.c).get(wVar) != null;
        }
        return z10;
    }

    public boolean M(m4.w wVar, int i10) {
        m4.i iVar;
        synchronized (this.a) {
            iVar = (m4.i) ((a0.f) this.c).get(wVar);
        }
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        return iVar != null && iVar.e.a(i10) && f0Var != null && f0Var.t.s().a(i10);
    }

    public boolean N(m4.w wVar, int i10) {
        m4.i iVar;
        synchronized (this.a) {
            iVar = (m4.i) ((a0.f) this.c).get(wVar);
        }
        if (iVar != null) {
            q1 q1Var = iVar.d;
            q1Var.getClass();
            t6.e("Use contains(Command) for custom command", i10 != 0);
            Iterator<E> it = q1Var.a.iterator();
            while (it.hasNext()) {
                if (((p1) it.next()).a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean O(m4.w wVar, p1 p1Var) {
        m4.i iVar;
        synchronized (this.a) {
            iVar = (m4.i) ((a0.f) this.c).get(wVar);
        }
        if (iVar == null) {
            return false;
        }
        e9.y0 y0Var = iVar.d.a;
        p1Var.getClass();
        return y0Var.contains(p1Var) || m4.e.j(p1Var.b);
    }

    public void P(p0 p0Var) {
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

    public void Q(p0 p0Var) {
        HashMap hashMap = (HashMap) this.b;
        androidx.fragment.app.s sVar = p0Var.c;
        if (sVar.S) {
            ((m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean R(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(v(aVar), new l.s((Context) this.b, (l0.a) menuItem));
    }

    public boolean S(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        k.e v = v(aVar);
        a0.l lVar = (a0.l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.b, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(v, menu2);
    }

    public HashMap T(BufferedReader bufferedReader) {
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
                            sb2 = a1.g.t(trim3);
                            str = trim2;
                        } else {
                            j(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            j(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            j(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void U(m4.w wVar) {
        synchronized (this.a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.c).remove(wVar);
                if (iVar == null) {
                    return;
                }
                ((a0.f) this.b).remove(iVar.a);
                iVar.b.g();
                f0 f0Var = (f0) ((WeakReference) this.d).get();
                if (f0Var == null || f0Var.j()) {
                    return;
                }
                l0.W(f0Var.l, new m4.f(f0Var, wVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m2.b W(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.c;
        ArrayList k10 = k(list);
        if (k10.size() < 2) {
            return (m2.b) e9.s.l(k10, null);
        }
        Collections.sort(k10, new a4.d(10));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) k10.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= k10.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) k10.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (m2.b) k10.get(0);
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = k10.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((m2.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.d).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (m2.b) e9.s.m(subList);
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

    public Bundle X(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public Task Y(Callable callable) {
        Task continueWith;
        synchronized (this.c) {
            continueWith = ((Task) this.b).continueWith((Executor) this.a, new r2.y(callable, 16));
            this.b = continueWith.continueWith((Executor) this.a, new kb.a(26));
        }
        return continueWith;
    }

    public Task Z(Callable callable) {
        Task continueWithTask;
        synchronized (this.c) {
            continueWithTask = ((Task) this.b).continueWithTask((Executor) this.a, new r2.y(callable, 16));
            this.b = continueWithTask.continueWith((Executor) this.a, new kb.a(26));
        }
        return continueWithTask;
    }

    @Override // org.telegram.messenger.vs
    public void a() {
        a0.k kVar = (a0.k) this.c;
        if (((us) this.b) == null) {
            return;
        }
        n nVar = (n) this.d;
        if (nVar != null) {
            nVar.a();
            this.d = null;
        }
        int i10 = kVar.b;
        for (int i11 = 0; i11 < i10; i11++) {
            zs zsVar = (zs) this.a;
            us usVar = (us) this.b;
            if (i11 < 0) {
                kVar.getClass();
            } else if (i11 < kVar.b) {
                zsVar.n(usVar, kVar.a[i11]);
            }
            StringBuilder l4 = i0.a.l(i11, "Index ", " must be in 0..");
            l4.append(kVar.b - 1);
            throw new IndexOutOfBoundsException(l4.toString());
        }
        kVar.b = 0;
        this.a = null;
        this.b = null;
    }

    @Override // org.telegram.ui.xz0
    public void b() {
        org.telegram.messenger.i0.h3(new rz0((un) this.a, (Activity) this.b, (p6) this.c, (jj) this.d, 2), 200L);
    }

    @Override // org.telegram.ui.xz0
    public void c() {
        org.telegram.messenger.i0.h3(new ue((un) this.a, (jj) this.d, 8), 200L);
    }

    @Override // org.telegram.ui.xz0
    public void d() {
        un unVar = (un) this.a;
        unVar.showDialog(new i1((k2) unVar, 3, true));
    }

    public n e(int i10) {
        if (((us) this.b) == null) {
            return this;
        }
        a0.k kVar = (a0.k) this.c;
        int i11 = kVar.b + 1;
        int[] iArr = kVar.a;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i11, (iArr.length * 3) / 2));
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            kVar.a = copyOf;
        }
        int[] iArr2 = kVar.a;
        int i12 = kVar.b;
        iArr2[i12] = i10;
        kVar.b = i12 + 1;
        ((zs) this.a).b((us) this.b, i10);
        return this;
    }

    public void f(Object obj, m4.w wVar, q1 q1Var, b1 b1Var) {
        synchronized (this.a) {
            try {
                m4.w B = B(obj);
                if (B == null) {
                    ((a0.f) this.b).put(obj, wVar);
                    a0.f fVar = (a0.f) this.c;
                    com.google.android.gms.common.api.internal.v vVar = new com.google.android.gms.common.api.internal.v();
                    vVar.c = new Object();
                    vVar.d = new a0.f(0);
                    fVar.put(wVar, new m4.i(obj, vVar, q1Var, b1Var));
                } else {
                    m4.i iVar = (m4.i) ((a0.f) this.c).get(B);
                    iVar.getClass();
                    iVar.d = q1Var;
                    iVar.e = b1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(androidx.fragment.app.s sVar) {
        if (((ArrayList) this.a).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(sVar);
        }
        sVar.w = true;
    }

    @Override // zc.a
    public Object get() {
        return new ji.f((Executor) ((zc.a) this.a).get(), (s5.d) ((zc.a) this.b).get(), (q5.d) ((q5.d) this.c).get(), (t5.c) ((zc.a) this.d).get(), 13);
    }

    public n h(int i10) {
        if (((us) this.b) == null) {
            return this;
        }
        if (((n) this.d) == null) {
            this.d = new n(zs.e(), (us) this.b);
        }
        ((n) this.d).e(i10);
        return this;
    }

    public void i(m4.w wVar, int i10, m4.h hVar) {
        synchronized (this.a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.c).get(wVar);
                if (iVar != null) {
                    b1 b1Var = iVar.g;
                    b1Var.getClass();
                    b2.u uVar = new b2.u();
                    uVar.c(b1Var.a);
                    uVar.b(i10);
                    iVar.g = new b1(uVar.d());
                    iVar.c.add(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList k(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        V(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        V(elapsedRealtime, hashMap2);
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
    public /* synthetic */ z3.d l(int i10, int i11, byte[] bArr) {
        return sc.e.a(this, bArr, i11);
    }

    public t0 m() {
        String str = ((String) this.a) == null ? " processName" : "";
        if (((Integer) this.c) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.d) == null) {
            str = sc.e.A(str, " importance");
        }
        if (((Boolean) this.b) == null) {
            str = sc.e.A(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0(((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (String) this.a, ((Boolean) this.b).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 n() {
        String str = ((Integer) this.c) == null ? " platform" : "";
        if (((String) this.a) == null) {
            str = str.concat(" version");
        }
        if (((String) this.d) == null) {
            str = sc.e.A(str, " buildVersion");
        }
        if (((Boolean) this.b) == null) {
            str = sc.e.A(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.c).intValue(), (String) this.a, (String) this.d, ((Boolean) this.b).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // z3.m
    public int o() {
        return 2;
    }

    public void p(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            K(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String q(String str) {
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
                p(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            f8.g(e7, true);
        }
        return TextUtils.join("", arrayList);
    }

    public androidx.fragment.app.s r(String str) {
        p0 p0Var = (p0) ((HashMap) this.b).get(str);
        if (p0Var != null) {
            return p0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.s s(String str) {
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.L.c.s(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public void t(m4.i iVar) {
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (f0Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            m4.h hVar = (m4.h) iVar.c.poll();
            if (hVar == null) {
                iVar.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            m4.i iVar2 = iVar;
            l0.W(f0Var.l, new k2.u(f0Var, B(iVar.a), new e3(this, hVar, atomicBoolean2, iVar2, atomicBoolean, 3)));
            atomicBoolean2.set(false);
            iVar = iVar2;
        }
    }

    public void u(final m4.w wVar) {
        synchronized (this.a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.c).get(wVar);
                if (iVar == null) {
                    return;
                }
                final b1 b1Var = iVar.g;
                iVar.g = b1.b;
                iVar.c.add(new m4.h(wVar, b1Var) { // from class: m4.g
                    public final /* synthetic */ w b;

                    @Override // m4.h
                    public final j9.y run() {
                        f0 f0Var = (f0) ((WeakReference) xa.n.this.d).get();
                        if (f0Var != null) {
                            f0Var.p(this.b);
                        }
                        return j9.w.b;
                    }
                });
                if (iVar.f) {
                    return;
                }
                iVar.f = true;
                t(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e v(k.a aVar) {
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

    public ArrayList w() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList x() {
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

    public b1 y(m4.w wVar) {
        synchronized (this.a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.c).get(wVar);
                if (iVar == null) {
                    return null;
                }
                return iVar.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z3.m
    public void z(byte[] bArr, int i10, int i11, z3.l lVar, e2.j jVar) {
        d2.b bVar;
        int i12;
        int i13;
        int i14;
        int D;
        c4.a aVar = (c4.a) this.c;
        e2.x xVar = (e2.x) this.b;
        e2.x xVar2 = (e2.x) this.a;
        xVar2.L(i10 + i11, bArr);
        xVar2.N(i10);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (l0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.c, xVar.a);
        }
        int i15 = 0;
        aVar.d = 0;
        int[] iArr = aVar.b;
        e2.x xVar3 = aVar.a;
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
                                    iArr[A2] = l0.i((int) ((A5 * 1.772d) + A3), 0, zs.e4) | (xVar2.A() << 24) | (l0.i((int) ((1.402d * A4) + A3), 0, zs.e4) << 16) | (l0.i((int) ((A3 - (0.34414d * A5)) - (A4 * 0.71414d)), 0, zs.e4) << 8);
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

    public n(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(T(bufferedReader));
        f1 f1Var = (f1) hashMap.get("content-type");
        String str = f1Var == null ? null : (String) f1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            e1 e1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (e1Var != null) {
                        e1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(e1Var);
                        f1 f1Var2 = (f1) e1Var.a.get("content-location");
                        hashMap2.put(f1Var2 == null ? null : f1Var2.a, e1Var);
                    }
                    e1Var = new e1();
                    e1Var.b = (File) this.a;
                    e1Var.a.putAll(T(bufferedReader));
                    e1Var.c = jArr[0];
                }
            }
            if (e1Var != null && e1Var.c != 0 && e1Var.d != 0) {
                arrayList.add(e1Var);
                f1 f1Var3 = (f1) e1Var.a.get("content-location");
                hashMap2.put(f1Var3 != null ? f1Var3.a : null, e1Var);
            }
        }
        bufferedReader.close();
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    public n(f0 f0Var) {
        this.b = new a0.f(0);
        this.c = new a0.f(0);
        this.a = new Object();
        this.d = new WeakReference(f0Var);
    }

    public n(int i10) {
        switch (i10) {
            case 1:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 2:
                this.a = new e2.x();
                this.b = new e2.x();
                this.c = new c4.a();
                break;
            case 3:
            case 4:
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = new ArrayDeque();
                break;
            case 5:
                Random random = new Random();
                this.c = new HashMap();
                this.d = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
        }
    }

    public n(String str) {
        this.b = new ArrayList();
        this.c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.a = str;
    }

    public n(x1 x1Var, f2.k kVar, n4.q qVar, f2.k kVar2) {
        Object obj;
        if (x1Var != null) {
            obj = n0.u(x1Var);
        } else {
            e9.l0 l0Var = n0.b;
            obj = x1.e;
        }
        this.a = obj;
        this.b = kVar;
        this.c = qVar;
        this.d = kVar2;
    }

    public n(zs zsVar, us usVar) {
        a0.k kVar = new a0.k();
        kVar.a = new int[16];
        this.c = kVar;
        this.a = zsVar;
        this.b = usVar;
    }
}
