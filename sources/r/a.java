package r;

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
import l5.i;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import r9.e;
import r9.n;
import rg.m2;
import s9.k;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements androidx.car.app.utils.b, e, qa.a, r9.d, OnFailureListener, s5.e, a2 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // s5.e
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                androidx.biometric.e a2 = i.a();
                a2.v(rawQuery.getString(1));
                a2.d = v5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a2.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a2.g());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 28:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        ra.d lambda$getComponents$0;
        switch (this.a) {
            case 7:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(z5Var);
                return lambda$getComponents$0;
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                n nVar = ExecutorsRegistrar.a;
                return k.a;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = m2.r0;
    }

    @Override // r9.e
    public List v(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public /* synthetic */ a(b bVar, int i10, w.b bVar2) {
        this.a = 0;
    }

    @Override // qa.a
    public void h(qa.b bVar) {
    }
}
