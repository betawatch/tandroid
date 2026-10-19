package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ws implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ at c;

    public ws(at atVar, ArrayList arrayList, boolean z10) {
        this.c = atVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        et etVar = this.c.a;
        if (etVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            ct ctVar = etVar.l;
            if (ctVar != null) {
                TLRPC.Document document = etVar.W;
                String str = etVar.Y;
                boolean z10 = true;
                Object obj = etVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z10 = false;
                }
                ctVar.l(document, str, obj, z10, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            ct ctVar2 = etVar.l;
            if (ctVar2 != null) {
                ctVar2.M(etVar.a0, etVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(etVar.r).addRecentSticker(2, etVar.b0, etVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = etVar.W;
            Object obj2 = etVar.b0;
            String str2 = etVar.Y;
            ct ctVar3 = etVar.l;
            if (ctVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.f5.K(etVar.w, ctVar3.a(), new a1.d(ctVar3, document2, str2, obj2, 12));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(etVar.r).addRecentSticker(0, etVar.b0, etVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            etVar.l.i(etVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            etVar.l.n(etVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            etVar.l.F(etVar.W);
        }
        etVar.p();
    }
}
