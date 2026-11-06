package w7;

import a8.r7;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import androidx.fragment.app.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.internal.play_billing.x3;
import d3.i0;
import e2.u;
import e2.x1;
import f3.y;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import l.w;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.r5;
import org.telegram.ui.fr0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class s implements s0, b7.e, c4.k, i0, eg.a, l5.e, fg.a, ja.a, w, u9.d, l1, q6.l, sg.l1, x5.a {
    public static s b;
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i7, boolean z9) {
        this.a = i7;
    }

    @Override // l.w
    public boolean A(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z9) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(ij ijVar) {
        int i7 = this.a;
    }

    @Override // ja.a
    public StackTraceElement[] B(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
        int i7 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        switch (this.a) {
        }
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle C1(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // c4.k
    public int D(u uVar) {
        String str = uVar.s;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(rf.b.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z9, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, ij ijVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, o2 o2Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // eg.a
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s5 = shortBuffer.get();
            shortBuffer2.put(s5);
            shortBuffer2.put(s5);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(fj fjVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(q1 q1Var, o10 o10Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ fr0 N1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O0(q1 q1Var, boolean z9) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(ij ijVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(String str, String str2) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(ij ijVar) {
        int i7 = this.a;
        return f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, long j3) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // l5.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // q6.l
    public /* bridge */ /* synthetic */ Object b(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i7) {
        int i10 = this.a;
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        switch (this.a) {
            case 14:
                return new qb.a(0);
            case 15:
                return new pb.b(0);
            case 20:
                return new pb.k((Context) r7Var.a(Context.class));
            default:
                return new sb.a();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
        int i7 = this.a;
    }

    @Override // b7.e
    public b7.d f0(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        dVar.a = cVar.q(context, str);
        int i7 = 1;
        int m10 = cVar.m(context, str, true);
        dVar.b = m10;
        int i10 = dVar.a;
        if (i10 == 0) {
            i10 = 0;
            if (m10 == 0) {
                i7 = 0;
                dVar.c = i7;
                return dVar;
            }
        }
        if (m10 < i10) {
            i7 = -1;
        }
        dVar.c = i7;
        return dVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1(q1 q1Var, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(q1 q1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // androidx.lifecycle.s0
    public p0 i(Class cls) {
        return new l0(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j1(q1 q1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(q1 q1Var, int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean k0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ j9 k2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // c4.k
    public c4.m l(u uVar) {
        String str = uVar.s;
        List list = uVar.v;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new e4.h(list);
                case "application/pgs":
                    return new ui.e(2);
                case "application/x-mp4-vtt":
                    return new y(1);
                case "text/vtt":
                    return new j2.n(4);
                case "application/x-quicktime-tx3g":
                    return new j4.a(list);
                case "text/x-ssa":
                    return new g4.a(list);
                case "application/vobsub":
                    return new k4.b(list);
                case "application/x-subrip":
                    return new h4.a();
                case "application/ttml+xml":
                    return new i4.d();
            }
        }
        throw new IllegalArgumentException(rf.b.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(String str) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n0(r5 r5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // fg.a
    public void q0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 != i10) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.l1
    public void q1(q1 q1Var, boolean z9, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r1(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // x5.a
    public long s() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, boolean z9) {
        int i7 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 t(Class cls, y1.b bVar) {
        return i(cls);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(q1 q1Var, float f10, float f11, boolean z9) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean u1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.a;
    }

    @Override // c4.k
    public boolean w(u uVar) {
        String str = uVar.s;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(ij ijVar) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String y(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
        int i7 = this.a;
    }

    @Override // eg.a
    public int z1(int i7, int i10, int i11) {
        return i7 * 2;
    }

    public Signature[] z4(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public s(int i7) {
        this.a = i7;
        switch (i7) {
            case 22:
                new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 35) {
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void A4() {
    }

    private final /* synthetic */ void B4() {
    }

    private final /* synthetic */ void C0() {
    }

    private final /* synthetic */ void C4() {
    }

    private final /* synthetic */ void F0() {
    }

    private final /* synthetic */ void H4() {
    }

    private final /* synthetic */ void I4() {
    }

    private final /* synthetic */ void J2() {
    }

    private final /* synthetic */ void J4() {
    }

    private final /* synthetic */ void K2() {
    }

    private final /* synthetic */ void L2() {
    }

    private final /* synthetic */ void N4() {
    }

    private final /* synthetic */ void O4() {
    }

    private final /* synthetic */ void P4() {
    }

    private final /* synthetic */ void T4() {
    }

    private final /* synthetic */ void U4() {
    }

    private final /* synthetic */ void V4() {
    }

    private final /* synthetic */ void W() {
    }

    private final /* synthetic */ void Y() {
    }

    private final /* synthetic */ void c0() {
    }

    private final /* synthetic */ void w0() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void x3() {
    }

    private final /* synthetic */ void y3() {
    }

    @Override // sg.l1
    public void f() {
    }

    @Override // d3.i0
    public /* synthetic */ void m() {
    }

    @Override // d3.i0
    public /* synthetic */ void onFirstFrameRendered() {
    }

    @Override // d3.i0
    public /* synthetic */ void q() {
    }

    private final /* synthetic */ void A2(q1 q1Var) {
    }

    private final /* synthetic */ void B2(q1 q1Var) {
    }

    private final /* synthetic */ void C2(q1 q1Var) {
    }

    private final void D4(String str) {
    }

    private final /* synthetic */ void G1(q1 q1Var) {
    }

    private final /* synthetic */ void I0(q1 q1Var) {
    }

    private final /* synthetic */ void I3(String str) {
    }

    private final /* synthetic */ void J3(String str) {
    }

    private final /* synthetic */ void K3(String str) {
    }

    private final /* synthetic */ void K4(int i7) {
    }

    private final /* synthetic */ void L1(q1 q1Var) {
    }

    private final /* synthetic */ void L4(int i7) {
    }

    private final /* synthetic */ void M0(q1 q1Var) {
    }

    private final /* synthetic */ void M1(q1 q1Var) {
    }

    private final /* synthetic */ void M4(int i7) {
    }

    private final /* synthetic */ void Q4(ij ijVar) {
    }

    private final /* synthetic */ void R0(q1 q1Var) {
    }

    private final /* synthetic */ void R3(q1 q1Var) {
    }

    private final /* synthetic */ void R4(ij ijVar) {
    }

    private final /* synthetic */ void S3(q1 q1Var) {
    }

    private final /* synthetic */ void S4(ij ijVar) {
    }

    private final /* synthetic */ void T3(q1 q1Var) {
    }

    private final /* synthetic */ void V0(q1 q1Var) {
    }

    private final /* synthetic */ void X0(q1 q1Var) {
    }

    private final /* synthetic */ void X1(q1 q1Var) {
    }

    private final /* synthetic */ void X3(q1 q1Var) {
    }

    private final /* synthetic */ void Y0(q1 q1Var) {
    }

    private final /* synthetic */ void Y1(q1 q1Var) {
    }

    private final /* synthetic */ void Y2(q1 q1Var) {
    }

    private final /* synthetic */ void Y3(q1 q1Var) {
    }

    private final /* synthetic */ void Z1(q1 q1Var) {
    }

    private final /* synthetic */ void Z2(q1 q1Var) {
    }

    private final /* synthetic */ void Z3(q1 q1Var) {
    }

    private final /* synthetic */ void a3(q1 q1Var) {
    }

    private final /* synthetic */ void a4(ij ijVar) {
    }

    private final /* synthetic */ void b4(ij ijVar) {
    }

    private final /* synthetic */ void c4(ij ijVar) {
    }

    private final /* synthetic */ void d4(q1 q1Var) {
    }

    private final /* synthetic */ void e4(q1 q1Var) {
    }

    private final /* synthetic */ void f4(q1 q1Var) {
    }

    private final /* synthetic */ void h3(q1 q1Var) {
    }

    private final /* synthetic */ void i1(q1 q1Var) {
    }

    private final /* synthetic */ void i3(q1 q1Var) {
    }

    private final /* synthetic */ void j0(q1 q1Var) {
    }

    private final /* synthetic */ void j3(q1 q1Var) {
    }

    private final /* synthetic */ void j4(q1 q1Var) {
    }

    private final /* synthetic */ void k1(q1 q1Var) {
    }

    private final /* synthetic */ void k3(q1 q1Var) {
    }

    private final /* synthetic */ void k4(q1 q1Var) {
    }

    private final /* synthetic */ void l0(q1 q1Var) {
    }

    private final /* synthetic */ void l1(q1 q1Var) {
    }

    private final /* synthetic */ void l2(q1 q1Var) {
    }

    private final /* synthetic */ void l3(q1 q1Var) {
    }

    private final /* synthetic */ void l4(q1 q1Var) {
    }

    private final /* synthetic */ void m1(fj fjVar) {
    }

    private final /* synthetic */ void m2(q1 q1Var) {
    }

    private final /* synthetic */ void m3(q1 q1Var) {
    }

    private final /* synthetic */ void n2(q1 q1Var) {
    }

    private final /* synthetic */ void n3(q1 q1Var) {
    }

    private final /* synthetic */ void o0(q1 q1Var) {
    }

    private final /* synthetic */ void o1(fj fjVar) {
    }

    private final /* synthetic */ void o3(q1 q1Var) {
    }

    private final /* synthetic */ void p3(q1 q1Var) {
    }

    private final /* synthetic */ void r0(q1 q1Var) {
    }

    private final /* synthetic */ void t0(q1 q1Var) {
    }

    private final /* synthetic */ void t1(fj fjVar) {
    }

    private final /* synthetic */ void t3(q1 q1Var) {
    }

    private final /* synthetic */ void t4(q1 q1Var) {
    }

    private final /* synthetic */ void u3(q1 q1Var) {
    }

    private final /* synthetic */ void v0(q1 q1Var) {
    }

    private final /* synthetic */ void v3(q1 q1Var) {
    }

    private final /* synthetic */ void v4(q1 q1Var) {
    }

    private final /* synthetic */ void x2(q1 q1Var) {
    }

    private final /* synthetic */ void x4(q1 q1Var) {
    }

    private final /* synthetic */ void y2(q1 q1Var) {
    }

    private final /* synthetic */ void z2(q1 q1Var) {
    }

    @Override // d3.i0
    public /* synthetic */ void a(x1 x1Var) {
    }

    private final /* synthetic */ void G2(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void H2(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void I2(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void L(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void L3(q1 q1Var, long j3) {
    }

    private final /* synthetic */ void M(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void M3(q1 q1Var, long j3) {
    }

    private final /* synthetic */ void N3(q1 q1Var, long j3) {
    }

    private final /* synthetic */ void O(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void O1(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void S0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T1(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void U0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void V1(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void a2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void b3(String str, String str2) {
    }

    private final /* synthetic */ void c3(String str, String str2) {
    }

    private final /* synthetic */ void d2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d3(String str, String str2) {
    }

    private final /* synthetic */ void g4(q1 q1Var, o10 o10Var) {
    }

    private final /* synthetic */ void h2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void h4(q1 q1Var, o10 o10Var) {
    }

    private final /* synthetic */ void i4(q1 q1Var, o10 o10Var) {
    }

    private final void m4(String str, Throwable th2) {
    }

    private final /* synthetic */ void n4(q1 q1Var, boolean z9) {
    }

    private final /* synthetic */ void p4(q1 q1Var, boolean z9) {
    }

    private final /* synthetic */ void r2(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void r4(q1 q1Var, boolean z9) {
    }

    private final /* synthetic */ void s2(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void t2(q1 q1Var, int i7) {
    }

    private final /* synthetic */ void u2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void v2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void w2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // l.w
    public void c(l.k kVar, boolean z9) {
    }

    private final /* synthetic */ void A3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final /* synthetic */ void B3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final /* synthetic */ void E(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void F(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void I(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void M2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void N2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void O2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void U3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void V3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void W3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void e1(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final /* synthetic */ void e3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void f1(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final /* synthetic */ void f3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void g3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void h1(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    private final /* synthetic */ void o2(q1 q1Var, int i7, int i10) {
    }

    private final void o4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final /* synthetic */ void p2(q1 q1Var, int i7, int i10) {
    }

    private final /* synthetic */ void q2(q1 q1Var, int i7, int i10) {
    }

    private final /* synthetic */ void q3(q1 q1Var, float f10, float f11) {
    }

    private final void q4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final /* synthetic */ void r3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void s3(q1 q1Var, float f10, float f11) {
    }

    private final void s4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void u4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void w4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final void y4(q1 q1Var, boolean z9, boolean z10) {
    }

    private final /* synthetic */ void z3(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    private final /* synthetic */ void C3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void D2(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void D3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void E2(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void E3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void F2(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void F3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void G3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void H3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void P2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final /* synthetic */ void Q2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final /* synthetic */ void R2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final /* synthetic */ void O3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void P3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void Q3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void S2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final /* synthetic */ void T2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final /* synthetic */ void U2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    private final /* synthetic */ void V2(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void W2(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void X2(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void a1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void c1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void d1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final /* synthetic */ void E4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final /* synthetic */ void F4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final /* synthetic */ void G4(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
