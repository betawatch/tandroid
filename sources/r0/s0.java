package r0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import rg.p2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements r9.e, qa.a, r9.d, OnFailureListener, s5.e, z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ s0(int i10) {
        this.a = i10;
    }

    @Override // s5.e
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                androidx.biometric.e a2 = l5.i.a();
                a2.v(rawQuery.getString(1));
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

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 27:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // r9.d
    public Object n2(z5 z5Var) {
        ra.d lambda$getComponents$0;
        switch (this.a) {
            case 4:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(z5Var);
                return lambda$getComponents$0;
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                r9.n nVar = ExecutorsRegistrar.a;
                return s9.l.a;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = p2.r0;
    }

    @Override // r9.e
    public List w(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // qa.a
    public void h(qa.b bVar) {
    }
}
