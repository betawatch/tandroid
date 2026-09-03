package r0;

import android.content.Context;
import android.view.VelocityTracker;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
