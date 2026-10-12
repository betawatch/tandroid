package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s7 extends k7 {
    public org.telegram.ui.Cells.s7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.cr s;
    public final /* synthetic */ w7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(w7 w7Var) {
        super(w7Var, 1);
        this.v = w7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.k7, org.telegram.ui.j7
    public final void F() {
        super.F();
        ArrayList arrayList = this.r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((q7) arrayList2.get(i10)).d.a.getPath(), 0, ((q7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.X9, false)), org.telegram.ui.ActionBar.g6.R4);
            this.s = crVar;
            crVar.w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) b1Var.a;
        ai.b bVar = ((q7) this.e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.c;
        boolean z10 = bVar == tag;
        t7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = bVar.d;
        File file = bVar.a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(bVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(bVar.c), false);
        }
        t7Var.i(this.v.f.j.contains(bVar), z10);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        r7 r7Var = new r7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        r7Var.setStyle(1);
        return new org.telegram.ui.Components.wl0(r7Var);
    }
}
