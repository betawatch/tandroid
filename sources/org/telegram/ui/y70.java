package org.telegram.ui;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f70 b;

    public /* synthetic */ y70(f70 f70Var, int i10) {
        this.a = i10;
        this.b = f70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        f70 f70Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    f70Var.run();
                    break;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    f70Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
        }
    }
}
