// default package

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vj6 extends LinearLayout implements fn7 {
    public final de0 a;
    public final int b;

    public vj6(Context context) {
        super(context);
        this.b = yac.t0;
        setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
        setOrientation(1);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        addView(de0Var, tre.t(jn7.o1, jn7.o1, 49, 0, 2, 0, 0));
    }

    public final void a() {
        int i = this.b;
        TLRPC.TL_messages_stickerSet q0 = ls6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = ls6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() < 4) {
            ls6.d0(i).d1("tg_placeholders_android", false, tL_messages_stickerSet == null);
        } else {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.a.n(jn5.b(document), "104_104", "tgs", lp3.f(document, aob.a7, 1.0f, null), tL_messages_stickerSet);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        jn7.f(this.b).b(this, jn7.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.b).n(this, jn7.y0);
    }
}
