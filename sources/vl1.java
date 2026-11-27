// default package

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vl1 implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ e d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ vl1(zu1 zu1Var, TLRPC.User user, String str, boolean z, int i) {
        this.d = zu1Var;
        this.e = str;
        this.b = z;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Serializable serializable = this.e;
        int i = this.c;
        boolean z = this.b;
        e eVar = this.d;
        byte b2 = 0;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) eVar;
                String str = (String) serializable;
                Pattern pattern = jj.a;
                if (zu1Var.getParentActivity() != null) {
                    nx0 i2 = ik8.i(zu1Var.getParentActivity(), false, 1, null);
                    i2.P = ob6.M0(z ? 2131752159 : 2131752158, null);
                    i2.Q = true;
                    LinearLayout linearLayout = new LinearLayout(zu1Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(zu1Var.getParentActivity());
                    linearLayout.addView(textView, tre.t(-1, -1, 0, 21, 0, 21, 8));
                    yob.X(textView, aob.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(hl.S2(ob6.a0("ChatWithAdminMessage", null, 2131752157, str, ob6.s(i, false))));
                    TextView textView2 = new TextView(zu1Var.getParentActivity());
                    textView2.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(hl.o());
                    textView2.setText(ob6.M0(2131749028, null));
                    yob.X(textView2, aob.Ji, null);
                    int L = hl.L(8.0f);
                    int i3 = aob.Fi;
                    int w0 = aob.w0(null, i3, false);
                    int i4 = aob.Hi;
                    int w02 = aob.w0(null, i4, false);
                    hf0 i0 = aob.i0(L, L, L, L, w0, w02, w02);
                    uob M = yob.M(i3);
                    uob M2 = yob.M(i4);
                    textView2.setBackground(i0);
                    yob.j(textView2, i0, M, M2, null);
                    linearLayout.addView(textView2, tre.t(-1, 48, 0, 16, 12, 16, 8));
                    i2.O = linearLayout;
                    i2.show();
                    textView2.setOnClickListener(new rg(i2, b2));
                    break;
                }
                break;
            default:
                uj3 uj3Var = (uj3) eVar;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = ob6.M0(2131743562, null);
                int i5 = aob.xj;
                SpannableStringBuilder N2 = hl.N2(M0, i5, 0, new ch3(uj3Var, (byte) 19), null);
                SpannableString spannableString = new SpannableString(">");
                wm2 wm2Var = new wm2(R.drawable.attach_arrow_right, 0);
                wm2Var.y = aob.w0(null, i5, false);
                wm2Var.I = 0.7f;
                wm2Var.J = 0.7f;
                wm2Var.F = hl.L(12.0f);
                spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
                hl.G2(N2, spannableString, ">");
                d31.b0(uj3Var).I(R.raw.contact_check, ob6.M0(z ? 2131743563 : 2131743564, null), N2).j();
                uc7.s1(i).R1().f(true, arrayList, new b0c((byte) 1));
                uc7.s1(i).R1().a();
                break;
        }
    }

    public /* synthetic */ vl1(uj3 uj3Var, boolean z, int i, ArrayList arrayList) {
        this.d = uj3Var;
        this.b = z;
        this.c = i;
        this.e = arrayList;
    }
}
