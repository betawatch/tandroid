package w9;

import af.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.TreeSet;
import m3.j;
import m3.m;
import m3.t;
import m3.w;
import nh.a4;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.zk;
import org.telegram.ui.ou0;
import za.k;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class d implements s0, n0, f3.a, ff.a, j6.d, kf.a, lf.a, m, oa.m, ib, j1, s, z8.d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public static void A3(String str) {
        if (str == null || str.length() == 0) {
            throw new cc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new cc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // m3.m
    public w C(int i10, int i11) {
        return new j();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C0() {
        int i10 = this.a;
    }

    @Override // kf.a
    public int C1(int i10, int i11, int i12) {
        return (i11 == 6 ? kf.a.l : i11 > i12 ? kf.a.i : i11 < i12 ? kf.a.j : kf.a.k).C1(i10, i11, i12);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // kf.a
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? kf.a.l : i10 > i11 ? kf.a.i : i10 < i11 ? kf.a.j : kf.a.k).D0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D1(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // f3.a
    public long E() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.Cells.j1
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.a) {
        }
        we.e.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle F1(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public void G0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, MessageObject messageObject) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L0(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O0(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ou0 O1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(long j10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R(int i10, s1 s1Var) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(s1 s1Var, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(MessageObject messageObject) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y0(int i10, s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // j6.d
    public b8.b Y1(Context context, String str, j6.c cVar) {
        b8.b bVar = new b8.b();
        bVar.a = cVar.A(context, str);
        int i10 = 1;
        int g10 = cVar.g(context, str, true);
        bVar.b = g10;
        int i11 = bVar.a;
        if (i11 == 0) {
            i11 = 0;
            if (g10 == 0) {
                i10 = 0;
                bVar.c = i10;
                return bVar;
            }
        }
        if (g10 < i11) {
            i10 = -1;
        }
        bVar.c = i10;
        return bVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var) {
        int i10 = this.a;
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a1(MessageObject messageObject) {
        int i10 = this.a;
        return rl.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(s1 s1Var, fh.f fVar) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        u6.d dVar = (u6.d) ((u6.e) obj).u();
        m6.b bVar = new m6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = u6.c.a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // ff.a
    public boolean b(Context context) {
        return e0.b.j(context);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int b0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, long j10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ib
    public void c(jb jbVar, ua uaVar, sa saVar, va vaVar) {
        o1.j jVar = new o1.j(jbVar, jb.IN_OUT_OFFSET_Y, jbVar.getHeight());
        jVar.u.a(0.8f);
        jVar.u.b(400.0f);
        jVar.a(new wa(saVar, 1));
        jVar.b(new hb(vaVar, jbVar, 0));
        jVar.f();
        uaVar.run();
    }

    @Override // lf.a
    public void c0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(i0.a.k(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = (int) Math.ceil((i11 / i10) * remaining);
        int i13 = remaining - ceil;
        float f10 = ceil;
        float f11 = f10 / f10;
        float f12 = i13;
        float f13 = f12 / f12;
        while (ceil > 0 && i13 > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                ceil--;
                f11 = ceil / f10;
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i13--;
                f13 = i13 / f12;
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean d() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ qg.a d0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d2(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 e(Class cls) {
        return new m0(true);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e0(s1 s1Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f0(s1 s1Var, TLRPC.User user) {
        switch (this.a) {
        }
        return false;
    }

    @Override // oa.m
    public Object f2() {
        switch (this.a) {
            case 16:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override // org.telegram.ui.Components.ib
    public void g(jb jbVar, ua uaVar, bg bgVar, zk zkVar) {
        jbVar.setInOutOffset(jbVar.getMeasuredHeight());
        zkVar.accept(Float.valueOf(jbVar.getTranslationY()));
        o1.j jVar = new o1.j(jbVar, jb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.u.a(0.8f);
        jVar.u.b(400.0f);
        jVar.a(new a4(1, jbVar, bgVar));
        jVar.b(new hb(zkVar, jbVar, 1));
        jVar.f();
        uaVar.run();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(s1 s1Var) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h2() {
        int i10 = this.a;
    }

    @Override // ff.a
    public boolean i(Context context) {
        return e0.b.m(context);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean j0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k2(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int l0(s1 s1Var) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m2() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var, int i10, int i11) {
        int i12 = this.a;
    }

    public Signature[] n3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ k9 o2() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
        int i10 = this.a;
    }

    @Override // androidx.lifecycle.s0
    public p0 r(Class cls, v1.b bVar) {
        return e(cls);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(String str) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s0(t5 t5Var) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s1() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u() {
        int i10 = this.a;
    }

    @Override // z8.d
    public Object u0(h hVar) {
        switch (this.a) {
            case 24:
                return new ya.c(hVar.y(ya.b.class));
            case 25:
                return new ya.b(hVar.e(xa.a.class));
            default:
                return new k((Context) hVar.a(Context.class));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v1(s1 s1Var, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(s1 s1Var) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x0(s1 s1Var, float f10, float f11, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean x1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String z(long j10) {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z1() {
        switch (this.a) {
        }
        return false;
    }

    public /* synthetic */ d(u6.a aVar) {
        this.a = 22;
    }

    private final /* synthetic */ void B() {
    }

    private final /* synthetic */ void B3() {
    }

    private final /* synthetic */ void C3() {
    }

    private final /* synthetic */ void F() {
    }

    private final /* synthetic */ void F2() {
    }

    private final /* synthetic */ void G2() {
    }

    private final /* synthetic */ void N() {
    }

    private final /* synthetic */ void P() {
    }

    private final /* synthetic */ void T1() {
    }

    private final /* synthetic */ void U1() {
    }

    private final /* synthetic */ void o3() {
    }

    private final /* synthetic */ void p3() {
    }

    private final /* synthetic */ void s3() {
    }

    private final /* synthetic */ void t3() {
    }

    private final /* synthetic */ void w3() {
    }

    private final /* synthetic */ void x3() {
    }

    @Override // m3.m
    public void A() {
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public void l() {
    }

    private final /* synthetic */ void A1(s1 s1Var) {
    }

    private final /* synthetic */ void A2(s1 s1Var) {
    }

    private final /* synthetic */ void D2(s1 s1Var) {
    }

    private final /* synthetic */ void E2(s1 s1Var) {
    }

    private final /* synthetic */ void G(s1 s1Var) {
    }

    private final /* synthetic */ void I(s1 s1Var) {
    }

    private final /* synthetic */ void I0(s1 s1Var) {
    }

    private final /* synthetic */ void J(s1 s1Var) {
    }

    private final /* synthetic */ void K(s1 s1Var) {
    }

    private final /* synthetic */ void K0(s1 s1Var) {
    }

    private final /* synthetic */ void N0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void N2(String str) {
    }

    private final /* synthetic */ void O2(String str) {
    }

    private final /* synthetic */ void P0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final /* synthetic */ void S(s1 s1Var) {
    }

    private final /* synthetic */ void T0(s1 s1Var) {
    }

    private final /* synthetic */ void T2(s1 s1Var) {
    }

    private final /* synthetic */ void U2(s1 s1Var) {
    }

    private final /* synthetic */ void V0(s1 s1Var) {
    }

    private final /* synthetic */ void X2(s1 s1Var) {
    }

    private final /* synthetic */ void Y2(s1 s1Var) {
    }

    private final /* synthetic */ void Z2(MessageObject messageObject) {
    }

    private final /* synthetic */ void a0(s1 s1Var) {
    }

    private final /* synthetic */ void a3(MessageObject messageObject) {
    }

    private final /* synthetic */ void b1(s1 s1Var) {
    }

    private final /* synthetic */ void b3(s1 s1Var) {
    }

    private final /* synthetic */ void c1(s1 s1Var) {
    }

    private final /* synthetic */ void c3(s1 s1Var) {
    }

    private final /* synthetic */ void f3(s1 s1Var) {
    }

    private final /* synthetic */ void g3(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final /* synthetic */ void i1(s1 s1Var) {
    }

    private final /* synthetic */ void j1(s1 s1Var) {
    }

    private final void j3(s1 s1Var) {
    }

    private final /* synthetic */ void l3(s1 s1Var) {
    }

    private final /* synthetic */ void m3(s1 s1Var) {
    }

    private final /* synthetic */ void n0(s1 s1Var) {
    }

    private final /* synthetic */ void o0(s1 s1Var) {
    }

    private final /* synthetic */ void r1(s1 s1Var) {
    }

    private final /* synthetic */ void r2(s1 s1Var) {
    }

    private final /* synthetic */ void s2(s1 s1Var) {
    }

    private final /* synthetic */ void t1(s1 s1Var) {
    }

    private final /* synthetic */ void u3(int i10) {
    }

    private final /* synthetic */ void v2(s1 s1Var) {
    }

    private final /* synthetic */ void v3(int i10) {
    }

    private final /* synthetic */ void w1(s1 s1Var) {
    }

    private final /* synthetic */ void w2(s1 s1Var) {
    }

    private final /* synthetic */ void x2(s1 s1Var) {
    }

    private final /* synthetic */ void y2(s1 s1Var) {
    }

    private final /* synthetic */ void y3(MessageObject messageObject) {
    }

    private final /* synthetic */ void z2(s1 s1Var) {
    }

    private final /* synthetic */ void z3(MessageObject messageObject) {
    }

    @Override // m3.m
    public void n(t tVar) {
    }

    private final /* synthetic */ void P1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void P2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void Q2(s1 s1Var, long j10) {
    }

    private final /* synthetic */ void S1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void X0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void Z0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final /* synthetic */ void d3(s1 s1Var, fh.f fVar) {
    }

    private final /* synthetic */ void e3(s1 s1Var, fh.f fVar) {
    }

    private final /* synthetic */ void f1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void g0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void g1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final /* synthetic */ void h0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void i3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void k3(s1 s1Var, boolean z10) {
    }

    private final /* synthetic */ void n1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void o1(int i10, s1 s1Var) {
    }

    private final /* synthetic */ void p1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void q1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final /* synthetic */ void t2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void u2(s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void w(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void y(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void B2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void C2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void H2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void I2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final /* synthetic */ void V2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void W1(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void W2(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void X1(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void k1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void l1(s1 s1Var, int i10, int i11) {
    }

    private final /* synthetic */ void m(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void s(s1 s1Var, float f10, float f11) {
    }

    private final /* synthetic */ void y0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void z0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final /* synthetic */ void J1(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void J2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void K2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final /* synthetic */ void L2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void M2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final /* synthetic */ void N1(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void e2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void g2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final /* synthetic */ void R2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void S2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void j2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void l2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void p2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void q2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void q0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void w0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final /* synthetic */ void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final /* synthetic */ void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
