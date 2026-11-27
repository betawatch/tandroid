// default package

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tz7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b18 b;

    public /* synthetic */ tz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                b18Var.T0 = (byte) 2;
                b18Var.G1();
                break;
            case 1:
                b18Var.W0();
                break;
            case 2:
                b18Var.T0 = (byte) 3;
                b18Var.G1();
                break;
            case 3:
                b18Var.T0 = (byte) 1;
                b18Var.G1();
                break;
            case 4:
                b18Var.T0 = (byte) 4;
                b18Var.G1();
                break;
            case 5:
                if (b18Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    la1 la1Var = new la1(0);
                    la1Var.N = new kj4(b18Var, (byte) 23);
                    b18Var.presentFragment(la1Var);
                    break;
                } else {
                    b18Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    break;
                }
            case 6:
                b18Var.f = true;
                b18Var.M.callOnClick();
                b18Var.f = false;
                break;
            case 7:
                b18Var.T0 = (byte) 0;
                b18Var.G1();
                break;
            case 8:
                b18Var.T0 = (byte) 4;
                b18Var.G1();
                break;
            case 9:
                b18Var.W0();
                break;
            case 10:
                b18Var.t1();
                break;
            case 11:
                b18Var.s1();
                break;
            case 12:
                b18Var.F1();
                break;
            case 13:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b18Var.getParentActivity());
                String M0 = ob6.M0(2131743885, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131743886, null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new vz7(b18Var, (byte) 5));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                b18Var.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                    break;
                }
                break;
            case 14:
                b18Var.F1();
                break;
            case 15:
                b18Var.v1();
                break;
            default:
                b18Var.f = true;
                b18Var.M.callOnClick();
                b18Var.f = false;
                break;
        }
    }
}
