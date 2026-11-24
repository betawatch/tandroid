// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class r4b extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new r4b());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        s4b s4bVar = (s4b) view;
        Object obj = c4cVar.H;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = c4cVar.E;
        hn hnVar = s4bVar.e;
        ImageView imageView = s4bVar.b;
        ImageView imageView2 = s4bVar.c;
        boolean z2 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView.setAlpha(z2 ? 1.0f : 0.0f);
        imageView.setScaleX(z2 ? 1.0f : 0.4f);
        imageView.setScaleY(z2 ? 1.0f : 0.4f);
        imageView2.setAlpha(z2 ? 0.0f : 1.0f);
        imageView2.setScaleX(z2 ? 0.4f : 1.0f);
        imageView2.setScaleY(z2 ? 0.4f : 1.0f);
        hn hnVar2 = s4bVar.d;
        if (z2) {
            hnVar2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            hnVar.c(webPage.description, false, true);
        } else {
            hnVar2.c(s4bVar.h, false, true);
            hnVar.c(s4bVar.n, false, true);
        }
        s4bVar.f.setOnClickListener(onClickListener);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new s4b(context);
    }
}
