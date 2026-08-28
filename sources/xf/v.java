package xf;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import fh.t4;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.o2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final TextView a;
    public final r b;
    public final EditTextBoldCursor c;
    public int d;
    public boolean e;
    public final /* synthetic */ x f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, Context context) {
        super(context);
        this.f = xVar;
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.l0.q(textView, -1711276033, 1, 14.0f);
        addView(textView, e6.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        r rVar = new r(xVar, context);
        this.b = rVar;
        addView(rVar, e6.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(f6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new t4(this));
        editTextBoldCursor.setOnFocusChangeListener(new gh.j(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new o2(4));
        addView(editTextBoldCursor, e6.e(72, 36, 85));
    }

    public final void a(int i9) {
        this.d = i9;
        this.b.c = i9;
        TextView textView = this.a;
        if (i9 == 0) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersRed).toUpperCase());
        } else if (i9 == 1) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersGreen).toUpperCase());
        } else if (i9 == 2) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersBlue).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.e = true;
        r rVar = this.b;
        rVar.d = i0.a.k(rVar.e.f, 255);
        rVar.a();
        rVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i9 = this.d;
        x xVar = this.f;
        if (i9 == 0) {
            editTextBoldCursor.setText(String.valueOf(Color.red(xVar.f)));
        } else if (i9 == 1) {
            editTextBoldCursor.setText(String.valueOf(Color.green(xVar.f)));
        } else if (i9 == 2) {
            editTextBoldCursor.setText(String.valueOf(Color.blue(xVar.f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
