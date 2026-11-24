// default package

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q56 extends su3 {
    public boolean F;
    public final /* synthetic */ s56 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q56(s56 s56Var, Context context, String str, ylb ylbVar) {
        super(context, str, false, false, -1, ylbVar);
        this.G = s56Var;
    }

    @Override // su3
    public final void b(Editable editable) {
        int i;
        if (this.F) {
            return;
        }
        if (TextUtils.isEmpty(editable)) {
            this.G.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > this.G.getMessagesController().l4.z2.f()) {
                this.F = true;
                parseLong = this.G.getMessagesController().l4.z2.f();
                setText(Long.toString(parseLong));
                this.F = false;
            }
            s56 s56Var = this.G;
            TextView textView = s56Var.s;
            int i2 = s56Var.getConnectionsManager().isTestBackend() ? 2131745885 : 2131745888;
            cj0 h = cj0.h();
            i = ((d) this.G).currentAccount;
            textView.setText(jb6.a0(null, null, i2, h.e((long) ((parseLong / 1000.0d) * oc7.r1(i).l4.s3.i), "USD")));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
