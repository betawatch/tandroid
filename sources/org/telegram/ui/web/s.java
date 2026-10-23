package org.telegram.ui.web;

import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ z7 c;

    public /* synthetic */ s(a1 a1Var, z7 z7Var, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = z7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.x(this.c, "location_requested", (JSONObject) obj);
                break;
            case 1:
                this.b.x(this.c, "location_requested", (JSONObject) obj);
                break;
            default:
                a1 a1Var = this.b;
                a1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                z7 z7Var = this.c;
                if (!booleanValue) {
                    a1Var.x(z7Var, "home_screen_failed", a1.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    a1Var.x(z7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
