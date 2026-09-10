package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class zd extends LinearLayout {
    public static float b = 1.0f;
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 4:
                if (!(getParent() instanceof org.telegram.ui.Components.io0)) {
                    return super.drawChild(canvas, view, j3);
                }
                org.telegram.ui.Components.io0 io0Var = (org.telegram.ui.Components.io0) getParent();
                canvas.save();
                LinearLayout linearLayout = io0Var.b;
                Path path = io0Var.n;
                if (view != null && org.telegram.ui.Components.io0.e(view)) {
                    int indexOfChild = linearLayout.indexOfChild(view);
                    int i10 = indexOfChild - 1;
                    View childAt = i10 < 0 ? null : linearLayout.getChildAt(i10);
                    int i11 = indexOfChild + 1;
                    View childAt2 = i11 < linearLayout.getChildCount() ? linearLayout.getChildAt(i11) : null;
                    boolean z10 = childAt != null && org.telegram.ui.Components.io0.e(childAt);
                    boolean z11 = childAt2 != null && org.telegram.ui.Components.io0.e(childAt2);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), Math.max(io0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY()), view.getX() + view.getWidth(), Math.min(AndroidUtilities.dp(16.0f) + io0Var.getScrollY() + io0Var.getHeight(), view.getY() + linearLayout.getY() + view.getHeight()));
                    if (z10 && z11) {
                        z10 = view.getY() >= rectF.top;
                        boolean z12 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
                        if (!z10 || !z12) {
                            z11 = z12;
                        }
                    }
                    if (!z10 && !z11) {
                        path.rewind();
                        float f7 = io0Var.c;
                        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z10) {
                        path.rewind();
                        path.addRoundRect(rectF, io0Var.d, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z11) {
                        path.rewind();
                        path.addRoundRect(rectF, io0Var.e, Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                setPivotX(getWidth());
                break;
            case 3:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                if (getParent() instanceof org.telegram.ui.Components.io0) {
                    ((org.telegram.ui.Components.io0) getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 2:
            case 4:
            case 5:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
                break;
            case 6:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(0.0f);
                break;
            case 7:
                super.onMeasure(i10, i11);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(600.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), AndroidUtilities.dp(800.0f)), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(Context context) {
        super(context);
        this.a = 4;
        setWillNotDraw(false);
    }
}
