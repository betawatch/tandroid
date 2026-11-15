package org.telegram.ui.web;

import fi.i7;
import org.json.JSONObject;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ i7 c;

    public /* synthetic */ p(v0 v0Var, i7 i7Var, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = i7Var;
    }

    @Override // org.telegram.messenger.z10
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
                i7 i7Var = this.c;
                if (!booleanValue) {
                    v0Var.x(i7Var, "home_screen_failed", v0.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    v0Var.x(i7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
