package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xs implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bt c;

    public xs(bt btVar, ArrayList arrayList, boolean z10) {
        this.c = btVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ft ftVar = this.c.a;
        if (ftVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            dt dtVar = ftVar.l;
            if (dtVar != null) {
                TLRPC.Document document = ftVar.W;
                String str = ftVar.Y;
                boolean z10 = true;
                Object obj = ftVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z10 = false;
                }
                dtVar.m(document, str, obj, z10, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            dt dtVar2 = ftVar.l;
            if (dtVar2 != null) {
                dtVar2.L(ftVar.a0, ftVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(ftVar.r).addRecentSticker(2, ftVar.b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = ftVar.W;
            Object obj2 = ftVar.b0;
            String str2 = ftVar.Y;
            dt dtVar3 = ftVar.l;
            if (dtVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.g5.K(ftVar.w, dtVar3.a(), new a1.d(dtVar3, document2, str2, obj2, 12));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(ftVar.r).addRecentSticker(0, ftVar.b0, ftVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            ftVar.l.j(ftVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            ftVar.l.o(ftVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            ftVar.l.E(ftVar.W);
        }
        ftVar.n();
    }
}
