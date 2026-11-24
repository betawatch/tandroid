// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class quc {
    public oh2 a;
    public he b;
    public TextView c;

    public static void a(Context context, qac qacVar, Runnable runnable) {
        quc qucVar = new quc();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = jb6.M0(2131743880, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        LinearLayout i = hg9.i(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        anb.X(textView, cmb.i5, null);
        textView.setTextSize(1, 14.0f);
        i.addView(textView, qoe.t(-1, -2, 0, 24, 0, 24, 0));
        oh2 oh2Var = new oh2(1, null, context);
        qucVar.a = oh2Var;
        oh2Var.getTextView().getLayoutParams().width = -1;
        qucVar.a.getTextView().setTextSize(1, 14.0f);
        i.addView(qucVar.a, qoe.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(gm.S2(jb6.M0(2131752872, null)));
        qucVar.a.e(gm.N2(jb6.M0(2131752873, null), -1, 0, new dh1(context, (byte) 28), null), "", false, false, false);
        alertDialog$Builder.n(i);
        alertDialog$Builder.j(jb6.M0(2131751708, null), new ai((byte) 1, qacVar, zArr));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 26));
        qucVar.b = heVar;
        heVar.show();
        TextView textView2 = (TextView) qucVar.b.c(-1);
        qucVar.c = textView2;
        textView2.setEnabled(false);
        qucVar.c.setAlpha(0.5f);
        qucVar.a.setOnClickListener(new kpc(qucVar, (byte) 3));
        qucVar.a.setBackground(cmb.f0(cmb.w0(null, cmb.h6, false), 7, -1));
        qucVar.b.setOnDismissListener(new vg(zArr, runnable));
    }
}
