package wh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ i5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(i5 i5Var, Context context) {
        super(context);
        this.b = i5Var;
        this.a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        i5 i5Var = this.b;
        int measuredWidth = i5Var.v.getMeasuredWidth();
        int measuredHeight = i5Var.v.getMeasuredHeight();
        k5 k5Var = i5Var.v;
        int i14 = this.a;
        k5Var.layout(-i14, 0, measuredWidth - i14, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.a;
        int max = Math.max(0, size + i12);
        i5 i5Var = this.b;
        i5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i11);
        int measuredWidth = i5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i12), i5Var.v.getMeasuredHeight());
    }
}
