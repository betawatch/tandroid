package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ye0 extends LinearLayout implements org.telegram.messenger.fs {
    public final org.telegram.ui.Components.q9 a;
    public final int b;

    public ye0(Context context) {
        super(context);
        this.b = org.telegram.messenger.j10.t0;
        setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        addView(q9Var, c8.ma.t(org.telegram.messenger.ks.p1, org.telegram.messenger.ks.p1, 49, 0, 2, 0, 0));
    }

    public final void a() {
        int i7 = this.b;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = org.telegram.messenger.ri.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
            org.telegram.messenger.ri.d0(i7).f1("tg_placeholders_android", false, tL_messages_stickerSet == null);
        } else {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.k(org.telegram.messenger.fc.b(document), "104_104", "tgs", org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.a7, 1.0f, null), tL_messages_stickerSet);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ks.f(this.b).c(this, org.telegram.messenger.ks.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.b).n(this, org.telegram.messenger.ks.y0);
    }
}
