// default package

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class vl3 extends LinearLayout implements jm7 {
    public int a;
    public bf0 b;
    public TextView c;
    public TextView d;
    public TextView e;

    public final void a() {
        bf0 bf0Var = this.b;
        int i = this.a;
        TLRPC.TL_messages_stickerSet q0 = hs6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            q0 = hs6.d0(i).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            hs6.d0(i).d1("tg_placeholders_android", false, tL_messages_stickerSet == null);
            bf0Var.getImageReceiver().f();
            return;
        }
        meb d = eq3.d(document.thumbs, cmb.Z6, 0.2f, false);
        if (d != null) {
            d.e = 512;
            d.f = 512;
        }
        this.b.n(gn5.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
        bf0Var.getImageReceiver().M(2);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView.setText(jb6.M0(2131747878, null));
            textView2.setText(jb6.M0(2131747877, null));
            textView3.setVisibility(0);
            textView3.setText(jb6.M0(2131751689, null));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView.setText(jb6.M0(2131747874, null));
            textView2.setText(jb6.M0(2131747873, null));
            textView3.setVisibility(8);
        } else {
            textView.setText(jb6.M0(2131747876, null));
            textView2.setText(jb6.M0(2131747875, null));
            textView3.setVisibility(0);
            textView3.setText(jb6.M0(2131751683, null));
        }
    }
}
