// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class x19 extends q5c {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x19(d dVar, w19 w19Var, int i) {
        super(dVar, w19Var, null, null);
        this.n3 = i;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(gl.L(220.0f), View.MeasureSpec.getSize(i));
        View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(moe.b(this.n3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
