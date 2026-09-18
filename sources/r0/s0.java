package r0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements q9.d, a2, s5.f {
    public final /* synthetic */ int a;

    public /* synthetic */ s0(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        switch (this.a) {
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.a;
                return r9.j.a;
        }
    }

    @Override // s5.f
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                aa.a a2 = l5.i.a();
                a2.u(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a2.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a2.e());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }
}
