package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma0 b;

    public /* synthetic */ w80(ma0 ma0Var, int i10) {
        this.a = i10;
        this.b = ma0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ma0 ma0Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    ma0Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    ma0Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    ma0Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
