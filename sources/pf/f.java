package pf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import h7.z5;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.n9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f extends z2 {
    public final /* synthetic */ k f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context) {
        super(context);
        this.f = kVar;
        this.a = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        final int i11 = 0;
        setBackgroundColor(g6.w0(null, g6.a7, false));
        m5 m5Var = new m5(context, 3);
        m5Var.c = new Path();
        Paint paint = new Paint(1);
        m5Var.b = paint;
        paint.setColor(g6.w0(null, g6.d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        m5Var.setWillNotDraw(false);
        m5Var.setOrientation(1);
        m5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        n9 n9Var = new n9(context);
        this.b = n9Var;
        n9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y2
            public final /* synthetic */ pf.f b;

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
        m5Var.addView(n9Var, z5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        m5Var.addView(textView, z5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.w0(null, g6.y6, false));
        m5Var.addView(textView2, z5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(w5.f(new float[]{8.0f}, g6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.w0(null, g6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y2
            public final /* synthetic */ pf.f b;

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
        m5Var.addView(textView3, z5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(m5Var, z5.n(-1, -2));
        set(null);
    }
}
