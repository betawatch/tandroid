// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t62 extends View {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t62(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 14:
                canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
                break;
            case 15:
                canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
                break;
            case 16:
                canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
                break;
            case 17:
                canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
                break;
            case 27:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, hl.L(14.0f), 2.0f, getMeasuredHeight() - hl.L(14.0f), aob.j0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(6.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (hl.q.y * 0.4f), TLObject.FLAG_30));
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(300.0f), TLObject.FLAG_30));
                break;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), TLObject.FLAG_30));
                break;
            case 6:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(4.0f), TLObject.FLAG_30));
                break;
            case 7:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(81.0f), TLObject.FLAG_30));
                break;
            case 8:
                Point point = hl.q;
                int i3 = point.x;
                int i4 = point.y;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i4 * (i3 < i4 ? 0.56f : 0.3f)), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(j95.u5 ? 0.0f : 8.0f), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(5.0f), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(8.0f), TLObject.FLAG_30));
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 27:
            default:
                super.onMeasure(i, i2);
                break;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(12.0f), TLObject.FLAG_30));
                break;
            case 19:
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(36.0f));
                break;
            case 20:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(68.0f), TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(7.33f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                break;
            case 25:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), TLObject.FLAG_30));
                break;
            case 26:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
                break;
            case 28:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(4.0f), TLObject.FLAG_30));
                break;
        }
    }
}
