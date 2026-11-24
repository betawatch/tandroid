// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vwb extends k69 {
    public int a;
    public int b;
    public final /* synthetic */ sxb c;

    public vwb(sxb sxbVar) {
        this.c = sxbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // k69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        sxb sxbVar = this.c;
        int K0 = sxbVar.G.K0();
        if (K0 != -1) {
            u69 K = recyclerView.K(K0);
            int top = K != null ? K.a.getTop() : 0;
            int i3 = this.a;
            if (i3 == K0) {
                int i4 = this.b;
                int i5 = i4 - top;
                z = top < i4;
                if (Math.abs(i5) <= 1) {
                    z2 = false;
                    if (z2) {
                        sxbVar.H0(z || !sxbVar.L, true);
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
