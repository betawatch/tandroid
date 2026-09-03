package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y6 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new y6());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        z6 z6Var = (z6) view;
        Object obj = h51Var.G;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = h51Var.D;
        org.telegram.ui.Components.k6 k6Var = z6Var.e;
        org.telegram.ui.Components.k6 k6Var2 = z6Var.d;
        ImageView imageView = z6Var.c;
        ImageView imageView2 = z6Var.b;
        boolean z10 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView2.setAlpha(z10 ? 1.0f : 0.0f);
        imageView2.setScaleX(z10 ? 1.0f : 0.4f);
        imageView2.setScaleY(z10 ? 1.0f : 0.4f);
        imageView.setAlpha(z10 ? 0.0f : 1.0f);
        imageView.setScaleX(z10 ? 0.4f : 1.0f);
        imageView.setScaleY(z10 ? 0.4f : 1.0f);
        if (z10) {
            k6Var2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            k6Var.c(webPage.description, false, true);
        } else {
            k6Var2.c(z6Var.h, false, true);
            k6Var.c(z6Var.n, false, true);
        }
        z6Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new z6(context);
    }
}
