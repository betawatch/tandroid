package sh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l2 extends u {
    public final /* synthetic */ p2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(p2 p2Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.s = p2Var;
    }

    @Override // sh.u, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.s.a0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
