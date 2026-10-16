package pb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.l0;
import androidx.lifecycle.s0;
import b2.p0;
import c3.b0;
import c3.i0;
import c3.q;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import ef.b;
import gb.p;
import j9.v;
import j9.y;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.ee;
import org.telegram.ui.vv0;
import org.xml.sax.Attributes;
import p2.s;
import p2.t;
import qi.i;
import r4.c;
import r9.d;
import rb.h;
import t7.o;
import t7.u;
import v2.m;
import v7.q8;
import x3.g;
import y2.n;
import y6.e;
import zf.k;
import zf.l;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class a implements s0, q, cg.a, dg.a, b, p, eh.a, d, fp0, l1, t, i, c, Continuation, u5.a, m, g, y6.c, y2.i {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static l m0(Editable editable, int i10) {
        l[] lVarArr = (l[]) editable.getSpans(0, editable.length(), l.class);
        if (lVarArr.length == 0) {
            return null;
        }
        for (int length = lVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(lVarArr[i11]) == 17) {
                l lVar = lVarArr[i11];
                if (lVar.a == i10) {
                    return lVar;
                }
            }
        }
        return null;
    }

    public static boolean r0(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = k.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new b6(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), b6.class);
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
                Object obj2 = (b6) obj;
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
                editable.setSpan(new l(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object m0 = m0(editable, 0);
            if (m0 != null) {
                int spanStart2 = editable.getSpanStart(m0);
                editable.removeSpan(m0);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(m0, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a10 = k.a("language", attributes);
                if (a10 == null) {
                    a10 = k.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = k.a("lng", attributes);
                }
                editable.setSpan(new l(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object m02 = m0(editable, 1);
            if (m02 != null) {
                int spanStart3 = editable.getSpanStart(m02);
                editable.removeSpan(m02);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(m02, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new l(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object m03 = m0(editable, 3);
                if (m03 != null) {
                    int spanStart4 = editable.getSpanStart(m03);
                    editable.removeSpan(m03);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(m03, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a11 = k.a("class", attributes);
            if (k.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new l(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        l[] lVarArr = (l[]) editable.getSpans(0, editable.length(), l.class);
        for (int length2 = lVarArr.length - 1; length2 >= 0; length2--) {
            l lVar = lVarArr[length2];
            if (editable.getSpanFlags(lVar) == 17 && ((i10 = lVar.a) == 2 || i10 == 3)) {
                obj = lVar;
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

    public static y s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                v vVar = new v();
                vVar.n(unsupportedOperationException);
                return vVar;
            }
        }
        return q8.b(list);
    }

    @Override // dg.a
    public void A(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean C1() {
        return false;
    }

    @Override // ef.b
    public ef.a F(qf.b bVar) {
        return new af.m(bVar);
    }

    @Override // cg.a
    public int F1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // y6.c
    public int H(Context context, String str) {
        return e.a(context, str);
    }

    @Override // eh.a
    public int J() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle K1(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        return false;
    }

    @Override // cg.a
    public void Q0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(u.L3(s10, s11));
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vv0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(long j10) {
        return false;
    }

    @Override // p2.t
    public n U() {
        return new s(p2.p.n, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // c3.q
    public i0 W(int i10, int i11) {
        return new c3.n();
    }

    @Override // org.telegram.ui.Components.fp0
    public void X(float f7, boolean z10) {
        ee.b = f7 * 2.0f;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 X0(Class cls, v1.c cVar) {
        return f(cls);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ih.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(u1 u1Var) {
        return false;
    }

    @Override // y2.i
    public void a() {
        synchronized (z2.b.a) {
            Object obj = z2.b.b;
            synchronized (obj) {
                if (z2.b.c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.c = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a1(int i10, u1 u1Var) {
        return false;
    }

    @Override // u5.a
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p2.t
    public n b0(p2.p pVar, p2.m mVar) {
        return new s(pVar, mVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // v2.m
    public long d() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 f(Class cls) {
        return new l0(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // r4.c
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        return 0;
    }

    @Override // gb.p
    public Object i2() {
        switch (this.a) {
            case 9:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // eh.a
    public int j0() {
        return 1711276032;
    }

    @Override // eh.a
    public int k() {
        return 872415231;
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // x3.g
    public long l(c3.p pVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // r9.d
    public Object n2(z5 z5Var) {
        switch (this.a) {
            case 15:
                return new h();
            case 16:
                synchronized (t7.s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                    t7.s.c(new o());
                }
                return new a(0);
            default:
                return new rb.k((Context) z5Var.a(Context.class));
        }
    }

    @Override // v2.m
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(b6 b6Var) {
        return false;
    }

    @Override // r4.c
    public void p(int i10, Object obj) {
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

    public Signature[] p0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(int i10) {
        return false;
    }

    @Override // y6.c
    public int q(Context context, String str, boolean z10) {
        return e.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 t2() {
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override // v2.m
    public long v() {
        throw new NoSuchElementException();
    }

    @Override // eh.a
    public int w() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // x3.g
    public b0 y() {
        return new c3.t(-9223372036854775807L);
    }

    public a() {
        this.a = 11;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // c3.q
    public void D() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O1() {
    }

    @Override // y2.i
    public void a0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.fp0
    public void z() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // c3.q
    public void K(b0 b0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(u1 u1Var) {
    }

    @Override // x3.g
    public void g0(long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(u1 u1Var) {
    }

    @Override // qi.i
    public void log(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(u1 u1Var, long j10) {
    }

    @Override // qi.i
    public void error(String str, Throwable th2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l1(u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
