// default package

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sp1 implements iac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sp1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // iac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View view;
        byte b = this.a;
        int i = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((yv1) obj2).E8((Context) obj);
            case 1:
                xza xzaVar = (xza) obj2;
                jza jzaVar = (jza) obj;
                int childCount = xzaVar.T.getChildCount();
                while (true) {
                    wya wyaVar = xzaVar.T;
                    if (i >= childCount) {
                        wyaVar.setItemAnimator(null);
                        xzaVar.C0.e();
                        return null;
                    }
                    View childAt = wyaVar.getChildAt(i);
                    if (childAt instanceof iza) {
                        iza izaVar = (iza) childAt;
                        if (izaVar.r == jzaVar) {
                            return izaVar;
                        }
                    }
                    i++;
                }
            default:
                l7c l7cVar = (l7c) obj2;
                Object obj3 = ((c6c) obj).H;
                r59 r59Var = l7cVar.d;
                int i2 = 0;
                while (true) {
                    if (i2 < l7cVar.E.size()) {
                        c6c G = l7cVar.G(i2);
                        if (G == null || G.H != obj3) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    while (i < r59Var.getChildCount()) {
                        view = r59Var.getChildAt(i);
                        int R = RecyclerView.R(view);
                        if (R != -1 && R == i2) {
                            if (view instanceof vza) {
                                return null;
                            }
                            return (vza) view;
                        }
                        i++;
                    }
                }
                view = null;
                if (view instanceof vza) {
                }
                break;
        }
    }
}
