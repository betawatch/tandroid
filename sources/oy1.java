// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oy1 extends j67 {
    public final /* synthetic */ byte E0;
    public final /* synthetic */ Object F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy1(Object obj, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.E0 = b;
        this.F0 = obj;
    }

    @Override // j67
    public final void m(long j) {
        byte b = this.E0;
        Object obj = this.F0;
        switch (b) {
            case 0:
                ((ChatActivityEnterView) obj).setEffectId(j);
                break;
            default:
                i22 i22Var = (i22) obj;
                p12 p12Var = i22Var.F2;
                i22Var.K2 = j;
                p12Var.setEffect(j);
                break;
        }
    }
}
