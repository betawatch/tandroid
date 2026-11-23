package qb;

import a8.r7;
import ab.g;
import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import b3.h;
import b3.i;
import b3.j;
import b3.m;
import b3.o;
import c3.b;
import ca.d;
import com.google.android.gms.common.api.r;
import com.google.firebase.components.ComponentRegistrar;
import e2.t0;
import f3.j0;
import f3.q;
import j2.u;
import j2.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import pb.k;
import q6.l;
import sg.i1;
import u9.e;
import vf.c;
import w7.s;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a implements gh.a, m, d, eg.a, q, ia.d, e, w, u9.d, ri, b61, m1, l, i1, x5.a {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    public static i Q4(h hVar, j jVar) {
        IOException iOException = (IOException) jVar.c;
        if (!(iOException instanceof x)) {
            return null;
        }
        int i7 = ((x) iOException).c;
        if (i7 != 403 && i7 != 404 && i7 != 410 && i7 != 416 && i7 != 500 && i7 != 503) {
            return null;
        }
        if (hVar.a(1)) {
            return new i(1, 300000L);
        }
        if (hVar.a(2)) {
            return new i(2, 60000L);
        }
        return null;
    }

    public static long S4(j jVar) {
        for (Throwable th2 = (IOException) jVar.c; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof u) || (th2 instanceof o)) {
                return -9223372036854775807L;
            }
            if ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((jVar.b - 1) * 1000, 5000);
    }

    public static short W4(short s5, short s9) {
        int i7 = s5 + 32768;
        int i10 = s9 + 32768;
        int i11 = (i7 < 32768 || i10 < 32768) ? (i7 * i10) / 32768 : (((i7 + i10) * 2) - ((i7 * i10) / 32768)) - 65535;
        return (short) ((i11 != 65536 ? i11 : 65535) - 32768);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A2(r1 r1Var, int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ j9 B2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(r1 r1Var, float f10, float f11, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String D(long j3) {
        switch (this.a) {
        }
        return null;
    }

    @Override // gh.a
    public /* synthetic */ int D0() {
        return 0;
    }

    @Override // gh.a
    public /* synthetic */ int D1() {
        return 0;
    }

    @Override // eg.a
    public void E0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(W4(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean F0(fj fjVar) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(r1 r1Var, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void G0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void H0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(r1 r1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(r1 r1Var, TLObject tLObject, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J0(r1 r1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(r1 r1Var, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(r1 r1Var, p2 p2Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void M(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public void M0(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.a;
    }

    @Override // eg.a
    public int M1(int i7, int i10, int i11) {
        return i7 / 2;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O(cj cjVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(fj fjVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.a;
    }

    @Override // gh.a
    public int Q0() {
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.m1
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean R0(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(r1 r1Var) {
        switch (this.a) {
        }
        return null;
    }

    public int R4(int i7) {
        return i7 == 7 ? 6 : 3;
    }

    @Override // org.telegram.ui.Components.ri
    public void S(fh fhVar) {
        fhVar.run();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // gh.a
    public /* synthetic */ float T0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(r1 r1Var, fj fjVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
        int i7 = this.a;
    }

    @Override // gh.a
    public /* synthetic */ float V0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W(fj fjVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // gh.a
    public int X1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Y() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z(r1 r1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // f3.q
    public void Z0() {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.a;
    }

    @Override // b3.m
    public void a() {
        synchronized (b.a) {
            Object obj = b.b;
            synchronized (obj) {
                if (b.c) {
                    return;
                }
                long a10 = b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    b.d = a10;
                    b.c = true;
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean b0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void b2(r1 r1Var, h10 h10Var) {
        int i7 = this.a;
    }

    @Override // u9.d
    public Object c(r7 r7Var) {
        switch (this.a) {
            case 14:
                return new a(0);
            case 15:
                return new pb.b(0);
            case 21:
                return new k((Context) r7Var.a(Context.class));
            default:
                return new sb.a();
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean c1(r1 r1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void d0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // f3.q
    public j0 d2(int i7, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int e0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e1(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void f1(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f2(long j3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // ia.d
    public ia.b g(s sVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        b7.l lVar = jSONObject.has("session") ? new b7.l(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new b7.l(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new ia.b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), lVar, new ia.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean g1(fj fjVar) {
        int i7 = this.a;
        return c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // f3.q
    public void h(f3.c0 c0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a h0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i() {
        switch (this.a) {
        }
        return true;
    }

    @Override // gh.a
    public int i0() {
        return 0;
    }

    @Override // u9.e
    public List j(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (u9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new u9.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new g(20, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j0(r1 r1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String k(r1 r1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean k0(r1 r1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k2(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // ca.d
    public String l() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(r1 r1Var, long j3) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m0(int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.a;
    }

    @Override // q6.l
    public /* bridge */ /* synthetic */ Object n(r rVar) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean n0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // x5.a
    public long o() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(r1 r1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int p0(r1 r1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p1(r1 r1Var, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.b61
    public boolean r() {
        return n6.A0().i != null;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean r0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t(r1 r1Var) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t0(String str) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(r1 r1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // l.w
    public boolean u(l.k kVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u2() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v0(x5 x5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.b61
    public void w(boolean z10, float[] fArr) {
        n6.A0().e(z10, fArr);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x0(r1 r1Var, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // gh.a
    public int x2() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y2(int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean z1(r1 r1Var, int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z2() {
        int i7 = this.a;
    }

    public a(WearAuthListenerService wearAuthListenerService) {
        this.a = 1;
    }

    public a() {
        this.a = 23;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    private final /* synthetic */ void K() {
    }

    private final /* synthetic */ void N() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void P3() {
    }

    private final /* synthetic */ void Q() {
    }

    private final /* synthetic */ void Q3() {
    }

    private final /* synthetic */ void T4() {
    }

    private final /* synthetic */ void U4() {
    }

    private final /* synthetic */ void V4() {
    }

    private final /* synthetic */ void a5() {
    }

    private final /* synthetic */ void b3() {
    }

    private final /* synthetic */ void b5() {
    }

    private final /* synthetic */ void c3() {
    }

    private final /* synthetic */ void c5() {
    }

    private final /* synthetic */ void d3() {
    }

    private final /* synthetic */ void g5() {
    }

    private final /* synthetic */ void h5() {
    }

    private final /* synthetic */ void i5() {
    }

    private final /* synthetic */ void m5() {
    }

    private final /* synthetic */ void n5() {
    }

    private final /* synthetic */ void o5() {
    }

    private final /* synthetic */ void u0() {
    }

    private final /* synthetic */ void w0() {
    }

    private final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void B0() {
    }

    @Override // ca.d
    public void b() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void l0() {
    }

    @Override // sg.i1
    public void v() {
    }

    @Override // b3.m
    public void y() {
    }

    private final /* synthetic */ void A3(r1 r1Var) {
    }

    private final /* synthetic */ void B3(r1 r1Var) {
    }

    private final /* synthetic */ void B4(r1 r1Var) {
    }

    private final /* synthetic */ void C3(r1 r1Var) {
    }

    private final /* synthetic */ void C4(r1 r1Var) {
    }

    private final /* synthetic */ void D2(r1 r1Var) {
    }

    private final /* synthetic */ void D3(r1 r1Var) {
    }

    private final /* synthetic */ void D4(r1 r1Var) {
    }

    private final /* synthetic */ void E1(cj cjVar) {
    }

    private final /* synthetic */ void E2(r1 r1Var) {
    }

    private final /* synthetic */ void E3(r1 r1Var) {
    }

    private final /* synthetic */ void F2(r1 r1Var) {
    }

    private final /* synthetic */ void F3(r1 r1Var) {
    }

    private final /* synthetic */ void G1(cj cjVar) {
    }

    private final /* synthetic */ void G3(r1 r1Var) {
    }

    private final /* synthetic */ void H3(r1 r1Var) {
    }

    private final /* synthetic */ void K0(r1 r1Var) {
    }

    private final /* synthetic */ void K4(r1 r1Var) {
    }

    private final /* synthetic */ void L3(r1 r1Var) {
    }

    private final /* synthetic */ void M3(r1 r1Var) {
    }

    private final /* synthetic */ void M4(r1 r1Var) {
    }

    private final /* synthetic */ void N1(r1 r1Var) {
    }

    private final /* synthetic */ void N3(r1 r1Var) {
    }

    private final /* synthetic */ void O4(r1 r1Var) {
    }

    private final /* synthetic */ void P0(r1 r1Var) {
    }

    private final /* synthetic */ void P1(r1 r1Var) {
    }

    private final /* synthetic */ void P2(r1 r1Var) {
    }

    private final /* synthetic */ void Q2(r1 r1Var) {
    }

    private final /* synthetic */ void R2(r1 r1Var) {
    }

    private final /* synthetic */ void S2(r1 r1Var) {
    }

    private final /* synthetic */ void T2(r1 r1Var) {
    }

    private final /* synthetic */ void U(r1 r1Var) {
    }

    private final /* synthetic */ void U2(r1 r1Var) {
    }

    private final /* synthetic */ void V(r1 r1Var) {
    }

    private final /* synthetic */ void a0(r1 r1Var) {
    }

    private final /* synthetic */ void a4(String str) {
    }

    private final /* synthetic */ void b1(r1 r1Var) {
    }

    private final /* synthetic */ void b4(String str) {
    }

    private final /* synthetic */ void c4(String str) {
    }

    private final /* synthetic */ void d1(r1 r1Var) {
    }

    private final /* synthetic */ void d5(int i7) {
    }

    private final /* synthetic */ void e5(int i7) {
    }

    private final /* synthetic */ void f0(r1 r1Var) {
    }

    private final /* synthetic */ void f5(int i7) {
    }

    private final /* synthetic */ void g0(r1 r1Var) {
    }

    private final /* synthetic */ void h2(r1 r1Var) {
    }

    private final /* synthetic */ void i1(r1 r1Var) {
    }

    private final /* synthetic */ void j4(r1 r1Var) {
    }

    private final /* synthetic */ void j5(fj fjVar) {
    }

    private final /* synthetic */ void k4(r1 r1Var) {
    }

    private final /* synthetic */ void k5(fj fjVar) {
    }

    private final /* synthetic */ void l4(r1 r1Var) {
    }

    private final /* synthetic */ void l5(fj fjVar) {
    }

    private final /* synthetic */ void o2(r1 r1Var) {
    }

    private final /* synthetic */ void p4(r1 r1Var) {
    }

    private final /* synthetic */ void q3(r1 r1Var) {
    }

    private final /* synthetic */ void q4(r1 r1Var) {
    }

    private final /* synthetic */ void r2(r1 r1Var) {
    }

    private final /* synthetic */ void r3(r1 r1Var) {
    }

    private final /* synthetic */ void r4(r1 r1Var) {
    }

    private final /* synthetic */ void s0(r1 r1Var) {
    }

    private final /* synthetic */ void s1(r1 r1Var) {
    }

    private final /* synthetic */ void s2(r1 r1Var) {
    }

    private final /* synthetic */ void s3(r1 r1Var) {
    }

    private final /* synthetic */ void s4(fj fjVar) {
    }

    private final /* synthetic */ void t4(fj fjVar) {
    }

    private final /* synthetic */ void u1(r1 r1Var) {
    }

    private final /* synthetic */ void u4(fj fjVar) {
    }

    private final /* synthetic */ void v1(r1 r1Var) {
    }

    private final /* synthetic */ void v4(r1 r1Var) {
    }

    private final /* synthetic */ void w1(cj cjVar) {
    }

    private final /* synthetic */ void w4(r1 r1Var) {
    }

    private final /* synthetic */ void x4(r1 r1Var) {
    }

    private final /* synthetic */ void z0(r1 r1Var) {
    }

    private final /* synthetic */ void z3(r1 r1Var) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void O0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    private final /* synthetic */ void A4(r1 r1Var, h10 h10Var) {
    }

    private final /* synthetic */ void C2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void E4(r1 r1Var, boolean z10) {
    }

    private final /* synthetic */ void G(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void G4(r1 r1Var, boolean z10) {
    }

    private final /* synthetic */ void H(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void I(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void I4(r1 r1Var, boolean z10) {
    }

    private final /* synthetic */ void J2(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void K2(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void L2(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void M2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void N2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void O2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void U0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void X0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Y0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void Y2(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void Z2(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void a3(r1 r1Var, int i7) {
    }

    private final /* synthetic */ void d4(r1 r1Var, long j3) {
    }

    private final /* synthetic */ void e4(r1 r1Var, long j3) {
    }

    private final /* synthetic */ void f4(r1 r1Var, long j3) {
    }

    private final /* synthetic */ void i2(r1 r1Var, p2 p2Var) {
    }

    private final /* synthetic */ void m2(r1 r1Var, p2 p2Var) {
    }

    private final /* synthetic */ void n2(r1 r1Var, p2 p2Var) {
    }

    private final /* synthetic */ void t2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void t3(String str, String str2) {
    }

    private final /* synthetic */ void u3(String str, String str2) {
    }

    private final /* synthetic */ void v2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void v3(String str, String str2) {
    }

    private final /* synthetic */ void y4(r1 r1Var, h10 h10Var) {
    }

    private final /* synthetic */ void z4(r1 r1Var, h10 h10Var) {
    }

    @Override // l.w
    public void f(l.k kVar, boolean z10) {
    }

    private final /* synthetic */ void B(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void E(r1 r1Var, float f10, float f11) {
    }

    private final void F4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void G2(r1 r1Var, int i7, int i10) {
    }

    private final /* synthetic */ void H2(r1 r1Var, int i7, int i10) {
    }

    private final void H4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void I2(r1 r1Var, int i7, int i10) {
    }

    private final /* synthetic */ void I3(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void J3(r1 r1Var, float f10, float f11) {
    }

    private final void J4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void K3(r1 r1Var, float f10, float f11) {
    }

    private final void L4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void N4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void P4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final /* synthetic */ void R3(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void S3(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void T3(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void e3(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void f3(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void g3(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void m4(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void n4(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void o1(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void o4(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void q1(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void r1(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void w3(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void x3(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void y3(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final /* synthetic */ void z(r1 r1Var, float f10, float f11) {
    }

    private final /* synthetic */ void U3(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void V2(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void V3(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void W2(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void W3(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void X2(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void X3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void Y3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void Z3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void h3(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final /* synthetic */ void i3(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final /* synthetic */ void j3(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Components.ri
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    private final /* synthetic */ void g4(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void h4(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void i4(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final /* synthetic */ void k3(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void l3(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void m3(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void n3(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void o3(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void p3(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void j1(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void l1(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void n1(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void X4(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final /* synthetic */ void Y4(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final /* synthetic */ void Z4(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
