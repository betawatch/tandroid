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
import c3.e0;
import c3.l0;
import c3.p;
import c3.s;
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
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.yu0;
import org.xml.sax.Attributes;
import p2.q;
import p2.t;
import p2.u;
import r0.r;
import r9.d;
import rb.h;
import ri.g;
import t7.o;
import v2.m;
import v7.q8;
import y2.i;
import y6.c;
import y6.e;
import zf.j;
import zf.k;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class a implements s0, s, cg.a, dg.a, b, n, eh.a, d, gp0, k1, u, r, g, Continuation, u5.a, m, x3.g, c, i {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // ef.b
    public ef.a E(qf.b bVar) {
        return new af.m(bVar);
    }

    @Override // cg.a
    public int E1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override // eh.a
    public int H() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override // p2.u
    public y2.n J() {
        return new t(q.n, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.gp0
    public void L(float f7, boolean z10) {
        ai.r.b = f7 * 2.0f;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ yu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // p2.u
    public y2.n U(q qVar, p2.n nVar) {
        return new t(qVar, nVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a W() {
        return null;
    }

    @Override // androidx.lifecycle.s0
    public p0 W0(Class cls, v1.b bVar) {
        return c(cls);
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(int i10, t1 t1Var) {
        return false;
    }

    @Override // y2.i
    public void a() {
        synchronized (z2.c.a) {
            Object obj = z2.c.b;
            synchronized (obj) {
                if (z2.c.c) {
                    return;
                }
                long a2 = z2.c.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.c.d = a2;
                    z2.c.c = true;
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 c(Class cls) {
        return new m0(true);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // u5.a
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        return b1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // eh.a
    public int h() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        return 0;
    }

    @Override // c3.s
    public l0 j0(int i10, int i11) {
        return new p();
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        switch (this.a) {
            case 15:
                return new h();
            default:
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
        }
    }

    @Override // x3.g
    public long k(c3.r rVar) {
        return -1L;
    }

    public Signature[] k0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(a6 a6Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ p9 p2() {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // x3.g
    public e0 x() {
        return new c3.v(-9223372036854775807L);
    }

    @Override // y6.c
    public int y(Context context, String str) {
        return e.a(context, str);
    }

    @Override // dg.a
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public a() {
        this.a = 11;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // c3.s
    public void C() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
    }

    @Override // y2.i
    public void O() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.gp0
    public void v() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void C0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var) {
    }

    @Override // x3.g
    public void X(long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // c3.s
    public void g0(e0 e0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
    }

    @Override // ri.g
    public void log(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var, long j10) {
    }

    @Override // ri.g
    public void error(String str, Throwable th2) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.r
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.r
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
