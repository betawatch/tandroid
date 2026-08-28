package qh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ o3 e;

    public f3(o3 o3Var, int i9, int i10, int i11, int i12) {
        this.e = o3Var;
        this.a = i9;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final TL_iv.RichMessage a() {
        o3 o3Var = this.e;
        ArrayList arrayList = o3Var.h3;
        int i9 = this.a;
        a aVar = (a) arrayList.get(i9);
        ArrayList arrayList2 = o3Var.h3;
        int i10 = this.b;
        a aVar2 = (a) arrayList2.get(i10);
        TL_iv.PageBlock pageBlock = aVar.b;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        int i11 = this.d;
        TL_iv.PageBlock L1 = o3.L1(o3Var, aVar, this.c, i9 == i10 ? i11 : -1);
        TL_iv.PageBlock L12 = i9 == i10 ? null : o3.L1(o3Var, aVar2, 0, i11);
        if (L1 != null) {
            aVar.b = L1;
        }
        if (L12 != null) {
            aVar2.b = L12;
        }
        try {
            ArrayList<TL_iv.PageBlock> Y2 = o3Var.Y2(i9, i10 + 1, 0, false);
            ArrayList<TLRPC.Photo> A2 = o3Var.A2(i9, i10);
            ArrayList<TLRPC.Document> z22 = o3Var.z2(i9, i10);
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2;
            richMessage.documents = z22;
            return richMessage;
        } catch (Throwable th) {
            aVar.b = pageBlock;
            aVar2.b = pageBlock2;
            throw th;
        }
    }
}
