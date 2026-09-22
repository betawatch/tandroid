package r5;

import ai.l8;
import ai.m0;
import android.content.ClipData;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import c5.h;
import c5.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import e9.a1;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.i;
import m.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.t2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.i51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.vo0;
import r0.l1;
import r0.n;
import rg.k;
import rg.w1;
import s5.g;
import t0.f;
import t0.j;
import tg.d0;
import tg.u0;
import x2.m;
import xh.j0;
import xh.q1;
import yh.b4;
import yh.e0;
import yh.n3;
import yh.u5;
import yh.u7;
import yh.x7;
import za.a0;
import za.b0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements t5.b, f, pa.a, a2, al0, uh.a, Continuation, m, yf.m, n, BillingController.ProductDetailsResponseListenerLegacy, b5, le.d, Utilities.Callback5, vo0, i5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        View view = ((b4) this.b).b;
        if (view instanceof w0) {
            ((w0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.b5
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

    @Override // org.telegram.ui.vo0
    public void a(int i10) {
        switch (this.a) {
            case 23:
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
            case 24:
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
                d80 d80Var = (d80) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        d80Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    d80Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // i5.e
    public Object apply(Object obj) {
        ((ia) this.b).getClass();
        String e = b0.b.e((a0) obj);
        i.d(e, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(e));
        byte[] bytes = e.getBytes(xd.a.a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // x2.m
    public a1 b(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override // org.telegram.ui.Components.al0
    public void c(float f7, float f10, int i10, View view) {
        tg.a1.Q((tg.a1) this.b, view);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // yf.m
    public void e(long j3) {
        switch (this.a) {
            case 13:
                ((xh.d) this.b).a(j3, true);
                break;
            default:
                ((n3) this.b).h();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 4:
                ((u0) this.b).run();
                break;
            case 5:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                n2 R = LaunchActivity.R();
                if (R != null) {
                    d0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 6:
                ((t2) this.b).run();
                break;
            case 7:
                ((u0) this.b).run();
                break;
            case 14:
                ((l8) this.b).run();
                break;
            default:
                ((Utilities.Callback) this.b).run(b2Var.g(i10, true, true));
                break;
        }
    }

    @Override // t0.f
    public boolean h(j jVar, int i10, Bundle bundle) {
        r0.d dVar;
        s sVar = (s) this.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                jVar.a.d();
                Parcelable parcelable = (Parcelable) jVar.a.l();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.i iVar = jVar.a;
        ClipData clipData = new ClipData(iVar.getDescription(), new ClipData.Item(iVar.c()));
        if (i11 >= 31) {
            dVar = new j2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.b = clipData;
            eVar.c = 2;
            dVar = eVar;
        }
        dVar.b(iVar.f());
        dVar.setExtras(bundle);
        return r0.i0.i(sVar, dVar.build()) == null;
    }

    @Override // t5.b
    public Object i() {
        switch (this.a) {
            case 0:
                g gVar = (g) ((s5.c) ((da.b) this.b).i);
                SQLiteDatabase a2 = gVar.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar.b.q()).execute();
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return null;
                } catch (Throwable th2) {
                    a2.endTransaction();
                    throw th2;
                }
            default:
                t tVar = (t) this.b;
                Iterator it = ((Iterable) ((g) ((s5.d) tVar.c)).c(new r9.i(26))).iterator();
                while (it.hasNext()) {
                    ((lf.i) tVar.d).V((l5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // pa.a
    public void j(pa.b bVar) {
        t9.a aVar = (t9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((t9.a) bVar.get());
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(h hVar, List list) {
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
        AndroidUtilities.runOnUIThread(new w1(q1Var, 14));
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
        switch (this.a) {
            case 22:
                u5.b((u5) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            default:
                u7 u7Var = (u7) this.b;
                i51 i51Var = (i51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                u7Var.getClass();
                if (i51Var.G instanceof TL_stars.StarsTransaction) {
                    x7.h1(u7Var.getContext(), false, 0L, u7Var.c, (TL_stars.StarsTransaction) i51Var.G, u7Var.b);
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

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
