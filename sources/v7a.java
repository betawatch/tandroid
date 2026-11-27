// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v7a extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7a(Context context, int i, int i2) {
        super(context);
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return hl.L(260.0f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.a), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.b), View.MeasureSpec.getMode(i2)));
    }
}
