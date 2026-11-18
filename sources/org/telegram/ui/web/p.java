package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ f7 c;

    public /* synthetic */ p(v0 v0Var, f7 f7Var, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = f7Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.x(this.c, "location_requested", (JSONObject) obj);
                break;
            case 1:
                this.b.x(this.c, "location_requested", (JSONObject) obj);
                break;
            default:
                v0 v0Var = this.b;
                v0Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                f7 f7Var = this.c;
                if (!booleanValue) {
                    v0Var.x(f7Var, "home_screen_failed", v0.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    v0Var.x(f7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
