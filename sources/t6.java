// default package

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class t6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ t6(s7 s7Var, byte b) {
        this.a = b;
        this.b = s7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o7 o7Var;
        n8 n8Var;
        byte b = this.a;
        s7 s7Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = s7Var.h0;
                if (s7Var.e.length() != 0) {
                    s7Var.e.setText("");
                } else if (s7Var.s()) {
                    s7Var.e.m();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (s7Var.I != null && ((ph4) arrayList.get(i)).h) {
                            s7Var.I.j((ph4) arrayList.get(i));
                        }
                    }
                    s7Var.n();
                } else {
                    TextView textView = s7Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((o7Var = s7Var.I) == null || o7Var.a())) {
                        s7Var.h.setVisibility(8);
                        o7 o7Var2 = s7Var.I;
                        if (o7Var2 != null) {
                            o7Var2.f();
                        }
                    }
                }
                s7Var.e.requestFocus();
                hl.E3(s7Var.e);
                break;
            case 1:
                if (s7Var.y()) {
                    if (!s7Var.U) {
                        s7Var.U = true;
                        s7Var.r();
                    }
                }
                s6 s6Var = s7Var.c;
                if (s6Var != null) {
                    s6Var.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    n7 n7Var = s7Var.Q;
                    if (n7Var != null) {
                        n7Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 2:
                if (s7Var.y()) {
                    if (!s7Var.U) {
                        s7Var.U = true;
                        if (!s7Var.S && (n8Var = s7Var.d) != null) {
                            n8Var.setAnimationStyle(R.style.PopupAnimation);
                        }
                        s7Var.r();
                    }
                }
                s6 s6Var2 = s7Var.c;
                if (s6Var2 != null) {
                    s6Var2.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    n7 n7Var2 = s7Var.Q;
                    if (n7Var2 != null) {
                        n7Var2.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            default:
                s6 s6Var3 = s7Var.c;
                if (s6Var3 != null) {
                    s6Var3.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    n7 n7Var3 = s7Var.Q;
                    if (n7Var3 != null) {
                        n7Var3.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
        }
    }
}
