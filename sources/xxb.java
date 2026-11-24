// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xxb extends ka {
    public final /* synthetic */ zxb d;

    public xxb(zxb zxbVar) {
        this.d = zxbVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 1 || i == 2 || i == 4;
    }

    @Override // y59
    public final int b() {
        return this.d.d.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((yxb) this.d.d.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        String M0;
        zxb zxbVar = this.d;
        ArrayList arrayList = zxbVar.d;
        if (((yxb) arrayList.get(i)).a == 2) {
            xvb xvbVar = (xvb) u69Var.a;
            long j = zxbVar.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((yxb) arrayList.get(i)).c;
            bf0 bf0Var = xvbVar.b;
            no4.q(bf0Var, tL_forumTopic, false, false, null);
            if (bf0Var != null && bf0Var.getImageReceiver() != null && (bf0Var.getImageReceiver().t() instanceof mo4)) {
                ((mo4) bf0Var.getImageReceiver().t()).a(cmb.w0(null, cmb.b9, false));
            }
            xvbVar.c.setText(tL_forumTopic.title);
            TextView textView = xvbVar.d;
            oc7 r1 = oc7.r1(z8c.t0);
            long j2 = tL_forumTopic.id;
            if (r1.getMessagesController().o2(j, j2, null)) {
                int i2 = r1.W3.getInt("notifyuntil_" + lo7.p(j, j2, false), 0);
                M0 = i2 >= r1.getConnectionsManager().getCurrentTime() ? jb6.a0("NotificationsMutedForHint", null, 2131747633, jb6.c0(i2)) : jb6.M0(2131747634, null);
            } else {
                M0 = jb6.M0(2131747589, null);
            }
            textView.setText(M0);
            xvbVar.a = i == arrayList.size() - 1 || ((yxb) arrayList.get(i + 1)).a == 2;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2 = null;
        if (i == 1) {
            xib xibVar = new xib(viewGroup.getContext());
            xibVar.o(R.drawable.msg_contact_add, jb6.M0(2131747656, null), true);
            xibVar.g(cmb.u6, cmb.t6);
            anb.h(cmb.c6, null, xibVar);
            view = xibVar;
        } else if (i == 2) {
            Context context = viewGroup.getContext();
            xvb xvbVar = new xvb(context);
            bf0 bf0Var = new bf0(context);
            xvbVar.b = bf0Var;
            xvbVar.addView(bf0Var, qoe.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            xvbVar.c = textView;
            td4.x(textView, cmb.F6, null, 1, 16.0f);
            textView.setMaxLines(1);
            xvbVar.addView(textView, qoe.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            xvbVar.d = textView2;
            anb.X(textView2, cmb.x6, null);
            textView2.setTextSize(1, 14.0f);
            xvbVar.addView(textView2, qoe.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            anb.h(cmb.c6, null, xvbVar);
            view = xvbVar;
        } else {
            if (i != 3) {
                if (i == 4) {
                    xib xibVar2 = new xib(viewGroup.getContext());
                    xibVar2.k(jb6.M0(2131747648, null), false);
                    xibVar2.g(-1, cmb.o7);
                    anb.h(cmb.c6, null, xibVar2);
                    view = xibVar2;
                }
                return kt6.h(view2, view2, -1, -2);
            }
            view = new bba(viewGroup.getContext(), (hg9) null);
        }
        view2 = view;
        return kt6.h(view2, view2, -1, -2);
    }
}
