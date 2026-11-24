// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sz8 extends o39 {
    public final /* synthetic */ a09 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz8(a09 a09Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.f3 = a09Var;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        a09 a09Var = this.f3;
        j17 j17Var = a09Var.K;
        if (j17Var != null) {
            j17Var.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        }
        super.onMeasure(i, i2);
        a09Var.f();
    }
}
