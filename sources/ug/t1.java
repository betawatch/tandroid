package ug;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.widget.ImageView;
import android.widget.TextView;
import di.q9;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Callable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1(int i7, Object obj, Object obj2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLObject e22;
        TLObject e23;
        SurfaceTexture surfaceTexture;
        boolean z10;
        TLRPC.Document document;
        TLRPC.Document document2;
        int i7 = 3;
        int i10 = 0;
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                w1Var.e = (File) this.c;
                w1Var.a();
                return;
            case 1:
                v9.a aVar = (v9.a) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 2:
                Callable callable = (Callable) this.b;
                v9.h hVar = (v9.h) ((cf) this.c).a;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.l(e10);
                    return;
                }
            case 3:
                ((vg.e) this.b).c((ArrayList) this.c);
                return;
            case 4:
                vg.p pVar = (vg.p) this.b;
                vg.r rVar = (vg.r) this.c;
                pVar.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar.j;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar.k);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar.j, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar.g.length == 0) {
                            pVar.b();
                        }
                    }
                    rVar.b.release();
                    return;
                } finally {
                    rVar.b.release();
                }
            case 5:
                ((wg.r0) this.b).a((ArrayList) this.c);
                return;
            case 6:
                ((wg.t) this.b).a((TLRPC.TL_error) this.c);
                return;
            case 7:
                vr vrVar = (vr) this.b;
                z10 z10Var = (z10) this.c;
                HashMap h02 = vrVar.h0();
                if (h02.isEmpty()) {
                    return;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.w1(z10Var, h02, 1));
                return;
            case 8:
                ((gh) this.b).a((ArrayList) this.c);
                return;
            case 9:
                xb I = cc.a0((an) this.b).I(R.raw.stars_send, hd.M0(2131745092, null), org.telegram.messenger.g0.X2(hd.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 10:
                ns.f(m10.t0).k(ns.V2, ((wg.y) this.b).X1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            case 11:
                wg.c1 c1Var = (wg.c1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = c1Var.g2;
                arrayList.clear();
                c1Var.t2 = -1;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    np s12 = np.s1(c1Var.a);
                    s12.Y3(tL_contacts_found.users, false);
                    s12.S3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Peer peer = arrayList2.get(i11);
                        i11++;
                        long o4 = m5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o4)) && (e23 = s12.e2(o4)) != null) {
                            arrayList.add(e23);
                            hashSet.add(Long.valueOf(o4));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        TLRPC.Peer peer2 = arrayList3.get(i10);
                        i10++;
                        long o10 = m5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o10)) && (e22 = s12.e2(o10)) != null) {
                            arrayList.add(e22);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                }
                c1Var.p1(true, true);
                return;
            case 12:
                wh.i iVar = (wh.i) this.b;
                iVar.b.add((String) this.c);
                iVar.invalidate();
                return;
            case 13:
                wi.h hVar2 = (wi.h) this.b;
                wi.o oVar = (wi.o) this.c;
                wi.l lVar = hVar2.b;
                if (hVar2.j != oVar) {
                    return;
                }
                ImageView imageView = hVar2.l;
                if (imageView != null && imageView.getVisibility() == 0) {
                    oVar.setFirstFrameCallback(new wi.b(hVar2, i7));
                }
                if (lVar.P()) {
                    lVar.f();
                    return;
                } else {
                    if (lVar.h()) {
                        return;
                    }
                    lVar.c(lVar.l());
                    return;
                }
            case 14:
                wi.h hVar3 = (wi.h) this.b;
                z10 z10Var2 = (z10) this.c;
                hVar3.l();
                wi.o oVar2 = hVar3.j;
                hVar3.j = null;
                if (oVar2 != null) {
                    org.telegram.messenger.g0.E2(oVar2);
                    SurfaceTexture surfaceTexture2 = oVar2.a;
                    oVar2.a = null;
                    surfaceTexture = surfaceTexture2;
                } else {
                    surfaceTexture = null;
                }
                z10Var2.a(surfaceTexture);
                return;
            case 15:
                wi.o oVar3 = (wi.o) this.b;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.c;
                if (oVar3.a == surfaceTexture3 && oVar3.getSurfaceTexture() == null) {
                    oVar3.setSurfaceTexture(surfaceTexture3);
                    return;
                }
                return;
            case 16:
                ((h2.j) this.b).accept(this.c);
                return;
            case 17:
                ((x2.v0) this.b).C((f3.b0) this.c);
                return;
            case 18:
                xi.i iVar2 = (xi.i) this.b;
                xi.h hVar4 = (xi.h) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = hVar4.b.getInputStream();
                    while (true) {
                        synchronized (iVar2.a) {
                            while (!iVar2.u && iVar2.m.get(Integer.valueOf(hVar4.a)) == hVar4 && (!iVar2.t || !hVar4.e || hVar4.c == 0)) {
                                try {
                                    iVar2.a.wait();
                                } finally {
                                }
                            }
                            if (!iVar2.u && iVar2.m.get(Integer.valueOf(hVar4.a)) == hVar4) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, hVar4.c));
                                if (read < 0) {
                                    z10 = true;
                                    try {
                                        iVar2.e(hVar4, true);
                                        return;
                                    } catch (Exception unused) {
                                        iVar2.e(hVar4, z10);
                                        return;
                                    }
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (iVar2.a) {
                                        try {
                                            if (!iVar2.u && iVar2.m.get(Integer.valueOf(hVar4.a)) == hVar4 && iVar2.t) {
                                                hVar4.c -= read;
                                                iVar2.n(2, hVar4.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception unused2) {
                    z10 = true;
                }
                break;
            case 19:
                xi.i iVar3 = (xi.i) this.b;
                try {
                    byte[] decode = Base64.decode(((String) this.c).substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        iVar3.m(decode);
                        return;
                    }
                    iVar3.h();
                    return;
                } catch (IllegalArgumentException e11) {
                    a8.g(e11, true);
                    iVar3.h();
                    return;
                }
            case 20:
                ((xi.i) this.b).m((byte[]) this.c);
                return;
            case 21:
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
                        ns.f(cVar.c).k(ns.e5, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        yf.c.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        yf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 22:
                yf.c cVar2 = (yf.c) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                while (i10 < arrayList6.size()) {
                    yf.b bVar3 = (yf.b) arrayList6.get(i10);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null)) {
                        w7.G(cVar2.c);
                        File I2 = w7.I(document2);
                        if (I2 == null || !I2.exists()) {
                            org.telegram.messenger.g0.h3(new t1(23, cVar2, document2));
                        }
                    }
                    i10++;
                }
                return;
            case 23:
                yf.c cVar3 = (yf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                w7.G(cVar3.c).W(document4, document4, 0, 0);
                return;
            case 24:
                yf.d dVar = (yf.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i15 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    ns.e().k(ns.P4, 4, hd.a0("TooLongError", null, 2131744041, new Object[0]), hd.a0("ErrorRingtoneDurationTooLong", null, 2131751104, Integer.valueOf(np.s1(i15).l4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    ns.e().k(ns.P4, 4, hd.a0("TooLargeError", null, 2131744042, new Object[0]), hd.a0("ErrorRingtoneSizeTooBig", null, 2131751102, Integer.valueOf(np.s1(i15).m4 / 1024)));
                    return;
                } else {
                    ns.e().k(ns.P4, 4, hd.a0("InvalidFormatError", null, 2131749181, new Object[0]), hd.M0(2131751103, null));
                    return;
                }
            case 25:
                ((p1) this.b).a((TLRPC.Chat) this.c);
                return;
            case 26:
                yi.j jVar = (yi.j) this.b;
                Throwable th2 = (Throwable) this.c;
                jVar.getClass();
                jVar.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                return;
            case 27:
                a();
                return;
            case 28:
                zh.l lVar2 = (zh.l) this.b;
                e5 e5Var = (e5) this.c;
                int i16 = lVar2.k;
                e2 e2Var = lVar2.g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                lVar2.r = importer;
                LongSparseArray longSparseArray = lVar2.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                e2Var.getMessagesController().X3(user, false, false);
                Point point = org.telegram.messenger.g0.q;
                boolean z11 = point.x > point.y;
                if (user.photo == null || z11) {
                    lVar2.b = true;
                    e2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    e2Var.presentFragment(profileActivity);
                    return;
                }
                if (lVar2.s == null) {
                    zh.k kVar = new zh.k(lVar2, e2Var.getParentActivity(), (uj0) e5Var.getParent(), e2Var.getResourceProvider(), lVar2.a);
                    lVar2.s = kVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar2.r;
                    i9 avatarImageView = e5Var.getAvatarImageView();
                    TextView textView = kVar.e;
                    vf0 vf0Var = kVar.h;
                    kVar.r = tL_chatInviteImporter;
                    kVar.w = avatarImageView;
                    TLRPC.User a22 = np.s1(i16).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                    gc m10 = gc.m(i16, 0, a22);
                    gc m11 = gc.m(i16, 1, a22);
                    if (np.s1(i16).b2(tL_chatInviteImporter.user_id) == null) {
                        np.s1(i16).g3(a22, false, 0);
                    }
                    vf0Var.setParentAvatarImage(avatarImageView);
                    vf0Var.M(tL_chatInviteImporter.user_id, true);
                    vf0Var.H(null, m10, m11, true);
                    kVar.d.setText(q10.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    kVar.E.requestLayout();
                    lVar2.s.setOnDismissListener(new q9(lVar2, 15));
                    lVar2.s.show();
                    return;
                }
                return;
            default:
                ((zi.l) this.b).Y((zi.n0) this.c);
                return;
        }
    }
}
