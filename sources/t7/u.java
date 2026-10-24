package t7;

import android.media.MediaDrmException;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.w;
import c3.a0;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import gi.b4;
import j$.util.Objects;
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
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xl;
import org.telegram.ui.yu0;
import si.o0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class u implements c3.g, cg.a, dg.a, ea.c, g2.g, gb.n, ri, n5.b, n2.r, r9.d, tb, k1, r4.c, OnFailureListener, y9.c, z3.k {
    public static u b;
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    public static ea.a F0(u uVar) {
        return new ea.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new bc.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static short L3(short s10, short s11) {
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
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

    @Override // n2.r
    public boolean B0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.r
    public h2.b C(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public void C0(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.tb
    public void D0(ub ubVar, fb fbVar, pg pgVar, xl xlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        xlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, 0.0f);
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new b4(1, ubVar, pgVar));
        kVar.b(new sb(xlVar, ubVar, 1));
        kVar.h();
        fbVar.run();
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
        return i10 / 2;
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

    @Override // n2.r
    public byte[] H() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
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
    public /* synthetic */ void K1(t1 t1Var, ah.t tVar) {
        int i10 = this.a;
    }

    public boolean K3(CharSequence charSequence) {
        return false;
    }

    @Override // z3.k
    public int L(w wVar) {
        String str = wVar.s;
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
        throw new IllegalArgumentException(o0.h("Unsupported MIME type: ", str));
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
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(L3(shortBuffer.get(), shortBuffer.get()));
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

    @Override // n2.r
    public void U(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
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

    @Override // z3.k
    public boolean a0(w wVar) {
        String str = wVar.s;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // n2.r
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tb
    public void c(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        o1.k kVar = new o1.k(ubVar, ub.IN_OUT_OFFSET_Y, ubVar.getHeight());
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new hb(dbVar, 1));
        kVar.b(new sb(gbVar, ubVar, 0));
        kVar.h();
        fbVar.run();
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

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.t(false);
    }

    @Override // y9.c
    public String d() {
        return null;
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
        return new ConcurrentSkipListMap();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // n2.r
    public byte[] g0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2() {
        int i10 = this.a;
    }

    @Override // hd.a
    public Object get() {
        return new l5.q(Executors.newSingleThreadExecutor());
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

    @Override // n2.r
    public void j0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
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

    @Override // n2.r
    public n2.p k0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
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

    @Override // n2.r
    public int m0() {
        return 1;
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

    @Override // n2.r
    public n2.q o() {
        throw new IllegalStateException();
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

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean p0() {
        return false;
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

    @Override // org.telegram.ui.Components.ri
    public void r(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // ea.c
    public ea.a s0(u uVar, JSONObject jSONObject) {
        return F0(uVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean u() {
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

    @Override // z3.k
    public z3.m y(w wVar) {
        String str = wVar.s;
        List list = wVar.v;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new b4.i(list);
                case "application/pgs":
                    return new qi.e(2);
                case "application/x-mp4-vtt":
                    return new a0(1);
                case "text/vtt":
                    return new n4.s(23);
                case "application/x-quicktime-tx3g":
                    return new g4.a(list);
                case "text/x-ssa":
                    return new d4.a(list);
                case "application/vobsub":
                    return new h4.b(list);
                case "application/x-subrip":
                    return new e4.a();
                case "application/ttml+xml":
                    return new f4.d();
            }
        }
        throw new IllegalArgumentException(o0.h("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0() {
        int i10 = this.a;
    }

    @Override // dg.a
    public void z(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            dg.a.t.z(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            dg.a.q.z(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
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

    private final /* synthetic */ void C2() {
    }

    private final /* synthetic */ void D2() {
    }

    private final /* synthetic */ void I3() {
    }

    private final /* synthetic */ void J3() {
    }

    private final /* synthetic */ void O3() {
    }

    private final /* synthetic */ void P3() {
    }

    private final /* synthetic */ void Q0() {
    }

    private final /* synthetic */ void S3() {
    }

    private final /* synthetic */ void T3() {
    }

    private final /* synthetic */ void U0() {
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

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void E() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void J() {
    }

    @Override // y9.c
    public void a() {
    }

    @Override // n2.r
    public void release() {
    }

    @Override // r4.c
    public void v() {
    }

    private final /* synthetic */ void A3(t1 t1Var) {
    }

    private final /* synthetic */ void B3(t1 t1Var) {
    }

    private final /* synthetic */ void C1(t1 t1Var) {
    }

    private final void C3(t1 t1Var) {
    }

    private final void E3(t1 t1Var) {
    }

    private final /* synthetic */ void G3(t1 t1Var) {
    }

    private final /* synthetic */ void H3(t1 t1Var) {
    }

    private final /* synthetic */ void M2(t1 t1Var) {
    }

    private final /* synthetic */ void N2(t1 t1Var) {
    }

    private final /* synthetic */ void Q2(t1 t1Var) {
    }

    private final /* synthetic */ void Q3(int i10) {
    }

    private final /* synthetic */ void R2(t1 t1Var) {
    }

    private final /* synthetic */ void R3(int i10) {
    }

    private final /* synthetic */ void S2(t1 t1Var) {
    }

    private final /* synthetic */ void T1(t1 t1Var) {
    }

    private final /* synthetic */ void T2(t1 t1Var) {
    }

    private final /* synthetic */ void U2(t1 t1Var) {
    }

    private final /* synthetic */ void U3(MessageObject messageObject) {
    }

    private final /* synthetic */ void V2(t1 t1Var) {
    }

    private final /* synthetic */ void V3(MessageObject messageObject) {
    }

    private final /* synthetic */ void W0(t1 t1Var) {
    }

    private final /* synthetic */ void X0(t1 t1Var) {
    }

    private final /* synthetic */ void Y0(t1 t1Var) {
    }

    private final /* synthetic */ void Y1(t1 t1Var) {
    }

    private final /* synthetic */ void Y2(t1 t1Var) {
    }

    private final /* synthetic */ void Z1(t1 t1Var) {
    }

    private final /* synthetic */ void Z2(t1 t1Var) {
    }

    private final /* synthetic */ void a1(t1 t1Var) {
    }

    private final /* synthetic */ void e1(t1 t1Var) {
    }

    private final /* synthetic */ void e2(t1 t1Var) {
    }

    private final /* synthetic */ void g1(t1 t1Var) {
    }

    private final /* synthetic */ void h2(t1 t1Var) {
    }

    private final /* synthetic */ void i3(String str) {
    }

    private final /* synthetic */ void j3(String str) {
    }

    private final /* synthetic */ void l1(t1 t1Var) {
    }

    private final /* synthetic */ void m1(t1 t1Var) {
    }

    private final /* synthetic */ void o3(t1 t1Var) {
    }

    private final /* synthetic */ void p3(t1 t1Var) {
    }

    private final /* synthetic */ void s1(t1 t1Var) {
    }

    private final /* synthetic */ void s3(t1 t1Var) {
    }

    private final /* synthetic */ void t1(t1 t1Var) {
    }

    private final /* synthetic */ void t3(t1 t1Var) {
    }

    private final /* synthetic */ void u1(MessageObject.TextLayoutBlock textLayoutBlock) {
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

    private final /* synthetic */ void w3(t1 t1Var) {
    }

    private final /* synthetic */ void x2(t1 t1Var) {
    }

    private final /* synthetic */ void x3(t1 t1Var) {
    }

    private final /* synthetic */ void y1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void O(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // n2.r
    public void Y(byte[] bArr) {
    }

    @Override // c3.g
    public long k(long j10) {
        return j10;
    }

    @Override // n2.r
    public void t0(l2.f fVar) {
    }

    private final /* synthetic */ void A2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void B2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void D3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void F3(t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void L0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void N0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void O2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void P2(t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void V1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void X1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void a2(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d2(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void i1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void j1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k3(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void l3(t1 t1Var, long j10) {
    }

    private final /* synthetic */ void q2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void r2(int i10, t1 t1Var) {
    }

    private final /* synthetic */ void s2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void t2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void y3(t1 t1Var, ah.t tVar) {
    }

    private final /* synthetic */ void z3(t1 t1Var, ah.t tVar) {
    }

    @Override // n2.r
    public /* synthetic */ void h(byte[] bArr, j2.j jVar) {
    }

    @Override // r4.c
    public void x(int i10, Object obj) {
    }

    private final /* synthetic */ void E2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void F2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void H0(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void I0(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void W2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void X2(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void c3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void d3(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void k2(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void m2(t1 t1Var, int i10, int i11) {
    }

    private final /* synthetic */ void q1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void q3(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void r1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void r3(t1 t1Var, float f7, float f10) {
    }

    private final /* synthetic */ void G2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void H2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void e3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void f3(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    private final /* synthetic */ void g3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void h3(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void y2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void z2(t1 t1Var, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void I2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void J2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void K2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void L2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void m3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void n3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void n1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void o1(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final /* synthetic */ void M3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void N3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ri
    public void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
