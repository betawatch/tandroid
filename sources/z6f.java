// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class z6f implements tq2, OnFailureListener, y2c, y27, y11, jx9, j30, g84, gm6, rb2, l3d, uw8, iy7, pj2 {
    public static z6f b;
    public final /* synthetic */ byte a;
    public static final z6f c = new z6f((byte) 1);
    public static final z6f d = new z6f((byte) 2);
    public static final /* synthetic */ z6f e = new z6f((byte) 3);
    public static final /* synthetic */ z6f f = new z6f((byte) 4);
    public static final z6f h = new z6f((byte) 5);
    public static final z6f n = new z6f((byte) 6);
    public static final z6f r = new z6f((byte) 7);
    public static final z6f s = new z6f((byte) 8);
    public static final z6f w = new z6f((byte) 9);
    public static final z6f x = new z6f((byte) 10);
    public static final z6f y = new z6f((byte) 11);
    public static final /* synthetic */ z6f E = new z6f((byte) 12);

    public z6f(Context context) {
        this.a = (byte) 29;
    }

    public static void I3(JsonReader jsonReader, mo5 mo5Var) {
        jsonReader.beginArray();
        boolean z = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                jsonReader.beginObject();
                String str = null;
                String str2 = null;
                i2b i2bVar = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("BASE-ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        str = jsonReader.nextString();
                    } else if (nextName.equals("ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        str2 = jsonReader.nextString();
                    } else if (nextName.equals("URI-REPLACEMENT") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                        jsonReader.beginObject();
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        HashMap hashMap3 = new HashMap();
                        String str3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            if (nextName2.equals("HOST") && jsonReader.peek().equals(JsonToken.STRING)) {
                                str3 = jsonReader.nextString();
                                if (str3.isEmpty()) {
                                    throw hy7.c("The HOST string is present but empty");
                                }
                            } else if (nextName2.equals("PARAMS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName3 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap.put(nextName3, jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (nextName2.equals("PER-VARIANT-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap2.put(nextName4, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (nextName2.equals("PER-RENDITION-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap3.put(nextName5, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        i2bVar = new i2b(str3, hashMap, hashMap2, hashMap3);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str == null) {
                    throw hy7.c("BASE-ID field is missing in a PATHWAY-CLONE object");
                }
                if (str2 == null) {
                    throw hy7.c("ID field is missing in a PATHWAY-CLONE object");
                }
                if (i2bVar == null) {
                    throw hy7.c("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object");
                }
                mo5Var.c(new h2b(str, str2, i2bVar));
                z = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!z) {
            throw hy7.c("The PATHWAY-CLONES array is present but empty");
        }
    }

    public static void J3(JsonReader jsonReader, mo5 mo5Var) {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String nextString = jsonReader.nextString();
                if (!hashSet.add(nextString)) {
                    throw hy7.c("The pathway ID (" + nextString + ") appears more than once in the PATHWAY-PRIORITY array");
                }
                mo5Var.c(nextString);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (hashSet.isEmpty()) {
            throw hy7.c("The PATHWAY-PRIORITY array is present but empty");
        }
    }

    public static synchronized void O3() {
        synchronized (z6f.class) {
            if (b == null) {
                b = new z6f((byte) 0);
            }
        }
    }

    public static byte[] l3(po5 po5Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(po5Var.size());
        Iterator<E> it = po5Var.iterator();
        while (it.hasNext()) {
            m43 m43Var = (m43) it.next();
            Bundle a = m43Var.a();
            Bitmap bitmap = m43Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yve.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a.putByteArray(m43.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static ha6 u3(ga6 ga6Var, ed edVar) {
        IOException iOException = (IOException) edVar.c;
        if (!(iOException instanceof ni5)) {
            return null;
        }
        int i = ((ni5) iOException).c;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (ga6Var.e) {
            if (ga6Var.a(2)) {
                return new ha6(2, 60000L);
            }
            if (ga6Var.a(1)) {
                return new ha6(1, 300000L);
            }
            return null;
        }
        if (ga6Var.a(1)) {
            return new ha6(1, 300000L);
        }
        if (ga6Var.a(2)) {
            return new ha6(2, 60000L);
        }
        return null;
    }

    public static long w3(ed edVar) {
        for (Throwable th = (IOException) edVar.c; th != null; th = th.getCause()) {
            if ((th instanceof hy7) || (th instanceof FileNotFoundException) || (th instanceof ki5) || (th instanceof qa6)) {
                return -9223372036854775807L;
            }
            if ((th instanceof k73) && ((k73) th).a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((edVar.b - 1) * 1000, 5000);
    }

    public static short z3(short s2, short s3) {
        int i = s2 + 32768;
        int i2 = s3 + 32768;
        int i3 = (i < 32768 || i2 < 32768) ? (i * i2) / 32768 : (((i + i2) << 1) - ((i * i2) / 32768)) - 65535;
        return (short) ((i3 != 65536 ? i3 : 65535) - 32768);
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

    @Override // rb2
    public final void C0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // g84
    public final void D() {
        throw new UnsupportedOperationException();
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
        JsonReader jsonReader = new JsonReader(new InputStreamReader(l73Var));
        try {
            if (!jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                throw hy7.c("Steering manifest JSON should be an object at root");
            }
            mo5 mo5Var = new mo5(4);
            mo5 mo5Var2 = new mo5(4);
            jsonReader.beginObject();
            Uri uri2 = null;
            int i = 1;
            long j = -9223372036854775807L;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName.equals("VERSION") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    i = jsonReader.nextInt();
                } else if (nextName.equals("TTL") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    j = jsonReader.nextInt() * 1000;
                } else if (nextName.equals("RELOAD-URI") && jsonReader.peek().equals(JsonToken.STRING)) {
                    uri2 = Uri.parse(jsonReader.nextString());
                } else if (nextName.equals("PATHWAY-PRIORITY") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    J3(jsonReader, mo5Var);
                } else if (nextName.equals("PATHWAY-CLONES") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    I3(jsonReader, mo5Var2);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            j99 f2 = mo5Var.f();
            if (f2.isEmpty()) {
                throw hy7.c("PATHWAY-PRIORITY field is missing");
            }
            j2b j2bVar = new j2b(i, j, uri2, f2, mo5Var2.f());
            jsonReader.close();
            return j2bVar;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // rb2
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void I1(wb2 wb2Var) {
        byte b2 = this.a;
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

    @Override // gm6
    public final long a() {
        throw new NoSuchElementException();
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
                Object h2 = am2Var.h(new h09(m36.class, Executor.class));
                h2.getClass();
                return new p54((Executor) h2);
            default:
                ArrayList arrayList = new ArrayList(am2Var.N(l8d.class));
                xve.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, nu6.e);
                return new tae((Context) am2Var.a(Context.class), (l8d) arrayList.get(0));
        }
    }

    @Override // y11
    public final void c(z11 z11Var, j11 j11Var, fv0 fv0Var, y42 y42Var) {
        z11Var.setInOutOffset(z11Var.getMeasuredHeight());
        y42Var.accept(Float.valueOf(z11Var.getTranslationY()));
        vpa vpaVar = new vpa((Object) z11Var, z11.IN_OUT_OFFSET_Y, 0.0f);
        vpaVar.m.a(0.8f);
        vpaVar.m.b(400.0f);
        vpaVar.a(new x11(z11Var, fv0Var, (byte) 0));
        vpaVar.b(new w11(y42Var, z11Var, (byte) 1));
        vpaVar.h();
        j11Var.run();
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

    @Override // pj2
    public final long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // g84
    public final x1c e0(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // rb2
    public final void e2(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void f1(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override // gm6
    public final long g() {
        throw new NoSuchElementException();
    }

    @Override // rb2
    public final void g0(String str) {
        byte b2 = this.a;
    }

    @Override // uw8
    public final Object get() {
        sae saeVar = new sae();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            p3d.h("Null flags");
            return null;
        }
        hashMap.put(pm8.a, new ma0(30000L, 86400000L, set));
        if (set == null) {
            p3d.h("Null flags");
            return null;
        }
        hashMap.put(pm8.c, new ma0(1000L, 86400000L, set));
        if (set == null) {
            p3d.h("Null flags");
            return null;
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(eu9.b)));
        if (unmodifiableSet == null) {
            p3d.h("Null flags");
            return null;
        }
        hashMap.put(pm8.b, new ma0(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= pm8.values().length) {
            return new la0(saeVar, hashMap);
        }
        grb.i("Not all priorities have been configured");
        return null;
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

    public final void j(m34 m34Var) {
        m34Var.a(wqe.class, z0e.a);
        m34Var.a(g1f.class, ife.a);
        m34Var.a(ere.class, d1e.a);
        m34Var.a(ise.class, m1e.a);
        m34Var.a(tre.class, i1e.a);
        m34Var.a(bse.class, t1e.a);
        m34Var.a(xle.class, yvd.a);
        m34Var.a(tle.class, svd.a);
        m34Var.a(xoe.class, szd.a);
        m34Var.a(d0f.class, nde.a);
        m34Var.a(nle.class, lvd.a);
        m34Var.a(hle.class, hvd.a);
        m34Var.a(xte.class, m4e.a);
        m34Var.a(w3f.class, lyd.a);
        m34Var.a(joe.class, dzd.a);
        m34Var.a(tne.class, fyd.a);
        m34Var.a(due.class, r4e.a);
        m34Var.a(sze.class, yce.a);
        m34Var.a(uze.class, ede.a);
        m34Var.a(mze.class, tce.a);
        m34Var.a(uk6.class, v2e.a);
        m34Var.a(s3f.class, hrd.a);
        m34Var.a(ete.class, b3e.a);
        m34Var.a(nve.class, j7e.a);
        m34Var.a(bwe.class, a8e.a);
        m34Var.a(yve.class, u7e.a);
        m34Var.a(sve.class, n7e.a);
        m34Var.a(xxe.class, bae.a);
        m34Var.a(bye.class, gae.a);
        m34Var.a(iye.class, hbe.a);
        m34Var.a(fye.class, abe.a);
        m34Var.a(tse.class, o2e.a);
        m34Var.a(m8a.class, nbe.a);
        m34Var.a(rye.class, tbe.a);
        m34Var.a(vye.class, zbe.a);
        m34Var.a(zye.class, ece.a);
        m34Var.a(ize.class, lce.a);
        m34Var.a(fze.class, pce.a);
        m34Var.a(uxe.class, d9e.a);
        m34Var.a(dqe.class, p0e.a);
        m34Var.a(nxe.class, n9e.a);
        m34Var.a(hxe.class, i9e.a);
        m34Var.a(oxe.class, t9e.a);
        m34Var.a(yze.class, ide.a);
        m34Var.a(a2f.class, fhe.a);
        m34Var.a(ije.class, btd.a);
        m34Var.a(wie.class, psd.a);
        m34Var.a(qie.class, jsd.a);
        m34Var.a(cje.class, tsd.a);
        m34Var.a(rje.class, ltd.a);
        m34Var.a(nje.class, gtd.a);
        m34Var.a(vje.class, otd.a);
        m34Var.a(bke.class, rtd.a);
        m34Var.a(gke.class, xtd.a);
        m34Var.a(lke.class, dud.a);
        m34Var.a(qke.class, kud.a);
        m34Var.a(cjd.class, lqd.a);
        m34Var.a(ojd.class, wqd.a);
        m34Var.a(hjd.class, rqd.a);
        m34Var.a(tpe.class, g0e.a);
        m34Var.a(bme.class, fwd.a);
        m34Var.a(sdd.class, xjd.a);
        m34Var.a(pdd.class, ckd.a);
        m34Var.a(kne.class, gxd.a);
        m34Var.a(ked.class, hkd.a);
        m34Var.a(aed.class, mkd.a);
        m34Var.a(sfd.class, qmd.a);
        m34Var.a(nfd.class, wmd.a);
        m34Var.a(yed.class, qkd.a);
        m34Var.a(qed.class, wkd.a);
        m34Var.a(lhd.class, ynd.a);
        m34Var.a(fhd.class, god.a);
        m34Var.a(did.class, apd.a);
        m34Var.a(xhd.class, gpd.a);
        m34Var.a(zid.class, dqd.a);
        m34Var.a(wid.class, hqd.a);
        m34Var.a(kid.class, jpd.a);
        m34Var.a(hid.class, ppd.a);
        m34Var.a(sid.class, vpd.a);
        m34Var.a(nid.class, ypd.a);
        m34Var.a(b3f.class, eee.a);
        m34Var.a(d2f.class, kwd.a);
        m34Var.a(r2f.class, l2e.a);
        m34Var.a(n2f.class, f2e.a);
        m34Var.a(dcc.class, ryd.a);
        m34Var.a(x2f.class, yde.a);
        m34Var.a(u2f.class, tde.a);
        m34Var.a(e3f.class, jee.a);
        m34Var.a(k2f.class, xzd.a);
        m34Var.a(p3f.class, she.a);
        m34Var.a(n3f.class, whe.a);
        m34Var.a(h3f.class, mhe.a);
        m34Var.a(h0f.class, ree.a);
        m34Var.a(ope.class, b0e.a);
        m34Var.a(hqe.class, u0e.a);
        m34Var.a(jie.class, mrd.a);
        m34Var.a(noe.class, hzd.a);
        m34Var.a(zpe.class, k0e.a);
        m34Var.a(one.class, nxd.a);
        m34Var.a(tme.class, swd.a);
        m34Var.a(ane.class, wwd.a);
        m34Var.a(qme.class, pwd.a);
        m34Var.a(gne.class, cxd.a);
        m34Var.a(pse.class, a2e.a);
        m34Var.a(jse.class, x1e.a);
        m34Var.a(mdd.class, ujd.a);
        m34Var.a(r1f.class, cge.a);
        m34Var.a(x1f.class, nge.a);
        m34Var.a(u1f.class, hge.a);
        m34Var.a(eie.class, brd.a);
        m34Var.a(ele.class, avd.a);
        m34Var.a(zke.class, wud.a);
        m34Var.a(vke.class, qud.a);
        m34Var.a(hte.class, q3e.a);
        m34Var.a(tte.class, d4e.a);
        m34Var.a(nte.class, x3e.a);
        m34Var.a(jfd.class, dmd.a);
        m34Var.a(efd.class, jmd.a);
        m34Var.a(jue.class, x4e.a);
        m34Var.a(xue.class, p6e.a);
        m34Var.a(nue.class, d5e.a);
        m34Var.a(sue.class, i5e.a);
        m34Var.a(qgd.class, and.a);
        m34Var.a(lgd.class, fnd.a);
        m34Var.a(r0f.class, cfe.a);
        m34Var.a(m0f.class, wee.a);
        m34Var.a(m1f.class, ofe.a);
        m34Var.a(p1f.class, yfe.a);
        m34Var.a(fwe.class, g8e.a);
        m34Var.a(cxe.class, y8e.a);
        m34Var.a(lwe.class, m8e.a);
        m34Var.a(ywe.class, t8e.a);
        m34Var.a(shd.class, ood.a);
        m34Var.a(qhd.class, uod.a);
        m34Var.a(roe.class, mzd.a);
        m34Var.a(yne.class, yyd.a);
        m34Var.a(zue.class, u6e.a);
        m34Var.a(jve.class, f7e.a);
        m34Var.a(dve.class, y6e.a);
        m34Var.a(chd.class, ond.a);
        m34Var.a(ugd.class, snd.a);
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

    @Override // g84
    public final void m0(zy9 zy9Var) {
        throw new UnsupportedOperationException();
    }

    @Override // rb2
    public final void m2(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void n0(wb2 wb2Var, int i, int i2) {
        byte b2 = this.a;
    }

    @Override // rb2
    public final void n1(o47 o47Var) {
        byte b2 = this.a;
    }

    @Override // gm6
    public final boolean next() {
        return false;
    }

    @Override // l3d
    public final rj0 o(String str, bf0 bf0Var, EnumMap enumMap) {
        if (str.isEmpty()) {
            lq5.j("Found empty contents");
            return null;
        }
        if (bf0Var != bf0.d) {
            lq5.q(bf0Var, "Can only encode QR_CODE, but got ");
            return null;
        }
        i34 i34Var = i34.a;
        r44 valueOf = enumMap.containsKey(i34Var) ? r44.valueOf(enumMap.get(i34Var).toString()) : r44.b;
        i34 i34Var2 = i34.c;
        int parseInt = enumMap.containsKey(i34Var2) ? Integer.parseInt(enumMap.get(i34Var2).toString()) : 4;
        sj0 sj0Var = (sj0) k34.b(str, valueOf, enumMap).f;
        if (sj0Var == null) {
            grb.g();
            return null;
        }
        int i = sj0Var.b;
        int i2 = sj0Var.c;
        int i3 = parseInt << 1;
        int i4 = i + i3;
        int i5 = i3 + i2;
        int max = Math.max(0, i4);
        int max2 = Math.max(0, i5);
        int min = Math.min(max / i4, max2 / i5);
        int i6 = (max - (i * min)) / 2;
        int i7 = (max2 - (i2 * min)) / 2;
        rj0 rj0Var = new rj0(max, max2);
        int i8 = 0;
        while (i8 < i2) {
            int i9 = i6;
            int i10 = 0;
            while (i10 < i) {
                if (sj0Var.e(i10, i8) == 1) {
                    rj0Var.d(i9, i7, min, min);
                }
                i10++;
                i9 += min;
            }
            i8++;
            i7 += min;
        }
        return rj0Var;
    }

    @Override // rb2
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        byte b2 = this.a;
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        j5 j5Var = og7.e;
        if (Log.isLoggable(j5Var.b, 6)) {
            String str = j5Var.c;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }

    @Override // j30
    public final void p0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i3 = 0; i3 < min; i3++) {
            shortBuffer2.put(z3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override // y11
    public final void q(z11 z11Var, j11 j11Var, k11 k11Var, hw hwVar) {
        vpa vpaVar = new vpa(z11Var, z11.IN_OUT_OFFSET_Y, z11Var.getHeight());
        vpaVar.m.a(0.8f);
        vpaVar.m.b(400.0f);
        vpaVar.a(new iw0(k11Var, (byte) 2));
        vpaVar.b(new w11(hwVar, z11Var, (byte) 0));
        vpaVar.h();
        j11Var.run();
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

    @Override // rb2
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        byte b2 = this.a;
        return false;
    }

    @Override // j30
    public final int s1(int i, int i2, int i3) {
        return i / 2;
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

    public final int v3(int i) {
        return i == 7 ? 6 : 3;
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

    @Override // y27
    public final boolean z0(f27 f27Var) {
        return false;
    }

    @Override // rb2
    public final void z1() {
        byte b2 = this.a;
    }

    public /* synthetic */ z6f(byte b2) {
        this.a = b2;
    }

    private final void C3() {
    }

    private final void D3() {
    }

    private final void G3() {
    }

    private final void H3() {
    }

    private final void J2() {
    }

    private final void K2() {
    }

    private final void M3() {
    }

    private final void N3() {
    }

    private final void V() {
    }

    private final void X() {
    }

    private final void b2() {
    }

    private final void c2() {
    }

    private final void w() {
    }

    private final void x() {
    }

    private final void x3() {
    }

    private final void y3() {
    }

    @Override // jx9
    public final void finish() {
    }

    private final void A2(wb2 wb2Var) {
    }

    private final void B0(wb2 wb2Var) {
    }

    private final void B2(wb2 wb2Var) {
    }

    private final void C(wb2 wb2Var) {
    }

    private final void C2(wb2 wb2Var) {
    }

    private final void D2(wb2 wb2Var) {
    }

    private final void E2(wb2 wb2Var) {
    }

    private final void E3(int i) {
    }

    private final void F3(int i) {
    }

    private final void H1(wb2 wb2Var) {
    }

    private final void H2(wb2 wb2Var) {
    }

    private final void I2(wb2 wb2Var) {
    }

    private final void J(wb2 wb2Var) {
    }

    private final void K3(r47 r47Var) {
    }

    private final void L0(wb2 wb2Var) {
    }

    private final void L3(r47 r47Var) {
    }

    private final void O0(wb2 wb2Var) {
    }

    private final void O1(wb2 wb2Var) {
    }

    private final void P1(wb2 wb2Var) {
    }

    private final void Q1(wb2 wb2Var) {
    }

    private final void R(wb2 wb2Var) {
    }

    private final void R0(o47 o47Var) {
    }

    private final void R2(String str) {
    }

    private final void S0(o47 o47Var) {
    }

    private final void S2(String str) {
    }

    private final void T0(wb2 wb2Var) {
    }

    private final void W0(wb2 wb2Var) {
    }

    private final void X2(wb2 wb2Var) {
    }

    private final void Y2(wb2 wb2Var) {
    }

    private final void b1(wb2 wb2Var) {
    }

    private final void b3(wb2 wb2Var) {
    }

    private final void c3(wb2 wb2Var) {
    }

    private final void d1(wb2 wb2Var) {
    }

    private final void d3(r47 r47Var) {
    }

    private final void e3(r47 r47Var) {
    }

    private final void f0(wb2 wb2Var) {
    }

    private final void f3(wb2 wb2Var) {
    }

    private final void g3(wb2 wb2Var) {
    }

    private final void i0(wb2 wb2Var) {
    }

    private final void j3(wb2 wb2Var) {
    }

    private final void k3(wb2 wb2Var) {
    }

    private final void m1(wb2 wb2Var) {
    }

    private final void o1(wb2 wb2Var) {
    }

    private final void t2(wb2 wb2Var) {
    }

    private final void u2(wb2 wb2Var) {
    }

    private final void x0(wb2 wb2Var) {
    }

    private final void y(wb2 wb2Var) {
    }

    private final void z2(wb2 wb2Var) {
    }

    @Override // jx9
    public final void B(of3 of3Var) {
    }

    @Override // jx9
    public final void p(float f2) {
    }

    private final void B1(wb2 wb2Var, int i) {
    }

    private final void C1(wb2 wb2Var, int i) {
    }

    private final void D1(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void E1(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void T2(wb2 wb2Var, long j) {
    }

    private final void U2(wb2 wb2Var, long j) {
    }

    private final void X0(wb2 wb2Var, iq0 iq0Var) {
    }

    private final void Y1(wb2 wb2Var, int i) {
    }

    private final void Z0(wb2 wb2Var, iq0 iq0Var) {
    }

    private final void Z1(wb2 wb2Var, int i) {
    }

    private final void e1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void g1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void h3(wb2 wb2Var, q38 q38Var) {
    }

    private final void i3(wb2 wb2Var, q38 q38Var) {
    }

    private final void m3(wb2 wb2Var, boolean z) {
    }

    private final void o3(wb2 wb2Var, boolean z) {
    }

    private final void q3(wb2 wb2Var, boolean z) {
    }

    private final void s(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void s3(wb2 wb2Var, boolean z) {
    }

    private final void t(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void t0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void v0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void v2(String str, String str2) {
    }

    private final void w2(String str, String str2) {
    }

    @Override // y27
    public final void f(f27 f27Var, boolean z) {
    }

    private final void F0(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    private final void F2(wb2 wb2Var, float f2, float f3) {
    }

    private final void G2(wb2 wb2Var, float f2, float f3) {
    }

    private final void H0(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    private final void L2(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void M2(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void Z2(wb2 wb2Var, float f2, float f3) {
    }

    private final void a3(wb2 wb2Var, float f2, float f3) {
    }

    private final void f2(wb2 wb2Var, float f2, float f3) {
    }

    private final void g2(wb2 wb2Var, float f2, float f3) {
    }

    private final void k(wb2 wb2Var, float f2, float f3) {
    }

    private final void n(wb2 wb2Var, float f2, float f3) {
    }

    private final void n3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void p1(wb2 wb2Var, int i, int i2) {
    }

    private final void p3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void r3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void t3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void x1(wb2 wb2Var, int i, int i2) {
    }

    private final void x2(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void y2(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void N2(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void O2(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void P2(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Q2(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void S1(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    private final void X1(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    private final void n2(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void o2(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void V2(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void W2(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void p2(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void q2(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void r2(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void s2(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void D0(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void E0(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void A3(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    private final void B3(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
