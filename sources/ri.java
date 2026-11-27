// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ri extends LinearLayout {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hq7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri(Context context, hq7 hq7Var, byte b) {
        super(context);
        this.a = b;
        this.c = hq7Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.a;
        hq7 hq7Var = this.c;
        switch (b) {
            case 0:
                qi qiVar = (qi) hq7Var;
                this.b = true;
                Point point = hl.q;
                i3 = point.x > point.y ? 3 : 5;
                qiVar.setItemCount(i3);
                qiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                wi wiVar = (wi) hq7Var;
                this.b = true;
                Point point2 = hl.q;
                i3 = point2.x > point2.y ? 3 : 5;
                wiVar.setItemCount(i3);
                wiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }
}
