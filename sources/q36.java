// default package

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q36 extends it3 {
    public boolean F;
    public final /* synthetic */ s36 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q36(s36 s36Var, Context context, String str, wjb wjbVar) {
        super(context, str, false, false, -1, wjbVar);
        this.G = s36Var;
    }

    @Override // it3
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
            if (parseLong > this.G.getMessagesController().k4.z2.f()) {
                this.F = true;
                parseLong = this.G.getMessagesController().k4.z2.f();
                setText(Long.toString(parseLong));
                this.F = false;
            }
            s36 s36Var = this.G;
            TextView textView = s36Var.s;
            int i2 = s36Var.getConnectionsManager().isTestBackend() ? 2131745959 : 2131745962;
            ci0 h = ci0.h();
            i = ((d) this.G).currentAccount;
            textView.setText(k96.a0(null, null, i2, h.e((long) ((parseLong / 1000.0d) * na7.q1(i).k4.s3.i), "USD")));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
