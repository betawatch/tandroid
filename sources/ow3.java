// default package

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ow3 extends iw3 {
    public final dw3 b;
    public final nw3 c;
    public final u55 d;
    public final kw3 e;
    public final sw3 f;
    public byte h;
    public float n;
    public boolean r;
    public final /* synthetic */ zw3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow3(zw3 zw3Var, Context context) {
        super(context);
        this.s = zw3Var;
        this.h = (byte) 8;
        this.n = -1.0f;
        this.r = false;
        dw3 dw3Var = new dw3(context);
        this.b = dw3Var;
        nw3 nw3Var = new nw3(this);
        this.c = nw3Var;
        dw3Var.setAdapter(nw3Var);
        u55 u55Var = new u55(this.h);
        this.d = u55Var;
        dw3Var.setLayoutManager(u55Var);
        dw3Var.setClipToPadding(true);
        dw3Var.setVerticalScrollBarEnabled(false);
        u55Var.O = new ar1(this, (byte) 4);
        byte b = 23;
        dw3Var.setOnItemClickListener(new u(this, b));
        dw3Var.setOnScrollListener(new to2(this, (byte) 7));
        zb3 zb3Var = new zb3();
        zb3Var.c = (short) 220;
        zb3Var.e = (short) 220;
        zb3Var.f = (short) 160;
        zb3Var.g = (short) 160;
        zb3Var.i = k43.g;
        dw3Var.setItemAnimator(zb3Var);
        addView(dw3Var, tre.c(-1.0f, -1));
        int i = zw3.C1;
        sw3 sw3Var = new sw3(context, zw3Var.J0);
        this.f = sw3Var;
        sw3Var.x = new n82(this, b);
        addView(sw3Var, tre.e(-1, -2, 48));
        kw3 kw3Var = new kw3(this, context, zw3Var.J0);
        this.e = kw3Var;
        addView(kw3Var, tre.c(36.0f, -1));
    }

    @Override // iw3
    public final void a(int i) {
        this.a = i;
        this.b.g3 = i == 0;
        byte b = i == 0 ? (byte) 8 : (byte) 5;
        this.h = b;
        this.d.x1(b);
        boolean z = this.r;
        nw3 nw3Var = this.c;
        if (!z) {
            nw3Var.D(null);
        }
        zw3 zw3Var = this.s;
        int i2 = zw3Var.m1;
        sw3 sw3Var = this.f;
        if (i2 >= 0) {
            sw3Var.s = true;
            sw3Var.e.setText("");
            sw3Var.s = false;
            rw3 rw3Var = sw3Var.h;
            if (rw3Var != null) {
                rw3Var.I1(zw3Var.m1);
                sw3Var.h.G1();
                if (sw3Var.h.getSelectedCategory() != null) {
                    nw3Var.I = sw3Var.h.getSelectedCategory().a;
                    lw3 lw3Var = nw3Var.N;
                    hl.r(lw3Var);
                    hl.c3(lw3Var);
                }
            }
        } else if (TextUtils.isEmpty(zw3Var.l1)) {
            sw3Var.b();
        } else {
            sw3Var.e.setText(zw3Var.l1);
            rw3 rw3Var2 = sw3Var.h;
            if (rw3Var2 != null) {
                rw3Var2.J1(null);
                sw3Var.h.H1();
            }
            hl.r(nw3Var.N);
            hl.c3(nw3Var.N);
        }
        sw3Var.a(i, zw3Var.t1);
        ls6.d0(zw3Var.a).D(i == 0 ? 5 : 0);
    }

    @Override // iw3
    public final float b() {
        float f = this.n;
        if (f >= 0.0f) {
            return f;
        }
        int i = 0;
        while (true) {
            dw3 dw3Var = this.b;
            if (i >= dw3Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = dw3Var.getChildAt(i).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return c00.d(102.0f, r3.getBottom(), 0);
            }
            i++;
        }
    }

    @Override // iw3
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(hl.L(16.0f) + max);
        this.f.setTranslationY(hl.L(52.0f) + max);
        dw3 dw3Var = this.b;
        float height = dw3Var.getHeight() - dw3Var.getPaddingBottom();
        dw3Var.h3 = max + dw3Var.getPaddingTop();
        dw3Var.i3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = zw3.C1;
        zw3 zw3Var = this.s;
        int i4 = zw3Var.u0;
        setPadding(i4, 0, i4, 0);
        this.e.setTranslationY(hl.L(16.0f));
        this.f.setTranslationY(hl.L(52.0f));
        this.b.setPadding(hl.L(5.0f), hl.L(102.0f), hl.L(5.0f), hl.L(zw3Var.s1 ? 0.0f : 40.0f) + hl.n);
        super.onMeasure(i, i2);
    }
}
