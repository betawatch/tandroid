package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ve0 extends LinearLayout implements org.telegram.messenger.is {
    public final org.telegram.ui.Components.i9 a;
    public final int b;

    public ve0(Context context) {
        super(context);
        this.b = org.telegram.messenger.m10.t0;
        setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.a = i9Var;
        addView(i9Var, c8.ja.t(org.telegram.messenger.ns.p1, org.telegram.messenger.ns.p1, 49, 0, 2, 0, 0));
    }

    public final void a() {
        int i7 = this.b;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.si.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
            org.telegram.messenger.si.b0(i7).c1("tg_placeholders_android", false, tL_messages_stickerSet == null);
        } else {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.k(org.telegram.messenger.gc.b(document), "104_104", "tgs", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.a7, 1.0f, null), tL_messages_stickerSet);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ns.f(this.b).c(this, org.telegram.messenger.ns.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.b).n(this, org.telegram.messenger.ns.y0);
    }
}
