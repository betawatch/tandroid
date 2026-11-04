package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qe0 extends LinearLayout implements org.telegram.messenger.cs {
    public final org.telegram.ui.Components.k9 a;
    public final int b;

    public qe0(Context context) {
        super(context);
        this.b = org.telegram.messenger.h10.t0;
        setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        addView(k9Var, b8.mf.t(org.telegram.messenger.hs.p1, org.telegram.messenger.hs.p1, 49, 0, 2, 0, 0));
    }

    public final void a() {
        int i3 = this.b;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(i3).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.li.b0(i3).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
            org.telegram.messenger.li.b0(i3).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
        } else {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.k(org.telegram.messenger.ac.b(document), "104_104", "tgs", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.a7, 1.0f, null), tL_messages_stickerSet);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.hs.f(this.b).c(this, org.telegram.messenger.hs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.b).n(this, org.telegram.messenger.hs.y0);
    }
}
