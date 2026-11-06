package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ve0 extends LinearLayout implements org.telegram.messenger.ls {
    public final org.telegram.ui.Components.l9 a;
    public final int b;

    public ve0(Context context) {
        super(context);
        this.b = org.telegram.messenger.p10.s0;
        setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.a = l9Var;
        addView(l9Var, c8.ha.t(org.telegram.messenger.qs.p1, org.telegram.messenger.qs.p1, 49, 0, 2, 0, 0));
    }

    public final void a() {
        int i7 = this.b;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.ui.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
            org.telegram.messenger.ui.b0(i7).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
        } else {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.k(org.telegram.messenger.hc.b(document), "104_104", "tgs", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.a7, 1.0f, null), tL_messages_stickerSet);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.qs.f(this.b).c(this, org.telegram.messenger.qs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.b).n(this, org.telegram.messenger.qs.y0);
    }
}
