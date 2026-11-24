// default package

import android.content.Context;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uha {
    public static final xq2 b;
    public final Context a;

    static {
        wq2 b2 = xq2.b(uha.class);
        b2.a(if3.b(cg7.class));
        b2.a(if3.b(Context.class));
        b2.f = new h8d((byte) 4);
        b = b2.b();
    }

    public uha(Context context) {
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
