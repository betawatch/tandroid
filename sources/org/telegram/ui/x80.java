package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r80 b;

    public /* synthetic */ x80(r80 r80Var, int i10) {
        this.a = i10;
        this.b = r80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        r80 r80Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    r80Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    r80Var.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
