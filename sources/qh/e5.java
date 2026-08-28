package qh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e5 extends ViewGroup {
    public final int a;
    public final /* synthetic */ f5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(f5 f5Var, Context context) {
        super(context);
        this.b = f5Var;
        this.a = AndroidUtilities.dp(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        f5 f5Var = this.b;
        int measuredWidth = f5Var.v.getMeasuredWidth();
        int measuredHeight = f5Var.v.getMeasuredHeight();
        h5 h5Var = f5Var.v;
        int i13 = this.a;
        h5Var.layout(-i13, 0, measuredWidth - i13, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int i11 = this.a;
        int max = Math.max(0, size + i11);
        f5 f5Var = this.b;
        f5Var.v.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i10);
        int measuredWidth = f5Var.v.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i11), f5Var.v.getMeasuredHeight());
    }
}
