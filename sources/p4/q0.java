package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class q0 extends q implements n0 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public m0 f;
    public int g;
    public final /* synthetic */ r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.a = str;
        this.b = str2;
    }

    @Override // p4.n0
    public final void a(m0 m0Var) {
        this.f = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.g = i10;
        if (this.c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                m0Var.d(this.g, i13);
                this.e = 0;
            }
        }
    }

    @Override // p4.n0
    public final int b() {
        return this.g;
    }

    @Override // p4.n0
    public final void c() {
        m0 m0Var = this.f;
        if (m0Var != null) {
            int i10 = this.g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // p4.q
    public final void d() {
        r0 r0Var = this.h;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override // p4.q
    public final void e() {
        this.c = true;
        m0 m0Var = this.f;
        if (m0Var != null) {
            m0Var.a(this.g);
        }
    }

    @Override // p4.q
    public final void f(int i10) {
        m0 m0Var = this.f;
        if (m0Var != null) {
            m0Var.c(this.g, i10);
        } else {
            this.d = i10;
            this.e = 0;
        }
    }

    @Override // p4.q
    public final void g() {
        h(0);
    }

    @Override // p4.q
    public final void h(int i10) {
        this.c = false;
        m0 m0Var = this.f;
        if (m0Var != null) {
            int i11 = this.g;
            Bundle e7 = p6.e(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, e7);
        }
    }

    @Override // p4.q
    public final void i(int i10) {
        m0 m0Var = this.f;
        if (m0Var != null) {
            m0Var.d(this.g, i10);
        } else {
            this.e += i10;
        }
    }
}
