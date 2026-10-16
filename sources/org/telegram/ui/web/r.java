package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ n9 c;

    public /* synthetic */ r(c1 c1Var, n9 n9Var, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = n9Var;
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
                c1 c1Var = this.b;
                c1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                n9 n9Var = this.c;
                if (!booleanValue) {
                    c1Var.x(n9Var, "home_screen_failed", c1.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    c1Var.x(n9Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
