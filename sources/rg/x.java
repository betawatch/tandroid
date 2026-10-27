package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.u2;
import org.telegram.ui.gm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x extends LinearLayout {
    public final w a;
    public final w b;
    public final w c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final /* synthetic */ y f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Context context) {
        super(context);
        this.f = yVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        w wVar = new w(yVar, context);
        this.a = wVar;
        wVar.a(0);
        addView(wVar, kb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        w wVar2 = new w(yVar, context);
        this.b = wVar2;
        wVar2.a(1);
        addView(wVar2, kb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        w wVar3 = new w(yVar, context);
        this.c = wVar3;
        wVar3.a(2);
        addView(wVar3, kb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, kb1.g(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, kb1.o(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(y6.c0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new gm0(this));
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 7));
        editTextBoldCursor.setOnEditorActionListener(new u2(5));
        linearLayout.addView(editTextBoldCursor, kb1.r(72, 36));
    }
}
