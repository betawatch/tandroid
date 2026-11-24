// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wi extends p79 {
    public final /* synthetic */ yg n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(Context context, int i, f53 f53Var, yg ygVar) {
        super(1, f53Var, context, true);
        this.n1 = ygVar;
        this.w0 = false;
        this.v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, nme.x(-1, -2, 51));
        ry8 ry8Var = new ry8(context);
        ry8Var.f(R.raw.report_police, 120, 120, null);
        ry8Var.d();
        frameLayout.addView(ry8Var, nme.d(kk7.p2, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        ug8.v(textView, 1, 24.0f);
        zkb.X(textView, bkb.i5, f53Var);
        if (i == 0) {
            textView.setText(k96.M0(2131745998, null));
        } else if (i == 6) {
            textView.setText(k96.M0(2131746000, null));
        } else if (i == 1) {
            textView.setText(k96.M0(2131745997, null));
        } else if (i == 2) {
            textView.setText(k96.M0(2131746001, null));
        } else if (i == 5) {
            textView.setText(k96.M0(2131745999, null));
        } else if (i == 100) {
            textView.setText(k96.M0(2131746037, null));
        }
        TextView l = ug8.l(frameLayout, textView, nme.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        l.setTextSize(1, 14.0f);
        zkb.X(l, bkb.q5, f53Var);
        de9.q(l, 1, null, 2131746024);
        frameLayout.addView(l, nme.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        zkb.D(editTextBoldCursor, bkb.G6, f53Var);
        int i2 = bkb.F6;
        zkb.X(editTextBoldCursor, i2, f53Var);
        editTextBoldCursor.setBackgroundDrawable(null);
        zkb.F(editTextBoldCursor, bkb.j6, bkb.k6, bkb.o7, f53Var);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(k96.a0 ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(k96.M0(2131746025, null));
        zkb.l(editTextBoldCursor, 30, i2, f53Var);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 20));
        frameLayout.addView(editTextBoldCursor, nme.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        o79 o79Var = new o79(context);
        View view = new View(context);
        o79Var.a = view;
        view.setBackground(sjb.f(bkb.Ei, 8.0f));
        o79Var.addView(view, nme.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        o79Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        zkb.X(textView2, bkb.Ii, f53Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        o79Var.addView(textView2, nme.e(-2, -2, 17));
        this.l1 = o79Var;
        o79Var.setBackground(null);
        o79Var.setText(k96.M0(2131746015, null));
        ote.a(o79Var);
        view.setOnClickListener(new v0(this, i, (byte) 20));
        frameLayout.addView(o79Var, nme.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
