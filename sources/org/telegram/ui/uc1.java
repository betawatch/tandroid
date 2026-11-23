package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Surface;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc1 implements OnSuccessListener, org.telegram.ui.ActionBar.q1, p4.m0, h2.j, p4.b1, qi.m, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.b, v5.e, jl0, vw, f3.r {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uc1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(bx bxVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // u2.v
    public int a(Object obj) {
        Context context = (Context) this.b;
        e2.u uVar = (e2.u) this.c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.b;
        return ((str.equals(uVar.s) || str.equals(u2.w.c(uVar))) && oVar.c(context, uVar, false) && oVar.d(uVar)) ? 1 : 0;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                p4.d1 d1Var = (p4.d1) this.b;
                e2.q1 q1Var = (e2.q1) this.c;
                p4.h1 h1Var = (p4.h1) obj;
                d1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h9.g2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) d1Var.d.n.get(n1Var.a.b);
                        if (m1Var == null || n1Var.a.a != m1Var.a) {
                            c10.a(n1Var);
                        } else {
                            c10.a(new e2.n1(m1Var, n1Var.b));
                        }
                    }
                    q1Var = c10.b();
                }
                h1Var.r0(q1Var);
                break;
            case 7:
                p4.d1 d1Var2 = (p4.d1) this.b;
                p4.v vVar = (p4.v) this.c;
                p4.d0 d0Var = (p4.d0) d1Var2.a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    break;
                }
                break;
            case 8:
                p4.d1 d1Var3 = (p4.d1) this.b;
                Surface surface = (Surface) this.c;
                p4.h1 h1Var2 = (p4.h1) obj;
                ((p4.d0) d1Var3.a.get()).getClass();
                if (surface != null) {
                    p4.c1 c1Var = new p4.c1(surface);
                    d1Var3.i = c1Var;
                    h1Var2.T(c1Var);
                    break;
                } else {
                    h1Var2.T(null);
                    d1Var3.i = null;
                    break;
                }
            default:
                a8.xa xaVar = (a8.xa) this.b;
                ((x2.k0) obj).i(xaVar.b, (x2.g0) xaVar.c, (x2.c0) this.c);
                break;
        }
    }

    @Override // v5.e
    public Object apply(Object obj) {
        v5.g gVar = (v5.g) this.b;
        o5.i iVar = (o5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        v5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (l5.d dVar : l5.d.values()) {
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
        for (int i7 = 0; i7 < d.size(); i7++) {
            sb2.append(((v5.b) d.get(i7)).a);
            if (i7 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new v5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            v5.b bVar = (v5.b) listIterator.next();
            long j10 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                h2.e0 c10 = bVar.c.c();
                for (v5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.a(fVar.a, fVar.b);
                }
                listIterator.set(new v5.b(j10, bVar.b, c10.b()));
            }
        }
        return d;
    }

    @Override // ua.a
    public void b(ua.b bVar) {
        ua.a aVar = (ua.a) this.b;
        ua.a aVar2 = (ua.a) this.c;
        aVar.b(bVar);
        aVar2.b(bVar);
    }

    @Override // f3.r
    public f3.o[] c(Uri uri, Map map) {
        x2.q qVar = (x2.q) this.b;
        e2.u uVar = (e2.u) this.c;
        return new f3.o[]{qVar.c.G(uVar) ? new c4.h(qVar.c.f(uVar), null) : new n3.a(uVar)};
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i7 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // qi.m
    public void d(j6.k kVar) {
        switch (this.a) {
            case 11:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.as0((SpannableString) this.b, kVar, (n2.c0) this.c, 27));
                break;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.as0((SpannableString) this.b, kVar, (di.p9) this.c, 28));
                break;
        }
    }

    @Override // org.telegram.ui.jl0
    public void e(int i7) {
        switch (this.a) {
            case 23:
                wg.u uVar = (wg.u) this.b;
                wg.u uVar2 = (wg.u) this.c;
                if (i7 != 1) {
                    if (i7 != 3) {
                        uVar2.a(null);
                        break;
                    }
                } else {
                    uVar.a(null);
                    break;
                }
                break;
            default:
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.b;
                org.telegram.messenger.w10 w10Var2 = (org.telegram.messenger.w10) this.c;
                if (i7 != 1) {
                    if (i7 != 3) {
                        w10Var2.a(null);
                        break;
                    }
                } else {
                    w10Var.a(null);
                    break;
                }
                break;
        }
    }

    @Override // p4.m0
    public void f(p4.v vVar) {
        switch (this.a) {
            case 4:
                ((p4.d) this.c).f(((p4.n0) this.b).h.t);
                break;
            default:
                p4.n0 n0Var = (p4.n0) this.b;
                q4.h hVar = (q4.h) this.c;
                n0Var.getClass();
                String str = hVar.a;
                if (TextUtils.isEmpty(str)) {
                    h2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    p4.h1 h1Var = n0Var.h.t;
                    if (h1Var.q0(17)) {
                        e2.l1 z02 = h1Var.z0();
                        e2.k1 k1Var = new e2.k1();
                        for (int i7 = 0; i7 < z02.o(); i7++) {
                            if (TextUtils.equals(z02.m(i7, k1Var, 0L).c.a, str)) {
                                h1Var.R(i7);
                                break;
                            }
                        }
                        break;
                    } else {
                        h2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // w5.b
    public Object h() {
        switch (this.a) {
            case 15:
                ia.c cVar = (ia.c) this.b;
                Iterable iterable = (Iterable) this.c;
                v5.g gVar = (v5.g) ((v5.d) cVar.c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + v5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                ia.c cVar2 = (ia.c) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((v5.g) ((v5.c) cVar2.i)).e(((Integer) entry.getValue()).intValue(), r5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.ui.web.m.d0((org.telegram.ui.web.m) this.b, (HashSet) this.c);
                break;
            case 2:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = org.telegram.messenger.mp.u1(v0Var.N).s1(v0Var.V);
                ConnectionsManager.getInstance(v0Var.N).sendRequest(allowsendmessage, new bi.q1(v0Var, strArr, t1Var, 23));
                break;
            case 3:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 18:
                ug.k0 k0Var = (ug.k0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                k0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = org.telegram.messenger.mp.k1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(k0Var.a).sendRequest(tL_channels_updateUsername, new ug.u(k0Var, 1), 64);
                }
                break;
            case 21:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                wg.q0 q0Var = (wg.q0) this.c;
                atomicBoolean.set(true);
                q0Var.run();
                break;
            default:
                ((wg.u) this.b).a((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
        }
    }

    @Override // p4.b1
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 9:
                return d0Var.j() ? c8.u9.b(new p4.n1(-100)) : h2.l0.g0((m9.y) ((p4.b1) this.b).j(d0Var, vVar, i7), new org.telegram.ui.Components.rm(d0Var, vVar, (p4.r0) this.c, 10));
            default:
                return d0Var.j() ? c8.u9.b(new p4.n1(-100)) : h2.l0.g0((m9.y) ((p4.b1) this.b).j(d0Var, vVar, i7), new org.telegram.ui.Components.rm(d0Var, vVar, (p4.a1) this.c, 11));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.s1 s1Var = (tg.s1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        s1Var.D0 = false;
        org.telegram.messenger.a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && s1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.web.t1(17, s1Var, bitmap), 2000L);
        } else {
            s1Var.E0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        hi.e eVar = (hi.e) this.c;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) r7Var.d));
        eVar.setLoading(false);
        wc1.d = null;
        org.telegram.ui.ActionBar.w2 w2Var = wc1.c;
        if (w2Var != null) {
            w2Var.dismiss();
            wc1.c = null;
        }
    }

    @Override // org.telegram.ui.vw
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        switch (this.a) {
            case 25:
                wg.f0 f0Var = (wg.f0) this.b;
                String str = (String) this.c;
                long j3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j3 = ((org.telegram.messenger.sr) arrayList.get(i11)).a;
                    f0Var.s1.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                bxVar.finishFragment();
                wg.h.h(j3);
                break;
            default:
                xg.e eVar = (xg.e) this.b;
                String str2 = (String) this.c;
                long j10 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j10 = ((org.telegram.messenger.sr) arrayList.get(i12)).a;
                    eVar.e.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    eVar = eVar;
                }
                bxVar.finishFragment();
                wg.h.h(j10);
                break;
        }
        return true;
    }
}
