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
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.o0;
import c3.c0;
import c3.j0;
import c3.p;
import c3.q;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import ef.b;
import gb.n;
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
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.xu0;
import org.xml.sax.Attributes;
import p2.t;
import p2.u;
import r0.r;
import r9.d;
import ri.h;
import t7.o;
import t7.s;
import v2.m;
import v7.q8;
import x3.g;
import y2.i;
import y6.c;
import y6.e;
import zf.j;
import zf.k;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class a implements s0, q, cg.a, dg.a, b, n, eh.a, d, bp0, l1, u, r, h, Continuation, u5.a, m, g, c, i {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static k b0(Editable editable, int i10) {
        k[] kVarArr = (k[]) editable.getSpans(0, editable.length(), k.class);
        if (kVarArr.length == 0) {
            return null;
        }
        for (int length = kVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(kVarArr[i11]) == 17) {
                k kVar = kVarArr[i11];
                if (kVar.a == i10) {
                    return kVar;
                }
            }
        }
        return null;
    }

    public static boolean m0(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = j.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new a6(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), a6.class);
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
                Object obj2 = (a6) obj;
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
                editable.setSpan(new k(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object b02 = b0(editable, 0);
            if (b02 != null) {
                int spanStart2 = editable.getSpanStart(b02);
                editable.removeSpan(b02);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(b02, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a10 = j.a("language", attributes);
                if (a10 == null) {
                    a10 = j.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = j.a("lng", attributes);
                }
                editable.setSpan(new k(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object b03 = b0(editable, 1);
            if (b03 != null) {
                int spanStart3 = editable.getSpanStart(b03);
                editable.removeSpan(b03);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(b03, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new k(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object b04 = b0(editable, 3);
                if (b04 != null) {
                    int spanStart4 = editable.getSpanStart(b04);
                    editable.removeSpan(b04);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(b04, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a11 = j.a("class", attributes);
            if (j.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new k(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        k[] kVarArr = (k[]) editable.getSpans(0, editable.length(), k.class);
        for (int length2 = kVarArr.length - 1; length2 >= 0; length2--) {
            k kVar = kVarArr[length2];
            if (editable.getSpanFlags(kVar) == 17 && ((i10 = kVar.a) == 2 || i10 == 3)) {
                obj = kVar;
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

    public static y p0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((o0) it.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                v vVar = new v();
                vVar.n(unsupportedOperationException);
                return vVar;
            }
        }
        return q8.b(list);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // dg.a
    public void C(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // eh.a
    public int E() {
        return 0;
    }

    @Override // cg.a
    public int E1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // org.telegram.ui.Cells.l1
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle H1(u1 u1Var) {
        return null;
    }

    @Override // p2.u
    public y2.n J() {
        return new t(p2.q.n, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.bp0
    public void L(float f7, boolean z10) {
        ai.r.b = f7 * 2.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // cg.a
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
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
                shortBuffer2.put(t7.u.L3(s10, s11));
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ xu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // p2.u
    public y2.n U(p2.q qVar, p2.n nVar) {
        return new t(qVar, nVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ih.a W() {
        return null;
    }

    @Override // androidx.lifecycle.s0
    public p0 W0(Class cls, v1.b bVar) {
        return f(cls);
    }

    @Override // org.telegram.ui.Components.bp0
    public /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z0(int i10, u1 u1Var) {
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

    @Override // eh.a
    public int a0() {
        return 1711276032;
    }

    @Override // v2.m
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // u5.a
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 f(Class cls) {
        return new m0(true);
    }

    @Override // gb.n
    public Object f2() {
        switch (this.a) {
            case 9:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.bp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // eh.a
    public int h() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        return 0;
    }

    @Override // c3.q
    public j0 j0(int i10, int i11) {
        return new c3.n();
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        switch (this.a) {
            case 15:
                return new rb.h();
            default:
                synchronized (s.class) {
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
                    s.c(new o());
                }
                return new a(0);
        }
    }

    @Override // x3.g
    public long k(p pVar) {
        return -1L;
    }

    public Signature[] k0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(int i10) {
        return false;
    }

    @Override // v2.m
    public boolean next() {
        return false;
    }

    @Override // y6.c
    public int o(Context context, String str, boolean z10) {
        return e.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(a6 a6Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ o9 p2() {
        return null;
    }

    @Override // v2.m
    public long r() {
        throw new NoSuchElementException();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }

    @Override // eh.a
    public int u() {
        return 352321535;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // x3.g
    public c0 x() {
        return new c3.t(-9223372036854775807L);
    }

    @Override // ef.b
    public ef.a y(qf.b bVar) {
        return new af.m(bVar);
    }

    @Override // y6.c
    public int z(Context context, String str) {
        return e.a(context, str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public a() {
        this.a = 11;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // c3.q
    public void H() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1() {
    }

    @Override // y2.i
    public void O() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.bp0
    public void v() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void C0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(u1 u1Var) {
    }

    @Override // x3.g
    public void X(long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // c3.q
    public void g0(c0 c0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(u1 u1Var) {
    }

    @Override // ri.h
    public void log(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M0(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(u1 u1Var, long j10) {
    }

    @Override // ri.h
    public void error(String str, Throwable th2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2(u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.r
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.r
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
