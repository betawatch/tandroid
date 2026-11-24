// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class zq2 implements ds9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zq2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ds9
    public final Bundle c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                br2 br2Var = ((hr2) obj).x;
                br2Var.getClass();
                HashMap hashMap = br2Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(br2Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) br2Var.g.clone());
                return bundle;
            case 1:
                gp4 gp4Var = (gp4) obj;
                while (gp4.v(gp4Var.u())) {
                }
                gp4Var.L.e(u26.ON_STOP);
                return new Bundle();
            case 2:
                return ((hq4) obj).Y();
            default:
                return xr9.a((xr9) obj);
        }
    }
}
