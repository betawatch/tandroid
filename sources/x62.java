// default package

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class x62 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x62(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        byte b = this.a;
        boolean z = false;
        z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((e72) obj).e0();
                break;
            case 1:
                j47 j47Var = (j47) obj;
                if (!j47Var.t0 && (view2 instanceof EditText)) {
                    gl.t1(j47Var.S);
                    gl.d3(new v37(j47Var, (EditText) view2, z ? (byte) 1 : (byte) 0), 200L);
                    break;
                }
                break;
            case 2:
                ((hd9) obj).A0();
                break;
            case 3:
                ye9 ye9Var = (ye9) obj;
                if (view2 != null && ye9Var.F(view2) != null) {
                    z = true;
                }
                ye9Var.i3 = z;
                if (view2 instanceof mc9) {
                    ye9Var.T3 = (mc9) view2;
                    break;
                }
                break;
            default:
                ii9 ii9Var = (ii9) obj;
                ii9Var.z();
                ki9 ki9Var = ii9Var.w;
                if (ki9Var != null) {
                    ki9Var.invalidate();
                    break;
                }
                break;
        }
    }
}
