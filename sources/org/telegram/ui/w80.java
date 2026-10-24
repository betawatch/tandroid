package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
