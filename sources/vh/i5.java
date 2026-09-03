package vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ j5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(j5 j5Var, Context context) {
        super(context);
        this.b = j5Var;
        this.a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        j5 j5Var = this.b;
        int measuredWidth = j5Var.v.getMeasuredWidth();
        int measuredHeight = j5Var.v.getMeasuredHeight();
        l5 l5Var = j5Var.v;
        int i14 = this.a;
        l5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.a;
        int max = Math.max(0, size + i12);
        j5 j5Var = this.b;
        j5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i11);
        int measuredWidth = j5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), j5Var.v.getMeasuredHeight());
    }
}
