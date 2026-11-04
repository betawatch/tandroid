package xh;

import ai.s;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.widget.TextView;
import ci.ba;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.o3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.ProfileActivity;
import z9.m;
import z9.p;
import z9.r;
import z9.x;
import zh.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        switch (this.a) {
            case 0:
                j jVar = (j) this.c;
                jVar.b.add((String) this.b);
                jVar.invalidate();
                return;
            case 1:
                ((m) this.c).d((String) this.b, Boolean.FALSE);
                return;
            case 2:
                p pVar = (p) this.c;
                String str = (String) this.b;
                o3 o3Var = pVar.f.d;
                o3Var.getClass();
                String b10 = ba.e.b(1024, str);
                synchronized (((AtomicMarkableReference) o3Var.g)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) o3Var.g).getReference();
                        if (b10 == null ? str2 == null : b10.equals(str2)) {
                            return;
                        }
                        ((AtomicMarkableReference) o3Var.g).set(b10, true);
                        ((aa.g) o3Var.b).b.a(new s(o3Var, 14));
                        return;
                    } finally {
                    }
                }
            case 3:
                p pVar2 = (p) this.c;
                Throwable th2 = (Throwable) this.b;
                Map map = Collections.EMPTY_MAP;
                m mVar = pVar2.f;
                Thread currentThread = Thread.currentThread();
                mVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                r rVar = mVar.n;
                if (rVar == null || !rVar.e.get()) {
                    long j10 = currentTimeMillis / 1000;
                    String g7 = mVar.g();
                    if (g7 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    ba.c cVar = new ba.c(g7, j10, map);
                    x xVar = mVar.m;
                    xVar.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(g7);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    xVar.g(th2, currentThread, "error", cVar, false);
                    return;
                }
                return;
            case 4:
                ((za.h) this.c).a((Intent) this.b);
                return;
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
                he0 he0Var = FirebaseMessaging.m;
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 6:
                za.m mVar2 = (za.m) this.c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.b;
                try {
                    taskCompletionSource2.setResult(mVar2.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 7:
                zf.c cVar2 = (zf.c) this.c;
                TLObject tLObject = (TLObject) this.b;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar2.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = cVar2.e;
                        if (!cVar2.f) {
                            cVar2.f(false);
                            cVar2.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            zf.b bVar = (zf.b) obj;
                            if (bVar.b != null && (document = bVar.a) != null) {
                                hashMap.put(Long.valueOf(document.id), bVar.b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = cVar2.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TLRPC.Document document3 = arrayList.get(i10);
                            String str3 = (String) hashMap.get(Long.valueOf(document3.id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i10, Utilities.f(serializedData.toByteArray()));
                            if (str3 != null) {
                                edit.putString("tone_local_path" + i10, str3);
                            }
                            zf.b bVar2 = new zf.b();
                            bVar2.a = document3;
                            bVar2.b = str3;
                            int i11 = cVar2.d;
                            cVar2.d = i11 + 1;
                            bVar2.c = i11;
                            arrayList2.add(bVar2);
                        }
                        edit.apply();
                        hs.f(cVar2.c).k(hs.e5, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar2.d().edit();
                        long j11 = tL_savedRingtones.hash;
                        zf.c.g = j11;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j11);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        zf.c.h = currentTimeMillis2;
                        putLong.putLong("lastReload", currentTimeMillis2).apply();
                    }
                    cVar2.b();
                    return;
                }
                return;
            case 8:
                zf.c cVar3 = (zf.c) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    zf.b bVar3 = (zf.b) arrayList3.get(i12);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.b) || !new File(bVar3.b).exists()) && (document2 = bVar3.a) != null)) {
                        w7.G(cVar3.c);
                        File I = w7.I(document2);
                        if (I == null || !I.exists()) {
                            g0.h3(new i(9, cVar3, document2));
                        }
                    }
                }
                return;
            case 9:
                zf.c cVar4 = (zf.c) this.c;
                TLRPC.Document document4 = (TLRPC.Document) this.b;
                w7.G(cVar4.c).X(document4, document4, 0, 0);
                return;
            case 10:
                zf.d dVar = (zf.d) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                int i13 = dVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    hs.e().k(hs.P4, 4, bd.a0("TooLongError", null, 2131744051, new Object[0]), bd.a0("ErrorRingtoneDurationTooLong", null, 2131751105, Integer.valueOf(hp.s1(i13).k4)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    hs.e().k(hs.P4, 4, bd.a0("TooLargeError", null, 2131744052, new Object[0]), bd.a0("ErrorRingtoneSizeTooBig", null, 2131751103, Integer.valueOf(hp.s1(i13).l4 / 1024)));
                    return;
                } else {
                    hs.e().k(hs.P4, 4, bd.a0("InvalidFormatError", null, 2131749189, new Object[0]), bd.M0(2131751104, null));
                    return;
                }
            case 11:
                ((xg.d) this.c).a((TLRPC.Chat) this.b);
                return;
            default:
                k kVar = (k) this.c;
                e5 e5Var = (e5) this.b;
                int i14 = kVar.k;
                d2 d2Var = kVar.g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                kVar.r = importer;
                LongSparseArray longSparseArray = kVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                d2Var.getMessagesController().X3(user, false, false);
                Point point = g0.q;
                boolean z10 = point.x > point.y;
                if (user.photo == null || z10) {
                    kVar.b = true;
                    d2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    d2Var.presentFragment(profileActivity);
                    return;
                }
                if (kVar.s == null) {
                    zh.j jVar2 = new zh.j(kVar, d2Var.getParentActivity(), (tj0) e5Var.getParent(), d2Var.getResourceProvider(), kVar.a);
                    kVar.s = jVar2;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.r;
                    k9 avatarImageView = e5Var.getAvatarImageView();
                    TextView textView = jVar2.e;
                    vf0 vf0Var = jVar2.h;
                    jVar2.r = tL_chatInviteImporter;
                    jVar2.w = avatarImageView;
                    TLRPC.User a22 = hp.s1(i14).a2(Long.valueOf(tL_chatInviteImporter.user_id));
                    ac m10 = ac.m(i14, 0, a22);
                    ac m11 = ac.m(i14, 1, a22);
                    if (hp.s1(i14).b2(tL_chatInviteImporter.user_id) == null) {
                        hp.s1(i14).g3(a22, false, 0);
                    }
                    vf0Var.setParentAvatarImage(avatarImageView);
                    vf0Var.M(tL_chatInviteImporter.user_id, true);
                    vf0Var.H(null, m10, m11, true);
                    jVar2.d.setText(l10.p((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    jVar2.E.requestLayout();
                    kVar.s.setOnDismissListener(new ba(kVar, 15));
                    kVar.s.show();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ i(p pVar, Throwable th2) {
        this.a = 3;
        Map map = Collections.EMPTY_MAP;
        this.c = pVar;
        this.b = th2;
    }
}
