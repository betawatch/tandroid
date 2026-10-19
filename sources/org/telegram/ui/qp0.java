package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class qp0 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ sp0 d;

    public qp0(sp0 sp0Var, Context context) {
        this.d = sp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) b1Var.a;
        sp0 sp0Var = this.d;
        x5Var.setAlbumsCount(sp0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = sp0Var.f;
            if (i11 >= i12) {
                x5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < sp0Var.d.size()) {
                x5Var.a(i11, (MediaController.AlbumEntry) sp0Var.d.get(i13));
            } else {
                x5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context);
        x5Var.e = new Paint();
        x5Var.b = new MediaController.AlbumEntry[4];
        x5Var.a = new org.telegram.ui.Cells.v5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            x5Var.a[i11] = new org.telegram.ui.Cells.v5(x5Var, context);
            x5Var.addView(x5Var.a[i11]);
            x5Var.a[i11].setVisibility(4);
            x5Var.a[i11].setTag(Integer.valueOf(i11));
            x5Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(x5Var, 9));
        }
        x5Var.setDelegate(new pp0(this, 0));
        return new org.telegram.ui.Components.sl0(x5Var);
    }
}
