// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s43 extends ViewGroup {
    public final q43 a;
    public EditText b;
    public final View[] c;
    public View d;
    public boolean e;
    public boolean f;
    public final p43 h;
    public boolean n;
    public final p43 r;
    public int s;
    public int w;

    public s43(Context context) {
        super(context);
        String str;
        this.c = new View[12];
        int i = 0;
        this.h = new p43(this, (byte) 0);
        byte b = 1;
        this.r = new p43(this, (byte) 1);
        int i2 = 0;
        while (i2 < 11) {
            if (i2 != 9) {
                switch (i2) {
                    case 1:
                        str = "ABC";
                        break;
                    case 2:
                        str = "DEF";
                        break;
                    case 3:
                        str = "GHI";
                        break;
                    case 4:
                        str = "JKL";
                        break;
                    case 5:
                        str = "MNO";
                        break;
                    case 6:
                        str = "PQRS";
                        break;
                    case 7:
                        str = "TUV";
                        break;
                    case 8:
                        str = "WXYZ";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "+";
                        break;
                }
                String valueOf = String.valueOf(i2 != 10 ? i2 + 1 : 0);
                this.c[i2] = new r43(context, valueOf, str);
                this.c[i2].setOnClickListener(new kb1((Object) this, (Object) valueOf, (byte) 26));
                addView(this.c[i2]);
            }
            i2++;
        }
        q43 q43Var = new q43(this, context, new gi3(context, new p12(this, ViewConfiguration.get(context).getScaledTouchSlop(), b)));
        this.a = q43Var;
        q43Var.setImageResource(R.drawable.msg_clear_input);
        zkb.s(q43Var, bkb.F6, null, PorterDuff.Mode.SRC_ATOP);
        int L = gl.L(11.0f);
        q43Var.setPadding(L, L, L, L);
        q43Var.setOnClickListener(new x00(b));
        this.c[11] = q43Var;
        addView(q43Var);
        while (true) {
            View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null) {
                ote.b(view, 0.02f, 1.2f);
                a(i, view);
            }
            i++;
        }
    }

    public static void a(int i, View view) {
        boolean z = i < 3;
        int i2 = i % 3;
        boolean z2 = i2 == 0;
        boolean z3 = i2 == 2;
        boolean z4 = i > 8;
        int i3 = bkb.h6;
        int w0 = bkb.w0(null, i3, false);
        int o = bm2.o(bkb.w0(null, i3, false), 30);
        float f = 12.0f;
        int L = gl.L((z2 && z) ? 24.0f : 12.0f);
        int L2 = gl.L((z3 && z) ? 24.0f : 12.0f);
        int L3 = gl.L((z3 && z4) ? 24.0f : 12.0f);
        if (z2 && z4) {
            f = 24.0f;
        }
        ff0 i0 = bkb.i0(L, L2, L3, gl.L(f), w0, o, o);
        vkb M = zkb.M(i3);
        vkb g = zkb.g(i3, 30);
        view.setBackground(i0);
        zkb.j(view, i0, M, g, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int D = ug8.D(32.0f, getWidth(), 3);
        int D2 = ug8.D(42.0f, getHeight(), 4);
        int i5 = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i5 >= viewArr.length) {
                return;
            }
            int L = gl.L(6.0f) + D;
            int L2 = gl.L(10.0f) + (L * (i5 % 3));
            int L3 = gl.L(6.0f) + D2;
            int L4 = gl.L(10.0f) + (L3 * (i5 / 3));
            View view = viewArr[i5];
            if (view != null) {
                view.layout(L2, L4, L2 + D, L4 + D2);
            }
            i5++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int D = ug8.D(32.0f, getWidth(), 3);
        int D2 = ug8.D(42.0f, getHeight(), 4);
        for (View view : this.c) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(D, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(D2, TLObject.FLAG_30));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z) {
        this.e = z;
    }

    public void setEditText(EditText editText) {
        this.b = editText;
        this.e = false;
    }

    public void setViewToFindFocus(View view) {
        this.d = view;
    }
}
