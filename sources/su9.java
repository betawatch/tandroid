// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class su9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu9 b;

    public /* synthetic */ su9(xu9 xu9Var, byte b) {
        this.a = b;
        this.b = xu9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        xu9 xu9Var = this.b;
        switch (b) {
            case 0:
                xu9Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                xu9Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
