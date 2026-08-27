package za;

import android.content.Context;
import java.util.UUID;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k {
    public static final z8.a b;
    public final Context a;

    static {
        ug.b a2 = z8.a.a(k.class);
        a2.a(z8.i.a(g.class));
        a2.a(z8.i.a(Context.class));
        a2.f = new w9.d(27);
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
