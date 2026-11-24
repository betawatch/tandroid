// default package

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yd1 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;
    public final /* synthetic */ zd1 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd1(zd1 zd1Var, Context context, byte b) {
        super(context);
        this.M1 = b;
        this.N1 = zd1Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final wjb getResourcesProvider() {
        byte b = this.M1;
        zd1 zd1Var = this.N1;
        switch (b) {
        }
        return zd1Var.d;
    }
}
