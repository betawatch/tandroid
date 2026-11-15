package xg;

import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.messenger.ur;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements sw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        f fVar = (f) this.a;
        String str = (String) this.b;
        long j3 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            j3 = ((ur) arrayList.get(i11)).a;
            fVar.e.getSendMessagesHelper().r0(cz.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        ywVar.finishFragment();
        wg.h.h(j3);
        return true;
    }
}
