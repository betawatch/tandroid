// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vyb extends v79 {
    public int a;
    public int b;
    public final /* synthetic */ tzb c;

    public vyb(tzb tzbVar) {
        this.c = tzbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // v79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        tzb tzbVar = this.c;
        int K0 = tzbVar.G.K0();
        if (K0 != -1) {
            f89 L = recyclerView.L(K0);
            int top = L != null ? L.a.getTop() : 0;
            int i3 = this.a;
            if (i3 == K0) {
                int i4 = this.b;
                int i5 = i4 - top;
                z = top < i4;
                if (Math.abs(i5) <= 1) {
                    z2 = false;
                    if (z2) {
                        tzbVar.H0(z || !tzbVar.L, true);
                    }
                    this.a = K0;
                    this.b = top;
                }
            } else {
                z = K0 > i3;
            }
            z2 = true;
            if (z2) {
            }
            this.a = K0;
            this.b = top;
        }
    }
}
