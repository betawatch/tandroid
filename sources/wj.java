// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wj extends r99 {
    public final /* synthetic */ yh n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(Context context, int i, r63 r63Var, yh yhVar) {
        super(1, r63Var, context, true);
        this.n1 = yhVar;
        this.w0 = false;
        this.v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, qoe.x(-1, -2, 51));
        s09 s09Var = new s09(context);
        s09Var.f(R.raw.report_police, nm7.E1, nm7.E1, null);
        s09Var.d();
        frameLayout.addView(s09Var, qoe.d(nm7.p2, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 24.0f);
        anb.X(textView, cmb.i5, r63Var);
        if (i == 0) {
            textView.setText(jb6.M0(2131745924, null));
        } else if (i == 6) {
            textView.setText(jb6.M0(2131745926, null));
        } else if (i == 1) {
            textView.setText(jb6.M0(2131745923, null));
        } else if (i == 2) {
            textView.setText(jb6.M0(2131745927, null));
        } else if (i == 5) {
            textView.setText(jb6.M0(2131745925, null));
        } else if (i == 100) {
            textView.setText(jb6.M0(2131745963, null));
        }
        TextView l = wi8.l(frameLayout, textView, qoe.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        l.setTextSize(1, 14.0f);
        anb.X(l, cmb.q5, r63Var);
        hg9.p(l, 1, null, 2131745950);
        frameLayout.addView(l, qoe.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        anb.D(editTextBoldCursor, cmb.G6, r63Var);
        int i2 = cmb.F6;
        anb.X(editTextBoldCursor, i2, r63Var);
        editTextBoldCursor.setBackgroundDrawable(null);
        anb.F(editTextBoldCursor, cmb.j6, cmb.k6, cmb.o7, r63Var);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(jb6.a0 ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(jb6.M0(2131745951, null));
        anb.l(editTextBoldCursor, 30, i2, r63Var);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 21));
        frameLayout.addView(editTextBoldCursor, qoe.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        q99 q99Var = new q99(context);
        View view = new View(context);
        q99Var.a = view;
        view.setBackground(ulb.f(cmb.Ei, 8.0f));
        q99Var.addView(view, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        q99Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        anb.X(textView2, cmb.Ii, r63Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        q99Var.addView(textView2, qoe.e(-2, -2, 17));
        this.l1 = q99Var;
        q99Var.setBackground(null);
        q99Var.setText(jb6.M0(2131745941, null));
        rve.a(q99Var);
        view.setOnClickListener(new v0(this, i, (byte) 20));
        frameLayout.addView(q99Var, qoe.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
