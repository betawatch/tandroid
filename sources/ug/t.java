package ug;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.e3;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.km;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ t(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        j0 j0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g(j0Var.k1());
                j0Var.dismiss();
                break;
            case 1:
                z zVar = j0Var.A2;
                if (!zVar.r) {
                    zVar.w.performClick();
                    break;
                } else {
                    zVar.h.performClick();
                    break;
                }
            case 2:
                z zVar2 = j0Var.A2;
                if (!zVar2.r) {
                    zVar2.w.performClick();
                    break;
                } else {
                    zVar2.h.performClick();
                    break;
                }
            default:
                int i10 = j0Var.d2;
                HashSet hashSet = j0Var.u2;
                int i11 = 1;
                if (!j0Var.f2) {
                    if (i10 == 19 || i10 == 32 || j0Var.s1()) {
                        e3 e3Var = j0Var.Y1;
                        if (!e3Var.a) {
                            if (!e3Var.d || !wg.q.i() || j0Var.Y1.m) {
                                j0Var.dismiss();
                                break;
                            } else {
                                wg.h.i(j0Var.W1, j0Var);
                                break;
                            }
                        } else {
                            j0Var.A2.w.callOnClick();
                            e3 e3Var2 = j0Var.Y1;
                            if (e3Var2.d && e3Var2.l) {
                                org.telegram.messenger.g0.i3(new v(j0Var, i11), e3Var2.e ? 300L : 0L);
                                break;
                            }
                        }
                    }
                } else {
                    e2 e2Var = j0Var.G2;
                    if (e2Var != null) {
                        c2 c2Var = new c2();
                        c2Var.a = true;
                        e2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), c2Var);
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 != 2) {
                            if (i10 == 5) {
                                TLRPC.User a22 = np.s1(j0Var.a).a2(Long.valueOf(m10.i(j0Var.a).e()));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((TLRPC.Chat) it.next());
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, j0Var.getContext(), j0Var.J0);
                                String G = hd.G(arrayList.size(), "LeaveCommunities", new Object[0]);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                                t1Var.S = G;
                                if (arrayList.size() == 1) {
                                    t1Var.U = org.telegram.messenger.g0.X2(hd.a0("ChannelLeaveAlertWithName", null, 2131752389, ((TLRPC.Chat) arrayList.get(0)).title));
                                } else {
                                    t1Var.U = org.telegram.messenger.g0.X2(hd.a0("ChatsLeaveAlert", null, 2131752176, new Object[0]));
                                }
                                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(hd.M0(2131743364, null), new km(j0Var, arrayList, a22, 13));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    q6.U(textView, j6.q7, j0Var.J0);
                                    break;
                                }
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                j0Var.e2.add((TLRPC.Chat) it2.next());
                            }
                            j0Var.x1(arrayList2);
                            break;
                        }
                    }
                } else if (!hashSet.isEmpty()) {
                    j0Var.y1(null);
                    break;
                } else {
                    j0Var.dismiss();
                    break;
                }
                break;
        }
    }
}
