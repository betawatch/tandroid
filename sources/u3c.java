// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u3c extends vd4 {
    public final /* synthetic */ d4c Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3c(d4c d4cVar, int i, t3c t3cVar) {
        super(5, i, t3cVar);
        this.Y = d4cVar;
    }

    @Override // vd4
    public final boolean A1() {
        d4c d4cVar = this.Y;
        return d4cVar.n.getAdapter() == d4cVar.w;
    }

    @Override // u46
    public final boolean X0() {
        return jb6.a0;
    }

    @Override // q55, u46, f69
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        int i2;
        View m;
        d4c d4cVar = this.Y;
        if (d4cVar.O) {
            return super.n0(i, ki2Var, r69Var);
        }
        int i3 = 0;
        if (d4cVar.M != null) {
            return 0;
        }
        if (d4cVar.N) {
            while (true) {
                i2 = 1;
                if (i3 >= r()) {
                    break;
                }
                t3c t3cVar = d4cVar.n;
                View q = q(i3);
                t3cVar.getClass();
                int R = RecyclerView.R(q);
                if (R < 1) {
                    i2 = R;
                    break;
                }
                i3++;
            }
            if (i2 == 0 && (m = d4cVar.r.m(i2)) != null && m.getTop() - i > gm.L(58.0f)) {
                i = m.getTop() - gm.L(58.0f);
            }
        }
        return super.n0(i, ki2Var, r69Var);
    }

    @Override // q55, u46, f69
    public final boolean x0() {
        return false;
    }
}
