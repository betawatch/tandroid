package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd0 b;

    public /* synthetic */ sd0(zd0 zd0Var, int i10) {
        this.a = i10;
        this.b = zd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                zd0 zd0Var = this.b;
                zd0Var.postDelayed(new sd0(zd0Var, 2), 150L);
                sd0 sd0Var = zd0Var.P;
                zd0Var.removeCallbacks(sd0Var);
                zd0Var.postDelayed(sd0Var, 3000L);
                zd0Var.O = true;
                break;
            case 2:
                wd0 wd0Var = this.b.a;
                int i10 = 0;
                wd0Var.e = false;
                wd0Var.f[0].requestFocus();
                while (true) {
                    cs[] csVarArr = wd0Var.f;
                    if (i10 >= csVarArr.length) {
                        break;
                    } else {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                zd0 zd0Var2 = this.b;
                zd0Var2.postDelayed(new sd0(zd0Var2, 5), 150L);
                break;
            case 4:
                zd0 zd0Var3 = this.b;
                yd0 yd0Var = zd0Var3.N;
                boolean z4 = false;
                zd0Var3.O = false;
                int i11 = 0;
                while (true) {
                    cs[] csVarArr2 = zd0Var3.a.f;
                    if (i11 >= csVarArr2.length) {
                        if (yd0Var.getCurrentView() != zd0Var3.e) {
                            yd0Var.showNext();
                            FrameLayout frameLayout = zd0Var3.h;
                            if (zd0Var3.f.getVisibility() != 0 && zd0Var3.T.C != 3 && !zd0Var3.M) {
                                z4 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z4, 1.0f, true);
                            break;
                        }
                    } else {
                        csVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                wd0 wd0Var2 = this.b.a;
                int i12 = 0;
                wd0Var2.e = false;
                wd0Var2.f[0].requestFocus();
                while (true) {
                    cs[] csVarArr3 = wd0Var2.f;
                    if (i12 >= csVarArr3.length) {
                        break;
                    } else {
                        csVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            case 6:
                this.b.q(true);
                break;
            case 7:
                this.b.r();
                break;
            default:
                zd0 zd0Var4 = this.b;
                org.telegram.ui.Components.lj0 lj0Var = zd0Var4.w;
                lj0Var.getAnimatedDrawable().L(0, false, false);
                lj0Var.d();
                wd0 wd0Var3 = zd0Var4.a;
                if (wd0Var3 != null && wd0Var3.f != null) {
                    wd0Var3.setText("");
                    wd0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
