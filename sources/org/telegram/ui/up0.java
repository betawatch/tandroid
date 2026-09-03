package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class up0 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ wp0 d;

    public up0(wp0 wp0Var, Context context) {
        this.d = wp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) l1Var.a;
        wp0 wp0Var = this.d;
        x5Var.setAlbumsCount(wp0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = wp0Var.f;
            if (i11 >= i12) {
                x5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < wp0Var.d.size()) {
                x5Var.a(i11, (MediaController.AlbumEntry) wp0Var.d.get(i13));
            } else {
                x5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
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
        x5Var.setDelegate(new kl0(this, 1));
        return new org.telegram.ui.Components.dl0(x5Var);
    }
}
