package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class s0 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ t0 a;

    public s0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i10, boolean z10) {
        t0 t0Var = this.a;
        boolean m10 = t0Var.m();
        t0Var.y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != t0Var.m()) {
            AndroidUtilities.runOnUIThread(new xh.x(this, 20));
        }
    }
}
