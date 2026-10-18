package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ y7 c;

    public /* synthetic */ t(b1 b1Var, y7 y7Var, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = y7Var;
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
                b1 b1Var = this.b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                y7 y7Var = this.c;
                if (!booleanValue) {
                    b1Var.x(y7Var, "home_screen_failed", b1.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    b1Var.x(y7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
