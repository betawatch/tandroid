// default package

import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class w39 {
    public final x39 a = new x39();
    public boolean b = false;

    public void B(y39 y39Var) {
        this.a.registerObserver(y39Var);
    }

    public final void C(boolean z) {
        if (this.a.a()) {
            sc8.j("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = z;
        }
    }

    public final s49 a(ViewGroup viewGroup, int i) {
        try {
            int i2 = mxb.a;
            Trace.beginSection("RV CreateView");
            s49 x = x(viewGroup, i);
            if (x.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            x.f = i;
            Trace.endSection();
            return x;
        } catch (Throwable th) {
            int i3 = mxb.a;
            Trace.endSection();
            throw th;
        }
    }

    public int b() {
        return 14;
    }

    public long c(int i) {
        return -1L;
    }

    public int d(int i) {
        return 0;
    }

    public int e() {
        return b();
    }

    public void f() {
        this.a.b();
    }

    public void g(int i) {
        this.a.d(i, 1, null);
    }

    public final void h(int i, Object obj) {
        this.a.d(i, 1, obj);
    }

    public void i(int i) {
        this.a.e(i, 1);
    }

    public void j(int i, int i2) {
        this.a.c(i, i2);
    }

    public void l(int i, int i2) {
        this.a.d(i, i2, null);
    }

    public void n(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public void p(int i, int i2) {
        this.a.e(i, i2);
    }

    public void q(int i, int i2) {
        this.a.f(i, i2);
    }

    public void r(int i) {
        this.a.f(i, 1);
    }

    public void u(s49 s49Var, int i, List list) {
        t(s49Var, i);
    }

    public s49 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        cp0 cp0Var = new cp0(context);
        cp0Var.setOrientation(0);
        cp0Var.setPadding(gl.L(16.0f), gl.L(8.0f), gl.L(16.0f), gl.L(8.0f));
        wb wbVar = new wb(context, (byte) 13);
        cp0Var.b = wbVar;
        kk7.i(wbVar);
        wbVar.setTextSize(1, 16.0f);
        int i2 = bkb.F6;
        zkb.X(wbVar, i2, null);
        wbVar.setTag(Integer.valueOf(i2));
        wbVar.setMaxLines(2);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        cp0Var.addView(wbVar, nme.q(-1, -2, 1.0f, 16, 0, 0, gl.L(8.0f), 0));
        TextView textView = new TextView(context);
        cp0Var.a = textView;
        textView.setTextSize(1, 14.0f);
        int i3 = bkb.x6;
        zkb.X(textView, i3, null);
        textView.setTag(Integer.valueOf(i3));
        cp0Var.addView(textView, nme.p(-2, -2, 0.0f, 16));
        cp0Var.setLayoutParams(new e49(-1, -2));
        return new y29(cp0Var);
    }

    public void A(s49 s49Var) {
    }

    public void y(s49 s49Var) {
    }

    public void z(s49 s49Var) {
    }

    public void t(s49 s49Var, int i) {
    }
}
