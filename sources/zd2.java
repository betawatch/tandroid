// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zd2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oe2 b;

    public /* synthetic */ zd2(oe2 oe2Var, byte b) {
        this.a = b;
        this.b = oe2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 1;
        oe2 oe2Var = this.b;
        switch (b) {
            case 0:
                n12 n12Var = oe2Var.R1;
                f12 f12Var = n12Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                in inVar = oe2Var.T1;
                if (f12Var != chatAttachAlertPhotoLayout) {
                    inVar.setText(ob6.M0(2131745265, null));
                    n12 n12Var2 = oe2Var.R1;
                    n12Var2.B1(n12Var2.d2);
                    break;
                } else {
                    inVar.setText(ob6.M0(2131752103, null));
                    n12 n12Var3 = oe2Var.R1;
                    if (n12Var3.l2 == null) {
                        Context context = n12Var3.getContext();
                        vnb vnbVar = n12Var3.J0;
                        m22 m22Var = new m22(n12Var3, vnbVar, context);
                        m22Var.r = hl.L(80.0f);
                        m22Var.x = (byte) 3;
                        gu guVar = new gu(m22Var, context, vnbVar, (byte) 7);
                        m22Var.n = guVar;
                        ly0 ly0Var = new ly0(m22Var, context);
                        m22Var.w = ly0Var;
                        guVar.setAdapter(ly0Var);
                        guVar.setClipToPadding(false);
                        guVar.setItemAnimator(null);
                        guVar.setLayoutAnimation(null);
                        guVar.setVerticalScrollBarEnabled(false);
                        yob.l(guVar, 21, aob.A5, vnbVar);
                        m22Var.addView(guVar, tre.c(-1.0f, -1));
                        guVar.setOnScrollListener(new y(m22Var, (byte) 17));
                        ar0 ar0Var = new ar0(m22Var, m22Var.r, b2);
                        m22Var.s = ar0Var;
                        ar0Var.O = new ar1(m22Var, b2);
                        guVar.setLayoutManager(ar0Var);
                        n12Var3.l2 = m22Var;
                        m22Var.setDelegate(new hw(n12Var3, (byte) 4));
                    }
                    n12Var3.B1(n12Var3.l2);
                    m22 m22Var2 = oe2Var.R1.l2;
                    boolean z = oe2Var.G1;
                    ly0 ly0Var2 = m22Var2.w;
                    ((ArrayList) ly0Var2.e).clear();
                    WallpapersListActivity.A0((ArrayList) ly0Var2.e, z);
                    ly0Var2.f();
                    break;
                }
            case 1:
                if (!oe2Var.K0()) {
                    oe2Var.dismiss();
                    break;
                } else {
                    oe2Var.O0(true);
                    oe2Var.V0(true);
                    break;
                }
            case 2:
                if (oe2Var.M1 == null) {
                    oe2Var.Q0(!oe2Var.G1);
                    break;
                }
                break;
            default:
                oe2Var.F0(false);
                break;
        }
    }
}
