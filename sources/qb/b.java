package qb;

import ah.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.view.View;
import c3.b0;
import c3.h0;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e9.i0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import n2.w;
import n7.z0;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b implements androidx.car.app.messaging.model.b, bg.a, c3.q, cf.b, da.c, fb.n, com.google.android.gms.common.api.internal.s, y2.o, n2.m, q9.d, og, k1, t0, r0.r, xf.a {
    public static b b;
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static da.a s2(ob.a aVar) {
        return new da.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ac.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static byte[] t2(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.d.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static Calendar u2() {
        if (b == null) {
            b = new b(25);
        }
        b.getClass();
        return Calendar.getInstance();
    }

    public static String v2(ad.c cVar) {
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

    public static void w2(String str) {
        if (str == null || str.length() == 0) {
            throw new tc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new tc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // q9.d
    public Object D(cf.c cVar) {
        switch (this.a) {
            case 14:
                return new rb.a(0);
            default:
                return new b(0);
        }
    }

    @Override // xf.a
    public boolean E0(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // n2.m
    public int H0(b2.s sVar) {
        return sVar.v != null ? 1 : 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ n2 K0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // bg.a
    public void O0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ov0 Q1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // c3.q
    public h0 R1(int i10, int i11) {
        return new c3.n();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(long j3) {
        return false;
    }

    @Override // n2.m
    public n2.g T0(n2.j jVar, b2.s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new w()));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ int W0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X0(int i10, t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean a1(long j3) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.a;
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

    @Override // org.telegram.ui.Cells.k1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(MessageObject messageObject) {
        return vl.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // xf.a
    public boolean e(Context context) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int f0(t1 t1Var) {
        return 0;
    }

    @Override // y2.o
    public Object f2(Uri uri, g2.k kVar) {
        return Long.valueOf(d0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // n2.m
    public /* synthetic */ n2.l h0(n2.j jVar, b2.s sVar) {
        return n2.l.u;
    }

    @Override // fb.n
    public Object h2() {
        switch (this.a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ boolean j2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override // da.c
    public da.a k0(ob.a aVar, JSONObject jSONObject) {
        return s2(aVar);
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n0(z5 z5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ sn o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ int p() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ TLRPC.Peer q() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ r9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // cf.b
    public cf.a y1(z0 z0Var) {
        return new ye.h(z0Var);
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ boolean z0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public /* synthetic */ b(j7.a aVar) {
        this.a = 11;
    }

    @Override // org.telegram.ui.Components.og
    public void C() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void D0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void V1() {
    }

    @Override // c3.q
    public void Z0() {
    }

    @Override // org.telegram.ui.Components.og
    public void a2() {
    }

    @Override // n2.m
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Components.og
    public void g2() {
    }

    @Override // org.telegram.ui.Components.og
    public void h() {
    }

    @Override // org.telegram.ui.Components.og
    public void h1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.og
    public void m1() {
    }

    @Override // org.telegram.ui.Components.og
    public void n2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Components.og
    public void r0() {
    }

    @Override // org.telegram.ui.Components.og
    public void r2() {
    }

    @Override // n2.m
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.og
    public void v() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Components.og
    public void x1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void A0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void M0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // c3.q
    public void P1(b0 b0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void V0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public void W(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void X(w0 w0Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void X1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public void b2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void i0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public void p1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void q0(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void r1(long j3) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void s1(w0 w0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void x(float f7) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.og
    public /* synthetic */ void z(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // n2.m
    public void B(Looper looper, j2.k kVar) {
    }

    @Override // org.telegram.ui.Components.og
    public void B0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Components.og
    public void J(float f7, int i10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void K(w0 w0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, u uVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L0(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void Z1(w0 w0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void C1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // bg.a
    public int E1(int i10, int i11, int i12) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void b0(w0 w0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void b1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.og
    public void f1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.og
    public void n1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // r0.r
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override // r0.r
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.t0
    public /* synthetic */ void l2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
