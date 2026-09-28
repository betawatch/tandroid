package qb;

import android.content.Context;
import b2.i0;
import java.util.UUID;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class k {
    public static final q9.a b;
    public final Context a;

    static {
        i0 a2 = q9.a.a(k.class);
        a2.a(q9.j.a(g.class));
        a2.a(q9.j.a(Context.class));
        a2.f = new na.d(20);
        b = a2.b();
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
