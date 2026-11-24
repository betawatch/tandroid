// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v1c implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c2c b;

    public /* synthetic */ v1c(c2c c2cVar, byte b) {
        this.a = b;
        this.b = c2cVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        c2c c2cVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                String[] strArr = c2cVar.d2;
                arrayList.add(c6c.C(null));
                l7cVar.G = true;
                l7cVar.V();
                String str = c2cVar.Z1;
                arrayList.add(w1c.i(3, "", str != null ? s1c.E0(s1c.J0(str, null, null)) : jb6.M0(2131754986, null), null, null));
                arrayList.add(a2c.i(4, c2cVar.V1, c2cVar.f2, new fyb(c2cVar, l7cVar, (byte) 1), new sj8(c2cVar, b2), null));
                StringBuilder sb = new StringBuilder();
                sb.append(s1c.J0(c2cVar.a2, null, null));
                sb.append((c2cVar.b2 == 1 || strArr == null) ? "" : b10.j(new StringBuilder(" ("), strArr[c2cVar.b2], ")"));
                arrayList.add(w1c.i(5, "", s1c.E0(sb.toString()), null, new u1c(c2cVar, (byte) 4)));
                arrayList.add(a2c.i(6, c2cVar.X1, false, null, new sj8(c2cVar, b2), null));
                l7cVar.U();
                arrayList.add(c6c.C(null));
                l7cVar.V();
                arrayList.add(c6c.c(1, R.drawable.msg_copy, jb6.M0(2131743645, null)));
                l7cVar.U();
                break;
            default:
                TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c2cVar.g2 = -1;
                b61 b61Var = c2cVar.U1;
                b61Var.setLoading(false);
                if (tL_error == null) {
                    if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
                        c2cVar.X1 = k47.h0(tL_messages_translateResult.result.get(0), false);
                        c2cVar.W1 = false;
                        c2cVar.e2.O(true);
                        break;
                    } else {
                        b61Var.setText(jb6.M0(2131747564, null));
                        b61Var.setOnClickListener(new u1c(c2cVar, (byte) 1));
                        break;
                    }
                } else {
                    wi8.u(c2cVar.F, c2cVar.J0, tL_error, false);
                    b61Var.setText(jb6.M0(2131747564, null));
                    b61Var.setOnClickListener(new u1c(c2cVar, (byte) 0));
                    break;
                }
                break;
        }
    }
}
