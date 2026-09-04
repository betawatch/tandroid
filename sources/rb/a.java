package rb;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import androidx.fragment.app.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b4.i;
import c5.b0;
import da.c;
import f4.e;
import fb.n;
import fi.n4;
import g2.j;
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
import ji.u4;
import l5.p;
import n2.o;
import n2.q;
import n5.b;
import of.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import q9.d;
import qb.h;
import r2.u;
import t7.s;
import y2.g;
import y2.l;
import z3.k;
import z3.m;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class a implements s0, bg.a, cg.a, c, n, ti, b, q, d, tb, k1, u, u5.a, k {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static k4.d K3(g gVar, b0 b0Var) {
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
        if ((th2 instanceof b2.s0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof l)) {
            return -9223372036854775807L;
        }
        int i10 = j.b;
        while (th2 != null) {
            if ((th2 instanceof j) && ((j) th2).a == 2008) {
                return -9223372036854775807L;
            }
            th2 = th2.getCause();
        }
        return Math.min((b0Var.b - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public void A0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ti
    public void B(hh hhVar) {
        hhVar.run();
    }

    @Override // n2.q
    public o B0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.q
    public h2.a C(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // q9.d
    public Object D(cf.c cVar) {
        switch (this.a) {
            case 14:
                return new h();
            default:
                synchronized (s.class) {
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
                    s.d(new t7.o());
                }
                return new ob.a(0);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean D0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // bg.a
    public int E1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // n2.q
    public byte[] G() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // n2.q
    public int G0() {
        return 1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // z3.k
    public int J(b2.s sVar) {
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
        throw new IllegalArgumentException(p6.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // r2.u
    public boolean K0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, ah.u uVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L0(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
        int i10 = this.a;
    }

    public int L3(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
        int i11 = this.a;
    }

    @Override // n2.q
    public boolean M0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
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

    @Override // bg.a
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
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
                shortBuffer2.put(ob.a.p3(s10, s11));
            }
        }
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ov0 Q1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(t1 t1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 U(Class cls, v1.b bVar) {
        switch (this.a) {
        }
        return a(cls);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // n2.q
    public void W(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X0(int i10, t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a Y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, long j3) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 a(Class cls) {
        switch (this.a) {
            case 3:
                return new l0(true);
            default:
                return new w1.b();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // r2.u
    public MediaCodecInfo b(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean c() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(MessageObject messageObject) {
        int i10 = this.a;
        return wl.a(messageObject);
    }

    @Override // n2.q
    public Map d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tb
    public void e(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, ubVar.getHeight());
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new hb(dbVar, 1));
        kVar.b(new sb(gbVar, ubVar, 0));
        kVar.f();
        fbVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1() {
        int i10 = this.a;
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
    public /* synthetic */ int f0(t1 t1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 12:
                return new p(Executors.newSingleThreadExecutor());
            default:
                t7.u uVar = new t7.u(23);
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
                return new r5.a(uVar, hashMap);
        }
    }

    @Override // org.telegram.ui.Components.tb
    public void h0(ub ubVar, fb fbVar, pg pgVar, ml mlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        mlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, 0.0f);
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new n4(1, ubVar, pgVar));
        kVar.b(new sb(mlVar, ubVar, 1));
        kVar.f();
        fbVar.run();
    }

    @Override // fb.n
    public Object h2() {
        switch (this.a) {
            case 8:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // z3.k
    public boolean i0(b2.s sVar) {
        String str = sVar.r;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // n2.q
    public n2.p k() {
        throw new IllegalStateException();
    }

    @Override // da.c
    public da.a k0(ob.a aVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        com.google.android.gms.internal.cast.a aVar2 = jSONObject.has("session") ? new com.google.android.gms.internal.cast.a(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new com.google.android.gms.internal.cast.a(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new da.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), aVar2, new ac.d(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // u5.a
    public long l() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n0(z5 z5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
        int i10 = this.a;
    }

    @Override // n2.q
    public byte[] o0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
        int i10 = this.a;
    }

    @Override // r2.u
    public boolean p(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // r2.u
    public boolean q0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ r9 q2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // r2.u
    public int r0() {
        return MediaCodecList.getCodecCount();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, float f7, float f10, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // z3.k
    public m v(b2.s sVar) {
        String str = sVar.r;
        List list = sVar.u;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new i(list);
                case "application/pgs":
                    return new com.google.firebase.messaging.s(2);
                case "application/x-mp4-vtt":
                    return new a4.m(25);
                case "text/vtt":
                    return new pf.b(21);
                case "application/x-quicktime-tx3g":
                    return new g4.a(list);
                case "text/x-ssa":
                    return new d4.a(list);
                case "application/vobsub":
                    return new com.google.firebase.messaging.s(list);
                case "application/x-subrip":
                    return new e4.a();
                case "application/ttml+xml":
                    return new e();
            }
        }
        throw new IllegalArgumentException(p6.i("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // cg.a
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            cg.a.q.z(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            cg.a.p.z(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // n2.q
    public void z0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    private final /* synthetic */ void E2() {
    }

    private final /* synthetic */ void F2() {
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

    private final /* synthetic */ void Z0() {
    }

    private final /* synthetic */ void a4() {
    }

    private final /* synthetic */ void b4() {
    }

    private final /* synthetic */ void c3() {
    }

    private final /* synthetic */ void d3() {
    }

    private final /* synthetic */ void h1() {
    }

    private final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void H() {
    }

    @Override // n2.q
    public void release() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void x() {
    }

    private final /* synthetic */ void C1(t1 t1Var) {
    }

    private final /* synthetic */ void C3(t1 t1Var) {
    }

    private final /* synthetic */ void D3(t1 t1Var) {
    }

    private final void E3(t1 t1Var) {
    }

    private final void G3(t1 t1Var) {
    }

    private final /* synthetic */ void I3(t1 t1Var) {
    }

    private final /* synthetic */ void J3(t1 t1Var) {
    }

    private final /* synthetic */ void O2(t1 t1Var) {
    }

    private final /* synthetic */ void P1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void P2(t1 t1Var) {
    }

    private final /* synthetic */ void R1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void S2(t1 t1Var) {
    }

    private final /* synthetic */ void T2(t1 t1Var) {
    }

    private final /* synthetic */ void U2(t1 t1Var) {
    }

    private final /* synthetic */ void U3(int i10) {
    }

    private final /* synthetic */ void V1(t1 t1Var) {
    }

    private final /* synthetic */ void V2(t1 t1Var) {
    }

    private final /* synthetic */ void V3(int i10) {
    }

    private final /* synthetic */ void W2(t1 t1Var) {
    }

    private final /* synthetic */ void X1(t1 t1Var) {
    }

    private final /* synthetic */ void X2(t1 t1Var) {
    }

    private final /* synthetic */ void Y3(MessageObject messageObject) {
    }

    private final /* synthetic */ void Z3(MessageObject messageObject) {
    }

    private final /* synthetic */ void a1(t1 t1Var) {
    }

    private final /* synthetic */ void a3(t1 t1Var) {
    }

    private final /* synthetic */ void b1(t1 t1Var) {
    }

    private final /* synthetic */ void b2(t1 t1Var) {
    }

    private final /* synthetic */ void b3(t1 t1Var) {
    }

    private final /* synthetic */ void c2(t1 t1Var) {
    }

    private final /* synthetic */ void d1(t1 t1Var) {
    }

    private final /* synthetic */ void f1(t1 t1Var) {
    }

    private final /* synthetic */ void j2(t1 t1Var) {
    }

    private final /* synthetic */ void k1(t1 t1Var) {
    }

    private final /* synthetic */ void k3(String str) {
    }

    private final /* synthetic */ void l1(t1 t1Var) {
    }

    private final /* synthetic */ void l2(t1 t1Var) {
    }

    private final /* synthetic */ void l3(String str) {
    }

    private final /* synthetic */ void p1(t1 t1Var) {
    }

    private final /* synthetic */ void q1(t1 t1Var) {
    }

    private final /* synthetic */ void q3(t1 t1Var) {
    }

    private final /* synthetic */ void r3(t1 t1Var) {
    }

    private final /* synthetic */ void u3(t1 t1Var) {
    }

    private final /* synthetic */ void v3(t1 t1Var) {
    }

    private final /* synthetic */ void w2(t1 t1Var) {
    }

    private final /* synthetic */ void w3(MessageObject messageObject) {
    }

    private final /* synthetic */ void x2(t1 t1Var) {
    }

    private final /* synthetic */ void x3(MessageObject messageObject) {
    }

    private final /* synthetic */ void y1(t1 t1Var) {
    }

    private final /* synthetic */ void y2(t1 t1Var) {
    }

    private final /* synthetic */ void y3(t1 t1Var) {
    }

    private final /* synthetic */ void z2(t1 t1Var) {
    }

    private final /* synthetic */ void z3(t1 t1Var) {
    }

    @Override // n2.q
    public void H0(u4 u4Var) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void K(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // n2.q
    public void b0(byte[] bArr) {
    }

    private final /* synthetic */ void A3(t1 t1Var, ah.u uVar) {
    }

    private final /* synthetic */ void B3(t1 t1Var, ah.u uVar) {
    }

    private final /* synthetic */ void C2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void D2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void F3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void H3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void Q2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void R2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void V0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void W0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Z1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void a2(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void f2(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void g2(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void m3(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void n1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void n3(t1 t1Var, long j3) {
    }

    private final /* synthetic */ void s2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void t2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void u2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void v2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // n2.q
    public /* synthetic */ void h(byte[] bArr, j2.k kVar) {
    }

    private final /* synthetic */ void G2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void H2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void P0(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void T0(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Y2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void Z2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void e3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void f3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void n2(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void r2(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void s3(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void t1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void t3(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void x1(t1 t1Var, TLObject tLObject, boolean z10) {
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

    private final /* synthetic */ void r1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void s1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void Q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void R3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.ti
    public void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
