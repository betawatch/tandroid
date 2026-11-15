package org.telegram.ui.web;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class t0 {
    public final String a;
    public final String b;
    public final int c;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public t0(JSONObject jSONObject) {
        this.c = -1;
        this.a = jSONObject.getString("id");
        String string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.c = j6.q7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.b = hd.M0(2131752589, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.b = hd.M0(2131747831, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.b = hd.M0(2131752041, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.b = jSONObject.getString("text");
    }
}
