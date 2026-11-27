// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pe1 extends FrameLayout implements snb {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final /* synthetic */ ve1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe1(ve1 ve1Var, Activity activity) {
        super(activity);
        this.c = ve1Var;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        yob.D(editTextBoldCursor, aob.H6, null);
        int i = aob.G6;
        yob.X(editTextBoldCursor, i, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        byte b = 5;
        editTextBoldCursor.setGravity((ob6.a0 ? 5 : 3) | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(ob6.M0(2131743303, null));
        yob.l(editTextBoldCursor, 30, i, null);
        editTextBoldCursor.setCursorSize(hl.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 4));
        String str = ve1Var.r;
        long j = ve1Var.y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new c7(this, b));
        if (j != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(ve1Var.getMessagesController().N2 + "/");
        textView.setTextSize(1, 17.0f);
        yob.X(textView, i, null);
        textView.setGravity((ob6.a0 ? 5 : 3) | 48);
        textView.setTranslationY(-hl.L(3.0f));
        linearLayout.addView(textView, tre.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, tre.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, tre.e(-1, -1, 48));
        if (j != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.a.setCursorColor(aob.w0(null, aob.G6, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
