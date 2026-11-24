// default package

import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class y59 {
    public final z59 a = new z59();
    public boolean b = false;

    public void B(a69 a69Var) {
        this.a.registerObserver(a69Var);
    }

    public final void C(boolean z) {
        if (this.a.a()) {
            dq9.m("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = z;
        }
    }

    public final u69 a(ViewGroup viewGroup, int i) {
        try {
            int i2 = ozb.a;
            Trace.beginSection("RV CreateView");
            u69 x = x(viewGroup, i);
            if (x.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            x.f = i;
            Trace.endSection();
            return x;
        } catch (Throwable th) {
            int i3 = ozb.a;
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

    public void s(int i) {
        this.a.f(i, 1);
    }

    public void w(u69 u69Var, int i, List list) {
        t(u69Var, i);
    }

    public u69 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        cq0 cq0Var = new cq0(context);
        cq0Var.setOrientation(0);
        cq0Var.setPadding(gm.L(16.0f), gm.L(8.0f), gm.L(16.0f), gm.L(8.0f));
        wb wbVar = new wb(context, (byte) 13);
        cq0Var.b = wbVar;
        nm7.i(wbVar);
        wbVar.setTextSize(1, 16.0f);
        int i2 = cmb.F6;
        anb.X(wbVar, i2, null);
        wbVar.setTag(Integer.valueOf(i2));
        wbVar.setMaxLines(2);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        cq0Var.addView(wbVar, qoe.q(-1, -2, 1.0f, 16, 0, 0, gm.L(8.0f), 0));
        TextView textView = new TextView(context);
        cq0Var.a = textView;
        textView.setTextSize(1, 14.0f);
        int i3 = cmb.x6;
        anb.X(textView, i3, null);
        textView.setTag(Integer.valueOf(i3));
        cq0Var.addView(textView, qoe.p(-2, -2, 0.0f, 16));
        cq0Var.setLayoutParams(new g69(-1, -2));
        return new b59(cq0Var);
    }

    public void A(u69 u69Var) {
    }

    public void y(u69 u69Var) {
    }

    public void z(u69 u69Var) {
    }

    public void t(u69 u69Var, int i) {
    }
}
