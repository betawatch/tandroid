// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
