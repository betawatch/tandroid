package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ da c;

    public /* synthetic */ r(b1 b1Var, da daVar, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = daVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.y(this.c, "location_requested", (JSONObject) obj);
                break;
            case 1:
                this.b.y(this.c, "location_requested", (JSONObject) obj);
                break;
            default:
                b1 b1Var = this.b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.c;
                if (!booleanValue) {
                    b1Var.y(daVar, "home_screen_failed", b1.B("UNSUPPORTED", "error"));
                    break;
                } else {
                    b1Var.y(daVar, "home_screen_added", null);
                    break;
                }
        }
    }
}
