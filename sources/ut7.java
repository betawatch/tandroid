// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt7 b;

    public /* synthetic */ ut7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.invalidate();
                wt7Var.b();
                break;
            default:
                ArrayList arrayList = wt7Var.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((p09) obj).x(true);
                }
                arrayList.clear();
                break;
        }
    }
}
