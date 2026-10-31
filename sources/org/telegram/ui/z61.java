package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z61 implements org.telegram.messenger.o20, org.telegram.messenger.p20 {
    public final /* synthetic */ StickersActivity a;

    public /* synthetic */ z61(StickersActivity stickersActivity) {
        this.a = stickersActivity;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(org.telegram.ui.Components.a51 a51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        StickersActivity stickersActivity = this.a;
        if (stickersActivity.x.isEmpty() && (a51Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.r0((org.telegram.ui.Cells.k8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        StickersActivity.Y(this.a, (org.telegram.ui.Components.a51) obj, (View) obj2);
    }
}
