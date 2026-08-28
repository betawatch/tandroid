package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ q(y0 y0Var, int i9) {
        this.a = i9;
        this.b = y0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                y0 y0Var = this.b;
                y0Var.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    y0Var.v("home_screen_failed", y0.x("UNSUPPORTED", "error"));
                    break;
                } else {
                    y0Var.v("home_screen_added", null);
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
