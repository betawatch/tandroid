package org.telegram.utils.twidget;

import android.text.TextUtils;
import bi.r1;
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
import org.telegram.messenger.fk;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.r2;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Wallet.u1;
import org.telegram.ui.ah0;
import org.telegram.ui.qv0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public abstract class n0 {
    public static boolean i;
    public static boolean j;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final ah0 e = new ah0(16);
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] k = new boolean[4];
    public static final HashMap l = new HashMap();
    public static final sa.d m = new sa.d(20);

    public static void A(k0 k0Var) {
        y0 y0Var = k0Var.t;
        if (k0Var.D) {
            if (k0Var.B >= 2) {
                return;
            }
            k0Var.D = false;
            y0Var.p();
        }
        y0Var.a();
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
        Collections.sort(arrayList, new qv0(10));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            y0 y0Var = ((k0) arrayList.get(i7)).t;
            if (i7 >= 4) {
                y0Var.p();
            }
            if (i7 >= 12 && y0Var.f == null) {
                y0Var.g = null;
            }
        }
    }

    public static void E() {
        y0 y0Var;
        HashMap hashMap = new HashMap();
        for (k0 k0Var : a.values()) {
            if (k0Var.l != 0 && !k0Var.k && k0Var.x != 0 && !j && (y0Var = k0Var.t) != null && y0Var.f != null && y0Var.A) {
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
        return k0Var.i && !k0Var.k && ((org.telegram.messenger.h0) np.s1(k0Var.b).y7.j0.b).c;
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
        y0 y0Var = k0Var.t;
        if (y0Var != null) {
            y0Var.j(g(str, str2));
        }
    }

    public static int d(String str, y0 y0Var, int i7) {
        int i10;
        k0 k0Var = n(str) ? (k0) a.get(str) : null;
        int i11 = 0;
        if (k0Var == null) {
            return 0;
        }
        if (k0Var.f > 0) {
            return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, r1)));
        }
        int i12 = (y0Var == null || Math.abs(y0Var.k - i7) > 1) ? 0 : y0Var.i;
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
            i11 = ns.q2;
        }
        return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, i11)));
    }

    public static String e(k0 k0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = k0Var.h;
            boolean z11 = k0Var.i;
            jSONObject.put("isCopy", z10);
            jSONObject.put("canQuery", z11);
            jSONObject.put("backgroundQuery", k0Var.j);
            jSONObject.put("preview", k0Var.k);
            jSONObject.put("wallet", F(k0Var));
            Object obj = k0Var.m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            TLRPC.User f10 = z11 ? m10.i(k0Var.b).f() : null;
            if (f10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", f10.id);
                if (!TextUtils.isEmpty(f10.first_name)) {
                    jSONObject2.put("firstName", f10.first_name);
                }
                if (!TextUtils.isEmpty(f10.last_name)) {
                    jSONObject2.put("lastName", f10.last_name);
                }
                String n10 = q10.n(f10);
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

    public static k0 h(y0 y0Var) {
        if (y0Var == null) {
            return null;
        }
        return (k0) a.get(y0Var.a);
    }

    public static y0 i(String str) {
        String str2;
        k0 k0Var = n(str) ? (k0) a.get(str) : null;
        if (k0Var == null || l1.a()) {
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
                    y0 y0Var = new y0(org.telegram.messenger.t0.b, k0Var.a, k0Var.s);
                    try {
                        str2 = hd.E0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    y0Var.t = str2;
                    y0Var.u = null;
                    String e10 = e(k0Var);
                    if (e10 != null) {
                        y0Var.w = e10;
                    }
                    y0Var.j(g(k0Var.o, k0Var.p));
                    y0Var.e = m;
                    k0Var.t = y0Var;
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
            vr a02 = vr.a0(k0Var.b);
            a02.a.c(new fk(k0Var.d, 8, k0Var.c, a02, jSONObject2));
        }
        hashMap.clear();
    }

    public static String k(String str, y0 y0Var, int i7) {
        int[] iArr = null;
        k0 k0Var = n(str) ? (k0) a.get(str) : null;
        if (k0Var == null) {
            return "none";
        }
        if (k0Var.f > 0) {
            return "anchor " + k0Var.f;
        }
        if (y0Var != null && Math.abs(y0Var.k - i7) <= 1 && y0Var.i > 0) {
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
                    if (r2.a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("widget payload: ");
                        sb2.append(z10 ? "gzip" : "zlib");
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
            y0 y0Var = k0Var.t;
            if (y0Var != null && !k0Var.D && k0Var.x <= 0) {
                String k10 = k(k0Var.a, y0Var, k0Var.E);
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    y0Var.n(k0Var.E);
                    if (y0Var.s == null) {
                        y0Var.l(m1.a(null, k0Var.F));
                    }
                    if (!y0Var.o) {
                        arrayList.add(k0Var);
                        A(k0Var);
                        org.telegram.messenger.g0.i3(k0Var.G, 4000L);
                    }
                }
            }
        }
    }

    public static hk0 q(ArrayList arrayList) {
        int size = arrayList.size();
        hk0 hk0Var = null;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            hk0 hk0Var2 = (hk0) obj;
            if (hk0Var == null || hk0Var2.d0 > hk0Var.d0) {
                hk0Var = hk0Var2;
            }
        }
        return hk0Var;
    }

    public static void r(boolean z10) {
        if (j == z10) {
            return;
        }
        j = z10;
        Iterator it = a.values().iterator();
        while (it.hasNext()) {
            y0 y0Var = ((k0) it.next()).t;
            if (y0Var != null && y0Var.p != z10) {
                y0Var.p = z10;
                l1 l1Var = y0Var.f;
                if (l1Var != null) {
                    l1Var.f(y0Var.n && !z10);
                }
            }
        }
        if (z10) {
            j();
        } else {
            p();
        }
        E();
    }

    public static void s(y0 y0Var) {
        k0 h7 = h(y0Var);
        if (h7 == null) {
            return;
        }
        h7.x = Math.max(0, h7.x - 1);
        h7.y = System.currentTimeMillis();
        D();
        j();
        E();
    }

    public static void t(y0 y0Var) {
        k0 h7 = h(y0Var);
        if (h7 == null) {
            return;
        }
        h7.x++;
        h7.y = System.currentTimeMillis();
        boolean z10 = j;
        if (y0Var.p != z10) {
            y0Var.p = z10;
            l1 l1Var = y0Var.f;
            if (l1Var != null) {
                l1Var.f(y0Var.n && !z10);
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
        org.telegram.messenger.g0.h3(new jg.x(i7, 14));
    }

    public static String v(int i7, TLRPC.BotInlineResult botInlineResult) {
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder m10 = i5.c.m(i7, "tg-widget:preview/", "/");
        m10.append(botInlineResult.query_id);
        m10.append("/");
        m10.append(botInlineResult.id);
        m10.append("/");
        m10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = m10.toString();
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

    public static void w(k0 k0Var, y0 y0Var, long j3, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        r1 r1Var = new r1(zArr, ConnectionsManager.getInstance(k0Var.b), iArr, y0Var, j3, 17);
        y(k0Var, widgetQueryType, bArr, iArr, new g0(zArr, r1Var, y0Var, j3));
        org.telegram.messenger.g0.i3(r1Var, 30000L);
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
        boolean z10 = (widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet;
        int i7 = k0Var.b;
        boolean z11 = k[i7];
        if (z11 && !z10) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.g0.h3(new f0(1, g0Var, tL_error));
            return;
        }
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer_layer233 = z11 ? new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233() : new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        tL_messages_getBotWidgetQueryAnswer_layer233.peer = np.s1(i7).j1(k0Var.c);
        tL_messages_getBotWidgetQueryAnswer_layer233.msg_id = k0Var.d;
        tL_messages_getBotWidgetQueryAnswer_layer233.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer_layer233.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer_layer233, new d3.b(1), new u1(z11, k0Var, widgetQueryType, bArr, iArr, g0Var));
    }

    public static boolean z() {
        l1 l1Var;
        j1 j1Var;
        for (k0 k0Var : a.values()) {
            y0 y0Var = k0Var.t;
            hk0 hk0Var = k0Var.w;
            if (k0Var.x != 0 && y0Var != null && hk0Var != null && !k0Var.D && ((l1Var = y0Var.f) == null || (j1Var = l1Var.H) == null || (!j1Var.g && !l1Var.z))) {
                String k10 = k(k0Var.a, y0Var, hk0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }
}
