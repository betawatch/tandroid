package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ a1 c;

    public /* synthetic */ s(c1 c1Var, a1 a1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = a1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.z(this.c, "location_requested", (JSONObject) obj);
                break;
            case 1:
                this.b.z(this.c, "location_requested", (JSONObject) obj);
                break;
            default:
                c1 c1Var = this.b;
                c1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a1 a1Var = this.c;
                if (!booleanValue) {
                    c1Var.z(a1Var, "home_screen_failed", c1.B("UNSUPPORTED", "error"));
                    break;
                } else {
                    c1Var.z(a1Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
