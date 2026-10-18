package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b80 b;

    public /* synthetic */ s80(b80 b80Var, int i10) {
        this.a = i10;
        this.b = b80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        b80 b80Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                try {
                    b80Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.C1;
                try {
                    b80Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.C1;
                try {
                    b80Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
