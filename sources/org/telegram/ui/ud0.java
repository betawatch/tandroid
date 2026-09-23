package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ be0 b;

    public /* synthetic */ ud0(be0 be0Var, int i10) {
        this.a = i10;
        this.b = be0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                be0 be0Var = this.b;
                be0Var.postDelayed(new ud0(be0Var, 2), 150L);
                ud0 ud0Var = be0Var.S;
                be0Var.removeCallbacks(ud0Var);
                be0Var.postDelayed(ud0Var, 3000L);
                be0Var.R = true;
                break;
            case 2:
                yd0 yd0Var = this.b.a;
                int i10 = 0;
                yd0Var.e = false;
                yd0Var.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr = yd0Var.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                be0 be0Var2 = this.b;
                be0Var2.postDelayed(new ud0(be0Var2, 5), 150L);
                break;
            case 4:
                be0 be0Var3 = this.b;
                ae0 ae0Var = be0Var3.Q;
                boolean z10 = false;
                be0Var3.R = false;
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr2 = be0Var3.a.f;
                    if (i11 >= bsVarArr2.length) {
                        if (ae0Var.getCurrentView() != be0Var3.e) {
                            ae0Var.showNext();
                            FrameLayout frameLayout = be0Var3.h;
                            if (be0Var3.f.getVisibility() != 0 && be0Var3.W.F != 3 && !be0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                yd0 yd0Var2 = this.b.a;
                int i12 = 0;
                yd0Var2.e = false;
                yd0Var2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = yd0Var2.f;
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
                be0 be0Var4 = this.b;
                org.telegram.ui.Components.bj0 bj0Var = be0Var4.w;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                yd0 yd0Var3 = be0Var4.a;
                if (yd0Var3 != null && yd0Var3.f != null) {
                    yd0Var3.setText("");
                    yd0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
