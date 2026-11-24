// default package

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zg implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zg(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                Context context = (Context) obj3;
                f53 f53Var = (f53) obj2;
                yg ygVar = (yg) obj;
                int i2 = ((int[]) obj4)[i];
                if (i2 != 100) {
                    ygVar.a(Integer.valueOf(i2), "");
                    break;
                } else {
                    new wi(context, i2, f53Var, ygVar).show();
                    break;
                }
            default:
                p pVar = (p) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                jz7 jz7Var = new jz7(pVar, (Runnable) obj3);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = pVar.z0;
                int i3 = (tL_paymentSavedCredentialsCard == null && pVar.y0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && pVar.y0 == null) || i != 0) {
                    if (i >= i3 && i < arrayList.size() + i3) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i - i3);
                        pVar.z0 = tL_paymentSavedCredentialsCard2;
                        jz7Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i >= arrayList2.size() - 1) {
                        if (i == arrayList2.size() - 1) {
                            p pVar2 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 2, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                            pVar2.d1 = pVar.d1;
                            pVar2.e1 = pVar.e1;
                            pVar2.U = jz7Var;
                            pVar.presentFragment(pVar2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = pVar.D0.additional_methods.get((i - arrayList.size()) - i3);
                        p pVar3 = new p(pVar.c1, pVar.D0, pVar.O0, pVar.P0, 2, pVar.F0, pVar.H0, pVar.I0, null, pVar.y0, pVar.J0, pVar.V0, null, pVar.s0, pVar.X0);
                        pVar3.d1 = pVar.d1;
                        pVar3.e1 = pVar.e1;
                        pVar3.G0 = tL_paymentFormMethod;
                        pVar3.U = jz7Var;
                        pVar.presentFragment(pVar3);
                        break;
                    }
                }
                break;
        }
    }
}
