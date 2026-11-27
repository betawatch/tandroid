// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ox1 extends q67 {
    public final /* synthetic */ byte E0;
    public final /* synthetic */ Object F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox1(Object obj, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.E0 = b;
        this.F0 = obj;
    }

    @Override // q67
    public final void m(long j) {
        byte b = this.E0;
        Object obj = this.F0;
        switch (b) {
            case 0:
                ((ChatActivityEnterView) obj).setEffectId(j);
                break;
            default:
                n12 n12Var = (n12) obj;
                u02 u02Var = n12Var.F2;
                n12Var.K2 = j;
                u02Var.setEffect(j);
                break;
        }
    }
}
