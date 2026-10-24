package qg;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.s2;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class w extends FrameLayout {
    public final TextView a;
    public final s b;
    public final EditTextBoldCursor c;
    public int d;
    public boolean e;
    public final /* synthetic */ y f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Context context) {
        super(context);
        this.f = yVar;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, z5.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        s sVar = new s(yVar, context);
        this.b = sVar;
        addView(sVar, z5.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(k6.c0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new ao(this));
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new s2(4));
        addView(editTextBoldCursor, z5.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.b.c = i10;
        TextView textView = this.a;
        if (i10 == 0) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersRed).toUpperCase());
        } else if (i10 == 1) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersGreen).toUpperCase());
        } else if (i10 == 2) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersBlue).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.e = true;
        s sVar = this.b;
        sVar.d = i0.a.o(sVar.e.f, 255);
        sVar.a();
        sVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        y yVar = this.f;
        if (i10 == 0) {
            editTextBoldCursor.setText(String.valueOf(Color.red(yVar.f)));
        } else if (i10 == 1) {
            editTextBoldCursor.setText(String.valueOf(Color.green(yVar.f)));
        } else if (i10 == 2) {
            editTextBoldCursor.setText(String.valueOf(Color.blue(yVar.f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
