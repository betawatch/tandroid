package pb;

import android.content.Context;
import e2.j0;
import java.util.UUID;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k {
    public static final u9.a b;
    public final Context a;

    static {
        j0 a10 = u9.a.a(k.class);
        a10.a(u9.j.a(g.class));
        a10.a(u9.j.a(Context.class));
        a10.f = new w7.s(20, false);
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
