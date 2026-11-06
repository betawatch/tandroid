package org.telegram.utils.twidget;

import a8.p0;
import android.content.Context;
import android.text.TextUtils;
import hi.j2;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ik;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Wallet.h2;
import org.telegram.ui.Wallet.w1;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public abstract class p {
    public static boolean i;
    public static boolean j;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final org.telegram.ui.Wallet.z e = new org.telegram.ui.Wallet.z(9);
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] k = new boolean[4];
    public static final HashMap l = new HashMap();
    public static final nb.a m = new nb.a(20);

    public static String A(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static void B() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : a.values()) {
            if (mVar.t != null && mVar.x == 0 && !g.contains(mVar)) {
                arrayList.add(mVar);
            }
        }
        Collections.sort(arrayList, new rv0(10));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            u uVar = ((m) arrayList.get(i7)).t;
            if (i7 >= 4) {
                uVar.p();
            }
            if (i7 >= 12 && uVar.f == null) {
                uVar.g = null;
            }
        }
    }

    public static void C() {
        u uVar;
        HashMap hashMap = new HashMap();
        for (m mVar : a.values()) {
            if (mVar.l != 0 && !mVar.k && mVar.x != 0 && !j && (uVar = mVar.t) != null && uVar.f != null && uVar.A) {
                hashMap.put(mVar.b + "/" + mVar.l, mVar);
            }
        }
        HashMap hashMap2 = l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                o oVar = (o) entry.getValue();
                org.telegram.messenger.g0.r(oVar.f);
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
                oVar2.c = mVar2.q;
                hashMap2.put((String) entry2.getKey(), oVar2);
                org.telegram.messenger.g0.i3(oVar2.f, oVar2.d * 1000);
            }
        }
    }

    public static boolean D(m mVar) {
        return mVar.i && !mVar.k && ((org.telegram.messenger.h0) qp.s1(mVar.b).x7.j0.b).c;
    }

    public static void a(m mVar) {
        org.telegram.messenger.g0.r(mVar.G);
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            org.telegram.messenger.g0.h3((Runnable) obj);
        }
    }

    public static void c(m mVar, String str, String str2) {
        if (TextUtils.equals(mVar.o, str) && TextUtils.equals(mVar.p, str2)) {
            return;
        }
        mVar.o = str;
        mVar.p = str2;
        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar.r;
        if (tL_messageMediaWidget != null) {
            tL_messageMediaWidget.chat_data = str;
            tL_messageMediaWidget.public_data = str2;
            tL_messageMediaWidget.public_data_hash = mVar.q;
        }
        u uVar = mVar.t;
        if (uVar != null) {
            uVar.j(g(str, str2));
        }
    }

    public static int d(String str, u uVar, int i7) {
        int i10;
        m mVar = n(str) ? (m) a.get(str) : null;
        int i11 = 0;
        if (mVar == null) {
            return 0;
        }
        if (mVar.f > 0) {
            return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, r1)));
        }
        int i12 = (uVar == null || Math.abs(uVar.k - i7) > 1) ? 0 : uVar.i;
        if (i12 > 0) {
            return Math.min(org.telegram.messenger.g0.L(600.0f), Math.max(org.telegram.messenger.g0.L(50.0f), i12));
        }
        n nVar = (n) b.get(mVar.a());
        if (nVar != null) {
            int f10 = f(i7);
            synchronized (nVar) {
                ArrayList arrayList = nVar.a;
                int size = arrayList.size();
                int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i10 = 0;
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - f10);
                    if (abs < i13) {
                        i10 = iArr[1];
                        i13 = abs;
                    }
                }
            }
            i11 = i10;
        }
        if (i11 <= 0) {
            i11 = qs.q2;
        }
        return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, i11)));
    }

    public static String e(m mVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z9 = mVar.h;
            boolean z10 = mVar.i;
            jSONObject.put("isCopy", z9);
            jSONObject.put("canQuery", z10);
            jSONObject.put("backgroundQuery", mVar.j);
            jSONObject.put("preview", mVar.k);
            jSONObject.put("wallet", D(mVar));
            Object obj = mVar.m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            TLRPC.User f10 = z10 ? p10.i(mVar.b).f() : null;
            if (f10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", f10.id);
                if (!TextUtils.isEmpty(f10.first_name)) {
                    jSONObject2.put("firstName", f10.first_name);
                }
                if (!TextUtils.isEmpty(f10.last_name)) {
                    jSONObject2.put("lastName", f10.last_name);
                }
                String n10 = t10.n(f10);
                if (!TextUtils.isEmpty(n10)) {
                    jSONObject2.put("username", n10);
                }
                jSONObject2.put("isPremium", f10.premium);
                jSONObject.put("viewer", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static int f(int i7) {
        return Math.round(i7 / org.telegram.messenger.g0.p);
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

    public static m h(u uVar) {
        if (uVar == null) {
            return null;
        }
        return (m) a.get(uVar.a);
    }

    public static u i(String str) {
        String str2;
        m mVar = n(str) ? (m) a.get(str) : null;
        if (mVar == null) {
            return null;
        }
        synchronized (mVar) {
            try {
                if (mVar.t == null) {
                    if (mVar.s == null) {
                        mVar.s = m(mVar.g);
                    }
                    if (mVar.s == null) {
                        return null;
                    }
                    u uVar = new u(t0.b, mVar.a, mVar.s);
                    try {
                        str2 = hd.E0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    uVar.t = str2;
                    uVar.u = null;
                    String e10 = e(mVar);
                    if (e10 != null) {
                        uVar.w = e10;
                    }
                    uVar.j(g(mVar.o, mVar.p));
                    uVar.e = m;
                    mVar.t = uVar;
                }
                return mVar.t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        org.telegram.messenger.g0.r(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (m mVar : hashMap.values()) {
            JSONObject jSONObject = (JSONObject) c.get(mVar.a());
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("local") : null;
            String jSONObject2 = (optJSONObject == null || optJSONObject.length() == 0) ? "" : optJSONObject.toString();
            yr a02 = yr.a0(mVar.b);
            a02.a.c(new ik(mVar.d, 9, mVar.c, a02, jSONObject2));
        }
        hashMap.clear();
    }

    public static String k(String str, u uVar, int i7) {
        int[] iArr = null;
        m mVar = n(str) ? (m) a.get(str) : null;
        if (mVar == null) {
            return "none";
        }
        if (mVar.f > 0) {
            return "anchor " + mVar.f;
        }
        if (uVar != null && Math.abs(uVar.k - i7) <= 1 && uVar.i > 0) {
            return "frame";
        }
        n nVar = (n) b.get(mVar.a());
        if (nVar != null) {
            int f10 = f(i7);
            synchronized (nVar) {
                ArrayList arrayList = nVar.a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    int[] iArr2 = (int[]) obj;
                    if (iArr == null || Math.abs(iArr2[0] - f10) < Math.abs(iArr[0] - f10)) {
                        iArr = iArr2;
                    }
                }
            }
        }
        if (iArr == null || iArr[1] <= 0) {
            return "placeholder";
        }
        if (iArr[0] == f(i7)) {
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
        boolean z9 = bArr.length >= 2 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139;
        try {
            InputStream gZIPInputStream = z9 ? new GZIPInputStream(new ByteArrayInputStream(bArr)) : new InflaterInputStream(new ByteArrayInputStream(bArr));
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
                    if (r2.a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("widget payload: ");
                        sb2.append(z9 ? "gzip" : "zlib");
                        sb2.append(", ");
                        sb2.append(bArr.length);
                        sb2.append(" -> ");
                        sb2.append(byteArrayOutputStream.size());
                        sb2.append(" bytes");
                        a8.b(sb2.toString());
                    }
                    String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    return str;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
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
            long j3 = Long.MAX_VALUE;
            m mVar = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                m mVar2 = (m) arrayList2.get(size);
                if (mVar2.z) {
                    long j10 = 9223372036854775806L;
                    for (m mVar3 : a.values()) {
                        if (mVar3.x != 0 && mVar3.b == mVar2.b && mVar3.c == mVar2.c) {
                            j10 = Math.min(j10, Math.abs(mVar3.d - mVar2.d));
                        }
                    }
                    if (j10 < j3) {
                        mVar = mVar2;
                        j3 = j10;
                    }
                }
            }
            if (mVar == null) {
                return;
            }
            arrayList2.remove(mVar);
            u uVar = mVar.t;
            if (uVar != null && !mVar.D && mVar.x <= 0) {
                String k10 = k(mVar.a, uVar, mVar.E);
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    uVar.n(mVar.E);
                    if (uVar.s == null) {
                        uVar.l(i0.a(null, mVar.F));
                    }
                    if (!uVar.o) {
                        arrayList.add(mVar);
                        y(mVar);
                        org.telegram.messenger.g0.i3(mVar.G, 4000L);
                    }
                }
            }
        }
    }

    public static ck0 p(ArrayList arrayList) {
        int size = arrayList.size();
        ck0 ck0Var = null;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ck0 ck0Var2 = (ck0) obj;
            if (ck0Var == null || ck0Var2.c0 > ck0Var.c0) {
                ck0Var = ck0Var2;
            }
        }
        return ck0Var;
    }

    public static void q(boolean z9) {
        if (j == z9) {
            return;
        }
        j = z9;
        Iterator it = a.values().iterator();
        while (it.hasNext()) {
            u uVar = ((m) it.next()).t;
            if (uVar != null && uVar.p != z9) {
                uVar.p = z9;
                h0 h0Var = uVar.f;
                if (h0Var != null) {
                    h0Var.d(uVar.n && !z9);
                }
            }
        }
        if (z9) {
            j();
        } else {
            o();
        }
        C();
    }

    public static void r(u uVar) {
        m h7 = h(uVar);
        if (h7 == null) {
            return;
        }
        h7.x = Math.max(0, h7.x - 1);
        h7.y = System.currentTimeMillis();
        B();
        j();
        C();
    }

    public static void s(u uVar) {
        m h7 = h(uVar);
        if (h7 == null) {
            return;
        }
        h7.x++;
        h7.y = System.currentTimeMillis();
        boolean z9 = j;
        if (uVar.p != z9) {
            uVar.p = z9;
            h0 h0Var = uVar.f;
            if (h0Var != null) {
                h0Var.d(uVar.n && !z9);
            }
        }
        if (h7.z) {
            y(h7);
        } else {
            h7.A = true;
        }
        B();
        C();
    }

    public static void t(int i7) {
        org.telegram.messenger.g0.h3(new j2(i7, 14));
    }

    public static void u(m mVar, u uVar, long j3, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        bi.i0 i0Var = new bi.i0(zArr, ConnectionsManager.getInstance(mVar.b), iArr, uVar, j3, 16);
        w(mVar, widgetQueryType, bArr, iArr, new i(zArr, i0Var, uVar, j3));
        org.telegram.messenger.g0.i3(i0Var, 30000L);
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
        boolean z9 = (widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet;
        int i7 = mVar.b;
        boolean z10 = k[i7];
        if (z10 && !z9) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.g0.h3(new org.telegram.ui.web.w(9, iVar, tL_error));
            return;
        }
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer_layer233 = z10 ? new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233() : new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        tL_messages_getBotWidgetQueryAnswer_layer233.peer = qp.s1(i7).j1(mVar.c);
        tL_messages_getBotWidgetQueryAnswer_layer233.msg_id = mVar.d;
        tL_messages_getBotWidgetQueryAnswer_layer233.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer_layer233.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer_layer233, new d3.b(1), new w1(z10, mVar, widgetQueryType, bArr, iArr, iVar));
    }

    public static boolean x() {
        h0 h0Var;
        f0 f0Var;
        for (m mVar : a.values()) {
            u uVar = mVar.t;
            ck0 ck0Var = mVar.w;
            if (mVar.x != 0 && uVar != null && ck0Var != null && !mVar.D && ((h0Var = uVar.f) == null || (f0Var = h0Var.F) == null || (!f0Var.g && !h0Var.x))) {
                String k10 = k(mVar.a, uVar, ck0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void y(m mVar) {
        h0 h0Var;
        u uVar = mVar.t;
        boolean z9 = false;
        if (mVar.D) {
            if (mVar.B >= 2) {
                return;
            }
            mVar.D = false;
            uVar.p();
        }
        if (uVar.o) {
            return;
        }
        uVar.o = true;
        h0 h0Var2 = uVar.f;
        if (h0Var2 != null) {
            h0Var2.A = true;
            return;
        }
        String str = uVar.s;
        if (str == null && uVar.t == null && uVar.u == null) {
            Context context = uVar.c;
            String str2 = uVar.b;
            boolean z10 = uVar.m;
            int i7 = uVar.d;
            int[] iArr = i0.a;
            h0Var = new h0(context, str2, p0.s(new StringBuilder("{\"colorScheme\":\""), z10 ? "dark" : "light", "\"}"), i7, null, null);
        } else {
            Context context2 = uVar.c;
            String str3 = uVar.b;
            if (str == null) {
                boolean z11 = uVar.m;
                int[] iArr2 = i0.a;
                str = p0.s(new StringBuilder("{\"colorScheme\":\""), z11 ? "dark" : "light", "\"}");
            }
            h0Var = new h0(context2, str3, str, uVar.d, uVar.t, uVar.u);
        }
        StringBuilder sb2 = new StringBuilder("{\"data\":");
        sb2.append(uVar.v);
        sb2.append(",\"context\":");
        String s5 = p0.s(sb2, uVar.w, "}");
        if (s5 != null) {
            h0Var.h = s5;
        }
        h0Var.c(uVar.x);
        h0Var.J = uVar;
        h0Var.K = uVar;
        if (uVar.n && !uVar.p) {
            z9 = true;
        }
        h0Var.d(z9);
        uVar.f = h0Var;
        uVar.q++;
        z.a.execute(new h2(h0Var, uVar.j, 5));
    }

    public static String z(int i7, int i10, long j3) {
        return i7 + "/" + j3 + "/" + i10;
    }
}
