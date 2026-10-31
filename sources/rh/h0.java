package rh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        int indexOf;
        q20 q20Var;
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                i0Var.J0(!z10 ? sf.a.h(editable.toString(), i0Var.v1.a) : sf.a.i(0L, i0Var.v1.a), false, false, true);
                i0Var.i1.c(i0Var.j1.isFocused(), !TextUtils.isEmpty(i0Var.j1.getText()));
                break;
            case 1:
                vh.p1 p1Var = (vh.p1) this.b;
                ImageView imageView = p1Var.r;
                org.telegram.ui.ActionBar.n0 n0Var = p1Var.e;
                if (!p1Var.s) {
                    p1Var.d(false);
                    String obj2 = n0Var.getText().toString();
                    String str = TextUtils.isEmpty(obj2) ? null : obj2;
                    j20 j20Var = p1Var.x;
                    if (j20Var != null) {
                        j20Var.a(str, -1);
                    }
                    vh.o1 o1Var = p1Var.h;
                    if (o1Var != null) {
                        o1Var.I1(null);
                        p1Var.h.J1(TextUtils.isEmpty(obj2), true);
                    }
                    if (n0Var != null) {
                        n0Var.animate().cancel();
                        ViewPropertyAnimator translationX = n0Var.animate().translationX(0.0f);
                        gr grVar = gr.h;
                        translationX.setInterpolator(grVar).start();
                        if (imageView != null && p1Var.n != (!TextUtils.isEmpty(n0Var.getText()))) {
                            p1Var.n = !p1Var.n;
                            imageView.animate().cancel();
                            if (p1Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(p1Var.n ? 1.0f : 0.7f).scaleY(p1Var.n ? 1.0f : 0.7f).alpha(p1Var.n ? 1.0f : 0.0f).withEndAction(new vh.d0(this, 5)).setInterpolator(grVar).setDuration(320L).setStartDelay(p1Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 2:
                vh.f5 f5Var = (vh.f5) this.b;
                String obj3 = editable.toString();
                f5Var.j2 = obj3;
                if (!f5Var.R1) {
                    String str2 = f5Var.o2;
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    boolean equals = TextUtils.equals(str2, obj3);
                    boolean z11 = false;
                    if (!equals) {
                        f5Var.f1();
                        String str3 = f5Var.j2;
                        f5Var.n2 = str3 != null && str3.length() > 0;
                    }
                    String str4 = f5Var.z2;
                    String str5 = f5Var.j2;
                    if (!TextUtils.equals(str4, str5 != null ? str5 : "")) {
                        f5Var.e1();
                        String str6 = f5Var.j2;
                        if (str6 != null && str6.length() > 3 && !TextUtils.isEmpty(((org.telegram.messenger.q0) vp.r1(f5Var.a).y7.F.b).c)) {
                            z11 = true;
                        }
                        f5Var.u2 = z11;
                    }
                    vh.c5 c5Var = f5Var.q2;
                    org.telegram.messenger.i0.r(c5Var);
                    org.telegram.messenger.i0.h3(c5Var, 400L);
                    vh.c5 c5Var2 = f5Var.B2;
                    org.telegram.messenger.i0.r(c5Var2);
                    org.telegram.messenger.i0.h3(c5Var2, 400L);
                }
                f5Var.h2.O(true);
                break;
            case 3:
                vh.t6 t6Var = (vh.t6) this.b;
                if (!t6Var.n && (q20Var = t6Var.r) != null && editable != null) {
                    q20Var.a(editable.toString());
                    break;
                }
                break;
            default:
                ((yh.l) this.b).c0();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void j(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
