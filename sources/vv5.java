// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vv5 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ bw5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv5(bw5 bw5Var, Context context) {
        super(context);
        this.b = bw5Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bw5 bw5Var = this.b;
        ArrayList arrayList = bw5Var.s1;
        if (bw5Var.v1 == 0) {
            int size = View.MeasureSpec.getSize(i);
            int L = hl.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bw5Var.p1.getLayoutParams();
            if (L > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = bw5Var.w1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, bw5Var.w1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (bw5Var.w1 != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(bw5Var.w1);
                        arrayList.add(max, bw5Var.w1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
