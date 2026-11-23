package v9;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.widget.ImageView;
import android.widget.TextView;
import di.u9;
import f3.c0;
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
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f2;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ph;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import vg.o;
import vg.q;
import wg.d1;
import wg.s0;
import wg.u;
import wg.z;
import wi.l;
import x2.w0;
import zi.n;
import zi.n0;
import zi.t;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        int i7;
        yi.j jVar = (yi.j) this.b;
        File file = (File) this.c;
        synchronized (jVar.m) {
            while (i7 < jVar.m.size()) {
                try {
                    File file2 = (File) jVar.m.get(i7);
                    i7 = (file != null && file.equals(file2)) ? i7 + 1 : 0;
                    if (file2.exists() && !file2.delete()) {
                        jVar.h.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jVar.m.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLObject g22;
        TLObject g23;
        SurfaceTexture surfaceTexture;
        TLRPC.Document document;
        TLRPC.Document document2;
        long j3 = 0;
        int i7 = 3;
        int i10 = 0;
        switch (this.a) {
            case 0:
                Callable callable = (Callable) this.b;
                i iVar = (i) ((nd0) this.c).b;
                try {
                    iVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    iVar.l(e10);
                    return;
                }
            case 1:
                ((vg.e) this.b).c((ArrayList) this.c);
                return;
            case 2:
                o oVar = (o) this.b;
                q qVar = (q) this.c;
                oVar.getClass();
                try {
                    EGLDisplay eGLDisplay = oVar.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = oVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar.k);
                        EGLSurface eGLSurface2 = qVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(oVar.j, eGLSurface2);
                        }
                        qVar.h = EGL14.EGL_NO_SURFACE;
                        if (oVar.g.length == 0) {
                            oVar.b();
                        }
                    }
                    qVar.b.release();
                    return;
                } finally {
                    qVar.b.release();
                }
            case 3:
                ((s0) this.b).a((ArrayList) this.c);
                return;
            case 4:
                ((u) this.b).a((TLRPC.TL_error) this.c);
                return;
            case 5:
                ((ph) this.b).a((ArrayList) this.c);
                return;
            case 6:
                tr trVar = (tr) this.b;
                w10 w10Var = (w10) this.c;
                HashMap h02 = trVar.h0();
                if (h02.isEmpty()) {
                    return;
                }
                g0.g3(new f2(w10Var, h02, 1));
                return;
            case 7:
                fc I = kc.b0((bn) this.b).I(R.raw.stars_send, gd.N0(2131744851, null), g0.W2(gd.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 8:
                ks.f(i10.t0).k(ks.X2, ((z) this.b).X1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            case 9:
                d1 d1Var = (d1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = d1Var.f2;
                arrayList.clear();
                d1Var.r2 = -1;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    mp u12 = mp.u1(d1Var.a);
                    u12.f4(tL_contacts_found.users, false);
                    u12.Z3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Peer peer = arrayList2.get(i11);
                        i11++;
                        long o4 = n5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o4)) && (g23 = u12.g2(o4)) != null) {
                            arrayList.add(g23);
                            hashSet.add(Long.valueOf(o4));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        TLRPC.Peer peer2 = arrayList3.get(i10);
                        i10++;
                        long o10 = n5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o10)) && (g22 = u12.g2(o10)) != null) {
                            arrayList.add(g22);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                }
                d1Var.m1(true, true);
                return;
            case 10:
                wh.i iVar2 = (wh.i) this.b;
                iVar2.b.add((String) this.c);
                iVar2.invalidate();
                return;
            case 11:
                wi.h hVar = (wi.h) this.b;
                wi.o oVar2 = (wi.o) this.c;
                l lVar = hVar.b;
                if (hVar.j != oVar2) {
                    return;
                }
                ImageView imageView = hVar.l;
                if (imageView != null && imageView.getVisibility() == 0) {
                    oVar2.setFirstFrameCallback(new wi.b(hVar, i7));
                }
                if (lVar.i1()) {
                    lVar.f();
                    return;
                } else {
                    if (lVar.j()) {
                        return;
                    }
                    lVar.c(lVar.n());
                    return;
                }
            case 12:
                wi.h hVar2 = (wi.h) this.b;
                w10 w10Var2 = (w10) this.c;
                hVar2.l();
                wi.o oVar3 = hVar2.j;
                hVar2.j = null;
                if (oVar3 != null) {
                    g0.E2(oVar3);
                    SurfaceTexture surfaceTexture2 = oVar3.a;
                    oVar3.a = null;
                    surfaceTexture = surfaceTexture2;
                } else {
                    surfaceTexture = null;
                }
                w10Var2.a(surfaceTexture);
                return;
            case 13:
                wi.o oVar4 = (wi.o) this.b;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.c;
                if (oVar4.a == surfaceTexture3 && oVar4.getSurfaceTexture() == null) {
                    oVar4.setSurfaceTexture(surfaceTexture3);
                    return;
                }
                return;
            case 14:
                ((h2.j) this.b).accept(this.c);
                return;
            case 15:
                ((w0) this.b).C((c0) this.c);
                return;
            case 16:
                xi.i iVar3 = (xi.i) this.b;
                xi.h hVar3 = (xi.h) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = hVar3.b.getInputStream();
                    while (true) {
                        synchronized (iVar3.a) {
                            while (!iVar3.u && iVar3.m.get(Integer.valueOf(hVar3.a)) == hVar3 && (!iVar3.t || !hVar3.e || hVar3.c == j3)) {
                                try {
                                    iVar3.a.wait();
                                } finally {
                                }
                            }
                            if (!iVar3.u && iVar3.m.get(Integer.valueOf(hVar3.a)) == hVar3) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, hVar3.c));
                                if (read < 0) {
                                    iVar3.e(hVar3, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (iVar3.a) {
                                        try {
                                            if (!iVar3.u && iVar3.m.get(Integer.valueOf(hVar3.a)) == hVar3 && iVar3.t) {
                                                hVar3.c -= read;
                                                iVar3.n(2, hVar3.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                    j3 = 0;
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                    iVar3.e(hVar3, true);
                    return;
                }
                break;
            case 17:
                xi.i iVar4 = (xi.i) this.b;
                try {
                    byte[] decode = Base64.decode(((String) this.c).substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        iVar4.m(decode);
                        return;
                    }
                    iVar4.h();
                    return;
                } catch (IllegalArgumentException e11) {
                    a8.g(e11, true);
                    iVar4.h();
                    return;
                }
            case 18:
                ((xi.i) this.b).m((byte[]) this.c);
                return;
            case 19:
                yf.c cVar = (yf.c) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList4 = tL_savedRingtones.ringtones;
                        ArrayList arrayList5 = cVar.e;
                        if (!cVar.f) {
                            cVar.f(false);
                            cVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size3 = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj = arrayList5.get(i12);
                            i12++;
                            yf.b bVar = (yf.b) obj;
                            if (bVar.b != null && (document = bVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar.b);
                            }
                        }
                        arrayList5.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList4.size());
                        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                            TLRPC.Document document3 = arrayList4.get(i13);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i13, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i13, str);
                            }
                            yf.b bVar2 = new yf.b();
                            bVar2.a = document3;
                            bVar2.b = str;
                            int i14 = cVar.d;
                            cVar.d = i14 + 1;
                            bVar2.c = i14;
                            arrayList5.add(bVar2);
                        }
                        edit.apply();
                        ks.f(cVar.c).k(ks.h5, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        yf.c.g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        yf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 20:
                yf.c cVar2 = (yf.c) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                while (i10 < arrayList6.size()) {
                    yf.b bVar3 = (yf.b) arrayList6.get(i10);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null)) {
                        w7.G(cVar2.c);
                        File I2 = w7.I(document2);
                        if (I2 == null || !I2.exists()) {
                            g0.g3(new b(21, cVar2, document2));
                        }
                    }
                    i10++;
                }
                return;
            case 21:
                yf.c cVar3 = (yf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                w7.G(cVar3.c).W(document4, document4, 0, 0);
                return;
            case 22:
                yf.e eVar = (yf.e) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i15 = eVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    ks.e().k(ks.S4, 4, gd.a0("TooLongError", null, 2131743796, new Object[0]), gd.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(mp.u1(i15).n4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    ks.e().k(ks.S4, 4, gd.a0("TooLargeError", null, 2131743797, new Object[0]), gd.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(mp.u1(i15).o4 / 1024)));
                    return;
                } else {
                    ks.e().k(ks.S4, 4, gd.a0("InvalidFormatError", null, 2131748988, new Object[0]), gd.N0(2131751091, null));
                    return;
                }
            case 23:
                ((ug.z) this.b).a((TLRPC.Chat) this.c);
                return;
            case 24:
                yi.j jVar = (yi.j) this.b;
                Throwable th2 = (Throwable) this.c;
                jVar.getClass();
                jVar.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                return;
            case 25:
                a();
                return;
            case 26:
                zh.l lVar2 = (zh.l) this.b;
                f5 f5Var = (f5) this.c;
                int i16 = lVar2.k;
                g2 g2Var = lVar2.g;
                TLRPC.TL_chatInviteImporter importer = f5Var.getImporter();
                lVar2.r = importer;
                LongSparseArray longSparseArray = lVar2.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                g2Var.getMessagesController().e4(user, false, false);
                Point point = g0.q;
                boolean z10 = point.x > point.y;
                if (user.photo == null || z10) {
                    lVar2.b = true;
                    g2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    g2Var.presentFragment(profileActivity);
                    return;
                }
                if (lVar2.s == null) {
                    zh.k kVar = new zh.k(lVar2, g2Var.getParentActivity(), (ek0) f5Var.getParent(), g2Var.getResourceProvider(), lVar2.a);
                    lVar2.s = kVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar2.r;
                    p9 avatarImageView = f5Var.getAvatarImageView();
                    TextView textView = kVar.e;
                    gg0 gg0Var = kVar.h;
                    kVar.r = tL_chatInviteImporter;
                    kVar.w = avatarImageView;
                    TLRPC.User c22 = mp.u1(i16).c2(Long.valueOf(tL_chatInviteImporter.user_id));
                    org.telegram.messenger.fc m10 = org.telegram.messenger.fc.m(i16, 0, c22);
                    org.telegram.messenger.fc m11 = org.telegram.messenger.fc.m(i16, 1, c22);
                    if (mp.u1(i16).d2(tL_chatInviteImporter.user_id) == null) {
                        mp.u1(i16).n3(c22, false, 0);
                    }
                    gg0Var.setParentAvatarImage(avatarImageView);
                    gg0Var.M(tL_chatInviteImporter.user_id, true);
                    gg0Var.H(null, m10, m11, true);
                    kVar.d.setText(n10.q((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    kVar.E.requestLayout();
                    lVar2.s.setOnDismissListener(new u9(lVar2, 15));
                    lVar2.s.show();
                    return;
                }
                return;
            case 27:
                ((zi.k) this.b).Y((n0) this.c);
                return;
            case 28:
                zi.k kVar2 = (zi.k) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                kVar2.j();
                n nVar = kVar2.w;
                if (nVar != null) {
                    long p10 = nVar.p();
                    t tVar = kVar2.v;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.y0);
                        }
                    }
                }
                kVar2.n();
                n nVar2 = kVar2.w;
                if (nVar2 != null) {
                    nVar2.u();
                    kVar2.w = null;
                }
                if (kVar2.w0 <= 0) {
                    handlerThread.quitSafely();
                    return;
                }
                kVar2.j.b("release waits for camera open results: pending=" + kVar2.w0);
                kVar2.x0 = handlerThread;
                return;
            default:
                t tVar2 = (t) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.r0 = true;
                    } catch (RuntimeException e12) {
                        tVar2.x0 = e12;
                        tVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }
}
