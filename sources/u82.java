// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u82 extends v4b {
    public final /* synthetic */ byte S = 1;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u82(w8c w8cVar) {
        super(null, false);
        this.T = w8cVar;
    }

    @Override // v4b
    public final void f(long j) {
        byte b = this.S;
        View view = this.T;
        switch (b) {
            case 0:
                v82 v82Var = (v82) view;
                v82Var.I.getOrCreateStoryViewer().H(v82Var.getContext(), j, new cd1(this, (byte) 22));
                break;
            case 1:
                ((r19) view).b(j);
                break;
            default:
                w8c w8cVar = (w8c) view;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().H(w8cVar.getContext(), j, q4b.a((r59) w8cVar.getParent()));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u82(r19 r19Var, ylb ylbVar) {
        super(ylbVar, false);
        this.T = r19Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u82(v82 v82Var) {
        super(null, true);
        this.T = v82Var;
    }
}
