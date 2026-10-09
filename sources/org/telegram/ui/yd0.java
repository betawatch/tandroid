package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;

    public /* synthetic */ yd0(fe0 fe0Var, int i10) {
        this.a = i10;
        this.b = fe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                fe0 fe0Var = this.b;
                fe0Var.postDelayed(new yd0(fe0Var, 2), 150L);
                yd0 yd0Var = fe0Var.S;
                fe0Var.removeCallbacks(yd0Var);
                fe0Var.postDelayed(yd0Var, 3000L);
                fe0Var.R = true;
                break;
            case 2:
                ce0 ce0Var = this.b.a;
                int i10 = 0;
                ce0Var.e = false;
                ce0Var.f[0].requestFocus();
                while (true) {
                    es[] esVarArr = ce0Var.f;
                    if (i10 >= esVarArr.length) {
                        break;
                    } else {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                fe0 fe0Var2 = this.b;
                fe0Var2.postDelayed(new yd0(fe0Var2, 5), 150L);
                break;
            case 4:
                fe0 fe0Var3 = this.b;
                ee0 ee0Var = fe0Var3.Q;
                boolean z10 = false;
                fe0Var3.R = false;
                int i11 = 0;
                while (true) {
                    es[] esVarArr2 = fe0Var3.a.f;
                    if (i11 >= esVarArr2.length) {
                        if (ee0Var.getCurrentView() != fe0Var3.e) {
                            ee0Var.showNext();
                            FrameLayout frameLayout = fe0Var3.h;
                            if (fe0Var3.f.getVisibility() != 0 && fe0Var3.W.F != 3 && !fe0Var3.P) {
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
                ce0 ce0Var2 = this.b.a;
                int i12 = 0;
                ce0Var2.e = false;
                ce0Var2.f[0].requestFocus();
                while (true) {
                    es[] esVarArr3 = ce0Var2.f;
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
                fe0 fe0Var4 = this.b;
                org.telegram.ui.Components.fk0 fk0Var = fe0Var4.w;
                fk0Var.getAnimatedDrawable().N(0, false, false);
                fk0Var.d();
                ce0 ce0Var3 = fe0Var4.a;
                if (ce0Var3 != null && ce0Var3.f != null) {
                    ce0Var3.setText("");
                    ce0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
