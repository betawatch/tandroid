// default package

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class tv3 extends ov3 {
    public final jv3 b;
    public final sv3 c;
    public final r35 d;
    public final qv3 e;
    public final xv3 f;
    public byte h;
    public float n;
    public boolean r;
    public final /* synthetic */ ew3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv3(ew3 ew3Var, Context context) {
        super(context);
        this.s = ew3Var;
        this.h = (byte) 8;
        this.n = -1.0f;
        this.r = false;
        jv3 jv3Var = new jv3(context);
        this.b = jv3Var;
        sv3 sv3Var = new sv3(this);
        this.c = sv3Var;
        jv3Var.setAdapter(sv3Var);
        r35 r35Var = new r35(this.h);
        this.d = r35Var;
        jv3Var.setLayoutManager(r35Var);
        jv3Var.setClipToPadding(true);
        jv3Var.setVerticalScrollBarEnabled(false);
        r35Var.O = new nq1(this, (byte) 4);
        byte b = 23;
        jv3Var.setOnItemClickListener(new u(this, b));
        jv3Var.setOnScrollListener(new ao2(this, (byte) 7));
        gb3 gb3Var = new gb3();
        gb3Var.c = (short) 220;
        gb3Var.e = (short) 220;
        gb3Var.f = (short) 160;
        gb3Var.g = (short) 160;
        gb3Var.i = s33.g;
        jv3Var.setItemAnimator(gb3Var);
        addView(jv3Var, nme.c(-1.0f, -1));
        int i = ew3.C1;
        xv3 xv3Var = new xv3(context, ew3Var.J0);
        this.f = xv3Var;
        xv3Var.x = new w72(this, b);
        addView(xv3Var, nme.e(-1, -2, 48));
        qv3 qv3Var = new qv3(this, context, ew3Var.J0);
        this.e = qv3Var;
        addView(qv3Var, nme.c(36.0f, -1));
    }

    @Override // ov3
    public final void a(int i) {
        this.a = i;
        this.b.g3 = i == 0;
        byte b = i == 0 ? (byte) 8 : (byte) 5;
        this.h = b;
        this.d.x1(b);
        boolean z = this.r;
        sv3 sv3Var = this.c;
        if (!z) {
            sv3Var.D(null);
        }
        ew3 ew3Var = this.s;
        int i2 = ew3Var.m1;
        xv3 xv3Var = this.f;
        if (i2 >= 0) {
            xv3Var.s = true;
            xv3Var.e.setText("");
            xv3Var.s = false;
            wv3 wv3Var = xv3Var.h;
            if (wv3Var != null) {
                wv3Var.H1(ew3Var.m1);
                xv3Var.h.F1();
                if (xv3Var.h.getSelectedCategory() != null) {
                    sv3Var.I = xv3Var.h.getSelectedCategory().a;
                    li3 li3Var = sv3Var.N;
                    gl.r(li3Var);
                    gl.c3(li3Var);
                }
            }
        } else if (TextUtils.isEmpty(ew3Var.l1)) {
            xv3Var.b();
        } else {
            xv3Var.e.setText(ew3Var.l1);
            wv3 wv3Var2 = xv3Var.h;
            if (wv3Var2 != null) {
                wv3Var2.I1(null);
                xv3Var.h.G1();
            }
            gl.r(sv3Var.N);
            gl.c3(sv3Var.N);
        }
        xv3Var.a(i, ew3Var.t1);
        hq6.d0(ew3Var.a).D(i == 0 ? 5 : 0);
    }

    @Override // ov3
    public final float b() {
        float f = this.n;
        if (f >= 0.0f) {
            return f;
        }
        int i = 0;
        while (true) {
            jv3 jv3Var = this.b;
            if (i >= jv3Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = jv3Var.getChildAt(i).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return b00.c(102.0f, r3.getBottom(), 0);
            }
            i++;
        }
    }

    @Override // ov3
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(gl.L(16.0f) + max);
        this.f.setTranslationY(gl.L(52.0f) + max);
        jv3 jv3Var = this.b;
        float height = jv3Var.getHeight() - jv3Var.getPaddingBottom();
        jv3Var.h3 = max + jv3Var.getPaddingTop();
        jv3Var.i3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = ew3.C1;
        ew3 ew3Var = this.s;
        int i4 = ew3Var.u0;
        setPadding(i4, 0, i4, 0);
        this.e.setTranslationY(gl.L(16.0f));
        this.f.setTranslationY(gl.L(52.0f));
        this.b.setPadding(gl.L(5.0f), gl.L(102.0f), gl.L(5.0f), gl.L(ew3Var.s1 ? 0.0f : 40.0f) + gl.n);
        super.onMeasure(i, i2);
    }
}
