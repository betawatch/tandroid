package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yp0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ aq0 d;

    public yp0(aq0 aq0Var, Context context) {
        this.d = aq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) e1Var.a;
        aq0 aq0Var = this.d;
        c6Var.setAlbumsCount(aq0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = aq0Var.f;
            if (i11 >= i12) {
                c6Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < aq0Var.d.size()) {
                c6Var.a(i11, (MediaController.AlbumEntry) aq0Var.d.get(i13));
            } else {
                c6Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context);
        c6Var.e = new Paint();
        c6Var.b = new MediaController.AlbumEntry[4];
        c6Var.a = new org.telegram.ui.Cells.a6[4];
        for (int i11 = 0; i11 < 4; i11++) {
            c6Var.a[i11] = new org.telegram.ui.Cells.a6(c6Var, context);
            c6Var.addView(c6Var.a[i11]);
            c6Var.a[i11].setVisibility(4);
            c6Var.a[i11].setTag(Integer.valueOf(i11));
            c6Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(c6Var, 9));
        }
        c6Var.setDelegate(new hl0(this, 2));
        return new org.telegram.ui.Components.vl0(c6Var);
    }
}
