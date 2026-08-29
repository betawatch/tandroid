package rf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g extends z2 {
    public final /* synthetic */ l f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Context context) {
        super(context);
        this.f = lVar;
        this.a = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        final int i11 = 0;
        setBackgroundColor(g6.w0(null, g6.a7, false));
        bg.l0 l0Var = new bg.l0(context, 4);
        l0Var.c = new Path();
        Paint paint = new Paint(1);
        l0Var.b = paint;
        paint.setColor(g6.w0(null, g6.d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        l0Var.setWillNotDraw(false);
        l0Var.setOrientation(1);
        l0Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        t9 t9Var = new t9(context);
        this.b = t9Var;
        t9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y2
            public final /* synthetic */ rf.g b;

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
        l0Var.addView(t9Var, f6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        l0Var.addView(textView, f6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.w0(null, g6.y6, false));
        l0Var.addView(textView2, f6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(w5.f(new float[]{8.0f}, g6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.w0(null, g6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y2
            public final /* synthetic */ rf.g b;

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
        l0Var.addView(textView3, f6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(l0Var, f6.n(-1, -2));
        set(null);
    }
}
