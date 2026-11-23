package tg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ n c;

    public /* synthetic */ z(l0 l0Var, n nVar, int i7) {
        this.a = i7;
        this.b = l0Var;
        this.c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        final n nVar = this.c;
        final l0 l0Var = this.b;
        switch (i7) {
            case 0:
                l0Var.t0(nVar);
                break;
            default:
                LinearLayout linearLayout = new LinearLayout(l0Var.getContext());
                final int i10 = 0;
                linearLayout.setOrientation(0);
                TextView textView = new TextView(l0Var.getContext());
                int i11 = n6.E8;
                p pVar = l0Var.A1;
                u6.U(textView, i11, pVar);
                textView.setBackground(n6.N0(false));
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                final int i12 = 1;
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(gd.N0(2131747478, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() { // from class: tg.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                n nVar2 = nVar;
                                l0 l0Var2 = l0Var;
                                l0Var2.t0(nVar2);
                                org.telegram.ui.ActionBar.g1 g1Var = l0Var2.B1;
                                if (g1Var != null && g1Var.isShowing()) {
                                    l0Var2.B1.d(true);
                                    break;
                                }
                                break;
                            default:
                                l0 l0Var3 = l0Var;
                                l0Var3.getClass();
                                ((j2) nVar).r(true);
                                org.telegram.ui.ActionBar.g1 g1Var2 = l0Var3.B1;
                                if (g1Var2 != null && g1Var2.isShowing()) {
                                    l0Var3.B1.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout.addView(textView, na.o(-2, 48));
                if (nVar instanceof q2) {
                    TextView textView2 = new TextView(l0Var.getContext());
                    u6.U(textView2, i11, pVar);
                    textView2.setBackground(n6.N0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(gd.N0(2131747476, null));
                    textView2.setOnClickListener(new o(l0Var, 2));
                    linearLayout.addView(textView2, na.o(-2, 48));
                }
                if (nVar instanceof j2) {
                    TextView textView3 = new TextView(l0Var.getContext());
                    u6.U(textView3, i11, pVar);
                    textView3.setBackgroundDrawable(n6.N0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(gd.N0(2131750673, null));
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: tg.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    n nVar2 = nVar;
                                    l0 l0Var2 = l0Var;
                                    l0Var2.t0(nVar2);
                                    org.telegram.ui.ActionBar.g1 g1Var = l0Var2.B1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        l0Var2.B1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var3 = l0Var;
                                    l0Var3.getClass();
                                    ((j2) nVar).r(true);
                                    org.telegram.ui.ActionBar.g1 g1Var2 = l0Var3.B1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        l0Var3.B1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, na.o(-2, 48));
                }
                if (!(nVar instanceof s1) && !(nVar instanceof d)) {
                    TextView textView4 = new TextView(l0Var.getContext());
                    u6.U(textView4, i11, pVar);
                    textView4.setBackgroundDrawable(n6.N0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(gd.N0(2131747477, null));
                    textView4.setOnClickListener(new o(l0Var, 3));
                    linearLayout.addView(textView4, na.o(-2, 48));
                }
                l0Var.C1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
