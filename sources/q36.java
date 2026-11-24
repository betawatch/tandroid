// default package

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class q36 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i46 b;

    public /* synthetic */ q36(i46 i46Var, byte b) {
        this.a = b;
        this.b = i46Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        i46 i46Var = this.b;
        switch (b) {
            case 0:
                gm.g(i46Var.b1());
                i46Var.dismiss();
                break;
            case 1:
                x36 x36Var = i46Var.z2;
                if (!x36Var.r) {
                    x36Var.w.performClick();
                    break;
                } else {
                    x36Var.h.performClick();
                    break;
                }
            case 2:
                x36 x36Var2 = i46Var.z2;
                if (!x36Var2.r) {
                    x36Var2.w.performClick();
                    break;
                } else {
                    x36Var2.h.performClick();
                    break;
                }
            default:
                i46 i46Var2 = this.b;
                int i = i46Var2.c2;
                HashSet hashSet = i46Var2.t2;
                byte b2 = 1;
                if (!i46Var2.e2) {
                    if (i == 19 || i == 32 || i46Var2.j1()) {
                        vh1 vh1Var = i46Var2.X1;
                        if (!vh1Var.a) {
                            if (!vh1Var.d || !oo0.k() || i46Var2.X1.m) {
                                i46Var2.dismiss();
                                break;
                            } else {
                                yn0.i(i46Var2.V1, i46Var2);
                                break;
                            }
                        } else {
                            i46Var2.z2.w.callOnClick();
                            vh1 vh1Var2 = i46Var2.X1;
                            if (vh1Var2.d && vh1Var2.l) {
                                gm.d3(new s36(i46Var2, b2), vh1Var2.e ? 300L : 0L);
                                break;
                            }
                        }
                    }
                } else {
                    d dVar = i46Var2.F2;
                    if (dVar != null) {
                        bh0 bh0Var = new bh0();
                        bh0Var.a = true;
                        dVar.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bh0Var);
                    }
                }
                if (i != 11 && i != 34) {
                    if (!hashSet.isEmpty()) {
                        if (i != 2) {
                            if (i == 5) {
                                TLRPC.User W1 = oc7.r1(i46Var2.a).W1(Long.valueOf(z8c.h(i46Var2.a).e()));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((TLRPC.Chat) it.next());
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i46Var2.J0, i46Var2.getContext());
                                String G = jb6.G(arrayList.size(), "LeaveCommunities", new Object[0]);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = G;
                                if (arrayList.size() == 1) {
                                    heVar.U = gm.S2(jb6.a0("ChannelLeaveAlertWithName", null, 2131752333, ((TLRPC.Chat) arrayList.get(0)).title));
                                } else {
                                    heVar.U = gm.S2(jb6.a0("ChatsLeaveAlert", null, 2131752113, new Object[0]));
                                }
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131743048, null), new wu2(i46Var2, arrayList, W1, false, (byte) 15));
                                heVar.show();
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, i46Var2.J0);
                                    break;
                                }
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                i46Var2.d2.add((TLRPC.Chat) it2.next());
                            }
                            i46Var2.o1(arrayList2);
                            break;
                        }
                    }
                } else if (!hashSet.isEmpty()) {
                    i46Var2.p1(null);
                    break;
                } else {
                    i46Var2.dismiss();
                    break;
                }
                break;
        }
    }
}
