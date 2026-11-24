// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class pe9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ye9 e;

    public pe9(ye9 ye9Var, int i, int i2, int i3, int i4) {
        this.e = ye9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final TL_iv.RichMessage a() {
        ye9 ye9Var = this.e;
        ArrayList arrayList = ye9Var.t3;
        int i = this.a;
        lk0 lk0Var = (lk0) arrayList.get(i);
        ArrayList arrayList2 = ye9Var.t3;
        int i2 = this.b;
        lk0 lk0Var2 = (lk0) arrayList2.get(i2);
        TL_iv.PageBlock pageBlock = lk0Var.b;
        TL_iv.PageBlock pageBlock2 = lk0Var2.b;
        int i3 = this.d;
        TL_iv.PageBlock K4 = ye9Var.K4(lk0Var, this.c, i == i2 ? i3 : -1);
        TL_iv.PageBlock K42 = i == i2 ? null : ye9Var.K4(lk0Var2, 0, i3);
        if (K4 != null) {
            lk0Var.b = K4;
        }
        if (K42 != null) {
            lk0Var2.b = K42;
        }
        try {
            ArrayList<TL_iv.PageBlock> U2 = ye9Var.U2(i, i2 + 1, 0, false);
            ArrayList<TLRPC.Photo> w2 = ye9Var.w2(i, i2);
            ArrayList<TLRPC.Document> v2 = ye9Var.v2(i, i2);
            lk0Var.b = pageBlock;
            lk0Var2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = U2;
            richMessage.photos = w2;
            richMessage.documents = v2;
            return richMessage;
        } catch (Throwable th) {
            lk0Var.b = pageBlock;
            lk0Var2.b = pageBlock2;
            throw th;
        }
    }
}
