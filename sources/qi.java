// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qi extends LinearLayout {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hn7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(Context context, hn7 hn7Var, byte b) {
        super(context);
        this.a = b;
        this.c = hn7Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.a;
        hn7 hn7Var = this.c;
        switch (b) {
            case 0:
                pi piVar = (pi) hn7Var;
                this.b = true;
                Point point = gl.q;
                i3 = point.x > point.y ? 3 : 5;
                piVar.setItemCount(i3);
                piVar.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                vi viVar = (vi) hn7Var;
                this.b = true;
                Point point2 = gl.q;
                i3 = point2.x > point2.y ? 3 : 5;
                viVar.setItemCount(i3);
                viVar.getLayoutParams().height = gl.L(42.0f) * i3;
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
