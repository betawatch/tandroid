package ug;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.rm;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ t(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        l0 l0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g(l0Var.l1());
                l0Var.dismiss();
                break;
            case 1:
                b0 b0Var = l0Var.A2;
                if (!b0Var.r) {
                    b0Var.w.performClick();
                    break;
                } else {
                    b0Var.h.performClick();
                    break;
                }
            case 2:
                b0 b0Var2 = l0Var.A2;
                if (!b0Var2.r) {
                    b0Var2.w.performClick();
                    break;
                } else {
                    b0Var2.h.performClick();
                    break;
                }
            default:
                int i10 = l0Var.d2;
                HashSet hashSet = l0Var.u2;
                int i11 = 1;
                if (!l0Var.f2) {
                    if (i10 == 19 || i10 == 32 || l0Var.t1()) {
                        g3 g3Var = l0Var.Y1;
                        if (!g3Var.a) {
                            if (!g3Var.d || !wg.s.i() || l0Var.Y1.m) {
                                l0Var.dismiss();
                                break;
                            } else {
                                wg.h.i(l0Var.W1, l0Var);
                                break;
                            }
                        } else {
                            l0Var.A2.w.callOnClick();
                            g3 g3Var2 = l0Var.Y1;
                            if (g3Var2.d && g3Var2.l) {
                                org.telegram.messenger.g0.h3(new v(l0Var, i11), g3Var2.e ? 300L : 0L);
                                break;
                            }
                        }
                    }
                } else {
                    h2 h2Var = l0Var.G2;
                    if (h2Var != null) {
                        f2 f2Var = new f2();
                        f2Var.a = true;
                        h2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), f2Var);
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 != 2) {
                            if (i10 == 5) {
                                TLRPC.User c22 = mp.u1(l0Var.a).c2(Long.valueOf(j10.i(l0Var.a).e()));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((TLRPC.Chat) it.next());
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l0Var.getContext(), l0Var.J0);
                                String G = gd.G(arrayList.size(), "LeaveCommunities", new Object[0]);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = G;
                                if (arrayList.size() == 1) {
                                    u1Var.U = org.telegram.messenger.g0.W2(gd.a0("ChannelLeaveAlertWithName", null, 2131752378, ((TLRPC.Chat) arrayList.get(0)).title));
                                } else {
                                    u1Var.U = org.telegram.messenger.g0.W2(gd.a0("ChatsLeaveAlert", null, 2131752165, new Object[0]));
                                }
                                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(gd.M0(2131743127, null), new rm(l0Var, arrayList, c22, 13));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    u6.U(textView, n6.q7, l0Var.J0);
                                    break;
                                }
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                l0Var.e2.add((TLRPC.Chat) it2.next());
                            }
                            l0Var.y1(arrayList2);
                            break;
                        }
                    }
                } else if (!hashSet.isEmpty()) {
                    l0Var.z1(null);
                    break;
                } else {
                    l0Var.dismiss();
                    break;
                }
                break;
        }
    }
}
