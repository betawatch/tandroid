package uf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f extends b3 {
    public final /* synthetic */ k f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context) {
        super(context);
        this.f = kVar;
        this.a = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        final int i11 = 0;
        setBackgroundColor(k6.w0(null, k6.a7, false));
        eg.i0 i0Var = new eg.i0(context, 3);
        i0Var.c = new Path();
        Paint paint = new Paint(1);
        i0Var.b = paint;
        paint.setColor(k6.w0(null, k6.d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        i0Var.setWillNotDraw(false);
        i0Var.setOrientation(1);
        i0Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        p9 p9Var = new p9(context);
        this.b = p9Var;
        p9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a3
            public final /* synthetic */ uf.f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.b.getImageReceiver().startAnimation();
                        break;
                    default:
                        this.b.f.K();
                        break;
                }
            }
        });
        a();
        i0Var.addView(p9Var, c6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(k6.w0(null, k6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        i0Var.addView(textView, c6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(k6.w0(null, k6.y6, false));
        i0Var.addView(textView2, c6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(a6.f(new float[]{8.0f}, k6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(k6.w0(null, k6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a3
            public final /* synthetic */ uf.f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.b.getImageReceiver().startAnimation();
                        break;
                    default:
                        this.b.f.K();
                        break;
                }
            }
        });
        i0Var.addView(textView3, c6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(i0Var, c6.n(-1, -2));
        set(null);
    }
}
