// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import java.io.Serializable;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rj2 implements lx2, fzc, tq2, h4e, y2c, e30, xy1, j30, tw8, rb2, up5, mu8, bl0, yba, d23 {
    public final /* synthetic */ byte a;
    public static final /* synthetic */ rj2 b = new rj2(1);
    public static final String[] c = new String[0];
    public static final rj2 d = new rj2(3);
    public static final /* synthetic */ rj2 e = new rj2(4);
    public static final /* synthetic */ rj2 f = new rj2(5);
    public static final rj2 h = new rj2(6);
    public static final rj2 n = new rj2(7);
    public static final rj2 r = new rj2(8);
    public static final rj2 s = new rj2(9);
    public static final rj2 w = new rj2(10);
    public static final rj2 x = new rj2(11);
    public static final rj2 y = new rj2(12);
    public static final /* synthetic */ rj2 E = new rj2(13);

    public rj2() {
        this.a = (byte) 18;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static gx2 X1(Editable editable, int i) {
        gx2[] gx2VarArr = (gx2[]) editable.getSpans(0, editable.length(), gx2.class);
        if (gx2VarArr.length == 0) {
            return null;
        }
        for (int length = gx2VarArr.length; length > 0; length--) {
            int i2 = length - 1;
            if (editable.getSpanFlags(gx2VarArr[i2]) == 17) {
                gx2 gx2Var = gx2VarArr[i2];
                if (gx2Var.a == i) {
                    return gx2Var;
                }
            }
        }
        return null;
    }

    public static boolean Y1(boolean z, String str, Editable editable, Attributes attributes) {
        byte b2;
        Object obj = null;
        boolean z2 = false;
        if (str.startsWith("animated-emoji")) {
            if (z) {
                String a = fx2.a("data-document-id", attributes);
                if (a != null) {
                    editable.setSpan(new hm(Long.parseLong(a), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), hm.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i = length - 1;
                        if (editable.getSpanFlags(spans[i]) == 17) {
                            obj = spans[i];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (hm) obj;
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
            if (z) {
                editable.setSpan(new gx2(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object X1 = X1(editable, 0);
            if (X1 != null) {
                int spanStart2 = editable.getSpanStart(X1);
                editable.removeSpan(X1);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(X1, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z) {
                String a2 = fx2.a("language", attributes);
                if (a2 == null) {
                    a2 = fx2.a("lang", attributes);
                }
                if (a2 == null) {
                    a2 = fx2.a("lng", attributes);
                }
                editable.setSpan(new gx2(a2), editable.length(), editable.length(), 17);
                return true;
            }
            Object X12 = X1(editable, 1);
            if (X12 != null) {
                int spanStart3 = editable.getSpanStart(X12);
                editable.removeSpan(X12);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(X12, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z) {
                    editable.setSpan(new gx2(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object X13 = X1(editable, 3);
                if (X13 != null) {
                    int spanStart4 = editable.getSpanStart(X13);
                    editable.removeSpan(X13);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(X13, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z) {
            String a3 = fx2.a("class", attributes);
            if (fx2.a("data-collapsed", attributes) != null || (a3 != null && a3.contains("telegram-collapsed-quote"))) {
                z2 = true;
            }
            editable.setSpan(new gx2(z2 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        gx2[] gx2VarArr = (gx2[]) editable.getSpans(0, editable.length(), gx2.class);
        for (int length2 = gx2VarArr.length - 1; length2 >= 0; length2--) {
            gx2 gx2Var = gx2VarArr[length2];
            if (editable.getSpanFlags(gx2Var) == 17 && ((b2 = gx2Var.a) == 2 || b2 == 3)) {
                obj = gx2Var;
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

    @Override // rb2
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override // bl0
    public final float B0() {
        return -1.0f;
    }

    @Override // bl0
    public final float D0() {
        return -1.0f;
    }

    @Override // rb2
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // xy1
    public final int E0() {
        return 0;
    }

    @Override // xy1
    public final TL_stories.StoryItem F0() {
        return null;
    }

    @Override // rb2
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // xy1
    public final boolean H0(long j) {
        return false;
    }

    @Override // mu8
    public final void I() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // rb2
    public final de8 J1() {
        return null;
    }

    @Override // rb2
    public final boolean K() {
        return false;
    }

    @Override // xy1
    public final boolean L0() {
        return false;
    }

    @Override // rb2
    public final boolean L1(long j) {
        return false;
    }

    @Override // rb2
    public final boolean M() {
        return false;
    }

    @Override // rb2
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override // rb2
    public final int N() {
        return 0;
    }

    @Override // fzc
    public final String[] O0() {
        return c;
    }

    @Override // rb2
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override // rb2
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // bl0
    public final int Q1() {
        return 1711276032;
    }

    @Override // xy1
    public final ou1 R() {
        return null;
    }

    @Override // rb2
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override // rb2
    public final iv1 S() {
        return null;
    }

    @Override // xy1
    public final boolean T0() {
        return false;
    }

    @Override // rb2
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    @Override // rb2
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override // bl0
    public final int X() {
        return 872415231;
    }

    @Override // rb2
    public final boolean Z() {
        return false;
    }

    @Override // rb2
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override // y2c
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // rb2
    public final boolean b() {
        return false;
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        return new xld((byd) am2Var.a(byd.class), (q54) am2Var.a(q54.class));
    }

    @Override // rb2
    public final boolean c0() {
        return false;
    }

    @Override // fzc
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // xy1
    public final boolean e0() {
        return true;
    }

    @Override // xy1
    public final boolean e1() {
        return false;
    }

    @Override // mu8
    public final void f(int i, Serializable serializable) {
        String str;
        switch (i) {
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
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // xy1
    public final boolean g() {
        return false;
    }

    @Override // uw8
    public final Object get() {
        return vcc.a;
    }

    @Override // fzc
    public final StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // rb2, al1
    public final boolean h() {
        return true;
    }

    @Override // rb2
    public final boolean i1() {
        return false;
    }

    @Override // rb2
    public final boolean i2(int i) {
        return false;
    }

    @Override // xy1
    public final int j() {
        return 0;
    }

    @Override // rb2
    public final /* synthetic */ boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override // rb2
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    @Override // xy1
    public final TLRPC.Peer k() {
        return null;
    }

    @Override // rb2
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override // rb2
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override // rb2
    public final bmb l2() {
        return null;
    }

    @Override // bl0
    public final int m0() {
        return 0;
    }

    @Override // bl0
    public final float m1() {
        return 0.0f;
    }

    @Override // rb2
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // bl0
    public final int o1() {
        return 0;
    }

    @Override // j30
    public final void p0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        switch (this.a) {
            case 17:
                (i == 6 ? j30.l : i > i2 ? j30.i : i < i2 ? j30.j : j30.k).p0(shortBuffer, i, shortBuffer2, i2);
                break;
            default:
                if (i2 != 1 && i2 != 2) {
                    lq5.j("Output must be 2 or 1 channels");
                    break;
                } else {
                    int min = Math.min(shortBuffer.remaining() / i, shortBuffer2.remaining() / i2);
                    for (int i3 = 0; i3 < min; i3++) {
                        short s2 = shortBuffer.get();
                        short s3 = shortBuffer.get();
                        shortBuffer.position(shortBuffer.position() + 4);
                        if (i2 == 2) {
                            shortBuffer2.put(s2);
                            shortBuffer2.put(s3);
                        } else if (i2 == 1) {
                            shortBuffer2.put(z6f.z3(s2, s3));
                        }
                    }
                    break;
                }
        }
    }

    @Override // up5
    public final tp5 q(um4 um4Var) {
        return new vp5(um4Var);
    }

    @Override // rb2
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // j30
    public final int s1(int i, int i2, int i3) {
        switch (this.a) {
            case 17:
                return (i2 == 6 ? j30.l : i2 > i3 ? j30.i : i2 < i3 ? j30.j : j30.k).s1(i, i2, i3);
            default:
                return (i / i2) * i3;
        }
    }

    @Override // rb2
    public final String u(long j) {
        return null;
    }

    @Override // rb2
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override // yba
    public final hba v0(z3f z3fVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        h30 h30Var = jSONObject.has("session") ? new h30(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new h30(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new hba(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), h30Var, new k00(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // rb2
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override // rb2
    public final boolean w1() {
        return false;
    }

    @Override // bl0
    public final int x0() {
        return 352321535;
    }

    @Override // bl0
    public final int x1() {
        return 0;
    }

    @Override // xy1
    public final TLRPC.TL_channels_sendAsPeers y() {
        return null;
    }

    @Override // rb2
    public final boolean y0(long j) {
        return false;
    }

    @Override // h4e
    public final Object zza() {
        throw new IllegalStateException();
    }

    public /* synthetic */ rj2(byte b2) {
        this.a = b2;
    }

    @Override // xy1
    public final void B1() {
    }

    @Override // xy1
    public final void C() {
    }

    @Override // xy1
    public final void D1() {
    }

    @Override // xy1
    public final void J() {
    }

    @Override // xy1
    public final void O1() {
    }

    @Override // xy1
    public final void P1() {
    }

    @Override // rb2
    public final void Q0() {
    }

    @Override // xy1
    public final void S0() {
    }

    @Override // xy1
    public final void S1() {
    }

    @Override // xy1
    public final void V() {
    }

    @Override // xy1
    public final void W0() {
    }

    @Override // xy1
    public final void X0() {
    }

    @Override // xy1
    public final void Z0() {
    }

    @Override // xy1
    public final void a() {
    }

    @Override // rb2
    public final void d() {
    }

    @Override // rb2
    public final void d2() {
    }

    @Override // xy1
    public final void e() {
    }

    @Override // xy1
    public final void f0() {
    }

    @Override // xy1
    public final void g1() {
    }

    @Override // rb2
    public final void i() {
    }

    @Override // xy1
    public final void i0() {
    }

    @Override // rb2
    public final void k2() {
    }

    @Override // xy1
    public final void n() {
    }

    @Override // xy1
    public final void p1() {
    }

    @Override // rb2
    public final void r() {
    }

    @Override // rb2
    public final void r0() {
    }

    @Override // xy1
    public final void s() {
    }

    @Override // xy1
    public final void t0() {
    }

    @Override // xy1
    public final void w() {
    }

    @Override // rb2
    public final void z1() {
    }

    @Override // rb2
    public final void A(wb2 wb2Var) {
    }

    @Override // rb2
    public final void C0(wb2 wb2Var) {
    }

    @Override // xy1
    public final void C1(int i) {
    }

    @Override // xy1
    public final void D(boolean z) {
    }

    @Override // xy1
    public final void E1(boolean z) {
    }

    @Override // rb2
    public final void G(wb2 wb2Var) {
    }

    @Override // rb2
    public final void G1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void I1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void J0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void O(wb2 wb2Var) {
    }

    @Override // rb2
    public final void Q(wb2 wb2Var) {
    }

    @Override // rb2
    public final void T(r47 r47Var) {
    }

    @Override // rb2
    public final void U0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void Y(int i) {
    }

    @Override // rb2
    public final void Y0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void a1(wb2 wb2Var) {
    }

    @Override // e30
    public final void c(String str) {
    }

    @Override // rb2
    public final void d0(r47 r47Var) {
    }

    @Override // xy1
    public final void d1(CharSequence charSequence) {
    }

    @Override // rb2
    public final void e2(wb2 wb2Var) {
    }

    @Override // rb2
    public final void g0(String str) {
    }

    @Override // rb2
    public final void h1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void j0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void l(wb2 wb2Var) {
    }

    @Override // rb2
    public final void m2(wb2 wb2Var) {
    }

    @Override // rb2
    public final void n1(o47 o47Var) {
    }

    @Override // xy1
    public final void o(float f2) {
    }

    @Override // xy1
    public final void p(boolean z) {
    }

    @Override // rb2
    public final void v1(wb2 wb2Var) {
    }

    @Override // xy1
    public final void z0(int i) {
    }

    @Override // rb2
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override // xy1
    public final void B(float f2, int i) {
    }

    @Override // rb2
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void K1(String str, String str2) {
    }

    @Override // rb2
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override // rb2
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // rb2
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // rb2
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override // rb2
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override // rb2
    public final void q1(wb2 wb2Var, int i) {
    }

    @Override // e30
    public final void t(String str, Throwable th) {
    }

    @Override // rb2
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override // rb2
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override // rb2
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // rb2
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override // rb2
    public final void K0(wb2 wb2Var, float f2, float f3) {
    }

    @Override // rb2
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // xy1
    public final void R0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void a2(wb2 wb2Var, float f2, float f3) {
    }

    @Override // xy1
    public final void b1(View view, CharSequence charSequence, boolean z) {
    }

    @Override // rb2
    public final void f1(wb2 wb2Var, float f2, float f3) {
    }

    @Override // rb2
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override // rb2
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void v(wb2 wb2Var, float f2, float f3) {
    }

    @Override // rb2
    public final void W(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override // rb2
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // rb2
    public final void q0(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    @Override // rb2
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // rb2
    public final void H(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override // rb2
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override // rb2
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override // xy1
    public final void x(CharSequence charSequence, boolean z, int i, int i2, long j) {
    }

    @Override // xy1
    public final void H1(int i, int i2, int i3, long j, long j2, boolean z) {
    }

    @Override // rb2
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override // rb2
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
