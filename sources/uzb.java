// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uzb implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0c b;

    public /* synthetic */ uzb(c0c c0cVar, byte b) {
        this.a = b;
        this.b = c0cVar;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        c0c c0cVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l5c l5cVar = (l5c) obj2;
                String[] strArr = c0cVar.d2;
                arrayList.add(c4c.C(null));
                l5cVar.G = true;
                l5cVar.V();
                String str = c0cVar.Z1;
                arrayList.add(wzb.i(3, "", str != null ? rzb.E0(rzb.J0(str, null, null)) : k96.M0(2131754986, null), null, null));
                arrayList.add(a0c.i(4, c0cVar.V1, c0cVar.f2, new vzb(c0cVar, l5cVar, (byte) 0), new rh8(c0cVar, b2), null));
                StringBuilder sb = new StringBuilder();
                sb.append(rzb.J0(c0cVar.a2, null, null));
                sb.append((c0cVar.b2 == 1 || strArr == null) ? "" : b00.j(new StringBuilder(" ("), strArr[c0cVar.b2], ")"));
                arrayList.add(wzb.i(5, "", rzb.E0(sb.toString()), null, new tzb(c0cVar, (byte) 4)));
                arrayList.add(a0c.i(6, c0cVar.X1, false, null, new rh8(c0cVar, b2), null));
                l5cVar.U();
                arrayList.add(c4c.C(null));
                l5cVar.V();
                arrayList.add(c4c.c(1, R.drawable.msg_copy, k96.M0(2131743719, null)));
                l5cVar.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c0cVar.g2 = -1;
                u41 u41Var = c0cVar.U1;
                u41Var.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        c0cVar.X1 = k27.h0(tL_messages_translateResult.result.get(0), false);
                        c0cVar.W1 = false;
                        c0cVar.e2.O(true);
                        break;
                    } else {
                        u41Var.setText(k96.M0(2131747638, null));
                        u41Var.setOnClickListener(new tzb(c0cVar, (byte) 1));
                        break;
                    }
                } else {
                    ug8.u(c0cVar.F, c0cVar.J0, tL_error, false);
                    u41Var.setText(k96.M0(2131747638, null));
                    u41Var.setOnClickListener(new tzb(c0cVar, (byte) 0));
                    break;
                }
                break;
        }
    }
}
