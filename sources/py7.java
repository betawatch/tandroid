// default package

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class py7 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xz7 b;

    public /* synthetic */ py7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 3;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                if (xz7Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        az2 az2Var = new az2(null, false);
                        az2Var.r = new cz6((Object) xz7Var, (Object) view, (byte) 10);
                        xz7Var.presentFragment(az2Var);
                    }
                    break;
                }
                break;
            case 1:
                if (xz7Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
                        String M0 = jb6.M0(2131747199, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        alertDialog$Builder.e(new CharSequence[]{jb6.M0(2131747241, null), jb6.M0(2131747302, null)}, new r30(xz7Var, b3));
                        alertDialog$Builder.j(jb6.M0(2131752542, null), null);
                        xz7Var.showDialog(heVar);
                    }
                    break;
                }
                break;
            case 2:
                if (xz7Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        az2 az2Var2 = new az2(null, false);
                        az2Var2.r = new qy7(xz7Var, b2);
                        xz7Var.presentFragment(az2Var2);
                    }
                    break;
                }
                break;
            default:
                if (xz7Var.getParentActivity() != null) {
                    if (motionEvent.getAction() == 1) {
                        az2 az2Var3 = new az2(null, false);
                        az2Var3.r = new qy7(xz7Var, b3);
                        xz7Var.presentFragment(az2Var3);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
