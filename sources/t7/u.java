package t7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDrmException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.Surface;
import b2.x;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import fi.m4;
import j$.util.Objects;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executors;
import org.json.JSONObject;
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
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zl;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class u implements c3.g, cg.a, dg.a, ea.c, g2.g, gb.p, ti, n5.b, n2.q, r9.d, vb, l1, r2.k, OnFailureListener, y9.c, z3.l {
    public static u b;
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    public static MediaCodec C0(com.google.firebase.messaging.m mVar) {
        String str = ((r2.o) mVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static ea.a E0(u uVar) {
        return new ea.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new bc.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static short L3(short s10, short s11) {
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    @Override // dg.a
    public void A(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            dg.a.t.A(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            dg.a.q.A(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
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

    @Override // n2.q
    public byte[] D() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
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
        return i10 / 2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // z3.l
    public int H(x xVar) {
        String str = xVar.s;
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
        throw new IllegalArgumentException(t8.b.h("Unsupported MIME type: ", str));
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

    @Override // n2.q
    public void K(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
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

    public boolean K3(CharSequence charSequence) {
        return false;
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
    public /* synthetic */ void N1(u1 u1Var, ah.t tVar) {
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
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(L3(shortBuffer.get(), shortBuffer.get()));
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

    @Override // org.telegram.ui.Components.vb
    public void X(wb wbVar, hb hbVar, qg qgVar, zl zlVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        zlVar.accept(Float.valueOf(wbVar.getTranslationY()));
        o1.k kVar = new o1.k(wbVar, wb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new m4(1, wbVar, qgVar));
        kVar.b(new ub(zlVar, wbVar, 1));
        kVar.h();
        hbVar.run();
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

    @Override // z3.l
    public boolean a0(x xVar) {
        String str = xVar.s;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a1(int i10, u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
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

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.t(false);
    }

    @Override // org.telegram.ui.Components.vb
    public void d(wb wbVar, hb hbVar, fb fbVar, ib ibVar) {
        o1.k kVar = new o1.k(wbVar, wb.IN_OUT_OFFSET_Y, wbVar.getHeight());
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new jb(fbVar, 1));
        kVar.b(new ub(ibVar, wbVar, 0));
        kVar.h();
        hbVar.run();
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

    @Override // y9.c
    public String f() {
        return null;
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

    @Override // n2.q
    public byte[] g0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1() {
        int i10 = this.a;
    }

    @Override // hd.a
    public Object get() {
        return new l5.p(Executors.newSingleThreadExecutor());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // r2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r2.l h(com.google.firebase.messaging.m mVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = C0(mVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) mVar.d;
            mediaCodec.configure((MediaFormat) mVar.b, surface, (MediaCrypto) mVar.e, (surface == null && ((r2.o) mVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new r2.x(mediaCodec, (r2.j) mVar.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e7) {
            e = e7;
            if (mediaCodec != null) {
            }
            throw e;
        }
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
        return new ConcurrentSkipListMap();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // n2.q
    public void j0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2() {
        int i10 = this.a;
    }

    @Override // n2.q
    public n2.o k0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
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
                rb.a aVar = new rb.a();
                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(7);
                ReferenceQueue referenceQueue = aVar.a;
                Set set = aVar.b;
                set.add(new rb.l(aVar, referenceQueue, set, nVar));
                Thread thread = new Thread(new j9.u(25, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            default:
                return new ub.a();
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

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // n2.q
    public n2.p p() {
        throw new IllegalStateException();
    }

    @Override // n2.q
    public int p0() {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public h2.b q(byte[] bArr) {
        throw new IllegalStateException();
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

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean r0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(u1 u1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // ea.c
    public ea.a t0(u uVar, JSONObject jSONObject) {
        return E0(uVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 t2() {
        switch (this.a) {
        }
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

    @Override // org.telegram.ui.Components.ti
    public void v(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean w() {
        return false;
    }

    @Override // n2.q
    public boolean w0(String str, byte[] bArr) {
        throw new IllegalStateException();
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

    @Override // z3.l
    public z3.n y(x xVar) {
        String str = xVar.s;
        List list = xVar.v;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new b4.i(list);
                case "application/pgs":
                    return new pi.e(2);
                case "application/x-mp4-vtt":
                    return new ya.c(25);
                case "text/vtt":
                    return new n4.s(21);
                case "application/x-quicktime-tx3g":
                    return new g4.a(list);
                case "text/x-ssa":
                    return new d4.a(list);
                case "application/vobsub":
                    return new h4.b(list);
                case "application/x-subrip":
                    return new e4.a();
                case "application/ttml+xml":
                    return new f4.e();
            }
        }
        throw new IllegalArgumentException(t8.b.h("Unsupported MIME type: ", str));
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

    private final /* synthetic */ void C2() {
    }

    private final /* synthetic */ void D2() {
    }

    private final /* synthetic */ void I3() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void O0() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void P3() {
    }

    private final /* synthetic */ void R0() {
    }

    private final /* synthetic */ void S3() {
    }

    private final /* synthetic */ void T3() {
    }

    private final /* synthetic */ void W3() {
    }

    private final /* synthetic */ void X3() {
    }

    private final /* synthetic */ void a3() {
    }

    private final /* synthetic */ void b1() {
    }

    private final /* synthetic */ void b3() {
    }

    private final /* synthetic */ void c1() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void F() {
    }

    @Override // y9.c
    public void a() {
    }

    @Override // n2.q
    public void release() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void z() {
    }

    private final /* synthetic */ void A3(u1 u1Var) {
    }

    private final /* synthetic */ void B3(u1 u1Var) {
    }

    private final void C3(u1 u1Var) {
    }

    private final /* synthetic */ void D1(u1 u1Var) {
    }

    private final void E3(u1 u1Var) {
    }

    private final /* synthetic */ void G3(u1 u1Var) {
    }

    private final /* synthetic */ void H3(u1 u1Var) {
    }

    private final /* synthetic */ void M2(u1 u1Var) {
    }

    private final /* synthetic */ void N2(u1 u1Var) {
    }

    private final /* synthetic */ void Q2(u1 u1Var) {
    }

    private final /* synthetic */ void Q3(int i10) {
    }

    private final /* synthetic */ void R2(u1 u1Var) {
    }

    private final /* synthetic */ void R3(int i10) {
    }

    private final /* synthetic */ void S2(u1 u1Var) {
    }

    private final /* synthetic */ void T2(u1 u1Var) {
    }

    private final /* synthetic */ void U2(u1 u1Var) {
    }

    private final /* synthetic */ void U3(MessageObject messageObject) {
    }

    private final /* synthetic */ void V0(u1 u1Var) {
    }

    private final /* synthetic */ void V2(u1 u1Var) {
    }

    private final /* synthetic */ void V3(MessageObject messageObject) {
    }

    private final /* synthetic */ void W1(u1 u1Var) {
    }

    private final /* synthetic */ void X0(u1 u1Var) {
    }

    private final /* synthetic */ void Y0(u1 u1Var) {
    }

    private final /* synthetic */ void Y1(u1 u1Var) {
    }

    private final /* synthetic */ void Y2(u1 u1Var) {
    }

    private final /* synthetic */ void Z0(u1 u1Var) {
    }

    private final /* synthetic */ void Z2(u1 u1Var) {
    }

    private final /* synthetic */ void c2(u1 u1Var) {
    }

    private final /* synthetic */ void d1(u1 u1Var) {
    }

    private final /* synthetic */ void d2(u1 u1Var) {
    }

    private final /* synthetic */ void f1(u1 u1Var) {
    }

    private final /* synthetic */ void i3(String str) {
    }

    private final /* synthetic */ void j3(String str) {
    }

    private final /* synthetic */ void k1(u1 u1Var) {
    }

    private final /* synthetic */ void m1(u1 u1Var) {
    }

    private final /* synthetic */ void o3(u1 u1Var) {
    }

    private final /* synthetic */ void p3(u1 u1Var) {
    }

    private final /* synthetic */ void s1(u1 u1Var) {
    }

    private final /* synthetic */ void s3(u1 u1Var) {
    }

    private final /* synthetic */ void t1(u1 u1Var) {
    }

    private final /* synthetic */ void t3(u1 u1Var) {
    }

    private final /* synthetic */ void u1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void u2(u1 u1Var) {
    }

    private final /* synthetic */ void u3(MessageObject messageObject) {
    }

    private final /* synthetic */ void v1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void v2(u1 u1Var) {
    }

    private final /* synthetic */ void v3(MessageObject messageObject) {
    }

    private final /* synthetic */ void w2(u1 u1Var) {
    }

    private final /* synthetic */ void w3(u1 u1Var) {
    }

    private final /* synthetic */ void x2(u1 u1Var) {
    }

    private final /* synthetic */ void x3(u1 u1Var) {
    }

    private final /* synthetic */ void z1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void J(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void U(TLRPC.User user) {
    }

    @Override // n2.q
    public void W(byte[] bArr) {
    }

    @Override // c3.g
    public long l(long j10) {
        return j10;
    }

    @Override // n2.q
    public void m0(m.l lVar) {
    }

    private final /* synthetic */ void A2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void B2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void D3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void F3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void G1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void I1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void J0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void M0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void O2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void P2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void a2(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void b2(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void j1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void k3(u1 u1Var, long j10) {
    }

    private final /* synthetic */ void l3(u1 u1Var, long j10) {
    }

    private final /* synthetic */ void m2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void o2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void q2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void y3(u1 u1Var, ah.t tVar) {
    }

    private final /* synthetic */ void z3(u1 u1Var, ah.t tVar) {
    }

    @Override // n2.q
    public /* synthetic */ void k(byte[] bArr, j2.k kVar) {
    }

    private final /* synthetic */ void E2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void F2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void G0(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void I0(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void W2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void c3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void d3(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void g2(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void h2(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void p1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void q3(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void r1(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void r3(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void G2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void H2(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void e3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void f3(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void g3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void h3(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void y2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void z2(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void I2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void J2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void K2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void L2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void m3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void n3(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void n1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void o1(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void M3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void N3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ti
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
