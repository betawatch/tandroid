// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x04 extends az3 {
    public final /* synthetic */ TLRPC.StickerSet Q1;
    public final /* synthetic */ e34 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x04(e34 e34Var, d dVar, Context context, ylb ylbVar, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(dVar, context, ylbVar, arrayList);
        this.R1 = e34Var;
        this.Q1 = stickerSet;
    }

    @Override // az3
    public final void F0(boolean z) {
        e34 e34Var = this.R1;
        ArrayList arrayList = e34Var.q1;
        TLRPC.StickerSet stickerSet = this.Q1;
        if (!z) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        e34Var.T();
    }

    @Override // az3, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        this.R1.w2 = false;
        super.dismiss();
    }
}
