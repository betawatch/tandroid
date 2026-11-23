package pb;

import a8.r7;
import ai.h0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import c8.e1;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.c0;
import hi.u0;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.aa;
import org.telegram.messenger.ab;
import org.telegram.messenger.ba;
import org.telegram.messenger.cj;
import org.telegram.messenger.ea;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.messenger.sa;
import org.telegram.messenger.ta;
import org.telegram.messenger.ua;
import org.telegram.messenger.va;
import org.telegram.messenger.wa;
import org.telegram.messenger.xa;
import org.telegram.messenger.ya;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import org.xml.sax.Attributes;
import s2.u;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b implements a4.h, c4.k, eg.a, f3.g, fg.a, ia.d, pm0, com.google.android.gms.common.api.internal.q, u9.d, q5.b, IMapsProvider, gh.a, m1, s0, OnFailureListener, u, u4.c, x5.a {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    public static ia.b u0(w7.s sVar) {
        return new ia.b(System.currentTimeMillis() + 3600000, new b7.l(8), new ia.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static bg.o w0(Editable editable, int i7) {
        bg.o[] oVarArr = (bg.o[]) editable.getSpans(0, editable.length(), bg.o.class);
        if (oVarArr.length == 0) {
            return null;
        }
        for (int length = oVarArr.length; length > 0; length--) {
            int i10 = length - 1;
            if (editable.getSpanFlags(oVarArr[i10]) == 17) {
                bg.o oVar = oVarArr[i10];
                if (oVar.a == i7) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public static boolean y0(boolean z10, String str, Editable editable, Attributes attributes) {
        int i7;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a10 = bg.n.a("data-document-id", attributes);
                if (a10 != null) {
                    editable.setSpan(new x5(Long.parseLong(a10), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), x5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i10 = length - 1;
                        if (editable.getSpanFlags(spans[i10]) == 17) {
                            obj = spans[i10];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (x5) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        if (str.equals("spoiler")) {
            if (z10) {
                editable.setSpan(new bg.o(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object w02 = w0(editable, 0);
            if (w02 != null) {
                int spanStart2 = editable.getSpanStart(w02);
                editable.removeSpan(w02);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(w02, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String a11 = bg.n.a("language", attributes);
                if (a11 == null) {
                    a11 = bg.n.a("lang", attributes);
                }
                if (a11 == null) {
                    a11 = bg.n.a("lng", attributes);
                }
                editable.setSpan(new bg.o(a11), editable.length(), editable.length(), 17);
                return true;
            }
            Object w03 = w0(editable, 1);
            if (w03 != null) {
                int spanStart3 = editable.getSpanStart(w03);
                editable.removeSpan(w03);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(w03, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new bg.o(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object w04 = w0(editable, 3);
                if (w04 != null) {
                    int spanStart4 = editable.getSpanStart(w04);
                    editable.removeSpan(w04);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(w04, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String a12 = bg.n.a("class", attributes);
            if (bg.n.a("data-collapsed", attributes) != null || (a12 != null && a12.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new bg.o(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        bg.o[] oVarArr = (bg.o[]) editable.getSpans(0, editable.length(), bg.o.class);
        for (int length2 = oVarArr.length - 1; length2 >= 0; length2--) {
            bg.o oVar = oVarArr[length2];
            if (editable.getSpanFlags(oVar) == 17 && ((i7 = oVar.a) == 2 || i7 == 3)) {
                obj = oVar;
                break;
            }
        }
        if (obj != null) {
            int spanStart5 = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            if (spanStart5 != editable.length()) {
                editable.setSpan(obj, spanStart5, editable.length(), 33);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // gh.a
    public /* synthetic */ float A1() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ g2 B() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ j9 B2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String D(long j3) {
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

    @Override // u4.c
    public void E(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // eg.a
    public void E0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        (i7 == 6 ? eg.a.p : i7 > i10 ? eg.a.l : i7 < i10 ? eg.a.m : eg.a.o).E0(shortBuffer, i7, shortBuffer2, i10);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean F0(fj fjVar) {
        return true;
    }

    @Override // c4.k
    public boolean G(e2.u uVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // c4.k
    public int I(e2.u uVar) {
        return 1;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // eg.a
    public int M1(int i7, int i10, int i11) {
        return (i10 == 6 ? eg.a.p : i10 > i11 ? eg.a.l : i10 < i11 ? eg.a.m : eg.a.o).M1(i7, i10, i11);
    }

    @Override // a4.h
    public c0 N() {
        return new f3.t(-9223372036854775807L);
    }

    @Override // gh.a
    public int Q0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override // gh.a
    public /* synthetic */ float T0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    @Override // s2.u
    public b3.r U() {
        return new s2.t(s2.q.n, null);
    }

    @Override // gh.a
    public /* synthetic */ float V0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // gh.a
    public int X1() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z(r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ long a() {
        return 0L;
    }

    @Override // a4.h
    public long a0(f3.p pVar) {
        return -1L;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        m7.d dVar = (m7.d) ((m7.e) obj).n();
        e7.b bVar = new e7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i7 = m7.c.a;
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

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean b0() {
        return false;
    }

    @Override // u9.d
    public Object c(r7 r7Var) {
        a aVar = new a();
        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(9);
        ReferenceQueue referenceQueue = aVar.a;
        Set set = aVar.b;
        set.add(new m(aVar, referenceQueue, set, oVar));
        Thread thread = new Thread(new l(0, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean c1(r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int e0() {
        return 0;
    }

    @Override // c4.k
    public c4.m f(e2.u uVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // fg.a
    public void f0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 > i10) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(i5.c.i(i11, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i11;
        int ceil = ((int) Math.ceil((i10 / i7) * remaining)) - remaining;
        float f10 = remaining;
        float f11 = f10 / f10;
        float f12 = ceil;
        float f13 = f12 / f12;
        while (remaining > 0 && ceil > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f11 = remaining / f10;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                }
                ceil--;
                f13 = ceil / f12;
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // ia.d
    public ia.b g(w7.s sVar, JSONObject jSONObject) {
        return u0(sVar);
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ boolean g0(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean g1(fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 16:
                return new o5.q(Executors.newSingleThreadExecutor());
            default:
                qb.a aVar = new qb.a(28);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(l5.d.a, new u5.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(l5.d.c, new u5.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(u5.c.b)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(l5.d.b, new u5.b(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < l5.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new u5.a(aVar, hashMap);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public int getInstallMapsString() {
        return 2131749003;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a h0() {
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

    @Override // org.telegram.messenger.IMapsProvider
    public void initializeMaps(Context context) {
        synchronized (k8.a.class) {
            k8.a.a(context);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j0(r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String k(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean k0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public wa loadRawResourceStyle(Context context, int i7) {
        InputStream openRawResource = context.getResources().openRawResource(i7);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        x6.b.a(openRawResource);
                        x6.b.a(byteArrayOutputStream);
                        m8.e eVar = new m8.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                        ea eaVar = new ea();
                        eaVar.a = eVar;
                        return eaVar;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    x6.b.a(openRawResource);
                    x6.b.a(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            throw new Resources.NotFoundException("Failed to read resource " + i7 + ": " + e10.toString());
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean n0() {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public sa newCameraUpdateLatLng(ab abVar) {
        LatLng latLng = new LatLng(abVar.a, abVar.b);
        try {
            l8.a aVar = e1.a;
            q6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            Parcel o12 = aVar.o1(p12, 8);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new aa(new h6.o(m12));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public sa newCameraUpdateLatLngBounds(ua uaVar, int i7) {
        LatLngBounds latLngBounds = ((ba) uaVar).a;
        try {
            l8.a aVar = e1.a;
            q6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLngBounds);
            p12.writeInt(i7);
            Parcel o12 = aVar.o1(p12, 10);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new aa(new h6.o(m12));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public sa newCameraUpdateLatLngZoom(ab abVar, float f10) {
        LatLng latLng = new LatLng(abVar.a, abVar.b);
        try {
            l8.a aVar = e1.a;
            q6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            p12.writeFloat(f10);
            Parcel o12 = aVar.o1(p12, 9);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new aa(new h6.o(m12));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // x5.a
    public long o() {
        return SystemClock.elapsedRealtime();
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ta onCreateCircleOptions() {
        h6.o oVar = new h6.o(25, false);
        m8.b bVar = new m8.b();
        bVar.a = null;
        bVar.b = 0.0d;
        bVar.c = 10.0f;
        bVar.d = -16777216;
        bVar.e = 0;
        bVar.f = 0.0f;
        bVar.h = true;
        bVar.n = false;
        bVar.r = null;
        oVar.b = bVar;
        return oVar;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public va onCreateLatLngBoundsBuilder() {
        u0 u0Var = new u0(27);
        m8.d dVar = new m8.d(0);
        dVar.b = Double.POSITIVE_INFINITY;
        dVar.c = Double.NEGATIVE_INFINITY;
        dVar.d = Double.NaN;
        dVar.e = Double.NaN;
        u0Var.b = dVar;
        return u0Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public xa onCreateMapView(Context context) {
        r7 r7Var = new r7(13, (byte) 0);
        r7Var.b = new h0(r7Var, context);
        return r7Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ya onCreateMarkerOptions() {
        j6.r rVar = new j6.r(21);
        m8.g gVar = new m8.g();
        gVar.e = 0.5f;
        gVar.f = 1.0f;
        gVar.n = true;
        gVar.r = false;
        gVar.s = 0.0f;
        gVar.w = 0.5f;
        gVar.x = 0.0f;
        gVar.y = 1.0f;
        rVar.b = gVar;
        return rVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int p0(r1 r1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean r0() {
        return false;
    }

    @Override // u4.c
    public void u() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v0(x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // gh.a
    public int x2() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y2(int i7) {
        return false;
    }

    @Override // s2.u
    public b3.r z(s2.q qVar, s2.n nVar) {
        return new s2.t(qVar, nVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean z1(r1 r1Var, int i7) {
        return false;
    }

    public /* synthetic */ b(m7.a aVar) {
        this.a = 14;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.pm0
    public void finish() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void G0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void H(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void M(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O(cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void Q(long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void S(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void d0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void f1(r1 r1Var) {
    }

    @Override // f3.g
    public long h(long j3) {
        return j3;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void l(v0 v0Var) {
    }

    @Override // a4.h
    public void l0(long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m0(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void r(v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t0(String str) {
    }

    @Override // org.telegram.ui.Components.pm0
    public void v(float f10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void w(v0 v0Var) {
    }

    @Override // org.telegram.ui.Components.pm0
    public void y(u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(r1 r1Var, p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void V(v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void b2(r1 r1Var, h10 h10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void j(v0 v0Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p1(r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A2(r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void K(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void T(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void n(v0 v0Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.s0
    public /* synthetic */ void s0(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
