package t7;

import android.media.MediaDrmException;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.x;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import fi.m4;
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
import ji.w4;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.d0;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.am;
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
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class u implements c3.g, cg.a, dg.a, ea.c, g2.g, gb.o, ti, n5.b, n2.r, r9.d, vb, l1, r4.c, OnFailureListener, y9.c, z3.l {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // ea.c
    public ea.a B0(u uVar, JSONObject jSONObject) {
        return F0(uVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean B1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // dg.a
    public void C(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            dg.a.t.C(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            dg.a.q.C(shortBuffer, i10, shortBuffer2, i11, i12);
        } else {
            if (i10 != i11) {
                throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
            }
            shortBuffer2.put(shortBuffer);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void C0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // n2.r
    public byte[] D() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // n2.r
    public boolean D0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // cg.a
    public int E1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(u1 u1Var) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.l1
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        pf.d.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle H1(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // z3.l
    public int J(x xVar) {
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
    public /* synthetic */ boolean J0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(u1 u1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // n2.r
    public void K(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var, ah.t tVar) {
        int i10 = this.a;
    }

    public boolean K3(CharSequence charSequence) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M0(int i10, u1 u1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ wv0 P1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j10) {
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
    public /* synthetic */ void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(u1 u1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(u1 u1Var, long j10) {
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
    public /* synthetic */ boolean Z0(int i10, u1 u1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vb
    public void a0(wb wbVar, hb hbVar, qg qgVar, am amVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        amVar.accept(Float.valueOf(wbVar.getTranslationY()));
        o1.k kVar = new o1.k(wbVar, wb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.u.a(0.8f);
        kVar.u.b(400.0f);
        kVar.a(new m4(1, wbVar, qgVar));
        kVar.b(new ub(amVar, wbVar, 1));
        kVar.h();
        hbVar.run();
    }

    @Override // n2.r
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // z3.l
    public boolean b0(x xVar) {
        String str = xVar.s;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
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
    public /* synthetic */ boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(u1 u1Var) {
        int i10 = this.a;
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
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        int i10 = this.a;
        return d0.a(messageObject);
    }

    @Override // y9.c
    public String e() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1() {
        int i10 = this.a;
    }

    @Override // gb.o
    public Object f2() {
        return new ConcurrentSkipListMap();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2() {
        int i10 = this.a;
    }

    @Override // hd.a
    public Object get() {
        return new l5.p(Executors.newSingleThreadExecutor());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
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
    public /* synthetic */ void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    @Override // n2.r
    public byte[] j0(byte[] bArr, byte[] bArr2) {
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
    public void k0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // n2.r
    public n2.q l() {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // n2.r
    public n2.p m0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n2() {
        int i10 = this.a;
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2(u1 u1Var, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // z3.l
    public z3.n p(x xVar) {
        String str = xVar.s;
        List list = xVar.v;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new b4.i(list);
                case "application/pgs":
                    return new qi.e(2);
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

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 p2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // n2.r
    public h2.b q(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
        int i10 = this.a;
    }

    @Override // n2.r
    public int s0() {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
        int i10 = this.a;
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w1(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(u1 u1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(u1 u1Var, TLRPC.Chat chat) {
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

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void H() {
    }

    @Override // y9.c
    public void a() {
    }

    @Override // n2.r
    public void release() {
    }

    @Override // r4.c
    public void y() {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void z() {
    }

    private final /* synthetic */ void A3(u1 u1Var) {
    }

    private final /* synthetic */ void B3(u1 u1Var) {
    }

    private final /* synthetic */ void C1(u1 u1Var) {
    }

    private final void C3(u1 u1Var) {
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

    private final /* synthetic */ void T1(u1 u1Var) {
    }

    private final /* synthetic */ void T2(u1 u1Var) {
    }

    private final /* synthetic */ void U2(u1 u1Var) {
    }

    private final /* synthetic */ void U3(MessageObject messageObject) {
    }

    private final /* synthetic */ void V2(u1 u1Var) {
    }

    private final /* synthetic */ void V3(MessageObject messageObject) {
    }

    private final /* synthetic */ void W0(u1 u1Var) {
    }

    private final /* synthetic */ void X0(u1 u1Var) {
    }

    private final /* synthetic */ void Y0(u1 u1Var) {
    }

    private final /* synthetic */ void Y1(u1 u1Var) {
    }

    private final /* synthetic */ void Y2(u1 u1Var) {
    }

    private final /* synthetic */ void Z1(u1 u1Var) {
    }

    private final /* synthetic */ void Z2(u1 u1Var) {
    }

    private final /* synthetic */ void a1(u1 u1Var) {
    }

    private final /* synthetic */ void e1(u1 u1Var) {
    }

    private final /* synthetic */ void e2(u1 u1Var) {
    }

    private final /* synthetic */ void g1(u1 u1Var) {
    }

    private final /* synthetic */ void h2(u1 u1Var) {
    }

    private final /* synthetic */ void i3(String str) {
    }

    private final /* synthetic */ void j3(String str) {
    }

    private final /* synthetic */ void l1(u1 u1Var) {
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

    private final /* synthetic */ void y1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void U(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public /* synthetic */ void W(TLRPC.User user) {
    }

    @Override // n2.r
    public void X(byte[] bArr) {
    }

    @Override // c3.g
    public long k(long j10) {
        return j10;
    }

    @Override // n2.r
    public void t0(w4 w4Var) {
    }

    private final /* synthetic */ void A2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void B2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void D3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void F3(u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void L0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void N0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void O2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void P2(u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void V1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void X1(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void a2(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void d2(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void j1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void k3(u1 u1Var, long j10) {
    }

    private final /* synthetic */ void l3(u1 u1Var, long j10) {
    }

    private final /* synthetic */ void q2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void r2(int i10, u1 u1Var) {
    }

    private final /* synthetic */ void s2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void t2(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void y3(u1 u1Var, ah.t tVar) {
    }

    private final /* synthetic */ void z3(u1 u1Var, ah.t tVar) {
    }

    @Override // r4.c
    public void G(int i10, Object obj) {
    }

    @Override // n2.r
    public /* synthetic */ void h(byte[] bArr, j2.k kVar) {
    }

    private final /* synthetic */ void E2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void F2(u1 u1Var, float f7, float f10) {
    }

    private final /* synthetic */ void H0(u1 u1Var, float f7, float f10) {
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

    private final /* synthetic */ void k2(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void m2(u1 u1Var, int i10, int i11) {
    }

    private final /* synthetic */ void q1(u1 u1Var, TLObject tLObject, boolean z10) {
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
    public /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ti
    public void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
