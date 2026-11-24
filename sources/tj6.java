// default package

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tj6 extends LinearLayout implements jm7 {
    public final bf0 a;
    public final int b;

    public tj6(Context context) {
        super(context);
        this.b = z8c.t0;
        setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
        setOrientation(1);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        addView(bf0Var, qoe.t(nm7.o1, nm7.o1, 49, 0, 2, 0, 0));
    }

    public final void a() {
        int i = this.b;
        TLRPC.TL_messages_stickerSet q0 = hs6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = hs6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
            hs6.d0(i).d1("tg_placeholders_android", false, tL_messages_stickerSet == null);
        } else {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.n(gn5.b(document), "104_104", "tgs", eq3.f(document, cmb.Z6, 1.0f, null), tL_messages_stickerSet);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        nm7.f(this.b).b(this, nm7.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.b).n(this, nm7.y0);
    }
}
