// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class u3c implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b4c b;

    public /* synthetic */ u3c(b4c b4cVar, byte b) {
        this.a = b;
        this.b = b4cVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        b4c b4cVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                String[] strArr = b4cVar.d2;
                arrayList.add(b8c.C(null));
                l9cVar.G = true;
                l9cVar.V();
                String str = b4cVar.Z1;
                arrayList.add(v3c.i(3, "", str != null ? r3c.F0(r3c.K0(str, null, null)) : ob6.M0(2131754983, null), null, null));
                arrayList.add(z3c.i(4, b4cVar.V1, b4cVar.f2, new jjb(b4cVar, l9cVar, (byte) 3), new r94(b4cVar, (byte) 2), null));
                StringBuilder sb = new StringBuilder();
                sb.append(r3c.K0(b4cVar.a2, null, null));
                sb.append((b4cVar.b2 == 1 || strArr == null) ? "" : c00.k(new StringBuilder(" ("), strArr[b4cVar.b2], ")"));
                arrayList.add(v3c.i(5, "", r3c.F0(sb.toString()), null, new t3c(b4cVar, (byte) 4)));
                arrayList.add(z3c.i(6, b4cVar.X1, false, null, new r94(b4cVar, (byte) 2), null));
                l9cVar.U();
                arrayList.add(b8c.C(null));
                l9cVar.V();
                arrayList.add(b8c.c(1, R.drawable.msg_copy, ob6.M0(2131743613, null)));
                l9cVar.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                b4cVar.g2 = -1;
                c51 c51Var = b4cVar.U1;
                c51Var.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        b4cVar.X1 = r47.h0(tL_messages_translateResult.result.get(0), false);
                        b4cVar.W1 = false;
                        b4cVar.e2.O(true);
                        break;
                    } else {
                        c51Var.setText(ob6.M0(2131747558, null));
                        c51Var.setOnClickListener(new t3c(b4cVar, (byte) 1));
                        break;
                    }
                } else {
                    ik8.u(b4cVar.F, b4cVar.J0, tL_error, false);
                    c51Var.setText(ob6.M0(2131747558, null));
                    c51Var.setOnClickListener(new t3c(b4cVar, (byte) 0));
                    break;
                }
                break;
        }
    }
}
