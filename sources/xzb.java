// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xzb extends la {
    public final /* synthetic */ zzb d;

    public xzb(zzb zzbVar) {
        this.d = zzbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 1 || i == 2 || i == 4;
    }

    @Override // j79
    public final int b() {
        return this.d.d.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((yzb) this.d.d.get(i)).a;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        String M0;
        zzb zzbVar = this.d;
        ArrayList arrayList = zzbVar.d;
        if (((yzb) arrayList.get(i)).a == 2) {
            xxb xxbVar = (xxb) f89Var.a;
            long j = zzbVar.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((yzb) arrayList.get(i)).c;
            de0 de0Var = xxbVar.b;
            ro4.q(de0Var, tL_forumTopic, false, false, null);
            if (de0Var != null && de0Var.getImageReceiver() != null && (de0Var.getImageReceiver().t() instanceof qo4)) {
                ((qo4) de0Var.getImageReceiver().t()).a(aob.w0(null, aob.c9, false));
            }
            xxbVar.c.setText(tL_forumTopic.title);
            TextView textView = xxbVar.d;
            uc7 s1 = uc7.s1(yac.t0);
            long j2 = tL_forumTopic.id;
            if (s1.getMessagesController().p2(j, j2, null)) {
                int i2 = s1.W3.getInt("notifyuntil_" + ip7.p(j, j2, false), 0);
                M0 = i2 >= s1.getConnectionsManager().getCurrentTime() ? ob6.a0("NotificationsMutedForHint", null, 2131747627, ob6.c0(i2)) : ob6.M0(2131747628, null);
            } else {
                M0 = ob6.M0(2131747583, null);
            }
            textView.setText(M0);
            xxbVar.a = i == arrayList.size() - 1 || ((yzb) arrayList.get(i + 1)).a == 2;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2 = null;
        if (i == 1) {
            skb skbVar = new skb(viewGroup.getContext());
            skbVar.o(R.drawable.msg_contact_add, ob6.M0(2131747650, null), true);
            skbVar.g(aob.v6, aob.u6);
            yob.h(aob.d6, null, skbVar);
            view = skbVar;
        } else if (i == 2) {
            Context context = viewGroup.getContext();
            xxb xxbVar = new xxb(context);
            de0 de0Var = new de0(context);
            xxbVar.b = de0Var;
            xxbVar.addView(de0Var, tre.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            xxbVar.c = textView;
            qd4.w(textView, aob.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            xxbVar.addView(textView, tre.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            xxbVar.d = textView2;
            yob.X(textView2, aob.y6, null);
            textView2.setTextSize(1, 14.0f);
            xxbVar.addView(textView2, tre.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            yob.h(aob.d6, null, xxbVar);
            view = xxbVar;
        } else {
            if (i != 3) {
                if (i == 4) {
                    skb skbVar2 = new skb(viewGroup.getContext());
                    skbVar2.k(ob6.M0(2131747642, null), false);
                    skbVar2.g(-1, aob.p7);
                    yob.h(aob.d6, null, skbVar2);
                    view = skbVar2;
                }
                return qu6.h(view2, view2, -1, -2);
            }
            view = new rca(viewGroup.getContext(), (uh9) null);
        }
        view2 = view;
        return qu6.h(view2, view2, -1, -2);
    }
}
