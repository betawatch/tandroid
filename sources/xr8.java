// default package

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d0;
import org.telegram.ui.e0;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xr8 implements ee, ira, oac, CameraView.CameraViewDelegate, Continuation, g59, ou3, oh9, ni7, k01, kq9, es6, QuickAckDelegate, ue7, fu2, h59, jg8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xr8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ira
    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        rs8 rs8Var = (rs8) this.b;
        rs8Var.e.l.remove((TL_stars.SavedStarGift) this.c);
        rs8Var.f(true);
        int i = rs8Var.b;
        long e = z8c.h(i).e();
        lea leaVar = rs8Var.a;
        if (j == e) {
            c41 b0 = c41.b0(leaVar.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = jb6.M0(2131752840, null);
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            u31 O = b0.O(document, M0, jb6.a0(null, null, 2131752841, kt6.m(tL_starGiftUnique.num, ',', sb)));
            O.s = false;
            O.j();
        } else {
            u31 O2 = c41.b0(leaVar.a).O(tL_starGiftUnique.getDocument(), jb6.M0(2131752838, null), jb6.a0(null, null, 2131752839, pg3.r(i, j)));
            O2.s = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.w0.c(true);
        }
    }

    @Override // fu2
    public final void accept(Object obj) {
        qcb qcbVar = (qcb) this.b;
        AtomicLong atomicLong = (AtomicLong) this.c;
        i53 i53Var = (i53) obj;
        pcb pcbVar = new pcb(i53Var.b, k4f.l3(i53Var.a, i53Var.c));
        qcbVar.c.add(pcbVar);
        long j = i53Var.d;
        if (j != -9223372036854775807L) {
            atomicLong.set(atomicLong.get() == -9223372036854775807L ? j : Math.max(atomicLong.get(), j));
        }
        long j2 = qcbVar.l;
        if (j2 == -9223372036854775807L || j >= j2) {
            qcbVar.g(pcbVar);
        }
    }

    @Override // kq9
    public final Object apply(Object obj) {
        mq9 mq9Var = (mq9) this.b;
        rb0 rb0Var = (rb0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        qa0 qa0Var = mq9Var.d;
        ArrayList d = mq9Var.d(sQLiteDatabase, rb0Var, qa0Var.b);
        for (fl8 fl8Var : fl8.values()) {
            if (fl8Var != rb0Var.c) {
                int size = qa0Var.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(mq9Var.d(sQLiteDatabase, rb0Var.b(fl8Var), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < d.size(); i++) {
            sb.append(((eb0) d.get(i)).a);
            if (i < d.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new lq9(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            eb0 eb0Var = (eb0) listIterator.next();
            long j2 = eb0Var.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                oa0 c = eb0Var.c.c();
                for (lq9 lq9Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.a(lq9Var.a, lq9Var.b);
                }
                listIterator.set(new eb0(j2, eb0Var.b, c.b()));
            }
        }
        return d;
    }

    @Override // ni7
    public final void b(Canvas canvas) {
        nj9 nj9Var = (nj9) this.b;
        View view = (View) this.c;
        tj9 tj9Var = nj9Var.X;
        AtomicReference atomicReference = tj9Var.E;
        StaticLayout staticLayout = tj9Var.b;
        ArrayList arrayList = tj9Var.x;
        rna.g(view, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        gn.drawAnimatedEmojis(canvas, tj9Var.b, tj9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override // jg8
    public final void c(TLRPC.MessageMedia messageMedia) {
        krb krbVar = (krb) this.b;
        yv1 yv1Var = (yv1) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = krbVar.H.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        krbVar.H.k.media = messageMedia;
        yv1Var.getSendMessagesHelper().s(krbVar.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override // k01
    public final void cancel() {
        bq9 bq9Var = (bq9) this.b;
        bq9Var.b.removeCallbacks((up9) this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [ee, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r3;
        boolean z;
        boolean z2;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i2 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 7:
                yb9 yb9Var = (yb9) this.b;
                xb9 xb9Var = (xb9) this.c;
                c6c G = yb9Var.d2.G(i - 1);
                if (G != null) {
                    Object obj = G.H;
                    if (obj instanceof TL_stars.StarGift) {
                        TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                        boolean z3 = G.s;
                        if (TextUtils.isEmpty(starGift.gift_address) || !yb9Var.c2 || oc7.r1(yb9Var.a).l4.w.f) {
                            if (!z3) {
                                ArrayList arrayList2 = xb9Var.b.l;
                                int size = arrayList2.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 < size) {
                                        Object obj2 = arrayList2.get(i3);
                                        i3++;
                                        savedStarGift = (TL_stars.SavedStarGift) obj2;
                                        if (savedStarGift.gift == starGift) {
                                        }
                                    } else {
                                        savedStarGift = null;
                                    }
                                }
                                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(yb9Var.a).getCurrentTime()) {
                                    alertDialog$Builder = new AlertDialog$Builder(yb9Var.getContext());
                                    r3 = 0;
                                    alertDialog$Builder.a.S = jb6.M0(2131749688, null);
                                    alertDialog$Builder.a.U = gm.S2(jb6.a0(null, null, 2131749689, jb6.x(savedStarGift.can_craft_at, true)));
                                }
                            } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.H;
                                he heVar = new he(3, null, yb9Var.getContext());
                                heVar.q(400L);
                                long e = z8c.h(yb9Var.a).e();
                                ok okVar = tL_starGiftUnique.resale_ton_only ? ok.b : ok.a;
                                jva.u(yb9Var.a, okVar).E(tL_starGiftUnique, e, null, true, new c28(yb9Var, heVar, okVar, tL_starGiftUnique, e));
                                break;
                            }
                            yb9Var.a2.a(starGift);
                            yb9Var.dismiss();
                            break;
                        } else {
                            alertDialog$Builder = new AlertDialog$Builder(0, yb9Var.J0, yb9Var.getContext());
                            r3 = 0;
                            alertDialog$Builder.a.S = jb6.M0(2131749725, null);
                            alertDialog$Builder.a.U = jb6.M0(2131749726, null);
                        }
                        b10.t(r3, 2131747564, alertDialog$Builder, r3);
                        break;
                    }
                }
                break;
            case 22:
                v7b v7bVar = (v7b) this.b;
                Context context = (Context) this.c;
                ArrayList arrayList3 = v7bVar.M;
                vh6 vh6Var = v7bVar.b;
                o7b o7bVar = v7bVar.y;
                HashMap hashMap = v7bVar.d;
                ArrayList arrayList4 = v7bVar.c;
                a8b a8bVar = v7bVar.a0;
                dy0 dy0Var = a8bVar.c;
                if (i >= 0 && i < arrayList3.size()) {
                    k7b k7bVar = (k7b) arrayList3.get(i);
                    int i4 = k7bVar.a;
                    if (i4 != 3) {
                        if (i4 != 7) {
                            if (i4 == 9) {
                                byte b = k7bVar.q;
                                if (b != 0) {
                                    byte b2 = 5;
                                    if (b != 1) {
                                        if (b != 5) {
                                            if (b == 6) {
                                                a8bVar.A1 = false;
                                                v7bVar.h(true);
                                                break;
                                            }
                                        } else {
                                            Context context2 = v7bVar.getContext();
                                            int i5 = a8b.X1;
                                            he heVar2 = new he(3, a8bVar.J0, context2);
                                            heVar2.q(500L);
                                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                                            getgroupcallstreamrtmpurl.live_story = true;
                                            TLRPC.InputPeer inputPeer = a8bVar.m1;
                                            if (inputPeer == null) {
                                                inputPeer = new TLRPC.TL_inputPeerSelf();
                                            }
                                            getgroupcallstreamrtmpurl.peer = inputPeer;
                                            ConnectionsManager.getInstance(a8bVar.a).sendRequest(getgroupcallstreamrtmpurl, new fm8((Object) v7bVar, (Object) heVar2, (Object) getgroupcallstreamrtmpurl, (byte) 22));
                                            break;
                                        }
                                    } else {
                                        TLRPC.InputPeer inputPeer2 = a8bVar.m1;
                                        long m = inputPeer2 != null ? pg3.m(inputPeer2) : z8c.h(a8bVar.a).e();
                                        int i6 = a8b.X1;
                                        bu5 G2 = bu5.G(v7bVar, a8bVar.J0, view);
                                        G2.b(R.drawable.msg_addfolder, jb6.M0(2131744474, null), new toa(v7bVar, m, b2), false);
                                        G2.j();
                                        bu5.e(G2, oc7.r1(a8bVar.a).N1().A(m, true), a8bVar.u1, false, null, new ts9(v7bVar, G2, (byte) 14));
                                        G2.a0();
                                        break;
                                    }
                                } else {
                                    f8b f8bVar = a8bVar.W1;
                                    if (f8bVar != null) {
                                        f8bVar.run();
                                        break;
                                    }
                                }
                            }
                        } else if (view instanceof xib) {
                            xib xibVar = (xib) view;
                            xibVar.setChecked(!xibVar.d());
                            k7bVar.k = xibVar.d();
                            byte b3 = k7bVar.c;
                            if (b3 != 0) {
                                if (b3 != 1) {
                                    if (b3 == 2) {
                                        a8bVar.v1 = xibVar.d();
                                        v7bVar.h(true);
                                        break;
                                    }
                                } else {
                                    boolean d = xibVar.d();
                                    a8bVar.x1 = d;
                                    boolean z4 = a8bVar.m1 instanceof TLRPC.TL_inputPeerChannel;
                                    ylb ylbVar = a8bVar.J0;
                                    if (d) {
                                        u31 G3 = new c41(dy0Var, ylbVar).G(R.raw.msg_story_keep, 4, jb6.M0(z4 ? 2131744393 : 2131744357, null));
                                        G3.j = 5000;
                                        z = true;
                                        G3.k(true);
                                    } else {
                                        u31 G4 = new c41(dy0Var, ylbVar).G(R.raw.fire_on, 4, jb6.M0(z4 ? 2131744394 : 2131744371, null));
                                        G4.j = 5000;
                                        z = true;
                                        G4.k(true);
                                    }
                                    v7bVar.h(z);
                                    break;
                                }
                            } else {
                                boolean d2 = xibVar.d();
                                a8bVar.w1 = d2;
                                boolean z5 = a8bVar.H1 == 4;
                                ylb ylbVar2 = a8bVar.J0;
                                if (!d2) {
                                    u31 G5 = new c41(dy0Var, ylbVar2).G(R.raw.passcode_lock_close, 4, jb6.M0(z5 ? 2131744369 : 2131744370, null));
                                    G5.j = 5000;
                                    G5.k(true);
                                    break;
                                } else {
                                    u31 G6 = new c41(dy0Var, ylbVar2).G(R.raw.ic_save_to_gallery, 4, jb6.M0(z5 ? 2131744355 : 2131744356, null));
                                    G6.j = 5000;
                                    G6.k(true);
                                    break;
                                }
                            }
                        }
                    } else if (!k7bVar.n || !a8bVar.z1) {
                        byte b4 = k7bVar.i;
                        if (b4 != 1) {
                            if (b4 != 3) {
                                if (b4 != 2) {
                                    if (b4 != 4) {
                                        if (b4 > 0) {
                                            arrayList4.clear();
                                            hashMap.clear();
                                            a8bVar.H1 = k7bVar.i;
                                            o7bVar.d.a();
                                            z2 = true;
                                        } else {
                                            TLRPC.Chat chat = k7bVar.h;
                                            if (chat != null) {
                                                long j = chat.id;
                                                int i7 = a8b.X1;
                                                if (a8bVar.J0(chat) > 200) {
                                                    try {
                                                        v7bVar.performHapticFeedback(3, 1);
                                                    } catch (Throwable unused) {
                                                    }
                                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, a8bVar.J0, v7bVar.getContext());
                                                    alertDialog$Builder2.a.S = jb6.M0(2131749151, null);
                                                    alertDialog$Builder2.a.U = jb6.M0(2131749150, null);
                                                    b10.t(null, 2131747564, alertDialog$Builder2, null);
                                                } else if (hashMap.containsKey(Long.valueOf(j))) {
                                                    ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j));
                                                    if (arrayList5 != null) {
                                                        int size2 = arrayList5.size();
                                                        while (i2 < size2) {
                                                            Object obj3 = arrayList5.get(i2);
                                                            i2++;
                                                            vh6Var.k(Boolean.FALSE, ((Long) obj3).longValue());
                                                        }
                                                    }
                                                    hashMap.remove(Long.valueOf(j));
                                                    v7bVar.j(true);
                                                } else {
                                                    TLRPC.Chat L0 = oc7.r1(a8bVar.a).L0(Long.valueOf(j));
                                                    TLRPC.ChatFull M0 = oc7.r1(a8bVar.a).M0(j);
                                                    if (M0 == null || (chatParticipants = M0.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || M0.participants.participants.size() < M0.participants_count - 1) {
                                                        he heVar3 = v7bVar.H;
                                                        if (heVar3 != null) {
                                                            heVar3.dismiss();
                                                            v7bVar.H = null;
                                                        }
                                                        v7bVar.I = j;
                                                        he heVar4 = new he(3, a8bVar.J0, v7bVar.getContext());
                                                        v7bVar.H = heVar4;
                                                        heVar4.q(50L);
                                                        cf7 Y = cf7.Y(a8bVar.a);
                                                        Y.a.c(new nz8(v7bVar, L0, Y, j));
                                                    } else {
                                                        v7bVar.e(j, M0.participants);
                                                    }
                                                    if (!TextUtils.isEmpty(v7bVar.J)) {
                                                        o7bVar.setText("");
                                                        v7bVar.J = null;
                                                        v7bVar.h(false);
                                                    }
                                                }
                                            } else {
                                                TLRPC.User user = k7bVar.g;
                                                if (user != null) {
                                                    if (v7bVar.a == 0) {
                                                        a8bVar.H1 = 0;
                                                    }
                                                    long j2 = user.id;
                                                    HashSet hashSet = new HashSet(arrayList4);
                                                    if (arrayList4.contains(Long.valueOf(j2))) {
                                                        Iterator it = hashMap.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j2))) {
                                                                it.remove();
                                                                hashSet.addAll((Collection) entry.getValue());
                                                            }
                                                        }
                                                        hashSet.remove(Long.valueOf(j2));
                                                        vh6Var.k(Boolean.FALSE, j2);
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
                                                        if (!TextUtils.isEmpty(v7bVar.J)) {
                                                            o7bVar.setText("");
                                                            v7bVar.J = null;
                                                            v7bVar.h(false);
                                                        }
                                                        vh6Var.k(Boolean.TRUE, j2);
                                                    }
                                                    arrayList4.clear();
                                                    arrayList4.addAll(hashSet);
                                                    z2 = true;
                                                    v7bVar.j(true);
                                                }
                                            }
                                            z2 = true;
                                        }
                                        v7bVar.g(z2);
                                        v7bVar.f(z2);
                                        o7bVar.M = z2;
                                        break;
                                    } else {
                                        if (a8bVar.H1 == 4) {
                                            a8bVar.G1 = 4;
                                            a8bVar.l1.E(1);
                                        }
                                        a8bVar.H1 = 4;
                                        v7bVar.g(true);
                                        break;
                                    }
                                } else {
                                    if (a8bVar.H1 == 2) {
                                        a8bVar.G1 = 2;
                                        a8bVar.l1.E(1);
                                    }
                                    a8bVar.H1 = 2;
                                    v7bVar.g(true);
                                    break;
                                }
                            } else {
                                if (a8bVar.H1 == 3 || (a8bVar.r1.isEmpty() && a8bVar.s1.isEmpty())) {
                                    a8bVar.G1 = 3;
                                    a8bVar.l1.E(1);
                                }
                                a8bVar.H1 = 3;
                                v7bVar.g(true);
                                break;
                            }
                        } else {
                            if (a8bVar.H1 == 1 || a8bVar.H0().isEmpty()) {
                                a8bVar.G1 = 1;
                                a8bVar.l1.E(1);
                            }
                            a8bVar.H1 = 1;
                            v7bVar.g(true);
                            break;
                        }
                    } else {
                        new h7b(context, a8bVar.a, a8bVar.E1, a8bVar.m1, new n7b(v7bVar, objArr == true ? 1 : 0), a8bVar.J0).show();
                        break;
                    }
                }
                break;
            default:
                ((ThemeActivity) this.b).z0((Context) this.c, view, i, f);
                break;
        }
    }

    @Override // es6
    public final void f(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (!((ds6) arrayList.get(i)).a.startsWith("animated_")) {
                    String c = gw3.c(((ds6) arrayList.get(i)).a);
                    if (gw3.g(c) != null) {
                        linkedHashSet.add(c);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // h59
    public final boolean g(int i, View view) {
        d0 d0Var = (d0) this.b;
        e0 e0Var = (e0) this.c;
        ThemeActivity themeActivity = d0Var.e;
        if (i >= 0 && i < e0Var.e.size()) {
            amb ambVar = (amb) e0Var.e.get(i);
            if (ambVar.a >= 100 && !ambVar.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = jb6.M0(2131747530, "OpenInEditor");
                String M02 = jb6.M0(2131745160, "ShareTheme");
                TLRPC.TL_theme tL_theme = ambVar.r;
                CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : jb6.M0(2131743830, "ThemeSetUrl"), jb6.M0(2131751423, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                rn5 rn5Var = new rn5(d0Var, ambVar, e0Var, (byte) 1);
                he heVar = alertDialog$Builder.a;
                heVar.Q = charSequenceArr;
                heVar.R = iArr;
                heVar.N = rn5Var;
                themeActivity.showDialog(heVar);
                heVar.l(heVar.O0.size() - 1, cmb.w0(null, cmb.p7, false), cmb.w0(null, cmb.o7, false));
                return true;
            }
        }
        return false;
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        us8 us8Var = (us8) this.b;
        b61 b61Var = (b61) this.c;
        View view = (View) obj2;
        long j = ((TL_stars.SavedStarGift) ((c6c) obj).H).gift.id;
        if (us8Var.l1 == j) {
            us8Var.l1 = 0L;
            j = 0;
        } else {
            us8Var.l1 = j;
        }
        b61Var.setEnabled(j != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof j28) {
                    j28 j28Var = (j28) childAt;
                    j28Var.b(us8Var.l1 == j28Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // ou3
    public final void m() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                ((sd9) obj2).i();
                ((rd9) obj).j2();
                break;
            default:
                kk9 kk9Var = (kk9) obj2;
                nk9 nk9Var = (nk9) obj;
                TL_iv.pageTableCell pagetablecell = nk9Var.b;
                if (pagetablecell != null) {
                    fhb.d(pagetablecell, nk9Var.a.getText());
                }
                kg9 kg9Var = kk9Var.F;
                if (kg9Var != null && kk9Var.a != null) {
                    kg9Var.a.W3();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public final void onCameraInit() {
        zx8 zx8Var = (zx8) this.b;
        ((CameraView) this.c).animate().alpha(1.0f).setDuration(180L).start();
        if (zx8Var.W || zx8Var.i0 || zx8Var.m0) {
            return;
        }
        zx8Var.i0 = true;
        zx8Var.h0.postDelayed(zx8Var.z0, 150L);
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        boolean z;
        tk5 tk5Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                fs8 fs8Var = (fs8) obj2;
                qac qacVar = (qac) obj;
                String obj3 = fs8Var.getText().toString();
                if (obj3.length() > 0 && obj3.length() <= 12) {
                    qacVar.a(obj3);
                    heVar.dismiss();
                    break;
                } else {
                    gm.z3(fs8Var);
                    break;
                }
                break;
            case 15:
                sj3 sj3Var = (sj3) obj2;
                sj3Var.getClass();
                heVar.dismiss();
                sj3Var.M0.getDownloadController().j((ArrayList) obj);
                sj3Var.R(false);
                break;
            case 18:
                k0a k0aVar = (k0a) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    k0aVar.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    jq9 jq9Var = new jq9(k0aVar, user, twoStepVerificationActivity, (byte) 2);
                    twoStepVerificationActivity.a0 = (byte) 0;
                    twoStepVerificationActivity.c0 = jq9Var;
                    S.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 21:
                ((Runnable) obj2).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = hs6.b0((TLRPC.StickerSet) obj);
                ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_stickers_deleteStickerSet, new nf2((byte) 9));
                break;
            case 24:
                ((ThemeActivity) obj2).y0((b7b) obj);
                break;
            default:
                d0 d0Var = (d0) obj2;
                bmb bmbVar = (bmb) obj;
                d0Var.getClass();
                oc7.r1(bmbVar.F).C4(bmbVar, null, bmbVar == cmb.J, true);
                HashMap hashMap = cmb.H;
                if (bmbVar.b == null) {
                    z = false;
                } else {
                    if (cmb.I == bmbVar) {
                        cmb.t(cmb.L, true, false);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bmbVar == cmb.J) {
                        cmb.J = (bmb) hashMap.get("Dark Blue");
                    }
                    bmbVar.s();
                    cmb.G.remove(bmbVar);
                    hashMap.remove(bmbVar.a);
                    xlb xlbVar = bmbVar.j0;
                    if (xlbVar != null) {
                        xlbVar.a();
                    }
                    cmb.F.remove(bmbVar);
                    new File(bmbVar.b).delete();
                    cmb.w1(true, false);
                }
                if (z) {
                    tk5Var = ((d) d0Var.e).parentLayout;
                    ((ActionBarLayout) tk5Var).W(true, true);
                }
                nm7.e().k(nm7.s4, new Object[0]);
                break;
        }
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public final void run() {
        a6a a6aVar = (a6a) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        gm.c3(new y3a(a6aVar, message, message.id, (byte) 1));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        mj4 mj4Var = (mj4) this.b;
        String str = (String) this.c;
        synchronized (mj4Var) {
            ((qt) mj4Var.c).remove(str);
        }
        return task;
    }

    @Override // g59
    public final boolean u(View view) {
        byte b = this.a;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ue7
    public final void z(boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 20:
                nha nhaVar = (nha) obj2;
                d dVar = nhaVar.y1;
                dVar.finishFragment();
                dVar.getNotificationCenter().n((jm7) dVar, 4);
                dVar.getNotificationCenter().k(4, new Object[0]);
                dVar.getNotificationCenter().k(nm7.K2, Long.valueOf(nhaVar.m1), (TLRPC.User) obj, null, Boolean.valueOf(z));
                dVar.getMessagesController().V4(false);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                sxb sxbVar = ((cxb) obj2).b;
                sxbVar.getNotificationCenter().n(sxbVar, 4);
                sxbVar.getNotificationCenter().k(4, new Object[0]);
                sxbVar.finishFragment();
                sxbVar.getNotificationCenter().k(nm7.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z));
                break;
        }
    }

    @Override // oh9
    public final void run(long j) {
        zg9 zg9Var = (zg9) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        zg9Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    private final void e(View view, float f, float f2) {
    }

    private final void h(View view, float f, float f2) {
    }

    private final void i(View view, float f, float f2) {
    }
}
