// default package

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qv5 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ wv5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv5(wv5 wv5Var, Context context) {
        super(context);
        this.b = wv5Var;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        wv5 wv5Var = this.b;
        ArrayList arrayList = wv5Var.s1;
        if (wv5Var.v1 == 0) {
            int size = View.MeasureSpec.getSize(i);
            int L = gm.L(95.0f) * arrayList.size();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) wv5Var.p1.getLayoutParams();
            if (L > size) {
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                if (!this.a) {
                    TLRPC.Peer peer = wv5Var.w1;
                    if (peer != null) {
                        arrayList.remove(peer);
                        arrayList.add(0, wv5Var.w1);
                    }
                    this.a = true;
                }
            } else {
                layoutParams.width = -2;
                layoutParams.gravity = 49;
                if (!this.a) {
                    if (wv5Var.w1 != null) {
                        int max = arrayList.size() % 2 == 0 ? Math.max(0, (arrayList.size() / 2) - 1) : arrayList.size() / 2;
                        arrayList.remove(wv5Var.w1);
                        arrayList.add(max, wv5Var.w1);
                    }
                    this.a = true;
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
