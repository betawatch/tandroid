package qg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ j c;

    public /* synthetic */ t(p0 p0Var, j jVar, int i10) {
        this.a = i10;
        this.b = p0Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q0(this.c);
                break;
            default:
                final p0 p0Var = this.b;
                LinearLayout linearLayout = new LinearLayout(p0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(p0Var.getContext());
                int i10 = j6.E8;
                eh.a aVar = p0Var.Q1;
                textView.setTextColor(j6.v0(i10, aVar));
                textView.setBackground(j6.K0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final int i11 = 0;
                final j jVar = this.c;
                textView.setOnClickListener(new View.OnClickListener() { // from class: qg.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                j jVar2 = jVar;
                                p0 p0Var2 = p0Var;
                                p0Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.o1 o1Var = p0Var2.R1;
                                if (o1Var != null && o1Var.isShowing()) {
                                    p0Var2.R1.d(true);
                                    break;
                                }
                                break;
                            default:
                                p0 p0Var3 = p0Var;
                                p0Var3.getClass();
                                ((q2) jVar).r(true);
                                org.telegram.ui.ActionBar.o1 o1Var2 = p0Var3.R1;
                                if (o1Var2 != null && o1Var2.isShowing()) {
                                    p0Var3.R1.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout.addView(textView, x5.n(-2, 48));
                if (jVar instanceof x2) {
                    TextView textView2 = new TextView(p0Var.getContext());
                    textView2.setTextColor(j6.v0(i10, aVar));
                    textView2.setBackground(j6.K0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(p0Var, 2));
                    linearLayout.addView(textView2, x5.n(-2, 48));
                }
                if (jVar instanceof q2) {
                    TextView textView3 = new TextView(p0Var.getContext());
                    textView3.setTextColor(j6.v0(i10, aVar));
                    textView3.setBackgroundDrawable(j6.K0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.Flip));
                    final int i12 = 1;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: qg.p
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    j jVar2 = jVar;
                                    p0 p0Var2 = p0Var;
                                    p0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.o1 o1Var = p0Var2.R1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        p0Var2.R1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    p0 p0Var3 = p0Var;
                                    p0Var3.getClass();
                                    ((q2) jVar).r(true);
                                    org.telegram.ui.ActionBar.o1 o1Var2 = p0Var3.R1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        p0Var3.R1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, x5.n(-2, 48));
                }
                if (!(jVar instanceof a2)) {
                    TextView textView4 = new TextView(p0Var.getContext());
                    textView4.setTextColor(j6.v0(i10, aVar));
                    textView4.setBackgroundDrawable(j6.K0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(p0Var, 3));
                    linearLayout.addView(textView4, x5.n(-2, 48));
                }
                p0Var.S1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
