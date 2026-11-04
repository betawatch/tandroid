package org.telegram.ui.web;

import ei.p7;
import org.json.JSONObject;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ p7 c;

    public /* synthetic */ q(w0 w0Var, p7 p7Var, int i3) {
        this.a = i3;
        this.b = w0Var;
        this.c = p7Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.x(this.c, "location_requested", (JSONObject) obj);
                break;
            case 1:
                this.b.x(this.c, "location_requested", (JSONObject) obj);
                break;
            default:
                w0 w0Var = this.b;
                w0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                p7 p7Var = this.c;
                if (!booleanValue) {
                    w0Var.x(p7Var, "home_screen_failed", w0.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    w0Var.x(p7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
