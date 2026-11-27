// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uif implements tq2, s8a, y2c, m51, iy7, peb, pr3, efc, l3d, bl0, mqa, rb2, s68 {
    public static uif b;
    public static final uif c = new uif(1);
    public static final uif d = new uif(2);
    public static final /* synthetic */ uif e = new uif(4);
    public static final uif f = new uif(5);
    public static final uif h = new uif(6);
    public static final uif n = new uif(7);
    public static final uif r = new uif(8);
    public static final /* synthetic */ uif s = new uif(9);
    public static final uif w = new uif(10);
    public static final uif x = new uif(11);
    public static final /* synthetic */ uif y = new uif(12);
    public final /* synthetic */ byte a;

    public /* synthetic */ uif(byte b2) {
        this.a = b2;
    }

    public static rj0 B(byte[][] bArr, int i) {
        int i2 = i << 1;
        rj0 rj0Var = new rj0(bArr[0].length + i2, bArr.length + i2);
        int[] iArr = rj0Var.d;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (rj0Var.b - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    rj0Var.c(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return rj0Var;
    }

    public static byte[][] O3(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    public static void R3(String str) {
        if (str == null || str.length() == 0) {
            throw new x40("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new x40("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static void U3(hsd hsdVar, y76 y76Var, boolean z, TaskCompletionSource taskCompletionSource) {
        synchronized (hsdVar.G) {
            uqd uqdVar = (uqd) hsdVar.G.remove(y76Var);
            if (uqdVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            a94 a94Var = null;
            uqdVar.b.j().b = null;
            if (z) {
                ore oreVar = hsdVar.B;
                a94[] a94VarArr = oreVar == null ? null : oreVar.b;
                if (a94VarArr != null) {
                    int length = a94VarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        a94 a94Var2 = a94VarArr[i];
                        if ("location_updates_with_callback".equals(a94Var2.a)) {
                            a94Var = a94Var2;
                            break;
                        }
                        i++;
                    }
                    if (a94Var != null && a94Var.b() >= 1) {
                        q7f q7fVar = (q7f) hsdVar.k();
                        sod sodVar = new sod(Boolean.TRUE, taskCompletionSource);
                        Parcel R = q7fVar.R();
                        int i2 = ild.a;
                        R.writeInt(1);
                        int r2 = bye.r(R, 20293);
                        bye.q(R, 1, 4);
                        R.writeInt(2);
                        bye.f(R, 3, uqdVar);
                        bye.s(R, r2);
                        ild.c(R, sodVar);
                        q7fVar.V(R, 89);
                    }
                }
                q7f q7fVar2 = (q7f) hsdVar.k();
                epd epdVar = new epd(taskCompletionSource);
                int i3 = uqd.c;
                IInterface queryLocalInterface = uqdVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                IInterface bcfVar = queryLocalInterface instanceof rff ? (rff) queryLocalInterface : new bcf(uqdVar, "com.google.android.gms.location.ILocationCallback", (byte) 5);
                IInterface queryLocalInterface2 = epdVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                IInterface nmeVar = queryLocalInterface2 instanceof xwe ? (xwe) queryLocalInterface2 : new nme(epdVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
                Parcel R2 = q7fVar2.R();
                int i4 = ild.a;
                R2.writeInt(1);
                int r3 = bye.r(R2, 20293);
                bye.q(R2, 1, 4);
                R2.writeInt(2);
                bye.f(R2, 5, bcfVar.asBinder());
                bye.f(R2, 6, nmeVar.asBinder());
                bye.s(R2, r3);
                q7fVar2.V(R2, 59);
            } else {
                taskCompletionSource.setResult(Boolean.TRUE);
            }
        }
    }

    @Override // rb2
    public final void A(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void A0(wb2 wb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final boolean A1(hm hmVar) {
        byte b2 = this.a;
        return false;
    }

    @Override // bl0
    public final float B0() {
        return -1.0f;
    }

    @Override // rb2
    public final void C0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // bl0
    public final float D0() {
        return -1.0f;
    }

    @Override // rb2
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void G(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final void G1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void H(wb2 wb2Var, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // iy7
    public final Object I(Uri uri, l73 l73Var) {
        return Long.valueOf(gcc.W(new BufferedReader(new InputStreamReader(l73Var)).readLine()));
    }

    @Override // rb2
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void I1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // s68
    public final /* bridge */ /* synthetic */ Object J(ie9 ie9Var) {
        return null;
    }

    @Override // rb2
    public final void J0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final de8 J1() {
        byte b2 = this.a;
        return null;
    }

    @Override // rb2
    public final boolean K() {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final void K0(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void K1(String str, String str2) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final boolean L1(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final boolean M() {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final String M0(wb2 wb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override // rb2
    public final void M1(wb2 wb2Var, q38 q38Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final int N() {
        byte b2 = this.a;
        return 0;
    }

    @Override // rb2
    public final void N0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void N1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void O(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final int P(wb2 wb2Var) {
        byte b2 = this.a;
        return 0;
    }

    @Override // rb2
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final void Q(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void Q0() {
        byte b2 = this.a;
    }

    @Override // bl0
    public final int Q1() {
        return 0;
    }

    @Override // rb2
    public final boolean R1(r47 r47Var) {
        byte b2 = this.a;
        return true;
    }

    @Override // rb2
    public final iv1 S() {
        byte b2 = this.a;
        return null;
    }

    @Override // rb2
    public final void T(r47 r47Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void U0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final void W(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final boolean W1(wb2 wb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // bl0
    public final int X() {
        return 0;
    }

    @Override // rb2
    public final void Y(int i) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void Y0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final boolean Z() {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final CharacterStyle a0(wb2 wb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override // rb2
    public final void a1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void a2(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // y2c
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // rb2
    public final boolean b() {
        byte b2 = this.a;
        return false;
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 1:
                Object h2 = am2Var.h(new h09(m8c.class, Executor.class));
                h2.getClass();
                return new p54((Executor) h2);
            case 4:
                return new ri7(am2Var.N(qi7.class));
            default:
                return new qi7(am2Var.d(asd.class));
        }
    }

    @Override // pr3
    public final jr3 c(mr3 mr3Var, ko4 ko4Var) {
        if (ko4Var.x == null) {
            return null;
        }
        return new t44(new ir3(6001, new gac()));
    }

    @Override // rb2
    public final boolean c0() {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void d() {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void d0(r47 r47Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void d2() {
        byte b2 = this.a;
    }

    @Override // s8a
    public final Object e() {
        return new rj7(true);
    }

    @Override // rb2
    public final void e2(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // pr3
    public final or3 f(mr3 mr3Var, ko4 ko4Var) {
        return or3.t;
    }

    @Override // rb2
    public final void f1(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // m51
    public final byte[] g(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // rb2
    public final void g0(String str) {
        byte b2 = this.a;
    }

    @Override // rb2, al1
    public final boolean h() {
        byte b2 = this.a;
        return true;
    }

    @Override // rb2
    public final void h0(wb2 wb2Var, int i) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void h1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void i() {
        byte b2 = this.a;
    }

    @Override // rb2
    public final boolean i1() {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final boolean i2(int i) {
        byte b2 = this.a;
        return false;
    }

    @Override // peb
    public final boolean j(ko4 ko4Var) {
        String str = ko4Var.t;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // rb2
    public final void j0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final /* synthetic */ boolean j1(r47 r47Var) {
        byte b2 = this.a;
        return bp1.a(r47Var);
    }

    @Override // rb2
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // efc
    public final boolean k() {
        p40 p40Var = aob.d5;
        if (p40Var == null) {
            p40Var = new p40();
            aob.d5 = p40Var;
        }
        return p40Var.i != null;
    }

    @Override // rb2
    public final boolean k0(wb2 wb2Var, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final boolean k1(wb2 wb2Var, int i) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final void k2() {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void l(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void l1(wb2 wb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final bmb l2() {
        byte b2 = this.a;
        return null;
    }

    @Override // rb2
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        byte b2 = this.a;
    }

    @Override // bl0
    public final int m0() {
        return 0;
    }

    @Override // bl0
    public final float m1() {
        return 0.0f;
    }

    @Override // rb2
    public final void m2(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // s8a
    public final void n(Object obj, o8c o8cVar) {
        ju4 a;
        Map a2 = ((rj7) obj).a();
        ck8 n2 = ek8.n();
        for (Map.Entry entry : a2.entrySet()) {
            zj8 zj8Var = (zj8) entry.getKey();
            Object value = entry.getValue();
            String str = zj8Var.a;
            if (value instanceof Boolean) {
                hk8 v = jk8.v();
                boolean booleanValue = ((Boolean) value).booleanValue();
                v.c();
                ((jk8) v.b).w(booleanValue);
                a = v.a();
            } else if (value instanceof Float) {
                hk8 v2 = jk8.v();
                float floatValue = ((Number) value).floatValue();
                v2.c();
                ((jk8) v2.b).z(floatValue);
                a = v2.a();
            } else if (value instanceof Double) {
                hk8 v3 = jk8.v();
                double doubleValue = ((Number) value).doubleValue();
                v3.c();
                ((jk8) v3.b).y(doubleValue);
                a = v3.a();
            } else if (value instanceof Integer) {
                hk8 v4 = jk8.v();
                int intValue = ((Number) value).intValue();
                v4.c();
                ((jk8) v4.b).A(intValue);
                a = v4.a();
            } else if (value instanceof Long) {
                hk8 v5 = jk8.v();
                long longValue = ((Number) value).longValue();
                v5.c();
                ((jk8) v5.b).B(longValue);
                a = v5.a();
            } else if (value instanceof String) {
                hk8 v6 = jk8.v();
                v6.c();
                ((jk8) v6.b).C((String) value);
                a = v6.a();
            } else if (value instanceof Set) {
                hk8 v7 = jk8.v();
                fk8 o = gk8.o();
                o.c();
                ((gk8) o.b).l((Set) value);
                v7.c();
                ((jk8) v7.b).D((gk8) o.a());
                a = v7.a();
            } else {
                if (!(value instanceof byte[])) {
                    grb.i("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                hk8 v8 = jk8.v();
                byte[] bArr = (byte[]) value;
                n51 j = n51.j(0, bArr.length, bArr);
                v8.c();
                ((jk8) v8.b).x(j);
                a = v8.a();
            }
            n2.getClass();
            str.getClass();
            n2.c();
            ((ek8) n2.b).m().put(str, (jk8) a);
        }
        ek8 ek8Var = (ek8) n2.a();
        int a3 = ek8Var.a(null);
        Logger logger = xk2.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        xk2 xk2Var = new xk2(o8cVar, a3);
        ek8Var.b(xk2Var);
        if (xk2Var.d > 0) {
            xk2Var.j();
        }
    }

    @Override // rb2
    public final void n0(wb2 wb2Var, int i, int i2) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void n1(o47 o47Var) {
        byte b2 = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0547  */
    @Override // l3d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rj0 o(String str, bf0 bf0Var, EnumMap enumMap) {
        int i;
        i34 i34Var;
        ys3 ys3Var;
        boolean z;
        char c2;
        char c3;
        boolean z2;
        int i2;
        int i3;
        int[][] iArr;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        char charAt;
        int i7;
        char charAt2;
        if (bf0Var != bf0.c) {
            lq5.q(bf0Var, "Can only encode PDF_417, but got ");
            return null;
        }
        i34 i34Var2 = i34.d;
        boolean parseBoolean = enumMap.containsKey(i34Var2) ? Boolean.parseBoolean(enumMap.get(i34Var2).toString()) : false;
        i34 i34Var3 = i34.e;
        byte b2 = 2;
        if (enumMap.containsKey(i34Var3)) {
            String obj = enumMap.get(i34Var3).toString();
            if (obj == null) {
                p3d.h("Name is null");
            } else if (!obj.equals("AUTO")) {
                if (obj.equals("TEXT")) {
                    i = 2;
                } else if (obj.equals("BYTE")) {
                    i = 3;
                } else if (obj.equals("NUMERIC")) {
                    i = 4;
                } else {
                    lq5.j("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(obj));
                }
                i34Var = i34.f;
                if (enumMap.containsKey(i34Var)) {
                    enumMap.get(i34Var).getClass();
                    grb.o();
                    return null;
                }
                i34 i34Var4 = i34.c;
                int parseInt = enumMap.containsKey(i34Var4) ? Integer.parseInt(enumMap.get(i34Var4).toString()) : 30;
                i34 i34Var5 = i34.a;
                int parseInt2 = enumMap.containsKey(i34Var5) ? Integer.parseInt(enumMap.get(i34Var5).toString()) : 2;
                i34 i34Var6 = i34.b;
                Charset forName = enumMap.containsKey(i34Var6) ? Charset.forName(enumMap.get(i34Var6).toString()) : null;
                i34 i34Var7 = i34.h;
                boolean z5 = enumMap.containsKey(i34Var7) && Boolean.parseBoolean(enumMap.get(i34Var7).toString());
                if (parseInt2 < 0 || parseInt2 > 8) {
                    lq5.j("Error correction level must be between 0 and 8!");
                    return null;
                }
                int i8 = 1 << (parseInt2 + 1);
                byte[] bArr = ou7.a;
                if (str.isEmpty()) {
                    throw new w30("Empty message not allowed");
                }
                if (2 == i) {
                    ou7.a(jn7.K1, str, "Consider specifying Compaction.AUTO instead of Compaction.TEXT");
                }
                if (forName == null && !z5) {
                    ou7.a(jn7.d4, str, "Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET");
                }
                StringBuilder sb = new StringBuilder(str.length());
                if (z5) {
                    ys3Var = new tc1(str, forName);
                } else {
                    mt2 mt2Var = new mt2(b2);
                    mt2Var.b = str;
                    Charset charset = ou7.e;
                    if (forName == null) {
                        forName = charset;
                        ys3Var = mt2Var;
                    } else {
                        ys3Var = mt2Var;
                        if (!charset.equals(forName)) {
                            jk1 a = jk1.a(forName);
                            ys3Var = mt2Var;
                            if (a != null) {
                                ou7.f(a.a[0], sb);
                                ys3Var = mt2Var;
                            }
                        }
                    }
                }
                int length = ys3Var.length();
                int F = ik8.F(i);
                if (F == 1) {
                    z = parseBoolean;
                    ou7.e(0, length, 0, ys3Var, sb);
                } else if (F == 2) {
                    z = parseBoolean;
                    if (z5) {
                        ou7.c(0, ys3Var.length(), 0, ys3Var, sb);
                    } else {
                        byte[] bytes = ys3Var.toString().getBytes(forName);
                        ou7.b(bytes.length, 1, sb, bytes);
                    }
                } else if (F != 3) {
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    loop0: while (i9 < length) {
                        while (i9 < length) {
                            if (ys3Var.b(i9)) {
                                ou7.f(ys3Var.a(i9), sb);
                                i9++;
                            } else {
                                int length2 = ys3Var.length();
                                char c4 = '0';
                                if (i9 < length2) {
                                    int i12 = i9;
                                    int i13 = 0;
                                    while (i12 < length2 && !ys3Var.b(i12)) {
                                        char charAt3 = ys3Var.charAt(i12);
                                        if (charAt3 < c4 || charAt3 > '9') {
                                            break;
                                        }
                                        i13++;
                                        i12++;
                                        c4 = '0';
                                    }
                                    i4 = i13;
                                } else {
                                    i4 = 0;
                                }
                                int i14 = 13;
                                if (i4 >= 13) {
                                    sb.append((char) 902);
                                    ou7.d(ys3Var, i9, i4, sb);
                                    i9 += i4;
                                    z3 = parseBoolean;
                                    z4 = z5;
                                    i10 = 2;
                                    i11 = 0;
                                } else {
                                    int length3 = ys3Var.length();
                                    int i15 = i9;
                                    while (true) {
                                        z3 = parseBoolean;
                                        if (i15 >= length3) {
                                            z4 = z5;
                                            break;
                                        }
                                        int i16 = 0;
                                        while (i16 < i14 && i15 < length3 && !ys3Var.b(i15)) {
                                            char charAt4 = ys3Var.charAt(i15);
                                            z4 = z5;
                                            if (charAt4 < '0' || charAt4 > '9') {
                                                i7 = 13;
                                                break;
                                            }
                                            i16++;
                                            i15++;
                                            z5 = z4;
                                            i14 = 13;
                                        }
                                        z4 = z5;
                                        i7 = i14;
                                        if (i16 >= i7) {
                                            i5 = (i15 - i9) - i16;
                                            break;
                                        }
                                        if (i16 <= 0) {
                                            if (ys3Var.b(i15) || ((charAt2 = ys3Var.charAt(i15)) != '\t' && charAt2 != '\n' && charAt2 != '\r' && (charAt2 < ' ' || charAt2 > '~'))) {
                                                break;
                                            }
                                            i15++;
                                        }
                                        parseBoolean = z3;
                                        z5 = z4;
                                        i14 = 13;
                                    }
                                    i5 = i15 - i9;
                                    if (i5 >= 5 || i4 == length) {
                                        if (i10 != 0) {
                                            sb.append((char) 900);
                                            i6 = 0;
                                            i10 = 0;
                                        } else {
                                            i6 = i11;
                                        }
                                        int e2 = ou7.e(i9, i5, i6, ys3Var, sb);
                                        i9 += i5;
                                        i11 = e2;
                                    } else {
                                        Charset charset2 = z4 ? null : forName;
                                        CharsetEncoder newEncoder = charset2 == null ? null : charset2.newEncoder();
                                        int length4 = ys3Var.length();
                                        int i17 = i9;
                                        while (i17 < length4) {
                                            int i18 = i17;
                                            int i19 = 0;
                                            while (i19 < 13 && !ys3Var.b(i18) && (charAt = ys3Var.charAt(i18)) >= '0' && charAt <= '9' && (i18 = i17 + (i19 = i19 + 1)) < length4) {
                                            }
                                            if (i19 >= 13) {
                                                break;
                                            }
                                            if (newEncoder != null && !newEncoder.canEncode(ys3Var.charAt(i17))) {
                                                char charAt5 = ys3Var.charAt(i17);
                                                throw new w30("Non-encodable character detected: " + charAt5 + " (Unicode: " + ((int) charAt5) + ')');
                                            }
                                            i17++;
                                        }
                                        int i20 = i17 - i9;
                                        if (i20 == 0) {
                                            i20 = 1;
                                        }
                                        byte[] bytes2 = z4 ? null : ys3Var.subSequence(i9, i9 + i20).toString().getBytes(forName);
                                        if (bytes2 != null ? bytes2.length == 1 : i20 == 1) {
                                            if (i10 == 0) {
                                                if (z4) {
                                                    ou7.c(i9, 1, 0, ys3Var, sb);
                                                } else {
                                                    ou7.b(1, 0, sb, bytes2);
                                                }
                                                i9 += i20;
                                            }
                                        }
                                        if (z4) {
                                            ou7.c(i9, i9 + i20, i10, ys3Var, sb);
                                        } else {
                                            ou7.b(bytes2.length, i10, sb, bytes2);
                                        }
                                        i10 = 1;
                                        i11 = 0;
                                        i9 += i20;
                                    }
                                }
                                parseBoolean = z3;
                                z5 = z4;
                            }
                        }
                        break loop0;
                    }
                    z = parseBoolean;
                } else {
                    z = parseBoolean;
                    sb.append((char) 902);
                    ou7.d(ys3Var, 0, length, sb);
                }
                String sb2 = sb.toString();
                int length5 = sb2.length();
                float f2 = 0.0f;
                int[] iArr2 = null;
                int i21 = 2;
                int i22 = 2;
                while (true) {
                    if (i21 > 30) {
                        i21 = i22;
                        break;
                    }
                    int i23 = length5 + 1 + i8;
                    int i24 = i23 / i21;
                    int i25 = i24 + 1;
                    if (i21 * i25 < i23 + i21) {
                        i24 = i25;
                    }
                    if (i24 < 2) {
                        break;
                    }
                    if (i24 <= 30) {
                        float f3 = (((i21 * 17) + 69) * 0.357f) / (i24 * 2.0f);
                        if (iArr2 == null || Math.abs(f3 - 3.0f) <= Math.abs(f2 - 3.0f)) {
                            iArr2 = new int[]{i21, i24};
                            f2 = f3;
                        }
                    }
                    i22 = i21;
                    i21++;
                }
                if (iArr2 == null) {
                    int i26 = length5 + 1 + i8;
                    int i27 = i26 / i21;
                    int i28 = i27 + 1;
                    if (i21 * i28 < i26 + i21) {
                        i27 = i28;
                    }
                    if (i27 < 2) {
                        c2 = 0;
                        c3 = 1;
                        iArr2 = new int[]{2, 2};
                        if (iArr2 != null) {
                            throw new w30("Unable to fit message in columns");
                        }
                        int i29 = iArr2[c2];
                        int i30 = iArr2[c3];
                        int i31 = (i29 * i30) - i8 > length5 + 1 ? (r5 - length5) - 1 : 0;
                        if (length5 + i8 + 1 > 929) {
                            throw new w30("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
                        }
                        int i32 = length5 + i31 + 1;
                        StringBuilder sb3 = new StringBuilder(i32);
                        sb3.append((char) i32);
                        sb3.append(sb2);
                        for (int i33 = 0; i33 < i31; i33++) {
                            sb3.append((char) 900);
                        }
                        String sb4 = sb3.toString();
                        if (parseInt2 < 0 || parseInt2 > 8) {
                            lq5.j("Error correction level must be between 0 and 8!");
                            return null;
                        }
                        char[] cArr = new char[i8];
                        int length6 = sb4.length();
                        for (int i34 = 0; i34 < length6; i34++) {
                            int i35 = i8 - 1;
                            int charAt6 = (sb4.charAt(i34) + cArr[i35]) % 929;
                            while (true) {
                                iArr = lgd.a;
                                if (i35 >= 1) {
                                    cArr[i35] = (char) ((cArr[i35 - 1] + (929 - ((iArr[parseInt2][i35] * charAt6) % 929))) % 929);
                                    i35--;
                                }
                            }
                            cArr[0] = (char) ((929 - ((charAt6 * iArr[parseInt2][0]) % 929)) % 929);
                        }
                        StringBuilder sb5 = new StringBuilder(i8);
                        for (int i36 = i8 - 1; i36 >= 0; i36--) {
                            char c5 = cArr[i36];
                            if (c5 != 0) {
                                cArr[i36] = (char) (929 - c5);
                            }
                            sb5.append(cArr[i36]);
                        }
                        String sb6 = sb5.toString();
                        cf0 cf0Var = new cf0();
                        cf0Var.d = new df0[i30];
                        for (int i37 = 0; i37 < i30; i37++) {
                            ((df0[]) cf0Var.d)[i37] = new df0(((i29 + 4) * 17) + 1);
                        }
                        cf0Var.c = i29 * 17;
                        cf0Var.b = i30;
                        cf0Var.a = -1;
                        String concat = sb4.concat(sb6);
                        int i38 = 0;
                        for (int i39 = 0; i39 < i30; i39++) {
                            int i40 = i39 % 3;
                            cf0Var.a++;
                            kgd.a(130728, 17, cf0Var.b());
                            if (i40 == 0) {
                                int i41 = (i39 / 3) * 30;
                                i2 = ik8.g(i30, 1, 3, i41);
                                i3 = (i29 - 1) + i41;
                            } else if (i40 == 1) {
                                int i42 = (i39 / 3) * 30;
                                int i43 = i30 - 1;
                                int i44 = (parseInt2 * 3) + i42 + (i43 % 3);
                                int i45 = i42 + (i43 / 3);
                                i2 = i44;
                                i3 = i45;
                            } else {
                                int i46 = (i39 / 3) * 30;
                                i2 = (i29 - 1) + i46;
                                i3 = (parseInt2 * 3) + i46 + ((i30 - 1) % 3);
                            }
                            int[][] iArr3 = kgd.a;
                            kgd.a(iArr3[i40][i2], 17, cf0Var.b());
                            for (int i47 = 0; i47 < i29; i47++) {
                                kgd.a(iArr3[i40][concat.charAt(i38)], 17, cf0Var.b());
                                i38++;
                            }
                            if (z) {
                                kgd.a(260649, 1, cf0Var.b());
                            } else {
                                kgd.a(iArr3[i40][i3], 17, cf0Var.b());
                                kgd.a(260649, 18, cf0Var.b());
                            }
                        }
                        byte[][] d2 = cf0Var.d(1, 4);
                        if (d2[0].length < d2.length) {
                            d2 = O3(d2);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int min = Math.min(0 / d2[0].length, 0 / d2.length);
                        if (min <= 1) {
                            return B(d2, parseInt);
                        }
                        byte[][] d3 = cf0Var.d(min, min << 2);
                        if (z2) {
                            d3 = O3(d3);
                        }
                        return B(d3, parseInt);
                    }
                }
                c2 = 0;
                c3 = 1;
                if (iArr2 != null) {
                }
            }
            i = 0;
            i34Var = i34.f;
            if (enumMap.containsKey(i34Var)) {
            }
        }
        i = 1;
        i34Var = i34.f;
        if (enumMap.containsKey(i34Var)) {
        }
    }

    @Override // rb2
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        byte b2 = this.a;
        return false;
    }

    @Override // bl0
    public final int o1() {
        return 0;
    }

    @Override // mqa
    public final StackTraceElement[] p(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        }
                    }
                    int intValue2 = i2 - num.intValue();
                    if (i4 < 10) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                        i3 += intValue2;
                        i4++;
                    }
                    i = (intValue2 - 1) + i2;
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // s8a
    public final Object q(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            ek8 o = ek8.o(fileInputStream);
            rj7 rj7Var = new rj7(false);
            ak8[] ak8VarArr = (ak8[]) Arrays.copyOf(new ak8[0], 0);
            rj7Var.b();
            if (ak8VarArr.length > 0) {
                ak8 ak8Var = ak8VarArr[0];
                throw null;
            }
            Map l = o.l();
            l.getClass();
            for (Map.Entry entry : l.entrySet()) {
                String str = (String) entry.getKey();
                jk8 jk8Var = (jk8) entry.getValue();
                str.getClass();
                jk8Var.getClass();
                int u = jk8Var.u();
                switch (u == 0 ? -1 : bk8.a[ik8.F(u)]) {
                    case -1:
                        throw new zx2("Value case is null.", null);
                    case 0:
                    default:
                        throw new zp2();
                    case 1:
                        rj7Var.d(new zj8(str), Boolean.valueOf(jk8Var.l()));
                        break;
                    case 2:
                        rj7Var.d(new zj8(str), Float.valueOf(jk8Var.p()));
                        break;
                    case 3:
                        rj7Var.d(new zj8(str), Double.valueOf(jk8Var.o()));
                        break;
                    case 4:
                        rj7Var.d(new zj8(str), Integer.valueOf(jk8Var.q()));
                        break;
                    case 5:
                        rj7Var.d(new zj8(str), Long.valueOf(jk8Var.r()));
                        break;
                    case 6:
                        zj8 zj8Var = new zj8(str);
                        String s2 = jk8Var.s();
                        s2.getClass();
                        rj7Var.d(zj8Var, s2);
                        break;
                    case 7:
                        zj8 zj8Var2 = new zj8(str);
                        or5 n2 = jk8Var.t().n();
                        n2.getClass();
                        rj7Var.d(zj8Var2, sl2.m(n2));
                        break;
                    case 8:
                        zj8 zj8Var3 = new zj8(str);
                        n51 m = jk8Var.m();
                        int size = m.size();
                        if (size == 0) {
                            bArr = pr5.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            m.k(size, bArr2);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        rj7Var.d(zj8Var3, bArr);
                        break;
                    case 9:
                        throw new zx2("Value not set.", null);
                }
            }
            return new rj7(new LinkedHashMap(rj7Var.a()), true);
        } catch (bs5 e2) {
            throw new zx2("Unable to parse preferences proto.", e2);
        }
    }

    @Override // rb2
    public final void q0(wb2 wb2Var, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void q1(wb2 wb2Var, int i) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void r() {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void r0() {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // peb
    public final reb s(ko4 ko4Var) {
        char c2;
        String str = ko4Var.t;
        List list = ko4Var.w;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    xq2 xq2Var = new xq2();
                    ey7 ey7Var = new ey7((byte[]) list.get(0));
                    int H = ey7Var.H();
                    int H2 = ey7Var.H();
                    Paint paint = new Paint();
                    xq2Var.a = paint;
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint.setPathEffect(null);
                    Paint paint2 = new Paint();
                    xq2Var.b = paint2;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    paint2.setPathEffect(null);
                    xq2Var.c = new Canvas();
                    xq2Var.d = new hs3(719, 575, 0, 719, 0, 575);
                    xq2Var.e = new gs3(0, new int[]{0, -1, -16777216, -8421505}, xq2.i(), xq2.k());
                    xq2Var.f = new ms3(H, H2);
                    return xq2Var;
                case 1:
                    return new u8a((byte) 12);
                case 2:
                    return new kj4((byte) 19);
                case 3:
                    return new zhc((byte) 2);
                case 4:
                    return new p7c(list);
                case 5:
                    return new ypa(list);
                case 6:
                    return new fnc(list);
                case 7:
                    return new eeb();
                case '\b':
                    return new p6c();
            }
        }
        lq5.j(c00.i("Unsupported MIME type: ", str));
        return null;
    }

    @Override // rb2
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        byte b2 = this.a;
        return false;
    }

    @Override // efc
    public final void t(boolean z, float[] fArr) {
        p40 p40Var = aob.d5;
        if (p40Var == null) {
            p40Var = new p40();
            aob.d5 = p40Var;
        }
        p40Var.d(z, fArr);
    }

    @Override // rb2
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final String u(long j) {
        byte b2 = this.a;
        return null;
    }

    @Override // rb2
    public final void u0(wb2 wb2Var, long j) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        byte b2 = this.a;
        m01.u(wb2Var.getContext(), str);
    }

    @Override // rb2
    public final void v(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void v1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final boolean w0(wb2 wb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final boolean w1() {
        byte b2 = this.a;
        return false;
    }

    @Override // pr3
    public final int x(ko4 ko4Var) {
        return ko4Var.x != null ? 1 : 0;
    }

    @Override // bl0
    public final int x0() {
        return 0;
    }

    @Override // bl0
    public final int x1() {
        return 0;
    }

    @Override // peb
    public final int y(ko4 ko4Var) {
        String str = ko4Var.t;
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
        lq5.j(c00.i("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // rb2
    public final boolean y0(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override // rb2
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void z1() {
        byte b2 = this.a;
    }

    private final void E0() {
    }

    private final void E3() {
    }

    private final void F3() {
    }

    private final void I3() {
    }

    private final void J3() {
    }

    private final void M3() {
    }

    private final void N3() {
    }

    private final void S3() {
    }

    private final void T3() {
    }

    private final void U2() {
    }

    private final void V2() {
    }

    private final void e0() {
    }

    private final void f0() {
    }

    private final void u2() {
    }

    private final void v2() {
    }

    private final void z0() {
    }

    @Override // pr3
    public final void a() {
    }

    @Override // pr3
    public final void release() {
    }

    private final void D1(wb2 wb2Var) {
    }

    private final void E1(wb2 wb2Var) {
    }

    private final void E2(wb2 wb2Var) {
    }

    private final void F0(wb2 wb2Var) {
    }

    private final void F2(wb2 wb2Var) {
    }

    private final void H0(wb2 wb2Var) {
    }

    private final void K2(wb2 wb2Var) {
    }

    private final void K3(int i) {
    }

    private final void L2(wb2 wb2Var) {
    }

    private final void L3(int i) {
    }

    private final void M2(wb2 wb2Var) {
    }

    private final void N2(wb2 wb2Var) {
    }

    private final void O2(wb2 wb2Var) {
    }

    private final void P1(wb2 wb2Var) {
    }

    private final void P2(wb2 wb2Var) {
    }

    private final void P3(r47 r47Var) {
    }

    private final void Q3(r47 r47Var) {
    }

    private final void R0(wb2 wb2Var) {
    }

    private final void S0(wb2 wb2Var) {
    }

    private final void S1(wb2 wb2Var) {
    }

    private final void S2(wb2 wb2Var) {
    }

    private final void T2(wb2 wb2Var) {
    }

    private final void b1(wb2 wb2Var) {
    }

    private final void c3(String str) {
    }

    private final void d1(wb2 wb2Var) {
    }

    private final void d3(String str) {
    }

    private final void e1(o47 o47Var) {
    }

    private final void g1(o47 o47Var) {
    }

    private final void g2(wb2 wb2Var) {
    }

    private final void i0(wb2 wb2Var) {
    }

    private final void i3(wb2 wb2Var) {
    }

    private final void j3(wb2 wb2Var) {
    }

    private final void m3(wb2 wb2Var) {
    }

    private final void n2(wb2 wb2Var) {
    }

    private final void n3(wb2 wb2Var) {
    }

    private final void o2(wb2 wb2Var) {
    }

    private final void o3(r47 r47Var) {
    }

    private final void p0(wb2 wb2Var) {
    }

    private final void p1(wb2 wb2Var) {
    }

    private final void p2(wb2 wb2Var) {
    }

    private final void p3(r47 r47Var) {
    }

    private final void q3(wb2 wb2Var) {
    }

    private final void r3(wb2 wb2Var) {
    }

    private final void s1(wb2 wb2Var) {
    }

    private final void t0(wb2 wb2Var) {
    }

    private final void u3(wb2 wb2Var) {
    }

    private final void v0(wb2 wb2Var) {
    }

    private final void v3(wb2 wb2Var) {
    }

    private final void A3(wb2 wb2Var, boolean z) {
    }

    private final void B1(wb2 wb2Var, iq0 iq0Var) {
    }

    private final void C1(wb2 wb2Var, iq0 iq0Var) {
    }

    private final void C3(wb2 wb2Var, boolean z) {
    }

    private final void G2(String str, String str2) {
    }

    private final void H1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void H2(String str, String str2) {
    }

    private final void L0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void R(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Z1(wb2 wb2Var, int i) {
    }

    private final void b2(wb2 wb2Var, int i) {
    }

    private final void c2(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void e3(wb2 wb2Var, long j) {
    }

    private final void f2(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void f3(wb2 wb2Var, long j) {
    }

    private final void s2(wb2 wb2Var, int i) {
    }

    private final void s3(wb2 wb2Var, q38 q38Var) {
    }

    private final void t2(wb2 wb2Var, int i) {
    }

    private final void t3(wb2 wb2Var, q38 q38Var) {
    }

    private final void w3(wb2 wb2Var, boolean z) {
    }

    private final void y3(wb2 wb2Var, boolean z) {
    }

    @Override // pr3
    public final void w(Looper looper, ig8 ig8Var) {
    }

    private final void B3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void C(wb2 wb2Var, float f2, float f3) {
    }

    private final void D(wb2 wb2Var, float f2, float f3) {
    }

    private final void D3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void I2(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void J2(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void Q2(wb2 wb2Var, float f2, float f3) {
    }

    private final void R2(wb2 wb2Var, float f2, float f3) {
    }

    private final void W2(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void X0(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    private final void X1(wb2 wb2Var, int i, int i2) {
    }

    private final void X2(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void Y1(wb2 wb2Var, int i, int i2) {
    }

    private final void Z0(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    private final void k3(wb2 wb2Var, float f2, float f3) {
    }

    private final void l3(wb2 wb2Var, float f2, float f3) {
    }

    private final void w2(wb2 wb2Var, float f2, float f3) {
    }

    private final void x2(wb2 wb2Var, float f2, float f3) {
    }

    private final void x3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void z3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void Y2(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void Z2(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void a3(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void b3(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void q2(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    private final void r2(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    private final void y2(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void z2(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void A2(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void B2(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void C2(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void D2(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void g3(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void h3(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void T0(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void W0(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void G3(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    private final void H3(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
