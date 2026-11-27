// default package

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u36 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l46 b;

    public /* synthetic */ u36(l46 l46Var, byte b) {
        this.a = b;
        this.b = l46Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                hl.g(l46Var.c1());
                l46Var.dismiss();
                break;
            case 1:
                a46 a46Var = l46Var.z2;
                if (!a46Var.r) {
                    a46Var.w.performClick();
                    break;
                } else {
                    a46Var.h.performClick();
                    break;
                }
            case 2:
                a46 a46Var2 = l46Var.z2;
                if (!a46Var2.r) {
                    a46Var2.w.performClick();
                    break;
                } else {
                    a46Var2.h.performClick();
                    break;
                }
            default:
                l46 l46Var2 = this.b;
                int i = l46Var2.c2;
                HashSet hashSet = l46Var2.t2;
                byte b2 = 1;
                if (!l46Var2.e2) {
                    if (i == 19 || i == 32 || l46Var2.k1()) {
                        wg1 wg1Var = l46Var2.X1;
                        if (!wg1Var.a) {
                            if (!wg1Var.d || !on0.k() || l46Var2.X1.m) {
                                l46Var2.dismiss();
                                break;
                            } else {
                                ym0.i(l46Var2.V1, l46Var2);
                                break;
                            }
                        } else {
                            l46Var2.z2.w.callOnClick();
                            wg1 wg1Var2 = l46Var2.X1;
                            if (wg1Var2.d && wg1Var2.l) {
                                hl.d3(new w36(l46Var2, b2), wg1Var2.e ? 300L : 0L);
                                break;
                            }
                        }
                    }
                } else {
                    e eVar = l46Var2.F2;
                    if (eVar != null) {
                        bg0 bg0Var = new bg0();
                        bg0Var.a = true;
                        eVar.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bg0Var);
                    }
                }
                if (i != 11 && i != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i != 2) {
                            if (i == 5) {
                                TLRPC.User X1 = uc7.s1(l46Var2.a).X1(Long.valueOf(yac.h(l46Var2.a).e()));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((TLRPC.Chat) it.next());
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l46Var2.J0, l46Var2.getContext());
                                String G = ob6.G(arrayList.size(), "LeaveCommunities", new Object[0]);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = G;
                                if (arrayList.size() == 1) {
                                    idVar.U = hl.S2(ob6.a0("ChannelLeaveAlertWithName", null, 2131752361, ((TLRPC.Chat) arrayList.get(0)).title));
                                } else {
                                    idVar.U = hl.S2(ob6.a0("ChatsLeaveAlert", null, 2131752141, new Object[0]));
                                }
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.j(ob6.M0(2131743016, null), new fu2(l46Var2, arrayList, X1, false, (byte) 15));
                                idVar.show();
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, l46Var2.J0);
                                    break;
                                }
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                l46Var2.d2.add((TLRPC.Chat) it2.next());
                            }
                            l46Var2.p1(arrayList2);
                            break;
                        }
                    }
                } else if (!hashSet.isEmpty()) {
                    l46Var2.q1(null);
                    break;
                } else {
                    l46Var2.dismiss();
                    break;
                }
                break;
        }
    }
}
