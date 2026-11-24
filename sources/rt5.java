// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rt5 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ xt5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt5(xt5 xt5Var, Context context) {
        super(context);
        this.b = xt5Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        xt5 xt5Var = this.b;
        ArrayList arrayList = xt5Var.s1;
        if (xt5Var.v1 == 0) {
            int size = View.MeasureSpec.getSize(i);
            int L = gl.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) xt5Var.p1.getLayoutParams();
            if (L > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = xt5Var.w1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, xt5Var.w1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (xt5Var.w1 != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(xt5Var.w1);
                        arrayList.add(max, xt5Var.w1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
