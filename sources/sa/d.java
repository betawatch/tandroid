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
import f3.j0;
import f3.n;
import f3.q;
import j$.util.Objects;
import j2.t;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import m2.i;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import org.telegram.ui.p11;
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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class d implements SuccessContinuation, b7.c, p11, eg.a, q, fg.a, j2.g, Continuation, u9.d, ri, mg, gh.a, m1, m, u, y2.m, yi.f {
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

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ j9 B2() {
        return null;
    }

    public boolean C2(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String D(long j3) {
        return null;
    }

    @Override // gh.a
    public /* synthetic */ int D0() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // eg.a
    public void E0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // q2.m
    public int E1(e2.u uVar) {
        return uVar.w != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean F0(fj fjVar) {
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // q2.m
    public /* synthetic */ l I(j jVar, e2.u uVar) {
        return l.z;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // u2.u
    public boolean N1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // y2.m
    public long P0() {
        throw new NoSuchElementException();
    }

    @Override // u2.u
    public int P1() {
        return MediaCodecList.getCodecCount();
    }

    @Override // gh.a
    public int Q0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.ri
    public void S(fh fhVar) {
        fhVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // gh.a
    public /* synthetic */ float T0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    @Override // y2.m
    public long U() {
        throw new NoSuchElementException();
    }

    @Override // gh.a
    public /* synthetic */ float V0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ int X0() {
        return 0;
    }

    @Override // gh.a
    public int X1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z(r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ rm a0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean b0() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean b1(long j3) {
        return false;
    }

    @Override // u9.d
    public Object c(r7 r7Var) {
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
    public /* synthetic */ boolean c1(r1 r1Var, boolean z10) {
        return false;
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
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public boolean d1() {
        return false;
    }

    @Override // f3.q
    public j0 d2(int i7, int i10) {
        return new n();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int e0() {
        return 0;
    }

    @Override // fg.a
    public void f0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            fg.a.v.f0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 > i10) {
            fg.a.u.f0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else {
            if (i7 != i10) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // u2.u
    public MediaCodecInfo g(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean g1(fj fjVar) {
        return c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a h0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // gh.a
    public int i0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j0(r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String k(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean k0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override // b7.c
    public int l(Context context, String str, boolean z10) {
        return b7.f.d(context, str, z10);
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean l1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ int n() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean n0() {
        return false;
    }

    @Override // y2.m
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ TLRPC.Peer o() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int p0(r1 r1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean r0() {
        return false;
    }

    @Override // u2.u
    public boolean s0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // u2.u
    public boolean s2() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new m6.a(intent);
        }
        return null;
    }

    @Override // q2.m
    public q2.g v(j jVar, e2.u uVar) {
        if (uVar.w == null) {
            return null;
        }
        return new q2.n(new q2.f(6001, new x()));
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v0(x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ boolean w0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // gh.a
    public int x2() {
        return 0;
    }

    @Override // b7.c
    public int y(Context context, String str) {
        return b7.f.a(context, str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean z1(r1 r1Var, int i7) {
        return false;
    }

    public d(Context context) {
        this.a = 10;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.mg
    public void E() {
    }

    @Override // org.telegram.ui.Components.mg
    public void G1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void V() {
    }

    @Override // f3.q
    public void Z0() {
    }

    @Override // q2.m
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.mg
    public void b() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.mg
    public void g0() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.mg
    public void j1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.mg
    public void m2() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void o1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.mg
    public void q1() {
    }

    @Override // org.telegram.ui.Components.mg
    public void r() {
    }

    @Override // org.telegram.ui.Components.mg
    public void r2() {
    }

    @Override // q2.m
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Components.mg
    public void t2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u2() {
    }

    @Override // org.telegram.ui.Components.mg
    public void v2() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.mg
    public void z() {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void G0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void M(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O(cj cjVar) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void O0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(fj fjVar) {
    }

    @Override // org.telegram.ui.Components.mg
    public void Q(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Components.mg
    public void U0(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void d0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void f1(r1 r1Var) {
    }

    @Override // f3.q
    public void h(f3.c0 c0Var) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.mg
    public void i2(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m0(int i7) {
    }

    @Override // org.telegram.ui.Components.mg
    public void n2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t0(String str) {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void u(float f10) {
    }

    @Override // yi.f
    public void u0(String str) {
    }

    @Override // org.telegram.ui.Components.mg
    public void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.mg
    public /* synthetic */ void w(boolean z10) {
    }

    @Override // yi.f
    public void B(String str, Throwable th2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Components.mg
    public void K(float f10, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(r1 r1Var, p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void b2(r1 r1Var, h10 h10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p1(r1 r1Var, int i7) {
    }

    @Override // q2.m
    public void r1(Looper looper, i iVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A2(r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // eg.a
    public int M1(int i7, int i10, int i11) {
        return i7;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void i1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.mg
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Components.ri
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
