package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yt extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f = new ArrayList();
    public final /* synthetic */ au h;

    public yt(au auVar, Context context, HashMap hashMap) {
        this.h = auVar;
        this.c = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((ut) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        ut utVar = (ut) this.e.get(i10);
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) l1Var.a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(au.V(utVar), z9Var.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + utVar.c;
        } else {
            str = null;
        }
        z9Var.c(replaceEmoji, str, false, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.dl0(au.U(this.c));
    }
}
