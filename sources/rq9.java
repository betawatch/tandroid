// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rq9 implements fd, nr7 {
    public final /* synthetic */ er9 a;

    public /* synthetic */ rq9(er9 er9Var) {
        this.a = er9Var;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        mq5 g = l2dVar.a.g(647);
        er9 er9Var = this.a;
        er9Var.R = g;
        er9Var.f.requestLayout();
        return l2d.b;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        this.a.dismiss();
        jn7.e().k(jn7.v2, new Object[0]);
    }
}
