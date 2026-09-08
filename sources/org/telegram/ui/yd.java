package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class yd extends LinearLayout {
    public static float b = 1.0f;
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 4:
                if (!(getParent() instanceof org.telegram.ui.Components.zn0)) {
                    return super.drawChild(canvas, view, j3);
                }
                org.telegram.ui.Components.zn0 zn0Var = (org.telegram.ui.Components.zn0) getParent();
                canvas.save();
                LinearLayout linearLayout = zn0Var.b;
                Path path = zn0Var.n;
                if (view != null && org.telegram.ui.Components.zn0.e(view)) {
                    int indexOfChild = linearLayout.indexOfChild(view);
                    int i10 = indexOfChild - 1;
                    View childAt = i10 < 0 ? null : linearLayout.getChildAt(i10);
                    int i11 = indexOfChild + 1;
                    View childAt2 = i11 < linearLayout.getChildCount() ? linearLayout.getChildAt(i11) : null;
                    boolean z10 = childAt != null && org.telegram.ui.Components.zn0.e(childAt);
                    boolean z11 = childAt2 != null && org.telegram.ui.Components.zn0.e(childAt2);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), Math.max(zn0Var.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + linearLayout.getY()), view.getX() + view.getWidth(), Math.min(AndroidUtilities.dp(16.0f) + zn0Var.getScrollY() + zn0Var.getHeight(), view.getY() + linearLayout.getY() + view.getHeight()));
                    if (z10 && z11) {
                        z10 = view.getY() >= rectF.top;
                        boolean z12 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
                        if (!z10 || !z12) {
                            z11 = z12;
                        }
                    }
                    if (!z10 && !z11) {
                        path.rewind();
                        float f7 = zn0Var.c;
                        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z10) {
                        path.rewind();
                        path.addRoundRect(rectF, zn0Var.d, Path.Direction.CW);
                        canvas.clipPath(path);
                    } else if (!z11) {
                        path.rewind();
                        path.addRoundRect(rectF, zn0Var.e, Path.Direction.CW);
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
                if (getParent() instanceof org.telegram.ui.Components.zn0) {
                    ((org.telegram.ui.Components.zn0) getParent()).invalidate();
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
    public yd(Context context) {
        super(context);
        this.a = 4;
        setWillNotDraw(false);
    }
}
