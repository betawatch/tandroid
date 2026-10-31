package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ GeolocationPermissions.Callback c;
    public final /* synthetic */ String d;

    public /* synthetic */ n0(s0 s0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = callback;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                if (s0Var.a != null) {
                    s0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.c;
                    String str = this.d;
                    if (!booleanValue) {
                        callback.invoke(str, false, false);
                        break;
                    } else {
                        z0.a(s0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new n0(s0Var, callback, str, 1));
                        break;
                    }
                }
                break;
            default:
                s0 s0Var2 = this.b;
                s0Var2.getClass();
                this.c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    s0Var2.e.Q.T = true;
                    break;
                }
                break;
        }
    }
}
