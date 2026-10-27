package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s7 extends k7 {
    public org.telegram.ui.Cells.v7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.ar s;
    public final /* synthetic */ x7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(x7 x7Var) {
        super(x7Var, 1);
        this.v = x7Var;
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

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.X9, false)), org.telegram.ui.ActionBar.y6.R4);
            this.s = arVar;
            arVar.w = true;
        }
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) e1Var.a;
        ci.a aVar = ((q7) this.e.get(i10)).d;
        Object tag = w7Var.getTag();
        ImageReceiver imageReceiver = w7Var.c;
        boolean z10 = aVar == tag;
        w7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.s, null, null, 0);
            w7Var.m(AndroidUtilities.formatFileSize(aVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.s, null, null, 0);
            w7Var.m(AndroidUtilities.formatFileSize(aVar.c), false);
        }
        w7Var.i(this.v.h.j.contains(aVar), z10);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.v7(viewGroup.getContext(), null);
        }
        r7 r7Var = new r7(this, viewGroup.getContext(), this.n, this.v.e.getCurrentAccount());
        r7Var.setStyle(1);
        return new org.telegram.ui.Components.wl0(r7Var);
    }
}
