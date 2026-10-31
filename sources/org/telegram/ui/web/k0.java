package org.telegram.ui.web;

import ag.a3;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import mg.i2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.o20;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cn0;
import org.telegram.ui.gc1;
import org.telegram.ui.j21;
import org.telegram.ui.mb;
import org.telegram.ui.um0;
import ph.f2;
import ph.p3;
import ph.q3;
import rh.e3;
import rh.e4;
import rh.h5;
import rh.o2;
import th.o7;
import th.u2;
import th.y2;
import th.z2;
import vh.c6;
import vh.e6;
import vh.g6;
import vh.j6;
import vh.k6;
import vh.r6;
import vh.u6;
import vh.w6;
import vh.y6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements org.telegram.ui.ActionBar.u1, o2, o20, hk0, CameraView.CameraViewDelegate, r2.v, t5.b, qa.a, gc1, s5.e, j21, zg.f, e6, c3.r, e2.j, androidx.car.app.utils.c, OnCompleteListener, Continuation, ik0, r9.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        String valueOf;
        String str = (String) this.b;
        k2.k0 k0Var = (k2.k0) this.c;
        Context context = (Context) dVar.b(Context.class);
        switch (k0Var.a) {
            case 6:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 7:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 8:
                int i10 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        } else {
                            valueOf = "auto";
                            break;
                        }
                    } else {
                        valueOf = "watch";
                        break;
                    }
                } else {
                    valueOf = "tv";
                    break;
                }
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new za.a(str, valueOf);
    }

    @Override // vh.e6
    public void a(u6 u6Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, vh.d1 d1Var, vh.d0 d0Var) {
        switch (this.a) {
            case 18:
                z2 z2Var = (z2) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = vp.r1(z2Var.l2).i1(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = u6Var.b;
                ConnectionsManager.getInstance(z2Var.l2).sendRequest(tL_stories_editStory, new mb(z2Var, d1Var, storyItem, u6Var, 17));
                break;
            default:
                u2 u2Var = (u2) this.b;
                w6 w6Var = (w6) this.c;
                z2 z2Var2 = u2Var.x;
                y2 y2Var = z2Var2.x1;
                TL_stories.StoryItem storyItem2 = y2Var.a;
                if ((storyItem2 != null && storyItem2.pinned) != z12) {
                    vp.r1(z2Var2.l2).O1().r0(z2Var2.k1, z2Var2.e1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = y2Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(z2Var2.l2).sendRequest(togglegroupcallsettings, new h5(2, u2Var, w6Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.b;
        ((u2.k0) obj).r(aVar.b, (u2.g0) aVar.c, (u2.c0) this.c);
    }

    @Override // s5.e
    public Object apply(Object obj) {
        s5.g gVar = (s5.g) this.b;
        l5.i iVar = (l5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.c) {
                int size = aVar.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j11 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                j2.f c10 = bVar.c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.b(fVar.a, fVar.b);
                }
                listIterator.set(new s5.b(j11, bVar.b, c10.f()));
            }
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String, org.telegram.ui.ActionBar.u1] */
    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r42;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i11 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 6:
                q3 q3Var = (q3) obj2;
                p3 p3Var = (p3) obj;
                a51 G = q3Var.a2.G(i10 - 1);
                if (G != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                        boolean z10 = G.r;
                        if (!TextUtils.isEmpty(starGift.gift_address) && q3Var.Z1) {
                            alertDialog$Builder = new AlertDialog$Builder(0, q3Var.getContext(), q3Var.I0);
                            r42 = 0;
                            String L0 = cd.L0(2131749801, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            x1Var.T = cd.L0(2131749802, null);
                        } else if (!z10 || !(starGift instanceof TL_stars.TL_starGiftUnique)) {
                            if (!z10) {
                                ArrayList arrayList2 = p3Var.b.l;
                                int size = arrayList2.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 < size) {
                                        Object obj4 = arrayList2.get(i12);
                                        i12++;
                                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj4;
                                        if (savedStarGift2.gift == starGift) {
                                            savedStarGift = savedStarGift2;
                                        }
                                    } else {
                                        savedStarGift = null;
                                    }
                                }
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(q3Var.a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(q3Var.getContext());
                                    r42 = 0;
                                    String L02 = cd.L0(2131749764, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                                    x1Var2.R = L02;
                                    x1Var2.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749765, cd.x(savedStarGift.can_craft_at, true)));
                                }
                            }
                            q3Var.X1.a(starGift);
                            q3Var.dismiss();
                            break;
                        } else {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                            org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, q3Var.getContext(), null);
                            x1Var3.r(400L);
                            long e = d20.i(q3Var.a).e();
                            sf.b bVar = tL_starGiftUnique.resale_ton_only ? sf.b.b : sf.b.a;
                            rh.e6.x(q3Var.a, bVar).H(tL_starGiftUnique, e, null, true, new um0(q3Var, x1Var3, bVar, tL_starGiftUnique, e));
                            break;
                        }
                        i0.a.w(r42, 2131747847, alertDialog$Builder, r42);
                        break;
                    }
                }
                break;
            default:
                r6 r6Var = (r6) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = r6Var.L;
                a0.h hVar = r6Var.b;
                k6 k6Var = r6Var.y;
                ArrayList arrayList4 = r6Var.c;
                HashMap hashMap = r6Var.d;
                w6 w6Var = r6Var.W;
                p2 p2Var = w6Var.c;
                if (i10 >= 0 && i10 < arrayList3.size()) {
                    g6 g6Var = (g6) arrayList3.get(i10);
                    int i13 = g6Var.a;
                    if (i13 != 3) {
                        int i14 = 7;
                        if (i13 != 7) {
                            if (i13 == 9) {
                                int i15 = g6Var.q;
                                if (i15 != 0) {
                                    if (i15 != 1) {
                                        if (i15 != 5) {
                                            if (i15 == 6) {
                                                w6Var.x1 = false;
                                                r6Var.h(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = r6Var.getContext();
                                            int i16 = w6.U1;
                                            org.telegram.ui.ActionBar.x1 x1Var4 = new org.telegram.ui.ActionBar.x1(3, context2, w6Var.I0);
                                            x1Var4.r(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = w6Var.j1;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            ConnectionsManager.getInstance(w6Var.a).sendRequest(getgroupcallstreamrtmpurl, new ag.p0(r6Var, x1Var4, getgroupcallstreamrtmpurl, 24));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = w6Var.j1;
                                        long n10 = inputPeer2 != null ? o5.n(inputPeer2) : d20.i(w6Var.a).e();
                                        z60 F = z60.F(r6Var, w6Var.I0, view);
                                        F.c(R.drawable.msg_addfolder, cd.L0(2131744803, null), new bi.e(r6Var, n10, 28), false);
                                        F.k();
                                        z60.f(F, vp.r1(w6Var.a).O1().B(n10, true), w6Var.r1, false, null, new e3(i14, r6Var, F));
                                        F.Z();
                                        break;
                                    }
                                } else {
                                    y6 y6Var = w6Var.T1;
                                    if (y6Var != null) {
                                        y6Var.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof p8) {
                            p8 p8Var = (p8) view;
                            p8Var.setChecked(!p8Var.d());
                            g6Var.k = p8Var.d();
                            int i17 = g6Var.c;
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    if (i17 == 2) {
                                        w6Var.s1 = p8Var.d();
                                        r6Var.h(true);
                                        break;
                                    }
                                } else {
                                    boolean d = p8Var.d();
                                    w6Var.u1 = d;
                                    boolean z11 = w6Var.j1 instanceof TLRPC.TL_inputPeerChannel;
                                    if (d) {
                                        wb G2 = new cc(p2Var, w6Var.I0).G(R.raw.msg_story_keep, 4, cd.L0(z11 ? 2131744725 : 2131744690, null));
                                        G2.j = 5000;
                                        G2.k(true);
                                    } else {
                                        wb G3 = new cc(p2Var, w6Var.I0).G(R.raw.fire_on, 4, cd.L0(z11 ? 2131744726 : 2131744703, null));
                                        G3.j = 5000;
                                        G3.k(true);
                                    }
                                    r6Var.h(true);
                                    break;
                                }
                            } else {
                                boolean d10 = p8Var.d();
                                w6Var.t1 = d10;
                                r10 = w6Var.E1 == 4 ? 1 : 0;
                                if (!d10) {
                                    wb G4 = new cc(p2Var, w6Var.I0).G(R.raw.passcode_lock_close, 4, cd.L0(r10 != 0 ? 2131744701 : 2131744702, null));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                } else {
                                    wb G5 = new cc(p2Var, w6Var.I0).G(R.raw.ic_save_to_gallery, 4, cd.L0(r10 != 0 ? 2131744688 : 2131744689, null));
                                    G5.j = 5000;
                                    G5.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!g6Var.n || !w6Var.w1) {
                        int i18 = g6Var.i;
                        if (i18 != 1) {
                            if (i18 != 3) {
                                if (i18 != 2) {
                                    if (i18 != 4) {
                                        if (i18 > 0) {
                                            arrayList4.clear();
                                            hashMap.clear();
                                            w6Var.E1 = g6Var.i;
                                            k6Var.d.a();
                                        } else {
                                            TLRPC.Chat chat = g6Var.h;
                                            if (chat != null) {
                                                long j10 = chat.id;
                                                if (w6.K0(w6Var, chat) > 200) {
                                                    try {
                                                        r6Var.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, r6Var.getContext(), w6Var.I0);
                                                    String L03 = cd.L0(2131749403, null);
                                                    org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder2.a;
                                                    x1Var5.R = L03;
                                                    x1Var5.T = cd.L0(2131749402, null);
                                                    i0.a.w(null, 2131747847, alertDialog$Builder2, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                                    ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                                    if (arrayList5 != null) {
                                                        int size2 = arrayList5.size();
                                                        while (r10 < size2) {
                                                            Object obj5 = arrayList5.get(r10);
                                                            r10++;
                                                            hVar.k(Boolean.FALSE, ((Long) obj5).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j10));
                                                    r6Var.j(true);
                                                } else {
                                                    TLRPC.Chat L04 = vp.r1(w6Var.a).L0(Long.valueOf(j10));
                                                    TLRPC.ChatFull M0 = vp.r1(w6Var.a).M0(j10);
                                                    if (M0 == null || (chatParticipants = M0.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || M0.participants.participants.size() < M0.participants_count - 1) {
                                                        org.telegram.ui.ActionBar.x1 x1Var6 = r6Var.G;
                                                        if (x1Var6 != null) {
                                                            x1Var6.dismiss();
                                                            r6Var.G = null;
                                                        }
                                                        r6Var.H = j10;
                                                        org.telegram.ui.ActionBar.x1 x1Var7 = new org.telegram.ui.ActionBar.x1(3, r6Var.getContext(), w6Var.I0);
                                                        r6Var.G = x1Var7;
                                                        x1Var7.r(50L);
                                                        hs a02 = hs.a0(w6Var.a);
                                                        a02.a.c(new a3(r6Var, L04, a02, j10));
                                                    } else {
                                                        r6Var.e(j10, M0.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(r6Var.I)) {
                                                        k6Var.setText("");
                                                        r6Var.I = null;
                                                        r6Var.h(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = g6Var.g;
                                                if (user != null) {
                                                    if (r6Var.a == 0) {
                                                        w6Var.E1 = 0;
                                                    }
                                                    long j11 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList4);
                                                    if (arrayList4.contains(Long.valueOf(j11))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j11))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j11));
                                                        hVar.k(Boolean.FALSE, j11);
                                                    } else {
                                                        Iterator it2 = hashMap.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j11))) {
                                                                it2.remove();
                                                                hashSet.addAll((Collection) entry2.getValue());
                                                            }
                                                        }
                                                        hashSet.add(Long.valueOf(j11));
                                                        if (!TextUtils.isEmpty(r6Var.I)) {
                                                            k6Var.setText("");
                                                            r6Var.I = null;
                                                            r6Var.h(false);
                                                        }
                                                        hVar.k(Boolean.TRUE, j11);
                                                    }
                                                    arrayList4.clear();
                                                    arrayList4.addAll(hashSet);
                                                    r6Var.j(true);
                                                }
                                            }
                                        }
                                        r6Var.g(true);
                                        r6Var.f(true);
                                        k6Var.L = true;
                                        break;
                                    } else {
                                        if (w6Var.E1 == 4) {
                                            w6Var.D1 = 4;
                                            w6Var.i1.E(1);
                                        }
                                        w6Var.E1 = 4;
                                        r6Var.g(true);
                                        break;
                                    }
                                } else {
                                    if (w6Var.E1 == 2) {
                                        w6Var.D1 = 2;
                                        w6Var.i1.E(1);
                                    }
                                    w6Var.E1 = 2;
                                    r6Var.g(true);
                                    break;
                                }
                            } else {
                                if (w6Var.E1 == 3 || (w6Var.o1.isEmpty() && w6Var.p1.isEmpty())) {
                                    w6Var.D1 = 3;
                                    w6Var.i1.E(1);
                                }
                                w6Var.E1 = 3;
                                r6Var.g(true);
                                break;
                            }
                        } else {
                            if (w6Var.E1 == 1 || w6.J0(w6Var).isEmpty()) {
                                w6Var.D1 = 1;
                                w6Var.i1.E(1);
                            }
                            w6Var.E1 = 1;
                            r6Var.g(true);
                            break;
                        }
                    } else {
                        new c6(context, w6Var.a, w6Var.B1, w6Var.j1, new j6(r6Var, r10), w6Var.I0).show();
                        break;
                    }
                }
                break;
        }
    }

    @Override // rh.o2
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        f2 f2Var = (f2) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        vq0 vq0Var = f2Var.a;
        f2Var.e.l.remove(savedStarGift);
        f2Var.f(true);
        int i10 = f2Var.b;
        if (j10 == d20.i(i10).e()) {
            cc a02 = cc.a0(vq0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String L0 = cd.L0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            wb O = a02.O(document, L0, cd.a0(null, null, 2131752888, i0.a.k(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            wb O2 = cc.a0(vq0Var.a).O(tL_starGiftUnique.getDocument(), cd.L0(2131752885, null), cd.a0(null, null, 2131752886, o5.s(i10, j10)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.x0.c(true);
        }
    }

    @Override // androidx.car.app.utils.c
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // r2.v
    public int d(Object obj) {
        Context context = (Context) this.b;
        b2.x xVar = (b2.x) this.c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.b;
        return ((str.equals(xVar.s) || str.equals(r2.w.c(xVar))) && oVar.c(context, xVar, false) && oVar.d(xVar)) ? 1 : 0;
    }

    @Override // c3.r
    public c3.o[] e(Uri uri, Map map) {
        u2.q qVar = (u2.q) this.b;
        b2.x xVar = (b2.x) this.c;
        return new c3.o[]{qVar.c.F(xVar) ? new z3.h(qVar.c.m(xVar), null) : new k3.a(xVar)};
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        return xh.z2.D0((xh.z2) this.b, (Context) this.c, view, i10);
    }

    @Override // t5.b
    public Object g() {
        switch (this.a) {
            case 10:
                ea.d dVar = (ea.d) this.b;
                Iterable iterable = (Iterable) this.c;
                s5.g gVar = (s5.g) ((s5.d) dVar.c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                ea.d dVar2 = (ea.d) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((s5.g) ((s5.c) dVar2.i)).e(((Integer) entry.getValue()).intValue(), o5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 1:
                gf.f.q((Context) this.b, Uri.parse((String) this.c), true, false, false, null, null, false, true, false);
                break;
            case 2:
                ph.m mVar = (ph.m) this.b;
                ih.b bVar = (ih.b) this.c;
                try {
                    int parseInt = Integer.parseInt(bVar.getText().toString().trim());
                    mVar.g1(parseInt);
                    mVar.U1.setValue(parseInt);
                    x1Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.i0.E3(bVar);
                    f8.g(th2, true);
                    return;
                }
            case 3:
                ph.t1 t1Var = (ph.t1) this.b;
                q20 q20Var = (q20) this.c;
                String obj = t1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    q20Var.a(obj);
                    x1Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.i0.E3(t1Var);
                    break;
                }
                break;
            case 14:
                e4 e4Var = (e4) this.b;
                i2 i2Var = (i2) this.c;
                gf.e h = x1Var.h(i10, true, true);
                h.d();
                int i11 = e4Var.a;
                rh.z1 z1Var = new rh.z1(e4Var, h, i2Var, 1);
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i11);
                x10.m0(new org.telegram.ui.Wallet.x0(i11, z1Var, x10));
                break;
            case 20:
                u2 u2Var = (u2) this.b;
                th.s0 s0Var = ((o7) this.c).A0;
                if (s0Var == null) {
                    z2.d0(u2Var.x);
                    break;
                } else if (!s0Var.x) {
                    TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                    discardgroupcall.call = s0Var.f;
                    ConnectionsManager.getInstance(s0Var.e).sendRequest(discardgroupcall, new th.l0(s0Var, 4));
                    s0Var.e();
                    break;
                }
                break;
            default:
                xh.z2.A0((xh.z2) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // qa.a
    public void i(qa.b bVar) {
        qa.a aVar = (qa.a) this.b;
        qa.a aVar2 = (qa.a) this.c;
        aVar.i(bVar);
        aVar2.i(bVar);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        ph.i2 i2Var = (ph.i2) this.b;
        vh.d dVar = (vh.d) this.c;
        View view = (View) obj2;
        long j10 = ((TL_stars.SavedStarGift) ((a51) obj).G).gift.id;
        if (i2Var.i1 == j10) {
            i2Var.i1 = 0L;
        } else {
            i2Var.i1 = j10;
        }
        dVar.setEnabled(i2Var.i1 != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof cn0) {
                    cn0 cn0Var = (cn0) childAt;
                    cn0Var.b(i2Var.i1 == cn0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // zg.f
    public void l(RectF rectF, View view) {
        vg.f fVar = (vg.f) this.b;
        WeakReference weakReference = (WeakReference) this.c;
        fVar.i(rectF.left, rectF.top);
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // org.telegram.ui.gc1
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((rh.i) this.b).t0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        qh.y yVar = (qh.y) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (yVar.V || yVar.h0 || yVar.l0) {
            return;
        }
        yVar.h0 = true;
        yVar.g0.postDelayed(yVar.y0, 150L);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((xa.f) this.b).a((Intent) this.c);
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        xa.g gVar = (xa.g) this.b;
        String str = (String) this.c;
        synchronized (gVar) {
            ((a0.f) gVar.b).remove(str);
        }
        return task;
    }

    private final /* synthetic */ void j(View view, float f7, float f10) {
    }

    private final /* synthetic */ void n(View view, float f7, float f10) {
    }
}
