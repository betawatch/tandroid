package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class r7 extends j7 {
    public org.telegram.ui.Cells.r7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.zq s;
    public final /* synthetic */ v7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(v7 v7Var) {
        super(v7Var, 1);
        this.v = v7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.j7, org.telegram.ui.i7
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
            arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, ((p7) arrayList2.get(i10)).d.a.getPath(), 0, ((p7) arrayList2.get(i10)).d.d == 1, 0, 0, 0L));
            i10++;
        }
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.X9, false)), org.telegram.ui.ActionBar.h6.R4);
            this.s = zqVar;
            zqVar.w = true;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) b1Var.a;
        bi.b bVar = ((p7) this.e.get(i10)).d;
        Object tag = s7Var.getTag();
        ImageReceiver imageReceiver = s7Var.c;
        boolean z10 = bVar == tag;
        s7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = bVar.d;
        File file = bVar.a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.s, null, null, 0);
            s7Var.m(AndroidUtilities.formatFileSize(bVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.s, null, null, 0);
            s7Var.m(AndroidUtilities.formatFileSize(bVar.c), false);
        }
        s7Var.i(this.v.f.j.contains(bVar), z10);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.r7(viewGroup.getContext(), null);
        }
        q7 q7Var = new q7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        q7Var.setStyle(1);
        return new org.telegram.ui.Components.sl0(q7Var);
    }
}
