package org.telegram.ui.web;

import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ j7 c;

    public /* synthetic */ s(c1 c1Var, j7 j7Var, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = j7Var;
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
                j7 j7Var = this.c;
                if (!booleanValue) {
                    c1Var.z(j7Var, "home_screen_failed", c1.B("UNSUPPORTED", "error"));
                    break;
                } else {
                    c1Var.z(j7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
