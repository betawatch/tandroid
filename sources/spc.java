// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class spc extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spc(uqc uqcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = uqcVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.dispatchSetPressed(z);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        switch (this.a) {
            case 0:
                uqc uqcVar = this.b;
                if (uqcVar.q0) {
                    wa waVar = uqcVar.a;
                    i = -(waVar != null ? waVar.getPaddingTop() : 0);
                } else {
                    i = 0;
                }
                canvas.save();
                int width = getWidth();
                int height = getHeight();
                wa waVar2 = uqcVar.a;
                canvas.clipRect(0, i, width, (waVar2 != null ? waVar2.getPaddingBottom() : 0) + height);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                if (getParent() instanceof ViewGroup) {
                    ((ViewGroup) getParent()).setClipChildren(false);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                uqc uqcVar = this.b;
                ir1 ir1Var = uqcVar.s0;
                wa waVar = uqcVar.a;
                int i5 = -(waVar != null ? waVar.getPaddingTop() : 0);
                int i6 = i3 - i;
                int i7 = i4 - i2;
                wa waVar2 = uqcVar.a;
                ir1Var.layout(0, i5, i6, (waVar2 != null ? waVar2.getPaddingBottom() : 0) + i7);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                uqcVar.d1(0);
                uqcVar.d1(1);
                ir1 ir1Var = uqcVar.s0;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                wa waVar = uqcVar.a;
                int paddingTop = (waVar != null ? waVar.getPaddingTop() : 0) + size2;
                wa waVar2 = uqcVar.a;
                ir1Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((waVar2 != null ? waVar2.getPaddingBottom() : 0) + paddingTop, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(uqcVar.T.c(hl.L(4.0f))));
                break;
        }
    }

    private final void a(boolean z) {
    }
}
