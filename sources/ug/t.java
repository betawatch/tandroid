package ug;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.g3;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.tm;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ t(k0 k0Var, int i7) {
        this.a = i7;
        this.b = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        k0 k0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g(k0Var.l1());
                k0Var.dismiss();
                break;
            case 1:
                a0 a0Var = k0Var.A2;
                if (!a0Var.r) {
                    a0Var.w.performClick();
                    break;
                } else {
                    a0Var.h.performClick();
                    break;
                }
            case 2:
                a0 a0Var2 = k0Var.A2;
                if (!a0Var2.r) {
                    a0Var2.w.performClick();
                    break;
                } else {
                    a0Var2.h.performClick();
                    break;
                }
            default:
                int i10 = k0Var.d2;
                HashSet hashSet = k0Var.u2;
                int i11 = 1;
                if (!k0Var.f2) {
                    if (i10 == 19 || i10 == 32 || k0Var.t1()) {
                        g3 g3Var = k0Var.Y1;
                        if (!g3Var.a) {
                            if (!g3Var.d || !wg.s.i() || k0Var.Y1.m) {
                                k0Var.dismiss();
                                break;
                            } else {
                                wg.h.i(k0Var.W1, k0Var);
                                break;
                            }
                        } else {
                            k0Var.A2.w.callOnClick();
                            g3 g3Var2 = k0Var.Y1;
                            if (g3Var2.d && g3Var2.l) {
                                org.telegram.messenger.g0.h3(new v(k0Var, i11), g3Var2.e ? 300L : 0L);
                                break;
                            }
                        }
                    }
                } else {
                    g2 g2Var = k0Var.G2;
                    if (g2Var != null) {
                        e2 e2Var = new e2();
                        e2Var.a = true;
                        g2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), e2Var);
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 != 2) {
                            if (i10 == 5) {
                                TLRPC.User c22 = np.u1(k0Var.a).c2(Long.valueOf(k10.i(k0Var.a).e()));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((TLRPC.Chat) it.next());
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k0Var.getContext(), k0Var.J0);
                                String G = hd.G(arrayList.size(), "LeaveCommunities", new Object[0]);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = G;
                                if (arrayList.size() == 1) {
                                    t1Var.U = org.telegram.messenger.g0.W2(hd.a0("ChannelLeaveAlertWithName", null, 2131752377, ((TLRPC.Chat) arrayList.get(0)).title));
                                } else {
                                    t1Var.U = org.telegram.messenger.g0.W2(hd.a0("ChatsLeaveAlert", null, 2131752164, new Object[0]));
                                }
                                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                                alertDialog$Builder.k(hd.N0(2131743119, null), new tm(k0Var, arrayList, c22, 13));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    t6.U(textView, m6.q7, k0Var.J0);
                                    break;
                                }
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                k0Var.e2.add((TLRPC.Chat) it2.next());
                            }
                            k0Var.y1(arrayList2);
                            break;
                        }
                    }
                } else if (!hashSet.isEmpty()) {
                    k0Var.z1(null);
                    break;
                } else {
                    k0Var.dismiss();
                    break;
                }
                break;
        }
    }
}
