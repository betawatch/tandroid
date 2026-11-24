// default package

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vb extends l7c {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb(KeyEvent.Callback callback, r59 r59Var, Context context, int i, jac jacVar, ylb ylbVar, byte b) {
        super(r59Var, context, i, 0, false, jacVar, ylbVar);
        this.Q = b;
        this.R = callback;
    }

    @Override // l7c, y59
    public final void t(u69 u69Var, int i) {
        d96 d96Var;
        i96 i96Var;
        switch (this.Q) {
            case 2:
                super.t(u69Var, i);
                n38 n38Var = (n38) this.R;
                if (n38Var.E) {
                    View view = u69Var.a;
                    if ((view instanceof d96) && (i96Var = (d96Var = (d96) view).L) != null && i96Var.a == n38Var.y) {
                        d96Var.a();
                        n38Var.E = false;
                        break;
                    }
                }
                break;
            default:
                super.t(u69Var, i);
                break;
        }
    }

    @Override // l7c, y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        ylb ylbVar4;
        byte b = this.Q;
        Object obj = this.R;
        switch (b) {
            case 0:
                bc bcVar = (bc) obj;
                if (i != 42) {
                    break;
                } else {
                    Activity parentActivity = bcVar.getParentActivity();
                    int i2 = cmb.K6;
                    ylbVar = ((d) bcVar).resourceProvider;
                    jf5 jf5Var = new jf5(parentActivity, i2, 21, 0, false, ylbVar);
                    jf5Var.setHeight(25);
                    break;
                }
            case 1:
                mh1 mh1Var = (mh1) obj;
                if (i != 42) {
                    break;
                } else {
                    Activity parentActivity2 = mh1Var.getParentActivity();
                    int i3 = cmb.K6;
                    ylbVar2 = ((d) mh1Var).resourceProvider;
                    jf5 jf5Var2 = new jf5(parentActivity2, i3, 21, 0, false, ylbVar2);
                    jf5Var2.setHeight(25);
                    break;
                }
            case 3:
                yb9 yb9Var = (yb9) obj;
                if (i != 0) {
                    if (i != 42) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 4:
                nxa nxaVar = (nxa) obj;
                if (i != 42) {
                    break;
                } else {
                    Activity parentActivity3 = nxaVar.getParentActivity();
                    int i4 = cmb.K6;
                    ylbVar3 = ((d) nxaVar).resourceProvider;
                    jf5 jf5Var3 = new jf5(parentActivity3, i4, 21, 0, false, ylbVar3);
                    jf5Var3.setHeight(25);
                    break;
                }
            case 5:
                yfb yfbVar = (yfb) obj;
                if (i != 42) {
                    break;
                } else {
                    Activity parentActivity4 = yfbVar.getParentActivity();
                    int i5 = cmb.K6;
                    ylbVar4 = ((d) yfbVar).resourceProvider;
                    jf5 jf5Var4 = new jf5(parentActivity4, i5, 21, 0, false, ylbVar4);
                    jf5Var4.setHeight(25);
                    break;
                }
        }
        return super.x(viewGroup, i);
    }

    @Override // l7c, y59
    public final void y(u69 u69Var) {
        d96 d96Var;
        i96 i96Var;
        switch (this.Q) {
            case 2:
                super.y(u69Var);
                n38 n38Var = (n38) this.R;
                if (n38Var.E) {
                    View view = u69Var.a;
                    if ((view instanceof d96) && (i96Var = (d96Var = (d96) view).L) != null && i96Var.a == n38Var.y) {
                        d96Var.a();
                        n38Var.E = false;
                        break;
                    }
                }
                break;
            default:
                super.y(u69Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb(h15 h15Var, r59 r59Var, Activity activity, int i, int i2, jac jacVar, ylb ylbVar, byte b) {
        super(r59Var, activity, i, i2, true, jacVar, ylbVar);
        this.Q = b;
        this.R = h15Var;
    }
}
