package wg;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import di.t9;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.f2;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.y40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.qk;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:239:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLObject g22;
        TLObject g23;
        boolean z10;
        TLRPC.Document document;
        TLRPC.Document document2;
        int i7 = 4;
        int i10 = 3;
        SurfaceTexture surfaceTexture = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                tr trVar = (tr) this.b;
                x10 x10Var = (x10) this.c;
                HashMap h02 = trVar.h0();
                if (h02.isEmpty()) {
                    return;
                }
                org.telegram.messenger.g0.g3(new f2(x10Var, h02, 1));
                return;
            case 1:
                gc I = lc.b0((bn) this.b).I(R.raw.stars_send, gd.M0(2131744857, null), org.telegram.messenger.g0.W2(gd.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 2:
                ks.f(j10.t0).k(ks.X2, ((a0) this.b).X1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            case 3:
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
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Peer peer = arrayList2.get(i12);
                        i12++;
                        long o4 = n5.o(peer);
                        if (!hashSet.contains(Long.valueOf(o4)) && (g23 = u12.g2(o4)) != null) {
                            arrayList.add(g23);
                            hashSet.add(Long.valueOf(o4));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        TLRPC.Peer peer2 = arrayList3.get(i11);
                        i11++;
                        long o10 = n5.o(peer2);
                        if (!hashSet.contains(Long.valueOf(o10)) && (g22 = u12.g2(o10)) != null) {
                            arrayList.add(g22);
                            hashSet.add(Long.valueOf(o10));
                        }
                    }
                }
                d1Var.m1(true, true);
                return;
            case 4:
                wh.i iVar = (wh.i) this.b;
                iVar.b.add((String) this.c);
                iVar.invalidate();
                return;
            case 5:
                wi.h hVar = (wi.h) this.b;
                wi.o oVar = (wi.o) this.c;
                wi.l lVar = hVar.b;
                if (hVar.j != oVar) {
                    return;
                }
                ImageView imageView = hVar.l;
                if (imageView != null && imageView.getVisibility() == 0) {
                    oVar.setFirstFrameCallback(new wi.b(hVar, i10));
                }
                if (lVar.O()) {
                    lVar.f();
                    return;
                } else {
                    if (lVar.h()) {
                        return;
                    }
                    lVar.c(lVar.l());
                    return;
                }
            case 6:
                wi.h hVar2 = (wi.h) this.b;
                x10 x10Var2 = (x10) this.c;
                hVar2.l();
                wi.o oVar2 = hVar2.j;
                hVar2.j = null;
                if (oVar2 != null) {
                    org.telegram.messenger.g0.E2(oVar2);
                    SurfaceTexture surfaceTexture2 = oVar2.a;
                    oVar2.a = null;
                    surfaceTexture = surfaceTexture2;
                }
                x10Var2.a(surfaceTexture);
                return;
            case 7:
                wi.o oVar3 = (wi.o) this.b;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.c;
                if (oVar3.a == surfaceTexture3 && oVar3.getSurfaceTexture() == null) {
                    oVar3.setSurfaceTexture(surfaceTexture3);
                    return;
                }
                return;
            case 8:
                ((h2.j) this.b).accept(this.c);
                return;
            case 9:
                ((x2.w0) this.b).C((f3.b0) this.c);
                return;
            case 10:
                xi.i iVar2 = (xi.i) this.b;
                xi.h hVar3 = (xi.h) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = hVar3.b.getInputStream();
                    while (true) {
                        synchronized (iVar2.a) {
                            while (!iVar2.u && iVar2.m.get(Integer.valueOf(hVar3.a)) == hVar3 && (!iVar2.t || !hVar3.e || hVar3.c == 0)) {
                                try {
                                    iVar2.a.wait();
                                } finally {
                                }
                            }
                            if (!iVar2.u && iVar2.m.get(Integer.valueOf(hVar3.a)) == hVar3) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, hVar3.c));
                                if (read < 0) {
                                    z10 = true;
                                    try {
                                        iVar2.e(hVar3, true);
                                        return;
                                    } catch (Exception unused) {
                                        iVar2.e(hVar3, z10);
                                        return;
                                    }
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (iVar2.a) {
                                        try {
                                            if (!iVar2.u && iVar2.m.get(Integer.valueOf(hVar3.a)) == hVar3 && iVar2.t) {
                                                hVar3.c -= read;
                                                iVar2.n(2, hVar3.a, bArr2);
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
            case 11:
                xi.i iVar3 = (xi.i) this.b;
                try {
                    byte[] decode = Base64.decode(((String) this.c).substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        iVar3.m(decode);
                        return;
                    }
                    iVar3.h();
                    return;
                } catch (IllegalArgumentException e10) {
                    a8.g(e10, true);
                    iVar3.h();
                    return;
                }
            case 12:
                ((xi.i) this.b).m((byte[]) this.c);
                return;
            case 13:
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
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj = arrayList5.get(i13);
                            i13++;
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
                        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                            TLRPC.Document document3 = arrayList4.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            yf.b bVar2 = new yf.b();
                            bVar2.a = document3;
                            bVar2.b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            bVar2.c = i15;
                            arrayList5.add(bVar2);
                        }
                        edit.apply();
                        ks.f(cVar.c).k(ks.h5, new Object[0]);
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
            case 14:
                yf.c cVar2 = (yf.c) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                while (i11 < arrayList6.size()) {
                    yf.b bVar3 = (yf.b) arrayList6.get(i11);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null)) {
                        w7.G(cVar2.c);
                        File I2 = w7.I(document2);
                        if (I2 == null || !I2.exists()) {
                            org.telegram.messenger.g0.g3(new r(15, cVar2, document2));
                            i11++;
                        }
                    }
                    i11++;
                }
                return;
            case 15:
                yf.c cVar3 = (yf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                w7.G(cVar3.c).W(document4, document4, 0, 0);
                return;
            case 16:
                yf.e eVar = (yf.e) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i16 = eVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    ks.e().k(ks.S4, 4, gd.a0("TooLongError", null, 2131743806, new Object[0]), gd.a0("ErrorRingtoneDurationTooLong", null, 2131751093, Integer.valueOf(mp.u1(i16).n4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    ks.e().k(ks.S4, 4, gd.a0("TooLargeError", null, 2131743807, new Object[0]), gd.a0("ErrorRingtoneSizeTooBig", null, 2131751091, Integer.valueOf(mp.u1(i16).o4 / 1024)));
                    return;
                } else {
                    ks.e().k(ks.S4, 4, gd.a0("InvalidFormatError", null, 2131748989, new Object[0]), gd.M0(2131751092, null));
                    return;
                }
            case 17:
                ((ug.z) this.b).a((TLRPC.Chat) this.c);
                return;
            case 18:
                yi.j jVar = (yi.j) this.b;
                Throwable th2 = (Throwable) this.c;
                jVar.getClass();
                jVar.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                return;
            case 19:
                a();
                return;
            case 20:
                zh.l lVar2 = (zh.l) this.b;
                g5 g5Var = (g5) this.c;
                int i17 = lVar2.k;
                h2 h2Var = lVar2.g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                lVar2.r = importer;
                LongSparseArray longSparseArray = lVar2.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                h2Var.getMessagesController().e4(user, false, false);
                Point point = org.telegram.messenger.g0.q;
                boolean z11 = point.x > point.y;
                if (user.photo == null || z11) {
                    lVar2.b = true;
                    h2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    h2Var.presentFragment(profileActivity);
                    return;
                }
                if (lVar2.s == null) {
                    zh.k kVar = new zh.k(lVar2, h2Var.getParentActivity(), (ck0) g5Var.getParent(), h2Var.getResourceProvider(), lVar2.a);
                    lVar2.s = kVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar2.r;
                    q9 avatarImageView = g5Var.getAvatarImageView();
                    TextView textView = kVar.e;
                    fg0 fg0Var = kVar.h;
                    kVar.r = tL_chatInviteImporter;
                    kVar.w = avatarImageView;
                    TLRPC.User c22 = mp.u1(i17).c2(Long.valueOf(tL_chatInviteImporter.user_id));
                    fc m10 = fc.m(i17, 0, c22);
                    fc m11 = fc.m(i17, 1, c22);
                    if (mp.u1(i17).d2(tL_chatInviteImporter.user_id) == null) {
                        mp.u1(i17).n3(c22, false, 0);
                    }
                    fg0Var.setParentAvatarImage(avatarImageView);
                    fg0Var.M(tL_chatInviteImporter.user_id, true);
                    fg0Var.H(null, m10, m11, true);
                    kVar.d.setText(o10.q((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    kVar.E.requestLayout();
                    lVar2.s.setOnDismissListener(new t9(lVar2, 15));
                    lVar2.s.show();
                    return;
                }
                return;
            case 21:
                ((zi.k) this.b).Y((zi.n0) this.c);
                return;
            case 22:
                zi.k kVar2 = (zi.k) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                kVar2.j();
                zi.n nVar = kVar2.w;
                if (nVar != null) {
                    long p10 = nVar.p();
                    zi.t tVar = kVar2.v;
                    if (tVar != null && p10 != Long.MAX_VALUE) {
                        tVar.q = Math.max(0L, p10) * 1000;
                        Handler handler = tVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(tVar.y0);
                        }
                    }
                }
                kVar2.n();
                zi.n nVar2 = kVar2.w;
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
            case 23:
                zi.t tVar2 = (zi.t) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f();
                        tVar2.r0 = true;
                    } catch (RuntimeException e11) {
                        tVar2.x0 = e11;
                        tVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                zi.k0 k0Var = (zi.k0) this.b;
                zi.n0 n0Var = (zi.n0) this.c;
                zi.u0 u0Var = (zi.u0) k0Var.a;
                u0Var.R++;
                u0Var.y = true;
                u0Var.m.b("camera switch started: target=" + n0Var);
                y40 y40Var = (y40) u0Var.d.b;
                FrameLayout frameLayout = y40Var.x;
                y40Var.u0++;
                ValueAnimator valueAnimator = y40Var.d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    y40Var.d0.cancel();
                    y40Var.d0 = null;
                }
                y40Var.p0 = true;
                y40Var.q0 = false;
                y40Var.r0 = false;
                y40Var.s0 = false;
                y40Var.t0 = SystemClock.elapsedRealtime();
                qk qkVar = y40Var.E;
                y40Var.A(false);
                Bitmap bitmap = y40Var.v0;
                if (bitmap != null) {
                    qkVar.setImageBitmap(bitmap);
                    y40Var.o0 = true;
                    qkVar.animate().cancel();
                    qkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i18 = y40Var.u0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                y40Var.d0 = ofFloat;
                ofFloat.setDuration(580L);
                y40Var.d0.setInterpolator(lr.h);
                y40Var.d0.addUpdateListener(new k2(y40Var, i18, i7));
                y40Var.d0.addListener(new ki.f2(y40Var, i18, 10));
                y40Var.d0.start();
                a8.b("RoundVideo camera flip started: facing=" + n0Var + ", minimumDurationMs=580");
                y40Var.D();
                u0Var.o();
                return;
        }
    }
}
