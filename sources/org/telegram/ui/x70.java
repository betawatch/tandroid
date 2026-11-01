package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y60 b;

    public /* synthetic */ x70(y60 y60Var, int i10) {
        this.a = i10;
        this.b = y60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        y60 y60Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    y60Var.run();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    y60Var.run();
                    break;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    y60Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
        }
    }
}
