package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ n9 c;

    public /* synthetic */ r(b1 b1Var, n9 n9Var, int i10) {
        this.a = i10;
        this.b = b1Var;
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
                b1 b1Var = this.b;
                b1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                n9 n9Var = this.c;
                if (!booleanValue) {
                    b1Var.x(n9Var, "home_screen_failed", b1.A("UNSUPPORTED", "error"));
                    break;
                } else {
                    b1Var.x(n9Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
