// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t3c implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b4c b;

    public /* synthetic */ t3c(b4c b4cVar, byte b) {
        this.a = b;
        this.b = b4cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b4c b4cVar = this.b;
        switch (b) {
            case 0:
                b4cVar.dismiss();
                break;
            case 1:
                b4cVar.dismiss();
                break;
            case 2:
                b4cVar.dismiss();
                break;
            case 3:
                CharSequence charSequence = b4cVar.X1;
                if (charSequence != null) {
                    b4cVar.Y1.a(charSequence);
                }
                b4cVar.dismiss();
                break;
            default:
                final b4c b4cVar2 = this.b;
                fu5 G = fu5.G(b4cVar2.c, b4cVar2.J0, view);
                G.d0 = hl.L(450.0f);
                int i = 0;
                G.t = false;
                final byte b2 = 1;
                G.e0 = true;
                ScrollView scrollView = new ScrollView(b4cVar2.getContext());
                LinearLayout linearLayout = new LinearLayout(b4cVar2.getContext());
                linearLayout.setOrientation(1);
                scrollView.addView(linearLayout);
                G.p(scrollView);
                int i2 = 0;
                while (i2 < b4cVar2.c2.length) {
                    b4cVar2.Z0(G, linearLayout, b4cVar2.b2 == i2, b4cVar2.d2[i2], new oe7(b4cVar2, i2, (byte) 23));
                    i2++;
                }
                View k8Var = new k8(b4cVar2.getContext(), b4cVar2.J0);
                k8Var.setTag(R.id.fit_width_tag, 1);
                linearLayout.addView(k8Var, tre.o(-1, 8));
                ArrayList n = a5c.n(null);
                ArrayList m = a5c.m();
                if (!TextUtils.isEmpty(b4cVar2.a2)) {
                    b4cVar2.Z0(G, linearLayout, true, r3c.F0(r3c.K0(b4cVar2.a2, null, null)), null);
                }
                int size = n.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    final t4c t4cVar = (t4c) n.get(i3);
                    if (!TextUtils.equals(t4cVar.a, b4cVar2.a2)) {
                        String str = t4cVar.b;
                        final Object[] objArr = null == true ? 1 : 0;
                        b4cVar2.Z0(G, linearLayout, false, str, new Runnable() { // from class: s3c
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = objArr;
                                t4c t4cVar2 = t4cVar;
                                b4c b4cVar3 = b4cVar2;
                                switch (b3) {
                                    case 0:
                                        b4cVar3.a1();
                                        String str2 = t4cVar2.a;
                                        b4cVar3.a2 = str2;
                                        r3c.P0(str2);
                                        b4cVar3.b1();
                                        break;
                                    default:
                                        b4cVar3.a1();
                                        String str3 = t4cVar2.a;
                                        b4cVar3.a2 = str3;
                                        r3c.P0(str3);
                                        b4cVar3.b1();
                                        break;
                                }
                            }
                        });
                    }
                    i3 = i4;
                }
                View k8Var2 = new k8(b4cVar2.getContext(), b4cVar2.J0);
                k8Var2.setTag(R.id.fit_width_tag, 1);
                linearLayout.addView(k8Var2, tre.o(-1, 8));
                int size2 = m.size();
                while (i < size2) {
                    Object obj = m.get(i);
                    i++;
                    final t4c t4cVar2 = (t4c) obj;
                    b4cVar2.Z0(G, linearLayout, TextUtils.equals(t4cVar2.a, b4cVar2.a2), t4cVar2.b, new Runnable() { // from class: s3c
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            t4c t4cVar22 = t4cVar2;
                            b4c b4cVar3 = b4cVar2;
                            switch (b3) {
                                case 0:
                                    b4cVar3.a1();
                                    String str2 = t4cVar22.a;
                                    b4cVar3.a2 = str2;
                                    r3c.P0(str2);
                                    b4cVar3.b1();
                                    break;
                                default:
                                    b4cVar3.a1();
                                    String str3 = t4cVar22.a;
                                    b4cVar3.a2 = str3;
                                    r3c.P0(str3);
                                    b4cVar3.b1();
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
