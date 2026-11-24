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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pn1 implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ d d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ pn1(yv1 yv1Var, TLRPC.User user, String str, boolean z, int i) {
        this.d = yv1Var;
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
        d dVar = this.d;
        byte b2 = 0;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) dVar;
                String str = (String) serializable;
                Pattern pattern = ik.a;
                if (yv1Var.getParentActivity() != null) {
                    my0 i2 = wi8.i(yv1Var.getParentActivity(), false, 1, null);
                    i2.P = jb6.M0(z ? 2131752131 : 2131752130, null);
                    i2.Q = true;
                    LinearLayout linearLayout = new LinearLayout(yv1Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(yv1Var.getParentActivity());
                    linearLayout.addView(textView, qoe.t(-1, -1, 0, 21, 0, 21, 8));
                    anb.X(textView, cmb.F6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(gm.S2(jb6.a0("ChatWithAdminMessage", null, 2131752129, str, jb6.s(i, false))));
                    TextView textView2 = new TextView(yv1Var.getParentActivity());
                    textView2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(gm.o());
                    textView2.setText(jb6.M0(2131749031, null));
                    anb.X(textView2, cmb.Ii, null);
                    int L = gm.L(8.0f);
                    int i3 = cmb.Ei;
                    int w0 = cmb.w0(null, i3, false);
                    int i4 = cmb.Gi;
                    int w02 = cmb.w0(null, i4, false);
                    fg0 i0 = cmb.i0(L, L, L, L, w0, w02, w02);
                    wmb M = anb.M(i3);
                    wmb M2 = anb.M(i4);
                    textView2.setBackground(i0);
                    anb.j(textView2, i0, M, M2, null);
                    linearLayout.addView(textView2, qoe.t(-1, 48, 0, 16, 12, 16, 8));
                    i2.O = linearLayout;
                    i2.show();
                    textView2.setOnClickListener(new di(i2, b2));
                    break;
                }
                break;
            default:
                nk3 nk3Var = (nk3) dVar;
                ArrayList arrayList = (ArrayList) serializable;
                String M0 = jb6.M0(2131743594, null);
                int i5 = cmb.wj;
                SpannableStringBuilder N2 = gm.N2(M0, i5, 0, new di3(nk3Var, (byte) 19), null);
                SpannableString spannableString = new SpannableString(">");
                pn2 pn2Var = new pn2(R.drawable.attach_arrow_right, 0);
                pn2Var.y = cmb.w0(null, i5, false);
                pn2Var.I = 0.7f;
                pn2Var.J = 0.7f;
                pn2Var.F = gm.L(12.0f);
                spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
                gm.G2(N2, spannableString, ">");
                c41.b0(nk3Var).I(R.raw.contact_check, jb6.M0(z ? 2131743595 : 2131743596, null), N2).j();
                oc7.r1(i).Q1().f(true, arrayList, new byb((byte) 1));
                oc7.r1(i).Q1().a();
                break;
        }
    }

    public /* synthetic */ pn1(nk3 nk3Var, boolean z, int i, ArrayList arrayList) {
        this.d = nk3Var;
        this.b = z;
        this.c = i;
        this.e = arrayList;
    }
}
