package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h90 b;

    public /* synthetic */ v80(h90 h90Var, int i10) {
        this.a = i10;
        this.b = h90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        h90 h90Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    h90Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    h90Var.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
