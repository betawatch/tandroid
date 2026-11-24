// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        sy1 sy1Var;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                a1 a1Var = (a1) obj3;
                ylb ylbVar = (ylb) obj2;
                Context context = (Context) obj;
                if (!a1Var.h2) {
                    if (a1Var.j2 != null) {
                        if (a1Var.f1() == null) {
                        }
                    } else if (a1Var.i2 == null || a1Var.g1() == null) {
                    }
                    boolean z = a1Var.g2 == z8c.h(a1Var.a).e();
                    bu5 G = bu5.G(a1Var.c, ylbVar, a1Var.C2);
                    G.k(R.drawable.input_notify_off, jb6.M0(2131745317, null), new a(a1Var, (byte) 4), !z);
                    G.b(R.drawable.msg_calendar2, jb6.M0(z ? 2131745248 : 2131745593, null), new op6(a1Var, context, ylbVar, (byte) 6), false);
                    G.a0();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                k47 k47Var = (k47) obj2;
                f47 f47Var = (f47) obj;
                int i = ChatActivityEnterView.z7;
                ylb ylbVar2 = chatActivityEnterView.L4;
                if (!k47Var.F3() && (sy1Var = chatActivityEnterView.F0) != null && !TextUtils.isEmpty(sy1Var.getTextToUse())) {
                    if (f47Var == null || (f47Var.c && !f47Var.i)) {
                        int i2 = k47Var.D;
                        if (i2 == 1 || i2 == 3 || i2 == 8) {
                            j67 j67Var = new j67(chatActivityEnterView.getContext(), ylbVar2);
                            j67Var.h0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (f47Var != null) {
                                ArrayList arrayList2 = f47Var.d;
                                int i3 = 0;
                                while (i3 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.x0((k47) arrayList2.get(i3), i3 == 0));
                                    i3++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.x0(k47Var, true));
                            }
                            j67Var.r(arrayList);
                            bu5 G2 = bu5.G(chatActivityEnterView.c2, ylbVar2, chatActivityEnterView.v2);
                            k57 k57Var = new k57(chatActivityEnterView.getContext(), R.raw.position_below, jb6.M0(2131752513, null), R.raw.position_above, jb6.M0(2131752512, null), chatActivityEnterView.L4);
                            k57Var.a(!chatActivityEnterView.V6, false);
                            k57Var.setOnClickListener(new ef((Object) chatActivityEnterView, (Object) arrayList, (Object) k57Var, (Object) j67Var, (byte) 8));
                            G2.p(k57Var);
                            G2.Z();
                            j67Var.q(G2);
                            j67Var.s(chatActivityEnterView.v2, false, new ef((Object) chatActivityEnterView, (Object) f47Var, (Object) k47Var, (Object) j67Var, (byte) 9));
                            j67Var.show();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
