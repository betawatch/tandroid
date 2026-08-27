package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ r(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b;
                z0Var.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    z0Var.v("home_screen_failed", z0.x("UNSUPPORTED", "error"));
                    break;
                } else {
                    z0Var.v("home_screen_added", null);
                    break;
                }
            case 1:
                this.b.v("location_requested", (JSONObject) obj);
                break;
            default:
                this.b.v("location_requested", (JSONObject) obj);
                break;
        }
    }
}
