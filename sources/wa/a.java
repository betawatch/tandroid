package wa;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Looper;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import com.google.android.exoplayer2.upstream.d0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.d;
import eh.f;
import h3.t0;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import l3.h;
import l3.i;
import l3.k;
import m3.c;
import na.n;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.nu0;
import ve.e;
import y2.b;
import y3.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class a implements l, d, SuccessContinuation, f3.a, jf.a, kf.a, i, c, m9.a, n, k1, ii, y8.d, b, u {
    public static a b;
    public static volatile a c;
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }

    public static short B3(short s10, short s11) {
        int i9 = s10 + 32768;
        int i10 = s11 + 32768;
        int i11 = (i9 < 32768 || i10 < 32768) ? (i9 * i10) / 32768 : (((i9 + i10) * 2) - ((i9 * i10) / 32768)) - 65535;
        return (short) ((i11 != 65536 ? i11 : 65535) - 32768);
    }

    public static String K3(ic.c cVar) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var) {
        int i9 = this.a;
    }

    public boolean A3(CharSequence charSequence) {
        return false;
    }

    @Override // y3.u
    public int B() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0() {
        int i9 = this.a;
    }

    @Override // jf.a
    public int B1(int i9, int i10, int i11) {
        return i9 / 2;
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

    @Override // l3.i
    public /* synthetic */ h D(a6.a aVar, t0 t0Var) {
        return h.a;
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
        e.s(t1Var.getContext(), str);
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

    @Override // l3.i
    public int G(t0 t0Var) {
        return t0Var.E != null ? 1 : 0;
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
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(B3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        switch (this.a) {
            case 23:
                return new za.a(0);
            default:
                return new ya.b(0);
        }
    }

    @Override // y3.u
    public boolean I() {
        return false;
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
                return new LinkedHashSet();
            default:
                return new TreeMap();
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a0(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // y3.u
    public MediaCodecInfo b(int i9) {
        return MediaCodecList.getCodecInfoAt(i9);
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

    @Override // com.google.android.exoplayer2.upstream.l
    public m createDataSource() {
        return new d0(false);
    }

    @Override // f3.a
    public long d() {
        return SystemClock.elapsedRealtime();
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
    public /* synthetic */ boolean f() {
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

    @Override // kf.a
    public void g0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i9 < i10) {
            kf.a.o.g0(shortBuffer, i9, shortBuffer2, i10, i11);
        } else if (i9 > i10) {
            kf.a.m.g0(shortBuffer, i9, shortBuffer2, i10, i11);
        } else {
            if (i9 != i10) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TLRPC.Document document) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var) {
        int i9 = this.a;
    }

    @Override // nc.a
    public Object get() {
        return new f6.a(Executors.newSingleThreadExecutor());
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

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // m9.a
    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        int i9;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i10 - intValue;
                if (i10 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i12 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i12++;
                    }
                    i9 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i9 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i9 = i10;
            i12 = 1;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i9 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        return i11 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
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

    @Override // l3.i
    public l3.e n(a6.a aVar, t0 t0Var) {
        if (t0Var.E == null) {
            return null;
        }
        return new fa.c(new l3.d(new k(), 6001), 26);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n2(int i9) {
        switch (this.a) {
        }
        return false;
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

    @Override // y3.u
    public boolean p(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
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

    @Override // org.telegram.ui.Components.ii
    public void t(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, boolean z10) {
        int i9 = this.a;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
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

    @Override // y3.u
    public boolean y(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
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

    private final /* synthetic */ void C0() {
    }

    private final /* synthetic */ void E3() {
    }

    private final /* synthetic */ void F3() {
    }

    private final /* synthetic */ void I3() {
    }

    private final /* synthetic */ void J0() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void N3() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void Q2() {
    }

    private final /* synthetic */ void R2() {
    }

    private final /* synthetic */ void c0() {
    }

    private final /* synthetic */ void h0() {
    }

    private final /* synthetic */ void s2() {
    }

    private final /* synthetic */ void t2() {
    }

    private final /* synthetic */ void y3() {
    }

    private final /* synthetic */ void z3() {
    }

    @Override // l3.i
    public /* synthetic */ void a() {
    }

    @Override // e2.d
    public void e() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void o() {
    }

    @Override // l3.i
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void u() {
    }

    private final /* synthetic */ void C2(t1 t1Var) {
    }

    private final /* synthetic */ void D2(t1 t1Var) {
    }

    private final /* synthetic */ void G2(t1 t1Var) {
    }

    private final /* synthetic */ void G3(int i9) {
    }

    private final /* synthetic */ void H2(t1 t1Var) {
    }

    private final /* synthetic */ void H3(int i9) {
    }

    private final /* synthetic */ void I2(t1 t1Var) {
    }

    private final /* synthetic */ void J2(t1 t1Var) {
    }

    private final /* synthetic */ void K1(t1 t1Var) {
    }

    private final /* synthetic */ void K2(t1 t1Var) {
    }

    private final /* synthetic */ void L0(t1 t1Var) {
    }

    private final /* synthetic */ void L2(t1 t1Var) {
    }

    private final /* synthetic */ void L3(MessageObject messageObject) {
    }

    private final /* synthetic */ void M3(MessageObject messageObject) {
    }

    private final /* synthetic */ void N0(t1 t1Var) {
    }

    private final /* synthetic */ void N1(t1 t1Var) {
    }

    private final /* synthetic */ void O2(t1 t1Var) {
    }

    private final /* synthetic */ void P2(t1 t1Var) {
    }

    private final /* synthetic */ void V0(t1 t1Var) {
    }

    private final /* synthetic */ void X0(t1 t1Var) {
    }

    private final /* synthetic */ void Y2(String str) {
    }

    private final /* synthetic */ void Z2(String str) {
    }

    private final /* synthetic */ void a2(t1 t1Var) {
    }

    private final /* synthetic */ void c2(t1 t1Var) {
    }

    private final /* synthetic */ void d2(t1 t1Var) {
    }

    private final /* synthetic */ void e3(t1 t1Var) {
    }

    private final /* synthetic */ void f3(t1 t1Var) {
    }

    private final /* synthetic */ void h1(t1 t1Var) {
    }

    private final /* synthetic */ void h2(t1 t1Var) {
    }

    private final /* synthetic */ void i1(t1 t1Var) {
    }

    private final /* synthetic */ void i3(t1 t1Var) {
    }

    private final /* synthetic */ void j1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void j3(t1 t1Var) {
    }

    private final /* synthetic */ void k1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void k3(MessageObject messageObject) {
    }

    private final /* synthetic */ void l3(MessageObject messageObject) {
    }

    private final /* synthetic */ void m1(t1 t1Var) {
    }

    private final /* synthetic */ void m3(t1 t1Var) {
    }

    private final /* synthetic */ void n0(t1 t1Var) {
    }

    private final /* synthetic */ void n1(t1 t1Var) {
    }

    private final /* synthetic */ void n3(t1 t1Var) {
    }

    private final /* synthetic */ void p0(t1 t1Var) {
    }

    private final /* synthetic */ void q1(t1 t1Var) {
    }

    private final /* synthetic */ void q3(t1 t1Var) {
    }

    private final /* synthetic */ void r3(t1 t1Var) {
    }

    private final void s3(t1 t1Var) {
    }

    private final /* synthetic */ void u1(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final /* synthetic */ void w3(t1 t1Var) {
    }

    private final /* synthetic */ void x0(t1 t1Var) {
    }

    private final /* synthetic */ void x3(t1 t1Var) {
    }

    private final /* synthetic */ void y0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void E(TLRPC.User user) {
    }

    @Override // m3.c
    public long c(long j10) {
        return j10;
    }

    private final /* synthetic */ void E2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void F2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void J1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void P0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Q(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void T0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void U1(int i9, t1 t1Var) {
    }

    private final /* synthetic */ void V1(int i9, t1 t1Var) {
    }

    private final /* synthetic */ void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void Z1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void a3(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void b3(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void m2(int i9, t1 t1Var) {
    }

    private final /* synthetic */ void o1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void o3(t1 t1Var, f fVar) {
    }

    private final /* synthetic */ void p1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void p3(t1 t1Var, f fVar) {
    }

    private final /* synthetic */ void r2(int i9, t1 t1Var) {
    }

    private final /* synthetic */ void t3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void v1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void v3(t1 t1Var, boolean z10) {
    }

    @Override // l3.i
    public void H(Looper looper, i3.l lVar) {
    }

    @Override // e2.d
    public void g(int i9, Object obj) {
    }

    private final /* synthetic */ void K(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void M2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void N2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void O(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void Q1(t1 t1Var, int i9, int i10) {
    }

    private final /* synthetic */ void S2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void T1(t1 t1Var, int i9, int i10) {
    }

    private final /* synthetic */ void T2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void c1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void f1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void g3(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void h3(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void u2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void v2(t1 t1Var, float f10, float f11) {
    }

    private final /* synthetic */ void U2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void V2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void W2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void X2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void i2(t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void j2(t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void w2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final /* synthetic */ void x2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final /* synthetic */ void A2(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void B2(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void c3(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final /* synthetic */ void d3(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final /* synthetic */ void y2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void z2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void a1(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void b1(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void C3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    private final /* synthetic */ void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ii
    public void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }
}
