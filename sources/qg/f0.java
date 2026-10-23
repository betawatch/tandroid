package qg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import rg.n2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements k0, androidx.car.app.utils.b, r9.e, qa.a, r9.d, OnFailureListener, s5.e, a2 {
    public final /* synthetic */ int a;

    public /* synthetic */ f0(int i10) {
        this.a = i10;
    }

    @Override // qg.k0
    public Typeface a() {
        return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
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

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        b2Var.dismiss();
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        ra.d lambda$getComponents$0;
        switch (this.a) {
            case 8:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(z5Var);
                return lambda$getComponents$0;
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                r9.n nVar = ExecutorsRegistrar.a;
                return s9.k.a;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = n2.r0;
    }

    @Override // r9.e
    public List v(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public /* synthetic */ f0(r.a aVar, int i10, w.b bVar) {
        this.a = 1;
    }

    @Override // qa.a
    public void h(qa.b bVar) {
    }
}
