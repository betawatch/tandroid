package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zs implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dt c;

    public zs(dt dtVar, ArrayList arrayList, boolean z10) {
        this.c = dtVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ht htVar = this.c.a;
        if (htVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            ft ftVar = htVar.l;
            if (ftVar != null) {
                ftVar.l(htVar.W, htVar.Y, htVar.b0, ((Integer) arrayList.get(intValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            ft ftVar2 = htVar.l;
            if (ftVar2 != null) {
                ftVar2.M(htVar.a0, htVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(htVar.r).addRecentSticker(2, htVar.b0, htVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document = htVar.W;
            Object obj = htVar.b0;
            String str = htVar.Y;
            ft ftVar3 = htVar.l;
            if (ftVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.y4.L(htVar.w, ftVar3.a(), new a1.d(ftVar3, document, str, obj, 12));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(htVar.r).addRecentSticker(0, htVar.b0, htVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            htVar.l.i(htVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            htVar.l.n(htVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            htVar.l.E(htVar.W);
        }
        htVar.p();
    }
}
