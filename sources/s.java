// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        ex1 ex1Var;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                a1 a1Var = (a1) obj3;
                wjb wjbVar = (wjb) obj2;
                Context context = (Context) obj;
                if (!a1Var.h2) {
                    if (a1Var.j2 != null) {
                        if (a1Var.f1() == null) {
                        }
                    } else if (a1Var.i2 == null || a1Var.g1() == null) {
                    }
                    boolean z = a1Var.g2 == y6c.h(a1Var.a).e();
                    cs5 G = cs5.G(a1Var.c, wjbVar, a1Var.C2);
                    G.k(R.drawable.input_notify_off, k96.M0(2131745391, null), new a(a1Var, (byte) 4), !z);
                    G.b(R.drawable.msg_calendar2, k96.M0(z ? 2131745322 : 2131745667, null), new nn6(a1Var, context, wjbVar, (byte) 6), false);
                    G.a0();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                k27 k27Var = (k27) obj2;
                f27 f27Var = (f27) obj;
                int i = ChatActivityEnterView.r7;
                wjb wjbVar2 = chatActivityEnterView.L4;
                if (!k27Var.F3() && (ex1Var = chatActivityEnterView.F0) != null && !TextUtils.isEmpty(ex1Var.getTextToUse())) {
                    if (f27Var == null || (f27Var.c && !f27Var.i)) {
                        int i2 = k27Var.D;
                        if (i2 == 1 || i2 == 3 || i2 == 8) {
                            j47 j47Var = new j47(chatActivityEnterView.getContext(), wjbVar2);
                            j47Var.h0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (f27Var != null) {
                                ArrayList arrayList2 = f27Var.d;
                                int i3 = 0;
                                while (i3 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.x0((k27) arrayList2.get(i3), i3 == 0));
                                    i3++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.x0(k27Var, true));
                            }
                            j47Var.r(arrayList);
                            cs5 G2 = cs5.G(chatActivityEnterView.c2, wjbVar2, chatActivityEnterView.v2);
                            k37 k37Var = new k37(chatActivityEnterView.getContext(), R.raw.position_below, k96.M0(2131752548, null), R.raw.position_above, k96.M0(2131752547, null), chatActivityEnterView.L4);
                            k37Var.a(!chatActivityEnterView.N6, false);
                            k37Var.setOnClickListener(new ee((Object) chatActivityEnterView, (Object) arrayList, (Object) k37Var, (Object) j47Var, (byte) 8));
                            G2.p(k37Var);
                            G2.Z();
                            j47Var.q(G2);
                            j47Var.s(chatActivityEnterView.v2, false, new ee((Object) chatActivityEnterView, (Object) f27Var, (Object) k27Var, (Object) j47Var, (byte) 9));
                            j47Var.show();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
