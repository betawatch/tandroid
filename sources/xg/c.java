package xg;

import android.graphics.Color;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import wg.d;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends d {
    public final /* synthetic */ p6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p6 p6Var, p6 p6Var2) {
        super(p6Var);
        this.s = p6Var2;
    }

    @Override // wg.d, wg.a
    public final int E() {
        int a2 = a(this.d);
        p6 p6Var = this.s;
        if (t6.i1(p6Var) && Color.alpha(t6.w0(t6.wa, p6Var)) != 0) {
            return 0;
        }
        return a2;
    }

    @Override // wg.d
    public final float b() {
        return t6.i1(this.s) ? i0.N(1.0f) : this.r;
    }

    @Override // wg.d, wg.a
    public final float b0() {
        return i0.N(0.6f);
    }

    @Override // wg.d
    public final float c() {
        return t6.i1(this.s) ? i0.N(2.25f) : this.n;
    }

    @Override // wg.d, wg.a
    public final int h0() {
        p6 p6Var = this.s;
        if (t6.i1(p6Var)) {
            return t6.w0(t6.ya, p6Var);
        }
        return 0;
    }

    @Override // wg.d, wg.a
    public final int j0() {
        p6 p6Var = this.s;
        return t6.i1(p6Var) ? t6.w0(t6.xa, p6Var) : a(this.b);
    }

    @Override // wg.d, wg.a
    public final int u() {
        int a2 = a(this.c);
        p6 p6Var = this.s;
        if (t6.i1(p6Var) && Color.alpha(t6.w0(t6.wa, p6Var)) != 0) {
            return 0;
        }
        return a2;
    }

    @Override // wg.d, wg.a
    public final int w() {
        p6 p6Var = this.s;
        if (t6.i1(p6Var)) {
            return t6.w0(t6.wa, p6Var);
        }
        return 0;
    }
}
