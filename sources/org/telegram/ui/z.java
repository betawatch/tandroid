package org.telegram.ui;

import android.view.WindowManager;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ z(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                try {
                    if (g4Var.g0.getParent() != null) {
                        ((WindowManager) g4Var.M.getSystemService("window")).removeView(g4Var.g0);
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 1:
                g4 g4Var2 = this.b;
                k0 k0Var = g4Var2.h0;
                if (k0Var != null && g4Var2.g0 != null) {
                    k0Var.setLayerType(0, null);
                    g4Var2.a0 = 0;
                    org.telegram.messenger.g0.v1(g4Var2.M.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                this.b.d0();
                break;
            case 3:
                g4 g4Var3 = this.b;
                float currentProgress = 0.7f - g4Var3.i0.e0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f10 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.x70 x70Var = g4Var3.i0.e0;
                    x70Var.a(true, x70Var.getCurrentProgress() + f10);
                    org.telegram.messenger.g0.h3(g4Var3.k0, 100L);
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.g3(new z(this.b, 2));
                break;
            case 5:
                org.telegram.messenger.g0.g3(new z(this.b, 2));
                break;
            case 6:
                this.b.L.a(true);
                break;
            case 7:
                this.b.L.a(true);
                break;
            case 8:
                this.b.a0();
                break;
            case 9:
                this.b.f0();
                break;
            case 10:
                g4 g4Var4 = this.b;
                k0 k0Var2 = g4Var4.h0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    g4Var4.a0 = 0;
                    g4Var4.K();
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                    e2Var.a = true;
                    T.showAsSheet(new org.telegram.ui.web.n1(new q(this.b, 3)), e2Var);
                    break;
                }
                break;
        }
    }
}
