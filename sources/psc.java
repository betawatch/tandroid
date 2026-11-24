// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class psc {
    public ag2 a;
    public hd b;
    public TextView c;

    public static void a(Context context, p8c p8cVar, Runnable runnable) {
        psc pscVar = new psc();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String M0 = k96.M0(2131743954, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        LinearLayout j = de9.j(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        zkb.X(textView, bkb.i5, null);
        textView.setTextSize(1, 14.0f);
        j.addView(textView, nme.t(-1, -2, 0, 24, 0, 24, 0));
        ag2 ag2Var = new ag2(1, null, context);
        pscVar.a = ag2Var;
        ag2Var.getTextView().getLayoutParams().width = -1;
        pscVar.a.getTextView().setTextSize(1, 14.0f);
        j.addView(pscVar.a, nme.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        textView.setText(gl.S2(k96.M0(2131752907, null)));
        pscVar.a.e(gl.N2(k96.M0(2131752908, null), -1, 0, new vf1(context, (byte) 28), null), "", false, false, false);
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(k96.M0(2131751759, null), new ah((byte) 1, p8cVar, zArr));
        alertDialog$Builder.g(k96.M0(2131752577, null), new fyb((byte) 20));
        pscVar.b = hdVar;
        hdVar.show();
        TextView textView2 = (TextView) pscVar.b.c(-1);
        pscVar.c = textView2;
        textView2.setEnabled(false);
        pscVar.c.setAlpha(0.5f);
        pscVar.a.setOnClickListener(new osc(pscVar, (byte) 0));
        pscVar.a.setBackground(bkb.f0(bkb.w0(null, bkb.h6, false), 7, -1));
        pscVar.b.setOnDismissListener(new vf(zArr, runnable));
    }
}
