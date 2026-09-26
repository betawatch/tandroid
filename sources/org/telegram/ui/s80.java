package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n80 b;

    public /* synthetic */ s80(n80 n80Var, int i10) {
        this.a = i10;
        this.b = n80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        n80 n80Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    n80Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    n80Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    n80Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
