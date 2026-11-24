// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uh3 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ uh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = nk3Var.K2;
                if (nk3Var.getParentActivity() == null) {
                    break;
                } else {
                    boolean z = !arrayList.isEmpty();
                    boolean z2 = true;
                    for (int i = 0; i < arrayList.size(); i++) {
                        long longValue = ((Long) arrayList.get(i)).longValue();
                        if (z && longValue != nk3Var.getUserConfig().e()) {
                            z = false;
                        }
                        if (pg3.B(longValue)) {
                            z2 = false;
                        }
                        TLRPC.Chat L0 = nk3Var.getMessagesController().L0(Long.valueOf(-longValue));
                        if (L0 != null && !sd2.B(L0)) {
                            z2 = false;
                        }
                    }
                    boolean z3 = nk3Var.z3() && nk3Var.G2();
                    if (z3) {
                        ArrayList arrayList2 = nk3Var.F2;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                if (((jo6) obj).b()) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = nk3Var.F2;
                    boolean z4 = arrayList3 != null && arrayList3.size() > 1;
                    bu5 I = bu5.I(nk3Var, view);
                    I.k(R.drawable.msg_sendfile, jb6.M0(z4 ? 2131745369 : 2131745370, null), new kh3(nk3Var, (byte) 13), z3);
                    I.b(R.drawable.input_notify_off, jb6.M0(2131745317, null), new kh3(nk3Var, (byte) 14), false);
                    I.k(R.drawable.msg_calendar2, jb6.M0(z ? 2131745248 : 2131745593, null), new y8c((byte) 15, nk3Var, z), z2);
                    I.a0();
                    break;
                }
                break;
            case 1:
                nk3 nk3Var2 = this.b;
                nk3Var2.K4(nk3Var2.K2, nm7.o1, true, true, null);
                break;
            case 2:
                nk3Var.E4(view);
                break;
            default:
                nk3Var.getContactsController().B();
                nk3Var.f5();
                break;
        }
        return true;
    }
}
