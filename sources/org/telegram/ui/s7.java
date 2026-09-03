package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s7 extends k7 {
    public org.telegram.ui.Cells.p7 n;
    public final ArrayList r;
    public org.telegram.ui.Components.mq s;
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

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.s = mqVar;
            mqVar.w = true;
        }
        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) l1Var.a;
        mh.a aVar = ((q7) this.e.get(i10)).d;
        Object tag = q7Var.getTag();
        ImageReceiver imageReceiver = q7Var.c;
        boolean z4 = aVar == tag;
        q7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), e2.c.h(max, "_", max), this.s, null, null, 0);
            q7Var.m(AndroidUtilities.formatFileSize(aVar.c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), e2.c.h(max, "_", max), this.s, null, null, 0);
            q7Var.m(AndroidUtilities.formatFileSize(aVar.c), false);
        }
        q7Var.i(this.v.f.j.contains(aVar), z4);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new org.telegram.ui.Cells.p7(viewGroup.getContext(), null);
        }
        r7 r7Var = new r7(this, viewGroup.getContext(), this.n, this.v.d.getCurrentAccount());
        r7Var.setStyle(1);
        return new org.telegram.ui.Components.dl0(r7Var);
    }
}
