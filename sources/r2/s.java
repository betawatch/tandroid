package r2;

import ai.m0;
import ai.m8;
import android.content.ClipData;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.a1;
import e9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.t2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.v50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ro0;
import r0.l1;
import rg.s1;
import tg.c0;
import tg.t0;
import tg.z0;
import xh.j0;
import xh.q1;
import yh.a4;
import yh.f0;
import yh.m3;
import yh.u5;
import yh.z7;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements w, t5.b, t0.e, pa.a, a2, nl0, uh.a, Continuation, x2.m, yf.m, r0.n, BillingController.ProductDetailsResponseListenerLegacy, Utilities.Callback5, d5, le.d, ro0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        f0 f0Var = (f0) this.b;
        if (z10) {
            long j3 = i10;
            if (f0Var.I != j3) {
                f0Var.I = j3;
                f0Var.r.setText(f0.o(j3));
            }
            f0Var.n(true);
        }
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        ((j0) this.b).h.i(l1Var);
        return l1.b;
    }

    @Override // org.telegram.ui.ro0
    public void a(int i10) {
        switch (this.a) {
            case 27:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        callback2.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    callback2.run(Boolean.TRUE, null);
                    break;
                }
                break;
            case 28:
                m0 m0Var = (m0) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        m0Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    m0Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                r80 r80Var = (r80) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        r80Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    r80Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        View view = ((a4) this.b).b;
        if (view instanceof w0) {
            ((w0) view).I();
        } else {
            view.invalidate();
        }
    }

    @Override // x2.m
    public a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.b;
        e9.f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        z0.O((z0) this.b, view);
    }

    @Override // r2.w
    public int d(Object obj) {
        b2.s sVar = (b2.s) this.b;
        o oVar = (o) obj;
        String str = oVar.b;
        return ((str.equals(sVar.r) || str.equals(x.b(sVar))) && oVar.c(sVar, false) && oVar.d(sVar)) ? 1 : 0;
    }

    @Override // yf.m
    public void e(long j3) {
        switch (this.a) {
            case 16:
                ((xh.d) this.b).a(j3, true);
                break;
            default:
                ((m3) this.b).h();
                break;
        }
    }

    @Override // pa.a
    public void f(pa.b bVar) {
        t9.a aVar = (t9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((t9.a) bVar.get());
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 7:
                ((t0) this.b).run();
                break;
            case 8:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                n2 R = LaunchActivity.R();
                if (R != null) {
                    c0.R(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 9:
                ((t2) this.b).run();
                break;
            case 10:
                ((t0) this.b).run();
                break;
            case 17:
                ((m8) this.b).run();
                break;
            default:
                ((Utilities.Callback) this.b).run(b2Var.g(i10, true, true));
                break;
        }
    }

    @Override // t5.b
    public Object h() {
        SQLiteDatabase a2;
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 1:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, z10);
                sVar.c = null;
                sVar.d = new ArrayList();
                sVar.e = null;
                sVar.b = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new v50(gVar, hashMap, sVar, 9));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 2:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long q6 = gVar2.b.q() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(q6)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar2.e(rawQuery.getInt(0), o5.c.c, rawQuery.getString(1));
                        } catch (Throwable th2) {
                            rawQuery.close();
                            throw th2;
                        }
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 3:
                s5.g gVar3 = (s5.g) ((s5.c) ((da.b) obj).i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.b.q()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) obj;
                Iterator it = ((Iterable) ((s5.g) ((s5.d) sVar2.c)).c(new s0.b(18))).iterator();
                while (it.hasNext()) {
                    ((la.h) sVar2.d).V((l5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // t0.e
    public boolean l(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.d();
                Parcelable parcelable = (Parcelable) iVar.a.j();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        t0.h hVar = iVar.a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i11 >= 31) {
            dVar = new j2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.b = clipData;
            eVar.c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        return r0.i0.i(sVar, dVar.build()) == null;
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        int i10;
        q1 q1Var = (q1) this.b;
        ArrayList arrayList = q1Var.n0;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.o oVar = (c5.o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    rg.k kVar = (rg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.c)) {
                        kVar.h = oVar;
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((rg.k) obj2).g = j3;
        }
        AndroidUtilities.runOnUIThread(new s1(q1Var, 15));
    }

    @Override // uh.a
    public void p(Canvas canvas, int i10) {
        uh.h hVar = (uh.h) this.b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        d6 d6Var;
        switch (this.a) {
            case 21:
                yh.g gVar = (yh.g) this.b;
                h61 h61Var = (h61) obj;
                yh.h hVar = gVar.r;
                if (!(h61Var.G instanceof TL_stars.StarsTransaction)) {
                    if (gVar.h) {
                        gVar.h = false;
                        gVar.a();
                        break;
                    }
                } else {
                    Context context = gVar.getContext();
                    long j3 = hVar.b;
                    i10 = ((n2) hVar).currentAccount;
                    TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) h61Var.G;
                    d6Var = ((n2) hVar).resourceProvider;
                    z7.n1(context, true, j3, i10, starsTransaction, d6Var);
                    break;
                }
                break;
            default:
                u5.b((u5) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
