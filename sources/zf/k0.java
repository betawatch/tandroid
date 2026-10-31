package zf;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                a0.h hVar = (a0.h) this.d;
                x0Var.p0 = null;
                x0Var.Y(hVar, arrayList, true);
                break;
            case 1:
                m1 m1Var = (m1) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                HashMap hashMap = (HashMap) this.d;
                m1Var.q = arrayList2;
                m1Var.r = hashMap;
                m1Var.s = true;
                m1Var.a.c0(arrayList2);
                break;
            default:
                n1 n1Var = (n1) this.c;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str = tL_messages_searchStickerSets.q;
                o1 o1Var = n1Var.a;
                String str2 = o1Var.R;
                j41 j41Var = o1Var.e;
                if (str.equals(str2)) {
                    n1Var.a();
                    j41Var.b.h.getProgressDrawable().e = false;
                    o1Var.N = 0;
                    j41Var.b(true);
                    o1Var.E.addAll(tL_messages_foundStickerSets.sets);
                    o1Var.f();
                    break;
                }
                break;
        }
    }
}
