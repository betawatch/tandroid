// default package

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class x00 implements View.OnClickListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ x00(byte b) {
        this.a = b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                if (!MediaController.w().B0) {
                    if (!MediaController.w().C()) {
                        MediaController.w().Q(MediaController.w().v0, true);
                        break;
                    } else {
                        MediaController.w().R(MediaController.w().v0);
                        break;
                    }
                }
                break;
            case 1:
                break;
            case 2:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 3:
                xu4.f1(false, null);
                break;
            case 4:
                ArrayList arrayList = ExternalActionActivity.y;
                break;
            case 5:
            case 6:
                break;
            case 7:
                float[] fArr = FragmentContextView.W0;
                MediaController w = MediaController.w();
                lbc lbcVar = w.F0;
                if (lbcVar != null) {
                    lbcVar.r0(false);
                }
                w.m0();
                w.h();
                k27 k27Var = w.v0;
                if (k27Var != null) {
                    kk7 f = kk7.f(k27Var.K1);
                    k27 k27Var2 = w.v0;
                    f.k(kk7.f2, Integer.valueOf(k27Var2 != null ? k27Var2.e1() : 0));
                    break;
                }
                break;
            case 8:
                PhotoViewer.r0().b(1.0f, 0.0f, 0.0f, false);
                break;
            case 9:
                String str = LaunchActivity.C1;
                break;
            case 10:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new hmc());
                    break;
                }
                break;
            case 11:
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new hmc());
                    break;
                }
                break;
            case 12:
                PhotoViewer.r0().b(1.0f, 0.0f, 0.0f, false);
                break;
            case 13:
                RectF rectF = ProfileActivity.Z6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e) {
                    fa4.g(e, true);
                    return;
                }
            case 14:
            case 15:
                break;
            case 16:
                ((ag2) view).c(!r5.b(), true);
                break;
            default:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    xgc.b();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
        }
    }

    public /* synthetic */ x00(Object obj, byte b) {
        this.a = b;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
