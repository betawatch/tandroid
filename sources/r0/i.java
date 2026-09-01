package r0;

import android.content.Context;
import android.view.VelocityTracker;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i {
    public final Context a;
    public final org.telegram.ui.Cells.f1 b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {ConnectionsManager.DEFAULT_DATACENTER_ID, 0};

    public i(Context context, org.telegram.ui.Cells.f1 f1Var) {
        this.a = context;
        this.b = f1Var;
    }
}
