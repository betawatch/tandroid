package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ x0 c;

    public /* synthetic */ p(z0 z0Var, x0 x0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
        this.c = x0Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.y(this.c, "location_requested", (JSONObject) obj);
                break;
            case 1:
                this.b.y(this.c, "location_requested", (JSONObject) obj);
                break;
            default:
                z0 z0Var = this.b;
                z0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x0 x0Var = this.c;
                if (!booleanValue) {
                    z0Var.y(x0Var, "home_screen_failed", z0.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    z0Var.y(x0Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
