// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.d0;
import org.telegram.ui.e0;
import org.telegram.utils.twidget.w;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yw9 implements fd, is6, QuickAckDelegate, bf7, s69, ot2, t69, vh8, yu8, u69, sgb, OnSuccessListener, m0d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yw9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bf7
    public final void A(boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                eja ejaVar = (eja) obj2;
                e eVar = ejaVar.y1;
                eVar.finishFragment();
                eVar.getNotificationCenter().n((fn7) eVar, 4);
                eVar.getNotificationCenter().k(4, new Object[0]);
                eVar.getNotificationCenter().k(jn7.K2, Long.valueOf(ejaVar.m1), (TLRPC.User) obj, null, Boolean.valueOf(z));
                eVar.getMessagesController().b5(false);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                tzb tzbVar = ((dzb) obj2).b;
                tzbVar.getNotificationCenter().n(tzbVar, 4);
                tzbVar.getNotificationCenter().k(4, new Object[0]);
                tzbVar.finishFragment();
                tzbVar.getNotificationCenter().k(jn7.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z));
                break;
        }
    }

    @Override // s69
    public final boolean C(View view) {
        byte b = this.a;
        return false;
    }

    @Override // vh8
    public final void a(TLRPC.MessageMedia messageMedia) {
        ktb ktbVar = (ktb) this.b;
        zu1 zu1Var = (zu1) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = ktbVar.H.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        ktbVar.H.k.media = messageMedia;
        zu1Var.getSendMessagesHelper().s(ktbVar.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override // ot2
    public final void accept(Object obj) {
        meb mebVar = (meb) this.b;
        AtomicLong atomicLong = (AtomicLong) this.c;
        p43 p43Var = (p43) obj;
        leb lebVar = new leb(p43Var.b, z6f.l3(p43Var.a, p43Var.c));
        mebVar.c.add(lebVar);
        long j = p43Var.d;
        if (j != -9223372036854775807L) {
            atomicLong.set(atomicLong.get() == -9223372036854775807L ? j : Math.max(atomicLong.get(), j));
        }
        long j2 = mebVar.l;
        if (j2 == -9223372036854775807L || j >= j2) {
            mebVar.g(lebVar);
        }
    }

    @Override // is6
    public final void b(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (!((hs6) arrayList.get(i)).a.startsWith("animated_")) {
                    String c = pv3.c(((hs6) arrayList.get(i)).a);
                    if (pv3.g(c) != null) {
                        linkedHashSet.add(c);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                r9b r9bVar = (r9b) obj2;
                Context context = (Context) obj;
                ArrayList arrayList2 = r9bVar.M;
                zh6 zh6Var = r9bVar.b;
                l9b l9bVar = r9bVar.y;
                HashMap hashMap = r9bVar.d;
                ArrayList arrayList3 = r9bVar.c;
                w9b w9bVar = r9bVar.a0;
                ex0 ex0Var = w9bVar.c;
                if (i >= 0 && i < arrayList2.size()) {
                    h9b h9bVar = (h9b) arrayList2.get(i);
                    int i2 = h9bVar.a;
                    int i3 = 0;
                    if (i2 != 3) {
                        if (i2 != 7) {
                            if (i2 == 9) {
                                byte b2 = h9bVar.q;
                                if (b2 != 0) {
                                    byte b3 = 5;
                                    if (b2 != 1) {
                                        if (b2 != 5) {
                                            if (b2 == 6) {
                                                w9bVar.A1 = false;
                                                r9bVar.h(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = r9bVar.getContext();
                                            int i4 = w9b.X1;
                                            id idVar = new id(3, w9bVar.J0, context2);
                                            idVar.q(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = w9bVar.m1;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            ConnectionsManager.getInstance(w9bVar.a).sendRequest(getgroupcallstreamrtmpurl, new qn8((Object) r9bVar, (Object) idVar, (Object) getgroupcallstreamrtmpurl, (byte) 22));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = w9bVar.m1;
                                        long m = inputPeer2 != null ? wf3.m(inputPeer2) : yac.h(w9bVar.a).e();
                                        int i5 = w9b.X1;
                                        fu5 G = fu5.G(r9bVar, w9bVar.J0, view);
                                        G.b(R.drawable.msg_addfolder, ob6.M0(2131744442, null), new pqa(r9bVar, m, b3), false);
                                        G.j();
                                        fu5.e(G, uc7.s1(w9bVar.a).O1().A(m, true), w9bVar.u1, false, null, new ku9(r9bVar, G, (byte) 13));
                                        G.a0();
                                        break;
                                    }
                                } else {
                                    bab babVar = w9bVar.W1;
                                    if (babVar != null) {
                                        babVar.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof skb) {
                            skb skbVar = (skb) view;
                            skbVar.setChecked(!skbVar.d());
                            h9bVar.k = skbVar.d();
                            byte b4 = h9bVar.c;
                            if (b4 != 0) {
                                if (b4 != 1) {
                                    if (b4 == 2) {
                                        w9bVar.v1 = skbVar.d();
                                        r9bVar.h(true);
                                        break;
                                    }
                                } else {
                                    boolean d = skbVar.d();
                                    w9bVar.x1 = d;
                                    boolean z = w9bVar.m1 instanceof TLRPC.TL_inputPeerChannel;
                                    vnb vnbVar = w9bVar.J0;
                                    if (d) {
                                        v21 G2 = new d31(ex0Var, vnbVar).G(R.raw.msg_story_keep, 4, ob6.M0(z ? 2131744361 : 2131744325, null));
                                        G2.j = 5000;
                                        G2.k(true);
                                    } else {
                                        v21 G3 = new d31(ex0Var, vnbVar).G(R.raw.fire_on, 4, ob6.M0(z ? 2131744362 : 2131744339, null));
                                        G3.j = 5000;
                                        G3.k(true);
                                    }
                                    r9bVar.h(true);
                                    break;
                                }
                            } else {
                                boolean d2 = skbVar.d();
                                w9bVar.w1 = d2;
                                r11 = w9bVar.H1 == 4 ? (byte) 1 : (byte) 0;
                                vnb vnbVar2 = w9bVar.J0;
                                if (!d2) {
                                    v21 G4 = new d31(ex0Var, vnbVar2).G(R.raw.passcode_lock_close, 4, ob6.M0(r11 != 0 ? 2131744337 : 2131744338, null));
                                    G4.j = 5000;
                                    G4.k(true);
                                    break;
                                } else {
                                    v21 G5 = new d31(ex0Var, vnbVar2).G(R.raw.ic_save_to_gallery, 4, ob6.M0(r11 != 0 ? 2131744323 : 2131744324, null));
                                    G5.j = 5000;
                                    G5.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!h9bVar.n || !w9bVar.z1) {
                        byte b5 = h9bVar.i;
                        if (b5 != 1) {
                            if (b5 != 3) {
                                if (b5 != 2) {
                                    if (b5 != 4) {
                                        if (b5 > 0) {
                                            arrayList3.clear();
                                            hashMap.clear();
                                            w9bVar.H1 = h9bVar.i;
                                            l9bVar.d.a();
                                        } else {
                                            TLRPC.Chat chat = h9bVar.h;
                                            if (chat != null) {
                                                long j = chat.id;
                                                int i6 = w9b.X1;
                                                if (w9bVar.K0(chat) > 200) {
                                                    try {
                                                        r9bVar.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, w9bVar.J0, r9bVar.getContext());
                                                    String M0 = ob6.M0(2131749148, null);
                                                    id idVar2 = alertDialog$Builder.a;
                                                    idVar2.S = M0;
                                                    idVar2.U = ob6.M0(2131749147, null);
                                                    c00.u(null, 2131747558, alertDialog$Builder, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j))) {
                                                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j));
                                                    if (arrayList4 != null) {
                                                        int size = arrayList4.size();
                                                        while (i3 < size) {
                                                            Object obj3 = arrayList4.get(i3);
                                                            i3++;
                                                            zh6Var.k(((Long) obj3).longValue(), Boolean.FALSE);
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j));
                                                    r9bVar.j(true);
                                                } else {
                                                    TLRPC.Chat M02 = uc7.s1(w9bVar.a).M0(Long.valueOf(j));
                                                    TLRPC.ChatFull N0 = uc7.s1(w9bVar.a).N0(j);
                                                    if (N0 == null || (chatParticipants = N0.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || N0.participants.participants.size() < N0.participants_count - 1) {
                                                        id idVar3 = r9bVar.H;
                                                        if (idVar3 != null) {
                                                            idVar3.dismiss();
                                                            r9bVar.H = null;
                                                        }
                                                        r9bVar.I = j;
                                                        id idVar4 = new id(3, w9bVar.J0, r9bVar.getContext());
                                                        r9bVar.H = idVar4;
                                                        idVar4.q(50L);
                                                        jf7 Y = jf7.Y(w9bVar.a);
                                                        Y.a.c(new y09(r9bVar, M02, Y, j));
                                                    } else {
                                                        r9bVar.e(j, N0.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(r9bVar.J)) {
                                                        l9bVar.setText("");
                                                        r9bVar.J = null;
                                                        r9bVar.h(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = h9bVar.g;
                                                if (user != null) {
                                                    if (r9bVar.a == 0) {
                                                        w9bVar.H1 = 0;
                                                    }
                                                    long j2 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList3);
                                                    if (arrayList3.contains(Long.valueOf(j2))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j2))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j2));
                                                        zh6Var.k(j2, Boolean.FALSE);
                                                    } else {
                                                        Iterator it2 = hashMap.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j2))) {
                                                                it2.remove();
                                                                hashSet.addAll((Collection) entry2.getValue());
                                                            }
                                                        }
                                                        hashSet.add(Long.valueOf(j2));
                                                        if (!TextUtils.isEmpty(r9bVar.J)) {
                                                            l9bVar.setText("");
                                                            r9bVar.J = null;
                                                            r9bVar.h(false);
                                                        }
                                                        zh6Var.k(j2, Boolean.TRUE);
                                                    }
                                                    arrayList3.clear();
                                                    arrayList3.addAll(hashSet);
                                                    r9bVar.j(true);
                                                }
                                            }
                                        }
                                        r9bVar.g(true);
                                        r9bVar.f(true);
                                        l9bVar.M = true;
                                        break;
                                    } else {
                                        if (w9bVar.H1 == 4) {
                                            w9bVar.G1 = 4;
                                            w9bVar.l1.F(1);
                                        }
                                        w9bVar.H1 = 4;
                                        r9bVar.g(true);
                                        break;
                                    }
                                } else {
                                    if (w9bVar.H1 == 2) {
                                        w9bVar.G1 = 2;
                                        w9bVar.l1.F(1);
                                    }
                                    w9bVar.H1 = 2;
                                    r9bVar.g(true);
                                    break;
                                }
                            } else {
                                if (w9bVar.H1 == 3 || (w9bVar.r1.isEmpty() && w9bVar.s1.isEmpty())) {
                                    w9bVar.G1 = 3;
                                    w9bVar.l1.F(1);
                                }
                                w9bVar.H1 = 3;
                                r9bVar.g(true);
                                break;
                            }
                        } else {
                            if (w9bVar.H1 == 1 || w9bVar.I0().isEmpty()) {
                                w9bVar.G1 = 1;
                                w9bVar.l1.F(1);
                            }
                            w9bVar.H1 = 1;
                            r9bVar.g(true);
                            break;
                        }
                    } else {
                        new e9b(context, w9bVar.a, w9bVar.E1, w9bVar.m1, new j9b(r9bVar, r11), w9bVar.J0).show();
                        break;
                    }
                }
                break;
            case 10:
                ((ThemeActivity) obj2).z0((Context) obj, view, i, f);
                break;
            default:
                ncc nccVar = (ncc) obj;
                b8c G6 = ((q9c) obj2).g3.G(i);
                if (G6 != null) {
                    nccVar.k(G6, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
                    break;
                }
                break;
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        l1c l1cVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        byte b2 = 1;
        switch (b) {
            case 11:
                d0 d0Var = (d0) obj2;
                e0 e0Var = (e0) obj;
                ThemeActivity themeActivity = d0Var.e;
                if (i >= 0 && i < e0Var.e.size()) {
                    ynb ynbVar = (ynb) e0Var.e.get(i);
                    if (ynbVar.a >= 100 && !ynbVar.z) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String M0 = ob6.M0(2131747524, "OpenInEditor");
                        String M02 = ob6.M0(2131745154, "ShareTheme");
                        TLRPC.TL_theme tL_theme = ynbVar.r;
                        CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : ob6.M0(2131743798, "ThemeSetUrl"), ob6.M0(2131751451, "DeleteTheme")};
                        int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                        un5 un5Var = new un5(d0Var, ynbVar, e0Var, b2);
                        id idVar = alertDialog$Builder.a;
                        idVar.Q = charSequenceArr;
                        idVar.R = iArr;
                        idVar.N = un5Var;
                        themeActivity.showDialog(idVar);
                        idVar.l(idVar.O0.size() - 1, aob.w0(null, aob.q7, false), aob.w0(null, aob.p7, false));
                        break;
                    }
                }
                break;
            default:
                cs1 cs1Var = (cs1) obj;
                TLRPC.TL_forumTopic tL_forumTopic = ((j0c) ((n0c) obj2).s.c.get(i)).a;
                if (tL_forumTopic != null && (l1cVar = cs1Var.a.g2) != null && l1cVar.l(tL_forumTopic, view, true)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // sgb
    public final Object g() {
        byte b = this.a;
        Object obj = this.c;
        ba0 ba0Var = (ba0) this.b;
        switch (b) {
            case 20:
                Iterable iterable = (Iterable) obj;
                ds9 ds9Var = (ds9) ba0Var.c;
                ds9Var.getClass();
                if (iterable.iterator().hasNext()) {
                    ds9Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(ds9.g(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((ds9) ba0Var.i).e(((Integer) r2.getValue()).intValue(), be6.h, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // yu8
    public final void i(vp7 vp7Var) {
        wzb wzbVar = (wzb) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        zzb zzbVar = wzbVar.a;
        zzbVar.e.add(Integer.valueOf(tL_forumTopic.id));
        zzbVar.Z();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        am2 am2Var = (am2) this.b;
        c51 c51Var = (c51) this.c;
        cc4.b("wear-auth: /token delivered to " + ((String) am2Var.e));
        c51Var.setLoading(false);
        nwc.d = null;
        nx0 nx0Var = nwc.c;
        if (nx0Var != null) {
            nx0Var.dismiss();
            nwc.c = null;
        }
    }

    @Override // m0d
    public final Object run() {
        w wVar = (w) this.b;
        byte[] bArr = (byte[]) this.c;
        synchronized (wVar) {
            if (bArr != null) {
                if (wVar.d.size() + bArr.length <= 16777216) {
                    wVar.d.write(bArr, 0, bArr.length);
                }
            }
            wVar.d.reset();
            throw new IllegalStateException("Widget engine: argument too large");
        }
        return null;
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        boolean z;
        wk5 wk5Var;
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                bj3 bj3Var = (bj3) obj2;
                bj3Var.getClass();
                idVar.dismiss();
                bj3Var.M0.getDownloadController().j((ArrayList) obj);
                bj3Var.S(false);
                break;
            case 3:
                b2a b2aVar = (b2a) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    b2aVar.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    o48 o48Var = new o48((Object) b2aVar, (Object) user, (Object) twoStepVerificationActivity, (byte) 11);
                    twoStepVerificationActivity.a0 = (byte) 0;
                    twoStepVerificationActivity.c0 = o48Var;
                    S.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 6:
                ((Runnable) obj2).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = ls6.b0((TLRPC.StickerSet) obj);
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_stickers_deleteStickerSet, new xe2((byte) 9));
                break;
            case 9:
                ((ThemeActivity) obj2).y0((bcb) obj);
                break;
            case 12:
                d0 d0Var = (d0) obj2;
                znb znbVar = (znb) obj;
                d0Var.getClass();
                uc7.s1(znbVar.F).I4(znbVar, null, znbVar == aob.J, true);
                HashMap hashMap = aob.H;
                if (znbVar.b == null) {
                    z = false;
                } else {
                    if (aob.I == znbVar) {
                        aob.t(aob.L, true, false);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (znbVar == aob.J) {
                        aob.J = (znb) hashMap.get("Dark Blue");
                    }
                    znbVar.s();
                    aob.G.remove(znbVar);
                    hashMap.remove(znbVar.a);
                    unb unbVar = znbVar.j0;
                    if (unbVar != null) {
                        unbVar.a();
                    }
                    aob.F.remove(znbVar);
                    new File(znbVar.b).delete();
                    aob.w1(true, false);
                }
                if (z) {
                    wk5Var = ((e) d0Var.e).parentLayout;
                    ((ActionBarLayout) wk5Var).W(true, true);
                }
                jn7.e().k(jn7.r4, new Object[0]);
                break;
            case 17:
                ((o7c) obj2).y0((byte[]) obj);
                break;
            case 22:
                mkc mkcVar = (mkc) obj2;
                ((boolean[]) obj)[0] = true;
                mkcVar.p0 = 17;
                Intent intent = new Intent(mkcVar.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", mkcVar.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", mkcVar.a);
                try {
                    mkcVar.b.startService(intent);
                    break;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            case 23:
                Activity activity = (Activity) obj2;
                Intent intent2 = new Intent(activity, (Class<?>) LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) obj));
                activity.startActivity(intent2);
                break;
            case 24:
                idVar.dismiss();
                atc atcVar = new atc();
                atcVar.r = !((Boolean) obj).booleanValue();
                ((gtc) obj2).presentFragment(atcVar);
                break;
            case 25:
                ((vlc) obj2).run();
                ((nx0) obj).dismiss();
                break;
            case 26:
                c cVar = (c) obj;
                l01 g = idVar.g(i, true, true);
                g.d();
                dtc dtcVar = new dtc((gtc) obj2, g, b2);
                c.P("disableBackupWithoutUpdatingPhrase");
                cVar.A0(new ba1((Object) cVar, (Object) new rx1((Object) cVar, (Object) dtcVar, (byte) 29), true, false, (byte) 3));
                break;
            default:
                m01.r((Activity) obj2, Uri.parse((String) obj), true, false);
                break;
        }
    }

    @Override // u69
    public final void f() {
    }

    @Override // yu8
    public final void l() {
    }

    @Override // u69
    public final void h(float f) {
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public final void run() {
        r7a r7aVar = (r7a) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        hl.c3(new w5a(r7aVar, message, message.id, (byte) 1));
    }

    private final void c(View view, float f, float f2) {
    }

    private final void j(View view, float f, float f2) {
    }

    private final void k(View view, float f, float f2) {
    }

    @Override // u69
    public final boolean d(float f, float f2, int i, View view) {
        q9c q9cVar = (q9c) this.b;
        occ occVar = (occ) this.c;
        b8c G = q9cVar.g3.G(i);
        if (G == null) {
            return false;
        }
        return occVar.e(G, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)).booleanValue();
    }
}
