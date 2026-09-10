package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;

    public /* synthetic */ zd0(ge0 ge0Var, int i10) {
        this.a = i10;
        this.b = ge0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                ge0 ge0Var = this.b;
                ge0Var.postDelayed(new zd0(ge0Var, 2), 150L);
                zd0 zd0Var = ge0Var.S;
                ge0Var.removeCallbacks(zd0Var);
                ge0Var.postDelayed(zd0Var, 3000L);
                ge0Var.R = true;
                break;
            case 2:
                de0 de0Var = this.b.a;
                int i10 = 0;
                de0Var.e = false;
                de0Var.f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr = de0Var.f;
                    if (i10 >= hsVarArr.length) {
                        break;
                    } else {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                ge0 ge0Var2 = this.b;
                ge0Var2.postDelayed(new zd0(ge0Var2, 5), 150L);
                break;
            case 4:
                ge0 ge0Var3 = this.b;
                fe0 fe0Var = ge0Var3.Q;
                boolean z10 = false;
                ge0Var3.R = false;
                int i11 = 0;
                while (true) {
                    hs[] hsVarArr2 = ge0Var3.a.f;
                    if (i11 >= hsVarArr2.length) {
                        if (fe0Var.getCurrentView() != ge0Var3.e) {
                            fe0Var.showNext();
                            FrameLayout frameLayout = ge0Var3.h;
                            if (ge0Var3.f.getVisibility() != 0 && ge0Var3.W.F != 3 && !ge0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        hsVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                de0 de0Var2 = this.b.a;
                int i12 = 0;
                de0Var2.e = false;
                de0Var2.f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr3 = de0Var2.f;
                    if (i12 >= hsVarArr3.length) {
                        break;
                    } else {
                        hsVarArr3[i12].i(0.0f);
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
                ge0 ge0Var4 = this.b;
                org.telegram.ui.Components.kj0 kj0Var = ge0Var4.w;
                kj0Var.getAnimatedDrawable().N(0, false, false);
                kj0Var.d();
                de0 de0Var3 = ge0Var4.a;
                if (de0Var3 != null && de0Var3.f != null) {
                    de0Var3.setText("");
                    de0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
