// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w0b extends d79 {
    public int f3;
    public final /* synthetic */ w1b g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0b(w1b w1bVar, Context context) {
        super(context, null);
        this.g3 = w1bVar;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        b1b b1bVar;
        super.onMeasure(i, i2);
        if (this.f3 != getMeasuredHeight() && (b1bVar = this.g3.X) != null) {
            b1bVar.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
