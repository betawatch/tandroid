package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ GeolocationPermissions.Callback c;
    public final /* synthetic */ String d;

    public /* synthetic */ r0(w0 w0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.a = i10;
        this.b = w0Var;
        this.c = callback;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                if (w0Var.a != null) {
                    w0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.c;
                    String str = this.d;
                    if (!booleanValue) {
                        callback.invoke(str, false, false);
                        break;
                    } else {
                        d1.a(w0Var.e.Q, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new r0(w0Var, callback, str, 1));
                        break;
                    }
                }
                break;
            default:
                w0 w0Var2 = this.b;
                w0Var2.getClass();
                this.c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    w0Var2.e.Q.T = true;
                    break;
                }
                break;
        }
    }
}
