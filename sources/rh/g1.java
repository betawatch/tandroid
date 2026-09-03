package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import k7.b6;
import k7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class g1 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public g1(h1 h1Var, boolean z4, Context context) {
        super(context);
        this.a = h1Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(j6.w0(null, j6.D5, false), j6.w0(null, j6.E5, false));
        addView(radioButton, b6.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = f6.b(context, 16.0f, j6.G6, true, null);
        b10.setText(h1Var.c);
        addView(b10, b6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = f6.b(context, 14.0f, j6.y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(h1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(h1Var.d / 1000)))));
        addView(b11, b6.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z4;
        setWillNotDraw(!z4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, j6.k0);
        }
    }
}
