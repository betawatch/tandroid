// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class se2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ if2 b;

    public /* synthetic */ se2(if2 if2Var, byte b) {
        this.a = b;
        this.b = if2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 1;
        if2 if2Var = this.b;
        switch (b) {
            case 0:
                i22 i22Var = if2Var.R1;
                a22 a22Var = i22Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
                io ioVar = if2Var.T1;
                if (a22Var != chatAttachAlertPhotoLayout) {
                    ioVar.setText(jb6.M0(2131745271, null));
                    i22 i22Var2 = if2Var.R1;
                    i22Var2.A1(i22Var2.d2);
                    break;
                } else {
                    ioVar.setText(jb6.M0(2131752075, null));
                    i22 i22Var3 = if2Var.R1;
                    if (i22Var3.l2 == null) {
                        Context context = i22Var3.getContext();
                        ylb ylbVar = i22Var3.J0;
                        h32 h32Var = new h32(i22Var3, ylbVar, context);
                        h32Var.r = gm.L(80.0f);
                        h32Var.x = (byte) 3;
                        fv fvVar = new fv(h32Var, context, ylbVar, (byte) 7);
                        h32Var.n = fvVar;
                        kz0 kz0Var = new kz0(h32Var, context);
                        h32Var.w = kz0Var;
                        fvVar.setAdapter(kz0Var);
                        fvVar.setClipToPadding(false);
                        fvVar.setItemAnimator(null);
                        fvVar.setLayoutAnimation(null);
                        fvVar.setVerticalScrollBarEnabled(false);
                        anb.l(fvVar, 21, cmb.z5, ylbVar);
                        h32Var.addView(fvVar, qoe.c(-1.0f, -1));
                        fvVar.setOnScrollListener(new y(h32Var, (byte) 18));
                        as0 as0Var = new as0(h32Var, h32Var.r, b2);
                        h32Var.s = as0Var;
                        as0Var.O = new zr1(h32Var, b2);
                        fvVar.setLayoutManager(as0Var);
                        i22Var3.l2 = h32Var;
                        h32Var.setDelegate(new gx(i22Var3, (byte) 4));
                    }
                    i22Var3.A1(i22Var3.l2);
                    h32 h32Var2 = if2Var.R1.l2;
                    boolean z = if2Var.G1;
                    kz0 kz0Var2 = h32Var2.w;
                    ((ArrayList) kz0Var2.e).clear();
                    WallpapersListActivity.A0((ArrayList) kz0Var2.e, z);
                    kz0Var2.f();
                    break;
                }
            case 1:
                if (!if2Var.J0()) {
                    if2Var.dismiss();
                    break;
                } else {
                    if2Var.N0(true);
                    if2Var.U0(true);
                    break;
                }
            case 2:
                if (if2Var.M1 == null) {
                    if2Var.P0(!if2Var.G1);
                    break;
                }
                break;
            default:
                if2Var.E0(false);
                break;
        }
    }
}
