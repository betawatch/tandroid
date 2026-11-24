// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uvb extends ka {
    public final /* synthetic */ wvb d;

    public uvb(wvb wvbVar) {
        this.d = wvbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 1 || i == 2 || i == 4;
    }

    @Override // w39
    public final int b() {
        return this.d.d.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((vvb) this.d.d.get(i)).a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String M0;
        wvb wvbVar = this.d;
        ArrayList arrayList = wvbVar.d;
        if (((vvb) arrayList.get(i)).a == 2) {
            wtb wtbVar = (wtb) s49Var.a;
            long j = wvbVar.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((vvb) arrayList.get(i)).c;
            be0 be0Var = wtbVar.b;
            mm4.q(be0Var, tL_forumTopic, false, false, null);
            if (be0Var != null && be0Var.getImageReceiver() != null && (be0Var.getImageReceiver().t() instanceof lm4)) {
                ((lm4) be0Var.getImageReceiver().t()).a(bkb.w0(null, bkb.b9, false));
            }
            wtbVar.c.setText(tL_forumTopic.title);
            TextView textView = wtbVar.d;
            na7 q1 = na7.q1(y6c.t0);
            long j2 = tL_forumTopic.id;
            if (q1.getMessagesController().n2(j, j2, null)) {
                int i2 = q1.W3.getInt("notifyuntil_" + im7.p(j, j2, false), 0);
                M0 = i2 >= q1.getConnectionsManager().getCurrentTime() ? k96.a0("NotificationsMutedForHint", null, 2131747707, k96.c0(i2)) : k96.M0(2131747708, null);
            } else {
                M0 = k96.M0(2131747663, null);
            }
            textView.setText(M0);
            wtbVar.a = i == arrayList.size() - 1 || ((vvb) arrayList.get(i + 1)).a == 2;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2 = null;
        if (i == 1) {
            wgb wgbVar = new wgb(viewGroup.getContext());
            wgbVar.o(R.drawable.msg_contact_add, k96.M0(2131747730, null), true);
            wgbVar.g(bkb.u6, bkb.t6);
            zkb.h(bkb.c6, null, wgbVar);
            view = wgbVar;
        } else if (i == 2) {
            Context context = viewGroup.getContext();
            wtb wtbVar = new wtb(context);
            be0 be0Var = new be0(context);
            wtbVar.b = be0Var;
            wtbVar.addView(be0Var, nme.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            wtbVar.c = textView;
            tb4.w(textView, bkb.F6, null, 1, 16.0f);
            textView.setMaxLines(1);
            wtbVar.addView(textView, nme.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            wtbVar.d = textView2;
            zkb.X(textView2, bkb.x6, null);
            textView2.setTextSize(1, 14.0f);
            wtbVar.addView(textView2, nme.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            zkb.h(bkb.c6, null, wtbVar);
            view = wtbVar;
        } else {
            if (i != 3) {
                if (i == 4) {
                    wgb wgbVar2 = new wgb(viewGroup.getContext());
                    wgbVar2.k(k96.M0(2131747722, null), false);
                    wgbVar2.g(-1, bkb.o7);
                    zkb.h(bkb.c6, null, wgbVar2);
                    view = wgbVar2;
                }
                return ls6.h(view2, view2, -1, -2);
            }
            view = new b9a(viewGroup.getContext(), (de9) null);
        }
        view2 = view;
        return ls6.h(view2, view2, -1, -2);
    }
}
