package r5;

import ai.m0;
import ai.m8;
import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import c5.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import e2.h;
import e9.a1;
import e9.f0;
import e9.i0;
import j2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import le.f;
import m.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.t2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.no0;
import r0.l1;
import r0.n;
import rg.k;
import rg.q1;
import tg.c0;
import tg.t0;
import tg.z0;
import x2.i;
import x2.m;
import xh.j0;
import xh.r1;
import yh.e0;
import yh.l3;
import yh.s5;
import yh.t7;
import yh.w7;
import yh.z3;
import z3.g;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements t5.b, t0.e, pa.a, z1, ll0, uh.a, Continuation, m, yf.m, n, BillingController.ProductDetailsResponseListenerLegacy, d5, le.e, Utilities.Callback5, no0, h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, f fVar) {
        View view = ((z3) this.b).b;
        if (view instanceof w0) {
            ((w0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.b;
        if (z10) {
            long j3 = i10;
            if (e0Var.I != j3) {
                e0Var.I = j3;
                e0Var.r.setText(e0.o(j3));
            }
            e0Var.n(true);
        }
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        ((j0) this.b).h.i(l1Var);
        return l1.b;
    }

    @Override // org.telegram.ui.no0
    public void a(int i10) {
        switch (this.a) {
            case 24:
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
            case 25:
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
                o80 o80Var = (o80) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        o80Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    o80Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 28:
                z3.h hVar = (z3.h) this.b;
                z3.a aVar = (z3.a) obj;
                g gVar = new g(aVar.b, ob.a.C2(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j3 = hVar.j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.b(gVar);
                    break;
                }
                break;
            default:
                ((f0) this.b).b((z3.a) obj);
                break;
        }
    }

    @Override // x2.m
    public a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        i iVar = (i) this.b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        z0.Q((z0) this.b, view);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // yf.m
    public void e(long j3) {
        switch (this.a) {
            case 14:
                ((xh.d) this.b).a(j3, true);
                break;
            default:
                ((l3) this.b).h();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        switch (this.a) {
            case 5:
                ((t0) this.b).run();
                break;
            case 6:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                m2 R = LaunchActivity.R();
                if (R != null) {
                    c0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 7:
                ((t2) this.b).run();
                break;
            case 8:
                ((t0) this.b).run();
                break;
            case 15:
                ((m8) this.b).run();
                break;
            default:
                ((Utilities.Callback) this.b).run(a2Var.g(i10, true, true));
                break;
        }
    }

    @Override // pa.a
    public void g(pa.b bVar) {
        t9.a aVar = (t9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((t9.a) bVar.get());
    }

    @Override // t5.b
    public Object i() {
        SQLiteDatabase a2;
        switch (this.a) {
            case 0:
                s5.h hVar = (s5.h) ((s5.d) this.b);
                long q6 = hVar.b.q() - hVar.d.d;
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(q6)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar.e(rawQuery.getInt(0), o5.c.c, rawQuery.getString(1));
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
            case 1:
                s5.h hVar2 = (s5.h) ((s5.c) ((da.b) this.b).i);
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar2.b.q()).execute();
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return null;
                } finally {
                }
            default:
                t tVar = (t) this.b;
                Iterator it = ((Iterable) ((s5.h) ((s5.d) tVar.c)).c(new s0.b(16))).iterator();
                while (it.hasNext()) {
                    ((la.h) tVar.d).V((l5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // t0.e
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        s sVar = (s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.a.d();
                Parcelable parcelable = (Parcelable) iVar.a.l();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.h hVar = iVar.a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i11 >= 31) {
            dVar = new j(clipData, 2);
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

    @Override // uh.a
    public void o(Canvas canvas, int i10) {
        uh.h hVar = (uh.h) this.b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        int i10;
        r1 r1Var = (r1) this.b;
        ArrayList arrayList = r1Var.n0;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            o oVar = (o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    k kVar = (k) obj;
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
            ((k) obj2).g = j3;
        }
        AndroidUtilities.runOnUIThread(new q1(r1Var, 15));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 23:
                s5.b((s5) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            default:
                t7 t7Var = (t7) this.b;
                v51 v51Var = (v51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                t7Var.getClass();
                if (v51Var.G instanceof TL_stars.StarsTransaction) {
                    w7.h1(t7Var.getContext(), false, 0L, t7Var.c, (TL_stars.StarsTransaction) v51Var.G, t7Var.b);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
