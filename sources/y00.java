// default package

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class y00 implements View.OnClickListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ y00(byte b) {
        this.a = b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                if (!MediaController.z().B0) {
                    if (!MediaController.z().G()) {
                        MediaController.z().U(MediaController.z().v0, true);
                        break;
                    } else {
                        MediaController.z().V(MediaController.z().v0);
                        break;
                    }
                }
                break;
            case 1:
                break;
            case 2:
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 3:
                bx4.g1(false, null);
                break;
            case 4:
                ArrayList arrayList = ExternalActionActivity.y;
                break;
            case 5:
            case 6:
                break;
            case 7:
                float[] fArr = FragmentContextView.W0;
                MediaController z = MediaController.z();
                kfc kfcVar = z.F0;
                if (kfcVar != null) {
                    kfcVar.r0(false);
                }
                z.p0();
                z.i();
                r47 r47Var = z.v0;
                if (r47Var != null) {
                    jn7 f = jn7.f(r47Var.K1);
                    r47 r47Var2 = z.v0;
                    f.k(jn7.g2, Integer.valueOf(r47Var2 != null ? r47Var2.e1() : 0));
                    break;
                }
                break;
            case 8:
                PhotoViewer.q0().b(1.0f, 0.0f, 0.0f, false);
                break;
            case 9:
                String str = LaunchActivity.C1;
                break;
            case 10:
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new uqc());
                    break;
                }
                break;
            case 11:
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(new uqc());
                    break;
                }
                break;
            case 12:
                PhotoViewer.q0().b(1.0f, 0.0f, 0.0f, false);
                break;
            case 13:
                RectF rectF = ProfileActivity.Z6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e) {
                    cc4.g(e, true);
                    return;
                }
            case 14:
            case 15:
                break;
            case 16:
                ((sg2) view).c(!r5.b(), true);
                break;
            default:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    dlc.b();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
        }
    }

    public /* synthetic */ y00(Object obj, byte b) {
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
