// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u1c implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c2c b;

    public /* synthetic */ u1c(c2c c2cVar, byte b) {
        this.a = b;
        this.b = c2cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        c2c c2cVar = this.b;
        switch (b) {
            case 0:
                c2cVar.dismiss();
                break;
            case 1:
                c2cVar.dismiss();
                break;
            case 2:
                c2cVar.dismiss();
                break;
            case 3:
                CharSequence charSequence = c2cVar.X1;
                if (charSequence != null) {
                    c2cVar.Y1.a(charSequence);
                }
                c2cVar.dismiss();
                break;
            default:
                final c2c c2cVar2 = this.b;
                bu5 G = bu5.G(c2cVar2.c, c2cVar2.J0, view);
                G.a0 = gm.L(450.0f);
                int i = 0;
                G.t = false;
                final byte b2 = 1;
                G.b0 = true;
                ScrollView scrollView = new ScrollView(c2cVar2.getContext());
                LinearLayout linearLayout = new LinearLayout(c2cVar2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                G.p(scrollView);
                int i2 = 0;
                while (i2 < c2cVar2.c2.length) {
                    c2cVar2.Y0(G, linearLayout, c2cVar2.b2 == i2, c2cVar2.d2[i2], new ge7(c2cVar2, i2, (byte) 22));
                    i2++;
                }
                View j8Var = new j8(c2cVar2.getContext(), c2cVar2.J0);
                j8Var.setTag(R.id.fit_width_tag, 1);
                linearLayout.addView(j8Var, qoe.o(-1, 8));
                ArrayList n = b3c.n(null);
                ArrayList m = b3c.m();
                if (!TextUtils.isEmpty(c2cVar2.a2)) {
                    c2cVar2.Y0(G, linearLayout, true, s1c.E0(s1c.J0(c2cVar2.a2, null, null)), null);
                }
                int size = n.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    final u2c u2cVar = (u2c) n.get(i3);
                    if (!TextUtils.equals(u2cVar.a, c2cVar2.a2)) {
                        String str = u2cVar.b;
                        final Object[] objArr = null == true ? 1 : 0;
                        c2cVar2.Y0(G, linearLayout, false, str, new Runnable() { // from class: t1c
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = objArr;
                                u2c u2cVar2 = u2cVar;
                                c2c c2cVar3 = c2cVar2;
                                switch (b3) {
                                    case 0:
                                        c2cVar3.Z0();
                                        String str2 = u2cVar2.a;
                                        c2cVar3.a2 = str2;
                                        s1c.O0(str2);
                                        c2cVar3.a1();
                                        break;
                                    default:
                                        c2cVar3.Z0();
                                        String str3 = u2cVar2.a;
                                        c2cVar3.a2 = str3;
                                        s1c.O0(str3);
                                        c2cVar3.a1();
                                        break;
                                }
                            }
                        });
                    }
                    i3 = i4;
                }
                View j8Var2 = new j8(c2cVar2.getContext(), c2cVar2.J0);
                j8Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout.addView(j8Var2, qoe.o(-1, 8));
                int size2 = m.size();
                while (i < size2) {
                    Object obj = m.get(i);
                    i++;
                    final u2c u2cVar2 = (u2c) obj;
                    c2cVar2.Y0(G, linearLayout, TextUtils.equals(u2cVar2.a, c2cVar2.a2), u2cVar2.b, new Runnable() { // from class: t1c
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            u2c u2cVar22 = u2cVar2;
                            c2c c2cVar3 = c2cVar2;
                            switch (b3) {
                                case 0:
                                    c2cVar3.Z0();
                                    String str2 = u2cVar22.a;
                                    c2cVar3.a2 = str2;
                                    s1c.O0(str2);
                                    c2cVar3.a1();
                                    break;
                                default:
                                    c2cVar3.Z0();
                                    String str3 = u2cVar22.a;
                                    c2cVar3.a2 = str3;
                                    s1c.O0(str3);
                                    c2cVar3.a1();
                                    break;
                            }
                        }
                    });
                }
                G.a0();
                break;
        }
    }
}
