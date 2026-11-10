package org.telegram.utils.twidget;

import android.text.TextUtils;
import hi.j2;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hk;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Wallet.u1;
import org.telegram.ui.q61;
import org.telegram.ui.xn0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract class n0 {
    public static boolean i;
    public static boolean j;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final q61 e = new q61(12);
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] k = new boolean[4];
    public static final HashMap l = new HashMap();
    public static final nb.a m = new nb.a(20);

    public static void A(k0 k0Var) {
        v0 v0Var = k0Var.t;
        if (k0Var.D) {
            if (k0Var.B >= 2) {
                return;
            }
            k0Var.D = false;
            v0Var.p();
        }
        v0Var.a();
    }

    public static String B(int i7, int i10, long j3) {
        return i7 + "/" + j3 + "/" + i10;
    }

    public static String C(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static void D() {
        ArrayList arrayList = new ArrayList();
        for (k0 k0Var : a.values()) {
            if (k0Var.t != null && k0Var.x == 0 && !g.contains(k0Var)) {
                arrayList.add(k0Var);
            }
        }
        Collections.sort(arrayList, new xn0(11));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            v0 v0Var = ((k0) arrayList.get(i7)).t;
            if (i7 >= 4) {
                v0Var.p();
            }
            if (i7 >= 12 && v0Var.f == null) {
                v0Var.g = null;
            }
        }
    }

    public static void E() {
        v0 v0Var;
        HashMap hashMap = new HashMap();
        for (k0 k0Var : a.values()) {
            if (k0Var.l != 0 && !k0Var.k && k0Var.x != 0 && !j && (v0Var = k0Var.t) != null && v0Var.f != null && v0Var.A) {
                hashMap.put(k0Var.b + "/" + k0Var.l, k0Var);
            }
        }
        HashMap hashMap2 = l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                m0 m0Var = (m0) entry.getValue();
                org.telegram.messenger.g0.r(m0Var.f);
                if (m0Var.e != 0) {
                    ConnectionsManager.getInstance(m0Var.a).cancelRequest(m0Var.e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                k0 k0Var2 = (k0) entry2.getValue();
                m0 m0Var2 = new m0(k0Var2.b, k0Var2.l);
                m0Var2.c = k0Var2.q;
                hashMap2.put((String) entry2.getKey(), m0Var2);
                org.telegram.messenger.g0.i3(m0Var2.f, m0Var2.d * 1000);
            }
        }
    }

    public static boolean F(k0 k0Var) {
        return k0Var.i && !k0Var.k && ((org.telegram.messenger.h0) qp.s1(k0Var.b).x7.j0.b).c;
    }

    public static void a(k0 k0Var) {
        org.telegram.messenger.g0.r(k0Var.G);
        if (g.remove(k0Var)) {
            D();
            p();
        }
    }

    public static void b() {
        ArrayList arrayList = h;
        if (arrayList.isEmpty() || !z()) {
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

    public static void c(k0 k0Var, String str, String str2) {
        if (TextUtils.equals(k0Var.o, str) && TextUtils.equals(k0Var.p, str2)) {
            return;
        }
        k0Var.o = str;
        k0Var.p = str2;
        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var.r;
        if (tL_messageMediaWidget != null) {
            tL_messageMediaWidget.chat_data = str;
            tL_messageMediaWidget.public_data = str2;
            tL_messageMediaWidget.public_data_hash = k0Var.q;
        }
        v0 v0Var = k0Var.t;
        if (v0Var != null) {
            v0Var.j(g(str, str2));
        }
    }

    public static int d(String str, v0 v0Var, int i7) {
        int i10;
        k0 k0Var = n(str) ? (k0) a.get(str) : null;
        int i11 = 0;
        if (k0Var == null) {
            return 0;
        }
        if (k0Var.f > 0) {
            return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, r1)));
        }
        int i12 = (v0Var == null || Math.abs(v0Var.k - i7) > 1) ? 0 : v0Var.i;
        if (i12 > 0) {
            return Math.min(org.telegram.messenger.g0.L(600.0f), Math.max(org.telegram.messenger.g0.L(50.0f), i12));
        }
        l0 l0Var = (l0) b.get(k0Var.a());
        if (l0Var != null) {
            int f10 = f(i7);
            synchronized (l0Var) {
                ArrayList arrayList = l0Var.a;
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

    public static String e(k0 k0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z9 = k0Var.h;
            boolean z10 = k0Var.i;
            jSONObject.put("isCopy", z9);
            jSONObject.put("canQuery", z10);
            jSONObject.put("backgroundQuery", k0Var.j);
            jSONObject.put("preview", k0Var.k);
            jSONObject.put("wallet", F(k0Var));
            Object obj = k0Var.m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            TLRPC.User f10 = z10 ? p10.i(k0Var.b).f() : null;
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

    public static k0 h(v0 v0Var) {
        if (v0Var == null) {
            return null;
        }
        return (k0) a.get(v0Var.a);
    }

    public static v0 i(String str) {
        String str2;
        k0 k0Var = n(str) ? (k0) a.get(str) : null;
        if (k0Var == null || i1.a()) {
            return null;
        }
        synchronized (k0Var) {
            try {
                if (k0Var.t == null) {
                    if (k0Var.s == null) {
                        k0Var.s = m(k0Var.g);
                    }
                    if (k0Var.s == null) {
                        return null;
                    }
                    v0 v0Var = new v0(org.telegram.messenger.t0.b, k0Var.a, k0Var.s);
                    try {
                        str2 = id.E0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    v0Var.t = str2;
                    v0Var.u = null;
                    String e10 = e(k0Var);
                    if (e10 != null) {
                        v0Var.w = e10;
                    }
                    v0Var.j(g(k0Var.o, k0Var.p));
                    v0Var.e = m;
                    k0Var.t = v0Var;
                }
                return k0Var.t;
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
        for (k0 k0Var : hashMap.values()) {
            JSONObject jSONObject = (JSONObject) c.get(k0Var.a());
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("local") : null;
            String jSONObject2 = (optJSONObject == null || optJSONObject.length() == 0) ? "" : optJSONObject.toString();
            yr a02 = yr.a0(k0Var.b);
            a02.a.c(new hk(k0Var.d, 8, k0Var.c, a02, jSONObject2));
        }
        hashMap.clear();
    }

    public static String k(String str, v0 v0Var, int i7) {
        int[] iArr = null;
        k0 k0Var = n(str) ? (k0) a.get(str) : null;
        if (k0Var == null) {
            return "none";
        }
        if (k0Var.f > 0) {
            return "anchor " + k0Var.f;
        }
        if (v0Var != null && Math.abs(v0Var.k - i7) <= 1 && v0Var.i > 0) {
            return "frame";
        }
        l0 l0Var = (l0) b.get(k0Var.a());
        if (l0Var != null) {
            int f10 = f(i7);
            synchronized (l0Var) {
                ArrayList arrayList = l0Var.a;
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

    public static l0 l(String str) {
        ConcurrentHashMap concurrentHashMap = b;
        l0 l0Var = (l0) concurrentHashMap.get(str);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0();
        l0 l0Var3 = (l0) concurrentHashMap.putIfAbsent(str, l0Var2);
        return l0Var3 == null ? l0Var2 : l0Var3;
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

    public static TL_iv.RichMessage o(String str) {
        TL_iv.pageBlockEmbed pageblockembed = new TL_iv.pageBlockEmbed();
        pageblockembed.url = str;
        pageblockembed.html = "";
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageblockembed.caption = pageCaption;
        pageCaption.text = new TL_iv.textEmpty();
        pageblockembed.caption.credit = new TL_iv.textEmpty();
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks.add(pageblockembed);
        return richMessage;
    }

    public static void p() {
        while (true) {
            ArrayList arrayList = g;
            if (arrayList.size() >= 3 || j) {
                return;
            }
            ArrayList arrayList2 = f;
            long j3 = Long.MAX_VALUE;
            k0 k0Var = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                k0 k0Var2 = (k0) arrayList2.get(size);
                if (k0Var2.z) {
                    long j10 = 9223372036854775806L;
                    for (k0 k0Var3 : a.values()) {
                        if (k0Var3.x != 0 && k0Var3.b == k0Var2.b && k0Var3.c == k0Var2.c) {
                            j10 = Math.min(j10, Math.abs(k0Var3.d - k0Var2.d));
                        }
                    }
                    if (j10 < j3) {
                        k0Var = k0Var2;
                        j3 = j10;
                    }
                }
            }
            if (k0Var == null) {
                return;
            }
            arrayList2.remove(k0Var);
            v0 v0Var = k0Var.t;
            if (v0Var != null && !k0Var.D && k0Var.x <= 0) {
                String k10 = k(k0Var.a, v0Var, k0Var.E);
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    v0Var.n(k0Var.E);
                    if (v0Var.s == null) {
                        v0Var.l(j1.a(null, k0Var.F));
                    }
                    if (!v0Var.o) {
                        arrayList.add(k0Var);
                        A(k0Var);
                        org.telegram.messenger.g0.i3(k0Var.G, 4000L);
                    }
                }
            }
        }
    }

    public static ck0 q(ArrayList arrayList) {
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

    public static void r(boolean z9) {
        if (j == z9) {
            return;
        }
        j = z9;
        Iterator it = a.values().iterator();
        while (it.hasNext()) {
            v0 v0Var = ((k0) it.next()).t;
            if (v0Var != null && v0Var.p != z9) {
                v0Var.p = z9;
                i1 i1Var = v0Var.f;
                if (i1Var != null) {
                    i1Var.f(v0Var.n && !z9);
                }
            }
        }
        if (z9) {
            j();
        } else {
            p();
        }
        E();
    }

    public static void s(v0 v0Var) {
        k0 h7 = h(v0Var);
        if (h7 == null) {
            return;
        }
        h7.x = Math.max(0, h7.x - 1);
        h7.y = System.currentTimeMillis();
        D();
        j();
        E();
    }

    public static void t(v0 v0Var) {
        k0 h7 = h(v0Var);
        if (h7 == null) {
            return;
        }
        h7.x++;
        h7.y = System.currentTimeMillis();
        boolean z9 = j;
        if (v0Var.p != z9) {
            v0Var.p = z9;
            i1 i1Var = v0Var.f;
            if (i1Var != null) {
                i1Var.f(v0Var.n && !z9);
            }
        }
        if (h7.z) {
            A(h7);
        } else {
            h7.A = true;
        }
        D();
        E();
    }

    public static void u(int i7) {
        org.telegram.messenger.g0.h3(new j2(i7, 14));
    }

    public static String v(int i7, TLRPC.BotInlineResult botInlineResult) {
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder n10 = jg.g.n(i7, "tg-widget:preview/", "/");
        n10.append(botInlineResult.query_id);
        n10.append("/");
        n10.append(botInlineResult.id);
        n10.append("/");
        n10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = n10.toString();
        ConcurrentHashMap concurrentHashMap = a;
        if (!concurrentHashMap.containsKey(sb2)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            k0 k0Var = new k0(sb2, i7, 0L, 0, 0L, tL_messageMediaWidget, true);
            k0Var.z = true;
            concurrentHashMap.putIfAbsent(sb2, k0Var);
        }
        return sb2;
    }

    public static void w(k0 k0Var, v0 v0Var, long j3, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        bi.i0 i0Var = new bi.i0(zArr, ConnectionsManager.getInstance(k0Var.b), iArr, v0Var, j3, 16);
        y(k0Var, widgetQueryType, bArr, iArr, new g0(zArr, i0Var, v0Var, j3));
        org.telegram.messenger.g0.i3(i0Var, 30000L);
    }

    public static void x(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static void y(k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, g0 g0Var) {
        boolean z9 = (widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet;
        int i7 = k0Var.b;
        boolean z10 = k[i7];
        if (z10 && !z9) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.g0.h3(new f0(1, g0Var, tL_error));
            return;
        }
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer_layer233 = z10 ? new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233() : new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        tL_messages_getBotWidgetQueryAnswer_layer233.peer = qp.s1(i7).j1(k0Var.c);
        tL_messages_getBotWidgetQueryAnswer_layer233.msg_id = k0Var.d;
        tL_messages_getBotWidgetQueryAnswer_layer233.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer_layer233.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer_layer233, new d3.b(1), new u1(z10, k0Var, widgetQueryType, bArr, iArr, g0Var));
    }

    public static boolean z() {
        i1 i1Var;
        g1 g1Var;
        for (k0 k0Var : a.values()) {
            v0 v0Var = k0Var.t;
            ck0 ck0Var = k0Var.w;
            if (k0Var.x != 0 && v0Var != null && ck0Var != null && !k0Var.D && ((i1Var = v0Var.f) == null || (g1Var = i1Var.H) == null || (!g1Var.g && !i1Var.z))) {
                String k10 = k(k0Var.a, v0Var, ck0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }
}
