package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r5 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new r5());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        s5 s5Var = (s5) view;
        Object obj = a51Var.G;
        TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
        View.OnClickListener onClickListener = a51Var.D;
        org.telegram.ui.Components.f6 f6Var = s5Var.e;
        org.telegram.ui.Components.f6 f6Var2 = s5Var.d;
        ImageView imageView = s5Var.c;
        ImageView imageView2 = s5Var.b;
        boolean z11 = (webPage == null || (webPage instanceof TLRPC.TL_webPagePending)) ? false : true;
        imageView2.setAlpha(z11 ? 1.0f : 0.0f);
        imageView2.setScaleX(z11 ? 1.0f : 0.4f);
        imageView2.setScaleY(z11 ? 1.0f : 0.4f);
        imageView.setAlpha(z11 ? 0.0f : 1.0f);
        imageView.setScaleX(z11 ? 0.4f : 1.0f);
        imageView.setScaleY(z11 ? 0.4f : 1.0f);
        if (z11) {
            f6Var2.c(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
            f6Var.c(webPage.description, false, true);
        } else {
            f6Var2.c(s5Var.h, false, true);
            f6Var.c(s5Var.n, false, true);
        }
        s5Var.f.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s5(context);
    }
}
