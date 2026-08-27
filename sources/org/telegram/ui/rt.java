package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rt extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f = new ArrayList();
    public final /* synthetic */ tt h;

    public rt(tt ttVar, Context context, HashMap hashMap) {
        this.h = ttVar;
        this.c = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((nt) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        nt ntVar = (nt) this.e.get(i10);
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) o1Var.a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(tt.V(ntVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ntVar.c;
        } else {
            str = null;
        }
        x9Var.c(replaceEmoji, str, false, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.lk0(tt.U(this.c));
    }
}
