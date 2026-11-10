package v0;

import a8.r7;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import e2.m1;
import h9.i0;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.db0;
import x2.d0;
import x2.y0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements v5.e, u9.d, ua.a, OnFailureListener, j2.g, r1, db0, g9.k, h2.j, t3.g {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i7) {
        this.a = i7;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((y0) obj).b.release();
    }

    @Override // v5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        h6.m a10 = o5.i.a();
                        a10.F(rawQuery.getString(1));
                        a10.d = y5.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a10.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a10.h());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 22:
                return ((f3.o) obj).a().getClass().getSimpleName();
            case 23:
                return i0.q(h9.o.y(((d0) obj).o().b, new j(25)));
            case 25:
                return Integer.valueOf(((m1) obj).c);
            case 28:
                return Long.valueOf(((c4.a) obj).b);
            default:
                return Long.valueOf(((c4.a) obj).c);
        }
    }

    @Override // t3.g
    public boolean b(int i7, int i10, int i11, int i12, int i13) {
        if (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i7 == 2)) {
            return true;
        }
        if (i10 == 77 && i11 == 76 && i12 == 76) {
            return i13 == 84 || i7 == 2;
        }
        return false;
    }

    @Override // ua.a
    public void c(ua.b bVar) {
        switch (this.a) {
            case 11:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // j2.g
    public j2.h createDataSource() {
        return new j2.b(t0.b);
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        va.d lambda$getComponents$0;
        switch (this.a) {
            case 6:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 9:
                u9.n nVar = ExecutorsRegistrar.a;
                return v9.j.a;
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 15:
                break;
            case 18:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        switch (this.a) {
            case 16:
                return String.valueOf(i7);
            default:
                return String.format("%02d", Integer.valueOf(i7 * 5));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public /* synthetic */ j(androidx.emoji2.text.f fVar) {
        this.a = 11;
    }

    private final void d(u1 u1Var, int i7) {
    }
}
