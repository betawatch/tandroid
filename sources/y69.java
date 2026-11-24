// default package

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y69 implements j69 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final x69 k;
    public int b = -1;
    public final int j = gm.L(80.0f);
    public final ei7 l = new ei7(this, (byte) 14);

    public y69(x69 x69Var) {
        this.k = x69Var;
    }

    @Override // j69
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        x69 x69Var = this.k;
        ei7 ei7Var = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            gm.r(ei7Var);
            x69Var.q(false);
            return;
        }
        if (action == 2) {
            if (this.j > -1) {
                if (y >= 0.0f && y <= this.d) {
                    this.h = false;
                    if (!this.g) {
                        this.g = true;
                        gm.r(ei7Var);
                        gm.c3(ei7Var);
                    }
                    this.i = ((int) (this.d - (y - 0.0f))) / 2;
                } else if (y >= this.e && y <= this.f) {
                    this.g = false;
                    if (!this.h) {
                        this.h = true;
                        gm.r(ei7Var);
                        gm.c3(ei7Var);
                    }
                    this.i = ((int) ((y + this.f) - (this.e + r11))) / 2;
                } else if (this.g || this.h) {
                    gm.r(ei7Var);
                    this.g = false;
                    this.h = false;
                }
            }
            if (R == -1 || this.b == R) {
                return;
            }
            this.b = R;
            x69Var.k0(E, !x69Var.r0(R));
        }
    }

    @Override // j69
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z = this.c && !(recyclerView.getAdapter() == null || recyclerView.getAdapter().b() == 0);
        if (z) {
            this.a = recyclerView;
            int i = this.j;
            if (i > -1) {
                this.d = i;
                this.e = recyclerView.getMeasuredHeight() - i;
                this.f = recyclerView.getMeasuredHeight();
            }
        }
        if (z && motionEvent.getAction() == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            gm.r(this.l);
            this.k.q(false);
        }
        return z;
    }

    public final void d(int i, View view, boolean z) {
        if (this.c) {
            return;
        }
        this.b = -1;
        gm.r(this.l);
        this.g = false;
        this.h = false;
        x69 x69Var = this.k;
        if (!x69Var.w(i)) {
            this.c = false;
            return;
        }
        x69Var.q(true);
        x69Var.k0(view, z);
        this.c = true;
        this.b = i;
    }

    @Override // j69
    public final void c(boolean z) {
    }
}
