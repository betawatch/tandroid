package u9;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import f3.c0;
import hi.m2;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y1;
import org.telegram.ui.Components.z70;
import org.telegram.ui.an;
import org.telegram.ui.pk;
import ug.g0;
import ug.h0;
import ug.i0;
import ug.t1;
import v4.b0;
import wg.a0;
import wg.f1;
import wg.t0;
import wg.v;
import wi.m0;
import wi.t;
import x2.w0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        ui.i iVar = (ui.i) this.b;
        ui.h hVar = (ui.h) this.c;
        byte[] bArr = new byte[65536];
        try {
            InputStream inputStream = hVar.b.getInputStream();
            while (true) {
                synchronized (iVar.a) {
                    while (!iVar.u && iVar.m.get(Integer.valueOf(hVar.a)) == hVar && (!iVar.t || !hVar.e || hVar.c == 0)) {
                        try {
                            iVar.a.wait();
                        } finally {
                        }
                    }
                    if (iVar.u || iVar.m.get(Integer.valueOf(hVar.a)) != hVar) {
                        break;
                    }
                    int read = inputStream.read(bArr, 0, (int) Math.min(65536L, hVar.c));
                    if (read < 0) {
                        iVar.e(hVar, true);
                        return;
                    }
                    if (read != 0) {
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        synchronized (iVar.a) {
                            try {
                                if (iVar.u || iVar.m.get(Integer.valueOf(hVar.a)) != hVar || !iVar.t) {
                                    break;
                                }
                                hVar.c -= read;
                                iVar.n(2, hVar.a, bArr2);
                            } finally {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            iVar.e(hVar, true);
        }
    }

    private final void b() {
        int i7;
        vi.h hVar = (vi.h) this.b;
        File file = (File) this.c;
        synchronized (hVar.m) {
            while (i7 < hVar.m.size()) {
                try {
                    File file2 = (File) hVar.m.get(i7);
                    i7 = (file != null && file.equals(file2)) ? i7 + 1 : 0;
                    if (file2.exists() && !file2.delete()) {
                        hVar.h.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hVar.m.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        TLObject e22;
        TLObject e23;
        TLRPC.Document document;
        int i10 = 4;
        int i11 = 0;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                ua.b bVar = (ua.b) this.c;
                synchronized (oVar) {
                    try {
                        if (oVar.b == null) {
                            oVar.a.add(bVar);
                        } else {
                            oVar.b.add(bVar.get());
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                l9 l9Var = (l9) this.b;
                View view = (View) this.c;
                ue.a aVar = (ue.a) l9Var.d;
                if ((2 & l9Var.a) != 0) {
                    if (!aVar.c1(view, l9Var.b, l9Var.c)) {
                        l9Var.a = 8 | l9Var.a;
                        return;
                    }
                    l9Var.a &= -3;
                    l9Var.e = null;
                    view.performHapticFeedback(0);
                    l9Var.a = (l9Var.a | 4) & (-11);
                    l9Var.e = null;
                    return;
                }
                return;
            case 2:
                i0 i0Var = (i0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = i0Var.a2;
                pj0 pj0Var = i0Var.k1;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i0Var.A2 = false;
                    i0Var.B2.b(i0Var.f2 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= pj0Var.getChildCount()) {
                            i7 = 0;
                        } else if (pj0Var.getChildAt(i12) instanceof h0) {
                            i7 = pj0Var.getChildAt(i12).getTop();
                        } else {
                            i12++;
                        }
                    }
                    i0Var.G1();
                    if (i0Var.d2 >= 0 && i7 != 0) {
                        ((b0) pj0Var.getLayoutManager()).h1(i0Var.d2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList.size(), i0Var.E2.b);
                i0Var.p2.i(max, false);
                i0Var.p2.setBagePosition(max / i0Var.E2.c);
                g0 g0Var = i0Var.p2;
                g0Var.H = true;
                g0Var.requestLayout();
                return;
            case 3:
                ((i0) this.b).h1((z70) this.c, true);
                return;
            case 4:
                t1 t1Var = (t1) this.b;
                TLRPC.Document document2 = (TLRPC.Document) this.c;
                w7.G(t1Var.s);
                org.telegram.messenger.g0.h3(new f(5, t1Var, w7.I(document2)));
                return;
            case 5:
                t1 t1Var2 = (t1) this.b;
                t1Var2.e = (File) this.c;
                t1Var2.a();
                return;
            case 6:
                a();
                return;
            case 7:
                ui.i iVar = (ui.i) this.b;
                try {
                    byte[] decode = Base64.decode(((String) this.c).substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        iVar.m(decode);
                        return;
                    }
                    iVar.h();
                    return;
                } catch (IllegalArgumentException e10) {
                    a8.g(e10, true);
                    iVar.h();
                    return;
                }
            case 8:
                ((ui.i) this.b).m((byte[]) this.c);
                return;
            case 9:
                v9.a aVar2 = (v9.a) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 10:
                Callable callable = (Callable) this.b;
                v9.h hVar = (v9.h) ((rt) this.c).b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e11) {
                    hVar.l(e11);
                    return;
                }
            case 11:
                ((vg.e) this.b).c((ArrayList) this.c);
                return;
            case 12:
                vg.o oVar2 = (vg.o) this.b;
                vg.q qVar = (vg.q) this.c;
                oVar2.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar2.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar2.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar2.k);
                        EGLSurface eGLSurface2 = qVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar2.j, eGLSurface2);
                        }
                        qVar.h = EGL14.EGL_NO_SURFACE;
                        if (oVar2.g.length == 0) {
                            oVar2.b();
                        }
                    }
                    qVar.b.release();
                    return;
                } catch (Throwable th2) {
                    qVar.b.release();
                    throw th2;
                }
            case 13:
                vi.h hVar2 = (vi.h) this.b;
                Throwable th3 = (Throwable) this.c;
                hVar2.getClass();
                hVar2.g(th3 instanceof Exception ? (Exception) th3 : new RuntimeException(th3));
                return;
            case 14:
                b();
                return;
            case 15:
                ((t0) this.b).a((ArrayList) this.c);
                return;
            case 16:
                ((v) this.b).a((TLRPC.TL_error) this.c);
                return;
            case 17:
                yr yrVar = (yr) this.b;
                c20 c20Var = (c20) this.c;
                HashMap h02 = yrVar.h0();
                if (h02.isEmpty()) {
                    return;
                }
                org.telegram.messenger.g0.h3(new y1(c20Var, h02, 1));
                return;
            case 18:
                ((fx) this.b).a((ArrayList) this.c);
                return;
            case 19:
                cc I = hc.a0((an) this.b).I(R.raw.stars_send, id.M0(2131745095, null), org.telegram.messenger.g0.X2(id.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 20:
                qs.f(p10.s0).k(qs.V2, ((a0) this.b).T1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            case 21:
                f1 f1Var = (f1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = f1Var.c2;
                arrayList2.clear();
                f1Var.p2 = -1;
                if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                    qp s12 = qp.s1(f1Var.a);
                    s12.Y3(tL_contacts_found.users, false);
                    s12.S3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.my_results;
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.Peer peer = arrayList3.get(i13);
                        i13++;
                        long o4 = m5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o4)) && (e23 = s12.e2(o4)) != null) {
                            arrayList2.add(e23);
                            hashSet.add(Long.valueOf(o4));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList4 = tL_contacts_found.results;
                    int size2 = arrayList4.size();
                    while (i11 < size2) {
                        TLRPC.Peer peer2 = arrayList4.get(i11);
                        i11++;
                        long o10 = m5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o10)) && (e22 = s12.e2(o10)) != null) {
                            arrayList2.add(e22);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                }
                f1Var.p1(true, true);
                return;
            case 22:
                wh.i iVar2 = (wh.i) this.b;
                iVar2.b.add((String) this.c);
                iVar2.invalidate();
                return;
            case 23:
                ((wi.k) this.b).Z((m0) this.c);
                return;
            case 24:
                wi.k kVar = (wi.k) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                kVar.j();
                wi.n nVar = kVar.x;
                if (nVar != null) {
                    long p10 = nVar.p();
                    t tVar = kVar.w;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.y0);
                        }
                    }
                }
                kVar.o();
                wi.n nVar2 = kVar.x;
                if (nVar2 != null) {
                    nVar2.u();
                    kVar.x = null;
                }
                if (kVar.x0 <= 0) {
                    handlerThread.quitSafely();
                    return;
                }
                kVar.j.b("release waits for camera open results: pending=" + kVar.x0);
                kVar.y0 = handlerThread;
                return;
            case 25:
                t tVar2 = (t) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.r0 = true;
                    } finally {
                        countDownLatch.countDown();
                    }
                } catch (RuntimeException e12) {
                    tVar2.x0 = e12;
                    tVar2.i();
                }
                return;
            case 26:
                rt rtVar = (rt) this.b;
                m0 m0Var = (m0) this.c;
                wi.t0 t0Var = (wi.t0) rtVar.b;
                t0Var.R++;
                t0Var.y = true;
                t0Var.m.b("camera switch started: target=" + m0Var);
                n40 n40Var = (n40) t0Var.d.b;
                FrameLayout frameLayout = n40Var.x;
                n40Var.t0++;
                ValueAnimator valueAnimator = n40Var.c0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    n40Var.c0.cancel();
                    n40Var.c0 = null;
                }
                n40Var.o0 = true;
                n40Var.p0 = false;
                n40Var.q0 = false;
                n40Var.r0 = false;
                n40Var.s0 = SystemClock.elapsedRealtime();
                pk pkVar = n40Var.D;
                n40Var.A(false);
                Bitmap bitmap = n40Var.u0;
                if (bitmap != null) {
                    pkVar.setImageBitmap(bitmap);
                    n40Var.n0 = true;
                    pkVar.animate().cancel();
                    pkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i14 = n40Var.t0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                n40Var.c0 = ofFloat;
                ofFloat.setDuration(580L);
                n40Var.c0.setInterpolator(xq.h);
                n40Var.c0.addUpdateListener(new i2(n40Var, i14, i10));
                n40Var.c0.addListener(new m2(n40Var, i14, 10));
                n40Var.c0.start();
                a8.b("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                n40Var.D();
                t0Var.o();
                return;
            case 27:
                ((h2.j) this.b).accept(this.c);
                return;
            case 28:
                ((w0) this.b).y((c0) this.c);
                return;
            default:
                yf.d dVar = (yf.d) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    if (tLObject3 instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject3 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject3;
                        ArrayList<TLRPC.Document> arrayList5 = tL_savedRingtones.ringtones;
                        ArrayList arrayList6 = dVar.e;
                        if (!dVar.f) {
                            dVar.f(false);
                            dVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size3 = arrayList6.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj = arrayList6.get(i15);
                            i15++;
                            yf.c cVar = (yf.c) obj;
                            if (cVar.b != null && (document = cVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), cVar.b);
                            }
                        }
                        arrayList6.clear();
                        SharedPreferences d = dVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList5.size());
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            TLRPC.Document document3 = arrayList5.get(i16);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i16, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i16, str);
                            }
                            yf.c cVar2 = new yf.c();
                            cVar2.a = document3;
                            cVar2.b = str;
                            int i17 = dVar.d;
                            dVar.d = i17 + 1;
                            cVar2.c = i17;
                            arrayList6.add(cVar2);
                        }
                        edit.apply();
                        qs.f(dVar.c).k(qs.e5, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        yf.d.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        yf.d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    return;
                }
                return;
        }
    }
}
