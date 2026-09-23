package qb;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import androidx.fragment.app.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import c5.b0;
import com.google.firebase.messaging.t;
import ei.m4;
import g2.x;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.z5;
import org.telegram.ui.iv0;
import r2.u;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public class b implements s0, bg.a, cg.a, da.c, fb.n, ui, n5.b, n2.q, q9.d, tb, k1, u, u5.a, z3.k {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static k4.d K3(y2.g gVar, b0 b0Var) {
        IOException iOException = (IOException) b0Var.c;
        if (!(iOException instanceof x)) {
            return null;
        }
        int i10 = ((x) iOException).d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (gVar.a(1)) {
            return new k4.d(1, 300000L);
        }
        if (gVar.a(2)) {
            return new k4.d(2, 60000L);
        }
        return null;
    }

    public static long M3(b0 b0Var) {
        Throwable th2 = (IOException) b0Var.c;
        if ((th2 instanceof b2.s0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.l)) {
            return -9223372036854775807L;
        }
        int i10 = g2.j.b;
        while (th2 != null) {
            if ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008) {
                return -9223372036854775807L;
            }
            th2 = th2.getCause();
        }
        return Math.min((b0Var.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
    }

    public static String Y3(ad.c cVar) {
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
    public /* synthetic */ void A(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public h2.b B(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // n2.q
    public byte[] C() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // z3.k
    public int D(b2.s sVar) {
        String str = sVar.r;
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
        throw new IllegalArgumentException(q3.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.k1
    public void D0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        switch (this.a) {
            case 14:
                return new h();
            default:
                synchronized (t7.s.class) {
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
                    t7.s.d(new t7.o());
                }
                return new ob.a(0);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 H(Class cls, v1.b bVar) {
        switch (this.a) {
        }
        return b(cls);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public void J(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // bg.a
    public int L1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    public int L3(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        nf.f.s(t1Var.getContext(), str);
    }

    public Signature[] N3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle O1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(t1 t1Var, MessageObject messageObject) {
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
    public /* synthetic */ void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // bg.a
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(na.d.s3(s10, s11));
            }
        }
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.tb
    public void U(ub ubVar, fb fbVar, og ogVar, nl nlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        nlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, 0.0f);
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new m4(1, ubVar, ogVar));
        kVar.b(new sb(nlVar, ubVar, 1));
        kVar.f();
        fbVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // z3.k
    public boolean W(b2.s sVar) {
        String str = sVar.r;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public byte[] X(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ hh.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ iv0 Y1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // r2.u
    public boolean Z(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 b(Class cls) {
        switch (this.a) {
            case 3:
                return new n0(true);
            default:
                return new w1.b();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // r2.u
    public MediaCodecInfo c(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public Map d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
        int i11 = this.a;
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
    public /* synthetic */ void e2(t1 t1Var) {
        int i10 = this.a;
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

    @Override // org.telegram.ui.Components.tb
    public void g(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, ubVar.getHeight());
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new hb(dbVar, 1));
        kVar.b(new sb(gbVar, ubVar, 0));
        kVar.f();
        fbVar.run();
    }

    @Override // r2.u
    public int g0() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var, long j3) {
        int i10 = this.a;
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 12:
                return new l5.q(Executors.newSingleThreadExecutor());
            default:
                rb.a aVar = new rb.a(23);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(i5.d.a, new r5.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(i5.d.c, new r5.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(i5.d.b, new r5.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < i5.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new r5.a(aVar, hashMap);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String h(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        int i10 = this.a;
        return ul.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, bi.f fVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // n2.q
    public void j0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // n2.q
    public n2.o k0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public n2.p m() {
        throw new IllegalStateException();
    }

    @Override // n2.q
    public int m0() {
        return 1;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m2(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(z5 z5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p() {
        int i10 = this.a;
    }

    @Override // r2.u
    public boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // fb.n
    public Object p2() {
        switch (this.a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // u5.a
    public long q() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // n2.q
    public boolean r0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // da.c
    public da.a s2(na.d dVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.a aVar = jSONObject.has("session") ? new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new da.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), aVar, new ac.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u1(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // r2.u
    public boolean v(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
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

    @Override // z3.k
    public z3.m x(b2.s sVar) {
        String str = sVar.r;
        List list = sVar.u;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new b4.i(list);
                case "application/pgs":
                    return new t(2);
                case "application/x-mp4-vtt":
                    return new a6.m(25);
                case "text/vtt":
                    return new of.b(21);
                case "application/x-quicktime-tx3g":
                    return new g4.a(list);
                case "text/x-ssa":
                    return new d4.a(list);
                case "application/vobsub":
                    return new t(list);
                case "application/x-subrip":
                    return new e4.a();
                case "application/ttml+xml":
                    return new f4.e();
            }
        }
        throw new IllegalArgumentException(q3.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Components.ui
    public void x0(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x2() {
        int i10 = this.a;
    }

    @Override // cg.a
    public void y(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            cg.a.q.y(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            cg.a.p.y(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ s9 z2() {
        switch (this.a) {
        }
        return null;
    }

    private final /* synthetic */ void E2() {
    }

    private final /* synthetic */ void F2() {
    }

    private final /* synthetic */ void H0() {
    }

    private final /* synthetic */ void J0() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void P3() {
    }

    private final /* synthetic */ void S3() {
    }

    private final /* synthetic */ void T3() {
    }

    private final /* synthetic */ void W3() {
    }

    private final /* synthetic */ void X3() {
    }

    private final /* synthetic */ void Y0() {
    }

    private final /* synthetic */ void a1() {
    }

    private final /* synthetic */ void b4() {
    }

    private final /* synthetic */ void c3() {
    }

    private final /* synthetic */ void c4() {
    }

    private final /* synthetic */ void d3() {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void K0() {
    }

    @Override // n2.q
    public void release() {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void u0() {
    }

    private final /* synthetic */ void C3(t1 t1Var) {
    }

    private final /* synthetic */ void D3(t1 t1Var) {
    }

    private final /* synthetic */ void E1(t1 t1Var) {
    }

    private final void E3(t1 t1Var) {
    }

    private final /* synthetic */ void F1(t1 t1Var) {
    }

    private final void G3(t1 t1Var) {
    }

    private final /* synthetic */ void I3(t1 t1Var) {
    }

    private final /* synthetic */ void J3(t1 t1Var) {
    }

    private final /* synthetic */ void L0(t1 t1Var) {
    }

    private final /* synthetic */ void O0(t1 t1Var) {
    }

    private final /* synthetic */ void O2(t1 t1Var) {
    }

    private final /* synthetic */ void P2(t1 t1Var) {
    }

    private final /* synthetic */ void Q0(t1 t1Var) {
    }

    private final /* synthetic */ void S2(t1 t1Var) {
    }

    private final /* synthetic */ void T0(t1 t1Var) {
    }

    private final /* synthetic */ void T2(t1 t1Var) {
    }

    private final /* synthetic */ void U2(t1 t1Var) {
    }

    private final /* synthetic */ void U3(int i10) {
    }

    private final /* synthetic */ void V2(t1 t1Var) {
    }

    private final /* synthetic */ void V3(int i10) {
    }

    private final /* synthetic */ void W2(t1 t1Var) {
    }

    private final /* synthetic */ void X2(t1 t1Var) {
    }

    private final /* synthetic */ void Z1(t1 t1Var) {
    }

    private final /* synthetic */ void Z3(MessageObject messageObject) {
    }

    private final /* synthetic */ void a3(t1 t1Var) {
    }

    private final /* synthetic */ void a4(MessageObject messageObject) {
    }

    private final /* synthetic */ void b1(t1 t1Var) {
    }

    private final /* synthetic */ void b3(t1 t1Var) {
    }

    private final /* synthetic */ void d1(t1 t1Var) {
    }

    private final /* synthetic */ void d2(t1 t1Var) {
    }

    private final /* synthetic */ void g1(t1 t1Var) {
    }

    private final /* synthetic */ void i1(t1 t1Var) {
    }

    private final /* synthetic */ void k3(String str) {
    }

    private final /* synthetic */ void l3(String str) {
    }

    private final /* synthetic */ void o2(t1 t1Var) {
    }

    private final /* synthetic */ void q3(t1 t1Var) {
    }

    private final /* synthetic */ void r1(t1 t1Var) {
    }

    private final /* synthetic */ void r2(t1 t1Var) {
    }

    private final /* synthetic */ void r3(t1 t1Var) {
    }

    private final /* synthetic */ void s1(t1 t1Var) {
    }

    private final /* synthetic */ void t1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void u2(t1 t1Var) {
    }

    private final /* synthetic */ void u3(t1 t1Var) {
    }

    private final /* synthetic */ void v1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void v3(t1 t1Var) {
    }

    private final /* synthetic */ void w1(t1 t1Var) {
    }

    private final /* synthetic */ void w2(t1 t1Var) {
    }

    private final /* synthetic */ void w3(MessageObject messageObject) {
    }

    private final /* synthetic */ void x1(t1 t1Var) {
    }

    private final /* synthetic */ void x3(MessageObject messageObject) {
    }

    private final /* synthetic */ void y3(t1 t1Var) {
    }

    private final /* synthetic */ void z3(t1 t1Var) {
    }

    @Override // n2.q
    public void K(byte[] bArr) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // n2.q
    public void a(k2.b0 b0Var) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void j1(TLRPC.User user) {
    }

    private final /* synthetic */ void A3(t1 t1Var, bi.f fVar) {
    }

    private final /* synthetic */ void B3(t1 t1Var, bi.f fVar) {
    }

    private final /* synthetic */ void C2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void D2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void E0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void F3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void G0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void H3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void J1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void Q2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void R2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void X1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void f1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void i2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void j2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void k2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void m3(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void n2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void n3(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void y1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void z1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // n2.q
    public /* synthetic */ void l(byte[] bArr, j2.k kVar) {
    }

    private final /* synthetic */ void C0(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void G2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void H2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Y2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Z2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void e3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void f2(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void f3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void h2(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void o1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void q1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void s0(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void s3(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void t3(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void A2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void B2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void I2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void J2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void g3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void h3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void i3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void j3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void K2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void L2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void M2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void N2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void o3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void p3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void l1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void n1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void Q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void R3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.ui
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
