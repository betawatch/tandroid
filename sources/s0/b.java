package s0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.util.Base64;
import b8.ke;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import tg.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s3.g, t9.e, ta.a, i2.g, z, u5.e, t9.d {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i3) {
        this.a = i3;
    }

    @Override // tg.z
    public Typeface a() {
        switch (this.a) {
            case 20:
                return g0.o1("fonts/rmedium.ttf");
            case 21:
                return g0.o1("fonts/rmediumitalic.ttf");
            case 22:
                return Typeface.create("serif", 1);
            case 23:
                return g0.o1("fonts/rcondensedbold.ttf");
            case 24:
                return g0.o1("fonts/rmono.ttf");
            default:
                return g0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override // u5.e
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                k4.j a10 = n5.i.a();
                a10.I(rawQuery.getString(1));
                a10.c = x5.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a10.b = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a10.l());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // t9.e
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // i2.g
    public i2.h createDataSource() {
        return new i2.b(t0.b);
    }

    @Override // s3.g
    public boolean d(int i3, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        switch (this.a) {
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 28:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
        }
    }

    @Override // ta.a
    public void c(ta.b bVar) {
    }
}
