package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ da c;

    public /* synthetic */ s(d1 d1Var, da daVar, int i10) {
        this.a = i10;
        this.b = d1Var;
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
                d1 d1Var = this.b;
                d1Var.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                da daVar = this.c;
                if (!booleanValue) {
                    d1Var.y(daVar, "home_screen_failed", d1.B("UNSUPPORTED", "error"));
                    break;
                } else {
                    d1Var.y(daVar, "home_screen_added", null);
                    break;
                }
        }
    }
}
