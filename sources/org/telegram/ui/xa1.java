package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ StickersActivity a;

    public /* synthetic */ xa1(StickersActivity stickersActivity) {
        this.a = stickersActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        StickersActivity.U(this.a, (org.telegram.ui.Components.v51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        StickersActivity stickersActivity = this.a;
        if (stickersActivity.x.isEmpty() && (v51Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.n0((org.telegram.ui.Cells.m8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
