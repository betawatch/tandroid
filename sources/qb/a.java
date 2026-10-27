package qb;

import a8.me;
import a8.qd;
import ag.j;
import ag.p;
import android.graphics.Paint;
import android.net.Uri;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import b2.p0;
import b2.x;
import b4.i;
import c3.b0;
import c3.j0;
import c3.q;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.n0;
import fa.b;
import hb.n;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import k9.v;
import k9.y;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.og;
import org.telegram.ui.d3;
import org.telegram.ui.ev0;
import org.telegram.ui.mn;
import org.xml.sax.Attributes;
import r4.c;
import s9.d;
import ti.e;
import z3.k;
import z3.m;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements q, dg.a, eg.a, b, n, y2.n, og, j1, d, c, SuccessContinuation, k, z9.c {
    public static volatile a b;
    public static a c;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static ag.q j4(Editable editable, int i10) {
        ag.q[] qVarArr = (ag.q[]) editable.getSpans(0, editable.length(), ag.q.class);
        if (qVarArr.length == 0) {
            return null;
        }
        for (int length = qVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(qVarArr[i11]) == 17) {
                ag.q qVar = qVarArr[i11];
                if (qVar.a == i10) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public static boolean k4(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = p.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new c6(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), c6.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i11 = length - 1;
                        if (editable.getSpanFlags(spans[i11]) == 17) {
                            obj = spans[i11];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (c6) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        if (str.equals("spoiler")) {
            if (z10) {
                editable.setSpan(new ag.q(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object j42 = j4(editable, 0);
            if (j42 != null) {
                int spanStart2 = editable.getSpanStart(j42);
                editable.removeSpan(j42);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(j42, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a10 = p.a("language", attributes);
                if (a10 == null) {
                    a10 = p.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = p.a("lng", attributes);
                }
                editable.setSpan(new ag.q(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object j43 = j4(editable, 1);
            if (j43 != null) {
                int spanStart3 = editable.getSpanStart(j43);
                editable.removeSpan(j43);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(j43, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new ag.q(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object j44 = j4(editable, 3);
                if (j44 != null) {
                    int spanStart4 = editable.getSpanStart(j44);
                    editable.removeSpan(j44);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(j44, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a11 = p.a("class", attributes);
            if (p.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new ag.q(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        ag.q[] qVarArr = (ag.q[]) editable.getSpans(0, editable.length(), ag.q.class);
        for (int length2 = qVarArr.length - 1; length2 >= 0; length2--) {
            ag.q qVar = qVarArr[length2];
            if (editable.getSpanFlags(qVar) == 17 && ((i10 = qVar.a) == 2 || i10 == 3)) {
                obj = qVar;
                break;
            }
        }
        if (obj != null) {
            int spanStart5 = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            if (spanStart5 != editable.length()) {
                editable.setSpan(obj, spanStart5, editable.length(), 33);
                return true;
            }
            return true;
        }
        return false;
    }

    public static y t4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                v vVar = new v();
                vVar.n(unsupportedOperationException);
                return vVar;
            }
        }
        return qd.b(list);
    }

    public static String w4(dd.c cVar) {
        String str = cVar.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers B() {
        return null;
    }

    @Override // z3.k
    public int B0(x xVar) {
        String str = xVar.s;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(b10.j("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean C0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean C1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // fa.b
    public fa.a E(sb.b bVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        j jVar = jSONObject.has("session") ? new j(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new j(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new fa.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), jVar, new cc.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ev0 E1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // c3.q
    public j0 F1(int i10, int i11) {
        return new c3.n();
    }

    @Override // dg.a
    public void G0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean G1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(s1 s1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean I1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J0(s1 s1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M1(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean N(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ int N0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O0(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int S() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(MessageObject messageObject) {
        int i10 = this.a;
        return d3.a(messageObject);
    }

    @Override // y2.n
    public Object S1(Uri uri, g2.k kVar) {
        return Long.valueOf(n0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // r4.c
    public void T() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Components.og
    public boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0() {
        int i10 = this.a;
    }

    @Override // hb.n
    public Object U1() {
        switch (this.a) {
            case 9:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ jh.a V() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X1(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // r4.c
    public void Y(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z0(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b0(s1 s1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ t9 b2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int c0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // s9.d
    public Object d1(me meVar) {
        switch (this.a) {
            case 18:
                return new tb.a(0);
            default:
                return new sb.b(0);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // z3.k
    public m f0(x xVar) {
        String str = xVar.s;
        List list = xVar.v;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new i(list);
                case "application/pgs":
                    return new e(4);
                case "application/x-mp4-vtt":
                    return new za.c(27);
                case "text/vtt":
                    return new rf.b(25);
                case "application/x-quicktime-tx3g":
                    return new g4.a(list);
                case "text/x-ssa":
                    return new d4.a(list);
                case "application/vobsub":
                    return new h4.b(list);
                case "application/x-subrip":
                    return new e4.a();
                case "application/ttml+xml":
                    return new f4.d();
            }
        }
        throw new IllegalArgumentException(b10.j("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f1(s1 s1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ int g() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h0(c6 c6Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ mn i0() {
        return null;
    }

    @Override // z3.k
    public boolean i1(x xVar) {
        String str = xVar.s;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j0(s1 s1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // eg.a
    public void k0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            eg.a.t.k0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            eg.a.q.k0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public void l1(s1 s1Var, boolean z10, boolean z11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(s1 s1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n0(s1 s1Var, bh.n nVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n1(s1 s1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o0(s1 s1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean p0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean p1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean q0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String u(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u0(s1 s1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(s1 s1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void v1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        qf.d.r(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle w1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // z9.c
    public String y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public void y0(s1 s1Var, boolean z10, boolean z11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean y1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1() {
        int i10 = this.a;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void A4() {
    }

    private final /* synthetic */ void b3() {
    }

    private final /* synthetic */ void c3() {
    }

    private final /* synthetic */ void h2() {
    }

    private final /* synthetic */ void i2() {
    }

    private final /* synthetic */ void l4() {
    }

    private final /* synthetic */ void m4() {
    }

    private final /* synthetic */ void n2() {
    }

    private final /* synthetic */ void o2() {
    }

    private final /* synthetic */ void p4() {
    }

    private final /* synthetic */ void q4() {
    }

    private final /* synthetic */ void u4() {
    }

    private final /* synthetic */ void v4() {
    }

    private final /* synthetic */ void z3() {
    }

    private final /* synthetic */ void z4() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void J1() {
    }

    @Override // org.telegram.ui.Components.og
    public void N1() {
    }

    @Override // c3.q
    public void Q0() {
    }

    @Override // org.telegram.ui.Components.og
    public void T1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public void X0() {
    }

    @Override // org.telegram.ui.Components.og
    public void Y1() {
    }

    @Override // z9.c
    public void a() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void a1() {
    }

    @Override // org.telegram.ui.Components.og
    public void b() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.og
    public void c1() {
    }

    @Override // org.telegram.ui.Components.og
    public void c2() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Components.og
    public void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public void o() {
    }

    @Override // org.telegram.ui.Components.og
    public void o1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Components.og
    public void z() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void z0() {
    }

    private final /* synthetic */ void A2(s1 s1Var) {
    }

    private final /* synthetic */ void B2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void C2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void D2(s1 s1Var) {
    }

    private final /* synthetic */ void E2(s1 s1Var) {
    }

    private final /* synthetic */ void H2(s1 s1Var) {
    }

    private final /* synthetic */ void H3(String str) {
    }

    private final /* synthetic */ void I2(s1 s1Var) {
    }

    private final /* synthetic */ void I3(String str) {
    }

    private final /* synthetic */ void L2(s1 s1Var) {
    }

    private final /* synthetic */ void M2(s1 s1Var) {
    }

    private final /* synthetic */ void N3(s1 s1Var) {
    }

    private final /* synthetic */ void O3(s1 s1Var) {
    }

    private final /* synthetic */ void R3(s1 s1Var) {
    }

    private final /* synthetic */ void S3(s1 s1Var) {
    }

    private final /* synthetic */ void T2(s1 s1Var) {
    }

    private final /* synthetic */ void T3(MessageObject messageObject) {
    }

    private final /* synthetic */ void U2(s1 s1Var) {
    }

    private final /* synthetic */ void U3(MessageObject messageObject) {
    }

    private final /* synthetic */ void V2(s1 s1Var) {
    }

    private final /* synthetic */ void V3(s1 s1Var) {
    }

    private final /* synthetic */ void W2(s1 s1Var) {
    }

    private final /* synthetic */ void W3(s1 s1Var) {
    }

    private final /* synthetic */ void Z3(s1 s1Var) {
    }

    private final /* synthetic */ void a4(s1 s1Var) {
    }

    private final /* synthetic */ void f4(s1 s1Var) {
    }

    private final /* synthetic */ void h4(s1 s1Var) {
    }

    private final /* synthetic */ void j2(s1 s1Var) {
    }

    private final /* synthetic */ void k2(s1 s1Var) {
    }

    private final /* synthetic */ void l2(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void m2(s1 s1Var) {
    }

    private final /* synthetic */ void m3(s1 s1Var) {
    }

    private final /* synthetic */ void p2(s1 s1Var) {
    }

    private final /* synthetic */ void p3(s1 s1Var) {
    }

    private final /* synthetic */ void q2(s1 s1Var) {
    }

    private final /* synthetic */ void q3(s1 s1Var) {
    }

    private final /* synthetic */ void r3(s1 s1Var) {
    }

    private final /* synthetic */ void r4(int i10) {
    }

    private final /* synthetic */ void s3(s1 s1Var) {
    }

    private final /* synthetic */ void s4(int i10) {
    }

    private final /* synthetic */ void t2(s1 s1Var) {
    }

    private final /* synthetic */ void t3(s1 s1Var) {
    }

    private final /* synthetic */ void u2(s1 s1Var) {
    }

    private final /* synthetic */ void u3(s1 s1Var) {
    }

    private final /* synthetic */ void x3(s1 s1Var) {
    }

    private final /* synthetic */ void x4(MessageObject messageObject) {
    }

    private final /* synthetic */ void y3(s1 s1Var) {
    }

    private final /* synthetic */ void y4(MessageObject messageObject) {
    }

    private final /* synthetic */ void z2(s1 s1Var) {
    }

    @Override // c3.q
    public void D1(b0 b0Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void L1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public void M0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public void O1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void R(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void g1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void t(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void w(boolean z10) {
    }

    private final /* synthetic */ void F2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void G2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void J2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void J3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void K2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void K3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void P2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void Q2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void R2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void S2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void X3(s1 s1Var, bh.n nVar) {
    }

    private final /* synthetic */ void Y3(s1 s1Var, bh.n nVar) {
    }

    private final /* synthetic */ void Z2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void a3(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void b4(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void d4(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void f2(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void g2(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void n3(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void o3(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void r2(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void s2(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Components.og
    public void G(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public void v0(int i10, int i11) {
    }

    private final /* synthetic */ void B3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void C3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void N2(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void O2(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void P3(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Q3(s1 s1Var, float f7, float f10) {
    }

    private final void c4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void d2(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void d3(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void e2(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void e3(s1 s1Var, float f7, float f10) {
    }

    private final void e4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void g4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void i4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void v3(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void w3(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void x2(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void y2(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void V0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.og
    public void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // dg.a
    public int t1(int i10, int i11, int i12) {
        return i10;
    }

    private final /* synthetic */ void D3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void E3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void F3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void G3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void X2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void Y2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void f3(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void g3(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void L3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void M3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void h3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void i3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void j3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void k3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    private final /* synthetic */ void v2(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void w2(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    private final /* synthetic */ void n4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void o4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
