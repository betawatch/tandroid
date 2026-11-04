package vg;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.bd;
import org.telegram.messenger.e3;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ t(i0 i0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        i0 i0Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.g(i0Var.k1());
                i0Var.dismiss();
                break;
            case 1:
                y yVar = i0Var.x2;
                if (!yVar.r) {
                    yVar.w.performClick();
                    break;
                } else {
                    yVar.h.performClick();
                    break;
                }
            case 2:
                y yVar2 = i0Var.x2;
                if (!yVar2.r) {
                    yVar2.w.performClick();
                    break;
                } else {
                    yVar2.h.performClick();
                    break;
                }
            default:
                int i10 = i0Var.a2;
                HashSet hashSet = i0Var.r2;
                int i11 = 1;
                if (!i0Var.c2) {
                    if (i10 == 19 || i10 == 32 || i0Var.s1()) {
                        e3 e3Var = i0Var.V1;
                        if (!e3Var.a) {
                            if (!e3Var.d || !xg.s.i() || i0Var.V1.m) {
                                i0Var.dismiss();
                                break;
                            } else {
                                xg.j.i(i0Var.T1, i0Var);
                                break;
                            }
                        } else {
                            i0Var.x2.w.callOnClick();
                            e3 e3Var2 = i0Var.V1;
                            if (e3Var2.d && e3Var2.l) {
                                org.telegram.messenger.g0.i3(new v(i0Var, i11), e3Var2.e ? 300L : 0L);
                                break;
                            }
                        }
                    }
                } else {
                    d2 d2Var = i0Var.D2;
                    if (d2Var != null) {
                        b2 b2Var = new b2();
                        b2Var.a = true;
                        d2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), b2Var);
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 != 2) {
                            if (i10 == 5) {
                                TLRPC.User a22 = hp.s1(i0Var.a).a2(Long.valueOf(h10.i(i0Var.a).e()));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((TLRPC.Chat) it.next());
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getContext(), i0Var.J0);
                                String G = bd.G(arrayList.size(), "LeaveCommunities", new Object[0]);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = G;
                                if (arrayList.size() == 1) {
                                    s1Var.U = org.telegram.messenger.g0.X2(bd.a0("ChannelLeaveAlertWithName", null, 2131752389, ((TLRPC.Chat) arrayList.get(0)).title));
                                } else {
                                    s1Var.U = org.telegram.messenger.g0.X2(bd.a0("ChatsLeaveAlert", null, 2131752176, new Object[0]));
                                }
                                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                alertDialog$Builder.k(bd.M0(2131743374, null), new hr(i0Var, arrayList, a22, 12));
                                s1Var.show();
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    r6.V(textView, k6.q7, i0Var.J0);
                                    break;
                                }
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                i0Var.b2.add((TLRPC.Chat) it2.next());
                            }
                            i0Var.x1(arrayList2);
                            break;
                        }
                    }
                } else if (!hashSet.isEmpty()) {
                    i0Var.y1(null);
                    break;
                } else {
                    i0Var.dismiss();
                    break;
                }
                break;
        }
    }
}
