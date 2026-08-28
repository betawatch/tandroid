package za;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnFailureListener;
import eh.f;
import f9.c;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import l9.b;
import m3.m;
import m3.t;
import m3.w;
import na.n;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.t5;
import org.telegram.ui.nu0;
import t2.e;
import x5.k;
import y8.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class a implements s0, d, c, i6.d, jf.a, kf.a, b, m, e, n, k1, lg.a, k, OnFailureListener {
    public static a b;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }

    public static l9.a n(ya.b bVar) {
        return new l9.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ib.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static Calendar p3() {
        if (b == null) {
            b = new a(6);
        }
        b.getClass();
        return Calendar.getInstance();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // m3.m
    public void B() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0() {
        int i9 = this.a;
    }

    @Override // jf.a
    public int B1(int i9, int i10, int i11) {
        return (i9 / i10) * i11;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String C(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(MessageObject messageObject) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i9 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle E1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void F0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // jf.a
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i9, shortBuffer2.remaining() / i10);
        for (int i11 = 0; i11 < min; i11++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i10 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i10 == 1) {
                shortBuffer2.put(wa.a.B3(s10, s11));
            }
        }
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        switch (this.a) {
            case 3:
                return new bb.a();
            case 23:
                return new xa.c(bVar.x(xa.b.class));
            default:
                return new xa.b(bVar.e(wa.a.class));
        }
    }

    @Override // m3.m
    public w I(int i9, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // i6.d
    public a8.b K(Context context, String str, i6.c cVar) {
        a8.b bVar = new a8.b();
        int k10 = cVar.k(context, str, true);
        bVar.b = k10;
        if (k10 != 0) {
            bVar.c = 1;
            return bVar;
        }
        int H = cVar.H(context, str);
        bVar.a = H;
        if (H != 0) {
            bVar.c = -1;
        }
        return bVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(int i9, t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ nu0 P1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(int i9, t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(MessageObject messageObject) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(int i9, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // na.n
    public Object Y1() {
        switch (this.a) {
            case 16:
                return new ArrayList();
            default:
                return new na.m(true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(MessageObject messageObject) {
        int i9 = this.a;
        return ll.a(messageObject);
    }

    @Override // androidx.lifecycle.s0
    public p0 a(Class cls) {
        return new m0(true);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int b0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // f9.c
    public String c() {
        return null;
    }

    @Override // x5.k
    public /* bridge */ /* synthetic */ Object d(q qVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pg.a d0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1() {
        int i9 = this.a;
    }

    @Override // lg.a
    public int e() {
        return 872415231;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean f() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // lg.a
    public int g() {
        return 352321535;
    }

    @Override // kf.a
    public void g0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i9 != i10) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TLRPC.Document document) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public /* synthetic */ boolean h() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String i(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(int i9) {
        int i10 = this.a;
    }

    @Override // lg.a
    public int j() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // lg.a
    public int k() {
        return 1711276032;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k0(t1 t1Var, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int l0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n2(int i9) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 o(Class cls, v1.b bVar) {
        return a(cls);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean o0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
        int i9 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i9, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(String str) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ o9 q2() {
        switch (this.a) {
        }
        return null;
    }

    public Signature[] q3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r0(t5 t5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // l9.b
    public l9.a t(ya.b bVar, JSONObject jSONObject) {
        return n(bVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, boolean z10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f10, float f11, boolean z10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, f fVar) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // m3.m
    public void y(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        switch (this.a) {
        }
        return false;
    }

    private final /* synthetic */ void A3() {
    }

    private final /* synthetic */ void D3() {
    }

    private final /* synthetic */ void E() {
    }

    private final /* synthetic */ void E3() {
    }

    private final /* synthetic */ void G() {
    }

    private final /* synthetic */ void H2() {
    }

    private final /* synthetic */ void I2() {
    }

    private final /* synthetic */ void T() {
    }

    private final /* synthetic */ void Z1() {
    }

    private final /* synthetic */ void a2() {
    }

    private final /* synthetic */ void c0() {
    }

    private final /* synthetic */ void r3() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void v3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void z3() {
    }

    @Override // f9.c
    public void b() {
    }

    private final /* synthetic */ void A2(t1 t1Var) {
    }

    private final /* synthetic */ void B2(t1 t1Var) {
    }

    private final /* synthetic */ void B3(MessageObject messageObject) {
    }

    private final /* synthetic */ void C2(t1 t1Var) {
    }

    private final /* synthetic */ void C3(MessageObject messageObject) {
    }

    private final /* synthetic */ void F2(t1 t1Var) {
    }

    private final /* synthetic */ void G2(t1 t1Var) {
    }

    private final /* synthetic */ void H(t1 t1Var) {
    }

    private final /* synthetic */ void J1(t1 t1Var) {
    }

    private final /* synthetic */ void K1(t1 t1Var) {
    }

    private final /* synthetic */ void L(t1 t1Var) {
    }

    private final /* synthetic */ void N0(t1 t1Var) {
    }

    private final /* synthetic */ void N1(t1 t1Var) {
    }

    private final /* synthetic */ void O(t1 t1Var) {
    }

    private final /* synthetic */ void P0(t1 t1Var) {
    }

    private final /* synthetic */ void P2(String str) {
    }

    private final /* synthetic */ void Q(t1 t1Var) {
    }

    private final /* synthetic */ void Q1(t1 t1Var) {
    }

    private final /* synthetic */ void Q2(String str) {
    }

    private final /* synthetic */ void T0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void V0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void V2(t1 t1Var) {
    }

    private final /* synthetic */ void W2(t1 t1Var) {
    }

    private final /* synthetic */ void X0(t1 t1Var) {
    }

    private final /* synthetic */ void Z2(t1 t1Var) {
    }

    private final /* synthetic */ void a1(t1 t1Var) {
    }

    private final /* synthetic */ void a3(t1 t1Var) {
    }

    private final /* synthetic */ void b3(MessageObject messageObject) {
    }

    private final /* synthetic */ void c3(MessageObject messageObject) {
    }

    private final /* synthetic */ void d3(t1 t1Var) {
    }

    private final /* synthetic */ void e3(t1 t1Var) {
    }

    private final /* synthetic */ void f1(t1 t1Var) {
    }

    private final /* synthetic */ void h0(t1 t1Var) {
    }

    private final /* synthetic */ void h1(t1 t1Var) {
    }

    private final /* synthetic */ void h3(t1 t1Var) {
    }

    private final /* synthetic */ void i3(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final /* synthetic */ void k1(t1 t1Var) {
    }

    private final void l3(t1 t1Var) {
    }

    private final /* synthetic */ void m1(t1 t1Var) {
    }

    private final /* synthetic */ void n0(t1 t1Var) {
    }

    private final /* synthetic */ void n3(t1 t1Var) {
    }

    private final /* synthetic */ void o3(t1 t1Var) {
    }

    private final /* synthetic */ void t2(t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var) {
    }

    private final /* synthetic */ void v0(t1 t1Var) {
    }

    private final /* synthetic */ void x0(t1 t1Var) {
    }

    private final /* synthetic */ void x2(t1 t1Var) {
    }

    private final /* synthetic */ void x3(int i9) {
    }

    private final /* synthetic */ void y2(t1 t1Var) {
    }

    private final /* synthetic */ void y3(int i9) {
    }

    private final /* synthetic */ void z2(t1 t1Var) {
    }

    private final /* synthetic */ void A(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void D(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void R2(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void S2(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void V1(int i9, t1 t1Var) {
    }

    private final /* synthetic */ void X1(int i9, t1 t1Var) {
    }

    private final /* synthetic */ void b1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void c1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void f3(t1 t1Var, f fVar) {
    }

    private final /* synthetic */ void g3(t1 t1Var, f fVar) {
    }

    private final /* synthetic */ void i1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void j1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void k3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void m3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void p0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void p1(int i9, t1 t1Var) {
    }

    private final /* synthetic */ void q1(int i9, t1 t1Var) {
    }

    private final /* synthetic */ void t0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void u1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void v1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void v2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void w2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void D2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void E2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void J0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void J2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void K2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void L0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void X2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void Y2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void c2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void d2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void n1(t1 t1Var, int i9, int i10) {
    }

    private final /* synthetic */ void o1(t1 t1Var, int i9, int i10) {
    }

    private final /* synthetic */ void p(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void u(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void L2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void M2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void N2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void O2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void T1(t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void U1(t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void h2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final /* synthetic */ void i2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final /* synthetic */ void T2(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final /* synthetic */ void U2(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final /* synthetic */ void j2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void m2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void r2(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void s2(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void C0(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void y0(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    private final /* synthetic */ void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
