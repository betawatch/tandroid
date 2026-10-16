package rg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;
    public final /* synthetic */ j c;

    public /* synthetic */ t(o0 o0Var, j jVar, int i10) {
        this.a = i10;
        this.b = o0Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0(this.c);
                break;
            default:
                final o0 o0Var = this.b;
                LinearLayout linearLayout = new LinearLayout(o0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(o0Var.getContext());
                int i10 = g6.E8;
                fh.a aVar = o0Var.Q1;
                textView.setTextColor(g6.w0(i10, aVar));
                textView.setBackground(g6.L0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final int i11 = 0;
                final j jVar = this.c;
                textView.setOnClickListener(new View.OnClickListener() { // from class: rg.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                j jVar2 = jVar;
                                o0 o0Var2 = o0Var;
                                o0Var2.r0(jVar2);
                                org.telegram.ui.ActionBar.m1 m1Var = o0Var2.R1;
                                if (m1Var != null && m1Var.isShowing()) {
                                    o0Var2.R1.d(true);
                                    break;
                                }
                                break;
                            default:
                                o0 o0Var3 = o0Var;
                                o0Var3.getClass();
                                ((q2) jVar).r(true);
                                org.telegram.ui.ActionBar.m1 m1Var2 = o0Var3.R1;
                                if (m1Var2 != null && m1Var2.isShowing()) {
                                    o0Var3.R1.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout.addView(textView, z5.n(-2, 48));
                if (jVar instanceof x2) {
                    TextView textView2 = new TextView(o0Var.getContext());
                    textView2.setTextColor(g6.w0(i10, aVar));
                    textView2.setBackground(g6.L0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(o0Var, 2));
                    linearLayout.addView(textView2, z5.n(-2, 48));
                }
                if (jVar instanceof q2) {
                    TextView textView3 = new TextView(o0Var.getContext());
                    textView3.setTextColor(g6.w0(i10, aVar));
                    textView3.setBackgroundDrawable(g6.L0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.Flip));
                    final int i12 = 1;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: rg.p
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    j jVar2 = jVar;
                                    o0 o0Var2 = o0Var;
                                    o0Var2.r0(jVar2);
                                    org.telegram.ui.ActionBar.m1 m1Var = o0Var2.R1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        o0Var2.R1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    o0 o0Var3 = o0Var;
                                    o0Var3.getClass();
                                    ((q2) jVar).r(true);
                                    org.telegram.ui.ActionBar.m1 m1Var2 = o0Var3.R1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        o0Var3.R1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, z5.n(-2, 48));
                }
                if (!(jVar instanceof z1)) {
                    TextView textView4 = new TextView(o0Var.getContext());
                    textView4.setTextColor(g6.w0(i10, aVar));
                    textView4.setBackgroundDrawable(g6.L0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(o0Var, 3));
                    linearLayout.addView(textView4, z5.n(-2, 48));
                }
                o0Var.S1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
