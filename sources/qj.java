// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qj extends LinearLayout {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ lp7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj(Context context, lp7 lp7Var, byte b) {
        super(context);
        this.a = b;
        this.c = lp7Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.a;
        lp7 lp7Var = this.c;
        switch (b) {
            case 0:
                pj pjVar = (pj) lp7Var;
                this.b = true;
                Point point = gm.q;
                i3 = point.x > point.y ? 3 : 5;
                pjVar.setItemCount(i3);
                pjVar.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                vj vjVar = (vj) lp7Var;
                this.b = true;
                Point point2 = gm.q;
                i3 = point2.x > point2.y ? 3 : 5;
                vjVar.setItemCount(i3);
                vjVar.getLayoutParams().height = gm.L(42.0f) * i3;
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
