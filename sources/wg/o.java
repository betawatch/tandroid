package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import sg.z1;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class o extends z1 {
    public final /* synthetic */ r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, Context context) {
        super(context);
        this.n = rVar;
    }

    @Override // sg.z1, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.b.setPaused(false);
    }

    @Override // sg.z1, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.b.setPaused(true);
    }

    @Override // sg.z1, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
