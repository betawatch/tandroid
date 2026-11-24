// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p0b extends xya {
    public final /* synthetic */ q0b P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0b(q0b q0bVar, Context context, wjb wjbVar) {
        super(wjbVar, context, false);
        this.P = q0bVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        u0b u0bVar = this.P.r;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(u0bVar.I1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(u0bVar.I1, TLObject.FLAG_30));
    }
}
