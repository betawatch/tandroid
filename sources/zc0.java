// default package

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zc0 implements n8c, ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bd0 b;

    public /* synthetic */ zc0(bd0 bd0Var, byte b) {
        this.a = b;
        this.b = bd0Var;
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c4c c4cVar = (c4c) obj;
        final View view = (View) obj2;
        final bd0 bd0Var = this.b;
        if (bd0Var.c.h(c4cVar)) {
            return;
        }
        int i = c4cVar.d;
        if (i == 2 || c4cVar.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", bd0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            bd0Var.presentFragment(new mu1(bundle));
            return;
        }
        final byte b = 1;
        if (i == 1) {
            bd0Var.r = !bd0Var.r;
            bd0Var.b.g3.O(true);
            bd0Var.Y(true);
            return;
        }
        if (i == 6) {
            m41 m41Var = bd0Var.c;
            bd0Var.s = true;
            m41Var.h = true;
            bd0Var.b.g3.O(true);
            bd0Var.Y(true);
            return;
        }
        final byte b2 = 0;
        if (i == 7) {
            m41 m41Var2 = bd0Var.c;
            bd0Var.s = false;
            m41Var2.h = false;
            bd0Var.b.g3.O(true);
            bd0Var.Y(true);
            return;
        }
        if (i == 3) {
            bd0Var.x = (byte) 0;
            bd0Var.b.g3.O(true);
            bd0Var.Y(true);
            return;
        }
        if (i == 4) {
            bd0Var.x = (byte) 1;
            bd0Var.b.g3.O(true);
            bd0Var.Y(true);
            return;
        }
        if (i == 5) {
            bd0Var.x = (byte) 2;
            bd0Var.b.g3.O(true);
            bd0Var.Y(true);
        } else {
            if (i == 8) {
                ij.x(bd0Var.getParentActivity(), k96.M0(2131752811, null), k96.M0(2131752813, null), bd0Var.F, new gj() { // from class: ad0
                    @Override // gj
                    public final void s(int i2, int i3, boolean z) {
                        byte b3 = b2;
                        View view2 = view;
                        bd0 bd0Var2 = bd0Var;
                        switch (b3) {
                            case 0:
                                bd0Var2.F = i2;
                                ((wgb) view2).w(k96.Q(i2), true);
                                bd0Var2.Y(true);
                                break;
                            default:
                                bd0Var2.G = i2;
                                ((wgb) view2).w(k96.Q(i2), true);
                                bd0Var2.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i == 9) {
                ij.x(bd0Var.getParentActivity(), k96.M0(2131752814, null), k96.M0(2131752813, null), bd0Var.G, new gj() { // from class: ad0
                    @Override // gj
                    public final void s(int i2, int i3, boolean z) {
                        byte b3 = b;
                        View view2 = view;
                        bd0 bd0Var2 = bd0Var;
                        switch (b3) {
                            case 0:
                                bd0Var2.F = i2;
                                ((wgb) view2).w(k96.Q(i2), true);
                                bd0Var2.Y(true);
                                break;
                            default:
                                bd0Var2.G = i2;
                                ((wgb) view2).w(k96.Q(i2), true);
                                bd0Var2.Y(true);
                                break;
                        }
                    }
                });
            } else if (i == 10) {
                boolean z = !bd0Var.w;
                bd0Var.w = z;
                ((ahb) view).setChecked(z);
                bd0Var.Y(true);
            }
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        bd0 bd0Var = this.b;
        switch (b) {
            case 1:
                bd0Var.b0();
                break;
            default:
                bd0Var.finishFragment();
                break;
        }
    }
}
