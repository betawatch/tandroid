package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f80 b;

    public /* synthetic */ w80(f80 f80Var, int i10) {
        this.a = i10;
        this.b = f80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        f80 f80Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.E1;
                try {
                    f80Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.E1;
                try {
                    f80Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.E1;
                try {
                    f80Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
