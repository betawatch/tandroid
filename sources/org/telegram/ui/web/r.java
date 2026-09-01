package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ r(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                a1Var.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    a1Var.v("home_screen_failed", a1.x("UNSUPPORTED", "error"));
                    break;
                } else {
                    a1Var.v("home_screen_added", null);
                    break;
                }
            case 1:
                this.b.v("location_requested", (JSONObject) obj);
                break;
            default:
                this.b.v("location_requested", (JSONObject) obj);
                break;
        }
    }
}
