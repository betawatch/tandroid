package sb;

import android.content.Context;
import b2.n0;
import java.util.UUID;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k {
    public static final s9.a b;
    public final Context a;

    static {
        n0 a2 = s9.a.a(k.class);
        a2.a(s9.k.a(g.class));
        a2.a(s9.k.a(Context.class));
        a2.f = new u7.s(22);
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
