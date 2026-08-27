package za;

import android.net.Uri;
import android.text.style.CharacterStyle;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d5.g0;
import e7.v;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executors;
import m3.t;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.t5;
import org.telegram.ui.ou0;
import w3.b0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements y2.b, z8.d, e2.c, SuccessContinuation, g9.c, kf.a, l4.l, lf.a, s0, oa.m, pn0, j1, p4.q, ei, v3.g, y3.j {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static String B(jc.c cVar) {
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

    public static final CharSequence C(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // kf.a
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.j1
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle F1(s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ boolean N0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ou0 O1() {
        return null;
    }

    @Override // org.telegram.ui.Components.pn0
    public void P(float f10, boolean z10) {
        hh.m.b = f10 * 2.0f;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // p4.q
    public s0 U1() {
        return new p4.p(p4.m.n, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y0(int i10, s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.pn0
    public /* synthetic */ int a0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a1(MessageObject messageObject) {
        return rl.a(messageObject);
    }

    @Override // v3.g
    public long b(m3.l lVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // g9.c
    public String c() {
        return null;
    }

    @Override // lf.a
    public void c0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(i0.a.k(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f10 = remaining;
        float f11 = f10 / f10;
        float f12 = ceil;
        float f13 = f12 / f12;
        while (remaining > 0 && ceil > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f11 = remaining / f10;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f13 = ceil / f12;
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ qg.a d0() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.s0
    public Object e(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        return Long.valueOf(g0.K(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e0(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // oa.m
    public Object f2() {
        switch (this.a) {
            case 16:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // l4.l
    public long g() {
        throw new NoSuchElementException();
    }

    @Override // oc.a
    public Object get() {
        switch (this.a) {
            case 2:
                w9.d dVar = new w9.d(6);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(t2.d.a, new c3.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(t2.d.c, new c3.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(c3.c.b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(t2.d.b, new c3.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < t2.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new c3.a(dVar, hashMap);
            default:
                return new g6.a(Executors.newSingleThreadExecutor());
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(s1 s1Var) {
        return null;
    }

    @Override // l4.l
    public long i() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k2(int i10) {
        return false;
    }

    @Override // v3.g
    public t l() {
        return new m3.o(-9223372036854775807L);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int l0(s1 s1Var) {
        return 0;
    }

    @Override // l4.l
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ k9 o2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s0(t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s1() {
        return false;
    }

    @Override // y3.j
    public y3.k t1(y3.i iVar) {
        int i10 = g0.a;
        if (i10 < 23 || i10 < 31) {
            return new v(26).t1(iVar);
        }
        int g10 = d5.q.g(iVar.c.B);
        d5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + g0.B(g10));
        return new b0(g10).t1(iVar);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // z8.d
    public Object u0(af.h hVar) {
        switch (this.a) {
            case 3:
                return new cb.a();
            default:
                a aVar = new a();
                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(6);
                ReferenceQueue referenceQueue = aVar.a;
                Set set = aVar.b;
                set.add(new l(aVar, referenceQueue, set, nVar));
                Thread thread = new Thread(new o0.m(10, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean x1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public void y(sg sgVar) {
        sgVar.run();
    }

    @Override // p4.q
    public s0 y0(p4.m mVar, p4.j jVar) {
        return new p4.p(mVar, jVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String z(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1() {
    }

    @Override // g9.c
    public void a() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
    }

    @Override // e2.c
    public void m() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.pn0
    public void r() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void w() {
    }

    @Override // v3.g
    public void A(long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void G0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void I(Object obj) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void g0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O0(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(s1 s1Var, fh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // e2.c
    public void n(int i10, Object obj) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v1(s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // kf.a
    public int C1(int i10, int i11, int i12) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x0(s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ei
    public void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
