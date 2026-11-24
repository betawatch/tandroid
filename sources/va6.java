// default package

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class va6 implements kaa {
    public final Bundle a;

    public va6(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // kaa
    public final Object a(px2 px2Var) {
        return g7c.a;
    }

    @Override // kaa
    public final Boolean b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // kaa
    public final ts3 c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new ts3(wge.c(bundle.getInt("firebase_sessions_sessions_restart_timeout"), xs3.d));
        }
        return null;
    }

    @Override // kaa
    public final Double d() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
