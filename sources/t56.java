// default package

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t56 extends zt3 {
    public boolean F;
    public final /* synthetic */ v56 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t56(v56 v56Var, Context context, String str, vnb vnbVar) {
        super(context, str, false, false, -1, vnbVar);
        this.G = v56Var;
    }

    @Override // zt3
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
            if (parseLong > this.G.getMessagesController().k4.H2.f()) {
                this.F = true;
                parseLong = this.G.getMessagesController().k4.H2.f();
                setText(Long.toString(parseLong));
                this.F = false;
            }
            v56 v56Var = this.G;
            TextView textView = v56Var.s;
            int i2 = v56Var.getConnectionsManager().isTestBackend() ? 2131745879 : 2131745882;
            di0 h = di0.h();
            i = ((e) this.G).currentAccount;
            textView.setText(ob6.a0(null, null, i2, h.e((long) ((parseLong / 1000.0d) * uc7.s1(i).k4.A3.i), "USD")));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
