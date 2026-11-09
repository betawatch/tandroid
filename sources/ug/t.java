package ug;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.e3;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.hr;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ t(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        i0 i0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g(i0Var.k1());
                i0Var.dismiss();
                break;
            case 1:
                y yVar = i0Var.w2;
                if (!yVar.r) {
                    yVar.w.performClick();
                    break;
                } else {
                    yVar.h.performClick();
                    break;
                }
            case 2:
                y yVar2 = i0Var.w2;
                if (!yVar2.r) {
                    yVar2.w.performClick();
                    break;
                } else {
                    yVar2.h.performClick();
                    break;
                }
            default:
                int i10 = i0Var.Z1;
                HashSet hashSet = i0Var.q2;
                int i11 = 1;
                if (!i0Var.b2) {
                    if (i10 == 19 || i10 == 32 || i0Var.s1()) {
                        e3 e3Var = i0Var.U1;
                        if (!e3Var.a) {
                            if (!e3Var.d || !wg.r.i() || i0Var.U1.m) {
                                i0Var.dismiss();
                                break;
                            } else {
                                wg.h.i(i0Var.S1, i0Var);
                                break;
                            }
                        } else {
                            i0Var.w2.w.callOnClick();
                            e3 e3Var2 = i0Var.U1;
                            if (e3Var2.d && e3Var2.l) {
                                org.telegram.messenger.g0.i3(new v(i0Var, i11), e3Var2.e ? 300L : 0L);
                                break;
                            }
                        }
                    }
                } else {
                    f2 f2Var = i0Var.C2;
                    if (f2Var != null) {
                        d2 d2Var = new d2();
                        d2Var.a = true;
                        f2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), d2Var);
                    }
                }
                if (i10 != 11 && i10 != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i10 != 2) {
                            if (i10 == 5) {
                                TLRPC.User a22 = qp.s1(i0Var.a).a2(Long.valueOf(p10.i(i0Var.a).e()));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((TLRPC.Chat) it.next());
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i0Var.getContext(), i0Var.I0);
                                String G = id.G(arrayList.size(), "LeaveCommunities", new Object[0]);
                                u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = G;
                                if (arrayList.size() == 1) {
                                    u1Var.T = org.telegram.messenger.g0.X2(id.a0("ChannelLeaveAlertWithName", null, 2131752389, ((TLRPC.Chat) arrayList.get(0)).title));
                                } else {
                                    u1Var.T = org.telegram.messenger.g0.X2(id.a0("ChatsLeaveAlert", null, 2131752176, new Object[0]));
                                }
                                alertDialog$Builder.h(id.M0(2131752589, null), null);
                                alertDialog$Builder.k(id.M0(2131743364, null), new hr(i0Var, arrayList, a22, 12));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    s6.U(textView, l6.q7, i0Var.I0);
                                    break;
                                }
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                i0Var.a2.add((TLRPC.Chat) it2.next());
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
