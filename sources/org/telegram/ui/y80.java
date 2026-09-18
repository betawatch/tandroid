package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa0 b;

    public /* synthetic */ y80(oa0 oa0Var, int i10) {
        this.a = i10;
        this.b = oa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        oa0 oa0Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    oa0Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    oa0Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    oa0Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
