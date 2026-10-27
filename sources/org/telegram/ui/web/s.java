package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ x7 c;

    public /* synthetic */ s(a1 a1Var, x7 x7Var, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = x7Var;
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
                x7 x7Var = this.c;
                if (!booleanValue) {
                    a1Var.x(x7Var, "home_screen_failed", a1.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    a1Var.x(x7Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
