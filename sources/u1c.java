// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u1c extends vb4 {
    public final /* synthetic */ d2c Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1c(d2c d2cVar, int i, t1c t1cVar) {
        super(5, i, t1cVar);
        this.Y = d2cVar;
    }

    @Override // vb4
    public final boolean A1() {
        d2c d2cVar = this.Y;
        return d2cVar.n.getAdapter() == d2cVar.w;
    }

    @Override // t26
    public final boolean X0() {
        return k96.a0;
    }

    @Override // r35, t26, d49
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        int i2;
        View m;
        d2c d2cVar = this.Y;
        if (d2cVar.O) {
            return super.n0(i, wg2Var, p49Var);
        }
        int i3 = 0;
        if (d2cVar.M != null) {
            return 0;
        }
        if (d2cVar.N) {
            while (true) {
                i2 = 1;
                if (i3 >= r()) {
                    break;
                }
                t1c t1cVar = d2cVar.n;
                View q = q(i3);
                t1cVar.getClass();
                int R = RecyclerView.R(q);
                if (R < 1) {
                    i2 = R;
                    break;
                }
                i3++;
            }
            if (i2 == 0 && (m = d2cVar.r.m(i2)) != null && m.getTop() - i > gl.L(58.0f)) {
                i = m.getTop() - gl.L(58.0f);
            }
        }
        return super.n0(i, wg2Var, p49Var);
    }

    @Override // r35, t26, d49
    public final boolean x0() {
        return false;
    }
}
