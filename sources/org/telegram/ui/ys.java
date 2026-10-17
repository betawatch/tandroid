package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ys implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ct c;

    public ys(ct ctVar, ArrayList arrayList, boolean z10) {
        this.c = ctVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gt gtVar = this.c.a;
        if (gtVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            et etVar = gtVar.l;
            if (etVar != null) {
                TLRPC.Document document = gtVar.W;
                String str = gtVar.Y;
                boolean z10 = true;
                Object obj = gtVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z10 = false;
                }
                etVar.l(document, str, obj, z10, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            et etVar2 = gtVar.l;
            if (etVar2 != null) {
                etVar2.M(gtVar.a0, gtVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(gtVar.r).addRecentSticker(2, gtVar.b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = gtVar.W;
            Object obj2 = gtVar.b0;
            String str2 = gtVar.Y;
            et etVar3 = gtVar.l;
            if (etVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.f5.K(gtVar.w, etVar3.a(), new a1.d(etVar3, document2, str2, obj2, 12));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(gtVar.r).addRecentSticker(0, gtVar.b0, gtVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            gtVar.l.i(gtVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            gtVar.l.n(gtVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            gtVar.l.F(gtVar.W);
        }
        gtVar.p();
    }
}
