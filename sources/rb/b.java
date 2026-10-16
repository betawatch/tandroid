package rb;

import ah.t;
import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class b implements cg.a, dg.a, fa.a, gb.p, n6.k, r9.d, l1, r0.r, u5.a, v9.a, Continuation, y6.d {
    public static volatile b b;
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // dg.a
    public void A(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(i2.d.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f7 = remaining;
        float f10 = f7 / f7;
        float f11 = ceil;
        float f12 = f11 / f11;
        while (remaining > 0 && ceil > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f10 = remaining / f7;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f12 = ceil / f11;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean C1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // cg.a
    public int F1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        pf.d.r(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle K1(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(u1 u1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, t tVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // cg.a
    public void Q0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vv0 S1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T0(u1 u1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ih.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(u1 u1Var, long j10) {
        int i10 = this.a;
    }

    @Override // n6.k
    public /* bridge */ /* synthetic */ Object a(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a1(int i10, u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // u5.a
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // v9.a
    public void d(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e1(MessageObject messageObject) {
        int i10 = this.a;
        return c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // gb.p
    public Object i2() {
        switch (this.a) {
            case 9:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // r9.d
    public Object n2(z5 z5Var) {
        switch (this.a) {
            case 15:
                return new qb.c(z5Var.w(qb.b.class));
            default:
                return new qb.b(z5Var.b(pb.a.class));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(b6 b6Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // y6.d
    public a3.l q(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int q6 = cVar.q(context, str, true);
        lVar.b = q6;
        if (q6 != 0) {
            lVar.c = 1;
            return lVar;
        }
        int H = cVar.H(context, str);
        lVar.a = H;
        if (H != 0) {
            lVar.c = -1;
        }
        return lVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // fa.a
    public StackTraceElement[] s0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(u1 u1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 t2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(u1 u1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
        int i10 = this.a;
    }

    private final /* synthetic */ void F() {
    }

    private final /* synthetic */ void H() {
    }

    private final /* synthetic */ void f3() {
    }

    private final /* synthetic */ void g3() {
    }

    private final /* synthetic */ void j3() {
    }

    private final /* synthetic */ void k3() {
    }

    private final /* synthetic */ void n3() {
    }

    private final /* synthetic */ void o3() {
    }

    private final /* synthetic */ void p() {
    }

    private final /* synthetic */ void r1() {
    }

    private final /* synthetic */ void r3() {
    }

    private final /* synthetic */ void s1() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void v() {
    }

    private final /* synthetic */ void x2() {
    }

    private final /* synthetic */ void y2() {
    }

    private final /* synthetic */ void C0(u1 u1Var) {
    }

    private final /* synthetic */ void D(u1 u1Var) {
    }

    private final /* synthetic */ void F2(String str) {
    }

    private final /* synthetic */ void G2(String str) {
    }

    private final /* synthetic */ void I0(u1 u1Var) {
    }

    private final /* synthetic */ void J(u1 u1Var) {
    }

    private final /* synthetic */ void J0(u1 u1Var) {
    }

    private final /* synthetic */ void K(u1 u1Var) {
    }

    private final /* synthetic */ void L2(u1 u1Var) {
    }

    private final /* synthetic */ void M2(u1 u1Var) {
    }

    private final /* synthetic */ void P2(u1 u1Var) {
    }

    private final /* synthetic */ void Q2(u1 u1Var) {
    }

    private final /* synthetic */ void R0(u1 u1Var) {
    }

    private final /* synthetic */ void R2(MessageObject messageObject) {
    }

    private final /* synthetic */ void S2(MessageObject messageObject) {
    }

    private final /* synthetic */ void T2(u1 u1Var) {
    }

    private final /* synthetic */ void U2(u1 u1Var) {
    }

    private final /* synthetic */ void V0(u1 u1Var) {
    }

    private final /* synthetic */ void X(u1 u1Var) {
    }

    private final /* synthetic */ void X2(u1 u1Var) {
    }

    private final /* synthetic */ void Y1(u1 u1Var) {
    }

    private final /* synthetic */ void Y2(u1 u1Var) {
    }

    private final void Z2(u1 u1Var) {
    }

    private final /* synthetic */ void a0(u1 u1Var) {
    }

    private final /* synthetic */ void a2(u1 u1Var) {
    }

    private final void b3(u1 u1Var) {
    }

    private final /* synthetic */ void d2(u1 u1Var) {
    }

    private final /* synthetic */ void d3(u1 u1Var) {
    }

    private final /* synthetic */ void e3(u1 u1Var) {
    }

    private final /* synthetic */ void f1(u1 u1Var) {
    }

    private final /* synthetic */ void g2(u1 u1Var) {
    }

    private final /* synthetic */ void h1(u1 u1Var) {
    }

    private final /* synthetic */ void h2(u1 u1Var) {
    }

    private final /* synthetic */ void j1(u1 u1Var) {
    }

    private final /* synthetic */ void k1(u1 u1Var) {
    }

    private final /* synthetic */ void k2(u1 u1Var) {
    }

    private final /* synthetic */ void l3(int i10) {
    }

    private final /* synthetic */ void m0(u1 u1Var) {
    }

    private final /* synthetic */ void m2(u1 u1Var) {
    }

    private final /* synthetic */ void m3(int i10) {
    }

    private final /* synthetic */ void o2(u1 u1Var) {
    }

    private final /* synthetic */ void p0(u1 u1Var) {
    }

    private final /* synthetic */ void p3(MessageObject messageObject) {
    }

    private final /* synthetic */ void q3(MessageObject messageObject) {
    }

    private final /* synthetic */ void r0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void t0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void v2(u1 u1Var) {
    }

    private final /* synthetic */ void w(u1 u1Var) {
    }

    private final /* synthetic */ void w0(u1 u1Var) {
    }

    private final /* synthetic */ void w2(u1 u1Var) {
    }

    private final /* synthetic */ void y(u1 u1Var) {
    }

    private final /* synthetic */ void z(u1 u1Var) {
    }

    private final /* synthetic */ void E0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void G0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void H2(u1 u1Var, long j10) {
    }

    private final /* synthetic */ void I2(u1 u1Var, long j10) {
    }

    private final /* synthetic */ void M0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void U(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void V2(u1 u1Var, t tVar) {
    }

    private final /* synthetic */ void W(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void W2(u1 u1Var, t tVar) {
    }

    private final /* synthetic */ void Z0(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void a3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void b1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void b2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void c1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void c2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void c3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void d1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void k(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void l(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void o1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void p1(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void A2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void N2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void O2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X0(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void Y0(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void f(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void h(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void j0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void k0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void q2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void t1(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void u1(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void u2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void z2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void B2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void C2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void D2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void E2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void m1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void n1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void v1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void z1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.r
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.r
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final /* synthetic */ void D1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void G1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void I1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void J2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void K2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void W1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void b0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void g0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void h3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void i3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
