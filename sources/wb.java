// default package

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wb extends l9c {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb(KeyEvent.Callback callback, d79 d79Var, Context context, int i, icc iccVar, vnb vnbVar, byte b) {
        super(d79Var, context, i, 0, false, iccVar, vnbVar);
        this.Q = b;
        this.R = callback;
    }

    @Override // l9c, j79
    public final void t(f89 f89Var, int i) {
        h96 h96Var;
        m96 m96Var;
        switch (this.Q) {
            case 2:
                super.t(f89Var, i);
                b58 b58Var = (b58) this.R;
                if (b58Var.E) {
                    View view = f89Var.a;
                    if ((view instanceof h96) && (m96Var = (h96Var = (h96) view).L) != null && m96Var.a == b58Var.y) {
                        h96Var.a();
                        b58Var.E = false;
                        break;
                    }
                }
                break;
            default:
                super.t(f89Var, i);
                break;
        }
    }

    @Override // l9c, j79
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        vnb vnbVar4;
        byte b = this.Q;
        Object obj = this.R;
        switch (b) {
            case 0:
                cc ccVar = (cc) obj;
                if (i != 42) {
                    break;
                } else {
                    Activity parentActivity = ccVar.getParentActivity();
                    int i2 = aob.L6;
                    vnbVar = ((e) ccVar).resourceProvider;
                    mf5 mf5Var = new mf5(parentActivity, i2, 21, 0, false, vnbVar);
                    mf5Var.setHeight(25);
                    break;
                }
            case 1:
                ng1 ng1Var = (ng1) obj;
                if (i != 42) {
                    break;
                } else {
                    Activity parentActivity2 = ng1Var.getParentActivity();
                    int i3 = aob.L6;
                    vnbVar2 = ((e) ng1Var).resourceProvider;
                    mf5 mf5Var2 = new mf5(parentActivity2, i3, 21, 0, false, vnbVar2);
                    mf5Var2.setHeight(25);
                    break;
                }
            case 3:
                md9 md9Var = (md9) obj;
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
                nza nzaVar = (nza) obj;
                if (i != 42) {
                    break;
                } else {
                    Activity parentActivity3 = nzaVar.getParentActivity();
                    int i4 = aob.L6;
                    vnbVar3 = ((e) nzaVar).resourceProvider;
                    mf5 mf5Var3 = new mf5(parentActivity3, i4, 21, 0, false, vnbVar3);
                    mf5Var3.setHeight(25);
                    break;
                }
            case 5:
                thb thbVar = (thb) obj;
                if (i != 42) {
                    break;
                } else {
                    Activity parentActivity4 = thbVar.getParentActivity();
                    int i5 = aob.L6;
                    vnbVar4 = ((e) thbVar).resourceProvider;
                    mf5 mf5Var4 = new mf5(parentActivity4, i5, 21, 0, false, vnbVar4);
                    mf5Var4.setHeight(25);
                    break;
                }
        }
        return super.x(viewGroup, i);
    }

    @Override // l9c, j79
    public final void y(f89 f89Var) {
        h96 h96Var;
        m96 m96Var;
        switch (this.Q) {
            case 2:
                super.y(f89Var);
                b58 b58Var = (b58) this.R;
                if (b58Var.E) {
                    View view = f89Var.a;
                    if ((view instanceof h96) && (m96Var = (h96Var = (h96) view).L) != null && m96Var.a == b58Var.y) {
                        h96Var.a();
                        b58Var.E = false;
                        break;
                    }
                }
                break;
            default:
                super.y(f89Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb(m15 m15Var, d79 d79Var, Activity activity, int i, int i2, icc iccVar, vnb vnbVar, byte b) {
        super(d79Var, activity, i, i2, true, iccVar, vnbVar);
        this.Q = b;
        this.R = m15Var;
    }
}
