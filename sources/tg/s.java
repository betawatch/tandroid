package tg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ j c;

    public /* synthetic */ s(h0 h0Var, j jVar, int i7) {
        this.a = i7;
        this.b = h0Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        final j jVar = this.c;
        final h0 h0Var = this.b;
        switch (i7) {
            case 0:
                h0Var.q0(jVar);
                break;
            default:
                LinearLayout linearLayout = new LinearLayout(h0Var.getContext());
                final int i10 = 0;
                linearLayout.setOrientation(0);
                TextView textView = new TextView(h0Var.getContext());
                int i11 = m6.E8;
                v vVar = h0Var.A1;
                t6.U(textView, i11, vVar);
                textView.setBackground(m6.N0(false));
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                final int i12 = 1;
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(gd.N0(2131747478, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() { // from class: tg.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                j jVar2 = jVar;
                                h0 h0Var2 = h0Var;
                                h0Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.g1 g1Var = h0Var2.B1;
                                if (g1Var != null && g1Var.isShowing()) {
                                    h0Var2.B1.d(true);
                                    break;
                                }
                                break;
                            default:
                                h0 h0Var3 = h0Var;
                                h0Var3.getClass();
                                ((g2) jVar).r(true);
                                org.telegram.ui.ActionBar.g1 g1Var2 = h0Var3.B1;
                                if (g1Var2 != null && g1Var2.isShowing()) {
                                    h0Var3.B1.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout.addView(textView, ma.o(-2, 48));
                if (jVar instanceof n2) {
                    TextView textView2 = new TextView(h0Var.getContext());
                    t6.U(textView2, i11, vVar);
                    textView2.setBackground(m6.N0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(gd.N0(2131747476, null));
                    textView2.setOnClickListener(new k(h0Var, 2));
                    linearLayout.addView(textView2, ma.o(-2, 48));
                }
                if (jVar instanceof g2) {
                    TextView textView3 = new TextView(h0Var.getContext());
                    t6.U(textView3, i11, vVar);
                    textView3.setBackgroundDrawable(m6.N0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(gd.N0(2131750673, null));
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: tg.p
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    j jVar2 = jVar;
                                    h0 h0Var2 = h0Var;
                                    h0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.g1 g1Var = h0Var2.B1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        h0Var2.B1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    h0 h0Var3 = h0Var;
                                    h0Var3.getClass();
                                    ((g2) jVar).r(true);
                                    org.telegram.ui.ActionBar.g1 g1Var2 = h0Var3.B1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        h0Var3.B1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, ma.o(-2, 48));
                }
                if (!(jVar instanceof p1)) {
                    TextView textView4 = new TextView(h0Var.getContext());
                    t6.U(textView4, i11, vVar);
                    textView4.setBackgroundDrawable(m6.N0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(gd.N0(2131747477, null));
                    textView4.setOnClickListener(new k(h0Var, 3));
                    linearLayout.addView(textView4, ma.o(-2, 48));
                }
                h0Var.C1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
