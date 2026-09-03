package org.telegram.ui.web;

import android.webkit.GeolocationPermissions;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ GeolocationPermissions.Callback c;
    public final /* synthetic */ String d;

    public /* synthetic */ o0(u0 u0Var, GeolocationPermissions.Callback callback, String str, int i10) {
        this.a = i10;
        this.b = u0Var;
        this.c = callback;
        this.d = str;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.a != null) {
                    u0Var.a = null;
                    boolean booleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback = this.c;
                    String str = this.d;
                    if (!booleanValue) {
                        callback.invoke(str, false, false);
                        break;
                    } else {
                        a1.a(u0Var.e.N, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new o0(u0Var, callback, str, 1));
                        break;
                    }
                }
                break;
            default:
                u0 u0Var2 = this.b;
                u0Var2.getClass();
                this.c.invoke(this.d, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    u0Var2.e.N.Q = true;
                    break;
                }
                break;
        }
    }
}
