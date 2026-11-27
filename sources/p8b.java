// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class p8b extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new p8b());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        q8b q8bVar = (q8b) view;
        Object obj = b8cVar.H;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = b8cVar.E;
        in inVar = q8bVar.e;
        ImageView imageView = q8bVar.b;
        ImageView imageView2 = q8bVar.c;
        boolean z2 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView.setAlpha(z2 ? 1.0f : 0.0f);
        imageView.setScaleX(z2 ? 1.0f : 0.4f);
        imageView.setScaleY(z2 ? 1.0f : 0.4f);
        imageView2.setAlpha(z2 ? 0.0f : 1.0f);
        imageView2.setScaleX(z2 ? 0.4f : 1.0f);
        imageView2.setScaleY(z2 ? 0.4f : 1.0f);
        in inVar2 = q8bVar.d;
        if (z2) {
            inVar2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            inVar.c(webPage.description, false, true);
        } else {
            inVar2.c(q8bVar.h, false, true);
            inVar.c(q8bVar.n, false, true);
        }
        q8bVar.f.setOnClickListener(onClickListener);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new q8b(context);
    }
}
