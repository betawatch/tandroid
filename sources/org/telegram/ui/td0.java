package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae0 b;

    public /* synthetic */ td0(ae0 ae0Var, int i10) {
        this.a = i10;
        this.b = ae0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                ae0 ae0Var = this.b;
                ae0Var.postDelayed(new td0(ae0Var, 2), 150L);
                td0 td0Var = ae0Var.P;
                ae0Var.removeCallbacks(td0Var);
                ae0Var.postDelayed(td0Var, 3000L);
                ae0Var.O = true;
                break;
            case 2:
                xd0 xd0Var = this.b.a;
                int i10 = 0;
                xd0Var.e = false;
                xd0Var.f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr = xd0Var.f;
                    if (i10 >= dsVarArr.length) {
                        break;
                    } else {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                ae0 ae0Var2 = this.b;
                ae0Var2.postDelayed(new td0(ae0Var2, 5), 150L);
                break;
            case 4:
                ae0 ae0Var3 = this.b;
                zd0 zd0Var = ae0Var3.N;
                boolean z4 = false;
                ae0Var3.O = false;
                int i11 = 0;
                while (true) {
                    ds[] dsVarArr2 = ae0Var3.a.f;
                    if (i11 >= dsVarArr2.length) {
                        if (zd0Var.getCurrentView() != ae0Var3.e) {
                            zd0Var.showNext();
                            FrameLayout frameLayout = ae0Var3.h;
                            if (ae0Var3.f.getVisibility() != 0 && ae0Var3.T.C != 3 && !ae0Var3.M) {
                                z4 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z4, 1.0f, true);
                            break;
                        }
                    } else {
                        dsVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                xd0 xd0Var2 = this.b.a;
                int i12 = 0;
                xd0Var2.e = false;
                xd0Var2.f[0].requestFocus();
                while (true) {
                    ds[] dsVarArr3 = xd0Var2.f;
                    if (i12 >= dsVarArr3.length) {
                        break;
                    } else {
                        dsVarArr3[i12].i(0.0f);
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
                ae0 ae0Var4 = this.b;
                org.telegram.ui.Components.jj0 jj0Var = ae0Var4.w;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                xd0 xd0Var3 = ae0Var4.a;
                if (xd0Var3 != null && xd0Var3.f != null) {
                    xd0Var3.setText("");
                    xd0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
