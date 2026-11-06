package wi;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.eb;
import bi.i5;
import hi.m2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pk;
import zh.a2;
import zh.z0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        int i7 = 4;
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                tVar.getClass();
                try {
                    try {
                        tVar.f();
                        tVar.r0 = true;
                    } catch (RuntimeException e10) {
                        tVar.w0 = e10;
                        tVar.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 1:
                qt qtVar = (qt) this.b;
                m0 m0Var = (m0) this.c;
                t0 t0Var = (t0) qtVar.b;
                t0Var.Q++;
                t0Var.y = true;
                t0Var.m.b("camera switch started: target=" + m0Var);
                n40 n40Var = (n40) t0Var.d.b;
                FrameLayout frameLayout = n40Var.x;
                n40Var.s0++;
                ValueAnimator valueAnimator = n40Var.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    n40Var.b0.cancel();
                    n40Var.b0 = null;
                }
                n40Var.n0 = true;
                n40Var.o0 = false;
                n40Var.p0 = false;
                n40Var.q0 = false;
                n40Var.r0 = SystemClock.elapsedRealtime();
                pk pkVar = n40Var.D;
                n40Var.y(false);
                Bitmap bitmap = n40Var.t0;
                if (bitmap != null) {
                    pkVar.setImageBitmap(bitmap);
                    n40Var.m0 = true;
                    pkVar.animate().cancel();
                    pkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i10 = n40Var.s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                n40Var.b0 = ofFloat;
                ofFloat.setDuration(580L);
                n40Var.b0.setInterpolator(xq.h);
                n40Var.b0.addUpdateListener(new i2(n40Var, i10, i7));
                n40Var.b0.addListener(new m2(n40Var, i10, 10));
                n40Var.b0.start();
                a8.b("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                n40Var.B();
                t0Var.o();
                return;
            case 2:
                ((h2.j) this.b).accept(this.c);
                return;
            case 3:
                ((x2.w0) this.b).y((f3.c0) this.c);
                return;
            case 4:
                yf.c cVar = (yf.c) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = cVar.e;
                        if (!cVar.f) {
                            cVar.f(false);
                            cVar.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            yf.b bVar = (yf.b) obj;
                            if (bVar.b != null && (document = bVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar.b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TLRPC.Document document3 = arrayList.get(i12);
                            String str = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i12, Utilities.f(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i12, str);
                            }
                            yf.b bVar2 = new yf.b();
                            bVar2.a = document3;
                            bVar2.b = str;
                            int i13 = cVar.d;
                            cVar.d = i13 + 1;
                            bVar2.c = i13;
                            arrayList2.add(bVar2);
                        }
                        edit.apply();
                        qs.f(cVar.c).k(qs.e5, new Object[0]);
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
            case 5:
                yf.c cVar2 = (yf.c) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    yf.b bVar3 = (yf.b) arrayList3.get(i14);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null)) {
                        w7.G(cVar2.c);
                        File I = w7.I(document2);
                        if (I == null || !I.exists()) {
                            org.telegram.messenger.g0.h3(new q(6, cVar2, document2));
                        }
                    }
                }
                return;
            case 6:
                yf.c cVar3 = (yf.c) this.b;
                TLRPC.Document document4 = (TLRPC.Document) this.c;
                w7.G(cVar3.c).X(document4, document4, 0, 0);
                return;
            case 7:
                yf.d dVar = (yf.d) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i15 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    qs.e().k(qs.P4, 4, hd.a0("TooLongError", null, 2131744042, new Object[0]), hd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(qp.s1(i15).k4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    qs.e().k(qs.P4, 4, hd.a0("TooLargeError", null, 2131744043, new Object[0]), hd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(qp.s1(i15).l4 / 1024)));
                    return;
                } else {
                    qs.e().k(qs.P4, 4, hd.a0("InvalidFormatError", null, 2131749180, new Object[0]), hd.M0(2131751104, null));
                    return;
                }
            case 8:
                ((xg.a) this.b).a((TLRPC.Chat) this.c);
                return;
            case 9:
                yh.m mVar = (yh.m) this.b;
                e5 e5Var = (e5) this.c;
                int i16 = mVar.k;
                f2 f2Var = mVar.g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                mVar.r = importer;
                LongSparseArray longSparseArray = mVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                f2Var.getMessagesController().X3(user, false, false);
                Point point = org.telegram.messenger.g0.q;
                boolean z9 = point.x > point.y;
                if (user.photo == null || z9) {
                    mVar.b = true;
                    f2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    f2Var.presentFragment(profileActivity);
                    return;
                }
                if (mVar.s == null) {
                    yh.l lVar = new yh.l(mVar, f2Var.getParentActivity(), (pj0) e5Var.getParent(), f2Var.getResourceProvider(), mVar.a);
                    mVar.s = lVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.r;
                    l9 avatarImageView = e5Var.getAvatarImageView();
                    TextView textView = lVar.e;
                    sf0 sf0Var = lVar.h;
                    lVar.r = tL_chatInviteImporter;
                    lVar.w = avatarImageView;
                    TLRPC.User a22 = qp.s1(i16).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                    hc m10 = hc.m(i16, 0, a22);
                    hc m11 = hc.m(i16, 1, a22);
                    if (qp.s1(i16).b2(tL_chatInviteImporter.user_id) == null) {
                        qp.s1(i16).g3(a22, false, 0);
                    }
                    sf0Var.setParentAvatarImage(avatarImageView);
                    sf0Var.M(tL_chatInviteImporter.user_id, true);
                    sf0Var.H(null, m10, m11, true);
                    lVar.d.setText(t10.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    lVar.D.requestLayout();
                    mVar.s.setOnDismissListener(new eb(mVar, 15));
                    mVar.s.show();
                    return;
                }
                return;
            case 10:
                zh.c cVar4 = (zh.c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                cVar4.getClass();
                onClickListener.onClick(cVar4);
                return;
            case 11:
                ((i5) this.b).k().f0((TLRPC.TL_error) this.c, false);
                return;
            case 12:
                z0 z0Var = (z0) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                z0Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                z0Var.F.setVisibility(8);
                return;
            case 13:
                up0 up0Var = (up0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                up0Var.h(tL_starGiftCollection.title, new org.telegram.ui.Wallet.t(17, up0Var, tL_starGiftCollection));
                return;
            default:
                a2 a2Var = (a2) this.b;
                org.telegram.messenger.g0.g((String) this.c);
                org.telegram.ui.Components.hc.a0(a2Var.a.a).k(false).j();
                return;
        }
    }
}
