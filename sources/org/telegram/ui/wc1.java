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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc1 implements OnSuccessListener, org.telegram.ui.ActionBar.r1, p4.l0, h2.j, p4.c1, qi.m, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.b, v5.e, ll0, ww, f3.r {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wc1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // qi.m
    public void a(ji.j jVar) {
        switch (this.a) {
            case 11:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.sv0((SpannableString) this.b, jVar, (oi.s2) this.c, 25));
                break;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.sv0((SpannableString) this.b, jVar, (di.o9) this.c, 26));
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                p4.e1 e1Var = (p4.e1) this.b;
                e2.q1 q1Var = (e2.q1) this.c;
                p4.i1 i1Var = (p4.i1) obj;
                e1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h9.h2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) e1Var.d.n.get(n1Var.a.b);
                        if (m1Var == null || n1Var.a.a != m1Var.a) {
                            c10.a(n1Var);
                        } else {
                            c10.a(new e2.n1(m1Var, n1Var.b));
                        }
                    }
                    q1Var = c10.b();
                }
                i1Var.q0(q1Var);
                break;
            case 7:
                p4.e1 e1Var2 = (p4.e1) this.b;
                p4.v vVar = (p4.v) this.c;
                p4.d0 d0Var = (p4.d0) e1Var2.a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    break;
                }
                break;
            case 8:
                p4.e1 e1Var3 = (p4.e1) this.b;
                Surface surface = (Surface) this.c;
                p4.i1 i1Var2 = (p4.i1) obj;
                ((p4.d0) e1Var3.a.get()).getClass();
                if (surface != null) {
                    p4.d1 d1Var = new p4.d1(surface);
                    e1Var3.i = d1Var;
                    i1Var2.S(d1Var);
                    break;
                } else {
                    i1Var2.S(null);
                    e1Var3.i = null;
                    break;
                }
            default:
                a8.xa xaVar = (a8.xa) this.b;
                ((x2.k0) obj).b(xaVar.b, (x2.g0) xaVar.c, (x2.c0) this.c);
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

    @Override // u2.v
    public int c(Object obj) {
        Context context = (Context) this.b;
        e2.u uVar = (e2.u) this.c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.b;
        return ((str.equals(uVar.s) || str.equals(u2.w.c(uVar))) && oVar.c(context, uVar, false) && oVar.d(uVar)) ? 1 : 0;
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i7 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // org.telegram.ui.ll0
    public void d(int i7) {
        switch (this.a) {
            case 23:
                wg.v vVar = (wg.v) this.b;
                wg.v vVar2 = (wg.v) this.c;
                if (i7 != 1) {
                    if (i7 != 3) {
                        vVar2.a(null);
                        break;
                    }
                } else {
                    vVar.a(null);
                    break;
                }
                break;
            default:
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.b;
                org.telegram.messenger.x10 x10Var2 = (org.telegram.messenger.x10) this.c;
                if (i7 != 1) {
                    if (i7 != 3) {
                        x10Var2.a(null);
                        break;
                    }
                } else {
                    x10Var.a(null);
                    break;
                }
                break;
        }
    }

    @Override // f3.r
    public f3.o[] e(Uri uri, Map map) {
        x2.q qVar = (x2.q) this.b;
        e2.u uVar = (e2.u) this.c;
        return new f3.o[]{qVar.c.H(uVar) ? new c4.h(qVar.c.j(uVar), null) : new n3.a(uVar)};
    }

    @Override // p4.l0
    public void f(p4.v vVar) {
        switch (this.a) {
            case 4:
                ((p4.d) this.c).f(((p4.m0) this.b).h.t);
                break;
            default:
                p4.m0 m0Var = (p4.m0) this.b;
                q4.h hVar = (q4.h) this.c;
                m0Var.getClass();
                String str = hVar.a;
                if (TextUtils.isEmpty(str)) {
                    h2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    p4.i1 i1Var = m0Var.h.t;
                    if (i1Var.p0(17)) {
                        e2.l1 y02 = i1Var.y0();
                        e2.k1 k1Var = new e2.k1();
                        for (int i7 = 0; i7 < y02.o(); i7++) {
                            if (TextUtils.equals(y02.m(i7, k1Var, 0L).c.a, str)) {
                                i1Var.Q(i7);
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
    public Object g() {
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

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.ui.web.m.d0((org.telegram.ui.web.m) this.b, (HashSet) this.c);
                break;
            case 2:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = org.telegram.messenger.mp.u1(v0Var.N).s1(v0Var.V);
                ConnectionsManager.getInstance(v0Var.N).sendRequest(allowsendmessage, new bi.m1(v0Var, strArr, u1Var, 23));
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
                ug.l0 l0Var = (ug.l0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                l0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = org.telegram.messenger.mp.k1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(l0Var.a).sendRequest(tL_channels_updateUsername, new ug.u(l0Var, 1), 64);
                }
                break;
            case 21:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                wg.r0 r0Var = (wg.r0) this.c;
                atomicBoolean.set(true);
                r0Var.run();
                break;
            default:
                ((wg.v) this.b).a((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
        }
    }

    @Override // p4.c1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 9:
                return d0Var.j() ? c8.t9.b(new p4.o1(-100)) : h2.l0.g0((m9.y) ((p4.c1) this.b).k(d0Var, vVar, i7), new org.telegram.ui.Components.rm(d0Var, vVar, (p4.r0) this.c, 10));
            default:
                return d0Var.j() ? c8.t9.b(new p4.o1(-100)) : h2.l0.g0((m9.y) ((p4.c1) this.b).k(d0Var, vVar, i7), new org.telegram.ui.Components.rm(d0Var, vVar, (p4.b1) this.c, 11));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.n1 n1Var = (tg.n1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        n1Var.C0 = false;
        org.telegram.messenger.a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new p4.o0(11, n1Var, bitmap), 2000L);
        } else {
            n1Var.D0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        hi.d dVar = (hi.d) this.c;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) r7Var.d));
        dVar.setLoading(false);
        yc1.d = null;
        org.telegram.ui.ActionBar.x2 x2Var = yc1.c;
        if (x2Var != null) {
            x2Var.dismiss();
            yc1.c = null;
        }
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        switch (this.a) {
            case 25:
                wg.g0 g0Var = (wg.g0) this.b;
                String str = (String) this.c;
                long j3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j3 = ((org.telegram.messenger.sr) arrayList.get(i11)).a;
                    g0Var.s1.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                cxVar.finishFragment();
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
                cxVar.finishFragment();
                wg.h.h(j10);
                break;
        }
        return true;
    }
}
