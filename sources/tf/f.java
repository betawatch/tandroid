package tf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f extends a3 {
    public final /* synthetic */ k f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context) {
        super(context);
        this.f = kVar;
        this.a = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        final int i11 = 0;
        setBackgroundColor(j6.w0(null, j6.a7, false));
        dg.k0 k0Var = new dg.k0(context, 3);
        k0Var.c = new Path();
        Paint paint = new Paint(1);
        k0Var.b = paint;
        paint.setColor(j6.w0(null, j6.d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        k0Var.setWillNotDraw(false);
        k0Var.setOrientation(1);
        k0Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        p9 p9Var = new p9(context);
        this.b = p9Var;
        p9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z2
            public final /* synthetic */ tf.f b;

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
        k0Var.addView(p9Var, b6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        k0Var.addView(textView, b6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.w0(null, j6.y6, false));
        k0Var.addView(textView2, b6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(z5.f(new float[]{8.0f}, j6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.w0(null, j6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.z2
            public final /* synthetic */ tf.f b;

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
        k0Var.addView(textView3, b6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(k0Var, b6.n(-1, -2));
        set(null);
    }
}
