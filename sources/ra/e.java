package ra;

import a3.m;
import a3.s;
import a7.l;
import android.content.Context;
import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import b8.ke;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g2.n0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l2.k;
import org.json.JSONObject;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.uf;
import org.telegram.ui.f11;
import org.telegram.ui.mm;
import org.telegram.ui.vq0;
import p2.o;
import p2.q;
import r2.p;
import r2.t;
import t2.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements a7.e, m, ba.d, f11, k5.e, fg.a, gg.a, ha.d, i2.g, t9.d, SuccessContinuation, OnFailureListener, s, uf, l1, q, t, u {
    public static final /* synthetic */ e b = new e(13);
    public static e c;
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i3) {
        this.a = i3;
    }

    public static short D4(short s6, short s10) {
        int i3 = s6 + 32768;
        int i10 = s10 + 32768;
        int i11 = (i3 < 32768 || i10 < 32768) ? (i3 * i10) / 32768 : (((i3 + i10) * 2) - ((i3 * i10) / 32768)) - 65535;
        return (short) ((i11 != 65536 ? i11 : 65535) - 32768);
    }

    public static ha.b s2(nb.a aVar) {
        return new ha.b(System.currentTimeMillis() + 3600000, new l(8), new ha.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // t2.u
    public boolean B1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // p2.q
    public byte[] C0() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(zi ziVar) {
        int i3 = this.a;
    }

    @Override // ba.d
    public String D() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // t2.u
    public int D1() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z10, boolean z11) {
        int i3 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        sf.c.t(q1Var.getContext(), str);
    }

    @Override // p2.q
    public void F1(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle G1(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var, o2 o2Var) {
        int i3 = this.a;
    }

    @Override // fg.a
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(D4(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1(q1 q1Var, zi ziVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(wi wiVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // p2.q
    public o J1(byte[] bArr, List list, int i3, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1() {
        int i3 = this.a;
    }

    @Override // a3.s
    public Object L(Uri uri, i2.l lVar) {
        return Long.valueOf(n0.V(new BufferedReader(new InputStreamReader(lVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i3 = this.a;
    }

    @Override // p2.q
    public int L1() {
        return 1;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers M() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ int O0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(zi ziVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P0(q1 q1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(q1 q1Var, g10 g10Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ TL_stories.StoryItem R0() {
        return null;
    }

    @Override // r2.t
    public s R1() {
        return new r2.s(p.n, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vq0 S1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // p2.q
    public void U0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(String str, String str2) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.uf
    public boolean V0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // p2.q
    public p2.p W() {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(zi ziVar) {
        int i3 = this.a;
        return f1.a(ziVar);
    }

    @Override // t2.u
    public boolean Y(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kh.a Z() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // a3.m
    public void a() {
        synchronized (b3.b.a) {
            Object obj = b3.b.b;
            synchronized (obj) {
                if (b3.b.c) {
                    return;
                }
                long a10 = b3.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    b3.b.d = a10;
                    b3.b.c = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(q1 q1Var, long j10) {
        int i3 = this.a;
    }

    @Override // k5.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1() {
        int i3 = this.a;
    }

    @Override // i2.g
    public i2.h createDataSource() {
        return new i2.u(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(q1 q1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, int i3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(q1 q1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // t2.u
    public MediaCodecInfo h(int i3) {
        return MediaCodecList.getCodecInfoAt(i3);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(q1 q1Var, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ mm i0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(q1 q1Var, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int j0(q1 q1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // r2.t
    public s j2(p pVar, r2.m mVar) {
        return new r2.s(pVar, mVar);
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean k1() {
        return false;
    }

    @Override // t2.u
    public boolean k2() {
        return false;
    }

    @Override // ha.d
    public ha.b l(nb.a aVar, JSONObject jSONObject) {
        return s2(aVar);
    }

    @Override // gg.a
    public void l0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i3 < i10) {
            gg.a.u.l0(shortBuffer, i3, shortBuffer2, i10, i11);
        } else if (i3 > i10) {
            gg.a.t.l0(shortBuffer, i3, shortBuffer2, i10, i11);
        } else {
            if (i3 != i10) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // a7.e
    public a7.d l1(Context context, String str, a7.c cVar) {
        a7.d dVar = new a7.d();
        dVar.a = cVar.k(context, str);
        int i3 = 1;
        int e10 = cVar.e(context, str, true);
        dVar.b = e10;
        int i10 = dVar.a;
        if (i10 == 0) {
            i10 = 0;
            if (e10 == 0) {
                i3 = 0;
                dVar.c = i3;
                return dVar;
            }
        }
        if (e10 < i10) {
            i3 = -1;
        }
        dVar.c = i3;
        return dVar;
    }

    @Override // p2.q
    public boolean l2(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m2(int i3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ int o() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(p5 p5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // p2.q
    public byte[] o1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2() {
        int i3 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p2(q1 q1Var, int i3, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
        int i3 = this.a;
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        switch (this.a) {
            case 11:
                return new lb.c(keVar.I(lb.b.class));
            case 12:
                return new lb.b(keVar.f(kb.a.class));
            default:
                return new pb.a();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ i9 q2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // p2.q
    public Map r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p2.q
    public j2.b r0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public void r1(q1 q1Var, boolean z10, boolean z11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(q1 q1Var, float f10, float f11, boolean z10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i3 = l6.c.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ boolean u0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var, boolean z10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
        int i3 = this.a;
    }

    @Override // fg.a
    public int v1(int i3, int i10, int i11) {
        return i3 / 2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(zi ziVar) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String z(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(q1 q1Var, int i3) {
        int i10 = this.a;
    }

    private final /* synthetic */ void B4() {
    }

    private final /* synthetic */ void C4() {
    }

    private final /* synthetic */ void D2() {
    }

    private final /* synthetic */ void E2() {
    }

    private final /* synthetic */ void G4() {
    }

    private final /* synthetic */ void H4() {
    }

    private final /* synthetic */ void K4() {
    }

    private final /* synthetic */ void L4() {
    }

    private final /* synthetic */ void O4() {
    }

    private final /* synthetic */ void P4() {
    }

    private final /* synthetic */ void R3() {
    }

    private final /* synthetic */ void S3() {
    }

    private final /* synthetic */ void r3() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void x2() {
    }

    private final /* synthetic */ void y2() {
    }

    @Override // org.telegram.ui.Components.uf
    public void E() {
    }

    @Override // org.telegram.ui.Components.uf
    public void F() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void O1() {
    }

    @Override // a3.m
    public void X1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void Z0() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void a0() {
    }

    @Override // ba.d
    public void b() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void b2() {
    }

    @Override // org.telegram.ui.Components.uf
    public void e() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void g0() {
    }

    @Override // org.telegram.ui.Components.uf
    public void g1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void g2() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void n2() {
    }

    @Override // org.telegram.ui.Components.uf
    public void q0() {
    }

    @Override // org.telegram.ui.Components.uf
    public void r2() {
    }

    @Override // p2.q
    public void release() {
    }

    @Override // org.telegram.ui.Components.uf
    public void s1() {
    }

    @Override // org.telegram.ui.Components.uf
    public void u() {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void w0() {
    }

    private final /* synthetic */ void A2(q1 q1Var) {
    }

    private final /* synthetic */ void B2(q1 q1Var) {
    }

    private final /* synthetic */ void B3(q1 q1Var) {
    }

    private final /* synthetic */ void C2(q1 q1Var) {
    }

    private final /* synthetic */ void C3(q1 q1Var) {
    }

    private final /* synthetic */ void F2(q1 q1Var) {
    }

    private final /* synthetic */ void G2(q1 q1Var) {
    }

    private final /* synthetic */ void H3(q1 q1Var) {
    }

    private final /* synthetic */ void I3(q1 q1Var) {
    }

    private final /* synthetic */ void I4(int i3) {
    }

    private final /* synthetic */ void J2(q1 q1Var) {
    }

    private final /* synthetic */ void J3(q1 q1Var) {
    }

    private final /* synthetic */ void J4(int i3) {
    }

    private final /* synthetic */ void K2(q1 q1Var) {
    }

    private final /* synthetic */ void K3(q1 q1Var) {
    }

    private final /* synthetic */ void L3(q1 q1Var) {
    }

    private final /* synthetic */ void M3(q1 q1Var) {
    }

    private final /* synthetic */ void M4(zi ziVar) {
    }

    private final /* synthetic */ void N4(zi ziVar) {
    }

    private final /* synthetic */ void P2(q1 q1Var) {
    }

    private final /* synthetic */ void P3(q1 q1Var) {
    }

    private final /* synthetic */ void Q2(q1 q1Var) {
    }

    private final /* synthetic */ void Q3(q1 q1Var) {
    }

    private final /* synthetic */ void R2(wi wiVar) {
    }

    private final /* synthetic */ void S2(wi wiVar) {
    }

    private final /* synthetic */ void T2(q1 q1Var) {
    }

    private final /* synthetic */ void U2(q1 q1Var) {
    }

    private final /* synthetic */ void X2(q1 q1Var) {
    }

    private final /* synthetic */ void Y2(q1 q1Var) {
    }

    private final /* synthetic */ void Z3(String str) {
    }

    private final /* synthetic */ void a4(String str) {
    }

    private final /* synthetic */ void b3(q1 q1Var) {
    }

    private final /* synthetic */ void c3(q1 q1Var) {
    }

    private final /* synthetic */ void f4(q1 q1Var) {
    }

    private final /* synthetic */ void g4(q1 q1Var) {
    }

    private final /* synthetic */ void j3(q1 q1Var) {
    }

    private final /* synthetic */ void j4(q1 q1Var) {
    }

    private final /* synthetic */ void k3(q1 q1Var) {
    }

    private final /* synthetic */ void k4(q1 q1Var) {
    }

    private final /* synthetic */ void l3(q1 q1Var) {
    }

    private final /* synthetic */ void l4(zi ziVar) {
    }

    private final /* synthetic */ void m3(q1 q1Var) {
    }

    private final /* synthetic */ void m4(zi ziVar) {
    }

    private final /* synthetic */ void n4(q1 q1Var) {
    }

    private final /* synthetic */ void o4(q1 q1Var) {
    }

    private final /* synthetic */ void r4(q1 q1Var) {
    }

    private final /* synthetic */ void s4(q1 q1Var) {
    }

    private final /* synthetic */ void x4(q1 q1Var) {
    }

    private final /* synthetic */ void z2(q1 q1Var) {
    }

    private final /* synthetic */ void z4(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void M0(int i3) {
    }

    @Override // org.telegram.ui.Components.uf
    public void T1(int i3) {
    }

    @Override // p2.q
    public void W0(byte[] bArr) {
    }

    @Override // org.telegram.ui.Components.uf
    public void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void c2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void j1(CharSequence charSequence) {
    }

    @Override // p2.q
    public void m(org.telegram.ui.Components.i9 i9Var) {
    }

    @Override // org.telegram.ui.Components.uf
    public /* synthetic */ void x(float f10) {
    }

    private final /* synthetic */ void D3(String str, String str2) {
    }

    private final /* synthetic */ void E3(String str, String str2) {
    }

    private final /* synthetic */ void H2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void I2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void V2(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void W2(q1 q1Var, o2 o2Var) {
    }

    private final /* synthetic */ void Z2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void a3(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void b4(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void c4(q1 q1Var, long j10) {
    }

    private final /* synthetic */ void f3(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void g3(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void h3(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void i3(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void p3(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void p4(q1 q1Var, g10 g10Var) {
    }

    private final /* synthetic */ void q3(q1 q1Var, int i3) {
    }

    private final /* synthetic */ void q4(q1 q1Var, g10 g10Var) {
    }

    private final /* synthetic */ void t4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void v2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void v4(q1 q1Var, boolean z10) {
    }

    private final /* synthetic */ void w2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Components.uf
    public void O(float f10, int i3) {
    }

    @Override // p2.q
    public /* synthetic */ void v0(byte[] bArr, k kVar) {
    }

    private final void A4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void F3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void G3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void N2(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void N3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void O2(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void O3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void T3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void U3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void d3(q1 q1Var, int i3, int i10) {
    }

    private final /* synthetic */ void e3(q1 q1Var, int i3, int i10) {
    }

    private final /* synthetic */ void h4(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void i4(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void t2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void t3(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void u2(q1 q1Var, float f10, float f11) {
    }

    private final /* synthetic */ void u3(q1 q1Var, float f10, float f11) {
    }

    private final void u4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void w4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void y4(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.uf
    public void Y0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.uf
    public void h1(View view, CharSequence charSequence, boolean z10) {
    }

    private final /* synthetic */ void V3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void W3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void X3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void Y3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void n3(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void o3(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void v3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final /* synthetic */ void w3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final /* synthetic */ void A3(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void d4(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final /* synthetic */ void e4(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final /* synthetic */ void x3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void y3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void z3(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
    }

    private final /* synthetic */ void L2(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void M2(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.uf
    public void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
    }

    private final /* synthetic */ void E4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }

    private final /* synthetic */ void F4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
