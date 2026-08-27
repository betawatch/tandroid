package xa;

import af.h;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import fh.f;
import h3.t0;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import l3.i;
import l3.j;
import l3.l;
import m3.m;
import m3.t;
import m3.w;
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
import org.telegram.ui.Components.t5;
import org.telegram.ui.ou0;
import org.telegram.ui.z51;
import r0.s;
import t2.e;
import w1.b;
import y5.k;
import z8.d;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements d9.a, Continuation, ff.a, z51, kf.a, j, lf.a, m, e, oa.m, j1, s, s0, d, k {
    public static a b;
    public static a c;
    public static volatile a d;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static short q3(short s10, short s11) {
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    @Override // m3.m
    public void A() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // m3.m
    public w C(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C0() {
        int i10 = this.a;
    }

    @Override // kf.a
    public int C1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // kf.a
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(q3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        we.e.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle F1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public void G0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ou0 O1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(s1 s1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y0(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a1(MessageObject messageObject) {
        int i10 = this.a;
        return rl.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(s1 s1Var, f fVar) {
        int i10 = this.a;
    }

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        return ((w3) obj).a();
    }

    @Override // ff.a
    public boolean b(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int b0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // y5.k
    public /* bridge */ /* synthetic */ Object c(q qVar) {
        return null;
    }

    @Override // lf.a
    public void c0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ qg.a d0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 e(Class cls) {
        return new b();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e0(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f0(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // oa.m
    public Object f2() {
        switch (this.a) {
            case 16:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // l3.j
    public /* synthetic */ i g(b6.a aVar, t0 t0Var) {
        return i.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h2() {
        int i10 = this.a;
    }

    @Override // ff.a
    public boolean i(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // l3.j
    public l3.f l(b6.a aVar, t0 t0Var) {
        if (t0Var.E == null) {
            return null;
        }
        return new k5.i(new l3.e(new l(), 6001), 22);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int l0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // l3.j
    public int m(t0 t0Var) {
        return t0Var.E != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m2() {
        int i10 = this.a;
    }

    @Override // m3.m
    public void n(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ k9 o2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
        int i10 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 r(Class cls, v1.b bVar) {
        return e(cls);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(String str) {
        int i10 = this.a;
    }

    @Override // d9.a
    public void s(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s0(t5 t5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u() {
        int i10 = this.a;
    }

    @Override // z8.d
    public Object u0(h hVar) {
        return new za.d(hVar.e(za.h.class));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v1(s1 s1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x0(s1 s1Var, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean x1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String z(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z1() {
        switch (this.a) {
        }
        return false;
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void G() {
    }

    private final /* synthetic */ void G2() {
    }

    private final /* synthetic */ void H2() {
    }

    private final /* synthetic */ void I() {
    }

    private final /* synthetic */ void S() {
    }

    private final /* synthetic */ void W1() {
    }

    private final /* synthetic */ void X1() {
    }

    private final /* synthetic */ void a0() {
    }

    private final /* synthetic */ void o3() {
    }

    private final /* synthetic */ void p3() {
    }

    private final /* synthetic */ void t3() {
    }

    private final /* synthetic */ void u3() {
    }

    private final /* synthetic */ void x3() {
    }

    private final /* synthetic */ void y3() {
    }

    @Override // l3.j
    public /* synthetic */ void a() {
    }

    @Override // l3.j
    public /* synthetic */ void release() {
    }

    private final /* synthetic */ void A1(s1 s1Var) {
    }

    private final /* synthetic */ void A2(s1 s1Var) {
    }

    private final /* synthetic */ void A3(MessageObject messageObject) {
    }

    private final /* synthetic */ void B2(s1 s1Var) {
    }

    private final /* synthetic */ void E2(s1 s1Var) {
    }

    private final /* synthetic */ void F2(s1 s1Var) {
    }

    private final /* synthetic */ void J(s1 s1Var) {
    }

    private final /* synthetic */ void J1(s1 s1Var) {
    }

    private final /* synthetic */ void K(s1 s1Var) {
    }

    private final /* synthetic */ void N(s1 s1Var) {
    }

    private final /* synthetic */ void N0(s1 s1Var) {
    }

    private final /* synthetic */ void N1(s1 s1Var) {
    }

    private final /* synthetic */ void O2(String str) {
    }

    private final /* synthetic */ void P(s1 s1Var) {
    }

    private final /* synthetic */ void P0(s1 s1Var) {
    }

    private final /* synthetic */ void P2(String str) {
    }

    private final /* synthetic */ void T0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void U2(s1 s1Var) {
    }

    private final /* synthetic */ void V0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void V2(s1 s1Var) {
    }

    private final /* synthetic */ void X0(s1 s1Var) {
    }

    private final /* synthetic */ void Y2(s1 s1Var) {
    }

    private final /* synthetic */ void Z0(s1 s1Var) {
    }

    private final /* synthetic */ void Z2(s1 s1Var) {
    }

    private final /* synthetic */ void a3(MessageObject messageObject) {
    }

    private final /* synthetic */ void b3(MessageObject messageObject) {
    }

    private final /* synthetic */ void c3(s1 s1Var) {
    }

    private final /* synthetic */ void d3(s1 s1Var) {
    }

    private final /* synthetic */ void f1(s1 s1Var) {
    }

    private final /* synthetic */ void g0(s1 s1Var) {
    }

    private final /* synthetic */ void g1(s1 s1Var) {
    }

    private final /* synthetic */ void g3(s1 s1Var) {
    }

    private final /* synthetic */ void h0(s1 s1Var) {
    }

    private final /* synthetic */ void h3(s1 s1Var) {
    }

    private final void i3(s1 s1Var) {
    }

    private final /* synthetic */ void k1(s1 s1Var) {
    }

    private final void k3(s1 s1Var) {
    }

    private final /* synthetic */ void l1(s1 s1Var) {
    }

    private final /* synthetic */ void m3(s1 s1Var) {
    }

    private final /* synthetic */ void n3(s1 s1Var) {
    }

    private final /* synthetic */ void q0(s1 s1Var) {
    }

    private final /* synthetic */ void s2(s1 s1Var) {
    }

    private final /* synthetic */ void t2(s1 s1Var) {
    }

    private final /* synthetic */ void v3(int i10) {
    }

    private final /* synthetic */ void w0(s1 s1Var) {
    }

    private final /* synthetic */ void w1(s1 s1Var) {
    }

    private final /* synthetic */ void w2(s1 s1Var) {
    }

    private final /* synthetic */ void w3(int i10) {
    }

    private final /* synthetic */ void x2(s1 s1Var) {
    }

    private final /* synthetic */ void y2(s1 s1Var) {
    }

    private final /* synthetic */ void z2(s1 s1Var) {
    }

    private final /* synthetic */ void z3(MessageObject messageObject) {
    }

    private final /* synthetic */ void E(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void F(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Q2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void R2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void T1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void U1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void b1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void c1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void e3(s1 s1Var, f fVar) {
    }

    private final /* synthetic */ void f3(s1 s1Var, f fVar) {
    }

    private final /* synthetic */ void i1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void j1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void j3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void l3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void n0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void o0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void p1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void q1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void r1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void t1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void u2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void v2(s1 s1Var, TLRPC.Document document) {
    }

    @Override // l3.j
    public void w(Looper looper, i3.k kVar) {
    }

    private final /* synthetic */ void B(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void C2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void D2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void I0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void I2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void J2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void K0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void W2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void X2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void Y1(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void e2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void n1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void o1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void y(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void K2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void L2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void M2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void N2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void P1(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void S1(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void g2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void j2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.s
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.s
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final /* synthetic */ void S2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void T2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void l2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void p2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void q2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void r2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void y0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void z0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void s3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
