// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uub extends i49 {
    public int a;
    public int b;
    public final /* synthetic */ qvb c;

    public uub(qvb qvbVar) {
        this.c = qvbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // i49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        qvb qvbVar = this.c;
        int K0 = qvbVar.G.K0();
        if (K0 != -1) {
            s49 K = recyclerView.K(K0);
            int top = K != null ? K.a.getTop() : 0;
            int i3 = this.a;
            if (i3 == K0) {
                int i4 = this.b;
                int i5 = i4 - top;
                z = top < i4;
                if (Math.abs(i5) <= 1) {
                    z2 = false;
                    if (z2) {
                        qvbVar.G0(z || !qvbVar.L, true);
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
