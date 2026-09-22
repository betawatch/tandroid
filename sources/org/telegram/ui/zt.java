package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zt extends org.telegram.ui.Components.xl0 {
    public final Context c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f = new ArrayList();
    public final /* synthetic */ bu h;

    public zt(bu buVar, Context context, HashMap hashMap) {
        this.h = buVar;
        this.c = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((vt) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        vt vtVar = (vt) this.e.get(i10);
        org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) c1Var.a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(bu.V(vtVar), faVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + vtVar.c;
        } else {
            str = null;
        }
        faVar.c(replaceEmoji, str, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.il0(bu.U(this.c));
    }
}
