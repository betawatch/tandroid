package sa;

import a8.r7;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import f3.b0;
import f3.i0;
import f3.n;
import f3.q;
import j$.util.Objects;
import j2.t;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import m2.i;
import org.telegram.messenger.dj;
import org.telegram.messenger.gj;
import org.telegram.messenger.j10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y5;
import org.telegram.ui.fr0;
import org.telegram.ui.r11;
import org.telegram.ui.rm;
import org.telegram.utils.twidget.d1;
import org.telegram.utils.twidget.k0;
import org.telegram.utils.twidget.n0;
import q2.j;
import q2.l;
import q2.m;
import q2.x;
import u2.u;
import w7.o;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class d implements SuccessContinuation, b7.c, r11, eg.a, q, fg.a, j2.g, Continuation, u9.d, si, ng, gh.a, m1, m, u, y2.m, yi.f {
    public static final /* synthetic */ d b = new d(13);
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    public static void D2(d1 d1Var, boolean z10) {
        rk0 rk0Var;
        k0 h = n0.h(d1Var);
        StringBuilder sb2 = new StringBuilder("widget ");
        sb2.append(d1Var.a);
        sb2.append(": engine process died");
        p5.c.s(z10 ? ", restarting" : "", sb2);
        if (!z10 || h == null || (rk0Var = h.w) == null || !rk0Var.f0 || rk0Var.Y == null) {
            return;
        }
        rk0Var.s0();
        rk0Var.r0();
    }

    public static void E2(String str) {
        if (str == null || str.length() == 0) {
            throw new tc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new tc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static final CharSequence F2(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // gh.a
    public int A2() {
        return 0;
    }

    @Override // b7.c
    public int C(Context context, String str) {
        return b7.f.a(context, str);
    }

    public boolean C2(CharSequence charSequence) {
        return false;
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean E0() {
        return true;
    }

    @Override // q2.m
    public int E1(e2.u uVar) {
        return uVar.w != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // q2.m
    public /* synthetic */ l M(j jVar, e2.u uVar) {
        return l.z;
    }

    @Override // gh.a
    public /* synthetic */ int M0() {
        return 0;
    }

    @Override // u2.u
    public boolean N1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // y2.m
    public long O() {
        throw new NoSuchElementException();
    }

    @Override // eg.a
    public void P0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // u2.u
    public int P1() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.m1
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean S(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // y2.m
    public long S0() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(r1 r1Var, gj gjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean U(r1 r1Var) {
        return false;
    }

    @Override // gh.a
    public int U0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean V0(r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // gh.a
    public int W1() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ float Y0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int Z() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ float Z0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z1(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a c0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ TL_stories.StoryItem c1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // j2.g
    public j2.h createDataSource() {
        return new t(false);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean d0(r1 r1Var) {
        return false;
    }

    @Override // f3.q
    public i0 d2(int i7, int i10) {
        return new n();
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        switch (this.a) {
            case 14:
                return new pb.h();
            default:
                synchronized (w7.q.class) {
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
                    w7.q.a(new o());
                }
                return new nb.a(0);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean e0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // u2.u
    public MediaCodecInfo f(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // org.telegram.ui.Components.si
    public void f0(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f1(gj gjVar) {
        return c0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public boolean g1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean h2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String i(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int k0(r1 r1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ rm m0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean m1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean n0() {
        return false;
    }

    @Override // y2.m
    public boolean next() {
        return false;
    }

    @Override // b7.c
    public int o(Context context, String str, boolean z10) {
        return b7.f.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p0(y5 y5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // q2.m
    public q2.g r(j jVar, e2.u uVar) {
        if (uVar.w == null) {
            return null;
        }
        return new q2.n(new q2.f(6001, new x()));
    }

    @Override // fg.a
    public void r0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            fg.a.v.r0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 > i10) {
            fg.a.u.r0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else {
            if (i7 != i10) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // gh.a
    public int t0() {
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new m6.a(intent);
        }
        return null;
    }

    @Override // u2.u
    public boolean u2() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v2(int i7) {
        return false;
    }

    @Override // u2.u
    public boolean x0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y0(gj gjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String z(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean z1(r1 r1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ k9 z2() {
        return null;
    }

    public d(Context context) {
        this.a = 10;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Components.ng
    public void B2() {
    }

    @Override // org.telegram.ui.Components.ng
    public void D() {
    }

    @Override // org.telegram.ui.Components.ng
    public void G() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.ng
    public void G1() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void V() {
    }

    @Override // q2.m
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.ng
    public void d() {
    }

    @Override // f3.q
    public void d1() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.ng
    public void l1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.ng
    public void m2() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Components.ng
    public void q1() {
    }

    @Override // org.telegram.ui.Components.ng
    public void r2() {
    }

    @Override // q2.m
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Components.ng
    public void s0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Components.ng
    public void u() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.ng
    public void w2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void B(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(r1 r1Var) {
    }

    @Override // yi.f
    public void D0(String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void E(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(dj djVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(gj gjVar) {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y(r1 r1Var) {
    }

    @Override // org.telegram.ui.Components.ng
    public void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public void a1(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void h0(int i7) {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // f3.q
    public void j(b0 b0Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void j2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Components.ng
    public void k2(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Components.ng
    public void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(r1 r1Var) {
    }

    @Override // org.telegram.ui.Components.ng
    public void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w(r1 r1Var) {
    }

    @Override // org.telegram.ui.Components.ng
    public /* synthetic */ void x(float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void y(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z0(r1 r1Var) {
    }

    @Override // yi.f
    public void F(String str, Throwable th2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I(r1 r1Var, p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Components.ng
    public void Q(float f10, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a2(r1 r1Var, j10 j10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p1(r1 r1Var, int i7) {
    }

    @Override // q2.m
    public void r1(Looper looper, i iVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void B0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void H0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // eg.a
    public int M1(int i7, int i10, int i11) {
        return i7;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void T0(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void j0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.ng
    public void j1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.ng
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void y2(r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.si
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override // org.telegram.ui.Components.ng
    public void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
