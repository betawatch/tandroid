// default package

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rh8 implements k46 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fy0 b;

    public /* synthetic */ rh8(fy0 fy0Var, byte b) {
        this.a = b;
        this.b = fy0Var;
    }

    @Override // k46
    public final void a(ClickableSpan clickableSpan) {
        byte b = this.a;
        fy0 fy0Var = this.b;
        switch (b) {
            case 0:
                xh8 xh8Var = (xh8) fy0Var;
                ArrayList arrayList = new ArrayList();
                arrayList.add(xh8Var.x2);
                hu0 hu0Var = new hu0(xh8Var, (byte) 10);
                d dVar = xh8Var.o2;
                if (dVar != null) {
                    hu0Var.setParentFragment(dVar);
                }
                new uh8(xh8Var, hu0Var, xh8Var.getContext(), xh8Var.J0, arrayList).show();
                break;
            default:
                c0c c0cVar = (c0c) fy0Var;
                if (clickableSpan != null) {
                    clickableSpan.onClick(c0cVar.b);
                    break;
                }
                break;
        }
    }
}
