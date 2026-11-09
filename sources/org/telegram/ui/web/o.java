package org.telegram.ui.web;

import di.p7;
import org.json.JSONObject;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ p7 c;

    public /* synthetic */ o(x0 x0Var, p7 p7Var, int i7) {
        this.a = i7;
        this.b = x0Var;
        this.c = p7Var;
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
                p7 p7Var = this.c;
                if (!booleanValue) {
                    x0Var.x(p7Var, "home_screen_failed", x0.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    x0Var.x(p7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
