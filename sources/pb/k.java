package pb;

import android.content.Context;
import e2.j0;
import java.util.UUID;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class k {
    public static final u9.a b;
    public final Context a;

    static {
        j0 a10 = u9.a.a(k.class);
        a10.a(u9.i.a(g.class));
        a10.a(u9.i.a(Context.class));
        a10.f = new qb.a(21);
        b = a10.b();
    }

    public k(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
