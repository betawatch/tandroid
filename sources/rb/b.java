package rb;

import ah.t;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import i2.o1;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
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
import org.telegram.ui.yu0;
import r2.u;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b implements cg.a, dg.a, fa.a, gb.n, n6.k, r9.d, k1, u, u5.a, v9.a, Continuation, y6.d {
    public static volatile b b;
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void C0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // cg.a
    public int E1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        pf.d.r(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, t tVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // cg.a
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ yu0 P1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a W() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // r2.u
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // n6.k
    public /* bridge */ /* synthetic */ Object b(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // r2.u
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // u5.a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        int i10 = this.a;
        return b1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f1() {
        int i10 = this.a;
    }

    @Override // gb.n
    public Object f2() {
        switch (this.a) {
            case 9:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2() {
        int i10 = this.a;
    }

    @Override // r2.u
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        switch (this.a) {
            case 15:
                return new qb.c(z5Var.y(qb.b.class));
            default:
                return new qb.b(z5Var.b(pb.a.class));
        }
    }

    @Override // r2.u
    public int k() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n2() {
        int i10 = this.a;
    }

    @Override // v9.a
    public void o(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(a6 a6Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ p9 p2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // y6.d
    public a3.l r(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int o10 = cVar.o(context, str, true);
        lVar.b = o10;
        if (o10 != 0) {
            lVar.c = 1;
            return lVar;
        }
        int y3 = cVar.y(context, str);
        lVar.a = y3;
        if (y3 != 0) {
            lVar.c = -1;
        }
        return lVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // r2.u
    public boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(t1 t1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0() {
        int i10 = this.a;
    }

    @Override // dg.a
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(o1.k(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    private final /* synthetic */ void C1() {
    }

    private final /* synthetic */ void C2() {
    }

    private final /* synthetic */ void D2() {
    }

    private final /* synthetic */ void E() {
    }

    private final /* synthetic */ void H() {
    }

    private final /* synthetic */ void T1() {
    }

    private final /* synthetic */ void X() {
    }

    private final /* synthetic */ void Y() {
    }

    private final /* synthetic */ void k3() {
    }

    private final /* synthetic */ void l3() {
    }

    private final /* synthetic */ void o3() {
    }

    private final /* synthetic */ void p3() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void t3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void x3() {
    }

    private final /* synthetic */ void A2(t1 t1Var) {
    }

    private final /* synthetic */ void B2(t1 t1Var) {
    }

    private final /* synthetic */ void D0(t1 t1Var) {
    }

    private final /* synthetic */ void F0(t1 t1Var) {
    }

    private final /* synthetic */ void H0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void I0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void J(t1 t1Var) {
    }

    private final /* synthetic */ void K2(String str) {
    }

    private final /* synthetic */ void L(t1 t1Var) {
    }

    private final /* synthetic */ void L0(t1 t1Var) {
    }

    private final /* synthetic */ void L2(String str) {
    }

    private final /* synthetic */ void N0(t1 t1Var) {
    }

    private final /* synthetic */ void O(t1 t1Var) {
    }

    private final /* synthetic */ void Q2(t1 t1Var) {
    }

    private final /* synthetic */ void R2(t1 t1Var) {
    }

    private final /* synthetic */ void U(t1 t1Var) {
    }

    private final /* synthetic */ void U2(t1 t1Var) {
    }

    private final /* synthetic */ void V2(t1 t1Var) {
    }

    private final /* synthetic */ void W0(t1 t1Var) {
    }

    private final /* synthetic */ void W2(MessageObject messageObject) {
    }

    private final /* synthetic */ void X0(t1 t1Var) {
    }

    private final /* synthetic */ void X2(MessageObject messageObject) {
    }

    private final /* synthetic */ void Y2(t1 t1Var) {
    }

    private final /* synthetic */ void Z2(t1 t1Var) {
    }

    private final /* synthetic */ void a0(t1 t1Var) {
    }

    private final /* synthetic */ void b0(t1 t1Var) {
    }

    private final /* synthetic */ void b1(t1 t1Var) {
    }

    private final /* synthetic */ void c1(t1 t1Var) {
    }

    private final /* synthetic */ void c3(t1 t1Var) {
    }

    private final /* synthetic */ void d3(t1 t1Var) {
    }

    private final void e3(t1 t1Var) {
    }

    private final void g3(t1 t1Var) {
    }

    private final /* synthetic */ void i3(t1 t1Var) {
    }

    private final /* synthetic */ void j3(t1 t1Var) {
    }

    private final /* synthetic */ void k0(t1 t1Var) {
    }

    private final /* synthetic */ void k2(t1 t1Var) {
    }

    private final /* synthetic */ void m0(t1 t1Var) {
    }

    private final /* synthetic */ void m2(t1 t1Var) {
    }

    private final /* synthetic */ void n1(t1 t1Var) {
    }

    private final /* synthetic */ void o1(t1 t1Var) {
    }

    private final /* synthetic */ void q1(t1 t1Var) {
    }

    private final /* synthetic */ void q3(int i10) {
    }

    private final /* synthetic */ void r1(t1 t1Var) {
    }

    private final /* synthetic */ void r3(int i10) {
    }

    private final /* synthetic */ void s2(t1 t1Var) {
    }

    private final /* synthetic */ void t2(t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var) {
    }

    private final /* synthetic */ void u3(MessageObject messageObject) {
    }

    private final /* synthetic */ void v2(t1 t1Var) {
    }

    private final /* synthetic */ void v3(MessageObject messageObject) {
    }

    private final /* synthetic */ void w2(t1 t1Var) {
    }

    private final /* synthetic */ void x2(t1 t1Var) {
    }

    private final /* synthetic */ void C(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void M2(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void N2(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void Q0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void U0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void Y0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void a1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void a3(t1 t1Var, t tVar) {
    }

    private final /* synthetic */ void b3(t1 t1Var, t tVar) {
    }

    private final /* synthetic */ void f3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void g0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void h3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void i1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void j0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void j1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void l1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void m1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void q2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void r2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void u1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void y(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void y1(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void B0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void E2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void F2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void S2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void T2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void V1(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X1(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void e1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void g1(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void t0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void v(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void x(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void y2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void z2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void G2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void H2(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void I2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void J2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void Y1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void s1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void t1(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void O2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void P2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void a2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void d2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void e2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void h2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void p0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void r0(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void m3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void n3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
