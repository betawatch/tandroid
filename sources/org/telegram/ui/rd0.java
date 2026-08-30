package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd0 b;

    public /* synthetic */ rd0(yd0 yd0Var, int i10) {
        this.a = i10;
        this.b = yd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                yd0 yd0Var = this.b;
                yd0Var.postDelayed(new rd0(yd0Var, 2), 150L);
                rd0 rd0Var = yd0Var.P;
                yd0Var.removeCallbacks(rd0Var);
                yd0Var.postDelayed(rd0Var, 3000L);
                yd0Var.O = true;
                break;
            case 2:
                vd0 vd0Var = this.b.a;
                int i10 = 0;
                vd0Var.e = false;
                vd0Var.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr = vd0Var.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                yd0 yd0Var2 = this.b;
                yd0Var2.postDelayed(new rd0(yd0Var2, 5), 150L);
                break;
            case 4:
                yd0 yd0Var3 = this.b;
                xd0 xd0Var = yd0Var3.N;
                boolean z4 = false;
                yd0Var3.O = false;
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr2 = yd0Var3.a.f;
                    if (i11 >= bsVarArr2.length) {
                        if (xd0Var.getCurrentView() != yd0Var3.e) {
                            xd0Var.showNext();
                            FrameLayout frameLayout = yd0Var3.h;
                            if (yd0Var3.f.getVisibility() != 0 && yd0Var3.T.C != 3 && !yd0Var3.M) {
                                z4 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z4, 1.0f, true);
                            break;
                        }
                    } else {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                vd0 vd0Var2 = this.b.a;
                int i12 = 0;
                vd0Var2.e = false;
                vd0Var2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = vd0Var2.f;
                    if (i12 >= bsVarArr3.length) {
                        break;
                    } else {
                        bsVarArr3[i12].i(0.0f);
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
                yd0 yd0Var4 = this.b;
                org.telegram.ui.Components.jj0 jj0Var = yd0Var4.w;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                vd0 vd0Var3 = yd0Var4.a;
                if (vd0Var3 != null && vd0Var3.f != null) {
                    vd0Var3.setText("");
                    vd0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
