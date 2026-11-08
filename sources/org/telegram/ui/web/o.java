package org.telegram.ui.web;

import di.o7;
import org.json.JSONObject;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ o7 c;

    public /* synthetic */ o(x0 x0Var, o7 o7Var, int i7) {
        this.a = i7;
        this.b = x0Var;
        this.c = o7Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.x(this.c, "location_requested", (JSONObject) obj);
                break;
            case 1:
                this.b.x(this.c, "location_requested", (JSONObject) obj);
                break;
            default:
                x0 x0Var = this.b;
                x0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                o7 o7Var = this.c;
                if (!booleanValue) {
                    x0Var.x(o7Var, "home_screen_failed", x0.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    x0Var.x(o7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
