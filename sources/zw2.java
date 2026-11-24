// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zw2 implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dx2 c;

    public zw2(dx2 dx2Var, ArrayList arrayList, boolean z) {
        this.c = dx2Var;
        this.a = arrayList;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hx2 hx2Var = this.c.a;
        if (hx2Var.w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.a;
            if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
                fx2 fx2Var = hx2Var.l;
                if (fx2Var != null) {
                    TLRPC.Document document = hx2Var.W;
                    String str = hx2Var.Y;
                    boolean z = true;
                    Object obj = hx2Var.b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z = false;
                    }
                    fx2Var.k(document, str, obj, z, 0, 0);
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                fx2 fx2Var2 = hx2Var.l;
                if (fx2Var2 != null) {
                    fx2Var2.P(hx2Var.a0, hx2Var.i);
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                hs6.d0(hx2Var.r).d(2, hx2Var.b0, hx2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                TLRPC.Document document2 = hx2Var.W;
                Object obj2 = hx2Var.b0;
                String str2 = hx2Var.Y;
                fx2 fx2Var3 = hx2Var.l;
                if (fx2Var3 == null) {
                    return;
                } else {
                    ik.I(hx2Var.w, fx2Var3.a(), new lu((Object) fx2Var3, (Object) document2, obj2, str2, (byte) 8));
                }
            } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                hs6.d0(hx2Var.r).d(0, hx2Var.b0, hx2Var.W, (int) (System.currentTimeMillis() / 1000), true);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                hx2Var.l.J(hx2Var.X);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                hx2Var.l.m(hx2Var.W);
            } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                hx2Var.l.D(hx2Var.W);
            }
            hx2Var.d();
        }
    }
}
