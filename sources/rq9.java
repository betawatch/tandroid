// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
