package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ xd0(ee0 ee0Var, int i10) {
        this.a = i10;
        this.b = ee0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                ee0 ee0Var = this.b;
                ee0Var.postDelayed(new xd0(ee0Var, 2), 150L);
                xd0 xd0Var = ee0Var.S;
                ee0Var.removeCallbacks(xd0Var);
                ee0Var.postDelayed(xd0Var, 3000L);
                ee0Var.R = true;
                break;
            case 2:
                be0 be0Var = this.b.a;
                int i10 = 0;
                be0Var.e = false;
                be0Var.f[0].requestFocus();
                while (true) {
                    es[] esVarArr = be0Var.f;
                    if (i10 >= esVarArr.length) {
                        break;
                    } else {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                ee0 ee0Var2 = this.b;
                ee0Var2.postDelayed(new xd0(ee0Var2, 5), 150L);
                break;
            case 4:
                ee0 ee0Var3 = this.b;
                de0 de0Var = ee0Var3.Q;
                boolean z10 = false;
                ee0Var3.R = false;
                int i11 = 0;
                while (true) {
                    es[] esVarArr2 = ee0Var3.a.f;
                    if (i11 >= esVarArr2.length) {
                        if (de0Var.getCurrentView() != ee0Var3.e) {
                            de0Var.showNext();
                            FrameLayout frameLayout = ee0Var3.h;
                            if (ee0Var3.f.getVisibility() != 0 && ee0Var3.W.F != 3 && !ee0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                be0 be0Var2 = this.b.a;
                int i12 = 0;
                be0Var2.e = false;
                be0Var2.f[0].requestFocus();
                while (true) {
                    es[] esVarArr3 = be0Var2.f;
                    if (i12 >= esVarArr3.length) {
                        break;
                    } else {
                        esVarArr3[i12].i(0.0f);
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
                ee0 ee0Var4 = this.b;
                org.telegram.ui.Components.nj0 nj0Var = ee0Var4.w;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                be0 be0Var3 = ee0Var4.a;
                if (be0Var3 != null && be0Var3.f != null) {
                    be0Var3.setText("");
                    be0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
