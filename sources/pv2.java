// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pv2 implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tv2 c;

    public pv2(tv2 tv2Var, ArrayList arrayList, boolean z) {
        this.c = tv2Var;
        this.a = arrayList;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xv2 xv2Var = this.c.a;
        if (xv2Var.w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.a;
            if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
                vv2 vv2Var = xv2Var.l;
                if (vv2Var != null) {
                    TLRPC.Document document = xv2Var.W;
                    String str = xv2Var.Y;
                    boolean z = true;
                    Object obj = xv2Var.b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z = false;
                    }
                    vv2Var.k(document, str, obj, z, 0, 0);
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                vv2 vv2Var2 = xv2Var.l;
                if (vv2Var2 != null) {
                    vv2Var2.O(xv2Var.a0, xv2Var.i);
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                hq6.d0(xv2Var.r).d(2, xv2Var.b0, xv2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                TLRPC.Document document2 = xv2Var.W;
                Object obj2 = xv2Var.b0;
                String str2 = xv2Var.Y;
                vv2 vv2Var3 = xv2Var.l;
                if (vv2Var3 == null) {
                    return;
                } else {
                    ij.I(xv2Var.w, vv2Var3.a(), new lt((Object) vv2Var3, (Object) document2, obj2, str2, (byte) 8));
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                hq6.d0(xv2Var.r).d(0, xv2Var.b0, xv2Var.W, (int) (System.currentTimeMillis() / 1000), true);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                xv2Var.l.I(xv2Var.X);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                xv2Var.l.m(xv2Var.W);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                xv2Var.l.B(xv2Var.W);
            }
            xv2Var.d();
        }
    }
}
