// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        tx1 tx1Var;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                b1 b1Var = (b1) obj3;
                vnb vnbVar = (vnb) obj2;
                Context context = (Context) obj;
                if (!b1Var.h2) {
                    if (b1Var.j2 != null) {
                        if (b1Var.g1() == null) {
                        }
                    } else if (b1Var.i2 == null || b1Var.h1() == null) {
                    }
                    boolean z = b1Var.g2 == yac.h(b1Var.a).e();
                    fu5 G = fu5.G(b1Var.c, vnbVar, b1Var.C2);
                    G.k(R.drawable.input_notify_off, ob6.M0(2131745311, null), new a(b1Var, (byte) 4), !z);
                    G.b(R.drawable.msg_calendar2, ob6.M0(z ? 2131745242 : 2131745587, null), new es6(b1Var, context, vnbVar, (byte) 6), false);
                    G.a0();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                r47 r47Var = (r47) obj2;
                m47 m47Var = (m47) obj;
                int i = ChatActivityEnterView.X7;
                vnb vnbVar2 = chatActivityEnterView.K4;
                if (!r47Var.F3() && (tx1Var = chatActivityEnterView.F0) != null && !TextUtils.isEmpty(tx1Var.getTextToUse())) {
                    if (m47Var == null || (m47Var.c && !m47Var.i)) {
                        int i2 = r47Var.D;
                        if (i2 == 1 || i2 == 3 || i2 == 8) {
                            q67 q67Var = new q67(chatActivityEnterView.getContext(), vnbVar2);
                            q67Var.h0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (m47Var != null) {
                                ArrayList arrayList2 = m47Var.d;
                                int i3 = 0;
                                while (i3 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.B0((r47) arrayList2.get(i3), i3 == 0));
                                    i3++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.B0(r47Var, true));
                            }
                            q67Var.r(arrayList);
                            fu5 G2 = fu5.G(chatActivityEnterView.b2, vnbVar2, chatActivityEnterView.u2);
                            r57 r57Var = new r57(chatActivityEnterView.getContext(), R.raw.position_below, ob6.M0(2131752541, null), R.raw.position_above, ob6.M0(2131752540, null), chatActivityEnterView.K4);
                            r57Var.a(!chatActivityEnterView.n7, false);
                            r57Var.setOnClickListener(new cg((Object) chatActivityEnterView, (Object) arrayList, (Object) r57Var, (Object) q67Var, (byte) 8));
                            G2.p(r57Var);
                            G2.Z();
                            q67Var.q(G2);
                            q67Var.s(chatActivityEnterView.u2, false, new cg((Object) chatActivityEnterView, (Object) m47Var, (Object) r47Var, (Object) q67Var, (byte) 9));
                            q67Var.show();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
