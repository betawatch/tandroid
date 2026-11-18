package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ GeolocationPermissions.Callback c;
    public final /* synthetic */ String d;

    public /* synthetic */ l0(p0 p0Var, GeolocationPermissions.Callback callback, String str, int i7) {
        this.a = i7;
        this.b = p0Var;
        this.c = callback;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                if (p0Var.a != null) {
                    p0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.c;
                    String str = this.d;
                    if (!booleanValue) {
                        callback.invoke(str, false, false);
                        break;
                    } else {
                        v0.a(p0Var.e.R, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new l0(p0Var, callback, str, 1));
                        break;
                    }
                }
                break;
            default:
                p0 p0Var2 = this.b;
                p0Var2.getClass();
                this.c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    p0Var2.e.R.U = true;
                    break;
                }
                break;
        }
    }
}
