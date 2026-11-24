// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zq9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er9 b;

    public /* synthetic */ zq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                er9Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
