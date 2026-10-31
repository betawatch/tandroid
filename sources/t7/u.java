package t7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.x;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.firebase.components.ComponentRegistrar;
import ig.i1;
import ig.s1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ab;
import org.telegram.messenger.c20;
import org.telegram.messenger.cb;
import org.telegram.messenger.da;
import org.telegram.messenger.ea;
import org.telegram.messenger.gj;
import org.telegram.messenger.ha;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
import org.telegram.messenger.ua;
import org.telegram.messenger.va;
import org.telegram.messenger.wa;
import org.telegram.messenger.xa;
import org.telegram.messenger.ya;
import org.telegram.messenger.za;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.o5;
import org.telegram.ui.qs0;
import v7.t7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class u implements s0, wg.a, i5.e, r9.e, r9.d, s1, IMapsProvider, l1, n5.b, r4.c, u5.a, uf.a, v2.m, vf.a, y9.c, z3.k {
    public static u b;
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(q1 q1Var, jj jjVar) {
        return false;
    }

    @Override // v2.m
    public long C() {
        throw new NoSuchElementException();
    }

    public Signature[] D(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // wg.a
    public int E() {
        switch (this.a) {
            case 3:
                return 352321535;
            default:
                return 0;
        }
    }

    @Override // androidx.lifecycle.s0
    public p0 E0(Class cls, v1.b bVar) {
        return d(cls);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // z3.k
    public boolean F(x xVar) {
        String str = xVar.s;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qs0 H1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I0(long j10) {
        return false;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        switch (this.a) {
            case 6:
                return new jb.h();
            case 7:
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
                    s.c(new o());
                }
                return new hb.a(0);
            default:
                return new mb.a();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K1(long j10) {
        return false;
    }

    @Override // vf.a
    public void L(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(i0.a.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
        float f7 = remaining;
        float f10 = f7 / f7;
        float f11 = ceil;
        float f12 = f11 / f11;
        while (remaining > 0 && ceil > 0) {
            if (f10 >= f12) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f10 = remaining / f7;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                ceil--;
                f12 = ceil / f11;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // wg.a
    public /* synthetic */ float N() {
        switch (this.a) {
        }
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(jj jjVar) {
        return f1.a(jjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // wg.a
    public /* synthetic */ float X() {
        switch (this.a) {
        }
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // i5.e
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override // r9.e
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (r9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new r9.a(str, aVar.b, aVar.c, aVar.d, aVar.e, new ag.m(11, str, aVar), aVar.g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // wg.a
    public /* synthetic */ float b0() {
        switch (this.a) {
        }
        return 0.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(int i10) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 d(Class cls) {
        return new m0(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // y9.c
    public String e() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int f0(q1 q1Var) {
        return 0;
    }

    @Override // u5.a
    public long g() {
        return System.currentTimeMillis();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ l9 g2() {
        return null;
    }

    @Override // zc.a
    public Object get() {
        u uVar = new u(21);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(i5.d.a, new r5.c(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(i5.d.c, new r5.c(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.d.b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(i5.d.b, new r5.c(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < i5.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new r5.b(uVar, hashMap);
    }

    @Override // org.telegram.messenger.IMapsProvider
    public int getInstallMapsString() {
        return 2131749205;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        return null;
    }

    @Override // wg.a
    public /* synthetic */ int h0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i0() {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public void initializeMaps(Context context) {
        synchronized (h8.a.class) {
            h8.a.b(context);
        }
    }

    @Override // wg.a
    public int j0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean j1() {
        return false;
    }

    @Override // v2.m
    public long k() {
        throw new NoSuchElementException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean k1(q1 q1Var, int i10) {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ya loadRawResourceStyle(Context context, int i10) {
        InputStream openRawResource = context.getResources().openRawResource(i10);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        u6.b.a(openRawResource);
                        u6.b.a(byteArrayOutputStream);
                        j8.d dVar = new j8.d(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                        ha haVar = new ha();
                        haVar.a = dVar;
                        return haVar;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    u6.b.a(openRawResource);
                    u6.b.a(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (IOException e) {
            throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + e.toString());
        }
    }

    @Override // z3.k
    public z3.m m(x xVar) {
        String str = xVar.s;
        List list = xVar.v;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new b4.i(list);
                case "application/pgs":
                    return new xa.n(2);
                case "application/x-mp4-vtt":
                    return new k6.h(27);
                case "text/vtt":
                    return new n4.q(23);
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
        throw new IllegalArgumentException(sc.e.h("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m0(o5 o5Var) {
        return false;
    }

    @Override // wg.a
    public int n0() {
        switch (this.a) {
            case 3:
                return 1711276032;
            default:
                return 0;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ua newCameraUpdateLatLng(cb cbVar) {
        LatLng latLng = new LatLng(cbVar.a, cbVar.b);
        try {
            i8.a aVar = t7.a;
            n6.l.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            s7.b.b(P0, latLng);
            Parcel O0 = aVar.O0(P0, 8);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new da(new za.c(M0));
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ua newCameraUpdateLatLngBounds(wa waVar, int i10) {
        LatLngBounds latLngBounds = ((ea) waVar).a;
        try {
            i8.a aVar = t7.a;
            n6.l.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            s7.b.b(P0, latLngBounds);
            P0.writeInt(i10);
            Parcel O0 = aVar.O0(P0, 10);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new da(new za.c(M0));
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ua newCameraUpdateLatLngZoom(cb cbVar, float f7) {
        LatLng latLng = new LatLng(cbVar.a, cbVar.b);
        try {
            i8.a aVar = t7.a;
            n6.l.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            s7.b.b(P0, latLng);
            P0.writeFloat(f7);
            Parcel O0 = aVar.O0(P0, 9);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new da(new za.c(M0));
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // v2.m
    public boolean next() {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public va onCreateCircleOptions() {
        k2.m0 m0Var = new k2.m0();
        j8.b bVar = new j8.b();
        bVar.a = null;
        bVar.b = 0.0d;
        bVar.c = 10.0f;
        bVar.d = -16777216;
        bVar.e = 0;
        bVar.f = 0.0f;
        bVar.h = true;
        bVar.n = false;
        bVar.r = null;
        m0Var.a = bVar;
        return m0Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public xa onCreateLatLngBoundsBuilder() {
        m2.t tVar = new m2.t(5);
        i1 i1Var = new i1(1);
        i1Var.b = Double.POSITIVE_INFINITY;
        i1Var.c = Double.NEGATIVE_INFINITY;
        i1Var.d = Double.NaN;
        i1Var.e = Double.NaN;
        tVar.b = i1Var;
        return tVar;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public za onCreateMapView(Context context) {
        bh.d dVar = new bh.d();
        dVar.a = new fg.i(dVar, context);
        return dVar;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ab onCreateMarkerOptions() {
        l2.f fVar = new l2.f(10, false);
        j8.f fVar2 = new j8.f();
        fVar2.e = 0.5f;
        fVar2.f = 1.0f;
        fVar2.n = true;
        fVar2.r = false;
        fVar2.s = 0.0f;
        fVar2.w = 0.5f;
        fVar2.x = 0.0f;
        fVar2.y = 1.0f;
        fVar.b = fVar2;
        return fVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // uf.a
    public int t1(int i10, int i11, int i12) {
        return (i11 == 6 ? uf.a.u : i11 > i12 ? uf.a.p : i11 < i12 ? uf.a.q : uf.a.t).t1(i10, i11, i12);
    }

    @Override // wg.a
    public int u() {
        switch (this.a) {
            case 3:
                return 872415231;
            default:
                return 0;
        }
    }

    @Override // uf.a
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        (i10 == 6 ? uf.a.u : i10 > i11 ? uf.a.p : i10 < i11 ? uf.a.q : uf.a.t).u0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override // wg.a
    public /* synthetic */ int w() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(jj jjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // z3.k
    public int y(x xVar) {
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
        throw new IllegalArgumentException(sc.e.h("Unsupported MIME type: ", str));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(q1 q1Var) {
        return null;
    }

    public u() {
        this.a = 8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // ig.s1
    public void B() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
    }

    @Override // y9.c
    public void a() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // r4.c
    public void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(q1 q1Var, c20 c20Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(q1 q1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1(q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // r4.c
    public void r(int i10, Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void l1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
