package tb;

import a8.me;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Looper;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.car.app.messaging.model.b;
import b2.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import g2.g;
import g2.h;
import g2.t;
import hb.n;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import n2.f;
import n2.j;
import n2.l;
import n2.m;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.d3;
import org.telegram.ui.e61;
import org.telegram.ui.ev0;
import r2.u;
import s9.d;
import y2.i;
import z6.c;
import z6.e;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements b, e61, dg.a, eg.a, g, n, ri, m, j1, d, u, OnFailureListener, Continuation, v2.m, i, c {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static void X4(String str) {
        if (str == null || str.length() == 0) {
            throw new wc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new wc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public void A(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // r2.u
    public boolean B(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
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

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean E() {
        return false;
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

    @Override // r2.u
    public int G() {
        return MediaCodecList.getCodecCount();
    }

    @Override // dg.a
    public void G0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
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

    @Override // z6.c
    public int U(Context context, String str) {
        return e.a(context, str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0() {
        int i10 = this.a;
    }

    @Override // hb.n
    public Object U1() {
        switch (this.a) {
            case 9:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
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

    @Override // y2.i
    public void b() {
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

    @Override // g2.g
    public h createDataSource() {
        return new t(false);
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
                return new rb.c(meVar.x(rb.b.class));
            default:
                return new rb.b(meVar.d(qb.a.class));
        }
    }

    @Override // r2.u
    public MediaCodecInfo e(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f1(s1 s1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // n2.m
    public /* synthetic */ l g(j jVar, x xVar) {
        return l.u;
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // r2.u
    public boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j0(s1 s1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // v2.m
    public long k() {
        throw new NoSuchElementException();
    }

    @Override // eg.a
    public void k0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
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

    @Override // v2.m
    public boolean next() {
        return false;
    }

    @Override // r2.u
    public boolean o(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o0(s1 s1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
        int i10 = this.a;
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

    @Override // z6.c
    public int t(Context context, String str, boolean z10) {
        return e.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // dg.a
    public int t1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
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

    @Override // n2.m
    public int w(x xVar) {
        return xVar.w != null ? 1 : 0;
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

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean x0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // v2.m
    public long y() {
        throw new NoSuchElementException();
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

    @Override // n2.m
    public n2.g z(j jVar, x xVar) {
        if (xVar.w == null) {
            return null;
        }
        return new n2.n(new f(6001, new n2.x()));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1() {
        int i10 = this.a;
    }

    private final /* synthetic */ void D3() {
    }

    private final /* synthetic */ void E3() {
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void F4() {
    }

    private final /* synthetic */ void G4() {
    }

    private final /* synthetic */ void H4() {
    }

    private final /* synthetic */ void L4() {
    }

    private final /* synthetic */ void M4() {
    }

    private final /* synthetic */ void N4() {
    }

    private final /* synthetic */ void P0() {
    }

    private final /* synthetic */ void Q0() {
    }

    private final /* synthetic */ void R0() {
    }

    private final /* synthetic */ void R4() {
    }

    private final /* synthetic */ void S4() {
    }

    private final /* synthetic */ void T2() {
    }

    private final /* synthetic */ void T4() {
    }

    private final /* synthetic */ void U2() {
    }

    private final /* synthetic */ void V2() {
    }

    private final /* synthetic */ void Y4() {
    }

    private final /* synthetic */ void Z4() {
    }

    private final /* synthetic */ void a5() {
    }

    private final /* synthetic */ void c1() {
    }

    private final /* synthetic */ void e1() {
    }

    private final /* synthetic */ void g1() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void R() {
    }

    @Override // n2.m
    public /* synthetic */ void a() {
    }

    @Override // y2.i
    public void f0() {
    }

    @Override // n2.m
    public /* synthetic */ void release() {
    }

    private final /* synthetic */ void A3(s1 s1Var) {
    }

    private final /* synthetic */ void B3(s1 s1Var) {
    }

    private final /* synthetic */ void B4(s1 s1Var) {
    }

    private final /* synthetic */ void C3(s1 s1Var) {
    }

    private final /* synthetic */ void D4(s1 s1Var) {
    }

    private final /* synthetic */ void H2(s1 s1Var) {
    }

    private final /* synthetic */ void I2(s1 s1Var) {
    }

    private final /* synthetic */ void J1(s1 s1Var) {
    }

    private final /* synthetic */ void J2(s1 s1Var) {
    }

    private final /* synthetic */ void K2(s1 s1Var) {
    }

    private final /* synthetic */ void L1(s1 s1Var) {
    }

    private final /* synthetic */ void L2(s1 s1Var) {
    }

    private final /* synthetic */ void M2(s1 s1Var) {
    }

    private final /* synthetic */ void N1(s1 s1Var) {
    }

    private final /* synthetic */ void O4(int i10) {
    }

    private final /* synthetic */ void P3(String str) {
    }

    private final /* synthetic */ void P4(int i10) {
    }

    private final /* synthetic */ void Q3(String str) {
    }

    private final /* synthetic */ void Q4(int i10) {
    }

    private final /* synthetic */ void R3(String str) {
    }

    private final /* synthetic */ void T0(s1 s1Var) {
    }

    private final /* synthetic */ void U4(MessageObject messageObject) {
    }

    private final /* synthetic */ void V0(s1 s1Var) {
    }

    private final /* synthetic */ void V4(MessageObject messageObject) {
    }

    private final /* synthetic */ void W4(MessageObject messageObject) {
    }

    private final /* synthetic */ void X0(s1 s1Var) {
    }

    private final /* synthetic */ void Y0(s1 s1Var) {
    }

    private final /* synthetic */ void Y3(s1 s1Var) {
    }

    private final /* synthetic */ void Z3(s1 s1Var) {
    }

    private final /* synthetic */ void a1(s1 s1Var) {
    }

    private final /* synthetic */ void a4(s1 s1Var) {
    }

    private final /* synthetic */ void b1(s1 s1Var) {
    }

    private final /* synthetic */ void d2(s1 s1Var) {
    }

    private final /* synthetic */ void e2(s1 s1Var) {
    }

    private final /* synthetic */ void e4(s1 s1Var) {
    }

    private final /* synthetic */ void f2(s1 s1Var) {
    }

    private final /* synthetic */ void f4(s1 s1Var) {
    }

    private final /* synthetic */ void g2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void g4(s1 s1Var) {
    }

    private final /* synthetic */ void h1(s1 s1Var) {
    }

    private final /* synthetic */ void h2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void h4(MessageObject messageObject) {
    }

    private final /* synthetic */ void i1(s1 s1Var) {
    }

    private final /* synthetic */ void i2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void i3(s1 s1Var) {
    }

    private final /* synthetic */ void i4(MessageObject messageObject) {
    }

    private final /* synthetic */ void j1(s1 s1Var) {
    }

    private final /* synthetic */ void j2(s1 s1Var) {
    }

    private final /* synthetic */ void j3(s1 s1Var) {
    }

    private final /* synthetic */ void j4(MessageObject messageObject) {
    }

    private final /* synthetic */ void k2(s1 s1Var) {
    }

    private final /* synthetic */ void k3(s1 s1Var) {
    }

    private final /* synthetic */ void k4(s1 s1Var) {
    }

    private final /* synthetic */ void l2(s1 s1Var) {
    }

    private final /* synthetic */ void l4(s1 s1Var) {
    }

    private final /* synthetic */ void m4(s1 s1Var) {
    }

    private final /* synthetic */ void o3(s1 s1Var) {
    }

    private final /* synthetic */ void p2(s1 s1Var) {
    }

    private final /* synthetic */ void p3(s1 s1Var) {
    }

    private final /* synthetic */ void q2(s1 s1Var) {
    }

    private final /* synthetic */ void q3(s1 s1Var) {
    }

    private final /* synthetic */ void q4(s1 s1Var) {
    }

    private final /* synthetic */ void r2(s1 s1Var) {
    }

    private final /* synthetic */ void r3(s1 s1Var) {
    }

    private final /* synthetic */ void r4(s1 s1Var) {
    }

    private final /* synthetic */ void s3(s1 s1Var) {
    }

    private final /* synthetic */ void s4(s1 s1Var) {
    }

    private final /* synthetic */ void t3(s1 s1Var) {
    }

    private final /* synthetic */ void u3(s1 s1Var) {
    }

    private final /* synthetic */ void v2(s1 s1Var) {
    }

    private final /* synthetic */ void v3(s1 s1Var) {
    }

    private final /* synthetic */ void w2(s1 s1Var) {
    }

    private final /* synthetic */ void w3(s1 s1Var) {
    }

    private final /* synthetic */ void x2(s1 s1Var) {
    }

    private final /* synthetic */ void z4(s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void T(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void Y(TLRPC.User user) {
    }

    private final /* synthetic */ void B2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void C2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void D1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void D2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void E2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void F1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void F2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void G2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void H0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void M0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void N0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Q2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void R2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void S2(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void S3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void T3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void U3(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void l3(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void m2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void m3(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void n2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void n3(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void n4(s1 s1Var, bh.n nVar) {
    }

    private final /* synthetic */ void o1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void o2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void o4(s1 s1Var, bh.n nVar) {
    }

    private final /* synthetic */ void p4(s1 s1Var, bh.n nVar) {
    }

    private final /* synthetic */ void s2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void t2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void t4(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void u2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void v4(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void x4(s1 s1Var, boolean z10) {
    }

    @Override // n2.m
    public void f(Looper looper, j2.j jVar) {
    }

    private final /* synthetic */ void A2(s1 s1Var, int i10, int i11) {
    }

    private final void A4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void B0(s1 s1Var, float f7, float f10) {
    }

    private final void C4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void E4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void G3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void H3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void I3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void T1(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void W2(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X2(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Y1(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void Y2(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void b4(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void c2(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void c4(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void d4(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void l0(s1 s1Var, float f7, float f10) {
    }

    private final void u4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void v0(s1 s1Var, float f7, float f10) {
    }

    private final void w4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void x3(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void y2(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void y3(s1 s1Var, float f7, float f10) {
    }

    private final void y4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void z2(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void z3(s1 s1Var, float f7, float f10) {
    }

    private final /* synthetic */ void J3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void K3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void L3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void M3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void N2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void N3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void O2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void O3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void P2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void Z2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void a3(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void b3(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void V3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void W3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void X3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void c3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void d3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void e3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void f3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void g3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void h3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void O1(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void P1(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void S1(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void I4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void J4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void K4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ri
    public void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
