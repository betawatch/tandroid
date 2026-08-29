package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import i7.j6;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g1 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public g1(h1 h1Var, boolean z10, Context context) {
        super(context);
        this.a = h1Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.w0(null, g6.D5, false), g6.w0(null, g6.E5, false));
        addView(radioButton, f6.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = j6.b(context, 16.0f, g6.G6, true, null);
        b10.setText(h1Var.c);
        addView(b10, f6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = j6.b(context, 14.0f, g6.y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(h1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(h1Var.d / 1000)))));
        addView(b11, f6.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, g6.k0);
        }
    }
}
