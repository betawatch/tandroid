package org.telegram.utils.twidget;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.rk;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.wd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.ex0;
import org.telegram.ui.web.v1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class p {
    public static boolean i;
    public static boolean j;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final org.telegram.ui.Components.voip.m0 e = new org.telegram.ui.Components.voip.m0(27);
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] k = new boolean[4];
    public static final HashMap l = new HashMap();
    public static final t7.u m = new t7.u(16);

    public static String A(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static void B() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : a.values()) {
            if (mVar.u != null && mVar.y == 0 && !g.contains(mVar)) {
                arrayList.add(mVar);
            }
        }
        Collections.sort(arrayList, new ex0(10));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w wVar = ((m) arrayList.get(i10)).u;
            if (i10 >= 4) {
                wVar.p();
            }
            if (i10 >= 12 && wVar.f == null) {
                wVar.g = null;
            }
        }
    }

    public static void C() {
        w wVar;
        HashMap hashMap = new HashMap();
        for (m mVar : a.values()) {
            if (mVar.l != 0 && !mVar.k && mVar.y != 0 && !j && (wVar = mVar.u) != null && wVar.f != null && wVar.A) {
                hashMap.put(mVar.b + "/" + mVar.l, mVar);
            }
        }
        HashMap hashMap2 = l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                o oVar = (o) entry.getValue();
                org.telegram.messenger.i0.r(oVar.f);
                if (oVar.e != 0) {
                    ConnectionsManager.getInstance(oVar.a).cancelRequest(oVar.e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                m mVar2 = (m) entry2.getValue();
                o oVar2 = new o(mVar2.b, mVar2.l);
                oVar2.c = mVar2.r;
                hashMap2.put((String) entry2.getKey(), oVar2);
                org.telegram.messenger.i0.h3(oVar2.f, oVar2.d * 1000);
            }
        }
    }

    public static boolean D(m mVar) {
        return mVar.i && !mVar.k && ((org.telegram.messenger.j0) vp.r1(mVar.b).y7.j0.b).c;
    }

    public static void a(m mVar) {
        org.telegram.messenger.i0.r(mVar.H);
        if (g.remove(mVar)) {
            B();
            o();
        }
    }

    public static void b() {
        ArrayList arrayList = h;
        if (arrayList.isEmpty() || !x()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.i0.g3((Runnable) obj);
        }
    }

    public static void c(m mVar, String str, String str2) {
        if (TextUtils.equals(mVar.p, str) && TextUtils.equals(mVar.q, str2)) {
            return;
        }
        mVar.p = str;
        mVar.q = str2;
        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar.s;
        if (tL_messageMediaWidget != null) {
            tL_messageMediaWidget.chat_data = str;
            tL_messageMediaWidget.public_data = str2;
            tL_messageMediaWidget.public_data_hash = mVar.r;
        }
        w wVar = mVar.u;
        if (wVar != null) {
            wVar.j(g(str, str2));
        }
    }

    public static int d(String str, w wVar, int i10) {
        int i11;
        m mVar = n(str) ? (m) a.get(str) : null;
        int i12 = 0;
        if (mVar == null) {
            return 0;
        }
        if (mVar.f > 0) {
            return org.telegram.messenger.i0.L(Math.max(50, Math.min(600, r1)));
        }
        int i13 = (wVar == null || Math.abs(wVar.k - i10) > 1) ? 0 : wVar.i;
        if (i13 > 0) {
            return Math.min(org.telegram.messenger.i0.L(600.0f), Math.max(org.telegram.messenger.i0.L(50.0f), i13));
        }
        n nVar = (n) b.get(mVar.a());
        if (nVar != null) {
            int f7 = f(i10);
            synchronized (nVar) {
                ArrayList arrayList = nVar.a;
                int size = arrayList.size();
                int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i11 = 0;
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - f7);
                    if (abs < i14) {
                        i11 = iArr[1];
                        i14 = abs;
                    }
                }
            }
            i12 = i11;
        }
        if (i12 <= 0) {
            i12 = zs.q2;
        }
        return org.telegram.messenger.i0.L(Math.max(50, Math.min(600, i12)));
    }

    public static String e(m mVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = mVar.h;
            boolean z11 = mVar.i;
            jSONObject.put("isCopy", z10);
            jSONObject.put("canQuery", z11);
            jSONObject.put("backgroundQuery", mVar.j);
            jSONObject.put("preview", mVar.k);
            jSONObject.put("wallet", D(mVar));
            Object obj = mVar.m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            TLRPC.User f7 = z11 ? d20.i(mVar.b).f() : null;
            if (f7 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", f7.id);
                if (!TextUtils.isEmpty(f7.first_name)) {
                    jSONObject2.put("firstName", f7.first_name);
                }
                if (!TextUtils.isEmpty(f7.last_name)) {
                    jSONObject2.put("lastName", f7.last_name);
                }
                String n10 = h20.n(f7);
                if (!TextUtils.isEmpty(n10)) {
                    jSONObject2.put("username", n10);
                }
                jSONObject2.put("isPremium", f7.premium);
                jSONObject.put("viewer", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static int f(int i10) {
        return Math.round(i10 / org.telegram.messenger.i0.p);
    }

    public static String g(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = str;
            if (str == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("chatData", obj);
            Object obj2 = str2;
            if (str2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("publicData", obj2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static m h(w wVar) {
        if (wVar == null) {
            return null;
        }
        return (m) a.get(wVar.a);
    }

    public static w i(String str) {
        String str2;
        m mVar = n(str) ? (m) a.get(str) : null;
        if (mVar == null) {
            return null;
        }
        synchronized (mVar) {
            try {
                if (mVar.u == null) {
                    if (mVar.t == null) {
                        mVar.t = m(mVar.g);
                    }
                    if (mVar.t == null) {
                        return null;
                    }
                    w wVar = new w(w0.b, mVar.a, mVar.t);
                    try {
                        str2 = cd.D0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    wVar.t = str2;
                    wVar.u = null;
                    String e7 = e(mVar);
                    if (e7 != null) {
                        wVar.w = e7;
                    }
                    wVar.j(g(mVar.p, mVar.q));
                    wVar.e = m;
                    mVar.u = wVar;
                }
                return mVar.u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        org.telegram.messenger.i0.r(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (m mVar : hashMap.values()) {
            JSONObject jSONObject = (JSONObject) c.get(mVar.a());
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("local") : null;
            String jSONObject2 = (optJSONObject == null || optJSONObject.length() == 0) ? "" : optJSONObject.toString();
            hs a02 = hs.a0(mVar.b);
            a02.a.c(new rk(mVar.d, 5, mVar.c, a02, jSONObject2));
        }
        hashMap.clear();
    }

    public static String k(String str, w wVar, int i10) {
        int[] iArr = null;
        m mVar = n(str) ? (m) a.get(str) : null;
        if (mVar == null) {
            return "none";
        }
        if (mVar.f > 0) {
            return "anchor " + mVar.f;
        }
        if (wVar != null && Math.abs(wVar.k - i10) <= 1 && wVar.i > 0) {
            return "frame";
        }
        n nVar = (n) b.get(mVar.a());
        if (nVar != null) {
            int f7 = f(i10);
            synchronized (nVar) {
                ArrayList arrayList = nVar.a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    int[] iArr2 = (int[]) obj;
                    if (iArr == null || Math.abs(iArr2[0] - f7) < Math.abs(iArr[0] - f7)) {
                        iArr = iArr2;
                    }
                }
            }
        }
        if (iArr == null || iArr[1] <= 0) {
            return "placeholder";
        }
        if (iArr[0] == f(i10)) {
            return "cache";
        }
        return "cache of width " + iArr[0];
    }

    public static n l(String str) {
        ConcurrentHashMap concurrentHashMap = b;
        n nVar = (n) concurrentHashMap.get(str);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n();
        n nVar3 = (n) concurrentHashMap.putIfAbsent(str, nVar2);
        return nVar3 == null ? nVar2 : nVar3;
    }

    public static String m(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        boolean z10 = bArr.length >= 2 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139;
        try {
            InputStream gZIPInputStream = z10 ? new GZIPInputStream(new ByteArrayInputStream(bArr)) : new InflaterInputStream(new ByteArrayInputStream(bArr));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 4);
                try {
                    byte[] bArr2 = new byte[TLObject.FLAG_13];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    if (v2.a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("widget payload: ");
                        sb2.append(z10 ? "gzip" : "zlib");
                        sb2.append(", ");
                        sb2.append(bArr.length);
                        sb2.append(" -> ");
                        sb2.append(byteArrayOutputStream.size());
                        sb2.append(" bytes");
                        f8.b(sb2.toString());
                    }
                    String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    return str;
                } finally {
                }
            } finally {
            }
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static boolean n(String str) {
        return str != null && str.startsWith("tg-widget:");
    }

    public static void o() {
        while (true) {
            ArrayList arrayList = g;
            if (arrayList.size() >= 3 || j) {
                return;
            }
            ArrayList arrayList2 = f;
            long j10 = Long.MAX_VALUE;
            m mVar = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                m mVar2 = (m) arrayList2.get(size);
                if (mVar2.A) {
                    long j11 = 9223372036854775806L;
                    for (m mVar3 : a.values()) {
                        if (mVar3.y != 0 && mVar3.b == mVar2.b && mVar3.c == mVar2.c) {
                            j11 = Math.min(j11, Math.abs(mVar3.d - mVar2.d));
                        }
                    }
                    if (j11 < j10) {
                        mVar = mVar2;
                        j10 = j11;
                    }
                }
            }
            if (mVar == null) {
                return;
            }
            arrayList2.remove(mVar);
            w wVar = mVar.u;
            if (wVar != null && !mVar.E && mVar.y <= 0) {
                String k10 = k(mVar.a, wVar, mVar.F);
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    wVar.n(mVar.F);
                    if (wVar.s == null) {
                        wVar.l(l0.a(null, mVar.G));
                    }
                    if (!wVar.o) {
                        arrayList.add(mVar);
                        y(mVar);
                        org.telegram.messenger.i0.h3(mVar.H, 4000L);
                    }
                }
            }
        }
    }

    public static gl0 p(ArrayList arrayList) {
        int size = arrayList.size();
        gl0 gl0Var = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            gl0 gl0Var2 = (gl0) obj;
            if (gl0Var == null || gl0Var2.c0 > gl0Var.c0) {
                gl0Var = gl0Var2;
            }
        }
        return gl0Var;
    }

    public static void q(boolean z10) {
        if (j == z10) {
            return;
        }
        j = z10;
        Iterator it = a.values().iterator();
        while (it.hasNext()) {
            w wVar = ((m) it.next()).u;
            if (wVar != null && wVar.p != z10) {
                wVar.p = z10;
                k0 k0Var = wVar.f;
                if (k0Var != null) {
                    k0Var.d(wVar.n && !z10);
                }
            }
        }
        if (z10) {
            j();
        } else {
            o();
        }
        C();
    }

    public static void r(w wVar) {
        m h10 = h(wVar);
        if (h10 == null) {
            return;
        }
        h10.y = Math.max(0, h10.y - 1);
        h10.z = System.currentTimeMillis();
        B();
        j();
        C();
    }

    public static void s(w wVar) {
        m h10 = h(wVar);
        if (h10 == null) {
            return;
        }
        h10.y++;
        h10.z = System.currentTimeMillis();
        boolean z10 = j;
        if (wVar.p != z10) {
            wVar.p = z10;
            k0 k0Var = wVar.f;
            if (k0Var != null) {
                k0Var.d(wVar.n && !z10);
            }
        }
        if (h10.A) {
            y(h10);
        } else {
            h10.B = true;
        }
        B();
        C();
    }

    public static void t(int i10) {
        org.telegram.messenger.i0.g3(new wd(i10, 11));
    }

    public static void u(m mVar, w wVar, long j10, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(zArr, ConnectionsManager.getInstance(mVar.b), iArr, wVar, j10, 8);
        w(mVar, widgetQueryType, bArr, iArr, new i(zArr, gVar, wVar, j10));
        org.telegram.messenger.i0.h3(gVar, 30000L);
    }

    public static void v(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static void w(m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, i iVar) {
        boolean z10 = (widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet;
        int i10 = mVar.b;
        boolean z11 = k[i10];
        if (z11 && !z10) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.i0.g3(new v1(2, iVar, tL_error));
            return;
        }
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer_layer233 = z11 ? new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233() : new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        tL_messages_getBotWidgetQueryAnswer_layer233.peer = vp.r1(i10).i1(mVar.c);
        tL_messages_getBotWidgetQueryAnswer_layer233.msg_id = mVar.d;
        tL_messages_getBotWidgetQueryAnswer_layer233.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer_layer233.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer_layer233, new a3.b(1), new org.telegram.ui.Wallet.v1(z11, mVar, widgetQueryType, bArr, iArr, iVar));
    }

    public static boolean x() {
        k0 k0Var;
        i0 i0Var;
        for (m mVar : a.values()) {
            w wVar = mVar.u;
            gl0 gl0Var = mVar.x;
            if (mVar.y != 0 && wVar != null && gl0Var != null && !mVar.E && ((k0Var = wVar.f) == null || (i0Var = k0Var.F) == null || (!i0Var.h && !k0Var.x))) {
                String k10 = k(mVar.a, wVar, gl0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void y(m mVar) {
        k0 k0Var;
        w wVar = mVar.u;
        if (mVar.E) {
            if (mVar.C >= 2) {
                return;
            }
            mVar.E = false;
            wVar.p();
        }
        if (wVar.o) {
            return;
        }
        wVar.o = true;
        k0 k0Var2 = wVar.f;
        if (k0Var2 != null) {
            k0Var2.A = true;
            return;
        }
        String str = wVar.s;
        if (str == null && wVar.t == null && wVar.u == null) {
            k0Var = new k0(wVar.c, wVar.b, l0.d(wVar.m), wVar.d, null, null);
        } else {
            Context context = wVar.c;
            String str2 = wVar.b;
            if (str == null) {
                str = l0.d(wVar.m);
            }
            k0Var = new k0(context, str2, str, wVar.d, wVar.t, wVar.u);
        }
        StringBuilder sb2 = new StringBuilder("{\"data\":");
        sb2.append(wVar.v);
        sb2.append(",\"context\":");
        String r10 = a1.g.r(sb2, wVar.w, "}");
        if (r10 != null) {
            k0Var.h = r10;
        }
        k0Var.c(wVar.x);
        k0Var.J = wVar;
        k0Var.L = wVar;
        k0Var.d(wVar.n && !wVar.p);
        wVar.f = k0Var;
        wVar.q++;
        b0.a.execute(new v(k0Var, wVar.j, 0));
    }

    public static String z(int i10, int i11, long j10) {
        return i10 + "/" + j10 + "/" + i11;
    }
}
