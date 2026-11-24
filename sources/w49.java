// default package

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class w49 implements h49 {
    public RecyclerView a;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public final v49 k;
    public int b = -1;
    public final int j = gl.L(80.0f);
    public final bg7 l = new bg7(this, (byte) 14);

    public w49(v49 v49Var) {
        this.k = v49Var;
    }

    @Override // h49
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        int R = E != null ? RecyclerView.R(E) : -1;
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        v49 v49Var = this.k;
        bg7 bg7Var = this.l;
        if (action == 1) {
            this.c = false;
            this.g = false;
            this.h = false;
            gl.r(bg7Var);
            v49Var.v(false);
            return;
        }
        if (action == 2) {
            if (this.j > -1) {
                if (y >= 0.0f && y <= this.d) {
                    this.h = false;
                    if (!this.g) {
                        this.g = true;
                        gl.r(bg7Var);
                        gl.d3(bg7Var);
                    }
                    this.i = ((int) (this.d - (y - 0.0f))) / 2;
                } else if (y >= this.e && y <= this.f) {
                    this.g = false;
                    if (!this.h) {
                        this.h = true;
                        gl.r(bg7Var);
                        gl.d3(bg7Var);
                    }
                    this.i = ((int) ((y + this.f) - (this.e + r11))) / 2;
                } else if (this.g || this.h) {
                    gl.r(bg7Var);
                    this.g = false;
                    this.h = false;
                }
            }
            if (R == -1 || this.b == R) {
                return;
            }
            this.b = R;
            v49Var.H1(E, !v49Var.n2(R));
        }
    }

    @Override // h49
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
            gl.r(this.l);
            this.k.v(false);
        }
        return z;
    }

    public final void d(int i, View view, boolean z) {
        if (this.c) {
            return;
        }
        this.b = -1;
        gl.r(this.l);
        this.g = false;
        this.h = false;
        v49 v49Var = this.k;
        if (!v49Var.J(i)) {
            this.c = false;
            return;
        }
        v49Var.v(true);
        v49Var.H1(view, z);
        this.c = true;
        this.b = i;
    }

    @Override // h49
    public final void c(boolean z) {
    }
}
