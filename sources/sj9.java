// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class sj9 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ tj9 b;
    public final /* synthetic */ uj9 c;
    public final /* synthetic */ View d;

    public /* synthetic */ sj9(tj9 tj9Var, uj9 uj9Var, View view) {
        this.b = tj9Var;
        this.c = uj9Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.d;
        uj9 uj9Var = this.c;
        tj9 tj9Var = this.b;
        switch (b) {
            case 0:
                tj9Var.getClass();
                if (view != null) {
                    view.post(new sj9(tj9Var, uj9Var, view));
                    break;
                }
                break;
            default:
                if (uj9Var != null) {
                    tj9Var.getClass();
                    k47 k47Var = uj9Var.b;
                    if (k47Var != null) {
                        k47Var.N0 = true;
                    }
                    ArrayList arrayList = uj9Var.n;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        qkb qkbVar = (qkb) obj;
                        if (qkbVar instanceof tj9) {
                            ((tj9) qkbVar).x.clear();
                        }
                    }
                } else {
                    tj9Var.x.clear();
                }
                view.invalidate();
                break;
        }
    }

    public /* synthetic */ sj9(tj9 tj9Var, View view, uj9 uj9Var) {
        this.b = tj9Var;
        this.d = view;
        this.c = uj9Var;
    }
}
