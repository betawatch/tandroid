package ya;

import android.content.Context;
import android.media.MediaCodec;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.s0;
import j3.r0;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import m3.t;
import m3.w;
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
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.nu0;
import y3.x;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements androidx.car.app.messaging.model.b, n0, e2.d, f3.a, i6.c, jf.a, kf.a, l4.l, m3.m, na.n, on0, k1, p4.q, ii, v3.g, y8.d, y3.j {
    public static b b;
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i9) {
        this.a = i9;
    }

    public static MediaCodec T(y3.i iVar) {
        iVar.a.getClass();
        String str = iVar.a.a;
        d5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        d5.a.q();
        return createByCodecName;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String C(long j10) {
        return null;
    }

    @Override // v3.g
    public t D() {
        return new m3.o(-9223372036854775807L);
    }

    @Override // org.telegram.ui.Cells.k1
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle E1(t1 t1Var) {
        return null;
    }

    @Override // y3.j
    public y3.k G(y3.i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = T(iVar);
            d5.a.c("configureCodec");
            mediaCodec.configure(iVar.b, iVar.d, iVar.e, 0);
            d5.a.q();
            d5.a.c("startCodec");
            mediaCodec.start();
            d5.a.q();
            return new x(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // i6.c
    public int H(Context context, String str) {
        return i6.e.a(context, str);
    }

    @Override // jf.a
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        switch (this.a) {
            case 23:
                return new h();
            default:
                synchronized (androidx.activity.result.c.class) {
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
                    androidx.activity.result.c.b(new d7.o());
                }
                return new wa.a(0);
        }
    }

    @Override // m3.m
    public w I(int i9, int i10) {
        return new m3.j();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ nu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Components.on0
    public void Q(float f10, boolean z10) {
        gh.m.b = f10 * 2.0f;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // p4.q
    public s0 V1() {
        return new p4.p(p4.m.n, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(int i9, t1 t1Var) {
        return false;
    }

    @Override // na.n
    public Object Y1() {
        switch (this.a) {
            case 16:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(MessageObject messageObject) {
        return ll.a(messageObject);
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public void a() {
        synchronized (d5.a.h) {
            Object obj = d5.a.i;
            synchronized (obj) {
                if (d5.a.j) {
                    return;
                }
                long a2 = d5.a.a();
                synchronized (obj) {
                    d5.a.k = a2;
                    d5.a.j = true;
                }
            }
        }
    }

    @Override // v3.g
    public long b(m3.l lVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // l4.l
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Components.on0
    public /* synthetic */ int c0() {
        return 0;
    }

    @Override // f3.a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pg.a d0() {
        return null;
    }

    @Override // e2.d
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // e2.d
    public void g(int i9, Object obj) {
        String str;
        switch (i9) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i9 == 6 || i9 == 7 || i9 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // kf.a
    public void g0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i9 < i10) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(r0.l(i11, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i11;
        int ceil = (int) Math.ceil((i10 / i9) * remaining);
        int i12 = remaining - ceil;
        float f10 = ceil;
        float f11 = f10 / f10;
        float f12 = i12;
        float f13 = f12 / f12;
        while (ceil > 0 && i12 > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f11 = ceil / f10;
            } else {
                shortBuffer.position(shortBuffer.position() + i11);
                i12--;
                f13 = i12 / f12;
            }
        }
    }

    @Override // org.telegram.ui.Components.on0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String i(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // i6.c
    public int k(Context context, String str, boolean z10) {
        return i6.e.d(context, str, z10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int l0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n2(int i9) {
        return false;
    }

    @Override // l4.l
    public boolean next() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean o0() {
        return false;
    }

    @Override // l4.l
    public long p() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ o9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r0(t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public void t(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean t0() {
        return false;
    }

    @Override // p4.q
    public s0 x0(p4.m mVar, p4.j jVar) {
        return new p4.p(mVar, jVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        return false;
    }

    @Override // m3.m
    public void B() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1() {
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public void K() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.on0
    public void n() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void E(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(t1 t1Var) {
    }

    @Override // v3.g
    public void O(long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x(t1 t1Var) {
    }

    @Override // m3.m
    public void y(t tVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(int i9, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(int i9, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, eh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // jf.a
    public int B1(int i9, int i10, int i11) {
        return i9;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ii
    public void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }
}
