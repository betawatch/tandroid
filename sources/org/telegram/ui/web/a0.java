package org.telegram.ui.web;

import a8.wa;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import bi.f2;
import bi.l5;
import c8.s9;
import com.google.android.gms.tasks.OnFailureListener;
import h9.h2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.ez;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jl0;
import org.telegram.ui.tl0;
import org.telegram.ui.tw;
import org.telegram.ui.z91;
import org.telegram.ui.zw;
import zh.c2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements org.telegram.ui.ActionBar.r1, p4.l0, h2.j, p4.a1, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.b, v5.e, jl0, tw, f3.r, l5, a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean N(zw zwVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // bi.l5
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z9) {
        zh.z1 z1Var = (zh.z1) this.b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
        up0 up0Var = z1Var.a;
        z1Var.e.l.remove(savedStarGift);
        z1Var.f(true);
        int i7 = z1Var.b;
        if (j3 == p10.i(i7).e()) {
            gc a02 = gc.a0(up0Var.a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String M0 = id.M0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            bc O = a02.O(document, M0, id.a0(null, null, 2131752888, jg.g.m(tL_starGiftUnique.num, ',', sb2)));
            O.r = false;
            O.j();
        } else {
            bc O2 = gc.a0(up0Var.a).O(tL_starGiftUnique.getDocument(), id.M0(2131752885, null), id.a0(null, null, 2131752886, m5.s(i7, j3)));
            O2.r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.v0.c(true);
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                p4.c1 c1Var = (p4.c1) this.b;
                e2.q1 q1Var = (e2.q1) this.c;
                p4.g1 g1Var = (p4.g1) obj;
                c1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) c1Var.d.n.get(n1Var.a.b);
                        if (m1Var == null || n1Var.a.a != m1Var.a) {
                            c10.a(n1Var);
                        } else {
                            c10.a(new e2.n1(m1Var, n1Var.b));
                        }
                    }
                    q1Var = c10.b();
                }
                g1Var.q0(q1Var);
                break;
            case 5:
                p4.c1 c1Var2 = (p4.c1) this.b;
                p4.v vVar = (p4.v) this.c;
                p4.d0 d0Var = (p4.d0) c1Var2.a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    break;
                }
                break;
            case 6:
                p4.c1 c1Var3 = (p4.c1) this.b;
                Surface surface = (Surface) this.c;
                p4.g1 g1Var2 = (p4.g1) obj;
                ((p4.d0) c1Var3.a.get()).getClass();
                if (surface != null) {
                    p4.b1 b1Var = new p4.b1(surface);
                    c1Var3.i = b1Var;
                    g1Var2.S(b1Var);
                    break;
                } else {
                    g1Var2.S(null);
                    c1Var3.i = null;
                    break;
                }
            default:
                wa waVar = (wa) this.b;
                ((x2.j0) obj).d(waVar.b, (x2.f0) waVar.c, (x2.b0) this.c);
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

    @Override // org.telegram.ui.jl0
    public void b(int i7) {
        switch (this.a) {
            case 19:
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
                c20 c20Var = (c20) this.b;
                c20 c20Var2 = (c20) this.c;
                if (i7 != 1) {
                    if (i7 != 3) {
                        c20Var2.a(null);
                        break;
                    }
                } else {
                    c20Var.a(null);
                    break;
                }
                break;
        }
    }

    @Override // ua.a
    public void c(ua.b bVar) {
        ua.a aVar = (ua.a) this.b;
        ua.a aVar2 = (ua.a) this.c;
        aVar.c(bVar);
        aVar2.c(bVar);
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i7 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // u2.v
    public int d(Object obj) {
        Context context = (Context) this.b;
        e2.u uVar = (e2.u) this.c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.b;
        return ((str.equals(uVar.s) || str.equals(u2.w.c(uVar))) && oVar.c(context, uVar, false) && oVar.d(uVar)) ? 1 : 0;
    }

    @Override // f3.r
    public f3.o[] e(Uri uri, Map map) {
        x2.p pVar = (x2.p) this.b;
        e2.u uVar = (e2.u) this.c;
        return new f3.o[]{pVar.c.w(uVar) ? new c4.h(pVar.c.l(uVar), null) : new n3.a(uVar)};
    }

    @Override // p4.l0
    public void f(p4.v vVar) {
        switch (this.a) {
            case 2:
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
                    p4.g1 g1Var = m0Var.h.t;
                    if (g1Var.p0(17)) {
                        e2.l1 y02 = g1Var.y0();
                        e2.k1 k1Var = new e2.k1();
                        for (int i7 = 0; i7 < y02.o(); i7++) {
                            if (TextUtils.equals(y02.m(i7, k1Var, 0L).c.a, str)) {
                                g1Var.Q(i7);
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

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = qp.s1(x0Var.M).q1(x0Var.U);
                ConnectionsManager.getInstance(x0Var.M).sendRequest(allowsendmessage, new f2(x0Var, strArr, u1Var, 20));
                break;
            case 1:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 14:
                ug.i0 i0Var = (ug.i0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                i0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = qp.i1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(i0Var.a).sendRequest(tL_channels_updateUsername, new ug.u(i0Var, 1), 64);
                }
                break;
            case 17:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                wg.r0 r0Var = (wg.r0) this.c;
                atomicBoolean.set(true);
                r0Var.run();
                break;
            case 18:
                ((wg.u) this.b).a((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
            case 26:
                zh.l lVar = (zh.l) this.b;
                z5 z5Var = (z5) this.c;
                try {
                    int parseInt = Integer.parseInt(z5Var.getText().toString().trim());
                    lVar.g1(parseInt);
                    lVar.X1.setValue(parseInt);
                    u1Var.dismiss();
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.F3(z5Var);
                    a8.g(th2, true);
                    return;
                }
            default:
                zh.n1 n1Var = (zh.n1) this.b;
                c20 c20Var = (c20) this.c;
                String obj = n1Var.getText().toString();
                if (obj.length() <= 0 || obj.length() > 12) {
                    org.telegram.messenger.g0.F3(n1Var);
                    break;
                } else {
                    c20Var.a(obj);
                    u1Var.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // w5.b
    public Object h() {
        switch (this.a) {
            case 11:
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

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c2 c2Var = (c2) this.b;
        fi.d dVar = (fi.d) this.c;
        View view = (View) obj2;
        long j3 = ((TL_stars.SavedStarGift) ((x31) obj).G).gift.id;
        if (c2Var.l1 == j3) {
            c2Var.l1 = 0L;
        } else {
            c2Var.l1 = j3;
        }
        dVar.setEnabled(c2Var.l1 != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof tl0) {
                    tl0 tl0Var = (tl0) childAt;
                    tl0Var.b(c2Var.l1 == tl0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // p4.a1
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 7:
                return d0Var.j() ? s9.b(new p4.m1(-100)) : h2.m0.g0((m9.y) ((p4.a1) this.b).l(d0Var, vVar, i7), new gr(d0Var, vVar, (p4.r0) this.c, 9));
            default:
                return d0Var.j() ? s9.b(new p4.m1(-100)) : h2.m0.g0((m9.y) ((p4.a1) this.b).l(d0Var, vVar, i7), new gr(d0Var, vVar, (p4.z0) this.c, 10));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        tg.n1 n1Var = (tg.n1) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        n1Var.B0 = false;
        a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new s(22, n1Var, bitmap), 2000L);
        } else {
            n1Var.C0 = true;
        }
    }

    @Override // org.telegram.ui.tw
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        switch (this.a) {
            case 21:
                wg.g0 g0Var = (wg.g0) this.b;
                String str = (String) this.c;
                long j3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j3 = ((xr) arrayList.get(i11)).a;
                    g0Var.r1.getSendMessagesHelper().r0(ez.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                zwVar.finishFragment();
                wg.h.h(j3);
                break;
            default:
                xg.f fVar = (xg.f) this.b;
                String str2 = (String) this.c;
                long j10 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j10 = ((xr) arrayList.get(i12)).a;
                    fVar.e.getSendMessagesHelper().r0(ez.b(str2, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    fVar = fVar;
                }
                zwVar.finishFragment();
                wg.h.h(j10);
                break;
        }
        return true;
    }
}
