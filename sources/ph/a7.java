package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a7 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new a7());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        b7 b7Var = (b7) view;
        Object obj = i51Var.G;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = i51Var.D;
        org.telegram.ui.Components.k6 k6Var = b7Var.e;
        org.telegram.ui.Components.k6 k6Var2 = b7Var.d;
        ImageView imageView = b7Var.c;
        ImageView imageView2 = b7Var.b;
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
            k6Var2.c(b7Var.h, false, true);
            k6Var.c(b7Var.n, false, true);
        }
        b7Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new b7(context);
    }
}
