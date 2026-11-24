// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class s6b extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new s6b());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        t6b t6bVar = (t6b) view;
        Object obj = c6cVar.H;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = c6cVar.E;
        io ioVar = t6bVar.e;
        ImageView imageView = t6bVar.b;
        ImageView imageView2 = t6bVar.c;
        boolean z2 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView.setAlpha(z2 ? 1.0f : 0.0f);
        imageView.setScaleX(z2 ? 1.0f : 0.4f);
        imageView.setScaleY(z2 ? 1.0f : 0.4f);
        imageView2.setAlpha(z2 ? 0.0f : 1.0f);
        imageView2.setScaleX(z2 ? 0.4f : 1.0f);
        imageView2.setScaleY(z2 ? 0.4f : 1.0f);
        io ioVar2 = t6bVar.d;
        if (z2) {
            ioVar2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            ioVar.c(webPage.description, false, true);
        } else {
            ioVar2.c(t6bVar.h, false, true);
            ioVar.c(t6bVar.n, false, true);
        }
        t6bVar.f.setOnClickListener(onClickListener);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new t6b(context);
    }
}
