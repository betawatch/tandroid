package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ da c;

    public /* synthetic */ r(c1 c1Var, da daVar, int i10) {
        this.a = i10;
        this.b = c1Var;
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
                c1 c1Var = this.b;
                c1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.c;
                if (!booleanValue) {
                    c1Var.y(daVar, "home_screen_failed", c1.B("UNSUPPORTED", "error"));
                    break;
                } else {
                    c1Var.y(daVar, "home_screen_added", null);
                    break;
                }
        }
    }
}
