// default package

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class w7a extends c79 {
    public final /* synthetic */ vnb c;
    public final /* synthetic */ List d;
    public final /* synthetic */ uc7 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public w7a(vnb vnbVar, List list, uc7 uc7Var, int i, TLRPC.Peer peer) {
        this.c = vnbVar;
        this.d = list;
        this.e = uc7Var;
        this.f = i;
        this.h = peer;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        return this.d.size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        a8a a8aVar = (a8a) f89Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j = peer.channel_id;
        long j2 = j != 0 ? -j : 0L;
        if (j2 == 0) {
            long j3 = peer.user_id;
            if (j3 != 0) {
                j2 = j3;
            }
        }
        TLRPC.Peer peer2 = this.h;
        boolean z = true;
        uc7 uc7Var = this.e;
        if (j2 >= 0) {
            TLRPC.User X1 = uc7Var.X1(Long.valueOf(j2));
            if (X1 != null) {
                a8aVar.b.setText(lbc.r(X1));
                a8aVar.c.setText(ob6.M0(2131743001, null));
                a8aVar.a.setAvatar(X1);
            }
            wla wlaVar = a8aVar.a;
            if (peer2 == null ? i != 0 : peer2.user_id != peer.user_id) {
                z = false;
            }
            wlaVar.a(z, false);
            return;
        }
        TLRPC.Chat M0 = uc7Var.M0(Long.valueOf(-j2));
        if (M0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb = new StringBuilder();
                String str = M0.title;
                TextView textView = a8aVar.b;
                sb.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - hl.L(100.0f), TextUtils.TruncateAt.END));
                sb.append(" d");
                SpannableString spannableString = new SpannableString(sb.toString());
                wm2 wm2Var = new wm2(R.drawable.msg_mini_premiumlock, 0);
                wm2Var.n = 1;
                wm2Var.c(hl.L(14.0f));
                wm2Var.a(aob.C6);
                spannableString.setSpan(wm2Var, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                a8aVar.b.setEllipsize(TextUtils.TruncateAt.END);
                a8aVar.b.setText(M0.title);
            }
            a8aVar.c.setText(ob6.G(M0.participants_count, (!xc2.T(M0) || M0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            a8aVar.a.setAvatar(M0);
        }
        wla wlaVar2 = a8aVar.a;
        if (peer2 == null ? i != 0 : peer2.channel_id != peer.channel_id) {
            z = false;
        }
        wlaVar2.a(z, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        return new n69(new a8a(viewGroup.getContext(), this.c));
    }
}
