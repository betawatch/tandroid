// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class wl9 extends ViewGroup {
    public final int a;
    public final /* synthetic */ xl9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl9(xl9 xl9Var, Context context) {
        super(context);
        this.b = xl9Var;
        this.a = hl.L(16.0f);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        zl9 zl9Var = this.b.w;
        int measuredWidth = zl9Var.getMeasuredWidth();
        int measuredHeight = zl9Var.getMeasuredHeight();
        int i5 = this.a;
        zl9Var.layout(-i5, 0, measuredWidth - i5, measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        int max = Math.max(0, size + i3);
        zl9 zl9Var = this.b.w;
        zl9Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_31), i2);
        int measuredWidth = zl9Var.getMeasuredWidth();
        setMeasuredDimension(Math.max(0, measuredWidth - i3), zl9Var.getMeasuredHeight());
    }
}
