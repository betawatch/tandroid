package ug;

import a8.r7;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tt0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements org.telegram.ui.ActionBar.r1, v5.e, u9.d, ua.a, OnFailureListener, j2.g, ob0, st0, tt0, g9.k {
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i7) {
        this.a = i7;
    }

    @Override // v5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 7:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        h6.m a10 = o5.i.a();
                        a10.I(rawQuery.getString(1));
                        a10.d = y5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a10.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a10.j());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 28:
                return ((f3.o) obj).a().getClass().getSimpleName();
            default:
                return h9.i0.q(h9.o.y(((x2.e0) obj).q().b, new x2.z0(1)));
        }
    }

    @Override // ua.a
    public void b(ua.b bVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // org.telegram.ui.Components.tt0
    public void c(Object obj, float f10) {
        wi.h hVar = (wi.h) obj;
        switch (this.a) {
            case 23:
                WindowManager.LayoutParams layoutParams = hVar.e;
                hVar.B = f10;
                layoutParams.x = (int) f10;
                hVar.r();
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = hVar.e;
                hVar.C = f10;
                layoutParams2.y = (int) f10;
                hVar.r();
                break;
        }
    }

    @Override // j2.g
    public j2.h createDataSource() {
        return new j2.b(org.telegram.messenger.t0.b);
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        va.d lambda$getComponents$0;
        switch (this.a) {
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 11:
                u9.m mVar = ExecutorsRegistrar.a;
                return v9.j.a;
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
        }
    }

    @Override // org.telegram.ui.Components.st0
    public float get(Object obj) {
        wi.h hVar = (wi.h) obj;
        switch (this.a) {
            case 22:
                return hVar.B;
            default:
                return hVar.C;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                u1Var.dismiss();
                break;
            case 1:
                u1Var.dismiss();
                break;
            case 17:
                break;
            case 20:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob0
    public String i(int i7) {
        switch (this.a) {
            case 18:
                return String.valueOf(i7);
            default:
                return String.format("%02d", Integer.valueOf(i7 * 5));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public /* synthetic */ x(androidx.emoji2.text.f fVar) {
        this.a = 13;
    }

    private final void a(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
    }
}
