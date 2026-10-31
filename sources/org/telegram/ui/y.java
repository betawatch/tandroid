package org.telegram.ui;

import android.view.WindowManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ y(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                try {
                    if (h4Var.f0.getParent() != null) {
                        ((WindowManager) h4Var.L.getSystemService("window")).removeView(h4Var.f0);
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            case 1:
                h4 h4Var2 = this.b;
                l0 l0Var = h4Var2.g0;
                if (l0Var != null && h4Var2.f0 != null) {
                    l0Var.setLayerType(0, null);
                    h4Var2.Z = 0;
                    org.telegram.messenger.i0.v1(h4Var2.L.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                this.b.d0();
                break;
            case 3:
                h4 h4Var3 = this.b;
                float currentProgress = 0.7f - h4Var3.h0.d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f7 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.a80 a80Var = h4Var3.h0.d0;
                    a80Var.a(true, a80Var.getCurrentProgress() + f7);
                    org.telegram.messenger.i0.h3(h4Var3.j0, 100L);
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.i0.g3(new y(this.b, 2));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new y(this.b, 2));
                break;
            case 6:
                this.b.K.a(true);
                break;
            case 7:
                this.b.K.a(true);
                break;
            case 8:
                this.b.a0();
                break;
            case 9:
                this.b.f0();
                break;
            case 10:
                h4 h4Var4 = this.b;
                l0 l0Var2 = h4Var4.g0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    h4Var4.Z = 0;
                    h4Var4.K();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    T.showAsSheet(new org.telegram.ui.web.p1(new p(this.b, 3)), i2Var);
                    break;
                }
                break;
        }
    }
}
